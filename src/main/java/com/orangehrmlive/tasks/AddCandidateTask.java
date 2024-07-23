package com.orangehrmlive.tasks;

import com.orangehrmlive.interactions.OptionSelection;
import com.orangehrmlive.interactions.SelectDateApplication;
import com.orangehrmlive.models.CandidateInformation;
import com.orangehrmlive.userinterfaces.DashboardPage;
import com.orangehrmlive.userinterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddCandidateTask implements Task {
    private final CandidateInformation candidateInformation;

    public AddCandidateTask(CandidateInformation candidateInformation) {
        this.candidateInformation = candidateInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.OPT_RECRUITMENT),
                Click.on(RecruitmentPage.BTN_ADD));

        actor.attemptsTo(
                Enter.theValue(candidateInformation.getFirstName()).into(RecruitmentPage.TXT_FIRST_NAME),
                Enter.theValue(candidateInformation.getMiddleName()).into(RecruitmentPage.TXT_MIDDLE_NAME),
                Enter.theValue(candidateInformation.getLastName()).into(RecruitmentPage.TXT_LAST_NAME));

        actor.attemptsTo(OptionSelection.select(RecruitmentPage.SLT_VACANCY,
                        RecruitmentPage.SLT_OPTION.of(candidateInformation.getVacancy())));

        actor.attemptsTo(Enter.theValue(candidateInformation.getEmail()).into(RecruitmentPage.TXT_EMAIL),
                Enter.theValue(candidateInformation.getContactNumber()).into(RecruitmentPage.TXT_CONTACT_NUMBER),
                Enter.theValue(candidateInformation.getKeywords()).into(RecruitmentPage.TXT_KEYWORD));

        actor.attemptsTo(SelectDateApplication.selectDate(RecruitmentPage.CALENDAR, candidateInformation.getDataOfApplication()) );


    }


    public static AddCandidateTask enterCandidateInformation(CandidateInformation candidateInformation) {
        return Tasks.instrumented(AddCandidateTask.class, candidateInformation);
    }

}

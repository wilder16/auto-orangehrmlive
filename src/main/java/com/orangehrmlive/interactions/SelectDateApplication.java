package com.orangehrmlive.interactions;

import com.orangehrmlive.enums.Constants;
import com.orangehrmlive.questions.PlaceholderValue;
import com.orangehrmlive.userinterfaces.RecruitmentPage;
import com.orangehrmlive.utils.CutAndOrderDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectDateApplication implements Interaction {

    private final Target dateInput;
    private String date;

    public SelectDateApplication(Target dateInput, String date) {
        this.dateInput = dateInput;
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String placeholderValue = String.valueOf(PlaceholderValue.of(dateInput));
        if(placeholderValue.equalsIgnoreCase(Constants.DATE_FORMAT.getConstant())){
            date = CutAndOrderDate.convertDateFormat(date);
            actor.attemptsTo(
                    Enter.theValue(date).into(dateInput),
                    Click.on(dateInput),
                    WaitUntil.the(RecruitmentPage.SELECTED_YEAR.of(CutAndOrderDate.cutYear(date)), isVisible()).forNoMoreThan(3).seconds());
        }else {
            actor.attemptsTo(
                    Enter.theValue(date).into(dateInput),
                    Click.on(dateInput),
                    WaitUntil.the(RecruitmentPage.SELECTED_YEAR.of(CutAndOrderDate.cutYear(date)), isVisible()).forNoMoreThan(3).seconds());
        }

    }

    public static SelectDateApplication selectDate(Target input, String date){
        return Tasks.instrumented(SelectDateApplication.class, input, date);
    }

}

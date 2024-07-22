package com.orangehrmlive.stepsdefinitions;

import com.orangehrmlive.models.CandidateInformation;
import com.orangehrmlive.models.ShortlistNote;
import com.orangehrmlive.tasks.AddCandidateTask;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecruitmentStepDefinition {

    @When("^the administrator adds a candidate with the data$")
    public void theAdministratorAddsACandidateWithTheData(List<CandidateInformation> candidateInformations) {
        CandidateInformation candidateInformation;
        candidateInformation = candidateInformations.get(0);
        theActorInTheSpotlight().attemptsTo(AddCandidateTask.enterCandidateInformation(candidateInformation));



    }

    @When("^shortlist the candidate$")
    public void shortlistTheCandidate(List<ShortlistNote> shortlistNotes) {
        ShortlistNote shortlistNote;
        shortlistNote = shortlistNotes.get(0);

    }
}

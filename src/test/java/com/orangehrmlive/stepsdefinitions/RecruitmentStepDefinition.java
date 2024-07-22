package com.orangehrmlive.stepsdefinitions;

import com.orangehrmlive.models.CandidateInformation;
import com.orangehrmlive.models.ShortlistNote;
import cucumber.api.java.en.When;

import java.util.List;

public class RecruitmentStepDefinition {

    @When("^the administrator adds a candidate with the data$")
    public void theAdministratorAddsACandidateWithTheData(List<CandidateInformation> candidateInformations) {
        CandidateInformation candidateInformation;
        candidateInformation = candidateInformations.get(0);


    }

    @When("^shortlist the candidate$")
    public void shortlistTheCandidate(List<ShortlistNote> shortlistNotes) {
        ShortlistNote shortlistNote;
        shortlistNote = shortlistNotes.get(0);

    }
}

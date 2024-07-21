package com.orangehrmlive.stepsdefinitions;

import com.orangehrmlive.enums.Routes;
import com.orangehrmlive.models.Credentials;
import com.orangehrmlive.tasks.LoginTask;
import com.orangehrmlive.userinterfaces.DashboardPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;

import static com.orangehrmlive.questions.IsFieldVisible.the;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import java.util.List;

public class LoginStepDefinition {

    @Given("^the administrator opens the website$")
    public void theAdministratorOpensTheWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url(Routes.SITE_URL.getConstant()));
    }

    @When("^the administrator enters his username and password$")
    public void theAdministratorEntersHisUsernameAndPassword(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(LoginTask.enterCredentials(credentials));
    }

    @Then("^the user will be able to see the orangehrmlive dashboard$")
    public void theUserWillBeAbleToSeeTheOrangehrmliveDashboard() {


    }


}

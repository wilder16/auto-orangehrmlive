package com.orangehrmlive.setups;

import com.orangehrmlive.enums.Actors;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ConfigureScenario {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void configureLoginScenario(){
        setTheStage(Cast.ofStandardActors());
        theActor(Actors.USER.getName());
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

}

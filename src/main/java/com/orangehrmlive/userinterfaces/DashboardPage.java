package com.orangehrmlive.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target DASHBOARD_SECTION = Target.the("DASHBOARD SECTION")
            .locatedBy("//h6[text()='Dashboard']");
}

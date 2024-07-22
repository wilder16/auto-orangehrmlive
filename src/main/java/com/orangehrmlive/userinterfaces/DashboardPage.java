package com.orangehrmlive.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target DASHBOARD_SECTION = Target.the("dashboard section")
            .locatedBy("//h6[text()='Dashboard']");

    public static final Target OPT_RECRUITMENT = Target.the(" recruiment option")
            .locatedBy("//span[text()='Recruitment']/parent::*");
}

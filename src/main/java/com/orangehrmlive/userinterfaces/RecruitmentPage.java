package com.orangehrmlive.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RecruitmentPage {
    public static final Target BTN_ADD = Target.the("add button")
            .locatedBy("//button[text()=' Add ']");

    public static final Target TXT_FIRST_NAME = Target.the("first name input")
            .locatedBy("//input[@name='firstName']");

    public static final Target TXT_MIDDLE_NAME= Target.the("middle name input")
            .locatedBy("//input[@name='middleName']");

    public static final Target TXT_LAST_NAME = Target.the("last name input")
            .locatedBy("//input[@name='lastName']");

    public static final Target TXT_EMAIL = Target.the("email input")
            .locatedBy("(//input[@placeholder='Type here'])[1]");

    public static final Target TXT_CONTACT_NUMBER = Target.the("contact number input")
            .locatedBy("(//input[@placeholder='Type here'])[2]");


}

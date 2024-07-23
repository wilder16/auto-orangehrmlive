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

    public static final Target SLT_VACANCY = Target.the("vacancy selection")
            .locatedBy("//div[@class='oxd-select-text-input']");

    public static final Target SLT_OPTION = Target.the("select option {0}")
            .locatedBy("(//div[@class='oxd-select-wrapper']//div)[4]//div//*[contains(text(),'{0}')]");

    public static final Target TXT_KEYWORD
            = Target.the("keywords input")
            .locatedBy("//input[@placeholder= 'Enter comma seperated words...']");

    public static final Target CALENDAR
            = Target.the("calendar input")
            .locatedBy("//input[@placeholder='dd-mm-yyyy']");

    public static final Target SELECTED_YEAR
            = Target.the("select year")
            .locatedBy("//div[@class='oxd-date-input-calendar']//div[@class='oxd-calendar-selector-year-selected']//p[text()= '{0}']");









}

package com.orangehrmlive.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("username input")
            .locatedBy("//input[@name= 'username']");

    public static final Target TXT_PASSWORD = Target.the("password input")
            .locatedBy("//input[@name= 'password']");

    public static final Target BTN_LOGIN = Target.the("login button")
            .locatedBy("//button[@type= 'submit']");

    public static final Target INVALID_CREDENTIALS_ALERT = Target.the("invalid credentials alert")
            .locatedBy("//div[@role='alert']");


}

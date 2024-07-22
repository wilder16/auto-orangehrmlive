package com.orangehrmlive.tasks;

import com.orangehrmlive.models.Credentials;
import com.orangehrmlive.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {

    private final Credentials credentials;

    public LoginTask(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUserName()).into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }

    public static LoginTask enterCredentials(Credentials credentials){
        return Tasks.instrumented(LoginTask.class, credentials);
    }
}

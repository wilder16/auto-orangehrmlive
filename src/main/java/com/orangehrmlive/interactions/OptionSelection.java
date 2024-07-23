package com.orangehrmlive.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OptionSelection implements Interaction {

    private final Target elementDiv;
    private final Target selectOption;

    public OptionSelection(Target elementDiv, Target selectOption) {
        this.elementDiv = elementDiv;
        this.selectOption = selectOption;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Interaction SelectByVisibleTextFromBy;
        actor.attemptsTo(
                Click.on(elementDiv),
                WaitUntil.the(selectOption, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(selectOption));
    }

    public static OptionSelection select(Target elementDiv, Target selectOption){
        return Tasks.instrumented(OptionSelection.class, elementDiv, selectOption);
    }

}

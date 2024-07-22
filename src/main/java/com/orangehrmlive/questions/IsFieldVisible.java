package com.orangehrmlive.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class IsFieldVisible implements Question <Boolean> {

    private final Target field;

    private IsFieldVisible(Target field) {
        this.field = field;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return field.resolveFor(actor).isVisible();
    }

    public static IsFieldVisible the(Target field) {
        return new IsFieldVisible(field);
    }
}

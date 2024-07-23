package com.orangehrmlive.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.targets.Target;

public class PlaceholderValue implements Question<String> {

    private final Target target;

    public PlaceholderValue(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(target).named("placeholder").viewedBy(actor).asString();
    }

    public static PlaceholderValue of(Target target) {
        return new PlaceholderValue(target);
    }
}

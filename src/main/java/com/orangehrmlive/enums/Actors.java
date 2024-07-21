package com.orangehrmlive.enums;

public enum Actors {

    USER("Admin");
    String name;

    Actors(String msj) {
        this.name = msj;
    }

    public String getName() {
        return name;
    }
}

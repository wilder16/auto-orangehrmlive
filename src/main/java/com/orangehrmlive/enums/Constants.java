package com.orangehrmlive.enums;

public enum Constants {

    TRUE("true"),
    THE_DASHBOARD_SECTION_IS_NOT_VISIBLE("THE DASHBOARD SECTION IS NOT VISIBLE");

    String constant;

    Constants(String msj) {
        this.constant = msj;
    }

    public String getConstant() {
        return constant;
    }
}

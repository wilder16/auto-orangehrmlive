package com.orangehrmlive.enums;

public enum Routes {

    SITE_URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
    LOGIN_FEATURE("src/test/resources/features/login.feature");

    String constant;


    Routes(String msj) {
        this.constant  = msj;
    }

    public String getConstant() {
        return constant;
    }
}

package com.orangehrmlive.enums;

public enum Routes {

    SITE_URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
    LOGIN_FEATURE("src/test/resources/features/login.feature");

    String route;


    Routes(String msj) {
        this.route = msj;
    }

    public String getConstant() {
        return route;
    }
}

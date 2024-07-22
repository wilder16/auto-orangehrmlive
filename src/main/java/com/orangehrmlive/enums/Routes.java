package com.orangehrmlive.enums;

public enum Routes {

    SITE_URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
    LOGIN_FEATURE("src/test/resources/features/login.feature"),
    RECRUITMENT_FEATURE("src/test/resources/features/recruitment.feature");

    String route;


    Routes(String msj) {
        this.route = msj;
    }

    public String getConstant() {
        return route;
    }
}

package com.orangehrm.base;


import com.orangehrm.page.LoginPage;

public class PageManager {
    public static LoginPage loginPage;

    public static void initialize() {
        // initialize pages
        loginPage = new LoginPage();
    }
}

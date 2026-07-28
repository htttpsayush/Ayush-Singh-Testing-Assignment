package com.guru99.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.base.BaseClass;
import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test(priority = 2)
    public void loginTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(config.getUsername(), config.getPassword());

        // Home Page
        HomePage homePage = new HomePage(driver);

        // Verify Login
        Assert.assertTrue(homePage.isHomePageDisplayed(),
                "Login Failed!");

        System.out.println("Login Successful");
        System.out.println("Page Title : " + homePage.getPageTitle());

    }
}
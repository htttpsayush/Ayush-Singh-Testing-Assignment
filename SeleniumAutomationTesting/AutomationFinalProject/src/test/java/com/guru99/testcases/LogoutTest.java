package com.guru99.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.base.BaseClass;
import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;

public class LogoutTest extends BaseClass {

    @Test
    public void logoutTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(config.getUsername(), config.getPassword());

        System.out.println("Login Successful");

        HomePage homePage = new HomePage(driver);

        homePage.clickLogout();

        Thread.sleep(1000); // Alert aane ka wait

        homePage.acceptLogoutAlert();

        Thread.sleep(1000);

        System.out.println("Current Title : " + driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Guru99 Bank"));

        System.out.println("Logout Successful");
    }
}
package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @When("User clicks Logout button")
    public void user_clicks_logout_button() {

        homePage.clickLogoutButton();

    }

    @Then("User should be navigated to Login page")
    public void user_should_be_navigated_to_login_page() {

        Assert.assertTrue(loginPage.isLoginPageDisplayed());

    }
}
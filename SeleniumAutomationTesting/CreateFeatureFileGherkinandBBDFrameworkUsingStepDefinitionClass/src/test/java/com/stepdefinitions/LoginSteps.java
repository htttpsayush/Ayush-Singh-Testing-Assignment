package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.AccountCreatedPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage(DriverFactory.getDriver());

    @Then("Login to your account section should be displayed")
    public void login_to_your_account_section_should_be_displayed() {

        Assert.assertTrue(loginPage.isLoginPageDisplayed());

    }

    @When("User enters valid email {string}")
    public void user_enters_valid_email(String email) {

        loginPage.enterEmail(email);

    }

    @And("User enters valid password {string}")
    public void user_enters_valid_password(String password) {

        loginPage.enterPassword(password);

    }

    @And("User clicks Login button")
    public void user_clicks_login_button() {

        loginPage.clickLoginButton();

    }

    @When("User enters invalid email {string}")
    public void user_enters_invalid_email(String email) {

        loginPage.enterEmail(email);

    }

    @And("User enters invalid password {string}")
    public void user_enters_invalid_password(String password) {

        loginPage.enterPassword(password);

    }

    @Then("Error message Your email or password is incorrect should be displayed")
    public void error_message_should_be_displayed() {

        Assert.assertTrue(loginPage.isLoginErrorDisplayed());

    }

}
package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.SignupPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExistingEmailSteps {

    SignupPage signupPage = new SignupPage(DriverFactory.getDriver());

    @When("User enters existing name {string}")
    public void user_enters_existing_name(String name) {

        signupPage.enterName(name);

    }

    @When("User enters existing email {string}")
    public void user_enters_existing_email(String email) {

        signupPage.enterEmail(email);

    }

    @When("User clicks on Signup button for existing email")
    public void user_clicks_on_signup_button_for_existing_email() {

        signupPage.clickSignupButton();

    }

    @Then("Error Email Address already exist should be displayed")
    public void error_email_address_already_exist_should_be_displayed() {

        Assert.assertTrue(signupPage.isExistingEmailErrorDisplayed());

    }

}
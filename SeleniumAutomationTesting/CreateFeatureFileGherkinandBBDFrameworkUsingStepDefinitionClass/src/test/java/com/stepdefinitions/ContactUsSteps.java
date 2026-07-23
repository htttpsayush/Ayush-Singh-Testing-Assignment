package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.ContactUsPage;
import com.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    ContactUsPage contactPage = new ContactUsPage(DriverFactory.getDriver());

    @When("User clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() {

        contactPage.clickContactUs();

    }

    @Then("Get In Touch should be displayed")
    public void get_in_touch_should_be_displayed() {

        Assert.assertTrue(contactPage.isGetInTouchVisible());

    }

    @When("User enters contact name {string}")
    public void user_enters_contact_name(String name) {

        contactPage.enterName(name);

    }

    @And("User enters contact email {string}")
    public void user_enters_contact_email(String email) {

        contactPage.enterEmail(email);

    }

    @And("User enters contact subject {string}")
    public void user_enters_contact_subject(String subject) {

        contactPage.enterSubject(subject);

    }

    @And("User enters contact message {string}")
    public void user_enters_contact_message(String message) {

        contactPage.enterMessage(message);

    }

    @And("User uploads file {string}")
    public void user_uploads_file(String filePath) {

        contactPage.uploadFile(filePath);

    }

    @When("User clicks Submit button")
    public void user_clicks_submit_button() {

        contactPage.clickSubmit();

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

        Assert.assertTrue(contactPage.isSuccessMessageDisplayed());

    }

    @When("User clicks Home button")
    public void user_clicks_home_button() {

        contactPage.clickHomeButton();

    }

    @Then("User should be navigated to Home page")
    public void user_should_be_navigated_to_home_page() {

        Assert.assertTrue(homePage.isHomePageDisplayed());

    }

}
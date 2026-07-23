package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @When("User scrolls down to footer")
    public void user_scrolls_down_to_footer() {

        homePage.scrollToFooter();

    }

    @Then("Subscription text should be visible")
    public void subscription_text_should_be_visible() {

        Assert.assertTrue(homePage.isSubscriptionVisible());

    }

    @When("User enters subscription email {string}")
    public void user_enters_subscription_email(String email) {

        homePage.enterSubscriptionEmail(email);

    }

    @When("User clicks Subscribe button")
    public void user_clicks_subscribe_button() {

        homePage.clickSubscribeButton();

    }

    @Then("Subscription success message should be displayed")
    public void subscription_success_message_should_be_displayed() {

        Assert.assertTrue(homePage.isSubscriptionSuccessMessageDisplayed());

    }
}
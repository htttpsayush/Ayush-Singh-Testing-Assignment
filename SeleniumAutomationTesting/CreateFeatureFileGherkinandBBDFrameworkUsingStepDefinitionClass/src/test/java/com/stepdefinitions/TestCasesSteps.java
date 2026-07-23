package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCasesSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @When("User clicks on Test Cases button")
    public void user_clicks_on_test_cases_button() {

        homePage.clickTestCases();

    }

    @Then("User should be navigated to Test Cases page")
    public void user_should_be_navigated_to_test_cases_page() {

        Assert.assertTrue(homePage.isTestCasesPageDisplayed());

    }

}
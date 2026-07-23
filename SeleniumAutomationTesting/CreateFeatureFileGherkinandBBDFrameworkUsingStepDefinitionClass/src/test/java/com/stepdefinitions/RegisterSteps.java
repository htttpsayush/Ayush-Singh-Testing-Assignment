package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.AccountCreatedPage;
import com.pages.AccountInformationPage;
import com.pages.HomePage;
import com.pages.SignupPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

	HomePage homePage = new HomePage(DriverFactory.getDriver());
	SignupPage signupPage = new SignupPage(DriverFactory.getDriver());
	AccountInformationPage accountPage = new AccountInformationPage(DriverFactory.getDriver());
	AccountCreatedPage createdPage = new AccountCreatedPage(DriverFactory.getDriver());

	@Given("User launches the browser")
	public void user_launches_the_browser() {

		System.out.println("Browser Launched");

	}

	@Given("User is on Automation Exercise home page")
	public void user_is_on_home_page() {

		Assert.assertTrue(homePage.isHomePageDisplayed());

	}

	@When("User clicks on Signup Login button")
	public void user_clicks_signup_login_button() {

		homePage.clickSignupLogin();

	}

	@Then("New User Signup section should be displayed")
	public void new_user_signup_should_be_displayed() {

		Assert.assertTrue(signupPage.isNewUserSignupVisible());

	}

	@When("User enters name {string}")
	public void user_enters_name(String name) {

		signupPage.enterName(name);

	}

	@When("User enters email {string}")
	public void user_enters_email(String email) {

	    // Generate unique email every execution
	    String dynamicEmail = "ayush" + System.currentTimeMillis() + "@gmail.com";

	    signupPage.enterEmail(dynamicEmail);

	    System.out.println("Generated Email: " + dynamicEmail);
	}

	@When("User clicks Signup button")
	public void user_clicks_signup_button() {

		signupPage.clickSignupButton();

	}

	@Then("Enter Account Information page should be displayed")
    public void enter_account_information_page_should_be_displayed() {
		Assert.assertTrue(signupPage.isEnterAccountInformationVisible());
	}

	@When("User selects title {string}")
	public void user_selects_title(String title) {

		if (title.equalsIgnoreCase("Mr")) {
			accountPage.selectTitleMr();
		} else {
			accountPage.selectTitleMrs();
		}

	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {

		accountPage.enterPassword(password);

	}

	@When("User selects day {string}")
	public void user_selects_day(String day) {

		accountPage.selectDay(day);

	}

	@When("User selects month {string}")
	public void user_selects_month(String month) {

		accountPage.selectMonth(month);

	}

	@When("User selects year {string}")
	public void user_selects_year(String year) {

		accountPage.selectYear(year);

	}

	@When("User selects newsletter checkbox")
	public void user_selects_newsletter_checkbox() {

		accountPage.clickNewsletter();

	}

	@When("User selects special offers checkbox")
	public void user_selects_special_offers_checkbox() {

		accountPage.clickOffers();

	}

	@When("User enters first name {string}")
	public void user_enters_first_name(String firstName) {

		accountPage.enterFirstName(firstName);

	}

	@When("User enters last name {string}")
	public void user_enters_last_name(String lastName) {

		accountPage.enterLastName(lastName);

	}

	@When("User enters company {string}")
	public void user_enters_company(String company) {

		accountPage.enterCompany(company);

	}

	@When("User enters address1 {string}")
	public void user_enters_address1(String address1) {

		accountPage.enterAddress1(address1);

	}

	@When("User enters address2 {string}")
	public void user_enters_address2(String address2) {

		accountPage.enterAddress2(address2);

	}

	@When("User selects country {string}")
	public void user_selects_country(String country) {

		accountPage.selectCountry(country);

	}

	@When("User enters state {string}")
	public void user_enters_state(String state) {

		accountPage.enterState(state);

	}

	@When("User enters city {string}")
	public void user_enters_city(String city) {

		accountPage.enterCity(city);

	}

	@When("User enters zipcode {string}")
	public void user_enters_zipcode(String zipcode) {

		accountPage.enterZipcode(zipcode);

	}

	@When("User enters mobile number {string}")
	public void user_enters_mobile_number(String mobileNumber) {

		accountPage.enterMobile(mobileNumber);

	}

	@When("User clicks Create Account button")
	public void user_clicks_create_account_button() {

		accountPage.clickCreateAccount();

	}
	
	
    @Then("Account Created should be displayed")
    public void account_created_should_be_displayed() {

        Assert.assertTrue(createdPage.isAccountCreatedDisplayed());

    }

    @When("User clicks Continue button")
    public void user_clicks_continue_button() {

        createdPage.clickContinue();

    }

    @Then("Logged in as username should be displayed")
    public void logged_in_as_username_should_be_displayed() {

        Assert.assertTrue(createdPage.isLoggedInUserDisplayed());

    }

    @When("User clicks Delete Account button")
    public void user_clicks_delete_account_button() {

        createdPage.clickDeleteAccount();

    }

    @Then("Account Deleted should be displayed")
    public void account_deleted_should_be_displayed() {

        Assert.assertTrue(createdPage.isAccountDeletedDisplayed());

    }
    
    

}
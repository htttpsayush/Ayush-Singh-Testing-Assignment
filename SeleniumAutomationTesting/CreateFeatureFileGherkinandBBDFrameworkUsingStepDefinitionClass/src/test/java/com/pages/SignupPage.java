package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // =========================
    // Locators
    // =========================

    By newUserSignupText = By.xpath("//h2[text()='New User Signup!']");

    By name = By.name("name");

    By email = By.xpath("//input[@data-qa='signup-email']");

    By signupButton = By.xpath("//button[@data-qa='signup-button']");

    By enterAccountInfo = By.xpath("//b[text()='Enter Account Information']");

    // =========================
    // Methods
    // =========================

    // Verify New User Signup
    public boolean isNewUserSignupVisible() {
        return driver.findElement(newUserSignupText).isDisplayed();
    }

    // Enter Name
    public void enterName(String userName) {
        driver.findElement(name).sendKeys(userName);
    }

    // Enter Email
    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    // Click Signup
    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

    // Verify Enter Account Information
    public boolean isEnterAccountInformationVisible() {
        return driver.findElement(enterAccountInfo).isDisplayed();
    }

}
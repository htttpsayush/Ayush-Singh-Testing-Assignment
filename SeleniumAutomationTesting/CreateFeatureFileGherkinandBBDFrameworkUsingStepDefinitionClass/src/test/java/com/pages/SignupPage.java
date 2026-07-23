package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // =========================
    // Locators
    // =========================

    private By newUserSignupText =
            By.xpath("//h2[text()='New User Signup!']");

    private By name =
            By.name("name");

    private By email =
            By.xpath("//input[@data-qa='signup-email']");

    private By signupButton =
            By.xpath("//button[@data-qa='signup-button']");

    private By enterAccountInfo =
            By.xpath("//b[text()='Enter Account Information']");

    private By existingEmailError =
            By.xpath("//form[@action='/signup']//p");

    // =========================
    // Methods
    // =========================

    public boolean isNewUserSignupVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(newUserSignupText))
                .isDisplayed();

    }

    public void enterName(String userName) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(name));

        element.clear();
        element.sendKeys(userName);

    }

    public void enterEmail(String userEmail) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(email));

        element.clear();
        element.sendKeys(userEmail);

    }

    public void clickSignupButton() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(signupButton));

        element.click();

    }

    public boolean isEnterAccountInformationVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(enterAccountInfo))
                .isDisplayed();

    }

    public boolean isExistingEmailErrorDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));

        By errorMessage = By.xpath("//form[@action='/signup']//p");

        WebElement error = wait.until(
                ExpectedConditions.visibilityOfElementLocated(errorMessage));

        System.out.println("Actual Error : " + error.getText());

        return error.getText().trim().equals("Email Address already exist!");
    }

}
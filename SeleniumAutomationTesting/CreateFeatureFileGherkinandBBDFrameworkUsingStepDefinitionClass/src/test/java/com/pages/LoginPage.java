package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // ========== Locators ==========

    By loginHeading = By.xpath("//h2[text()='Login to your account']");

    By email = By.xpath("//input[@data-qa='login-email']");

    By password = By.xpath("//input[@data-qa='login-password']");

    By loginButton = By.xpath("//button[@data-qa='login-button']");

    By loginError = By.xpath("//p[text()='Your email or password is incorrect!']");

    // ========== Methods ==========

    // Verify Login Heading
    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginHeading).isDisplayed();
    }

    // Enter Email
    public void enterEmail(String userEmail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(userEmail);
    }

    // Enter Password
    public void enterPassword(String userPassword) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(userPassword);
    }

    // Click Login Button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Complete Login
    public void login(String userEmail, String userPassword) {
        enterEmail(userEmail);
        enterPassword(userPassword);
        clickLoginButton();
    }

    // Verify Invalid Login Error
    public boolean isLoginErrorDisplayed() {
        return driver.findElement(loginError).isDisplayed();
    }

}
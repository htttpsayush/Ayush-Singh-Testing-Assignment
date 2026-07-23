package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

        WebElement element = driver.findElement(loginButton);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", element);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", element);
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
package com.pages;

import org.openqa.selenium.By;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {

    WebDriver driver;

    // Constructor
    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    // ========= Locators =========

    By accountCreatedText = By.xpath("//b[text()='Account Created!']");

    By continueButton = By.xpath("//a[@data-qa='continue-button']");

    By loggedInUser = By.xpath("//a[contains(text(),'Logged in as')]");

    By deleteAccountButton = By.xpath("//a[contains(text(),'Delete Account')]");

    By accountDeletedText = By.xpath("//b[text()='Account Deleted!']");

    // ========= Methods =========

    // Verify Account Created
    public boolean isAccountCreatedDisplayed() {
        return driver.findElement(accountCreatedText).isDisplayed();
    }

    // Click Continue
    public void clickContinue() {

        WebElement element = driver.findElement(continueButton);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block:'center'});", element);

        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", element);
    }

    // Verify Logged In User
    public boolean isLoggedInUserDisplayed() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            WebElement loggedIn = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//a[contains(text(),'Logged in as')]")));

            return loggedIn.isDisplayed();

        } catch (Exception e) {

            System.out.println("Current URL : " + driver.getCurrentUrl());
            System.out.println("Current Title : " + driver.getTitle());

            return false;
        }
    }

    // Click Delete Account
    public void clickDeleteAccount() {
        driver.findElement(deleteAccountButton).click();
    }

    // Verify Account Deleted
    public boolean isAccountDeletedDisplayed() {
        return driver.findElement(accountDeletedText).isDisplayed();
    }

}
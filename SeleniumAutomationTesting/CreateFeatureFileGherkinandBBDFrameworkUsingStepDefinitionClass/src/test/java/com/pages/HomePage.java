package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ===========================
    // Locators
    // ===========================

    private By homePageLogo =
            By.xpath("//img[@alt='Website for automation practice']");

    private By signupLoginBtn =
            By.xpath("//a[contains(text(),'Signup / Login')]");

    private By logoutButton =
            By.xpath("//a[contains(text(),'Logout')]");

    private By testCasesButton =
            By.xpath("//a[contains(text(),'Test Cases')]");

    private By testCasesHeading =
            By.xpath("//b[contains(text(),'Test Cases')]");

    private By footer =
            By.id("footer");

    private By subscriptionText =
            By.xpath("//h2[contains(text(),'Subscription')]");

    private By subscriptionEmail =
            By.id("susbscribe_email");

    private By subscribeButton =
            By.id("subscribe");

    private By successMessage =
            By.xpath("//div[contains(@class,'alert-success')]");

    // ===========================
    // Home Page
    // ===========================

    public boolean isHomePageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(homePageLogo))
                .isDisplayed();

    }

    // ===========================
    // Signup / Login
    // ===========================

    public void clickSignupLogin() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(signupLoginBtn));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);

    }

    // ===========================
    // Logout
    // ===========================

    public void clickLogoutButton() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(logoutButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", element);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);

    }

    // ===========================
    // Test Cases
    // ===========================

    public void clickTestCases() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(testCasesButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);

    }

    public boolean isTestCasesPageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(testCasesHeading))
                .isDisplayed();

    }

    // ===========================
    // Subscription
    // ===========================

    public void scrollToFooter() {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(footer));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public boolean isSubscriptionVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(subscriptionText))
                .isDisplayed();

    }

    public void enterSubscriptionEmail(String email) {

        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(subscriptionEmail));

        element.clear();
        element.sendKeys(email);

    }

    public void clickSubscribeButton() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(subscribeButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);

    }

    public boolean isSubscriptionSuccessMessageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage))
                .isDisplayed();

    }

}
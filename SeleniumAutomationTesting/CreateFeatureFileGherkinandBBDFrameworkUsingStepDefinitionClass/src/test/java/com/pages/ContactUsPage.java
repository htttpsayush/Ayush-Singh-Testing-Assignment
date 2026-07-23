package com.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    private By contactUsBtn = By.xpath("//a[contains(text(),'Contact us')]");
    private By getInTouch = By.xpath("//h2[contains(text(),'Get In Touch')]");

    private By name = By.name("name");
    private By email = By.name("email");
    private By subject = By.name("subject");
    private By message = By.id("message");
    private By uploadFile = By.name("upload_file");

    private By submitBtn = By.name("submit");

    private By successMessage =
            By.xpath("//div[@class='status alert alert-success']");

    private By homeButton =
            By.xpath("//span[contains(text(),'Home')]");

    // Methods

    public void clickContactUs() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(contactUsBtn));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public boolean isGetInTouchVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(getInTouch))
                .isDisplayed();
    }

    public void enterName(String username) {

        driver.findElement(name).sendKeys(username);
    }

    public void enterEmail(String userEmail) {

        driver.findElement(email).sendKeys(userEmail);
    }

    public void enterSubject(String sub) {

        driver.findElement(subject).sendKeys(sub);
    }

    public void enterMessage(String msg) {

        driver.findElement(message).sendKeys(msg);
    }

    public void uploadFile(String filePath) {

        driver.findElement(uploadFile).sendKeys(filePath);
    }

    public void clickSubmit() {

        WebElement element = driver.findElement(submitBtn);

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();
    }

    public boolean isSuccessMessageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage))
                .isDisplayed();
    }

    public void clickHomeButton() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(homeButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

}
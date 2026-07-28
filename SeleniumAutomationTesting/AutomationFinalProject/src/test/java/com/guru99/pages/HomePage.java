package com.guru99.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By logoutLink = By.linkText("Log out");

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isHomePageDisplayed() {
        return driver.getTitle().contains("Guru99 Bank Manager HomePage");
    }

    public void clickLogout() {

        WebElement logout = driver.findElement(logoutLink);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logout);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logout);
    }

    public void acceptLogoutAlert() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();
    }
}
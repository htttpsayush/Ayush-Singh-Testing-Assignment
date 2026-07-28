package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By txtUsername = By.name("uid");
    private By txtPassword = By.name("password");
    private By btnLogin = By.name("btnLogin");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter Username
    public void enterUsername(String username) {
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);
    }

    // Enter Password
    public void enterPassword(String password) {
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }

    // Click Login Button
    public void clickLogin() {
        driver.findElement(btnLogin).click();
    }

    // Complete Login
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
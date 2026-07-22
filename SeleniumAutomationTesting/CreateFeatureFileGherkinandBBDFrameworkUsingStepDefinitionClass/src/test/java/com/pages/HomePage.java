package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By homePageLogo = By.xpath("//img[@alt='Website for automation practice']");

    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");

    // Verify Home Page
    public boolean isHomePageDisplayed() {
        return driver.findElement(homePageLogo).isDisplayed();
    }

    // Click Signup/Login
    
    
    public void clickSignupLogin() {
        driver.findElement(signupLoginBtn).click();
    }

}
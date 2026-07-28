package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {

    private WebDriver driver;

    // Constructor
    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By newCustomerLink = By.linkText("New Customer");
    private By customerName = By.name("name");
    private By genderMale = By.xpath("//input[@value='m']");
    private By dob = By.name("dob");
    private By address = By.name("addr");
    private By city = By.name("city");
    private By state = By.name("state");
    private By pin = By.name("pinno");
    private By mobile = By.name("telephoneno");
    private By email = By.name("emailid");
    private By password = By.name("password");
    private By submit = By.name("sub");

    public void addNewCustomer(String name,
                               String dateOfBirth,
                               String addr,
                               String cityName,
                               String stateName,
                               String pinNo,
                               String phone,
                               String emailId,
                               String pwd) {

        driver.findElement(newCustomerLink).click();

        driver.findElement(customerName).sendKeys(name);
        driver.findElement(genderMale).click();
        driver.findElement(dob).sendKeys(dateOfBirth);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(pin).sendKeys(pinNo);
        driver.findElement(mobile).sendKeys(phone);
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(pwd);

        driver.findElement(submit).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(By.className("heading3")).getText();
    }

}
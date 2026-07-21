package com.JenkinsCICDDemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsCICDTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else {
            throw new IllegalArgumentException("Invalid Browser: " + browser);
        }

        driver.manage().window().maximize();
    }

    @Test
    public void NavigationTest() throws InterruptedException {

        String homeURL = "https://practicetestautomation.com/practice-test-login/";

        driver.get(homeURL);
        System.out.println("Home Page Opened");

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        System.out.println("Login Successful");

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Back Command");

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Forward Command");

        Thread.sleep(2000);

        driver.navigate().to(homeURL);
        System.out.println("Navigate To Command");

        Thread.sleep(2000);

        driver.navigate().refresh();
        System.out.println("Refresh Command");

        Thread.sleep(2000);

        Assert.assertEquals(driver.getCurrentUrl(), homeURL);
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Quitting Browser...");

        if (driver != null) {
            driver.quit();
        }
    }
}
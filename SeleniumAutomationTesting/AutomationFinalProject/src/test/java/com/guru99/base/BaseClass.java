package com.guru99.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.utilities.BrowserFactory;
import com.guru99.utilities.ConfigReader;

public class BaseClass {

    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeMethod
    public void setup() {

        // Load Configuration
        config = new ConfigReader();

        // Launch Browser
        driver = BrowserFactory.startBrowser(config.getBrowser());

        // Browser Settings
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        // Timeouts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        // Open Application
        driver.get(config.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
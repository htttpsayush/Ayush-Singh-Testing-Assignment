package com.SeleniumWebDriver.LocatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VitamentsandSuppliments {

    @Test
    public void TestDemo() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to(
            "https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/"
        );

        Thread.sleep(10000);

        try {
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch (Exception e) {
            System.out.println("Cookie popup not displayed.");
        }

        driver.findElement(
            By.xpath("//img[@alt='Image 2 for High Strength Effervescent Vit C & Zinc Blackcurrant Flavour 20 Effervescent Tablets']")
        ).click();

        driver.findElement(
            By.className("productCardImage-module_picture__QWySP")
        ).click();

        String BrowserTitle = driver.getCurrentUrl();
        System.out.println(BrowserTitle);

        driver.navigate().back();
        BrowserTitle = driver.getCurrentUrl();
        System.out.println(BrowserTitle);

        driver.navigate().refresh();
        BrowserTitle = driver.getCurrentUrl();
        System.out.println(BrowserTitle);
    }
}
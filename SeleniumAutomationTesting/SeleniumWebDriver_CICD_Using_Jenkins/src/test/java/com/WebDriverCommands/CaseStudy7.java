package com.WebDriverCommands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CaseStudy7 {
	
	    @Test
	    public void headlessBrowserCommands() throws IOException {

	        // Headless Chrome
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless=new");

	        WebDriver driver = new ChromeDriver(options);

	        // Open URL
	        driver.get("https://store.webkul.com");
	        driver.manage().window().maximize();

	        // Get Page Title
	        System.out.println("Page Title : " + driver.getTitle());

	        // Take Screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        File destination = new File("Screenshots/HeadlessHomePage.png");
	        destination.getParentFile().mkdirs();

	        Files.copy(source.toPath(), destination.toPath());

	        System.out.println("Screenshot captured successfully.");

	        // Close Browser
	        driver.quit();
	    }
	
}
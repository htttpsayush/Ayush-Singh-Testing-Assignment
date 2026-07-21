package com.WebDriverCommands;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy6 {

	    @Test
	    public void chromeBrowserCommands() throws IOException {

	        WebDriver driver = new ChromeDriver();

	        // Open URL
	        driver.get("https://store.webkul.com");
	        driver.manage().window().maximize();

	        // Get Page Title
	        System.out.println("Page Title : " + driver.getTitle());

	        // Take Screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        File destination = new File("Screenshots/WebkulHomePage.png");

	        destination.getParentFile().mkdirs(); // Create folder if it doesn't exist
	        Files.copy(source.toPath(), destination.toPath());

	        System.out.println("Screenshot saved successfully.");

	        // Count Number of Links
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total Links : " + links.size());

	        // Print All Links
	        for (WebElement link : links) {
	            System.out.println("Link Text : " + link.getText());
	            System.out.println("Link URL  : " + link.getAttribute("href"));
	            System.out.println("--------------------------------");
	        }

	        // Close Browser
	        driver.quit();
	    }
	

}
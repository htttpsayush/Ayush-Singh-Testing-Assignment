package com.WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy5 {
	


	    @Test
	    public void chromeBrowserCommands() {

	        WebDriver driver = new ChromeDriver();

	        // Open URL
	        driver.get("http://automationpractice.com/index.php");
	        driver.manage().window().maximize();

	        // Get Page Title
	        String title = driver.getTitle();
	        System.out.println("Page Title : " + title);

	        // Get Title Length
	        System.out.println("Title Length : " + title.length());

	        // Get Current URL
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("Current URL : " + currentURL);

	        // Verify URL
	        if (currentURL.equals("http://automationpractice.com/index.php")) {
	            System.out.println("Desired Page Opened");
	        } else {
	            System.out.println("Desired Page Not Opened");
	        }

	        // Get Page Source
	        String pageSource = driver.getPageSource();
	        System.out.println("Page Source Length : " + pageSource.length());

	        // Count Number of Links
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Total Number of Links : " + links.size());

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
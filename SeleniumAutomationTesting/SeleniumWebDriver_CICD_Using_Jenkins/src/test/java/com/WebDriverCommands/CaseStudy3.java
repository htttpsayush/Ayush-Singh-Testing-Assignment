package com.WebDriverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class CaseStudy3 {

	    @Test
	    public void chromeBrowserCommands() {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.easycalculation.com/");
	        driver.manage().window().maximize();

	        // Open Calculator Page
	        driver.findElement(By.linkText("Calculators")).click();

	        // Get all links
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Print total number of links
	        System.out.println("Total Links: " + links.size());

	        // Print all links
	        for (WebElement link : links) {
	            System.out.println("Text : " + link.getText());
	            System.out.println("URL  : " + link.getAttribute("href"));
	            System.out.println("--------------------------------");
	        }

	        driver.quit();
	    }

	    @Test
	    public void firefoxBrowserCommands() {

	        WebDriver driver = new FirefoxDriver();

	        driver.get("https://www.easycalculation.com/");
	        driver.manage().window().maximize();

	        driver.findElement(By.linkText("Calculators")).click();

	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total Links: " + links.size());

	        for (WebElement link : links) {
	            System.out.println("Text : " + link.getText());
	            System.out.println("URL  : " + link.getAttribute("href"));
	            System.out.println("--------------------------------");
	        }

	        driver.quit();
	    }

	    @Test
	    public void edgeBrowserCommands() {

	        WebDriver driver = new EdgeDriver();

	        driver.get("https://www.easycalculation.com/");
	        driver.manage().window().maximize();

	        driver.findElement(By.linkText("Calculators")).click();

	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total Links: " + links.size());

	        for (WebElement link : links) {
	            System.out.println("Text : " + link.getText());
	            System.out.println("URL  : " + link.getAttribute("href"));
	            System.out.println("--------------------------------");
	        }

	        driver.quit();
	    }
	}
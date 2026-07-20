package com.WebDriverCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaseStudy2 {

	    @Test
	    public void chromeBrowserCommands() {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.easycalculation.com/");

	        // Enter value using ID
	        driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");

	        // Click Search button using Name
	        driver.findElement(By.className("search_button")).click();

	        // Print Page Title
	        System.out.println("Page Title : " + driver.getTitle());

	        // Get Page Source
	        String pageSource = driver.getPageSource();

	        // Print Page Source
	        System.out.println(pageSource);

	        // Print Page Source Length
	        System.out.println("Page Source Length : " + pageSource.length());

	        driver.quit();
	    }

	    @Test
	    public void firefoxBrowserCommands() {

	        WebDriver driver = new FirefoxDriver();

	        driver.get("https://www.easycalculation.com/");

	        // Enter value using Name
	        driver.findElement(By.name("q")).sendKeys("Bangalore");

	        // Click Search button using XPath
	        driver.findElement(By.xpath("//button[@class='search_button']")).click();

	        System.out.println("Page Title : " + driver.getTitle());

	        String pageSource = driver.getPageSource();

	        System.out.println(pageSource);

	        System.out.println("Page Source Length : " + pageSource.length());

	        driver.quit();
	    }

	    @Test
	    public void edgeBrowserCommands() {

	        WebDriver driver = new EdgeDriver();

	        driver.get("https://www.easycalculation.com/");

	        // Enter value using XPath
	        driver.findElement(By.xpath("//*[@id=\"googleSearchId\"]")).sendKeys("Bangalore");

	        // Click Search button using XPath
	        driver.findElement(By.xpath("//button[@class='search_button']")).click();

	        System.out.println("Page Title : " + driver.getTitle());

	        String pageSource = driver.getPageSource();

	        System.out.println(pageSource);

	        System.out.println("Page Source Length : " + pageSource.length());

	        driver.quit();
	    }
	}
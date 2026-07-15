package com.WebDriverCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	
	@Test(priority=1)
	public void ChromeBrowserTest() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		
		String Browsertitle = driver.getTitle();
		System.out.println(Browsertitle);
		
		String ExpectedTitle = "Test Login | Practice Test Automation";
		String ActualTitle = Browsertitle;
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Chrome Browser Passed");
		}
		else {
			System.out.println("Chrome Browser Failed");
		}
		
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		//String PageContent = driver.getPageSource();
		//System.out.println(PageContent);
		
		
		
	}
	
	
	@Test(priority=0)
	public void FireFoxBrowserTest() {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String Browsertitle = driver.getTitle();
		System.out.println(Browsertitle);
		
		String ExpectedTitle = "Selenium";
		String ActualTitle = Browsertitle;
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("FireFox Browser Passed");
		}
		else {
			System.out.println("Firefox Browser Failed");
		}
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		
		
	}
	
	@Test(priority=2)
	public void EdgeBrowsertest() {
		
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.12.0");
		
		String Browsertitle = driver.getTitle();
		System.out.println(Browsertitle);
		
		String ExpectedTitle = "Just a moment...";
		String ActualTitle = Browsertitle;
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Edge Browser Passed");
		}
		else {
			System.out.println("Edge Browser Failed");
		}
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
	}

}

package com.MultipleFrames;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class MultiFrames {
	
	WebDriver driver;
	
	String url = "file:///C:/Users/acayu/Multiple%20Frame/I%20Frame.html";
	
	@Test
	
	public void setup() {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		int TotalNoOfFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number Of frames:" + TotalNoOfFrames);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghubn123");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();

		String title = driver.getTitle();
		System.out.println(title);

		driver.navigate().to("file:///C:/Users/acayu/Multiple%20Frame/I%20Frame.html");
		//Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();

		

		String title1 = driver.getTitle();
		System.out.println(title1);

		driver.navigate().to("file:///C:/Users/acayu/Multiple%20Frame/I%20Frame.html");

		driver.switchTo().frame("My Store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");

		driver.findElement(By.xpath("//button[@id='submit']")).click();

		String title2 = driver.getTitle();
		System.out.println(title2);

		//Thread.sleep(5000);

		driver.quit();
		
	}
	
	

}

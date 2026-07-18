package com.Radio.buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	WebDriver driver;
	
	@Test
	public void RadioTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of radio buttons present in EaseMyTrip.com: " + radiobuttons.size());
	}

}
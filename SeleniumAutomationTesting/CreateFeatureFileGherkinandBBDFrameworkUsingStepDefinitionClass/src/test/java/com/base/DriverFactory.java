package com.base;

import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import com.utils.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	// Browser Launch
	public static void initDriver() {

		ConfigReader.loadProperties();

		String browser = ConfigReader.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--start-maximized");

			driver = new ChromeDriver(options);

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(ConfigReader.getProperty("url"));

	}

	// Get Driver
	public static WebDriver getDriver() {
		return driver;
	}

	// Close Browser
	public static void quitDriver() {

		if (driver != null) {
			driver.quit();
		}
	}

}
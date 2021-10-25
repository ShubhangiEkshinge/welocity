package com.testingshastra.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFramework {
	public static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		// System.setProperty("webdriver.chrome.driver","D:\\Drivers\\JARs\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); // Instead of SetPeoperty using WebDriverManager
		System.out.println("Opening browser session");
	    driver = new ChromeDriver();
		driver.get("https://mahasarkar.co.in/yavatmal-dcc-bank-recruitment/");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("Closing browser session");
		driver.quit();
	}

}

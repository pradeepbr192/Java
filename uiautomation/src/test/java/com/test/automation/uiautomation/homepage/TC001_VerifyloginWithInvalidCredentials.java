package com.test.automation.uiautomation.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_VerifyloginWithInvalidCredentials {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
		driver.get("http://automationpractice.com");
	
	}

	@Test
	public void verifyloginWithInvalidCredentials() {
		
	}
	@AfterClass
	public void endTest() {
		driver.close();
	}
}

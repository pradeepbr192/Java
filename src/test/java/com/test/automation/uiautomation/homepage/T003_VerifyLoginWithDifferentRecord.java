package com.test.automation.uiautomation.homepage;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.Homepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class T003_VerifyLoginWithDifferentRecord extends TestBase{

	Homepage homepage;
	String emailAddress="automation@gmail.com";
	String password = "password";
	
	@BeforeClass
	public void setup() {
		init();
	}
	
	
	@Test
	public void testLogin() {
	
		homepage= new Homepage(driver);
		
		homepage.loginToApplication(emailAddress, password);
		
	}
	
	@AfterClass
	public void endTest() {
		
		driver.close();
	}
}

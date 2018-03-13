package com.test.automation.uiautomation.homepage;



import java.util.logging.Logger;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.Homepage;

public class TC001_VerifyloginWithInvalidCredentials extends TestBase {
	public static final Logger log= Logger.getLogger(TC001_VerifyloginWithInvalidCredentials.class.getName());
	
	
	Homepage homepage ;

    @BeforeTest

    public void setUp() {

    	init();
    	
           driver= new FirefoxDriver();
           

           System.setProperty("webdriver.gecko.driver",System.getProperty( "H:\\uiautomation\\Java\\drivers\\geckodriver.exe"));
           

          driver.get("http://automationpractice.com");

    }	

    @Test

    public void verifyloginWithInvalidCredentials() {
    	
    	log.info("===============Starting Test===============");
    	homepage = new Homepage(driver);

          homepage.loginToApplication("test@gmail.com", "password1234");

         Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");

         log.info("===============Finish Test===============");
    }

    @AfterClass

    public void endTest() {

           driver.close();   
	}
}

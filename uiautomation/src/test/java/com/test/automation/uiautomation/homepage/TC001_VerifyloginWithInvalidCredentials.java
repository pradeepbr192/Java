package com.test.automation.uiautomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.uiActions.Homepage;

public class TC001_VerifyloginWithInvalidCredentials {
	
	WebDriver driver;
	Homepage homepage ;

    @BeforeTest

    public void setUp() {

           driver= new FirefoxDriver();

           System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "/drivers/geckodriver.exe");

           driver.get("http://automationpractice.com");

    }

    @Test

    public void verifyloginWithInvalidCredentials() {
    	
    	homepage = new Homepage(driver);

          homepage.loginToApplication("test@gmail.com", "password1234");

          /* driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();

           driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@gmail.com");

           driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("password");

           driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click(); */

    Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText(), "Authentication failed.");

    }

    @AfterClass

    public void endTest() {

           driver.close();   
	}
}

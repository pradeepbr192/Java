package com.test.automation.uiautomation.homepage;

import org.openqa.selenium.By;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;

public class TC002_VerifyRegistration extends TestBase {

	@BeforeClass
	
	public void setup(){
		init();
	}
	
	@Test
	
	public void testLogin(){
		
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='email_create']")).clear();
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("pradepbhat@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("pradeep");
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("bhat");
		driver.findElement(By.xpath("//*[@id='passwd']")).clear();
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("welcome");
		Select date1 = new Select(driver.findElement(By.xpath("//*[@id='days']")));
		date1.selectByIndex(4);
		Select mon = new Select(driver.findElement(By.xpath("//*[@id='months']")));
		mon.selectByIndex(4);
		Select yr = new Select(driver.findElement(By.xpath("//*[@id='years']")));
		yr.selectByIndex(4);
		driver.findElement(By.xpath("//*[@id='company']")).clear();
		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("Comcast");
		driver.findElement(By.xpath("//*[@id='address1']")).clear();
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Philadelphia");
	}
	
	@AfterClass
	
	public void endTest(){
		
		//driver.quit();
		
	}
}

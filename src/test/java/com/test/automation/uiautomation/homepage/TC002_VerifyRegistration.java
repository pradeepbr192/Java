package com.test.automation.uiautomation.homepage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.Homepage;

public class TC002_VerifyRegistration extends TestBase {

	Homepage homepage;
	String firstname ="pradeep";
	String lastname="bhat";
	String passwd="password";
	String company ="cts";
	String address1="Tunganagar";
	String city="bangalore";
	@BeforeClass
	
	public void setup(){
		init();
	}
	
	@Test
	
	public void testLogin(){
		homepage = new Homepage(driver);
		homepage.registerUser(firstname, lastname, passwd, company, address1, city);
		/* driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
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
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("Philadelphia,123,cts");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Bangalore");
		Select st1 = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
		st1.selectByIndex(3);
		driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("56009");
		driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("8765432123");;
		driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("pradep@gmail.org");;
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click();  */
	}
	
	@AfterClass
	
	public void endTest(){
		
		driver.quit();
		
	}
}

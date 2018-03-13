package com.test.automation.uiautomation.homepage;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.Homepage;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class TC003_VerifyLoginWithDifferentRecord extends TestBase{

	Homepage homepage;
	//String emailAddress="automation@gmail.com";
	//String password = "password";
	
	@BeforeClass
	public void setup() {
		init();
	}

	@DataProvider(name="LoginData")
	public String[][] getTestdata(){
		String[][] testRecords = getData("LoginTestData.xlsx","LoginTestData");
		
		return testRecords;
	}
	@SuppressWarnings("deprecation")
	@Test(dataProvider="LoginData")
	public void testLogin(String emailAddress, String password,String runmode) {
	
		if (runmode.equalsIgnoreCase("n")){
			throw new SkipException("User marked this as no run");
		}
		homepage= new Homepage(driver);
		
		homepage.loginToApplication(emailAddress, password);
	boolean status=homepage.verifyLogoutDisplay();
	Assert.assertEquals(true,status);
	if(status){
		homepage.clickonLogout();
	}
		
	Assert.assertEquals(true,status);
	}
	
	@AfterClass
	public void endTest() {
		
		driver.close();
	}
}

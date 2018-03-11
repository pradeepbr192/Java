package com.test.automation.uiautomation.testBase;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.automation.uiautomation.excelReader.Excel_Reader;

public class TestBase {

	public static final Logger log= Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	String url="http://automationpractice.com";
	String browser="Chrome";
	Excel_Reader excel;
	
	public void init(){
		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		}
	public void selectBrowser(String browser){	
		if(browser.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver","H:\\uiautomation\\Java\\driver\\chromedriver.exe");System.setProperty("webdriver.chrome.driver","H:/uiautomation/Java/drivers/chromedriver.exe");
	        log.info("creating object of" +browser);   
	           driver= new ChromeDriver();
		}
	}
	
	public void getUrl(String url){
		log.info("navigating to : " + url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	public String[][] getData(String sheetName, String excelName) {
		
		String path= System.getProperty("user.dir") + "\\src\\main\\java\\com\\test\\automation\\uiautomation\\data" +excelName;
		excel= new Excel_Reader(path);
		String[][]data= excel.getDatafromsheet(sheetName, excelName);
		return data;
	}
}

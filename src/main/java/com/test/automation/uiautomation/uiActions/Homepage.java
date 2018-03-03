package com.test.automation.uiautomation.uiActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {

	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement loginEmail;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement loginPassword;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']/span")
	WebElement submitButton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signin_link;
	
	@FindBy(xpath="//*[@id='email_create']")
	WebElement email_create;
	
	@FindBy(xpath="//*[@id='SubmitCreate']/span")
	WebElement account_create;
	
	@FindBy(xpath="//*[@id='id_gender1']")
	WebElement title_select;
	
	@FindBy(xpath="//*[@id='customer_firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id='customer_lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement passwd;
	
	@FindBy(xpath="//*[@id='days']")
	WebElement birthdate;
	
	@FindBy(xpath="//*[@id='postcode']")
	WebElement months;
	
	@FindBy(xpath="//*[@id='years']")
	WebElement years;
	
	@FindBy(xpath="//*[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//*[@id='address1']")
	WebElement address1;
	
	@FindBy(xpath="//*[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//*[@id='id_state']")
	WebElement state;
	
	@FindBy(xpath="//*[@id='postcode']")
	WebElement postcode;
	
	@FindBy(xpath="//*[@id='phone_mobile']")
	WebElement mobile_phone;
	
	@FindBy(xpath="//*[@id='alias']")
	WebElement alias;
	
	@FindBy(xpath="//*[@id='submitAccount']")
	WebElement submitaccount;
	
	
	/* In Page factory, we have to declare a class constructor always */
	
	/*details of the below line is in video 3 */
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	public void loginToApplication(String emailAddress, String password) {
	
		signIn.click();
		loginEmail.sendKeys(emailAddress);
		loginPassword.sendKeys(password);
		submitButton.click();
	}
	public String getInvalidLoginText(){
		return authenticationFailed.getText();
	}
public void registerUser(String firstname, String lastname, String passwd, String company, String address1, String city)
{
	
	signin_link.click();
	loginEmail.clear();
	email_create.sendKeys("pradepbhat1@gmail.com");
	account_create.click();
	title_select.click();
	
	this.firstname.clear();
	this.firstname.sendKeys("pradeep");
	this.lastname.clear();
	this.lastname.sendKeys("bhat");
	this.passwd.clear();
	this.passwd.sendKeys("welcome");
	Select date1 = new Select(driver.findElement(By.xpath("//*[@id='days']")));
	date1.selectByIndex(4);
	Select mon = new Select(driver.findElement(By.xpath("//*[@id='months']")));
	mon.selectByIndex(4);
	Select yr = new Select(driver.findElement(By.xpath("//*[@id='years']")));
	yr.selectByIndex(4);
	this.company.clear();
	this.company.sendKeys("Comcast");
	this.address1.clear();
	this.address1.sendKeys("Philadelphia,123,cts");
	this.city.sendKeys("Bangalore");
	Select st1 = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
	st1.selectByIndex(3);
	postcode.sendKeys("56009");
	mobile_phone.sendKeys("8765432123");;
	alias.sendKeys("pradep@gmail.org");;
	submitaccount.click();
	
}
}

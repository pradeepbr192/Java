package com.test.automation.uiautomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement loginEmail;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement loginPassword;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement submitButton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	/* In Page factory, we have to declare a class constructor always */
	
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	public void loginToApplication(String emailAddress, String password) {
	
		signIn.click();
		loginEmail.sendKeys(emailAddress);
		loginPassword.sendKeys(password);
		submitButton.click();
	}
}

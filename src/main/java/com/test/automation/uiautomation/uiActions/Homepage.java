package com.test.automation.uiautomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	/* In Page factory, we have to declare a class constructor always */
	
	/*details of the below line is in video 3 */
	
	public Homepage(WebDriver driver) {
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
}

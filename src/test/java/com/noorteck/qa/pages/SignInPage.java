package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {
	
	@FindBy(id = "session_email")
	WebElement emailField;
	
	@FindBy(id = "session_password")
	WebElement passwordField;
	
	@FindBy(css = "input[class = 'btn btn-primary']")
	WebElement signInButton;
	
	//Initialize WebElement
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailAddress(String emailAddress) {
		enter(emailField, emailAddress);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSignIn() {
		click(signInButton);
	}
	

}

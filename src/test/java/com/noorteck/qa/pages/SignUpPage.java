package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {
	
	@FindBy(id = "user_email")
	WebElement emailField;
	
	@FindBy(id = "user_password")
	WebElement passwordField;
	
	@FindBy(css = "input[class = 'btn btn-primary']")
	WebElement signUpButton;
	
	
	//Initialize WebElement
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmailAdress(String emailAddress) {
		enter(emailField, emailAddress);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSignUp() {
		click(signUpButton);
	}

}

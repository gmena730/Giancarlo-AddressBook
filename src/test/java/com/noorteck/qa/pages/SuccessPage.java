package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;
import com.sun.net.httpserver.Authenticator.Success;

public class SuccessPage extends CommonUI {
	
	@FindBy(css = "[class = 'SuccessPages']")
	WebElement successMessage;
	
	@FindBy(linkText = "Edit")
	WebElement editButton;
	
	@FindBy(linkText = "List")
	WebElement listButton;
	
	
	//Initialize WebElement
	public SuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void isDisplayedSuccessMessage() {
		isDisplayed(successMessage);
	}
}

package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(xpath = "//a[contains(text(), 'Home')]")
	WebElement homeButton;
	
	@FindBy (xpath = "//a[contains(text(), 'Addresses')]")
	WebElement adressesButton;
	
	@FindBy (xpath = "//a[contains(text(), 'Sign out')]")
	WebElement signOutButton;
	
	@FindBy (xpath = "//h1[text()= 'Welcome to Address Book']")
	WebElement heading;
	
	//Initialize WebElement
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHome() {
		click(homeButton);
	}
	
	public void clickAdresses() {
		click(adressesButton);
	}
	
	public void clickSignOut() {
		click(signOutButton);
	}
	
	public void getHeading() {
		
	}
}

package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {
	
	@FindBy (linkText = "New Address")
	WebElement newAddressButton;
	
	//Initialize WebElement
	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewAdressButton() {
		click(newAddressButton);
	}

}

package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {
	
	@FindBy (css = ".nav-item.nav-link[data-test='addresses']")
	WebElement addressButton;
	
	@FindBy (css = ".row.justify-content-center")
	WebElement clickNewAddressButton;
	
	//Initialize WebElement
	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddressButton() {
		click(addressButton);
	}
	
	public void clickNewAddressButton() {
		click(clickNewAddressButton);
	}

}

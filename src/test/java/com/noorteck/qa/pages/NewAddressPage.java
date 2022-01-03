package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class NewAddressPage extends CommonUI {
	
	@FindBy(id = "address_first_name")
	WebElement firstNameField;
	
	@FindBy(id = "address_last_name")
	WebElement lastNameField;
	
	@FindBy(id = "address_street_address")
	WebElement addressField;
	
	@FindBy(id = "address_secondary_address")
	WebElement addressSecondField;
	
	@FindBy(id = "address_city")
	WebElement cityField;
	
	@FindBy(id = "address_state")
	WebElement stateField;
	
	@FindBy(id = "address_zip_code")
	WebElement zipCodeField;
	
	@FindBy(id = "address_country_us")
	WebElement countryRadio;
	
	@FindBy(id = "address_age")
	WebElement ageField;
	
	@FindBy(id = "address_website")
	WebElement websiteField;
	
	@FindBy(id = "address_phone")
	WebElement phoneField;
	
	@FindBy(id = "address_interest_dance")
	WebElement interestCheckbox;
	
	@FindBy(id = "address_note")
	WebElement noteField;
	
	//Initialize WebElement
	
	public NewAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	

}

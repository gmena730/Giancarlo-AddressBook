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
	WebElement stateDropdown;
	
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
	
	@FindBy(css = "input[value='Create Address']")
	WebElement createAddressButton;
	
	@FindBy(css = "a[data-test='list']")
	WebElement listButton;
	
	// Table ---
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[1]")
	WebElement getFirstName;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]")
	WebElement getLastName;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[3]")
	WebElement getCityName;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[4]")
	WebElement getStateName;
	
	//Initialize WebElement
	
	public NewAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void enterSecondaryAddress(String secondaryAddress) {
		enter(addressSecondField, secondaryAddress);
	}
	
	public void enterCity(String city) {
		enter(cityField, city);
	}
	
	public void selectState(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropdown, methodName, indexTextValue);
	}
	
	public void enterZipCode(String zipCode) {
		enter(zipCodeField, zipCode);
	}
	
	public void clickCountryRadioUS() {
		click(countryRadio);
	}
	
	public void enterAge(String age) {
		enter(ageField, age);
	}
	
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	
	public void selectInterestCheckbox() {
		click(interestCheckbox);
	}
	
	public void enterNote(String note) {
		enter(noteField, note);
	}
	
	public void clickCreateAddressButton() {
		click(createAddressButton);
	}
	
	public void clickListButton() {
		click(listButton);
	}
	
	// Table ---
	
	public void getStateName() {
		getText(getStateName);
	}
	
	public void getCityName() {
		getText(getCityName);
	}
	
	public void getLastName() {
		getText(getLastName);
	}
	
	public void getFirstName() {
		getText(getFirstName);
	}

}

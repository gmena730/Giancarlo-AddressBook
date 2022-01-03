package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.NewAddressPage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.pages.SuccessPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants {
	
	
	public WebDriver driver;
	
	//declare class objects and common objects
	
	public SignUpPage signUpObj;
	public SignInPage signInObj;
	public AddressesPage addressesObj;
	public NewAddressPage newAddressObj;
	public SuccessPage successObj;
	
	
}

package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.NewAddressPage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.pages.SuccessPage;

/**
 * In this class we declare our objects that will be shared among different
 * classes
 *
 */

public class Constants {

	public static WebDriver driver;

	// declare class objects and common objects

	public static SignUpPage signUpObj;
	public static SignInPage signInObj;
	public static AddressesPage addressesObj;
	public static NewAddressPage newAddressObj;
	public static SuccessPage successObj;

}

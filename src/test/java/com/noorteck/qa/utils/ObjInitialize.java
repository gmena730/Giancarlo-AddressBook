package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.NewAddressPage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.pages.SuccessPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		
		signUpObj = new SignUpPage();
		signInObj = new SignInPage();
		addressesObj = new AddressesPage();
		newAddressObj = new NewAddressPage();
		successObj = new SuccessPage();
		
	}

}

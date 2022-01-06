package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://a.testaddressbook.com/sign_up";

	
		// ***Test Case One***
		
		CommonUI.openBrowser("Chrome");
		CommonUI.navigate(url);
		ObjInitialize.initializeClassObj();
		testCaseOne();
				
		
		// ***Test Case Two***
		
		url = "http://a.testaddressbook.com/sign_in";
		CommonUI.navigate(url);
		testCaseTwo();

		CommonUI.quitBrowser();
		
	}
	
	public static void testCaseOne() {
		
		// 3) Enter email in email textbox
		signUpObj.enterEmailAdress("gmena730@gmail.com");
		
		// 4) Enter password in password textbox
		signUpObj.enterPassword("mima2330");

		// 5) Click on Sign up button
		signUpObj.clickSignUp();
		
		// When we click on sign up button it takes me to http://a.testaddressbook.com/users, so this step is wrong.
		// 6) Verify “Welcome to Address Book” messaged displayed				
		// successObj.isDisplayedSuccessMessage();

	}
	
	public static void testCaseTwo() {
		
		// 3) Enter email in email textbox
		signInObj.enterEmailAddress("gmena730@gmail.com");
		
		// 4) Enter password in password textbox
		signInObj.enterPassword("mima2330");
		
		// 5) Click on Sign in button
		signInObj.clickSignIn();
		
		// 6) Click Addresses from menu
		addressesObj.clickAddressButton();
		
		// 7) Click New Address
		addressesObj.clickNewAddressButton();
		
		// 8) Enter first name in first name textbox
		newAddressObj.enterFirstName("Giancarlo");
		
		// 9) Enter last name in last name textbox
		newAddressObj.enterLastName("Mena");
		
		// 10) Enter Address in Address1 textbox
		newAddressObj.enterAddress("RR1 Box 11961");
		
		// 00) Enter Secondary Address in textbox
		newAddressObj.enterSecondaryAddress("N/A");

		// 11) Enter City in City textbox
		newAddressObj.enterCity("Manatí");
		
		// 12) Select your state from state dropdown
		newAddressObj.selectState("text", "Puerto Rico");
		
		// 00) Enter Zip code in Zip code field
		newAddressObj.enterZipCode("00674");
		
		// 13) Select United States from Country options
		newAddressObj.clickCountryRadioUS();
		
		// 14) Enter 22 in Age textbox
		newAddressObj.enterAge("31");
		
		// 15) Enter 123-2334-3434 in Phone textbox
		newAddressObj.enterPhone("123-2334-3434");
		
		// 16) Select Dancing from Common Interests options
		newAddressObj.selectInterestCheckbox();
		
		// 18) Enter Automation is Fun in Note textbox
		newAddressObj.enterNote("Automation is Fun");
		
		// 19) Click Create Address button
		newAddressObj.clickCreateAddressButton();
		
		// 20) Click List button
		newAddressObj.clickListButton();
		
		//I'm yet to find a way to compare the values of the steps with the values being displayed.
		
		// 21) Verify Addresses table displays first name you entered in step 8
		
		// 22) Verify Addresses table displays last name you entered in step 9
		
		// 23) Verify Addresses table displays city name you entered in step 11
		
		// 24) Verify Addresses table displays state name you entered in step 12
		
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FORGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FORGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/


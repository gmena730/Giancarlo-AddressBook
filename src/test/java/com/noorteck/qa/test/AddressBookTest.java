package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "http://a.testaddressbook.com/sign_up";
		
		//Create objects of necessary classes in order to have access to them
		CommonUI commonUIObj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();

		AddressBookTest testObj = new AddressBookTest();
		
		// 1) Open the browser
		commonUIObj.openBrowser("Chrome");
		
		// 2) Enter the URL http://a.testaddressbook.com/sign_up
		commonUIObj.navigate(url);
		
		//Calling testCaseOne method
		testObj.testCaseOne();
		
		commonUIObj.quitBrowser();
		
	}
	
	public void testCaseOne() {
		
		// 3) Enter email in email textbox
		signUpObj.enterEmailAdress("gmena730@gmail.com");
		
		// 4) Enter password in password textbox
		signUpObj.enterPassword("12345");

		// 5) Click on Sign up button
		signUpObj.clickSignUp();

		// 6) Verify “Welcome to Address Book” messaged displayed		
		successObj.isDisplayedSuccessMessage();
		
	}
	
	public void testCaseTwo() {
		
		
		
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
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/


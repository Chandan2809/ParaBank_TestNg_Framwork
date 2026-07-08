package com.chandan.parabank.testcases;

import org.testng.annotations.Test;

import com.chandan.prabank.utilities.DataProviders;
import com.chandan.parabank.pageobjects.Parabank_Registration;

import base.BaseTest;

public class TC1_Parabank_Registration extends BaseTest {

	// This is a placeholder for the registration test case.

	@Test(dataProvider = "ParabankRegistrationData", dataProviderClass = DataProviders.class)
	
	public void FirstPage001(String First_Name, String Last_Name, String Address, String City, 
String State, String Zip_Code, String Phone_Number, String SSN, String Username, String Password, String Confirm_Password) 	throws InterruptedException {
	
	//public void FirstPage001()
		
		Thread.sleep(1000);
		Parabank_Registration registration = new Parabank_Registration(driver);
		Thread.sleep(1000);

		// perform registration action(s) using the page object
		registration.clickRegistraionLink();
	
		Thread.sleep(1000);
		System.out.println("Open registration page successful");
		
		
		
		registration.EnterCustomerFirstName(First_Name);

		Thread.sleep(1000);
		System.out.println("Enter the customer First name");
		
		
		registration.EnterCustomerLastName(Last_Name);

		Thread.sleep(1000);
		System.out.println("Enter the customer Last name");
		
		
		registration.EnterCustomerAdress(Address);

		Thread.sleep(1000);
		System.out.println("Enter the customer Address");
		
		
		registration.EnterCustomerCity(City);

		Thread.sleep(1000);
		System.out.println("Enter the customer City");
		
		
		registration.EnterCustomerState(State);

		Thread.sleep(1000);
		System.out.println("Enter the customer State");
		
	
	   registration.EnterCustomerZipCode(Zip_Code);
		
	  Thread.sleep(1000);
	  System.out.println("Enter the customer Zip_Code");
		
		
        registration.EnterCustomerPhoneNumber(Phone_Number);
		
		Thread.sleep(1000);
		System.out.println("Enter the customer Phone_Number");
		
		registration.EnterCustomerssn(SSN);
		
		Thread.sleep(1000);
		System.out.println("Enter the customer SSN");
		
		
		
		registration.EnterCustomerUserName(Username);
		
		Thread.sleep(1000);
		System.out.println("Enter the Customer User Name");
		
		
		registration.EnterCustomerPassword(Password);
		
		Thread.sleep(1000);
		System.out.println("Enter the Customer Password");
		
		
		registration.EnterCustomerConfirmPassword(Confirm_Password);
		
		Thread.sleep(1000);
		System.out.println("Enter the customer confirm password");
		
		registration.ClickOnRegistrationButton();
		
		Thread.sleep(1000);
		System.out.println("Click on Registraion Button");
	}

}

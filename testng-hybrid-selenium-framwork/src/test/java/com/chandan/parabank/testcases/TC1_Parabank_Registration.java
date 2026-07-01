package com.chandan.parabank.testcases;

import org.testng.annotations.Test;

import com.chandan.prabank.utilities.DataProviders;
import com.chandan.parabank.pageobjects.Parabank_Registration;

import base.BaseTest;

public class TC1_Parabank_Registration extends BaseTest {

	// This is a placeholder for the registration test case.

	@Test
	
	//(dataProvider = "ParabankRegistraionData", dataProviderClass = DataProviders.class)
	
	//public void FirstPage001(String fName, String EId, String PINCode, String monthYear, String day, String selfgender, String PAN, String GST)
	public void FirstPage001()
			throws InterruptedException {
		Thread.sleep(1000);
		Parabank_Registration registration = new Parabank_Registration(driver);
		Thread.sleep(1000);

		// perform registration action(s) using the page object
		registration.clickRegistraionLink();
	
		Thread.sleep(1000);
		System.out.println("Open registration page successful");
		
		
		
		registration.EnterCustomerFirstName();

		Thread.sleep(1000);
		System.out.println("Enter the customer First name");
		
		
		registration.EnterCustomerLastName();

		Thread.sleep(1000);
		System.out.println("Enter the customer Last name");
		
		
		registration.EnterCustomerAdress();

		Thread.sleep(1000);
		System.out.println("Enter the customer Address");
		
		
		registration.EnterCustomerCity();

		Thread.sleep(1000);
		System.out.println("Enter the customer City");
		
	}

}

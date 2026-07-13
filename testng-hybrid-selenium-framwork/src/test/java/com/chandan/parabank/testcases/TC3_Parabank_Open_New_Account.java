package com.chandan.parabank.testcases;

import org.testng.annotations.Test;

import com.chandan.parabank.pageobjects.Parabank_Login;
import com.chandan.parabank.pageobjects.Parabank_Open_New_Account;
import com.chandan.prabank.utilities.DataProviders;

import base.BaseTest;

public class TC3_Parabank_Open_New_Account extends BaseTest {
	
	
	  @Test(dataProvider = "ParabankRegistrationData", dataProviderClass = DataProviders.class)
		
		public void FirstPage001(String First_Name, String Last_Name, String Address, String City, 
	String State, String Zip_Code, String Phone_Number, String SSN, String Username, String Password, String Confirm_Password) 	throws InterruptedException {
		  
		  
		  
		  Thread.sleep(1000);

		  Parabank_Open_New_Account  OpenNewAccount = new Parabank_Open_New_Account(driver);
		  
		  Thread.sleep(1000);
		  
		  
		  
		  Thread.sleep(1000);
	    	Parabank_Login UserLogin = new Parabank_Login(driver);
			Thread.sleep(1000);


			
			
			UserLogin.EnterUserName(Username);
			Thread.sleep(1000);
			System.out.println("Enter User Name");
			
			
			UserLogin.EnterUserPassword(Password);
			Thread.sleep(1000);
			System.out.println("Enter User Password");
			
			
			UserLogin.ClickLoginButton();
			Thread.sleep(1000);
			System.out.println("Click on Login Button");
		  
		  
		  OpenNewAccount.ClickOpenNewAccount();
		  Thread.sleep(1000);
		  System.out.println("Open new acount page open");
		  
		  
		  
}
	  
}

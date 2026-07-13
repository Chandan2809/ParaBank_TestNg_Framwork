package com.chandan.parabank.testcases;

import org.testng.annotations.Test;

import com.chandan.parabank.pageobjects.Parabank_Login;

import com.chandan.prabank.utilities.DataProviders;

import base.BaseTest;



public class TC2_Parabank_Login extends BaseTest {
	
	
	
    @Test(dataProvider = "ParabankRegistrationData", dataProviderClass = DataProviders.class)
	
	public void FirstPage001(String First_Name, String Last_Name, String Address, String City, 
String State, String Zip_Code, String Phone_Number, String SSN, String Username, String Password, String Confirm_Password) 	throws InterruptedException {
	
	
	
	
	
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
		
}
    
}

package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import base.BasePage;


public class Parabank_Login extends BasePage {
	
	//WebDriver parabankLogindriver;
	
	public Parabank_Login(WebDriver driver) {
		
		//parabankLogindriver = rdriver;
		
		super(driver);
		
		
		//PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
   
    private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	 
	   private WebElement Login;
	
	
	
	public void EnterUserName(String Username) {
		
		username.sendKeys(Username);
	}
	
	public void EnterUserPassword(String Password) {
		
		password.sendKeys(Password);
	}
	
	
	public void ClickLoginButton() {
		Login.click();
	}
	
}

package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parabank_Login {
	
	WebDriver parabankLogindriver;
	
	public Parabank_Login(WebDriver rdriver) {
		
		parabankLogindriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
    @CacheLookup
    private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement password;
	
	
}

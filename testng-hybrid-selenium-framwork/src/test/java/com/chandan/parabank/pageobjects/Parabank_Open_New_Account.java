package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Parabank_Open_New_Account extends Parabank_Login{
	
	//WebDriver parabankOpenNewAccountDriver; 
	
	
	public Parabank_Open_New_Account(WebDriver driver) {
		
		super(driver); 
		
		//parabankOpenNewAccountDriver = rdriver;
		
		
		//PageFactory.initElements(rdriver, this);  //Do not call PageFactory.initElements() again, because the parent constructor already does it.
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Open New Account']")
	
	private WebElement ClickOpenNewAccountLink;
	
	
	
	
	public void ClickOpenNewAccount() {
		
		ClickOpenNewAccountLink.click();
	}
	

}

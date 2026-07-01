package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parabank_Registration {
	
	WebDriver prabankdriver;
	
	public Parabank_Registration(WebDriver rdriver){
		
		prabankdriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	
	private WebElement Registration;
	
	@FindBy(id="customer.firstName")
	
	private WebElement CustomerFirstname;
	
	@FindBy(id="customer.lastName")
	
	private WebElement CustomerLastName;
	
	
	@FindBy(id="customer.address.street")
	
	private WebElement CustomerAdress;
	
	@FindBy(xpath="//input[@id='customer.address.city']")
	
	private WebElement CustomerCity;
	
	
	
	
	
	
	
	public void clickRegistraionLink() {
		Registration.click();
		
	}
	
	public void EnterCustomerFirstName() {
		
		CustomerFirstname.sendKeys("Chandan");
		
	}
	
	public void EnterCustomerLastName() {
		
		CustomerLastName.sendKeys("Sah");
		
	}
	
	public void EnterCustomerAdress() {
		
		CustomerAdress.sendKeys("Nayapati");
		
	}
	
	public void EnterCustomerCity() {
		
		CustomerCity.sendKeys("Kolkata");
	}

}


	



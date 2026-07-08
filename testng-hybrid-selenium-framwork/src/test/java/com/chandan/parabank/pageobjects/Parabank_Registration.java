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
	
	
	@FindBy(xpath="//input[@id='customer.address.state']")
	
	private WebElement CustomerState;
	
	
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	
	private WebElement CustomerZipCode;
	
	
	 @FindBy(xpath="//input[@id='customer.phoneNumber']")
	
	private WebElement CustomerphoneNumber;
	
	
    @FindBy(xpath="//input[@id='customer.ssn']")
	
	private WebElement Customerssn;
   
   
	 @FindBy(xpath="//input[@id='customer.username']")
	 
	 private WebElement CustomerUseName;
	 
	 
	 
	 @FindBy(xpath="//input[@id='customer.password']")
	 
	 private WebElement CustomerPassword;
	 
	 
	 
	 @FindBy(xpath="//input[@id='repeatedPassword']")
	 
	 private WebElement CustomerConfirmPassword;
	 
	
	 @FindBy(xpath="//input[@value='Register']")
	 
	 private WebElement CustomerClickOnRegistrationButton;
	
	
	public void clickRegistraionLink() {
		Registration.click();
		
	}
	
	public void EnterCustomerFirstName(String First_Name) {
		
		CustomerFirstname.sendKeys(First_Name);
		
	}
	
	public void EnterCustomerLastName(String Last_Name) {
		
		CustomerLastName.sendKeys(Last_Name);
		
	}
	
	public void EnterCustomerAdress(String Address) {
		
		CustomerAdress.sendKeys(Address);
		
	}
	
	public void EnterCustomerCity(String City) {
		
		CustomerCity.sendKeys(City);
	}
	
	public void EnterCustomerState(String State) {
		
		CustomerState.sendKeys(State);
		
	}
	
	public void EnterCustomerZipCode(String Zip_Code) {
		
		CustomerZipCode.sendKeys(Zip_Code);
	}
	
	
     public void EnterCustomerPhoneNumber(String Phone_Number) {
		
    	 CustomerphoneNumber.sendKeys(Phone_Number);
		
     }
     
     
     public void EnterCustomerssn(String SSN) {
    	 
    	 Customerssn.sendKeys(SSN);     
    } 
     
     public void EnterCustomerUserName(String Username) {
    	 
    	 CustomerUseName.sendKeys(Username);
     }
     
     public void EnterCustomerPassword(String Password) {
    	 
    	 CustomerPassword.sendKeys(Password);
     }
     
     public void EnterCustomerConfirmPassword(String Confirm_Password) {
    	 
    	 CustomerConfirmPassword.sendKeys(Confirm_Password);
     }
     
     public void ClickOnRegistrationButton() {
    	 
    	 CustomerClickOnRegistrationButton.click();
     }

}


	



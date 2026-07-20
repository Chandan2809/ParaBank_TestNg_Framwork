package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Parabank_FundTransfer extends Parabank_Login{
	
	public Parabank_FundTransfer(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	
	@FindBy(xpath="//a[contains(@href,'transfer.htm')]")
	
	private WebElement FundTransferLink;
	
	@FindBy(xpath="//input[@id='amount']")
	
	private WebElement EnterAmount;
	
	
	//@FindBy(xpath="//input[@value='Transfer']")
	
	private WebElement ClickTransferButton;
	
	
	
	
	
	
	public void ClickOnFundTransferLink() {
		
		FundTransferLink.click();
	}
	
	
	public void EnterTheDepositeAmount() {
		
		EnterAmount.sendKeys(String.valueOf(5000));   //sendKeys(String.valueOf(5000))
		
	}
	
	public void ClickOnTransferButton() {
		
		ClickTransferButton.click();
		
	}

}

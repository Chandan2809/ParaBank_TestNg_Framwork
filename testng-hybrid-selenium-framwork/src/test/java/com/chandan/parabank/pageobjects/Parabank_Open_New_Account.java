package com.chandan.parabank.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
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
	
	
	@FindBy(xpath="//select[@id='type']")
	
	private WebElement ClickTypeOfAccount;
	
	
	@FindBy(xpath="//select//option[@value='1']") ////select[@id='type']/option[text()='SAVINGS']
	
	private WebElement SelectSaving;
	
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	
	private WebElement SelectAccountId;
	
	
	@FindBy(xpath="//input[@value='Open New Account']")
	
	 private WebElement ClickOnOpenAccount;
	
	@FindBy(id="newAccountId")
	
	private WebElement newAccountId;
	
	
	
	@FindBy(xpath="//a[contains(@href,'transaction.htm?id')]")
	
	 private WebElement FunTransfer;
	
	
	
	
	public void ClickOpenNewAccount() {
		
		ClickOpenNewAccountLink.click();
	}
	
	
	public void ClickAccountTypeDropDown() {
		
		ClickTypeOfAccount.click();
	}
	
	public void SelectSavingAccountType() {
		
		SelectSaving.click();
	}
	
	public void SelectSavingAccountId() {
		
		
		Select select = new Select(SelectAccountId);
	    select.selectByIndex(0);
		
		//SelectAccountId.click();
	}
	
	public void ClickOnOpenSavingAccount() {
		
		ClickOnOpenAccount.click();
		
	}
	
	public void clickOnNewAccountLink() {
		
		newAccountId.click();
		
	}
	
	public void ClickOnFundTransfer() {
		
		FunTransfer.click();
		
	}

}

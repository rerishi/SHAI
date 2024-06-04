package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankBranchPage {

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//div/child::a[@id='firstFocusNew2']")
	private WebElement  selectBankBranch;
	
	public BankBranchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSelectBankBranch() {
		return selectBankBranch;
	}
	
	
}

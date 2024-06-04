package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyRelationDetailsPage {

	@FindBy(xpath = "//td[contains(.,'Party Code')]/following-sibling::td/child::input[contains(@class,'fieldSClsNew')]")
	private WebElement partyCodeTxtBox;     //will be given while asking for test Data Creation
	
	@FindBy(name = "firstFocus")
	private WebElement partyCodeDDKey;
	
	@FindBy(id = "SearchBtn")
	private WebElement saveBtn;
	
	@FindBy(id = "pStakeCode")
	private WebElement stakeCodeDD;
	
	public PolicyRelationDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPartyCodeTxtBox() {
		return partyCodeTxtBox;
	}

	public WebElement getPartyCodeDDKey() {
		return partyCodeDDKey;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getStakeCodeDD() {
		return stakeCodeDD;
	}
	
	
}

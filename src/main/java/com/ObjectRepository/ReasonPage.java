package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonPage {

	@FindBy(id = "pNewRemark")
	private WebElement additionalRemarkTxtBox;
	
	@FindBy(id = "saveBtn")
	private WebElement saveBtn;
	
	@FindBy(id = "Back")
	private WebElement backBtn;
	
	public ReasonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdditionalRemarkTxtBox() {
		return additionalRemarkTxtBox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}
	
	
}

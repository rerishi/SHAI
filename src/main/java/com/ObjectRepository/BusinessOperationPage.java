package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessOperationPage {

	@FindBy(id = "head")
	private WebElement frameOne;
	
	@FindBy(xpath = "//td[@id='pMenu_4']")
	private WebElement newBusinessMenu;
	
	@FindBy(xpath = "//td[text()='licy Servicing']")
	private WebElement policyServicingMenu;
	
	public BusinessOperationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOne() {
		return frameOne;
	}

	public WebElement getNewBusinessMenu() {
		return newBusinessMenu;
	}

	public WebElement getPolicyServicingMenu() {
		return policyServicingMenu;
	}
	
	
}

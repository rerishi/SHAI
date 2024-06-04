package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoleLoginPage {

	@FindBy(name = "display")
	private WebElement frameOne;
	
	@FindBy(name = "pSelectBranch")
	private WebElement branchTxtBox;
	
	@FindBy(name = "pRole")
	private WebElement roleDD;
	
	@FindBy(xpath = "//span[contains(.,'Login')]")
	private WebElement loginBtn;
	
	public RoleLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOne() {
		return frameOne;
	}

	public WebElement getBranchTxtBox() {
		return branchTxtBox;
	}

	public WebElement getRoleDD() {
		return roleDD;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}

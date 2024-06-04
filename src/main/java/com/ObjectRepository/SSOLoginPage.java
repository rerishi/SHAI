package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSOLoginPage {
	
	@FindBy(id = "username")
	private WebElement nameTextBx;
	
	@FindBy(id = "password")
	private WebElement pwdTextBx;
	
	@FindBy(id = "submitBtn")
	private WebElement submitBtn;
	
	public SSOLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNameTextBx() {
		return nameTextBx;
	}

	public WebElement getPwdTextBx() {
		return pwdTextBx;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void login(String username, String password)
	{
		nameTextBx.sendKeys(username);
		pwdTextBx.sendKeys(password);
		submitBtn.click();
	}
	

}

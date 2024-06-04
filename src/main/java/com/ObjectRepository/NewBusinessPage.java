package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewBusinessPage {
	
	@FindBy(name = "display")
	private WebElement frameOne;
	
	@FindBy(id = "pProductCode")
	private WebElement productTxtBox;
	
	@FindBy(xpath = "//select[@id='pProduct']")
	private WebElement productList;
	
	public NewBusinessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOne() {
		return frameOne;
	}

	public WebElement getProductTxtBox() {
		return productTxtBox;
	}

	public WebElement getProductList() {
		return productList;
	}
	
	

}

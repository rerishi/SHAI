package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentHomePage {
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameTwoDepartmentHomePage;
	
	@FindBy(xpath = "//div[@id='pageafterid']/child::a[contains(@onclick,'Business Operations')]/img/parent::a/parent::div")
	private WebElement businessOprn;
	
	@FindBy(id = "administration")
	private WebElement busOpSecond;
	
	public DepartmentHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBusinessOprn() {
		return businessOprn;
	}

	public WebElement getBusOpSecond() {
		return busOpSecond;
	}

	public WebElement getFrameTwoDepartmentHomePage() {
		return frameTwoDepartmentHomePage;
	}
	
	

}

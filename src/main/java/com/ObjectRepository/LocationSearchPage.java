package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationSearchPage {

	@FindBy(xpath = "//div[contains(.,'Deva Nagar')]")
	private WebElement selectLocation;
	
	public LocationSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}
	
	
}

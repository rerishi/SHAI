package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartyMaintenencePage {

	@FindBy(xpath = "//a[@id='firstFocusNew1']/following-sibling::div/child::a[@name='firstFocus']")
	private WebElement partySearchPartyCodeOption;
	
	public PartyMaintenencePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPartySearchPartyCodeOption() {
		return partySearchPartyCodeOption;
	}
	
	
}

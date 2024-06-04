package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberInfoPage {

	@FindBy(xpath = "(//a[@id='member1'])[1]")
	private WebElement member1Link;
	
	@FindBy(id = "saveAndConBtn")
	private WebElement saveAndContinueBtn;
	
	@FindBy(xpath = "//a[@title='Back']")
	private WebElement backBtn;
	
	@FindBy(id = "saveConBtn")
	private WebElement contiueBtn;
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameOneMemberInfoPage;
	
	@FindBy(xpath = "(//tr[@class='table_ce12']/td/a)[7]")
	private WebElement ageInYearsText;
	
	public MemberInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMember1Link() {
		return member1Link;
	}

	public WebElement getSaveAndContinueBtn() {
		return saveAndContinueBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getContiueBtn() {
		return contiueBtn;
	}

	public WebElement getFrameOneMemberInfoPage() {
		return frameOneMemberInfoPage;
	}

	public WebElement getAgeInYearsText() {
		return ageInYearsText;
	}
	
	
}

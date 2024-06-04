package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineeDetailsPage {

	@FindBy(name = "SEC-NOMINEENominee DetailNominee Name1")
	private WebElement nomineeNameTxtBox;
	
	@FindBy(xpath = "//select[@alt='Relationship with Proposer']")
	private WebElement relationshipWithProposerDD;
	
	@FindBy(xpath = "//input[@alt='Date of Birth']")
	private WebElement nomineeDOB;
	
	@FindBy(xpath = "//span[text()='ave']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//span[text()='lose']")
	private WebElement closeBtn;
	
	@FindBy(xpath = "//input[@alt='Nominee %']")
	private WebElement nomineePercent;
	
	public NomineeDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNomineeNameTxtBox() {
		return nomineeNameTxtBox;
	}

	public WebElement getRelationshipWithProposerDD() {
		return relationshipWithProposerDD;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getNomineeDOB() {
		return nomineeDOB;
	}

	public WebElement getNomineePercent() {
		return nomineePercent;
	}
	
	
}

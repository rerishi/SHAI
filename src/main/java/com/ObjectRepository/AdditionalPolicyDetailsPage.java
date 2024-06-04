package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalPolicyDetailsPage {

	@FindBy(xpath = "//td[text()='Quote Number:']/following-sibling::td")
	private WebElement quoteNumber;
	
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement addBtnInPolicyRelation;
	
	@FindBy(xpath = "//a[@id='addButtonSEC-POLREL']")
	private WebElement addBtnInPolicyRelation2;
	
	@FindBy(name = "display")
	private WebElement frameOneOfAdnlPolicyDetailsPage;
	
	@FindBy(xpath = "//div[contains(.,'Sum Insured Basis')]/parent::td/following-sibling::td/child::select")
	private WebElement sumInsuredBasisDD;
	
	@FindBy(id = "SEC-NOMINEENominee Detail")
	private WebElement nomineeDetailBtn;
	
	@FindBy(id = "saveAndConBtn")
	private WebElement saveAndContinueBtn;
	
	public AdditionalPolicyDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuoteNumber() {
		return quoteNumber;
	}

	public WebElement getAddBtnInPolicyRelation() {
		return addBtnInPolicyRelation;
	}

	public WebElement getAddBtnInPolicyRelation2() {
		return addBtnInPolicyRelation2;
	}

	public WebElement getFrameOneOfAdnlPolicyDetailsPage() {
		return frameOneOfAdnlPolicyDetailsPage;
	}

	public WebElement getSumInsuredBasisDD() {
		return sumInsuredBasisDD;
	}

	public WebElement getNomineeDetailBtn() {
		return nomineeDetailBtn;
	}

	public WebElement getSaveAndContinueBtn() {
		return saveAndContinueBtn;
	}
	
	
}

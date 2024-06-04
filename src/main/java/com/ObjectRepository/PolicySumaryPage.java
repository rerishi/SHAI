package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicySumaryPage {

	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameOnePolicySummaryPage;
	
	@FindBy(xpath = "//a[@title='Calculate Premium']")
	private WebElement calculatePremiumBtn;
	
	@FindBy(xpath = "//input[@alt='Total Premium Amount']")
	private WebElement totalPremiumAmtTextBox;
	
	@FindBy(xpath = "//a[@title='View and Upload Documents']")
	private WebElement viewAndUploadDocumentsBtn;
	
	@FindBy(id = "IssueQuote")
	private WebElement issueQuoteBtn;
	
	@FindBy(xpath = "//img[@id='moduleDD']")
	private WebElement businessOperationModuleArrowIcon;
	
	@FindBy(xpath = "//frame[@id='head']")
	private WebElement frameTwoPolicySummaryPage;
	
	@FindBy(xpath = "//td[text()='Accounting']")
	private WebElement accountingSubMenu;
	
	public PolicySumaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOnePolicySummaryPage() {
		return frameOnePolicySummaryPage;
	}

	public WebElement getCalculatePremiumBtn() {
		return calculatePremiumBtn;
	}

	public WebElement getTotalPremiumAmtTextBox() {
		return totalPremiumAmtTextBox;
	}

	public WebElement getViewAndUploadDocumentsBtn() {
		return viewAndUploadDocumentsBtn;
	}

	public WebElement getIssueQuoteBtn() {
		return issueQuoteBtn;
	}

	public WebElement getBusinessOperationModuleArrowIcon() {
		return businessOperationModuleArrowIcon;
	}

	public WebElement getFrameTwoPolicySummaryPage() {
		return frameTwoPolicySummaryPage;
	}

	public WebElement getAccountingSubMenu() {
		return accountingSubMenu;
	}
	
	
	
}

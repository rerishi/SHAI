package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicDetailsPage {

	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameOneBasicDetailPage;
	
	@FindBy(xpath = "//input[@alt='Policy Inception Date' and @class='fieldSCls']")
	private WebElement policyInceptionDate;
	
	@FindBy(xpath = "//input[@alt='Policy Duration']")
	private WebElement policyDuration;
	
	@FindBy(xpath = "//textarea[@class='fieldSClstextarea' and @alt='Back Date Reason']")
	private WebElement backDateReasonTxtBox;
	
	@FindBy(xpath = "//img[@alt='Policy HolderNew']")
	private WebElement newPloicyHolderIcon;
	
	@FindBy(xpath = "//tr/child::td/child::input[@class='fieldSClsNew']")
	private WebElement partyCodeTxtBox;
	
	@FindBy(xpath = "//input[@alt='Proposal Form No']")
	private WebElement proposalFormNoTxtBox;    //Can be Anything Random
	
	@FindBy(xpath = "//input[@alt='Proposal Received Date']")
	private WebElement proposalReceivedDateTxtBox;           //Equal to Policy Inception Date
	
	@FindBy(xpath = "//input[@alt='Proposal Form Date']")
	private WebElement proposalFormDateTxtBox;         ////Equal to Policy Inception Date
	
	@FindBy(id = "saveAndConBtn")
	private WebElement saveAndContinueBtn;
	
	
	public BasicDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOneBasicDetailPage() {
		return frameOneBasicDetailPage;
	}

	public WebElement getPolicyInceptionDate() {
		return policyInceptionDate;
	}

	public WebElement getPolicyDuration() {
		return policyDuration;
	}

	public WebElement getBackDateReasonTxtBox() {
		return backDateReasonTxtBox;
	}

	public WebElement getNewPloicyHolderIcon() {
		return newPloicyHolderIcon;
	}

	public WebElement getPartyCodeTxtBox() {
		return partyCodeTxtBox;
	}

	public WebElement getProposalReceivedDateTxtBox() {
		return proposalReceivedDateTxtBox;
	}

	public WebElement getProposalFormNoTxtBox() {
		return proposalFormNoTxtBox;
	}

	public WebElement getProposalFormDateTxtBox() {
		return proposalFormDateTxtBox;
	}

	public WebElement getSaveAndContinueBtn() {
		return saveAndContinueBtn;
	}
	
	
	
}

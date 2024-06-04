package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyServicingPage {

	@FindBy(xpath = "//td[contains(.,'Quote No./Application')]/following-sibling::td/descendant::input[@id='pProposalNo1']")
	private WebElement quoteNoOrApplicationNoTxtBox;
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameTwoPolicyServicingPage;
	
	@FindBy(xpath = "//frame[@id='head']")
	private WebElement frameOnePolicyServicingPage;
	
	@FindBy(xpath = "//div[@title='Select to switch Role']")
	private WebElement roleDD;
	
	@FindBy(xpath = "//td[text()='TVCCORP']")
	private WebElement tvCorpOption;
	
	@FindBy(xpath = "//td[text()='UWRITER']")
	private WebElement uwriterOption;
	
	@FindBy(xpath = "//span[text()='Search']/parent::a")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//tr[@class='table_head']/following-sibling::tr/child::td/child::div/child::a[@name='firstFocus']")
	private WebElement quoteNoOption;
	
	@FindBy(xpath = "//a[@id='CollectPremBtn']")
	private WebElement collectPremiumBtn;
	
	@FindBy(xpath = "//td[@title='Quote/']/parent::tr/following-sibling::tr/child::td/child::a[@name='firstFocus']")
	private WebElement quoteOrPolicyNumOption;
	
	@FindBy(xpath = "//a[@title='Approve']")
	private WebElement approveBtn;
	
	@FindBy(xpath = "//textarea[@class='field_textarea']")
	private WebElement remarksTxtBox;
	
	@FindBy(xpath = "//a[@id='saveBtn']")
	private WebElement saveBtnOfRemarksPage;
	
	@FindBy(xpath = "//a[@id='IssueQuote']")
	private WebElement issueQuoteBtn;
	
	@FindBy(xpath = "//textarea[@class='field_textarea']")
	private WebElement remarksTxtBoxOfIssueQuote;
	
	@FindBy(xpath = "//span[@id='saveBtnSpanId']/parent::a")
	private WebElement yesBtnOfIssueQuote;
	
	@FindBy(xpath = "//a[@title='Issue Policy']")
	private WebElement issuePolicyBtn;
	
	@FindBy(xpath = "//textarea[@class='field_textarea']")
	private WebElement remarksTxtBoxOfIssuePolicy;
	
	@FindBy(xpath = "//span[@id='saveBtnSpanId']/parent::a[@id='saveBtn']")
	private WebElement yesBtnOfIssuePolicy;
	
	public PolicyServicingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuoteNoOrApplicationNoTxtBox() {
		return quoteNoOrApplicationNoTxtBox;
	}

	public WebElement getFrameTwoPolicyServicingPage() {
		return frameTwoPolicyServicingPage;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getQuoteNoOption() {
		return quoteNoOption;
	}

	public WebElement getFrameOnePolicyServicingPage() {
		return frameOnePolicyServicingPage;
	}

	public WebElement getRoleDD() {
		return roleDD;
	}

	public WebElement getTvCorpOption() {
		return tvCorpOption;
	}

	public WebElement getUwriterOption() {
		return uwriterOption;
	}

	public WebElement getCollectPremiumBtn() {
		return collectPremiumBtn;
	}

	public WebElement getQuoteOrPolicyNumOption() {
		return quoteOrPolicyNumOption;
	}

	public WebElement getApproveBtn() {
		return approveBtn;
	}

	public WebElement getRemarksTxtBox() {
		return remarksTxtBox;
	}

	public WebElement getSaveBtnOfRemarksPage() {
		return saveBtnOfRemarksPage;
	}

	public WebElement getIssueQuoteBtn() {
		return issueQuoteBtn;
	}

	public WebElement getRemarksTxtBoxOfIssueQuote() {
		return remarksTxtBoxOfIssueQuote;
	}

	public WebElement getYesBtnOfIssueQuote() {
		return yesBtnOfIssueQuote;
	}

	public WebElement getIssuePolicyBtn() {
		return issuePolicyBtn;
	}

	public WebElement getRemarksTxtBoxOfIssuePolicy() {
		return remarksTxtBoxOfIssuePolicy;
	}

	public WebElement getYesBtnOfIssuePolicy() {
		return yesBtnOfIssuePolicy;
	}

	
	
	
	
}

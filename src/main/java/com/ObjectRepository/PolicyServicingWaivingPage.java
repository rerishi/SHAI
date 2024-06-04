package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyServicingWaivingPage {

	@FindBy(xpath = "//frame[@name='head']")
	private WebElement frameOnePolicyServicingWaivingPage;
	
	@FindBy(xpath = "//div[@title='Select to switch Role']/child::a")
	private WebElement roleDD;
	
	@FindBy(xpath = "//td[text()='TVCCORP']")
	private WebElement tvccorpOption;
	
	@FindBy(xpath = "//td[text()='ashboard']")
	private WebElement dashboardSubMenu;
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameTwoTVCCORPPage;
	
	@FindBy(xpath = "//select[@name='pTvcstatid']")
	private WebElement tvcStatusDD;
	/**
	 * value="402" --> Initiated for TVC
	 * value="411" --> Pending with TVC
	 * value="408" --> Queried  and Edited by TVC
	 * value="407" --> Queried by TVC
	 * value="406" --> Sent for TVC Reconsideration
	 * value="409" --> TVC Query Replied
	 * value="410" --> TVC Waived
	 * value="415" --> Taken up by TVC
	 * value="412" --> Waiver Requested to CTVC
	 * 
	 */
	
	@FindBy(xpath = "//td[contains(.,'Proposal/Policy Number')]/following-sibling::td/child::input")
	private WebElement proposalOrPolicyNumTxtBox;
	
	@FindBy(xpath = "//span[text()='Search']/parent::a")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//div[text()='Proposal/Policy Number']/parent::td/parent::tr/following-sibling::tr/child::td/child::input[@type='checkbox']")
	private WebElement optionRadioBtn;
	
	@FindBy(xpath = "//span[text()='Waive']/parent::a")
	private WebElement waiveBtn;
	
	@FindBy(xpath = "//textarea[@class='field_textarea']")
	private WebElement remarksTxtBox;
	
	@FindBy(xpath = "//span[text()='Save']/parent::a")
	private WebElement remarksSaveBtn;
	
	@FindBy(xpath = "//td[text()='UWRITER']")
	private WebElement uwriterOption;
	
	public PolicyServicingWaivingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOnePolicyServicingWaivingPage() {
		return frameOnePolicyServicingWaivingPage;
	}

	public WebElement getTvccorpOption() {
		return tvccorpOption;
	}

	public WebElement getRoleDD() {
		return roleDD;
	}

	public WebElement getDashboardSubMenu() {
		return dashboardSubMenu;
	}

	public WebElement getFrameTwoTVCCORPPage() {
		return frameTwoTVCCORPPage;
	}

	public WebElement getTvcStatusDD() {
		return tvcStatusDD;
	}

	public WebElement getProposalOrPolicyNumTxtBox() {
		return proposalOrPolicyNumTxtBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getOptionRadioBtn() {
		return optionRadioBtn;
	}

	public WebElement getWaiveBtn() {
		return waiveBtn;
	}

	public WebElement getRemarksTxtBox() {
		return remarksTxtBox;
	}

	public WebElement getRemarksSaveBtn() {
		return remarksSaveBtn;
	}

	public WebElement getUwriterOption() {
		return uwriterOption;
	}
	
	
}

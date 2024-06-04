package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateScrollPage {

	@FindBy(xpath = "//input[@id='pInstrumentAmt']")
	private WebElement instrumentAmountTxtBox;
	
	@FindBy(xpath = "//select[@id='pSourceOfCollection']")
	private WebElement sourceOfFundDD;
	/**
	 *value="C"  --> Banker
	 * value="B"  -->Broker/Corporate Agent/Dealer
	 * value="D"  -->Hirer/Hypothecator
	 * value="A"  -->Insured
	 * value="Z"  -->Inter System Collection
	 * value="E"  -->Other Approved Source
	 * value="F"  -->Premium Payer
	 */
	
	@FindBy(xpath = "//select[@id='CollectionMode']")
	private WebElement modeDD;
	/**
	 * value="C" --> Cash	
	 * value="Q" --> Cheque
	 * value="CCM" --> Credit Card Mandate
	 * value="CCS" --> Credit Card Swipe
	 * value="D" --> Draft
	 * value="EFT" --> Electronic Fund Transfer
	 * value="PG" --> Payment Gateway
	 */
	
	@FindBy(xpath = "//input[@id='CollectionAmount']")
	private WebElement collectionAmountTxtBox;
	
	@FindBy(xpath = "//input[@id='ReceivedDate']")
	private WebElement receivedDateTxtBox;
	
	@FindBy(xpath = "//input[@id='PremiumReceivedDate']")
	private WebElement premiumReceivedDateTxtBox;
	
	@FindBy(xpath = "//a[@id='getTotal']")
	private WebElement getTotalBtn;
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameOneCreateScrollPage;
	
	@FindBy(xpath = "//a[@id='postBtn']")
	private WebElement postBtn;
	
	@FindBy(xpath = "//frame[@id='head']")
	private WebElement frameTwoHeadCreateScrollPage;
	
	@FindBy(xpath = "//img[@id='moduleDD']/parent::td")
	private WebElement moduleDDIcon;
	
	@FindBy(xpath = "//td[text()='Business Operations']")
	private WebElement businessOperationOption;
	
	@FindBy(xpath = "//span[@id='SaveSpan']/parent::a")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameThreeScrollEntryScreen;
	
	@FindBy(xpath = "(//input[@name='pScrollNumber'])[1]")
	private WebElement scrollNumTextBox;
	
	public CreateScrollPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getInstrumentAmountTxtBox() {
		return instrumentAmountTxtBox;
	}

	public WebElement getSourceOfFundDD() {
		return sourceOfFundDD;
	}

	public WebElement getModeDD() {
		return modeDD;
	}

	public WebElement getCollectionAmountTxtBox() {
		return collectionAmountTxtBox;
	}

	public WebElement getReceivedDateTxtBox() {
		return receivedDateTxtBox;
	}

	public WebElement getPremiumReceivedDateTxtBox() {
		return premiumReceivedDateTxtBox;
	}

	public WebElement getGetTotalBtn() {
		return getTotalBtn;
	}

	public WebElement getFrameOneCreateScrollPage() {
		return frameOneCreateScrollPage;
	}

	public WebElement getPostBtn() {
		return postBtn;
	}

	public WebElement getFrameTwoHeadCreateScrollPage() {
		return frameTwoHeadCreateScrollPage;
	}

	public WebElement getModuleDDIcon() {
		return moduleDDIcon;
	}

	public WebElement getBusinessOperationOption() {
		return businessOperationOption;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getFrameThreeScrollEntryScreen() {
		return frameThreeScrollEntryScreen;
	}

	public WebElement getScrollNumTextBox() {
		return scrollNumTextBox;
	}
	
	
}

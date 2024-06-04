package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectPremiumPage {

	@FindBy(xpath = "//select[@id='CollectionMode']")
	private WebElement modeDD;
	/**
	 * value="A" --> APD
	 * value="AARR" --> Adjustment Against Advance Receipt Refund
	 * value="AC"  --> Adjustment Against Claim
	 * value="AE"  --> Adjustment Against Excess
	 * value="AR" --> Adjustment Against Refund
	 * value="BANCASSUR" --> Bancassurance
	 * value="C"  --> Cash
	 * value="Q" --> Cheque
	 * value="CCM" -->Credit Card Mandate
	 * value="CCS" --> Credit Card Swipe
	 * value="S" --> Scroll
	 */
	
	@FindBy(xpath = "//input[@name='pInstrumentAmt']")
	private WebElement instrumentAmountTxtBox;
	
	@FindBy(xpath = "(//td[text()='Collection Amount']/parent::tr/following-sibling::tr/child::td)[2]/child::input")
	private WebElement collectionAmountTxtBox;
	
	@FindBy(xpath = "//input[@id='SubCodeLookup']")
	private WebElement subCodeLookupIcon;
	
	@FindBy(xpath = "//input[@id='ReceivedDate']")
	private WebElement receivedDateTxtBox;
	
	@FindBy(xpath = "//span[text()='et Total']")
	private WebElement getTotalBtn;
	
	@FindBy(xpath = "//span[@id='SaveSpan']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//span[text()='Search']/parent::a")
	private WebElement searchBtnOfAccountSearchPage;
	
	@FindBy(xpath = "(//td[contains(.,'GL Code')])[2]/parent::tr/following-sibling::tr/child::td/child::div/child::a")
	private WebElement searchOptionOfAccountSearchPage;
	
	@FindBy(xpath = "//input[@id='DNLookup']")
	private WebElement referenceNumlookupIcon;
	
	@FindBy(xpath = "//select[@name='pReferenceType']")
	private WebElement referenceTypeDDInRefNumSearchPage;
	/**
	 * value="8" --> Scroll No
	 * 
	 */
	
	@FindBy(xpath = "((//td[contains(.,'Reference No')])[2]/following-sibling::td/child::input)[1]")
	private WebElement referenceNumTxtBoxInRefSearchPage;
	
	@FindBy(xpath = "//span[text()='Search']/parent::a")
	private WebElement searchBtnInRefSearchPage;
	
	@FindBy(xpath = "//tr[@class='table_head']/following-sibling::tr/child::td/child::a")
	private WebElement searchOptionOfRefSearchPage;
	
	@FindBy(id = "PremiumReceivedDate")
	private WebElement premiumReceivedDateTxtBox;
	
	@FindBy(xpath = "//a[@id='postBtn']")
	private WebElement postBtn;
	
	@FindBy(xpath = "//span[@id='BackSpan']/parent::a")
	private WebElement closeBtn;
	
	public CollectPremiumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getModeDD() {
		return modeDD;
	}

	public WebElement getInstrumentAmountTxtBox() {
		return instrumentAmountTxtBox;
	}

	public WebElement getCollectionAmountTxtBox() {
		return collectionAmountTxtBox;
	}

	public WebElement getGetTotalBtn() {
		return getTotalBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getReceivedDateTxtBox() {
		return receivedDateTxtBox;
	}

	public WebElement getSubCodeLookupIcon() {
		return subCodeLookupIcon;
	}

	public WebElement getSearchBtnOfAccountSearchPage() {
		return searchBtnOfAccountSearchPage;
	}

	public WebElement getSearchOptionOfAccountSearchPage() {
		return searchOptionOfAccountSearchPage;
	}

	public WebElement getReferenceNumlookupIcon() {
		return referenceNumlookupIcon;
	}

	public WebElement getReferenceTypeDDInRefNumSearchPage() {
		return referenceTypeDDInRefNumSearchPage;
	}

	public WebElement getReferenceNumTxtBoxInRefSearchPage() {
		return referenceNumTxtBoxInRefSearchPage;
	}

	public WebElement getSearchBtnInRefSearchPage() {
		return searchBtnInRefSearchPage;
	}

	public WebElement getSearchOptionOfRefSearchPage() {
		return searchOptionOfRefSearchPage;
	}

	public WebElement getPremiumReceivedDateTxtBox() {
		return premiumReceivedDateTxtBox;
	}

	public WebElement getPostBtn() {
		return postBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	
}

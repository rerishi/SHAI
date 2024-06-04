package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountingPage {

	@FindBy(id = "head")
	private WebElement frameOneAccountingPage;
	
	@FindBy(xpath = "//td[text()='croll']")
	private WebElement scrollMenu;
	
	@FindBy(xpath = "//td[text()='reate Scroll']")
	private WebElement createScrollLink;
		
	@FindBy(xpath = "//frame[@name='display']")
	private WebElement frameTwoAccountingPage;
	
	@FindBy(id = "pCatType")
	private WebElement scrollCategoryDD;
	/**
	 * value="BACKDATE"
	 * value="DIRECT"
	 */
	
	@FindBy(name = "pScrollDate")
	private WebElement scrollDateTxtBox;
	
	@FindBy(name = "pScrollTime")
	private WebElement scrollTimeTxtBox;
	
	@FindBy(name = "pPartyCode4")
	private WebElement customerPartyCodeTxtBox;
	
	@FindBy(xpath = "//input[@name='pPartyCode4']/following-sibling::a[@name='firstFocus']")
	private WebElement customerPartyCodeArrowIcon;
	
	@FindBy(xpath = "//div/child::a[@id='firstFocusNew1']")
	private WebElement customerPartyCodeOption;
	
	@FindBy(xpath = "//input[@id='pPanNo']")
	private WebElement panNoOfPayerTxtBox;
	
	@FindBy(name = "pReasonCode")
	private WebElement reasonCodeDD;
	/**
	 * value="02" --> Collecting person met with accident/illness
	 * value="01" --> Instrument sent by Post/Courier
	 * value="03" --> Local Strike, disturbances
	 * value="04" --> Natural Disasters like Flood, Earthquake,
	 * value="99" --> Others
	 */
	
	@FindBy(xpath = "//input[@name='pPartyCode1']")
	private WebElement businessSourceCodeTxtBox;
	
	@FindBy(xpath = "//input[@name='pPartyName1']/following-sibling::a[@name='firstFocus']")
	private WebElement businessSourceCodeArrowIcon;
	
	@FindBy(xpath = "//a[@id='firstFocusNew1']/following-sibling::div/child::a")
	private WebElement businessSourceCodeValidationOption;
	
	@FindBy(xpath = "//input[@name='pPartyCode2']")
	private WebElement intermediaryCodeTxtBox;
	
	@FindBy(xpath = "//input[@name='pPartyName2']/following-sibling::a[@name='firstFocus']")
	private WebElement intermediaryCodeArrowIcon;
	
	@FindBy(xpath = "//a[@id='firstFocusNew1']/following-sibling::div/child::a")
	private WebElement intermediateryCodeValidationOption;
	
	@FindBy(id = "pReceiptType")
	private WebElement receiptTypeDD;
	/**
	 * value="Single"
	 * value="Multiple"
	 */
	
	@FindBy(id = "pCollPurpose")
	private WebElement collectionPurposeDD;
	/**
	 * value="NEW"
	 * value="RENEWAL"
	 */
	
	@FindBy(xpath = "//a[@title='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//a[@title='Collect']")
	private WebElement collectBtn;
	
	public AccountingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrameOneAccountingPage() {
		return frameOneAccountingPage;
	}

	public WebElement getScrollMenu() {
		return scrollMenu;
	}

	public WebElement getCreateScrollLink() {
		return createScrollLink;
	}

	public WebElement getFrameTwoAccountingPage() {
		return frameTwoAccountingPage;
	}

	public WebElement getScrollCategoryDD() {
		return scrollCategoryDD;
	}

	public WebElement getScrollDateTxtBox() {
		return scrollDateTxtBox;
	}

	public WebElement getScrollTimeTxtBox() {
		return scrollTimeTxtBox;
	}

	public WebElement getCustomerPartyCodeTxtBox() {
		return customerPartyCodeTxtBox;
	}

	public WebElement getCustomerPartyCodeArrowIcon() {
		return customerPartyCodeArrowIcon;
	}

	public WebElement getCustomerPartyCodeOption() {
		return customerPartyCodeOption;
	}

	public WebElement getReasonCodeDD() {
		return reasonCodeDD;
	}

	public WebElement getBusinessSourceCodeTxtBox() {
		return businessSourceCodeTxtBox;
	}

	public WebElement getBusinessSourceCodeArrowIcon() {
		return businessSourceCodeArrowIcon;
	}

	public WebElement getIntermediaryCodeTxtBox() {
		return intermediaryCodeTxtBox;
	}

	public WebElement getIntermediaryCodeArrowIcon() {
		return intermediaryCodeArrowIcon;
	}

	public WebElement getReceiptTypeDD() {
		return receiptTypeDD;
	}

	public WebElement getCollectionPurposeDD() {
		return collectionPurposeDD;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCollectBtn() {
		return collectBtn;
	}

	public WebElement getPanNoOfPayerTxtBox() {
		return panNoOfPayerTxtBox;
	}

	public WebElement getBusinessSourceCodeValidationOption() {
		return businessSourceCodeValidationOption;
	}

	public WebElement getIntermediateryCodeValidationOption() {
		return intermediateryCodeValidationOption;
	}
	
	
		
}

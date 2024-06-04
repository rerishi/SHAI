package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPolicyHolderScreen {

	@FindBy(xpath = "//textarea[contains(@alt,'First Name')]")
	private WebElement firstNameTxtBox;
	
	@FindBy(xpath = "//textarea[contains(@alt,'Last Name')]")
	private WebElement lastNameTxtBox;
	
	@FindBy(xpath = "//input[@alt='Date of Birth']")
	private WebElement dob;
	
	@FindBy(xpath = "//select[@alt='Social Sector Code']")
	private WebElement socialSectorCodeDD;
	
	@FindBy(xpath = "//select[@alt='Title']")
	private WebElement titleDD;
	
	@FindBy(xpath = "//select[@alt='Gender']")
	private WebElement genderDD;
	
	@FindBy(xpath = "//select[@alt='Occupation']")
	private WebElement occupationDD;
	
	@FindBy(xpath = "//select[@alt='Party Payment Method']")
	private WebElement partyPaymentMethodDD;
	
	@FindBy(xpath = "//input[@alt='PAN']")
	private WebElement panTxtBox;
	
	@FindBy(xpath = "//input[@alt='Annual Income']")
	private WebElement annualIncomeTxtBox;
	
	@FindBy(xpath = "//select[@alt='Marital Status']")
	private WebElement maritalStatusDD;
	
	@FindBy(xpath = "//textarea[@alt='Address 1']")
	private WebElement addressOneTxtBox;
	
	@FindBy(xpath = "//textarea[@alt='Address 2']")
	private WebElement addressTwoTxtBox;
	
	@FindBy(xpath = "//textarea[@alt='Address 3']")
	private WebElement addressThreeTxtBox;
	
	@FindBy(xpath = "//img[@alt='Location Id']")
	private WebElement locationIdIcon;
	
	@FindBy(xpath = "//input[@alt='Mobile No']")
	private WebElement mobileNoTxtBox;
	
	@FindBy(xpath = "//img[@alt='Bank Branch']/parent::a")
	private WebElement bankBranchIcon;
	
	@FindBy(xpath = "//input[@alt='Bank Account Number']")
	private WebElement bankAccNumberTxtBox;
	
	@FindBy(name = "SEC-BNKDTLSName As Per Bank AC")
	private WebElement nameAsPerBankAccTxtBox;
	
	@FindBy(xpath = "//input[@alt='Start Date']")
	private WebElement startDateTxtBox;
	
	@FindBy(xpath = "//input[@alt='End Date']")
	private WebElement endDatetxtBox;
	
	@FindBy(xpath = "//span[text()='ave']")
	private WebElement saveBtn;
	
	public NewPolicyHolderScreen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getLastNameTxtBox() {
		return lastNameTxtBox;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getSocialSectorCodeDD() {
		return socialSectorCodeDD;
	}

	public WebElement getTitleDD() {
		return titleDD;
	}

	public WebElement getGenderDD() {
		return genderDD;
	}

	public WebElement getOccupationDD() {
		return occupationDD;
	}

	public WebElement getPartyPaymentMethodDD() {
		return partyPaymentMethodDD;
	}

	public WebElement getPanTxtBox() {
		return panTxtBox;
	}

	public WebElement getAnnualIncomeTxtBox() {
		return annualIncomeTxtBox;
	}

	public WebElement getMaritalStatusDD() {
		return maritalStatusDD;
	}

	public WebElement getAddressOneTxtBox() {
		return addressOneTxtBox;
	}

	public WebElement getAddressTwoTxtBox() {
		return addressTwoTxtBox;
	}

	public WebElement getAddressThreeTxtBox() {
		return addressThreeTxtBox;
	}

	public WebElement getLocationIdIcon() {
		return locationIdIcon;
	}

	public WebElement getBankBranchIcon() {
		return bankBranchIcon;
	}

	public WebElement getBankAccNumberTxtBox() {
		return bankAccNumberTxtBox;
	}

	public WebElement getStartDateTxtBox() {
		return startDateTxtBox;
	}

	public WebElement getEndDatetxtBox() {
		return endDatetxtBox;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getNameAsPerBankAccTxtBox() {
		return nameAsPerBankAccTxtBox;
	}

	public WebElement getMobileNoTxtBox() {
		return mobileNoTxtBox;
	}
	
	
}

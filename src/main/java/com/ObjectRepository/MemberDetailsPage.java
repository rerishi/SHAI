package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberDetailsPage {

	@FindBy(xpath = "//input[@alt='Height of the Insured (in cms)']")
	private WebElement heightOfTheInsuredTxtBox;
	
	@FindBy(xpath = "//input[@alt='Weight (in kgs)']")
	private WebElement weightTxtBox;
	
	@FindBy(xpath = "//select[@alt='Member Sum Insured']")
	private WebElement memberSumInsuredDD;
	
	/**
	 * value="2000000"
	 * value="2500000"
	 * value="5000000"
	 * value="7500000"
	 * value="10000000"
	 */
	
	@FindBy(xpath = "//select[@alt='PED Declared in Proposal']")
	private WebElement pedDeclaredInProposalDD;
	
	/**
	 * value="N"
	 * value="Y"
	 */
	
	@FindBy(xpath = "//select[@alt='Extra Protect Section I Opted']")
	private WebElement extraProtectSection1OptedDD;
	
	/**
	 * value="N"
	 * value="Y"
	 */
	
	@FindBy(xpath = "//select[@alt='Extra Protect Section II Opted']")
	private WebElement extraProtectSection2OptedDD;
	
	/**
	 * value="N"
	 * value="Y"
	 */
	
	@FindBy(xpath = "//select[@alt='Extra Protect Aggregate Deductible Amount']")
	private WebElement extraProductAggregrateDeductableAmtDD;  
	
	/**value="25000"
	 * value="50000"
	 * value="100000"
	 */
	
	@FindBy(xpath = "//a[@title='Save and Proceed']")
	private WebElement proceedBtn;
	
	@FindBy(id = "closebtn")
	private WebElement 	closeBtn;
	
	@FindBy(xpath = "//a[@id='closebtn']")
	private WebElement closeBtn2;
	
	@FindBy(xpath = "//div[text()='Risk Cover List']")
	private WebElement riskCoverListSection;
	
	public MemberDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getHeightOfTheInsuredTxtBox() {
		return heightOfTheInsuredTxtBox;
	}

	public WebElement getWeightTxtBox() {
		return weightTxtBox;
	}

	public WebElement getMemberSumInsuredDD() {
		return memberSumInsuredDD;
	}

	public WebElement getPedDeclaredInProposalDD() {
		return pedDeclaredInProposalDD;
	}

	public WebElement getExtraProtectSection1OptedDD() {
		return extraProtectSection1OptedDD;
	}

	public WebElement getExtraProtectSection2OptedDD() {
		return extraProtectSection2OptedDD;
	}

	public WebElement getExtraProductAggregrateDeductableAmtDD() {
		return extraProductAggregrateDeductableAmtDD;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getCloseBtn2() {
		return closeBtn2;
	}

	public WebElement getRiskCoverListSection() {
		return riskCoverListSection;
	}
	
	
}

package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewDocumentDetailPage {

	@FindBy(xpath = "//input[@id='txtUpload0']")
	private WebElement chooseFileBtn1;
	
	@FindBy(xpath = "//input[@id='txtUpload1']")
	private WebElement chooseFileBtn2;
	
	@FindBy(xpath = "//input[@id='txtUpload2']")
	private WebElement chooseFileBtn3;
	
	@FindBy(id = "upload")
	private WebElement uploadBtn;
	
	@FindBy(id = "Close")
	private WebElement closeBtn;
	
	public ViewDocumentDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getChooseFileBtn1() {
		return chooseFileBtn1;
	}

	public WebElement getChooseFileBtn2() {
		return chooseFileBtn2;
	}

	public WebElement getChooseFileBtn3() {
		return chooseFileBtn3;
	}

	public WebElement getUploadBtn() {
		return uploadBtn;
	}
	
	public WebElement getCloseBtn() {
		return closeBtn;
	}

	
	
}

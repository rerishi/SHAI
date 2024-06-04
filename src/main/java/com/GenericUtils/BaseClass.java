package com.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ObjectRepository.SSOLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sdriver;
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil = new ExcelUtility();


	@BeforeClass(alwaysRun = true)
	public void config_BC() throws Throwable {
		String BROWSER = fUtil.readDataFromPropertyFile("browser");
		String URL=fUtil.readDataFromPropertyFile("url");
		// Opening Browser
		if (BROWSER.equals("chrome")) {
			// System.out.println(BROWSER);
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
		else
			System.out.println("Invalid browsername");
		sdriver = driver;
		// Maximizing Browser
		wUtil.maximizeWindow(driver);
		sdriver=driver;
		driver.get(URL);
	}

	@BeforeMethod(alwaysRun = true)
	public void config_BM() throws Throwable {
		String UN=fUtil.readDataFromPropertyFile("username");
		String PWD=fUtil.readDataFromPropertyFile("password");
		wUtil.implicitWait(driver, 10);
		SSOLoginPage sso = new SSOLoginPage(driver);
		sso.login(UN, PWD);
	}

	@AfterClass(alwaysRun = true)
	public void config_AM() throws Throwable {
//		wUtil.minimizeWindow(driver);
//		Thread.sleep(1000);
//		driver.quit();
	}

}

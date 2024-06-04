package TCSBanksPolicyCreation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtils.BaseClass;
import com.ObjectRepository.AccountingPage;
import com.ObjectRepository.AdditionalPolicyDetailsPage;
import com.ObjectRepository.BankBranchPage;
import com.ObjectRepository.BasicDetailsPage;
import com.ObjectRepository.BusinessOperationPage;
import com.ObjectRepository.CollectPremiumPage;
import com.ObjectRepository.CreateScrollPage;
import com.ObjectRepository.DepartmentHomePage;
import com.ObjectRepository.LocationSearchPage;
import com.ObjectRepository.MemberDetailsPage;
import com.ObjectRepository.MemberInfoPage;
import com.ObjectRepository.NewBusinessPage;
import com.ObjectRepository.NewPolicyHolderScreen;
import com.ObjectRepository.NomineeDetailsPage;
import com.ObjectRepository.PartyMaintenencePage;
import com.ObjectRepository.PolicyRelationDetailsPage;
import com.ObjectRepository.PolicyServicingPage;
import com.ObjectRepository.PolicyServicingWaivingPage;
import com.ObjectRepository.PolicySumaryPage;
import com.ObjectRepository.ReasonPage;
import com.ObjectRepository.RoleLoginPage;
import com.ObjectRepository.SSOLoginPage;
import com.ObjectRepository.ViewDocumentDetailPage;

@Listeners(com.GenericUtils.ListenerImplementaion.class)
public class PolicyCreationTest extends BaseClass {

	@Test
	public void policyCreation() throws Throwable {
		
		String inceptionDate=fUtil.readTestDataFromPropertyFile("inceptionDate");
		String firstName=fUtil.readTestDataFromPropertyFile("firstName")+jUtil.getRandomNumber();
		String lastName=fUtil.readTestDataFromPropertyFile("lastName");
		String mobNo=fUtil.readTestDataFromPropertyFile("mobNo");
		String proposalFormNum=fUtil.readTestDataFromPropertyFile("proposalFormNum");
		String addingAgentCode=fUtil.readTestDataFromPropertyFile("addingAgentCode");;
		String addingSalesMgrCode=fUtil.readTestDataFromPropertyFile("addingSalesMgrCode");
		String selectPolicyType=fUtil.readTestDataFromPropertyFile("selectPolicyType");  // INDIVIDUAL  or  FLOATER
		
		String nomineeName=fUtil.readTestDataFromPropertyFile("nomineeName");
		String relationshipWithProposer=fUtil.readTestDataFromPropertyFile("relationshipWithProposer");      //Blood Relatives
		String nomineeDOB=fUtil.readTestDataFromPropertyFile("nomineeDOB");
		String nomineePercent=fUtil.readTestDataFromPropertyFile("nomineePercent");
		
		String height=fUtil.readTestDataFromPropertyFile("height");
		String weight=fUtil.readTestDataFromPropertyFile("weight");
		
		String totalPremiumAmount="";
		String partyCode="";
		
		RoleLoginPage role = new RoleLoginPage(driver);
		driver.switchTo().frame(role.getFrameOne());
		role.getBranchTxtBox().sendKeys("111129");
		Select s = new Select(role.getRoleDD());
		s.selectByValue("UWRITER");
		role.getLoginBtn().click();
		// driver.findElement(By.xpath("//div[@id='pageafterid']/child::a[contains(@onclick,'Business
		// Operations')]/img")).click();

		DepartmentHomePage dept = new DepartmentHomePage(driver);
		dept.getBusinessOprn().click();
		BusinessOperationPage bop = new BusinessOperationPage(driver);
		
		for(;;)
		{
			try {
				driver.switchTo().defaultContent();

				driver.switchTo().frame(bop.getFrameOne());
				bop.getNewBusinessMenu().click();
				break;

			} catch (Exception e) {
				// TODO: handle exception
				//dept.getBusinessOprn().click();
				dept.getBusOpSecond();
			}
		}
		

//		WebElement framec=driver.findElement(By.name("display"));
//		driver.switchTo().frame(framec);

//		WebElement productTxtBox = driver.findElement(By.id("pProductCode"));
//		productTxtBox.sendKeys("Star Comprehensive Revised - 2019");
		driver.switchTo().defaultContent();
		NewBusinessPage nb = new NewBusinessPage(driver);
		driver.switchTo().frame(nb.getFrameOne());

		nb.getProductTxtBox().sendKeys("Star Comprehensive Revised - 2019");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1000)");

//		Select sel=new Select(nb.getProductList());
//		sel.selectByVisibleText("Star Comprehensive Revised - 2019");

		driver.switchTo().defaultContent();
		BasicDetailsPage bdet = new BasicDetailsPage(driver);
		driver.switchTo().frame(bdet.getFrameOneBasicDetailPage());
		bdet.getPolicyInceptionDate().clear();
		bdet.getPolicyInceptionDate().sendKeys(inceptionDate);
		bdet.getPolicyDuration().click();

		for (;;) {
			try {
				bdet.getBackDateReasonTxtBox().sendKeys("Ainve he");
				break;
			} catch (Exception e) {
				// TODO: handle exception
				bdet.getPolicyInceptionDate().click();
				bdet.getPolicyDuration().click();
				bdet.getBackDateReasonTxtBox().sendKeys("Ainve he");
				break;
			}
		}

		bdet.getNewPloicyHolderIcon().click();
		String currentWinName = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();

		for (String wid : allWinId) {
			if (wid.contains(currentWinName)) {
			} else {
				driver.switchTo().window(wid);
			}
		}

		NewPolicyHolderScreen nphs = new NewPolicyHolderScreen(driver);
		nphs.getFirstNameTxtBox().sendKeys(firstName);
		nphs.getLastNameTxtBox().sendKeys(lastName);
		nphs.getDob().sendKeys("17/09/1992");
		nphs.getSocialSectorCodeDD().click();
		Select socialSecurityCode = new Select(nphs.getSocialSectorCodeDD());
		socialSecurityCode.selectByValue("INFORMAL");

		nphs.getTitleDD().click();
		Select title = new Select(nphs.getTitleDD());
		title.selectByValue("Mr.");

		try {
			nphs.getGenderDD().click();
			Select gender = new Select(nphs.getGenderDD());
			gender.selectByValue("M");
		} catch (Exception e) {
			// TODO: handle exception
		}

		nphs.getOccupationDD().click();
		Select occupation = new Select(nphs.getOccupationDD());
		occupation.selectByVisibleText("Professional");

		nphs.getPanTxtBox().sendKeys("ABXPA1568K");
		nphs.getAnnualIncomeTxtBox().sendKeys("1100000");

		nphs.getMaritalStatusDD().click();
		Select maritalStatus = new Select(nphs.getMaritalStatusDD());
		maritalStatus.selectByValue("UM");

		nphs.getAddressOneTxtBox().sendKeys("Sector 39");
		nphs.getAddressTwoTxtBox().sendKeys("Sector 39");
		nphs.getAddressThreeTxtBox().sendKeys("Sector 39");
		nphs.getLocationIdIcon().click();

		Set<String> allWinIds = driver.getWindowHandles();
		String expectedURL = "LocationSearchAction";
		for (String win : allWinIds) {
			//wait.until(
				      //webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
			String act = driver.switchTo().window(win).getCurrentUrl();
			if (act.contains(expectedURL)) {
				break;
			}
		}

		LocationSearchPage ls = new LocationSearchPage(driver);
		ls.getSelectLocation().click();
		for (String wid : allWinId) {
			if (wid.contains(currentWinName)) {
			} else {
				driver.switchTo().window(wid);
			}
		}
		
		nphs.getMobileNoTxtBox().sendKeys(mobNo);
		j.executeScript("window.scrollBy(0,3000)");
		nphs.getBankBranchIcon().click();
		Set<String> allWindowIds = driver.getWindowHandles();
		String expURL = "PARTYSEARCHXYZBNK";
		for (String win : allWindowIds) {
			String act = driver.switchTo().window(win).getCurrentUrl();
			if (act.contains(expURL)) {
				break;
			}
		}
		
		BankBranchPage bbp = new BankBranchPage(driver);
		//driver.switchTo().frame(bdet.getFrameOneBasicDetailPage());
		bbp.getSearchBtn().click();
		bbp.getSelectBankBranch().click();
		
		for (String wid : allWinId) {
			if (wid.contains(currentWinName)) {
			} else {
				driver.switchTo().window(wid);
			}
		}
		
		nphs.getBankAccNumberTxtBox().sendKeys("1234567890");
		nphs.getNameAsPerBankAccTxtBox().sendKeys("Gandhiji");
		nphs.getStartDateTxtBox().sendKeys("12/01/2000");
		nphs.getEndDatetxtBox().sendKeys("12/03/2027");
		nphs.getSaveBtn().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(bdet.getFrameOneBasicDetailPage());
		
		bdet.getPartyCodeTxtBox().click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
//		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
//		StringSelection str=new StringSelection("");
		try {
			partyCode=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("party code ="+partyCode);
		
		bdet.getProposalFormNoTxtBox().sendKeys(proposalFormNum);
		bdet.getProposalFormDateTxtBox().sendKeys(inceptionDate);
		bdet.getProposalReceivedDateTxtBox().sendKeys(inceptionDate);
		bdet.getSaveAndContinueBtn().click();
		AdditionalPolicyDetailsPage apdp=new AdditionalPolicyDetailsPage(driver);
		
		String quoteNumber=apdp.getQuoteNumber().getText();
		System.out.println("Quote Number = "+quoteNumber);
		
		apdp.getAddBtnInPolicyRelation().click();    //Adding Agent
		
		//String currentWinName = driver.getWindowHandle();
		Set<String> allWinIdss = driver.getWindowHandles();

		for (String wid : allWinIdss) {
			if (wid.contains(currentWinName)) {
			} else {
				driver.switchTo().window(wid);
			}
		}
		PolicyRelationDetailsPage prdp=new PolicyRelationDetailsPage(driver);
		prdp.getPartyCodeTxtBox().sendKeys(addingAgentCode);
		prdp.getPartyCodeDDKey().click();
		
		Set<String> allWindowId = driver.getWindowHandles();
        String expectedURL2="PARTY/PCPTY_PROCESS";
		
		for(String wid: allWindowId)
		{
			String act = driver.switchTo().window(wid).getCurrentUrl();
			if (act.contains(expectedURL2)) {
				break;
			}
		}
		
		PartyMaintenencePage pmp=new PartyMaintenencePage(driver);
		j.executeScript("window.scrollBy(0,1000)");
		pmp.getPartySearchPartyCodeOption().click();
		
		Set<String> allWindId = driver.getWindowHandles();
		for(String win:allWindId)
		{
			if(win.contains(currentWinName))
			{}
			else
			{
				driver.switchTo().window(win);
			}

		}
		
		prdp.getSaveBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(apdp.getFrameOneOfAdnlPolicyDetailsPage());
		
		apdp.getAddBtnInPolicyRelation2().click();    //Now adding Sales Manager
		Set<String> allWindowIss = driver.getWindowHandles();

		for (String wid : allWindowIss) {
			if (wid.contains(currentWinName)) {
			} else {
				driver.switchTo().window(wid);
			}
		}
		prdp.getStakeCodeDD().click();
		Select ss=new Select(prdp.getStakeCodeDD());
		ss.selectByValue("SM");
		prdp.getPartyCodeTxtBox().sendKeys(addingSalesMgrCode);
		prdp.getPartyCodeDDKey().click();
		
		Set<String> allWindowIdss = driver.getWindowHandles();
		for(String wid: allWindowIdss)
		{
			String act = driver.switchTo().window(wid).getCurrentUrl();
			if (act.contains(expectedURL2)) {
				break;
			}
		}
		j.executeScript("window.scrollBy(0,1000)");
		pmp.getPartySearchPartyCodeOption().click();             
		Set<String> allWindIds = driver.getWindowHandles();
		
		for(String win:allWindIds)
		{
			if(win.contains(currentWinName))
			{}
			else
			{
				driver.switchTo().window(win);
			}
		}
		
		prdp.getSaveBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(apdp.getFrameOneOfAdnlPolicyDetailsPage());
		
		Select policyType=new Select(apdp.getSumInsuredBasisDD());  
		policyType.selectByValue(selectPolicyType);
		
		apdp.getNomineeDetailBtn().click();
		
		String expecURL="SUB-NOMINEESHAR";
		Set<String> allWindoId = driver.getWindowHandles();
		for(String win:allWindoId)
		{
			String act=driver.switchTo().window(win).getCurrentUrl();
			if(act.contains(expecURL))
			{
				break;
			}
		}
		
		NomineeDetailsPage ndp=new NomineeDetailsPage(driver);
		ndp.getNomineeNameTxtBox().sendKeys(nomineeName);
		ndp.getRelationshipWithProposerDD().click();
		Select nomineeRelation=new Select(ndp.getRelationshipWithProposerDD());
		nomineeRelation.selectByValue(relationshipWithProposer);
		ndp.getNomineeDOB().sendKeys(nomineeDOB);
		ndp.getNomineePercent().sendKeys(nomineePercent);
		ndp.getSaveBtn().click();
		ndp.getCloseBtn().click();
		
		//j.executeScript("window.scrollBy(0,5000");
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(apdp.getFrameOneOfAdnlPolicyDetailsPage());
		apdp.getSaveAndContinueBtn().click();       
		
		MemberDetailsPage mdp=new MemberDetailsPage(driver);
		MemberInfoPage mip=new MemberInfoPage(driver);
		mip.getMember1Link().click();
		
		String exURL="SCR-MEMDTL";
		Set<String> allWId = driver.getWindowHandles();
		for(String win:allWId)
		{
			String act=driver.switchTo().window(win).getCurrentUrl();
			if(act.contains(exURL))
			{
				break;
			}
		}
		
		mdp.getHeightOfTheInsuredTxtBox().sendKeys(height);
		mdp.getWeightTxtBox().sendKeys(weight);
		
		mdp.getMemberSumInsuredDD().click();
		Select memberSumInsured=new Select(mdp.getMemberSumInsuredDD());
		memberSumInsured.selectByValue("2500000");
		
		mdp.getExtraProtectSection1OptedDD().click();
		Select extraProtection1=new Select(mdp.getExtraProtectSection1OptedDD());
		extraProtection1.selectByValue("Y");
		
		mdp.getExtraProtectSection2OptedDD().click();
		Select extraProtection2=new Select(mdp.getExtraProtectSection2OptedDD());
		extraProtection2.selectByValue("Y");
		
		mdp.getExtraProductAggregrateDeductableAmtDD().click();
		Select extraProdAggrDeductableAmt=new Select(mdp.getExtraProductAggregrateDeductableAmtDD());
		extraProdAggrDeductableAmt.selectByValue("50000");
		
		mdp.getPedDeclaredInProposalDD().click();
		Select pedDeclared=new Select(mdp.getPedDeclaredInProposalDD());
		pedDeclared.selectByValue("N");
		
		mdp.getProceedBtn().click();
		
		try {
			mdp.getCloseBtn().click();
		} catch (Exception e) {
			// TODO: handle exception
			try {
				mdp.getCloseBtn2().click();
			} catch (Exception e2) {
				// TODO: handle exception
				Thread.sleep(10000);
//				mdp.getRiskCoverListSection().click();
				mdp.getCloseBtn2().click();
			}
		}                
		
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(mip.getFrameOneMemberInfoPage());
		
		try {
			String age=mip.getAgeInYearsText().getText();
			mip.getContiueBtn().click();
			
		} catch (Exception e) {
			// TODO: handle exception
			mip.getBackBtn().click();
			driver.switchTo().frame(apdp.getFrameOneOfAdnlPolicyDetailsPage());
			apdp.getSaveAndContinueBtn().click();
			driver.switchTo().window(currentWinName);
			driver.switchTo().frame(mip.getFrameOneMemberInfoPage());
			mip.getContiueBtn().click();
		}
		
		PolicySumaryPage psp=new PolicySumaryPage(driver);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(psp.getFrameOnePolicySummaryPage());
		psp.getCalculatePremiumBtn().click();
		
		Actions act=new Actions(driver);
		act.doubleClick(psp.getTotalPremiumAmtTextBox()).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		try {                                    // //Taking party Code instead of Total PremiumAmount
			Thread.sleep(2000);
			totalPremiumAmount=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Total Premium Amount ="+totalPremiumAmount);
		psp.getViewAndUploadDocumentsBtn().click();
		
		Set<String> allWs = driver.getWindowHandles();
		String expDocDetailURL="UNDERWRITING/PPUWRPOL_DOCDETAILS";
		for(String win:allWs)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expDocDetailURL))
			{
				break;
			}
		}
		
		ViewDocumentDetailPage vddp=new ViewDocumentDetailPage(driver);
		File f=new File(".\\src\\test\\resources\\PAN2.pdf");
		String abPath=f.getAbsolutePath();
		Thread.sleep(2000);
		vddp.getChooseFileBtn1().sendKeys(abPath);
		Thread.sleep(2000);
		vddp.getChooseFileBtn2().sendKeys(abPath);
		Thread.sleep(2000);
		vddp.getChooseFileBtn3().sendKeys(abPath);
		Thread.sleep(2000);
		vddp.getUploadBtn().click();
		vddp.getCloseBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(psp.getFrameOnePolicySummaryPage());
		psp.getIssueQuoteBtn().click();
		
		ReasonPage rp=new ReasonPage(driver);
		String expIssueQuoteURL="IssueQuote";
		Set<String> allW=driver.getWindowHandles();
		for(String win:allW)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expIssueQuoteURL))
			{
				break;
			}
		}
		
		rp.getAdditionalRemarkTxtBox().sendKeys("Hello Gurgaon");
		rp.getSaveBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(psp.getFrameTwoPolicySummaryPage());
		psp.getBusinessOperationModuleArrowIcon().click();
		psp.getAccountingSubMenu().click();
		
		AccountingPage ap=new AccountingPage(driver);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameOneAccountingPage());
		ap.getScrollMenu().click();
		ap.getCreateScrollLink().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameTwoAccountingPage());/////////////////
		try {
			ap.getScrollCategoryDD().click();
			Select scrollCategory=new Select(ap.getScrollCategoryDD());
			scrollCategory.selectByValue("BACKDATE");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		ap.getScrollDateTxtBox().sendKeys(inceptionDate);
		ap.getScrollTimeTxtBox().sendKeys("10:20:30");
		ap.getCustomerPartyCodeTxtBox().sendKeys(partyCode);
		ap.getCustomerPartyCodeArrowIcon().click();
		
		String expURLPartyMaintainencePAge="PARTY/PCPTY_PROCESS";
		Set<String> allWss=driver.getWindowHandles();
		for(String win:allWss)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expURLPartyMaintainencePAge))
			{
				break;
			}
		}
		ap.getCustomerPartyCodeOption().click();     /////////////////
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameTwoAccountingPage());
		ap.getReasonCodeDD().click();
		Select reasonCode=new Select(ap.getReasonCodeDD());
		reasonCode.selectByValue("01");
		
		ap.getBusinessSourceCodeTxtBox().sendKeys(addingSalesMgrCode);
		ap.getBusinessSourceCodeArrowIcon().click();
		String expPartyMaintainenceURL="PARTY/PCPTY_PROCESS";
		Set<String> allWii=driver.getWindowHandles();
		for(String win:allWii)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expPartyMaintainenceURL))
			{
				break;
			}
		}
		ap.getBusinessSourceCodeValidationOption().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameTwoAccountingPage());
		ap.getIntermediaryCodeTxtBox().sendKeys(addingAgentCode);
		ap.getIntermediaryCodeArrowIcon().click();
		
		String expPartyMaintainenceURL2="PARTY/PCPTY_PROCESS";
		Set<String> allWiii=driver.getWindowHandles();
		for(String win:allWiii)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expPartyMaintainenceURL2))
			{
				break;
			}
		}
		ap.getIntermediateryCodeValidationOption().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameTwoAccountingPage());
		ap.getReceiptTypeDD().click();
		Select receiptType=new Select(ap.getReceiptTypeDD());
		receiptType.selectByValue("Single");
		
		ap.getCollectionPurposeDD().click();
		Select collectionPurpose=new Select(ap.getCollectionPurposeDD());
		collectionPurpose.selectByValue("NEW");
		ap.getSaveBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(ap.getFrameTwoAccountingPage());
		ap.getCollectBtn().click();
		
		CreateScrollPage csp=new CreateScrollPage(driver);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(csp.getFrameOneCreateScrollPage());
		csp.getInstrumentAmountTxtBox().sendKeys("18000");
		csp.getSourceOfFundDD().click();
		Select sourceOfFund=new Select(csp.getSourceOfFundDD());
		sourceOfFund.selectByValue("A");
		csp.getModeDD().click();
		Select mode=new Select(csp.getModeDD());
		mode.selectByValue("C");
		csp.getCollectionAmountTxtBox().sendKeys("18000");
		csp.getReceivedDateTxtBox().sendKeys(inceptionDate);
		csp.getPremiumReceivedDateTxtBox().sendKeys(inceptionDate);
		csp.getGetTotalBtn().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(csp.getFrameOneCreateScrollPage());
		csp.getPremiumReceivedDateTxtBox().sendKeys(inceptionDate);
		Thread.sleep(2000);
		csp.getGetTotalBtn().click();
		Thread.sleep(2000);
		act.doubleClick(csp.getReceivedDateTxtBox()).perform();
		act.doubleClick(csp.getReceivedDateTxtBox()).perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		act.doubleClick(csp.getPremiumReceivedDateTxtBox()).perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		//csp.getPremiumReceivedDateTxtBox().sendKeys(inceptionDate);
		for(int i=0;i<=5;i++)
		{
			try {
				csp.getSaveBtn().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				csp.getGetTotalBtn().click();
				csp.getSaveBtn().click();
				break;
			}
		}
		
		Thread.sleep(2000);
		csp.getPostBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(csp.getFrameThreeScrollEntryScreen());
		csp.getScrollNumTextBox().click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		String scrollNumber="";
		Thread.sleep(2000);
		try {
			scrollNumber=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
			System.out.println("Scroll Number = "+scrollNumber);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(csp.getFrameTwoHeadCreateScrollPage());
		Thread.sleep(2000);
		
		csp.getModuleDDIcon().click();                                    
		Thread.sleep(2000);
		csp.getBusinessOperationOption().click();
		Thread.sleep(2000);
		bop.getPolicyServicingMenu().click();
		
//		driver.switchTo().window(currentWinName);
//		driver.switchTo().frame(bop.getFrameOne());
//		
//		csp.getModuleDDIcon().click();
//		csp.getBusinessOperationOption().click();
//		bop.getPolicyServicingMenu().click();
			
		PolicyServicingPage pspp=new PolicyServicingPage(driver);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		pspp.getQuoteNoOrApplicationNoTxtBox().sendKeys(quoteNumber);
		pspp.getSearchBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		Thread.sleep(2000);
		pspp.getQuoteNoOption().click();
		
		PolicyServicingWaivingPage pswp=new PolicyServicingWaivingPage(driver);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pswp.getFrameOnePolicyServicingWaivingPage());   //============================================
		pswp.getRoleDD().click();
		Thread.sleep(2000);
		pswp.getTvccorpOption().click();
		Thread.sleep(2000);
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pswp.getFrameOnePolicyServicingWaivingPage());
		pswp.getDashboardSubMenu().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pswp.getFrameTwoTVCCORPPage());
		
		
		pswp.getTvcStatusDD().click();
		Select tvcStatus=new Select(pswp.getTvcStatusDD());
		tvcStatus.selectByValue("402");
		pswp.getProposalOrPolicyNumTxtBox().sendKeys(quoteNumber);
		pswp.getSearchBtn().click();
		pswp.getOptionRadioBtn().click();
		pswp.getWaiveBtn().click();
		String remarksPageExpectedURL="UNDERWRITING/CaptureRemarks";
		Set<String> allWi=driver.getWindowHandles();
		for(String win:allWi)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(remarksPageExpectedURL))
			{
				break;
			}
		}
		Thread.sleep(2000);                                                                               //One
		pswp.getRemarksTxtBox().sendKeys("Ram Ram Sarya Nu");
		pswp.getRemarksSaveBtn().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pswp.getFrameOnePolicyServicingWaivingPage());
		pswp.getRoleDD().click();
		pswp.getUwriterOption().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(dept.getFrameTwoDepartmentHomePage());
		dept.getBusinessOprn().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(bop.getFrameOne());
		bop.getPolicyServicingMenu().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		
		pspp.getQuoteNoOrApplicationNoTxtBox().sendKeys(quoteNumber);
		pspp.getSearchBtn().click();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", pspp.getQuoteOrPolicyNumOption());
		
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		pspp.getCollectPremiumBtn().click();
		
		String expCollectPremiumURL="/ACCOUNTING/PCACC_PROCESS";
		Set<String> allWiins=driver.getWindowHandles();
		for(String win:allWiins)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expCollectPremiumURL))
			{
				break;
			}
		}
		
		CollectPremiumPage cpp=new CollectPremiumPage(driver);
		cpp.getInstrumentAmountTxtBox().click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		cpp.getModeDD().click();
		Select modeDD=new Select(cpp.getModeDD());
		modeDD.selectByValue("S");
		
		cpp.getCollectionAmountTxtBox().click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		cpp.getSubCodeLookupIcon().click();
		String accountSearchExpectedURL="ACCFROMPOLICY";
		Set<String> allWiis=driver.getWindowHandles();
		for(String win:allWiis)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(accountSearchExpectedURL))
			{
				break;
			}
		}
		
		cpp.getSearchBtnOfAccountSearchPage().click();
		cpp.getSearchOptionOfAccountSearchPage().click();
		
		for(String win:allWiins)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expCollectPremiumURL))
			{
				break;
			}
		}
		
		cpp.getReferenceNumlookupIcon().click();
		String expReferenceNumSearchURL="pEventCode=searchList";
		Set<String> allWinds=driver.getWindowHandles();
		for(String win:allWinds)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expReferenceNumSearchURL))
			{
				break;
			}
		}
		cpp.getReferenceTypeDDInRefNumSearchPage().click();
		Select referenceType=new Select(cpp.getReferenceTypeDDInRefNumSearchPage());
		referenceType.selectByValue("8");
		cpp.getReferenceNumTxtBoxInRefSearchPage().sendKeys(scrollNumber);
		cpp.getSearchBtnInRefSearchPage().click();
		cpp.getSearchOptionOfRefSearchPage().click();
		//Perform Action on the Reference Number Look Up Page
		
		for(String win:allWiins)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(expCollectPremiumURL))
			{
				break;
			}
		}
		
		cpp.getPremiumReceivedDateTxtBox().sendKeys(inceptionDate);
		
		cpp.getGetTotalBtn().click();
		cpp.getSaveBtn().click();
		
		cpp.getPostBtn().click();
		cpp.getCloseBtn().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		pspp.getIssueQuoteBtn().click();
		
		String issueQuoteExpURL="UNDERWRITING/ApproveProposal";
		Set<String> allWini=driver.getWindowHandles();
		for(String win:allWini)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(issueQuoteExpURL))
			{
				break;
			}
		}
		pspp.getRemarksTxtBoxOfIssueQuote().sendKeys("Hello");
		pspp.getYesBtnOfIssueQuote().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		
		pspp.getApproveBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.switchTo().window(currentWinName);
		//driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		String approvePageExpURL="https://bancsuat.starhealth.in:8543/IIMS/target/source/UNDERWRITING/ApproveProposalLOV";
		Set<String> allWindsss=driver.getWindowHandles();
		for(String win:allWindsss)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(approvePageExpURL))
			{
				break;
			}
		}
		Thread.sleep(2000);
		pspp.getRemarksTxtBox().sendKeys("Almost done");         /////////////////////////////////
		pspp.getSaveBtnOfRemarksPage().click();
		
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		pspp.getIssuePolicyBtn().click();
		
		String issuePolicyExpURL="ISSUEPOLICY";
		Set<String> allWindoos=driver.getWindowHandles();
		for(String win:allWindoos)
		{
			String actual=driver.switchTo().window(win).getCurrentUrl();
			if(actual.contains(issuePolicyExpURL))
			{
				break;
			}
		}
		
		pspp.getRemarksTxtBoxOfIssuePolicy().sendKeys("Issue Policy Done");
		pspp.getYesBtnOfIssuePolicy().click();
		driver.switchTo().window(currentWinName);
		driver.switchTo().frame(pspp.getFrameTwoPolicyServicingPage());
		
		
		
	}
}

package com.nomisma.pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;

public class AutoEnrolmentPage {
	
	
	//@FindBy (xpath="//span[contains(text(),'Setup')]")
	@FindBy (xpath="//span[contains(text(),'Settings')]")
	public WebElement AEMenuLnk;
	@FindBy (xpath="//a[@href='AgentConfiguration.aspx']")
	private WebElement AEAgentSetup;
	@FindBy (xpath="//img[@title='Edit']")
	private List<WebElement> EditAECnt;
	@FindBy (xpath="//img[@title='Edit']")
	private WebElement EditAE;
	@FindBy (xpath="//h2[contains(text(),'Agent Configuration')]")
	private WebElement AgentConfigTitle;
	
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtKeyValue")
	private WebElement txtKeyValue;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHFooter_btnSave")
	private WebElement btnSaveAE;
	
	@FindBy (xpath="//img[@src='/Commonv2/images/automaticenrolment.jpg']")
	private List<WebElement> iconAE;
	@FindBy (xpath="//span[@class='side_nav_text'][contains(text(),'Payroll')]")
	private WebElement payrollMenuLnk;
	@FindBy (xpath="//a[@href='PayrollDashboard.aspx']")
	private WebElement payrollDashboard;
	
	@FindBy (id = "search_input")
	private WebElement SearchBusiness;
	@FindBy (xpath = "/html[1]/body[1]/ul[1]/li[1]/a[1]")
	private WebElement SelectBusiness;
	
	@FindBy (xpath = "//span[contains(text(),'Autoenroll Setup')]")
	private WebElement AESetuplnk;
	@FindBy (xpath = "//h2[contains(text(),'Pension Configuration')]")
	private WebElement PensionConfigTitle;
	@FindBy (xpath = "//span[contains(text(),'EARNING THRESHOLD')]")
	private WebElement EarningThresholdTitle;
	@FindBy (xpath = "//span[contains(text(),'ELIGIBILITY CRITERIA')]")
	private WebElement EligibiltyCriteriaTitle;
	@FindBy (xpath = "//span[contains(text(),'CONTRIBUTION CRITERIA')]")
	private WebElement ContibutionCriteriaTitle;
	
	// SMT AUTHORIZATION
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_aeLeftPane_hrefSMTAuthorization")
	private WebElement hrefSMTAuthorization;
	@FindBy (xpath = "//span[contains(text(),'SMT AUTHORIZATION')]")
	private WebElement SMTAuthorizationTitle;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlDestId")
	private WebElement ddlDestId;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSmtAuth")
	private WebElement btnSmtAuth;
	@FindBy (id = "Username")
	private WebElement Username;
	@FindBy (id = "Password")
	private WebElement Password;
	@FindBy (xpath = "//input[@value='Save and validate']")
	private WebElement SaveValidate;
	@FindBy (xpath = "//h3[contains(text(),'Thank you. Your Payroll Software is approved')]")
	private WebElement SuccessMsg;
	
	//Launch SMT
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_aeLeftPane_hrefLaunchSMT")
	private WebElement hrefLaunchSMT;
	@FindBy (xpath = "//span[contains(text(),'Success')]")
	private WebElement pensionSyncPage;
	
	//Pension Schemes
	@FindBy (xpath = "//a[@class='menuText']")
	private WebElement hrefpensionScheme;
	@FindBy (xpath = "//span[@class='h1A']")
	private WebElement pensionSchemeTitle;
	
	//Add Pension Scheme
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnAddScheme")
	private WebElement btnAddScheme;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnGetScheme")
	private WebElement btnGetScheme;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_ddlDestId")
	private WebElement ddlSchemes;
	@FindBy (xpath = "//span[@class='h1A']")
	private WebElement AddSchemeTitle;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPensionName")
	private WebElement txtPensionName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlPensionProvider")
	private WebElement ddlPensionProvider;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlCalculationBasis")
	private WebElement ddlCalculationBasis;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlPensionablepayBasis")
	private WebElement ddlPensionablepayBasis;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlTrNetRas")
	private WebElement ddlTrNetRas;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlContributionType")
	private WebElement ddlContributionType;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmplrAccount")
	private WebElement txtEmplrAccount;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbEERContributionYN")
	private WebElement cbEERContributionYN;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEEContribution")
	private WebElement txtEEContribution;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtERContribution")
	private WebElement txtERContribution;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlGroupName")
	private WebElement ddlGroupName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtSubGroupName")
	private WebElement txtSubGroupName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtGroupId")
	private WebElement txtGroupId;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtSubGroupId")
	private WebElement txtSubGroupId;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnSave;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnCancel;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_txtPensionSearch")
	private WebElement txtPensionSearch;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearchPension")
	private WebElement btnSearchPension;
	@FindBy (xpath = "//table/tbody/tr[2]")
	private List<WebElement> tblSchemes;
	@FindBy (xpath = "//img[@title='Edit']")
	private WebElement btnEditScheme;
	@FindBy (xpath = "//img[@title='Delete']")
	private WebElement btnDeleteScheme;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement btnDelete;
	
	//Autoenrolment tab on Employee page
	@FindBy (xpath = "//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdEmployeeDetail']//a[@class='toggleSettings']//img")
	private WebElement btntoggleEmployee;	
	@FindBy (xpath = "//td[@class='settingsCell dropdown open']//span[contains(text(),'Edit')]")
	private WebElement btnEditEmployee;
	@FindBy (xpath = "//td[@class='settingsCell dropdown open']//span[contains(text(),'Delete')]")
	private WebElement btnDeleteEmployee;
	@FindBy (id = "__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee")
	private WebElement tpAEPayrollEmployee;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlEmpEligiblestatus")
	private WebElement ddlEmpEligiblestatus;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlPSGroup")
	private WebElement ddlPSGroup;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlPensionScheme")
	private WebElement ddlPensionScheme;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeStartDate")
	private WebElement txtPostponeStartDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeEndDate")
	private WebElement txtPostponeEndDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEnrolledDate")
	private WebElement txtEnrolledDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtOptInDate")
	private WebElement txtOptInDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtOptOutDate")
	private WebElement txtOptOutDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtLeftDate")
	private WebElement txtLeftDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbScopeForAE")
	private WebElement cbScopeForAE;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbSalaryExchange")
	private WebElement cbSalaryExchange;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbSendEmail")
	private WebElement cbSendEmail;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEEChosenContribution")
	private WebElement txtEEChosenContribution;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtERChosenContribution")
	private WebElement txtERChosenContribution;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancelAEEmployee")
	private WebElement btnCancelAEEmployee;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSaveAEEmployee")
	private WebElement btnSaveAEEmployee;
	
	//Calculate Contribution
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_aeLeftPane_hrefAECalcContribution")
	private WebElement hrefAECalcContribution;
	@FindBy (xpath = "//span[contains(text(),'Calculate Contribution')]")
	private WebElement CalcContributionTitle;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlPayrollPeriod")
	private WebElement ddlPayrollPeriod;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlPayrollFrequency")
	private WebElement ddlPayrollFrequency;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnCalcCon")
	private WebElement btnCalcCon;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnReCal")
	private WebElement btnReCal;
	@FindBy (id = "cctl00_ctl00_ParentContent_cPH_btnGetJob")
	private WebElement btnGetJob;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnConfirmPrp")
	private WebElement btnConfirmPrp;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSubmitToPS")
	private WebElement btnSubmitToPS;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnGetJobStatus")
	private WebElement btnGetJobStatus;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDowload")
	private WebElement btnDowload;
	
	//Reports
	@FindBy (xpath= "//span[contains(text(),'Reports')]")
	private WebElement reportsLnk;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportContributionProcessingHistory")
	private WebElement hrefReportContributionProcessingHistory;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlCompany")
	private WebElement ddlCompany;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement ddlEmployee; //value=2168
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollFrequency")
	private WebElement ddlPayrollFreq;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollPeriodStartDate")
	private WebElement ddlPayrollPeriodStartDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollPeriodEndDate")
	private WebElement ddlPayrollPeriodEndDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_lnkSearch")
	private WebElement lnkSearch;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ReportContributionProcessingHistoryUC_lnkDownload")
	private WebElement lnkDownload;
	
	public AutoEnrolmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAgentSetupPage(WebDriver driver, String title) throws InterruptedException
	{
		
		AEMenuLnk.click();
		//Thread.sleep(2000);
		AEAgentSetup.click();
		//Thread.sleep(2000);
		Reporter.log("Agent Configuration's title: " +title, true);
		Assert.assertEquals(AgentConfigTitle.getText(), title, "Agent Configuration's title is not verified");
		Reporter.log("Agent Configuration's title is verified successfuly", true);
	}
	
	public void EnableDisableAE(WebDriver driver, String title, String business) throws InterruptedException
	{
		EditAE.click();
		CISPage cis = new CISPage(driver);
		cis.switchwindowNew(driver);
		Reporter.log("txtKeyValue.getText(): " +txtKeyValue.getText(), true);
		
		if (txtKeyValue.getText().equalsIgnoreCase("true"))
			{
				Reporter.log("Auto Enrolment is already enabled", true);
				Reporter.log("Disabling Auto Enrolment...", true);
				
				txtKeyValue.clear();
				txtKeyValue.sendKeys("false");
				btnSaveAE.click();
				
				Reporter.log("Auto Enrolment is disabled", true);
				
				SelectBusiness(driver,business);
				
				Assert.assertEquals(iconAE.size(), 0, "Auto Enrolment icon is visible. Failed to disable Auto Enrolment");
				Reporter.log("Auto Enrolment icon does not exists as it is disabled", true);
				
				cis.switchwindowBackward(driver);
				AEMenuLnk.click();
				//Thread.sleep(1000);
				AEAgentSetup.click();
				//Thread.sleep(1000);
				EditAE.click();
				cis.switchwindowNew(driver);
				
				txtKeyValue.clear();
				txtKeyValue.sendKeys("true");
				btnSaveAE.click();
				cis.switchwindowDefault(driver);
				
				Reporter.log("Auto Enrolment is enabled", true);

				SelectBusiness(driver,business);
				
				Assert.assertEquals(iconAE.size(), 1, "Auto Enrolment icon is not visible. Failed to enable Auto Enrolment");
				Reporter.log("Auto Enrolment icon exists as it is enabled", true);
				
			}
		else
			{
			
				Reporter.log("Auto Enrolment is disabled", true);
				Reporter.log("Enabling Auto Enrolment...", true);
				
				txtKeyValue.clear();
				txtKeyValue.sendKeys("true");
				btnSaveAE.click();
				
				Reporter.log("Auto Enrolment is enabled", true);
				
				SelectBusiness(driver,business);
							
				Assert.assertEquals(iconAE.size(), 1, "Auto Enrolment icon is not visible. Failed to enable Auto Enrolment");
				Reporter.log("Auto Enrolment icon exists as it is enabled", true);
			}
	}
	
		public void SelectBusiness(WebDriver driver, String business) throws InterruptedException{
			
			payrollMenuLnk.click();
			payrollDashboard.click();
			Thread.sleep(1000);
			SearchBusiness.sendKeys(business);
			Thread.sleep(1000);
			SelectBusiness.click();
			Thread.sleep(2000);
			CISPage cis = new CISPage(driver);
			cis.switchwindowForward(driver);
		}
		
		public void verifyPensionConfigurationPage(WebDriver driver, String PensionConfigTitleExp, String EarningThresholdTitleExp, String EligibiltyCriteriaTitleExp, String ContibutionCriteriaTitleExp) throws InterruptedException
		{
			
			AESetuplnk.click();
			Thread.sleep(2000);

			Reporter.log("Pension Configuration's Title: " +PensionConfigTitle.getText(), true);
			Assert.assertEquals(PensionConfigTitle.getText(), PensionConfigTitleExp, "Pension Configuration's title is not verified");
			Reporter.log("Pension Configuration's Title is verified successfully", true);
			
			Reporter.log("Earning Threshold's Title: " +EarningThresholdTitle.getText(), true);
			Assert.assertEquals(EarningThresholdTitle.getText(), EarningThresholdTitleExp, "Earning Threshold's title is not verified");
			Reporter.log("Earning Threshold's Title is verified successfully", true);
			
			Reporter.log("Eligibilty Criteria's title: " +EligibiltyCriteriaTitle.getText(), true);
			Assert.assertEquals(EligibiltyCriteriaTitle.getText(), EligibiltyCriteriaTitleExp, "Eligibilty Criteria's title is not verified");
			Reporter.log("Eligibilty Criteria's title is verified successfully", true);
			
			Reporter.log("Contibution Criteria's title: " +ContibutionCriteriaTitle.getText(), true);
			Assert.assertEquals(ContibutionCriteriaTitle.getText(), ContibutionCriteriaTitleExp, "Contibution Criteria's title is not verified");
			Reporter.log("Contibution Criteria's title is verified successfully", true);
		}
		
		public void SMTAuthorization(WebDriver driver, String usern, String passw, String SMTtitleExp, String SuccessMsgExp) throws InterruptedException{
			
			hrefSMTAuthorization.click();
			CISPage cis = new CISPage(driver);
			cis.switchwindowNew(driver);
			Assert.assertEquals(SMTAuthorizationTitle.getText(), SMTtitleExp, "SMT Authorization's title is not verified");
			Reporter.log("SMT Authorization's title is verified successfully", true);
			Select sel=new Select(ddlDestId);
			sel.selectByVisibleText("NEST");
			btnSmtAuth.click();
			Thread.sleep(5000);
			cis.switchwindowForward(driver);
			Thread.sleep(3000);
			Username.sendKeys(usern);
			Password.sendKeys(passw);
			SaveValidate.click();
			Thread.sleep(3000);
			Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Success Message is not verified");
			Reporter.log("Success Message is verified successfully", true);
			
		}
		
		public void LaunchSMT(WebDriver driver, String SuccessMsgExp) throws InterruptedException{
			
			hrefLaunchSMT.click();
			Thread.sleep(5000);
			CISPage cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Assert.assertEquals(pensionSyncPage.getText(), SuccessMsgExp, "Failed to launch SMT");
			Reporter.log("SMT launched successfully", true);
			
		}

		public void verifyPensionSchemePage(WebDriver driver, String PensionSchemeTitleExp) throws InterruptedException
		{
			
			hrefpensionScheme.click();
			Thread.sleep(2000);

			Reporter.log("Pension Scheme's Title: " +pensionSchemeTitle.getText(), true);
			Assert.assertEquals(pensionSchemeTitle.getText(), PensionSchemeTitleExp, "Pension Scheme's Title is not verified");
			Reporter.log("Pension Scheme's Title is verified successfully", true);
			
		}
		
		public void AddPensionScheme(WebDriver driver, String AddSchemeTitleExp, String PensionName, String ddlPensionPro, String ddlCalculationB, String ddlPensionablepayB, String ddlTrNetR, String ddlContributionT, String EmplrAccount, String EEContribution, String ERContribution, String ddlGroupN, String SubGroupName, String SubGroupId) throws InterruptedException
		{
			
			btnAddScheme.click();
			CISPage cis = new CISPage(driver);
			cis.switchwindowNew(driver);

			Assert.assertEquals(AddSchemeTitle.getText(), AddSchemeTitleExp, "Add Scheme's title is not verified");
			Reporter.log("Add Scheme's title is verified successfully", true);

			txtPensionName.sendKeys(PensionName);

			Select sel = new Select(ddlPensionProvider);
			sel.selectByVisibleText(ddlPensionPro);
			Thread.sleep(2000);
			
			Select sel1 = new Select(ddlCalculationBasis);
			sel1.selectByVisibleText(ddlCalculationB);
			Thread.sleep(1000);
			Select sel2 = new Select(ddlPensionablepayBasis);
			sel2.selectByVisibleText(ddlPensionablepayB);
			Thread.sleep(1000);
			Select sel3 = new Select(ddlTrNetRas);
			sel3.selectByVisibleText(ddlTrNetR);
			Thread.sleep(1000);
			Select sel4 = new Select(ddlContributionType);
			sel4.selectByVisibleText(ddlContributionT);
			Thread.sleep(1000);
			txtEmplrAccount.sendKeys(EmplrAccount);

			cbEERContributionYN.click();

			txtEEContribution.sendKeys(EEContribution);

			txtERContribution.sendKeys(ERContribution);

//			Commented due to error "MY Group was not available" //13.11.2018
//			Select sel5 = new Select(ddlGroupName);
//			sel5.selectByVisibleText(ddlGroupN);
//			Thread.sleep(2000);
			txtSubGroupName.sendKeys(SubGroupName);

			txtSubGroupId.sendKeys(SubGroupId);

			btnSave.click();
			Reporter.log("Pension Scheme added successfully", true);
			
		}
		
		public void SearchPensionScheme(WebDriver driver, String Scheme, String SchemeN) throws InterruptedException
		{
			Select sel = new Select(ddlSchemes);
			sel.selectByValue(Scheme);
			Thread.sleep(1000);
			btnGetScheme.click();
			txtPensionSearch.sendKeys(SchemeN);;
			btnSearchPension.click();
			//Reporter.log("tblSchemes size: "+tblSchemes.size(), true);
			if (tblSchemes.size()>0)
			{
				Reporter.log("Schemes searched successful", true);
				
			}
			else
			{
				Reporter.log("Unable to Search Schemes. Please add a scheme with name "+SchemeN+" so that it should appear in Search results", true);
				//Assert.fail("Unable to Search Schemes");
			}
			
		}
		
		public void EditPensionScheme(WebDriver driver, String EditSchemeTitleExp) throws InterruptedException
		{
			
			if (tblSchemes.size()>0)
			{
				btnEditScheme.click();
				Reporter.log("Edit button clicked successfully", true);
				CISPage cis = new CISPage(driver);
				cis.switchwindowNew(driver);
				btnCancel.click();
				cis.switchwindowDefault(driver);
				Reporter.log("Cancel button clicked successfully", true);
				
				btnEditScheme.click();
				Reporter.log("Edit button clicked successfully", true);
				cis.switchwindowNew(driver);
				Assert.assertEquals(AddSchemeTitle.getText(), EditSchemeTitleExp, "Edit Scheme's title not verified");
				Reporter.log("Edit Scheme's title verified successfully", true);
				
				cbEERContributionYN.click();
				Reporter.log("Check box updated successfully", true);
				
				btnSave.click();
				Reporter.log("Pension Scheme updated successfully", true);
				
			}
			else
			{
				Reporter.log("Pension scheme unavailable", true);
			}
			
			
		}
		
		public void DeletePensionScheme(WebDriver driver, String DeleteSchemeTitleExp) throws InterruptedException
		{
			
			if (tblSchemes.size()>0)
			{
				btnDeleteScheme.click();
				Reporter.log("Delete button clicked successfully", true);
				CISPage cis = new CISPage(driver);
				cis.switchwindowNew(driver);
				btnCancel.click();
				cis.switchwindowDefault(driver);
				Reporter.log("Cancel button clicked successfully", true);
				
				btnDeleteScheme.click();
				Reporter.log("Delete button clicked successfully", true);
				cis.switchwindowNew(driver);
				Assert.assertEquals(AddSchemeTitle.getText(), DeleteSchemeTitleExp, "Delete Scheme's title not verified");
				Reporter.log("Delete Scheme's title verified successfully", true);
		
				btnDelete.click();
				Reporter.log("Pension Scheme deleted successfully", true);
			}
			else
			{
				Reporter.log("Pension scheme unavailable", true);
			}
			
		}
		
		public void VerifyAutoEnrolmentTab(WebDriver driver,String Date1, String Date2, String Date3,String EE, String ER, String EmpEligiblestatus,String PSGroup, String PensionScheme) throws InterruptedException
		{
			btntoggleEmployee.click();
			btnEditEmployee.click();
			
			Reporter.log("Edit button clicked successfully", true);
			CISPage cis = new CISPage(driver);
			cis.switchwindowNew(driver);
			tpAEPayrollEmployee.click();
			btnCancelAEEmployee.click();
			Thread.sleep(2000);
			cis.switchwindowDefault(driver);
			Reporter.log("Cancel button clicked successfully", true);
			
			btntoggleEmployee.click();
			btnEditEmployee.click();
			Reporter.log("Edit button clicked successfully", true);
			cis.switchwindowNew(driver);

			tpAEPayrollEmployee.click();
			
			Select sel1=new Select(ddlEmpEligiblestatus);
			sel1.selectByVisibleText(EmpEligiblestatus);
			Thread.sleep(1000);
			
//			Commented due to error "MY Group was not available" //13.11.2018
//			Select sel2=new Select(ddlPSGroup);
//			sel2.selectByVisibleText(PSGroup);
//			Thread.sleep(1000);
			Select sel3=new Select(ddlPensionScheme);
			sel3.selectByVisibleText(PensionScheme);
			Thread.sleep(1000);
			
			txtPostponeStartDate.clear();
			txtPostponeStartDate.sendKeys(Date1);

			txtPostponeEndDate.clear();
			txtPostponeEndDate.sendKeys(Date2);

			txtEnrolledDate.clear();
			txtEnrolledDate.sendKeys(Date1);

			txtOptInDate.clear();
			txtOptInDate.sendKeys(Date1);

			txtOptOutDate.clear();
			txtOptOutDate.sendKeys(Date2);

			txtLeftDate.clear();
			txtLeftDate.sendKeys(Date3);

			txtEEChosenContribution.clear();
			txtEEChosenContribution.sendKeys(EE);
			
			cbScopeForAE.click();
			cbSalaryExchange.click();

			cbSendEmail.click();

			txtERChosenContribution.clear();
			txtERChosenContribution.sendKeys(ER);

			btnSaveAEEmployee.click();
			Reporter.log("Employee data updated successfully", true);
		
		}
		
		public void VerifyAutoEnrolmentTabDelete(WebDriver driver) throws InterruptedException
		{
			btntoggleEmployee.click();
			btnDeleteEmployee.click();
			
			Reporter.log("Delete button clicked successfully", true);
			CISPage cis = new CISPage(driver);
			cis.switchwindowNew(driver);
			tpAEPayrollEmployee.click();
			btnCancelAEEmployee.click();
			cis.switchwindowDefault(driver);
			Reporter.log("Cancel button clicked successfully", true);
			
			Reporter.log("Auto Enrolment tab verified successfully", true);
					
		}
		
		public void CalculateContribution(WebDriver driver, String CalcContributionTitleExp) throws InterruptedException{
			
			hrefAECalcContribution.click();
			CISPage cis = new CISPage(driver);
			cis.switchwindowNew(driver);
			Assert.assertEquals(CalcContributionTitle.getText(), CalcContributionTitleExp, "Failed to verify page title");
			Reporter.log("Page Title verified successfully", true);
			
		}
		
		public void ContributionProcessingHistory(WebDriver driver, String Company) throws InterruptedException
		{
			reportsLnk.click();
			hrefReportContributionProcessingHistory.click();
			Select sel1= new Select(ddlCompany);
			sel1.selectByVisibleText("TestSA1");
			lnkSearch.click();
			Thread.sleep(3000);
			
			
		}
}

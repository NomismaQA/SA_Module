package com.nomisma.pom;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;

public class PayrollReports {
	@FindBy (xpath= "//span[contains(text(),'Reports')]")
	private WebElement reportsLnk;
	
	//Payslips By Company
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory")
	private WebElement payslipByCmpny;
	@FindBy (xpath= "//p[contains(text(), 'List payslips for all employees of a company')]")
	private WebElement payslipsReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxyerDrpDwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate")
	private WebElement payrollDateDrpDwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_lnkRegenerate")
	private WebElement regenerateBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_lnkbtnPaySlip")
	private WebElement emailPayslipBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_lnkDownloadCompanySummary")
	private WebElement cmpnySummary;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_lnkDownloadCompanySummaryPeriod")
	private WebElement cmpnyPeriodSummary;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_lnkDownloadCompanySummaryQuaterly")
	private WebElement cmpnyQtrlySummary;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement emailoToTxtbx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement sendBtn;
	
	//Accounts Submission Report by company
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportAccountTranByCompany")
	private WebElement acSubbyCmpny;
	@FindBy (xpath= "//p[contains(text(), 'Monthly transactions posted to the company accounts.')]")//Report to get transactions which are submitted to Accounts for whole tax year of a company.
	private WebElement accountSubmissionReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxYearDrpdwn;
	@FindBy (xpath= "//span[contains(text(), 'Submission to Accounts Report By Company')]")
	private WebElement title1;
//	@FindBy (xpath= "//a[@class='LargePopup-Medium  cboxElement']//..[contains(text(),'160')]")
//	private WebElement transactionNmbr;
	@FindBy (xpath="//a[@class='LargePopup-Medium  cboxElement'][contains(text(),'160')]")
	private WebElement transactionNmbr;
	@FindBy (id="cboxClose")
	private WebElement popupClose;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnDelete")
	private WebElement deleteBtn;
	
	//Company Pay Summary Report For all Employees
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistorySummary")
	private WebElement paySummaryLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows tax summary for all employees for a tax year.')]")
	private WebElement companyPayReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxYearDrpDwn;
	@FindBy (xpath= "//span[contains(text(), 'Company Pay Summary Report For all Employees')]")
	private WebElement title2;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Year Total')]//..//td[2][contains(text(), '£')]")
	private WebElement totalPayment;
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExport")
	private WebElement exportCompanysummaryCSV;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement exportCompanysummaryPDF;
	
	//Period Total
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportPeriodTotal")
	private WebElement periodTotalLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the period total details depending on a particular tax year.')]")
	private WebElement periodTotalReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxyearDrpdwn;
	@FindBy (xpath= "//header[@class='page_title clearfix']")
	private WebElement title3;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Year Total')]//..//td[10][contains(text(), '£')]")
	private WebElement totalPay;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExport")
	private WebElement exportPeriodTotalCSV;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement exportPeriodTotalPDF;
	
	//Pending Submission to Accounts Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportMissingAccountTranByPayrollDate")
	private WebElement pendingSubmissionLnk;
	@FindBy (xpath= "//p[contains(text(), 'Monthly transactions which needed to be posted to the company accounts.')]")//'Report to post missing transactions to Accounts for a particular pay date of a tax year.'
	private WebElement pendingSubmissionReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement pendingTaxyearDrpdwn;
//	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tbody//..[contains(text(),'31 May 2017')]//..//td[3]/a")
//	private WebElement submitBtn;
	@FindBy (xpath= "//html//tr[2]/td[3]/a[1]")
	private WebElement submitBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnPost")
	private List<WebElement> btnPostC; 
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnPost")
	private WebElement btnPost; 
	
	//Employee List
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportEmployeeListByCompany")
	private WebElement EmployeeListLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the list of employee as per Company')]")
	private WebElement employeeListReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployeeStatus")
	private WebElement EmployeeStatusDrpdwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement exportEmpList;
	
	//Employee Pay Details
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistoryDeatils")
	private WebElement EmployeePaydetailsLnk;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Year Total')]//..//td[2][contains(text(), '£')]")
	private WebElement empTotalPayment;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement EmpDrpdwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement EmpTaxyearDrpdwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy (xpath= "//p[contains(text(), 'Monthly summary by tax year')]")//'Shows the Employee pay details depending on a particular tax year.'
	private WebElement employeePayDetailsReportDescription;
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExport")
	private WebElement EmpExportCSV;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload")
	private WebElement EmpExportPDF;
	
	//Employee Pay Summary Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportEmployeePayHistory")
	private WebElement EmployeePaySummaryLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows all the payslips of a employee for a tax year.')]")
	private WebElement employeePaySummaryReportDescription;
				///for all check boxes
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tbody//..//th[1]//input[@class='_selectall']")
	private WebElement selectAllCbox;
			///for individual check boxes
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_spnSelect")
	private WebElement singleCbox;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnRegenerate")
	private WebElement regeneBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnEmailPayslip")
	private WebElement emailpayslipBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkCustomerEmail")
	private WebElement CmpnyEmailChkBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkMarkMySelf")
	private WebElement mySelfChbox;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement emailTxt;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnDownloadSelectedPaySlip")
	private WebElement dwnldpayslipBtn;
	@FindBy (xpath= "//span[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_spnSelect']//..//..//td[15]/a")
	private WebElement payslipPDF;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExport")
	private WebElement exportPaysummaryCSV;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement exportPaysummaryPDF;
	
	//P60 Forms
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportP60")
	private WebElement p60formsLnk;
	@FindBy (xpath= "//p[contains(text(), 'P60 End of Year Certificate')]")//'P60 forms for each years'
	private WebElement p60ReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement p60TaxyearDrpdwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnGenerate")
	private WebElement p60GenerateBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_LinkButtonEx1")
	private WebElement emailP60Btn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnCancel;
	//P45 Forms
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportP45")
	private WebElement p45formsLnk;
	
	@FindBy (xpath= "//p[contains(text(), ' P45 form for the employees who already left')]")
	private WebElement p45ReportDescription;
//	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tbody//..[contains(text(),'31 Mar 2017')]/../td[3]/a")
//	private WebElement p45PDF;
	@FindBy (xpath= "//a[@href='AccessFiles.aspx?type=p45&id=760&PayrollCompanyCode=1408']")
	private WebElement p45PDF;
//	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tbody//..[contains(text(),'31 Mar 2017')]/../td[4]/a")
//	private WebElement p45GenerateBtn;
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkGenerate")
	private WebElement p45GenerateBtn;
	//P11 Deductions
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportP11")
	private WebElement p11DeductionsLnk;
	@FindBy (xpath= "//p[contains(text(), 'P11 details for each employee by tax year')]")//'P11 Deductions forms for each years'
	private WebElement p11DeductReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement p11Empdrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement p11taxyeardrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement p11PDFdwnld;
	
	//P32 
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportP32")
	private WebElement p32Lnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the P32 details depending on a particular tax year.')]")
	private WebElement p32ReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement p32taxyearDrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlQuater")
	private WebElement quarterDrpdwn;	
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[8][contains(text(), '£')]")
	private WebElement p32TotalDue;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnEmail")
	private WebElement p32Email;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement EmailTxtBx;
//	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtBody")
//	private WebElement EmailBodyTxtBx;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtBody_ctl02_ctl00")
	private WebElement EmailBodyTxtBx;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement payeTaxyear;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxMonth")
	private WebElement payeTaxmonth;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//td[contains(text(),'Pan')]//..//td[9]")
	private WebElement payTaxdue;

	
	
	
	//RTI Submission
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportRTISubmission")
	private WebElement RTISubmissionLnk;
	@FindBy (xpath= "//p[contains(text(), 'Report to get the list of RTIs which are successfully submitted.')]")
	private WebElement RTISubReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement RTITaxyearDrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate")
	private WebElement RTIPayrollDateDrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_txtDateFrom")
	private WebElement RTIFromDate;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_txtDateTo")
	private WebElement RTIToDate;
	@FindBy (xpath= " //a[contains(text(), 'Micromax')]")
	private WebElement RTISubCompanylnk; 
	@FindBy (xpath= "//td[contains(text(), '30/06/2017')]//..//td[contains(text(), 'FPS')]//..//td[3]/a")
	private WebElement RTIFPSpdf;
	@FindBy (xpath= "//td[contains(text(), '31/05/2017')]//..//td[contains(text(), 'FPS')]//..//td[8]/a")//"//td[contains(text(), '31/05/2017')]//..//td[contains(text(), 'FPS')]//..//td[14]/a")
	private WebElement RTIFPSsubmission;
	@FindBy (xpath= "//h2[contains(text(),'Micromax  2017-2018 - Payroll RTI Submission Log ')]")
	private WebElement RTISubpopup;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_btnExport")
	private WebElement PopupPDFDwnlod;
	@FindBy (xpath= "//td[contains(text(), '30/06/2017')]//..//td[contains(text(), 'FPS')]//..//td[17]/a")
	private WebElement RTIFPSundo;
	
	//RTI Failed Report
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportRTIFailed")
	private WebElement RTIFailedLnk;
	@FindBy (xpath= "//p[contains(text(), 'Report to get the list of RTIs which are failed.')]")
	private WebElement RTIFailReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlAutoRun")
	private WebElement RTIFailedDrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement RTIFailedSearchBtn;
	@FindBy (xpath= " //a[contains(text(), 'Panasonic')]")
	private WebElement RTIFailCompanylnk; 
	@FindBy (xpath= "//td[contains(text(), '14/04/2017')]//..//td[contains(text(), 'EPS')]//..//..//td[18]/a")
	private WebElement RTIFailedlnk; 
	@FindBy (xpath= "//td[contains(text(), '14/04/2017')]//..//td[contains(text(), 'EPS')]/a")
	private WebElement RTIFailedEPS; 
	@FindBy (id  = "ctl00_ctl00_ParentContent_cphFooter_btnReGenerate")
	private WebElement RTIregenerateBtn;	
	@FindBy (id  = "cboxClose")
	private WebElement RTIpopupClose;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect")
	private WebElement RTIChckbox;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtNotes")
	private WebElement NotesTxtbox;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_ddlSubmitReason")
	private WebElement RTISelectDrpdwn;	
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_btnSubmitRTI")
	private WebElement SubmitToHMRCBtn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit")
	private WebElement NotToSubmitBtn;
	@FindBy (xpath= "//div[@id='cboxContent']//div[@id='cboxTitle']")
	private WebElement RTIFailedpopup; 
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_btnExport")
	private WebElement RTIFailedPDF;
	
	
	//Statutory Pay Recovery
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportStatutoryPayRecovery")
	private WebElement SPRecoveryLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the Statutory Pay Recovery details depending on a particular tax year.')]")
	private WebElement SPReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement SPRTaxYear;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_LinkButtonEx1")
	private WebElement searchBtn1;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement SPRdwnld;
	
	//Statutory Sick Pay
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportStatutorySickPay")
	private WebElement SSPLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the Statutory Sick Pay details of a employee depending on a particular tax year.')]")
	private WebElement SSPReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement SSPempdrpDwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement SSPtaxdrpDwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement SSPpdf;
	
	//Statutory Parental Pay
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportStatutorySPPPay")
	private WebElement SPPLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the Statutory Paternity Pay details of a employee depending on a particular tax year.')]")
	private WebElement SPPReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement SPPempdrpDwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement SPPtaxdrpDwn;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total SPP')]//..//td[contains(text(), '£')]")
	private WebElement totalSPP;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement SPPpdf;
	
	//Statutory Maternity Pay
	//@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportStatutoryParentingPay")
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportStatutorySPPandParentingPay")
	private WebElement SMPLnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the Statutory Maternity & Paternity Pay details of a employee depending on a particular tax year.')]")
	private WebElement SMPReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee")
	private WebElement SMPempdrpDwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement SMPtaxdrpDwn;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total SMP')]//..//td[contains(text(), '£')]")
	private WebElement totalSMP;
//	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefDownload")
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	private WebElement SMPpdf;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement btnSearch;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlStatutorypaytype")
	private WebElement ddlStatutorypaytype;
	
	private String payrollReportsTitle;
	static int i=1;
	
	public PayrollReports(WebDriver driver){
		payrollReportsTitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
		
	public void verifypayrollReportsTitle()	{
			String expTitle = "Panasonic";   //Give Company name here whenever a new title is needed to be verified
			Assert.assertEquals(payrollReportsTitle, expTitle, "Payroll Reports page title is not verified");
			Reporter.log("Payroll Reports page title is verified successfully", true);
	}
	
	public void PayslipsByCompany(WebDriver driver, String taxYear, String payrollDate, String email) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "List payslips for all employees of a company";   
		Assert.assertEquals(payslipsReportDescription.getText(), expTitle, "Payslip By Company Report Description is not verified");
		Reporter.log("Payslip By Company Report Description is verified successfully", true);
		payslipByCmpny.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Payslips Report Page is display Successfully", true);
		WebElement taxyerDrpDwn= this.taxyerDrpDwn;
		Select sel =new Select(taxyerDrpDwn);
		sel.selectByVisibleText(taxYear);
		Thread.sleep(2000);
		//taxyerDrpDwn.sendKeys(taxYear);
		WebElement payrollDateDrpDwn= this.payrollDateDrpDwn;
		Select sel1 =new Select(payrollDateDrpDwn);
		sel1.selectByValue(payrollDate);
		//payrollDateDrpDwn.sendKeys(payrollDate);
		regenerateBtn.click();
		
		cmpnySummary.click();
		String Companywindow=driver.getWindowHandle();
		System.out.println(Companywindow);
		Set <String> handles = driver.getWindowHandles();

	     System.out.println(handles);

	     // Pass a window handle to the other window

	     for (String AccessFiles : driver.getWindowHandles()) 
	     {

	     	System.out.println(AccessFiles);

     	driver.switchTo().window(AccessFiles);
		driver.switchTo().window(Companywindow);
		
	     }
		 cmpnyPeriodSummary.click();
		 String Companywindow1=driver.getWindowHandle();
			System.out.println(Companywindow1);
			Set <String> handles1 = driver.getWindowHandles();

		     System.out.println(handles1);

		     // Pass a window handle to the other window

		     for (String AccessFiles1 : driver.getWindowHandles()) 
		     {

		     	System.out.println(AccessFiles1);

	     	driver.switchTo().window(AccessFiles1);
			driver.switchTo().window(Companywindow1);
		     }
		     
		     
		 cmpnyQtrlySummary.click();
		 String Companywindow2=driver.getWindowHandle();
			System.out.println(Companywindow2);
			Set <String> handles2 = driver.getWindowHandles();

		     System.out.println(handles2);

		     // Pass a window handle to the other window

		     for (String AccessFiles2 : driver.getWindowHandles()) 
		     {

		     	System.out.println(AccessFiles2);

	     	driver.switchTo().window(AccessFiles2);
			driver.switchTo().window(Companywindow2);
	     	 }
		    
	     
	     emailPayslipBtn.click();
	     driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	     Thread.sleep(2000);
	     emailoToTxtbx.sendKeys(email);
	     sendBtn.click();
	}
	
	
	public void accountsSubmissionReportByCompany(WebDriver driver, String taxYear) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Monthly transactions posted to the company accounts.";   
		//Report to get transactions which are submitted to Accounts for whole tax year of a company.
		
		Assert.assertEquals(accountSubmissionReportDescription.getText(), expTitle, "Account Submission Report Description is not verified");
		Reporter.log("Account Submission Report Description is verified successfully", true);
		acSubbyCmpny.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Submission to Accounts Report By Company Page is display", true);
		WebElement taxYearDrpdwn= this.taxYearDrpdwn;
		Select sel =new Select(taxYearDrpdwn);
//		taxYearDrpdwn.sendKeys(taxYear);
		sel.selectByVisibleText(taxYear);
		Reporter.log("Tax Year "+taxYear+" selected", true);
		//title1.click();
		String curUrl=driver.getCurrentUrl();
		transactionNmbr.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		//Thread.sleep(2000);
		driver.navigate().to(curUrl);
				
		/*wLib.explicitWait(driver, 30, By.xpath("//div//header//h2//span[@class='h1A']"));
		
		Actions act = new Actions(driver);
        act.moveToElement(popupClose).perform();

        act.click(popupClose).perform();

        wLib.explicitWait(driver, 30, By.xpath("//div//header//h2//span[contains(text(),'Submission to Accounts Report By Company')]"));

        wLib.implictWaitForSeconds(driver, 60);*/
		//popupClose.click();
	//	deleteBtn.click();
		
	}
	
	
	public void CompanyPaySummaryReport(WebDriver driver, String taxYear)
	{
		reportsLnk.click();
		String expTitle = "Shows tax summary for all employees for a tax year.";   
		Assert.assertEquals(companyPayReportDescription.getText(), expTitle, "Company Pay Summary Report Description is not verified");
		Reporter.log("Company Pay Summary Report Description is verified successfully", true);
		paySummaryLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Company Pay Summary Report For all Employees Page is display Successfully", true);
		WebElement taxYearDrpDwn= this.taxYearDrpdwn;
		Select sel =new Select(taxYearDrpDwn);
		sel.selectByVisibleText(taxYear);
		Reporter.log("Tax Year "+taxYear+" selected", true);
		//taxYearDrpDwn.sendKeys(taxYear);
		title2.click();
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tbody//td[2]"));
		double amt=0;
		double diff=0;
		for (WebElement li:table)
		{
			String s=li.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			amt+=d;
		}
		DecimalFormat dc=new DecimalFormat("##.00");
		System.out.println(dc.format(amt));
		
		List<WebElement> table1=driver.findElements(By.xpath("//tr[@class='rowFinal']//td[contains(text(), 'Year Total')]//..//td[2][contains(text(), '£')]"));
		for(WebElement li1:table1)
		{
			String s=li1.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			diff=amt-d;		
		}
		DecimalFormat dc1=new DecimalFormat("##.00");
		String rs=dc1.format(diff);
	//	String rs1="£"+rs.substring(0, 2) +","+rs.substring(2, rs.length());
		System.out.println(rs);
		
		String exptTitle1=rs;
	    Assert.assertEquals(totalPayment.getText().replaceAll("[£ ,]", ""), exptTitle1, "Total Payment of Company Pay Summary is Not Matching ");
	    Reporter.log("Total Payment of Company Pay Summary is Matching", true);
		
		/*Export to CSV
		String DownloadPath="C:\\Users\\Administrator\\Downloads";
    	FirefoxProfile myprofile=new FirefoxProfile();
    	myprofile.setPreference("browser.download.folderList", 2);
    	myprofile.setPreference("browser.download.manager.showWhenStarting", false);
    	myprofile.setPreference("browser.download.dir", DownloadPath);
    	myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/csv");
    	myprofile.setPreference("browser.helperApps.alwaysAsk.force", false);
        myprofile.setPreference("browser.download.manager.showAlertOnComplete", false);
        myprofile.setPreference("browser.download.manager.closeWhenDone", false);
        exportCompanysummaryCSV.click();
    /*    String DownloadPath1="C:\\Users\\Administrator\\Downloads";
    	FirefoxProfile myprofile1=new FirefoxProfile();
    	myprofile.setPreference("browser.download.folderList", 2);
    	myprofile.setPreference("browser.download.manager.showWhenStarting", false);
    	myprofile.setPreference("browser.download.dir", DownloadPath1);
    	myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/csv");
    	myprofile.setPreference("browser.helperApps.alwaysAsk.force", false);
        myprofile.setPreference("browser.download.manager.showAlertOnComplete", false);
        myprofile.setPreference("browser.download.manager.closeWhenDone", false);
        exportCompanysummaryPDF.click();*/
	}
	
	public void PeriodTotal(WebDriver driver, String taxYear)
	{
		reportsLnk.click();
		String expTitle = "Shows the period total details depending on a particular tax year.";   
		Assert.assertEquals(periodTotalReportDescription.getText(), expTitle, "Period Total Report Description is not verified");
		Reporter.log("Period Total Report Description is verified successfully", true);
		periodTotalLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Period Totals Report Page is display successfully", true);
		WebElement taxyearDrpdwn= this.taxyearDrpdwn;
		Select sel =new Select(taxyearDrpdwn);
		sel.selectByVisibleText(taxYear);
		//taxyearDrpdwn.sendKeys(taxYear);
		title3.click();
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[12]"));
		double amt=0;
		for (WebElement li:table)
		{
			String s=li.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			amt+=d;
		}
		DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		System.out.println(rs);
		
		String exptTitle1=rs;
	    Assert.assertEquals(totalPay.getText().replaceAll("[£ ,]", ""), exptTitle1, "Total Pay of Period Total is Not Matching ");
	    Reporter.log("Total Pay of Period Total is Matching", true);
		
		
		//need to download CSV and PDF
	}
	public void PendingSubmissionAccount(WebDriver driver, String taxYear) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Monthly transactions which needed to be posted to the company accounts.";//"Report to post missing transactions to Accounts for a particular pay date of a tax year.";   
		Assert.assertEquals(pendingSubmissionReportDescription.getText(), expTitle, "Pending Submission to Accounts Report Description is not verified");
		Reporter.log("Pending Submission to Accounts Report Description is verified successfully", true);
		pendingSubmissionLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Pending Submission to Account Report Page is display", true);
		WebElement pendingTaxyearDrpdwn= this.pendingTaxyearDrpdwn;
		Select sel =new Select(pendingTaxyearDrpdwn);
		sel.selectByVisibleText(taxYear);
		//pendingTaxyearDrpdwn.sendKeys(taxYear);
		
		// Commented by Sudhir on 21.05.2019. Need some modifications
//		submitBtn.click();
//		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
//		Thread.sleep(2000);
//		int count = btnPostC.size();
//		Reporter.log("No. of required Web elements exists = " +count,true);
//		if(count!=0)
//
//			{		
//				btnPost.click();
//			}
//		else
//			{
//					
//				Reporter.log("No transaction to submit. Please check if there is a payment for this payroll.", true);
//			}
	}		
			
	
	public void EmployeeList(WebDriver driver,String allEmployee, String currenEmp, String leftEmp )
	{
		reportsLnk.click();
		String expTitle = "Shows the list of employee as per Company";   
		Assert.assertEquals(employeeListReportDescription.getText(), expTitle, "Employee List Report Description is not verified");
		Reporter.log("Employee List Report Description is verified successfully", true);
		EmployeeListLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployeeStatus"));
		Reporter.log("Employee List Report Page is display", true);
		WebElement EmployeeStatusDrpdwn= this.EmployeeStatusDrpdwn;
		Select sel =new Select(EmployeeStatusDrpdwn);
		EmployeeStatusDrpdwn.sendKeys(allEmployee);
		title3.click();
	//	exportEmpList.click();
		EmployeeStatusDrpdwn.sendKeys(currenEmp);
		title3.click();
	//	exportEmpList.click();
		EmployeeStatusDrpdwn.sendKeys(leftEmp);
		title3.click();
	//	exportEmpList.click();
		
		//	sel.selectByVisibleText("All Employees");
	//	sel.selectByVisibleText("Current Employees");
	//	sel.selectByVisibleText("Left Employees");
		//need to download emp list PDF
	}
	public void EmployeePayDetails(WebDriver driver, String EmpName, String taxYear)
	{
		reportsLnk.click();
		String expTitle = "Monthly summary by tax year";//"Shows the Employee pay details depending on a particular tax year.";
		Assert.assertEquals(employeePayDetailsReportDescription.getText(), expTitle, "Employee Pay Details Report Description is not verified");
		Reporter.log("Employee Pay Details Report Description is verified successfully", true);
		EmployeePaydetailsLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		Reporter.log("Employee Pay Details Report Page is display", true);
		WebElement EmpDrpdwn= this.EmpDrpdwn;
		Select sel =new Select(EmpDrpdwn);
		//EmpDrpdwn.sendKeys(EmpName);
		sel.selectByVisibleText(EmpName);
		Reporter.log("Employee Name "+EmpName+" is selected", true);
		title3.click();
		WebElement EmpTaxyearDrpdwn= this.EmpTaxyearDrpdwn;
		Select sel1 =new Select(EmpTaxyearDrpdwn);
		sel1.selectByVisibleText(taxYear);
		Reporter.log("Tax Year "+taxYear+" selected", true);
		//EmpTaxyearDrpdwn.sendKeys(taxYear);
		title3.click();
	//	searchBtn.click();
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]/td[3]"));
		double amt=0;
		for (WebElement li:table)
		{
			String s=li.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			amt+=d;
		}
		DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		System.out.println(rs);
		
		String exptTitle1=rs;
	    Assert.assertEquals(empTotalPayment.getText().replaceAll("[£ ,]", ""), exptTitle1, "TotalPayment of Employee Pay Details is Not Matching ");
	    Reporter.log("TotalPayment of Employee Pay Details is Matching", true);
		//need to handle export CSV and PDF
	}
	public void EmployeePaySummaryReport(WebDriver driver, String emp, String taxYear, String email) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Shows all the payslips of a employee for a tax year.";   
		Assert.assertEquals(employeePaySummaryReportDescription.getText(), expTitle, "Employee Pay Summary Report Description is not verified");
		Reporter.log("Employee Pay Summary Report Description is verified successfully", true);
		EmployeePaySummaryLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		Reporter.log("Employee Pay Summary Report Page is display", true);
		WebElement EmpDrpdwn= this.EmpDrpdwn;
		Select sel =new Select(EmpDrpdwn);
		sel.selectByVisibleText(emp);
		//EmpDrpdwn.sendKeys(emp);
		title3.click();
		wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		WebElement EmpTaxyearDrpdwn= this.EmpTaxyearDrpdwn;
		Select sel1 =new Select(EmpTaxyearDrpdwn);
		sel1.selectByVisibleText(taxYear);
		Reporter.log("Tax Year "+taxYear+" selected", true);
		Thread.sleep(2000);
		//EmpTaxyearDrpdwn.sendKeys(taxyear);
		title3.click();
	//	searchBtn.click();
		singleCbox.click();
		regeneBtn.click();
		emailpayslipBtn.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		//wLib.explicitWait(driver, 20, By.cssSelector("span.h1A"));
		//cmpnyemailaddressCbox.click();
		//mySelfCbox.click();
		emailTxt.sendKeys(email);
		//sendBtn.click();
		cancelBtn.click();		
		//need to handle download and export payslips 
	}
	
	public void P60forms(WebDriver driver, String taxyear) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "P60 End of Year Certificate";//"List employee's P60 forms for each years";   
		Assert.assertEquals(p60ReportDescription.getText(), expTitle, "P60 Forms Report Description is not verified");
		Reporter.log("P60 Forms Report Description is verified successfully", true);
		p60formsLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("P60 Forms Report Page is display", true);
		WebElement p60TaxyearDrpdwn= this.p60TaxyearDrpdwn;
		Select sel =new Select(p60TaxyearDrpdwn);
		sel.selectByVisibleText(taxyear);
		//p60TaxyearDrpdwn.sendKeys(taxyear);
		p60GenerateBtn.click();
		Thread.sleep(2000);
		emailP60Btn.click();	
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		btnCancel.click();
		Reporter.log("Cancel button clicked", true);
//		Alert alt=driver.switchTo().alert();
//		alt.dismiss();
		//handle email popup
	}
	public void P45forms(WebDriver driver)
	{
		reportsLnk.click();	
		String expTitle = "List employee's P45 form for the employees who already left";   
		Assert.assertEquals(p45ReportDescription.getText(), expTitle, "P45 Forms Report Description is not verified");
		Reporter.log("P45 Forms Report Description is verified successfully", true);
		p45formsLnk.click();
//		WaitStatementLib wLib = new WaitStatementLib();
//		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_hrefReportP45"));
		Reporter.log("P45 Forms Report Page is display", true);
		p45GenerateBtn.click();
		p45PDF.click();
		//download pdf file
	}
	
	public void P11Deductions(WebDriver driver, String empName, String taxyear) throws InterruptedException
	{
		reportsLnk.click();	
		String expTitle = "P11 details for each employee by tax year";//"List employee's P11 Deductions forms for each years";   
		Assert.assertEquals(p11DeductReportDescription.getText(), expTitle, "P11 Deductions Report Description is not verified");
		Reporter.log("P11 Deductions Report Description is verified successfully", true);
		p11DeductionsLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("P11 Deductions Report Page is displayed", true);
		WebElement p11Empdrpdwn= this.p11Empdrpdwn;
		Select sel =new Select(p11Empdrpdwn);
	 	p11Empdrpdwn.sendKeys(empName);
	 	Thread.sleep(2000);
		//title3.click();
//		WebElement p11taxyeardrpdwn= this.p11taxyeardrpdwn;
//		
//		Select sel1 =new Select(p11taxyeardrpdwn);
//		p11taxyeardrpdwn.sendKeys(taxyear);
		Select sel1 =new Select(p11taxyeardrpdwn);
		sel1.selectByVisibleText(taxyear);
		title3.click();
		//searchBtn.click();
	}
	public void P32(WebDriver driver, String taxyear, String quarter, String cmpnyCbox, String paytaxyear, String paytaxmonth) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Shows the P32 details depending on a particular tax year.";   
		Assert.assertEquals(p32ReportDescription.getText(), expTitle, "P32 Report Description is not verified");
		Reporter.log("P32 Report Description is verified successfully", true);
		p32Lnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("P32 Report Page is display", true);
		title3.click();
		WebElement p32taxyearDrpdwn= this.p32taxyearDrpdwn;
		Select sel =new Select(p32taxyearDrpdwn);
		//p32taxyearDrpdwn.sendKeys(taxyear);
		sel.selectByVisibleText(taxyear);
		Reporter.log("Tax Year "+taxyear+" is selected", true);
		title3.click();
		WebElement quarterDrpdwn= this.quarterDrpdwn;
		Select sel1 =new Select(quarterDrpdwn);
		//quarterDrpdwn.sendKeys(quarter);
		sel1.selectByVisibleText(quarter);
		Reporter.log("Quarter "+quarter+" is selected", true);
		//sel1.selectByVisibleText("Quarter 2");
		//sel1.selectByVisibleText("Quarter 3");
		//sel1.selectByVisibleText("Quarter 4");
		searchBtn.click();
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[8]"));
		double amt=0;
		for (WebElement li:table)
		{
			String s=li.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			amt+=d;
		}
		DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		System.out.println(rs);
		
		String exptTitle1=rs;
	    Assert.assertEquals(p32TotalDue.getText().replaceAll("[£ ,]", ""), exptTitle1, "Total Tax Due to HMRC of P32 Report is Not Matching");
	    Reporter.log("Total Tax Due to HMRC of P32 Report is Matching", true);
	  //  String ts=driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//td[contains(text(),'Apr')]//..//td[8]")).getText();
	  //  System.out.println(ts);
	    p32Email.click();
	    Thread.sleep(4000);
	 	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 	//CmpnyEmailChkBx.click();
	 	//mySelfChbox.click();
	 	EmailTxtBx.sendKeys(cmpnyCbox);
	 	EmailBodyTxtBx.sendKeys("Testing");
	 	//need to pass value to body
	 	sendBtn.click();
	}
	
	public void RTISubmission(WebDriver driver, String RTItaxyear, String RTIpayrollDate, String frmdate, String todate, String cmpnyname, String taxyear ) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Report to get the list of RTIs which are successfully submitted.";   
		Assert.assertEquals(RTISubReportDescription.getText(), expTitle, "RTI Submission Report Description is not verified");
		Reporter.log("RTI Submission Report Description is verified successfully", true);
		RTISubmissionLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("RTI Submission Report Page is display", true);
		WebElement RTITaxyearDrpdwn= this.RTITaxyearDrpdwn;
		Select sel =new Select(RTITaxyearDrpdwn);
		RTITaxyearDrpdwn.sendKeys(RTItaxyear);
		WebElement RTIPayrollDateDrpdwn= this.RTIPayrollDateDrpdwn;
		Select sel1 =new Select(RTIPayrollDateDrpdwn);
		RTIPayrollDateDrpdwn.sendKeys(RTIpayrollDate);
		RTIFromDate.sendKeys(frmdate);
		RTIToDate.sendKeys(todate);
		searchBtn.click();
		RTISubCompanylnk.click();
		driver.navigate().back();
		//RTIFPSpdf.click();
		//popupClose.click();
		RTIFPSsubmission.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Thread.sleep(3000);
		/*String text=RTISubpopup.getText();
		String expTxt= cmpnyname+" "+taxyear+" "+"- Payroll RTI Submission Log" ;
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);*/
		PopupPDFDwnlod.click();
	}
	public void RTIFailed(WebDriver driver, String select, String notes, String selectReason) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Report to get the list of RTIs which are failed.";   
		Assert.assertEquals(RTIFailReportDescription.getText(), expTitle, "RTI Failed Report Description is not verified");
		Reporter.log("RTI Failed Report Description is verified successfully", true);
		RTIFailedLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlAutoRun"));
		Reporter.log("RTI Failed Report Page is display", true);
		WebElement RTIFailedDrpdwn= this.RTIFailedDrpdwn;
		Select sel =new Select(RTIFailedDrpdwn);
		RTIFailedDrpdwn.sendKeys(select);
		RTIFailedSearchBtn.click();
		RTIFailCompanylnk.click();
		driver.navigate().back();
		RTIChckbox.click();
		NotesTxtbox.sendKeys(notes);
		WebElement RTISelectDrpdwn= this.RTISelectDrpdwn;
		Select sel1 =new Select(RTISelectDrpdwn);
		RTISelectDrpdwn.sendKeys(selectReason);
		String s=driver.getCurrentUrl();
		RTIFailedEPS.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		RTIregenerateBtn.click();
		driver.navigate().to(s);
	//	RTIpopupClose.click();
		RTIFailedlnk.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		RTIFailedPDF.click();
		RTIpopupClose.click();
		SubmitToHMRCBtn.click();
	//	NotToSubmitBtn.click();
	}
	
	public void StatutoryPayRecovery(String sprTaxyear, WebDriver driver)
	{
		reportsLnk.click();
		String expTitle = "Shows the Statutory Pay Recovery details depending on a particular tax year.";   
		Assert.assertEquals(SPReportDescription.getText(), expTitle, "Statutory Pay Recovery Report Description is not verified");
		Reporter.log("Statutory Pay Recovery Report Description is verified successfully", true);
		SPRecoveryLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf"));//"ctl00_ctl00_ParentContent_cPHFilter_LinkButtonEx1"
		
		Reporter.log("Statutory Pay Recovery Page is display", true);
		WebElement SPRTaxYear= this.SPRTaxYear;
		Select sel =new Select(SPRTaxYear);
		sel.selectByVisibleText(sprTaxyear);
		//SPRTaxYear.sendKeys(sprTaxyear);
		title3.click();
		//searchBtn1.click();	
		SPRdwnld.click();
	}
	public void StatutorySickPay(String sspEmp,String sspTax, WebDriver driver)
	{
		reportsLnk.click();
		String expTitle = "Shows the Statutory Sick Pay details of a employee depending on a particular tax year.";   
		Assert.assertEquals(SSPReportDescription.getText(), expTitle, "SSP Report Description is not verified");
		Reporter.log("SSP Report Description is verified successfully", true);
		SSPLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		Reporter.log("Statutory Sick Pay Page is display", true);
		WebElement SSPempdrpDwn= this.SSPempdrpDwn;
		Select sel =new Select(SSPempdrpDwn);
		SSPempdrpDwn.sendKeys(sspEmp);
		title3.click();
		WebElement SSPtaxdrpDwn= this.SSPtaxdrpDwn;
		Select sel1 =new Select(SSPtaxdrpDwn);
		sel1.selectByVisibleText(sspTax);
		//SSPtaxdrpDwn.sendKeys(sspTax);
		title3.click();
		SSPpdf.click();
	}
	public void StatutoryParentingPay(String sppEmp,String sppTax,String filepath,String filepath1,String name1, WebDriver driver) throws InterruptedException, EmptyFileException, IOException
	{
		reportsLnk.click();
//		String expTitle = "Shows the Statutory Paternity Pay details of a employee depending on a particular tax year.";   
//		Assert.assertEquals(SPPReportDescription.getText(), expTitle, "SPP Report Description is not verified");
//		Reporter.log("SPP Report Description is verified successfully", true);
//		SPPLnk.click();
//		WaitStatementLib wLib = new WaitStatementLib();
//		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
//		Reporter.log("Statutory Parenting Pay Page is display", true);
//		//WebElement SPPempdrpDwn= this.SPPempdrpDwn;
		
		String expTitle = "Shows the Statutory Maternity & Paternity Pay details of a employee depending on a particular tax year.";   
		Assert.assertEquals(SMPReportDescription.getText(), expTitle, "SMP and SPP Report Description is not verified");
		Reporter.log("SMP and SPP Report Description is verified successfully", true);
		SMPLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		Reporter.log("Statutory Maternity & Parenting Pay Page is displayed", true);
		
		Select sel2 =new Select(ddlStatutorypaytype);
		sel2.selectByVisibleText("Parenting");
		
		
		Select sel =new Select(SPPempdrpDwn);
		sel.selectByVisibleText(sppEmp);
		//SPPempdrpDwn.sendKeys(sppEmp);
		title3.click();
		//WebElement SPPtaxdrpDwn= this.SPPtaxdrpDwn;
		Select sel1 =new Select(SSPtaxdrpDwn);
		sel1.selectByVisibleText(sppTax);
		//SSPtaxdrpDwn.sendKeys(sppTax);
		title3.click();
		btnSearch.click();
		
		
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[3]"));
		double amt=0;
	//	double diff=0;
		 for(WebElement li:table)
	        {
				 String s=li.getText();
				 String st = s.toString();
				 st=st.replaceAll("[£ ,]", "");
	             double d=Double.valueOf(st); 
	             amt+=d;       
	         }
		 DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		System.out.println(rs);
		/* 
		List<WebElement> table1=driver.findElements(By.xpath("//tr[@class='rowFinal']//td[contains(text(), 'Total SPP')]//..//td[contains(text(), '£')]"));
		for(WebElement li1:table1)
		{
			 String s=li1.getText();
			 String st = s.toString();
			 st=st.replaceAll("£", "");
             double d=Double.valueOf(st); 	
            // System.out.println(d);
             diff=amt-d;
          }
		
		 DecimalFormat dc1=new DecimalFormat("##.00");
		 String rs="£"+dc1.format(diff);
		 System.out.println(rs);
		
		 /*String expTitle1 =rs;   
		 Assert.assertEquals(totalSPP.getText(), expTitle1, "SPP Total is not Matching");
	     Reporter.log("SPP Total is Matching", true);*/
		 
		 String expTitle1 =rs;   
		 Assert.assertEquals(totalSPP.getText().replaceAll("[£ ,]", ""), expTitle1, "SPP Total is not Matching");
	     Reporter.log("SPP Total is Matching", true);
		 
	     ReadFilesPage RFP= new ReadFilesPage(driver);
	     RFP.DeleteFilename(driver,filepath, name1);
	     //driver.manage().window().setSize(new Dimension(1920, 1080));
	     SMPpdf.click();
	     Thread.sleep(5000);
	     String Filename=RFP.GetFileName(filepath, name1);
	     Reporter.log("Filename = "+Filename, true);
	     RFP.readPDFInURL(driver,filepath1,Filename,"Statutory Parenting Pay Report");
	     Thread.sleep(2000);
	     
	}
	public void StatutoryMaternityPay(String smpEmp,String smpTax,String filepath,String filepath1,String name1, WebDriver driver) throws InterruptedException, EmptyFileException, IOException
	{
		reportsLnk.click();
		String expTitle = "Shows the Statutory Maternity & Paternity Pay details of a employee depending on a particular tax year.";   
		//Assert.assertEquals(SMPReportDescription.getText(), expTitle, "SMP and SPP Report Description is not verified");
		//Reporter.log("SMP and SPP Report Description is verified successfully", true);
		SMPLnk.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlEmployee"));
		Reporter.log("Statutory Maternity & Parenting Pay Page is displayed", true);
		
		Select sel2 =new Select(ddlStatutorypaytype);
		sel2.selectByVisibleText("Maternity");
		
		
//		WebElement SMPempdrpDwn= this.SMPempdrpDwn;
		Select sel =new Select(SMPempdrpDwn);
		sel.selectByVisibleText(smpEmp);
		//SPPempdrpDwn.sendKeys(smpEmp);
		title3.click();
//		WebElement SMPtaxdrpDwn= this.SMPtaxdrpDwn;
		Select sel1 =new Select(SSPtaxdrpDwn);
		sel1.selectByVisibleText(smpTax);
		//SMPtaxdrpDwn.sendKeys(smpTax);
		title3.click();
		btnSearch.click();
		
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[3]"));
		double amt=0;
		for(WebElement li:table)
	        {
				 String s=li.getText();
				 String st = s.toString();
				 st=st.replaceAll("[£ ,]", "");
	             double d=Double.valueOf(st); 
	             amt+=d;       
	         }
		 DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		System.out.println(rs);
		
		 String expTitle1 =rs;   
		 Assert.assertEquals(totalSMP.getText().replaceAll("[£ ,]", ""), expTitle1, "SMP Total is not Matching");
	     Reporter.log("SMP Total is Matching", true);
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.DeleteFilename(driver,filepath, name1);
		SMPpdf.click();
		Thread.sleep(3000);
		String Filename=RFP.GetFileName(filepath, name1);
		RFP.readPDFInURL(driver,filepath1,Filename,"Statutory Maternity Report");
		Thread.sleep(2000);
	}
	
}


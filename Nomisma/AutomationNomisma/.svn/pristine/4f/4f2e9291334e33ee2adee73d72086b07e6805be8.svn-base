package com.nomisma.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import java.io.File;
import com.nomisma.generic.WaitStatementLib;
import com.relevantcodes.extentreports.LogStatus;

public class PayrollPage2 {
	
	@FindBy (xpath= "//span[contains(text(),'Reports')]")
	private WebElement reportsLnk;
	@FindBy (xpath= "//header[@class='page_title clearfix']")
	private WebElement title3;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement sendBtn;		
	
	//P32 
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_hrefReportP32")
	public WebElement p32Lnk;
	@FindBy (xpath= "//p[contains(text(), 'Shows the P32 details depending on a particular tax year.')]")
	private WebElement p32ReportDescription;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement p32taxyearDrpdwn;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlQuater")
	private WebElement quarterDrpdwn;	
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[2][contains(text(), '£')]")
	private WebElement p32TotalEmployeeNi;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[3][contains(text(), '£')]")
	private WebElement p32TotalEmployerNi;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[4][contains(text(), '£')]")
	private WebElement p32TotalStudentLoanRepay;
	
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[5][contains(text(), '£')]")
	private WebElement P32TotalNIStatutoryPayFunding;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[6][contains(text(), '£')]")
	private WebElement P32TotalTaxRefundFunding;
	
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[7][contains(text(), '£')]")
	private WebElement P32TotalStatutoryPayRec;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[8][contains(text(), '£')]")
	private WebElement P32TotalPrevYearOverPay;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[9][contains(text(), '£')]")
	private WebElement P32TotalTax;
	@FindBy (xpath= "//tr[@class='rowFinal']//td[contains(text(), 'Total')]//..//td[10][contains(text(), '£')]")
	private WebElement p32TotalDue;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cpHeaderRight_btnEmail")
	private WebElement p32Email;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement EmailTxtBx;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPH_txtBody_ctl02_ctl00")
	private WebElement EmailBodyTxtBx;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement payeTaxyear;
	@FindBy (id  = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxMonth")
	private WebElement payeTaxmonth;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//td[contains(text(),'Pan')]//..//td[9]")
	private WebElement payTaxdue;

	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[2]")
	private List<WebElement> table2;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[3]")
	private List<WebElement> table3;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[4]")
	private List<WebElement> table4;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[5]")
	private List<WebElement> table5;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[6]")
	private List<WebElement> table6;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[7]")
	private List<WebElement> table7;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[8]")
	private List<WebElement> table8;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[9]")
	private List<WebElement> table9;
		@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position() < last()]//td[10]")
	private List<WebElement> table10;
	
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[2]//td[position()+13 > last()]")
	private List<WebElement> row2;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[3]//td[position()+13 > last()]")
	private List<WebElement> row3;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[4]//td[position()+13 > last()]")
	private List<WebElement> row4;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[5]//td[position()+13 > last()]")
	private List<WebElement> row5;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[6]//td[position()+13 > last()]")
	private List<WebElement> row6;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[7]//td[position()+13 > last()]")
	private List<WebElement> row7;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[8]//td[position()+13 > last()]")
	private List<WebElement> row8;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[9]//td[position()+13 > last()]")
	private List<WebElement> row9;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[10]//td[position()+13 > last()]")
	private List<WebElement> row10;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[11]//td[position()+13 > last()]")
	private List<WebElement> row11;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[12]//td[position()+13 > last()]")
	private List<WebElement> row12;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[13]//td[position()+13 > last()]")
	private List<WebElement> row13;
	
	
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[2]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC2;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[3]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC3;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[4]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC4;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[5]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC5;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[6]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC6;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[7]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC7;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[8]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC8;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[9]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC9;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[10]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC10;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[11]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC11;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[12]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC12;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[13]//td[position()+1 > last()]")
	private WebElement TotalTaxDueToHMRC13;

	private String CommTotalSPR= "Total Statutory Pay Recovery = ";
	private String SumSPR="Total Statutory Pay Recovery (Sum) = ";
	private String ErrorMsgSPR= "Total Statutory Pay Recovery of P32 Report is Not Matching";
	private String SuccessMsgSPR= "Total Statutory Pay Recovery of P32 Report is Matching";
	
	private String CommTotalEmployeeNi= "Total Employee NI = ";
	private String SumEmployeeNi="Total Employee NI (Sum) = ";
	private String ErrorMsgEmployeeNi= "Total Employee NI of P32 Report is Not Matching";
	private String SuccessMsgEmployeeNi= "Total Employee NI of P32 Report is Matching";
	
	private String CommTotalEmployerNi= "Total Employer NI = ";
	private String SumEmployerNi="Total Employer NI (Sum) = ";
	private String ErrorMsgEmployerNi= "Total Employer NI of P32 Report is Not Matching";
	private String SuccessMsgEmployerNi= "Total Employer NI of P32 Report is Matching";
	
	private String CommTotalSLR= "Total Student Loan Repay = ";
	private String SumSLR= "Total Student Loan Repay (Sum) = ";
	private String ErrorMsgSLR= "Total Student Loan Repay of P32 Report is Not Matching";
	private String SuccessMsgSLR= "Total Student Loan Repay of P32 Report is Matching";
	
	private String CommNISPF= "NI Statutory Pay Funding = ";
	private String SumNISPF="NI Statutory Pay Funding (Sum) = ";
	private String ErrorMsgNISPF= "Total Statutory Pay Recovery of P32 Report is Not Matching";
	private String SuccessMsgNISPF= "Total Statutory Pay Recovery of P32 Report is Matching";
	
	private String CommTRF= "Tax Refund Funding = ";
	private String SumTRF="Tax Refund Funding (Sum) = ";
	private String ErrorMsgTRF= "Total Statutory Pay Recovery of P32 Report is Not Matching";
	private String SuccessMsgTRF= "Total Statutory Pay Recovery of P32 Report is Matching";
	
	private String CommTotalPYO= "Total Previous Year Overpayment = ";
	private String SumPYO= "Total Previous Year Overpayment (Sum) = ";
	private String ErrorMsgPYO= "Total Previous Year Overpayment of P32 Report is Not Matching";
	private String SuccessMsgPYO= "Total Previous Year Overpayment of P32 Report is Matching";
	
	private String CommTotalTax= "Total Tax = ";
	private String SumTax= "Total Tax (Sum) = ";
	private String ErrorMsgTax= "Total Tax of P32 Report is Not Matching";
	private String SuccessMsgTax= "Total Tax of P32 Report is Matching";	
	
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'-£1,847.55')]")
	private WebElement P32TaxToHMRCApril;
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'£3,655.10')]")
	private WebElement P32TaxToHMRCMay;
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'-£2,283.12')]")
	private WebElement P32TaxToHMRCJune;
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnExportToPdf")
	public WebElement pdflnk;
	
	//ImportEmployee
	@FindBy (css= "#payrollMenu > a")
	private WebElement lnkPayroll;
	@FindBy (id= "ctl00_ctl00_ParentContent_SideMenu1_menueImportEmp")
	private WebElement lnkImpEmp;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_FileUpload1")
	private WebElement btnBrowse;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_btnUpload")
	private WebElement btnUpload;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_btnMapping")
	private WebElement btnNext;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_btnImport")
	private WebElement btnImport;
	@FindBy (css= "b")
	private WebElement successMsg;
	private String successMsgTxt= "1 Employees from CSV Imported Successfully.";
	@FindBy (xpath= "//table/tbody/tr")
	public List<WebElement> cntTablerows;
	@FindBy (css= "#ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren > li > a")
	private WebElement payrollDashboard;
//	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext")
//	public List<WebElement> PayrollPageNextCnt;
//	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext")
//	public WebElement PayrollPageNext;
//	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl00_lnkPrev")
//	public List<WebElement> PayrollPagePrevCnt;
//	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl00_lnkPrev")
//	public WebElement PayrollPagePrev;
	
	//Undo Payroll
	@FindBy (xpath="//div[@class='green_heading_smallB']")
    private WebElement payDate;
	@FindBy (xpath = "//span[contains(text(), 'Click here to UNDO last payroll run')]")
	private WebElement undoPayroll;
	@FindBy (xpath="//div[@class='pay_date_text']//h3[contains(text(),'Pay Date')]")
	private WebElement showPayDate;
	private String endUndoPayDate = "23 Apr 2020";
	private String endUndoPayDate1 = "31 May 2020";
	
	//Run Payroll
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll")
	private WebElement runPayrollBttn;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline")
	private WebElement runPayroll;
	private String endPayDate = "23 Jul 2020";
	private String endPayDate1 = "31 Jul 2020";
	
	//Paye Liabilty Report
	@FindBy (id = "ctl00_ctl00_ParentContent_SideMenu1_hrefReports")
	public WebElement lnkReports;
	@FindBy (xpath = "//a[contains(text(),'PAYE and NI Liability Report')]")
	public WebElement rptPayeeLiablity;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxyerDrpDwn;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxMonth")
	private WebElement ddlMonth;
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'-£6,500.00')]")
	private WebElement payeeBFApril;
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'-£1,847.55')]")
	private WebElement payeeBFMay;
	@FindBy (xpath = "//td[@class='text-left'][contains(text(),'DirectorTableMethod')]//..//td[@class='text-center'][contains(text(),'-£5,000.00')]")
	private WebElement payeeBFJune;
	
	//Payslips By Company
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportCompanyPayHistory")
	private WebElement payslipByCmpny;
	@FindBy (xpath= "//p[contains(text(), 'List payslips for all employees of a company')]")
	private WebElement payslipsReportDescription;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement taxyerDrpDwn1;
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
	private WebElement sendBtn1;
	
	//Recurring Addition/Deduction
	@FindBy (id= "ctl00_ctl00_ParentContent_cpHeaderRight_hrefRecurringAdditionDeduction")
	public WebElement lnkRecAddDed;
	@FindBy (id= "chAllRTI")
	private WebElement chkAllRTI;
	@FindBy (id= "S-ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ltAdditionAccount")
	private WebElement ddlAdd;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtDescription")
	private WebElement txtDesc;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtAmount")
	private WebElement txtAmt;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ddlTaxable")
	private WebElement ddlGrossNet;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ddlPayrollFrequencyCode")
	private WebElement ddlPayFrequency;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtPeriodApplyFrom")
	private WebElement txtApplyFrom;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtPeriodApplyTo")
	private WebElement txtApplyTo;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_chkDelete")
	private WebElement chkAddDelete;
	
	@FindBy (id= "S-ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_ltAdditionAccount")
	private WebElement ddlAdd1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_txtDescription")
	private WebElement txtDesc1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_txtAmount")
	private WebElement txtAmt1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_ddlTaxable")
	private WebElement ddlGrossNet1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_ddlPayrollFrequencyCode")
	private WebElement ddlPayFrequency1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_txtPeriodApplyFrom")
	private WebElement txtApplyFrom1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_txtPeriodApplyTo")
	private WebElement txtApplyTo1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl01_chkDelete")
	private WebElement chkAddDelete1;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_lnkAddMoreAddition")
	private WebElement lnkAddMoreAddition;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_lnkBtnAdditionDelete")
	private WebElement btnAddDelete;
	
	@FindBy (id= "chAllRTI1")
	private WebElement chkAllRTI1;
//	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_ddlAllowance")
//	private WebElement ddlDed;
	
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_ddlAllowance")
	private WebElement ddlDed;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_txtDescription")
	private WebElement txtDedDesc;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_txtAmount")
	private WebElement txtDedAmt;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_ddlTaxable")
	private WebElement ddlDedGrossNet;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_ddlPayrollFrequencyCode")
	private WebElement ddlDedPayFrequency;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_txtPeriodApplyFrom")
	private WebElement txtDedApplyFrom;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_txtPeriodApplyTo")
	private WebElement txtDedApplyTo;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl00_chkDelete")
	private WebElement chkDedDelete;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_lnkAddMoreDeduction")
	private WebElement lnkAddMoreDeduction;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_ddlAllowance")
	private WebElement ddlDed1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_txtDescription")
	private WebElement txtDedDesc1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_txtAmount")
	private WebElement txtDedAmt1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_ddlTaxable")
	private WebElement ddlDedGrossNet1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_ddlPayrollFrequencyCode")
	private WebElement ddlDedPayFrequency1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_txtPeriodApplyFrom")
	private WebElement txtDedApplyFrom1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_txtPeriodApplyTo")
	private WebElement txtDedApplyTo1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDeduction_ctl01_chkDelete")
	private WebElement chkDedDelete1;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_lnkBtnDeductionDelete")
	private WebElement btnDedDelete;
	@FindBy (id= "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnSave;
	@FindBy (id= "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnCancel;
	
	//CIS Suffered
	@FindBy (id= "ctl00_ctl00_ParentContent_cpHeaderRight_hrefCISSuffered")
	private WebElement lnkCISSuffered;
	@FindBy (css="h2")
	private WebElement titleText;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_txtCISSufferedAmount")
	private WebElement aprilMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_txtCISSufferedAmount")
	private WebElement mayMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_txtCISSufferedAmount")
	private WebElement junMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_txtCISSufferedAmount")
	private WebElement julMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_txtCISSufferedAmount")
	private WebElement augMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl05_txtCISSufferedAmount")
	private WebElement sepMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl06_txtCISSufferedAmount")
	private WebElement octMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl07_txtCISSufferedAmount")
	private WebElement novMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl08_txtCISSufferedAmount")
	private WebElement decMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl09_txtCISSufferedAmount")
	private WebElement janMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl10_txtCISSufferedAmount")
	private WebElement febMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_txtCISSufferedAmount")
	private WebElement marMonthInput;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement saveCISSufferedBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelCISSufferedBtn;
	
	//P32_CISSuffered
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[2]//td[position()+2 > last()]")
	private WebElement CISApril;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[3]//td[position()+2 > last()]")
	private WebElement CISMay;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[4]//td[position()+2 > last()]")
	private WebElement CISJune;
	@FindBy (xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[5]//td[position()+2 > last()]")
	private WebElement CISJuly;
	
	//Edit/Delete Employee
	@FindBy (xpath = "//img[@title='Edit']")
	private WebElement editLnk;
	@FindBy (xpath = "//div//a//figure//img[@title='Delete']/../..//span[contains(text(),'Delete')]")
	private WebElement deleteLnk;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement deleteEmpBtn;
	@FindBy (xpath = "//div[contains(text(),'Employee has some transaction associated. You can not delete this employee.')]")
	private WebElement deleteErrorMsg;
	
	//Dashboard Count check
	@FindBy (xpath = "//tr//td[1]//div[1]")
	private WebElement CntOverDue;
	@FindBy(xpath= "//a[contains(text(), 'OVERDUE')]")
	private WebElement overDuelnk;
	@FindBy(xpath="//table/tbody/tr")
	private List<WebElement> rowcnt;
	@FindBy(xpath="//li[@class='next']/a")
	private List<WebElement> PageNextCnt;
	@FindBy(xpath="//li[@class='next']/a")
	private WebElement PageNext;
	@FindBy (xpath = "//tr//td[2]//div[1]")
	private WebElement CntAutoPayroll;
	@FindBy(xpath= "//a[contains(text(), 'AUTO PAYROLL')]")
	private WebElement AutoPayrolllnk;
	@FindBy (xpath = "//tr//td[3]//div[1]")
	private WebElement CntManualPayroll;
	@FindBy(xpath= "//a[contains(text(), 'MANUAL PAYROLL')]")
	private WebElement ManualPayrolllnk;
	@FindBy (xpath = "//tr//td[5]//div[1]")
	private WebElement CntFailedRTI;
	@FindBy(xpath= "//tr//td[5]//div[1]/span/a")
	private WebElement FailedRTIlnk;
	@FindBy (xpath = "//tr//td[5]//div[1]")
	private WebElement CntManualRTIDue;
	@FindBy(xpath= "//a[contains(text(), 'MANUAL RTI DUE')]")
	private WebElement ManualRTIDuelnk;
	@FindBy (xpath = "//tr//td[6]//div[1]")
	private WebElement CntAutoRTIDue;
	@FindBy(xpath= "//a[contains(text(), 'AUTO RTI DUE')]")
	private WebElement AutoRTIDuelnk;
	@FindBy (xpath = "//tr//td[8]//div[1]")
	private WebElement CntTotalCompanies;
	@FindBy(xpath= "//tr[1]/td[8]/div[1]/span[1]/a[1]")
	private WebElement TotalCompanieslnk;
	WaitStatementLib wLib;
	public PayrollPage2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickReportLink(WebDriver driver)
	{
		wLib = new WaitStatementLib();
	try
	{
		OpenDashboard od = new OpenDashboard(driver);
		wLib.explicitWait(driver, 10, od.payrollMenuLnk);
		od.payrollMenuLnk.click();
		Thread.sleep(2000);
		wLib.explicitWait(driver, 10, lnkReports);
		lnkReports.click();
		
		
	}
	catch (Exception e) {
		Reporter.log("Report Link is not clickable",true);
		}	
	
	}
	public void clickPayeeLiablityReportLink(WebDriver driver)
	{
	try
	{
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, rptPayeeLiablity);
		if(rptPayeeLiablity.isDisplayed()==true)
			rptPayeeLiablity.click();	
	}
	catch (Exception e) {
		Reporter.log("Payee Liablity Report Not Visible",true);
		}	
	
	}
	;
	public void P32(WebDriver driver, String taxyear, String quarter, String cmpnyCbox, String paytaxyear, String paytaxmonth) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "Shows the P32 details depending on a particular tax year.";   
		Assert.assertEquals(p32ReportDescription.getText(), expTitle, "P32 Report Description is not verified");
		Reporter.log("P32 Report Description is verified successfully", true);
		p32Lnk.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("P32 Report Page is display", true);
		title3.click();
		WebElement p32taxyearDrpdwn= this.p32taxyearDrpdwn;
		Select sel =new Select(p32taxyearDrpdwn);
		sel.selectByVisibleText(taxyear);
		Reporter.log("Tax Year "+taxyear+" is selected", true);
		title3.click();
		WebElement quarterDrpdwn= this.quarterDrpdwn;
		Select sel1 =new Select(quarterDrpdwn);
		sel1.selectByVisibleText(quarter);
		Reporter.log("Quarter "+quarter+" is selected", true);
		searchBtn.click();

		VerifyValues(table2,p32TotalEmployeeNi,CommTotalEmployeeNi,SumEmployeeNi,ErrorMsgEmployeeNi,SuccessMsgEmployeeNi);
		VerifyValues(table3,p32TotalEmployerNi,CommTotalEmployerNi,SumEmployerNi,ErrorMsgEmployerNi,SuccessMsgEmployerNi);
		VerifyValues(table4,p32TotalStudentLoanRepay,CommTotalSLR,SumSLR,ErrorMsgSLR,SuccessMsgSLR);
		
		VerifyValues(table5,P32TotalNIStatutoryPayFunding,CommNISPF,SumNISPF,ErrorMsgNISPF,SuccessMsgNISPF);
		VerifyValues(table6,P32TotalTaxRefundFunding,CommTRF,SumTRF,ErrorMsgTRF,SuccessMsgTRF);
		
		VerifyValues(table7,P32TotalStatutoryPayRec,CommTotalSPR,SumSPR,ErrorMsgSPR,SuccessMsgSPR);
		VerifyValues(table8,P32TotalPrevYearOverPay,CommTotalPYO,SumPYO,ErrorMsgPYO,SuccessMsgPYO);
		VerifyValues(table9,P32TotalTax,CommTotalTax,SumTax,ErrorMsgTax,SuccessMsgTax);
		P32_CalcNiAllowance();
		
		TotalTaxDuetoHMRC(row2,TotalTaxDueToHMRC2);
		TotalTaxDuetoHMRC(row3,TotalTaxDueToHMRC3);
		TotalTaxDuetoHMRC(row4,TotalTaxDueToHMRC4);
		TotalTaxDuetoHMRC(row5,TotalTaxDueToHMRC5);
		TotalTaxDuetoHMRC(row6,TotalTaxDueToHMRC6);
		TotalTaxDuetoHMRC(row7,TotalTaxDueToHMRC7);
		TotalTaxDuetoHMRC(row8,TotalTaxDueToHMRC8);
		TotalTaxDuetoHMRC(row9,TotalTaxDueToHMRC9);
		TotalTaxDuetoHMRC(row10,TotalTaxDueToHMRC10);
		TotalTaxDuetoHMRC(row11,TotalTaxDueToHMRC11);
		TotalTaxDuetoHMRC(row12,TotalTaxDueToHMRC12);
		TotalTaxDuetoHMRC(row13,TotalTaxDueToHMRC13);		
		
	    p32Email.click();
	    Thread.sleep(4000);
	 	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 	//CmpnyEmailChkBx.click();
	 	//mySelfChbox.click();
	 	EmailTxtBx.sendKeys(cmpnyCbox);
	 	EmailBodyTxtBx.sendKeys("Testing");
	 	sendBtn.click();
	}
	
	
	public void P32_CalcNiAllowance()
	{
	
		double amt=0;
		
		for (WebElement li:table10)
		{
			String s=li.getText();
			String st=s.toString();
			st=st.replaceAll("[£ ,]", "");
			double d=Double.valueOf(st);
			amt+=d;
		}
		
	    if (amt>3000)
	    {
	    	Reporter.log("Total NI Allowance =" +amt, true);
	    	Assert.fail("NI Allowance is greater than 3000");
	    }
		DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt);
		Reporter.log("Total NI Allowance =" +rs, true);
		
		String totalNi=rs;
	    Assert.assertEquals(p32TotalDue.getText().replaceAll("[£ ,]", ""), totalNi, "Total NI Allowance of P32 Report is Not Matching");
	
	    Reporter.log("Total NI Allowance of P32 Report is Matching", true);
	}
	
	public String VerifyValues(List<WebElement> table, WebElement head, String CommTotal, String Sum, String ErrorMsg, String SuccessMsg)
		{
			double amt=0;
			
			for (WebElement li:table)
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				amt+=d;
			}
			
			DecimalFormat dc=new DecimalFormat("##");
			String rs=dc.format(amt);
						
			Reporter.log(CommTotal +rs, true);
			
		  	DecimalFormat RemoveDec=new DecimalFormat("##");
			String Sum1=RemoveDec.format(Double.valueOf(head.getText().replaceAll("[£ ,]", "")));
			
			Reporter.log(Sum +Sum1, true);
			
		    Assert.assertEquals(Sum1, rs, ErrorMsg);
		   	
		    Reporter.log(SuccessMsg, true);  
			return rs;
		}
	
	public void TotalTaxDuetoHMRC(List<WebElement> row, WebElement TotalTaxDueToHMRC)
	{
	
		double amt=0;
		double amt1=0;
		double amt2=0;
		double amt3=0;
		double amt4=0;
		double amt5=0;

//		int ro=row.size();
//		Reporter.log("Row Size= " +ro, true);
//		for (WebElement li:row)
//		{
//			ro=ro-1;
//			if (ro>6)
//			{
//				String s=li.getText();
//				String st=s.toString();
//				st=st.replaceAll("[£ ,]", "");
//				double d=Double.valueOf(st);
//				
//				amt+=d;
//			}
//			else if ((ro>4)&&(ro<7))
//			{
//				String s=li.getText();
//				String st=s.toString();
//				st=st.replaceAll("[£ ,]", "");
//				double d=Double.valueOf(st);
//				
//				amt1+=d;
//			}
//			
//			else if (ro==4)
//			{
//				String s=li.getText();
//				String st=s.toString();
//				st=st.replaceAll("[£ ,]", "");
//				double d=Double.valueOf(st);
//				
//				amt2+=d;
//			}
//			else if (ro==3)
//			{
//				String s=li.getText();
//				String st=s.toString();
//				st=st.replaceAll("[£ ,]", "");
//				double d=Double.valueOf(st);
//				
//				amt3+=d;
//			}
//			else if ((ro<3)&&(ro>0))
//			{
//				String s=li.getText();
//				String st=s.toString();
//				st=st.replaceAll("[£ ,]", "");
//				double d=Double.valueOf(st);
//				
//				amt4+=d;
//			}
//			
//			else
//			{
//				break;
//			}
//		}
//		
//		amt5=amt+amt2-amt1-amt3+amt4;
		
		int ro=row.size();
		Reporter.log("Row Size= " +ro, true);
		for (WebElement li:row)
		{
			ro=ro-1;
			if (ro>6)
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				
				amt+=d;
			}
			else if ((ro>4)&&(ro<7))
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				
				amt1+=d;
			}
			
			else if (ro==4)
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				
				amt2+=d;
			}
			else if (ro==3)
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				
				amt3+=d;
			}
			else if ((ro<3)&&(ro>0))
			{
				String s=li.getText();
				String st=s.toString();
				st=st.replaceAll("[£ ,]", "");
				double d=Double.valueOf(st);
				
				amt4+=d;
			}
			
			else
			{
				break;
			}
		}
		
		amt5=amt+amt2-amt1-amt3+amt4;

		DecimalFormat dc=new DecimalFormat("##.00");
		String rs=dc.format(amt5);
		Reporter.log("Calculated Total Tax due=" +rs, true);
		Assert.assertEquals(TotalTaxDueToHMRC.getText().replaceAll("[£ ,]", ""), rs, "Total Tax due to HMRC of P32 Report is Not Matching");

	    Reporter.log("Total Tax due to HMRC of P32 Report is Matching", true);
	}
	
//	public void ImportEmp(WebDriver driver) throws AWTException, InterruptedException
//	{
//		
//		Thread.sleep(2000);
//		//lnkPayroll.click();
//		lnkImpEmp.click();
//		btnBrowse.click();
//		Reporter.log("Choose File button clicked", true);
//		Thread.sleep(3000);
//		StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\testData\\PayrollEmployee.csv");
//
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//	    Robot robot = new Robot();
//	    
//	    robot.delay(2000);
//	    
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    robot.keyPress(KeyEvent.VK_CONTROL);
//	    robot.keyPress(KeyEvent.VK_V);
//	    
//	    robot.keyRelease(KeyEvent.VK_V);
//	    robot.keyRelease(KeyEvent.VK_CONTROL);
//	    
//	    robot.keyPress(KeyEvent.VK_ENTER);
//	    robot.keyRelease(KeyEvent.VK_ENTER);
//   
////	    Thread.sleep(2000);
//	    btnUpload.click();
////	    Thread.sleep(3000);
////	    driver.navigate().refresh();
//	    Thread.sleep(2000);
//	    Reporter.log("Upload button clicked", true);
//	    btnNext.click();
//	    Reporter.log("Next button clicked", true);
//	    btnImport.click();
//	    Reporter.log("Import button clicked", true);
//	    Assert.assertEquals(successMsg.getText(), successMsgTxt, "Unable to import Employee");
//	    Reporter.log(successMsg.getText(), true);
//
//	}
	
	// File upload using Sendkeys
	public void ImportEmp(WebDriver driver) throws AWTException, InterruptedException
	{
		
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, lnkImpEmp);
		lnkImpEmp.click();
		wLib.explicitWait(driver, 30, lnkImpEmp);
		btnBrowse.sendKeys(System.getProperty("user.dir")+"\\testData\\PayrollEmployee.csv");
		wLib.explicitWait(driver, 30, btnUpload);
	    btnUpload.click();

	    wLib.explicitWait(driver, 5, btnNext);
	    Reporter.log("Upload button clicked", true);
	    btnNext.click();
	    wLib.explicitWait(driver, 5, btnImport);
	    Reporter.log("Next button clicked", true);
	    btnImport.click();
	    wLib.explicitWait(driver, 5, successMsg);
	    Reporter.log("Import button clicked", true);
	    Assert.assertEquals(successMsg.getText(), successMsgTxt, "Unable to import Employee");
	    Reporter.log(successMsg.getText(), true);

	}
		
	public void undoRunPayrollAccept (WebDriver driver) throws InterruptedException
	{
		Reporter.log("Undo Payroll for the Company", true); 
		Reporter.log("Undo Payroll Date: "+payDate.getText());
		 		 
		while (!endUndoPayDate1.equals(payDate.getText()))
	    {				
			undoPayroll.click();
			wLib = new WaitStatementLib();
			wLib.implictWaitForSeconds(driver, 20);
			Alert alt=driver.switchTo().alert();
			String alertText = alt.getText();
			System.out.println(alertText);
			alt.accept();
			Thread.sleep(3000);
			Reporter.log("Control back on Run Payroll page", true);	
			Reporter.log("StartDate on Payroll page: " +payDate.getText(), true);	
			Reporter.log("EndDate on Payroll page: " +endUndoPayDate1, true);	
	    }

		Reporter.log("Undo Payroll for the Company Successfull", true);
    
	 }
	
	public void undoRunPayrollCISSuffered(WebDriver driver) throws InterruptedException
	{
		Reporter.log("Undo Payroll for the Company", true); 
		Reporter.log("Undo Payroll Date: "+payDate.getText());
		 		 
		while (!endUndoPayDate1.equals(payDate.getText()))
	    {				
			undoPayroll.click();
			wLib = new WaitStatementLib();
			wLib.implictWaitForSeconds(driver, 20);
			Alert alt=driver.switchTo().alert();
			String alertText = alt.getText();
			System.out.println(alertText);
			alt.accept();
			Thread.sleep(3000);
			Reporter.log("Control back on Run Payroll page", true);	
			Reporter.log("StartDate on Payroll page: " +payDate.getText(), true);	
			Reporter.log("EndDate on Payroll page: " +endUndoPayDate1, true);	
	    }

		Reporter.log("Undo Payroll for the Company Successfull", true);
    
	 }
	
	public void undoRunPayrollEmportEmployee(WebDriver driver) throws InterruptedException
	{
		Reporter.log("Undo Payroll for the Company", true); 
		Reporter.log("Undo Payroll Date: "+payDate.getText());
		 		 
		while (!endUndoPayDate1.equals(payDate.getText()))
	    {				
			undoPayroll.click();
			wLib = new WaitStatementLib();
			wLib.implictWaitForSeconds(driver, 20);
			Alert alt=driver.switchTo().alert();
			String alertText = alt.getText();
			System.out.println(alertText);
			alt.accept();
			Thread.sleep(3000);
			Reporter.log("Control back on Run Payroll page", true);	
			Reporter.log("StartDate on Payroll page: " +payDate.getText(), true);	
			Reporter.log("EndDate on Payroll page: " +endUndoPayDate1, true);	
	    }

		Reporter.log("Undo Payroll for the Company Successfull", true);
    
	 }
	
	public void runPayroll(WebDriver driver, String EPDate){

		Reporter.log("Start Pay Date is: "+payDate.getText(), true);
		 
			while (!endPayDate1.equals(payDate.getText()))
			{
				runPayrollBttn.click();
				wLib = new WaitStatementLib();
				wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline"));
				Reporter.log("Run Payroll screen is displayed", true);
				runPayroll.click();
				 
				Reporter.log("Next Pay Date is: "+payDate.getText(), true);
			
			}		
		Reporter.log("Run Payroll for the Company Successfull", true);			
	 }
	
	public void runPayrollCISSuffered(WebDriver driver, String CISSufferedApr) throws InterruptedException{

		Reporter.log("Start Pay Date is: "+payDate.getText(),true);
		 
			while (!endPayDate1.equals(payDate.getText()))
			{
				runPayrollBttn.click();
				wLib = new WaitStatementLib();
				wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline"));
				Reporter.log("Run Payroll screen is displayed", true);
				runPayroll.click();
				 
				Reporter.log("Next Pay Date is: "+payDate.getText(), true);
				CISSuffered(driver,CISSufferedApr);
			}		
		Reporter.log("Run Payroll for the Company Successfull", true);	
		Reporter.log("CIS Suffered entered successfuly for the months Payroll excuted", true);

	 }
	public void runPayrollEmployeeImport(WebDriver driver) throws InterruptedException{

		Reporter.log("Start Pay Date is: "+payDate.getText(),true);
		 
			while (!endPayDate1.equals(payDate.getText()))
			{
				runPayrollBttn.click();
				wLib = new WaitStatementLib();
				wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline"));
				Reporter.log("Run Payroll screen is displayed", true);
				runPayroll.click();
				 
				Reporter.log("Next Pay Date is: "+payDate.getText(), true);
				
			}		
		Reporter.log("Run Payroll for the Company Successfull", true);	
		
	 }

	public void CISSuffered(WebDriver driver, String CISSufferedApr) throws InterruptedException{

		lnkCISSuffered.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		 
		 	String text = titleText.getText();
		 	
			String expTxt = "CIS Suffered";
			Assert.assertEquals(text.substring(0, 12), expTxt, "Popup Text  is not verified");
			Reporter.log("Popup Text is verified successfully", true);
		 if (aprilMonthInput.isEnabled())
		 {	
			aprilMonthInput.clear();
			aprilMonthInput.sendKeys(CISSufferedApr);
		 }
		 else if (mayMonthInput.isEnabled())
		 {
			 mayMonthInput.clear();
			 mayMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (junMonthInput.isEnabled())
		 {
			 junMonthInput.clear();
			 junMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (julMonthInput.isEnabled())
		 {
			 julMonthInput.clear();
			 julMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (augMonthInput.isEnabled())
		 {
			 augMonthInput.clear();
			 augMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (sepMonthInput.isEnabled())
		 {
			 sepMonthInput.clear();
			 sepMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (octMonthInput.isEnabled())
		 {
			 octMonthInput.clear();
			 octMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (novMonthInput.isEnabled())
		 {
			 novMonthInput.clear();
			 novMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (decMonthInput.isEnabled())
		 {
			 decMonthInput.clear();
			 decMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (janMonthInput.isEnabled())
		 {
			 janMonthInput.clear();
			 janMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (febMonthInput.isEnabled())
		 {
			 febMonthInput.clear();
			 febMonthInput.sendKeys(CISSufferedApr); 
		 }
		 else if (marMonthInput.isEnabled())
		 {
			 marMonthInput.clear();
			 marMonthInput.sendKeys(CISSufferedApr); 
		 }
			
		saveCISSufferedBtn.click();
		Reporter.log("CIS Suffered for all Months Saved Successfully", true);
		 

	 }
	
	public void VerifyCISSuffered(WebDriver driver, String taxYear, String CISSuffered) throws InterruptedException {
		WebElement taxyerDrpDwn= this.taxyerDrpDwn;
		Select sel =new Select(taxyerDrpDwn);
		sel.selectByVisibleText(taxYear);
		
		Reporter.log("Tax Year "+taxYear+" is selected", true);
		title3.click();

		searchBtn.click();
		Thread.sleep(2000);
		String April="April";
		VerifyCIS(driver, April, CISSuffered);
		String May="May";
		VerifyCIS(driver, May, CISSuffered);

		//Code commented because of a bug in Preproduction for June month		
		//		String June="June";
//		VerifyCIS(driver, June, CISSuffered);
		String July="July";
		VerifyCIS(driver, July, CISSuffered);
				
		
	}
	
	public void VerifyCIS(WebDriver driver, String month, String CISSuffered) throws InterruptedException {

		if (month.equals("April"))
		{
			Reporter.log("CISSuffered: "+CISSuffered, true);
			Assert.assertEquals(CISApril.getText(), CISSuffered, "Amount not Matching for April. Test Failed");
			Reporter.log("Amount is Matching for April. Test Passed", true);
		}
		else if (month.equals("May"))
		{
			Reporter.log("CISSuffered: "+CISSuffered, true);
			Assert.assertEquals(CISMay.getText(), CISSuffered, "Amount not Matching for May. Test Failed");
			Reporter.log("Amount is Matching for May. Test Passed", true);
		}
		else if (month.equals("June"))
		{
			Reporter.log("CISSuffered: "+CISSuffered, true);
			Assert.assertEquals(CISJune.getText(), CISSuffered, "Amount not Matching for June. Test Failed");
			Reporter.log("Amount is Matching for June. Test Passed", true);
		}
		else if (month.equals("July"))
		{
			Reporter.log("CISSuffered: "+CISSuffered, true);
			Assert.assertEquals(CISJuly.getText(), CISSuffered, "Amount not Matching for July. Test Failed");
			Reporter.log("Amount is Matching for July. Test Passed", true);
		}
		
	}
	
	public void PayeLiabilityByTaxMonth(WebDriver driver,String taxYear, String month, String verPayeeBF,String comName) throws InterruptedException {
		WebElement taxyerDrpDwn= this.taxyerDrpDwn;
		Select sel =new Select(taxyerDrpDwn);
		sel.selectByVisibleText(taxYear);
		Thread.sleep(2000);
		
		WebElement ddlMonth= this.ddlMonth;
		Select sel1 =new Select(ddlMonth);
		sel1.selectByVisibleText(month);
		Thread.sleep(2000);
		if (month.equals("April"))
		{
			Reporter.log("verPayeeBF: "+verPayeeBF, true);
			Assert.assertEquals(driver.findElement(By.xpath("//td[@class='text-left'][contains(text(),'"+comName+"')]//..//td[2]")).getText().substring(2).replace(",", ""), verPayeeBF, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for April. Test Passed", true);
		}
		else if (month.equals("May"))
		{
			Reporter.log("verPayeeBF: "+verPayeeBF, true);
			Assert.assertEquals(driver.findElement(By.xpath("//td[@class='text-left'][contains(text(),'"+comName+"')]//..//td[2]")).getText().substring(2).replace(",", ""), verPayeeBF, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for May. Test Passed", true);
		}
		else if (month.equals("June"))
		{
			Reporter.log("verPayeeBF: "+verPayeeBF, true);
			Assert.assertEquals(driver.findElement(By.xpath("//td[@class='text-left'][contains(text(),'"+comName+"')]//..//td[2]")).getText().substring(1).replace(",", ""), verPayeeBF, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for June. Test Passed", true);
		}
		
	}
		
	public void PayslipsByCompany(WebDriver driver, String taxYear, String payrollDate, String email) throws InterruptedException
	{
		reportsLnk.click();
		String expTitle = "List payslips for all employees of a company";   
		Assert.assertEquals(payslipsReportDescription.getText(), expTitle, "Payslip By Company Report Description is not verified");
		Reporter.log("Payslip By Company Report Description is verified successfully", true);
		payslipByCmpny.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Payslips Report Page is display Successfully", true);
		WebElement taxyerDrpDwn1= this.taxyerDrpDwn1;
		Select sel =new Select(taxyerDrpDwn1);
		sel.selectByVisibleText(taxYear);
		Thread.sleep(2000);
		//taxyerDrpDwn.sendKeys(taxYear);
		WebElement payrollDateDrpDwn= this.payrollDateDrpDwn;
		Select sel1 =new Select(payrollDateDrpDwn);
		sel1.selectByValue(payrollDate);
		//payrollDateDrpDwn.sendKeys(payrollDate);
		//regenerateBtn.click();
		
		//cmpnySummary.click();
		     
		     
		 cmpnyQtrlySummary.click();
//		 Reporter.log("Current Url = "+driver.getCurrentUrl(),true);
//		 Thread.sleep(10000);
		 String Companywindow2=driver.getWindowHandle();
			System.out.println(Companywindow2);
			Set <String> handles2 = driver.getWindowHandles();

		     System.out.println(handles2);
	     // Pass a window handle to the other window

		     for (String AccessFiles2 : driver.getWindowHandles()) 
	     {

		     	System.out.println(AccessFiles2);

	     	driver.switchTo().window(AccessFiles2);
//			//driver.switchTo().window(Companywindow2);
	     	 }
			 Reporter.log("Current Url = "+driver.getCurrentUrl(),true);
			 Thread.sleep(3000);
//		    
	     
	     //emailPayslipBtn.click();
	     //driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	     //Thread.sleep(2000);
	     //emailoToTxtbx.sendKeys(email);
	     //sendBtn1.click();
	}
	
	public void PayslipsByCompany2(WebDriver driver, String taxYear, String payrollDate, String email) throws InterruptedException, AWTException
	{
		reportsLnk.click();
		String expTitle = "List payslips for all employees of a company";   
		Assert.assertEquals(payslipsReportDescription.getText(), expTitle, "Payslip By Company Report Description is not verified");
		Reporter.log("Payslip By Company Report Description is verified successfully", true);
		payslipByCmpny.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear"));
		Reporter.log("Payslips Report Page is display Successfully", true);
		WebElement taxyerDrpDwn1= this.taxyerDrpDwn1;
		Select sel =new Select(taxyerDrpDwn1);
		sel.selectByVisibleText(taxYear);
		Thread.sleep(2000);
		//taxyerDrpDwn.sendKeys(taxYear);
		WebElement payrollDateDrpDwn= this.payrollDateDrpDwn;
		Select sel1 =new Select(payrollDateDrpDwn);
		sel1.selectByValue(payrollDate);
		//payrollDateDrpDwn.sendKeys(payrollDate);
		//regenerateBtn.click();
		
		//cmpnySummary.click();
		     
		     
		 cmpnyQtrlySummary.click();
		 CISPage cis=new CISPage(driver);
		 cis.switchwindowForward(driver);
		 
		 cis.ClickSaveAs(driver);
		 
	}
	
	public void VerifyTotalTaxDuetoHMRC(String taxYear, String April, String May, String June) throws InterruptedException {
		WebElement taxyerDrpDwn= this.taxyerDrpDwn;
		Select sel =new Select(taxyerDrpDwn);
		sel.selectByVisibleText(taxYear);
		Thread.sleep(2000);
			Reporter.log("verPayeeBF: "+April, true);
			Assert.assertEquals(TotalTaxDueToHMRC2.getText(), April, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for April. Test Passed", true);

			Reporter.log("verPayeeBF: "+May, true);
			Assert.assertEquals(TotalTaxDueToHMRC3.getText(), May, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for May. Test Passed", true);

			Reporter.log("verPayeeBF: "+June, true);
			Assert.assertEquals(TotalTaxDueToHMRC4.getText(), June, "Amount not Matching. Test Failed");
			Reporter.log("Amount is Matching for June. Test Passed", true);
			//pdflnk.click();
		
	}
	
	 public void readPDFInURL(WebDriver driver,String April, String May, String June, String filename) throws EmptyFileException, IOException {
	        
	        String filePath = System.getProperty("user.dir");
	        Reporter.log("filePath" +filePath, true);
	        driver.get(filePath + filename);
	        
	        URL url = new URL(driver.getCurrentUrl());
	        InputStream is = url.openStream();
	        BufferedInputStream fileToParse = new BufferedInputStream(is);
	        PDDocument document = null;
	        try {
	            document = PDDocument.load(fileToParse);
	            String output = new PDFTextStripper().getText(document);
	            Reporter.log("PDF data: " +output, true);
	            Assert.assertTrue(output.contains(April));
	            Reporter.log("Total Tax Due to HMRC verfied for April" +April, true);
	            Assert.assertTrue(output.contains(May));
	            Reporter.log("Total Tax Due to HMRC verfied for May" +May, true);
	            Assert.assertTrue(output.contains(June));
	            Reporter.log("Total Tax Due to HMRC verfied for June" +June, true);
	            Reporter.log("PDF Verified successfuly", true);
	        } finally {
	            if (document != null) {
	                document.close();
	            }
	            fileToParse.close();
	            is.close();
	        }

	    }
	 
	 public void DeleteFile(WebDriver driver,String filename) {
	        String filePath = System.getProperty("user.dir");

	        File file = new File(filePath + filename);
	        if (file.exists()) 
	        {
				file.delete();
				Reporter.log("Existing PDF File deleted", true);
			} 
	        else 
	        {
			    Reporter.log("Pdf file does not exits", true);
			    
			}
	    }
	 
	 public void RecurringAddition(WebDriver driver,String Add,String Desc,String Amt,String Gross,String Frequency,String Add1,String Desc1,String Amt1,String Net,String Frequency1,String CurDate) throws InterruptedException 
	 {
		 Thread.sleep(2000);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("cboxIframe")));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ctl00_ParentContent_cphFooter_btnSave")));
			//wait.until(ExpectedConditions.elementToBeClickable(chkAllRTI));
//			iwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("cboxIframe"));
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));	
		chkAllRTI.click();
		Thread.sleep(2000);
		btnAddDelete.click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		btnSave.click();
		lnkRecAddDed.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Select sel=new Select(ddlAdd);
		sel.selectByVisibleText(Add);
		txtDesc.clear();
		txtDesc.sendKeys(Desc);
		txtAmt.clear();
		txtAmt.sendKeys(Amt);
		Select sel1=new Select(ddlGrossNet);
		sel1.selectByVisibleText(Gross);
//		Select sel2=new Select(ddlPayFrequency);
//		sel2.selectByVisibleText(Frequency);
		txtApplyFrom.clear();
		txtApplyFrom.sendKeys(CurDate);
		
		Select sel3=new Select(ddlAdd1);
		sel3.selectByVisibleText(Add1);
		txtDesc1.clear();
		txtDesc1.sendKeys(Desc1);
		txtAmt1.clear();
		txtAmt1.sendKeys(Amt1);
		Select sel4=new Select(ddlGrossNet1);
		sel4.selectByVisibleText(Net);
//		Select sel5=new Select(ddlPayFrequency1);
//		sel5.selectByVisibleText(Frequency1);
		txtApplyFrom1.clear();
		txtApplyFrom1.sendKeys(CurDate);
			
		Thread.sleep(1000);
		btnSave.click();

	 }
	 
	 public void RecurringDeduction(WebDriver driver,String Ded,String Desc,String Amt,String Gross,String Frequency,String Add1,String Desc1,String Amt1,String Net,String Frequency1,String CurDate) throws InterruptedException 
	 {
		 Thread.sleep(2000);
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("cboxIframe")));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_ctl00_ParentContent_cphFooter_btnSave")));
			//wait.until(ExpectedConditions.elementToBeClickable(chkAllRTI));
//			iwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("cboxIframe"));
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));	
		chkAllRTI1.click();
		Thread.sleep(2000);
		btnDedDelete.click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		btnSave.click();
		lnkRecAddDed.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
//		Select sel=new Select(ddlDed);
//		sel.selectByVisibleText(Ded);
		txtDedDesc.clear();
		txtDedDesc.sendKeys(Desc);
		txtDedAmt.clear();
		txtDedAmt.sendKeys(Amt);
		Select sel1=new Select(ddlDedGrossNet);
		sel1.selectByVisibleText(Gross);
//		Select sel2=new Select(ddlDedPayFrequency);
//		sel2.selectByVisibleText(Frequency);
		txtDedApplyFrom.clear();
		txtDedApplyFrom.sendKeys(CurDate);
		
//		Select sel3=new Select(ddlDed1);
//		sel3.selectByVisibleText(Add1);
		txtDedDesc1.clear();
		txtDedDesc1.sendKeys(Desc1);
		txtDedAmt1.clear();
		txtDedAmt1.sendKeys(Amt1);
		Select sel4=new Select(ddlDedGrossNet1);
		sel4.selectByVisibleText(Net);
//		Select sel5=new Select(ddlDedPayFrequency1);
//		sel5.selectByVisibleText(Frequency1);
		txtDedApplyFrom1.clear();
		txtDedApplyFrom1.sendKeys(CurDate);
			
		Thread.sleep(1000);
		btnSave.click();

	 }
	
	 public void deleteEmp(WebDriver driver, String niNumbEmp) throws InterruptedException{
	    	
	    	try {
				List<WebElement> NINumber = driver.findElements((By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr[last()]//td[5]")));
				for (WebElement ninumb : NINumber){
					if(ninumb.getText().equalsIgnoreCase(niNumbEmp)){
						
						System.out.println("Trying to match NINumber :"+niNumbEmp);
						WebElement editEmpSettings = driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr[last()]//td[5][contains(text(),'"+niNumbEmp+"')]/..//td//a[@class='toggleSettings']"));
						editEmpSettings.click();
						Thread.sleep(2000);
						wLib = new WaitStatementLib();
						wLib.implictWaitForSeconds(driver, 30);
						driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr[last()]//td[5][contains(text(),'"+niNumbEmp+"')]/..//td//a[@class='toggleSettings']/..//div//a//figure//img[@title='Delete']")).click();
						Thread.sleep(2000);
						driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
						break;
					}
				}
			}
			catch (NoSuchElementException e){
				System.out.println(e.getStackTrace());
			}
			catch (Exception e){
				
				System.out.println(e.getStackTrace());
			}
			
			
			Reporter.log("Delete button will be clicked in the popup", true); 
			Thread.sleep(2000);
			deleteEmpBtn.click();
			
			System.out.println("Employee is deleted");
			Reporter.log("Employee is deleted", true); 
			driver.switchTo().defaultContent();
			
	}
	 
	 public void CountCheckOverdue(WebDriver driver, String curUrl){
			
			String count = CntOverDue.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			overDuelnk.click();
			Reporter.log("Overdue clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Overdue");
			Reporter.log("Count= "+cnt+" is matching for Overdue", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckAutoPayroll(WebDriver driver, String curUrl){
			
			String count = CntAutoPayroll.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			AutoPayrolllnk.click();
			Reporter.log("Auto Payroll clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Auto Payroll");
			Reporter.log("Count= "+cnt+" is matching for Auto Payroll", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckManualPayroll(WebDriver driver, String curUrl){
			
			String count = CntManualPayroll.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			ManualPayrolllnk.click();
			Reporter.log("Manual Payroll clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Manual Payroll");
			Reporter.log("Count= "+cnt+" is matching for Manual Payroll", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckFailedRTI(WebDriver driver, String curUrl){
			
			String count = CntFailedRTI.getText();
			int cnt = Integer.parseInt(count);
			Reporter.log("cnt: " +cnt, true);
			
			FailedRTIlnk.click();
			Reporter.log("Failed RTI clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Failed RTI");
			Reporter.log("Count= "+cnt+" is matching for Failed RTI", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckManualRTIDue(WebDriver driver, String curUrl){
			
			String count = CntManualRTIDue.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			ManualRTIDuelnk.click();
			Reporter.log("Manual RTI Due clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Manual RTI Due");
			Reporter.log("Count= "+cnt+" is matching for Manual RTI Due", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckAutoRTIDue(WebDriver driver, String curUrl){
			
			String count = CntAutoRTIDue.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			AutoRTIDuelnk.click();
			Reporter.log("Auto RTI Due clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Auto RTI Due");
			Reporter.log("Count= "+cnt+" is matching for Auto RTI Due", true);
			driver.navigate().to(curUrl);
		}
	 
	 public void CountCheckTotalCompanies(WebDriver driver, String curUrl){
			
			String count = CntTotalCompanies.getText();
			int cnt = Integer.parseInt(count.substring(0, 2).trim());
			Reporter.log("cnt: " +cnt, true);
			
			TotalCompanieslnk.click();
			Reporter.log("Total Companies clicked", true);
			
			int Rowcount=rowcnt.size()-1;
			
			while(!PageNextCnt.isEmpty())
			{
				PageNext.click();;
				Rowcount=(Rowcount+rowcnt.size())-1;
			}
			
			Assert.assertEquals(cnt, Rowcount,"Count is not matching for Total Companies");
			Reporter.log("Count= "+cnt+" is matching for Total Companies", true);
			driver.navigate().to(curUrl);
		}
	    	
}
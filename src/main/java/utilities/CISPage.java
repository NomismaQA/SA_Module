package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.WaitStatementLib;


public class CISPage {
	
	//CIS Dashboard
	@FindBy (xpath = "//span[@class='h1A']")
	private WebElement CISTitle;
	@FindBy (css = "div.balance_big")
	private WebElement CISDueSubmission;
	@FindBy (css = "span.label > a")
	private WebElement CISDueSubmissionlnk;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> rowcntDueSubmission;
	
	@FindBy (xpath = "//table/tbody/tr/td[2]/div")
	private WebElement CISOverdueFilings;
	@FindBy (xpath = "//a[contains(text(),'OVERDUE FILINGS')]")
	private WebElement CISOverdueFilingslnk;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> rowcntOverdueFilings;
	
	@FindBy (xpath = "//table/tbody/tr/td[3]/div")
	private WebElement CISFilings;
	@FindBy (xpath = "//a[contains(text(),'CIS  FILINGS')]")
	private WebElement CISFilingslnk;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> rowcntCISFilings;
	
	@FindBy (xpath = "//table/tbody/tr/td[4]/div")
	private WebElement CISRejectedSubmission;
	@FindBy (xpath = "//a[contains(text(),'REJECTED SUBMISSION')]")
	private WebElement CISRejectedSubmissionlnk;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> rowcntRejectedSubmission;
	
	@FindBy (xpath = "//table/tbody/tr/td[5]/div")
	private WebElement CISTotalContractors;
	@FindBy (xpath = "//a[contains(text(),'TOTAL CONTRACTORS')]")
	private WebElement CISTotalContractorslnk;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> rowcntTotalContractors;
	
	@FindBy (xpath = "//li[@class='next']/a")
	private List<WebElement> CISPageNextCnt;
	@FindBy (xpath = "//li[@class='next']/a")
	private WebElement CISPageNext;
	@FindBy (xpath = "//div[contains(text(),'CIS DUE')]")
	private WebElement txtCISDue;
	String txtCISDueExp="CIS DUE";
	//@FindBy (xpath = "//a[contains(text(),'File CIS')]")
	//@FindBy (xpath = "//tr/td[3]/a")
	@FindBy (xpath = "//a[@class='green_btn manually_add_btn']")
	private WebElement FileCISlnk;
	@FindBy (xpath = "//h2[contains(text(),'Contractor List')]")
	private WebElement FileCISheading;
	@FindBy (xpath = "//div[contains(text(),'CIS SUMMARY')]")
	private WebElement CISSummaryText;
	@FindBy (xpath = "//div[contains(text(),'CIS DUE')]")
	private WebElement CISDueText;
	@FindBy (xpath = "//div[contains(text(),'CONTRACTOR LISTING')]")
	private WebElement ContractorListingText;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnAdd")
	private WebElement AddContractorbtn;
	@FindBy (xpath = "//header[1]/h2[1]")
	private WebElement AddContractorHeading;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrContractorList_ctl02_imgEdit")
	private WebElement EditContractor;
	@FindBy (css = "h2")
	private WebElement EditContractorHeading;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHFooter_btnSave")
	private WebElement SaveContractorbtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHFooter_btnDelete")
	private WebElement DeleteContractorbtn;
	@FindBy (xpath = "//table/tbody/tr[1]/td[1]/a")
	private WebElement FirstContractor;
	@FindBy (id = "search_input")
	private WebElement SearchContractor;
//	@FindBy (id = "ui-id-1")
//	private WebElement SelectContractor;
	@FindBy (xpath = "/html[1]/body[1]/ul[1]/li[1]/a[1]")
	private WebElement SelectContractor;
	private String CISSummaryTxt = "CIS SUMMARY";
	private String CISDueTxt = "CIS DUE";
	private String ContractorListingtxt = "CONTRACTOR LISTING";
	private String ContractorListHeading = "Contractor List";
	private String AddContractorTxt = "Add Contractor";
	private String EditContractorTxt = "Edit Contractor";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtContractorName")
	private WebElement txtContractorName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHFooter_btnCancel")
	private WebElement Cancelbtn;
	@FindBy (xpath = "//span[contains(text(),'CIS - Emaar Group1')]")	
	private WebElement ContractorHeader;
	
	//Add Contractor
	@FindBy (xpath="//span[contains(text(),'CIS')]")
	public WebElement CISMenuLnk;
	@FindBy (xpath="//a[@href='ReportCISContractorList.aspx']")
	private WebElement CISContractorList;
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd")
	private WebElement CISAddContractorbtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtContractoeFirstName")
	private WebElement txtFName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtContractorSurName")
	private WebElement txtLName;		
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtContractorRefNo")
	private WebElement txtRefNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtOfficeNo")
	private WebElement txtOfficeNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAccountOffRefNo")
	private WebElement txtAccountOffRefNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtUtrNo")
	private WebElement txtUtrNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPhoneNo")
	private WebElement txtPhoneNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmailId")
	private WebElement txtEmailId;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress1")
	private WebElement txtAddress1;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress2")
	private WebElement txtAddress2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress3")
	private WebElement txtAddress3;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPostCode")
	private WebElement txtPostCode;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkIsActive")
	private WebElement chkIsActive;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_txtSearchContractorName")
	private WebElement txtSearchContractor;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddStatus")
	private WebElement ddlStatus;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement btnContractorSearch;
	@FindBy (xpath = "//html//td[1]")
	private WebElement tblContractor;
	@FindBy (xpath = "//html//td[6]")
	private WebElement ddlEditContractor;
	@FindBy (xpath = "//span[contains(text(),'Edit')]")
	private WebElement btnEditContractor;
	@FindBy (xpath = "//span[contains(text(),'Delete')]")
	private WebElement btnDeleteContractor;
	@FindBy (xpath = "//html//td[5]")
	private WebElement tblStatusContractor;
	String NameNum="";
	
	//Add SubContractor
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddEmployee")
	private WebElement CISAddSubContractorbtn;
	private String AddSubContractorTxt = "Add SubContractor";
	@FindBy (xpath = "//header/h2/span")
	private WebElement headerSubContractor;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlTitle")
	private WebElement ddlTitle;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtFirstName")
	private WebElement txtScFName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtSecondName")
	private WebElement txtScSName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtLastName")
	private WebElement txtScLName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlBusinessType")
	private WebElement ddlBusiType;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtTradingName")
	private WebElement txtSCTrName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkUTRI")
	private WebElement chkUTRI;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtUTR")
	private WebElement txtUTR;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtCpnyRegNo")
	private WebElement txtCpnyRegNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtxNINO")
	private WebElement txtxNINO;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtVrNo")
	private WebElement txtVrNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkVATRtd")
	private WebElement chkVATRtd;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtVATRgNo")
	private WebElement txtVATRgNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtWrkRefNo")
	private WebElement txtWrkRefNo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress1")
	private WebElement txtScAddress1;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress2")
	private WebElement txtScAddress2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAddress3")
	private WebElement txtScAddress3;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPostCode")
	private WebElement txtScPostCode;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement txtEmail;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPhone")
	private WebElement txtPhone;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtDOB")
	private WebElement txtDOB;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlGender")
	private WebElement ddlGender;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlPaymentModeCode")
	private WebElement ddlPaymentModeCode;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlFrequencyCode")
	private WebElement ddlFrequencyCode;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtVrStus")
	private WebElement txtVrStus;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtVrDate")
	private WebElement CalVrDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_ddlDtnRate")
	private WebElement ddlDtnRate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnSave;
	private String strDOB = "01/01/1985";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_txtSubContractorName")
	private WebElement txtSearchSubcontractor;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement btnSearchSubcontractor;
	@FindBy (xpath = "//table/tbody/tr[2]")
	private List<WebElement> tblSubcontractor;
	@FindBy (tagName = "tr")
	private List<WebElement> tblSubcontractor2;
	@FindBy (css = "a.toggleSettings")
	private WebElement tglSettings;
	@FindBy (xpath = "//td/div/a/span[contains(text(),'Edit')]")
	private WebElement tglbtnEdit;
	@FindBy (xpath = "//td/div/a/span[contains(text(),'Delete')]")
	private WebElement tglbtnDelete;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement btnSCDelete;
	@FindBy (css = ".alert.alert-danger")
	private List<WebElement> delError;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnSCCancel;

	//Add Period
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddPeriod")
	private WebElement btnAddPeriod;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPdFrmDt")
	private WebElement txtPdFrmDt;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtPdToDt")
	private WebElement txtPdToDt;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnSavePeriod;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnCancelPeriod;
	@FindBy (css = ".alert.alert-danger")
	private List<WebElement> AddPeriodError;
	
	//Verify Period
	@FindBy (xpath = "//table/tbody/tr[2]/td[1]/a")
	private WebElement tblSubcontractorlnk;
	@FindBy (xpath = "//table/tbody/tr[2]/td[position()+1> last()]")
	private WebElement tglSettingsPeriod;
	@FindBy (xpath = "//span[contains(text(),'Preview')]")
	private WebElement tglPeriodPreview;
	@FindBy (xpath = "//span[contains(text(),'Delete')]")
	private WebElement tglPeriodDelete;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnPeriodCancel;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement btnPeriodDelete;
	
	//Add Invoice
	@FindBy (xpath = "//h2[contains(text(),'Sub Contractor')]")
	private WebElement SCpageTitle;
	@FindBy (xpath = "//html//tr[2]/td[1]/a[1]")
	private WebElement tblSClnk;
	@FindBy (xpath = "//tr[2]/td[1]/a")
	private WebElement SCperiodlnk;
	@FindBy (xpath = "//h2[contains(text(),'CIS Invoice Summary')]")
	private WebElement CISInvoceSumTitle;
//	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddInvoice")
	@FindBy (xpath = "//span[contains(text(),'Add Invoice')]")
	private WebElement btnAddInvoice;
	@FindBy (xpath = "//span[contains(text(),'Add Invoice')]")
//	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddInvoice")
	private List<WebElement> btnAddInvoicelst;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement btnCancelInvoice				;
	@FindBy (xpath = "//header[1]/h2[1]/span[1]")
	private WebElement CISAddInvoceTitle;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtInvoiceDate")
	private WebElement txtInvoiceDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl00_ddLabourOn")
	private WebElement ddLabourOn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl00_txtLabourAmount")
	private WebElement txtLabourAmount;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl00_ddMaterialType")
	private WebElement ddMaterialType;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl00_txtMaterialAmount")
	private WebElement txtMaterialAmount;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl00_txtVatRate")
	private WebElement txtVatRate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl01_ddLabourOn")
	private WebElement ddLabourOn2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl01_txtLabourAmount")
	private WebElement txtLabourAmount2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl01_ddMaterialType")
	private WebElement ddMaterialType2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl01_txtMaterialAmount")
	private WebElement txtMaterialAmount2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrInvoiceTransactions_ctl01_txtVatRate")
	private WebElement txtVatRate2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_chkAddMore")
	private WebElement chkAddMore;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNote")
	private WebElement txtNote;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_FileUpload1")
	private WebElement btnUpload;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnInvoiceSave;
	private String SCpageTitleExp = "Sub Contractor";
	private String CISInvoceSumTitleExp = "CIS Invoice Summary";
	private String CISAddInvoceTitleExp = "Add CIS Invoice";
	@FindBy (xpath = "//td[contains(text(),'Net is converted to gross')]")
	private WebElement infoMsg;
	
	//CIS Filing
	@FindBy (xpath="//a[@href='CISFiling.aspx']")
	private WebElement lnkCISFiling;
	@FindBy (xpath="//h2[contains(text(),'CIS Filing')]")
	private WebElement titleCISFiling;
	private String titleCISFilingExp = "CIS Filing";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnFileCIS")
	private WebElement btnFileCIS;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[1]")
	private WebElement chkContractor;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[1]")
	private List<WebElement> chkContractorLst;
	@FindBy (xpath="//img[@src='../commonv2/images/checkbox.jpg']")
	private WebElement SuccessIcon;
	
	//Submit CIS
	@FindBy (xpath="//a[@href='CISSubmit.aspx']")
	private WebElement lnkSubmitCIS;
	@FindBy (xpath="//h2[contains(text(),'CIS Submission')]")
	private WebElement titleCISSub;
	private String titleCISSubExp = "CIS Submission";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_txtCompanyName")
	private WebElement txtCompanyName;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement btnSearchContractor;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect")
	private WebElement cbSelect;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_lnkUndo")
	private WebElement lnkUndo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNotes")
	private WebElement txtNotes;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit")
	private WebElement btnDoNotSubmit;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_btnSubmitRTI")
	private WebElement btnSubmitRTI;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_cbSelect")
	private List<WebElement> cbSelectlst;
	
	//CIS Submission Report
	@FindBy (xpath="//a[@href='CISSubmissionReport.aspx']")
	private WebElement lnkCISSubmissionRpt;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[14]")
	private WebElement lnkCISSubmissiontbl;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[14]")
	private List<WebElement> lnkCISSubmissionlst;
	
	//CIS Failed Report
	@FindBy (xpath="//a[@href='CISFailedReport.aspx']")
	private WebElement lnkCISFailedRpt;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[14]")
	private WebElement lnkCISFailedtbl;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[14]")
	private List<WebElement> lnkCISFailedlst;
	
	//PaySlips By Contractor Report
	@FindBy (id = "ctl00_ctl00_ParentContent_SideMenu1_hrefReports")
	private WebElement lnkCISReports;
	@FindBy (xpath="//h3[contains(text(),'CIS Reports')]")
	private WebElement titleCISReports;
	private String titleCISReportsExp = "CIS Reports";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportPaySlip")
	private WebElement lnkReportPaySlip;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement titlePayslipsReports;
	private String titlePayslipsReportsExp = "Payslips Report";
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_lnkbtnPaySlip")
	private WebElement btnEmailPayslip;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlFilingPeriod")
	private WebElement ddlFilingPeriod;
	@FindBy (xpath="//table/tbody/tr[2]/td[10]")
	private WebElement NetPay;
	@FindBy (xpath="//*[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[11]/a/img")
	private WebElement PayslipPdf;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement txtEmailTo;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtBody_ctl02_ctl01")
	private WebElement txtBody;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement btnSend;

	//Subcontractor List Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportSubcontractorList")
	private WebElement lnkReportSCList;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlSubContactorRpt;
	private String ttlSubContactorRptExp = "Sub Contractor List Report";
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> roCntSC;
	@FindBy (xpath = "//table/tbody/tr")
	private List<WebElement> roCntSCrpt;
	@FindBy (xpath = "//a/i[@class='fa fa-chevron-right']")
	private WebElement btnSCNext;
	@FindBy (xpath = "//a/i[@class='fa fa-chevron-right']")
	private List<WebElement> btnSCNextCnt;
	@FindBy (xpath = "//img[@src='../commonv2/images/export.png']")
	private WebElement btnExport;
	
	@FindBy (xpath = "//img[@src='../commonv2/images/pdf_ico.png']")
	private WebElement lnkPDF;
	
	//CIS Dashboard
	@FindBy (xpath="//a[@href='CISDashboard.aspx']")
	private WebElement CISDashboard;
	
	//All Subcontractors Pay Totals Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportAllSubcontractorsPayTotals")
	private WebElement lnkSCPayTtlRpt;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlSCPayTotal;
	private String ttlSCPayTotalExp = "ALL Sub Contractors Pay Totals Report";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlPeriod")
	private WebElement ddlPeriod;
	private String ddlperioddate = "06/04/2018 00:00:00";
	@FindBy (xpath="//td[text()='Total']/../td[2]")
	private WebElement AllSCPT_BP;
	@FindBy (xpath="//td[text()='Total']/../td[6]")
	private WebElement AllSCPT_NP;
	String Value1="";
	String Value2="";
	
	//Subcontractor Pay Details Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefCISSubcontractorPayDetailsReport")
	private WebElement lnkSCPayDetailsRpt;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlSCPayDetails;
	private String ttlSCPayDetailsExp = "Sub Contractor Pay Details Report";
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYears")
	private WebElement ddlFinancialyear;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlsubcontractor")
	private WebElement ddlsubcontractor;
	private String ddlSCValue = "All";
	private String ddlFY15 = "2015-2016";
	private String ddlFY16 = "2016-2017";
	private String ddlFY17 = "2017-2018";
	private String ddlFY18 = "2018-2019";

	//Payment Certificate
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefCISPaymentCertificateReport")
	private WebElement lnkPaymentCertRpt;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlPaymentCert;
	private String ttlPaymentCertExp = "Payment Certificate";
	
	//CIS Verification Certificate
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefCISVerificationCertificateReport")
	private WebElement lnkVerifyCertRpt;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlVerifyCert;
	private String ttlVerifyCertExp = "CIS Verification Certificate";
	
	//CIS Submission Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportCISSubmission")
	private WebElement lnkCISSubRpt;
	@FindBy (xpath="//h2[contains(text(),'CIS Submission Report')]")
	private WebElement ttlCISSubRpt;
	private String ttlCISSubRptExp = "CIS Submission Report";
	@FindBy (xpath="//img[@src='../commonv2/images/submitted_ico_green.png']")
	private WebElement lnkCISXML;
	@FindBy (xpath="//header[1]/h2[1]/span[1]")
	private WebElement ttlCISXML;
	private String ttlCISXMLExp="CIS XML file";
	@FindBy (id = "cboxClose")
	private WebElement cboxClose;
	@FindBy (xpath="//td/a[contains(text(),'TestContractor')]/../../td[13]")
	private WebElement lnkSubmitted;
	@FindBy (xpath="//table[1]/tbody[1]/tr[2]/td[13]/a[1]")
	private WebElement lnkSubNotSub;
	@FindBy (xpath="//div[3]/header/h2")
	private WebElement ttlSubmitted;
	private String ttlSubmittedExp="CIS Submission Report";
	@FindBy (xpath="//html//tr[2]")
	private List<WebElement> ro1;
	@FindBy (xpath="//table[1]/tbody[1]/tr[2]/td[14]/a[1]/img[1]")
	private WebElement lnkUndoSubRpt;
	
	//CIS Submission Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportCISFailed")
	private WebElement lnkCISFailRpt;
	@FindBy (xpath="//h2[contains(text(),'CIS Failed Report')]")
	private WebElement ttlCISFailRpt;
	private String ttlCISFailRptExp = "CIS Failed Report";
	
	//CIS300 Monthly Return Report
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_hrefReportCISNilReturn")
	private WebElement hrefReportCISNilReturn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_ddlTaxYear")
	private WebElement ddlCIS300TaxYear;
	@FindBy (xpath="//span[@class='h1A']")
	private WebElement ttlCIS300Rpt;
	private String ttlCIS300RptExp = "CIS300 Monthly Return Report";
	
	@FindBy (xpath="//td[text()='Totals']/../td[4]")
	private WebElement CIS300_TP;
	@FindBy (xpath="//td[text()='Totals']/../td[6]")
	private WebElement CIS300_AD;
	WaitStatementLib wLib;
	public CISPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCISPage(WebDriver driver, String title)
	{
		Reporter.log("CIS Dashboard's title:" +title, true);
		Assert.assertEquals(CISTitle.getText(), title, "CIS Dashboard's title is not verified");
		Reporter.log("CIS Dashboard's title is verified successfuly", true);
	}

	public void CountCheckCISDueSubmission(WebDriver driver, String curUrl){
		
		String count = CISDueSubmission.getText();
		int cnt = Integer.parseInt(count.substring(0, 2).trim());
		Reporter.log("cnt: " +cnt, true);
		
		CISDueSubmissionlnk.click();
		Reporter.log("CISDueSubmission clicked", true);
		
		int Rowcount=rowcntDueSubmission.size()-1;
		
//		boolean present;
//		try {
//		   driver.findElement(By.id("logoutLink"));
//		   present = true;
//		} catch (NoSuchElementException e) {
//		   present = false;
//		}
		while(!CISPageNextCnt.isEmpty())
		{
			CISPageNext.click();
			Rowcount=(Rowcount+rowcntDueSubmission.size())-1;
		}
		
		Assert.assertEquals(cnt, Rowcount,"Count is not matching for Due Submission");
		Reporter.log("Count= "+cnt+" is matching for Due Submission", true);
		driver.navigate().to(curUrl);
	}


	public void CountCheckCISOverdueFilings(WebDriver driver, String curUrl){
				
		String count = CISOverdueFilings.getText();
		int cnt = Integer.parseInt(count.substring(0, 2).trim());
		Reporter.log("cnt: " +cnt, true);
		
		CISOverdueFilingslnk.click();
		Reporter.log("Overdue Filings clicked", true);
		
		int Rowcount=rowcntOverdueFilings.size()-1;
		
		while(!CISPageNextCnt.isEmpty())
		{
			CISPageNext.click();;
			Rowcount=(Rowcount+rowcntOverdueFilings.size())-1;
		}
		
		Assert.assertEquals(cnt, Rowcount,"Count is not matching for Overdue Filings");
		Reporter.log("Count= "+cnt+" is matching for Overdue Filings", true);
		driver.navigate().to(curUrl);
	}
	
	public void CountCheckCISFilings(WebDriver driver, String curUrl){
		
		String count = CISFilings.getText();
		int cnt = Integer.parseInt(count.substring(0, 2).trim());
		Reporter.log("cnt: " +cnt, true);
		
		CISFilingslnk.click();
		Reporter.log("CIS Filings clicked", true);
		
		int Rowcount=rowcntCISFilings.size()-1;
		
		while(!CISPageNextCnt.isEmpty())
		{
			CISPageNext.click();;
			Rowcount=(Rowcount+rowcntCISFilings.size())-1;
		}
		
		Assert.assertEquals(cnt, Rowcount,"Count is not matching for CIS Filings");
		Reporter.log("Count= "+cnt+" is matching for CIS Filings", true);
		driver.navigate().to(curUrl);
	}
	
	public void CountCheckCISRejectedSubmission(WebDriver driver, String curUrl) throws InterruptedException{
		
		String count = CISRejectedSubmission.getText();
		int cnt = Integer.parseInt(count.substring(0, 2).trim());
		Reporter.log("cnt: " +cnt, true);
		
		CISRejectedSubmissionlnk.click();
		Reporter.log("Rejected Submission clicked", true);
		
		int Rowcount=rowcntRejectedSubmission.size()-1;
		
		while(!CISPageNextCnt.isEmpty())
		{
			CISPageNext.click();;
			Rowcount=(Rowcount+rowcntRejectedSubmission.size())-1;
		}
		
		Assert.assertEquals(cnt, Rowcount,"Count is not matching for Rejected Submission");
		Reporter.log("Count= "+cnt+" is matching for Rejected Submission", true);
		driver.navigate().to(curUrl);
	}
	
	public void CountCheckCISTotalContractors(WebDriver driver, String curUrl) throws InterruptedException{
	
		String count = CISTotalContractors.getText();
		int cnt = Integer.parseInt(count.substring(0, 2).trim());
		Reporter.log("cnt: " +cnt, true);
		
		CISTotalContractorslnk.click();
		Reporter.log("Total Contractors clicked", true);
		
		int Rowcount=rowcntTotalContractors.size()-1;
		while(!CISPageNextCnt.isEmpty())
		{
			CISPageNext.click();;
			Rowcount=(Rowcount+rowcntTotalContractors.size())-1;
		}
		
		Assert.assertEquals(cnt, Rowcount,"Count is not matching for Total Contractors");
		Reporter.log("Count= "+cnt+" is matching for Total Contractors", true);
		driver.navigate().to(curUrl);
	}

	public void VerifyCISboard(WebDriver driver, String curUrl, String contractor) throws InterruptedException{

		
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		Assert.assertEquals(txtCISDue.getText(), txtCISDue, "Text not verified");
//		Reporter.log("Text verified successfully", true);
		
	
//		FileCISlnk.click();
//		switchwindowForward(driver);
//		FileCISheading.click();
//		Reporter.log("FileCISheading.getText(): "+FileCISheading.getText(), true);
//		Assert.assertEquals(FileCISheading.getText(), ContractorListHeading,"Header Text is not matching");
//		Reporter.log("Header Text verified for File CIS page", true);
//		switchwindowBackward(driver);
		Assert.assertEquals(CISSummaryText.getText(), CISSummaryTxt,"Text is not matching");
		Reporter.log("Text verified for CIS Summary", true);
		
		Assert.assertEquals(CISDueText.getText(), CISDueTxt,"Text is not matching");
		Reporter.log("Text verified for CIS Due", true);
		
		Assert.assertEquals(ContractorListingText.getText(), ContractorListingtxt,"Text is not matching");
		Reporter.log("Text verified for Contractor Listing", true);
		
		AddContractorbtn.click();
		Reporter.log("Add Contractor button clicked", true);
		
		switchwindowNew(driver);	
		Thread.sleep(2000);
		Assert.assertEquals(AddContractorHeading.getText(), AddContractorTxt,"Text is not matching");
		Reporter.log("Add Contractor page verified", true);
		Cancelbtn.click();
		
		switchwindowDefault(driver);	
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
		
		EditContractor.click();
//		Thread.sleep(2000);
//		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		switchwindowNew(driver);
		Assert.assertEquals(EditContractorHeading.getText(), EditContractorTxt,"Text is not matching");
		Reporter.log("Edit Contractor page verified", true);
		String ContractorName=txtContractorName.getAttribute("value");
		Reporter.log("Contractor Name: "+ContractorName, true);
		SaveContractorbtn.click();
		Reporter.log("Contractor information updated successfuly", true);
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		Assert.assertEquals(FirstContractor.getText(), ContractorName,"Contractor Name is not matching");
		Reporter.log("Contractor Name is coming correctly", true);
		
		SearchContractor.sendKeys(contractor);
		Thread.sleep(2000);
		SelectContractor.click();
		Thread.sleep(2000);
		switchwindowForward(driver);
		Assert.assertEquals(ContractorHeader.getText(), "CIS - "+contractor,"Text is not matching");
		Reporter.log("Contractor page verified successfuly", true);
		
	}
	
	public void VerifyFileCIS(WebDriver driver, String curUrl)
	{
		FileCISlnk.click();
		Reporter.log("FileCISheading.getText(): "+(FileCISheading.getText()), true);
		Assert.assertEquals(FileCISheading.getText(), ContractorListHeading,"Header Text is not matching");
		Reporter.log("Header Text verified for File CIS page", true);
		driver.navigate().to(curUrl);
	}
	
	public void switchwindowForward(WebDriver driver) throws InterruptedException {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(tabs.size()-1));
		//Thread.sleep(2000);
	}
	public void switchwindowBackward(WebDriver driver) throws InterruptedException {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(tabs.size()-2));
		//Thread.sleep(2000);
	}
	
	public void AddContractor(WebDriver driver, String name) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 5,CISMenuLnk);
		CISMenuLnk.click();
		wLib.explicitWait(driver, 5,CISContractorList);
		CISContractorList.click();
		wLib.explicitWait(driver, 5,FileCISheading);
		Assert.assertEquals(FileCISheading.getText(), ContractorListHeading,"Header Text is not matching");
		Reporter.log("Header Text verified for Contractor List page", true);
		wLib.explicitWait(driver, 5,CISAddContractorbtn);
		CISAddContractorbtn.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Assert.assertEquals(AddContractorHeading.getText(), AddContractorTxt,"Text is not matching");
		Reporter.log("Add Contractor page verified", true);
		int num=generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("name+num1: "+(name+num1), true);
	
		txtContractorName.sendKeys(name+num1);
		txtFName.sendKeys(name+num1);
		txtLName.sendKeys(name);
		txtRefNo.sendKeys(num1);
		txtOfficeNo.sendKeys(num1);
		txtAccountOffRefNo.sendKeys(num1);
		txtUtrNo.sendKeys(num1);
		txtPhoneNo.sendKeys(num1);
		txtEmailId.sendKeys(name+num1+"@testmail.com");
		txtAddress1.sendKeys(name+num1);
		txtAddress2.sendKeys(name+num1);
		txtAddress3.sendKeys(name+num1);
		txtPostCode.sendKeys(num1);
		chkIsActive.click();
		SaveContractorbtn.click();
		Reporter.log("Contractor added successfuly", true);
		
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		
		txtSearchContractor.sendKeys(name+num1);
		Select sel = new Select(ddlStatus);
		sel.selectByVisibleText("Show All");
		btnContractorSearch.click();
		Assert.assertEquals(name+num1, tblContractor.getText(),"Failed to Search Contracter");
		Reporter.log("Contractor searched successfuly", true);
		
		ddlEditContractor.click();
		btnEditContractor.click();
		//Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		chkIsActive.click();
		SaveContractorbtn.click();
		Reporter.log("Contractor updated successfuly", true);		
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		NameNum=name+num1;
		
		txtSearchContractor.sendKeys(name+num1);
		sel.selectByVisibleText("Active");
		btnContractorSearch.click();
		Assert.assertEquals("Active", tblStatusContractor.getText(),"Failed to update Contracter's Status");
		Reporter.log("Contracter status updated successfuly", true);
		
	}
	
	public void DeleteContractor(WebDriver driver, String name) throws InterruptedException {

		CISContractorList.click();
		Thread.sleep(2000);
		Assert.assertEquals(FileCISheading.getText(), ContractorListHeading,"Header Text is not matching");
		Reporter.log("Header Text verified for Contractor List page", true);
		
		txtSearchContractor.sendKeys(NameNum);
		Select sel = new Select(ddlStatus);
		sel.selectByVisibleText("Show All");
		btnContractorSearch.click();
		Assert.assertEquals(NameNum, tblContractor.getText(),"Failed to Search Contracter");
		Reporter.log("Contractor searched successfuly", true);
		
		ddlEditContractor.click();
		btnDeleteContractor.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		//chkIsActive.click();
		DeleteContractorbtn.click();
		Reporter.log("Contractor deleted successfuly", true);		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		txtSearchContractor.sendKeys(NameNum);
		sel.selectByVisibleText("Active");
		btnContractorSearch.click();
		Thread.sleep(2000);
		//Assert.assertEquals("Active", tblStatusContractor.getText(),"Failed to update Contracter's Status");
		Reporter.log("Contracter deleted successfuly", true);
		
		
	}
			 
	public int generateRandom(){
		Random randomInt = new Random();
		int num = randomInt.nextInt(100000000);
		Reporter.log("Random Integer: "+num, true);
		return num;
	}
	
	public String getcurdate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String CurDate=dateFormat.format(date);
		return CurDate;
	}
	
	public String AddSubcontractor(WebDriver driver, String name, String contractor) throws InterruptedException {
				
		SearchContractor.sendKeys(contractor);
		Thread.sleep(2000);
		SelectContractor.click();
		switchwindowForward(driver);
		String Subcontractor=AddMultipleSubcontractor(driver,name,"Mr.","Male","Company","BACS","Monthly","Unmatched = 30%");
		Subcontractor=AddMultipleSubcontractor(driver,name,"Mrs.","Female","Partnership","Cheque","Weekly","Net = 20%");
		Subcontractor=AddMultipleSubcontractor(driver,name,"Miss","Female","Sole Trader","Cash","2-Weekly","Gross = 0%");
		Subcontractor=AddMultipleSubcontractor(driver,name,"Mr.","Male","Trust","Cheque","4-Weekly","Unmatched = 30%");
		Reporter.log("Subcontracter "+Subcontractor+ " returned", true);
		return Subcontractor;
				
	}
	
	public String AddMultipleSubcontractor(WebDriver driver, String name, String title, String gender,String business, String paymentmode, String payfrequency,String dedrate) throws InterruptedException {
		CISAddSubContractorbtn.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Assert.assertEquals(headerSubContractor.getText(), AddSubContractorTxt,"Header Text is not matching");
		Reporter.log("Header Text verified for Add SubContractor page", true);
		Select sel1 = new Select(ddlTitle);
		sel1.selectByVisibleText(title);

		int num=generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("name+num1: "+(name+num1), true);
	
		txtScFName.sendKeys(name+num1);
		txtScSName.sendKeys(name+num1);
		txtScLName.sendKeys(name+num1);
		
		Select sel2 = new Select(ddlBusiType);
		sel2.selectByVisibleText(business);
		txtSCTrName.sendKeys(name+num1);
		
		chkUTRI.click();
		txtUTR.sendKeys(name+num1);
		
		txtCpnyRegNo.sendKeys(num1);
		txtxNINO.sendKeys(num1);
		txtVrNo.sendKeys(name+num1);
		chkVATRtd.click();
		txtVATRgNo.sendKeys(num1);
		txtWrkRefNo.sendKeys(num1);
		txtScAddress1.sendKeys(num1);
		txtScAddress2.sendKeys(name+num1);
		txtScAddress3.sendKeys(name);
		txtScPostCode.sendKeys(num1);
		txtEmail.sendKeys(name+num1+"@testmail.com");
		txtPhone.sendKeys(num1);
		txtDOB.sendKeys(strDOB);
		Select sel3 = new Select(ddlGender);
		sel3.selectByVisibleText(gender);
		Select sel4 = new Select(ddlPaymentModeCode);
		sel4.selectByVisibleText(paymentmode);
		Select sel5 = new Select(ddlFrequencyCode);
		sel5.selectByVisibleText(payfrequency);
		txtVrStus.sendKeys(name+num1);
		
		String curdate=getcurdate();
		Reporter.log("curdate: "+curdate, true);
		CalVrDate.sendKeys(curdate);
		
		Select sel6 = new Select(ddlDtnRate);
		sel6.selectByVisibleText(dedrate);
		
		btnSave.click();
		Reporter.log("SubContracter "+(name+num1)+ "added successfuly", true);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		return name+num1;
		
	}
	
	public void EditSubcontractor(WebDriver driver, String Subcontractor) throws InterruptedException {
		txtSearchSubcontractor.sendKeys(Subcontractor);
		btnSearchSubcontractor.click();
		
		Reporter.log("tblSubcontractor size: "+tblSubcontractor.size(), true);
		if (tblSubcontractor.size()>0)
		{
			Reporter.log("Subcontractor search successful", true);
			
		}
		else
		{
			Assert.fail("Unable to Search Subcontractor");
		}
		
		tglSettings.click();
		tglbtnEdit.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		txtScFName.clear();
		txtScFName.sendKeys(Subcontractor+"A");
		String SubcontractorU=Subcontractor+"A";
		Select sel2 = new Select(ddlBusiType);
		sel2.selectByIndex(2);
		chkUTRI.click();
		chkVATRtd.click();
		txtEmail.sendKeys(Subcontractor+"A"+"@testmail.com");
		Select sel3 = new Select(ddlGender);
		sel3.selectByIndex(1);
		Select sel4 = new Select(ddlPaymentModeCode);
		sel4.selectByIndex(1);
		Select sel5 = new Select(ddlFrequencyCode);
		sel5.selectByIndex(1);
		Select sel6 = new Select(ddlDtnRate);
		sel6.selectByIndex(1);

		btnSave.click();
		Reporter.log("Subcontractor updated successful", true);
		DeleteSubcontractor(driver,SubcontractorU);
		
				
	}
	
	public void DeleteSubcontractor(WebDriver driver, String SubcontractorU) throws InterruptedException {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		txtSearchSubcontractor.sendKeys(SubcontractorU);
		btnSearchSubcontractor.click();
		Reporter.log("tblSubcontractor size: "+tblSubcontractor.size(), true);
		if (tblSubcontractor.size()>0)
		{
			tglSettings.click();
			tglbtnDelete.click();
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
			btnSCDelete.click();
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			txtSearchSubcontractor.sendKeys(SubcontractorU);
			btnSearchSubcontractor.click();
			Reporter.log("tblSubcontractor size: "+tblSubcontractor.size(), true);
			if (tblSubcontractor.size()>0)
			{
				Assert.fail("Failed to delete Subcontractor");
			}
			else
			{
				Reporter.log("Unable to Search Subcontractor", true);
			}
			Reporter.log("Subcontractor deleted successful", true);
		}
		else
		{
			Assert.fail("Unable to Search Subcontractor for deletion.");
		}
		
	}
	
//	public void ContractorList() throws InterruptedException {
//		CISMenuLnk.click();
//		Thread.sleep(2000);
//		CISContractorList.click();
//		Thread.sleep(2000);
//		Assert.assertEquals(FileCISheading.getText(), ContractorListHeading,"Header Text is not matching");
//		Reporter.log("Header Text verified for Contractor List page", true);
//	}
	
	public void SearchContractor(WebDriver driver, String contractor) {
		txtSearchContractor.sendKeys(contractor);
		Select sel = new Select(ddlStatus);
		sel.selectByVisibleText("Active");
		btnContractorSearch.click();
		Assert.assertEquals(contractor, tblContractor.getText(),"Failed to Search Contracter");
		Reporter.log("Contracter searched successfuly", true);
		
	}
	
	public void SearchContractorfromDashboard(WebDriver driver, String contractor) throws InterruptedException {
		SearchContractor.sendKeys(contractor);
		//Thread.sleep(2000);
		SelectContractor.click();
		switchwindowForward(driver);
	
	}
	
	public void AddSubcontractor(WebDriver driver, String name, String title, String gender,String business, String paymentmode, String payfrequency,String dedrate) throws InterruptedException {
		CISAddSubContractorbtn.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Assert.assertEquals(headerSubContractor.getText(), AddSubContractorTxt,"Header Text is not matching");
		Reporter.log("Header Text verified for Add SubContractor page", true);
		Select sel1 = new Select(ddlTitle);
		sel1.selectByVisibleText(title);

		int num=generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("name+num1: "+(name+num1), true);
	
		txtScFName.sendKeys(name);
		txtScSName.sendKeys(name);
		txtScLName.sendKeys(name);
		
		Select sel2 = new Select(ddlBusiType);
		sel2.selectByVisibleText(business);
		txtSCTrName.sendKeys(name);
		
		chkUTRI.click();
		txtUTR.sendKeys(name+num1);
		
		txtCpnyRegNo.sendKeys(num1);
		txtxNINO.sendKeys(num1);
		txtVrNo.sendKeys(name+num1);
		chkVATRtd.click();
		txtVATRgNo.sendKeys(num1);
		txtWrkRefNo.sendKeys(num1);
		txtScAddress1.sendKeys(num1);
		txtScAddress2.sendKeys(name+num1);
		txtScAddress3.sendKeys(name);
		txtScPostCode.sendKeys(num1);
		txtEmail.sendKeys(name+"@testmail.com");
		txtPhone.sendKeys(num1);
		txtDOB.sendKeys(strDOB);
		Select sel3 = new Select(ddlGender);
		sel3.selectByVisibleText(gender);
		Select sel4 = new Select(ddlPaymentModeCode);
		sel4.selectByVisibleText(paymentmode);
		Select sel5 = new Select(ddlFrequencyCode);
		sel5.selectByVisibleText(payfrequency);
		txtVrStus.sendKeys(name+num1);
		
		String curdate=getcurdate();
		Reporter.log("curdate: "+curdate, true);
		CalVrDate.sendKeys(curdate);
		
		Select sel6 = new Select(ddlDtnRate);
		sel6.selectByVisibleText(dedrate);
		
		btnSave.click();
		Reporter.log("SubContracter "+(name) + "added successfuly", true);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}
	
	public void AddPeriodData(WebDriver driver, String FrmDt, String ToDt) throws InterruptedException {

		btnAddPeriod.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		txtPdFrmDt.sendKeys(FrmDt);
		txtPdToDt.sendKeys(ToDt);
		btnSavePeriod.click();
		if (AddPeriodError.size()==0)
		{
		Reporter.log("Period added successfuly", true);
		}
		else
		{
			btnCancelPeriod.click();
			Reporter.log("Period already added", true);
		}
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
	}
	
	public void VerifyPeriodData(WebDriver driver,String SubcontractorU) throws InterruptedException {
		
		tblSubcontractorlnk.click();
		switchwindowForward(driver);
		
		tglSettingsPeriod.click();
		tglPeriodPreview.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		btnPeriodCancel.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		tglSettingsPeriod.click();
		tglPeriodDelete.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		btnPeriodDelete.click();
		Reporter.log("Period deleted successfuly", true);
		switchwindowBackward(driver);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}
	
	public void DeleteMultipleSubcontractor(WebDriver driver, String SubcontractorU) throws InterruptedException {

		txtSearchSubcontractor.sendKeys(SubcontractorU);
		btnSearchSubcontractor.click();
		Reporter.log("tblSubcontractor2 size: "+tblSubcontractor2.size(), true);
		while (tblSubcontractor2.size()>2)
		{
			tglSettings.click();
			tglbtnDelete.click();
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
			btnSCDelete.click();
			if (delError.size()==0)
			{
				
//			driver.switchTo().defaultContent();
//			Thread.sleep(2000);
//			
//			txtSearchSubcontractor.sendKeys(SubcontractorU);
//			btnSearchSubcontractor.click();
//			Reporter.log("tblSubcontractor2 size: "+tblSubcontractor2.size(), true);
			}
			else
			{
				Reporter.log("Error! subcontractor cannot be deleted as invoice exist",true);
				btnSCCancel.click();
				
			}
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			txtSearchSubcontractor.sendKeys(SubcontractorU);
			btnSearchSubcontractor.click();
			Reporter.log("tblSubcontractor2 size: "+tblSubcontractor2.size(), true);
		}
		
	}
	
	public void AddInvoice(WebDriver driver, String Contractor) throws InterruptedException {
		
		Assert.assertEquals(SCpageTitle.getText(), SCpageTitleExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Sub Contractor page", true);
		tblSClnk.click();
		switchwindowForward(driver);
		SCperiodlnk.click();
		switchwindowForward(driver);
		Assert.assertEquals(CISInvoceSumTitle.getText(), CISInvoceSumTitleExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Invoice Summary page", true);
		driver.navigate().refresh();
		//Thread.sleep(2000);
		Reporter.log("btnAddInvoicelst =" +btnAddInvoicelst.size(), true);
		
		if (btnAddInvoicelst.size()==0)
		{
			UndoCIS(driver,Contractor);
		}
		btnAddInvoice.click();
		switchwindowNew(driver);

		btnCancelInvoice.click();
		switchwindowDefault(driver);
		btnAddInvoice.click();
		switchwindowNew(driver);
		Assert.assertEquals(CISAddInvoceTitle.getText(), CISAddInvoceTitleExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Add CIS Invoice page", true);
		
		txtInvoiceDate.clear();
		txtInvoiceDate.sendKeys("06/04/2018");
		
		Select sel= new Select(ddLabourOn);
		sel.selectByVisibleText("Net");

		txtLabourAmount.clear(); 
		txtLabourAmount.sendKeys("10");
//		WaitStatementLib wait=new WaitStatementLib();
//		wait.explicitWait(driver, 10, infoMsg);
		Select sel1= new Select(ddMaterialType);
		sel1.selectByVisibleText("Fuel");
		//Thread.sleep(3000);
		txtMaterialAmount.clear();
		txtMaterialAmount.sendKeys("15");
		txtVatRate.clear();
		txtVatRate.sendKeys("5");
		Select sel2= new Select(ddLabourOn2);
		sel2.selectByVisibleText("Gross");
		txtLabourAmount2.clear();
		txtLabourAmount2.sendKeys("20");
		Select sel3= new Select(ddMaterialType2);
		sel3.selectByVisibleText("Accommodation");
		txtMaterialAmount2.clear();
		txtMaterialAmount2.sendKeys("25");
		txtVatRate2.clear();
		txtVatRate2.sendKeys("10");
		chkAddMore.click();
		txtNote.clear();
		txtNote.sendKeys("Test Test Test");
		//Thread.sleep(2000);
		btnUpload.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\logob.png");
		btnInvoiceSave.click();
		
	}
	
	public void switchwindowNew(WebDriver driver) throws InterruptedException {
			
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	}
	
	public void switchwindowNew1(WebDriver driver, WebElement element) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(element);
		}
	public void switchwindowDefault(WebDriver driver) throws InterruptedException {
				
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	}
	
	public void FileCIS(WebDriver driver) throws InterruptedException {
		
		//Thread.sleep(2000);
		lnkCISFiling.click();
		Assert.assertEquals(titleCISFiling.getText(), titleCISFilingExp,"Header Text is not matching");
		Reporter.log("Header Text verified for CIS Filing page", true);
		if (chkContractorLst.size()>0)
		{
			chkContractor.click();
			btnFileCIS.click();
			Thread.sleep(8000);
			Assert.assertEquals(SuccessIcon.isDisplayed(), true,"Success Icon not displayed");
			Reporter.log("CIS Filing is done successfuly", true);
		//if SuccessIcon.isDisplayed()
		}
		else
		{
			Reporter.log("CIS already Filed", true);
		}
	}
	
	public void SubmitCIS(WebDriver driver, String Contractor) throws InterruptedException {
		CISMenuLnk.click();
		Thread.sleep(2000);
//		lnkSubmitCIS.click();
//		
//		Assert.assertEquals(titleCISSub.getText(), titleCISSubExp,"Header Text is not matching");
//		Reporter.log("Header Text verified for Submit CIS page", true);
//		txtCompanyName.sendKeys(Contractor);
//		btnSearchContractor.click();
//		cbSelect.click();
//		lnkUndo.click();
//
//		AlertAccept(driver);
		
		UndoCIS(driver,Contractor);

		FileCIS(driver);
		lnkSubmitCIS.click();
		Assert.assertEquals(titleCISSub.getText(), titleCISSubExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Submit CIS page", true);
		txtCompanyName.sendKeys(Contractor);
		btnSearchContractor.click();
		cbSelect.click();
		txtNotes.sendKeys("Test Test Test");
		btnDoNotSubmit.click();
		
		//btnSubmitRTI.click();
		
	}
	public void UndoCIS(WebDriver driver, String Contractor)
	{
		lnkSubmitCIS.click();
		
		Assert.assertEquals(titleCISSub.getText(), titleCISSubExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Submit CIS page", true);
		
		txtCompanyName.sendKeys(Contractor);
		btnSearchContractor.click();
		cbSelect.click();
		lnkUndo.click();
	
		AlertAccept(driver);
	}
	
	public void UndoCISFiling(WebDriver driver, String Contractor)
	{
		lnkSubmitCIS.click();
		
		Assert.assertEquals(titleCISSub.getText(), titleCISSubExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Submit CIS page", true);
		
		txtCompanyName.sendKeys(Contractor);
		btnSearchContractor.click();
		if (cbSelectlst.size()>0)
		{
			
			cbSelect.click();
			lnkUndo.click();
		
			AlertAccept(driver);
//		CISDashboard.click();
		
		}
		
		lnkCISSubmissionRpt.click();
		
		if(lnkCISSubmissionlst.size()>0)
		{
			Reporter.log("CIS already submitted", true);
//			lnkCISSubmissionRpt.click();
			lnkCISSubmissiontbl.click();
			AlertAccept(driver);
			//CISDashboard.click();
								
		}
		lnkCISFailedRpt.click();
		if(lnkCISFailedlst.size()>0)
		{
			Reporter.log("CIS already submitted", true);
//			lnkCISFailedRpt.click();
			lnkCISFailedtbl.click();
			AlertAccept(driver);
//			CISDashboard.click();
		}
		CISDashboard.click();
			
	}
	
	public void AlertAccept(WebDriver driver) {	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
	}

	public void PayslipsByContractor(WebDriver driver, String email, String emailBody) throws InterruptedException {
		lnkCISReports.click();
		Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
		Reporter.log("Header Text verified for CIS Reports page", true);
		lnkReportPaySlip.click();
		Assert.assertEquals(titlePayslipsReports.getText(), titlePayslipsReportsExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Payslips Report page", true);
//		Select sel= new Select(ddlFilingPeriod);
//		sel.deselectByVisibleText("06-Apr-18 - 05-May-18");
		String NetPayment=NetPay.getText();
		Reporter.log("NetPayment= "+NetPayment, true);
//		PayslipPdf.click();
//		switchwindowBackward(driver);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		btnEmailPayslip.click();
		Thread.sleep(5000);
		switchwindowNew(driver);
		txtEmailTo.sendKeys(email);
		Thread.sleep(3000);
		//txtBody.sendKeys(emailBody);
		btnSend.click();
		
	}
	
	public void SubcontractorList(WebDriver driver) throws InterruptedException {
		
		int cntSubContRpt=CountSubContractors();
		while (btnSCNextCnt.size()>0)
		{
		btnSCNext.click();
		cntSubContRpt=cntSubContRpt+CountSubContractors();
		}
		Reporter.log("CountSubContractors= " +cntSubContRpt, true);
		lnkCISReports.click();
		Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
		Reporter.log("Header Text verified for CIS Reports page", true);
		lnkReportSCList.click();
		Assert.assertEquals(ttlSubContactorRpt.getText(), ttlSubContactorRptExp,"Header Text is not matching");
		Reporter.log("Header Text verified for Sub Contractor List Report page", true);
		int cntSubContrptExp=roCntSCrpt.size()-1;
		Reporter.log("cntSubContrptExp= " +cntSubContrptExp, true);
		Assert.assertEquals(cntSubContRpt, cntSubContrptExp,"Total count of Subcontractor is not matching");
		Reporter.log("Total count of Subcontractor is matching", true);
		lnkPDF.click();
		Thread.sleep(3000);
		
	}
	
	public int CountSubContractors() {
				
		int cntSC=roCntSC.size()-1;
		return cntSC;
	}

	public String GetFileName(String Folder, String PartialName)  {
	        
 		String folderName = System.getProperty("user.dir")+Folder;
		File[] listFiles = new File(folderName).listFiles();
		String fileName="";
		for (int i = 0; i < listFiles.length; i++) 
		{
			Reporter.log("File Name "+fileName, true);
			if (listFiles[i].isFile()) 
			{
				if ((listFiles[i].getName()).startsWith(PartialName)) 
				{
					fileName=listFiles[i].getName();
					Reporter.log("File Found "+ " " + fileName, true);
					break;
				}
		 		       
			}
	   
		 }	
		 	return fileName;

	}
	
//	 public void readPDFInURL(WebDriver driver, String Folder, String filename, String String1, String String2, String String3) throws EmptyFileException, IOException {
//	        
//	        String filePath = System.getProperty("user.dir");
//	        Reporter.log("filePath" +filePath, true);
//	        driver.get(filePath + Folder + filename);
//	        
//	        URL url = new URL(driver.getCurrentUrl());
//	        InputStream is = url.openStream();
//	        BufferedInputStream fileToParse = new BufferedInputStream(is);
//	        PDDocument document = null;
//	        try {
//	            document = PDDocument.load(fileToParse);
//	            String output = new PDFTextStripper().getText(document);
//	            Reporter.log("PDF data: " +output, true);
//	            Assert.assertTrue(output.contains(String1));
//	            Reporter.log("Text verified for " +String1, true);
//	            Assert.assertTrue(output.contains(String2));
//	            Reporter.log("Text verified for " +String2, true);
//	            Assert.assertTrue(output.contains(String3));
//	            Reporter.log("Text verified for " +String3, true);
//	            Reporter.log("PDF Verified successfully", true);
//	        } finally {
//	            if (document != null) {
//	                document.close();
//	            }
//	            fileToParse.close();
//	            is.close();
//	        }
//
//	    }
	 
	 public void readPDFInURL(WebDriver driver, String Folder, String filename, String String1, String String2) throws EmptyFileException, IOException {
	        
		 	
		 	Reporter.log("Value1 = "+Value1, true);	 
		 	Reporter.log("Value2 = "+Value2, true);	
		 	String filePath = System.getProperty("user.dir");
	        Reporter.log("filePath" +filePath, true);
	        driver.get(filePath + Folder + filename);
	        
	        URL url = new URL(driver.getCurrentUrl());
	        InputStream is = url.openStream();
	        BufferedInputStream fileToParse = new BufferedInputStream(is);
	        PDDocument document = null;
//	        try {
//	            document = PDDocument.load(fileToParse);
////	            String output = new PDFTextStripper().getText(document);
//	            Reporter.log("PDF data: " +output, true);
//	            Assert.assertTrue(output.contains(String1));
//	            Reporter.log("Text verified for " +String1, true);
//	            Assert.assertTrue(output.contains(String2));
//	            Reporter.log("Text verified for " +String2, true);
//	            Assert.assertTrue(output.contains(Value1));
//	            Reporter.log("Text verified for " +Value1, true);
//	            Assert.assertTrue(output.contains(Value2));
//	            Reporter.log("Text verified for " +Value2, true);
//	            Reporter.log("PDF Verified successfully", true);
//	        } finally {
//	            if (document != null) {
//	                document.close();
//	            }
//	            fileToParse.close();
//	            is.close();
//	        }

	    }
	 
	 public void DeleteFilename(WebDriver driver,String filepath,String name) {
		 String filePath1 = System.getProperty("user.dir");

		 File directory = new File(filePath1 + filepath);
		 File[] files = directory.listFiles();
		 Reporter.log("files1: " +files, true);
		 for (File f : files)
		 {Reporter.log("files2: " +files, true);
		     if (f.getName().startsWith(name))
		     {
		    	 Reporter.log("files3: " +files, true);
		       f.delete();
		     }
		 }
	 }
	 
	
	 public void SubContractorsPayTotals(WebDriver driver) throws InterruptedException {
			
			lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkSCPayTtlRpt.click();
			Assert.assertEquals(ttlSCPayTotal.getText(), ttlSCPayTotalExp,"Header Text is not matching");
			Reporter.log("Header Text verified for ALL Sub Contractors Pay Totals Report page", true);
			Select sel=new Select(ddlPeriod);
			sel.selectByValue(ddlperioddate);
			Thread.sleep(2000);
			Value1=AllSCPT_BP.getText();
			Reporter.log("Value1 = "+Value1, true);	
			Value2=AllSCPT_NP.getText();
			Reporter.log("Value2 = "+Value2, true);	
			lnkPDF.click();
			Thread.sleep(3000);
			
		}
		
	 public void SubContractorPayDetails(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkSCPayDetailsRpt.click();
			Assert.assertEquals(ttlSCPayDetails.getText(), ttlSCPayDetailsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for Sub Contractor Pay Details Report page", true);
			Select sel=new Select(ddlFinancialyear);
			sel.selectByVisibleText(ddlFY15);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY16);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY17);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY18);
			Thread.sleep(1000);
			Select sel1=new Select(ddlsubcontractor);
			sel1.selectByVisibleText(ddlSCValue);
			lnkPDF.click();
			//Thread.sleep(3000);
			
		}
	 
	 public void PaymentCert(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkPaymentCertRpt.click();
			Assert.assertEquals(ttlPaymentCert.getText(), ttlPaymentCertExp,"Header Text is not matching");
			Reporter.log("Header Text verified for Payment Certificate page", true);
			lnkPDF.click();
			//Thread.sleep(3000);
			
		}
	 
	 public void CISVerificationCert(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkVerifyCertRpt.click();
			Assert.assertEquals(ttlVerifyCert.getText(), ttlVerifyCertExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Verification Certificate page", true);
			lnkPDF.click();
			btnExport.click();
			//Thread.sleep(3000);
			
		}
	 
	 public void SubmissionReport(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkCISSubRpt.click();
			Assert.assertEquals(ttlCISSubRpt.getText(), ttlCISSubRptExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Submission Report page", true);
			
			if (!ro1.isEmpty())
			{
				lnkCISXML.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlCISXML.getText(), ttlCISXMLExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS XML file page", true);
				switchwindowDefault(driver);
				cboxClose.click();
				switchwindowDefault(driver);
				lnkSubmitted.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlSubmitted.getText(), ttlSubmittedExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS Submission Report page", true);
				switchwindowDefault(driver);
				cboxClose.click();
				
			}
	 }	
	 
	 public void FailedReport(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			lnkCISFailRpt.click();
			Assert.assertEquals(ttlCISFailRpt.getText(), ttlCISFailRptExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Failed Report page", true);
			
			if (!ro1.isEmpty())
			{
				lnkCISXML.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlCISXML.getText(), ttlCISXMLExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS XML file page", true);
				switchwindowDefault(driver);
				cboxClose.click();
				switchwindowDefault(driver);
				lnkSubmitted.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlSubmitted.getText(), ttlSubmittedExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS Failed Report page", true);
				switchwindowDefault(driver);
				cboxClose.click();
			
			}
	 }	
	 
	 public void CIS300MonthlyReturn(WebDriver driver) throws InterruptedException {
			
		 	lnkCISReports.click();
			Assert.assertEquals(titleCISReports.getText(), titleCISReportsExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Reports page", true);
			hrefReportCISNilReturn.click();
			Assert.assertEquals(ttlCIS300Rpt.getText(), ttlCIS300RptExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS300 Monthly Return Report page", true);
			Select sel=new Select(ddlCIS300TaxYear);
			sel.selectByVisibleText(ddlFY15);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY16);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY17);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY18);
			Thread.sleep(1000);
			Value1=CIS300_TP.getText();
			Reporter.log("Value1 = "+Value1, true);	
			Value2=CIS300_AD.getText();
			Reporter.log("Value2 = "+Value2, true);
			lnkPDF.click();
			Thread.sleep(3000);
			
		}
	 
	 public void CISSubmissionRptAll(WebDriver driver) throws InterruptedException {
			
			//Thread.sleep(2000);
			lnkCISSubmissionRpt.click();
			
			Assert.assertEquals(ttlCISSubRpt.getText(), ttlCISSubRptExp,"Header Text is not matching");
			Reporter.log("Header Text verified for CIS Submission Report page", true);
			
			Select sel = new Select(ddlFinancialyear);
			sel.selectByVisibleText(ddlFY15);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY16);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY18);
			Thread.sleep(1000);
			sel.selectByVisibleText(ddlFY17);
			Thread.sleep(1000);
			
			if (!ro1.isEmpty())
			{
				lnkCISXML.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlCISXML.getText(), ttlCISXMLExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS XML file page", true);
				switchwindowDefault(driver);
				cboxClose.click();
				switchwindowDefault(driver);
				lnkSubNotSub.click();
				switchwindowNew(driver);
				Assert.assertEquals(ttlSubmitted.getText(), ttlSubmittedExp,"Header Text is not matching");
				Reporter.log("Header Text verified for CIS Submission Report page", true);
				switchwindowDefault(driver);
				cboxClose.click();
				switchwindowDefault(driver);
				lnkUndoSubRpt.click();
				AlertAccept(driver);
				

			}
	 }
	 
	 public void ClickSaveAs(WebDriver driver) throws InterruptedException, AWTException{
		 Thread.sleep(3000);
		 Actions myAction = new Actions(driver);
		 myAction.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL);
		 Thread.sleep(3000);
		 myAction.perform();
		 Thread.sleep(3000);
		 
//		Thread.sleep(3000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_S);
//		robot.setAutoDelay(2000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.setAutoDelay(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.setAutoDelay(2000);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.setAutoDelay(2000);
//		Thread.sleep(3000);
	 }

}

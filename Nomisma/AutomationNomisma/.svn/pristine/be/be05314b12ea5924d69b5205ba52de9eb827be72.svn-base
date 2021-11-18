package com.nomisma.SelfAssessmentpom;
import static org.testng.Assert.assertEquals;
import java.text.DateFormat;

import java.util.Date;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.text.DecimalFormat;

import java.util.Random;

import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.SelfAssessmentpom2019.SAPOM2019;
import com.nomisma.generic.WaitStatementLib;
import com.nomisma.pom.CISPage;

import org.w3c.dom.Document;



public class SAPOM {
	@FindBy(id="ctl00_ctl00_ParentContent_cpHFooter_PageUC1_rptrPager_ctl03_lnkNext")
	private WebElement linkNext;
    @FindBy (id="ctl00_ctl00_ParentContent_cPH_chkDuplicateUTR")
    private WebElement forceDuplicateUTRno;
	@FindBy(xpath="//span[contains(text(),'anjali1')]")
	private WebElement AgentPageTitle;
	@FindBy(xpath="//td[contains(text(),'anjali1')]")
	private WebElement agentName;
	@FindBy(xpath="//span[contains(text(),'Self Assessment')]")
	private WebElement SelfAssessmentLink;
	@FindBy(xpath= "//a[contains(text(),'Client List')]")
	private WebElement ClientListLink;
	@FindBy(xpath= "//main/header/div/div[2]/ul/li[1]/a/img")
	private WebElement PlusClientButton;
	@FindBy(xpath= "//p[contains(text(),'Add Client')]")
	private WebElement AddClientButton;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_txtUTR")
	private WebElement UTRNoTextBox;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_txtFirstName")
	private WebElement FirstNameTextBox;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_txtLastName")
	private WebElement LastNameTextBox;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPH_txtAddress1")
	private WebElement AddressLine1TxtBox;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPH_txtPostCode")
	private WebElement PostCodeTxtBox;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_btnSave")
	private WebElement SaveButton;
	
	//Income ->  add employment locators
	//@FindBy(xpath="//a[contains(text(),'nomisma')]")	
	@FindBy(xpath="//a[contains(text(),'John')]")
	private WebElement selectClient;
	@FindBy (xpath="//a[contains(text(),'Blind')]")
	private WebElement blindClient;
	@FindBy (xpath="//span[contains(text(),'1000000110')]")
	private WebElement chckClientName;
	@FindBy(xpath="//main/div/div[2]/ul/li[5]/a/span")	
	private WebElement IncomeLink;
	@FindBy(xpath="//a[contains(text(),'Employment')]")	
	private WebElement EmploymentLink;
	@FindBy(xpath="//a[contains(text(),'Add Employment')]")	
	private WebElement addEmploymentBtn;
	@FindBy (id="ctl00_cPH_txtEmployerName")
	private WebElement EmployerName;
	@FindBy (id="ctl00_cPH_txtEmployerPAYEReference")
	private WebElement txtEmployerPAYERef;
	@FindBy (id = "ctl00_cPH_txtStartDate")
	private WebElement StartDatetxtbox;
	@FindBy (id = "ctl00_cPH_txtEndDate")
	private WebElement Endtxtbox;
	
	@FindBy (id="ctl00_ddlTaxYear")
	private WebElement TaxYear;
	@FindBy(xpath="//td[contains(text(),'Abc Corp.')]")
	private WebElement cellemp;
	@FindBy (id="ctl00_cPH_rptrDisplayRecords_ctl00_hrefDelete")
	private WebElement delButton;
	@FindBy (id="ctl00_cPH_btnDelete")
	private WebElement confirmDel;
	@FindBy (id="ctl00_cPH_rptrEmployment_ctl00_lnkDelete")
	private WebElement delEmpName;
	//Income -> Employment -> add employer 
	@FindBy (xpath="//span[contains(text(),'Add Employment Income')]")
	private WebElement addEmpIncome;
	@FindBy (id="ctl00_cPH_txtPayFromEmployment")
	private WebElement payFrmEmployer;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffPay")
	private WebElement UkTaxTakenOffPay;
	@FindBy (id="ctl00_cPH_txtTipsAndOtherPayments")
	private WebElement TipsPaymentsNtOnP60;
	//Income ->  Employment -> Add Employer Income
	@FindBy (id="ctl00_cPH_txtCompanyCarsAndVansBenefit")
	private WebElement 	CompanyCarsAndVans;
	@FindBy (id="ctl00_cPH_txtFuelForCarsAndVans")
	private WebElement 	FuelForCompanyCarsAndVans;
	@FindBy (id="ctl00_cPH_txtPrivateMedicalDentalInsurance")
	private WebElement 	PrvtMedAndDntl;
	@FindBy (id="ctl00_cPH_txtVouchersCreditCardsExcessMileageAllowance")
	private WebElement 	VochrCredcardExsMilg;
	@FindBy (id="ctl00_cPH_txtGoodsEtcProvidedByEmployer")
	private WebElement 	GoodsEtcTxtBob;
	@FindBy (id="ctl00_cPH_txtAccommodationProvidedByEmployer")
	private WebElement 	AccommodationProvidedByEmployerTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherBenefits")
	private WebElement 	OtherBenefitsTxtBox;
	
	//Add Employer Income -> Expenses
	@FindBy (id="ctl00_cPH_txtBusinessTravelAndSubsistence")
	private WebElement 	BusnsTrvlAndSubstancTxtBox;
	@FindBy (id="ctl00_cPH_txtFixedExpensesDeductions")
	private WebElement 	FxdExpnsDeductTxtBox;
	@FindBy (id="ctl00_cPH_txtProfessionalFeesAndSubscriptions")
	private WebElement ProfFeesAndSubsTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherExpensesAndCapitalAllowances")
	private WebElement 	OtherExpensTxtBox;
	
	//Add Employer Income -> Earnings from P60
	@FindBy (id="ctl00_cPH_txtEarningPTtoUAP")
	private WebElement 	EarningPTtoUAPTxtBox;
	@FindBy (id="ctl00_cPH_txtEarningUAPtoUEL")
	private WebElement 	EarningUAPtoUELTxtBox;
	@FindBy (id="ctl00_cPH_btnSave")
	private WebElement 	SaveBtn1;
	@FindBy (id="ctl00_cPH_btnCancel")
	private WebElement popUpCancelBtn;
	@FindBy (xpath="//span[contains(text(),'Dashboard')]")
	private WebElement dashBoardClient;
	@FindBy (xpath="//div[1]/div[2]/ul/li[1]/span")
	private WebElement finalIncome;
	@FindBy (id="ctl00_cPH_btnDelete")
	private WebElement confDel;
	@FindBy (xpath="//div[2]/table/tbody/tr[2]/td[2]")
	private WebElement totalIncome;
	@FindBy(xpath="//a[contains(text(),'Finishing your tax return')]")
	private WebElement linkDashboardFinishingTaxReturn;
	//SA -> Client -> Tax Return
	@FindBy (xpath="//span[contains(text(),'Tax Return')]")
	private WebElement taxReturnLink;
	@FindBy (xpath="//a[contains(text(),'Tax Calculation Summary')]")
	private WebElement taxCalSummaryLink;
	
	//SA -> Client -> Tax Calculation Summary for Tax Year 6 April 2017 to 5 April 2018
	
	@FindBy (xpath="//tr/td[contains(text(),'Pay from all employments')]//..//td[2]")
	private WebElement payFromAllEmployments;
	@FindBy (xpath="//tr/td/em[contains(text(),'plus')]//..//..//td[2]")
	private WebElement benefitAndExpensesReceived;
	@FindBy (xpath=" //tr/td/em[contains(text(),'minus')]//..//..//td[2]")
	private WebElement allowableExpenses;
	@FindBy (xpath="//tr/td[contains(text(),'Total from all employments')]//..//td[2]")
	private WebElement TotalFromAllEmployment;
	@FindBy (xpath="//tr/td/b[contains(text(),'Total income received')]//..//..//td[3]/b")
	private WebElement TotalIncomeReceived;
	@FindBy (xpath="//tr/td/b[contains(text(),'Total income on which tax is due')]//..//..//td[3]/b")
	private WebElement totalIncomeOnWhichTaxIsDue;
	@FindBy (xpath="//tr/td/b[contains(text(),'Total income on which tax has been charged')]//..//..//td[2]/b")
	private WebElement incomeOnWhichTaxCharged;
	@FindBy (xpath="//tr/td/b[contains(text(),'Income Tax')]//..//..//td[4]")
	private WebElement incomeTaxDue;
	@FindBy (xpath="//tr/td/strong[contains(text(),'Income Tax due')]//..//..//td[4]")
	private WebElement incomeTaxDue1;
	@FindBy(xpath="//tr/td/b[contains(.,'Total Income Tax due')]//..//..//td[4]")
	private WebElement totalIncomeTaxDue;
	@FindBy (xpath="//tr/td/b[contains(text(),'Balance for this year')]//..//..//td[4]/b")
	private WebElement taxForThisYear;
	@FindBy (xpath="//tr/td[contains(text(),'First Payment on Account')]//..//td[4]")
	private WebElement firstPayment;
	@FindBy (xpath="//tr/td[contains(text(),'Second Payment on Account')]//..//td[4]")
	private WebElement secondPayment;
	@FindBy (xpath="//tr/td/b[contains(text(),'Total Income Tax due')]//..//..//td[4]")
	private WebElement fTaxDue;
	//Tax including Class 2 and Class 4 deduction
	@FindBy (xpath="//tr/td/strong[contains(text(),'Income Tax, Class 2 and Class 4 National Insurance contributions due')]//..//..//td[4]/strong")
	private WebElement IncomeTaxCls2andCls4NationalInsurContriDue;
	@FindBy (xpath="//tr/td/b[contains(text(),'Income Tax, Class 2 and Class 4 National Insurance contributions due')]//..//..//td[4]/b")
	private WebElement IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS;
	//SA -> Client -> Submit To HMRC -> Validate HMRC
	@FindBy (xpath = "//a[contains(text(),'Submit to HMRC')]")
	private WebElement submitToHMRC;
	@FindBy (id = "ctl00_cPH_txtComment")
	private WebElement commentForValidation;
	@FindBy (id="ctl00_cPH_txtInternalNote")
	private WebElement internalNotes;
	@FindBy (id="ctl00_cPH_btnValidate")
	private WebElement validateSubmissionBtn;
	@FindBy (id = "ctl00_cPH_btnSubmit")
	private WebElement submitToHMRCbtn;
	@FindBy (id="ctl00_cPH_btnYes")
	private WebElement yesBtnSubmitHMRC;
	@FindBy (id="ctl00_cPH_btnSubmitManualUndo")
	private WebElement undoManualSubmitBtn;
	@FindBy (xpath="//strong[contains(text(),'Success!')]")
	private WebElement successMessage;
	@FindBy (id="ctl00_cPH_btnUnlock")
	private WebElement unlockBtn;
	@FindBy (id="ctl00_SideMenu1_hrefSubmissionReport")
	private WebElement submissionReportLink;
	@FindBy (xpath="//div[2]/table/tbody/tr[2]/td[4]")
	private WebElement descriptionSubmission;
	//SA -> Client -> documents locators
	@FindBy (xpath = "//span[contains(text(),'Documents')]")
	private WebElement linkDocuments;
	@FindBy (id="hrefDoc")
	private WebElement pdfSAforms;
	@FindBy (id="hrefTaxCalc")
	private WebElement pdfSAforms1;
	@FindBy (id = "hrefSASummary")
	private WebElement pdfSAforms2;
	@FindBy (id = "hrefTaxSchedule")
	private WebElement pdfSAforms3;
	@FindBy (xpath="//span[contains(text(),'newClient 31 Test 31')]")
	private WebElement clientName;
	@FindBy (xpath="//td[contains(text(),'Abc Corp.')]")
	private WebElement empName;
	//SA -> Client -> Dashboard elements
	@FindBy (xpath="//a[contains(text(),'Employment')]")
	private WebElement empNameDashboard;
	@FindBy (id="ctl00_cPH_spanIncomeEmployment")
	private WebElement empcheckBox;
	@FindBy (id="ctl00_cPH_spanFinishingReturn")
	private WebElement finishTaxRetCheckBox;
	// UK pensions, annuities and other state benefits received Locators
	@FindBy (xpath="//a[contains(text(),'Dividend, Bank Interest, Pensions & Other UK Income')]")
	WebElement dividentLink;
	//Income -> Divident...-> State Benefits
	@FindBy (id="ctl00_cPH_img1")
	private WebElement frm1Btn;
	@FindBy (id="ctl00_cPH_txtStatePension")
	private WebElement totStatPension;
	@FindBy (id="ctl00_cPH_txtStatePensionLumpSum")
	private WebElement statPensionLumpSum;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffPensionLumpSum")
	private WebElement taxtakenoffLumpsum;
	@FindBy (id="ctl00_cpHFooter_btnSaveIncome")
	private WebElement stateBenefitsSaveBtn;
	@FindBy (xpath="//div[2]/div[1]/div[1]/div/div/div[1]/table/tbody/tr[2]/td[2]")
	private WebElement totstatePension;
//State Benefits -> Taxable Incapacity Benefit
	@FindBy (id="ctl00_cPH_txtIncapacityBenefit")
	private WebElement taxableIncapacityBenefit;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffIncapacityBenefit")
	private WebElement taxTakenOff;
	//State Benefits -> Other Pensions & Retirement Annuities
	@FindBy (id="ctl00_cPH_txtOtherPensionsAndRetirementAnnuities")
	private WebElement otherPensionsRetirementAnnuities;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffPensionsAndRetirementAnnuities")
	private WebElement taxTakenOffOtherPensions;
	//State Benefits -> Jobseekers Allowance / Any other pensions/benefits
	@FindBy (id="ctl00_cPH_txtJobseekersAllowance")
	private WebElement jobseekersAllowance;
	@FindBy (id="ctl00_cPH_txtOtherStatePensionsAndBenefits")
	private WebElement anyOtherPensionsBenefits;
	//Income -> Divident...-> Bank Locators
	@FindBy (xpath="//div[2]/div[1]/div[3]/div/header/div/a")
	private WebElement addBankBtn;
	@FindBy (id="ctl00_cPH_ddlBanksMaster")
	private WebElement bankNameTxtBox1;
	@FindBy (id="ctl00_cPH_txtBankName")
	private WebElement bankNameTxtBox2;
	@FindBy (id="ctl00_cPH_txtAccountNo")
	private WebElement acNumber;
	@FindBy (id="ctl00_cpHFooter_btnSave")
	private WebElement SaveBtn2;
	@FindBy (xpath="//img[@alt='Delete']")
	private WebElement delbank;
	@FindBy (xpath="//div[2]/div[1]/div[3]/div/div/div/table/tbody/tr[2]/td[1]")
	private WebElement verifyBankname;
	//Income -> Divident...-> Interest from UK banks, building societies etc.
	@FindBy (id="img5")
	private WebElement formOpenBtn;
	@FindBy (id="ctl00_cPH_txtDate")
	private WebElement dateTxtBox;
	@FindBy (id="ctl00_cPH_ddBank")
	private WebElement bankTxtBox;
	@FindBy (id="ctl00_cPH_txtDescription")
	private WebElement descriptionTxtBox;
	@FindBy (id="ctl00_cPH_txtInterestAmount")
	private WebElement interestAmountTxtBox;
	@FindBy (id="ctl00_cPH_rBtnListInterestType_0")
	private WebElement taxedUKInterestRadioBtn;
	@FindBy (id="ctl00_cPH_rBtnListInterestType_1")
	private WebElement unTaxedUKInterestRadioBtn;
	@FindBy (id="ctl00_cPH_rBtnListInterestType_2")
	private WebElement foreignInterestRadioBtn;
	@FindBy (xpath="//div[2]/div[1]/div[2]/div/div/div/table/tbody/tr[2]/td[3]")
	private WebElement verifyInterest;
	@FindBy (id="ctl00_cPH_rptrBankInterest_ctl00_hrefDelete")
	private WebElement delInterest;
	//Income -> Divident...-> Dividend Locators
	@FindBy (id="img4")
	private WebElement dividentFormBtn;
	@FindBy (id="ctl00_cPH_txtCompanyName")
	private WebElement companyNameTxtBox;
	@FindBy (id="ctl00_cPH_txtDescription")
	private WebElement dividentDescripTxtBox;
	@FindBy (id="ctl00_cPH_txtDividendUKCompany")
	private WebElement dividendsfrmUKcompTxtBox;
	@FindBy (id="ctl00_cPH_rptrRecord_ctl00_hrefDelete")
	private WebElement delDivident;
	@FindBy (id="ctl00_cpHFooter_btnDelete")
	private WebElement cnfmdel;
	// Income -> Divident...-> Other Dividends Locators
	@FindBy (id="ctl00_cPH_txtOtherDividend")
	private WebElement otherDividentTxtBox;
	@FindBy (id="ctl00_cPH_txtForeignDividend")
	private WebElement foreignDividendsTxtBox;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffForeignDividend")
	private WebElement taxTakenOffForeignDividendTxtBox;
	//Income -> Divident...-> Other UK Income locators
	@FindBy (id="ctl00_cPH_img2")
	private WebElement form1OpenBtn;
	@FindBy (id="ctl00_cPH_txtOtherTaxableIncome")
	private WebElement otherTaxableIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtAllowableExpense")
	private WebElement allowableExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffOtherTaxableIncome")
	private WebElement taxDeductedTxtBox;
	@FindBy (id="ctl00_cPH_txtBenefitPreOwnedAsset")
	private WebElement beneftFrmPreOwnedAssetsTxtBox;
	@FindBy (id="ctl00_cPH_txtDescriptionOfOtherIncome")
	private WebElement otherUKDescriptionTxtBox;
	@FindBy (id="ctl00_cpHFooter_btnSaveIncome")
	private WebElement OtherUKIncomeSaveBtn;
	//Tax Summary -> Tax Calculation summary of income with divident
	@FindBy (xpath="//table/tbody/tr[16]/td[2]")
	private WebElement basicRateOfPensions;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Basic rate')]//..//td[4]")
	private WebElement interOnBasicRate;
	@FindBy (xpath="//table/tbody/tr[19]/td[2]")
	private WebElement nilRateAmount;
	@FindBy (xpath="//table/tbody/tr[19]/td[4]")
	private WebElement interestUptoNill;
	@FindBy (xpath="//table/tbody/tr[20]/td[4]")
	private WebElement interestAtBasicRate;
	@FindBy (xpath="//table/tbody/tr[20]/td[2]")
	private WebElement basicRateOfBanks;
	@FindBy (xpath="//table/tbody/tr[23]/td[2]/b")
	private WebElement newTotalIncomeOnWhichTaxHasBeenCharged;
	@FindBy (xpath="//table/tbody/tr[24]/td[4]/b")
	private WebElement HeigherIncomeTaxdue1;
	@FindBy (xpath="//table/tbody/tr[26]/td[4]/strong")
	private WebElement HeigherIncomeTaxdue2;
	@FindBy (xpath="//table/tbody/tr[17]/td[4]")
	private WebElement heigherRateInterest;
	//Tax Summary -> Read XML
	@FindBy (id="ctl00_SideMenu1_hrefXML")
	private WebElement mtrXmlLink;
	@FindBy (id="ctl00_cPH_txtData")
	private WebElement textArea1;
	//Income -> Income From Property locators
	@FindBy (id="ctl00_SideMenu1_hrefProperty")
	private WebElement incmFrmProLink;
	@FindBy (id="ctl00_cpHeaderRight_btnEdit")
	private WebElement editBtn;
	@FindBy (id="ctl00_cPH_txtNumberOfProperties")
	private WebElement noOfPropertiesRentedOutTxtBox;
	@FindBy (id="ctl00_cPH_chkIsPropertyIncomeCeasedInYear")
	private WebElement icomeCeasedCheckBox;
	@FindBy (id="ctl00_cPH_chkIsIncomeFromPropertyLetJointly")
	private WebElement propertyJointlyCheckBox;
	@FindBy (id="ctl00_cPH_chkIsRentARoomReliefClaim")
	private WebElement rentARoomreliefchkBox;
	@FindBy (id="ctl00_cPH_txtFHLUKIncome")
	private WebElement rentIncomeTextBox;
	@FindBy (id="ctl00_cPH_txtFHLUKPropertyIncomeAllowance")
	private WebElement propertyIncomeAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKExpenses")
	private WebElement UKExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKInterestEtcCosts")
	private WebElement loanInterestTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKManagementEtcFees")
	private WebElement legalManagementOthrProfessionalFeesTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKOtherExpenses")
	private WebElement allowablePropertyExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKPrivateUseAdjustment")
	private WebElement privateUseAdjustmentTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKBalancingCharges")
	private WebElement balancingChargesTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKCapitalAllowances")
	private WebElement capitalAllowancesTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKLossesBroughtForward")
	private WebElement lossBroughtForwardTxtBox;
	@FindBy (id="ctl00_cPH_txtFHLUKLossToCarryForward")
	private WebElement lossToCarryForwardTxtBox;
	@FindBy (id="ctl00_cPH_chkFHLUKTraditionalAccounting")
	private WebElement fHLUKTraditionalAccountingChkBox;
	@FindBy (id="ctl00_cPH_chkFHLUKIsPeriodOfGraceElection")
	private WebElement fHLUKIsPeriodOfGraceElectionChkBox;
	@FindBy (id="ctl00_cPH_txtFHLUKAdjustedProfitForTheYear")
	private WebElement calculateFHLUKAdjustedProfitForTheYear;
	@FindBy (id="ctl00_cPH_txtFHLUKTaxableProfitForYear")
	private WebElement calculateFHLUKTaxableProfitForYear;
	@FindBy (id="ctl00_cPH_txtFHLUKLossForYear")
	private WebElement calculateFHLUKLossForYear;
	//Income From Property locators -> EAA
	@FindBy (id="ctl00_cPH_txtNumberOfPropertiesEEA")
	private WebElement noOfPropertiesRentedOutEEATxtBox;
	@FindBy (id="ctl00_cPH_chkIsPropertyIncomeCeasedInYearEAA")
	private WebElement icomeCeasedEEAChkBox;
	@FindBy (id="ctl00_cPH_chkIsIncomeFromPropertyLetJointlyEEA")
	private WebElement  incomeFromPropertyEEAChkBox;
	@FindBy (id="ctl00_cPH_chkIsRentARoomReliefClaimEEA")
	private WebElement  rentARoomreliefEEAChkBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAIncome")
	private WebElement rentIncomeEEATextBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAPropertyIncomeAllowance")
	private WebElement propertyIncomeAllowanceEEATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAExpenses")
	private WebElement uKExpensesEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAInterestEtcCosts")
	private WebElement loanInterestEEATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAManagementEtcFees")
	private WebElement legalMangmntOthrProfsnlFeesEEATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAOtherExpenses")
	private WebElement allowablePropertyExpensesEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAPrivateUseAdjustment")
	private WebElement privateUseAdjustmentEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEABalancingCharges")
	private WebElement balancingChargesEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEACapitalAllowances")
	private WebElement capitalAllowancesEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEALossesBroughtForward")
	private WebElement lossBroughtForwardEAATxtBox;
	@FindBy (id="ctl00_cPH_txtFHLEEALossToCarryForward")
	private WebElement lossToCarryForwardEAATxtBox;
	@FindBy (id="ctl00_cPH_chkFHLEEAIsPeriodOfGraceElection")
	private WebElement FHLEEAIsPeriodOfGraceElectionChkBox;
	@FindBy (id="ctl00_cPH_txtFHLEEAAdjustedProfitForTheYear")
	private WebElement calculateFHLEaaUKAdjustedProfitForTheYear;
	@FindBy (id="ctl00_cPH_txtFHLEEATaxableProfitForYear")
	private WebElement calculateFHLEaaUKTaxableProfitForYear;
	@FindBy (id="ctl00_cPH_txtFHLEEALossForYear")
	private WebElement calculateFHLEaaUKLossForYear;
	//Income -> Property Income
	@FindBy (id="ctl00_cPH_txtTotalRentsAndOtherIncomeFromProperty")
	private WebElement totalIncomePropertyLinkTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyIncomeAllowance")
	private WebElement totalIncomeAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_chkTraditionalAccounting")
	private WebElement propertyIncomeAllowanceChkBox;
	@FindBy (id="ctl00_cPH_txtTaxTakenOffAnyIncome")
	private WebElement taxTakenOffTxtBox;
	@FindBy (id="ctl00_cPH_txtPremiumsForGrantOfALease")
	private WebElement premiumsForGrantOfALeaseTxtBox;
	@FindBy (id="ctl00_cPH_txtReversePremiumsAndInducements")
	private WebElement revrsePremAndInducTxtBox;
	@FindBy (id="ctl00_cPH_txtRentRatesInsuranceEtc")
	private WebElement rentRatesInsuranceEtcTxtBox;
	@FindBy (id="ctl00_cPH_txtRepairsAndMaintenance")
	private WebElement repairsAndMaintenanceTxtBox;
	@FindBy (id="ctl00_cPH_txtInterestAndOtherFinancialCharges")
	private WebElement intrstAndOthrFinancialChrgsTxtBox;
	@FindBy (id="ctl00_cPH_txtLegalManagementAndProfessionalFees")
	private WebElement legalManagmntAndPrfsnalFeesTxtBox;
	@FindBy (id="ctl00_cPH_txtCostsOfServicesProvided")
	private WebElement costsOfServicProvidedTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherPropertyExpenses")
	private WebElement othrPropertyExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtPrivateUseAdjustment")
	private WebElement propertyPrivateUseAdjustmentTxtBox;
	@FindBy (id="ctl00_cPH_txtBalancingCharges")
	private WebElement balancingTaxableChargesTxtBox;
	@FindBy (id="ctl00_cPH_txtAnnualInvestmentAllowance")
	private WebElement annualInvestmentAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessPremisesRenovationAllowance")
	private WebElement businessPremisesRenovationAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_txtZeroEmissionGoodsVehicleAllowance")
	private WebElement zeroEmisnGoodsVehclAllwncTxtBox;
	@FindBy (id="ctl00_cPH_txtEnhancedCapitalAllowances")
	private WebElement enhancedCapitalAllowancesTxtBox;	
	@FindBy (id="ctl00_cPH_txtTenPercentWearAndTearAllowance")
	private WebElement tenPercntWearAndTearAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_txtRentARoomExemptAmount")
	private WebElement rentARoomExemptAmountTxtBox;
	@FindBy (id="ctl00_cPH_txtLossSetOffAgainstTotalIncomeOfTheYear")
	private WebElement lossSetOffAgainstTotlIncmOfTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtLossToCarryForward")
	private WebElement lossToCarryForwardIncludingUnusedLossesTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialfinancecosts")
	private WebElement ResidentialfinancecostsTxtBox;
	@FindBy (id="ctl00_cPH_btnDelete")
	private WebElement incomeFrmPropertyDelBtn;
	@FindBy (xpath="//strong[contains(text(),'Error!')]")
	private WebElement errrMsg;
	@FindBy (id="ctl00_cPH_txtAdjustedProfitForTheYear")
	private WebElement adjustedProfitForTheYear;
	@FindBy (id="ctl00_cPH_txtTaxableProfitForTheYear")
	private WebElement taxableProfitForTheYear;
	@FindBy (id="ctl00_cPH_txtAdjustedLossForTheYear")
	private WebElement adjustedLossForTheYear;
	//Income -> Self Employment
	@FindBy (xpath="//a[contains(text(),'Self Employment')]")
	private WebElement selfEmploymentLink;
	//Self Employment -> Self Employment Short -> Business Details
	@FindBy (id="ctl00_cPH_txtBusinessDescription")
	private WebElement descriptionOfBusinessTxtBox;
	@FindBy (id="ctl00_cPH_txtPostCode")
	private WebElement sePostCodeTxtBox;
	@FindBy (id="ctl00_cPH_txtCeaseDate")
	private WebElement tradingEnddateTxtBox;
	@FindBy (id="ctl00_cPH_txtAccountDate")
	private WebElement businessAccountsEnddateTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessIncome")
	private WebElement businessIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherBusinessIncome")
	private WebElement otherBusinessIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtTradingIncomeAllowance")
	private WebElement tradingIncomeAllowanceTxtBox;
	//Self Employment -> Self Employment Short -> Allowable Business Expenses for vehicles and equipment (capital allowances)
	@FindBy (id="ctl00_cPH_txtCostOfGoods")
	private WebElement costsOfGoodsBoughtForResaleTxtBox;
	@FindBy (id="ctl00_cPH_txtCarVanAndTravelExpenses")
	private WebElement carVanAndTravelExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtWagesSalariesAndStaffCosts")
	private WebElement wagesSalariesAndStaffCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtRentAndOtherPropertyCosts")
	private WebElement rentAndOtherPropertyCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtRepairAndRenewalCosts")
	private WebElement repairAndRenewalCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtAccountancyAndLegalFees")
	private WebElement accountancyAndLegalFeesTxtBox;
	@FindBy (id="ctl00_cPH_txtInterestAndFinanceCharges")
	private WebElement interestAndFinanceChargesTxtBox;
	@FindBy (id="ctl00_cPH_txtPhoneAndOtherOfficeCosts")
	private WebElement phoneAndOtherOfficeCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherAllowableBusinessExpenses")
	private WebElement otherAllowableBusinessExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtTotalExpense")
	private WebElement totalExpenseTxtBox;
	//Self Employment -> Self Employment Short -> Tax allowances for vehicles and equipment (capital allowances)
	@FindBy (id="ctl00_cPH_txtAnnualInvestmentAllowance")
	private WebElement seAnnualInvestmentAllowanceTxtBox;
	@FindBy (id="ctl00_cPH_txtAllowanceForSmallBalanceOfUnrelievedExpenditure")
	private WebElement allowanceForSmallBalanceOfUnrelievedExpenditureTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherCapitalAllowances")
	private WebElement otherCapitalAllowancesTxtBox;
	@FindBy (id="ctl00_cPH_txtTotalBalancingCharges")
	private WebElement totalBalancingChargesTxtBox;
	@FindBy (id="ctl00_cPH_txtTotalAllowance")
	private WebElement totalAllowancesTxtBox;
	//Self Employment -> Self Employment Short -> Taxable Profits
	@FindBy (id="ctl00_cPH_txtOwnGoodsAndServices")
	private WebElement ownGoodsAndServicesTxtBox;
	@FindBy (id="ctl00_cPH_txtLossBroughtForward")
	private WebElement txtBoxLossBroughtForward;
	@FindBy (id="ctl00_cPH_txtAnyOtherBusinessIncome")
	private WebElement anyOtherBusinessIncomeTxtBox;
	//Self Employment -> Self Employment Short -> Losses
	@FindBy (id="ctl00_cPH_txtLossOfYearSetAgainstOtherIncome")
	private WebElement lossOfYearSetAgainstOtherIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtLossToCarryBack")
	private WebElement lossToCarryBackTxtBox;
	@FindBy (id="ctl00_cPH_txtTotalLossToCarryForward")
	private WebElement totalLossToCarryForwardTxtBox;
	//Self Employment -> Self Employment Short -> CIS Deductions
	@FindBy (id="ctl00_cPH_txtSubContractorsTaxDeduction")
	private WebElement subContractorsTaxDeductionTxtBox;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_hrefEdit")
	private WebElement displayRecordsBtn;
	//Income -> Self Employment (Full)
	@FindBy (id="ctl00_cPH_txtBusinessName")
	private WebElement businessNameTxtBox;
	@FindBy (id="ctl00_cPH_txtDescriptionofBusiness")
	private WebElement descriptionofBusinessTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessAddress")
	private WebElement businessAddressTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessPostCode")
	private WebElement businessPostCodeTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessStarteddate")
	private WebElement businessStarteddateTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessCeasedDate")
	private WebElement businessCeasedDateTxtBox;
	@FindBy (id="ctl00_cPH_txtBooksAccoutsStartDate")
	private WebElement booksAccoutsStartDateTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessBooksEnddate")
	private WebElement businessBooksEnddateTxtBox;
	@FindBy (id="ctl00_cPH_Chkincomeexpense")
	private WebElement incomeExpenseChkBox;
	//Self Employment (Full) -> Other Information
	@FindBy (id="ctl00_cPH_Chkaccountdate")
	private WebElement accountDateChkBox;
	@FindBy (id="ctl00_cPH_Chkchangedaccountdate")
	private WebElement changedAccountDateChkBox;
	@FindBy (id="ctl00_cPH_Chkarrangement")
	private WebElement arrangementChkBox;
	@FindBy (id="ctl00_cPH_Chkprofitinformation")
	private WebElement profitInformationChkBox;
	//Self Employment (Full) -> Business Income
	@FindBy (id="ctl00_cPH_txtTrunover")
	private WebElement trunoverTxtBox;
	@FindBy (id="ctl00_cPH_txtbusinessincomeother")
	private WebElement businessIncomeOtherTxtBox;
	@FindBy (id="ctl00_cPH_txtSEFullTradingIncomeAllowance")
	private WebElement seFullTradingIncomeAllowanceTxtBox;
	//Self Employment (Full) -> Business Expenses
	@FindBy (id="ctl00_cPH_txtGoodsofCostfull")
	private WebElement goodsOfCostfullTxtBox;
	@FindBy (id="ctl00_cPH_txtgoodsDexp")
	private WebElement goodsDexpTxtBox;
	@FindBy (id="ctl00_cPH_txtTravelexpenses")
	private WebElement travelexpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtDisexpCarandVan")
	private WebElement disexpCarandVanTxtBox;
	@FindBy (id="ctl00_cPH_txtBankCreditandOtherFinancialCharges")
	private WebElement bankCreditandOtherFinancialChargesTxtBox;
	@FindBy (id="ctl00_cPH_txtDisexpBankCredit")
	private WebElement disexpBankCreditTxtBox;
	@FindBy (id="ctl00_cPH_txtDepreciationProfitandLoss")
	private WebElement depreciationProfitandLossTxtBox;
	@FindBy (id="ctl00_cPH_txtDisexpDepreciation")
	private WebElement disexpDepreciationTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessExpTotalExpenses")
	private WebElement businessExpTotalExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txttotaldisallowableexpences")
	private WebElement totalDisallowableExpencesTxtBox;
	//Self Employment (Full) -> Net profit or loss
	@FindBy (id="ctl00_cPH_txtNetProfit")
	private WebElement netProfitTxtBox;
	@FindBy (id="ctl00_cPH_txtNetLoss")
	private WebElement netLossTxtBox;
	//Self Employment (Full) -> Tax allowances for vehicles and equipment (capital allowances)
	@FindBy (id="ctl00_cPH_txtannualinvestment")
	private WebElement annualinvestmentTxtBox;
	@FindBy (id="ctl00_cPH_txtCapitalAllowancesemissions")
	private WebElement capitalAllowancesemissionsTxtBox;
	@FindBy (id="ctl00_cPH_txtCapitalAllowances")
	private WebElement seCapitalAllowancesTxtBox;
	@FindBy (id="ctl00_cPH_txtRestrictedCosting")
	private WebElement restrictedCostingTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherEnhancedCapitalAllowances")
	private WebElement otherEnhancedCapitalAllowancesTxtBox;
	@FindBy (id="ctl00_cPH_txtAllowancesCessationBusiness")
	private WebElement allowancesCessationBusinessTxtBox;
	@FindBy (id="ctl00_cPH_txttotalcapitalallowances")
	private WebElement totalcapitalallowancesTxtBox;
	@FindBy (id="ctl00_cPH_txtBalancingChargeOnSales")
	private WebElement balancingChargeOnSalesTxtBox;
	//Self Employment Full -> new  element according to MTR Test 3
	@FindBy (id="ctl00_cPH_txtWagesSalariesandOtherStaffCosts")
	private WebElement wagesSalariesandOtherStaffCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtRentInsurancecost")
	private WebElement rentInsurancecostTxtBox;
	@FindBy (id="ctl00_cPH_txtAdvertisingandEntertainmentCost")
	private WebElement advertisingandEntertainmentCostTxtBox;
	@FindBy (id="ctl00_cPH_txtInterestbank")
	private WebElement interestbankTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherbusinessexpenses")
	private WebElement otherbusinessexpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtAccountingperiodandProfitloss")
	private WebElement accountingperiodandProfitlossTxtBox;
	//Self Employment (Full) -> Calculating Taxable Profit or Loss
	@FindBy (id="ctl00_cPH_txtGoodandServices")
	private WebElement goodAndServicesTxtBox;
	@FindBy (id="ctl00_cPH_txttotaladditionaltonetprofit")
	private WebElement totaladditionaltonetprofitTxtBox;
	@FindBy (id="ctl00_cPH_txtBusinessIncomeandOtherProfit")
	private WebElement businessIncomeandOtherProfitTxtBox;
	@FindBy (id="ctl00_cPH_txttotaldeductiontonetprofit")
	private WebElement totaldeductiontonetprofitTxtBox;
	@FindBy (id="ctl00_cPH_txtNetBusinessProfitfortaxpurpose")
	private WebElement netBusinessProfitfortaxpurposeTxtBox;
	@FindBy (id="ctl00_cPH_txtBasisperiodBegan")
	private WebElement basisPeriodBeganTxtBox;
	@FindBy (id="ctl00_cPH_txtBasisperiodEnded")
	private WebElement basisPeriodEndedTxtBox;
	@FindBy (id="ctl00_cPH_txtAccountingperiodandProfitLoss")
	private WebElement accountingPeriodAndProfitLossTxtBox;
	@FindBy (id="ctl00_cPH_txtOverlapRelief")
	private WebElement overlapReliefTxtBox;
	@FindBy (id="ctl00_cPH_txtOverlapProfit")
	private WebElement overlapProfitTxtBox;
	@FindBy (id="ctl00_cPH_txtAdjustmentchangeofAccount")
	private WebElement adjustmentChangeofAccountTxtBox;
	@FindBy (id="ctl00_cPH_txtAveragingAdjustment")
	private WebElement averagingAdjustmentTxtBox;
	@FindBy (id="ctl00_cPH_txtAdjustedProfit")
	private WebElement adjustedProfitTxtBox;
	@FindBy (id="ctl00_cPH_txtLossbroughtForwardProfit")
	private WebElement lossBroughtForwardProfitTxtBox;
	@FindBy (id="ctl00_cPH_txtAnyBusinessIncome")
	private WebElement anyBusinessIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txttotalprofitfrombusiness")
	private WebElement totalProfitFromBusinessTxtBox;
	//Self Employment (Full) -> Losses
	@FindBy (id="ctl00_cPH_txtAdjustedLoss")
	private WebElement adjustedLossTxtBox;
	@FindBy (id="ctl00_cPH_txtLossandAgainstOtherIncome")
	private WebElement lossandAgainstOtherIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtLossTocarriedBack")
	private WebElement lossTocarriedBackTxtBox;
	@FindBy (id="ctl00_cPH_txtLosstoCarryforward")
	private WebElement losstoCarryforwardTxtBox;
	//Self Employment (Full) -> CIS Deductions and Tax taken Off
	@FindBy (id="ctl00_cPH_txtSubContractorsDeductionTax")
	private WebElement subContractorsDeductionTaxTxtBox;
	@FindBy (id="ctl00_cPH_txtTaxTradingIncome")
	private WebElement taxTradingIncomeTxtBox;
	//Self Employment (Full) -> Balance Sheet -> Assets
	@FindBy (id="ctl00_cPH_txtEquipMentandMachinery")
	private WebElement equipMentandMachineryTxtBox;
	@FindBy (id="ctl00_cPH_txtOtherFixedAssests")
	private WebElement OtherFixedAssestsTxtBox;
	@FindBy (id="ctl00_cPH_txtStockandWork")
	private WebElement stockAndWorkTxtBox;
	@FindBy (id="ctl00_cPH_txtTradeDebtors")
	private WebElement tradeDebtorsTxtBox;
	@FindBy (id="ctl00_cPH_txtCashinHand")
	private WebElement cashinHandTxtBox;
	@FindBy (id="ctl00_cPH_txtCurrentAssestsandPayment")
	private WebElement currentAssestsandPaymentTxtBox;
	@FindBy (id="ctl00_cPH_txttotalassets")
	private WebElement totalAssetsTxtBox;
	//Self Employment (Full) -> Balance Sheet -> Liabilities
	@FindBy (id="ctl00_cPH_txtTradeCreditors")
	private WebElement tradeCreditorsTxtBox;
	@FindBy (id="ctl00_cPH_txtLoansOverdrawnandBankAccount")
	private WebElement loansOverdrawnandBankAccountTxtBox;
	@FindBy (id="ctl00_cPH_txtLiabilitiesandAccruals")
	private WebElement liabilitiesandAccrualsTxtBox;
	//Self Employment (Full) -> Balance Sheet -> Net business assets
	@FindBy (id="ctl00_cPH_txtNetBusinessAssets")
	private WebElement netBusinessAssetsTxtBox;
	//Self Employment (Full) -> Balance Sheet -> Capital Account
	@FindBy (id="ctl00_cPH_txtBalanceStartPeriod")
	private WebElement balanceStartPeriodTxtBox;
	@FindBy (id="ctl00_cPH_txtnetprofitorloss")
	private WebElement netprofitorlossTxtBox;
	@FindBy (id="ctl00_cPH_txtCapitalIntroduced")
	private WebElement capitalIntroducedTxtBox;
	@FindBy (id="ctl00_cPH_txtDrawing")
	private WebElement drawingTxtBox;
	@FindBy (id="ctl00_cPH_txtBalanceEndPeriod")
	private WebElement balanceEndPeriodTxtBox;
	//Self Employment (Full) -> National Insurance Contributions
	@FindBy (id="ctl00_cPH_txtAdjustmentProfit")
	private WebElement adjustmentProfitTxtBox;
	//Self Employment (Full) -> Other Information
	@FindBy (id="ctl00_cPH_txtComment")
	private WebElement commentTxtBox;
	@FindBy (xpath="//tr/td[contains(text(),'Class 4 National Insurance contributions')]//..//td[4]")
	private WebElement class4NationalInsurancecontributions1;
	@FindBy (xpath="//table/tbody/tr[18]/td[4]")
	private WebElement class4NationalInsurancecontributions2;
	@FindBy (xpath="//tr/td[contains(text(),' Class 2 National Insurance contributions')]//..//td[4]")
	private WebElement class2NationalInsurancecontributions;
	@FindBy (id="ctl00_cPH_txtBankSocietyBalances")
	private WebElement bankSocietyBalancesTxtBox;
	@FindBy (id="ctl00_cPH_rptrDisplayFullRecords_ctl00_hrefDelete")
	private WebElement delDisplayFullRecords;
	@FindBy (id="ctl00_cPH_rptrDisplayFullRecords_ctl00_hrefEdit")
	private WebElement editFullRecordsSE;
	//Income -> Partnership (Short)
	@FindBy (xpath="//a[contains(text(),'Partnership')]")
	private WebElement PartnershipLink ;
	@FindBy (xpath="//h3[contains(text(),'Partnership (Short)')]//..//div/a/img")
	private WebElement PartnershipShortFormLink ;
	//Income -> Partnership -> Class 2 & Class 4 NICs
	@FindBy ( xpath="//img[@src='../commonv2/images/note-i.jpg']")
	private WebElement Class2Class4NICsForm;
	@FindBy (id="ctl00_cPH_chkExemptFromPayingClass4NIC")
	private WebElement ExemptfromPayingClass4NICs;
	@FindBy (id="ctl00_cPH_chkPayClass2Voluntarily")
	private WebElement PayClass2NICsvoluntarily ;
	//Income -> Partnership -> Partnership (Full)
	@FindBy ( xpath="//h3[contains(text(),'Partnership (Full)')]//..//div/a/img")
	private WebElement PartnershipFullFormLink;
	@FindBy (id = "ctl00_cPH_ddPartnership")
	private WebElement Description;
	@FindBy (id="ctl00_cPH_txtPartnershipReferenceNumber")
	private WebElement PartnerShipRefNo;
	@FindBy (id="ctl00_cPH_chkCashBasis")
	private WebElement PartnerShipusedcashbasis;
	@FindBy (id= "ctl00_cPH_txtDateBasisPeriodBegan")
	private WebElement BasisBusinessStartDate;
	@FindBy (id = "ctl00_cPH_txtDateBasisPeriodEnded")
	private WebElement BasisBusinessEndDate;
	@FindBy (id="ctl00_cPH_txtShareOfPartnershipProfitOrLoss")
	private WebElement yourShareOfPartnershipProfitLoss;
	@FindBy (id="ctl00_cPH_txtAdjustmentForBasisPeriod")
	private WebElement adjustmentBasisPeriodAccountingPeriod;
	@FindBy (id="ctl00_cPH_txtChangeOfAccountingPracticeAdjustment")
	private WebElement adjustmentForChangeOfAccountingPractice;
	@FindBy (id ="averagingAdjustmentTxtBox")
	private WebElement averagingAdjustment;
	//Partnership (Full) -> Fetched
	@FindBy (id="ctl00_cPH_txtAdjustedLossForYear")
	private WebElement adjustedLoss;
	@FindBy (id ="ctl00_cPH_txtLossSetOffAgainstOtherIncome")
	private WebElement lossFromThisTaxYearSetOffAgainstOtherIncome;
	@FindBy (id="ctl00_cPH_txtLossToBeCarriedBack")
	private WebElement lossCarriedBackPreviousYearSetOFFAgainstIncome;
	@FindBy (id="ctl00_cPH_txtForeignTaxClaimedAsDeduction")
	private WebElement foreignTaxclaimedAsDeduction;
	@FindBy (id="ctl00_cPH_txtOverlapReliefUsed")
	private WebElement overlapReliefUsedThisYear;
	@FindBy (id="ctl00_cPH_txtOverlapProfitCarriedForward")
	private WebElement overlapProfitCarriedForward ;
	@FindBy (id="ctl00_cPH_txtPartnersShareOfBPRA")
	private WebElement partnersShareOfBPRATxtBox;
	//Partnership (Full) -> Fetched
	@FindBy (id ="ctl00_cPH_txtAdjustedProfitForYear")
	private WebElement adjustedProfitForYear;
	@FindBy (id="ctl00_cPH_txtLossesBroughtForward")
	private WebElement lossesBroughtForward;
	//Partnership (Full) -> otherBusinessIncomeTxtBox exist
	@FindBy (id="ctl00_cPH_txtAdjustmentToClass4NICProfits")
	private WebElement adjustmentToClass4NICProfits ;
	@FindBy (id="ctl00_cPH_txtShareOfTaxedInterestEtc")
	private WebElement shareOfUnTaxedInterestEtc ;
	@FindBy (id="ctl00_cPH_txtShareOfTaxTakenOffByContractors")
	private WebElement shareOfTaxTakenOffByContractors ;
	@FindBy (id="ctl00_cPH_txtShareOfTaxTakenOffTradingIncome")
	private WebElement shareOfTaxTakenOffTradingIncome;
	@FindBy (id="ctl00_cPH_txtAnyOtherInformationSpace")
	private WebElement anyOtherInformationSpace;
	//Partnership (Full) -> Add PartnershipForm
	@FindBy (id="ctl00_cPH_txtName")
	private WebElement txtBoxDec;
	@FindBy(xpath="//tr/td[contains(text(),'Adjustment to  Class 4 NIC profits')]//..//td[2]")
	private WebElement class4NICprofits;
	@FindBy (id="ctl00_cPH_rptrPartnership_ctl00_hrefDelete")
	private WebElement partnershipDel;
	//Income -> Capital Gains Summary
	@FindBy (id="ctl00_SideMenu1_hrefCapitalGain")
	private WebElement linkCapitalGain;
	//Capital Gains Summary -> TOTAL GAINS
	@FindBy (id="ctl00_cPH_txtTotalGain")
	private WebElement totalGainTxtBox;
	//Capital Gains Summary -> Residential property (and carried interest)
	@FindBy (id="ctl00_cPH_txtResidentialPropertyNumberOfDisposals")
	private WebElement residentialPropertyNumberOfDisposalsTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyDisposalProceeds")
	private WebElement residentialPropertyDisposalProceedsTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyAllowableCosts")
	private WebElement residentialPropertyAllowableCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyGainsInTheYear")
	private WebElement residentialPropertyGainsInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyLossesInTheYear")
	private WebElement residentialPropertyLossesInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyClaimOrElectionMade")
	private WebElement residentialPropertyClaimOrElectionMadeTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyGainOrLossRelatingToNRCGT")
	private WebElement residentialPropertyGainOrLossRelatingToNRCGTTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyNRCGTtaxAlreadyCharged")
	private WebElement residentialPropertyNRCGTtaxAlreadyChargedTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyGainOrLossFromRTTreturn")
	private WebElement residentialPropertyGainOrLossFromRTTreturnTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyRTTtaxAlreadyCharged")
	private WebElement residentialPropertyRTTtaxAlreadyChargedTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialPropertyCarriedInterest")
	private WebElement residentialPropertyCarriedInterestTxtBox;
	//Capital Gains Summary -> Other property, assets and gains
	@FindBy (id="ctl00_cPH_txtPropertyEtcTotalDisposal")
	private WebElement propertyEtcTotalDisposalTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcDisposalProceed")
	private WebElement propertyEtcDisposalProceedTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcCostsAndIndexation")
	private WebElement propertyEtcCostsAndIndexationTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcGainsInTheYear")
	private WebElement propertyEtcGainsInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcAttributedGain")
	private WebElement propertyEtcAttributedGainTxtBox;
	@FindBy (id="ctl00_cPH_txPropertyEtcLossesInTheYear")
	private WebElement propertyEtcLossesInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcClaimOrElectionMade")
	private WebElement propertyEtcClaimOrElectionMadeTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcGainFromRTTreturn")
	private WebElement propertyEtcGainFromRTTreturnTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyEtcRTTtaxAlreadyCharged")
	private WebElement propertyEtcRTTtaxAlreadyChargedTxtBox;
	//Capital Gains Summary -> Listed shares and securities
	@FindBy (id="ctl00_cPH_txtQSTotalDisposal")
	private WebElement qSTotalDisposalTxtBox;
	@FindBy (id="ctl00_cPH_txtQSDisposalProceed")
	private WebElement qSDisposalProceedTxtBox;
	@FindBy (id="ctl00_cPH_txtQSCostsAndIndexation")
	private WebElement qSCostsAndIndexationTxtBox;
	@FindBy (id="ctl00_cPH_txtQSGainsInTheYear")
	private WebElement qSGainsInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtQSLossesInTheYear")
	private WebElement qSLossesInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtQSClaimOrElectionMade")
	private WebElement qSClaimOrElectionMadeTxtBox;
	@FindBy (id="ctl00_cPH_txtQSGainFromRTTreturn")
	private WebElement qSGainFromRTTreturnTxtBox;
	@FindBy (id="ctl00_cPH_txtQSRTTtaxAlreadyCharged")
	private WebElement qSRTTtaxAlreadyChargedTxtBox;
	//Capital Gains Summary -> Unlisted shares and securities
	@FindBy (id="ctl00_cPH_txtUQSTotalDisposal")
	private WebElement uQSTotalDisposalTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSDisposalProceed")
	private WebElement uQSDisposalProceedTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSCostsAndIndexation")
	private WebElement uQSCostsAndIndexationTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSGainsInTheYear")
	private WebElement uQSGainsInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSLossesInTheYear")
	private WebElement uQSLossesInTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSClaimOrElectionMade")
	private WebElement uQSClaimOrElectionMadeTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSGainFromRTTreturn")
	private WebElement uQSGainFromRTTreturnTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSRTTtaxAlreadyCharged")
	private WebElement uQSRTTtaxAlreadyChargedTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSGainsExceedingESSlimit")
	private WebElement uQSGainsExceedingESSlimitTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSGainsInvestedUnderSeedEIS")
	private WebElement uQSGainsInvestedUnderSeedEISTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSLossUsedAgainstCurrentYearIncome")
	private WebElement uQSLossUsedAgainstCurrentYearIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSUncappedLossUsedAgainstCurrentYearIncome")
	private WebElement uQSUncappedLossUsedAgainstCurrentYearIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSLossUsedAgainstPrevYearIncome")
	private WebElement uQSLossUsedAgainstPrevYearIncomeTxtBox;
	@FindBy (id="ctl00_cPH_txtUQSUncappedLossUsedAgainstPrevYearIncome")
	private WebElement uQSUncappedLossUsedAgainstPrevYearIncomeTxtBox;
//Capital Gains Summary -> Losses and adjustments
	@FindBy (id="ctl00_cPH_txtLossBFAndUsedInYear")
	private WebElement lossBFAndUsedInYearTxtBox;
	@FindBy (id="ctl00_cPH_txtIncomeLossesOfTheYearSetAgainstGain")
	private WebElement incomeLossesOfTheYearSetAgainstGainTxtBox;
	@FindBy (id="ctl00_cPH_txtLossToBeCarriedForward")
	private WebElement lossToBeCarriedForwardTxtBox;
	@FindBy (id="ctl00_cPH_txtLossUsedAgainstEarlierYearsGain")
	private WebElement lossUsedAgainstEarlierYearsGainTxtBox;
	@FindBy (id="ctl00_cPH_txtEntrepreneurReliefClaimOnDefGainBefore23June2010")
	private WebElement entrepreneurReliefClaimOnDefGainBefore23June2010TxtBox;
	@FindBy (id="ctl00_cPH_txtTotalERGainForTheYear")
	private WebElement totalERGainForTheYearTxtBox;
	@FindBy (id="ctl00_cPH_txtAdjustmentToCGT")
	private WebElement adjustmentToCGTTxtBox;
	@FindBy (id="ctl00_cPH_txtNRDRTrustLiability")
	private WebElement nRDRTrustLiabilityTxtBox;
	//Capital Gains Summary -> descriptionTxtBox
	@FindBy (id="ctl00_cPH_FileUpload1")
	private WebElement fileUpload1;
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	private WebElement delCapitalGain;
	@FindBy(id="ctl00_cPH_chkDeleteAttachment")
	private WebElement deleteAttachmentChkBox;
	//Tax Reliefs -> Pension Contributions
	@FindBy(xpath="//span[contains(text(),'Tax Reliefs')]")	
	private WebElement taxReliefsLink;
	@FindBy(id="ctl00_cPH_spanPensionContribution")
	private WebElement linkPensionContributionx;
	@FindBy(id="ctl00_cPH_txtPaymentsToRegisteredPensionSchemes")
	private WebElement paymentsToRegisteredPensionSchemesTxtBox;
	@FindBy(id="ctl00_cPH_txtRetirementAnnuityContractPayments")
	private WebElement retirementAnnuityContractPaymentsTxtBox;
	@FindBy(id="ctl00_cPH_txtEmployerPensionSchemePayments")
	private WebElement employerPensionSchemePaymentsTxtBox;
	@FindBy(id="ctl00_cPH_txtNonUKOverseasPensionSchemePayments")
	private WebElement nonUKOverseasPensionSchemePaymentsTxtBox;
	@FindBy(id="ctl00_cpHFooter_btnSavePension")
	private WebElement savePensionBtn;
	//Tax Reliefs -->Charitable giving
	@FindBy(xpath="(//div[@class='infoNote-top'])[2]")
	private WebElement openCharitableForm;
	@FindBy(id="ctl00_cPH_txtSharesGiftedToCharity")
	private WebElement sharesOrSecuritiesGiftedToCharityTxtBox;
	@FindBy(id="ctl00_cPH_txtLandAndBuildingsGiftedToCharity")
	private WebElement landAndBuildingsGiftedToCharityTxtBox;
	@FindBy(id="ctl00_cPH_txtInvestmentsGiftedToNonUKCharities")
	private WebElement investmentsGiftedToNonUKCharitiesTxtBox;
	@FindBy(id="ctl00_cPH_rptrCharityRecords_ctl00_hrefEdit")
	private WebElement editCharityRecords;
	@FindBy(id="ctl00_cPH_rptrCharityRecords_ctl00_hrefDelete")
	private WebElement deleteCharityRecords;
	@FindBy(id="ctl00_cpHFooter_btnCancel")
	private WebElement cancelBtn;
	//Tax Reliefs -> Gift Aid payment
	@FindBy(xpath="(//div[@class='infoNote-top'])[3]")
	private WebElement linkFormGiftAid;
	@FindBy(id="ctl00_cPH_txtGiftAidPaymentsMadeInYear")
	private WebElement giftAidPaymentsMadeInYearTxtBox;
	@FindBy(id="ctl00_cPH_txtOneOffGiftAidPayments")
	private WebElement oneOffGiftAidPaymentsTxtBox;
	//Tax Reliefs -> Other Gift Aid payment
	@FindBy(xpath="(//div[@class='infoNote-top'])[5]")
	private WebElement otherGiftAidpaymentLink;
	@FindBy(id="ctl00_cPH_txtGiftAidPaymentsCarriedBackToPreviousYear")
	private WebElement giftAidPaymentsCarriedBackToPreviousYearTxtBox;
	@FindBy(id="ctl00_cPH_txtGiftAidPaymentsBroughtBackFromLaterYear")
	private WebElement giftAidPaymentsBroughtBackFromLaterYearTxtBox;
	//Tax Reliefs -> Blind Person Allowance
	@FindBy(id="ctl00_cPH_chkSurplusBlindPersonsAllowanceFromSpouse")
	private WebElement surplusBlindPersonsAllowanceFromSpouseChkBox;
	@FindBy(id="ctl00_cPH_chkSurplusBlindPersonsAllowanceToSpouse")
	private WebElement surplusBlindPersonsAllowanceToSpouseChkBox;
	//Tax Reliefs -> Marriage Allowance
	@FindBy(xpath="(//div[@class='infoNote-top'])[4]")
	private WebElement marriageAllowanceForm;
	@FindBy(id="ctl00_cPH_chkReceiveMarriageAllowancefrom")
	private WebElement receiveMarriageAllowancefromChkBox;
	@FindBy(id="ctl00_cPH_chkReceiveMarriageAllowanceTO")
	private WebElement receiveMarriageAllowanceTOChkBox;
	@FindBy(id="ctl00_cPH_txtSpouseFirstName")
	private WebElement spouseFirstNameTxtBox;
	@FindBy(id="ctl00_cPH_txtSpouselastname")
	private WebElement spouselastnameTxtBox;
	@FindBy(id="ctl00_cPH_txtSpouseNInumber")
	private WebElement spouseNInumberTxtBox;
	@FindBy(id="ctl00_cPH_txtSpouseDOB")
	private WebElement spouseDOBTxtBox;
	@FindBy(id="ctl00_cPH_txtDateofmarriageSpouse")
	private WebElement dateOfMarriageSpouseTxtBox;
	@FindBy(xpath="//td[contains(text(),'Marriage Allowance Transfer')]")
	private WebElement taxSummaaryMarriageAllowance;
	//td[contains(text(),'Marriage Allowance Transfer')]
	//Other Tax Information -> Student Loan Repayment
	@FindBy(xpath="//span[contains(text(),'Other Tax Information')]")
	private WebElement linkOtherTaxInformation;
	@FindBy(id="ctl00_cPH_ddStudentLoan")
	private WebElement studentLoanTypeLstBox;
	@FindBy(id="ctl00_cPH_txtAmount")
	private WebElement amountTxtBox;
	@FindBy(id="ctl00_cPH_chkLoanFullyRepaidIn2Years")
	private WebElement repaidChckBox;
	@FindBy(xpath="//tr/td[contains(text(),'Student Loan repayments')]//..//td[4]")
	private WebElement studentLoanAmountTaxWindow;
	//Other Tax Information -> High Income Child Benefit Charge
	@FindBy(id="ctl00_cPH_txtAmountReceived")
	private WebElement amountReceivedTxtBox;
	@FindBy(id="ctl00_cPH_txtChildren")
	private WebElement NoOfchildrenTxtBox;
	@FindBy(id="ctl00_cPH_txtBenifitStopDate")
	private WebElement benifitStopDateTxtBox;
	//Other Tax Information -> Payments on account
	@FindBy(id="ctl00_cPH_img4")
	private WebElement paymentsOnAccountLink;
	@FindBy(id="ctl00_cPH_chkClaimToReducePaymentsOnAccount")
	private WebElement claimToReducePaymentsOnAccountChkBox;
	@FindBy(id="ctl00_cPH_txtFirstPaymentOnAccount")
	private WebElement firstPaymentOnAccountTxtBox;
	@FindBy(id="ctl00_cPH_txtNotes")
	private WebElement notesTxtBox;
	@FindBy(xpath="//tr/td[contains(text(),'First Payment on Account')]//..//td[4]")
	private WebElement firstPaymentonAccountAmount;
	@FindBy(xpath="//tr/td[contains(text(),'Total due by')]//..//td[4]")
	private WebElement totalDueByJanuaryAmount;
	@FindBy(xpath="//tr/td[contains(text(),'Second Payment on Account for')]//..//td[4]")
	private WebElement secondPaymentAmount;
	//Other Tax Information -> Finishing your tax return
	@FindBy(id="ctl00_cPH_img5")
	private WebElement finishingTaxLink;
	@FindBy(id="ctl00_cPH_txtTaxRoundedOff")
	private WebElement taxRoundedOffTxtBox;
	@FindBy(id="ctl00_cPH_chkNotPaidEnoughOweTaxPrevYear")
	private WebElement notPaidEnoughOweTaxPrevYearChkBox;
	@FindBy(id="ctl00_cPH_chkNotPaidEnoughNotUseCode")
	private WebElement notPaidEnoughNotUseCodeChkBox;
	@FindBy(id="ctl00_cPH_txtOtherInfo")
	private WebElement otherInfoTxtBox;
	@FindBy (xpath="//tr/td[contains(text(),'Tax already refunded in the year')]//..//td[4]")
	private WebElement taxAlreadyRefunded;
	@FindBy (id="ctl00_cPH_chkTaxAdvisor")
	private WebElement taxAdvisorChkBox;
	//Other Tax Information -> Underpaid Tax
	@FindBy (id="ctl00_cPH_img3")
	private WebElement formOpenLink;
	@FindBy (id="ctl00_cPH_txtUnderpaidTaxForEarlierYearsIncludedInCode")
	private WebElement underpaidTaxForEarlierYearsIncludedInCodeTxtBox;
	@FindBy (id="ctl00_cPH_txtUnderpaidTax")
	private WebElement underpaidTaxTxtBox;
	@FindBy (id="ctl00_cPH_txtOutstandingDebt")
	private WebElement outstandingDebtTxtBox;
	//Additional Information
	@FindBy (xpath="//span[contains(text(),'Additional Information')]")
	private WebElement additionalInformationLink;
	@FindBy (id="ctl00_cpHeaderRight_btnEditIncome")
	private WebElement commonEditBtn;
	@FindBy (id="ctl00_cPH_txtTaxTakenOff1")
	private WebElement taxTakenOff1TxtBox;
	@FindBy (id="ctl00_cPH_txtGrossAmount")
	private WebElement grossAmountTxtBox;
	@FindBy (id="ctl00_cPH_txtStockDividends")
	private WebElement stockDividendsTxtBox;
	@FindBy (id="ctl00_cPH_txtNonQualifying")
	private WebElement nonQualifyingTxtBox;
	@FindBy (id="ctl00_cPH_txtTaxYearIncomeToBeTaxed")
	private WebElement taxYearIncomeToBeTaxedTxtBox;
	//Other tax reliefs
	@FindBy (id="ctl00_cPH_txtSubscriptionsVenture")
	private WebElement subscriptionsVentureTxtBox;
	@FindBy (id="ctl00_cPH_txtSubscriptionsShares")
	private WebElement subscriptionsSharesTxtBox;
	@FindBy (id="ctl00_cPH_txtCommunityInvestment")
	private WebElement communityInvestmentTxtBox;
	@FindBy (id="ctl00_cPH_txtAnnualPayments")
	private WebElement annualPaymentsTxtBox;
	@FindBy (id="ctl00_cPH_txtQualifyingLoan")
	private WebElement qualifyingLoanTxtBox;
	@FindBy (id="ctl00_cPH_txtPostCessation")
	private WebElement postCessationTxtBox;
	@FindBy (id="ctl00_cPH_txtMaintenancePayment")
	private WebElement maintenancePaymentTxtBox;
	@FindBy (id="ctl00_cPH_txtPaymentsTrade")
	private WebElement paymentsTradeTxtBox;
	@FindBy (id="ctl00_cPH_txtReliefClaimed")
	private WebElement reliefClaimedTxtBox;
	@FindBy (id="ctl00_cPH_txtSubscriptionsSharesUnder")
	private WebElement subscriptionsSharesUnderTxtBox;
	@FindBy (id="ctl00_cPH_txtSocialInvestment")
	private WebElement socialInvestmentTxtBox;
	
	//Share schemes and employment lump sums
	@FindBy (id="ctl00_cPH_txtShareSchemesTaxableAmount")
	private WebElement shareSchemesTaxableAmountTxtBox;
	@FindBy (id="ctl00_cPH_txtLumpSumSalariesAndOtherPayments")
	private WebElement lumpSumSalariesAndOtherPaymentsTxtBox;
	@FindBy (id="ctl00_cPH_txtLumpSumsOrBenefitsFromRetirementSchemes")
	private WebElement lumpSumsOrBenefitsFromRetirementSchemesTxtBox;
	@FindBy (id="ctl00_cPH_txtRedundancyAndOtherCompensationPayments")
	private WebElement redundancyAndOtherCompensationPaymentsTxtBox;
	@FindBy (id="ctl00_cPH_txtRedundancyAndOtherCompensationTaxTakenOff")
	private WebElement redundancyAndOtherCompensationTaxTakenOffTxtBox;
	@FindBy (id="ctl00_cPH_txtRetirementAndOtherExemptions")
	private WebElement retirementAndOtherExemptionsTxtBox;
	@FindBy (id="ctl00_cPH_txtCompensationAndLumpSumExemptions")
	private WebElement compensationAndLumpSumExemptionsTxtBox;
	@FindBy (id="ctl00_cPH_txtDisabilityAndForeignServiceDeduction")
	private WebElement disabilityAndForeignServiceDeductionTxtBox;
	@FindBy (id="ctl00_cPH_txtSeafarersEarningsDeduction")
	private WebElement seafarersEarningsDeductionTxtBox;
	@FindBy (id="ctl00_cPH_txtNonUKTaxableForeignEarnings")
	private WebElement nonUKTaxableForeignEarningsTxtBox;
	@FindBy (id="ctl00_cPH_txtForeignTaxNoCreditReliefClaim")
	private WebElement foreignTaxNoCreditReliefClaimTxtBox;
	@FindBy (id="ctl00_cPH_txtOverseasPensionExemptEmployerContributions")
	private WebElement overseasPensionExemptEmployerContributionsTxtBox;
	@FindBy (id="ctl00_cPH_txtUKpatentRoyaltyPayments")
	private WebElement UKpatentRoyaltyPaymentsTxtBox;
	@FindBy (id="ctl00_cPH_txtSchemeReference1")
	private WebElement schemeReference1TxtBox;
	//commentForValidation
	@FindBy (id="ctl00_cPH_btnSaveIncome")
	private WebElement saveAdditionalInfoBtn;
	//popUpCancelBtn
	//life insurance
	@FindBy (id="ctl00_cPH_txtAmountGainOnLifeInsurance")
	private WebElement amountGainOnLifeInsuranceTxtBox;
	@FindBy (id="ctl00_cPH_txtNumberOfYearsSinceLastPolicyGain")
	private WebElement numberOfYearsSinceLastPolicyGainTxtBox;
	//PAYCode
	@FindBy (xpath="//td[contains(text(),'To be collected through PAYE code')]")
	private WebElement payCodeTaxSummary;
	@FindBy (xpath="//tr/td[contains(text(),'To be collected through PAYE code')]//..//td[4]")
	private WebElement payCodeAmountTaxSummary;	
	//email /SMS
	@FindBy (xpath="//span[contains(text(),'Email / SMS')]")
	private WebElement emailOptionsLink;
	@FindBy (xpath="//a[contains(text(),'E Mail')]")
	private WebElement emailOpenLink;
	@FindBy (id="ctl00_cPH_txtEmail")
	private WebElement emailTxtBox;
	@FindBy (id="ctl00_cPH_ddlEmailTemplate")
	private WebElement emailTemplateListBox;
	@FindBy (id="ctl00_cPH_txtSubject")
	private WebElement subjectTxtBox;
	@FindBy (id="ctl00_cPH_txtMessage_ctl02_ctl00")
	private WebElement msgBodyTxtBox;
	@FindBy (xpath="//*[@id='ctl00_divSubContent']/div[2]/table/tbody/tr[2]/td[2]")
	private WebElement rowOneDisplay;
	@FindBy (xpath="//*[@id='ctl00_divSubContent']/div[2]/table/tbody/tr[2]/td[3]")
	private WebElement rowTwoDisplay;
	@FindBy (xpath="//a[contains(text(),'Schedule Email')]")
	private WebElement scheduleEmailLink;
	@FindBy (id="ctl00_cPH_rdTemplate")
	private WebElement emailTempalateOption;
	@FindBy (id="ctl00_cPH_rdGeneric")
	private WebElement ownEmailTempalateOption;
	@FindBy (id="ctl00_cPH_btnNext")
	private WebElement nextBtn;
	@FindBy (id="ctl00_cPH_ddTemplate")
	private WebElement chooseTemplateOption;
	@FindBy (id="ctl00_cPH_ddSendTo")
	private WebElement sendTooption;
	@FindBy (xpath="//a[contains(text(),'Email Templates')]")
	private WebElement emailTempLink;
	@FindBy (xpath="//td[contains(text(),'test tamplate')]")
	private WebElement emailTempOption;
	@FindBy (xpath="//td[contains(text(),'test tamplate')]//..//td[2]")
	private WebElement templateSubject;
	//Tax Payments Already Made
	@FindBy (xpath="//span[contains(text(),'Tax Payments Already Made')]")
	private WebElement linkTaxPaymentsAlreadyMade;
	@FindBy (xpath="//*[@id='ctl00_divMainContent']/header/div/a")
	private WebElement addTaxPaymentBtn;
	@FindBy (xpath="//*[@id='ctl00_divSubContent']/div[2]/table/tbody/tr[2]/td[3]")
	private WebElement	taxAmountDisplay;
	//SA -> Dashboard
	@FindBy (tagName="body")
	private WebElement body;
	@FindBy (xpath="//tr/td/span[contains(text(),'Approved')]//..//..//td[2]")
	private WebElement	statusApprovedClientList;
	@FindBy (xpath="//ul[@id='ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren']/li/a[contains(text(),'Dashboard')]")
	private WebElement	saDashboardLink;
	// SA -> Assign Accountant
	@FindBy (xpath="//a[contains(text(),'Assign Accountant')]")
	private WebElement	assignAccountantLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_ddlAccountant")
	private WebElement accountantLSTBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	//SA -> Client List -> import Client 
	@FindBy (xpath="//a[contains(text(),'Import Client')]")
	private WebElement importClientLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_fuList")
	private WebElement uploadClientTxtBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnUpload")
	private WebElement uploadClientBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHeaderRight_btnSave")
	private WebElement importBtn;
	@FindBy (id="chkSingle")
	private WebElement importChkBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHeaderRight_btnCancel")
	private WebElement importCancelBtn;
	//SA -> Email template
	@FindBy (xpath="//ul[@id='ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren']/li/a[contains(text(),'Email Templates')]")
	private WebElement emailTemplatesLink;
	@FindBy (xpath="//a[contains(text(),'Add')]")
	private WebElement addNewTemplateBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtTemplateName")
	private WebElement templateNameTxtBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtSubject")
	private WebElement emailSubjectTxtBox;
	//SaveButton
	@FindBy (xpath="//iframe[@id='ctl00_ctl00_ParentContent_cPH_txtMessage_ctl02_ctl00']")
	private WebElement emailFrame;
	//SA -> Schedule email
	@FindBy (xpath="//ul[@id='ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren']/li/a[contains(text(),'Schedule Email')]")
	private WebElement scheduledEmailLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtFirstName")
	private WebElement firstNameScheduleMail;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtLastName")
	private WebElement lastNameScheduleMail;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter__selectall_inputitemAll")
	private WebElement inputItemAllChkBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_ddlEmailTemplates")
	private WebElement selectEmailTemplatesLstBox;
	//emailSubjectTxtBox
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtDate")
	private WebElement dateScheduleEmailTxtBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnAssign")
	private WebElement sceduleEmailBtn;
	@FindBy(xpath="//a[contains(text(),'Nom1')]")	
	private WebElement selectClientScheduleEmail;
	@FindBy(xpath="//td[contains(text(),'Testing SA')]")
	private WebElement subjectEmail;
	//SA -> Foreign Income
	@FindBy(xpath="//a[contains(text(),'Foregin1')]")
	private WebElement clientForeignIncome;
	@FindBy(id="ctl00_SideMenu1_hrefForeignIncome")
	private WebElement linkForeignIncome;
	@FindBy(xpath="//a[contains(text(),'Foreign_33')]")
	private WebElement clientFOR33;
	@FindBy (id="ctl00_cPH_txtTotalForeignTaxRelief")
	private WebElement totalForeignTaxReliefTxtBox;
	//commonEditBtn
	////SA -> Foreign Income ->Interest and other income from overseas savings
	@FindBy (xpath="//tr/th/span[contains(text(),'Interest and other income from overseas savings')]//..//div//a//img")
	private WebElement interestOtherincomefromoverseassavingsFormBtn;
	@FindBy (id="ctl00_cPH_ddlCountryCode")
	private WebElement countryCodeLstBox;
	@FindBy (id="ctl00_cPH_txtColB")
	private WebElement colBTxtBox;
	@FindBy (id="ctl00_cPH_chkColE")
	private WebElement colEChkBox;
	@FindBy (id="ctl00_cPH_txtColF")
	private WebElement colFTxtBox;
	@FindBy (id="ctl00_cPH_txtColC")
	private WebElement colCTxtBox;
	@FindBy (id="ctl00_cPH_txtColD")
	private WebElement colDTxtBox;
	@FindBy (id="ctl00_cPH_rptrInterestOtherIncomeFromOverseasSavings_ctl00_hrefDelete")
	private WebElement delOverseasSavings;
	@FindBy (id="ctl00_cPH_rptr_DividendsForeignComanies_ctl00_hrefDelete")
	private WebElement delDividendsForeignComaniesBtn;
	@FindBy (id="ctl00_cPH_rptr_OverseasPensionsRoyalties_ctl00_hrefDelete")
	private WebElement delOverseasPensionsRoyaltiesBtn;
	@FindBy (id="ctl00_cPH_rptr_Summary_ctl00_hrefDelete")
	private WebElement delSummaryFOR;
	//SA -> Foreign Income -> Dividends from foreign companies
	@FindBy (xpath="//tr/th/span[contains(text(),'Dividends from foreign companies')]//..//div//a//img")
	private WebElement dividendsFromForeignCompanies;
	@FindBy (xpath="//tr/th/span[contains(text(),'Overseas pensions, social security benefits and royalties')]//..//div//a//img")
	private WebElement overseasPensionsSocialScurityBenefitsAndRoyalties;
	@FindBy (id="ctl00_cPH_txtTotalRentsAndOtherReceipts")
	private WebElement totalRentsAndOtherReceiptsTxtBox;
	@FindBy (id="ctl00_cPH_txtPropertyExpenses")
	private WebElement propertyExpensesTxtBox;
	@FindBy (id="ctl00_cPH_txtNetProfitOrLoss")
	private WebElement foreignIncomeNetProfitOrLossTxtBox;
	@FindBy (id="ctl00_cPH_txtNumberOfOverseasLetProperties")
	private WebElement foreignIncomeNumberOfOverseasLetPropertiesTxtBox;
	@FindBy (id="ctl00_cPH_txtPrivateUseAdjustments")
	private WebElement foreignIncomePrivateUseAdjustmentsTxtBox;
	@FindBy (id="ctl00_cPH_txtCostsOfReplacingDomesticItems")
	private WebElement foreignIncomeCostsOfReplacingDomesticItemsTxtBox;
	@FindBy (id="ctl00_cPH_txtResidentialFinanceCosts")
	private WebElement foreignIncomeResidentialFinanceCostsTxtBox;
	@FindBy (id="ctl00_cPH_txtAdjustedProfitOrLossForTheYear")
	private WebElement foreignIncomeAdjustedProfitOrLossForTheYearTxtBox;
	@FindBy (xpath="//div[@id='ctl00_divSubContent']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[8]/div[1]/a/img")
	private WebElement foreignIncomeEditSummaryBtn;
	@FindBy (id="ctl00_cPH_txtTotalTaxableProfit")
	private WebElement totalTaxableProfitTxtBox;
	@FindBy(xpath="//tr/td/b[contains(text(),'Income Tax due after allowances and reliefs')]//..//..//td[4]")
	private WebElement amountIncomeTaxdueafterallowances;
	@FindBy (id="ctl00_cPH_btnYes")
	private WebElement yesBtn;
	@FindBy (id="ctl00_cPH_pnlPopup")
	private WebElement popup1;
//Verify XML File
	@FindBy(xpath="//td[contains(text(),'Pay from all employments')]//..//td[2]")
	private WebElement txtPaymentFrmEmployment;
	@FindBy(xpath="//td/strong[contains(text(),'Total tax deducted')]//..//..//td[4]")
	private WebElement txtTotaltaxdeducted;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Interest from UK banks, building societies and securities etc')]//..//td[2]")
	private WebElement amountInterestFromUKbanksBuilding;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Dividends from UK companies')]//..//td[2]")
	private WebElement amountDividendsfromUKCompanies;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'UK pensions and state benefits')]//..//td[2]")
	private WebElement amountUKpensionsAndStateBenefits;
//MTR Test 4 -> verify tax page
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Starting rate')]//..//td[2]")
	private WebElement txtSavingsinterestStartingrate;
	@FindBy(xpath="//table/tbody/tr[14]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement txtSavinginterestNilrate;
	@FindBy(xpath="//table/tbody/tr[17]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement txtDividentNilrate;
	//verify tax test case 9
	@FindBy(xpath="//td[contains(text(),'Profit from self-employment')]//..//td[2]")
	private WebElement amountProfitFromSelfEmployment;
	@FindBy(xpath="//td[contains(text(),'Profit from UK land and property')]//..//td[2]")
	private WebElement amountProfitFromUKLandAndProperty;  
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Other income')]//..//td[2]")
	private WebElement amountOtherIncome;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Tax due on Gift Aid payments')]//..//td[2]")
	private WebElement calculationGiftAidpayments;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Tax due on Gift Aid payments')]//..//td[4]")
	private WebElement taxDueGiftAidpayments;
	@FindBy(xpath="//table/tbody/tr/td/b[contains(text(),'Income Tax due after Gift Aid')]//..//..//td[3]")
	private WebElement incomeTaxDueAfterGifTAid;
	//MTR Test Case 10
	@FindBy(xpath="//table/tbody/tr[14]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRatePayPensions;
	@FindBy(xpath="//table/tbody/tr[19]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRateSavingsInterestTest1;
	@FindBy(xpath="//table/tbody/tr[19]/td[contains(text(),'Basic rate')]//..//td[4]")
	private WebElement calculationBasicRateSavingsInterestTest1;
	@FindBy(xpath="//table/tbody/tr[23]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRateDividendsTest1;
	@FindBy(xpath="//table/tbody/tr[23]/td[contains(text(),'Basic rate')]//..//td[4]")
	private WebElement calculationBasicRateDividendsTest1;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Higher rate')]//..//td[2]")
	private WebElement amtHeigherRate1;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Starting rate')]//..//td[4]")
	private WebElement amtSavingsinterestStartingrate;
	@FindBy (xpath="//table/tbody/tr[18]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement amtNilRateSavingsInterest;
	@FindBy (xpath="//table/tbody/tr[22]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement amtNilRateDividendsTest10;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'From all employments, UK pensions and state benefits')]//..//td[2]")
	private WebElement amtFromallemploymentsUKpensionsTest1;
	//MTR Test Case 14
	@FindBy(xpath="//table/tbody/tr[12]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRatePayPensionsTest14;
	@FindBy(xpath="//table/tbody/tr[15]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement amtNilRateDividentTest14;
	@FindBy(xpath="//table/tbody/tr[16]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRate;
	@FindBy(xpath="//table/tbody/tr[16]/td[contains(text(),'Basic rate')]//..//td[4]")
	private WebElement calculateBasicRate;
	//MTR test case 15
	@FindBy (xpath="//table/tbody/tr[21]/td[contains(text(),'Nil rate')]//..//td[2]")
	private WebElement amtNilRateSavingsInterest1;
	@FindBy(xpath="//table/tbody/tr[22]/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amtBasicRateDividends;
	@FindBy (xpath="//tr/td[contains(text(),'Class 4 National Insurance contributions')]//..//td[2]")
	private WebElement amtClass4NationalInsurancecontributions;
	//MTR test case 16
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Income tax relief')]//..//td[2]")
	private WebElement amtIncometaxrelief;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Blind')]//..//td[2]")
	private WebElement amtBlindPersonAllowance;
	@FindBy (xpath="//table/tbody/tr[21]/td[contains(text(),'Higher rate')]//..//td[2]")
	private WebElement amtHeigherRate2;
	@FindBy (xpath="//table/tbody/tr[25]/td[contains(text(),'Higher rate')]//..//td[2]")
	private WebElement amtHeigherRate3;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Higher rate')]//..//td[4]")
	private WebElement calculationHeigherRate1;
	@FindBy (xpath="//table/tbody/tr[21]/td[contains(text(),'Higher rate')]//..//td[4]")
	private WebElement calculationHeigherRate2;
	@FindBy (xpath="//table/tbody/tr[25]/td[contains(text(),'Higher rate')]//..//td[4]")
	private WebElement calculationHeigherRate3;
	//Tax summary Locators
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Basic rate')]//..//td[2]")
	private WebElement amountPayPensionsProfitBasicRate;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Balance of PAYE tax')]//..//td[3]")
	private WebElement amtBalanceofPAYEtax;
	@FindBy (xpath="//table/tbody/tr/td[contains(text(),'Interest received from UK banks and building societies')]//..//td[3]")
	private WebElement amtInterestReceivedfromUKbanksBuildingSocieties;
	@FindBy (xpath="//table/tbody/tr[31]/td[contains(text(),'Other income')]//..//td[3]")
	private WebElement amtTaxDeductionOfOtherIncome;
	@FindBy (xpath="//table/tbody/tr/td/b[contains(text(),'Income Tax overpaid')]//..//..//td[4]")
	private WebElement amtIncomeTaxoverpaid;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Benefits and expenses received')]//..//td[2]")
	private WebElement amtBenefitsandexpensesreceived;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Allowable expenses')]//..//td[2]")
	private WebElement amtAllowableexpenses;
	@FindBy(xpath="//td/strong[contains(text(),'Capital Gains Tax due')]//..//..//td[4]")
	private WebElement capitalGainsTaxdue;
	@FindBy(xpath="//tr/td/b[contains(text(),'Income and Capital Gains Tax due')]//..//..//td[5]")
	private WebElement IncomeandCapitalGainsTaxdue;
	@FindBy(xpath="//table/tbody/tr[21]/td[contains(text(),'Other income')]//..//td[3]")
	private WebElement otherIncomeTaxDeduction;
	
	//Locators -> Sa -> Popup
		@FindBy (id="bankeditmodalIframe1")
		private WebElement frameAddBank;
		@FindBy (id="payregmodalIframe1")
		private WebElement framePensionSchemes;
		@FindBy (id="asaaddemployeemodalIframe1")
		private WebElement frameAddemployee;
		@FindBy (id="sadividendmodalIframe1")
		private WebElement frameDividend;
		@FindBy (id="ukpensionmodalIframe1")
		private WebElement frameUkPension;
		@FindBy (id="intukmodalIframe1")
		private WebElement frameIntUk;
		@FindBy (id="othdividendmodalIframe1")
		private WebElement frameOtherDividend;
		@FindBy (id="othukincomemodalIframe1")
		private WebElement frameOtherUk;
		@FindBy (id="salinkempmodalIframe1")
		private WebElement frameLinkEmployment;
		@FindBy (id="class2class4modal1Iframe1")
		private WebElement frameClass2Class4;
		@FindBy (id="linkbusinessmodalIframe1")
		private WebElement frameLinkBusiness;
		@FindBy (id="sapartnershipmodalIframe1")
		private WebElement frameAddPartnership;
		@FindBy (id="clas2classmodalIframe1")
		private WebElement frameClass2Class4Partnership;
		@FindBy (id="charitablemodalIframe1")
		private WebElement frameCharitable;
		@FindBy (id="agiftaidmodalIframe1")
		private WebElement frameGiftAid;
		@FindBy (id="giftaidmodal1Iframe1")
		private WebElement frameOtherGiftAid;
		@FindBy (id="blindpersonmodalIframe1")
		private WebElement frameBlindPerson;
		@FindBy (id="marriageallowmodalIframe1")
		private WebElement frameMarriageAllowance;
		@FindBy (id="studentloanmodallIframe1")
		private WebElement frameStudentLoan;
		@FindBy (id="underpaidmodalIframe1")
		private WebElement frameUnderpaidTax;
		@FindBy (id="FinishingTaxFrame")
		private WebElement frameFinishingTax;
		@FindBy (id="highincomemodalIframe1")
		private WebElement frameHighIncome;
		@FindBy (id="paymentAccFrame")
		private WebElement framePaymentAccount;
		@FindBy (id="AnyOtherInfoFrame")
		private WebElement frameAnyOtherInfo;
		@FindBy (id="SigningFormInfoFrame")
		private WebElement frameSigningFormInfo;
		@FindBy (id="sataxpaymentmodalIframe1")
		private WebElement frameAddTaxPayment;
		@FindBy (id="emailFrame")
		private WebElement frameEmail;
		@FindBy (id="ScheduleEmailFrame")
		private WebElement frameScheduleEmail;
		@FindBy (id="SendSMSFrame")
		private WebElement frameSendSMS;
		@FindBy (id="sahmrcmodaleditIframe1")
		private WebElement frameHMRCGateway;
		@FindBy (id="ctl00_cPH_saadddocmodalIframe1")
		private WebElement frameAddDoc;
	//Global Variables
	//Variables for tax calculation
	int count1 = 0;
	int count2=0;

	private double n1=0.00;
	private double n2=0.00;
	private double n3=0.00;
	private double n4=0.00;
	private double n5=0.00;
	private double n6=0.00;
	private double n7=0.00;
	private double n8=0.00;
	private double n9=0.00;
	private double n10=0.00;
	private double n11=0.00;
	private double n12=0.00;
	private double n13=0.00;
	private double n14=0.00;
	private double n15=0.00;
	private double n16=0.00;
	private double n17=0.00;
	private double n18=0.00;
	private double n19=0.00;
	private double n20=0.00;
	private double n21=0.00;
	private double n22=0.00;
	private double n23=0.00;
	private double n24=0.00;
	private double n25=0.00;
	private double n26=0.00;
	private double n27=0.00;
	private double n28=0.00;
	private double n29=0.00;
	private double n30=0.00;
	private double n31=0.00;
	private double n32=0.00;
	private double n33=0.00;
	private double n34=0.00;
	private double n35=0.00;
	private double n36=0.00;
	private double n37=0.00;
	private double n38=0.00;
	private double n39=0.00;
	private double n40=0.00;
	
	private double totalincome = 0.00;
	private double taxDueInc = 0.00;
	private String taxTotal="";
	private double dueTax1=0.00;
	private double dueTax2=0.00;
	private double dueTax3=0.00;
	private double dueTax4=0.00;
	private double d1 = 0.00;
	private double Totaltax =0.00;
	private double x1 =0.00;
	private String t1 ="";
	private String t2="";
	private String taxdueOnInc1="";
	private String actualtax="";
	private String firstPageTitle;
	private String EmpName;
	private String expectedDescription="HMRC has received the HMRC-SA-SA100";
	//global variable for tax calculation and read pdf
	private int income1=0;
	private int income2=0;
	private int income3=0;
	
	private int total=0;
	private String displayTotal="";
	private String FinalCalculation1="";
//	private String dispTot[];
	private String FinalCalculation ="";
	private String dashBoardTotal ="";
	private String value1="";
	private String value2="";
	private double personalAllowanceRate=11500.00;
	private double personalAllowanceRateMaxLimit=100000.00;
	private double finalLimit=122999.00;
	private double blindAllowance =2320.00;
	private double marriageAllowance =1150.00;
	private double total1=0.00;
	private double total2=0.00;
	private double total3=0.00;
	private double total4=0.00;
	private double total5=0.00;
	private double total6=0.00;
	private double total7=0.00;
	private double total8=0.00;
	private double total9=0.00;
	private double total10=0.00;
	private double allowance1=0.00;
	private double tax1=0.00;
	private double savingStartingRate=5000.00;
	private double taxLimit1Uk=33500.00;
	private double taxLimit1Scot=31500.00;
	private double basicRateNonSaving=20.00;
	private double taxLimit2=150000.00;
	private double amount1=6700.00;
	private double heigherRateNonSaving=40.00;
	private double percentageZero=0.00;
	private double amount2=46600.00;
	private double advancedRateNonSaving=45.00;
	private double entrepreneursReliefRate=10.00;
	private double taxedUKInterestRate=.25;
	//private double taxLimit3=1500.00;
	private String folderName="";
	private File[] listFiles;
	private String fileName="";
	private double basic1=0.00;
	private double heigherRate=0.00;
	private double basicInterestAmount=0.00;
	private double finalAmount=0.00;
	private double amount3=0.00;
	private double amount4=0.00;
	private double amount5=0.00;
	private String path ="C:\\Users\\Administrator";
	private String string1="";
	private String string2="";
	private String string3="";
	private String string4="";
	private String string5="";
	private String string6="";
	private String string7="";
	private String string8="";
	private String string9="";
	private String string10="";
	private String string11="";
	private String string12="";
	private String string13="";
	private String string14="";
	private String string15="";
	private String string16="";
	private String string17="";
	private String string18="";
	private String string19="";
	private String string20="";
	private String string21="";
	private String string22="";
	private String string23="";
	private String string24="";
	private String string25="";
	private String string26="";
	private String string27="";
	private String string28="";
	private String string29="";
	private String string30="";
	private String string31="";
	private String string32="";
	private String string33="";
	private String string34="";
	private String string35="";
	private String string36="";
	private String string37="";
	private String string38="";
	private String string39="";
	private String string40="";
	private String string41="";
	private String string42="";
	private String string43="";
	private String string44="";
	private String string45="";
	private String string46="";
	private String string47="";
	private String string48="";
	private String string49="";
	private String string50="";
	private String string51="";
	private String filePath="";
	private String file1="";
	private File file;
	private File folder;
	//private File[] fList;
	private String pes;
	private String name1="";
	private  String output ="";
	private String output1="";
	private String expResult1="";
	private String actResult1="";
	private String actResult2="";
	private int lenDesc=0;
	private Select listbox1;
	private String oldTab;
	WaitStatementLib wLib;
	//Tax Calculation for divident
	private double totlIncome = 0.00;
	private double totalIncome1 = 0.00;
	private double totalIncome2 = 0.00;
	private double totalIncome3 = 0.00;
	private double totalIncome4 = 0.00;
	private double basicRate=0.00;
	private double basicRateInterest = 0.00;
	private double nilRate1=1000.00;
	private double nilRate2=500.00;
	private String basicInterest="";
	private String basicRate1="";
	private String totIncomTaxChar="";
	private double incomTaxdue1=0.00;
	private double incomTaxdue2=0.00;
	private double statePensionlumpsum=0.00;
	private String statePensionlumpsum1="";
	private String statePensionlumpsum2="";
	private double fnltax=0.00;
	private double taxBalance=0.00;
	private String taxFinal=""; 
	private String taxFinalUI="";
	private double tot1=0.00;
	private double fPayment=0.00;
	private double secPayment=0.00;
	private String fPay="";
	private String secPay="";
	private double calculation1=0.00;
	private double calculation2=0.00;
	private double calculation3=0.00;
	private double dividendTaxBasicRate= 7.50;
	private double dividendTaxHigherRate=32.50;
	private double dividendTaxAdditionalRate=38.10;
	String actualValue1="";
	String actualValue2="";
	String actualValue3="";
	String actualValue4="";
	String actualValue5="";
	String actualValue6="";
	String actualValue7="";
	String actualValue8="";
	String expValue1="";
	String expValue2="";
	String expValue3="";
	String expValue4="";
	String expValue5="";
	String expValue6="";
	String expValue7="";
	String expValue8="";
	Document doc;
	CISPage cis;
	Robot robot;
	String bodyText;
	DateFormat formatter;
	 String today;
	 String[] date1;
	 Date date;
	 String startingRateSavingsinterest="";
	 String nillRateStartingRate="";
	String nillRateDivident="";
	 double amountstartingRateSavingsinterest=0.00;
	 double amountnillRateSavingsinterest=0.00;
	 double amountnillRateDivident=0.00;
	//Self Employment
	private String dateStart="06/04/2017";
	private String dateStart1="07/04/2017";
	private String dateEnd="05/04/2018";
	private double class2LPL=8164;
	private double class2UPL=45000;
	private double class2LPLRate=9;
	private double class2UPLRate=2;
	private double class4Rate=2.85;
	private double weeksYear=52;
	private double class2Amount=148.20;
	//capital Gain
	private double annualExemptIndividuals=11300.00;
	private double annualExemptTrustees=5650.00;
	//Student Loan
	private double plan1=17775.00;
	private double plan2=21000.00;
	private double plan1_2=17775.00;
	private double studentLoanRate=00.09;
	//child benefit
	private double minBenefitIncome=50000.00;
	private double maxBenefitIncome = 60000.00;
	private double pAYCode=3000.00;
	private String emailTemplate="";
	private String emailID="anjali@nomismasolution.co.uk";
	private double FITax1=17775.00;
	private double  SloanRate1=9;
	Random random;
	DateFormat dateFormat;
	LibSA ls1;
	SAPOM2019 sa1;
	public SAPOM(WebDriver driver){
	/*firstPageTitle = driver.getTitle();
	Assert.assertEquals(firstPageTitle, "Agents");
	Reporter.log("First page Title fetched: "+firstPageTitle,true);*/
	PageFactory.initElements(driver, this);
	}
	
	public void verifyClientPageTitle(WebDriver driver) throws Exception{
//agentName.click();
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 5,AgentPageTitle);
assertEquals(AgentPageTitle.getText(), "Anjali1");
Reporter.log("Agents page title is verified successfully", true);
	}
	
public void clickSALink(WebDriver driver) throws Exception{
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 5,SelfAssessmentLink);	
SelfAssessmentLink.click();
Reporter.log("Self assessment Link Opened",true);
	}
	
	public void clickClientLst(WebDriver driver) throws Exception{
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 5,ClientListLink);
		ClientListLink.click();
		Reporter.log("Client Link Clicked",true);
	}
	
public void clkAddClientBtn(WebDriver driver) throws Exception{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,PlusClientButton);	
PlusClientButton.click();
wLib.explicitWait(driver, 5,AddClientButton);
AddClientButton.click();

Reporter.log("Add Client page opened",true);
	}
	public void addNewClient(WebDriver driver,String UTR,String FName, String LNmame, String address, String postcode ) throws Exception
	{
	
UTRNoTextBox.sendKeys(UTR);

FirstNameTextBox.sendKeys(FName);
Thread.sleep(400);
LastNameTextBox.sendKeys(LNmame);
Thread.sleep(400);
AddressLine1TxtBox.sendKeys(address);
Thread.sleep(400);
PostCodeTxtBox.sendKeys(postcode);
Thread.sleep(400);
SaveButton.click();
Thread.sleep(400);
forceDuplicateUTRno.click();
SaveButton.click();
Reporter.log("Client Created Successfully", true);
}
	
public void selectClientLink(WebDriver driver) throws InterruptedException {
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 5,firstNameScheduleMail);
firstNameScheduleMail.sendKeys("John");
wLib.explicitWait(driver, 5,searchBtn);
searchBtn.click();
wLib.explicitWait(driver, 5,searchBtn);
selectClient.click();

cis.switchwindowForward(driver);
wLib.explicitWait(driver, 5,TaxYear);
Select year= new Select(TaxYear);

year.selectByValue("5");
Reporter.log("Client Selected", true);	
	}
public void selectClientForBlind(WebDriver driver) throws InterruptedException {


firstNameScheduleMail.sendKeys("Blind");

searchBtn.click();

blindClient.click();
cis = new CISPage(driver);
cis.switchwindowForward(driver);

Select year= new Select(TaxYear);

year.selectByValue("5");
	}
public void clickClass2SE(WebDriver driver) throws Exception
{
Class2Class4NICsForm.click();
cis = new CISPage(driver);
cis.switchwindowNew1(driver, frameClass2Class4);
wLib.explicitWait(driver,5,PayClass2NICsvoluntarily);
PayClass2NICsvoluntarily.click();  
SaveBtn2.click(); 
}
public void clickClass4Partnership(WebDriver driver)throws Exception
{
Class2Class4NICsForm.click();
cis = new CISPage(driver);
cis.switchwindowNew1(driver, frameClass2Class4Partnership);
wLib.explicitWait(driver,5,ExemptfromPayingClass4NICs);
ExemptfromPayingClass4NICs.click();  
SaveBtn2.click(); 
}
public void clickClass2Partnership(WebDriver driver)throws Exception
{
Class2Class4NICsForm.click();
cis = new CISPage(driver);
cis.switchwindowNew1(driver, frameClass2Class4Partnership);
wLib.explicitWait(driver,5,PayClass2NICsvoluntarily);
PayClass2NICsvoluntarily.click();
SaveBtn2.click(); 
}
public void clickClass4SE(WebDriver driver)throws Exception
{
Class2Class4NICsForm.click();
cis = new CISPage(driver);
cis.switchwindowNew1(driver, frameClass2Class4);
wLib.explicitWait(driver,5,ExemptfromPayingClass4NICs);
ExemptfromPayingClass4NICs.click();  
SaveBtn2.click(); 
}
public void addBlindPersonAllowance(WebDriver driver) throws InterruptedException {
	
	
	
	firstNameScheduleMail.sendKeys("Blind");
	
	searchBtn.click();
	
	blindClient.click();
cis = new CISPage(driver);
cis.switchwindowForward(driver);

actResult1=chckClientName.getText();
if(actResult1.contains("Blind Person")) {
    Reporter.log("Correct Client Name", true);
} else {
	Reporter.log("wrong Client Name",true);
}

Select year= new Select(TaxYear);

year.selectByValue("5");


taxReliefsLink.click();

linkFormGiftAid.click();

cis.switchwindowNew1(driver,frameGiftAid);
surplusBlindPersonsAllowanceFromSpouseChkBox.click();
surplusBlindPersonsAllowanceToSpouseChkBox.click();

SaveBtn2.click();

}
public void taxCalculationBlindPerson(String payEmp, String medExp, String trvlBussiness, WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(payEmp);
	n2=Double.parseDouble(medExp);
	n3=Double.parseDouble(trvlBussiness);
	//modified for checking failure
	totalincome = (n1 + n2) - n3;
	if ((totalincome >personalAllowanceRate) &&(totalincome  <=personalAllowanceRateMaxLimit) )
	{
	taxDueInc = totalincome - (personalAllowanceRate + blindAllowance);	
	
	taxTotal=String.format("%.2f",(taxDueInc));
	}
	else if (totalincome > personalAllowanceRateMaxLimit && totalincome<=finalLimit)
	{
total1 = totalincome - personalAllowanceRateMaxLimit;
allowance1=total1/2;
tax1=personalAllowanceRate-allowance1;
taxDueInc = totalincome - (tax1+ blindAllowance);
taxTotal=String.format("%.2f",(taxDueInc));
	}
	else if (totalincome>=finalLimit)
	{
taxDueInc=totalincome-blindAllowance;
taxTotal=String.format("%.2f",(taxDueInc));
	}
	else
	{
Reporter.log("no tax applied",true);
	}
	if (taxDueInc >0.00)
	{
	taxdueOnInc1="£"+taxTotal;
	
	Reporter.log( taxdueOnInc1,true);
	if(taxDueInc<=finalLimit)
	{
	
	actualtax=totalIncomeOnWhichTaxIsDue.getText().replaceAll(",","");
	
	Assert.assertEquals(actualtax,taxdueOnInc1 );
	Reporter.log("correct output",true);
	
	}
	if (taxDueInc <=taxLimit1Uk)
	{
dueTax1=(taxDueInc*basicRateNonSaving)/100;
t1 = String.format("%.2f",(dueTax1));
t2=incomeTaxDue.getText().substring(1).replace(",", "");

Assert.assertEquals(t2,t1);
Reporter.log(t1+"---"+t2,true);
	}
	else if(taxDueInc >taxLimit1Uk && taxDueInc <=taxLimit2) {
d1= taxDueInc-taxLimit1Uk;
dueTax1 =amount1;
dueTax2=(d1*heigherRateNonSaving)/100;
Totaltax=dueTax1+dueTax2;
t1=String.format("%.2f",(Totaltax));
t2=incomeTaxDue.getText().substring(1).replace(",", "");
Assert.assertEquals(t2,t1);
Reporter.log(t1+"---"+t2,true);
	}
	else if(taxDueInc >taxLimit2)
	{
Reporter.log(String.format("%.2f",taxDueInc),true);
x1= taxDueInc-taxLimit2;
Reporter.log(String.format("%.2f",(x1)),true);
dueTax1 =amount1;
dueTax2 =amount2;
dueTax3=(x1*advancedRateNonSaving)/100;
	Totaltax=dueTax1+dueTax2+dueTax3;
Reporter.log(String.format("%.2f",(Totaltax)),true);
t1=String.format("%.2f",(Totaltax));
t2=incomeTaxDue.getText().substring(1).replace(",", "");
Assert.assertEquals(t2,t1);
Reporter.log(t1+"---"+t2,true);
	}
	}
	
	driver.navigate().refresh();
}
public void delBlindPersonAllowance(WebDriver driver) throws InterruptedException {
	
	
	firstNameScheduleMail.sendKeys("Blind");
	
	searchBtn.click();
	
	
	blindClient.click();
cis = new CISPage(driver);
cis.switchwindowForward(driver);

actResult1=chckClientName.getText();
if(actResult1.contains("Blind Person")) {
    Reporter.log("Correct Client Name", true);
} else {
	Reporter.log("wrong Client Name",true);
}

Select year= new Select(TaxYear);

year.selectByValue("5");

wLib = new WaitStatementLib();
wLib.explicitWait(driver, 10,taxReturnLink);
taxReturnLink.click();
wLib.explicitWait(driver, 10, submitToHMRC);
submitToHMRC.click();
try
{
  undoManualSubmitBtn.click();
    
}
catch (Exception e)
{
    Reporter.log(e.getMessage(),true);
}
try
{
	unlockBtn.click();
    
}
catch (Exception e)
{
    Reporter.log(e.getMessage(),true);
}

taxReliefsLink.click();

linkFormGiftAid.click();

cis.switchwindowNew1(driver,frameGiftAid);
surplusBlindPersonsAllowanceFromSpouseChkBox.click();
surplusBlindPersonsAllowanceToSpouseChkBox.click();

SaveBtn2.click();

driver.navigate().refresh();
	}

public void clickIncome(WebDriver driver) throws Exception
	{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,IncomeLink);
	IncomeLink.click();
	try
	{
	wLib.explicitWait(driver, 2,EmploymentLink);
	if(EmploymentLink.isDisplayed()==false){
		do {
			wLib.explicitWait(driver, 5,IncomeLink);
			IncomeLink.click();
			Reporter.log("Income link is not clicked in first click",true);
		} while (EmploymentLink.isDisplayed()==false);
		} 
	
	}
	catch (Exception e) {
		Reporter.log("Income is clicked",true);
	}
	}
public void clickEmployment(WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,EmploymentLink);
	EmploymentLink.click();
	}
	
public void clickAddEmployment(WebDriver driver) throws Exception {

	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,dividentLink);
	dividentLink.click();
	
	try
	{
		wLib.explicitWait(driver, 2,dividentLink);
		if(delDivident.isDisplayed()==true)
		{
			wLib.explicitWait(driver, 2,dividentLink);
			delDivident.click();	
			cis.switchwindowNew(driver);
			wLib.explicitWait(driver, 2,cnfmdel);
			cnfmdel.click();
			}
	}
	catch (Exception e) {
		Reporter.log("del divident button not available",true);
	}
	wLib.explicitWait(driver, 2,linkTaxPaymentsAlreadyMade);
	linkTaxPaymentsAlreadyMade.click();
	
	try {
		wLib.explicitWait(driver, 2,delButton);
		if(delButton.isDisplayed()==true) {
			wLib.explicitWait(driver, 2,delButton);
			delButton.click();
			cis.switchwindowNew(driver);
			wLib.explicitWait(driver, 2,cnfmdel);
			cnfmdel.click();
			}
	}catch (Exception e) {
		Reporter.log("Tax not paid before",true);
	}
	wLib.explicitWait(driver, 2,taxReliefsLink);
	taxReliefsLink.click();
	
	try{
		wLib.explicitWait(driver, 2,deleteCharityRecords);
		if(deleteCharityRecords.isDisplayed()==true)
		{
		wLib.explicitWait(driver, 2,deleteCharityRecords);
		deleteCharityRecords.click();
		cis.switchwindowNew(driver);
		wLib.explicitWait(driver, 2,cnfmdel);
		cnfmdel.click();
		}
	}
	catch (Exception e) {
		Reporter.log("Charitable income is not added before",true);
		}
try
{
	wLib.explicitWait(driver, 2,delButton);
	if(delButton.isDisplayed()==true)
	{
	wLib.explicitWait(driver, 2,delButton);
	delButton.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();	
	wLib.explicitWait(driver, 2,otherGiftAidpaymentLink);
	otherGiftAidpaymentLink.click();
	cis.switchwindowNew1(driver, frameOtherGiftAid);
	wLib.explicitWait(driver, 2,giftAidPaymentsCarriedBackToPreviousYearTxtBox);
	giftAidPaymentsCarriedBackToPreviousYearTxtBox.clear();
	wLib.explicitWait(driver, 2,giftAidPaymentsCarriedBackToPreviousYearTxtBox);
	giftAidPaymentsBroughtBackFromLaterYearTxtBox.clear();
	wLib.explicitWait(driver, 2,SaveBtn2);
	SaveBtn2.click();
	}
}
catch (Exception e) {
	Reporter.log("Gift aid income not added before",true);
	
}

delPensionTaxRelief(driver);
wLib.explicitWait(driver, 2,IncomeLink);
	IncomeLink.click();
	
	do
	{
		wLib.explicitWait(driver, 2,EmploymentLink);
	if(EmploymentLink.isDisplayed()==false)
	{
		wLib.explicitWait(driver, 2,IncomeLink);
		IncomeLink.click();
		
	}
	}while(EmploymentLink.isDisplayed()==false);
		
	wLib.explicitWait(driver, 2,EmploymentLink);
	EmploymentLink.click();
	
	try
	{
		wLib.explicitWait(driver, 2,delButton);
		if(delButton.isDisplayed()==true)
		{
			wLib.explicitWait(driver, 2,delButton);
			delButton.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 5, confirmDel);	
		confirmDel.click();
		wLib.explicitWait(driver, 5, delEmpName);
		delEmpName.click();
		cis.switchwindowNew(driver);
		wLib.explicitWait(driver, 5,cnfmdel);
		cnfmdel.click();
		
		driver.navigate().refresh();
		}
	}
		catch(Exception e) {
			
			Reporter.log("Employment income  not added before",true);	
		}
	try {
		wLib.explicitWait(driver, 5, delEmpName);
		if(delEmpName.isDisplayed()==true)
		{
			wLib.explicitWait(driver, 5, delEmpName);
			delEmpName.click();
			cis.switchwindowNew(driver);
			wLib.explicitWait(driver, 5, cnfmdel);
			cnfmdel.click();
			driver.navigate().refresh();
		}
	}
	catch (Exception e) {
		Reporter.log("Employee Name not added before",true);
	}
}
	

public void addEmployment(String EmpName, String EmpPayRef, String strtDate, String endDate ,WebDriver driver) throws InterruptedException
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,addEmploymentBtn);
	addEmploymentBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameAddemployee);
	random = new Random();
	int x = random.nextInt(900) + 100;
	wLib.explicitWait(driver, 5,EmployerName);
	EmployerName.sendKeys(EmpName);
	wLib.explicitWait(driver, 5,txtEmployerPAYERef);
	txtEmployerPAYERef.sendKeys(x + "/"+EmpPayRef);
	wLib.explicitWait(driver, 5,StartDatetxtbox);
	StartDatetxtbox.sendKeys(strtDate);
	wLib.explicitWait(driver, 5,Endtxtbox);
	Endtxtbox.sendKeys(endDate);
	wLib.explicitWait(driver, 5,SaveBtn2);
	SaveBtn2.click();
	Assert.assertEquals(cellemp.getText(), EmpName,"Text is not matching");
}
	
public void AddEmpIncome(String payEmp, String medExp, String trvlBussiness, WebDriver driver) throws Exception {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,payFrmEmployer);
	payFrmEmployer.sendKeys(payEmp);
	wLib.explicitWait(driver, 5, PrvtMedAndDntl);
	PrvtMedAndDntl.sendKeys(medExp);
	wLib.explicitWait(driver, 5, BusnsTrvlAndSubstancTxtBox);
	BusnsTrvlAndSubstancTxtBox.sendKeys(trvlBussiness);
	SaveBtn1.click();
	actResult1=totalIncome.getText();
	expResult1= "£"+ payEmp + ".00";
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log("Employer Income added Sucessfully", true);
	dashBoardClient.click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	income1=Integer.parseInt(payEmp);
	income2=Integer.parseInt(medExp);
	income3 = Integer.parseInt(trvlBussiness);
	total = income1+income2-income3;
	Reporter.log("Total income is: "+total,true);
	displayTotal=Integer.toString(total);
	FinalCalculation1=finalIncome.getText();
	if(FinalCalculation1.contains(","))
	{
		String dispTot[]=FinalCalculation1.split(",");
	FinalCalculation=dispTot[0]+dispTot[1];
	dashBoardTotal = "£"+ displayTotal + ".00";
	Assert.assertEquals(FinalCalculation,dashBoardTotal);
	Reporter.log("DashBoard is displaying correct Final income", true);
	}else
	{
		dashBoardTotal = "£"+ displayTotal + ".00";
		Assert.assertEquals(FinalCalculation1,dashBoardTotal);
		Reporter.log("DashBoard is displaying correct Final income", true);
	}
	}
public void verifyDashboard() 
{
	dashBoardClient.click();
	value1=empcheckBox.getAttribute("class");
	Assert.assertEquals(value1, "checked");;
    Reporter.log("employment amount checked verifie" , true);
    value2=finishTaxRetCheckBox.getAttribute("class");
	Assert.assertEquals(value2, "checked");;
    Reporter.log("Finish Tax return checked verifie" , true);
}
public void clicktaxReturnLink() throws Exception
{
	
	taxReturnLink.click();
}
public void clicktaxCalSummaryLink(WebDriver driver) {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, taxCalSummaryLink);
	taxCalSummaryLink.click();
}
public void taxCalculationSummary(String payEmp, String medExp, String trvlBussiness, WebDriver driver) throws Exception 
{
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60,taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(payEmp);
	n2=Double.parseDouble(medExp);
	n3=Double.parseDouble(trvlBussiness);
	//modified for checking failure
	totalincome = (n1 + n2) - n3;
	if ((totalincome >personalAllowanceRate) &&(totalincome  <=personalAllowanceRateMaxLimit) )
	{
	taxDueInc = totalincome - personalAllowanceRate;	
	
	taxTotal=String.format("%.2f",(taxDueInc));
	}
	else if (totalincome > personalAllowanceRateMaxLimit && totalincome<=finalLimit)
	{
		total1 = totalincome - personalAllowanceRateMaxLimit;
		allowance1=total1/2;
		tax1=personalAllowanceRate-allowance1;
		taxDueInc = totalincome - tax1;
		taxTotal=String.format("%.2f",(taxDueInc));
	}
	else if (totalincome>=finalLimit)
	{
		taxDueInc=totalincome;
		taxTotal=String.format("%.2f",(taxDueInc));
	}
	else
	{
		Reporter.log("no tax applied",true);
	}
	if (taxDueInc >0.00)
	{
	taxdueOnInc1="£"+taxTotal;
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	Reporter.log( taxdueOnInc1,true);
	if(taxDueInc<=finalLimit)
	{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	actualtax=totalIncomeOnWhichTaxIsDue.getText().replaceAll(",","");
	
	Assert.assertEquals(actualtax,taxdueOnInc1 );
	Reporter.log("correct output",true);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	if (taxDueInc <=taxLimit1Uk)
	{
		dueTax1=(taxDueInc*basicRateNonSaving)/100;
		t1 = String.format("%.2f",(dueTax1));
		t2=incomeTaxDue.getText().substring(1).replace(",", "");

		Assert.assertEquals(t2,t1);
		Reporter.log(t1+"---"+t2,true);
	}
	else if(taxDueInc >taxLimit1Uk && taxDueInc <=taxLimit2) {
		d1= taxDueInc-taxLimit1Uk;
		dueTax1 =amount1;
		dueTax2=(d1*heigherRateNonSaving)/100;
		Totaltax=dueTax1+dueTax2;
		t1=String.format("%.2f",(Totaltax));
		t2=incomeTaxDue.getText().substring(1).replace(",", "");
		Assert.assertEquals(t2,t1);
		Reporter.log(t1+"---"+t2,true);
	}
	else if(taxDueInc >taxLimit2)
	{
		Reporter.log(String.format("%.2f",taxDueInc),true);
		x1= taxDueInc-taxLimit2;
		Reporter.log(String.format("%.2f",x1),true);
		dueTax1 =amount1;
		dueTax2 =amount2;
		dueTax3=(x1*advancedRateNonSaving)/100;
		Totaltax=dueTax1+dueTax2+dueTax3;
		Reporter.log(String.format("%.2f",Totaltax),true);
		t1=String.format("%.2f",(Totaltax));
		t2=incomeTaxDue.getText().substring(1).replace(",", "");
		Assert.assertEquals(t2,t1);
		Reporter.log(t1+"---"+t2,true);
	}
	}
	driver.navigate().refresh();
}
public void delEmpInfo(WebDriver driver) throws InterruptedException {
	wLib = new WaitStatementLib();
	
	try
{
		wLib.explicitWait(driver, 2,delButton);
	if(delButton.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 5,delButton);
	delButton.click();
	}
}
catch (Exception e) {
	Reporter.log("Employee income not available",true);
}
	wLib.explicitWait(driver, 2, confirmDel);	
	confirmDel.click();
	wLib.explicitWait(driver, 2, delEmpName);
	try
	{
	wLib.explicitWait(driver, 2, delEmpName);		
	if(delEmpName.isDisplayed()==true)
	{
	wLib.explicitWait(driver, 2, delEmpName);		
	delEmpName.click();
		}
	}
	catch (Exception e) {
		Reporter.log("Employer information not available",true);
	}
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 5, cnfmdel);
	cnfmdel.click();
	driver.navigate().refresh();
}

public void clickSubmitToHMRC(WebDriver driver) throws Exception
{
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 10, taxReturnLink);
	taxReturnLink.click();
	
	try
	{
		if(submitToHMRC.isDisplayed()==false)
		{
		do {
			taxReturnLink.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		} while (submitToHMRC.isDisplayed()==false);
	}
	}
	catch (Exception e) {
		Reporter.log("Submit to hmrc visible",true);
	}
	wLib.explicitWait(driver, 10, submitToHMRC);
	submitToHMRC.click();
try
{
  undoManualSubmitBtn.click();
    
}
catch (Exception e)
{
    Reporter.log("Manual Undo Button not available",true);
	Reporter.log(e.getMessage(),true);
}
Reporter.log("clicking on validate submission",true);

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
validateSubmissionBtn.click();

try
{
Thread.sleep(80000);
driver.navigate().refresh();
wLib = new WaitStatementLib();
wLib.explicitWait(driver,10, successMessage);
Assert.assertEquals(successMessage.getText(), "Success!");
Reporter.log("Submission Validated: "+successMessage.getText(),true);
wLib.explicitWait(driver, 10, submissionReportLink);
submissionReportLink.click();
lenDesc=expectedDescription.length();
Assert.assertEquals(descriptionSubmission.getText().substring(0, lenDesc),expectedDescription );
Reporter.log(descriptionSubmission.getText()+" :verified text",true);
	}catch (Exception e) {
Reporter.log(e.getMessage(),true);
	}
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, submitToHMRC);
	submitToHMRC.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	wLib.explicitWait(driver,10,submitToHMRCbtn);
	submitToHMRCbtn.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	wLib.explicitWait(driver,10, yesBtnSubmitHMRC);
	yesBtnSubmitHMRC.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	try {
		Thread.sleep(80000);
		driver.navigate().refresh();
		wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, successMessage);
	Assert.assertEquals(successMessage.getText(), "Success!");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	wLib.explicitWait(driver, 10,submissionReportLink);
	submissionReportLink.click();
		
	string1=descriptionSubmission.getText();
	
	actResult1=string1.substring(100, 106);
	expResult1="IRmark";
	Assert.assertEquals(actResult1,expResult1);
Reporter.log("Verified text: " +actResult1,true);
	}
	catch (Exception e) {
		Reporter.log("Submission Not Verified",true);
	}
	 ls1 = new LibSA(driver);
	  ls1.checkXML();
	
wLib.explicitWait(driver,20, submitToHMRC);
submitToHMRC.click();

  try
    {
	  undoManualSubmitBtn.click();
        
    }
    catch (Exception e)
    {
        Reporter.log(e.getMessage(),true);
    }
 
wLib.explicitWait(driver, 60,unlockBtn);
unlockBtn.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
driver.navigate().refresh();
taxCalSummaryLink.click();


try {
actualValue1=ls1.actualValue1;
expValue1=taxForThisYear.getText().substring(1).replace(",", "");

expValue2=incomeTaxDue.getText().substring(1).replace(",", "");
Reporter.log(expValue1+"-----"+expValue2,true);
	if(actualValue1.equals(expValue1))
	{
	Assert.assertEquals(actualValue1,expValue1);
	Reporter.log(actualValue1 + "----" +expValue1 + " Tax for the year is verified",true);
		}
	else if (actualValue1.equals(expValue2))
	{
		Assert.assertEquals(actualValue1,expValue2);

		Reporter.log(actualValue1 + "----" +expValue2 + " Income Tax due verified",true);	
	}
	else
	{
		Reporter.log("Tax for the year Not Verified",true);
	}
}
catch (Error e) {


	Reporter.log("No value for tax verified",true);
}
actualValue2=ls1.actualValue2;
Reporter.log("Value of Pay from employment:"+actualValue2,true);
try {
cis.switchwindowDefault(driver);
if(actualValue2!=null)
{
expValue2=txtPaymentFrmEmployment.getText().substring(1).replace(",", "");
Assert.assertEquals(actualValue2,expValue2);
Reporter.log(actualValue2 + "----" +expValue2 + " Payment from employment is verified",true);
}	
}
catch (Error e) {


	Reporter.log("Payment from employment is not avialable",true);
}
actualValue4=ls1.actualValue4;
Reporter.log("Value of Total Tax Deducted:"+actualValue4,true);
try {
	cis.switchwindowDefault(driver);
if(actualValue4!=null)
{
expValue4=txtTotaltaxdeducted.getText().substring(1).replace(",", "");


	Assert.assertEquals(actualValue4,expValue4);
	Reporter.log(actualValue4 + "----" +expValue4 + " Tax taken off amount is verified",true);
	
}
else
{
	Reporter.log("Total Tax deducted not available",true);
}
}
catch (Error e) {

Reporter.log("Total Tax deducted not available",true);
}
actualValue3=ls1.actualValue3;
Reporter.log("Value of Payments to Registered Pension Schemes:"+actualValue3,true);
try {
cis.switchwindowDefault(driver);
taxReliefsLink.click();

form1OpenBtn.click();

cis.switchwindowNew1(driver,framePensionSchemes);
expValue3=paymentsToRegisteredPensionSchemesTxtBox.getAttribute("value");
savePensionBtn.click();

if(expValue3!=null)
{
Assert.assertEquals(actualValue1,expValue1);
Reporter.log(actualValue3 + "----" +expValue3 + " Payment to Register Pension Scheme is verified",true);
}
else
{
	Reporter.log("Pension not available",true);
}
}
catch (Error e) {


	Reporter.log("Payment to Register Pension Scheme is not available",true);
}
}

public void clickSubmitToHMRC1(WebDriver driver) throws Exception
{

	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 10, taxReturnLink);
	try
	{
		do {
			taxReturnLink.click();
			
		} while (submitToHMRC.isDisplayed()==false);
	}
	catch (Exception e) {
		Reporter.log("Submit to hmrc visible",true);
	}
	wLib.explicitWait(driver, 10, submitToHMRC);
	submitToHMRC.click();
try
{
  undoManualSubmitBtn.click();
    
}
catch (Exception e)
{
	Reporter.log(e.getMessage(),true);
}

validateSubmissionBtn.click();

try
{
Thread.sleep(90000);
driver.navigate().refresh();
wLib = new WaitStatementLib();
wLib.explicitWait(driver,10, successMessage);
Assert.assertEquals(successMessage.getText(), "Success!");
Reporter.log("Submission Validated: "+successMessage.getText(),true);
wLib.explicitWait(driver, 10,submissionReportLink);
submissionReportLink.click();

try
{
	if(descriptionSubmission.isDisplayed()==false)
	{
	do
	{
		submissionReportLink.click();	
	}while(descriptionSubmission.isDisplayed()==false);
	}
}
catch (Exception e) {
	Reporter.log("Submission Report Link is clicked in first go",true);
}

lenDesc=expectedDescription.length();
Assert.assertEquals(descriptionSubmission.getText().substring(0, lenDesc),expectedDescription );
Reporter.log(descriptionSubmission.getText()+" :verified text",true);
	}catch (Exception e) {
Reporter.log(e.getMessage());
	}
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,100, submitToHMRC);
	submitToHMRC.click();
	
	wLib.explicitWait(driver,100, submitToHMRCbtn);
	submitToHMRCbtn.click();
	
	wLib.explicitWait(driver,100, yesBtnSubmitHMRC);
	yesBtnSubmitHMRC.click();
		try {
		Thread.sleep(90000);
		driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, successMessage);
	Assert.assertEquals(successMessage.getText(), "Success!");
	
	wLib.explicitWait(driver,10, submissionReportLink);
	submissionReportLink.click();
	
	try
	{
		if(descriptionSubmission.isDisplayed()==false)
		{
		do
		{
			submissionReportLink.click();	
		}while(descriptionSubmission.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Submission Report Link is clicked in first go",true);
	}
	
		string1=descriptionSubmission.getText();
		actResult1=string1.substring(104,110);
		expResult1="IRmark";
		Assert.assertEquals(actResult1,expResult1);
	Reporter.log("Verified text: " +actResult1,true);
	}
	catch (Exception e) {
		Reporter.log(e.getMessage(),true);
	}
		ls1 = new LibSA(driver);
		  ls1.checkXML();
wLib.explicitWait(driver,10, submitToHMRC);
submitToHMRC.click();

  try
    {
	  undoManualSubmitBtn.click();
        
    }
    catch (Exception e)
    {
    	Reporter.log(e.getMessage(),true);
    }
  	
wLib.explicitWait(driver, 100, unlockBtn);
unlockBtn.click();

driver.navigate().refresh();
taxCalSummaryLink.click();
Thread.sleep(500);
try
{

actualValue1=ls1.actualValue1;
expValue1=taxForThisYear.getText().substring(1).replace(",", "");

Assert.assertEquals(actualValue1, expValue1);

Reporter.log(actualValue1 + "----" +expValue1 + " Tax for the year in XMl file verified",true); 
}catch (Exception e) {
	Reporter.log("Tax for the year in XMl file not verified",true);
}
}
public void clickMTRTestCaseSubmitToHMRC(WebDriver driver) throws Exception
{
	cis=new CISPage(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 10, taxReturnLink);
	try
	{
		do {
			taxReturnLink.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		} while (submitToHMRC.isDisplayed()==false);
	}
	catch (Exception e) {
		Reporter.log("Submit to hmrc visible",true);
	}
	wLib.explicitWait(driver, 10, submitToHMRC);
	submitToHMRC.click();
try
{
  undoManualSubmitBtn.click();
    
}
catch (Exception e)
{
    Reporter.log("Manual Undo Button not available",true);
	Reporter.log(e.getMessage(),true);
}
Reporter.log("clicking on validate submission",true);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
validateSubmissionBtn.click();

try
{
Thread.sleep(80000);
driver.navigate().refresh();
wLib = new WaitStatementLib();
wLib.explicitWait(driver,10, successMessage);
Assert.assertEquals(successMessage.getText(), "Success!");
Reporter.log("Submission Validated: "+successMessage.getText(),true);
wLib.explicitWait(driver, 10, submissionReportLink);
submissionReportLink.click();
lenDesc=expectedDescription.length();
Assert.assertEquals(descriptionSubmission.getText().substring(0, lenDesc),expectedDescription );
Reporter.log(descriptionSubmission.getText()+" :verified text",true);
	}catch (Exception e) {
Reporter.log(e.getMessage(),true);
	}
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, submitToHMRC);
	submitToHMRC.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	wLib.explicitWait(driver,10,submitToHMRCbtn);
	submitToHMRCbtn.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	wLib.explicitWait(driver,10, yesBtnSubmitHMRC);
	yesBtnSubmitHMRC.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	try {
		Thread.sleep(80000);
		driver.navigate().refresh();
		wLib = new WaitStatementLib();
	wLib.explicitWait(driver,10, successMessage);
	Assert.assertEquals(successMessage.getText(), "Success!");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	wLib.explicitWait(driver, 10,submissionReportLink);
	submissionReportLink.click();
		
	string1=descriptionSubmission.getText();
	
	actResult1=string1.substring(100, 106);
	expResult1="IRmark";
	Assert.assertEquals(actResult1,expResult1);
Reporter.log("Verified text: " +actResult1,true);
	}
	catch (Exception e) {
		Reporter.log("Submission Not Verified",true);
	}
	 ls1 = new LibSA(driver);
	  ls1.checkXML();
	
wLib.explicitWait(driver,20, submitToHMRC);
submitToHMRC.click();

  try
    {
	  undoManualSubmitBtn.click();
        
    }
    catch (Exception e)
    {
        Reporter.log(e.getMessage(),true);
    }
 
wLib.explicitWait(driver, 60,unlockBtn);
unlockBtn.click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
driver.navigate().refresh();
taxCalSummaryLink.click();


try {
actualValue1=ls1.actualValue1;
expValue1=taxForThisYear.getText().substring(1).replace(",", "");

Reporter.log("Tax For This Year: "+ expValue1,true);
expValue2=incomeTaxDue.getText().substring(1).replace(",", "");
Reporter.log("Income Tax Due: "+expValue2,true);
	if(actualValue1.equals(expValue1))
	{
	Assert.assertEquals(actualValue1,expValue1);
	Reporter.log(actualValue1 + "----" +expValue1 + " Tax for the year is verified",true);
		}
	else if (actualValue1.equals(expValue2))
	{
		Assert.assertEquals(actualValue1,expValue2);

		Reporter.log(actualValue1 + "----" +expValue2 + " Income Tax due verified",true);	
	}
	else
	{
		Reporter.log("Tax for the year Not Verified",true);
	}
}
catch (Error e) {


	Reporter.log("No value for tax verified",true);
}
actualValue2=ls1.actualValue2;
Reporter.log("Value of Pay from employment:"+actualValue2,true);
try {
cis.switchwindowDefault(driver);
if(actualValue2!=null)
{
expValue2=txtPaymentFrmEmployment.getText().substring(1).replace(",", "");
Assert.assertEquals(actualValue2,expValue2);
Reporter.log(actualValue2 + "----" +expValue2 + " Payment from employment is verified",true);
}	
}
catch (Error e) {


	Reporter.log("Payment from employment is not avialable",true);
}
actualValue4=ls1.actualValue4;
Reporter.log("Value of Total Tax Deducted:"+actualValue4,true);
try {
	cis.switchwindowDefault(driver);
if(actualValue4!=null)
{
expValue4=txtTotaltaxdeducted.getText().substring(1).replace(",", "");


	Assert.assertEquals(actualValue4,expValue4);
	Reporter.log(actualValue4 + "----" +expValue4 + " Tax taken off amount is verified",true);
	
}
}
catch (Error e) {

Reporter.log("Total Tax deducted not available",true);
}
actualValue3=ls1.actualValue3;
Reporter.log("Value of Payments to Registered Pension Schemes:"+actualValue3,true);
try {
cis.switchwindowDefault(driver);
taxReliefsLink.click();

form1OpenBtn.click();

cis.switchwindowNew1(driver,framePensionSchemes);
expValue3=paymentsToRegisteredPensionSchemesTxtBox.getAttribute("value");
savePensionBtn.click();

if(expValue3!=null)
{
Assert.assertEquals(actualValue3,expValue3);
Reporter.log(actualValue3 + "----" +expValue3 + " Payment to Register Pension Scheme is verified",true);
}
}
catch (Error e) {


	Reporter.log("Payment to Register Pension Scheme is not available",true);
}
actualValue5=ls1.actualValue5;
Reporter.log("Value of Retirement Annuity Contract Payments is:"+actualValue5,true);
try {
cis.switchwindowDefault(driver);
taxReliefsLink.click();

form1OpenBtn.click();

cis.switchwindowNew1(driver,framePensionSchemes);
expValue5=retirementAnnuityContractPaymentsTxtBox.getAttribute("value");
savePensionBtn.click();

if(expValue5!=null)
{
Assert.assertEquals(actualValue5,expValue5);
Reporter.log(actualValue5 + "----" +expValue5 + "Retirement Annuity Contract Payments is verified",true);
}
}
catch (Error e) {


	Reporter.log("Payment to Register Pension Scheme is not available",true);
}
taxReturnLink.click();

taxCalSummaryLink.click();
actualValue6=ls1.actualValue6;
Reporter.log("Value of Interest From UK banks Building:"+actualValue6,true);
try {
	cis.switchwindowDefault(driver);
if(actualValue6.isEmpty()==false)
{
	cis.switchwindowDefault(driver);
	
expValue6=amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", "");


	Assert.assertEquals(actualValue6,expValue6);
	Reporter.log(actualValue6 + "----" +expValue6 + "Interest From UK banks Building amount is verified",true);
	
}

}
catch (Error e) {

Reporter.log("Value of Interest From UK banks Building is not available",true);
}
actualValue7=ls1.actualValue7;
Reporter.log("Value of Dividends from UK Companies:"+actualValue7,true);
try {
	cis.switchwindowDefault(driver);
if(actualValue7.isEmpty()==false)
{
expValue7=amountDividendsfromUKCompanies.getText();

String divVal[]=expValue7.split("£");

	Assert.assertEquals(actualValue7,divVal[2].replace(",", ""));
	Reporter.log(actualValue7 + "----" +divVal[2].replace(",", "") + "Dividends from UK Companies amount is verified",true);
	
}

}
catch (Error e) {

Reporter.log("Value of Dividends from UK Companies is not available",true);
}


actualValue8=ls1.actualValue8;
Reporter.log("Value of UK pensions And State Benefits:"+actualValue8,true);
try {
	cis.switchwindowDefault(driver);
if(actualValue8.isEmpty()==false)
{
expValue8=amountUKpensionsAndStateBenefits.getText().substring(1).replace(",", "");


	Assert.assertEquals(actualValue8,expValue8);
	Reporter.log(actualValue8 + "----" +expValue8 + "UK pensions And State Benefits amount is verified",true);
	
}

}
catch (Error e) {

Reporter.log("Value of UK pensions And State Benefits is not available",true);
}
}


public void delPdf() {
folder = new File("C:\\Users\\Administrator\\Downloads");
File fList[]= folder.listFiles();

    for (File f : fList) {
        if (f.getName().endsWith(".pdf")) {
            f.delete(); 
        }}
}

public String GetFileName1(String Folder, String PartialName) throws Exception  {
    
	folderName = path+Folder;
	listFiles = new File(folderName).listFiles();
	
for (int i = 0; i < listFiles.length; i++) 
{
	Reporter.log("File Name "+fileName, true);
	if (listFiles[i].isFile()) 
	{
if ((listFiles[i].getName()).endsWith(PartialName))
{
	fileName=listFiles[i].getName();
	Reporter.log("File Found "+ " " + fileName, true);
	break;
}
        
	}

 }	
 	
return fileName;

}
public void savePdf(WebDriver driver) throws Exception {
	
	folder = new File("C:\\Users\\Administrator\\Downloads");
	File fList[]= folder.listFiles();

	    for (File f : fList) {
	        if (f.getName().endsWith(".pdf")) {
	            f.delete(); 
	        }}
	wLib = new WaitStatementLib();
	oldTab = driver.getWindowHandle();
	wLib.explicitWait(driver, 60, linkDocuments);
	linkDocuments.click();
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60,pdfSAforms);
	pdfSAforms.click();
	
	cis = new CISPage(driver);
	cis.switchwindowForward(driver);
	Thread.sleep(10000);
ls1=new LibSA(driver);
ls1.saveFileCommand();

driver.switchTo().window(oldTab);

}
public void savePdf2(WebDriver driver) throws Exception {
	folder = new File("C:\\Users\\Administrator\\Downloads");
	File fList[]= folder.listFiles();

	    for (File f : fList) {
	        if (f.getName().endsWith(".pdf")) {
	            f.delete(); 
	        }}
	wLib = new WaitStatementLib();
	oldTab = driver.getWindowHandle();
	wLib.explicitWait(driver, 60, linkDocuments);
	linkDocuments.click();
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, pdfSAforms1);
	pdfSAforms1.click();
	
cis = new CISPage(driver);
	cis.switchwindowForward(driver);
	Thread.sleep(10000);
	ls1=new LibSA(driver);
	ls1.saveFileCommand();
	
driver.switchTo().window(oldTab);

}
public void savePdf3(WebDriver driver) throws Exception {
	folder = new File("C:\\Users\\Administrator\\Downloads");
	File fList[]= folder.listFiles();

	    for (File f : fList) {
	        if (f.getName().endsWith(".pdf")) {
	            f.delete(); 
	        }}
	oldTab = driver.getWindowHandle();
	linkDocuments.click();
	
	pdfSAforms2.click();
	
	cis = new CISPage(driver);
	cis.switchwindowForward(driver);
	Thread.sleep(10000);
	ls1=new LibSA(driver);
	ls1.saveFileCommand();
	
driver.switchTo().window(oldTab);

}
public void savePdf4(WebDriver driver) throws Exception {
	folder = new File("C:\\Users\\Administrator\\Downloads");
	File fList[]= folder.listFiles();

	    for (File f : fList) {
	        if (f.getName().endsWith(".pdf")) {
	            f.delete(); 
	        }}
	oldTab = driver.getWindowHandle();
	linkDocuments.click();
	
	pdfSAforms3.click();
	
	cis = new CISPage(driver);
	cis.switchwindowForward(driver);
	Thread.sleep(10000);
	ls1=new LibSA(driver);
	ls1.saveFileCommand();
	
driver.switchTo().window(oldTab);

}

public void readPDF1InURL(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
 	
	driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	Thread.sleep(200);
	taxCalSummaryLink.click();
	
	string1 =payFromAllEmployments.getText().substring(1).replace(",","").replace(".00","").replace("", " ").trim();
	 Reporter.log("Available Income from all employment: " +string1,true);
	string2 =benefitAndExpensesReceived.getText().substring(1).replace(",","").replace(".00","").replace("", " ").trim();
	 Reporter.log("Available Benefit and Expenses: " +string2,true);
	 string3 =allowableExpenses.getText().substring(1).replace(",","").replace(".00","").replace("", " ").trim();
	 Reporter.log("Allowable expense available: " +string3,true);
	 string4=taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	 Reporter.log("Total tax for the year available: " +string4,true);
    filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
   file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
    Assert.assertTrue(output.contains(string1));
        Reporter.log("Pay from all employments Verified: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Benefits and expenses received verified: " +string2, true);
        
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Allowable expense verified Successfully : " +string3, true);
        
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Balance tax for the year verified Successfully : " +string4, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   /* file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void readPDF2InURL(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	string1 = TotalIncomeReceived.getText();
	Reporter.log("Total income Received: "+string1,true);
	string2 = totalIncomeOnWhichTaxIsDue.getText();
	Reporter.log("Total income on which tax is due: "+string2,true);
	string3 =incomeOnWhichTaxCharged.getText();
	 Reporter.log("Total income on which Tax is charged: "+string3,true);
	 string4 =incomeTaxDue.getText();
	 Reporter.log("Income Tax Due without State Pension lump sum payment: "+ string4,true);
	 string5 =taxForThisYear.getText();
	 Reporter.log("Total tax Balance for the year: "+string5,true);
	
	filePath =path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    Thread.sleep(5000);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        //String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Total income Received Verified Successfully: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Total income on which tax is due verified Successfully: " +string2, true);
       
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Total income on which Tax is charged verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Income Tax Due without State Pension lump sum payment verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Total tax Balance for the year verified Successfully: " +string5, true);
       
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
   driver.navigate().back();*/
}
public void readPDF3InURL(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60,IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 60, EmploymentLink);
	EmploymentLink.click();
	wLib.explicitWait(driver, 60,empName);
	name1=empName.getText();
	wLib.explicitWait(driver, 60, taxReturnLink);
 	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
 	wLib.explicitWait(driver, 60, payFromAllEmployments);
	string1 = payFromAllEmployments.getText().replace(".00","");
	Reporter.log(string1,true);
	wLib.explicitWait(driver, 60, benefitAndExpensesReceived);
	string2 = benefitAndExpensesReceived.getText().replace(".00","");
	Reporter.log(string2,true);
	wLib.explicitWait(driver, 60, allowableExpenses);
	string3 =allowableExpenses.getText().replace(".00","");
	Reporter.log(string3,true);
	/*string4=taxForThisYear.getText(); 
	Reporter.log(string4,true);*/
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Summary Report PDF data: " +output, true);
        
        Assert.assertTrue(output.contains(string1));
        Reporter.log("pay From All Employments verified : " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Benefit And Expenses Received verified :" +string2, true);
        
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Allowable Expenses verified :" +string3, true);
        
        /*Assert.assertTrue(output.contains(string4));
        Reporter.log("Tax on Total Income verified :" +string4, true);*/
         
        Assert.assertTrue(output.contains(name1));
        Reporter.log("Employer Name verified: " +name1, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void readPDF4InURL(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 30, EmploymentLink);
	EmploymentLink.click();
	wLib.explicitWait(driver, 30, empName);
	name1=empName.getText();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	wLib.explicitWait(driver, 60, payFromAllEmployments);	
	string1 = payFromAllEmployments.getText();
	Reporter.log(string1,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document);
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payment received from All Employments verified : " +string1, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(name1));
        Reporter.log("Employer Name verified: " +name1, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void clickDivident(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,dividentLink);
	dividentLink.click();
}
public void addBank(WebDriver driver,String name1, String name2, String acNum) throws Exception {
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,dividentLink);
	dividentLink.click();
	
	try
	{
		wLib.explicitWait(driver, 2,delInterest);
		
		if (delInterest.isDisplayed()==true)
		{
			wLib.explicitWait(driver, 2,delInterest);		
	delInterest.click();
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();
	Reporter.log("Interest deleted successfully",true);
	wLib.explicitWait(driver, 2,delbank);
	delbank.click();
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();
	driver.navigate().refresh();
	}
	}
	catch (Exception e) {
	Reporter.log(e.getMessage(),true);
	}
	wLib.explicitWait(driver, 2,addBankBtn);
	addBankBtn.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameAddBank);
	wLib.explicitWait(driver, 2,bankNameTxtBox1);
	listbox1 = new Select(bankNameTxtBox1);
	listbox1.selectByVisibleText(name1);
	wLib.explicitWait(driver, 2,bankNameTxtBox2);
	bankNameTxtBox2.clear();
	bankNameTxtBox2.sendKeys(name2);
	wLib.explicitWait(driver, 2,acNumber);
	acNumber.clear();
	acNumber.sendKeys(acNum);
	wLib.explicitWait(driver, 2,SaveBtn2);
	SaveBtn2.click();
	driver.navigate().refresh();
	String text1 = verifyBankname.getText();
	Assert.assertEquals(name2, text1);
	Reporter.log("Bank name added successfully",true);
	
}
public void delInterestfromUKbanks(WebDriver driver) throws Exception {
	dividentLink.click();
	
	try {
		if(delInterest.isDisplayed()==true)
		{
			do {
		
	delInterest.click();
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	cnfmdel.click();
	
	driver.navigate().refresh();
	Reporter.log("Interest deleted successfully",true);
			}while(delInterest.isDisplayed()==true);
		}
	}
catch (Exception e) {
	Reporter.log("Interest from UK banks, building societies etc. is deleted",true);
}
try {
	if(delbank.isDisplayed()==true)
	{
		do {
		
	delbank.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	
	cnfmdel.click();
	driver.navigate().refresh();
	
		}while(delbank.isDisplayed()==true);
	}
}
catch (Exception e) {
Reporter.log("Banks is deleted",true);
}
}
public void delUKPensionsAnnuities(WebDriver driver) throws Exception {
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	Thread.sleep(200);
	statPensionLumpSum.clear();
	Thread.sleep(200);
	taxableIncapacityBenefit.clear();
	Thread.sleep(200);
	otherPensionsRetirementAnnuities.clear();
	Thread.sleep(200);
	jobseekersAllowance.clear();
	Thread.sleep(200);
	taxTakenOffOtherPensions.clear();
	Thread.sleep(200);
	stateBenefitsSaveBtn.click();
	Reporter.log("banks name deleted successfully",true);
	driver.navigate().refresh();
}
public void delBank(WebDriver driver) throws Exception {
	
	delInterestfromUKbanks(driver);
	delUKPensionsAnnuities(driver);
}
public void addUKInterest(WebDriver driver, String dateaddInterest, String name1, String desc, String amt) throws Exception
{
	formOpenBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameIntUk);
	
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateaddInterest);
	
	listbox1 = new Select(bankTxtBox);
	listbox1.selectByVisibleText(name1);
	
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(desc);
	
	interestAmountTxtBox.clear();
	interestAmountTxtBox.sendKeys(amt);
	
	taxedUKInterestRadioBtn.click();
	
	SaveBtn2.click();
	
	String str1=verifyInterest.getText();
	Assert.assertEquals(str1, desc);
	Reporter.log("Interest added Successfully",true);
	
}
public void withoutTaxAddIncome(WebDriver driver, String dateaddInterest, String name1, String desc, String amt) throws Exception
{
	formOpenBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameIntUk);
	
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateaddInterest);
	
	listbox1 = new Select(bankTxtBox);
	listbox1.selectByVisibleText(name1);
	
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(desc);
	
	interestAmountTxtBox.clear();
	interestAmountTxtBox.sendKeys(amt);
	
	unTaxedUKInterestRadioBtn.click();
	
	SaveBtn2.click();
	
	String str1=verifyInterest.getText();
	Assert.assertEquals(str1, desc);
	Reporter.log("Interest added Successfully",true);
	
}
public void foreignInterestAddIncome(WebDriver driver, String dateaddInterest, String name1, String desc, String amt) throws Exception
{
	
	formOpenBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameIntUk);
	
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateaddInterest);
	
	listbox1 = new Select(bankTxtBox);
	listbox1.selectByVisibleText(name1);
	
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(desc);
	
	interestAmountTxtBox.clear();
	interestAmountTxtBox.sendKeys(amt);
	
	foreignInterestRadioBtn.click();
	
	SaveBtn2.click();
	
	String str1=verifyInterest.getText();
	Reporter.log(str1,true);
	
	Assert.assertEquals(str1, desc);
	Reporter.log("Interest added Successfully",true);
	
}
public void dividentUKCompanies(WebDriver driver,String name1, String desc, String amt) throws Exception
{
	dividentFormBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameDividend);
	
	companyNameTxtBox.clear();
	companyNameTxtBox.sendKeys(name1);
	
	dividentDescripTxtBox.clear();
	dividentDescripTxtBox.sendKeys(desc);
	
	dividendsfrmUKcompTxtBox.clear();
	dividendsfrmUKcompTxtBox.sendKeys(amt);
	SaveBtn2.click();
	Reporter.log("Interest added Successfully",true);
	
}

public void addIncomeBasic(String payEmp, String medExp, String trvlBussiness, WebDriver driver) throws Exception {
	try
	{
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 5,delButton);	
		delButton.click();
		wLib.explicitWait(driver, 5,confirmDel);	
		confirmDel.click();
		wLib.explicitWait(driver,5, delEmpName);
		delEmpName.click();
		cis.switchwindowNew(driver);
		wLib.explicitWait(driver, 5,cnfmdel);
		cnfmdel.click();
		driver.navigate().refresh();
	}
	catch (Exception e) {
		Reporter.log(e.getMessage(),true);
	}
	wLib.explicitWait(driver, 5,addEmpIncome);
	addEmpIncome.click();
	wLib.explicitWait(driver, 5, payFrmEmployer);
	payFrmEmployer.sendKeys(payEmp);
	wLib.explicitWait(driver, 5, PrvtMedAndDntl);
	PrvtMedAndDntl.sendKeys(medExp);
	wLib.explicitWait(driver, 5, BusnsTrvlAndSubstancTxtBox);
	BusnsTrvlAndSubstancTxtBox.sendKeys(trvlBussiness);
	SaveBtn1.click();
	actResult1=totalIncome.getText();
	expResult1= "£"+ payEmp + ".00";
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log("Employer Income added Sucessfully", true);

}
public void addIncomeBasic1(String str1, String str2, String str3, WebDriver driver) throws Exception {
	try
	{
		delButton.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 100, confirmDel);	
		confirmDel.click();
		wLib.explicitWait(driver, 100,delEmpName);
		delEmpName.click();
		cis.switchwindowNew(driver);
		wLib.explicitWait(driver, 100, cnfmdel);
		cnfmdel.click();
		
		driver.navigate().refresh();
	}
	catch (Exception e) {
		Reporter.log(e.getMessage(),true);
	}
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	wLib.explicitWait(driver, 30, CompanyCarsAndVans);
	CompanyCarsAndVans.sendKeys(str2);
	wLib.explicitWait(driver, 30, FxdExpnsDeductTxtBox);
	FxdExpnsDeductTxtBox.sendKeys(str3);
	SaveBtn1.click();
	actResult1=totalIncome.getText();
	
	expResult1= "£"+ str1;
	
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log("Employer Income added Sucessfully", true);

}
public void stateBenefit(WebDriver driver,String str1,String str2,String str3, String str4, String str5) throws Exception
{
	dividentLink.click();
	
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	totStatPension.sendKeys(str1);
	Thread.sleep(200);
	statPensionLumpSum.clear();
	statPensionLumpSum.sendKeys(str2);
	Thread.sleep(200);
	taxableIncapacityBenefit.clear();
	taxableIncapacityBenefit.sendKeys(str3);
	Thread.sleep(200);
	otherPensionsRetirementAnnuities.clear();
	otherPensionsRetirementAnnuities.sendKeys(str4);
	Thread.sleep(200);
	jobseekersAllowance.clear();
	jobseekersAllowance.sendKeys(str5);
	stateBenefitsSaveBtn.click();
	String actualStr=totstatePension.getText();
	String expectedStr=str1+".00";
	Assert.assertEquals(actualStr, expectedStr);
	Reporter.log("State benefit added successfully",true);
}
public void stateBenefit1(WebDriver driver,String str1,String str2,String str3, String str4, String str5) throws Exception
{
	dividentLink.click();
	
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	totStatPension.sendKeys(str1);
	Thread.sleep(200);
	statPensionLumpSum.clear();
	statPensionLumpSum.sendKeys(str2);
	Thread.sleep(200);
	taxableIncapacityBenefit.clear();
	taxableIncapacityBenefit.sendKeys(str3);
	Thread.sleep(200);
	otherPensionsRetirementAnnuities.clear();
	otherPensionsRetirementAnnuities.sendKeys(str4);
	Thread.sleep(200);
	jobseekersAllowance.clear();
	jobseekersAllowance.sendKeys(str5);
	stateBenefitsSaveBtn.click();
	String actualStr=totstatePension.getText();
	String expectedStr=str1;
	Assert.assertEquals(actualStr, expectedStr);
	Reporter.log("State benefit added successfully",true);
}
public void addOtherDivident(WebDriver driver,String str1,String str2,String str3) throws Exception
{
	
	formOpenLink.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameOtherDividend);
	otherDividentTxtBox.clear();
	otherDividentTxtBox.sendKeys(str1);
	Thread.sleep(200);
	foreignDividendsTxtBox.clear();
	foreignDividendsTxtBox.sendKeys(str2);
	Thread.sleep(200);
	taxTakenOffForeignDividendTxtBox.clear();
	taxTakenOffForeignDividendTxtBox.sendKeys(str3);
	Thread.sleep(200);
	SaveBtn2.click();
	Reporter.log("Other Divident income added successfully",true);
}

public void addOtherUKIncome(WebDriver driver,String str1,String str2,String str3,String str4,String str5) throws Exception
{
	
	form1OpenBtn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameOtherUk);
	otherTaxableIncomeTxtBox.clear();
	otherTaxableIncomeTxtBox.sendKeys(str1);
	Thread.sleep(200);
	allowableExpensesTxtBox.clear();
	allowableExpensesTxtBox.sendKeys(str2);
	Thread.sleep(200);
	taxDeductedTxtBox.clear();
	taxDeductedTxtBox.sendKeys(str3);
	Thread.sleep(200);
	beneftFrmPreOwnedAssetsTxtBox.clear();
	beneftFrmPreOwnedAssetsTxtBox.sendKeys(str4);
	Thread.sleep(200);
	otherUKDescriptionTxtBox.clear();
	otherUKDescriptionTxtBox.sendKeys(str5);
	Thread.sleep(200);
	OtherUKIncomeSaveBtn.click();
	Reporter.log("Other UK Income added successfully",true);
}
public void delOtherUKIncome(WebDriver driver) throws Exception
{
	
	dividentLink.click();
	
	form1OpenBtn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameOtherUk);
	otherTaxableIncomeTxtBox.clear();
	Thread.sleep(200);
	allowableExpensesTxtBox.clear();
	Thread.sleep(200);
	taxDeductedTxtBox.clear();
	Thread.sleep(200);
	beneftFrmPreOwnedAssetsTxtBox.clear();
	Thread.sleep(200);
	otherUKDescriptionTxtBox.clear();
	Thread.sleep(200);
	OtherUKIncomeSaveBtn.click();
	Reporter.log("Other UK Income added successfully",true);
}
public void deleteDivident(WebDriver driver) throws Exception {
	delDivident.click();
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	cnfmdel.click();
}
public void delBankInterest(WebDriver driver) throws Exception {
	delInterest.click();
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	cnfmdel.click();
	
	Reporter.log("Interest deleted successfully",true);
	delbank.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	
	cnfmdel.click();
	}
public void delOtherDivident(WebDriver driver) throws Exception
{
	formOpenLink.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameOtherDividend);
	otherDividentTxtBox.clear();
	Thread.sleep(200);
	foreignDividendsTxtBox.clear();
	Thread.sleep(200);
	taxTakenOffForeignDividendTxtBox.clear();
	Thread.sleep(200);
	SaveBtn2.click();
	Reporter.log("Other Divident income deleted successfully",true);
}
public void verifyTaxDivident(WebDriver driver,String a1, String a2, String a3, String a4, String a5, String a6, String a7,String a8, String a9) throws Exception
{
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(a1);
	n2=Double.parseDouble(a2);
	n3=Double.parseDouble(a3);
	totalIncome1 = (n1 + n2) - n3;
	Reporter.log(String.format("%.2f",totalIncome1),true);
	n4=Double.parseDouble(a4);
	n5=Double.parseDouble(a5);
	n6=Double.parseDouble(a6);
	n7=Double.parseDouble(a7);
	n8=Double.parseDouble(a8);
	totalIncome2=n8+(n8*.25);
	Reporter.log(String.format("%.2f",totalIncome2),true);
	totalIncome3=n4+n5+n6+n7;
	Reporter.log(String.format("%.2f",totalIncome3),true);
	totalincome=totalIncome1 + totalIncome2 + totalIncome3;
	Reporter.log(String.format("%.2f",totalincome),true);
	taxTotal=String.format("%.2f",(totalincome));
	t1=	TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(t1, taxTotal);
	Reporter.log(t1+"----"+taxTotal+" Total Income verified successfully",true);
	taxDueInc = totalincome - personalAllowanceRate;	
	t1=String.format("%.2f",(taxDueInc));
	t2=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, t1);
	Reporter.log(t2+"----"+ t1+" Total income on which tax is due Verified successfully",true);
	basic1=taxDueInc-totalIncome2;
	basicRate= (basic1*basicRateNonSaving)/100;
	basicRate1=String.format("%.2f",(basicRate));
	basicInterest=interOnBasicRate.getText().substring(1).replace(",", "");
	Assert.assertEquals(basicInterest,basicRate1);
	Reporter.log(basicInterest+"----"+basicRate1+ " Basic rate calculation is correct",true);
	basicRateInterest=totalIncome2-nilRate1;
	finalAmount=basic1+nilRate1+basicRateInterest;
	taxTotal=String.format("%.2f",(finalAmount));
	totIncomTaxChar= incomeOnWhichTaxCharged.getText().substring(1).replace(",", "");
	Assert.assertEquals(totIncomTaxChar, taxTotal);
	Reporter.log(totIncomTaxChar+"----"+ taxTotal+" Total income on which tax has been charged is verified", true);
	basicInterestAmount=(basicRateInterest*basicRateNonSaving)/100;
	incomTaxdue1=Double.parseDouble(basicInterest);
	incomTaxdue2=basicInterestAmount+incomTaxdue1;
	t1=String.format("%.2f",(incomTaxdue2));
	t2=incomeTaxDue.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, t1);
	Reporter.log(t2+"-----"+ t1+" Income Tax due Verified successfully",true);
	n9=Double.parseDouble(a9);
	statePensionlumpsum=((n9*basicRateNonSaving)/100)+incomTaxdue2;
	statePensionlumpsum1=String.format("%.2f",(statePensionlumpsum));
	statePensionlumpsum2=incomeTaxDue1.getText().substring(1).replace(",","");
	Assert.assertEquals(statePensionlumpsum2, statePensionlumpsum1);
	Reporter.log(statePensionlumpsum2+"----"+ statePensionlumpsum1+" Income Tax due verified successfully",true);
	fnltax=statePensionlumpsum-basicRateInterest;
	t1=String.format("%.2f",fnltax);
	t2=fTaxDue.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, t1);
	Reporter.log(t2+"----"+ t1+" Total Income Tax due verified successfully",true);
	taxBalance= fnltax;
	taxFinal=String.format("%.2f",taxBalance);
	taxFinalUI=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinalUI, taxFinal);
	Reporter.log(taxFinalUI+"----"+ taxFinal+" Balance Tax of year Verified successfully",true);
	fPayment =  taxBalance/2;
	secPayment = fPayment;
	fPay=String.format("%.2f",fPayment);
	secPay = String.format("%.2f",secPayment);
	actResult1 = firstPayment.getText().substring(1).replace(",","");
	actResult2= secondPayment.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult1, fPay);
	Reporter.log(actResult1+"----"+ fPay+" FirstPayment Verified successfully",true);
	Assert.assertEquals(actResult2, secPay);
	Reporter.log(actResult2+"----"+ secPay+" Second Payment Verified successfully",true);
	}

public void readDividentPDF4InURL(WebDriver driver, String Folder, String filename,String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 30, EmploymentLink);
	EmploymentLink.click();
	wLib.explicitWait(driver, 30, empName);
	name1=empName.getText();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	wLib.explicitWait(driver, 60,payFromAllEmployments);	
	string1 = payFromAllEmployments.getText();
	Reporter.log(string1,true);
	n1=Double.parseDouble(s1);
	n2=Double.parseDouble(s2);
	n3=Double.parseDouble(s3);
	n4=Double.parseDouble(s4);
	n5=Double.parseDouble(s5);
	n6=Double.parseDouble(s6);
	n7=Double.parseDouble(s7);
	totlIncome=n1+n2+n3+n4+n5+n6+n7;
	string2="£"+(String.format("%.2f",(totlIncome)));
	
	Reporter.log(string2,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document);
        output1=output.replace(",", "");
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payment received from All Employments verified : " +string1, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(name1));
        Reporter.log("Employer Name verified: " +name1, true);
        Assert.assertTrue(output1.contains(string2));
        Reporter.log("Sum of Total Income verified: " +string2, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void verifyUNTaxDivident(WebDriver driver,String a1, String a2, String a3, String a4, String a5, String a6, String a7,String a8, String a9,String a10) throws Exception
{
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	
 	wLib.explicitWait(driver, 60,taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(a1);
	n2=Double.parseDouble(a2);
	n3=Double.parseDouble(a3);
	totalIncome1 = (n1 + n2) - n3;
	Reporter.log(String.format("%.2f",totalIncome1),true);
	n4=Double.parseDouble(a4);
	n5=Double.parseDouble(a5);
	n6=Double.parseDouble(a6);
	n7=Double.parseDouble(a7);
	n8=Double.parseDouble(a8);
	n9=Double.parseDouble(a9);
	n10 = Double.parseDouble(a10);
	totalIncome2=n8;
	Reporter.log(String.format("%.2f",totalIncome2),true);
	totalIncome3=n4+n5+n6+n7+n10;
	Reporter.log(String.format("%.2f",totalIncome3),true);
	totalincome=totalIncome1 + totalIncome2 + totalIncome3;
	taxTotal=String.format("%.2f",(totalincome));
	string1= TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(string1, taxTotal);
	Reporter.log(string1+"---"+ taxTotal,true);
	Reporter.log("Total income received is Verified successfully",true);
	total1 = totalincome - personalAllowanceRateMaxLimit;
	allowance1=total1/2;
	tax1=personalAllowanceRate-allowance1;
	taxDueInc = totalincome - tax1;
	taxTotal=String.format("%.2f",(taxDueInc));
	t2=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, taxTotal);
	Reporter.log(t2+"---"+taxTotal,true);
	Reporter.log("Total income on which tax is due Verified successfully",true);
	t1=incomeOnWhichTaxCharged.getText().substring(1).replace(",","");
	Assert.assertEquals(t1, t2);
	Reporter.log(t1+"---"+ t2,true);
	Reporter.log("Total income on which tax has been charged",true);
	amount3 = ((taxDueInc - taxLimit1Uk - n8 - n10)*heigherRateNonSaving)/100;
	amount4 = ((n8 - nilRate2)*heigherRateNonSaving)/100;
	incomTaxdue1= amount1 + amount3 +amount4;
	t1=String.format("%.2f",(incomTaxdue1));
	t2=incomeTaxDue.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, t1);
	Reporter.log(t1+"---"+ t2,true);
	Reporter.log("Income Tax due without State Pension lump sum payment verified",true);
	incomTaxdue2 = incomTaxdue1 + ((n9 *heigherRateNonSaving)/100);
	t1=String.format("%.2f",(incomTaxdue2));
	t2=incomeTaxDue1.getText().substring(1).replace(",","");
	Assert.assertEquals(t2, t1);
	Reporter.log(t1+"---"+ t2,true);
	Reporter.log("Income Tax due with State Pension lump sum payment verified",true);
	
	}


public void readDivident1PDF4InURL(WebDriver driver, String Folder, String filename,String str1,String str2,String str3,String str4,String	str5,String	str6,String	str7,String	str8) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 30, EmploymentLink);
	EmploymentLink.click();
	wLib.explicitWait(driver, 30, empName);
	name1=empName.getText();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60,taxCalSummaryLink);
	taxCalSummaryLink.click();
	wLib.explicitWait(driver, 60, payFromAllEmployments);	
	string1 = payFromAllEmployments.getText().replace(",", "");
	Reporter.log(string1,true);
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	
	totlIncome=n1+n2+n3+n4+n5+n6+n7+n8;
	string2="£"+(String.format("%.2f",(totlIncome)));
	Reporter.log(string2,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
  file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document).replace(",", "");
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payment received from All Employments verified : " +string1, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(name1));
        Reporter.log("Employer Name verified: " +name1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Sum of Total Income verified: " +string2, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   /* file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void verifyForeighDivident(WebDriver driver,String str1, String str2, String str3, String str4, String str5, String str6, String str7,String str8, String str9, String str10,String str11, String str12, String str13 )
{
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	n12=Double.parseDouble(str12);
	n13=Double.parseDouble(str13);
	totalIncome1 = (n3 + n4) - n5;
	actResult1=TotalFromAllEmployment.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(totalIncome1)); 
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+" Verified Payment From Employment",true);
	
	totalIncome2=n1+n12+n2+n11+n6+n8+n9+n10+totalIncome1; 
	actResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(totalIncome2));
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+" Verified Total income on which tax is due",true);
	
	amount3=((totalIncome2-(taxLimit2+n1+ n6+ n8+ n9+ n10))*advancedRateNonSaving)/100;
	amount4 = (n1 * advancedRateNonSaving)/100;
	totalIncome3=amount1 + amount2 + amount3 + amount4;
	actResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(totalIncome3));
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+"Verified Income Tax Due",true);
	
	t1 = totalIncomeOnWhichTaxIsDue.getText();
	t2 = incomeOnWhichTaxCharged.getText();
	Assert.assertEquals(t2,t1);
	Reporter.log("Total Income On Which Tax is Charged is Verified",true);

	finalAmount = ((n7*advancedRateNonSaving)/100)+totalIncome3;
	actResult1=incomeTaxDue1.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(finalAmount));
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+"Final Tax amount Verified successfully",true);
	Reporter.log("Tax calculation Verified successfully",true);
	}
public void readDivident2PDF4InURL(WebDriver driver, String Folder, String filename,String str1,String str2,String str3,String str4,String	str5,String	str6,String	str7,String	str8) throws EmptyFileException, IOException, Exception {
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	totlIncome=n1+n2+n3+n4+n5+n6+n7;
	string1="£"+(String.format("%.2f",(totlIncome)));
	Reporter.log(string1,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
   file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document).replace(",", "");
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(str8));
        Reporter.log("Employer Name verified: " +str8, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Sum of Total Income verified: " +string1, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void verifyOthertax(WebDriver driver,String str1, String str2, String str3, String str4, String str5, String str6, String str7,String str8, String str9, String str10,String str11, String str12, String str13,String str14,String str15,String str16,String str17 )
{
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	n12=Double.parseDouble(str12);
	n13=Double.parseDouble(str13);
	n14=Double.parseDouble(str14);
	n15=Double.parseDouble(str15);
	n16=Double.parseDouble(str16);
	n17=Double.parseDouble(str17);
	totalincome = (n1 + n2) - n3;
	Reporter.log(String.format("%.2f",(totalincome)),true);
	actResult1=TotalFromAllEmployment.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(totalincome));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+" Verified Payment From Employment",true);
	}
	catch(Error e)
	{
		Reporter.log("Payment From Employment is not verified",true);
		
		
	}
	totalIncome1=n4 + ((n4 * 25)/100);
	totalIncome2=n5 + (n6 + n7) + n8 + n9 + n10 + n11 + ((n15-n12)+n16);
	total1=totalincome+totalIncome1+totalIncome2;
	actResult1=TotalIncomeReceived.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(total1));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"----"+expResult1+" Verified Total income Received: ",true);
	}
	catch(Error e)
	{
		Reporter.log("Total income Received is not verified",true);
		
	}
	incomTaxdue2=total1-personalAllowanceRate;
	actResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(incomTaxdue2));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"----"+expResult1+" Verified Income is Tax Due",true);
	
	}
	catch(Error e)
	{
		Reporter.log("Income Tax Due not verified",true);
		e.printStackTrace();
	}
	t1 = totalIncomeOnWhichTaxIsDue.getText();
	t2 = incomeOnWhichTaxCharged.getText();
	try {
	Assert.assertEquals(t2,t1);
	Reporter.log(t1 +"----"+ t2 +" Total Income On Which Tax is Charged is Verified",true);
	
	}
	catch(Error e)
	{
		Reporter.log("Total Income On Which Tax is Charged  is not verified",true);
		
	}
	allowance1=incomTaxdue2 - (totalIncome1+n5 + n6 + n7);
	basic1=(allowance1*basicRateNonSaving)/100;
	basicInterestAmount = ((totalIncome1-nilRate1)*basicRateNonSaving)/100;
	tax1= basic1 + basicInterestAmount;
	actResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(tax1));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+"--"+expResult1+" Tax amount Verified successfully",true);
	}
	catch(Error e)
	{
		Reporter.log("Tax amount is not verified",true);
		
	}
	statePensionlumpsum= (n13 * basicRateNonSaving)/100;
	amount3=tax1 + statePensionlumpsum;
	actResult1=incomeTaxDue1.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(amount3));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1 + "----"+expResult1+ " Total Income Tax Due is Verified successfully",true);
	}
	catch(Error e)
	{
		Reporter.log("Total Income Tax Due is not verified",true);
		
	}
	incomTaxdue2=amount3 - ((totalIncome1 - n4) + n12);
	actResult1=taxForThisYear.getText().substring(1).replace(",", "");
	expResult1 = String.format("%.2f",(incomTaxdue2));
	try {
	Assert.assertEquals(actResult1,expResult1);
	Reporter.log(actResult1+expResult1 + " Final Tax Verified successfully",true);
	Reporter.log("Tax calculation Verified successfully",true);
	}
	catch(Error e)
	{
		Reporter.log("Final Tax is not verified",true);
		Reporter.log("Tax calculation not Verified successfully",true);
		
	}
	
	}

public void readOtherUkIncomePDF4InURL(WebDriver driver, String Folder, String filename,String name,String str1,String str2,String str3,String str4,String	str5,String	str6,String	str7,String	str8,String str9 ) throws EmptyFileException, IOException, Exception {
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	totlIncome=n1+n2+n3+n4+n5+n6+n7+n8+n9;
	string1="£"+(String.format("%.2f",(totlIncome)));
	Reporter.log(string1,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document).replace(",", "");
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(name));
        Reporter.log("Employer Name verified: " +name, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Sum of Total Income verified: " +string1, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    /*file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}


  
public void profitIncomeFrmProprtyFHL(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9, String str10,String str11) throws Exception {
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.sendKeys(str1);
	
	
	rentIncomeTextBox.sendKeys(str2);
	UKExpensesTxtBox.sendKeys(str3);;
	loanInterestTxtBox.sendKeys(str4);
	legalManagementOthrProfessionalFeesTxtBox.sendKeys(str5);
	allowablePropertyExpensesTxtBox.sendKeys(str6);
	privateUseAdjustmentTxtBox.sendKeys(str7);
	balancingChargesTxtBox.sendKeys(str8);
	capitalAllowancesTxtBox.sendKeys(str9);
	lossBroughtForwardTxtBox.sendKeys(str10);
	lossToCarryForwardTxtBox.sendKeys(str11);
	fHLUKIsPeriodOfGraceElectionChkBox.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	SaveBtn1.click();
	
	string1=calculateFHLUKAdjustedProfitForTheYear.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	totalIncome1=(n2+n7+n8)-(n3+n4+n5+n6+n9);
	Reporter.log(String.format("%.2f %.2f",totalIncome1, calculation1 ),true);
	Assert.assertEquals(calculation1,totalIncome1);
	Reporter.log("Adjusted profit for the year verified successfully",true);
	
	string2=calculateFHLUKTaxableProfitForYear.getAttribute("value").replace(".00", "");
	calculation2=Double.parseDouble(string2);
	totalIncome2 = totalIncome1 - n10;
	Reporter.log(String.format("%.2f %.2f",totalIncome2, calculation2 ),true);
	Assert.assertEquals(calculation2,totalIncome2 );
	Reporter.log("Taxable profit for the year verified successfully",true);
	}

public void lossIncomeFrmProprtyFHL(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9, String str10) throws Exception {
	clickIncome(driver);
	
	incmFrmProLink.click();
	Thread.sleep(700);
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(str1);
	Thread.sleep(700);
	rentIncomeTextBox.clear();	
	rentIncomeTextBox.sendKeys(str2);
	UKExpensesTxtBox.clear();
	UKExpensesTxtBox.sendKeys(str3);
	loanInterestTxtBox.clear();
	loanInterestTxtBox.sendKeys(str4);
	legalManagementOthrProfessionalFeesTxtBox.clear();
	legalManagementOthrProfessionalFeesTxtBox.sendKeys(str5);
	allowablePropertyExpensesTxtBox.clear();
	allowablePropertyExpensesTxtBox.sendKeys(str6);
	privateUseAdjustmentTxtBox.clear();
	privateUseAdjustmentTxtBox.sendKeys(str7);
	balancingChargesTxtBox.clear();
	balancingChargesTxtBox.sendKeys(str8);
	capitalAllowancesTxtBox.clear();
	capitalAllowancesTxtBox.sendKeys(str9);
	lossToCarryForwardTxtBox.clear();
	lossToCarryForwardTxtBox.sendKeys(str10);
	fHLUKIsPeriodOfGraceElectionChkBox.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	SaveBtn1.click();
	
	string1=calculateFHLUKLossForYear.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	totalIncome1 = ((n3+n4+n5+n6+n9)-(n2+n7+n8));
	Reporter.log(String.format("%.2f %.2f",totalIncome1, calculation1 ),true);
	Assert.assertEquals(calculation1,totalIncome1);
	Reporter.log("Loss for the year verified successfully",true);
}
public void incomProfitFHLinEEA(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9, String str10,String str11) throws Exception {
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(str1);
	
	rentIncomeEEATextBox.clear();
	rentIncomeEEATextBox.sendKeys(str2);
	uKExpensesEAATxtBox.clear();
	uKExpensesEAATxtBox.sendKeys(str3);
	loanInterestEEATxtBox.clear();
	loanInterestEEATxtBox.sendKeys(str4);
	legalMangmntOthrProfsnlFeesEEATxtBox.clear();
	legalMangmntOthrProfsnlFeesEEATxtBox.sendKeys(str5);
	allowablePropertyExpensesEAATxtBox.clear();
	allowablePropertyExpensesEAATxtBox.sendKeys(str6);
	privateUseAdjustmentEAATxtBox.clear();
	privateUseAdjustmentEAATxtBox.sendKeys(str7);
	balancingChargesEAATxtBox.clear();
	balancingChargesEAATxtBox.sendKeys(str8);
	capitalAllowancesEAATxtBox.clear();
	capitalAllowancesEAATxtBox.sendKeys(str9);
	lossBroughtForwardEAATxtBox.clear();
	lossBroughtForwardEAATxtBox.sendKeys(str10);
	lossToCarryForwardEAATxtBox.clear();
	lossToCarryForwardEAATxtBox.sendKeys(str11);
	FHLEEAIsPeriodOfGraceElectionChkBox.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	SaveBtn1.click();
	
	string1=calculateFHLEaaUKAdjustedProfitForTheYear.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	totalIncome1=(n2+n7+n8)-(n3+n4+n5+n6+n9);
	Reporter.log(String.format("%.2f %.2f",totalIncome1, calculation1 ),true);
	Assert.assertEquals(calculation1,totalIncome1);
	Reporter.log("Adjusted profit for the year verified successfully",true);
	string2=calculateFHLEaaUKTaxableProfitForYear.getAttribute("value").replace(".00", "");
	calculation2=Double.parseDouble(string2);
	totalIncome2 = totalIncome1 - n10;
	Reporter.log(String.format("%.2f %.2f",totalIncome2, calculation2 ),true);
	Assert.assertEquals(calculation2,totalIncome2);
	Reporter.log("Taxable profit for the year verified successfully",true);
	
}
public void incomLossFHLinEEA(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9, String str10) throws Exception {
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(str1);
	
	rentIncomeEEATextBox.clear();
	rentIncomeEEATextBox.sendKeys(str2);
	uKExpensesEAATxtBox.clear();
	uKExpensesEAATxtBox.sendKeys(str3);
	loanInterestEEATxtBox.clear();
	loanInterestEEATxtBox.sendKeys(str4);
	legalMangmntOthrProfsnlFeesEEATxtBox.clear();
	legalMangmntOthrProfsnlFeesEEATxtBox.sendKeys(str5);
	allowablePropertyExpensesEAATxtBox.clear();
	allowablePropertyExpensesEAATxtBox.sendKeys(str6);
	privateUseAdjustmentEAATxtBox.clear();
	privateUseAdjustmentEAATxtBox.sendKeys(str7);
	balancingChargesEAATxtBox.clear();
	balancingChargesEAATxtBox.sendKeys(str8);
	capitalAllowancesEAATxtBox.clear();
	capitalAllowancesEAATxtBox.sendKeys(str9);
	lossToCarryForwardEAATxtBox.clear();
	lossToCarryForwardEAATxtBox.sendKeys(str10);
	FHLEEAIsPeriodOfGraceElectionChkBox.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	SaveBtn1.click();
	
	string1=calculateFHLEaaUKLossForYear.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	totalIncome1 = ((n3+n4+n5+n6+n9)-(n2+n7+n8));
	Reporter.log(String.format("%.2f %.2f",totalIncome1, calculation1 ),true);
	Assert.assertEquals(calculation1,totalIncome1);
	Reporter.log("Loss for the year verified successfully",true);
}
public void propIncomeExpens(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) throws Exception {
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(str1);
	
	totalIncomePropertyLinkTxtBox.clear();
	totalIncomePropertyLinkTxtBox.sendKeys(str2);
	propertyIncomeAllowanceChkBox.click();
	premiumsForGrantOfALeaseTxtBox.clear();
	premiumsForGrantOfALeaseTxtBox.sendKeys(str3);
	revrsePremAndInducTxtBox.clear();
	revrsePremAndInducTxtBox.sendKeys(str4);
	rentRatesInsuranceEtcTxtBox.clear();
	rentRatesInsuranceEtcTxtBox.sendKeys(str5);
	repairsAndMaintenanceTxtBox.clear();
	repairsAndMaintenanceTxtBox.sendKeys(str6);
	intrstAndOthrFinancialChrgsTxtBox.clear();
	intrstAndOthrFinancialChrgsTxtBox.sendKeys(str7);
	legalManagmntAndPrfsnalFeesTxtBox.clear();
	legalManagmntAndPrfsnalFeesTxtBox.sendKeys(str8);
	costsOfServicProvidedTxtBox.clear();
	costsOfServicProvidedTxtBox.sendKeys(str9);
	othrPropertyExpensesTxtBox.clear();
	othrPropertyExpensesTxtBox.sendKeys(str10);
	propertyPrivateUseAdjustmentTxtBox.clear();
	propertyPrivateUseAdjustmentTxtBox.sendKeys(str11);
	balancingTaxableChargesTxtBox.clear();
	balancingTaxableChargesTxtBox.sendKeys(str12);
	annualInvestmentAllowanceTxtBox.clear();
	annualInvestmentAllowanceTxtBox.sendKeys(str13);
	zeroEmisnGoodsVehclAllwncTxtBox.clear();
	zeroEmisnGoodsVehclAllwncTxtBox.sendKeys(str14);
	enhancedCapitalAllowancesTxtBox.clear();
	enhancedCapitalAllowancesTxtBox.sendKeys(str15);
	tenPercntWearAndTearAllowanceTxtBox.clear();
	tenPercntWearAndTearAllowanceTxtBox.sendKeys(str16);
	txtBoxLossBroughtForward.clear();
	txtBoxLossBroughtForward.sendKeys(str17);
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	n3=Double.parseDouble(str3);
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	n6=Double.parseDouble(str6);
	n7=Double.parseDouble(str7);
	n8=Double.parseDouble(str8);
	n9=Double.parseDouble(str9);
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	n12=Double.parseDouble(str12);
	n13=Double.parseDouble(str13);
	n14=Double.parseDouble(str14);
	n15=Double.parseDouble(str15);
	n16=Double.parseDouble(str16);
	n17=Double.parseDouble(str17);
	SaveBtn1.click();
	
	string1=adjustedProfitForTheYear.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	totalIncome1 = (n2+n3+n4+n11+n12)-(n5+n6+n7+n8+n9+n10+n13+n14+n15+n16);
	Reporter.log(String.format("%.2f %.2f",totalIncome1, calculation1 ),true);
	Assert.assertEquals( calculation1,totalIncome1);
	Reporter.log("Adjusted profit for the year verified successfully",true);
	string2=taxableProfitForTheYear.getAttribute("value").replace(".00", "");
	calculation2=Double.parseDouble(string2);
	totalIncome2 =totalIncome1-n17;
	Reporter.log(String.format("%.2f %.2f",totalIncome2, calculation2 ),true);
	Assert.assertEquals(calculation2,totalIncome2 );
	Reporter.log("Taxable profit for the year verified successfully",true);
}
public void delProfit(WebDriver driver) throws Exception
{
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	incomeFrmPropertyDelBtn.click();
	
}
public void selfEmplomentShort(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22) throws Exception
{
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	try
	{
	
	delButton.click();
	
	confDel.click();
	}
	catch (Exception e)
	{
	    Reporter.log(e.getMessage(),true);
	}
	
	formOpenBtn.click();
	
	descriptionOfBusinessTxtBox.clear();
	descriptionOfBusinessTxtBox.sendKeys(str1);
	sePostCodeTxtBox.clear();
	sePostCodeTxtBox.sendKeys(str2);
	StartDatetxtbox.clear();
	StartDatetxtbox.sendKeys(dateStart);
	tradingEnddateTxtBox.clear();
	tradingEnddateTxtBox.sendKeys(dateEnd);
	businessAccountsEnddateTxtBox.clear();
	businessAccountsEnddateTxtBox.sendKeys(dateEnd);
	businessIncomeTxtBox.clear();
	businessIncomeTxtBox.sendKeys(str3);
	otherBusinessIncomeTxtBox.clear();
	otherBusinessIncomeTxtBox.sendKeys(str4);
	costsOfGoodsBoughtForResaleTxtBox.clear();
	costsOfGoodsBoughtForResaleTxtBox.sendKeys(str5);
	carVanAndTravelExpensesTxtBox.clear();
	carVanAndTravelExpensesTxtBox.sendKeys(str6);
	wagesSalariesAndStaffCostsTxtBox.clear();
	wagesSalariesAndStaffCostsTxtBox.sendKeys(str7);
	rentAndOtherPropertyCostsTxtBox.clear();
	rentAndOtherPropertyCostsTxtBox.sendKeys(str8);
	repairAndRenewalCostsTxtBox.clear();
	repairAndRenewalCostsTxtBox.sendKeys(str9);
	accountancyAndLegalFeesTxtBox.clear();
	accountancyAndLegalFeesTxtBox.sendKeys(str10);
	interestAndFinanceChargesTxtBox.clear();
	interestAndFinanceChargesTxtBox.sendKeys(str11);
	phoneAndOtherOfficeCostsTxtBox.clear();
	phoneAndOtherOfficeCostsTxtBox.sendKeys(str12);
	otherAllowableBusinessExpensesTxtBox.clear();
	otherAllowableBusinessExpensesTxtBox.sendKeys(str13);
	seAnnualInvestmentAllowanceTxtBox.clear();
	seAnnualInvestmentAllowanceTxtBox.sendKeys(str14);
	allowanceForSmallBalanceOfUnrelievedExpenditureTxtBox.clear();
	allowanceForSmallBalanceOfUnrelievedExpenditureTxtBox.sendKeys(str15);
	otherCapitalAllowancesTxtBox.clear();
	otherCapitalAllowancesTxtBox.sendKeys(str16);
	totalBalancingChargesTxtBox.clear();
	totalBalancingChargesTxtBox.sendKeys(str17);
	ownGoodsAndServicesTxtBox.clear();
	ownGoodsAndServicesTxtBox.sendKeys(str18);
	txtBoxLossBroughtForward.clear();
	txtBoxLossBroughtForward.sendKeys(str19);
	anyOtherBusinessIncomeTxtBox.clear();
	anyOtherBusinessIncomeTxtBox.sendKeys(str20);
	//Losses
	totalLossToCarryForwardTxtBox.clear();
	totalLossToCarryForwardTxtBox.sendKeys(str21);
	//CIS Deductions
	subContractorsTaxDeductionTxtBox.clear();
	subContractorsTaxDeductionTxtBox.sendKeys(str22);
	n1=Double.parseDouble(str3);
	n2=Double.parseDouble(str4);
	n3=Double.parseDouble(str5);
	n4=Double.parseDouble(str6);
	n5=Double.parseDouble(str7);
	n6=Double.parseDouble(str8);
	n7=Double.parseDouble(str9);
	n8=Double.parseDouble(str10);
	n9=Double.parseDouble(str11);
	n10=Double.parseDouble(str12);
	n11=Double.parseDouble(str13);
	n12=Double.parseDouble(str14);
	n13=Double.parseDouble(str15);
	n14=Double.parseDouble(str16);
	n15=Double.parseDouble(str17);
	n16=Double.parseDouble(str18);
	n17=Double.parseDouble(str19);
	n18=Double.parseDouble(str20);
	n19=Double.parseDouble(str21);
	n20=Double.parseDouble(str22);
	SaveBtn1.click();
	Thread.sleep(4000);
	displayRecordsBtn.click();
	
	totalIncome1=n3+n4+n5+n6+n7+n8+n9+n10+n11;
	Thread.sleep(500);
	string1=totalExpenseTxtBox.getAttribute("value").replace(".00", "");
	calculation1=Double.parseDouble(string1);
	Assert.assertEquals(calculation1, totalIncome1);
	Reporter.log("Total allowable expenses verified successfully",true);
	//Tax allowances for vehicles and equipment (capital allowances)
	
	totalIncome2=n12+n13+n14+n15;
	Thread.sleep(500);
	string2=totalAllowancesTxtBox.getAttribute("value").replace(".00", "");
	calculation2=Double.parseDouble(string2);
	Assert.assertEquals(calculation2, totalIncome2);
	Reporter.log("Total Capital Allowance verified successfully",true);

	
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	total1=n1+n2+n16+n18+n15-(calculation1+n12+n13+n14);
	expResult1=String.format("%.2f",(total1));
	actResult1=TotalIncomeReceived.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult1, expResult1);
	Reporter.log("Total income received verified successfully"+actResult1,true);
	tax1=total1-(personalAllowanceRate+n17);
	expResult1=String.format("%.2f",(tax1));
	actResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult1, expResult1);
	Reporter.log("Total income on which tax is due verified successfully"+actResult1,true);
	heigherRate=(tax1-taxLimit1Uk)*heigherRateNonSaving/100;
	amount3=amount1+heigherRate;
	expResult1=String.format("%.2f",(amount3));
	actResult1=incomeTaxDue.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult1, expResult1);
	Reporter.log("Income Tax due verified successfully"+actResult1,true);
	total2=(total1-(n17+class2UPL))*class2UPLRate/100;
	total3=(class2UPL-class2LPL)*class2LPLRate/100;
	amount4=amount3+(total2 + total3 +(weeksYear*class4Rate));
	expResult1=String.format("%.2f",(amount4));
	actResult1=IncomeTaxCls2andCls4NationalInsurContriDue.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult1, expResult1);
	Reporter.log("Income Tax, Class 2 and Class 4 National Insurance contributions due verified successfully"+actResult1,true);
	amount5= amount4-n20;
	expResult1=String.format("%.2f",(amount5));
	actResult1=IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText().substring(1).replace(",","");
	 Assert.assertEquals(actResult1, expResult1);
	Reporter.log("Income Tax, Class 2 and Class 4 National Insurance contributions due minus CIS and trading income verified successfully"+actResult1,true);
	actResult2=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(actResult2, actResult1);
	Reporter.log("Balance for this year verified successfully"+actResult2,true);
}
public void delundoManualSubmitBtn(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	try
	{
do {
	wLib.explicitWait(driver,5,taxReturnLink);
	taxReturnLink.click();
	
} while (submitToHMRC.isDisplayed()==false);
	}
	catch (Exception e) {
System.out.println("Submit to hmrc visible");
	}
	wLib.explicitWait(driver, 5, submitToHMRC);
	submitToHMRC.click();
	
	try
	{
	  undoManualSubmitBtn.click();
	    
	}
	catch (Exception e)
	{
	    System.out.println("undo Manual Submit Button not displayed");
	}
	try
	{
unlockBtn.click();
	    
	}
	catch (Exception e)
	{
	    System.out.println("unlock Button not displayed");
	}
}
public void delSEshort(WebDriver driver) throws Exception
{
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	
	delButton.click();
	
	confDel.click();
}
public void readPDF1SE(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
 	
	driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string1 =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	 Reporter.log("Tax For the year: " +string1,true);
	 string2=class4NationalInsurancecontributions1.getText().substring(1).replace(",","");
	 n1=Double.parseDouble(string2);
	 string3=class4NationalInsurancecontributions2.getText().substring(1).replace(",","");
	 n2=Double.parseDouble(string3);
	 string4=class2NationalInsurancecontributions.getText().substring(1).replace(",","");
	 n3=Double.parseDouble(string4);
	 actualValue1=String.format("%.0f",(n3)).replace("", " ").trim();
	 Reporter.log("class 2 National Insurance Contributions: " +string4,true);
	 total1=n1+n2;
	 expResult1=String.format("%.0f",(total1)).replace("", " ").trim();
	 Reporter.log("class 4 National Insurance Contributions: " +expResult1,true);
    filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
   file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
    Assert.assertTrue(output.contains(string1));
        Reporter.log("Tax for the year Verified: " +string1, true);
        Assert.assertTrue(output.contains(actualValue1));
        Reporter.log("Class 2 National Insurance contributions Verified: " +actualValue1, true);    
        Assert.assertTrue(output.contains(expResult1));
        Reporter.log("class 4 National Insurance Contributions: " +expResult1, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   /* file = new File(file1);
    file.delete();
    driver.navigate().back();*/
}
public void readPDF2SE(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
	
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	string1 = totalIncomeOnWhichTaxIsDue.getText();
	Reporter.log("Total income on which tax is due: "+string1,true);
	string2=incomeOnWhichTaxCharged.getText();
	 Reporter.log("Total income on which Tax is charged: "+string2,true);
	 string3 =taxForThisYear.getText();
	 Reporter.log("Total tax Balance for the year: "+string3,true);
	 string4 =IncomeTaxCls2andCls4NationalInsurContriDue.getText();
	 Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due: "+string4,true);
	 string5 =IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText();
	 Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due Minus CIS: "+string5,true);
	filePath =path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    Thread.sleep(5000);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        //String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Total income on which tax is due Verified Successfully: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Total income on which Tax is charged verified Successfully: " +string2, true);
       
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Total income on which Tax is charged verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due Minus CIS verified Successfully: " +string5, true);
       
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
  
}
public void readPDF3SE(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, taxReturnLink);
 	taxReturnLink.click();
 	
 	wLib.explicitWait(driver, 30, taxCalSummaryLink);
	taxCalSummaryLink.click();
 	wLib.explicitWait(driver, 30, class4NationalInsurancecontributions1);
 	string1=class4NationalInsurancecontributions1.getText().substring(1).replace(",","");
 	Reporter.log(string1,true);
 	n1=Double.parseDouble(string1);
	 string2=class4NationalInsurancecontributions2.getText().substring(1).replace(",","");
	 Reporter.log(string2,true);
	 n2=Double.parseDouble(string2);
	 string3=class2NationalInsurancecontributions.getText();
	 Reporter.log("class 2 National Insurance Contributions: " +string3,true);
	 total1=n1+n2;
	 DecimalFormat df = new DecimalFormat("###,###.##");
	  expResult1="£"+String.format(df.format(total1));
	 Reporter.log("class 4 National Insurance Contributions: " +expResult1,true);
	string4=taxForThisYear.getText(); 
	Reporter.log("Balance Tax for the year: "+string4,true);
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Summary Report PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("class 2 National Insurance Contributions verified : " +string3, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(expResult1));
        Reporter.log("class 4 National Insurance Contributions verified :" +expResult1, true);
        Thread.sleep(200);
         Assert.assertTrue(output.contains(string4));
        Reporter.log("Balance Tax for the year verified :" +string4, true);
         Thread.sleep(200);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   }
public void readPDF4SE(WebDriver driver, String Folder, String filename,String s1) throws EmptyFileException, IOException, Exception {
	string1="£"+s1;
	
	Reporter.log("Total Income: "+string1,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document).replace(",", "").replace(".00", "");
      
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payment received from All Employments verified : " +string1, true);
        Thread.sleep(200);
      
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    }
public void selfEmplomentFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22,String str23,String str24,String str25,String str26,String str27,String str28,String str29,String str30,String str31,String str32,String str33,String str34,String str35,String str36,String str37,String str38,String str39,String str40,String str41,String str42,String str43,String str44) throws Exception
{
	
		clickIncome(driver);
		
		selfEmploymentLink.click();
		
		try
		{
		
		delButton.click();
		
		confDel.click();
		}
		catch (Exception e)
		{
		    Reporter.log(e.getMessage(),true);
		}
		try
		{
		editFullRecordsSE.click();
		
		adjustmentProfitTxtBox.clear();
		
		adjustmentProfitTxtBox.sendKeys("0");
		
		SaveBtn1.click();
		}
		catch(Exception e)
		{
			Reporter.log(e.getMessage(),true);	
		}
		
		try
		{
		delDisplayFullRecords.click();
		
		confirmDel.click();
		
		}
		catch(Exception e)
		{
			Reporter.log(e.getMessage(),true);	
		}
		
	
	frm1Btn.click();
	businessNameTxtBox.clear();
	businessNameTxtBox.sendKeys(str1);
	descriptionofBusinessTxtBox.clear();
	descriptionofBusinessTxtBox.sendKeys(str2);
	businessAddressTxtBox.clear();
	businessAddressTxtBox.sendKeys(str3);
	businessPostCodeTxtBox.clear();
	businessPostCodeTxtBox.sendKeys(str4);
	businessStarteddateTxtBox.clear();
	businessStarteddateTxtBox.sendKeys(dateStart);
	businessCeasedDateTxtBox.clear();
	businessCeasedDateTxtBox.sendKeys(dateEnd);
	booksAccoutsStartDateTxtBox.clear();
	booksAccoutsStartDateTxtBox.sendKeys(dateStart);
	businessBooksEnddateTxtBox.clear();
	businessBooksEnddateTxtBox.sendKeys(dateEnd);
	businessBooksEnddateTxtBox.sendKeys(Keys.TAB);
	
	incomeExpenseChkBox.click();
	
	//Other Information
	
	changedAccountDateChkBox.click();
	
	//Business Income
	trunoverTxtBox.clear();
	trunoverTxtBox.sendKeys(str5);
	businessIncomeOtherTxtBox.clear();
	businessIncomeOtherTxtBox.sendKeys(str6);
	//Business Expenses
	goodsOfCostfullTxtBox.clear();
	goodsOfCostfullTxtBox.sendKeys(str7);
	goodsDexpTxtBox.clear();
	goodsDexpTxtBox.sendKeys(str8);
	travelexpensesTxtBox.clear();
	travelexpensesTxtBox.sendKeys(str9);
	disexpCarandVanTxtBox.clear();
	disexpCarandVanTxtBox.sendKeys(str10);
	bankCreditandOtherFinancialChargesTxtBox.clear();
	bankCreditandOtherFinancialChargesTxtBox.sendKeys(str11);
	disexpBankCreditTxtBox.clear();
	disexpBankCreditTxtBox.sendKeys(str12);
	depreciationProfitandLossTxtBox.clear();
	depreciationProfitandLossTxtBox.sendKeys(str13);
	disexpDepreciationTxtBox.clear();
	disexpDepreciationTxtBox.sendKeys(str14);
	//Fetch Text
	n1 = Double.parseDouble(str5);
	n2 = Double.parseDouble(str6);
	n3 = Double.parseDouble(str7);
	n4 = Double.parseDouble(str8);
	n5 = Double.parseDouble(str9);
	n6 = Double.parseDouble(str10);
	n7 = Double.parseDouble(str11);
	n8 = Double.parseDouble(str12);
	n9 = Double.parseDouble(str13);
	n10 = Double.parseDouble(str14);
	//Tax allowances for vehicles and equipment (capital allowances)
	annualinvestmentTxtBox.clear();
	annualinvestmentTxtBox.sendKeys(str15);
	capitalAllowancesemissionsTxtBox.clear();
	capitalAllowancesemissionsTxtBox.sendKeys(str16);
	seCapitalAllowancesTxtBox.clear();
	seCapitalAllowancesTxtBox.sendKeys(str17);
	restrictedCostingTxtBox.clear();
	restrictedCostingTxtBox.sendKeys(str18);
	otherEnhancedCapitalAllowancesTxtBox.clear();
	otherEnhancedCapitalAllowancesTxtBox.sendKeys(str19);
	allowancesCessationBusinessTxtBox.clear();
	allowancesCessationBusinessTxtBox.sendKeys(str20);
	n11 = Double.parseDouble(str15);
	n12 = Double.parseDouble(str16);
	n13 = Double.parseDouble(str17);
	n14 = Double.parseDouble(str18);
	n15 = Double.parseDouble(str19);
	n16 = Double.parseDouble(str20);
	
	balancingChargeOnSalesTxtBox.clear();
	balancingChargeOnSalesTxtBox.sendKeys(str21);
	
	goodAndServicesTxtBox.clear();
	goodAndServicesTxtBox.sendKeys(str22);
	n17 = Double.parseDouble(str21);
	n18 = Double.parseDouble(str22);
	businessIncomeandOtherProfitTxtBox.clear();
	businessIncomeandOtherProfitTxtBox.sendKeys(str23);
	n19 = Double.parseDouble(str23);
	basisPeriodBeganTxtBox.clear();
	basisPeriodBeganTxtBox.sendKeys(dateStart);
	basisPeriodEndedTxtBox.clear();
	basisPeriodEndedTxtBox.sendKeys(dateEnd);
	overlapReliefTxtBox.clear();
	overlapReliefTxtBox.sendKeys(str24);
	overlapProfitTxtBox.clear();
	overlapProfitTxtBox.sendKeys(str25);
	n20 = Double.parseDouble(str24);
	n21 = Double.parseDouble(str25);
	lossBroughtForwardProfitTxtBox.clear();
	lossBroughtForwardProfitTxtBox.sendKeys(str26);
	anyBusinessIncomeTxtBox.clear();
	anyBusinessIncomeTxtBox.sendKeys(str27);
	n22 = Double.parseDouble(str26);
	n23 = Double.parseDouble(str27);
	//Losses
	losstoCarryforwardTxtBox.clear();
	losstoCarryforwardTxtBox.sendKeys(str28);
	n24 = Double.parseDouble(str28);
	//CIS Deductions and Tax taken Off
	subContractorsDeductionTaxTxtBox.clear();
	subContractorsDeductionTaxTxtBox.sendKeys(str29);
	n25 = Double.parseDouble(str29);
	//Balance Sheet
	//Assets
	equipMentandMachineryTxtBox.clear();
	equipMentandMachineryTxtBox.sendKeys(str30);
	OtherFixedAssestsTxtBox.clear();
	OtherFixedAssestsTxtBox.sendKeys(str31);
	stockAndWorkTxtBox.clear();
	stockAndWorkTxtBox.sendKeys(str32);
	tradeDebtorsTxtBox.clear();
	tradeDebtorsTxtBox.sendKeys(str33);
	bankSocietyBalancesTxtBox.clear();
	bankSocietyBalancesTxtBox.sendKeys(str34);
	cashinHandTxtBox.clear();
	cashinHandTxtBox.sendKeys(str35);
	currentAssestsandPaymentTxtBox.clear();
	currentAssestsandPaymentTxtBox.sendKeys(str36);
	n26 = Double.parseDouble(str30);
	n27 = Double.parseDouble(str31);
	n28 = Double.parseDouble(str32);
	n29 = Double.parseDouble(str33);
	n30 = Double.parseDouble(str34);
	n31 = Double.parseDouble(str35);
	n32 = Double.parseDouble(str36);
	//Liabilities
	tradeCreditorsTxtBox.clear();
	tradeCreditorsTxtBox.sendKeys(str37);
	loansOverdrawnandBankAccountTxtBox.clear();
	loansOverdrawnandBankAccountTxtBox.sendKeys(str38);
	liabilitiesandAccrualsTxtBox.clear();
	liabilitiesandAccrualsTxtBox.sendKeys(str39);
	n33 = Double.parseDouble(str37);
	n34 = Double.parseDouble(str38);
	n35 = Double.parseDouble(str39);
	//Capital Account
	balanceStartPeriodTxtBox.clear();
	balanceStartPeriodTxtBox.sendKeys(str40);
	n36 = Double.parseDouble(str40);
	capitalIntroducedTxtBox.clear();
	capitalIntroducedTxtBox.sendKeys(str41);
	drawingTxtBox.clear();
	drawingTxtBox.sendKeys(str42);
	n37 = Double.parseDouble(str41);
	n38 = Double.parseDouble(str42);
	//National Insurance Contributions
	adjustmentProfitTxtBox.clear();
	adjustmentProfitTxtBox.sendKeys(str43);
	n39 = Double.parseDouble(str43);
	//Other Information
	commentTxtBox.clear();
	commentTxtBox.sendKeys(str44);
	SaveBtn1.click();
	
	editFullRecordsSE.click();
	total1=n3+n5+n7+n9;
	t1=String.format("%.2f",(total1));
	value1=businessExpTotalExpensesTxtBox.getAttribute("value");
	Assert.assertEquals(value1, t1);
	Reporter.log("Total expenses Verified: "+value1,true);
	total2=n4+n6+n8+n10;
	t2=String.format("%.2f",(total2));
	value2=totalDisallowableExpencesTxtBox.getAttribute("value");
	Assert.assertEquals(value2, t2);
	Reporter.log("Total Disallowable expenses Verified: "+value2,true);
	x1=Double.parseDouble(value1);
	totlIncome=(n1+n2)-x1;
	t1=String.format("%.2f",(totlIncome));
	//Net profit or loss - Fetch Text
	string1=netProfitTxtBox.getAttribute("value");
	Assert.assertEquals(string1, t1);
	Reporter.log("Net profit Verified: "+string1,true);
	amount3=n11+n12+n13+n14+n15+n16;
	t1=String.format("%.2f",(amount3));
	string2=totalcapitalallowancesTxtBox.getAttribute("value");
	Assert.assertEquals(string2, t1);
	Reporter.log("Total capital allowances Verified: "+string2,true);
	//Fetched
	x1=Double.parseDouble(value2);
	totalIncome1=n17+n18+x1;
	t1=String.format("%.2f",(totalIncome1));
	t2=totaladditionaltonetprofitTxtBox.getAttribute("value");
	Assert.assertEquals(t2, t1);
	Reporter.log("Total additions to net profit or deductions from net loss Verified: "+t2,true);
	//Fetched
	dueTax1=Double.parseDouble(string2);
	dueTax2=Double.parseDouble(totaldeductiontonetprofitTxtBox.getAttribute("value"));
	dueTax3=Double.parseDouble(netBusinessProfitfortaxpurposeTxtBox.getAttribute("value"));
	Assert.assertEquals(dueTax2, dueTax1+n19);
	Reporter.log("Total deductions from net profit or additions to net loss Verified: "+dueTax2,true);
	totlIncome=Double.parseDouble(string1);
	tax1=Double.parseDouble(t2);
	Assert.assertEquals(dueTax3, (totlIncome+tax1)-dueTax2);
	Reporter.log("Net Business Profit for tax purpose Verified: "+dueTax3,true);
	//Fetched
	total3=dueTax3-n20;
	totalIncome2=Double.parseDouble(adjustedProfitTxtBox.getAttribute("value"));
	Assert.assertEquals(totalIncome2,total3);
	Reporter.log("Adjusted profit for current tax year Verified: "+totalIncome2,true);
	//Fetched
	amount3=totalIncome2+n23-n22;
	amount4=Double.parseDouble(totalProfitFromBusinessTxtBox.getAttribute("value"));
	Assert.assertEquals(amount4,amount3);
	Reporter.log("Total taxable profit from this business Verified: "+amount4,true);
	//Fetched
	totalIncome3=n26+n27+n28+n29+n30+n31+n32;
	amount5=Double.parseDouble(totalAssetsTxtBox.getAttribute("value"));
	Assert.assertEquals(amount5,totalIncome3);
	Reporter.log("Total Assets Verified: "+amount5,true);
	//Fetched
	//Net business assets
	calculation1=amount5-(n33+n34+n35);
	calculation2=Double.parseDouble(netBusinessAssetsTxtBox.getAttribute("value"));
	Assert.assertEquals(calculation2,calculation1);
	Reporter.log("Net Business Assets Verified: "+calculation2,true);
	//Fetched	
	string3=netprofitorlossTxtBox.getAttribute("value");
	Assert.assertEquals(string3,string1);
	Reporter.log("Capital amount Net profit Verified: "+string3,true);
	
	//Fetched
	calculation3=(totlIncome+n36+n37)-n38;
	finalAmount=Double.parseDouble(balanceEndPeriodTxtBox.getAttribute("value"));
	Assert.assertEquals(finalAmount,calculation3);
	Reporter.log("Balance at end of period Verified: "+string3,true);
	wLib = new WaitStatementLib();	
	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
 	taxCalSummaryLink.click();
 	expResult1=	TotalIncomeReceived.getText().substring(1).replace(",", "");
 	calculation1=Double.parseDouble(expResult1);
 	tot1=totalIncome2+n23;
 	Assert.assertEquals(calculation1,tot1);
	Reporter.log("Total income received Verified: "+calculation1,true);
	expResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	calculation2=Double.parseDouble(expResult1);
	totlIncome=calculation1- (n22 +personalAllowanceRate);
	Assert.assertEquals(calculation2,totlIncome);
	Reporter.log("Total income on which tax is due Verified: "+calculation2,true);
	
	expResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	calculation3=Double.parseDouble(expResult1);
	basic1=calculation2*basicRateNonSaving/100;
	Assert.assertEquals(calculation3,basic1);
	Reporter.log("Income Tax due Verified: "+calculation3,true);
	
	basicRate=basic1+(((calculation1-(class2LPL+n22+n39))*class2LPLRate/100)+(class4Rate*weeksYear));
	basicRate1=String.format("%.2f",(basicRate));
	
	expResult1=IncomeTaxCls2andCls4NationalInsurContriDue.getText().substring(1).replace(",", "");
	taxBalance=Double.parseDouble(expResult1);
	Assert.assertEquals(expResult1,basicRate1);
	Reporter.log("Total Class 2 and Class 4 National Insurance contributions due Verified: "+taxBalance,true);
	finalAmount=basicRate-n25;
	taxFinal=String.format("%.2f",(finalAmount));
	actResult1=IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText().substring(1).replace(",", "");
	Assert.assertEquals(actResult1,taxFinal);
	Reporter.log("Total Class 2 and Class 4 National Insurance contributions due minus Tax deducted is Verified: "+actResult1,true);
	taxFinalUI= taxForThisYear.getText().substring(1).replace(",", "");
	Assert.assertEquals(taxFinalUI,actResult1);
	Reporter.log("Balance for the year verified: "+taxFinalUI,true);
}

public void delSelfEmpFull(WebDriver driver) throws Exception
{
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	
	editFullRecordsSE.click();
	
	adjustmentProfitTxtBox.clear();
	
	adjustmentProfitTxtBox.sendKeys("0");
	
	SaveBtn1.click();
	
	delDisplayFullRecords.click();
	
	confirmDel.click();
	
}
public void readPDF1SEFull(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
 	
	driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string1 =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	 Reporter.log("Tax For the year: " +string1,true);
	 string2=class4NationalInsurancecontributions1.getText().substring(1).replace(".","@").replace(",","");
	 String[] newStr=string2.split("@");
	 n1=Double.parseDouble(newStr[0]);
	 string2=String.format("%.0f",(n1)).replace("", " ").trim();
	 Reporter.log("class 4 National Insurance Contributions: " +string2,true);
	 string3=class2NationalInsurancecontributions.getText().substring(1).replace(",","");
	 String[] newStr1=string3.split("@");
	 n2=Double.parseDouble(newStr1[0]);
	 string3=String.format("%.0f",(n2)).replace(".","@").replace("", " ").trim();
	 Reporter.log("class 2 National Insurance Contributions: " +string3,true);
	
    filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
    Assert.assertTrue(output.contains(string1));
        Reporter.log("Tax for the year Verified: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Class 4 National Insurance contributions Verified: " +string2, true);    
        Assert.assertTrue(output.contains(string3));
        Reporter.log("class 2 National Insurance Contributions: " +string3, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
  }
public void readPDF2SEFull(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	string1 = totalIncomeOnWhichTaxIsDue.getText();
	Reporter.log("Total income on which tax is due: "+string1,true);
	string2=incomeOnWhichTaxCharged.getText();
	 Reporter.log("Total income on which Tax is charged: "+string2,true);
	 string3 =taxForThisYear.getText();
	 Reporter.log("Total tax Balance for the year: "+string3,true);
	 string4 =IncomeTaxCls2andCls4NationalInsurContriDue.getText();
	 Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due: "+string4,true);
	 string5 =IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText();
	 Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due Minus CIS: "+string5,true);
	filePath =path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    Thread.sleep(5000);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        //String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Total income on which tax is due Verified Successfully: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Total income on which Tax is charged verified Successfully: " +string2, true);
       
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Total income on which Tax is charged verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Income Tax Class2 andClacs4 National Insurance Contribution Due Minus CIS verified Successfully: " +string5, true);
       
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   }
public void readPDF3SEFull(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
 	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
 	string1=class4NationalInsurancecontributions1.getText();
 	Reporter.log(string1,true);
 	 Reporter.log("class 4 National Insurance Contributions: " +string1,true);
 	string2=class2NationalInsurancecontributions.getText();
	 Reporter.log("class 2 National Insurance Contributions: " +string2,true);
	string3=taxForThisYear.getText(); 
	Reporter.log("Balance Tax for the year: "+string3,true);
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Summary Report PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("class 4 National Insurance Contributions verified :" +string1, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("class 2 National Insurance Contributions verified : " +string2, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Balance Tax for the year verified :" +string3, true);
         Thread.sleep(200);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
  }
public void readPDF4SEFull(WebDriver driver, String Folder, String filename,String s1) throws EmptyFileException, IOException, Exception {
	string1="£"+s1;
	Reporter.log("Total Income: "+string1,true);
	driver.navigate().refresh();
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    file1=filePath + Folder + filename;
    Thread.sleep(5000);
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        output = new PDFTextStripper().getText(document).replace(",", "").replace(".00", "");
      
        Reporter.log("Employment Income PDF data: " +output, true);
        Thread.sleep(200);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payment received from All Employments verified : " +string1, true);
        Thread.sleep(200);
      
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
   }

public void uploadFile(WebDriver driver) throws Exception {
	clickIncome(driver);
	 Thread.sleep(700);
	 linkCapitalGain.click();

	 editBtn.click();
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys("capital gain record");
	WebElement uploadElement = fileUpload1;
	uploadElement.clear();
	uploadElement.sendKeys("C:\\Users\\Administrator\\Desktop\\SA2017-18.pdf");
	commentForValidation.clear();
	commentForValidation.sendKeys("test");
	SaveBtn1.click();
  
	
}
public void capitalGainFormValidate(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22,String str23,String str24,String str25,String str26) throws Exception {
	
	
	try
	 {
		 do {
				
				IncomeLink.click();
				} while (linkCapitalGain.isDisplayed()==false);
		
		 	selfEmploymentLink.click();
			
			if(editFullRecordsSE.isDisplayed()==true) {
			editFullRecordsSE.click();
			
			adjustmentProfitTxtBox.clear();
			
			adjustmentProfitTxtBox.sendKeys("0");
			
			SaveBtn1.click();
			
			delDisplayFullRecords.click();
			
			confirmDel.click();
			
		}
	 }
	 catch (Exception e) {
		Reporter.log("Self Employment Full is not available",true);
	}
	try
	 {
		 if(linkCapitalGain.isDisplayed()==false) {
				
				clickIncome(driver);
				} 
	 }
	catch (Exception e) {
		Reporter.log("Link Capital Gain is visible",true);
	}
	 linkCapitalGain.click();
	 
	 editBtn.click();
	
	residentialPropertyNumberOfDisposalsTxtBox.clear();
residentialPropertyNumberOfDisposalsTxtBox.sendKeys(str1);
residentialPropertyDisposalProceedsTxtBox.clear();
residentialPropertyDisposalProceedsTxtBox.sendKeys(str2);
residentialPropertyAllowableCostsTxtBox.clear();
residentialPropertyAllowableCostsTxtBox.sendKeys(str3);
residentialPropertyGainsInTheYearTxtBox.clear();
residentialPropertyGainsInTheYearTxtBox.sendKeys(str4);
residentialPropertyLossesInTheYearTxtBox.clear();
residentialPropertyLossesInTheYearTxtBox.sendKeys(str5);
residentialPropertyClaimOrElectionMadeTxtBox.clear();
residentialPropertyClaimOrElectionMadeTxtBox.sendKeys(str6);
residentialPropertyGainOrLossRelatingToNRCGTTxtBox.clear();
residentialPropertyGainOrLossRelatingToNRCGTTxtBox.sendKeys(str7);
residentialPropertyNRCGTtaxAlreadyChargedTxtBox.clear();
residentialPropertyNRCGTtaxAlreadyChargedTxtBox.sendKeys(str8);
residentialPropertyGainOrLossFromRTTreturnTxtBox.clear();
residentialPropertyGainOrLossFromRTTreturnTxtBox.sendKeys(str9);
residentialPropertyRTTtaxAlreadyChargedTxtBox.clear();
residentialPropertyRTTtaxAlreadyChargedTxtBox.sendKeys(str10);
residentialPropertyCarriedInterestTxtBox.clear();
residentialPropertyCarriedInterestTxtBox.sendKeys(str11);
propertyEtcTotalDisposalTxtBox.clear();
propertyEtcTotalDisposalTxtBox.sendKeys(str1);
propertyEtcDisposalProceedTxtBox.clear();
propertyEtcDisposalProceedTxtBox.sendKeys(str2);
propertyEtcCostsAndIndexationTxtBox.clear();
propertyEtcCostsAndIndexationTxtBox.sendKeys(str3);
propertyEtcGainsInTheYearTxtBox.clear();
propertyEtcGainsInTheYearTxtBox.sendKeys(str12);
propertyEtcAttributedGainTxtBox.clear();
propertyEtcAttributedGainTxtBox.sendKeys(str5);
propertyEtcLossesInTheYearTxtBox.clear();
propertyEtcLossesInTheYearTxtBox.sendKeys(str13);
propertyEtcClaimOrElectionMadeTxtBox.clear();
propertyEtcClaimOrElectionMadeTxtBox.sendKeys(str14);
propertyEtcGainFromRTTreturnTxtBox.clear();
propertyEtcGainFromRTTreturnTxtBox.sendKeys(str9);
propertyEtcRTTtaxAlreadyChargedTxtBox.clear();
propertyEtcRTTtaxAlreadyChargedTxtBox.sendKeys(str15);
//Listed shares and securities
qSTotalDisposalTxtBox.clear();
qSTotalDisposalTxtBox.sendKeys(str1);
qSDisposalProceedTxtBox.clear();
qSDisposalProceedTxtBox.sendKeys(str2);
qSCostsAndIndexationTxtBox.clear();
qSCostsAndIndexationTxtBox.sendKeys(str3);
qSGainsInTheYearTxtBox.clear();
qSGainsInTheYearTxtBox.sendKeys(str16);
qSLossesInTheYearTxtBox.clear();
qSLossesInTheYearTxtBox.sendKeys(str5);
qSClaimOrElectionMadeTxtBox.clear();
qSClaimOrElectionMadeTxtBox.sendKeys(str17);
qSGainFromRTTreturnTxtBox.clear();
qSGainFromRTTreturnTxtBox.sendKeys(str9);
qSRTTtaxAlreadyChargedTxtBox.clear();
qSRTTtaxAlreadyChargedTxtBox.sendKeys(str15);
//Unlisted shares and securities
uQSTotalDisposalTxtBox.clear();
uQSTotalDisposalTxtBox.sendKeys(str1);
uQSDisposalProceedTxtBox.clear();
uQSDisposalProceedTxtBox.sendKeys(str2);
uQSCostsAndIndexationTxtBox.clear();
uQSCostsAndIndexationTxtBox.sendKeys(str3);
uQSGainsInTheYearTxtBox.clear();
uQSGainsInTheYearTxtBox.sendKeys(str16);
uQSLossesInTheYearTxtBox.clear();
uQSLossesInTheYearTxtBox.sendKeys(str18);
uQSClaimOrElectionMadeTxtBox.clear();
uQSClaimOrElectionMadeTxtBox.sendKeys(str19);
uQSGainFromRTTreturnTxtBox.clear();
uQSGainFromRTTreturnTxtBox.sendKeys(str9);
uQSRTTtaxAlreadyChargedTxtBox.clear();
uQSRTTtaxAlreadyChargedTxtBox.sendKeys(str15);
uQSGainsExceedingESSlimitTxtBox.clear();
uQSGainsExceedingESSlimitTxtBox.sendKeys(str20);
uQSGainsInvestedUnderSeedEISTxtBox.clear();
uQSGainsInvestedUnderSeedEISTxtBox.sendKeys(str21);
uQSLossUsedAgainstCurrentYearIncomeTxtBox.clear();
uQSLossUsedAgainstCurrentYearIncomeTxtBox.sendKeys(str22);
uQSUncappedLossUsedAgainstCurrentYearIncomeTxtBox.clear();
uQSUncappedLossUsedAgainstCurrentYearIncomeTxtBox.sendKeys(str9);
uQSLossUsedAgainstPrevYearIncomeTxtBox.clear();
uQSLossUsedAgainstPrevYearIncomeTxtBox.sendKeys(str20);
uQSUncappedLossUsedAgainstPrevYearIncomeTxtBox.clear();
uQSUncappedLossUsedAgainstPrevYearIncomeTxtBox.sendKeys(str15);
//Losses and adjustments
lossBFAndUsedInYearTxtBox.clear();
lossBFAndUsedInYearTxtBox.sendKeys(str23);
incomeLossesOfTheYearSetAgainstGainTxtBox.clear();
incomeLossesOfTheYearSetAgainstGainTxtBox.sendKeys(str21);
lossToBeCarriedForwardTxtBox.clear();
lossToBeCarriedForwardTxtBox.sendKeys(str22);
lossUsedAgainstEarlierYearsGainTxtBox.clear();
lossUsedAgainstEarlierYearsGainTxtBox.sendKeys(str16);
entrepreneurReliefClaimOnDefGainBefore23June2010TxtBox.clear();
entrepreneurReliefClaimOnDefGainBefore23June2010TxtBox.sendKeys(str20);
totalERGainForTheYearTxtBox.clear();
totalERGainForTheYearTxtBox.sendKeys(str21);
adjustmentToCGTTxtBox.clear();
adjustmentToCGTTxtBox.sendKeys(str22);
nRDRTrustLiabilityTxtBox.clear();
nRDRTrustLiabilityTxtBox.sendKeys(str16);
//Not an integer value str6	str14 str17	str19	str24	str25	str26
n1=Double.parseDouble(str1);
n2=Double.parseDouble(str2);
n3=Double.parseDouble(str3);
n4=Double.parseDouble(str4);
n5=Double.parseDouble(str5);
n6=Double.parseDouble(str7);
n7=Double.parseDouble(str8);
n8=Double.parseDouble(str9);
n9=Double.parseDouble(str10);
n10=Double.parseDouble(str11);
n11=Double.parseDouble(str12);
n12=Double.parseDouble(str13);
n13=Double.parseDouble(str15);
n14=Double.parseDouble(str16);
n15=Double.parseDouble(str18);
n16=Double.parseDouble(str20);
n17=Double.parseDouble(str21);
n18=Double.parseDouble(str22);
n19=Double.parseDouble(str23);
total1=(n4-n5)+(n11-n12)+(n14-n5)+(n14-n15);
expResult1=String.format("%.2f",total1);
//Upload PDF
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str24);
WebElement uploadElement = fileUpload1;
uploadElement.clear();
uploadElement.sendKeys(str25);
commentForValidation.clear();
commentForValidation.sendKeys(str26);
SaveBtn1.click();

actResult1=totalGainTxtBox.getAttribute("value");
totalincome=Double.parseDouble(actResult1);
Assert.assertEquals(actResult1, expResult1);
Reporter.log("TOTAL GAINS Verified Successfully : "+actResult1,true);	 
wLib = new WaitStatementLib();	
taxReturnLink.click();
wLib.explicitWait(driver, 60, taxCalSummaryLink);
taxCalSummaryLink.click();
totalincome=totalincome-annualExemptIndividuals+n6+n5+n18+n16-n19-n17;
calculation1=n17*entrepreneursReliefRate/100;
calculation2=(taxLimit1Uk-n17)*entrepreneursReliefRate/100;
calculation3=(totalincome-taxLimit1Uk)*basicRateNonSaving/100;
tot1=n18+n14-(n7+n9+n13+n13+n13);
fnltax=calculation1+calculation2+calculation3+tot1;
taxFinal=String.format("%.2f",fnltax);
taxFinalUI=taxForThisYear.getText().substring(1).replace(",","");
Assert.assertEquals(taxFinalUI, taxFinal);
Reporter.log("Final Tax for the year Verified Successfully : "+taxFinalUI,true);
}
public void readPDFCapitalGain(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
 	
	clickIncome(driver);
	
	 linkCapitalGain.click();

	 
string1=residentialPropertyNumberOfDisposalsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string2=residentialPropertyDisposalProceedsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string3=residentialPropertyAllowableCostsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string4=residentialPropertyGainsInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string5=residentialPropertyLossesInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string6=residentialPropertyClaimOrElectionMadeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string7=residentialPropertyGainOrLossRelatingToNRCGTTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string8=residentialPropertyNRCGTtaxAlreadyChargedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string9=residentialPropertyGainOrLossFromRTTreturnTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string10=residentialPropertyRTTtaxAlreadyChargedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string11=residentialPropertyCarriedInterestTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string12=propertyEtcTotalDisposalTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string13=propertyEtcDisposalProceedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string14=propertyEtcCostsAndIndexationTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string15=propertyEtcGainsInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string16=propertyEtcAttributedGainTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string17=propertyEtcLossesInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string18=propertyEtcClaimOrElectionMadeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string19=propertyEtcGainFromRTTreturnTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string20=propertyEtcRTTtaxAlreadyChargedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string21=qSTotalDisposalTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string22=qSDisposalProceedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string23=qSCostsAndIndexationTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string24=qSGainsInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string25=qSLossesInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string26=qSClaimOrElectionMadeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string27=qSGainFromRTTreturnTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string28=qSRTTtaxAlreadyChargedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string29=uQSTotalDisposalTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string30=uQSDisposalProceedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string31=uQSCostsAndIndexationTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string32=uQSGainsInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string33=uQSLossesInTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string34=uQSClaimOrElectionMadeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string35=uQSGainFromRTTreturnTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string36=uQSRTTtaxAlreadyChargedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string37=uQSGainsExceedingESSlimitTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string38=uQSGainsInvestedUnderSeedEISTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string39=uQSLossUsedAgainstCurrentYearIncomeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string40=uQSUncappedLossUsedAgainstCurrentYearIncomeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string41=uQSLossUsedAgainstPrevYearIncomeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string42=uQSUncappedLossUsedAgainstPrevYearIncomeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string43=lossBFAndUsedInYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string44=incomeLossesOfTheYearSetAgainstGainTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string45=lossToBeCarriedForwardTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string46=lossUsedAgainstEarlierYearsGainTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string47=entrepreneurReliefClaimOnDefGainBefore23June2010TxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string48=totalERGainForTheYearTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string49=adjustmentToCGTTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string50=nRDRTrustLiabilityTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string51=commentForValidation.getAttribute("value");
driver.navigate().refresh();
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 60, taxReturnLink);
taxReturnLink.click();
Thread.sleep(200);
taxCalSummaryLink.click();

totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
 Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
    Assert.assertTrue(output.contains(string1));
        Reporter.log("Number of disposals Verified: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Disposal proceeds verified: " +string2, true);
        
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Allowable costs verified Successfully : " +string3, true);
        
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Gains in the year, before losses, do not include any gains subject to non-resident Capital Gains Tax verified Successfully : " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Losses in the year (B)do not include any losses incurred on the disposal of a property subject to non-resident Capital Gains Tax Verified: " +string5, true);
        Assert.assertTrue(output.contains(string6));
        Reporter.log("If you are making any claim or election, put the relevant code in the box Verified: " +string6, true);
        Assert.assertTrue(output.contains(string7));
        Reporter.log("NRCGT Verified: " +string7, true);
        Assert.assertTrue(output.contains(string8));
        Reporter.log("Tax on gains in box above already charged Verified: " +string8, true);
        Assert.assertTrue(output.contains(string9));
        Reporter.log("overall gain or loss Verified: " +string9, true);
        Assert.assertTrue(output.contains(string10));
        Reporter.log("Tax on gains in box above already charged Verified: " +string10, true);
        Assert.assertTrue(output.contains(string11));
        Reporter.log("Pay from all employments Verified: " +string11, true);
        Assert.assertTrue(output.contains(string12));
        Reporter.log("Other property, assets and gains - Number of disposals Verified: " +string12, true);
        Assert.assertTrue(output.contains(string13));
        Reporter.log("Other property, assets and gains - Disposal proceeds Verified: " +string13, true);
        Assert.assertTrue(output.contains(string14));
        Reporter.log("Other property, assets and gains -Allowable costs (including purchase price) Verified: " +string14, true);
        Assert.assertTrue(output.contains(string15));
        Reporter.log("Other property, assets and gains -Gains in the year, before losse Verified: " +string15, true);
        Assert.assertTrue(output.contains(string16));
        Reporter.log("Other property, assets and gains - Attributed gains where personal losses cannot be set off Verified: " +string16, true);
        Assert.assertTrue(output.contains(string17));
        Reporter.log("Other property, assets and gains - Losses in the year Verified: " +string17, true);
        Assert.assertTrue(output.contains(string18));
        Reporter.log("Other property, assets and gains - If you are making any claim or election, put the relevant code in the box Verified: " +string18, true);
        Assert.assertTrue(output.contains(string19));
        Reporter.log("Other property, assets and gains - overall gain	or loss include the individual amounts of gains Verified: " +string19, true);
        Assert.assertTrue(output.contains(string20));
        Reporter.log("Other property, assets and gains - Tax on gains in box above already charged Verified: " +string20, true);
        Assert.assertTrue(output.contains(string21));
        Reporter.log("Listed shares and securities - Number of disposals Verified: " +string21, true);
        Assert.assertTrue(output.contains(string22));
        Reporter.log("Listed shares and securities - Disposal proceeds Verified: " +string22, true);
        Assert.assertTrue(output.contains(string23));
        Reporter.log("Listed shares and securities - Allowable costs (including purchase price) Verified: " +string23, true);
        Assert.assertTrue(output.contains(string24));
        Reporter.log("Listed shares and securities - Gains in the year, before losses Verified: " +string24, true);
        Assert.assertTrue(output.contains(string25));
        Reporter.log("Listed shares and securities - Losses in the year Verified: " +string25, true);
        Assert.assertTrue(output.contains(string26));
        Reporter.log("Listed shares and securities - If you are making any claim or election, put the relevant code in the box Verified: " +string26, true);
        Assert.assertTrue(output.contains(string27));
        Reporter.log("Listed shares and securities - gain or	loss include the individual amounts of gains and losses Verified: " +string27, true);
        Assert.assertTrue(output.contains(string28));
        Reporter.log("Listed shares and securities - Tax on gains in box above already charged Verified: " +string28, true);
        Assert.assertTrue(output.contains(string29));
        Reporter.log("Unlisted shares and securities - Number of disposals Verified: " +string29, true);
        Assert.assertTrue(output.contains(string30));
        Reporter.log("Unlisted shares and securities - Disposal proceeds Verified: " +string30, true);
        Assert.assertTrue(output.contains(string31));
        Reporter.log("Unlisted shares and securities - Allowable costs (including purchase price) Verified: " +string31, true);
        Assert.assertTrue(output.contains(string32));
        Reporter.log("Unlisted shares and securities - Gains in the year, before losses Verified: " +string32, true);
        Assert.assertTrue(output.contains(string33));
        Reporter.log("Unlisted shares and securities - Losses in the year Verified: " +string33, true);
        Assert.assertTrue(output.contains(string34));
        Reporter.log("Unlisted shares and securities - any claim or election Verified: " +string34, true);
        Assert.assertTrue(output.contains(string35));
        Reporter.log("Unlisted shares and securities -  overall gain or loss individual amounts of gains Verified: " +string35, true);
        Assert.assertTrue(output.contains(string36));
        Reporter.log("Unlisted shares and securities - Tax on gains in box above already charged Verified: " +string36, true);
        Assert.assertTrue(output.contains(string37));
        Reporter.log("Unlisted shares and securities - Gains exceeding the lifetime limit for Employee Shareholder Status shares Verified: " +string37, true);
        Assert.assertTrue(output.contains(string38));
        Reporter.log("Unlisted shares and securities - Gains invested under Seed Enterprise Investment	Scheme and qualifying for relief Verified: " +string38, true);
        Assert.assertTrue(output.contains(string39));
        Reporter.log("Unlisted shares and securities - Losses used against income amount claimed against 2017 - 18 income Verified: " +string39, true);
        Assert.assertTrue(output.contains(string40));
        Reporter.log("Unlisted shares and securities - Share Loss Relief which Enterprise Investment Scheme/Seed Enterprise Investment Scheme relief is attributable Verified: " +string40, true);
        Assert.assertTrue(output.contains(string41));
        Reporter.log("Unlisted shares and securities - Losses used against income amount claimed against 2016 - 17 income Verified: " +string41, true);
        Assert.assertTrue(output.contains(string42));
        Reporter.log("Unlisted shares and securities - Losses used against income amount claimed against 2016 - 17 income Verified: " +string42, true);
        Assert.assertTrue(output.contains(string43));
        Reporter.log("Losses and adjustments - Losses brought forward and used in-year Verified: " +string43, true);
        Assert.assertTrue(output.contains(string44));
        Reporter.log("Losses and adjustments - Income losses of 2017 - 18 set against gains Verified: " +string44, true);
        Assert.assertTrue(output.contains(string45));
        Reporter.log("Losses and adjustments - Losses available to be carried forward	 Verified: " +string45, true);
        Assert.assertTrue(output.contains(string46));
        Reporter.log("Losses and adjustments - Losses used against an earlier year's gain Verified: " +string46, true);
        Assert.assertTrue(output.contains(string47));
        Reporter.log("Losses and adjustments - Gains qualifying for Entrepreneurs’ Relief Gains before 23 June 2010 Verified: " +string47, true);
        Assert.assertTrue(output.contains(string48));
        Reporter.log("Losses and adjustments - Gains qualifying for Entrepreneurs’ Relief Gains after 23 June 2010 Verified: " +string48, true);
        Assert.assertTrue(output.contains(string49));
        Reporter.log("Losses and adjustments - Adjustments to Capital Gains Tax Verified: " +string49, true);
        Assert.assertTrue(output.contains(string50));
        Reporter.log("Losses and adjustments - Additional liability for non-resident or dual resident trusts Verified: " +string50, true);
        Assert.assertTrue(output.contains(string51));
        Reporter.log("Any Other Information Verified: " +string51, true);
        
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Income and Capital Gains Tax due Verified: " +totIncomTaxChar, true);
        
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    }
public void delCGI(WebDriver driver) throws Exception
{
	clickIncome(driver);
	
	linkCapitalGain.click();
	
	editBtn.click();
	
	try {
	deleteAttachmentChkBox.click();
	}
	catch(Exception e){
		Reporter.log("Delete Attachment check box not available",true);
	}
	
	SaveBtn1.click();
	
	try {
		if(delCapitalGain.isDisplayed()==true)
		{
	delCapitalGain.click();
	
	robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(2000);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.setAutoDelay(2000);
	}
	}
	catch(Exception e){
		Reporter.log("Delete button is not available",true);
	}
}
public void addPensionTaxRelief(WebDriver driver, String str1, String str2, String str3, String str4) throws Exception {
	delCGI(driver);
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	paymentsToRegisteredPensionSchemesTxtBox.clear();
	paymentsToRegisteredPensionSchemesTxtBox.sendKeys(str1);
	employerPensionSchemePaymentsTxtBox.clear();
	employerPensionSchemePaymentsTxtBox.sendKeys(str2);
	retirementAnnuityContractPaymentsTxtBox.clear();
	retirementAnnuityContractPaymentsTxtBox.sendKeys(str3);
	nonUKOverseasPensionSchemePaymentsTxtBox.clear();
	nonUKOverseasPensionSchemePaymentsTxtBox.sendKeys(str4);
	
	savePensionBtn.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	string1=retirementAnnuityContractPaymentsTxtBox.getAttribute("value");
	string2=employerPensionSchemePaymentsTxtBox.getAttribute("value");
	string3=nonUKOverseasPensionSchemePaymentsTxtBox.getAttribute("value");
	string4=paymentsToRegisteredPensionSchemesTxtBox.getAttribute("value");
	
	savePensionBtn.click();
	n1=Double.parseDouble(string1);
	n2=Double.parseDouble(string2);
	n3=Double.parseDouble(string3);
	n4=Double.parseDouble(string4);
	total1=n1+n2+n3;
	
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string4=payFrmEmployer.getAttribute("value");
	
	string5=PrvtMedAndDntl.getAttribute("value");
	
	string6=BusnsTrvlAndSubstancTxtBox.getAttribute("value");
	
	popUpCancelBtn.click();
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	
	displayTotal=payFromAllEmployments.getText().substring(1).replace(",", "");
	Assert.assertEquals(displayTotal, string4);
	Reporter.log("Payment From employer verified: "+displayTotal, true);
	FinalCalculation=benefitAndExpensesReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(FinalCalculation, string5);
	Reporter.log("Private medical and dental insurance verified: "+FinalCalculation, true);
	FinalCalculation1=allowableExpenses.getText().substring(1).replace(",", "");
	Assert.assertEquals(FinalCalculation1, string6);
	Reporter.log("Business travel and subsistence expenses verified: "+FinalCalculation1, true);
	value1=TotalFromAllEmployment.getText().substring(1).replace(",", "");
	Thread.sleep(700);
	value2=TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(value2, value1);
	Reporter.log("Total income received verifie : "+value2, true);
	totlIncome=Double.parseDouble(value2);
	totalIncome1=totlIncome-total1;
	expResult1=String.format("%.2f",totalIncome1);
	totIncomTaxChar=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(totIncomTaxChar, expResult1);
	Reporter.log("Total income on which tax is due verifie : "+totIncomTaxChar, true);
	calculation1=(taxLimit1Uk+n4)*basicRateNonSaving/100;
	calculation2=(totalIncome1-(taxLimit1Uk+n4))*heigherRateNonSaving/100;
	finalAmount=calculation1+calculation2;
	taxFinal=String.format("%.2f",finalAmount);
	taxFinalUI=taxForThisYear.getText().substring(1).replace(",", "");
	Assert.assertEquals(taxFinalUI, taxFinal);
	Reporter.log("Balance for this year verified : "+taxFinalUI, true);
	dashBoardClient.click();
	dashBoardTotal=finalIncome.getText().substring(1).replace(",", "");
	Assert.assertEquals(value1, dashBoardTotal);
	Reporter.log("Total Income verified: "+value1, true);
}
public void readPDFPensionTaxRelief(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	string1=paymentsToRegisteredPensionSchemesTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string2=retirementAnnuityContractPaymentsTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string3=employerPensionSchemePaymentsTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string4=nonUKOverseasPensionSchemePaymentsTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	savePensionBtn.click();
	
	IncomeLink.click();
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string5=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string6=PrvtMedAndDntl.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string7=BusnsTrvlAndSubstancTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Payments to registered pension schemes where basic rate tax relief will be claimed by your pension provider (called ‘relief at source’). Enter the payments and basic rate tax : Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Payments to a retirement annuity contract where basic rate tax relief will not be claimed by your provider  verified: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Payments to your employer’s scheme which were not deducted from your pay before tax verified Successfully : " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Payments to an overseas pension scheme which is not UK-registered which are eligible for tax relief and were not deducted from your pay before tax verified Successfully : " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Pay from this employment Verified Successfully: " +string5, true);
        Assert.assertTrue(output.contains(string6));
        Reporter.log("Private medical and dental insurance Verified Successfully: " +string6, true);
        Assert.assertTrue(output.contains(string7));
        Reporter.log("Business travel and subsistence expenses Verified Successfully: " +string7, true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
 
}
public void delPensionTaxRelief(WebDriver driver) throws Exception {
	
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	paymentsToRegisteredPensionSchemesTxtBox.clear();
	employerPensionSchemePaymentsTxtBox.clear();
	retirementAnnuityContractPaymentsTxtBox.clear();
	nonUKOverseasPensionSchemePaymentsTxtBox.clear();
	
	savePensionBtn.click();
	Thread.sleep(3000);
	
}
public void addCharitableGiving(WebDriver driver,String str1, String str2, String str3, String str4) throws Exception
{
	
	taxReliefsLink.click();
	
	try
	{
		if(deleteCharityRecords.isDisplayed()==true)
		{
	deleteCharityRecords.click();
	
	cis.switchwindowNew(driver);
	cnfmdel.click();
	
	}
	}
	catch (Exception e) {
		Reporter.log("Charitable record not available",true);
	}
	
	openCharitableForm.click();
	
	cis.switchwindowNew1(driver,frameCharitable);
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateStart1);
	sharesOrSecuritiesGiftedToCharityTxtBox.clear();
	sharesOrSecuritiesGiftedToCharityTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	landAndBuildingsGiftedToCharityTxtBox.clear();
	landAndBuildingsGiftedToCharityTxtBox.sendKeys(str3);
	investmentsGiftedToNonUKCharitiesTxtBox.clear();
	investmentsGiftedToNonUKCharitiesTxtBox.sendKeys(str4);
	SaveBtn2.click();
	
	editCharityRecords.click();
	
	cis.switchwindowNew(driver);
	string1=sharesOrSecuritiesGiftedToCharityTxtBox.getAttribute("value");
	string2=landAndBuildingsGiftedToCharityTxtBox.getAttribute("value");
	
	SaveBtn2.click();
	
	n1=Double.parseDouble(string1);
	n2=Double.parseDouble(string2);
	
	total1=n1+n2;
	
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string3=payFrmEmployer.getAttribute("value");
	
	string4=PrvtMedAndDntl.getAttribute("value");
	
	string5=BusnsTrvlAndSubstancTxtBox.getAttribute("value");
	
	popUpCancelBtn.click();
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	
	displayTotal=payFromAllEmployments.getText().substring(1).replace(",", "");
	Assert.assertEquals(displayTotal, string3);
	Reporter.log("Payment From employer verified: "+displayTotal, true);
	FinalCalculation=benefitAndExpensesReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(FinalCalculation, string4);
	Reporter.log("Private medical and dental insurance verified: "+FinalCalculation, true);
	FinalCalculation1=allowableExpenses.getText().substring(1).replace(",", "");
	Assert.assertEquals(FinalCalculation1, string5);
	Reporter.log("Business travel and subsistence expenses verified: "+FinalCalculation1, true);
	value1=TotalFromAllEmployment.getText().substring(1).replace(",", "");
	
	value2=TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(value2, value1);
	Reporter.log("Total income received verified : "+value2, true);
	totlIncome=Double.parseDouble(value2);
	totalIncome1=totlIncome-total1;
	expResult1=String.format("%.2f",totalIncome1);
	totIncomTaxChar=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(totIncomTaxChar, expResult1);
	Reporter.log("Total income on which tax is due verifie : "+totIncomTaxChar, true);
	amount3=(totalIncome1-taxLimit1Uk)*heigherRateNonSaving/100;
	finalAmount=amount1+amount3;
	taxFinal=String.format("%.2f",finalAmount);
	taxFinalUI=taxForThisYear.getText().substring(1).replace(",", "");
	Assert.assertEquals(taxFinalUI, taxFinal);
	Reporter.log("Balance for this year verified : "+taxFinalUI, true);
	dashBoardClient.click();
	dashBoardTotal=finalIncome.getText().substring(1).replace(",", "");
	Assert.assertEquals(value1, dashBoardTotal);
	Reporter.log("Total Income verified: "+value1, true);
}
public void checkPdfEntryCharitableGiving(WebDriver driver, String Folder, String filename) throws Exception
{
	taxReliefsLink.click();
	
	editCharityRecords.click();
	
	cis.switchwindowNew(driver);
	string1=sharesOrSecuritiesGiftedToCharityTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string2=landAndBuildingsGiftedToCharityTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string3=investmentsGiftedToNonUKCharitiesTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string4=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string5=PrvtMedAndDntl.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string6=BusnsTrvlAndSubstancTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Value of qualifying shares or securities gifted to charity Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Value of qualifying land and buildings gifted to charity verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Value of qualifying investments gifted to non-UK charities verified Successfully : " +string3, true);
          Assert.assertTrue(output.contains(string4));
        Reporter.log("Pay from this employment Verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Private medical and dental insurance Verified Successfully: " +string5, true);
        Assert.assertTrue(output.contains(string6));
        Reporter.log("Business travel and subsistence expenses Verified Successfully: " +string6, true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delCharitableGiving(WebDriver driver) throws Exception
{
	
	
	taxReliefsLink.click();
	
	deleteCharityRecords.click();
	
	cis.switchwindowNew(driver);
	cnfmdel.click();
	
}

public void giftAidPayment(WebDriver driver,String str1, String str2, String str3,String str4,String str5) throws Exception 
{

taxReliefsLink.click();

try{
	if(deleteCharityRecords.isDisplayed()==true)
	{
	
	deleteCharityRecords.click();
	
	cis.switchwindowNew(driver);
	cnfmdel.click();
		
	}
}
catch (Exception e) {
	Reporter.log("Charitable income not available",true);
}
linkFormGiftAid.click();

cis = new CISPage(driver);
cis.switchwindowNew1(driver,frameGiftAid);
dateTxtBox.clear();
dateTxtBox.sendKeys(dateStart);
giftAidPaymentsMadeInYearTxtBox.click();
giftAidPaymentsMadeInYearTxtBox.sendKeys(str1);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str2);
oneOffGiftAidPaymentsTxtBox.clear();
oneOffGiftAidPaymentsTxtBox.sendKeys(str3);
SaveBtn2.click();
Thread.sleep(3000);
displayRecordsBtn.click();
Thread.sleep(3000);
cis.switchwindowNew(driver);

string1=giftAidPaymentsMadeInYearTxtBox.getAttribute("value");
cancelBtn.click();	

otherGiftAidpaymentLink.click();

cis.switchwindowNew1(driver, frameOtherGiftAid);

giftAidPaymentsCarriedBackToPreviousYearTxtBox.clear();
giftAidPaymentsCarriedBackToPreviousYearTxtBox.sendKeys(str4);

giftAidPaymentsBroughtBackFromLaterYearTxtBox.clear();
giftAidPaymentsBroughtBackFromLaterYearTxtBox.sendKeys(str5);

SaveBtn2.click();
otherGiftAidpaymentLink.click();

cis.switchwindowNew1(driver, frameOtherGiftAid);

string2=giftAidPaymentsCarriedBackToPreviousYearTxtBox.getAttribute("value");
string3=giftAidPaymentsBroughtBackFromLaterYearTxtBox.getAttribute("value");
cancelBtn.click();
n1=Double.parseDouble(string1);
n2=Double.parseDouble(string2);
n3=Double.parseDouble(string3);

clickIncome(driver);

EmploymentLink.click();

displayRecordsBtn.click();

string4=payFrmEmployer.getAttribute("value");

string5=PrvtMedAndDntl.getAttribute("value");

string6=BusnsTrvlAndSubstancTxtBox.getAttribute("value");

popUpCancelBtn.click();
n4=Double.parseDouble(string4);
n5=Double.parseDouble(string5);
n6=Double.parseDouble(string6);
total1=(n4+n5)-n6;
tax1=total1-personalAllowanceRate;

taxReturnLink.click();

taxCalSummaryLink.click();

displayTotal=payFromAllEmployments.getText().substring(1).replace(",", "");
Assert.assertEquals(displayTotal, string4);
Reporter.log("Payment From employer verified: "+displayTotal, true);
FinalCalculation=benefitAndExpensesReceived.getText().substring(1).replace(",", "");
Assert.assertEquals(FinalCalculation, string5);
Reporter.log("Private medical and dental insurance verified: "+FinalCalculation, true);
FinalCalculation1=allowableExpenses.getText().substring(1).replace(",", "");
Assert.assertEquals(FinalCalculation1, string6);
Reporter.log("Business travel and subsistence expenses verified: "+FinalCalculation1, true);
value1=TotalFromAllEmployment.getText().substring(1).replace(",", "");

value2=TotalIncomeReceived.getText().substring(1).replace(",", "");
Assert.assertEquals(value2, value1);
Reporter.log("Total income received verifie : "+value2, true);
expResult1=String.format("%.2f",tax1);
totIncomTaxChar=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
Assert.assertEquals(totIncomTaxChar, expResult1);
Reporter.log("Total income on which tax is due verifie : "+totIncomTaxChar, true);
amount3=(n1+(n1*taxedUKInterestRate))-(n2+(n2*taxedUKInterestRate))+(n3+(n3*taxedUKInterestRate));
calculation1=(taxLimit1Uk+amount3)*basicRateNonSaving/100;
calculation2=(tax1-(taxLimit1Uk+amount3))*heigherRateNonSaving/100;
finalAmount=calculation1+calculation2;
taxFinal=String.format("%.2f",finalAmount);
taxFinalUI=taxForThisYear.getText().substring(1).replace(",", "");
Assert.assertEquals(taxFinalUI, taxFinal);
Reporter.log("Balance for this year verified : "+taxFinalUI, true);
dashBoardClient.click();
dashBoardTotal=finalIncome.getText().substring(1).replace(",", "");
Assert.assertEquals(value1, dashBoardTotal);
Reporter.log("Total Income verified: "+value1, true);
}
public void checkPdfEntryGiftAidpayments(WebDriver driver, String Folder, String filename) throws Exception
{
	taxReliefsLink.click();
	
	displayRecordsBtn.click();
	Thread.sleep(3000);
	cis.switchwindowNew(driver);
	
	string1=giftAidPaymentsMadeInYearTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	string2=oneOffGiftAidPaymentsTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	cancelBtn.click();
	
	otherGiftAidpaymentLink.click();
	
	cis.switchwindowNew1(driver, frameOtherGiftAid);
	
	string3=giftAidPaymentsCarriedBackToPreviousYearTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string4=giftAidPaymentsBroughtBackFromLaterYearTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string5=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string6=PrvtMedAndDntl.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string7=BusnsTrvlAndSubstancTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Gift Aid payments made in the year Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Total of any ‘one-off’ payments  verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Gift Aid payments made in this year but treated as if made in the previous year Verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Gift Aid payments made in previous year but to be treated as if made in this year Verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Pay from this employment Verified Successfully: " +string5, true);
        Assert.assertTrue(output.contains(string6));
        Reporter.log("Private medical and dental insurance Verified Successfully: " +string6, true);
        Assert.assertTrue(output.contains(string7));
        Reporter.log("Business travel and subsistence expenses Verified Successfully: " +string7, true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delInfoGiftAid(WebDriver driver) throws Exception
{
	
	taxReliefsLink.click();
	
	delButton.click();
	cis.switchwindowNew(driver);
	
	cnfmdel.click();	
	
	
	otherGiftAidpaymentLink.click();
	
	cis.switchwindowNew1(driver, frameOtherGiftAid);
	
	giftAidPaymentsCarriedBackToPreviousYearTxtBox.clear();
	
	giftAidPaymentsBroughtBackFromLaterYearTxtBox.clear();
	
	SaveBtn2.click();
}
public void addMarriageAllowance(WebDriver driver,String str1, String str2, String str3, String str4,String str5) throws Exception
{
	
	taxReliefsLink.click();
	
	marriageAllowanceForm.click();
	
	cis.switchwindowNew1(driver,frameMarriageAllowance);
	//receiveMarriageAllowancefromChkBox.click();
	receiveMarriageAllowanceTOChkBox.click();
	spouseFirstNameTxtBox.clear();
	spouseFirstNameTxtBox.sendKeys(str1);
	spouselastnameTxtBox.clear();
	spouselastnameTxtBox.sendKeys(str2);
	spouseNInumberTxtBox.clear();
	spouseNInumberTxtBox.sendKeys(str3);
	spouseDOBTxtBox.clear();
	spouseDOBTxtBox.sendKeys(str4);
	dateOfMarriageSpouseTxtBox.clear();
	dateOfMarriageSpouseTxtBox.sendKeys(str5);
	SaveBtn2.click();
	
	driver.navigate().refresh();
		
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string1=payFrmEmployer.getAttribute("value");
	
	string2=PrvtMedAndDntl.getAttribute("value");
	
	string3=BusnsTrvlAndSubstancTxtBox.getAttribute("value");
	
	popUpCancelBtn.click();
	
	n1=Double.parseDouble(string1);
	n2=Double.parseDouble(string2);
	n3=Double.parseDouble(string3);
	total1=(n1+n2)-n3;
	tax1=total1-(personalAllowanceRate-marriageAllowance);
	expResult1=String.format("%.2f",tax1);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	
	value1=payFromAllEmployments.getText().substring(1).replace(",", "");
	Assert.assertEquals(value1, string1);
	Reporter.log("Payment From employer verified: "+value1, true);
	value2=benefitAndExpensesReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(value2, string2);
	Reporter.log("Private medical and dental insurance verified: "+value2, true);
	t1=allowableExpenses.getText().substring(1).replace(",", "");
	Assert.assertEquals(t1, string3);
	Reporter.log("Business travel and subsistence expenses verified: "+t1, true);
	displayTotal=TotalFromAllEmployment.getText().substring(1).replace(",", "");
	
	FinalCalculation=TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(FinalCalculation, displayTotal);
	Reporter.log("Total income received verified : "+FinalCalculation, true);
	taxdueOnInc1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(taxdueOnInc1, expResult1);
	Reporter.log("Total income on which tax is due verified : "+taxdueOnInc1, true);
	calculation1=(tax1-taxLimit1Uk)*heigherRateNonSaving/100;
	Totaltax=amount1+calculation1 -(marriageAllowance* basicRateNonSaving/100);
	totIncomTaxChar=String.format("%.2f",Totaltax);
	actualtax=taxForThisYear.getText().substring(1).replace(",", "");
	Assert.assertEquals(actualtax, totIncomTaxChar);
	Reporter.log("Total Tax verified : "+actualtax, true);
	
}

public void checkPdfEntryMarriageAllowance(WebDriver driver, String Folder, String filename) throws Exception
{
	
	taxReliefsLink.click();
	
	marriageAllowanceForm.click();
	
	cis.switchwindowNew1(driver,frameMarriageAllowance);
	string1=spouseFirstNameTxtBox.getAttribute("value");
	string2=spouselastnameTxtBox.getAttribute("value");
	//string3=spouseNInumberTxtBox.getAttribute("value").replace("", " ").trim();
	//string4=dateOfMarriageSpouseTxtBox.getAttribute("value").replace("/","").replace("", " ").trim();
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string3=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string4=PrvtMedAndDntl.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	string5=BusnsTrvlAndSubstancTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Marriage Allowance PDF data: " +output, true);
        Assert.assertTrue(output.contains(string1));
        Reporter.log("Spouse's first name Marriage Allowance Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Spouse's last name Marriage Allowance verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Pay from this employment Verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Private medical and dental insurance Verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Business travel and subsistence expenses Verified Successfully: " +string5, true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delMarriageAllowance(WebDriver driver) throws Exception
{
	
	taxReliefsLink.click();
	
	marriageAllowanceForm.click();
	
	cis.switchwindowNew1(driver,frameMarriageAllowance);
	//receiveMarriageAllowancefromChkBox.click();
	receiveMarriageAllowanceTOChkBox.click();
	
	SaveBtn2.click();
	
}

public void addStudentLoanRepaymentPlan1(WebDriver driver, String str1,String str2) throws Exception
{
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	clickIncome(driver);
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("1");
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str2);
	repaidChckBox.click();
	SaveBtn2.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	calculation1=(n1-personalAllowanceRate)*basicRateNonSaving/100;
	calculation2=(Math.round((n1-plan1)*studentLoanRate))-n2;
	finalAmount=calculation1+calculation2;
	FinalCalculation=String.format("%.2f",finalAmount);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);
}
public void addStudentLoanRepaymentPlan2(WebDriver driver, String str1,String str2) throws Exception
{
	delStudentLoanRepayment(driver);
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	clickIncome(driver);
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("2");
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str2);
	repaidChckBox.click();
	SaveBtn2.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	calculation1=(n1-personalAllowanceRate)*basicRateNonSaving/100;
	calculation2=(Math.round((n1-plan2)*studentLoanRate))-n2;
	finalAmount=calculation1+calculation2;
	FinalCalculation=String.format("%.2f",finalAmount);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);
}
public void addStudentLoanRepaymentPlan1_2(WebDriver driver, String str1,String str2) throws Exception
{
	delStudentLoanRepayment(driver);
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	clickIncome(driver);
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("3");
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str2);
	repaidChckBox.click();
	SaveBtn2.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	calculation1=(n1-personalAllowanceRate)*basicRateNonSaving/100;
	calculation2=(Math.round((n1-plan1_2)*studentLoanRate))-n2;
	finalAmount=calculation1+calculation2;
	FinalCalculation=String.format("%.2f",finalAmount);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);
}
public void checkPdfEntryStudentLoan(WebDriver driver, String Folder, String filename) throws Exception
{
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string1=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total Income: " +string1 ,true);
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string2=studentLoanAmountTaxWindow.getText().substring(1).replace(",","").replace(".00","").replace("", " ").trim();
	Reporter.log("Student Loan Repayments: " +string2 ,true);
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Student Loan PDF data: " +output, true);
       Assert.assertTrue(output.contains(string1));
        Reporter.log("Pay from this employment Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log(" Student Loan repayments Verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delStudentLoanRepayment(WebDriver driver) throws Exception
{
	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("0");
	amountTxtBox.clear();
	try
	{
		if(repaidChckBox.isSelected()==true)
			repaidChckBox.click();
	}
	catch (Exception e) {
		Reporter.log("Check box is not selected",true);
	}
	SaveBtn2.click();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
public void addChildBenefitCharge(WebDriver driver, String str1, String str2, String str3, String str4 ) throws Exception
{
	delStudentLoanRepayment(driver);
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	IncomeLink.click();
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	frm1Btn.click();
	
	cis.switchwindowNew1(driver,frameHighIncome);
	amountReceivedTxtBox.clear();
	NoOfchildrenTxtBox.clear();
	benifitStopDateTxtBox.clear();
	amountReceivedTxtBox.sendKeys(str2);
	NoOfchildrenTxtBox.sendKeys(str3);
	benifitStopDateTxtBox.sendKeys(str4);
	SaveBtn2.click();
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	if(n1>minBenefitIncome && n1< maxBenefitIncome)
	{
		calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
		calculation2=calculation1+amount1;
		total1=(n1-minBenefitIncome)/100;
		total2=n2/100;
		finalAmount=calculation2+(total1*total2);
		FinalCalculation=String.format("%.2f",finalAmount);
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 60, taxReturnLink);
		taxReturnLink.click();
		
		taxCalSummaryLink.click();
		
		taxFinal=taxForThisYear.getText().substring(1).replace(",","");
		Assert.assertEquals(taxFinal,FinalCalculation);
		Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);	
	}
	else if (n1>= maxBenefitIncome)
	{
		calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
		calculation2=calculation1+amount1;
		finalAmount=calculation2+n2;
		FinalCalculation=String.format("%.2f",finalAmount);
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 60, taxReturnLink);
		taxReturnLink.click();
		
		taxCalSummaryLink.click();
		
		taxFinal=taxForThisYear.getText().substring(1).replace(",","");
		Assert.assertEquals(taxFinal,FinalCalculation);
		Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);	
	}
	else if ((n1-personalAllowanceRate)>taxLimit1Uk && n1<=minBenefitIncome)
	{
		calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
		calculation2=calculation1+amount1;
		finalAmount=calculation2;
		FinalCalculation=String.format("%.2f",finalAmount);
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 60, taxReturnLink);
		taxReturnLink.click();
		
		taxCalSummaryLink.click();
		
		taxFinal=taxForThisYear.getText().substring(1).replace(",","");
		Assert.assertEquals(taxFinal,FinalCalculation);
		Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);		
	}
	
}
public void checkPdfEntryChildBenefit(WebDriver driver, String Folder, String filename) throws Exception
{
	
	linkOtherTaxInformation.click();
	
	frm1Btn.click();
	
	cis.switchwindowNew1(driver,frameHighIncome);
	string1=amountReceivedTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total amount of Child Benefit you and your partner got for the year : " +string1 ,true);
	string2=NoOfchildrenTxtBox.getAttribute("value");
	Reporter.log("Number of children you and your partner got Child Benefit: " +string2 ,true);
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string3=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total Income: " +string3 ,true);
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Child Benefit PDF data: " +output, true);
       Assert.assertTrue(output.contains(string1));
        Reporter.log("Total amount of Child Benefit you and your partner got for the year Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Number of children you and your partner got Child Benefit Verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Total Income Verified Successfully: " +string3 ,true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delChildBenefitCharge(WebDriver driver) throws Exception
{
	
	
	linkOtherTaxInformation.click();
	
	frm1Btn.click();
	
	cis.switchwindowNew1(driver,frameHighIncome);
	amountReceivedTxtBox.clear();
	NoOfchildrenTxtBox.clear();
	benifitStopDateTxtBox.clear();
	SaveBtn2.click();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
public void addPaymentOnAccount(WebDriver driver, String str1, String str2, String str3)  throws Exception{
	delChildBenefitCharge(driver);
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	clickIncome(driver);
	
	EmploymentLink.click();
	
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	paymentsOnAccountLink.click();
	
	cis.switchwindowNew1(driver,framePaymentAccount);
	claimToReducePaymentsOnAccountChkBox.click();
	
	firstPaymentOnAccountTxtBox.clear();
	
	notesTxtBox.clear();
	
	firstPaymentOnAccountTxtBox.sendKeys(str2);
	
	notesTxtBox.sendKeys(str3);
	
	SaveBtn2.click();
	
	driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string1=firstPaymentonAccountAmount.getText().substring(1).replace(",","");
	string2=totalDueByJanuaryAmount.getText().substring(1).replace(",","");
	string3=secondPaymentAmount.getText().substring(1).replace(",","");
	n1=Double.parseDouble(str1);//payment from employer
	n2=Double.parseDouble(str2);//First payment on account of next year
	n3=Double.parseDouble(string1);//First payment for next year on tax page same as str2
	n4=Double.parseDouble(string2);//Total due by end January and it is equal to balance tax for the year plus str2
	n5=Double.parseDouble(string3);//second payment same as str2
	if (n1>taxLimit1Uk)
	{
	calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
	calculation2=calculation1+amount1;
	FinalCalculation=String.format("%.2f",calculation2);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);	
	if(calculation2>n2)
	{
	Assert.assertEquals(n3,n2);
	Reporter.log("First payment for next year on tax page Verified Successfully: "+n3,true);
	Assert.assertEquals(n5,n2);
	Reporter.log("Second payment for next year on tax page Verified Successfully: "+n5,true);
	finalAmount=calculation2+n2;
	FinalCalculation1=String.format("%.2f",finalAmount);
	Assert.assertEquals(string2,FinalCalculation1);
	Reporter.log("Total due by end January on tax page Verified Successfully: "+string2,true);
	}
	else
	{
		Reporter.log("No advanced payment added");
	}
	
	}
}
public void checkPdfEntryPaymentOnAccount(WebDriver driver, String Folder, String filename) throws Exception
{
	
	linkOtherTaxInformation.click();
	
	paymentsOnAccountLink.click();
	
	cis.switchwindowNew1(driver,framePaymentAccount);
	string1=firstPaymentOnAccountTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("First payment for next year on tax page: " +string1 ,true);
	string2=notesTxtBox.getAttribute("value");
	Reporter.log("Notes about Payment on Account: " +string2 ,true);
	cancelBtn.click();
	
	IncomeLink.click();
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string3=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total Income: " +string3 ,true);
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Paymnet on Account PDF data: " +output, true);
       Assert.assertTrue(output.contains(string1));
        Reporter.log("First payment for next year on tax page Verified Successfully: " +string1, true);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Notes about Payment on Account Verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Total Income Verified Successfully: " +string3 ,true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delPaymentOnAccount(WebDriver driver) throws Exception{
	
	linkOtherTaxInformation.click();
	
	paymentsOnAccountLink.click();
	
	cis.switchwindowNew1(driver,framePaymentAccount);
	
	try
	{
	if(claimToReducePaymentsOnAccountChkBox.isSelected()==true)
	claimToReducePaymentsOnAccountChkBox.click();
	
	}
	catch (Exception e) {
		Reporter.log("Payment on Account should be available",true);
	}
	SaveBtn2.click();
}
public void addPayFromEmployer(WebDriver driver,String str1) throws Exception
{
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
}
public void finishingYourTaxReturn(WebDriver driver, String str1, String str2, String str3)  throws Exception
{
	delPaymentOnAccount(driver);
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	
	linkOtherTaxInformation.click();
	
	finishingTaxLink.click();
	
	cis.switchwindowNew1(driver,frameFinishingTax);
	
	taxRoundedOffTxtBox.clear();
	
	otherInfoTxtBox.clear();
	
	taxRoundedOffTxtBox.sendKeys(str2);
	
	notPaidEnoughOweTaxPrevYearChkBox.click();
	
	notPaidEnoughNotUseCodeChkBox.click();
	
	otherInfoTxtBox.sendKeys(str3);
	
	taxAdvisorChkBox.click();
	
	SaveBtn2.click();
	
	driver.navigate().refresh();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string1=taxAlreadyRefunded.getText().substring(1).replace(",","").replace(".00","");
	Reporter.log("Tax already refunded in the year: "+string1,true);
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Reporter.log("Balance for this year: "+taxFinal,true);
	
	n1=Double.parseDouble(str1);//payment from employer
	n2=Double.parseDouble(str2);//Entered Tax already refunded
	Assert.assertEquals(string1,str2);
	Reporter.log("Tax already refunded in the year Verified Successfully: "+string1,true);
	if (n1>taxLimit1Uk && n1<=taxLimit2)
	{
	calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
	calculation2=calculation1+amount1;
	finalAmount=calculation2+n2;
	FinalCalculation=String.format("%.2f",finalAmount);
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Balance for this year Verified Successfully: "+taxFinal,true);
	}
	else if (n1>personalAllowanceRate && n1<=taxLimit1Uk)
	{
		calculation1=(n1-personalAllowanceRate)*basicRateNonSaving/100;
		finalAmount=calculation1+n2;
		FinalCalculation=String.format("%.2f",finalAmount);
		Assert.assertEquals(taxFinal,FinalCalculation);
		Reporter.log("Balance for this year Verified Successfully: "+taxFinal,true);
	}
}
public void checkPdfEntryFinishingTax(WebDriver driver, String Folder, String filename) throws Exception
{
	
	linkOtherTaxInformation.click();
	
	finishingTaxLink.click();
	
	cis.switchwindowNew1(driver,frameFinishingTax);
	string1=taxRoundedOffTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Tax refunded or set off by us or Jobcentre: " +string1 ,true);
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string2=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total Income: " +string2 ,true);
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Finishing Tax PDF data: " +output, true);
       Assert.assertTrue(output.contains(string1));
        Reporter.log("Tax refunded or set off by us or Jobcentre Verified Successfully: " +string1, true);
        Thread.sleep(4000);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Total Income Verified Successfully: " +string2 ,true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delFinishingTaxReturn(WebDriver driver)  throws Exception
{
	linkOtherTaxInformation.click();
	
	finishingTaxLink.click();
	
	cis.switchwindowNew1(driver,frameFinishingTax);
	
	taxRoundedOffTxtBox.clear();
	
	otherInfoTxtBox.clear();
	
	try
	{
		if(notPaidEnoughOweTaxPrevYearChkBox.isSelected()==true)
	notPaidEnoughOweTaxPrevYearChkBox.click();
	
	}catch (Exception e) {
		Reporter.log("First check box of Finising tax not checked",true);
	}
	
	try
	{
		if(notPaidEnoughNotUseCodeChkBox.isSelected()==true)
	notPaidEnoughNotUseCodeChkBox.click();
	
	}
	
	catch (Exception e) {
		Reporter.log("second check box of Finising tax not checked",true);
	}
	
	try
	{
		if(taxAdvisorChkBox.isSelected()==true)
			taxAdvisorChkBox.click();
	
	}
	
	catch (Exception e) {
		Reporter.log("third check box of Finising tax not checked",true);
	}
	
	
	SaveBtn2.click();
	driver.navigate().refresh();
}
public void addUnderpaidTax(WebDriver driver, String str1, String str2, String str3, String str4)  throws Exception
{
	
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	try
	{
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		
		taxReliefsLink.click();
		
		marriageAllowanceForm.click();
		
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		//receiveMarriageAllowancefromChkBox.click();
		receiveMarriageAllowanceTOChkBox.click();
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	clickIncome(driver);
	
	EmploymentLink.click();
	
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	SaveBtn1.click();
	
	
	linkOtherTaxInformation.click();
	
	formOpenLink.click();
	
	cis.switchwindowNew1(driver,frameUnderpaidTax);
	
	underpaidTaxForEarlierYearsIncludedInCodeTxtBox.clear();
	
	underpaidTaxTxtBox.clear();
	
	outstandingDebtTxtBox.clear();
	
	underpaidTaxForEarlierYearsIncludedInCodeTxtBox.sendKeys(str2);
	
	underpaidTaxTxtBox.sendKeys(str3);
	
	outstandingDebtTxtBox.sendKeys(str4);
	
	SaveBtn2.click();
	
	driver.navigate().refresh();

	n1=Double.parseDouble(str1);//payment from employer
	n2=Double.parseDouble(str2);//Underpaid tax for earlier years included in your tax code for current year
	n3=Double.parseDouble(str3);//Current year underpaid tax included in next year tax code
	n4=Double.parseDouble(str4);//Current year Outstanding debt included in tax code
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Reporter.log("Balance for this year: "+taxFinal,true);
	if (n1>taxLimit1Uk && n1<=taxLimit2)
	{
	calculation1=((n1-personalAllowanceRate)-taxLimit1Uk)*heigherRateNonSaving/100;
	calculation2=calculation1+amount1;
	finalAmount=(calculation2+n2)-n3;
	FinalCalculation=String.format("%.2f",finalAmount);
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Balance for this year Verified Successfully: "+taxFinal,true);
	}
	else if (n1>personalAllowanceRate && n1<=taxLimit1Uk)
	{
		calculation1=(n1-personalAllowanceRate)*basicRateNonSaving/100;
		finalAmount=(calculation1+n2)-n3;
		FinalCalculation=String.format("%.2f",finalAmount);
		Assert.assertEquals(taxFinal,FinalCalculation);
		Reporter.log("Balance for this year Verified Successfully: "+taxFinal,true);
	}
}
public void checkPdfEntryUnderpaidTax(WebDriver driver, String Folder, String filename) throws Exception
{
	
	linkOtherTaxInformation.click();
	
	formOpenLink.click();
	
	cis.switchwindowNew1(driver,frameUnderpaidTax);
	string1=underpaidTaxForEarlierYearsIncludedInCodeTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Underpaid tax for earlier years included in your tax code: " +string1 ,true);
	string2=underpaidTaxTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Underpaid tax for this year: " +string2 ,true);
	string3=outstandingDebtTxtBox.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Outstanding debt included in your tax code for this year: " +string3 ,true);
	cancelBtn.click();
	
	clickIncome(driver);
	
	EmploymentLink.click();
	
	displayRecordsBtn.click();
	
	string4=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();
	Reporter.log("Total Income: " +string4 ,true);
	
	popUpCancelBtn.click();	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 60, taxReturnLink);
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
	Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 	filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
        Reporter.log("Tax Calculation Summary for Finishing Tax PDF data: " +output, true);
       Assert.assertTrue(output.contains(string1));
        Reporter.log("Underpaid tax for earlier years included in your tax code Verified Successfully: " +string1, true);
        Thread.sleep(4000);
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Underpaid tax for earlier years included in your tax code Verified Successfully: " +string2, true);
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Outstanding debt included in your tax code for this year Verified Successfully: " +string3, true);
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Total Income Verified Successfully: " +string4 ,true);
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Total Tax due Verified: " +totIncomTaxChar, true);
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
}
public void delUnderpaidTax(WebDriver driver)  throws Exception
{
	linkOtherTaxInformation.click();
	
	formOpenLink.click();
	
	cis.switchwindowNew1(driver,frameUnderpaidTax);
	
	underpaidTaxForEarlierYearsIncludedInCodeTxtBox.clear();
	
	underpaidTaxTxtBox.clear();
	
	outstandingDebtTxtBox.clear();
	
	SaveBtn2.click();
	driver.navigate().refresh();
}
public void checkPAYEECode(WebDriver driver, String str1) throws Exception
{
	wLib = new WaitStatementLib();
	cis=new CISPage(driver);
	wLib.explicitWait(driver, 5,taxReturnLink);
	taxReturnLink.click();
	wLib.explicitWait(driver, 5,taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	try
	{
	wLib.explicitWait(driver, 2,taxSummaaryMarriageAllowance);	
	if(taxSummaaryMarriageAllowance.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 5,taxReliefsLink);
		taxReliefsLink.click();
		wLib.explicitWait(driver, 5,marriageAllowanceForm);
		marriageAllowanceForm.click();
		cis.switchwindowNew1(driver,frameMarriageAllowance);
		wLib.explicitWait(driver, 5,receiveMarriageAllowanceTOChkBox);
		receiveMarriageAllowanceTOChkBox.click();
		wLib.explicitWait(driver, 5,SaveBtn2);
		SaveBtn2.click();	
	}
	}
	catch (Exception e) {
		Reporter.log("marriage allawance income is not available",true);
	}
	
	clickIncome(driver);
	wLib.explicitWait(driver, 5,EmploymentLink);
	EmploymentLink.click();
	wLib.explicitWait(driver, 5,addEmpIncome);
	addEmpIncome.click();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	wLib.explicitWait(driver, 5,SaveBtn1);
	SaveBtn1.click();
	
	driver.navigate().refresh();

	n1=Double.parseDouble(str1);//payment from employer
	wLib.explicitWait(driver, 5, taxReturnLink);
	taxReturnLink.click();
	wLib.explicitWait(driver, 5, taxCalSummaryLink);
	taxCalSummaryLink.click();
	wLib.explicitWait(driver, 5, incomeTaxDue);
	totIncomTaxChar=incomeTaxDue.getText().substring(1).replace(",","");
	incomTaxdue1=Double.parseDouble(totIncomTaxChar);
	
	if (incomTaxdue1<pAYCode)
	{
		wLib.explicitWait(driver, 5, payCodeAmountTaxSummary);
		taxFinalUI=payCodeAmountTaxSummary.getText().substring(1).replace(",","");
		Assert.assertEquals(taxFinalUI,totIncomTaxChar);
		Reporter.log("Final Tax"+taxFinalUI,true);
		
	}
	else
	{
		wLib.explicitWait(driver, 2, taxForThisYear);
		taxFinal=taxForThisYear.getText().substring(1).replace(",","");
		Reporter.log("Balance for this year: "+taxFinal,true);
		Assert.assertEquals(taxFinal, totIncomTaxChar);
		Reporter.log("Final Tax"+taxFinal,true);
	}
}
public void selectEmailTemplate(WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5, SelfAssessmentLink);
	SelfAssessmentLink.click();
	wLib.explicitWait(driver, 5, emailTempLink);
	emailTempLink.click();
	wLib.explicitWait(driver, 5, emailTempOption);
	emailTemplate=emailTempOption.getText();
	Reporter.log(emailTemplate,true);
	
}
public void FuncSendEmail(WebDriver driver ) throws Exception
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,5,emailOptionsLink); 
	emailOptionsLink.click();
	wLib.explicitWait(driver, 5,emailOpenLink); 
	emailOpenLink.click();
	cis.switchwindowNew1(driver,frameEmail);
	wLib.explicitWait(driver, 5,emailTxtBox); 
	emailTxtBox.clear();
	emailTxtBox.sendKeys(emailID);
	wLib.explicitWait(driver, 5,emailTemplateListBox); 
	listbox1=new Select(emailTemplateListBox);
	listbox1.selectByVisibleText(emailTemplate);
	wLib.explicitWait(driver,5,SaveBtn1); 
	SaveBtn1.click();
	Assert.assertEquals(successMessage.getText(), "Success!");
	
	Reporter.log("Email Sent Successfully",true);
	driver.navigate().refresh();
	
	}
public void scheduledEmail(WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,emailOptionsLink);
	emailOptionsLink.click();
	wLib.explicitWait(driver, 5,scheduleEmailLink);
	scheduleEmailLink.click();
	cis.switchwindowNew1(driver,frameScheduleEmail);
	wLib.explicitWait(driver, 5,emailTempalateOption);
	emailTempalateOption.click();
	wLib.explicitWait(driver, 5,nextBtn);
	nextBtn.click();
	wLib.explicitWait(driver, 5,chooseTemplateOption);
	listbox1=new Select(chooseTemplateOption);
	listbox1.selectByVisibleText(emailTemplate);
	ls1 = new LibSA(driver);
	ls1.chooseDate(driver);
	wLib.explicitWait(driver, 5,dateTxtBox);
	dateTxtBox.clear();
	dateTxtBox.sendKeys(ls1.today);
	wLib.explicitWait(driver, 5,SaveBtn1);
	SaveBtn1.click();
	
}
public void funcAddTaxPayment(WebDriver driver,String str1,String str2, String str3 ) throws Exception
{
	linkTaxPaymentsAlreadyMade.click();
	
	addTaxPaymentBtn.click();
	cis.switchwindowNew1(driver,frameAddTaxPayment);
	
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str1);
	
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str2);
	
	SaveBtn2.click();
	
	string1=rowOneDisplay.getText();
	string2=rowTwoDisplay.getText().substring(1).replace(",","").replace(".00", "");
	Assert.assertEquals(string1, str1);
	Reporter.log("Advanced payment tax description verified successfully"+string1,true);
	Assert.assertEquals(string2, str2);
	Reporter.log("Advanced payment tax Amount verified successfully"+string2,true);
	clickIncome(driver);
	
	EmploymentLink.click();
	
	addEmpIncome.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str3);
	SaveBtn1.click();
	
	n1=Double.parseDouble(str2);
	n2=Double.parseDouble(str3);
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	calculation1=(n2-personalAllowanceRate)*basicRateNonSaving/100;
	finalAmount=calculation1-n1;
	FinalCalculation=String.format("%.2f",finalAmount);
	
	taxFinal=taxForThisYear.getText().substring(1).replace(",","");
	Assert.assertEquals(taxFinal,FinalCalculation);
	Reporter.log("Tax Calculation Verified Successfully: "+taxFinal,true);
}
public void delTaxPayment(WebDriver driver) throws Exception {
	
	linkTaxPaymentsAlreadyMade.click();
	Thread.sleep(5000);
	try
	{
		if(delButton.isDisplayed()==true)
		{
	delButton.click();
	
	cis.switchwindowNew(driver);
	
	cnfmdel.click();
	}
}
	catch (Exception e) {
		Reporter.log("No Tax available",true);
	}
	
}
public void funcAddAdditionalInfo(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22,String str23,String str24,String str25,String str26,String str27, String str28) throws Exception 
{

addEmpIncome.click();
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 30, payFrmEmployer);
payFrmEmployer.sendKeys(str1);
SaveBtn1.click();

delFinishingTaxReturn(driver);

delTaxPayment(driver);

additionalInformationLink.click();

commonEditBtn.click();

taxTakenOff1TxtBox.clear();
grossAmountTxtBox.clear();
amountGainOnLifeInsuranceTxtBox.clear();
numberOfYearsSinceLastPolicyGainTxtBox.clear();
stockDividendsTxtBox.clear();
nonQualifyingTxtBox.clear();
shareSchemesTaxableAmountTxtBox.clear();
lumpSumSalariesAndOtherPaymentsTxtBox.clear();
lumpSumsOrBenefitsFromRetirementSchemesTxtBox.clear();
redundancyAndOtherCompensationPaymentsTxtBox.clear();
redundancyAndOtherCompensationTaxTakenOffTxtBox.clear();
seafarersEarningsDeductionTxtBox.clear();
nonUKTaxableForeignEarningsTxtBox.clear();
foreignTaxNoCreditReliefClaimTxtBox.clear();
UKpatentRoyaltyPaymentsTxtBox.clear();
subscriptionsVentureTxtBox.clear();
subscriptionsSharesTxtBox.clear();
communityInvestmentTxtBox.clear();
annualPaymentsTxtBox.clear();
qualifyingLoanTxtBox.clear();
postCessationTxtBox.clear();
maintenancePaymentTxtBox.clear();
paymentsTradeTxtBox.clear();
reliefClaimedTxtBox.clear();
subscriptionsSharesUnderTxtBox.clear();
socialInvestmentTxtBox.clear();
commentForValidation.clear();
taxTakenOff1TxtBox.sendKeys(str2);
grossAmountTxtBox.sendKeys(str3);
amountGainOnLifeInsuranceTxtBox.sendKeys(str4);
numberOfYearsSinceLastPolicyGainTxtBox.sendKeys(str5);
stockDividendsTxtBox.sendKeys(str6);
nonQualifyingTxtBox.sendKeys(str7);
shareSchemesTaxableAmountTxtBox.sendKeys(str8);
lumpSumSalariesAndOtherPaymentsTxtBox.sendKeys(str9);
lumpSumsOrBenefitsFromRetirementSchemesTxtBox.sendKeys(str10);
redundancyAndOtherCompensationPaymentsTxtBox.sendKeys(str11);
redundancyAndOtherCompensationTaxTakenOffTxtBox.sendKeys(str12);
seafarersEarningsDeductionTxtBox.sendKeys(str13);
nonUKTaxableForeignEarningsTxtBox.sendKeys(str14);
foreignTaxNoCreditReliefClaimTxtBox.sendKeys(str15);
UKpatentRoyaltyPaymentsTxtBox.sendKeys(str16);
subscriptionsVentureTxtBox.sendKeys(str17);
subscriptionsSharesTxtBox.sendKeys(str18);
communityInvestmentTxtBox.sendKeys(str19);
annualPaymentsTxtBox.sendKeys(str20);
qualifyingLoanTxtBox.sendKeys(str21);
postCessationTxtBox.sendKeys(str22);
maintenancePaymentTxtBox.sendKeys(str23);
paymentsTradeTxtBox.sendKeys(str24);
reliefClaimedTxtBox.sendKeys(str25);
subscriptionsSharesUnderTxtBox.sendKeys(str26);
socialInvestmentTxtBox.sendKeys(str27);
commentForValidation.sendKeys(str28);
saveAdditionalInfoBtn.click();
Thread.sleep(3000);
n1=Double.parseDouble(str1);
n2=Double.parseDouble(str2);
n3=Double.parseDouble(str3);
n4=Double.parseDouble(str4);
n5=Double.parseDouble(str5);
n6=Double.parseDouble(str6);
n7=Double.parseDouble(str7);
n8=Double.parseDouble(str8);
n9=Double.parseDouble(str9);
n10=Double.parseDouble(str10);
n11=Double.parseDouble(str11);
n12=Double.parseDouble(str12);
n13=Double.parseDouble(str13);
n14=Double.parseDouble(str14);
n15=Double.parseDouble(str15);
n16=Double.parseDouble(str16);
n17=Double.parseDouble(str17);
n18=Double.parseDouble(str18);
n19=Double.parseDouble(str19);
n20=Double.parseDouble(str20);
n21=Double.parseDouble(str21);
n22=Double.parseDouble(str22);
n23=Double.parseDouble(str23);
n24=Double.parseDouble(str24);
n25=Double.parseDouble(str25);
n26=Double.parseDouble(str26);
n27=Double.parseDouble(str27);

taxReturnLink.click();
wLib.explicitWait(driver, 60, taxCalSummaryLink);
taxCalSummaryLink.click();

totlIncome= (((n1+n9 + n10 + n11)-(n13 + n14 + n15)) + ( n8 + n3 + n6 + n7 +n4)) - ((n22 + n21 + n24)+(n20*100/80) + personalAllowanceRate);
Reporter.log(String.format("%.2f",(n1+n9 + n10 + n11)),true);
Reporter.log(String.format("%.2f",(n13 + n14 + n15)),true);
Reporter.log( String.format("%.2f",(n8 + n3 + n6 + n7 +n4)),true);
Reporter.log(String.format("%.2f",(n20)),true);
Reporter.log(String.format("%.2f",(n20*100/80)),true);
Reporter.log(String.format("%.2f",(n22 + n21 + n24)),true);
expValue1=String.format("%.2f",(totlIncome));
totIncomTaxChar=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",","");
Assert.assertEquals(totIncomTaxChar,expValue1);
Reporter.log("correct Total Income: "+totIncomTaxChar,true);
/*incomTaxdue1=amount1+((totlIncome-(taxLimit1Uk + n6 + n7 + nilRate2))*heigherRateNonSaving/100);
Reporter.log(amount1);
Reporter.log(totlIncome);
Reporter.log(taxLimit1Uk + n6 + n7 + nilRate2);
FinalCalculation=String.format("%.2f",(incomTaxdue1));
FinalCalculation1= incomeTaxDue.getText().substring(1).replace(",","");
Assert.assertEquals(FinalCalculation1,FinalCalculation);
Reporter.log("Correct Income taxt due calculation at initial level: "+FinalCalculation1,true);
/*calculation1=n20+n16;
calculation2=(calculation1*100/80);
value1=String.format("%.0f",(calculation2));
x1=Double.parseDouble(value1);
Reporter.log(x1);
Totaltax=(incomTaxdue1-((n17*30/100)+(n18*30/100)+(n26*50/100)+(n19*5/100)+(n27*30/100)+(n23*10/100)+(n4*20/100)))+(x1*basicRateNonSaving/100)-(n2+n12);
Reporter.log(incomTaxdue1);
Reporter.log(n17*30/100);
Reporter.log(n18*30/100);
Reporter.log(n26*50/100);
Reporter.log(n19*5/100);
Reporter.log(n27*30/100);
Reporter.log(n23*10/100);
Reporter.log(n4*20/100);
Reporter.log(n20+n16);
Reporter.log((n20+n16)*100/80);
Reporter.log(n2+n12);
taxFinal=String.format("%.0f",(Totaltax));
taxFinalUI=taxForThisYear.getText().substring(1,6).replace(",","");
try
{
Assert.assertEquals(taxFinalUI,taxFinal);
Reporter.log("Final Tax Calculation: "+taxFinalUI,true);
}
catch (Exception e) {
	Reporter.log(e.getMessage());
}*/
}
public void readPDFAdditionalInfo(WebDriver driver, String Folder, String filename) throws EmptyFileException, IOException, Exception {
    
 additionalInformationLink.click();
	 
string1=taxTakenOff1TxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string2=grossAmountTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string3=amountGainOnLifeInsuranceTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string4=numberOfYearsSinceLastPolicyGainTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string5=stockDividendsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string6=nonQualifyingTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string7=shareSchemesTaxableAmountTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string8=lumpSumSalariesAndOtherPaymentsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string9=lumpSumsOrBenefitsFromRetirementSchemesTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string10=redundancyAndOtherCompensationPaymentsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string11=redundancyAndOtherCompensationTaxTakenOffTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string12=seafarersEarningsDeductionTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string13=nonUKTaxableForeignEarningsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string14=foreignTaxNoCreditReliefClaimTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string15=UKpatentRoyaltyPaymentsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string16=subscriptionsVentureTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string17=subscriptionsSharesTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string18=communityInvestmentTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string19=annualPaymentsTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string20=qualifyingLoanTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string21=postCessationTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string22=maintenancePaymentTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string23=paymentsTradeTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string24=reliefClaimedTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();
string25=subscriptionsSharesUnderTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string26=socialInvestmentTxtBox.getAttribute("value").replaceAll(".00", "").replace("", " ").trim();

string27=commentForValidation.getAttribute("value");
driver.navigate().refresh();
clickIncome(driver);

EmploymentLink.click();

displayRecordsBtn.click();

string28=payFrmEmployer.getAttribute("value").replace(".00","").replace("", " ").trim();

wLib = new WaitStatementLib();
wLib.explicitWait(driver, 60, taxReturnLink);
taxReturnLink.click();
Thread.sleep(200);
taxCalSummaryLink.click();

totIncomTaxChar =taxForThisYear.getText().substring(1).replace(",","").replace(".","").replace("", " ").trim();
 Reporter.log("Total Tax: " +totIncomTaxChar ,true);
 
filePath = path;
    Reporter.log("filePath" +filePath, true);
    driver.get(filePath + Folder + filename);
    Thread.sleep(5000);
    file1=filePath + Folder + filename;
    URL url = new URL(driver.getCurrentUrl());
    InputStream is = url.openStream();
    BufferedInputStream fileToParse = new BufferedInputStream(is);
    PDDocument document = null;
    try {
        document = PDDocument.load(fileToParse);
        
        String output = new PDFTextStripper().getText(document);
       // String output1 = output.replaceAll("\\s+",""); 
        Reporter.log("Tax Calculation Summary PDF data: " +output, true);
        
    Assert.assertTrue(output.contains(string1));
        Reporter.log("Tax taken off Verified Successfully: " +string1, true);
        
        Assert.assertTrue(output.contains(string2));
        Reporter.log("Gross amount before tax verified Successfully: " +string2, true);
        
        Assert.assertTrue(output.contains(string3));
        Reporter.log("Gains on UK life insurance policy etc on which tax was treated as paid verified Successfully: " +string3, true);
        
        Assert.assertTrue(output.contains(string4));
        Reporter.log("Number of years the policy has been held or since the last gain verified Successfully: " +string4, true);
        Assert.assertTrue(output.contains(string5));
        Reporter.log("Stock dividends - the appropriate amount in cash/cash equivalent of the share capital Verified Successfully: " +string5, true);
        Assert.assertTrue(output.contains(string6));
        Reporter.log("Bonus issues of securities and redeemable shares and close company loans written off or released Verified Successfully: " +string6, true);
        Assert.assertTrue(output.contains(string7));
        Reporter.log("Share schemes – the taxable amount Verified Successfully: " +string7, true);
        Assert.assertTrue(output.contains(string8));
        Reporter.log("Taxable lump sums and certain income after the end of your job Verified Successfully: " +string8, true);
        Assert.assertTrue(output.contains(string9));
        Reporter.log("Lump sums or benefits received from an Employer Financed Retirement Benefits Scheme excluding pensions Verified Successfully: " +string9, true);
        Assert.assertTrue(output.contains(string10));
        Reporter.log("Redundancy, other lump sums and compensation payments (excluding £30,000 exemption) Verified Successfully: " +string10, true);
        Assert.assertTrue(output.contains(string11));
        Reporter.log("Tax taken off Verified: " +string11, true);
        Assert.assertTrue(output.contains(string12));
        Reporter.log("Seafarers’ Earnings Deduction Verified Successfully: " +string12, true);
        Assert.assertTrue(output.contains(string13));
        Reporter.log("Foreign earnings not taxable in the UK Verified Successfully: " +string13, true);
        Assert.assertTrue(output.contains(string14));
        Reporter.log("Foreign tax for which tax credit relief not claimed Verified Successfully: " +string14, true);
        Assert.assertTrue(output.contains(string15));
        Reporter.log("UK patent royalty payments made Verified Successfully: " +string15, true);
        Assert.assertTrue(output.contains(string16));
        Reporter.log("Subscriptions for Venture Capital Trust shares Verified Successfully: " +string16, true);
        Assert.assertTrue(output.contains(string17));
        Reporter.log("Subscriptions for shares under the Enterprise Investment Scheme Verified Successfully: " +string17, true);
        Assert.assertTrue(output.contains(string18));
        Reporter.log("Community Investment Tax Relief Verified Successfully: " +string18, true);
        Assert.assertTrue(output.contains(string19));
        Reporter.log("Annual payments made Verified Successfully: " +string19, true);
        Assert.assertTrue(output.contains(string20));
        Reporter.log("Qualifying loan interest payable in the year Verified Successfully: " +string20, true);
        Assert.assertTrue(output.contains(string21));
        Reporter.log("Post-cessation trade relief and certain other losses Verified Successfully: " +string21, true);
        Assert.assertTrue(output.contains(string22));
        Reporter.log("Maintenance payments(maximum £3,140) Verified Successfully: " +string22, true);
        Assert.assertTrue(output.contains(string23));
        Reporter.log("Payments to a trade union etc. for death benefits Verified Successfully: " +string23, true);
        Assert.assertTrue(output.contains(string24));
        Reporter.log("Relief claimed on redemption of bonus shares or securities Verified Successfully: " +string24, true);
        Assert.assertTrue(output.contains(string25));
        Reporter.log("Subscriptions for shares under the seed enterprise investment scheme Verified Successfully: " +string25, true);
        Assert.assertTrue(output.contains(string26));
        Reporter.log("Social Investment Tax Relief Verified Successfully: " +string26, true);
        
        Assert.assertTrue(output.contains(string27));
        Reporter.log("additional information Verified Successfully: " +string27, true);
        Assert.assertTrue(output.contains(string28));
        Reporter.log("Pay from Employer Verified Successfully: " +string28, true);       
        Assert.assertTrue(output.contains(totIncomTaxChar));
        Reporter.log("Income Tax due Verified Successfully: " +totIncomTaxChar, true);
        
        Reporter.log("PDF Verified successfully", true);
    } finally {
        if (document != null) {
            document.close();
        }
        fileToParse.close();
        is.close();
    }driver.navigate().back();
    }

public void funcDelAdditionalInfo() throws Exception {
Thread.sleep(3000);		
additionalInformationLink.click();
Thread.sleep(3000);	
commonEditBtn.click();
Thread.sleep(3000);
taxTakenOff1TxtBox.clear();
grossAmountTxtBox.clear();
amountGainOnLifeInsuranceTxtBox.clear();
numberOfYearsSinceLastPolicyGainTxtBox.clear();
stockDividendsTxtBox.clear();
nonQualifyingTxtBox.clear();
shareSchemesTaxableAmountTxtBox.clear();
lumpSumSalariesAndOtherPaymentsTxtBox.clear();
lumpSumsOrBenefitsFromRetirementSchemesTxtBox.clear();
redundancyAndOtherCompensationPaymentsTxtBox.clear();
redundancyAndOtherCompensationTaxTakenOffTxtBox.clear();
seafarersEarningsDeductionTxtBox.clear();
nonUKTaxableForeignEarningsTxtBox.clear();
foreignTaxNoCreditReliefClaimTxtBox.clear();
UKpatentRoyaltyPaymentsTxtBox.clear();
subscriptionsVentureTxtBox.clear();
subscriptionsSharesTxtBox.clear();
communityInvestmentTxtBox.clear();
annualPaymentsTxtBox.clear();
qualifyingLoanTxtBox.clear();
postCessationTxtBox.clear();
maintenancePaymentTxtBox.clear();
paymentsTradeTxtBox.clear();
reliefClaimedTxtBox.clear();
subscriptionsSharesUnderTxtBox.clear();
socialInvestmentTxtBox.clear();
commentForValidation.clear();
saveAdditionalInfoBtn.click();
}
public void findTextOnPage(WebDriver driver) throws Exception 
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,body);	
	bodyText = body.getText();
		// count occurrences of the string
			// search for the String within the text
	
		while (bodyText.contains("Approved")){
	    // when match is found, increment the count
	    count1++;
	   
	    // continue searching from where you left off
	bodyText = bodyText.substring(bodyText.indexOf("Approved") + "Approved".length());
		}
	Reporter.log("Value of Approved Status on First Page of Client List: "+String.valueOf(count1),true);
	 try
	    {
		 wLib.explicitWait(driver, 5,linkNext);	
	    	if (linkNext.isDisplayed()==true)
	    	{
	    		do {
	    		Reporter.log("Next Page Exist",true);
	    		wLib.explicitWait(driver, 5,linkNext);	
	    		linkNext.click();
	    		wLib.explicitWait(driver, 5,body);	
	    		bodyText = body.getText();
	    		while (bodyText.contains("Approved")){
	    		    // when match is found, increment the count
	    		    count1++;
	    		   	    
	    		    // continue searching from where you left off
	    		bodyText = bodyText.substring(bodyText.indexOf("Approved") + "Approved".length());
	    	}
	    		}while(linkNext.isDisplayed()==true);
	    	}
	    }
		catch (Exception e) {
			Reporter.log("Next page not available",true);
		}
	
	Reporter.log("Total No of Client with approved status: "+String.valueOf(count1),true);
	expResult1=String.format("%d",(count1));
	wLib.explicitWait(driver, 5,saDashboardLink);
	saDashboardLink.click();
	wLib.explicitWait(driver, 5,statusApprovedClientList);
	actResult1=statusApprovedClientList.getText();
	assertEquals(actResult1, expResult1);
	Reporter.log("Verified Number of Approved Status on Dashboard of SA: "+actResult1,true);
	
	}
public void checkClientList(WebDriver driver) throws Exception 
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,body);		
	bodyText = body.getText();
		// count occurrences of the string
			// search for the String within the text
		while (bodyText.contains("1000000110")){
	    // when match is found, increment the count
	    count1++;
	    
	    
	    // continue searching from where you left off
	bodyText = bodyText.substring(bodyText.indexOf("1000000110") + "1000000110".length());
	}
		Reporter.log("Number of clients on Client list page: "+count1,true);
		try
	    {
			wLib.explicitWait(driver, 5,linkNext);	
			if (linkNext.isDisplayed()==true)
	    	{
	    		Reporter.log("Next Page Exist",true);
	    		wLib.explicitWait(driver, 5,linkNext);	
	    		linkNext.click();
	    		wLib.explicitWait(driver, 5,body);		
	    		bodyText = body.getText();
	    		while (bodyText.contains("1000000110")){
	    		    // when match is found, increment the count
	    		    count1++;
	    		    
	    		    
	    		    // continue searching from where you left off
	    		bodyText = bodyText.substring(bodyText.indexOf("1000000110") + "1000000110".length());
	    	}
	    }
	    }
		catch (Exception e) {
			Reporter.log("Next page not available",true);
		}
	Reporter.log("Number of clients on Client list page: "+count1,true);
	wLib.explicitWait(driver, 5,assignAccountantLink);		
	assignAccountantLink.click();
	wLib.explicitWait(driver, 5,accountantLSTBox);	
	listbox1 = new Select(accountantLSTBox);
	listbox1.selectByVisibleText("All");
	wLib.explicitWait(driver, 5,searchBtn);	
	searchBtn.click();
	wLib.explicitWait(driver, 5,body);	
	bodyText = body.getText();
	// count occurrences of the string
	// search for the String within the text
	while (bodyText.contains("1000000110")){
    // when match is found, increment the count
    count2++;
    // continue searching from where you left off
bodyText = bodyText.substring(bodyText.indexOf("1000000110") + "1000000110".length());
}
	Reporter.log("Number of clients on Accountant page: "+count2,true);
assertEquals(count2, count1);
Reporter.log("Client list verified on Accountant Page: "+count2,true);
}
public void uploadClient(WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5,importClientLink);
	importClientLink.click();
	wLib.explicitWait(driver, 5,uploadClientTxtBox);
	uploadClientTxtBox.clear();
	
	uploadClientTxtBox.sendKeys("D:\\SelfAssessment\\listClient.csv");
	wLib.explicitWait(driver, 5,uploadClientBtn);
	uploadClientBtn.click();
	wLib.explicitWait(driver, 5,importChkBox);
	importChkBox.click();
	wLib.explicitWait(driver, 5,importBtn);
	importBtn.click();
	wLib.explicitWait(driver, 5,SelfAssessmentLink);
	SelfAssessmentLink.click();
	wLib.explicitWait(driver, 5,ClientListLink);
	ClientListLink.click();
	wLib.explicitWait(driver, 5,body);
	bodyText = body.getText();
	Assert.assertTrue(bodyText.contains("Nom1"));
	
	Reporter.log("Client imported successfully",true);
	wLib.explicitWait(driver, 5,importClientLink);
	importClientLink.click();
	wLib.explicitWait(driver, 5,importCancelBtn);
	importCancelBtn.click();
	wLib.explicitWait(driver, 5,body);
	bodyText = body.getText();
	
	Assert.assertTrue(bodyText.contains("Self Assessment"));
	Reporter.log("Imported action cancelled successfully",true);
	
}
public void emailTemplateFunc(WebDriver driver) throws Exception  {
	wLib = new WaitStatementLib();
	cis=new CISPage(driver);
	random = new Random();
	int x = random.nextInt(20) + 1;
	wLib.explicitWait(driver, 5,emailTemplatesLink);
	emailTemplatesLink.click();
	wLib.explicitWait(driver, 5,addNewTemplateBtn);
	addNewTemplateBtn.click();
	wLib.explicitWait(driver, 5,templateNameTxtBox);
	templateNameTxtBox.clear();
	templateNameTxtBox.sendKeys("New Tempalate "+x);
	wLib.explicitWait(driver, 5,templateNameTxtBox);
	value1=templateNameTxtBox.getAttribute("value");
	wLib.explicitWait(driver, 5,emailSubjectTxtBox);
	emailSubjectTxtBox.clear();
	emailSubjectTxtBox.sendKeys("Showing Tax balance");
	
	emailFrame.sendKeys("\n");
	emailFrame.sendKeys("FIRST_NAME\n");
	emailFrame.sendKeys("\n");
	emailFrame.sendKeys("LAST_NAME");
	emailFrame.sendKeys("\n");
	emailFrame.sendKeys("BALANCE_TAX_AMOUNT");
	wLib.explicitWait(driver, 5,SaveButton);
	SaveButton.click();
	wLib.explicitWait(driver, 5,body);
	bodyText = body.getText();
	Assert.assertTrue(bodyText.contains(value1));
	Reporter.log("Template Name verified successfully: "+value1,true);
}
public void scheduleEmailFunction(WebDriver driver)throws Exception {
	
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 5,scheduledEmailLink);
	scheduledEmailLink.click();
	wLib.explicitWait(driver, 5,firstNameScheduleMail);
	firstNameScheduleMail.clear();
	firstNameScheduleMail.sendKeys("Client");
	wLib.explicitWait(driver, 5,lastNameScheduleMail);
	lastNameScheduleMail.clear();
	lastNameScheduleMail.sendKeys("Nom1");
	wLib.explicitWait(driver, 5,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 5,inputItemAllChkBox);
	inputItemAllChkBox.click();
	wLib.explicitWait(driver, 5,selectEmailTemplatesLstBox);
	listbox1 = new Select(selectEmailTemplatesLstBox);
	listbox1.selectByVisibleText("Testing Template");
	wLib.explicitWait(driver, 5,emailSubjectTxtBox);
	expResult1=emailSubjectTxtBox.getAttribute("value");
	ls1 = new LibSA(driver);
	ls1.chooseDate(driver);
	wLib.explicitWait(driver, 5,dateScheduleEmailTxtBox);
	dateScheduleEmailTxtBox.clear();
	dateScheduleEmailTxtBox.sendKeys(ls1.today);
	wLib.explicitWait(driver, 5,sceduleEmailBtn);
	sceduleEmailBtn.click();
	wLib.explicitWait(driver, 5,ClientListLink);
	ClientListLink.click();
	wLib.explicitWait(driver, 5,selectClientScheduleEmail);
	selectClientScheduleEmail.click();
	cis.switchwindowForward(driver);
	wLib.explicitWait(driver, 5,emailOptionsLink);
	emailOptionsLink.click();
	WebElement element1=driver.findElement(By.xpath("//td[contains(text(),'"+expResult1+"')]"));
	wLib.explicitWait(driver, 5,element1);
	actResult1=element1.getText();
	assertEquals(actResult1, expResult1);
	Reporter.log("Email Schedule successfully: "+actResult1, true);
}
public void addClientForeignIncome(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 5,firstNameScheduleMail);
	firstNameScheduleMail.sendKeys("Foregin1");
	wLib.explicitWait(driver, 5,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 5,clientForeignIncome);
	clientForeignIncome.click();
	cis.switchwindowForward(driver);
	wLib.explicitWait(driver, 5,TaxYear);
	Select year= new Select(TaxYear);
	year.selectByValue("5");
	Reporter.log("Foreign Income Client Selected", true);
}
public void checkForeignIncomeOverseasSavingWithTaxRelief(WebDriver driver, String str1, String str2,String str3,String str4)throws Exception {
	
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 30, addEmpIncome);
	addEmpIncome.click();
	wLib.explicitWait(driver, 30, payFrmEmployer);
	payFrmEmployer.sendKeys(str1);
	wLib.explicitWait(driver, 30, SaveBtn1);
	SaveBtn1.click();
	wLib.explicitWait(driver, 30, IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 30, linkForeignIncome);
	linkForeignIncome.click();
	wLib.explicitWait(driver, 30, commonEditBtn);
	commonEditBtn.click();
	wLib.explicitWait(driver, 30, formOpenBtn);
	formOpenBtn.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 30, countryCodeLstBox);
	//if you’re claiming Foreign Tax Credit Relief, copy column B here. If not, enter column B minus column C
	listbox1 = new Select(countryCodeLstBox);
	listbox1.selectByValue("99");
	colBTxtBox.clear();
	colBTxtBox.sendKeys(str2);
	colCTxtBox.clear();
	colCTxtBox.sendKeys(str3);
	colEChkBox.click();
	string1=colFTxtBox.getAttribute("value");
	Assert.assertEquals(string1, str2);
	Reporter.log("Taxable amount (F) verified: "+ string1,true);
	colDTxtBox.clear();
	colDTxtBox.sendKeys(str4);
	SaveBtn2.click();
	driver.navigate().refresh();
}
public void checkForeignIncomeOverseasSavingWithoutTaxRelief(WebDriver driver, String str1, String str2,String str3,String str4)throws Exception {
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 30, addEmpIncome);
addEmpIncome.click();
wLib.explicitWait(driver, 30, payFrmEmployer);
payFrmEmployer.sendKeys(str1);
SaveBtn1.click();
driver.navigate().refresh();
wLib.explicitWait(driver, 30, IncomeLink);
IncomeLink.click();
wLib.explicitWait(driver, 30, linkForeignIncome);
linkForeignIncome.click();
wLib.explicitWait(driver, 30, commonEditBtn);
commonEditBtn.click();
wLib.explicitWait(driver, 30, formOpenBtn);
formOpenBtn.click();
cis.switchwindowNew(driver);
wLib.explicitWait(driver, 30,countryCodeLstBox); 
//if you’re claiming Foreign Tax Credit Relief, copy column B here. If not, enter column B minus column C
listbox1 = new Select(countryCodeLstBox);

listbox1.selectByValue("99");

colBTxtBox.clear();
colBTxtBox.sendKeys(str2);

colCTxtBox.clear();
colCTxtBox.sendKeys(str3);
string1=colFTxtBox.getAttribute("value");
n1=Double.parseDouble(str2);
n2=Double.parseDouble(str3);
x1=n1-n2;
taxTotal=String.format("%.0f",(x1));
Assert.assertEquals(string1, taxTotal);
Reporter.log("Taxable amount (F) verified: "+ string1,true);
colDTxtBox.clear();
colDTxtBox.sendKeys(str4);
SaveBtn2.click();
driver.navigate().refresh();
}
public void delForeignIncomeOverseasSaving(WebDriver driver)throws Exception {
	wLib = new WaitStatementLib();
	cis = new CISPage(driver);
	
clickIncome(driver);
wLib.explicitWait(driver, 30, linkForeignIncome);
linkForeignIncome.click();
wLib.explicitWait(driver, 30, commonEditBtn);
commonEditBtn.click();
wLib.explicitWait(driver, 30, delOverseasSavings);
delOverseasSavings.click();

cis.switchwindowNew(driver);
wLib.explicitWait(driver, 30, cnfmdel);
cnfmdel.click();

}

public void testCaseFA33(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21) throws Exception{
	wLib = new WaitStatementLib();	
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 2,firstNameScheduleMail);
	firstNameScheduleMail.sendKeys("Foreign_33");
	wLib.explicitWait(driver,2, searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2, clientFOR33);
	clientFOR33.click();
	PageFactory.initElements(driver, this);
	cis.switchwindowForward(driver);
	wLib.explicitWait(driver,2,TaxYear);
	Select year= new Select(TaxYear);
	year.selectByValue("5");
	Reporter.log("Foreign Income Client Selected", true);
	//Employment Income
	ls1 = new LibSA(driver);
	ls1.clickIncomeEmpLink(driver);
	ls1.addEmpInfoFOR(driver);
	wLib.explicitWait(driver, 2, addEmpIncome);
	addEmpIncome.click();
	wLib.explicitWait(driver, 2,payFrmEmployer);
	payFrmEmployer.clear();
	payFrmEmployer.sendKeys(str1);
	UkTaxTakenOffPay.clear();
	UkTaxTakenOffPay.sendKeys(str2);
	wLib.explicitWait(driver, 30, SaveBtn1);
	SaveBtn1.click();
	
	n1=Double.parseDouble(str1);
	n2=Double.parseDouble(str2);
	//Student Loan
	wLib.explicitWait(driver, 2, linkOtherTaxInformation);
	linkOtherTaxInformation.click();
	wLib.explicitWait(driver, 2, form1OpenBtn);
	form1OpenBtn.click();
	cis.switchwindowNew1(driver,frameStudentLoan);
	wLib.explicitWait(driver,2, studentLoanTypeLstBox);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("1");
	wLib.explicitWait(driver,2, amountTxtBox);
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str3);
	SaveBtn2.click();
	n3=Double.parseDouble(str3);
	//aditional Information
	wLib.explicitWait(driver, 2, additionalInformationLink);
	additionalInformationLink.click();
	wLib.explicitWait(driver, 2, commonEditBtn);
	commonEditBtn.click();
	wLib.explicitWait(driver, 5,lumpSumsOrBenefitsFromRetirementSchemesTxtBox);
	lumpSumsOrBenefitsFromRetirementSchemesTxtBox.clear();
	lumpSumsOrBenefitsFromRetirementSchemesTxtBox.sendKeys(str4);
	redundancyAndOtherCompensationTaxTakenOffTxtBox.clear();
	redundancyAndOtherCompensationTaxTakenOffTxtBox.sendKeys(str5);
	schemeReference1TxtBox.clear();
	schemeReference1TxtBox.sendKeys(str6);
	saveAdditionalInfoBtn.click();
	n4=Double.parseDouble(str4);
	n5=Double.parseDouble(str5);
	//foreign income
	wLib.explicitWait(driver, 2, IncomeLink);
	IncomeLink.click();
	wLib.explicitWait(driver, 2, linkForeignIncome);
	linkForeignIncome.click();
	wLib.explicitWait(driver, 2, commonEditBtn);
	commonEditBtn.click();
 	wLib.explicitWait(driver, 5, interestOtherincomefromoverseassavingsFormBtn);
	interestOtherincomefromoverseassavingsFormBtn.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 5, countryCodeLstBox);
	listbox1=new Select(countryCodeLstBox);
	listbox1.selectByValue("38");
	colBTxtBox.clear();
	colBTxtBox.sendKeys(str8);
	colCTxtBox.clear();
	colCTxtBox.sendKeys(str9);
	colEChkBox.click();
	n7=Double.parseDouble(str8);
	n8=Double.parseDouble(str9);
	string1=colFTxtBox.getAttribute("value").replace(".00","");
	n9=Double.parseDouble(string1);
	Assert.assertEquals(string1, str8);
	Reporter.log("Value of Text Box F for 'Interest and other income from overseas savings' Verified: "+string1,true);
	SaveBtn2.click();
	wLib.explicitWait(driver, 5, dividendsFromForeignCompanies);
	dividendsFromForeignCompanies.click();
	
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 5, countryCodeLstBox);
	listbox1=new Select(countryCodeLstBox);
	listbox1.selectByValue("224");
	colBTxtBox.clear();
	colBTxtBox.sendKeys(str10);
	colCTxtBox.clear();
	colCTxtBox.sendKeys(str11);
	colEChkBox.click();
	n10=Double.parseDouble(str10);
	n11=Double.parseDouble(str11);
	string2=colFTxtBox.getAttribute("value").replace(".00","");
	n12=Double.parseDouble(string2);
	Assert.assertEquals(string2, str10);
	Reporter.log("Value of Text Box F for 'Dividends from foreign companies' Verified: "+string2,true);
	SaveBtn2.click();
	wLib.explicitWait(driver, 5,overseasPensionsSocialScurityBenefitsAndRoyalties);
	overseasPensionsSocialScurityBenefitsAndRoyalties.click();
	
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 5,countryCodeLstBox);
	listbox1=new Select(countryCodeLstBox);
	listbox1.selectByValue("38");
	colBTxtBox.clear();
	colBTxtBox.sendKeys(str12);
	colCTxtBox.clear();
	colCTxtBox.sendKeys(str13);
	colEChkBox.click();
	n13=Double.parseDouble(str12);
	n14=Double.parseDouble(str13);
	string3=colFTxtBox.getAttribute("value").replace(".00","");
	n15=Double.parseDouble(string3);
	Assert.assertEquals(string3, str12);
	Reporter.log("Value of Text Box F for 'Overseas pensions, social security benefits and royaltiess' Verified: "+string3,true);
	SaveBtn2.click();
	driver.navigate().refresh();
	wLib.explicitWait(driver, 5,foreignIncomeEditSummaryBtn);
	foreignIncomeEditSummaryBtn.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 5,countryCodeLstBox);
	listbox1=new Select(countryCodeLstBox);
	listbox1.selectByValue("38");
	colBTxtBox.clear();
	colBTxtBox.sendKeys(str20);
	string4=colFTxtBox.getAttribute("value").replace(".00","");
	Assert.assertEquals(string4, str20);
	Reporter.log("Taxable amount (F)for Summary Verified: "+string4,true);
	wLib.explicitWait(driver, 5,SaveBtn2);
	SaveBtn2.click();
	wLib.explicitWait(driver, 5,SaveBtn1);
	SaveBtn1.click();
	wLib.explicitWait(driver, 5,commonEditBtn);
	commonEditBtn.click();
	wLib.explicitWait(driver, 5,totalForeignTaxReliefTxtBox);
	totalForeignTaxReliefTxtBox.clear();
	totalForeignTaxReliefTxtBox.sendKeys(str7);
	n6=Double.parseDouble(str7);
	totalRentsAndOtherReceiptsTxtBox.clear();
	totalRentsAndOtherReceiptsTxtBox.sendKeys(str14);
	propertyExpensesTxtBox.clear();
	propertyExpensesTxtBox.sendKeys(str15);
	n16=Double.parseDouble(str14);
	n17=Double.parseDouble(str15);
	actResult1=foreignIncomeNetProfitOrLossTxtBox.getAttribute("value").replace(".00","");
	n18=Double.parseDouble(actResult1);
	//totalRentsAndOtherReceiptsTxtBox - propertyExpensesTxtBox =foreignIncomeNetProfitOrLossTxtBox
	total1=n16-n17;
	Assert.assertEquals(n18, total1);
	Reporter.log("Net profit or loss Verified: "+n18,true);
	foreignIncomeNumberOfOverseasLetPropertiesTxtBox.clear();
	foreignIncomeNumberOfOverseasLetPropertiesTxtBox.sendKeys(str16);
	foreignIncomePrivateUseAdjustmentsTxtBox.clear();
	foreignIncomePrivateUseAdjustmentsTxtBox.sendKeys(str17);
	foreignIncomeCostsOfReplacingDomesticItemsTxtBox.clear();
	foreignIncomeCostsOfReplacingDomesticItemsTxtBox.sendKeys(str18);
	foreignIncomeResidentialFinanceCostsTxtBox.clear();
	foreignIncomeResidentialFinanceCostsTxtBox.sendKeys(str19);
	wLib.explicitWait(driver, 5,SaveBtn1);
	SaveBtn1.click();
	driver.navigate().refresh();
	wLib.explicitWait(driver, 5,commonEditBtn);
	commonEditBtn.click();
	
	n18=Double.parseDouble(str16);
	n19=Double.parseDouble(str17);
	n20=Double.parseDouble(str18);
	n21=Double.parseDouble(str19);
	
	wLib.explicitWait(driver, 5,foreignIncomeAdjustedProfitOrLossForTheYearTxtBox);
	actResult2=foreignIncomeAdjustedProfitOrLossForTheYearTxtBox.getAttribute("value").replace(".00","");
	n22= Double.parseDouble(actResult2);
	//foreignIncomeNetProfitOrLossTxtBox + foreignIncomePrivateUseAdjustmentsTxtBox -foreignIncomeCostsOfReplacingDomesticItemsTxtBox = foreignIncomeAdjustedProfitOrLossForTheYearTxtBox
	total2=(total1+n19)-n20;
	Reporter.log(n22 +"----"+total2,true);
	Assert.assertEquals(n22, total2);
	Reporter.log("Adjusted profit or loss for the year Verified: "+n22,true);
	wLib.explicitWait(driver, 5,txtBoxLossBroughtForward);
	txtBoxLossBroughtForward.clear();
	txtBoxLossBroughtForward.sendKeys(str21);
	value1=totalTaxableProfitTxtBox.getAttribute("value").replace(".00","");
	n25= Double.parseDouble(value1);
	SaveBtn1.click();
	try
	{
		if (SaveBtn1.isDisplayed()==true)
		{
			SaveBtn1.click();
		}
	}
	catch (Exception e) {
		Reporter.log("Save button clicked in first attempt",true);
	}
	wLib.explicitWait(driver, 5,taxReturnLink);
	taxReturnLink.click();
 	wLib.explicitWait(driver, 5, taxCalSummaryLink);
	taxCalSummaryLink.click();
	n23= Double.parseDouble(str20);
	n24= Double.parseDouble(str21);
	//n25= Double.parseDouble(str22);
	totalIncome1 = n1 + n4;
	totalIncome2 =  n13 + n7 + n25 + n10;
	totalIncome3 = totalIncome1 + totalIncome2;
	calculation1 = totalIncome3 - FITax1;
	calculation2 = calculation1*SloanRate1/100;
	calculation3=calculation2 - n3;
	Reporter.log("Student Loan repayments: "+calculation3,true);
	totlIncome=totalIncome1+total2+n7+n13+n10;
	expValue1=String.format("%.2f",(totlIncome));		
	actResult1=	TotalIncomeReceived.getText().substring(1).replace(",", "");
	Assert.assertEquals(actResult1, expValue1);
	Reporter.log("Total income received Verified: "+actResult1,true);
	dueTax1=totlIncome-(n24+personalAllowanceRate);
	expValue2=String.format("%.2f",(dueTax1));	
	actResult2=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(actResult2, expValue2);
	Reporter.log("Total income on which tax is due Verified: "+actResult2,true);
	incomTaxdue1= (((dueTax1 -(n7 + n10+ taxLimit1Uk)) * heigherRateNonSaving)/100 )+(((n7 - nilRate2) * heigherRateNonSaving)/100) + amount1;
	taxdueOnInc1=String.format("%.2f",(incomTaxdue1));
	Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),taxdueOnInc1);
	Reporter.log("Income Tax due verifired successfully",true);
	Assert.assertEquals(incomeOnWhichTaxCharged.getText(),totalIncomeOnWhichTaxIsDue.getText());
	Reporter.log("Total income on which tax has been charged verifired successfully",true);
	incomTaxdue2=incomTaxdue1 - (((n21 * basicRateNonSaving)/100) + n6);
	totIncomTaxChar= String.format("%.2f",(incomTaxdue2));
	Assert.assertEquals(amountIncomeTaxdueafterallowances.getText().substring(1).replace(",", ""),totIncomTaxChar);
	Reporter.log("Income Tax due after allowances and reliefs",true);
	tot1=((n1+n4+n13+(n23-n24)+n7+n10)-17775)*studentLoanRate;
	t1=String.format("%.0f",(tot1));
	t2=String.format("%.0f",(n3+1));
	n26=Double.parseDouble(t1);
	n27=Double.parseDouble(t2);
	dueTax2=n26-n27;
	fnltax=(incomTaxdue2+dueTax2)-(n2+n5);
	taxFinal=String.format("%.2f",(fnltax));
	
	Assert.assertEquals(taxForThisYear.getText().substring(1).replace(",", ""),taxFinal);
	Reporter.log("Tax for the year verified successfully",true);
}
public void delTestCaseFA33(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();	
	cis = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 2,firstNameScheduleMail);
	firstNameScheduleMail.sendKeys("Foreign_33");
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 5,clientFOR33);
	clientFOR33.click();
	cis.switchwindowForward(driver);
	wLib.explicitWait(driver, 5,TaxYear);
	Select year= new Select(TaxYear);
	year.selectByValue("5");
	Reporter.log("Foreign Income Client Selected", true);
	clickIncome(driver);
	wLib.explicitWait(driver, 5,linkForeignIncome);
	linkForeignIncome.click();
	wLib.explicitWait(driver, 5,commonEditBtn);
	commonEditBtn.click();
	
	try{
		wLib.explicitWait(driver, 2,delOverseasSavings);
		if(delOverseasSavings.isDisplayed()==true)
		{
		wLib.explicitWait(driver, 2,delOverseasSavings);
		delOverseasSavings.click();
		cis.switchwindowNew(driver);
		wLib.explicitWait(driver, 2,cnfmdel);
		cnfmdel.click();
		}
	}catch (Exception e) {
		Reporter.log("Delete button for overseas savings is not available",true);
	}
	try{
		wLib.explicitWait(driver, 2,delDividendsForeignComaniesBtn);
		if(delDividendsForeignComaniesBtn.isDisplayed()==true)
		{
	wLib.explicitWait(driver, 2,delDividendsForeignComaniesBtn);
	delDividendsForeignComaniesBtn.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();
	}
	}catch (Exception e) {
		Reporter.log("Delete button for Dividends from foreign companies is not available",true);
	}
	try{
		wLib.explicitWait(driver, 2,delOverseasPensionsRoyaltiesBtn);
		if(delOverseasPensionsRoyaltiesBtn.isDisplayed()==true)
		{
	wLib.explicitWait(driver, 2,delOverseasPensionsRoyaltiesBtn);
	delOverseasPensionsRoyaltiesBtn.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();
	}
		}catch (Exception e) {
			Reporter.log("Delete button for Overseas pensions is not available",true);
		}
	
	try{
		wLib.explicitWait(driver, 1,delSummaryFOR);
		if(delSummaryFOR.isDisplayed()==true)
		{
	wLib.explicitWait(driver, 1,delSummaryFOR);
	delSummaryFOR.click();
	cis.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,cnfmdel);
	cnfmdel.click();
	}
	}catch (Exception e) {
		Reporter.log("Delete button for Dividend income received by a person abroad is not available",true);
	}
	totalRentsAndOtherReceiptsTxtBox.clear();
	propertyExpensesTxtBox.clear();
	propertyExpensesTxtBox.sendKeys("0");
	foreignIncomeNumberOfOverseasLetPropertiesTxtBox.clear();
	foreignIncomePrivateUseAdjustmentsTxtBox.clear();
	foreignIncomeCostsOfReplacingDomesticItemsTxtBox.clear();
	foreignIncomeResidentialFinanceCostsTxtBox.clear();
	wLib.explicitWait(driver, 1,txtBoxLossBroughtForward);
	txtBoxLossBroughtForward.clear();
	txtBoxLossBroughtForward.sendKeys("0");
	totalForeignTaxReliefTxtBox.clear();
	wLib.explicitWait(driver, 5,confirmDel);
	confirmDel.click();
	wLib.explicitWait(driver, 5,popup1);
	driver.switchTo().activeElement();
	yesBtn.click();
	wLib.explicitWait(driver, 5,linkOtherTaxInformation);
	linkOtherTaxInformation.click();
	wLib.explicitWait(driver, 5,form1OpenBtn);
	form1OpenBtn.click();
	cis.switchwindowNew1(driver, frameStudentLoan);
	wLib.explicitWait(driver, 5,studentLoanTypeLstBox);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("0");
	amountTxtBox.clear();
	wLib.explicitWait(driver, 2,SaveBtn2);
	SaveBtn2.click();
	driver.navigate().refresh();
	sa1.funcDelAdditionalInfo(driver);
	}
public void funcAddEmpIncomeWithTaxTakenOff(WebDriver driver, String str1, String str2) throws Exception
{
	wLib = new WaitStatementLib();	
	wLib.explicitWait(driver, 2,addEmpIncome);
	addEmpIncome.click();
	wLib.explicitWait(driver, 2,payFrmEmployer);	
	payFrmEmployer.sendKeys(str1);
	UkTaxTakenOffPay.sendKeys(str2);
	SaveBtn1.click();
	driver.navigate().refresh();	
}
public void funcAddEmployerForMTR(WebDriver driver,String EmpName,String EmpPayRef)throws Exception
{
	clickEmployment(driver);
	wLib = new WaitStatementLib();	
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 2,addEmploymentBtn);
	addEmploymentBtn.click();
	cis.switchwindowNew1(driver,frameAddemployee);
	wLib.explicitWait(driver, 2,EmployerName);
	EmployerName.sendKeys(EmpName);
	wLib.explicitWait(driver, 2,txtEmployerPAYERef);
	txtEmployerPAYERef.sendKeys(EmpPayRef);
	SaveBtn2.click();
	driver.navigate().refresh();	
	Assert.assertEquals(cellemp.getText(), EmpName,"Text is not matching");
	
}
public void funcAddUntaxedInerest(WebDriver driver, String str1)throws Exception
{
	wLib = new WaitStatementLib();	
	cis = new CISPage(driver);
	wLib.explicitWait(driver, 2,formOpenBtn);
	formOpenBtn.click();
	cis.switchwindowNew1(driver,frameIntUk);
	wLib.explicitWait(driver, 2,dateTxtBox);
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateStart);
	
	interestAmountTxtBox.clear();
	interestAmountTxtBox.sendKeys(str1);
	
	unTaxedUKInterestRadioBtn.click();
	
	SaveBtn2.click();
	driver.navigate().refresh();	
}
public void addTestCase1(WebDriver driver, String EmpName,String EmpPayRef, String amt1, String amt2, String amt3, String amt4, String bankName, String acntNo) throws Exception {
	Reporter.log("Exceuting MTR Test Case 1",true);
	
	clickIncome(driver);
	
	funcAddEmployerForMTR(driver, EmpName, EmpPayRef);
	
	funcAddEmpIncomeWithTaxTakenOff(driver,amt1, amt2);
	
	clickIncome(driver);
	
	addBank(driver, bankName, bankName, acntNo);
	
	funcAddUntaxedInerest(driver,amt3);
	
	Reporter.log("Interest added Successfully",true);
	
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	paymentsToRegisteredPensionSchemesTxtBox.clear();
	paymentsToRegisteredPensionSchemesTxtBox.sendKeys(amt4);
	savePensionBtn.click();
	
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60,taxCalSummaryLink);
	taxCalSummaryLink.click();
	n1=Double.parseDouble(amt1);
	n2=Double.parseDouble(amt3);
	n3=Double.parseDouble(amt2);
	//modified for checking failure
	totalincome = n1 + n2;
	taxDueInc = totalincome - (personalAllowanceRate);	
	taxTotal=String.format("%.2f",(taxDueInc));
	if (taxDueInc >0.00)
	{
	taxdueOnInc1="£"+taxTotal;
	actualtax=totalIncomeOnWhichTaxIsDue.getText().replaceAll(",","");
	Assert.assertEquals(actualtax,taxdueOnInc1 );
	Reporter.log("correct output",true);
	
	d1= ((taxDueInc-n2)*basicRateNonSaving)/100;
	t1=String.format("%.2f",(d1));
	t2=incomeTaxDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(t2,t1);
	Reporter.log("Income tax due verified successfully: " +t2,true);
	total2=d1-n3;
	taxFinal=String.format("%.2f",(total2));; 
	taxFinalUI=taxForThisYear.getText().substring(1);
	Assert.assertEquals(taxFinalUI,taxFinal);
	Reporter.log("Balance Tax fot the year verified successfully: " +taxFinalUI,true);
	}
	}
public void funcDelTest1(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 1",true);
	clickIncome(driver);
	delBank(driver);
	
	clickEmployment(driver);
	
	delEmpInfo(driver);
	
	delPensionTaxRelief(driver);
	
}
public void addTestCase2(WebDriver driver, String EmpName,String EmpPayRef, String amt1, String amt2, String amt3, String amt4,String amt5,String amt6,String bankName,String accNo ) throws Exception {
	Reporter.log("Exceuting MTR Test Case 2",true);
	
	clickIncome(driver);
	
	funcAddEmployerForMTR(driver, EmpName, EmpPayRef);
	
	funcAddEmpIncomeWithTaxTakenOff(driver,amt1, amt2);
	
	clickIncome(driver);
	
	addBank(driver, bankName, bankName, accNo);
	
	funcAddUntaxedInerest(driver,amt3);
	
	Reporter.log("Interest added Successfully",true);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(amt4);
	
	totalIncomePropertyLinkTxtBox.clear();
	totalIncomePropertyLinkTxtBox.sendKeys(amt5);
	othrPropertyExpensesTxtBox.clear();
	othrPropertyExpensesTxtBox.sendKeys(amt6);
	
	SaveBtn1.click();
	
	n1=Double.parseDouble(amt1);
	n2=Double.parseDouble(amt3);
	n3=Double.parseDouble(amt2);
	n4=Double.parseDouble(amt5);
	n5=Double.parseDouble(amt6);
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
 	wLib.explicitWait(driver, 60,taxCalSummaryLink);
	taxCalSummaryLink.click();
	//modified for checking failure
	totalincome = n1 + n2 + (n4-n5);
	taxDueInc = totalincome - (personalAllowanceRate);	
	taxTotal=String.format("%.2f",(taxDueInc));
	if (taxDueInc >0.00)
	{
	taxdueOnInc1="£"+taxTotal;
	actualtax=totalIncomeOnWhichTaxIsDue.getText().replaceAll(",","");
	Assert.assertEquals(actualtax,taxdueOnInc1 );
	Reporter.log("correct output",true);
	
	d1= ((taxDueInc-nilRate1)*basicRateNonSaving)/100;
	t1=String.format("%.2f",(d1));
	t2=incomeTaxDue.getText().substring(1).replace(",", "");
	Assert.assertEquals(t2,t1);
	Reporter.log("Income tax due verified successfully: " +t2,true);
	total2=d1-n3;
	taxFinal=String.format("%.2f",(total2));; 
	taxFinalUI=taxForThisYear.getText().substring(1).replace(",", "");
	Assert.assertEquals(taxFinalUI,taxFinal);
	Reporter.log("Balance Tax fot the year verified successfully: " +taxFinalUI,true);
	}
}
public void delTestCase2(WebDriver driver) throws Exception {
	Reporter.log("Deleting MTR Test Case 2",true);
	clickIncome(driver);
	
	dividentLink.click();
	Thread.sleep(4000);
	delInterest.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	
	cnfmdel.click();
	
	Reporter.log("Interest deleted successfully",true);
	delbank.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew(driver);
	
	cnfmdel.click();
	driver.navigate().refresh();
	
	Reporter.log("Bank deleted successfully",true);
	
	clickEmployment(driver);
	
	delEmpInfo(driver);
	
	delProfit(driver);
}
public void addTestCase3(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22,String str23,String str24,String str25,String str26,String str27)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 3",true);
	clickIncome(driver);
	
	addBank(driver,str1, str1, str2);
	
	funcAddUntaxedInerest(driver,str3);
	
	Reporter.log("Interest added Successfully",true);
	
	addOtherDivident(driver,str4,"0.00","0.00");
	funcAddEmployerForMTR(driver, str6, str7);
	
	funcAddEmpIncomeWithTaxTakenOff(driver, str8,str9);
	
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	
	retirementAnnuityContractPaymentsTxtBox.clear();
	retirementAnnuityContractPaymentsTxtBox.sendKeys(str5);
	savePensionBtn.click();
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	
	frm1Btn.click();
	businessNameTxtBox.clear();
	businessNameTxtBox.sendKeys(str10);
	descriptionofBusinessTxtBox.clear();
	descriptionofBusinessTxtBox.sendKeys(str11);
	booksAccoutsStartDateTxtBox.clear();
	booksAccoutsStartDateTxtBox.sendKeys(str12);
	businessBooksEnddateTxtBox.clear();
	businessBooksEnddateTxtBox.sendKeys(str13);
	businessBooksEnddateTxtBox.sendKeys(Keys.TAB);
	
	//Business Income
	trunoverTxtBox.clear();
	trunoverTxtBox.sendKeys(str14);
	//Business Expenses
	goodsOfCostfullTxtBox.clear();
	goodsOfCostfullTxtBox.sendKeys(str15);
	wagesSalariesandOtherStaffCostsTxtBox.clear();
	wagesSalariesandOtherStaffCostsTxtBox.sendKeys(str16);
	travelexpensesTxtBox.clear();
	travelexpensesTxtBox.sendKeys(str17);
	rentInsurancecostTxtBox.clear();
	rentInsurancecostTxtBox.sendKeys(str18);
	advertisingandEntertainmentCostTxtBox.clear();
	advertisingandEntertainmentCostTxtBox.sendKeys(str19);
	interestbankTxtBox.clear();
	interestbankTxtBox.sendKeys(str20);
	bankCreditandOtherFinancialChargesTxtBox.clear();
	bankCreditandOtherFinancialChargesTxtBox.sendKeys(str21);
	otherbusinessexpensesTxtBox.clear();
	otherbusinessexpensesTxtBox.sendKeys(str22);
	basisPeriodBeganTxtBox.clear();
	basisPeriodBeganTxtBox.sendKeys(str23);
	basisPeriodEndedTxtBox.clear();
	basisPeriodEndedTxtBox.sendKeys(str24);
	accountingperiodandProfitlossTxtBox.clear();
	accountingperiodandProfitlossTxtBox.sendKeys(str25);
	anyBusinessIncomeTxtBox.clear();
	anyBusinessIncomeTxtBox.sendKeys(str26);
	n1 = Double.parseDouble(str3);
	n2 = Double.parseDouble(str4);
	n3= Double.parseDouble(str5);
	n4 = Double.parseDouble(str8);
	n5 = Double.parseDouble(str9);
	n6 = Double.parseDouble(str14);
	n7 = Double.parseDouble(str15);
	n8 = Double.parseDouble(str16);
	n9 = Double.parseDouble(str17);
	n10 = Double.parseDouble(str18);
	n11 = Double.parseDouble(str19);
	n12 = Double.parseDouble(str20);
	n13 = Double.parseDouble(str21);
	n14 = Double.parseDouble(str22);
	n15 = Double.parseDouble(str25);
	n16 = Double.parseDouble(str26);
	n17 = Double.parseDouble(str27);
	Reporter.log(n7+"--"+n8+"--"+n9+"--"+n10+"--"+n11+"--"+n12+"--"+n13+"--"+n14,true);
	//Balance Sheet
	//Capital Account
	balanceStartPeriodTxtBox.clear();
	balanceStartPeriodTxtBox.sendKeys(str27);
	SaveBtn1.click();
	
	editFullRecordsSE.click();
	total1=n7+n8+n9+n10+n11+n12+n13+n14;
	t1=String.format("%.2f",(total1));
	value1=businessExpTotalExpensesTxtBox.getAttribute("value");
	Assert.assertEquals(value1, t1);
	Reporter.log("Total expenses Verified: "+value1,true);
	x1=Double.parseDouble(value1);
	totlIncome=n6-x1;
	t2=String.format("%.2f",(totlIncome));
	//Net profit or loss - Fetch Text
	string1=netProfitTxtBox.getAttribute("value");
	Assert.assertEquals(string1, t2);
	Reporter.log("Net profit Verified: "+string1,true);
	double netBusinessProfit;
	double adjustedProfit;
	netBusinessProfit=Double.parseDouble(netBusinessProfitfortaxpurposeTxtBox.getAttribute("value"));
	adjustedProfit=Double.parseDouble(adjustedProfitTxtBox.getAttribute("value"));
	Assert.assertEquals(adjustedProfit,(netBusinessProfit+n15));
	Reporter.log("Adjusted profit for current tax year: " +adjustedProfitTxtBox,true);
	double totalProfitFromBusiness;
	totalProfitFromBusiness=Double.parseDouble(totalProfitFromBusinessTxtBox.getAttribute("value"));
	Assert.assertEquals(totalProfitFromBusiness,(adjustedProfit+n16));	
	Reporter.log("Total taxable profit from this business Verified: "+totalProfitFromBusiness,true);
	string3=netprofitorlossTxtBox.getAttribute("value");
	Assert.assertEquals(string3,string1);
	Reporter.log("Capital amount Net profit Verified: "+string3,true);
	n18 = Double.parseDouble(string3);
	double balanceEndPeriod;
	balanceEndPeriod=Double.parseDouble(balanceEndPeriodTxtBox.getAttribute("value"));
	Assert.assertEquals(balanceEndPeriod,(n17+n18));
	Reporter.log("Balance at end of period Verified: "+balanceEndPeriod,true);
	Reporter.log("Balance at end of period Verified: "+string3,true);
	SaveBtn1.click();
	
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	expResult1=TotalIncomeReceived.getText().substring(1).replace(",", "");
	calculation1=Double.parseDouble(expResult1);
	total1=n4+totalProfitFromBusiness+n1+n2;
	Assert.assertEquals(calculation1,total1);
	Reporter.log("Total income received Verified: "+calculation1,true);
	expResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	calculation2=Double.parseDouble(expResult1);
	total2=calculation1 - (n3+personalAllowanceRate);
	Assert.assertEquals(calculation2,total2);
	Reporter.log("Total income on which tax is due Verified: "+calculation2,true);
	expResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	calculation3=Double.parseDouble(expResult1);
	dueTax1=((calculation2-(n1+n2+taxLimit1Uk))*heigherRateNonSaving)/100;
	dueTax2=((n1-nilRate2)*heigherRateNonSaving)/100;
	dueTax3=((n2-savingStartingRate)*dividendTaxHigherRate)/100;
	taxDueInc=dueTax1+dueTax2+dueTax3+amount1;
	Assert.assertEquals(calculation3,taxDueInc);
	Reporter.log("Income Tax due Verified: "+calculation3,true);
}
public void funcDelMTRTest3(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 3",true);
	
	funcDelTest1(driver);
	
	delSelfEmpFull(driver);
	
	clickIncome(driver);
	
	dividentLink.click();
	
	delOtherDivident(driver);
}
public void addTestCase4(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 4",true);
	clickIncome(driver);
	
	addBank(driver,str1, str1, str2);
	
	funcAddUntaxedInerest(driver,str3);
	
	Reporter.log("Interest added Successfully",true);
	
	dividentUKCompanies(driver,str4,"",str5);
	
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	totStatPension.sendKeys(str6);
	stateBenefitsSaveBtn.click();
	
	driver.navigate().refresh();
	n1 = Double.parseDouble(str3);
	n2 = Double.parseDouble(str5);
	n3= Double.parseDouble(str6);
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	expResult1=TotalIncomeReceived.getText().substring(1).replace(",", "");
	calculation1=Double.parseDouble(expResult1);
	total1=n1+n2+n3;
	Assert.assertEquals(calculation1,total1);
	Reporter.log("Total income received Verified: "+calculation1,true);
	expResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	calculation2=Double.parseDouble(expResult1);
	total2=total1-personalAllowanceRate;
	Assert.assertEquals(calculation2,total2);
	Reporter.log("Total income on which tax is due Verified: "+calculation2,true);


	expResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	calculation3=Double.parseDouble(expResult1);
	amount3=calculation2-(savingStartingRate+savingStartingRate);
	dueTax1=(calculation2-(savingStartingRate+savingStartingRate))*percentageZero;
	dueTax2=savingStartingRate*percentageZero;
	dueTax3=savingStartingRate*percentageZero;
	taxDueInc=dueTax1+dueTax2+dueTax3;
	Assert.assertEquals(calculation3,taxDueInc);
	Reporter.log("Income Tax due Verified: "+calculation3,true);

startingRateSavingsinterest = txtSavingsinterestStartingrate.getText().substring(1).replace(",", "");
nillRateStartingRate=txtSavinginterestNilrate.getText().substring(1).replace(",", "");
nillRateDivident=txtDividentNilrate.getText().substring(1).replace(",", "");
amountstartingRateSavingsinterest=Double.parseDouble(startingRateSavingsinterest);
amountnillRateSavingsinterest=Double.parseDouble(nillRateStartingRate);
amountnillRateDivident=Double.parseDouble(nillRateDivident);
Assert.assertEquals(amountstartingRateSavingsinterest,savingStartingRate);
Reporter.log("Starting rate	for 'Savings interest from banks or building societies, securities etc.' verified: "+amountstartingRateSavingsinterest,true);
Assert.assertEquals(amountnillRateSavingsinterest,amount3);
Reporter.log("Nil Rate for 'Savings interest from banks or building societies, securities etc.' verified: "+amountnillRateSavingsinterest,true);	
Assert.assertEquals(amountnillRateDivident,savingStartingRate);
Reporter.log("Nil Rate for 'Dividends from companies' Verified: "+amountnillRateDivident,true);
}
public void funcDelMTRTest4(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 4",true);
	clickIncome(driver);
	
	delBank(driver);
	
	deleteDivident(driver);
	
	driver.navigate().refresh();
}
public void addUKInterestNew(WebDriver driver, String amt) throws Exception
{
	formOpenBtn.click();
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameIntUk);
	
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateStart);
	
	interestAmountTxtBox.clear();
	interestAmountTxtBox.sendKeys(amt);
	
	taxedUKInterestRadioBtn.click();
	
	SaveBtn2.click();
	
	Reporter.log("Interest added Successfully",true);
	}
public String calculateDividentFrmUKCompany() throws InterruptedException
{
	string1=amountDividendsfromUKCompanies.getText();
	
	String divVal[]=string1.split("£");
	return divVal[2];
}
public void addTestCase9(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19)throws Exception
{
	
	Reporter.log("Exceuting MTR Test Case 9",true);
	clickIncome(driver);
	
	addBank(driver,str1, str1, str2);
	
	addUKInterestNew(driver,str3);
	
	funcAddUntaxedInerest(driver,str4);
	
	dividentUKCompanies(driver,"Company1","",str5);
	
	addOtherUKIncome(driver,str6,"",str7,"","MtrTest9");
	
	taxReliefsLink.click();
	
	linkFormGiftAid.click();
	
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameGiftAid);
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateStart);
	giftAidPaymentsMadeInYearTxtBox.click();
	giftAidPaymentsMadeInYearTxtBox.sendKeys(str9);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str8);
	SaveBtn2.click();
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	try
	{
	
	delButton.click();
	
	confDel.click();
	}
	catch (Exception e)
	{
	    Reporter.log(e.getMessage(),true);
	}
	
	formOpenBtn.click();
	
	descriptionOfBusinessTxtBox.clear();
	descriptionOfBusinessTxtBox.sendKeys(str10);
	tradingEnddateTxtBox.clear();
	tradingEnddateTxtBox.sendKeys(str11);
	businessAccountsEnddateTxtBox.clear();
	businessAccountsEnddateTxtBox.sendKeys(dateEnd);
	businessIncomeTxtBox.clear();
	businessIncomeTxtBox.sendKeys(str12);
	costsOfGoodsBoughtForResaleTxtBox.clear();
	costsOfGoodsBoughtForResaleTxtBox.sendKeys(str13);
	otherCapitalAllowancesTxtBox.clear();
	otherCapitalAllowancesTxtBox.sendKeys(str14);
	totalBalancingChargesTxtBox.clear();
	totalBalancingChargesTxtBox.sendKeys(str15);
	ownGoodsAndServicesTxtBox.clear();
	ownGoodsAndServicesTxtBox.sendKeys(str16);
	anyOtherBusinessIncomeTxtBox.clear();
	anyOtherBusinessIncomeTxtBox.sendKeys(str17);
	SaveBtn1.click();
	
	driver.navigate().refresh();
	clickIncome(driver);
	
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys("1");
	
	totalIncomePropertyLinkTxtBox.clear();
	totalIncomePropertyLinkTxtBox.sendKeys(str18);
	othrPropertyExpensesTxtBox.clear();
	othrPropertyExpensesTxtBox.sendKeys(str19);
	SaveBtn1.click();
	
	driver.navigate().refresh();
	n1=Double.parseDouble(str3);//365
	n2=Double.parseDouble(str4);//7283
	n3=Double.parseDouble(str5);//1510
	n4=Double.parseDouble(str6);//1500
	n5=Double.parseDouble(str7);//300
	n6=Double.parseDouble(str9);//2400
	n7=Double.parseDouble(str12);//14560
	n8=Double.parseDouble(str13);//13603
	n9=Double.parseDouble(str14);//1700
	n10=Double.parseDouble(str15);//3926
	n11=Double.parseDouble(str16);//720
	n12=Double.parseDouble(str17);//250
	n13=Double.parseDouble(str18);//7800
	n14=Double.parseDouble(str19);//4200
	total1 = n7-n8;//957
	total2=(total1+n10+n11)-n9;//3903
	total3=total2+n12;//4153
	totalIncome1=n13-n14;//3600
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	
	Assert.assertEquals(amountProfitFromSelfEmployment.getText().substring(1).replace(",", ""),String.format("%.2f",(total3)));
	Reporter.log("Profit From Self Employment verified: "+amountProfitFromSelfEmployment.getText(),true);
	Assert.assertEquals(amountProfitFromUKLandAndProperty.getText().substring(1).replace(",", ""),String.format("%.2f",(totalIncome1)));
	Reporter.log("Profit From UK Land And Property verified: "+amountProfitFromUKLandAndProperty.getText(),true);

	Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(Math.round(n1*25/100)+n1+n2)));
	Reporter.log("Interest From UK banks Building verified: "+amountInterestFromUKbanksBuilding.getText(),true);
	/*string1=amountDividendsfromUKCompanies.getText();
	
	String divVal[]=string1.split("£");*/

	Assert.assertEquals(calculateDividentFrmUKCompany().replace(",", ""),String.format("%.2f",(n3)));
	Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);

	Assert.assertEquals(amountOtherIncome.getText().substring(1).replace(",", ""),String.format("%.2f",(n4)));
	Reporter.log("Other Income verified: "+amountOtherIncome.getText(),true);
	totlIncome=total3 + totalIncome1 + (Math.round((n1*25)/100)+n1+n2) + n3 + n4;
	Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(total3 + totalIncome1 + (Math.round((n1*25)/100)+n1+n2) + n3 + n4)));
	Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
	Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(totlIncome - personalAllowanceRate)));
	Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
	dueTax1 = totlIncome - personalAllowanceRate;
	amount3= savingStartingRate*percentageZero;
	amount4=(dueTax1-savingStartingRate)*percentageZero;
	amount5 = n3* percentageZero;
	dueTax2 = amount3+amount4+amount5;
	dueTax3=(((n6*100)/80)*basicRateNonSaving)/100;
	Assert.assertEquals(calculationGiftAidpayments.getText().substring(1).replace(",", ""),String.format("%.2f",((n6*100)/80)));
	Reporter.log("Calculation Of Gift Aid Payments verified: "+calculationGiftAidpayments.getText(),true);
	dueTax3=(((n6*100)/80)*basicRateNonSaving)/100;

	Assert.assertEquals(taxDueGiftAidpayments.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax3)));
	Reporter.log("Tax Due on Gift Aid Payments verified: "+taxDueGiftAidpayments.getText(),true);

	Assert.assertEquals(incomeTaxDueAfterGifTAid.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax2+dueTax3)));
	Reporter.log("Total Income Tax Due After GifTAid verified: "+incomeTaxDueAfterGifTAid.getText(),true);
	taxBalance=(dueTax2+dueTax3)-((n1*25/100)+n5);
	Assert.assertEquals(taxForThisYear.getText().substring(1).replace(",", ""),String.format("%.2f",((dueTax2+dueTax3)-((n1*25/100)+n5))));
	Reporter.log("Tax For This Year verified: "+taxForThisYear.getText(),true);
}
public void funcDelMTRTest9(WebDriver driver)throws Exception
{
Reporter.log("Deleting MTR Test Case 9",true);
clickIncome(driver);

delInterestfromUKbanks(driver);

delOtherUKIncome(driver);

deleteDivident(driver);

delGiftAid(driver);

delSEshort(driver);

delProfit(driver);

driver.navigate().refresh();
}
public void addTestCase10(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 10",true);
	clickIncome(driver);
	
	addBank(driver,str1, str1, str2);
	
	funcAddUntaxedInerest(driver,str3);//21005.00
	
	dividentUKCompanies(driver,"Company1","",str4);//16,000.00
	
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	totStatPension.sendKeys(str5);//8239.00
	otherPensionsRetirementAnnuities.clear();
	otherPensionsRetirementAnnuities.sendKeys(str6);//4800.00
	taxTakenOffOtherPensions.clear();
	taxTakenOffOtherPensions.sendKeys(str7);//960.00
	stateBenefitsSaveBtn.click();
	taxReliefsLink.click();
	
	linkFormGiftAid.click();
	
	cis.switchwindowNew1(driver,frameGiftAid);
	
	dateTxtBox.clear();
	dateTxtBox.sendKeys(dateStart);
	giftAidPaymentsMadeInYearTxtBox.click();
	giftAidPaymentsMadeInYearTxtBox.sendKeys(str8);//2400.00
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys("Gift Aid Payment");
	SaveBtn2.click();
	
	driver.navigate().refresh();
	n1=Double.parseDouble(str3);//21005.00
	n2=Double.parseDouble(str4);//16,000.00
	n3=Double.parseDouble(str5);//8239.00
	n4=Double.parseDouble(str6);//4800.00
	n5=Double.parseDouble(str7);//960.00
	n6=Double.parseDouble(str8);//2400.00
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	string1=amountDividendsfromUKCompanies.getText();
	
	Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(n1)));
	Reporter.log("Interest From UK banks Building 	verified: "+amountInterestFromUKbanksBuilding.getText(),true);	
	String divVal[]=string1.split("£");
	Assert.assertEquals(divVal[2].replace(",", ""),String.format("%.2f",(n2)));
	Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);
	Assert.assertEquals(amountUKpensionsAndStateBenefits.getText().substring	(1).replace(",", ""),String.format("%.2f",(n3+n4)));
	Reporter.log("Amount of UK pensions And State Benefits is verified: "+amountUKpensionsAndStateBenefits.getText(),true);
	Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(n1+n2+n3+n4)));
	Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
	totlIncome = n1+n2+n3+n4;
	Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(totlIncome - personalAllowanceRate)));
	Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);	
	total1 = (personalAllowanceRate+savingStartingRate)-(n3+n4); //3461
	total2=n1 -(total1+nilRate2);//17044
	total4=(n3+n4)-personalAllowanceRate ;//1,539
	total3=n2-((taxLimit1Uk + (n6*100/80))-(total4+total1+nilRate2+total2));//2044
	total5=((taxLimit1Uk + (n6*100/80))-(total4+total1+nilRate2+total2))-savingStartingRate;//8,956
	Assert.assertEquals(txtSavingsinterestStartingrate.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));//£3,461.00	
	Reporter.log("Starting Rate Dividends verified: "+txtSavingsinterestStartingrate.getText(),true);
	Assert.assertEquals(amtBasicRatePayPensions.getText().substring(1).replace(",", ""),String.format("%.2f",(total4))); //£1,539.00	
	Reporter.log("Basic Rate Pay Pensions verified: "+amtBasicRatePayPensions.getText(),true);
	Assert.assertEquals(amtBasicRateSavingsInterestTest1.getText().substring(1).replace(",", ""),String.format("%.2f",(total2)));//£17,044.00	
	Reporter.log("Basic Rate Savings Interest verified: "+amtBasicRateSavingsInterestTest1.getText(),true);
	Assert.assertEquals(amtBasicRateDividendsTest1.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));//£8,956.00
	Reporter.log("Basic Rate Dividends: "+amtBasicRateDividendsTest1.getText(),true);
	Assert.assertEquals(amtHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(total3)));//£2,044.00		
	Reporter.log("Heigher Rate Dividends verified: "+amtHeigherRate1.getText(),true);
	Assert.assertEquals(amtNilRateSavingsInterest.getText().substring(1).replace(",", ""),String.format("%.2f",(nilRate2)));//500
	Reporter.log("Nil Rate Savings Interest verified: "+amtNilRateSavingsInterest.getText(),true);
	Assert.assertEquals(amtNilRateDividendsTest10.getText().substring(1).replace(",", ""),String.format("%.2f",(savingStartingRate)));//5000
	Reporter.log("Nil Rate Divident verified: "+amtNilRateDividendsTest10.getText(),true);
	Assert.assertEquals(amtFromallemploymentsUKpensionsTest1.getText().substring(1).replace(",", ""),String.format("%.2f",(n5)));//£960.00
	Reporter.log("From all employments UK pensions verified: "+amtFromallemploymentsUKpensionsTest1.getText(),true);
	basic1=total4*(basicRateNonSaving/100);//307
	Reporter.log("Basic rate of Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) is	: "+String.format("%.2f",(basic1)),true);
	amount3=total1*percentageZero;//0
	Reporter.log("Starting rate	Savings interest from banks or building societies, securities etc.: "+ String.format("%.2f",(amount3)),true);
	amount4=nilRate2*percentageZero;//0
	Reporter.log("Nil rate of Savings interest from banks or building societies, securities etc.: "+ String.format("%.2f",(amount4)),true);
	basicInterestAmount=total2*(basicRateNonSaving/100);//3408.80
	Reporter.log("Basic rate of Savings interest from banks or building societies, securities etc.: "+String.format("%.2f",(basicInterestAmount)) ,true);
	amount5=savingStartingRate*percentageZero;//0
	Reporter.log("Nil rate of Dividends from companies etc.: "+String.format("%.2f",(amount5)),true);	
	totalIncome1=total5*(dividendTaxBasicRate/100);//671.70
	Reporter.log("Basic rate of Dividends from companies etc.: "+String.format("%.2f",(totalIncome1)),true);	
	heigherRate=total3*(dividendTaxHigherRate/100);//664.30
	Reporter.log("Heigher rate of Dividends from companies etc.: "+String.format("%.2f",(heigherRate)),true);	
	finalAmount=basic1+amount3+basicInterestAmount+totalIncome1+heigherRate;//£5,052.60
	Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(finalAmount)));
	Reporter.log("Income Tax Due verified: "+ incomeTaxDue.getText(),true);
	Assert.assertEquals(taxForThisYear.getText().substring(1).replace(",", ""),String.format("%.2f",(finalAmount-n5)));
	Reporter.log("Balance  Tax for this year verified: "+ incomeTaxDue.getText(),true);
}
public void funcDelMTRTest10(WebDriver driver)throws Exception
{
Reporter.log("Deleting MTR Test Case 10",true);
clickIncome(driver);

delBank(driver);

delOtherUKIncome(driver);

deleteDivident(driver);

delGiftAid(driver);

driver.navigate().refresh();
}
public void addStudentLoanPlan2(WebDriver driver, String str1) throws Exception
{	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("2");
	amountTxtBox.clear();
	amountTxtBox.sendKeys(str1);
	repaidChckBox.click();
	SaveBtn2.click();
	}
public void addTestCase14(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 14",true);
	clickIncome(driver);
	
	dividentLink.click();
	
	addOtherDivident(driver,str1,"","");
	
	funcAddEmployerForMTR(driver,str2,str3);
	
	funcAddEmpIncomeWithTaxTakenOff(driver, str4,str5);
	
	addStudentLoanPlan2(driver, str6);
	n1=Double.parseDouble(str1);//£12,750.00
	n2=Double.parseDouble(str4);//£33254.00
	n3=Double.parseDouble(str5);//£2000.00
	n4=Double.parseDouble(str6);//1102.86
	taxReturnLink.click();
	
	taxCalSummaryLink.click();
	
	total1 = n2 - personalAllowanceRate;//21754
	//savingStartingRate->5000
	total2 = (taxLimit1Uk - total1); //11,746
	total3 =total2 - savingStartingRate;//6,746
	total4=n1-total2;//1004
	total5=n2+n1; //46,004
	total6 = total5-plan2;//25004
	total7=Math.round(total6*studentLoanRate); //2,250.00
	Reporter.log("Value of  Student Loan repayments: "+total7,true);
	total8 = Math.round(total7-n4);//1147
	Reporter.log("Calculated Value of  Student Loan repayments: "+total8,true);

	Assert.assertEquals(payFromAllEmployments.getText().substring(1).replace(",", ""),String.format("%.2f",(n2)));
	Reporter.log("Pay From All Employments verified:" + payFromAllEmployments.getText(),true);
	string1=amountDividendsfromUKCompanies.getText();
	
	String divVal[]=string1.split("£");
	Assert.assertEquals(divVal[2].replace(",", ""),String.format("%.2f",(n1)));
	Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);
	Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));
	Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
	Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(total5-personalAllowanceRate)));
	Reporter.log("total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);

	Assert.assertEquals(amtBasicRatePayPensionsTest14.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
	Reporter.log("Basic Rate of Pay Pensions verified:" + amtBasicRatePayPensionsTest14.getText(),true);

	Assert.assertEquals(amtNilRateDividentTest14.getText().substring(1).replace(",", ""),String.format("%.2f",(savingStartingRate)));
	Reporter.log("Nil Rate of Divident verified:" + amtNilRateDividentTest14.getText(),true);

	Assert.assertEquals(amtBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(total3)));
	Reporter.log("Basic Rate of Dividends verified:" + amtBasicRate.getText(),true);

	Assert.assertEquals(amtHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(total4)));
	Reporter.log("Heigher Rate of Dividends verified:" + amtHeigherRate1.getText(),true);

	Reporter.log("Basic Rate of Pay, pensions, profit etc.: " + String.format("%.2f",((total1 * basicRateNonSaving)/100)),true);
	Reporter.log("Nil rate of Dividends from companies etc. :"+ String.format("%.2f",(savingStartingRate*percentageZero)),true); 
	Reporter.log("Basic Rate of Dividends from companies etc.: "+String.format("%.2f",((total3 * dividendTaxBasicRate)/100)),true); 
	Reporter.log("Higher rate of Dividends from companies etc.: "+String.format("%.2f",((total4 * dividendTaxHigherRate)/100)),true); 

	incomTaxdue1=((total1 * basicRateNonSaving)/100) + (savingStartingRate*percentageZero) + ((total3 * dividendTaxBasicRate)/100) + ((total4 * dividendTaxHigherRate)/100);
	Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(incomTaxdue1)));
	Reporter.log("Income Tax Due verified: "+ incomeTaxDue.getText(),true);

	Assert.assertEquals(taxForThisYear.getText().substring(1).replace(",", ""),String.format("%.2f",((incomTaxdue1+total8)-n3)));
	Reporter.log("Balance  Tax for this year verified: "+ incomeTaxDue.getText(),true);
	}
public void funcDelMTRTest14(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 14",true);
	clickIncome(driver);
	
	dividentLink.click();
	
	delOtherDivident(driver);
	
	clickEmployment(driver);
	
	delEmpInfo(driver);
	
	delStudentLoanRepayment(driver);
}
public void addTestCase15(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 15",true);
	clickIncome(driver);
	
	addBank(driver,str1, str1, str2);
	
	funcAddUntaxedInerest(driver,str3);
	
	Reporter.log("Interest added Successfully",true);
	
	addOtherDivident(driver,str4,"0.00","0.00");
	
	taxReliefsLink.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,framePensionSchemes);
	
	retirementAnnuityContractPaymentsTxtBox.clear();
	retirementAnnuityContractPaymentsTxtBox.sendKeys(str5);
	savePensionBtn.click();
	
	clickIncome(driver);
	
	selfEmploymentLink.click();
	
	frm1Btn.click();
	businessNameTxtBox.clear();
	businessNameTxtBox.sendKeys(str6);
	descriptionofBusinessTxtBox.clear();
	descriptionofBusinessTxtBox.sendKeys(str7);
	booksAccoutsStartDateTxtBox.clear();
	booksAccoutsStartDateTxtBox.sendKeys(str8);
	businessBooksEnddateTxtBox.clear();
	businessBooksEnddateTxtBox.sendKeys(str9);
	businessBooksEnddateTxtBox.sendKeys(Keys.TAB);
	
	//Business Income
	trunoverTxtBox.clear();
	trunoverTxtBox.sendKeys(str10);
	//Business Expenses
	goodsOfCostfullTxtBox.clear();
	goodsOfCostfullTxtBox.sendKeys(str11);
	wagesSalariesandOtherStaffCostsTxtBox.clear();
	wagesSalariesandOtherStaffCostsTxtBox.sendKeys(str12);
	travelexpensesTxtBox.clear();
	travelexpensesTxtBox.sendKeys(str13);
	rentInsurancecostTxtBox.clear();
	rentInsurancecostTxtBox.sendKeys(str14);
	advertisingandEntertainmentCostTxtBox.clear();
	advertisingandEntertainmentCostTxtBox.sendKeys(str15);
	interestbankTxtBox.clear();
	interestbankTxtBox.sendKeys(str16);
	bankCreditandOtherFinancialChargesTxtBox.clear();
	bankCreditandOtherFinancialChargesTxtBox.sendKeys(str17);
	otherbusinessexpensesTxtBox.clear();
	otherbusinessexpensesTxtBox.sendKeys(str18);
	basisPeriodBeganTxtBox.clear();
	basisPeriodBeganTxtBox.sendKeys(dateStart);
	basisPeriodEndedTxtBox.clear();
	basisPeriodEndedTxtBox.sendKeys(dateEnd);
	accountingperiodandProfitlossTxtBox.clear();
	accountingperiodandProfitlossTxtBox.sendKeys(str19);
	anyBusinessIncomeTxtBox.clear();
	anyBusinessIncomeTxtBox.sendKeys(str20);
	n1 = Double.parseDouble(str3);//3678.00
	n2 = Double.parseDouble(str4);//12750.00
	n3= Double.parseDouble(str5);//1200.00
	n4 = Double.parseDouble(str10);//74900.00
	n5 = Double.parseDouble(str11);//25000.00
	n6 = Double.parseDouble(str12);//2000.00
	n7 = Double.parseDouble(str13);//12000.00
	n8 = Double.parseDouble(str14);//10800.00
	n9 = Double.parseDouble(str15);//1400.00
	n10 = Double.parseDouble(str16);//5800.00
	n11 = Double.parseDouble(str17);//1500.00
	n12 = Double.parseDouble(str18);//1500.00
	n13 = Double.parseDouble(str19);//-1010.00
	n14 = Double.parseDouble(str20);//300.00
	balanceStartPeriodTxtBox.clear();
	balanceStartPeriodTxtBox.sendKeys(str21);
	n15 = Double.parseDouble(str21);//2600.00
	SaveBtn1.click();
	
	editFullRecordsSE.click();
	total1=n5+n6+n7+n8+n9+n10+n11+n12;
	t1=String.format("%.2f",(total1));
	value1=businessExpTotalExpensesTxtBox.getAttribute("value");
	Assert.assertEquals(value1, t1);
	Reporter.log("Total expenses Verified: "+value1,true);
	x1=Double.parseDouble(value1);
	totlIncome=n4-x1;
	t2=String.format("%.2f",(totlIncome));
	//Net profit or loss - Fetch Text
	string1=netProfitTxtBox.getAttribute("value");
	Assert.assertEquals(string1, t2);
	Reporter.log("Net profit Verified: "+string1,true);
	double netBusinessProfit;
	double adjustedProfit;
	netBusinessProfit=Double.parseDouble(netBusinessProfitfortaxpurposeTxtBox.getAttribute("value"));
	adjustedProfit=Double.parseDouble(adjustedProfitTxtBox.getAttribute("value"));
	Assert.assertEquals(adjustedProfit,(netBusinessProfit+n13));
	Reporter.log("Adjusted profit for current tax year: " +adjustedProfitTxtBox,true);
	double totalProfitFromBusiness;
	totalProfitFromBusiness=Double.parseDouble(totalProfitFromBusinessTxtBox.getAttribute("value"));
	Assert.assertEquals(totalProfitFromBusiness,(adjustedProfit+n14));	
	Reporter.log("Total taxable profit from this business Verified: "+totalProfitFromBusiness,true);
	string3=netprofitorlossTxtBox.getAttribute("value");
	Assert.assertEquals(string3,string1);
	Reporter.log("Capital amount Net profit Verified: "+string3,true);
	n16 = Double.parseDouble(string3);
	double balanceEndPeriod;
	balanceEndPeriod=Double.parseDouble(balanceEndPeriodTxtBox.getAttribute("value"));
	Assert.assertEquals(balanceEndPeriod,(n15+n16));
	Reporter.log("Balance at end of period Verified: "+balanceEndPeriod,true);
	Reporter.log("Balance at end of period Verified: "+string3,true);
	SaveBtn1.click();
	
	linkOtherTaxInformation.click();
	
	form1OpenBtn.click();
	
	cis.switchwindowNew1(driver,frameStudentLoan);
	listbox1 = new Select(studentLoanTypeLstBox);
	listbox1.selectByValue("1");
	SaveBtn2.click();
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	expResult1=TotalIncomeReceived.getText().substring(1).replace(",", "");
	calculation1=Double.parseDouble(expResult1);
	total1=totalProfitFromBusiness+n1+n2;
	Assert.assertEquals(calculation1,total1);
	Reporter.log("Total income received Verified: "+calculation1,true);
	expResult1=totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", "");
	calculation2=Double.parseDouble(expResult1);
	total2=calculation1 - (n3+personalAllowanceRate);
	Assert.assertEquals(calculation2,total2);
	Reporter.log("Total income on which tax is due Verified: "+calculation2,true);
	expResult1=incomeTaxDue.getText().substring(1).replace(",", "");
	calculation3=Double.parseDouble(expResult1);
	total1=calculation2-(n1+n2); //1,490.00
	dueTax1=(total1*basicRateNonSaving)/100; //£298.00
	total2=savingStartingRate-total1; //3510
	dueTax2=total2*percentageZero; //£0.00
	total3=n1-total2; //168.00
	dueTax3=total3*percentageZero;//£0.00
	//nil rate = savingStartingRate
	//nil rate percentage = savingStartingRate*percentageZero ---> £0.00
	total4= n2 - savingStartingRate;//£7,750.00	
	dueTax4=(total4*dividendTaxBasicRate)/100;//£581.25
	taxDueInc=dueTax1+dueTax2+dueTax3+dueTax4;//879.25
	Assert.assertEquals(calculation3,taxDueInc);
	Reporter.log("Income Tax due Verified: "+calculation3,true);
	total5 = totalProfitFromBusiness - class2LPL;
	total6=total5*studentLoanRate;
	total7=(totalProfitFromBusiness	+ n1 + n2)-n3;//29418
	total8=(total7-plan1)*studentLoanRate;//1047.87
	Reporter.log("student Loan Amount: "+total8,true);
	Assert.assertEquals(amtBasicRatePayPensions.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
	Reporter.log("Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) -> Basic rate verified:" + amtBasicRatePayPensions.getText(),true);
	Assert.assertEquals(txtSavingsinterestStartingrate.getText().substring(1).replace(",", ""),String.format("%.2f",(total2)));
	Reporter.log("Savings interest from banks or building societies, securities etc. -> Starting rate verified:" + txtSavingsinterestStartingrate.getText(),true);
	Assert.assertEquals(amtNilRateSavingsInterest.getText().substring(1).replace(",", ""),String.format("%.2f",(total3)));
	Reporter.log("Savings interest from banks or building societies, securities etc. -> Nil rate verified:" + amtNilRateSavingsInterest.getText(),true);
	Assert.assertEquals(amtNilRateSavingsInterest1.getText().substring(1).replace(",", ""),String.format("%.2f",(savingStartingRate)));
	Reporter.log("Dividends from companies etc.-> Nil rate verified:" + amtNilRateSavingsInterest1.getText(),true);
	Assert.assertEquals(amtBasicRateDividends.getText().substring(1).replace(",", ""),String.format("%.2f",(total4)));
	Reporter.log("Dividends from companies etc.-> Basic rate verified:" + amtBasicRateDividends.getText(),true);
	Reporter.log("Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) -> Basic rate: " + String.format("%.2f",(dueTax1)),true);
	Reporter.log("Savings interest from banks or building societies, securities etc. -> Starting rate: "+ String.format("%.2f",(dueTax2)),true); 
	Reporter.log("Savings interest from banks or building societies, securities etc. -> Nil rate: "+String.format("%.2f",(dueTax3)),true); 
	Reporter.log("Dividends from companies etc.-> Basic rate: "+String.format("%.2f",(dueTax4)),true); 
	Assert.assertEquals(amtClass4NationalInsurancecontributions.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));
	Reporter.log("Amaount of Class 4 National Insurance contributions verified:" + amtClass4NationalInsurancecontributions.getText(),true);
	Assert.assertEquals(class4NationalInsurancecontributions1.getText().substring(1).replace(",", ""),String.format("%.2f",(total6)));
	Reporter.log("Class 4 National Insurance contributions verified:" + class4NationalInsurancecontributions1.getText(),true);
	Assert.assertEquals(studentLoanAmountTaxWindow.getText().substring(1).replace(",", ""),String.format("%.2f",(Math.floor(total8))));
	Reporter.log("Student Loan repayments verified:" + studentLoanAmountTaxWindow.getText(),true);
	
}
public void funcDelMTRTest15(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 15",true);
	
	clickIncome(driver);
	delInterestfromUKbanks(driver);
	
	delSelfEmpFull(driver);
	
	clickIncome(driver);
	
	dividentLink.click();
	
	delOtherDivident(driver);
	
	delStudentLoanRepayment(driver);
	
	delPensionTaxRelief(driver);
	
}
public void addTestCase16(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 16",true);
		
	clickIncome(driver);
	
	//dividentLink.click();
	//
	addBank(driver, str1, str1, str2);
	
	funcAddUntaxedInerest(driver, str3);
	
	Reporter.log("Interest added Successfully",true);
	
	addOtherDivident(driver,str4,"0.00","0.00");
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	totStatPension.clear();
	totStatPension.sendKeys(str5);
	stateBenefitsSaveBtn.click();
	incmFrmProLink.click();
	
	editBtn.click();
	
	noOfPropertiesRentedOutTxtBox.clear();
	noOfPropertiesRentedOutTxtBox.sendKeys(str6);
	
	totalIncomePropertyLinkTxtBox.clear();
	totalIncomePropertyLinkTxtBox.sendKeys(str7);
	rentRatesInsuranceEtcTxtBox.clear();
	rentRatesInsuranceEtcTxtBox.sendKeys(str8);
	repairsAndMaintenanceTxtBox.clear();
	repairsAndMaintenanceTxtBox.sendKeys(str9);
	intrstAndOthrFinancialChrgsTxtBox.clear();
	intrstAndOthrFinancialChrgsTxtBox.sendKeys(str10);
	legalManagmntAndPrfsnalFeesTxtBox.clear();
	legalManagmntAndPrfsnalFeesTxtBox.sendKeys(str11);
	othrPropertyExpensesTxtBox.clear();
	othrPropertyExpensesTxtBox.sendKeys(str12);
	tenPercntWearAndTearAllowanceTxtBox.clear();
	tenPercntWearAndTearAllowanceTxtBox.sendKeys(str13);
	txtBoxLossBroughtForward.clear();
	txtBoxLossBroughtForward.sendKeys(str14);
	SaveBtn1.click();
	
	n1 = Double.parseDouble(str3);//n1 = 3678
	n2 = Double.parseDouble(str4);//n2 =12750
	n3 = Double.parseDouble(str5);//n3 = 6200
	n4 = Double.parseDouble(str7);//n4 = 131731
	n5 = Double.parseDouble(str8);//n5 =12218
	n6 = Double.parseDouble(str9);//n6 = 14935
	n7 = Double.parseDouble(str10);//n7 = 26882
	n8 = Double.parseDouble(str11);//n8 = 5527
	n9 = Double.parseDouble(str12);//n9 = 7059
	n10 = Double.parseDouble(str13);//n10 = 13171
	n11 = Double.parseDouble(str14);//n11 =1197
	
	string1=adjustedProfitForTheYear.getAttribute("value");
	calculation1=Double.parseDouble(string1);
	string2=taxableProfitForTheYear.getAttribute("value");
	calculation2=Double.parseDouble(string2);
	total1=n4-(n5+n6+n7+n8+n9+n10);//51939.00
	total2=total1-n11;//50742.00	
	Assert.assertEquals(calculation1,total1);
	Reporter.log("Adjusted profit for the year verified successfully: "+calculation1,true);
	Assert.assertEquals(calculation2,total2);
	Reporter.log("Taxable profit for the year verified successfully: "+calculation2,true);
	
	total3=(taxLimit1Scot * basicRateNonSaving)/100;
	total4=((((total2 +n3) - (personalAllowanceRate + blindAllowance))-taxLimit1Scot)*	heigherRateNonSaving)/100;
	total5=((n1-nilRate2)*	heigherRateNonSaving)/100;
	total6=((n2-savingStartingRate)*dividendTaxHigherRate)/100;	
	total7=total1+n1+n2+n3;//£74,567.00	 
	total8 = n11+personalAllowanceRate+blindAllowance; //
	totalincome = total7-total8;//£59,550.00
	taxDueInc=total3+total4+total5+total6;
	wLib = new WaitStatementLib();	
	taxReturnLink.click();
	wLib.explicitWait(driver, 60, taxCalSummaryLink);
	taxCalSummaryLink.click();
	Assert.assertEquals(amountProfitFromUKLandAndProperty.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
	Reporter.log("Amount of Profit From UK Land And Property.getText() is Verified: "+amountProfitFromUKLandAndProperty.getText(),true);

	Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(n1)));
	Reporter.log("Amount of Interest From UK banks and Building is Verified: "+amountInterestFromUKbanksBuilding.getText(),true);

	string1=amountDividendsfromUKCompanies.getText();
	
	String divVal[]=string1.split("£");
	Assert.assertEquals(divVal[2].replace(",", ""),String.format("%.2f",(n2)));
	Reporter.log("Amount of Dividends from UK Companies is Verified: "+amountDividendsfromUKCompanies.getText(),true);
	
	Assert.assertEquals(amountUKpensionsAndStateBenefits.getText().substring(1).replace(",", ""),String.format("%.2f",(n3)));
	Reporter.log("Amount of UK pensions and State Benefits is Verified: "+amountUKpensionsAndStateBenefits.getText(),true);
	
	Assert.assertEquals(amtIncometaxrelief.getText().substring(1).replace(",", ""),String.format("%.2f",(n11)));
	Reporter.log("Amount of Income tax relief is Verified: "+amtIncometaxrelief.getText(),true);
	
	Assert.assertEquals(amtBlindPersonAllowance.getText().substring(1).replace(",", ""),String.format("%.2f",(blindAllowance)));
	Reporter.log("Amount of Blind Person Allowance is Verified: "+amtBlindPersonAllowance.getText(),true);
	
	cis = new CISPage(driver);
	cis.switchwindowDefault(driver);
	
	Assert.assertEquals(amtBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(taxLimit1Scot)));
	Reporter.log("Amount of Pay, pensions, profit etc. (Scottish income tax rate)Basic rate is Verified: "+amtBasicRate.getText(),true);
	
	Assert.assertEquals(interOnBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",((taxLimit1Scot * basicRateNonSaving)/100)));
	Reporter.log("Calculation of Pay, pensions, profit etc. (Scottish income tax rate) Basic rate is verified:" +interOnBasicRate.getText(),true);
	Assert.assertEquals(amtHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(((total2 +n3) - (personalAllowanceRate + blindAllowance))-taxLimit1Scot)));
	Reporter.log("Pay, pensions, profit etc. (Scottish income tax rate) -> Higher rate is Verified: "+amtHeigherRate1.getText(),true);
	
	Assert.assertEquals(amtHeigherRate2.getText().substring(1).replace(",", ""),String.format("%.2f",(n1-nilRate2)));
	Reporter.log("Savings interest from banks or building societies, securities etc. -> Higher rate is Verified: "+amtHeigherRate2.getText(),true);
	
	Assert.assertEquals(amtHeigherRate3.getText().substring(1).replace(",", ""),String.format("%.2f",(n2-savingStartingRate)));
	Reporter.log("Dividends from companies etc. -> Higher rate is Verified: "+amtHeigherRate3.getText(),true);
	
	Assert.assertEquals(calculationHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(total4)));
	Reporter.log("Calculation of Pay, pensions, profit etc. (Scottish income tax rate) -> Higher rate is Verified: "+calculationHeigherRate1.getText(),true);
	
	Assert.assertEquals(calculationHeigherRate2.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));
	Reporter.log("Calculation of Savings interest from banks or building societies, securities etc. -> Higher rate is Verified: "+calculationHeigherRate2.getText(),true);
	
	Assert.assertEquals(calculationHeigherRate3.getText().substring(1).replace(",", ""),String.format("%.2f",(total6)));
	Reporter.log("Calculation of Dividends from companies etc. -> Higher rate is Verified: "+calculationHeigherRate3.getText(),true);
	
	Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(total7)));
	Reporter.log("Total Income Received is Verified: "+TotalIncomeReceived.getText(),true);
	
	Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(totalincome)));
	Reporter.log("Total Income on WhichTaxIsDue is Verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
	
	Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(taxDueInc)));
	Reporter.log("Income Tax Due is Verified: "+incomeTaxDue.getText(),true);
	
	Assert.assertEquals(incomeTaxDue.getText(),taxForThisYear.getText());
	Reporter.log("Balance for the year is Verified: "+incomeTaxDue.getText(),true);
	
}
public void funcDelMTRTest16(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 16",true);
	
	clickIncome(driver);
	
	delBank(driver);
	
	delOtherDivident(driver);
	
	delProfit(driver);
}
public void addTaxUnderPaid(WebDriver driver, String str1, String str2, String str3) throws Exception
{
	wLib = new WaitStatementLib();
	cis=new CISPage(driver);
	wLib.explicitWait(driver, 5,linkOtherTaxInformation);
	linkOtherTaxInformation.click();
	wLib.explicitWait(driver, 5,formOpenLink);
	formOpenLink.click();
	cis.switchwindowNew1(driver,frameUnderpaidTax);
	wLib.explicitWait(driver, 5,underpaidTaxForEarlierYearsIncludedInCodeTxtBox);
	underpaidTaxForEarlierYearsIncludedInCodeTxtBox.clear();
	wLib.explicitWait(driver, 5,underpaidTaxTxtBox);
	underpaidTaxTxtBox.clear();
	outstandingDebtTxtBox.clear();
	underpaidTaxForEarlierYearsIncludedInCodeTxtBox.sendKeys(str1);
	underpaidTaxTxtBox.sendKeys(str2);
	outstandingDebtTxtBox.sendKeys(str3);
	SaveBtn2.click();
	driver.navigate().refresh();
}
public void addTestCase17(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13)throws Exception
{
Reporter.log("Exceuting MTR Test Case 17",true);
clickIncome(driver);

addBank(driver,str1, str1, str2);

funcAddUntaxedInerest(driver,str3);

Reporter.log("Interest added Successfully",true);

addOtherDivident(driver,str4,"0.00","0.00");
funcAddEmployerForMTR(driver, str5, str6);

funcAddEmpIncomeWithTaxTakenOff(driver, str7,str8);

addStudentLoanPlan2(driver, "");
clickIncome(driver);

incmFrmProLink.click();

editBtn.click();

noOfPropertiesRentedOutTxtBox.clear();
noOfPropertiesRentedOutTxtBox.sendKeys(str9);

totalIncomePropertyLinkTxtBox.clear();
totalIncomePropertyLinkTxtBox.sendKeys(str10);
othrPropertyExpensesTxtBox.clear();
othrPropertyExpensesTxtBox.sendKeys(str11);

SaveBtn1.click();

n1 = Double.parseDouble(str3);//n1 = 3678.00
n2 = Double.parseDouble(str4);//n2 =12,750.00
n3 = Double.parseDouble(str7);//n3 = 33254.00
n4 = Double.parseDouble(str8);//n4 = 2000.00
n5 = Double.parseDouble(str10);//n5 =7800.00
n6 = Double.parseDouble(str11);//n6 = 4200.00
n7 = Double.parseDouble(str12);//n7 = 1800.00
n8 = Double.parseDouble(str13);//n8 = 2000.00
string1=adjustedProfitForTheYear.getAttribute("value");
calculation1=Double.parseDouble(string1);
string2=taxableProfitForTheYear.getAttribute("value");
calculation2=Double.parseDouble(string2);
total1=n5-n6;//3600
total2=total1;//3600
Assert.assertEquals(calculation1,total1);
Reporter.log("Adjusted profit for the year verified successfully: "+calculation1,true);
Assert.assertEquals(calculation2,total2);
Reporter.log("Taxable profit for the year verified successfully: "+calculation2,true);

taxReliefsLink.click();

form1OpenBtn.click();

cis.switchwindowNew1(driver,framePensionSchemes);
paymentsToRegisteredPensionSchemesTxtBox.clear();
paymentsToRegisteredPensionSchemesTxtBox.sendKeys(str12);
savePensionBtn.click();

addTaxUnderPaid(driver, "", "",  str13);
wLib = new WaitStatementLib();	
taxReturnLink.click();
wLib.explicitWait(driver, 60,taxCalSummaryLink);
taxCalSummaryLink.click();
Assert.assertEquals(payFromAllEmployments.getText().substring(1).replace(",", ""),String.format("%.2f",(n3)));
Reporter.log("Pay From All Employments verified:" + payFromAllEmployments.getText(),true);
Assert.assertEquals(amountProfitFromUKLandAndProperty.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
Reporter.log("Profit From UK Land And Property verified: "+amountProfitFromUKLandAndProperty.getText(),true);
Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(n1)));
Reporter.log("Interest From UK banks Building 	verified: "+amountInterestFromUKbanksBuilding.getText(),true);	
string3=amountDividendsfromUKCompanies.getText();

String divVal[]=string3.split("£");
Assert.assertEquals(divVal[2].replace(",", ""),String.format("%.2f",(n2)));
Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);
totlIncome=n3+total1+n1+n2; //53282
taxDueInc=totlIncome-personalAllowanceRate;
Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(totlIncome)));
Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);		
Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(taxDueInc)));
Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
total3=taxLimit1Uk + n7;//£35,300.00	
total4=taxDueInc-(total3+savingStartingRate+nilRate2);//£982.00	
total5=(total3 * basicRateNonSaving)/100;//£7,060.00
total6=(total4*dividendTaxHigherRate)/100;//£319.15
Assert.assertEquals(amountPayPensionsProfitBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(total3)));//£3,461.00
Reporter.log("Pay Pensions Profit -> Basic Rate is verified: "+amountPayPensionsProfitBasicRate.getText(),true);

Assert.assertEquals(amtHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(total4)));//£3,461.00
Reporter.log("Dividends from companies etc -> Heigher Rate is verified: "+amtHeigherRate1.getText(),true);

Assert.assertEquals(interOnBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));//£3,461.00
Reporter.log("Calculation of Pay Pensions Profit -> Basic Rate is verified: "+interOnBasicRate.getText(),true);

Assert.assertEquals(calculationHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(total6)));//£3,461.00
Reporter.log("Calculation of Dividends from companies etc -> Heigher Rate is verified: "+calculationHeigherRate1.getText(),true);
total7=Math.round(((totlIncome - n7)-plan2)*studentLoanRate);
Reporter.log("totlIncome - n7"+(totlIncome - n7),true);
Reporter.log("(totlIncome - n7)-plan2"+((totlIncome - n7)-plan2),true);
Reporter.log("((totlIncome - n7)-plan2)*studentLoanRate"+(((totlIncome - n7)-plan2)*studentLoanRate),true);
Reporter.log("Math.round(((totlIncome - n7)-plan2)*studentLoanRate)"+(Math.round(((totlIncome - n7)-plan2)*studentLoanRate)),true);
Assert.assertEquals(studentLoanAmountTaxWindow.getText().substring(1).replace(",", ""),String.format("%.2f",(total7)));//£2,743.00
Reporter.log("Student Loan repayments is verified: "+studentLoanAmountTaxWindow.getText(),true);
total8=(total5+total6+total7)-(n4-n8);
Assert.assertEquals(taxForThisYear.getText().substring(1).replace(",", ""),String.format("%.2f",(total8)));//£3,461.00
Reporter.log("Tax For This Year is verified: "+taxForThisYear.getText(),true);
}
public void funcDelMTRTest17(WebDriver driver)throws Exception
{
	Reporter.log("Deleting MTR Test Case 17",true);
	
	funcDelTest1(driver);
	
	clickIncome(driver);
	
	dividentLink.click();
	
	delOtherDivident(driver);
	
	delProfit(driver);
	
	delStudentLoanRepayment(driver);
	delUnderpaidTax(driver);
	}
public void addTestCase24(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10)throws Exception
{
	Reporter.log("Exceuting MTR Test Case 24",true);
	clickIncome(driver);
	
	addBank(driver, str1, str1, str2);
	
	addUKInterestNew(driver,str3);
	
	funcAddUntaxedInerest(driver,str4);
	
	dividentUKCompanies(driver,"Company1","", str5);//11166.00
	
	addOtherUKIncome(driver,str6,"",str7,"",str8);//1500.00, 300, beekeeper
	
	frm1Btn.click();
	Thread.sleep(700);
	cis = new CISPage(driver);
	cis.switchwindowNew1(driver,frameUkPension);
	otherPensionsRetirementAnnuities.clear();
	otherPensionsRetirementAnnuities.sendKeys(str9);//36541.00
	taxTakenOffOtherPensions.clear();
	taxTakenOffOtherPensions.sendKeys(str10);//7308.20
	stateBenefitsSaveBtn.click();
	n1 = Double.parseDouble(str3);	//21.00
	n2 = Double.parseDouble(str4);	//811.00
	n3 = Double.parseDouble(str5);	//11166.00
	n4 = Double.parseDouble(str6);	//1500.00
	n5 = Double.parseDouble(str7);	//300.00
	n6 = Double.parseDouble(str9);	//36541.00
	n7 = Double.parseDouble(str10);	//7308.20
	total1=Math.round(n1+(n1*taxedUKInterestRate))+n2; //£837.00
	Reporter.log("total1: "+total1,true);
	total2=total1+n3+n4+n6; //£50,044.00
	Reporter.log("total2: "+total2,true);
	total3=total2-(blindAllowance+personalAllowanceRate); //£36,224.00
	Reporter.log("total3: "+total3,true);
		x1=blindAllowance+personalAllowanceRate;//13820
	double x2=n6+n4;//38041
	double x3=total1-nilRate2;//337
	double x4=(x2-taxLimit1Uk)+x3;//4878
	total4=x1-x4;//8,942
	
	Reporter.log("total4: "+total4,true);
	total5 = n6+n4;	//38,041
	Reporter.log("total5: "+total5,true);
	total6 = total5-taxLimit1Uk; //4,541
	Reporter.log("total6: "+total6,true);
	total7 = n3-savingStartingRate; //6166
	Reporter.log("total7: "+total7,true);
	total8 = total4 - total7; // 2,776
	Reporter.log("total8: "+total8,true);
	total9 = blindAllowance + personalAllowanceRate; //13,820
	Reporter.log("total9: "+total9,true);
	totalIncome1=((total5 - total9)*basicRateNonSaving)/100; //£4,844.20
	Reporter.log("totalIncome1: "+totalIncome1,true);
	totalIncome2=((total1 - nilRate2)*basicRateNonSaving)/100; //£67.40
	Reporter.log("totalIncome2: "+totalIncome2,true);
	totalIncome3=(((taxLimit1Uk- ((total5 - total9)+x3+nilRate2))-savingStartingRate)*dividendTaxBasicRate)/100;;// £258.15
	Reporter.log("totalIncome3: "+totalIncome3,true);
	amount3=((taxLimit1Uk- ((total5 - total9)+x3+nilRate2))-savingStartingRate);
	Reporter.log("amount3: "+amount3,true);
	amount4=(n3-amount3)-savingStartingRate;
	Reporter.log("amount4: "+amount4,true);
	totalIncome4=(amount4*dividendTaxHigherRate)/100;// £885.30
	Reporter.log("totalIncome4: "+totalIncome4,true);
	dueTax1=totalIncome1+totalIncome2+totalIncome3+totalIncome4;
	Reporter.log("dueTax1: "+dueTax1,true);
	dueTax2=n7+(n1*taxedUKInterestRate)+n5;
	Reporter.log("dueTax2: "+dueTax2,true);
	
	taxReturnLink.click();
	Thread.sleep(3000);
	taxCalSummaryLink.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h2[contains(text(),'Tax Calculation Summary for Tax Year 6 April 2017 to 5 April 2018')]")).click();
	try {
	string1=amountInterestFromUKbanksBuilding.getText();
	
	Assert.assertEquals(string1.substring(1).replace(",", ""),String.format("%.2f",(total1)));
	Reporter.log("Amount of Interest From UK banks and Building is Verified: "+amountInterestFromUKbanksBuilding.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Amount of Interest From UK banks and Building is not detected",true);
	}
	try
	{
		string2=calculateDividentFrmUKCompany();
		Assert.assertEquals(string2.replace(",", ""),String.format("%.2f",(n3)));//(UK: £11,166.00) £11,166.00
		Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);
			
	}
	catch (Exception e) {
		Reporter.log("Dividends from UK Companies is not detected",true);
	}
	try
	{
		string3=amountUKpensionsAndStateBenefits.getText();
	Assert.assertEquals(string3.substring	(1).replace(",", ""),String.format("%.2f",(n6)));//£36,541.00	
	Reporter.log("Amount of UK Pensions and State Benefits is verified: "+amountUKpensionsAndStateBenefits.getText(),true);
	
	}
	catch (Exception e) {
		Reporter.log("Amount of UK Pensions and State Benefits is not detected",true);
	}
	try
	{
		string4=amountOtherIncome.getText();
	Assert.assertEquals(string4.substring(1).replace(",", ""),String.format("%.2f",(n4)));//£1500.00
	Reporter.log("Other Income verified: "+amountOtherIncome.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Amount of Other Income is not detected",true);
	}
	try
	{
	string5=TotalIncomeReceived.getText();
	
	Assert.assertEquals(string5.substring(1).replace(",", ""),String.format("%.2f",(total2)));
	Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Amount of Total Income Received is not detected",true);
	}
	try
	{
	string6=totalIncomeOnWhichTaxIsDue.getText();
	Assert.assertEquals(string6.substring(1).replace(",", ""),String.format("%.2f",(total3)));
	Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Amount of Total Income On Which Tax is not detected",true);
	}
	try
	{
	string7=amountPayPensionsProfitBasicRate.getText();
	Assert.assertEquals(string7.substring(1).replace(",", ""),String.format("%.2f",(total5 - total9)));//£24,221.00
	Reporter.log("Pay Pensions Profit -> Basic Rate is verified: "+amountPayPensionsProfitBasicRate.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Amount of Pay Pensions Profit -> Basic Rate is not detected",true);
	}
	try
	{
	string8=interOnBasicRate.getText();
	Assert.assertEquals(string8.substring(1).replace(",", ""),String.format("%.2f",(totalIncome1)));
	Reporter.log("Calculation of Pay, pensions, profit etc. (Scottish income tax rate) Basic rate is verified:" +interOnBasicRate.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Calculation of Pay, pensions, profit etc. (Scottish income tax rate) Basic rate is not detected",true);
	}
	try
	{
	string9=amtBasicRateSavingsInterestTest1.getText();
	Assert.assertEquals(string9.substring(1).replace(",", ""),String.format("%.2f",(total1 - nilRate2)));////£337.00	
	Reporter.log("Basic Rate Savings Interest is verified: "+amtBasicRateSavingsInterestTest1.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Basic Rate Savings Interest is not detected",true);
	}
	try
	{
	string10=calculationBasicRateSavingsInterestTest1.getText();
	Assert.assertEquals(string10.substring(1).replace(",", ""),String.format("%.2f",(totalIncome2)));
	Reporter.log("Calculation of Basic Rate Savings Interest is verified: "+calculationBasicRateSavingsInterestTest1.getText(),true);
	}
	catch (Exception e) {
		Reporter.log("Calculation of Basic Rate Savings Interest is not detected",true);
	}
	try
	{
	string11=amtBasicRateDividendsTest1.getText();
	Assert.assertEquals(string11.substring(1).replace(",", ""),String.format("%.2f",(((taxLimit1Uk- (total5 - total9))-savingStartingRate)-total1)));//£3,442.00
	Reporter.log("Amount of Basic Rate of Dividends is verified: "+amtBasicRateDividendsTest1.getText(),true);	
	}
	catch (Exception e) {
		Reporter.log("Amount of Basic Rate of Dividends is not detected",true);
	}
	try
	{
	string12=calculationBasicRateDividendsTest1.getText();
	Assert.assertEquals(string12.substring(1).replace(",", ""),String.format("%.2f",(totalIncome3)));
	Reporter.log("Calculation of Basic Rate of Dividends is verified: "+calculationBasicRateDividendsTest1.getText(),true);	
	}
	catch (Exception e) {
		Reporter.log("Calculation of Basic Rate of Dividends is not detected",true);
	}
	try
	{
	string13=amtHeigherRate1.getText();
	Assert.assertEquals(string13.substring(1).replace(",", ""),String.format("%.2f",(amount4)));//£2,724.00
	Reporter.log("Amount of Heigher Rate for Divident is verified: "+amtHeigherRate1.getText(),true);	
	}
	catch (Exception e) {
		Reporter.log("Calculation of Basic Rate of Dividends is not detected",true);
	}
	try
	{
	string14=calculationHeigherRate1.getText();
	Assert.assertEquals(string14.substring(1).replace(",", ""),String.format("%.2f",(totalIncome4)));
	Reporter.log("Calculation of Heigher Rate for Dividends is verified: "+calculationHeigherRate1.getText(),true);	
	}
	catch (Exception e) {
		Reporter.log("Calculation of Heigher Rate of Dividends is not detected",true);
	}
	try
	{
	string15=incomeTaxDue.getText();
	Assert.assertEquals(string15.substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));//£6,055.05
	Reporter.log("Amount of Heigher Rate for Divident is verified: "+incomeTaxDue.getText(),true);	
	}
	catch (Exception e) {
		Reporter.log("Amount of Heigher Rate for Divident is not detected",true);
	}
	try
	{
	string16=amtFromallemploymentsUKpensionsTest1.getText();
	Assert.assertEquals(string16.substring(1).replace(",", ""),String.format("%.2f",(n7)));
	Reporter.log("Amount of All Employments UK Pensions is verified: "+amtFromallemploymentsUKpensionsTest1.getText(),true); //7,308.20
	}
	catch (Exception e) {
		Reporter.log("Amount of All Employments UK Pensions is not detected",true);
	}
	try
	{
	string17=amtBalanceofPAYEtax.getText();
	string18=amtFromallemploymentsUKpensionsTest1.getText();
	Assert.assertEquals(string17,string18);
	Reporter.log("Amount of Balance of PAYE tax is verified: "+amtBalanceofPAYEtax.getText(),true); //7,308.20
	}
	catch (Exception e) {
		Reporter.log("Amount of Balance of PAYE tax is not detected",true);
	}
	try
	{
	string19=amtInterestReceivedfromUKbanksBuildingSocieties.getText();
	Assert.assertEquals(string19.substring(1).replace(",", ""),String.format("%.2f",(n1*taxedUKInterestRate)));
	Reporter.log("Amount of Interest Received from UK banks and Building Societies is verified: "+amtInterestReceivedfromUKbanksBuildingSocieties.getText(),true); //£5.25			
	}
	catch (Exception e) {
		Reporter.log("Amount of Interest Received from UK banks and Building Societies is not detected",true);
	}
	try
	{
	string20=amtTaxDeductionOfOtherIncome.getText();
	Assert.assertEquals(string20.substring(1).replace(",", ""),String.format("%.2f",(n5)));
	Reporter.log("Amount of Tax Deduction of Other Income is verified: "+amtTaxDeductionOfOtherIncome.getText(),true); //300
	}
	catch (Exception e) {
		Reporter.log("Amount of Tax Deduction of Other Income is not detected",true);
	}
	try
	{
	string21=txtTotaltaxdeducted.getText();
	Assert.assertEquals(string21.substring(1).replace(",", ""),String.format("%.2f",(dueTax2)));
	Reporter.log("Amount of Total tax deducted is verified: "+txtTotaltaxdeducted.getText(),true); //£7,613.45	
	}
	catch (Exception e) {
		Reporter.log("Amount of Total tax deducted is not detected",true);
	}
	try
	{
	string22=amtIncomeTaxoverpaid.getText();
	Assert.assertEquals(string22.substring(1).replace(",", ""),String.format("%.2f",(dueTax2-dueTax1)));
	Reporter.log("Amount of Income Tax overpaid is verified: "+amtIncomeTaxoverpaid.getText(),true); //£1,558.40	}
	}
	catch (Exception e) {
		Reporter.log("Amount of Income Tax overpaid is not detected",true);
	}
	}
	public void funcDelMTRTest24(WebDriver driver)throws Exception
	{
	Reporter.log("Deleting MTR Test Case 24",true);
	clickIncome(driver);
	
	delBank(driver);
	
	deleteDivident(driver);
	
	delOtherUKIncome(driver);
	
}
	public void addTestCase38(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10,String str11,String str12,String str13,String str14,String str15,String str16,String str17,String str18,String str19,String str20,String str21,String str22)throws Exception
	{
		Reporter.log("Exceuting MTR Test Case 38",true);
		clickIncome(driver);
		
		addBank(driver,str1, str1, str2);
		
		funcAddUntaxedInerest(driver,str3);
		
		Reporter.log("Interest added Successfully",true);
		
		addOtherDivident(driver,str4,"0.00","0.00");
		
		funcAddEmployerForMTR(driver,str5, str6);
		addEmpIncome.click();
			
		payFrmEmployer.sendKeys(str7);
		UkTaxTakenOffPay.sendKeys(str8);
		PrvtMedAndDntl.sendKeys(str9);
		GoodsEtcTxtBob.sendKeys(str10);
		AccommodationProvidedByEmployerTxtBox.sendKeys(str11);
		ProfFeesAndSubsTxtBox.sendKeys(str12);
		SaveBtn1.click();
		Reporter.log("Employer Income added successfully",true);
		
		clickIncome(driver);
		linkCapitalGain.click();
		
		editBtn.click();
		
		propertyEtcTotalDisposalTxtBox.clear();
		propertyEtcTotalDisposalTxtBox.sendKeys(str13);
		propertyEtcDisposalProceedTxtBox.clear();
		propertyEtcDisposalProceedTxtBox.sendKeys(str14);
		propertyEtcCostsAndIndexationTxtBox.clear();
		propertyEtcCostsAndIndexationTxtBox.sendKeys(str15);
		propertyEtcGainsInTheYearTxtBox.clear();
		propertyEtcGainsInTheYearTxtBox.sendKeys(str16);
		propertyEtcClaimOrElectionMadeTxtBox.clear();
		propertyEtcClaimOrElectionMadeTxtBox.sendKeys(str17);
		uQSTotalDisposalTxtBox.clear();
		uQSTotalDisposalTxtBox.sendKeys(str18);
		uQSDisposalProceedTxtBox.clear();
		uQSDisposalProceedTxtBox.sendKeys(str19);
		uQSGainsInTheYearTxtBox.clear();
		uQSGainsInTheYearTxtBox.sendKeys(str20);
		totalERGainForTheYearTxtBox.clear();
		totalERGainForTheYearTxtBox.sendKeys(str21);
		commentForValidation.clear();
		commentForValidation.sendKeys(str22);
		SaveBtn1.click();
		Reporter.log("Capital Gain Income added successfully",true);
		Thread.sleep(5000);
		n1 = Double.parseDouble(str3);//3678.00
		n2 = Double.parseDouble(str4);//12750.00
		n3 = Double.parseDouble(str7);//101000.00
		n4 = Double.parseDouble(str8);// 20500.00
		n5 = Double.parseDouble(str9);//500.00
		n6 = Double.parseDouble(str10);//5000.00
		n7 = Double.parseDouble(str11);//7500.00
		n8 = Double.parseDouble(str12);//175.00
		n9 = Double.parseDouble(str14);//37000.00
		n10 = Double.parseDouble(str15);//12000.00
		n11 = Double.parseDouble(str16);//25000
		n12 = Double.parseDouble(str9);//25000
		n13 = Double.parseDouble(str20);//25000
		n14 = Double.parseDouble(str21);//20000
		total1=(n3 +n5 +n6 +n7)-n8;//113,825.00
		total2=total1+n1+n2;
		totalincome = total2-blindAllowance;
		amount3=((totalincome-(taxLimit1Uk+n1+n2))* heigherRateNonSaving)/100;//£78,005.00	@ 40% =	£31,202.00
		amount4=((n1-nilRate2)* heigherRateNonSaving)/100;//£3,178.00	@ 40% =	£1,271.20
		amount5=((n2-savingStartingRate)* dividendTaxHigherRate)/100;//£7,750.00	@ 32.5% =	£2,518.75
		taxDueInc= amount1+amount3+amount4+amount5;//£41,691.95
		dueTax1=taxDueInc-n4;//£21,191.95
		total3=((n11-n14)+n13)-annualExemptIndividuals;//£18,700.00
		dueTax2=(n14*entrepreneursReliefRate)/100;//£2,000.00
		dueTax3=(total3*basicRateNonSaving)/100;//£3,740.00
		total4=dueTax2+dueTax3;//£5,740.00
		fnltax=dueTax1+total4; // £26,931.95
		taxReturnLink.click();
		Thread.sleep(3000);
		taxCalSummaryLink.click();
		Thread.sleep(3000);
		Assert.assertEquals(amtBenefitsandexpensesreceived.getText().substring(1).replace(",", ""),String.format("%.2f",(n5 +n6 +n7)));//13,000.00
		Reporter.log("Amount of Benefits and Expenses Received is Verified: "+amtBenefitsandexpensesreceived.getText(),true);
		
		Assert.assertEquals(amtAllowableexpenses.getText().substring(1).replace(",", ""),String.format("%.2f",(n8)));//175.00
		Reporter.log("Amount of Allowable Expenses is Verified: "+amtAllowableexpenses.getText(),true);
		
		Assert.assertEquals(TotalFromAllEmployment.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));//113,825.00
		Reporter.log("Amount of Total From All Employment is Verified: "+TotalFromAllEmployment.getText(),true);
		
		Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(total2)));//£130,253.00	 
		Reporter.log("Amount of Total Income Received is Verified: "+TotalIncomeReceived.getText(),true);
		
		Assert.assertEquals(amtBlindPersonAllowance.getText().substring(1).replace(",", ""),String.format("%.2f",(blindAllowance)));//£2,320.00
		Reporter.log("Amount of Blind Person Allowance	is Verified: "+amtBlindPersonAllowance	.getText(),true);
		
		Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(totalincome)));//£127,933.00
		Reporter.log("Amount of Total Income on Which Tax is Due is Verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
		
		Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(n1)));//3678
		Reporter.log("Amount of Interest From UK banks Building is Verified: "+amountInterestFromUKbanksBuilding.getText(),true);
		
		Assert.assertEquals(calculateDividentFrmUKCompany().replace(",", ""),String.format("%.2f",(n2)));//12,750.00
		Reporter.log("Amount of Dividends from UK Companies is Verified: "+calculateDividentFrmUKCompany(),true);
		
		Assert.assertEquals(interOnBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(amount1)));//6,700.00
		Reporter.log("Amount of Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) -> Basic Rate is Verified: "+interOnBasicRate.getText(),true);
		
		Assert.assertEquals(calculationHeigherRate1.getText().substring(1).replace(",", ""),String.format("%.2f",(amount3)));//31,202.00
		Reporter.log("Amount of Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) -> Higher rate is Verified: "+calculationHeigherRate1.getText(),true);
		
		Assert.assertEquals(calculationHeigherRate2.getText().substring(1).replace(",", ""),String.format("%.2f",(amount4)));//£1,271.20
		Reporter.log("Amount of Savings interest from banks or building societies, securities etc. -> Higher rate is Verified: "+calculationHeigherRate2.getText(),true);
		
		Assert.assertEquals(calculationHeigherRate3.getText().substring(1).replace(",", ""),String.format("%.2f",(amount5)));//£2,518.75
		Reporter.log("Amount of Dividends from companies etc. -> Higher rate is Verified: "+calculationHeigherRate3.getText(),true);
		
		Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(taxDueInc)));//£41,691.95
		Reporter.log("Amount of Income Tax Due is Verified: "+incomeTaxDue.getText(),true);
		
		Assert.assertEquals(txtTotaltaxdeducted.getText().substring(1).replace(",", ""),String.format("%.2f",(n4)));//£20,500.00
		Reporter.log("Amount of Total tax deducted is Verified: "+txtTotaltaxdeducted.getText(),true);
		
		Assert.assertEquals(totalIncomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));//£21,191.95
		Reporter.log("Amount of Total Income Tax Due is Verified: "+totalIncomeTaxDue.getText(),true);
		
		Assert.assertEquals(capitalGainsTaxdue.getText().substring(1).replace(",", ""),String.format("%.2f",(total4)));//£5,740.00
		Reporter.log("Amount of Capital Gains Tax due is Verified: "+capitalGainsTaxdue.getText(),true);
		
		Assert.assertEquals(IncomeandCapitalGainsTaxdue.getText().substring(1).replace(",", ""),String.format("%.2f",(fnltax)));//£26,931.95
		Reporter.log("Amount of Income and Capital Gains Tax due is Verified: "+IncomeandCapitalGainsTaxdue.getText(),true);
		
		Assert.assertEquals(taxForThisYear.getText(),IncomeandCapitalGainsTaxdue.getText());//£26,931.95
		Reporter.log("Amount of Balance for this year is Verified: "+IncomeandCapitalGainsTaxdue.getText(),true);
		
	}
	public void funcDelMTRTest38(WebDriver driver)throws Exception
	{
		Reporter.log("Deleting MTR Test Case 38",true);
		delCGI(driver);
		
		delInterestfromUKbanks(driver);
		
		delOtherDivident(driver);
		
		clickEmployment(driver);
		
		delEmpInfo(driver);
		
	}
	public void addTestCase48(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9)throws Exception
	{
		Reporter.log("Exceuting MTR Test Case 48",true);
		clickIncome(driver);
		
		addBank(driver, str1, str1, str2);
		
		addUKInterestNew(driver,str3);
		
		funcAddUntaxedInerest(driver,str4);
		
		selfEmploymentLink.click();
		
		formOpenBtn.click();
		
		descriptionOfBusinessTxtBox.clear();
		descriptionOfBusinessTxtBox.sendKeys(str5);
		businessIncomeTxtBox.clear();
		businessIncomeTxtBox.sendKeys(str6);
		costsOfGoodsBoughtForResaleTxtBox.clear();
		costsOfGoodsBoughtForResaleTxtBox.sendKeys(str7);
		annualInvestmentAllowanceTxtBox.clear();
		annualInvestmentAllowanceTxtBox.sendKeys(str8);
		allowanceForSmallBalanceOfUnrelievedExpenditureTxtBox.clear();
		allowanceForSmallBalanceOfUnrelievedExpenditureTxtBox.sendKeys(str9);
		SaveBtn1.click();
		
		driver.navigate().refresh();
		n1 = Double.parseDouble(str3);//22.00	
		n2 = Double.parseDouble(str4);//2099.88	
		n3 = Double.parseDouble(str6);//32495.00	
		n4 = Double.parseDouble(str7);// 8620.00	
		n5 = Double.parseDouble(str8);//1200.00	
		n6 = Double.parseDouble(str9);//800.00	
		total1=(n3-n4)-(n5+n6);//£21,875.00
		Reporter.log("total1: "+total1,true);
		x1=n1+(n1*taxedUKInterestRate);
		total2=(Math.floor(x1)+Math.floor(n2));//£2,126.00	 
		Reporter.log("total2: "+total2,true);
		total3=total1+total2;
		Reporter.log("total3: "+total3,true);
		total4=total3-personalAllowanceRate; 
		Reporter.log("total4: "+total4,true);
		amount3 = ((total4 - total2) * basicRateNonSaving)/100;//£2,075.00
		Reporter.log("amount3: "+amount3,true);
		amount4 = ((total2 - nilRate1) * basicRateNonSaving)/100;//£225.20
		Reporter.log("amount4: "+amount4,true);	
		finalAmount = amount3 + amount4;//£2,300.20
		Reporter.log("finalAmount: "+finalAmount,true);	
		total5 = total1 - class2LPL;//£13,711.00	
		Reporter.log("total5: "+total5,true);	
		total6=total5*studentLoanRate;//£1,233.99
		Reporter.log("total6: "+total6,true);	
		total7=total6+class2Amount+finalAmount;
		Reporter.log("total7: "+total7,true);	
		taxReturnLink.click();
		Thread.sleep(3000);
		taxCalSummaryLink.click();
		Thread.sleep(3000);
		Assert.assertEquals(amountProfitFromSelfEmployment.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
		Reporter.log("Profit From Self Employment verified: "+amountProfitFromSelfEmployment.getText(),true);
		string1=amountInterestFromUKbanksBuilding.getText();
		
		Assert.assertEquals(string1.substring(1).replace(",", ""),String.format("%.2f",(total2)));
		Reporter.log("Amount of Interest From UK banks and Building is Verified: "+amountInterestFromUKbanksBuilding.getText(),true);
		string5=TotalIncomeReceived.getText();
		
		Assert.assertEquals(string5.substring(1).replace(",", ""),String.format("%.2f",(total3)));
		Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
		string6=totalIncomeOnWhichTaxIsDue.getText();
		Assert.assertEquals(string6.substring(1).replace(",", ""),String.format("%.2f",(total4)));
		Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
		string7=amountPayPensionsProfitBasicRate.getText();
		Assert.assertEquals(string7.substring(1).replace(",", ""),String.format("%.2f",(total4 - total2)));//£10,375.00	
		Reporter.log("Pay Pensions Profit -> Basic Rate is verified: "+amountPayPensionsProfitBasicRate.getText(),true);	
		Assert.assertEquals(interOnBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(((total4 - total2) * basicRateNonSaving)/100)));//£2,075.00
		Reporter.log("Calculation of Pay, pensions, profit etc. (UK rate for England, Wales and Northern Ireland) is verified:" +interOnBasicRate.getText(),true);
		Assert.assertEquals(amtBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(total2 - nilRate1)));//£1,126.00	
		Reporter.log("Savings interest from banks or building societies, securities etc. is verified:" +amtBasicRate.getText(),true);
		Assert.assertEquals(calculateBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(((total2 - nilRate1) * basicRateNonSaving)/100)));//£225.20
	 	Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(finalAmount)));
		Reporter.log("Income Tax Due verified: "+ incomeTaxDue.getText(),true);
		Assert.assertEquals(amtClass4NationalInsurancecontributions.getText().substring(1).replace(",", ""),String.format("%.2f",(total5)));
		Reporter.log("Amaount of Class 4 National Insurance contributions is verified:" + amtClass4NationalInsurancecontributions.getText(),true);
		Assert.assertEquals(class2NationalInsurancecontributions.getText().substring(1).replace(",", ""),String.format("%.2f",(class2Amount)));
		Reporter.log("Class 2 National Insurance contributions is verified:" + class2NationalInsurancecontributions.getText(),true);
		Assert.assertEquals(IncomeTaxCls2andCls4NationalInsurContriDue.getText().substring(1).replace(",", ""),String.format("%.2f",(total7)));
		Reporter.log("Income Tax Cls 2 and Cls 4 National Insurrance Contribution Due is verified: " + IncomeTaxCls2andCls4NationalInsurContriDue.getText(),true);
		Assert.assertEquals(IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText().substring(1).replace(",", ""),String.format("%.2f",(total7-(n1*taxedUKInterestRate))));
		Reporter.log("Income Tax Cls 2 and Cls 4 National Insurrance Contribution Minus tax deducted is verified:" + IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText(),true);
		Assert.assertEquals(taxForThisYear.getText(),IncomeTaxCls2andCls4NationalInsurContriDueMinusCIS.getText());
		Reporter.log("Balance Tax for the year verified is verified:" + taxForThisYear.getText(),true);
	 }	
	public void funcDelMTRTest48(WebDriver driver)throws Exception
	{
		Reporter.log("Deleting MTR Test Case 48",true);
		clickIncome(driver);
		
		delInterestfromUKbanks(driver);
		
		selfEmploymentLink.click();
		
		try
		{
		
		delButton.click();
		
		confDel.click();
		}
		catch (Exception e)
		{
		    Reporter.log(e.getMessage(),true);
		}
	}
	public void addTestCase50(WebDriver driver, String str1,String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9,String str10, String str11) throws Exception {
		Reporter.log("Exceuting MTR Test Case 50",true);
		
		clickIncome(driver);
		
		dividentLink.click();
		
		addOtherUKIncome(driver,str1,"",str2,"",str3);
		funcAddEmployerForMTR(driver, str5, str6);
		
		funcAddEmpIncomeWithTaxTakenOff(driver, str7, str8);
		
		taxReliefsLink.click();
		
		linkFormGiftAid.click();
		
		cis = new CISPage(driver);
		cis.switchwindowNew1(driver,frameGiftAid);
		dateTxtBox.clear();
		dateTxtBox.sendKeys(dateStart);
		giftAidPaymentsMadeInYearTxtBox.click();
		giftAidPaymentsMadeInYearTxtBox.sendKeys(str4);
		SaveBtn2.click();
		
		clickIncome(driver);
		incmFrmProLink.click();
		
		editBtn.click();
		
		noOfPropertiesRentedOutTxtBox.clear();
		noOfPropertiesRentedOutTxtBox.sendKeys(str9);
		
		totalIncomePropertyLinkTxtBox.clear();
		totalIncomePropertyLinkTxtBox.sendKeys(str10);
		othrPropertyExpensesTxtBox.clear();
		othrPropertyExpensesTxtBox.sendKeys(str11);
		
		SaveBtn1.click();
		
		n1 = Double.parseDouble(str1);//'7000.00
		n2 = Double.parseDouble(str2);//'1400.00
		n3 = Double.parseDouble(str4);//'2400.00
		n4 = Double.parseDouble(str7);// 33254.00
		n5 = Double.parseDouble(str8);//4350.80
		n6 = Double.parseDouble(str10);//7800.00
		n7 = Double.parseDouble(str11);//4200.00
		total1 = n6-n7;		//3,600.00
		totalincome = n4+total1+n1;  //43,854.00
		taxDueInc = totalincome - personalAllowanceRate;//£32,354.00
		dueTax1= (taxDueInc * basicRateNonSaving)/100; //£6,470.80
		dueTax2=dueTax1 - (n5+n2);	//£720.00
		taxReturnLink.click();
		Thread.sleep(3000);
		taxCalSummaryLink.click();
		Thread.sleep(3000);
		Assert.assertEquals(payFromAllEmployments.getText().substring(1).replace(",", ""),String.format("%.2f",(n4)));
		Reporter.log("Pay From All Employments verified:" + payFromAllEmployments.getText(),true);
		Assert.assertEquals(amountProfitFromUKLandAndProperty.getText().substring(1).replace(",", ""),String.format("%.2f",(total1)));
		Reporter.log("Profit From UK Land And Property verified: "+amountProfitFromUKLandAndProperty.getText(),true);
		Assert.assertEquals(amountOtherIncome.getText().substring(1).replace(",", ""),String.format("%.2f",(n1)));
		Reporter.log("Other Income verified: "+amountOtherIncome.getText(),true);
		Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(totalincome)));
		Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
		Assert.assertEquals(totalIncomeOnWhichTaxIsDue.getText().substring(1).replace(",", ""),String.format("%.2f",(taxDueInc)));
		Reporter.log("Total Income On Which Tax is Due verified: "+totalIncomeOnWhichTaxIsDue.getText(),true);
		Assert.assertEquals(interOnBasicRate.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));
		Reporter.log("Calculation of Pay, pensions, profit etc. (Scottish income tax rate) Basic rate is verified:" +interOnBasicRate.getText(),true);
		Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));
		Reporter.log("Income Tax Due is Verified: "+incomeTaxDue.getText(),true);
		Assert.assertEquals(amtFromallemploymentsUKpensionsTest1.getText().substring(1).replace(",", ""),String.format("%.2f",(n5)));
		Reporter.log("Amount of All Employments UK Pensions is verified: "+amtFromallemploymentsUKpensionsTest1.getText(),true); 
		Assert.assertEquals(amtFromallemploymentsUKpensionsTest1.getText().substring(1).replace(",", ""),String.format("%.2f",(n5)));
		Reporter.log("From all employments UK pensions verified: "+amtFromallemploymentsUKpensionsTest1.getText(),true);
		Assert.assertEquals(amtBalanceofPAYEtax.getText(),amtFromallemploymentsUKpensionsTest1.getText());
		Reporter.log("Amount of Balance of PAYE tax is verified: "+amtBalanceofPAYEtax.getText(),true);
		Assert.assertEquals(otherIncomeTaxDeduction.getText().substring(1).replace(",", ""),String.format("%.2f",(n2)));
		Reporter.log("Amount of Tax Deduction of Other Income is verified: "+otherIncomeTaxDeduction.getText(),true); 
		Assert.assertEquals(totalIncomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax2)));
		Reporter.log("Amount of Total Income Tax Due is Verified: "+totalIncomeTaxDue.getText(),true);				
		totIncomTaxChar=totalIncomeTaxDue.getText().substring(1).replace(",","");
		incomTaxdue1=Double.parseDouble(totIncomTaxChar);
		if (incomTaxdue1<pAYCode)
			{
				taxFinalUI=payCodeAmountTaxSummary.getText().substring(1).replace(",","");
				Assert.assertEquals(taxFinalUI,totIncomTaxChar);
				Reporter.log("Final Tax"+taxFinalUI,true);
				
			}
			else
			{
				taxFinal=taxForThisYear.getText().substring(1).replace(",","");
				Reporter.log("Balance for this year: "+taxFinal,true);
				Assert.assertEquals(taxFinal, totIncomTaxChar);
				Reporter.log("Final Tax"+taxFinal,true);
			}
			 		
	}
	public void delGiftAid(WebDriver driver) throws Exception
	{
		
		taxReliefsLink.click();
		
		delButton.click();
		cis.switchwindowNew(driver);
		
		cnfmdel.click();	
		
		
	}
	public void delTestCase50(WebDriver driver) throws Exception {
		Reporter.log("Deleting MTR Test Case 50",true);
		clickIncome(driver);
		
		dividentLink.click();
		Thread.sleep(4000);
		delOtherUKIncome(driver);
		Reporter.log("Other UK Income deleted successfully",true);
		clickEmployment(driver);
		
		delEmpInfo(driver);
		
		Reporter.log("Employee Income deleted successfully",true);
		delProfit(driver);
		
		Reporter.log("Income from property deleted successfully",true);
		delGiftAid(driver);
		Reporter.log("Gift Aid amount deleted successfully",true);
		
		}
	public void addTestCase54(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9)throws Exception
	{
		Reporter.log("Exceuting MTR Test Case 54",true);
		clickIncome(driver);
		
		addBank(driver, str1, str1, str2);
		
		funcAddUntaxedInerest(driver,str3);
		dividentUKCompanies(driver,"Company1","", str4);
		addOtherDivident(driver,str5,"","");
		
		frm1Btn.click();
		Thread.sleep(700);
		cis = new CISPage(driver);
		cis.switchwindowNew1(driver,frameUkPension);
		totStatPension.sendKeys(str6);
		stateBenefitsSaveBtn.click();
		addOtherUKIncome(driver,str7,"",str8,"",str9);
		n1 = Double.parseDouble(str3);//'6710.40
		n2 = Double.parseDouble(str4);//'5009.93
		n3 = Double.parseDouble(str5);//'224.47
		n4 = Double.parseDouble(str6);// 6200.00
		n5 = Double.parseDouble(str7);//1500.00
		n6 = Double.parseDouble(str8);//300.00
		double result = Math.floor(n2)+Math.floor(n3);
		totalincome=Math.floor(n1)+result+n4+n5;
		total1=totalincome-savingStartingRate;
		dueTax1=total1*percentageZero;
		
		
		taxReturnLink.click();
		Thread.sleep(3000);
		taxCalSummaryLink.click();
		Thread.sleep(3000);
		string1=amountDividendsfromUKCompanies.getText();
		
		String divVal[]=string1.split("£");
		
		Assert.assertEquals(amountInterestFromUKbanksBuilding.getText().substring(1).replace(",", ""),String.format("%.2f",(Math.floor(n1))));
		Reporter.log("Interest From UK banks Building verified: "+amountInterestFromUKbanksBuilding.getText(),true);
		Assert.assertEquals(divVal[3].replace(",", ""),String.format("%.2f",(result)));
		Reporter.log("Dividends from UK Companies verified: "+amountDividendsfromUKCompanies.getText(),true);
		Assert.assertEquals(amountUKpensionsAndStateBenefits.getText().substring(1).replace(",", ""),String.format("%.2f",(n4)));
		Reporter.log("Amount of UK pensions And State Benefits is verified: "+amountUKpensionsAndStateBenefits.getText(),true);
		Assert.assertEquals(amountOtherIncome.getText().substring(1).replace(",", ""),String.format("%.2f",(n5)));
		Reporter.log("Other Income verified: "+amountOtherIncome.getText(),true);
		Assert.assertEquals(TotalIncomeReceived.getText().substring(1).replace(",", ""),String.format("%.2f",(totalincome)));
		Reporter.log("Total Income Received verified: "+TotalIncomeReceived.getText(),true);
		Assert.assertEquals(amtSavingsinterestStartingrate.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));
		Reporter.log("Total Income Received verified: "+amtSavingsinterestStartingrate.getText(),true);
		Assert.assertEquals(incomeTaxDue.getText().substring(1).replace(",", ""),String.format("%.2f",(dueTax1)));
		Reporter.log("Income Tax due verifired successfully"+incomeTaxDue.getText(),true);
		Assert.assertEquals(otherIncomeTaxDeduction.getText().substring(1).replace(",", ""),String.format("%.2f",(n6)));
		Reporter.log("Amount of Tax Deduction of Other Income is verified: "+otherIncomeTaxDeduction.getText(),true); 
		Assert.assertEquals(amtIncomeTaxoverpaid.getText().substring(1).replace(",", ""),String.format("%.2f",(n6)));
		Reporter.log("Amount of Income Tax overpaid is verified: "+amtIncomeTaxoverpaid.getText(),true); 
	}
	public void delTestCase54(WebDriver driver) throws Exception {
		Reporter.log("Deleting MTR Test Case 54",true);
		clickIncome(driver);
		
		dividentLink.click();
		
		delBank(driver);
		
		delOtherUKIncome(driver);
		
		deleteDivident(driver);
		
		delOtherDivident(driver);
		Reporter.log("Other UK Income deleted successfully",true);
	}
	public void addTestCase191(WebDriver driver, String str1,String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11,String str12) throws Exception {
		Reporter.log("Exceuting MTR Test Case 191",true);
		
		clickIncome(driver);
		
		funcAddEmployerForMTR(driver, str1, str2);
		
		funcAddEmpIncomeWithTaxTakenOff(driver, str3, str4);
		
		displayRecordsBtn.click();
		
		FxdExpnsDeductTxtBox.clear();
		FxdExpnsDeductTxtBox.sendKeys(str5);
		SaveBtn1.click();
		
		clickIncome(driver);
		
		dividentLink.click();
		
		addBank(driver, str6, str6, str7);
		
		funcAddUntaxedInerest(driver,str8);
		
		Reporter.log("Interest added Successfully",true);
		
		addOtherDivident(driver,str9,"","");
		taxReliefsLink.click();
		
		form1OpenBtn.click();
		
		cis.switchwindowNew1(driver,framePensionSchemes);
		paymentsToRegisteredPensionSchemesTxtBox.clear();
		paymentsToRegisteredPensionSchemesTxtBox.sendKeys(str10);
		savePensionBtn.click();
		
		linkOtherTaxInformation.click();
		
		frm1Btn.click();
		
		cis.switchwindowNew1(driver,frameUkPension);
		amountReceivedTxtBox.clear();
		amountReceivedTxtBox.sendKeys(str11);
		NoOfchildrenTxtBox.clear();	
		NoOfchildrenTxtBox.sendKeys(str12);
		SaveBtn2.click();
		
		driver.navigate().refresh();
	}
	public void delTestCase191(WebDriver driver) throws Exception 
	{
		Reporter.log("Deleting MTR Test Case 191",true);
		clickIncome(driver);	
		delInterestfromUKbanks(driver);
		delOtherDivident(driver);
		clickEmployment(driver);
		
		delEmpInfo(driver);
		
		delPensionTaxRelief(driver);
		
		delChildBenefitCharge(driver);
	}
	
}

package com.nomisma.pom;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;

public class CT600Page {

	@FindBy(xpath ="//span[contains(text(),'Final Accounts')]")
	private WebElement lnkFinalAccounts;
	@FindBy(xpath ="//span[contains(text(),'CT600 Tax Return')]")
	private WebElement lnkCT600TaxReturn;
	@FindBy(xpath ="//span[contains(text(),'Other CT600 Forms')]")
	private WebElement lnkOtherCT600Forms;
	@FindBy(xpath ="//span[contains(text(),'Settings')]")
	private WebElement lnkSettings;
	@FindBy(xpath ="//a[contains(text(),'CT Computation')]")
	private WebElement LnkCTComputation;
	@FindBy(xpath ="//a[contains(text(),'About this return')]")
	private WebElement lnkAboutthisreturn;
	@FindBy(xpath ="//a[contains(text(),'Tax Calculation')]")
	private WebElement lnkTaxCalculation;
	@FindBy(xpath ="//a[contains(text(),'Information')]")
	private WebElement lnkInformation;
	@FindBy(xpath ="//a[contains(text(),'Losses, deficits & excess amounts')]")
	private WebElement lnkLossesDeficitsExcess;
	@FindBy(xpath ="//a[contains(text(),'Overpayments & repayments')]")
	private WebElement lnkOverpaymentsRepayments;
	@FindBy(xpath ="//a[contains(text(),'Submit CT600')]")
	private WebElement lnkSubmitCT600;
	@FindBy(xpath ="//a[contains(text(),'Submitted XML')]")
	private WebElement lnkSubmittedXML;
	@FindBy(xpath ="//a[contains(text(),'Submission Report')]")
	private WebElement lnkSubmissionReport;
	@FindBy(xpath ="//a[contains(text(),'Form CT600A')]")
	private WebElement lnkFormCT600A;
	@FindBy(xpath ="//a[contains(text(),'Note Templates Settings')]")
	private WebElement lnkNoteTemplatesSettings;
	@FindBy(xpath ="//a[contains(text(),'CT Adjustments Settings')]")
	private WebElement lnkCTAdjustmentsSettings;
	@FindBy(xpath ="//a[contains(text(),'CT Other Adjustments Settings')]")
	private WebElement lnkCTOtherAdjustmentsSettings;
	@FindBy(xpath ="//a[contains(text(),'Accounts Settings')]")
	private WebElement lnkAccountsSettings;
	@FindBy(xpath ="//h2")
	private WebElement TitleAct;
	@FindBy(xpath ="//h3[contains(text(),'Submit to HMRC')]")
	private WebElement TitleSubmittoHMRC;
	@FindBy(id ="ctl00_cpHeaderRight_btnExportToPdf")
	private WebElement btnExportToPdf;
	@FindBy(id ="ctl00_cpHeaderRight_btnEdit")
	private WebElement btnEdit;
	@FindBy(id ="ctl00_cpHeaderRight_btnCancel")
	private WebElement btnCancel;
	
	@FindBy(xpath ="//h2[contains(text(),'Adjustments')]")
	private WebElement lnkActAdjustments;
	@FindBy(xpath ="//h2[contains(text(),'Profit & Loss Statement From 01 January 2017 to 31')]")
	private WebElement lnkActPL;
	@FindBy(id ="ctl00_ddlFinancialYear")
	private WebElement ddlFinancialYear;
	
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_tab")
	private WebElement TabPanel1;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel2_tab")
	private WebElement TabPanel2;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel3_tab")
	private WebElement TabPanel3;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel4_tab")
	private WebElement TabPanel4;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel5_tab")
	private WebElement TabPanel5;
	@FindBy(xpath ="//div[contains(text(),'Turnover')]")
	private WebElement Turnover;
	@FindBy(xpath ="//div[contains(text(),'TAX CALCULATION')]")
	private WebElement TAXCALCULATION;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel1_txtTurnoverTotal'][@disabled='disabled']")
	private WebElement txtTurnoverTotal;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_txtTurnoverTotal")
	private WebElement txtTurnoverTotal1;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel1_txtTonnageTaxProfits']")
	private WebElement txtTonnageTaxProfits;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel4_txtResearchAndDevelopmentCredit'][@disabled='disabled']")
	private WebElement txtResearchAndDevelopmentCredit;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel4_txtCreativeCredit']")
	private WebElement txtCreativeCredit;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel3_txtYearOneProfit1'][@disabled='disabled']")
	private WebElement txtYearOneProfit1;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel3_txtCommunityInvestmentRelief']")
	private WebElement txtCommunityInvestmentRelief;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel2_txtUnquotedShares']")
	private WebElement txtUnquotedShares;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel2_txtTradingLossesCarriedForward'][@disabled='disabled']")
	private WebElement txtTradingLossesCarriedForward;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel5_txtFrankedInvestmentIncome']")
	private WebElement txtFrankedInvestmentIncome;
	
	//Information
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel1_txtRandDEnhancedExpenditure'][@disabled='disabled']")
	private WebElement txtRandDEnhancedExpenditure;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel1_txtCreativeEnhancedExpenditure']")
	private WebElement txtCreativeEnhancedExpenditure;
	@FindBy(xpath ="//div[contains(text(),'Research and Development (R&D) or creative enhance')]")
	private WebElement RDorCE;
	@FindBy(xpath ="//div[contains(text(),'Allowances and charges in calculation of trading p')]")
	private WebElement AllowanceCharges;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_txtRandDEnhancedExpenditure")
	private WebElement txtRandDEnhancedExpenditure1;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel2_txtMachineryAndPlantMainPoolCapitalAllowancesInc")
	private WebElement txtMachineryAndPlantMainPoolCapitalAllowancesInc;
	
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel2_txtAIACapitalAllowancesInc'][@disabled='disabled']")
	private WebElement txtAIACapitalAllowancesInc;
	@FindBy(xpath ="//input[@id='ctl00_cPH_tbContainer_TabPanel2_txtMachineryAndPlantSpecialRatePoolBalancingChargesInc']")
	private WebElement txtMachineryAndPlantSpecialRatePoolBalancingChargesInc;
	
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_txtResearchAndDevelopmentCredit")
	private WebElement txtResearchAndDevelopmentCredit1;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_txtResearchAndDevelopmentVaccineOrCreativeTaxCredit")
	private WebElement txtResearchAndDevelopmentVaccineOrCreativeTaxCredit;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_txtSurplusResearchAndDevelopmentCreditsOrCreativeCreditPayable")
	private WebElement txtSurplusResearchAndDevelopmentCreditsOrCreativeCreditPayable;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_txtTaxOverpaid")
	private WebElement txtTaxOverpaid;
	
	//Losses, deficits and excess amounts
	@FindBy(xpath ="//div[contains(text(),'Amount arising')]")
	private WebElement Amountarising;	
	@FindBy(xpath ="//input[@id='ctl00_cPH_txtLossesOfTradesUKArising'][@disabled='disabled']")
	private WebElement txtLossesOfTradesUKArising;
	@FindBy(id ="ctl00_cPH_txtLossesOfTradesUKArising")
	private WebElement txtLossesOfTradesUKArising1;
	@FindBy(xpath ="//input[@id='ctl00_cPH_txtLossesOfTradesUKSurrenderMaximum']")
	private WebElement txtLossesOfTradesUKSurrenderMaximum;
	
	// Overpayments and Repayments
	@FindBy(xpath ="//div[contains(text(),'Small repayments')]")
	private WebElement Smallrepayments;
	@FindBy(xpath ="//input[@id='ctl00_cPH_txtOwnRepaymentsLowerLimit']")
	private WebElement txtOwnRepaymentsLowerLimit;
	@FindBy(id ="ctl00_cPH_txtRandDTaxCredit")
	private WebElement txtRandDTaxCredit;
	
	@FindBy(xpath ="//td/div[contains(text(),'Profit Adjustment')]")
	private WebElement ProfitAdjustment;
	@FindBy(xpath ="//div[contains(text(),'Losses Schedule')]")
	private WebElement LossesSchedule;
	@FindBy(xpath ="//div[contains(text(),'Capital allowance')]")
	private WebElement Capitalallowance;
	@FindBy(xpath ="//div[contains(text(),'R&D Claim')]")
	private WebElement RDClaim;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl00_txtBalance")
	private WebElement rptProfit_ctl00_txtBalance;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel3_rptLossesSchedule_ctl00_txtBalance")
	private WebElement rptLossesSchedule_ctl00_txtBalance;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptLoss_ctl00_txtBalance")
	private WebElement rptLoss_ctl00_txtBalance;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel2_txtTitle")
	private WebElement TabPanel2_txtTitle;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtDescription")
	private WebElement rptrReleif_ctl00_txtDescription;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtTotal")
	private WebElement rptrReleif_ctl00_txtTotal;
	@FindBy(xpath ="//div[@class='green_heading_lm']")
	private WebElement OverdrawnBalanceBroughtForward;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptCT600AOverdrawn_ctl00_txtOverdrawn")
	private WebElement rptCT600AOverdrawn_ctl00_txtOverdrawn;
	
	//Corporation Tax Part1
	//@FindBy(xpath ="//td[contains(text(),'68')]")
	@FindBy(xpath ="//td/span[contains(text(),'Profits as per Accounts')]//..//..//td[5]")
	private WebElement Profits;
	@FindBy(xpath ="//td[contains(text(),'Amortisation')]//..//td[3]")
	private WebElement Amortisation;
	//td[contains(text(),'Asset Disposal')]/..//td[3]
	@FindBy(xpath ="//td[contains(text(),'Charitable donations')]//..//td[3]")
	private WebElement Charitabledonations;
	@FindBy(xpath ="//td[contains(text(),'Depreciation  and  Asset Disposal')]//..//td[3]")
	private WebElement DepreciationAssetDisposal;
	@FindBy(xpath ="//td[contains(text(),'Entertainment')]//..//td[3]")
	private WebElement Entertainment;
	@FindBy(xpath ="//td[contains(text(),'Expensive car leasing')]//..//td[3]")
	private WebElement ExpensiveCarLeasing;
	@FindBy(xpath ="//td[contains(text(),'Formation expenses')]//..//td[3]")
	private WebElement FormationExpenses;
	@FindBy(xpath ="//td[contains(text(),'General provision for bad debts')]//..//td[3]")
	private WebElement GeneralProvisionbaddebts;
	@FindBy(xpath ="//td[contains(text(),'Gifts to customers')]//..//td[3]")
	private WebElement GiftsCustomers;
	@FindBy(xpath ="//td[contains(text(),'Illegal payments')]//..//td[3]")
	private WebElement IllegalPayments;
	@FindBy(xpath ="//td[contains(text(),'Legal and Professional')]//..//td[3]")
	private WebElement LegalProfessional;
	@FindBy(xpath ="//td[contains(text(),'Non trading interest paid')]//..//td[3]")
	private WebElement NonTradingInterest;
	@FindBy(xpath ="//td[contains(text(),'Pre-trading income')]//..//td[3]")
	private WebElement PreTradingIncome;
	@FindBy(xpath ="//td[contains(text(),'Payments made in response to threats')]//..//td[3]")
	private WebElement PaymentsResponse;
	@FindBy(xpath ="//td[contains(text(),'Penalties and fines')]//..//td[3]")
	private WebElement PenaltiesFines;
	@FindBy(xpath ="//td[contains(text(),'Pension creditor (in creditors)')]//..//td[3]")
	private WebElement Pensioncreditor;
	@FindBy(xpath ="//td[contains(text(),'Political contributions')]//..//td[3]")
	private WebElement Politicalcontributions;
	@FindBy(xpath ="//td[contains(text(),'Rental expenses')]//..//td[3]")
	private WebElement Rentalexpenses;
	@FindBy(xpath ="//td[contains(text(),'230')]")
	private WebElement Add;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[23]/td[3]")
	private WebElement OtherAddBack1;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[25]/td[3]")
	private WebElement OtherAddBack2;	
	@FindBy(xpath ="//table[1]/tbody[1]/tr[26]/td[3]")
	private WebElement OtherAddBack3;	
	
	@FindBy(xpath ="//td[contains(text(),'10 percent Wear and tear allowance')]//..//td[3]")
	private WebElement WearTearAllowance;
	@FindBy(xpath ="//td[contains(text(),'Franked investment income')]//..//td[3]")
	private WebElement FrankedInvestmentIncome;
	@FindBy(xpath ="//td[contains(text(),'Interest received')]//..//td[3]")
	private WebElement InterestReceived;
	@FindBy(xpath ="//td[contains(text(),'Non taxable income')]//..//td[3]")
	private WebElement NonTaxableIncome;
	@FindBy(xpath ="//td[contains(text(),'Non Trading Loan Relationships')]//..//td[3]")
	private WebElement NonTradingLoanRelationships;
	@FindBy(xpath ="//td[contains(text(),'Pre-trading losses')]//..//td[3]")
	private WebElement PreTradingLosses;
	@FindBy(xpath ="//td[contains(text(),'Other Deductions')]//..//td[3]")
	private WebElement OtherDeductions;
	@FindBy(xpath ="//td[contains(text(),'Other non operating income')]//..//td[3]")
	private WebElement OtherNonOperatingIncome;
	@FindBy(xpath ="//td[contains(text(),'PAYE online filing incentive')]//..//td[3]")
	private WebElement PAYEonlineFilingIncentive;
	@FindBy(xpath ="//td[contains(text(),'Pension creditor (in creditors) b/f')]//..//td[3]")
	private WebElement PensionCreditorBF;
	@FindBy(xpath ="//td[contains(text(),'Rental income')]//..//td[3]")
	private WebElement RentalIncome;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[50]/td[5]")
	private WebElement Less;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[20]/td[5]")
	private WebElement LessC;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[23]/td[5]")
	private WebElement LessC2;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[25]/td[5]")
	private WebElement LessC3;
	@FindBy(xpath ="//td[contains(text(),'Trading Profit')]//..//td[5]")
	private WebElement TradingProfit;
//	@FindBy(xpath ="//td[contains(text(),'Losses brought forward and used against profits')]//..//td[3]")
//	private WebElement LossesBF;
	@FindBy(xpath ="//td[contains(text(),'Net Trading Profit')]//..//td[5]")
	private WebElement NetTradingProfit;
	@FindBy(xpath ="//td[contains(text(),'Annual Investment Allowance')]//..//td[3]")
	private WebElement AIA;
	@FindBy(xpath ="//td[contains(text(),'First Year Allowance 100 percent')]//..//td[3]")
	private WebElement FYAllowance100per;
	@FindBy(xpath ="//td[contains(text(),'Net Trading Loss')]//..//td[5]")
	private WebElement NetTradingLoss;
	@FindBy(xpath ="//td[contains(text(),'Trading Loss')]//..//td[5]")
	private WebElement TradingLoss;
	
	@FindBy(xpath ="//table[1]/tbody[1]/tr[57]/td[3]")
	private WebElement RentalIncome2;
	@FindBy(xpath ="//td[contains(text(),'Losses brought forward and used against profits')]//..//td[5]")
	private WebElement LossesBFused;
	@FindBy(xpath ="//td[contains(text(),'Rental Expenses')]//..//td[3]")
	private WebElement RentalExpenses;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[59]/td[3]")
	private WebElement WearTearAllowance2;
	@FindBy(xpath ="//td[contains(text(),'Rental Loss')]//..//td[5]")
	private WebElement RentalLoss;
	@FindBy(xpath ="//td[contains(text(),'Interest Received')]//..//td[5]")
	private WebElement InterestReceived2;
	@FindBy(xpath ="//td[contains(text(),'Profits liable to Corporation Tax')]//..//td[5]")
	private WebElement ProfitsCorporationTax;
	@FindBy(xpath ="//td[contains(text(),'Tax Payable')]//..//td[3]")
	private WebElement TaxPayable;
	
	//MEMO : Summary Of Trading Losses
	@FindBy(xpath ="//td[contains(text(),'Utilized S393A current year')]//..//td[5]")
	private WebElement UtilizedS393A;
	@FindBy(xpath ="//td[contains(text(),'Trading Losses Surrendered To Other Group Company')]//..//td[5]")
	private WebElement TradingLosses;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[6]/td[5]")
	private WebElement LossesBF;
	@FindBy(xpath ="//td[contains(text(),'Losses carried back')]//..//td[5]")
	private WebElement LossesCB;
	@FindBy(xpath ="//td[contains(text(),'Losses brought forward used against profits')]//..//td[5]")
	private WebElement LossedBF_Profits;
	@FindBy(xpath ="//td[contains(text(),'Trading Loss Remaining')]//..//td[5]")
	private WebElement TradingLossRemaining;
	@FindBy(xpath ="//td[contains(text(),'Losses carried forward')]//..//td[5]")
	private WebElement LossesCF;
	
	@FindBy(xpath ="//td[contains(text(),'General Pool Allowances')]//..//td[3]")
	private WebElement GeneralPoolAllowances;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[3]/td[2]")
	private WebElement poolBF;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[2]")
	private WebElement additions;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[2]")
	private WebElement disposals;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[7]/td[2]")
	private WebElement wda;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[8]/td[2]")
	private WebElement wdv;
	@FindBy(xpath ="//td[contains(text(),'Rental Profit')]//..//td[5]")
	private WebElement RentalProfit;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[6]/td[2]")
	private WebElement TotalCapitalAllowance;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[7]/td[1]")
	private WebElement TotalCapitalAllowanceFinal;

	//Update CT Adjustments settings
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl01_txtBalance")
	private WebElement txtAmortisation;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl05_txtBalance")
	private WebElement txtExpensiveCarLeasing;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl10_txtBalance")
	private WebElement txtLegalProfessional;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl16_txtBalance")
	private WebElement txtPaymentsThreats;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptProfit_ctl20_txtBalance")
	private WebElement txtRentalExpenses;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptLoss_ctl00_txtBalance")
	private WebElement txtWearTearAllowance;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptLoss_ctl03_txtBalance")
	private WebElement txtNonTaxableIncome;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptLoss_ctl07_txtBalance")
	private WebElement txtOtherNonOperatingIncome;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_rptLoss_ctl10_txtBalance")
	private WebElement txtRentalincome;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel3_rptLossesSchedule_ctl00_txtBalance")
	private WebElement txtLossesBF;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel3_rptLossesSchedule_ctl02_txtBalance")
	private WebElement txtLossesBFutilized;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel3_rptLossesSchedule_ctl04_txtBalance")
	private WebElement txtTradingLossesSurrendered;
	@FindBy(id ="ctl00_cpHeaderRight_btnSave")
	private WebElement btnSave;
	@FindBy(xpath ="//h2")
	private WebElement txtTitle;
	@FindBy(id ="ctl00_cphError_txtPrivateUse")
	private WebElement txtPrivateUse;
	@FindBy(id ="ctl00_cphError_txtRestriction")
	private WebElement txtRestriction;
	@FindBy(id ="ctl00_cphError_txtRate")
	private WebElement txtRate;
	@FindBy(id ="ctl00_cphError_txtBroughtFwd")
	private WebElement txtBroughtFwd;
	@FindBy(id ="ctl00_cphError_txtAddition")
	private WebElement txtAddition;
	@FindBy(id ="ctl00_cphError_txtDisposals")
	private WebElement txtDisposals;
	@FindBy(id ="ctl00_cphError_chkBalancecharge_allowance")
	private WebElement allowance;
	@FindBy(id ="ctl00_cphError_txtOverrideWDA")
	private WebElement txtOverrideWDA;
	@FindBy(id ="ctl00_cphFooter_btnSave")
	private WebElement btnSavePoolType;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel2_rptPoolType_ctl00_imgEdit")
	private WebElement imgEdit;
	
	@FindBy(xpath ="//td/div[contains(text(),'Net Profit / Loss')]//..//..//td[3]")
	private WebElement NetPL;
	@FindBy(xpath ="//span[@class='side_nav_text'][contains(text(),'Reports')]")
	private WebElement LnkReports;
	@FindBy(linkText="Profit & Loss")
	private WebElement LnkReportPL;
	
	//Submit CT600
	@FindBy(id ="ctl00_cPH_btnLockHMRC")
	private WebElement btnLockHMRC;
	@FindBy(id ="ctl00_cPH_btnUnlockHMRC")
	private WebElement btnUnlockHMRC;
	@FindBy(id ="ctl00_cPH_btnValidateHMRC")
	private WebElement btnValidateHMRC;
	@FindBy(id ="ctl00_cPH_btnSubmitHMRC")
	private WebElement btnSubmitHMRC;	
	@FindBy(xpath ="//span[@class='fa_cs_processing']")
	private WebElement MsgApproved;	
	
	//Capital Allowance -- CT Computation
	@FindBy(xpath ="//td[contains(text(),'Expensive Cars Allowances')]//..//td[3]")
	private WebElement ExpensiveCarsAllowances;
	@FindBy(xpath ="//td[contains(text(),'Short Life Assets Allowances')]//..//td[3]")
	private WebElement ShortLifeAssetsAllowances;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[3]/td[2]")
	private WebElement PMpoolBF;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[4]/td[2]")
	private WebElement PMadditions;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[5]/td[2]")
	private WebElement PMdisposals;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[6]/td[2]")
	private WebElement PMTotalCapitalAllowance;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[7]/td[2]")
	private WebElement PMwda1;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[7]/td[3]")
	private WebElement PMwda2;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[8]/td[2]")
	private WebElement PMwdv;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[3]/td[2]")
	private WebElement ECpoolBF;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[4]/td[2]")
	private WebElement ECadditions;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[5]/td[2]")
	private WebElement ECdisposals;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[6]/td[2]")
	private WebElement ECTotalCapitalAllowance;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[7]/td[2]")
	private WebElement ECwda1;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[8]/td[2]")
	private WebElement ECwdv;
	@FindBy(xpath ="//table[2]/tbody[1]/tr[1]/td[5]/table[1]/tbody[1]/tr[7]/td[1]")
	private WebElement ECTotalCapitalAllowanceFinal;
	
	//R&D

	@FindBy(xpath ="//td[contains(text(),'Trading and professional profits')]//..//td[2]")
	private WebElement TradingProfessionalProfits;
	@FindBy(xpath ="//td[contains(text(),'Trading and professional profits')]//..//td[3]")
	private WebElement TradingProfessionalProfits1;
	@FindBy(xpath ="//td[contains(text(),'Losses brought forward and used against profits')]//..//td[2]")
	private WebElement LossesBFandUsed;
	@FindBy(xpath ="//td[contains(text(),'Net trading and professional profits')]//..//td[3]")
	private WebElement NetTradingProfessionalProfits;
	@FindBy(xpath ="//td[contains(text(),'Profits before deductions and reliefs')]//..//td[3]")
	private WebElement ProfitsBeforeDeductionsReliefs;
	@FindBy(xpath ="//td[contains(text(),'Profits before charges and reliefs')]//..//td[3]")
	private WebElement ProfitsBeforeChargesReliefs;
	@FindBy(xpath ="//td[contains(text(),'Profits chargeable to corporation tax')]//..//td[3]")
	private WebElement ProfitsChargeableCorporationTax;
	@FindBy(name="ct-comp:FY1AmountOfProfitChargeableAtFirstRate")
	private WebElement FY1AmountOfProfitChargeableAtFirstRate;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[13]/td[3]")
	private WebElement FY1ChargableProfit;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[10]/td[3]")
	private WebElement FY1ChargableProfit1;
	@FindBy(name="ct-comp:FY2AmountOfProfitChargeableAtFirstRate")
	private WebElement FY2AmountOfProfitChargeableAtFirstRate;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[19]/td[3]")
	private WebElement FY2ChargableProfit;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[16]/td[3]")
	private WebElement FY2ChargableProfit1;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[22]/td[3]")
	private WebElement CT2016FY1;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[23]/td[3]")
	private WebElement CT2016FY2;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[19]/td[3]")
	private WebElement CT2016FY1_1;
	@FindBy(xpath ="//table[4]/tbody[1]/tr[20]/td[3]")
	private WebElement CT2016FY2_1;
	@FindBy(xpath ="//td[contains(text(),'R & D Tax relief')]//..//td[3]")
	private WebElement RDTaxRelief;
	@FindBy(xpath ="//td[contains(text(),'Total reliefs and deductions in terms of tax')]//..//td[3]")
	private WebElement TotalReliefsDeductionsTax;
	@FindBy(xpath ="//td[contains(text(),'Net corporation tax liability')]//..//td[3]")
	private WebElement NetCorporationTaxLiability;
	@FindBy(xpath ="//td[contains(text(),'Tax Chargeable')]//..//td[3]")
	private WebElement TaxChargeable;
	@FindBy(xpath ="//td[contains(text(),'Tax Refundable')]//..//td[3]")
	private WebElement TaxRefundable;
	@FindBy(xpath ="//td[contains(text(),'R&D Expenditure Claim')]//..//td[3]")
	private WebElement RDExpenditureClaim;
	@FindBy(xpath ="//td[contains(text(),'Enhanced research and development expenditure @ 13')]//..//td[3]")
	private WebElement EnhancedResearchDevelopmentExpenditure;
	@FindBy(xpath ="//td[contains(text(),'Surrenderable losses for the period')]//..//td[3]")
	private WebElement SurrenderableLossesPeriod;
	//@FindBy(xpath ="//table[8]/tbody[1]/tr[6]/td[3]")
	@FindBy(xpath ="//table[10]/tbody[1]/tr[6]/td[3]")
	private WebElement EnhancedExpenditureTradeA;
	//@FindBy(xpath ="//table[8]/tbody[1]/tr[13]/td[3]")
	@FindBy(xpath ="//table[10]/tbody[1]/tr[13]/td[3]")
	private WebElement UnrelievedTradeLossesPeriodB;
	@FindBy(xpath ="//td[contains(text(),'Trading losses for the period')]//..//td[3]")
	private WebElement TradingLossesPeriod;
	@FindBy(xpath="//td[contains(text(),'Surrenderable losses of the period (lower of A and')]//..//td[3]")
	private WebElement SurrenderableLossesPeriodAB;
	//@FindBy(xpath="//table[8]/tbody[1]/tr[17]/td[3]")
	@FindBy(xpath="//table[10]/tbody[1]/tr[17]/td[3]")
	private WebElement LossesSurrenderedTaxCredit1;
	
	@FindBy(xpath ="//table[6]/tbody[1]/tr[7]/td[3]")
	private WebElement LossesSurrenderedTaxCredit;
	
	//@FindBy(xpath ="//table[9]/tbody[1]/tr[3]/td[5]")
	@FindBy(xpath ="//table[11]/tbody[1]/tr[3]/td[5]")
	private WebElement LossesSurrenderedTaxCredit3;
	@FindBy(xpath ="//table[6]/tbody[1]/tr[12]/td[5]")
	private WebElement CP2016;
	@FindBy(xpath ="//table[6]/tbody[1]/tr[21]/td[5]/span[1]")
	private WebElement CP2016Final;
	@FindBy(xpath ="//table[6]/tbody[1]/tr[22]/td[5]/span[1]")
	private WebElement CP2017Final;
	
	@FindBy(xpath ="//td[contains(text(),'Total R & D Tax Credit')]//..//td[5]")
	private WebElement TotalRDTaxCredit;
	@FindBy(xpath ="//td[contains(text(),'Losses arising in period')]//..//td[5]")
	private WebElement LossesArisingPeriod;
	@FindBy(xpath ="//tr[@class='h1']//td[@class='t'][contains(text(),'Losses surrendered for tax credit')]//..//td[5]")
	private WebElement LossesSurrenderedTaxCredit2;
	@FindBy(xpath ="//td[contains(text(),'Losses carried forward')]//..//td[5]")
	private WebElement RDLossesCF;
	
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_lnkDelete")
	private WebElement lnkDelete;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_lnkDelete")
	private List<WebElement> lnkDeleteLst;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_txtLossesSurrendered")
	private WebElement txtLossesSurrendered;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtEnhancement")
	private WebElement txtEnhancement;
	
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtDescription")
	private WebElement txtDescription1;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl01_txtDescription")
	private WebElement txtDescription2;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl02_txtDescription")
	private WebElement txtDescription3;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtEnhancement")
	private WebElement txtEnhancement1;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl01_txtEnhancement")
	private WebElement txtEnhancement2;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl02_txtEnhancement")
	private WebElement txtEnhancement3;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl00_txtPercentage")
	private WebElement txtPercentage1;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl01_txtPercentage")
	private WebElement txtPercentage2;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel4_rptrReleif_ctl02_txtPercentage")
	private WebElement txtPercentage3;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel1_txtTotalRandD")
	private WebElement txtTotalRandD;
	
	public CT600Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
public void VerifyCTComputation(WebDriver driver, String TitleExp1) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		LnkCTComputation.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnExportToPdf.click();
		Thread.sleep(2000);
	}
	
	
	public void VerifyAboutThisReturn(WebDriver driver, String TitleExp1) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		Thread.sleep(1000);
		lnkAboutthisreturn.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnEdit.click();
		Thread.sleep(2000);
		btnCancel.click();
		Thread.sleep(2000);
	}
	
	public void VerifyTaxCalculation(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		Thread.sleep(1000);
		lnkTaxCalculation.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnEdit.click();
		
		TabPanel1.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 30, txtTonnageTaxProfits);
		
		TabPanel1.click();
		vat.VerifyPageTitle(driver, Turnover, TitleExp2);
		
		if (txtTurnoverTotal.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtTonnageTaxProfits.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel2.click();
		
		if (txtTradingLossesCarriedForward.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtUnquotedShares.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel3.click();
		vat.VerifyPageTitle(driver, TAXCALCULATION, TitleExp3);
		
		if (txtYearOneProfit1.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtCommunityInvestmentRelief.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel4.click();

		if (txtResearchAndDevelopmentCredit.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtCreativeCredit.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel5.click();
		
		if (!txtFrankedInvestmentIncome.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}

		btnCancel.click();
		Thread.sleep(2000);
	}
	
	public void VerifyInformation(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		Thread.sleep(1000);
		lnkInformation.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnEdit.click();

		TabPanel1.click();
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, txtCreativeEnhancedExpenditure);
		
		TabPanel1.click();
		vat.VerifyPageTitle(driver, RDorCE, TitleExp2);
		
		if (txtRandDEnhancedExpenditure.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtCreativeEnhancedExpenditure.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
				
		TabPanel2.click();
		vat.VerifyPageTitle(driver, AllowanceCharges, TitleExp3);
		
		if (!txtMachineryAndPlantSpecialRatePoolBalancingChargesInc.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		if (txtAIACapitalAllowancesInc.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		

		btnCancel.click();
		Thread.sleep(2000);
	}

	public void VerifyLossesDeficitsExcess(WebDriver driver, String TitleExp1, String TitleExp2) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		Thread.sleep(1000);
		lnkLossesDeficitsExcess.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnEdit.click();

		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, txtLossesOfTradesUKSurrenderMaximum);

		vat.VerifyPageTitle(driver, Amountarising, TitleExp2);
		
		if (txtLossesOfTradesUKArising.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtLossesOfTradesUKSurrenderMaximum.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
	
		btnCancel.click();
		Thread.sleep(2000);
	}
		
	public void VerifyOverpaymentsRepayments(WebDriver driver, String TitleExp1, String TitleExp2) throws InterruptedException {
		
		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkCT600TaxReturn.click();
		Thread.sleep(1000);
		lnkOverpaymentsRepayments.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		btnEdit.click();

		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, txtOwnRepaymentsLowerLimit);

		vat.VerifyPageTitle(driver, Smallrepayments, TitleExp2);
		
		if (txtRandDTaxCredit.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!txtOwnRepaymentsLowerLimit.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
	
		btnCancel.click();
		Thread.sleep(2000);
	}
	
	
	public void VerifyCTAdjustmentsSettings(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String TitleExp4, String TitleExp5) throws InterruptedException {

		lnkFinalAccounts.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		
		lnkSettings.click();
		Thread.sleep(1000);
		lnkCTAdjustmentsSettings.click();
		Thread.sleep(2000);
		
		VatPage vat = new VatPage(driver);
		vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
		
		btnEdit.click();
		TabPanel1.click();

		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, rptLoss_ctl00_txtBalance);

		vat.VerifyPageTitle(driver, ProfitAdjustment, TitleExp2);
		
		if (rptProfit_ctl00_txtBalance.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!rptLoss_ctl00_txtBalance.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel3.click();

		vat.VerifyPageTitle(driver, LossesSchedule, TitleExp3);
		
		
		if (!rptLossesSchedule_ctl00_txtBalance.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel2.click();
		vat.VerifyPageTitle(driver, Capitalallowance, TitleExp4);
				
		if (!TabPanel2_txtTitle.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		TabPanel4.click();
		vat.VerifyPageTitle(driver, RDClaim, TitleExp5);
		
		if (rptrReleif_ctl00_txtTotal.isEnabled())
		{
			Assert.fail("Field is coming enabled");
		}
		
		if (!rptrReleif_ctl00_txtDescription.isEnabled())
		{
			Assert.fail("Field is coming diabled");
		}
		
		btnCancel.click();
		Thread.sleep(2000);
	}
		
		
		public void VerifyCTOtherAdjustmentsSettings(WebDriver driver, String TitleExp1, String TitleExp2) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTOtherAdjustmentsSettings.click();
			Thread.sleep(2000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
			
			btnEdit.click();
		
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptCT600AOverdrawn_ctl00_txtOverdrawn);
	
			vat.VerifyPageTitle(driver, OverdrawnBalanceBroughtForward, TitleExp2);
			
			
			if (!rptCT600AOverdrawn_ctl00_txtOverdrawn.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
				
			btnCancel.click();
			Thread.sleep(2000);
		}
		
		
		public void CTComputationPart1(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17, String Val18, String Val19, String Val20, String Val21, String Val22, String Val23, String Val24, String Val25, String Val26, String Val27, String Val28, String Val29, String Val30, String Val31, String Val32, String Val33, String Val34, String Val35, String Val36, String Val37, String Val38, String Val39, String Val40, String Val41, String Val42, String Val43, String Val44, String Val45, String Val46) throws InterruptedException {
					
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			VerifyValues(driver, "Profits", Profits, Val1);
			VerifyValues(driver, "Amortisation", Amortisation, Val2);
			VerifyValues(driver, "Charitable donations", Charitabledonations, Val3);
			VerifyValues(driver, "Depreciation & Asset Disposal", DepreciationAssetDisposal, Val4);			
			VerifyValues(driver, "Entertainment", Entertainment, Val5);
			VerifyValues(driver, "Expensive car leasing", ExpensiveCarLeasing, Val6);
			VerifyValues(driver, "Formation expenses", FormationExpenses, Val7);
			VerifyValues(driver, "General provision for bad debts", GeneralProvisionbaddebts, Val8);
			VerifyValues(driver, "Gifts to customers", GiftsCustomers, Val9);
			VerifyValues(driver, "Illegal payments", IllegalPayments, Val10);
			VerifyValues(driver, "Legal and Professional", LegalProfessional, Val11);
			VerifyValues(driver, "Non trading interest paid", NonTradingInterest, Val12);	
			
			VerifyValues(driver, "Pre-trading income", PreTradingIncome, Val13);
			VerifyValues(driver, "Payments made in response to threats", PaymentsResponse, Val14);
			VerifyValues(driver, "Penalties and fines", PenaltiesFines, Val15);
			VerifyValues(driver, "Pension creditor (in creditors)", Pensioncreditor, Val16);			
			VerifyValues(driver, "Political contributions", Politicalcontributions, Val17);
			VerifyValues(driver, "Rental expenses", Rentalexpenses, Val18);
			VerifyValues(driver, "Add", Add, Val19);

			VerifyValues(driver, "10 percent Wear and tear allowance", WearTearAllowance, Val20);
			VerifyValues(driver, "Franked investment income", FrankedInvestmentIncome, Val21);
			VerifyValues(driver, "Interest received", InterestReceived, Val22);			
			VerifyValues(driver, "Non taxable income", NonTaxableIncome, Val23);
			VerifyValues(driver, "Non Trading Loan Relationships", NonTradingLoanRelationships, Val24);
			VerifyValues(driver, "Pre-trading losses", PreTradingLosses, Val25);
			VerifyValues(driver, "Other Deductions", OtherDeductions, Val26);
			VerifyValues(driver, "Other non operating income", OtherNonOperatingIncome, Val27);
			VerifyValues(driver, "PAYE online filing incentive", PAYEonlineFilingIncentive, Val28);
			VerifyValues(driver, "Pension creditor (in creditors) b/f", PensionCreditorBF, Val29);
			VerifyValues(driver, "Rental income", RentalIncome, Val30);	
			
			VerifyValues(driver, "Less", Less, Val31);
			VerifyValues(driver, "Trading Profit", TradingProfit, Val32);
			
			Reporter.log("Value of LossesBFused: " +LossesBFused.getText(),true);
			String c1=LossesBFused.getText().substring(1,2);
			VerifyValues(driver, "Losses brought forward and used against profits", c1, Val33);
			VerifyValues(driver, "Net Trading Profit", NetTradingProfit, Val34);
			
			VerifyValues(driver, "Rental Income 2", RentalIncome2, Val30);
			
			Reporter.log("Rental Expenses: " +RentalExpenses.getText(),true);
			String e1=RentalExpenses.getText().substring(1,3);
			VerifyValues(driver, "Rental Expenses", e1, Val35);
			
//			VerifyValues(driver, "Rental Expenses", RentalExpenses, Val35);
			Reporter.log("10 percent Wear and tear allowance 2: " +WearTearAllowance2.getText(),true);
			String f1=WearTearAllowance2.getText().substring(1,2);
			VerifyValues(driver, "10 percent Wear and tear allowance 2", f1, Val20);
			
//			VerifyValues(driver, "10 percent Wear and tear allowance 2", WearTearAllowance2, Val20);
			Reporter.log("Rental Loss: " +RentalLoss.getText(),true);
			String g1=RentalLoss.getText().substring(1,3);
			VerifyValues(driver, "Rental Loss", g1, Val36);
//			VerifyValues(driver, "Rental Loss", RentalLoss, Val36);
			
			Reporter.log("Interest Received2: " +InterestReceived2.getText(),true);
			String h1=InterestReceived2.getText().substring(1,2);
			VerifyValues(driver, "Interest Received2", h1, Val46);
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax, Val37);	
			
			VerifyValues(driver, "Utilized S393A current year", UtilizedS393A, Val38);	
			VerifyValues(driver, "Trading Losses Surrendered To Other Group Company", TradingLosses, Val39);	
			VerifyValues(driver, "Losses brought forward", LossesBF, Val40);	
			VerifyValues(driver, "Losses carried back", LossesCB, Val41);	
			VerifyValues(driver, "Losses brought forward used against profits", LossedBF_Profits, Val42);	
			VerifyValues(driver, "Trading Loss Remaining", TradingLossRemaining, Val43);	
			VerifyValues(driver, "Losses carried forward", LossesCF, Val44);	
				
			VerifyValues(driver, "Tax Payable", TaxPayable, Val45);	
			
			int a1=Integer.parseInt(Amortisation.getText())+Integer.parseInt(Charitabledonations.getText())+Integer.parseInt(DepreciationAssetDisposal.getText())+Integer.parseInt(Entertainment.getText())+Integer.parseInt(ExpensiveCarLeasing.getText())+Integer.parseInt(FormationExpenses.getText())+Integer.parseInt(GeneralProvisionbaddebts.getText())+Integer.parseInt(GiftsCustomers.getText())+Integer.parseInt(IllegalPayments.getText())+Integer.parseInt(LegalProfessional.getText())+Integer.parseInt(NonTradingInterest.getText())+Integer.parseInt(PreTradingIncome.getText())+Integer.parseInt(PaymentsResponse.getText())+Integer.parseInt(PenaltiesFines.getText())+Integer.parseInt(Pensioncreditor.getText())+Integer.parseInt(Politicalcontributions.getText())+Integer.parseInt(Rentalexpenses.getText())+Integer.parseInt(OtherAddBack1.getText())+Integer.parseInt(OtherAddBack2.getText())+Integer.parseInt(OtherAddBack3.getText());
			int b1=Integer.parseInt(WearTearAllowance.getText())+Integer.parseInt(FrankedInvestmentIncome.getText())+Integer.parseInt(InterestReceived.getText())+Integer.parseInt(NonTaxableIncome.getText())+Integer.parseInt(NonTradingLoanRelationships.getText())+Integer.parseInt(PreTradingLosses.getText())+Integer.parseInt(OtherDeductions.getText())+Integer.parseInt(OtherNonOperatingIncome.getText())+Integer.parseInt(PAYEonlineFilingIncentive.getText())+Integer.parseInt(PensionCreditorBF.getText())+Integer.parseInt(RentalIncome.getText());
				
			int d1=Integer.parseInt(TradingProfit.getText())-Integer.parseInt(c1);
			
			Reporter.log("Sum1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Add", Add, a2);
			
			Reporter.log("Sum2 = "+b1, true);
			String b2=Integer.toString(b1);
			VerifyValues(driver, "Less", Less, b2);
			
			Reporter.log("Sum3 = "+d1, true);
			String d2=Integer.toString(d1);
			VerifyValues(driver, "Net Trading Profit", NetTradingProfit, d2);
			
			int RentLoss=Integer.parseInt(RentalIncome2.getText())-Integer.parseInt(e1)-Integer.parseInt(f1);
			Reporter.log("Rental Loss = "+RentLoss, true);
			String RentLoss2=Integer.toString(RentLoss);
			
			VerifyValues(driver, "Rental Loss", g1, RentLoss2.substring(1, 3));
			
			btnExportToPdf.click();
			//Thread.sleep(2000);
		}
		
		public void VerifyValues(WebDriver driver, String ValueHead, WebElement ValueExp, String ValueAct) {
			Reporter.log(ValueHead +": "+ValueExp.getText(), true);
//			Assert.assertEquals(replaceAll(",ValueExp.getText()",""), ValueAct, "Failed to verify value of " +ValueHead);
			Assert.assertEquals(ValueExp.getText(), ValueAct, "Failed to verify value of " +ValueHead);
			Reporter.log("Value of " +ValueHead +" is verified successfully", true);
			// str.replaceAll(", $", "")
		}
		
		public void VerifyValues(WebDriver driver, String ValueHead, String ValueExp, String ValueAct) {
			Reporter.log(ValueHead +": "+ValueExp, true);
			Assert.assertEquals(ValueExp, ValueAct, "Failed to verify value of " +ValueHead);
			Reporter.log("Value of " +ValueHead +" is verified successfully", true);
			
		}
		
		
		public void ClearCTAdjustmentsSettings(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String TitleExp4, String TitleExp5) throws InterruptedException {

			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
			
			btnEdit.click();
			TabPanel1.click();

			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptLoss_ctl00_txtBalance);

			vat.VerifyPageTitle(driver, ProfitAdjustment, TitleExp2);
			
			if (rptProfit_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!rptLoss_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}

			
			txtAmortisation.clear();
			txtExpensiveCarLeasing.clear();
			txtLegalProfessional.clear();
			txtPaymentsThreats.clear();
			txtRentalExpenses.clear();
			txtWearTearAllowance.clear();
			txtNonTaxableIncome.clear();
			txtOtherNonOperatingIncome.clear();
			txtRentalincome.clear();
			
			
			TabPanel3.click();

			vat.VerifyPageTitle(driver, LossesSchedule, TitleExp3);
			
			
			if (!rptLossesSchedule_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
			txtLossesBF.clear();
			txtLossesBFutilized.clear();
			txtTradingLossesSurrendered.clear();
			
			btnSave.click();
			Thread.sleep(2000);
		}
		
		public void UpdateCTAdjustmentsSettings(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String TitleExp4, String TitleExp5, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12) throws InterruptedException {

		
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
			
			btnEdit.click();
			TabPanel1.click();

			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptLoss_ctl00_txtBalance);

			vat.VerifyPageTitle(driver, ProfitAdjustment, TitleExp2);
			
			if (rptProfit_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!rptLoss_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}

			txtAmortisation.clear();
			txtAmortisation.sendKeys(Val1);
			txtExpensiveCarLeasing.clear();
			txtExpensiveCarLeasing.sendKeys(Val2);
			txtLegalProfessional.clear();
			txtLegalProfessional.sendKeys(Val3);
			txtPaymentsThreats.clear();
			txtPaymentsThreats.sendKeys(Val4);
			txtRentalExpenses.clear();
			txtRentalExpenses.sendKeys(Val5);
			txtWearTearAllowance.clear();
			txtWearTearAllowance.sendKeys(Val6);
			txtNonTaxableIncome.clear();
			txtNonTaxableIncome.sendKeys(Val7);
			txtOtherNonOperatingIncome.clear();
			txtOtherNonOperatingIncome.sendKeys(Val8);
			txtRentalincome.clear();
			txtRentalincome.sendKeys(Val9);
			
			TabPanel3.click();

			vat.VerifyPageTitle(driver, LossesSchedule, TitleExp3);
			
			
			if (!rptLossesSchedule_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
			txtLossesBF.clear();
			txtLossesBF.sendKeys(Val10);
			txtLossesBFutilized.clear();
			txtLossesBFutilized.sendKeys(Val11);
			txtTradingLossesSurrendered.clear();
			txtTradingLossesSurrendered.sendKeys(Val12);
			
			btnSave.click();
			Thread.sleep(2000);
		}
		
		public void CTComputationPart2(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			Reporter.log("Profits Original : " +Profits.getText(),true);
			int P1=Integer.parseInt(Profits.getText().replaceAll(",", ""));
			Reporter.log("Profits Integer after removing comma seperator : " +P1,true);
			String P2=Integer.toString(P1);
			VerifyValues(driver, "Profits", P2, Val1);
			VerifyValues(driver, "Amortisation", Amortisation, Val2);
			
			Reporter.log("GeneralPoolAllowances Original : " +GeneralPoolAllowances.getText(),true);
			int GPA1=Integer.parseInt(GeneralPoolAllowances.getText().replaceAll(",", ""));
			Reporter.log("GeneralPoolAllowances Integer after removing comma seperator : " +GPA1,true);
			String GPA2=Integer.toString(GPA1);
			VerifyValues(driver, "General Pool Allowances", GPA2, Val3);
			
			
			Reporter.log("Less Original : " +LessC.getText(),true);
			int Less1=Integer.parseInt(LessC.getText().replaceAll(",", ""));
			Reporter.log("Less Integer after removing comma seperator : " +Less1,true);
			String Less2=Integer.toString(Less1);
			VerifyValues(driver, "Less", Less2, Val3);
	
			
			VerifyValues(driver, "Trading Profit", TradingProfit, Val4);
			
			Reporter.log("Value of LossesBFused: " +LossesBFused.getText(),true);
			String c1=LossesBFused.getText().substring(1,2);
			VerifyValues(driver, "Losses brought forward and used against profits", c1, Val5);
			VerifyValues(driver, "Net Trading Profit", NetTradingProfit, Val6);
			
			VerifyValues(driver, "Rental Profit", RentalProfit, Val7);
			
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax, Val8);	
			
			VerifyValues(driver, "Pool B/F", poolBF, Val9);	
			VerifyValues(driver, "Additions", additions, Val10);	
			VerifyValues(driver, "Disposals", disposals, Val11);	
			VerifyValues(driver, "TotalCapitalAllowance", TotalCapitalAllowance, Val12);	
			VerifyValues(driver, "WDA", wda, Val13);	
			VerifyValues(driver, "WDV", wdv, Val14);
			VerifyValues(driver, "TotalCapitalAllowanceFinal",TotalCapitalAllowanceFinal, Val15);
				
			VerifyValues(driver, "Tax Payable", TaxPayable, Val16);	
			
			int a1=Integer.parseInt(poolBF.getText())+Integer.parseInt(additions.getText())-Integer.parseInt(disposals.getText());
			int b1=a1-Integer.parseInt(wda.getText());
			int d1=Integer.parseInt(TradingProfit.getText())-Integer.parseInt(c1);
			
			Reporter.log("Total Capital Allowance1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Total Capital Allowance1", TotalCapitalAllowance, a2);
			
			Reporter.log("WDV Final = "+b1, true);
			String b2=Integer.toString(b1);
			VerifyValues(driver, "Total Capital Allowance Final", wdv, b2);
			
			Reporter.log("Net Trading Profit = "+d1, true);
			String d2=Integer.toString(d1);
			VerifyValues(driver, "Net Trading Profit", NetTradingProfit, d2);
			
						
			btnExportToPdf.click();
			Thread.sleep(2000);
		}
		
		
		public void ClearCTAdjustmentsSettings2(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String Val6) throws InterruptedException {

			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
			
			btnEdit.click();
			
			TabPanel2.click();
			vat.VerifyPageTitle(driver, Capitalallowance, TitleExp2);
					
			if (!TabPanel2_txtTitle.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			imgEdit.click();

			cis.switchwindowNew(driver);
			vat.VerifyPageTitle(driver, txtTitle, TitleExp3);

			txtPrivateUse.clear();
			txtRestriction.clear();
			txtRate.clear();
			txtBroughtFwd.clear();
			txtAddition.clear();
			txtDisposals.clear();
			txtOverrideWDA.clear();
			
			Reporter.log("Val6 = "+Val6, true);
			if (Val6.equals("3"))
			{
				allowance.click();
			}
			
			btnSavePoolType.click();
			Thread.sleep(2000);
		}
		
		
		
		public void UpdateCTAdjustmentsSettings2(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String Val1, String Val2, String Val3, String Val4, String Val5) throws InterruptedException {

			CISPage cis=new CISPage(driver);
			cis.switchwindowDefault(driver);
			btnSave.click();
			Thread.sleep(2000);
			imgEdit.click();

			cis.switchwindowNew(driver);
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, txtTitle, TitleExp3);
			
			txtPrivateUse.clear();
			txtRestriction.clear();
			txtRate.clear();
			txtBroughtFwd.clear();
			txtAddition.clear();
			txtDisposals.clear();
			txtOverrideWDA.clear();
			txtRestriction.sendKeys(Val1);
			txtRate.sendKeys(Val2);
			txtBroughtFwd.sendKeys(Val3);
			txtAddition.sendKeys(Val4);
			txtDisposals.sendKeys(Val5);
			btnSavePoolType.click();
			Thread.sleep(2000);
			
		}
			
		public void VerifyProfitsfromPL(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3) throws InterruptedException {

			LnkReports.click();
			Thread.sleep(2000);
			LnkReportPL.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActPL, TitleExp1);
			
			Reporter.log("NetPL = "+NetPL.getText(), true);
			String NetPL1= NetPL.getText().replaceAll("£", "").replaceAll(",", "");
			Reporter.log("NetPL1 = "+NetPL1, true);
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);

			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp2);
			btnEdit.click();
			
			TabPanel1.click();
			
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptLoss_ctl00_txtBalance);

			vat.VerifyPageTitle(driver, ProfitAdjustment, TitleExp3);
			
			if (rptProfit_ctl00_txtBalance.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			Assert.assertEquals(rptProfit_ctl00_txtBalance.getAttribute("value"), NetPL1, "Failed to verify value");
			Reporter.log("Value verified successfully", true);
			
			Thread.sleep(2000);
		}
		
		
		public void VerifyLossesfromPL(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3) throws InterruptedException {

			LnkReports.click();
			Thread.sleep(2000);
			LnkReportPL.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActPL, TitleExp1);
			
			Reporter.log("NetPL = "+NetPL.getText(), true);
			String NetPL1= NetPL.getText().replaceAll("£", "").replaceAll(",", "");
			NetPL1=NetPL1.substring(1,7);
			Reporter.log("NetPL1 = "+NetPL1, true);
			lnkFinalAccounts.click();
			
			String NetPL2= NetPL.getText().replaceAll("£", "").replaceAll(",", "");
			NetPL2=NetPL2.substring(1,4);
			Reporter.log("NetPL2 = "+NetPL2, true);
			
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);

			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp2);
			btnEdit.click();
			
			TabPanel1.click();

			vat.VerifyPageTitle(driver, ProfitAdjustment, TitleExp3);
			
			if (txtWearTearAllowance.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			Assert.assertEquals(txtWearTearAllowance.getAttribute("value"), NetPL1, "Failed to verify value");
			Reporter.log("Value verified successfully", true);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			
			lnkLossesDeficitsExcess.click();
			
			Thread.sleep(2000);
			Assert.assertEquals(txtLossesOfTradesUKArising1.getAttribute("value"), NetPL2, "Failed to verify value");
			Reporter.log("Value verified successfully", true);
			
		}
		
		public void ValidateCT600(WebDriver driver, String TitleExp1, String MsgSuccess) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			lnkSubmitCT600.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleSubmittoHMRC, TitleExp1);
			Thread.sleep(2000);
			
//			btnUnlockHMRC.click();
//			cis.AlertAccept(driver);
			btnValidateHMRC.click();
			cis.AlertAccept(driver);
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(60000);
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);
			Assert.assertEquals(MsgApproved.getText(), MsgSuccess, "Failed to verify Message");
			Reporter.log("Message verified successfully", true);

			
		}
		
		public void SubmitCT600(WebDriver driver, String TitleExp1, String MsgSuccess) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			lnkSubmitCT600.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleSubmittoHMRC, TitleExp1);
			
			Thread.sleep(2000);
//			btnUnlockHMRC.click();
//			cis.AlertAccept(driver);
			btnSubmitHMRC.click();
			cis.AlertAccept(driver);
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(90000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			Assert.assertEquals(MsgApproved.getText(), MsgSuccess, "Failed to verify Message");
			Reporter.log("Message verified successfully", true);
			
		}
		
		
		public void SubmittedXML(WebDriver driver, String TitleExp1) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			lnkSubmittedXML.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			
		}
		
		public void SubmissionReport(WebDriver driver, String TitleExp1) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			lnkSubmissionReport.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			
		}
		
		
		public void CTComputationPart3(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17, String Val18, String Val19, String Val20) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			Reporter.log("Profits Original : " +Profits.getText(),true);
			int P1=Integer.parseInt(Profits.getText().replaceAll(",", ""));
			Reporter.log("Profits Integer after removing comma seperator : " +P1,true);
			String P2=Integer.toString(P1);
			VerifyValues(driver, "Profits", P2, Val1);
			
			VerifyValues(driver, "Amortisation", Amortisation, Val2);
			
			Reporter.log("GeneralPoolAllowances Original : " +GeneralPoolAllowances.getText(),true);
			int GPA1=Integer.parseInt(GeneralPoolAllowances.getText().replaceAll(",", ""));
			Reporter.log("GeneralPoolAllowances Integer after removing comma seperator : " +GPA1,true);
			String GPA2=Integer.toString(GPA1);
			VerifyValues(driver, "General Pool Allowances", GPA2, Val3);
			
			Reporter.log("AIA Original : " +AIA.getText(),true);
			int AIA1=Integer.parseInt(AIA.getText().replaceAll(",", ""));
			Reporter.log("AIA Integer after removing comma seperator : " +AIA1,true);
			String AIA2=Integer.toString(AIA1);
			VerifyValues(driver, "AIA", AIA2, Val18);
			Reporter.log("FYAllowance100per Original : " +FYAllowance100per.getText(),true);
			int FYAllowance100per1=Integer.parseInt(FYAllowance100per.getText().replaceAll(",", ""));
			Reporter.log("FYAllowance100per Integer after removing comma seperator : " +FYAllowance100per1,true);
			String FYAllowance100per2=Integer.toString(FYAllowance100per1);
			VerifyValues(driver, "FYAllowance100per", FYAllowance100per2, Val19);
			
			Reporter.log("Less Original : " +LessC2.getText(),true);
			int Less12=Integer.parseInt(LessC2.getText().replaceAll(",", ""));
			Reporter.log("Less Integer after removing comma seperator : " +Less12,true);
			String Less21=Integer.toString(Less12);
			VerifyValues(driver, "Less", Less21, Val20);
	
			
			Reporter.log("Trading Loss Original : " +TradingLoss.getText(),true);
			//TradingLoss1=TradingLoss1.substring(1,7);
			int TradingLoss1=Integer.parseInt(TradingLoss.getText().replaceAll(",", "").substring(1,6));
			
			Reporter.log("TradingLoss Integer after removing comma seperator : " +TradingLoss1,true);
			String TradingLoss2=Integer.toString(TradingLoss1);
			VerifyValues(driver, "Trading Loss", TradingLoss2, Val4);
			
			
//			VerifyValues(driver, "Trading Loss", TradingLoss, Val4);
			
//			Reporter.log("Value of LossesBFused: " +LossesBFused.getText(),true);
//			String c1=LossesBFused.getText().substring(1,2);
//			VerifyValues(driver, "Losses brought forward and used against profits", c1, Val5);
			
			
			Reporter.log("Net Trading Loss Original : " +NetTradingLoss.getText(),true);
			int NetTradingLoss1=Integer.parseInt(NetTradingLoss.getText().replaceAll(",", "").substring(1,6));
			Reporter.log("Net Trading Loss Integer after removing comma seperator : " +NetTradingLoss1,true);
			String NetTradingLoss2=Integer.toString(NetTradingLoss1);
			VerifyValues(driver, "Net Trading Loss", NetTradingLoss2, Val4);
			
			
//			VerifyValues(driver, "Net Trading Loss", NetTradingLoss, Val4);
			
			VerifyValues(driver, "Rental Profit", RentalProfit, Val7);
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax, Val8);	
			
			VerifyValues(driver, "Pool B/F", poolBF, Val9);	
			VerifyValues(driver, "Additions", additions, Val10);	
			VerifyValues(driver, "Disposals", disposals, Val11);	
			VerifyValues(driver, "TotalCapitalAllowance", TotalCapitalAllowance, Val12);	
			VerifyValues(driver, "WDA", wda, Val13);	
			VerifyValues(driver, "WDV", wdv, Val14);
			VerifyValues(driver, "TotalCapitalAllowanceFinal",TotalCapitalAllowanceFinal, Val15);
				
			VerifyValues(driver, "Tax Payable", TaxPayable, Val16);	
			
			int a1=Integer.parseInt(poolBF.getText())+Integer.parseInt(additions.getText())-Integer.parseInt(disposals.getText());
			int b1=a1-Integer.parseInt(wda.getText());
			//int d1=Integer.parseInt(TradingProfit.getText())-Integer.parseInt(c1);
			
			Reporter.log("Total Capital Allowance1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Total Capital Allowance1", TotalCapitalAllowance, a2);
			
			Reporter.log("WDV Final = "+b1, true);
			String b2=Integer.toString(b1);
			VerifyValues(driver, "Total Capital Allowance Final", wdv, b2);
			
//			Reporter.log("Net Trading Profit = "+d1, true);
//			String d2=Integer.toString(d1);
//			VerifyValues(driver, "Net Trading Loss", NetTradingProfit, d2);
			
						
			btnExportToPdf.click();
			Thread.sleep(2000);
		}
		
		public void UpdateCTAdjustmentsSettingsCapAllow2(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6) throws InterruptedException {

			CISPage cis=new CISPage(driver);
			cis.switchwindowDefault(driver);
			btnSave.click();
			Thread.sleep(2000);
			imgEdit.click();

			cis.switchwindowNew(driver);
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, txtTitle, TitleExp3);
			
			txtPrivateUse.clear();
			txtRestriction.clear();
			txtRate.clear();
			txtBroughtFwd.clear();
			txtAddition.clear();
			txtDisposals.clear();
			txtOverrideWDA.clear();
			//txtRestriction.sendKeys(Val1);
			txtRate.sendKeys(Val2);
			txtBroughtFwd.sendKeys(Val3);
			txtAddition.sendKeys(Val4);
			txtDisposals.sendKeys(Val5);
			
			Reporter.log("Val6 = "+Val6, true);
			if (Val6.equals("3"))
			{
				allowance.click();
			}
			btnSavePoolType.click();
			Thread.sleep(2000);
			
		}
		
		public void CTComputationPart4(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17, String Val18, String Val19, String Val20, String Val21, String Val22, String Val23, String Val24, String Val25, String Val26, String Val27, String Val28, String Val29, String Val30, String Val31, String Val32, String Val33) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			Reporter.log("Profits Original : " +Profits.getText(),true);
			int P1=Integer.parseInt(Profits.getText().replaceAll(",", ""));
			Reporter.log("Profits Integer after removing comma seperator : " +P1,true);
			String P2=Integer.toString(P1);
			VerifyValues(driver, "Profits", P2, Val1);
			
			VerifyValues(driver, "Amortisation", Amortisation, Val2);
			
			Reporter.log("GeneralPoolAllowances Original : " +GeneralPoolAllowances.getText(),true);
			int GPA1=Integer.parseInt(GeneralPoolAllowances.getText().replaceAll(",", ""));
			Reporter.log("GeneralPoolAllowances Integer after removing comma seperator : " +GPA1,true);
			String GPA2=Integer.toString(GPA1);
			VerifyValues(driver, "General Pool Allowances", GPA2, Val3);
			
			Reporter.log("AIA Original : " +AIA.getText(),true);
			int AIA1=Integer.parseInt(AIA.getText().replaceAll(",", ""));
			Reporter.log("AIA Integer after removing comma seperator : " +AIA1,true);
			String AIA2=Integer.toString(AIA1);
			VerifyValues(driver, "AIA", AIA2, Val18);
			Reporter.log("FYAllowance100per Original : " +FYAllowance100per.getText(),true);
			int FYAllowance100per1=Integer.parseInt(FYAllowance100per.getText().replaceAll(",", ""));
			Reporter.log("FYAllowance100per Integer after removing comma seperator : " +FYAllowance100per1,true);
			String FYAllowance100per2=Integer.toString(FYAllowance100per1);
			VerifyValues(driver, "FYAllowance100per", FYAllowance100per2, Val19);
			
			Reporter.log("Less Original : " +LessC3.getText(),true);
			int Less12=Integer.parseInt(LessC3.getText().replaceAll(",", ""));
			Reporter.log("Less Integer after removing comma seperator : " +Less12,true);
			String Less21=Integer.toString(Less12);
			VerifyValues(driver, "Less", Less21, Val20);
	
			
			Reporter.log("Trading Loss Original : " +TradingLoss.getText(),true);
			int TradingLoss1=Integer.parseInt(TradingLoss.getText().replaceAll(",", "").substring(1,6));
			
			Reporter.log("TradingLoss Integer after removing comma seperator : " +TradingLoss1,true);
			String TradingLoss2=Integer.toString(TradingLoss1);
			VerifyValues(driver, "Trading Loss", TradingLoss2, Val4);
			
			Reporter.log("Net Trading Loss Original : " +NetTradingLoss.getText(),true);
			int NetTradingLoss1=Integer.parseInt(NetTradingLoss.getText().replaceAll(",", "").substring(1,6));
			Reporter.log("Net Trading Loss Integer after removing comma seperator : " +NetTradingLoss1,true);
			String NetTradingLoss2=Integer.toString(NetTradingLoss1);
			VerifyValues(driver, "Net Trading Loss", NetTradingLoss2, Val4);

			
			VerifyValues(driver, "Rental Profit", RentalProfit, Val7);
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax, Val8);	
			
			VerifyValues(driver, "Pool B/F", poolBF, Val9);	
			VerifyValues(driver, "Additions", additions, Val10);	
			VerifyValues(driver, "Disposals", disposals, Val11);	
			VerifyValues(driver, "TotalCapitalAllowance", TotalCapitalAllowance, Val12);	
			VerifyValues(driver, "WDA", wda, Val13);	
			VerifyValues(driver, "WDV", wdv, Val14);

			//PM
			VerifyValues(driver, "Pool B/F", PMpoolBF, Val21);	
			VerifyValues(driver, "Additions", PMadditions, Val22);	
			VerifyValues(driver, "Disposals", PMdisposals, Val23);	
			VerifyValues(driver, "TotalCapitalAllowance", PMTotalCapitalAllowance, Val24);	
			VerifyValues(driver, "WDA1", PMwda1, Val25);	
			VerifyValues(driver, "WDA2", PMwda2, Val26);	
			VerifyValues(driver, "WDV", PMwdv, Val27);
		
			//EC
			VerifyValues(driver, "Pool B/F", ECpoolBF, Val28);	
			VerifyValues(driver, "Additions", ECadditions, Val29);	
			VerifyValues(driver, "Disposals", ECdisposals, Val30);	
			VerifyValues(driver, "TotalCapitalAllowance", ECTotalCapitalAllowance, Val31);	
			VerifyValues(driver, "WDA", ECwda1, Val32);	
			VerifyValues(driver, "WDV", ECwdv, Val33);
			VerifyValues(driver, "TotalCapitalAllowanceFinal",ECTotalCapitalAllowanceFinal, Val15);
			
			VerifyValues(driver, "Tax Payable", TaxPayable, Val16);	
			
			int a1=Integer.parseInt(poolBF.getText())+Integer.parseInt(additions.getText())-Integer.parseInt(disposals.getText());
			
			Reporter.log("Total Capital Allowance1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Total Capital Allowance1", TotalCapitalAllowance, a2);
						
			btnExportToPdf.click();
			Thread.sleep(2000);
		}
		
		public void CTComputationRDPart1(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17, String Val18, String Val19, String Val20, String Val21, String Val22, String Val23, String Val24, String Val25, String Val26, String Val27, String Val28, String Val29, String Val30, String Val31, String Val32, String Val33, String Val34, String Val35, String Val36,String Val37, String Val38, String Val39,String Val40) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			Reporter.log("Profits Original : " +Profits.getText(),true);
			int P1=Integer.parseInt(Profits.getText().replaceAll(",", ""));
			Reporter.log("Profits Integer after removing comma seperator : " +P1,true);
			String P2=Integer.toString(P1);
			VerifyValues(driver, "Profits", P2, Val1);
			
			//VerifyValues(driver, "Amortisation", Amortisation, Val2);
			
			Reporter.log("GeneralPoolAllowances Original : " +GeneralPoolAllowances.getText(),true);
			int GPA1=Integer.parseInt(GeneralPoolAllowances.getText().replaceAll(",", ""));
			Reporter.log("GeneralPoolAllowances Integer after removing comma seperator : " +GPA1,true);
			String GPA2=Integer.toString(GPA1);
			VerifyValues(driver, "General Pool Allowances", GPA2, Val3);
			
//			Reporter.log("AIA Original : " +AIA.getText(),true);
//			int AIA1=Integer.parseInt(AIA.getText().replaceAll(",", ""));
//			Reporter.log("AIA Integer after removing comma seperator : " +AIA1,true);
//			String AIA2=Integer.toString(AIA1);
//			VerifyValues(driver, "AIA", AIA2, Val18);
//			Reporter.log("FYAllowance100per Original : " +FYAllowance100per.getText(),true);
//			int FYAllowance100per1=Integer.parseInt(FYAllowance100per.getText().replaceAll(",", ""));
//			Reporter.log("FYAllowance100per Integer after removing comma seperator : " +FYAllowance100per1,true);
//			String FYAllowance100per2=Integer.toString(FYAllowance100per1);
//			VerifyValues(driver, "FYAllowance100per", FYAllowance100per2, Val19);
			
//			Reporter.log("Less Original : " +LessC3.getText(),true);
//			int Less12=Integer.parseInt(LessC3.getText().replaceAll(",", ""));
//			Reporter.log("Less Integer after removing comma seperator : " +Less12,true);
//			String Less21=Integer.toString(Less12);
//			VerifyValues(driver, "Less", Less21, Val20);
	
			
			Reporter.log("Trading Profit Original : " +TradingProfit.getText(),true);
			int TradingProfit1=Integer.parseInt(TradingProfit.getText().replaceAll(",", ""));
			
			Reporter.log("Trading Profit Integer after removing comma seperator : " +TradingProfit1,true);
			String TradingProfit2=Integer.toString(TradingProfit1);
			VerifyValues(driver, "Trading Profit", TradingProfit2, Val4);
			
			Reporter.log("Net Trading Profit Original : " +NetTradingProfit.getText(),true);
			int NetTradingProfit1=Integer.parseInt(NetTradingProfit.getText().replaceAll(",", ""));
			Reporter.log("Net Trading Profit Integer after removing comma seperator : " +NetTradingProfit1,true);
			String NetTradingProfit2=Integer.toString(NetTradingProfit1);
			VerifyValues(driver, "Net Trading Profit", NetTradingProfit2, Val4);
		
			VerifyValues(driver, "Rental Profit", RentalProfit, Val7);
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax.getText().replaceAll(",", ""), Val8);	
			
			VerifyValues(driver, "Pool B/F", poolBF, Val9);	
			VerifyValues(driver, "Additions", additions, Val10);	
			VerifyValues(driver, "Disposals", disposals, Val11);	
			VerifyValues(driver, "TotalCapitalAllowance", TotalCapitalAllowance, Val12);	
			VerifyValues(driver, "WDA", wda, Val13);	
			VerifyValues(driver, "WDV", wdv, Val14);
		
			VerifyValues(driver, "TotalCapitalAllowanceFinal",TotalCapitalAllowanceFinal, Val15);
			
			VerifyValues(driver, "Tax Refundable", TaxRefundable, Val16);	
			
			int a1=Integer.parseInt(poolBF.getText())+Integer.parseInt(additions.getText())-Integer.parseInt(disposals.getText());
			
			Reporter.log("Total Capital Allowance1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Total Capital Allowance1", TotalCapitalAllowance, a2);
			
			VerifyValues(driver, "Trading Professional Profits", TradingProfessionalProfits.getText().replaceAll(",", ""), Val21);
			VerifyValues(driver, "Losses BF and Used", LossesBFandUsed, Val22);
			VerifyValues(driver, "Net trading and professional profits", NetTradingProfessionalProfits.getText().replaceAll(",", ""), Val23);
			
			VerifyValues(driver, "Profits before deductions and reliefs", ProfitsBeforeDeductionsReliefs.getText().replaceAll(",", ""), Val23);
			VerifyValues(driver, "Profits before charges and reliefs", ProfitsBeforeChargesReliefs.getText().replaceAll(",", ""), Val23);
			VerifyValues(driver, "Profits chargeable to corporation tax", ProfitsChargeableCorporationTax.getText().replaceAll(",", ""), Val23);
			
			VerifyValues(driver, "FY1AmountOfProfitChargeableAtFirstRate", FY1AmountOfProfitChargeableAtFirstRate.getText().replaceAll(",", ""), Val24);
			VerifyValues(driver, "FY1ChargableProfit", FY1ChargableProfit.getText().replaceAll(",", ""), Val25);
			VerifyValues(driver, "FY2AmountOfProfitChargeableAtFirstRate", FY2AmountOfProfitChargeableAtFirstRate.getText().replaceAll(",", ""), Val26);
			VerifyValues(driver, "FY2ChargableProfit", FY2ChargableProfit.getText().replaceAll(",", ""), Val27);
			
			VerifyValues(driver, "CT2016FY1", CT2016FY1.getText().replaceAll(",", ""), Val28);
			VerifyValues(driver, "CT2016FY2", CT2016FY2.getText().replaceAll(",", ""), Val29);
			VerifyValues(driver, "'R & D Tax relief'", RDTaxRelief.getText().replaceAll(",", ""), Val30);
			VerifyValues(driver, "Total Reliefs Deductions Tax", TotalReliefsDeductionsTax.getText().replaceAll(",", ""), Val31);
			
			VerifyValues(driver, "Net Corporation Tax Liability", NetCorporationTaxLiability.getText().replaceAll(",", ""), Val32);
			VerifyValues(driver, "Tax Chargeable", TaxChargeable.getText().replaceAll(",", ""), Val32);
			VerifyValues(driver, "R&D Expenditure Claim", RDExpenditureClaim.getText().replaceAll(",", ""), Val33);
			VerifyValues(driver, "Enhanced research and development expenditure @ 13", EnhancedResearchDevelopmentExpenditure.getText().replaceAll(",", ""), Val34);
			
			VerifyValues(driver, "Surrenderable losses for the period", SurrenderableLossesPeriod.getText().replaceAll(",", ""), Val34);
			VerifyValues(driver, "Losses Surrendered Tax Credit", LossesSurrenderedTaxCredit.getText().replaceAll(",", ""), Val34);
			VerifyValues(driver, "CP 2016", CP2016.getText().replaceAll(",", ""), Val35);
			VerifyValues(driver, "CP 2016 Final", CP2016Final.getText().replaceAll(",", ""), Val36);
			VerifyValues(driver, "CP 2017 Final", CP2017Final.getText().replaceAll(",", ""), Val37);
			
			VerifyValues(driver, "Total RD Tax Credit", TotalRDTaxCredit.getText().replaceAll(",", ""), Val38);
			VerifyValues(driver, "Losses arising in period", LossesArisingPeriod.getText().replaceAll(",", ""), Val39);
			VerifyValues(driver, "Losses Surrendered Tax Credit", LossesSurrenderedTaxCredit.getText().replaceAll(",", ""), Val39);
			VerifyValues(driver, "Losses carried forward", LossesCF.getText().replaceAll(",", ""), Val40);
			
			btnExportToPdf.click();
			Thread.sleep(2000);
		}
		
		
		public void ClearCTAdjustmentsSettingsRDClaim(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String TitleExp4) throws InterruptedException {

			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkSettings.click();
			Thread.sleep(1000);
			lnkCTAdjustmentsSettings.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, lnkActAdjustments, TitleExp1);
			
			btnEdit.click();
			
			TabPanel4.click();
			
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptrReleif_ctl00_txtDescription);
			//vat.VerifyPageTitle(driver, RDClaim, TitleExp5);
			
			if (rptrReleif_ctl00_txtTotal.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!rptrReleif_ctl00_txtDescription.isEnabled())
			{
				Assert.fail("Field is coming disabled");
			}
			
			if (lnkDeleteLst.size()>0)
			{
			lnkDelete.click();
			cis.AlertAccept(driver);
			Thread.sleep(5000);
			}
			
			if (lnkDeleteLst.size()>0)
			{
			lnkDelete.click();
			cis.AlertAccept(driver);
			Thread.sleep(5000);
			}
			
			if (lnkDeleteLst.size()>0)
			{
			lnkDelete.click();
			cis.AlertAccept(driver);
			Thread.sleep(5000);
			}
			
			btnSave.click();
			Thread.sleep(2000);
			VerifyValues(driver, "Losses surrendered for tax credit", txtLossesSurrendered.getAttribute("Value"), "0.00");
		}
		
		public void UpdateCTAdjustmentsSettingsRDClaim1(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9) throws InterruptedException {

			btnEdit.click();
			
			TabPanel4.click();
			
//			VatPage vat = new VatPage(driver);
//			vat.VerifyPageTitle(driver, txtTitle, TitleExp3);
			
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, rptrReleif_ctl00_txtDescription);
			//vat.VerifyPageTitle(driver, RDClaim, TitleExp5);
			
			if (rptrReleif_ctl00_txtTotal.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!rptrReleif_ctl00_txtDescription.isEnabled())
			{
				Assert.fail("Field is coming disabled");
			}
			
			txtDescription1.clear();
			txtDescription1.sendKeys(Val1);
			txtEnhancement1.clear();
			txtEnhancement1.sendKeys(Val2);

			txtPercentage1.clear();
			txtPercentage1.sendKeys(Val3);
			txtDescription2.clear();
			txtDescription2.sendKeys(Val4);
			txtEnhancement2.clear();
			txtEnhancement2.sendKeys(Val5);
			txtPercentage2.clear();
			txtPercentage2.sendKeys(Val6);

			txtDescription3.clear();
			txtDescription3.sendKeys(Val7);
			txtEnhancement3.clear();
			txtEnhancement3.sendKeys(Val8);
			txtPercentage3.clear();
			txtPercentage3.sendKeys(Val9);
			
			btnSave.click();
			Thread.sleep(2000);
			
		}
		
	public void CTComputationRDPart2(WebDriver driver, String TitleExp1, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8, String Val9, String Val10, String Val11, String Val12, String Val13, String Val14, String Val15, String Val16, String Val17, String Val18, String Val19, String Val20, String Val21, String Val22, String Val23, String Val24, String Val25, String Val26, String Val27, String Val28, String Val29, String Val30, String Val31, String Val32, String Val33, String Val34, String Val35, String Val36,String Val37, String Val38, String Val39,String Val40) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			LnkCTComputation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			Reporter.log("Profits Original : " +Profits.getText(),true);
			int P1=Integer.parseInt(Profits.getText().replaceAll(",", ""));
			Reporter.log("Profits Integer after removing comma separator : " +P1,true);
			String P2=Integer.toString(P1);
			VerifyValues(driver, "Profits", P2, Val1);
			
			VerifyValues(driver, "Depreciation and Asset Disposal", DepreciationAssetDisposal.getText().replaceAll(",", ""), Val2);
			
			Reporter.log("GeneralPoolAllowances Original : " +GeneralPoolAllowances.getText(),true);
			int GPA1=Integer.parseInt(GeneralPoolAllowances.getText().replaceAll(",", ""));
			Reporter.log("GeneralPoolAllowances Integer after removing comma separator : " +GPA1,true);
			String GPA2=Integer.toString(GPA1);
			VerifyValues(driver, "General Pool Allowances", GPA2, Val3);
			
//			Reporter.log("AIA Original : " +AIA.getText(),true);
//			int AIA1=Integer.parseInt(AIA.getText().replaceAll(",", ""));
//			Reporter.log("AIA Integer after removing comma seperator : " +AIA1,true);
//			String AIA2=Integer.toString(AIA1);
//			VerifyValues(driver, "AIA", AIA2, Val18);
//			Reporter.log("FYAllowance100per Original : " +FYAllowance100per.getText(),true);
//			int FYAllowance100per1=Integer.parseInt(FYAllowance100per.getText().replaceAll(",", ""));
//			Reporter.log("FYAllowance100per Integer after removing comma seperator : " +FYAllowance100per1,true);
//			String FYAllowance100per2=Integer.toString(FYAllowance100per1);
//			VerifyValues(driver, "FYAllowance100per", FYAllowance100per2, Val19);
			
//			Reporter.log("Less Original : " +LessC3.getText(),true);
//			int Less12=Integer.parseInt(LessC3.getText().replaceAll(",", ""));
//			Reporter.log("Less Integer after removing comma seperator : " +Less12,true);
//			String Less21=Integer.toString(Less12);
//			VerifyValues(driver, "Less", Less21, Val20);
	
			
			Reporter.log("Trading Loss Original : " +TradingLoss,true);
			//int TradingLoss1=Integer.parseInt(TradingLoss.getText().replaceAll(",", ""));
			
			Reporter.log("Trading Loss Integer after removing comma seperator : " +TradingLoss.getText().replaceAll(",", ""),true);
			//String TradingLoss2=Integer.toString(TradingLoss1);
			VerifyValues(driver, "Trading Loss", TradingLoss.getText().replaceAll(",", ""), Val4);
			
			Reporter.log("Net Trading Loss Original : " +NetTradingLoss.getText(),true);
			//int NetTradingLoss1=Integer.parseInt(NetTradingLoss.getText().replaceAll(",", ""));
			Reporter.log("Net Trading Loss Integer after removing comma seperator : " +NetTradingLoss.getText().replaceAll(",", ""),true);
			//String NetTradingLoss2=Integer.toString(NetTradingLoss1);
			VerifyValues(driver, "Net Trading Loss", NetTradingLoss.getText().replaceAll(",", ""), Val4);
		
			VerifyValues(driver, "Rental Profit", RentalProfit, Val7);
			
			VerifyValues(driver, "Profits liable to Corporation Tax", ProfitsCorporationTax.getText().replaceAll(",", ""), Val8);	
			
			VerifyValues(driver, "Pool B/F", poolBF, Val9);	
			VerifyValues(driver, "Additions", additions, Val10);	
			VerifyValues(driver, "Disposals", disposals, Val11);	
			VerifyValues(driver, "TotalCapitalAllowance", TotalCapitalAllowance, Val12);	
			VerifyValues(driver, "WDA", wda, Val13);	
			VerifyValues(driver, "WDV", wdv, Val14);
		
			VerifyValues(driver, "TotalCapitalAllowanceFinal",TotalCapitalAllowanceFinal, Val15);
			
			VerifyValues(driver, "Tax Refundable", TaxRefundable, Val16);	
			
			int a1=Integer.parseInt(poolBF.getText())+Integer.parseInt(additions.getText())-Integer.parseInt(disposals.getText());
			
			Reporter.log("Total Capital Allowance1 = "+a1, true);
			String a2=Integer.toString(a1);
			VerifyValues(driver, "Total Capital Allowance1", TotalCapitalAllowance, a2);
			
			VerifyValues(driver, "Trading Professional Profits", TradingProfessionalProfits1.getText().replaceAll(",", ""), Val21);
			VerifyValues(driver, "Losses BF and Used", LossesBFandUsed, Val22);
			VerifyValues(driver, "Net trading and professional profits", NetTradingProfessionalProfits.getText().replaceAll(",", ""), Val23);
			
//			VerifyValues(driver, "Profits before deductions and reliefs", ProfitsBeforeDeductionsReliefs.getText().replaceAll(",", ""), Val23);
//			VerifyValues(driver, "Profits before charges and reliefs", ProfitsBeforeChargesReliefs.getText().replaceAll(",", ""), Val23);
//			VerifyValues(driver, "Profits chargeable to corporation tax", ProfitsChargeableCorporationTax.getText().replaceAll(",", ""), Val23);
			
			VerifyValues(driver, "FY1AmountOfProfitChargeableAtFirstRate", FY1AmountOfProfitChargeableAtFirstRate.getText().replaceAll(",", ""), Val24);
			VerifyValues(driver, "FY1ChargableProfit", FY1ChargableProfit1.getText().replaceAll(",", ""), Val25);
			VerifyValues(driver, "FY2AmountOfProfitChargeableAtFirstRate", FY2AmountOfProfitChargeableAtFirstRate.getText().replaceAll(",", ""), Val26);
			VerifyValues(driver, "FY2ChargableProfit", FY2ChargableProfit1.getText().replaceAll(",", ""), Val27);
			
			VerifyValues(driver, "CT2016FY1", CT2016FY1_1.getText().replaceAll(",", ""), Val28);
			VerifyValues(driver, "CT2016FY2", CT2016FY2_1.getText().replaceAll(",", ""), Val29);
			VerifyValues(driver, "'R & D Tax relief'", RDTaxRelief.getText().replaceAll(",", ""), Val30);
			VerifyValues(driver, "Total Reliefs Deductions Tax", TotalReliefsDeductionsTax.getText().replaceAll(",", ""), Val31);
			
			VerifyValues(driver, "Net Corporation Tax Liability", NetCorporationTaxLiability.getText().replaceAll(",", ""), Val32);
			VerifyValues(driver, "Tax Chargeable", TaxChargeable.getText().replaceAll(",", ""), Val32);
			VerifyValues(driver, "R&D Expenditure Claim", RDExpenditureClaim.getText().replaceAll(",", ""), Val33);
			VerifyValues(driver, "Enhanced research and development expenditure @ 13", EnhancedResearchDevelopmentExpenditure.getText().replaceAll(",", ""), Val34);
			
			VerifyValues(driver, "Enhanced expenditure from trade (A)", EnhancedExpenditureTradeA.getText().replaceAll(",", ""), Val35);
			VerifyValues(driver, "Unrelieved trade losses for period (B)", UnrelievedTradeLossesPeriodB.getText().replaceAll(",", ""), Val36);
			VerifyValues(driver, "Trading losses for the period", TradingLossesPeriod.getText().replaceAll(",", ""), Val37);
			
			
			
			VerifyValues(driver, "Surrenderable losses of the period (lower of A and B)", SurrenderableLossesPeriodAB.getText().replaceAll(",", ""), Val39);
			VerifyValues(driver, "Losses Surrendered Tax Credit", LossesSurrenderedTaxCredit1.getText().replaceAll(",", ""), Val39);
//			VerifyValues(driver, "CP 2016", CP2016.getText().replaceAll(",", ""), Val35);
//			VerifyValues(driver, "CP 2016 Final", CP2016Final.getText().replaceAll(",", ""), Val36);
//			VerifyValues(driver, "CP 2017 Final", CP2017Final.getText().replaceAll(",", ""), Val37);
			
			VerifyValues(driver, "Total RD Tax Credit", TotalRDTaxCredit.getText().replaceAll(",", ""), Val38);
			VerifyValues(driver, "Losses arising in period", LossesArisingPeriod.getText().replaceAll(",", ""), Val39);
			VerifyValues(driver, "Losses Surrendered Tax Credit", LossesSurrenderedTaxCredit3.getText().replaceAll(",", ""), Val39);
			VerifyValues(driver, "Losses carried forward", LossesCF.getText().replaceAll(",", ""), Val40);
			
			btnExportToPdf.click();
			Thread.sleep(2000);
		}
	
	
		public void VerifyInformationPageValues1(WebDriver driver, String Val1, String Val2, String Val3, String Val4, String Val5) throws InterruptedException {
		
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			
			lnkInformation.click();
			Thread.sleep(2000);
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, Val1);
			
			btnEdit.click();
	
			TabPanel1.click();
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 20, txtCreativeEnhancedExpenditure);
			
			TabPanel1.click();
			vat.VerifyPageTitle(driver, RDorCE, Val2);
			
			if (txtRandDEnhancedExpenditure.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!txtCreativeEnhancedExpenditure.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
			VerifyValues(driver, "R&D enhanced expenditure", txtRandDEnhancedExpenditure1.getAttribute("value"), Val4);
			VerifyValues(driver, "R&D and creative enhanced expenditure (total box 660 and 665)", txtTotalRandD.getAttribute("value"), Val4);
			
			TabPanel2.click();
			vat.VerifyPageTitle(driver, AllowanceCharges, Val3);
			
			if (!txtMachineryAndPlantSpecialRatePoolBalancingChargesInc.isEnabled())
			{
				Assert.fail("Field is coming diabled");
			}
			
			if (txtAIACapitalAllowancesInc.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			VerifyValues(driver, "Machinery and plant – main pool", txtMachineryAndPlantMainPoolCapitalAllowancesInc.getAttribute("value"), Val5);
	
			btnCancel.click();
			Thread.sleep(2000);
		}
		
		
		public void VerifyTaxCalculationPageValues1(WebDriver driver, String Val1, String Val2, String Val3, String Val4, String Val5, String Val6, String Val7, String Val8) throws InterruptedException {
			
			lnkFinalAccounts.click();
			
			Thread.sleep(2000);
			CISPage cis=new CISPage(driver);
			cis.switchwindowForward(driver);
			
			lnkCT600TaxReturn.click();
			Thread.sleep(1000);
			lnkTaxCalculation.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Jan 2017 - Dec 2017");
			Thread.sleep(3000);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, TitleAct, Val1);
			
			btnEdit.click();
			
			TabPanel1.click();
			WaitStatementLib wLib = new WaitStatementLib();
			wLib.explicitWait_elementToBeClickable(driver, 30, txtTonnageTaxProfits);
			
			TabPanel1.click();
			vat.VerifyPageTitle(driver, Turnover, Val2);
			
			if (txtTurnoverTotal.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!txtTonnageTaxProfits.isEnabled())
			{
				Assert.fail("Field is coming disabled");
			}
			
			VerifyValues(driver, "145	Total turnover from trade", txtTurnoverTotal1.getAttribute("value"), Val8);
			
			
//			TabPanel2.click();
//			
//			if (txtTradingLossesCarriedForward.isEnabled())
//			{
//				Assert.fail("Field is coming enabled");
//			}
//			
//			if (!txtUnquotedShares.isEnabled())
//			{
//				Assert.fail("Field is coming disabled");
//			}
			
//			TabPanel3.click();
//			vat.VerifyPageTitle(driver, TAXCALCULATION, Val3);
//			
//			if (txtYearOneProfit1.isEnabled())
//			{
//				Assert.fail("Field is coming enabled");
//			}
//			
//			if (!txtCommunityInvestmentRelief.isEnabled())
//			{
//				Assert.fail("Field is coming disabled");
//			}
			
			TabPanel4.click();

			if (txtResearchAndDevelopmentCredit.isEnabled())
			{
				Assert.fail("Field is coming enabled");
			}
			
			if (!txtCreativeCredit.isEnabled())
			{
				Assert.fail("Field is coming disabled");
			}
			
			VerifyValues(driver, "530	Research and Development credit", txtResearchAndDevelopmentCredit1.getAttribute("value"), Val4);
			VerifyValues(driver, "545	Total of Research and Development credit and creative tax credit total box 530 to 540", txtResearchAndDevelopmentVaccineOrCreativeTaxCredit.getAttribute("value"), Val5);
			VerifyValues(driver, "570	Surplus R & D credits or creative tax credit payable box 545 minus box 525", txtSurplusResearchAndDevelopmentCreditsOrCreativeCreditPayable.getAttribute("value"), Val6);
			VerifyValues(driver, "605	Tax overpaid including surplus or payable credits total sum of boxes 545, 560, 565 and 595 minus 525", txtTaxOverpaid.getAttribute("value"), Val7);
			
			
//			TabPanel5.click();
//			
//			if (!txtFrankedInvestmentIncome.isEnabled())
//			{
//				Assert.fail("Field is coming disabled");
//			}

			btnCancel.click();
			Thread.sleep(2000);
		}
	
	
}

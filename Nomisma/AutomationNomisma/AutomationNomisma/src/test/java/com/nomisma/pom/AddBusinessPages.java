package com.nomisma.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.StringReader;
import java.util.List;

import javax.security.auth.kerberos.KeyTab;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.nomisma.BusinessPom.BusinessPom;
import com.nomisma.SelfAssessmentpom2020.LibSA;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019;
import com.nomisma.generic.WaitStatementLib;

public class AddBusinessPages {

	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnSoleTrader")
	private WebElement soleTraderCompanyLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnPartnership")
	private WebElement partnershipCompanyLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnLLP")
	private WebElement LLPCompanyLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnPLC")
	private WebElement PLCBucinessLink;
	@FindBy (xpath="//strong[contains(text(),'Success!')]")
	private WebElement successMessage;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_ddlType")
	private WebElement searchBusinessType;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtnBusiness;
	@FindBy(id="ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany")
	private WebElement SearchCompany;
	@FindBy (id="ctl00_cpHeading_img2More")
	private WebElement moreBtn;
	@FindBy (xpath="//td[@id='ctl00_cPH_tdempseting']/a/span[contains(text(),'Partnership')]")
	private WebElement setUpPartnershipLnk;
	@FindBy (xpath="//table/tbody/tr/td[3]/a/span[contains(text(),'VAT')]")
	private WebElement linkVATSetUp;
	@FindBy(id="chk_EnableVAT")
	private WebElement enableVATChkBox;
	@FindBy(id="ctl00_cPH_tbContainer_TbVat_txtVATNo")
	private WebElement vATNTxtBox;
	@FindBy(id="ctl00_cPH_tbContainer_TbVat_ddFrequency")
	private WebElement frequencyLstBox;
	@FindBy(id="ctl00_cPH_tbContainer_TbVat_txtRegDate")
	private WebElement regDateTxtBox;
	@FindBy(id="ctl00_cPH_tbContainer_TbVat_btnVATSave")
	private WebElement vATSaveBtn;
	@FindBy(id="ctl00_cPH_optemployee")
	private WebElement addEmployeeBtn;
	@FindBy(id="ctl00_cpHeaderRight_btnEdit")
	private WebElement partnerEditBtn;
	@FindBy(id="ctl00_cPH_btnempAdd")
	private WebElement addPartnerBtn;
	@FindBy(id="ctl00_cPH_txtFirstName")
	private WebElement partnerFirstName;
	@FindBy(id="ctl00_cPH_txtLastName")
	private WebElement partnerLastName;
	@FindBy(id="chkEmployee")
	private WebElement employeeTypeChkBox;
	@FindBy(id="chkNominated")
	private WebElement nominatedTypeChkBox;
	@FindBy(id="chkOrdinary")
	private WebElement ordinaryTypeChkBox;
	@FindBy(id="ctl00_cPH_txtPhone")
	private WebElement phoneTxtBox;
	@FindBy(id="ctl00_cPH_txtAddress1")
	private WebElement empAddressLine1;
	@FindBy(id="ctl00_cphFooter_btnSave")
	private WebElement SaveButton;
	@FindBy(id="ctl00_cPH_btnNetproftLossAdj")
	private WebElement netproftLossAdjBtn;
	@FindBy(id="ctl00_cpHeaderRight_btnAdd")
	private WebElement newRatioBtn;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_txtNewPLRatio")
	private WebElement NewPLRatioForPartner1;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl01_txtNewPLRatio")
	private WebElement NewPLRatioForPartner2;
	//Link for opening dashboard of Partnership Tax Return page
	@FindBy (xpath="//span[contains(text(),'Partnership Tax Return')]")
	private WebElement linkPartnershipTaxReturnPage;
	@FindBy(id="ctl00_cpHeaderRight_btnSave")
	private WebElement saveBtnPTR;
	@FindBy(id="ctl00_cpHeaderRight_btnDelete")
	private WebElement delBtnSAPTR;
	@FindBy(id="ctl00_cpHeaderRight_btnCancel")
	private WebElement cancelBtnSAPTR;
	//SA 800 -> Partnership business and investment income -> Business Questions
	@FindBy (xpath="//span[contains(text(),'Partnership - SA800')]")
	private WebElement linkPartnershipSA800Page;
	@FindBy (xpath="//span[contains(text(),'Partnership Land Property - SA801')]")
	private WebElement linkPartnershipSA801Page;
	@FindBy (xpath="//ul/li/a[contains(text(),'Business & Investment Income')]")
	private WebElement linkBusinessAndInvestmentIncome;
	@FindBy (xpath="//ul/li/a[contains(text(),'SA801 - Partnership UK Property')]")
	private WebElement linkPartnershipUKPropertyIcome;
	@FindBy(id="ctl00_cPH_lstUKPropertyIncome")
	private WebElement BoxQ1SA800;
	@FindBy(id="ctl00_cPH_lstForeignIncome")
	private WebElement BoxQ2SA800;
	@FindBy (xpath="//ul/li/a[contains(text(),'Trading & Professional Income')]")
	private WebElement linkTradingProfessionalIncome;
	@FindBy(id="ctl00_cPH_txtBRTurnover")
	private WebElement SA800TurnOverTxtBox;
	@FindBy(id="ctl00_cPH_txtSalesBusinessIncome")
	private WebElement SA800SalesBusinessIncomeTxtBox;
	@FindBy(id="ctl00_cPH_txtCAAnnualInvAllowance")
	private WebElement SA800AnnualInvAllowanceTxtBox;
	@FindBy(id="ctl00_cPH_txtBCLowerCO2Emissions")
	private WebElement SA800LowerCO2EmissionsTxtBox;
	@FindBy(id="ctl00_cPH_txtBalancingCharges")
	private WebElement SA800BalancingChargesTxtBox;
	@FindBy(id="ctl00_cPH_txtDeductions")
	private WebElement SA800DeductionsTxtBox;
	@FindBy(id="ctl00_cPH_txtTotalCADeductions")
	private WebElement SA800TotalCADeductionsTxtBox;
	@FindBy(id="ctl00_cPH_txtCapitalAllowances")
	private WebElement SA800CapitalAllowancesTxtBox;
	@FindBy(id="ctl00_cPH_lstTradeProfession")
	private WebElement BoxQ3SA800;
	@FindBy(id="ctl00_cPH_lstDisposedChargeAssets")
	private WebElement BoxQ4SA800;
	@FindBy(id="ctl00_cPH_lstNotResidentUK")
	private WebElement BoxQ5aSA800;
	@FindBy(id="ctl00_cPH_lstControlledAbroad")
	private WebElement BoxQ5bSA800;
	@FindBy(id="ctl00_cPH_lstCompany")
	private WebElement BoxQ5cSA800;
	@FindBy(id="ctl00_cPH_lstRentFromUKProperty")
	private WebElement BoxQ6SA800;
	@FindBy (xpath="//ul/li/a[contains(text(),'Partnership Statement(Short)')]")
	private WebElement linkPartnershipStatementShort;
	@FindBy (xpath="//ul/li/a[contains(text(),'Partnership Statement(Full)')]")
	private WebElement linkPartnershipStatementFull;
	@FindBy(id="ctl00_cPH_txtTradeProfessionProfit")
	private WebElement tradeProfessionProfitTxtBox;
	@FindBy(id="ctl00_cPH_txtAdjChangeBasis")
	private WebElement adjChangeBasisTxtBox;
	@FindBy(id="ctl00_cPH_txtNetProfit")
	private WebElement netProfitTxtBox;
	@FindBy(id="ctl00_cPH_txtAllowableLoss")
	private WebElement allowableLossTxtBox;
	@FindBy(id="ctl00_cPH_txtAllowableExpenses")
	private WebElement allowableExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtTradeProfessionLoss")
	private WebElement tradeProfessionLossTxtBox;
	@FindBy(id="ctl00_cPH_txtContractorsDeductions")
	private WebElement contractorsDeductionsTxtBox;
	@FindBy(id="ctl00_cPH_txtTaxTakenOffTradeIncome")
	private WebElement takenOffTradeIncomeTxtBox;
	@FindBy(id="ctl00_cPH_txtCISDeductions")
	private WebElement cISDeductionsTxtBox;
	@FindBy (xpath="//h2[contains(text(), 'Partnership business and investment income')]")
	private WebElement labelPartnershipBusinessAndInvestmentIncome;
	//SA800 -> PTRFull
	@FindBy(id="ctl00_cPH_txtIncomeFromOffshoreFunds")
	private WebElement incomeFromOffshoreFundsTxtBox;
	@FindBy(id="ctl00_cPH_txtLossOnForeignLetProperty")
	private WebElement lossOnForeignLetPropertyTxtBox;
	@FindBy(id="ctl00_cPH_txtResidentialFinanceCostsOnForeignProperty")
	private WebElement residentialFinanceCostsOnForeignPropertyTxtBox;
	@FindBy(id="ctl00_cPH_txtTotalProceedsFromDisposalsOfChargeableAssets")
	private WebElement totalProceedsFromDisposalsOfChargeableAssetsTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl00_txtPtrTradeProfessionProfit")
	private WebElement ptr1TradeProfessionProfitTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl00_txtPtrIncomeFromOffshoreFunds")
	private WebElement ptr1IncomeFromOffshoreFundsTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl00_txtPtrLossOnForeignLetProperty")
	private WebElement ptr1LossOnForeignLetPropertyTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl00_txtPtrResidentialFinanceCostsOnForeignProperty")
	private WebElement ptr1ResidentialFinanceCostsOnForeignPropertyTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl00_txtPtrTotalProceedsFromDisposalsOfChargeableAssets")
	private WebElement ptrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl01_txtPtrTotalProceedsFromDisposalsOfChargeableAssets")
	private WebElement partnerDetails_ctl01_txtPtrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl01_txtPtrTradeProfessionProfit")
	private WebElement ptr2TradeProfessionProfitTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl01_txtPtrIncomeFromOffshoreFunds")
	private WebElement ptr2IncomeFromOffshoreFundsTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl01_txtPtrLossOnForeignLetProperty")
	private WebElement ptr2LossOnForeignLetPropertyTxtBox;
	@FindBy(id="ctl00_cPH_rptrPartnerDetails_ctl01_txtPtrResidentialFinanceCostsOnForeignProperty")
	private WebElement ptr2ResidentialFinanceCostsOnForeignPropertyTxtBox;

	// SA800 -> Partnership business and investment income -> Summary of balance sheet->Assets
	@FindBy(id="ctl00_cPH_txtPlantMachinery")
	private WebElement plantMachineryTxtBox;
	@FindBy(id="ctl00_cPH_txtTECostOfSales")
	private WebElement SA800CostOfSalesTxtBox;
	@FindBy(id="ctl00_cPH_txtOtherFixedAssets")
	private WebElement SA800OtherFixedAssetsTxtBox;
	@FindBy(id="ctl00_cPH_txtDebtors")
	private WebElement SA800DebtorsTxtBox;
	@FindBy(id="ctl00_cPH_txtBankSocietyBalances")
	private WebElement SA800BankSocietyBalancesTxtBox;
	@FindBy(id="ctl00_cPH_txtCashInHand")
	private WebElement SA800CashInHandTxtBox;
	@FindBy(id="ctl00_cPH_txtTotalAssets")
	private WebElement SA800TotalAssetsTxtBox;
	// SA800 -> Partnership business and investment income -> Summary of balance sheet->Liabilities
	@FindBy(id="ctl00_cPH_txtTradeCreditors")
	private WebElement SA800TradeCreditorsTxtBox;
	@FindBy(id="ctl00_cPH_txtLoans")
	private WebElement SA800LoansTxtBox;
	@FindBy(id="ctl00_cPH_txtOtherLiabilities")
	private WebElement SA800OtherLiabilitiesTxtBox;
	@FindBy(id="ctl00_cPH_txtTotalLiabilities")
	private WebElement SA800TotalLiabilitiesTxtBox;
	@FindBy(id="ctl00_cPH_txtNetBusinessAssets")
	private WebElement SA800NetBusinessAssetsTxtBox;
	// SA800 -> Partnership business and investment income -> Summary of balance sheet->Represented by partners' current and capital accounts
	@FindBy(id="ctl00_cPH_txtBalanceAtStart")
	private WebElement SA800BalanceAtStartTxtBox;
	@FindBy(id="ctl00_cPH_txtCapitalIntroduced")
	private WebElement SA800CapitalIntroducedTxtBox;
	@FindBy(id="ctl00_cPH_txtDrawings")
	private WebElement SA800DrawingsTxtBox;
	@FindBy(id="ctl00_cPH_txtBalanceAtTheEnd")
	private WebElement SA800BalanceAtTheEndTxtBox;
	// SA800 -> Partnership business and investment income -> Summary of balance sheet->Partnership trade charges
	@FindBy(id="ctl00_cPH_txtNetPtrshipCharges")
	private WebElement SA800NetPtrshipChargesTxtBox;
	@FindBy(id="ctl00_cPH_txtStockWorkInProgress")
	private WebElement SA800StockWorkInProgressTxtBox;
	@FindBy(id="ctl00_cPH_txtTESubcontractorCosts")
	private WebElement SA800SubcontractorCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEOtherDirectCosts")
	private WebElement SA800OtherDirectCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtGrossProfitLoss")
	private WebElement SA800GrossProfitLossTxtBox;
	@FindBy(id="ctl00_cPH_txtNetProfitLoss")
	private WebElement SA800NetProfitLossTxtBox;
	@FindBy(id="ctl00_cPH_txtOtherIncomeProfits")
	private WebElement SA800OtherIncomeProfitsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEEmployeeCosts")
	private WebElement SA800EmployeeCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtTotalExpenses")
	private WebElement SA800TotalExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtNetBusinessProfit")
	private WebElement SA800NetBusinessProfitTxtBox;
	@FindBy(id="ctl00_cPH_txtCustomerName")
	private WebElement customerName;
	@FindBy(id="ctl00_cpHeaderRight_rdbManualAuto_0")
	private WebElement autoOptionBtn;
	@FindBy(id="ctl00_cpHeaderRight_rdbManualAuto_1")
	private WebElement manualOptionBtn;
	@FindBy(id="ctl00_cPH_chkIsPartnershipShort")
	private WebElement partnershipShortChekBox;
	@FindBy(id="ctl00_cPH_btnOk")
	private WebElement saveBtnAlertMsg;
	@FindBy(id="ctl00_cPH_chkIsVATIncluded")
	private WebElement isVATIncludedChkBox;
	@FindBy(id="ctl00_cPH_chkIsVATExcluded")
	private WebElement isVATExcludedChkBox;
	@FindBy(id="ctl00_cPH_txtTEPremisesCosts")
	private WebElement SA800TEPremisesCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtTERepairs")
	private WebElement SA800TERepairsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEGenAdminExpenses")
	private WebElement SA800TEGenAdminExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtTEMotorExpenses")
	private WebElement SA800TEMotorExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtTETravelSubsistence")
	private WebElement SA800TETravelSubsistenceTxtBox;
	@FindBy(id="ctl00_cPH_txtTEAdvPromotion")
	private WebElement SA800TEAdvPromotionTxtBox;
	@FindBy(id="ctl00_cPH_txtTELegalProfCosts")
	private WebElement SA800TELegalProfCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEBadDebts")
	private WebElement SA800TEBadDebtsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEIntAltFinancePayments")
	private WebElement SA800TEIntAltFinancePaymentsTxtBox;
	@FindBy(id="ctl00_cPH_txtTEOtherFinCharges")
	private WebElement SA800TEOtherFinChargesTxtBox;
	@FindBy(id="ctl00_cPH_txtTEDepreciationOnSale")
	private WebElement SA800TEDepreciationOnSaleTxtBox;
	@FindBy(id="ctl00_cPH_txtTEOtherExpenses")
	private WebElement SA800TEOtherExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtOtherTaxOnTradingIncome")
	private WebElement otherTaxOnTradingIncomeTxtBox;
	@FindBy(id="ctl00_cPH_txtPartnershipCharges")
	private WebElement partnershipChargesTxtBox;
	//SA 800 ->Trading and professional income -> Disallowable expenses 
	@FindBy(id="ctl00_cPH_txtDECostOfSales")
	private WebElement DECostOfSalesTxtBox;
	@FindBy(id="ctl00_cPH_txtDESubcontractorCosts")
	private WebElement DESubcontractorCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEOtherDirectCosts")
	private WebElement DEOtherDirectCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEEmployeeCosts")
	private WebElement DEEmployeeCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEPremisesCosts")
	private WebElement DEPremisesCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDERepairs")
	private WebElement DERepairsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEGenAdminExpenses")
	private WebElement DEGenAdminExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtDEMotorExpenses")
	private WebElement DEMotorExpensesTxtBox;
	@FindBy(id="ctl00_cPH_txtDETravelSubsistence")
	private WebElement DETravelSubsistenceTxtBox;
	@FindBy(id="ctl00_cPH_txtDEAdvPromotion")
	private WebElement DEAdvPromotionTxtBox;
	@FindBy(id="ctl00_cPH_txtDELegalProfCosts")
	private WebElement DELegalProfCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEBadDebts")
	private WebElement DEBadDebtsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEIntAltFinancePayments")
	private WebElement DEIntAltFinancePaymentsTxtBox;
	@FindBy(id="ctl00_cPH_txtDEOtherFinCharges")
	private WebElement DEOtherFinChargesTxtBox;
	@FindBy(id="ctl00_cPH_txtDEDepreciationOnSale")
	private WebElement DEDepreciationOnSaleTxtBox;
	@FindBy(id="ctl00_cPH_txtDEOtherExpenses")
	private WebElement DEOtherExpensesTxtBox;

	//Fetched
	@FindBy(id="ctl00_cPH_txtDisallowableExp")
	private WebElement DisallowableExpTxtBox;
	//SA 801 ->Partnership Land Property
	@FindBy (xpath="//span[contains(text(),'Partnership Land Property - SA801')]")
	private WebElement linkPartnershipLandPropertySA801Page;
	@FindBy (xpath="//ul/li/a[contains(text(),'SA801 - Partnership UK Property')]")
	private WebElement linkPartnershipUKPropertySA801;
	@FindBy(id="ctl00_cPH_txtIncome")
	private WebElement SA801IncomeFromFurnishedHolidayLettingsTxtBox;
	@FindBy(id="ctl00_cPH_txtRentsEtcTaxDeducted")
	private WebElement PTRRentsEtcTaxDeductedTxtBox;
	//SA 802 ->Partnership Foreign
	@FindBy (xpath="//span[contains(text(), 'Partnership Foreign - SA802')]")
	private WebElement linkSA802Page;
	@FindBy (xpath="//ul/li/a[contains(text(),'SA802 - Partnership Foreign')]")
	private WebElement linkSA802PartnershipForeignPage;
	//SA 802 ->Partnership Foreign -> Income	
	@FindBy(id="ctl00_cPH_txtRentsEtcIncome")
	private WebElement PTRRentsEtcIncomeTxtBox;
	@FindBy(id="ctl00_cPH_chkincomeformoreproperty")
	private WebElement incomeForMorePropertyChkBox;
	@FindBy(id="ctl00_cPH_chkincomeisunremittable")
	private WebElement incomeIsUnremittableChkBox;
	//SA 802 ->Partnership Foreign -> Expenses	
	@FindBy(id="ctl00_cPH_txtOPRentEtc")
	private WebElement oPRentEtcTxtBox;
	@FindBy(id="ctl00_cPH_txtOPRepairsEtc")
	private WebElement oPRepairsEtcTxtBox;
	@FindBy(id="ctl00_cPH_txtOPFinanceEtc")
	private WebElement oPFinanceEtcTxtBox;
	@FindBy(id="ctl00_cPH_txtOPLegalAndProfessionalCosts")
	private WebElement oPLegalAndProfessionalCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtOPCostOfServicesProvided")
	private WebElement oPCostOfServicesProvidedTxtBox;
	@FindBy(id="ctl00_cPH_txtOPOtherExpenses")
	private WebElement oPOtherExpensesTxtBox;
	//Fetched ->Total of boxes 2.12 to 2.17
	@FindBy(id="ctl00_cPH_txtOPTotalExpenses")
	private WebElement oPTotalExpensesTxtBox;
	//Fetched ->Net Profit/(loss) -> 2.11 - 2.18
	@FindBy(id="ctl00_cPH_txtOPNetProfitOrLoss")
	private WebElement oPNetProfitOrLossTxtBox;
	//SA 804 -> Partnership savings, Investment and other income
	@FindBy (xpath="//span[contains(text(), 'Partnership Savings - SA804')]")
	private WebElement linkSA804Page;
	@FindBy (xpath="//ul/li/a[contains(text(),'SA804 - Partnership Savings, Investment & Other Income')]")
	private WebElement linkSA802PartnershipSavingsInvestmentOtherIncomePage;

	//SA 802 ->Partnership Foreign -> Tax Adjustments
	@FindBy(id="ctl00_cPH_txtOPTAPrivateUse")
	private WebElement oPTAPrivateUseTxtBox;
	@FindBy(id="ctl00_cPH_txtOPTABalancingCharges")
	private WebElement oPTABalancingChargesTxtBox;

	//Fetched ->Total of box 2.20 + box 2.21
	@FindBy(id="ctl00_cPH_txtTATotalAdditions")
	private WebElement tATotalAdditionsTxtBox;
	@FindBy(id="ctl00_cPH_txtCapitalAllowances")
	private WebElement capitalAllowancesTxtBox;
	@FindBy(id="ctl00_cPH_chkIsEnhancedCapitalAllowances")
	private WebElement isEnhancedCapitalAllowancesChkBox;
	@FindBy(id="ctl00_cPH_txtOPCostsOfReplacingDomesticItems")
	private WebElement oPCostsOfReplacingDomesticItemsTxtBox;
	//Fetched ->Total of boxes 2.23 + 2.24
	@FindBy(id="ctl00_cPH_txtTotalDeductions")
	private WebElement totalDeductionsTxtBox;
	@FindBy(id="ctl00_cPH_txtadjustedprofit")
	private WebElement adjustedProfitTxtBox;
	@FindBy(id="ctl00_cPH_txtadjustedloss")
	private WebElement adjustedLossTxtBox;
	@FindBy(id="ctl00_cPH_txtTATaxableProfit")
	private WebElement tATaxableProfitTxtBox;
	@FindBy(id="ctl00_cPH_txtTAAllowableLoss")
	private WebElement tAAllowableLossTxtBox;
	@FindBy(id="ctl00_cPH_txttaxpaid")
	private WebElement taxPaidTxtBox;
	@FindBy(id="ctl00_cPH_txtResidentialFinanceCosts")
	private WebElement residentialFinanceCostsTxtBox;
	@FindBy(id="ctl00_cPH_txtDisposalsofholdingsinoffshorefunds")
	private WebElement disposalsOfHoldingsInOffShoreFundsTxtBox;
	@FindBy(id="ctl00_cPH_txtLossesonforeignletproperty")
	private WebElement lossesOnForeignLetPropertyTxtBox;
	@FindBy(id="ctl00_cPH_txtdisposalresidencialfinancecost")
	private WebElement disposalResidencialFinanceCostTxtBox;
	@FindBy(id="ctl00_cPH_txtAdditionalInfo")
	private WebElement additionalInfoTxtBox;
	@FindBy(id="ctl00_cPH_lttotaltaxableloss")
	private WebElement totalTaxableLossTxtBox;
	//SA 803 ->Partnership Disposal of Chargeable Assets
	@FindBy (xpath="//span[contains(text(),'Partnership Disposal of Chargeable Assets - SA803')]")
	private WebElement linkSA803Page;
	@FindBy (xpath="//ul/li/a[contains(text(),'SA803 -  Partnership Disposal of Chargeable Assets')]")
	private WebElement linkSA803PartnershipDisposalOfChargeableAssetsPage;
	@FindBy (xpath="//h3[contains(text(),'Disposals of chargeable assets made by the partnership in the period')]//..//div//a//img")
	private WebElement addBtnDisposalsOfChargeableAssetsMade;
	@FindBy(id="ctl00_cPH_txtdescription")
	private WebElement disposalsOfChargeableAssetsDescriptionTxtBox;
	@FindBy(id="ctl00_cPH_txtDisposalproceeds")
	private WebElement disposalsOfChargeableAssetsDisposalproceedsTxtBox;
	@FindBy(id="ctl00_cPH_txtfurtherinfo")
	private WebElement furtherinfoSA803;
	@FindBy(id="ctl00_cPH_rptdisposalofchargeableassets_ctl00_hrefDelete")
	private WebElement disposalOfChargeableAssetsDelBtn;
	//tax return -> Partnership Summary
	@FindBy (xpath="//a[contains(text(),'Partnership Summary')]")
	private WebElement partnershipSummaryLink;
	@FindBy (xpath="//tr/td[contains(text(),'3.82')]//..//td[3]")
	private WebElement changeOfBasisAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.97')]//..//td[3]")
	private WebElement SubcontractorsDeductionsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.98')]//..//td[3]")
	private WebElement TaxDeductedFromTradingIncomeAmt;
	@FindBy (xpath="//tr/td[contains(text(),'CIS25 deductions')]//..//td[3]")
	private WebElement CIS25DeductionsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'Other tax deducted')]//..//td[3]")
	private WebElement OtherTaxDeductedAmt;
	
	@FindBy (xpath="//tr/td[contains(text(),'3.99')]//..//td[3]")
	private WebElement plantMachineryAndMotorVehiclesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.100')]//..//td[3]")
	private WebElement otherFixedAssetsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.101')]//..//td[3]")
	private WebElement stockAndWorkInProgressAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.102')]//..//td[3]")
	private WebElement DebtorsPrepaymentsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.103')]//..//td[3]")
	private WebElement CashInHandAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.104')]//..//td[3]")
	private WebElement bankEtcBalancesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.105')]//..//td[3]")
	private WebElement TotalAssetsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.106')]//..//td[3]")
	private WebElement tradeCreditorsAndAccrualsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.107')]//..//td[3]")
	private WebElement loansAndOverdrawnBankAccountsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.108')]//..//td[3]")
	private WebElement otherLiabilitiesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.109')]//..//td[3]")
	private WebElement totalLiabilitiesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.110')]//..//td[3]")
	private WebElement netBusinessAssetsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.111')]//..//td[3]")
	private WebElement balanceAtStartOfPeriodAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.112')]//..//td[3]")
	private WebElement netProfitLossAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.113')]//..//td[3]")
	private WebElement capitalIntroducedAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.114')]//..//td[3]")
	private WebElement DrawingsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.115')]//..//td[3]")
	private WebElement balanceAtEndOfPeriodAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.117')]//..//td[3]")
	private WebElement netPartnershipChargesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.29')]//..//td[3]")
	private WebElement partnershipChargesAmt;
	@FindBy (xpath="//tr/td[contains(text(),'2.0')]//..//td[3]")
	private WebElement foreignStatus;
	@FindBy (xpath="//tr/td[contains(text(),'3.0')]//..//td[3]")
	private WebElement tradeStatus;
	@FindBy (xpath="//tr/td[contains(text(),'4.0')]//..//td[3]")
	private WebElement chargeableAssets;
	@FindBy (xpath="//tr/td[contains(text(),'3.28')]//..//td[3]")
	private WebElement excludeVATStatus;
	@FindBy (xpath="//tr/td[contains(text(),'3.29')]//..//td[3]")
	private WebElement salesBusinessIncome;
	@FindBy (xpath="//tr/td[contains(text(),'3.49')]//..//td[3]")
	private WebElement grossProfitLossAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.65')]//..//td[3]")
	private WebElement netProfitOrLossAmt;
	@FindBy (xpath="//tr/td[contains(text(),'3.73')]//..//td[3]")
	private WebElement netProfitLossAmtSA800;
	@FindBy (xpath="//tr/td[contains(text(),'3.83')]//..//td[3]")
	private WebElement netProfitAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.11')]//..//td[3]")
	private WebElement tradeProfitAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.18')]//..//td[3]")
	private WebElement incomeFromOffshoreFundsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.21')]//..//td[3]")
	private WebElement lossOnForeignLetPropertyAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.27')]//..//td[3]")
	private WebElement residentialFinanceCostsOnForeignPropertyAmt;
	@FindBy (xpath="//tr/td[contains(text(),'N1.30')]//..//td[3]")
	private WebElement totalDisposalChargeableAssetsAmt;
	
	@FindBy (xpath="(//tr/td[contains(text(),'N2.11')]//..//td[3])[1]")
	private WebElement tradeProfitAmtPartner1;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.18')]//..//td[3])[1]")
	private WebElement incomeFromOffShoreFundsAmtPartner1;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.21')]//..//td[3])[1]")
	private WebElement lossOnForeignLetPropertyAmtPartner1;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.27')]//..//td[3])[1]")
	private WebElement residentialFinanceCostsOnForeignPropertyAmtPartner1;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.30')]//..//td[3])[1]")
	private WebElement disposalOfChargeableAssetsAmtPartner1;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.11')]//..//td[3])[2]")
	private WebElement tradeProfitAmtPartner2;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.18')]//..//td[3])[2]")
	private WebElement incomeFromOffShoreFundsAmtPartner2;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.21')]//..//td[3])[2]")
	private WebElement lossOnForeignLetPropertyAmtPartner2;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.27')]//..//td[3])[2]")
	private WebElement residentialFinanceCostsOnForeignPropertyAmtPartner2;
	@FindBy (xpath="(//tr/td[contains(text(),'N2.30')]//..//td[3])[2]")
	private WebElement disposalOfChargeableAssetsAmtPartner2;
	
	@FindBy (xpath="//tr/td[contains(text(),'2.9')]//..//td[3]")
	private WebElement disposalsOfOffshoreFundsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'Losses on foreign let property')]//..//td[3]")
	private WebElement lossesOnForeignLetPropertyAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.10A')]//..//td[3]")
	private WebElement residentialFinanceCostsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'Total Rents Etc')]//..//td[3]")
	private WebElement totalRentsEtctAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.11A')]//..//td[3]")
	private WebElement multiplePropertiesStatusSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.11B')]//..//td[3]")	
	private WebElement incomeUnremittableStatusSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.12')]//..//td[3]")
	private WebElement RentRatesEtcAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.13')]//..//td[3]")
	private WebElement repairsAndRenewalsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.14')]//..//td[3]")
	private WebElement financeChargesAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.15')]//..//td[3]")
	private WebElement legalAndProfessionalCostsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.16')]//..//td[3]")
	private WebElement costOfServicesAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.17')]//..//td[3]")
	private WebElement otherExpensesAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'Total Expenditure')]//..//td[3]")
	private WebElement totalExpenditureAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.19')]//..//td[3]")
	private WebElement netProfitLossAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.20')]//..//td[3]")
	private WebElement privateUseAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'Balancing Charges')]//..//td[3]")
	private WebElement balancingChargesAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.22')]//..//td[3]")
	private WebElement totalAdditionsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.23')]//..//td[3]")
	private WebElement capitalAllowancesAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.24')]//..//td[3]")
	private WebElement costsOfReplacingDomesticItemsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.25')]//..//td[3]")
	private WebElement totalDeductionsAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.26')]//..//td[3]")	
	private WebElement adjustedProfitAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.28')]//..//td[3]")
	private WebElement taxableProfitAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.30')]//..//td[3]")	
	private WebElement foreignTaxPaidAmtSA802;
	@FindBy (xpath="//tr/td[contains(text(),'2.30A')]//..//td[3]")	
	private WebElement residentialFinanceCostsAmt;
	@FindBy (xpath="//tr/td[contains(text(),'2.34')]//..//td[3]")	
	private WebElement totalTaxableLossAmtSA802;
	//income -> add invoice
	@FindBy(id="ctl00_cpHFooter_btnSave")
	private WebElement saveInvoiceBtn;
	@FindBy(id="ctl00_ddlFinancialYear")
	private WebElement financialYearLstBox;
	@FindBy (xpath="//div[@id='ctl00_cPH_Headerpnl']/div/div/div/div/div/div/a/p")
	private WebElement addCustomerBtn;
	//Accountant -> journal entry
	@FindBy(id="ctl00_cPH_journalmodal1Iframe1")
	private WebElement frameJournalEntry;
	@FindBy(id="AddinvoicemodalplusIFrame")
	private WebElement frameAddinvoicemodalplus;
	@FindBy(id="EditModalFrame")
	private WebElement frameEditModal;
	
	@FindBy (xpath="//span[contains(text(),'Accountant')]")
	private WebElement linkAccountantPage;
	@FindBy(id="ctl00_cPH_btnAddJournalEntry")
	private WebElement addJournalEntryBtn;
	@FindBy(id="ctl00_cPH_txtDescription")
	private WebElement descriptionTxtBox;
	@FindBy(id="ctl00_cPH_rptRecord_ctl00_AccountUC1_txtAccount")
	private WebElement line1AccountTxtBox;
	@FindBy(id="ctl00_cPH_rptRecord_ctl01_txtDebit")
	private WebElement line2DebitAmtTxtBox;
	@FindBy(id="ctl00_cPH_rptRecord_ctl01_txtCredit")
	private WebElement line2CreditAmtTxtBox;		
	@FindBy(id="ctl00_cPH_rptRecord_ctl01_AccountUC1_txtAccount")
	private WebElement line2AccountTxtBox;
	@FindBy(id="ctl00_cPH_rptRecord_ctl00_txtCredit")
	private WebElement line1CreditAmtTxtBox;
	@FindBy(id="ctl00_cPH_rptRecord_ctl00_txtDebit")
	private WebElement line1DebitAmtTxtBox;
	@FindBy (xpath="//a[contains(text(),'Manual Trial Balance Entry')]")
	private WebElement linkManualTrialBalanceEntry;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel1_rptrProfitloss_ctl30_txtCredit")
	private WebElement creditTxtBox4020;
	@FindBy (xpath="//span[contains(text(),'Balance Sheet')]")
	private WebElement linkBalanceSheetTab;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel2_rptrBalanceSheet_ctl98_txtDebit")
	private WebElement debitTxtBox3200;
	@FindBy (xpath="//span[contains(text(),'Final Accounts')]")
	private WebElement linkFinalAccounts;
	@FindBy(id="ctl00_cPH_txtDate")
	private WebElement accountsDateTxtBox;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Sales')]//..//td[2]")
	private WebElement finalAccountSalesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Opening stock')]//..//td[2]")
	private WebElement finalAccountOpeningStockAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Purchases')]//..//td[2]")
	private WebElement finalAccountPurchasesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Materials')]//..//td[2]")
	private WebElement finalAccountMaterialsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Closing stock')]//..//td[2]")
	private WebElement finalAccountClosingstockAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Discount')]//..//td[2]")
	private WebElement finalAccountDiscountAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Gross wages')]//..//td[2]")
	private WebElement finalAccountGrossWagesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'NIC employer')]//..//td[2]")
	private WebElement finalAccountNICEmployerAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Other direct expenses')]//..//td[2]")
	private WebElement finalAccountOtherDirectExpensesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Transportation cost')]//..//td[2]")
	private WebElement finalAccountTransportationCostAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Discount allowed')]//..//td[2]")
	private WebElement finalAccountDiscountAllowedAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Sales commission payable')]//..//td[2]")
	private WebElement finalAccountSalesCommissionPayableAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Bank interest receivable')]//..//td[2]")
	private WebElement finalAccountBankInterestReceivableAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Other interest receivable')]//..//td[2]")
	private WebElement finalAccountOtherInterestReceivableAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Rent receivable')]//..//td[2]")
	private WebElement finalAccountRentReceivableAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Commission receivable')]//..//td[2]")
	private WebElement finalAccountCommissionReceivableAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Sundry income')]//..//td[2]")
	private WebElement finalAccountSundryIncomeAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Non taxable income')]//..//td[2]")
	private WebElement finalAccountNonTaxableIncomeAmount;	

	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Directors salaries')]//..//td[2]")
	private WebElement finalAccountDirectorsSalariesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Directors NIC')]//..//td[2]")
	private WebElement finalAccountDirectorsNICAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'SSP reclaimed')]//..//td[2]")
	private WebElement finalAccountSSPReclaimedAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'SMP reclaimed')]//..//td[2]")
	private WebElement finalAccountSMPReclaimedAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Wages - casual')]//..//td[2]")
	private WebElement finalAccountWagesCasualAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Employee Salary expense')]//..//td[2]")
	private WebElement finalAccountSalariesAmount;	
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Employer NI')]//..//td[2]")
	private WebElement finalAccountNICEmployerWagesSalariesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Remuneration Trust Contribution')]//..//td[2]")
	private WebElement finalAccountRemunerationTrustContributionAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Pension Contributions')]//..//td[2]")
	private WebElement finalAccountPensionContributionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Pension Contributions - Director')]//..//td[2]")
	private WebElement finalAccountPensionContributionsDirectorAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Total')]//..//td[2]")
	private WebElement totalIncomeValue;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Other Trading Income')]//..//td[2]")
	private WebElement otherTradingValue;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Flat rate saving')]//..//td[6]")
	private WebElement flatRateSavingValue;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Transaction Report')]")
	private WebElement linkTransactionReport;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Trial Balance')]")
	private WebElement linkTrialBalanceReport;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Balance Sheet')]")
	private WebElement linkBalanceSheetReport;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Profit & Loss')]")
	private WebElement linkProfitandLossReport;
	
	@FindBy(id="chkShowDetail")
	private WebElement showDetailChkBox;
	@FindBy(xpath="//a[contains(text(),'4000')]//..//..//td[4]")
	private WebElement saleValue;
	@FindBy(xpath="//a[contains(text(),'4100')]//..//..//td[4]")
	private WebElement BankInterestReceivableAmount;
	@FindBy(xpath="//a[contains(text(),'7257')]//..//..//td[4]")
	private WebElement SSPReclaimedAmount;
	@FindBy(xpath="//a[contains(text(),'7258')]//..//..//td[4]")
	private WebElement SMPReclaimedAmount;
	@FindBy(xpath="//a[contains(text(),'7260')]//..//..//td[4]")
	private WebElement WagesCasualAmount;
	@FindBy(xpath="//a[contains(text(),'7262')]//..//..//td[4]")
	private WebElement EmployeeSalaryExpenseAmount;
	@FindBy(xpath="//a[contains(text(),'7263')]//..//..//td[4]")
	private WebElement EmployerNIAmount;
	@FindBy(xpath="//a[contains(text(),'7266')]//..//..//td[4]")
	private WebElement PensionContributionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'31')]//..//td[3]")
	private WebElement PurchasedGoodWillAdditionsAmount;
	@FindBy(xpath="//table/tbody/tr/td/b[contains(text(),'Operating profit')]//..//..//td[4]")
	private WebElement finalAccountOperatingProfitAmount;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_cbSelect")
	private WebElement displayRecordsJournal;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete")
	private WebElement delRecordsJournal;
	@FindBy(xpath="//div[@id='ctl00_cPH_filtrec']/table/tbody/tr[1]/td[11]/a/img")
	private WebElement settingBtnIncome;
	@FindBy(id="ctl00_cpHFooter_btnDelete")
	private WebElement delBtnIncome;
	@FindBy(xpath="//h3[contains(text(),'Journals')]")
	private WebElement linkJornals;
	@FindBy(xpath="//div/ul/li/a[contains(text(),'Customer')]")
	private WebElement linkCustomer;
	@FindBy(id="ctl00_cPH_rptrRecordsLimited_ctl00_lnkDelete")
	private WebElement linkCustomeDeleteBtn;
	@FindBy(xpath="//a[contains(text(),'7200')]//..//..//td[4]")
	private WebElement GroundRentServiceChargesValue;
	@FindBy(xpath="//a[contains(text(),'7201')]//..//..//td[4]")
	private WebElement RatesValue;
	@FindBy(xpath="//a[contains(text(),'7203')]//..//..//td[4]")
	private WebElement ServiceChargesValue;
	@FindBy(xpath="//a[contains(text(),'7204')]//..//..//td[4]")
	private WebElement WaterChargesValue;
	@FindBy(xpath="//a[contains(text(),'7205')]//..//..//td[4]")
	private WebElement HeatandLightValue;
	@FindBy(xpath="//a[contains(text(),'7208')]//..//..//td[4]")
	private WebElement RentValue;
	@FindBy(xpath="//a[contains(text(),'7209')]//..//..//td[4]")
	private WebElement CleaningValue;
	@FindBy(xpath="//a[contains(text(),'7212')]//..//..//td[4]")
	private WebElement UseOfResidenceValue;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Ground rent and service charges')]//..//td[2]")
	private WebElement finalAccountGroundRentAndServiceChargesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Rates')]//..//td[2]")
	private WebElement finalAccountRatesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Service charges')]//..//td[2]")
	private WebElement finalAccountServiceChargesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Water charges')]//..//td[2]")
	private WebElement finalAccountWaterChargesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Heat and light')]//..//td[2]")
	private WebElement finalAccountHeatAndLightAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Rent')]//..//td[2]")
	private WebElement finalAccountRentAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Cleaning')]//..//td[2]")
	private WebElement finalAccountCleaningAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Use of home as office')]//..//td[2]")
	private WebElement finalAccountUseOfResidenceAmount;
	@FindBy(xpath="//a[contains(text(),'7210')]//..//..//td[4]")
	private WebElement RepairsAndRenewalsValue;
	@FindBy(xpath="//a[contains(text(),'7213')]//..//..//td[4]")
	private WebElement HealthAndSafetyValue;
	@FindBy(xpath="//a[contains(text(),'7214')]//..//..//td[4]")
	private WebElement LicenseFeesValue;
	@FindBy(xpath="//a[contains(text(),'7500')]//..//..//td[4]")
	private WebElement InsuranceValue;
	@FindBy(xpath="//a[contains(text(),'7505')]//..//..//td[4]")
	private WebElement PostagePrintingStationeryOfficeSuppliesValue;
	@FindBy(xpath="//a[contains(text(),'7507')]//..//..//td[4]")
	private WebElement TelephoneInternetBroadbandValue;
	@FindBy(xpath="//a[contains(text(),'7268')]//..//..//td[4]")
	private WebElement StaffWelfareValue;
	@FindBy(xpath="//a[contains(text(),'7283')]//..//..//td[4]")
	private WebElement ComputerCostValue;
	@FindBy(xpath="//a[contains(text(),'7525')]//..//..//td[4]")
	private WebElement SundryExpensesValue;

	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Repairs and renewals')]//..//td[2]")
	private WebElement finalAccountRepairsAndRenewalsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Health & safety')]//..//td[2]")
	private WebElement finalAccountHealthAndSafetyAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'License fees')]//..//td[2]")
	private WebElement finalAccountLicenseFeesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Insurance')]//..//td[2]")
	private WebElement finalAccountInsuranceAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Postage, stationery, office supplies')]//..//td[2]")
	private WebElement finalAccountPostagePrintingStationeryAndOfficeSuppliesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Telephone, internet and broadband')]//..//td[2]")
	private WebElement finalAccountTelephoneInternetAndBroadbandAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Staff welfare')]//..//td[2]")
	private WebElement finalAccountStaffWelfareAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Computer cost')]//..//td[2]")
	private WebElement finalAccountComputerCostAmount;	
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Sundry expenses')]//..//td[2]")
	private WebElement finalAccountSundryExpensesAmount;
	@FindBy(xpath="//a[contains(text(),'7300')]//..//..//td[4]")
	private WebElement MotorExpensesValue;
	@FindBy(xpath="//a[contains(text(),'7305')]//..//..//td[4]")
	private WebElement ScaleChargesValue;
	@FindBy(xpath="//a[contains(text(),'7010')]//..//..//td[4]")
	private WebElement TravelAndOverseasTravellingValue;
	@FindBy(xpath="//a[contains(text(),'7012')]//..//..//td[4]")
	private WebElement SpeedingAndParkingValue;
	@FindBy(xpath="//a[contains(text(),'7014')]//..//..//td[4]")
	private WebElement HotelsAndAccomodationCostsValue;
	@FindBy(xpath="//a[contains(text(),'7015')]//..//..//td[4]")
	private WebElement OverseasAllowanceValue;
	@FindBy(xpath="//a[contains(text(),'7016')]//..//..//td[4]")
	private WebElement SubsistenceFoodValue;
	@FindBy(xpath="//a[contains(text(),'7022')]//..//..//td[4]")
	private WebElement OverseasEntertainmentValue;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Mileage')]//..//td[2]")
	private WebElement finalAccountMotorExpensesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Scale charges')]//..//td[2]")
	private WebElement finalAccountScaleChargesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Travel and overseas travelling')]//..//td[2]")
	private WebElement finalAccountTravelAndOverseasTravellingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Speeding and parking fines/congestion ch')]//..//td[2]")
	private WebElement finalAccountSpeedingAndParkingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Hotels and accomodation costs')]//..//td[2]")
	private WebElement finalAccountHotelsAndAccomodationCostsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Overseas allowance')]//..//td[2]")
	private WebElement finalAccountOverseasAllowanceAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Subsistence / food')]//..//td[2]")
	private WebElement finalAccountSubsistenceOrFoodAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Overseas entertainment')]//..//td[2]")
	private WebElement finalAccountOverseasEntertainmentAmount;	
	@FindBy(xpath="//a[contains(text(),'7020')]//..//..//td[4]")
	private WebElement BusinessEntertainingValue;
	@FindBy(xpath="//a[contains(text(),'7021')]//..//..//td[4]")
	private WebElement StaffEntertainingValue;
	@FindBy(xpath="//a[contains(text(),'7004')]//..//..//td[4]")
	private WebElement AdvertisingSalesPromotionMarketingValue;
	@FindBy(xpath="//a[contains(text(),'7005')]//..//..//td[4]")
	private WebElement TradeFairsExhibitionsAndWebsiteCostsValue;
	@FindBy(xpath="//a[contains(text(),'7008')]//..//..//td[4]")
	private WebElement WebsiteCostValue;
	@FindBy(xpath="//a[contains(text(),'7400')]//..//..//td[4]")
	private WebElement AccountancyFeesValue;
	@FindBy(xpath="//a[contains(text(),'7401')]//..//..//td[4]")
	private WebElement ProfessionalConsultancyAndLegalFeesValue;
	@FindBy(xpath="//a[contains(text(),'7402')]//..//..//td[4]")
	private WebElement SubcontractorOverheadValue;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Business entertaining')]//..//td[2]")
	private WebElement finalAccountBusinessEntertainingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Staff entertaining')]//..//td[2]")
	private WebElement finalAccountStaffEntertainingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Advertising, sales promotion, marketing')]//..//td[2]")
	private WebElement finalAccountAdvertisingSalesPromotionMarketingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Trade fairs, exhibitions and website cos')]//..//td[2]")
	private WebElement finalAccountTradeFairsExhibitionsAndWebsiteCostsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Website cost')]//..//td[2]")
	private WebElement finalAccountWebsiteCostAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Accountancy fee')]//..//td[2]")
	private WebElement finalAccountAccountancyFeesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Professional, consultancy and legal fees')]//..//td[2]")
	private WebElement finalAccountProfessionalConsultancyAndLegalFeesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Subcontrator - overhead')]//..//td[2]")
	private WebElement finalAccountSubcontractorOverheadAmount;
	@FindBy(xpath="//a[contains(text(),'7030')]//..//..//td[4]")
	private WebElement BadDebtsValue;
	@FindBy(xpath="//a[contains(text(),'7031')]//..//..//td[4]")
	private WebElement BadDebtsRecoveredValue;
	@FindBy(xpath="//a[contains(text(),'7032')]//..//..//td[4]")
	private WebElement GeneralProvisionForDoubtfulDebtsValue;
	@FindBy(xpath="//a[contains(text(),'7519')]//..//..//td[4]")
	private WebElement BankHirePurchaseMortgageAndOtherValue;
	@FindBy(xpath="//a[contains(text(),'7518')]//..//..//td[4]")
	private WebElement BankCardAndOverDraftChargesValue;
	@FindBy(xpath="//a[contains(text(),'7603')]//..//..//td[4]")
	private WebElement AmortisationOfPurchasedGoodwillValue;
	@FindBy(xpath="//a[contains(text(),'7624')]//..//..//td[4]")
	private WebElement DepreciationOfPlantAndMachineryValue;
	@FindBy(xpath="//a[contains(text(),'7625')]//..//..//td[4]")
	private WebElement DepreciationOfCommercialVehiclesValue;
	@FindBy(xpath="//a[contains(text(),'7626')]//..//..//td[4]")
	private WebElement DepreciationOfFixturesAndFittingsValue;
	@FindBy(xpath="//a[contains(text(),'7627')]//..//..//td[4]")
	private WebElement DepreciationOfEquipmentValue;
	@FindBy(xpath="//a[contains(text(),'7628')]//..//..//td[4]")
	private WebElement DepreciationOfMotorCarsValue;
	@FindBy(xpath="//a[contains(text(),'7630')]//..//..//td[4]")
	private WebElement DepreciationOfAssetsUnderHpOrFinancValue;


	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Bad debts')]//..//td[2]")
	private WebElement finalAccountBadDebtAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Bad debts recovered')]//..//td[2]")
	private WebElement finalAccountBadDebtsRecoveredAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'General provision for doubtful debts')]//..//td[2]")
	private WebElement finalAccountGeneralProvisionForDoubtfulDebtsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Bank, hire purchase, mortgage and other')]//..//td[2]")
	private WebElement finalAccountBankHirePurchaseMortgageAndOtherAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Bank, card and overdraft charges')]//..//td[2]")
	private WebElement finalAccountBankCardAndOverDraftChargesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Amortisation of purchased goodwill')]//..//td[2]")
	private WebElement finalAccountAmortisationOfPurchasedGoodwillAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of plant and machinery')]//..//td[2]")
	private WebElement finalAccountDepreciationOfPlantAndMachineryAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of commercial vehicles')]//..//td[2]")
	private WebElement finalAccountDepreciationOfCommercialVehiclesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of fixtures and fittings')]//..//td[2]")
	private WebElement finalAccountDepreciationOfFixturesAndFittingsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of equipment')]//..//td[2]")
	private WebElement finalAccountDepreciationOfEquipmentAmount;	
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of motor cars')]//..//td[2]")
	private WebElement finalAccountDepreciationOfMotorCarsValueAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Depreciation of assets under hp / financ')]//..//td[2]")
	private WebElement finalAccountDepreciationOfAssetsUnderHpOrFinancAmount;
	@FindBy(xpath="//a[contains(text(),'7001')]//..//..//td[4]")
	private WebElement WriteOffValue;
	@FindBy(xpath="//a[contains(text(),'7033')]//..//..//td[4]")
	private WebElement ExchangeDifferenceValue;
	@FindBy(xpath="//a[contains(text(),'7035')]//..//..//td[4]")
	private WebElement ResearchAndDevelopmentCostsValue;
	@FindBy(xpath="//a[contains(text(),'7270')]//..//..//td[4]")
	private WebElement RecruitmentTrainingAndDevelopmentValue;
	@FindBy(xpath="//a[contains(text(),'7271')]//..//..//td[4]")
	private WebElement TrainingAndDevelopmentValue;
	@FindBy(xpath="//a[contains(text(),'7280')]//..//..//td[4]")
	private WebElement EquipmentMaintenanceRentalAndLeasinValue;
	@FindBy(xpath="//a[contains(text(),'7281')]//..//..//td[4]")
	private WebElement EquipmentExpensedValue;
	@FindBy(xpath="//a[contains(text(),'7510')]//..//..//td[4]")
	private WebElement MembershipAndSubscriptionsValue;
	@FindBy(xpath="//a[contains(text(),'7511')]//..//..//td[4]")
	private WebElement CharitableDonationsValue;
	@FindBy(xpath="//a[contains(text(),'7512')]//..//..//td[4]")
	private WebElement PoliticalContributionsValue;
	@FindBy(xpath="//a[contains(text(),'7527')]//..//..//td[4]")
	private WebElement HMRCPenaltiesValue;



	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Write off')]//..//td[2]")
	private WebElement finalAccountWriteOffAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Exchange difference')]//..//td[2]")
	private WebElement finalAccountExchangeDifferenceAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Research and development costs')]//..//td[2]")
	private WebElement finalAccountResearchAndDevelopmentCostsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Recruitment, training and development')]//..//td[2]")
	private WebElement finalAccountRecruitmentTrainingAndDevelopmentAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Training and development')]//..//td[2]")
	private WebElement finalAccountTrainingAndDevelopmentAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Equipment maintenance, rental and leasin')]//..//td[2]")
	private WebElement finalAccountEquipmentMaintenanceRentalAndLeasinAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Equipment expensed')]//..//td[2]")
	private WebElement finalAccountEquipmentExpensedAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Membership and subscriptions')]//..//td[2]")
	private WebElement finalAccountMembershipAndSubscriptionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Charitable donations')]//..//td[2]")
	private WebElement finalAccountCharitableDonationsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Political contributions')]//..//td[2]")
	private WebElement finalAccountPoliticalContributionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'HMRC penalties')]//..//td[2]")
	private WebElement finalAccountHMRCPenaltiesAmount;	

	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'4000')]//..//td[4]")
	private WebElement SalesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'271')]//..//td[3]")
	private WebElement EquipmentAdditionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1450')]//..//td[3]")
	private WebElement LongTermDebtorAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1070')]//..//td[3]")
	private WebElement TotalSalesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1000')]//..//td[3]")
	private WebElement AssetAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1420')]//..//td[3]")
	private WebElement DebatorCashAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1102')]//..//td[4]")
	private WebElement TaxationOutputVATAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'3103')]//..//td[4]")
	private WebElement ProfitLossAmount;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Capital Account - Balance Brought Forward')]//..//..//td[4]")
	private WebElement BalanceBroughtForwardAmount;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Capital Account - Drawings')]//..//..//td[3]")
	private WebElement DrawingsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'2060')]//..//td[4]")
	private WebElement GenericPurchaseSupplierAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'2000')]//..//td[4]")
	private WebElement LiabilityAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'2336')]//..//td[4]")
	private WebElement AccrualsAmount;
	@FindBy(xpath="//table/tbody/tr/td/a[contains(text(),'Capital Account - Introductions')]//..//..//td[4]")
	private WebElement CapitalAccountIntroductionsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'1400')]//..//td[4]")
	private WebElement BankAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Intangible assets')]//..//td[4]")
	private WebElement finalAccountIntangibleAssetsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Property, plant and equipment')]//..//td[4]")
	private WebElement finalAccountPropertyPlantEquipmentAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Stocks')]//..//td[4]")
	private WebElement finalAccountStocksAmount;
	@FindBy(xpath="(//table/tbody/tr/td[contains(text(),'Debtors')]//..//td[4])[1]")
	private WebElement finalAccountDebtorsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Debtors: Amounts falling due')]//..//td[4]")
	private WebElement finalAccountTradeDebtorsFallingDueAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Cash and cash equivalents')]//..//td[4]")
	private WebElement finalAccountCashAndCashEquivalentsAmount;

	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Creditors: Amounts falling due within one year')]//..//td[4]")
	private WebElement finalAccountFallingAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Net current assets')]//..//td[4]")
	private WebElement finalAccountNetCurrentAssetsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Total assets less current liabilities')]//..//td[4]")
	private WebElement finalAccountTotalAssetsLessCurrentLiabilitiesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Creditors: Amounts falling due after more than one year')]//..//td[4]")
	private WebElement finalAccountCreditorsAmountsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Net assets/(liabilities)')]//..//td[4]")
	private WebElement finalAccountNetAssetsAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Members capital')]//..//td[4]")
	private WebElement finalAccountMembersCapitalAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Other reserves')]//..//td[4]")
	private WebElement finalAccountOtherReservesAmount;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),' other interests')]//..//td[4]")
	private WebElement finalAccountMemberOtherInterestsAmount;
	BusinessPom bp1;
	SAPOM2019 sa1;
	LibSA lib1;
	WaitStatementLib wLib;
	CISPage cp ;
	private double num1=0.00;
	private double num2=0.00;
	private double num3=0.00;
	private double num4=0.00;
	private double num5=0.00;
	private double num6=0.00;
	private double num7=0.00;
	private double num8=0.00;
	private double num9=0.00;
	private double num10=0.00;
	private double num11=0.00;
	private double num12=0.00;
	private double num13=0.00;
	private double num14=0.00;
	private double num15=0.00;
	private double num16=0.00;
	private double num17=0.00;
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
	private double totalAssets=0.00;
	private double totalLiabilities=0.00;
	private double netBusinessBalanceSheet=0.00;
	private double netBusinessPTRShort=0.00;
	private double balanceAtEndOfPeriod=0.00;
	private double disallowableExpenses=0.00;
	private double Box11 = 0.00;
	private double Box18 = 0.00;
	private double Box21 = 0.00;
	private double Box27 = 0.00;
	private double Box30 = 0.00;
	private double Box11Partner1 = 0.00;
	private double Box18Partner1 = 0.00;
	private double Box21Partner1 = 0.00;
	private double Box27Partner1 = 0.00;
	private double Box30Partner1 = 0.00;
	private double Box11Partner2 = 0.00;
	private double Box18Partner2 = 0.00;
	private double Box21Partner2 = 0.00;
	private double Box27Partner2 = 0.00;
	private double Box30Partner2 = 0.00;
	private String netProfitValue = "";
	private String netProfitValue1 = "";
	private String salesValue = "";
	private String totalIncomeAmt = "";
	private String otherLiabilitiesValue = "";
	private String totalLiabilitiesValue = "";
	private String netBusinessAssetsValue = "";
	private String netProfitLossValue = "";
	private String balanceAtTheEndAmt = "";
	private String profitFromTradeOrProfession = "";
	private String incomeFromOffShoreFundsValue = "";
	private String lossOnForeignLePropertyValue = "";
	private String residentialFinanceCostsValue = "";
	private String otherTradingAmt = "";
	private String flatRateSavingAmt = "";
	private String finalAccountOperatingProfitAmt = "";
	private String CoSAmt =  "";
	private String CISAmt =  "";
	private String ODCSAmt =  "";
	private String openingStockValue = "";
	private String discountValue = "";
	private String grossWagesValue = "";
	private String purchasesValue = "";
	private String materialsValue = "";
	private String closingStockValue = "";
	private String nICEmployerValue = "";
	private String otherDirectExpensesValue = "";
	private String transportationCostValue = "";
	private String discountAllowedValue = "";
	private String salesCommissionPayableValue = "";
	private String bankInterestReceivableValue = "";
	private String otherInterestReceivableValue = "";
	private String rentReceivableValue = "";
	private String commissionReceivableValue = "";
	private String sundryIncomeValue = "";
	private String nonTaxableIncomeValue = "";	
	private String directorsSalariesValue = "";
	private String directorsNICValue = "";
	private String sSPReclaimedValue = "";
	private String SMPReclaimedValue = "";
	private String WagesCasualValue = "";
	private String salariesValue = "";
	private String nICEmployerWagesSalariesValue = "";
	private String remunerationTrustContributionValue = "";	
	private String pensionContributionsValue = "";
	private String pensionContributionsDirectorValue = "";
	private String saleAmt = "";
	private String BankInterestReceivableAmt = "";
	private String SSPReclaimedAmt = "";
	private String SMPReclaimedAmt = "";
	private String WagesCasualAmt = "";
	private String EmployeeSalaryExpenseAmt = "";
	private String EmployerNIAmt = "";
	private String PensionContributionsAmt = "";
	private String groundRentServiceChargesAmt = "";
	private String ratesAmt = "";
	private String serviceChargesAmt = "";
	private String waterChargesAmt = "";
	private String heatandLightAmt = "";
	private String rentAmt = "";
	private String cleaningAmt = "";
	private String useOfResidenceAmt = "";
	private String groundRentServiceChargesValue = "";
	private String ratesValue = "";
	private String serviceChargesValue = "";
	private String waterChargesValue = "";
	private String heatandLightValue = "";
	private String rentValue = "";
	private String cleaningValue = "";
	private String useOfResidenceValue = "";
	private String repairsAndRenewalsAmt = "";
	private String healthAndSafetyAmt = "";
	private String licenseFeesAmt = "";
	private String insuranceAmt = "";
	private String postagePrintingStationeryOfficeSuppliesAmt = "";
	private String telephoneInternetBroadbandAmt = "";
	private String staffWelfareAmt = "";
	private String computerCostAmt = "";
	private String sundryExpensesAmt = "";
	private String repairsAndRenewalsValue = "";
	private String healthAndSafetyValue = "";
	private String licenseFeesValue = "";
	private String insuranceValue = "";
	private String postagePrintingStationeryOfficeSuppliesValue = "";
	private String telephoneInternetBroadbandValue = "";
	private String staffWelfareValue = "";
	private String computerCostValue = "";
	private String sundryExpensesValue = "";
	private String motorExpensesAmt = "";
	private String scaleChargesAmt = "";
	private String travelAndOverseasTravellingAmt = "";
	private String speedingAndParkingAmt = "";
	private String hotelsAndAccomodationCostsAmt = "";
	private String overseasAllowanceAmt = "";
	private String subsistenceFoodAmt = "";
	private String overseasEntertainmentAmt = "";
	private String motorExpensesValue = "";
	private String scaleChargesValue = "";
	private String travelAndOverseasTravellingValue = "";
	private String speedingAndParkingValue = "";
	private String hotelsAndAccomodationCostsValue = "";
	private String overseasAllowanceValue = "";
	private String subsistenceOrFoodValue = "";
	private String overseasEntertainmentValue = "";
	private String businessEntertainingAmt = "";
	private String staffEntertainingAmt = "";
	private String advertisingSalesPromotionMarketingAmt = "";
	private String tradeFairsExhibitionsAndWebsiteCostsAmt = "";
	private String websiteCostAmt = "";
	private String accountancyFeesAmt = "";
	private String professionalConsultancyAndLegalFeesAmt = "";
	private String subcontractorOverheadAmt = "";
	private String businessEntertainingValue = "";
	private String staffEntertainingValue = "";
	private String advertisingSalesPromotionMarketingValue = "";
	private String tradeFairsExhibitionsAndWebsiteCostsValue = "";
	private String websiteCostValue = "";
	private String accountancyFeesValue = "";
	private String professionalConsultancyAndLegalFeesValue = "";
	private String subcontractorOverheadValue = "";
	private String badDebtsAmt = "";
	private String badDebtsRecoveredAmt = "";
	private String generalProvisionForDoubtfulDebtsAmt = "";
	private String bankHirePurchaseMortgageAndOtherAmt = "";
	private String bankCardAndOverDraftChargesAmt = "";
	private String amortisationOfPurchasedGoodwillAmt = "";
	private String depreciationOfPlantAndMachineryAmt = "";
	private String depreciationOfCommercialVehiclesAmt = "";
	private String depreciationOfFixturesAndFittingsAmt = "";
	private String depreciationOfEquipmentAmt = "";
	private String depreciationOfMotorCarsAmt = "";
	private String depreciationOfAssetsUnderHpOrFinancAmt = "";
	private String badDebtsValue = "";
	private String badDebtsRecoveredValue = "";
	private String generalProvisionForDoubtfulDebtsValue = "";
	private String bankHirePurchaseMortgageAndOtherValue = "";
	private String bankCardAndOverDraftChargesValue = "";
	private String amortisationOfPurchasedGoodwillValue = "";
	private String depreciationOfPlantAndMachineryValue = "";
	private String depreciationOfCommercialVehiclesValue = "";
	private String depreciationOfFixturesAndFittingsValue = "";
	private String depreciationOfEquipmentValue = "";
	private String depreciationOfMotorCarsValue = "";
	private String depreciationOfAssetsUnderHpOrFinancValue = "";
	private String writeOffAmt = "";
	private String exchangeDifferenceAmt = "";
	private String researchAndDevelopmentCostsAmt = "";
	private String recruitmentTrainingAndDevelopmentAmt = "";
	private String trainingAndDevelopmentAmt = "";
	private String equipmentMaintenanceRentalAndLeasinAmt = "";
	private String equipmentExpensedAmt = "";
	private String membershipAndSubscriptionsAmt = "";
	private String charitableDonationsAmt = "";
	private String politicalContributionsAmt = "";
	private String hMRCPenaltiesAmt = "";
	private String writeOffValue = "";
	private String exchangeDifferenceValue = "";
	private String researchAndDevelopmentCostsValue = "";
	private String recruitmentTrainingAndDevelopmentValue = "";
	private String trainingAndDevelopmentValue = "";
	private String equipmentMaintenanceRentalAndLeasinValue = "";
	private String equipmentExpensedValue = "";
	private String membershipAndSubscriptionsValue = "";
	private String charitableDonationsValue = "";
	private String politicalContributionsValue = "";
	private String hMRCPenaltiesValue = "";
	//tax return -> partnership summary
	private double changeOfBasisInput = 0.0;
	private double deductionsOnPaymentInput = 0.0;
	private double TaxTakenOffTradingIncomeInput = 0.0;
	private String adjChangeBasisValue = "";
	private String cISdeductionsValue  = "";
	private String otherTaxOnTradingIncomeValue = "";
	Select select;
	private String purchasedGoodWillAdditionsAmt = "";
	private String equipmentAdditionsAmt = ""; 
	private String longTermDebtorAmt = ""; 
	private String totalSalesAmt = "";
	private String assetAmt = "";
	private String debatorCashAmt = "";
	private String taxationOutputVATAmt = "";
	private String profitLossAmt = "";
	private String balanceBroughtForwardAmt = "";
	private String drawingsAmt = "";
	private String genericPurchaseSupplierAmt = "";
	private String liabilityAmt = "";
	private String accrualsAmt = "";
	private String capitalAccountIntroductionsAmt = "";
	private String bankAmt = "";

	private String intangibleAssetsValue = "";
	private String propertyPlantEquipmentValue = "";
	private String stocksValue = "";
	private String debtorsValue = "";
	private String tradeDebtorsFallingDueValue = "";
	private String cashAndCashEquivalentsValue = "";
	private String fallingValue = "";
	private String netCurrentAssetsValue = "";
	private String totalAssetsLessCurrentLiabilitiesValue = "";
	private String creditorsAmountsValue = "";
	private String netAssetsValue = "";
	private String membersCapitalValue = "";
	private String otherReservesValue = "";
	private String memberOtherInterestsValue = "";
	private String grossProfitValue ="";
	Element element;
	public Robot robot;
	String oldTab;
	
	DocumentBuilderFactory factory;
	DocumentBuilder builder;
	Document document;
	Element rootElement;
	private String xml_SalesBusinessIncome;
	private String xml_GrossProfitLoss;
	private String xml_NetProfitOrLoss;
	private String xml_NetProfitLoss_TaxAdjustments;
	private String xml_NetProfit;
	private String xml_DebtorsPrepaymentsEtc;
	private String xml_TotalAssets;
	private String xml_OtherLiabilities;
	private String xml_TotalLiabilities;
	private String xml_NetBusinessAssets;
	private String xml_NetProfitLoss_PtrCurrnt_CptlAcnt;
	private String xml_BalanceAtEndOfPeriod;
	private String xml_TradeProfit;
	private String xml_LossOnForeignLetProperty;
	private String xml_IncomeFromOffshoreFunds;
	private String xml_ResidentialFinanceCostsForeign;
	private String xml_FinanceCharges;
	private String xml_LegalAndProfessionalCosts;
	private String xml_CostOfServices;
	private String xml_OtherExpenses;
	private String xml_TotalDisposalChargeableAsset;
	private String[] xml_TradeProfit1 = new String[2];
	private String[] xml_LossOnForeignLetProperty1 = new String[2];
	private String[] xml_IncomeFromOffshoreFunds1 = new String[2];
	private String[] xml_ResidentialFinanceCostsForeign1 = new String[2];
	private String[] xml_TotalDisposalChargeableAsset1 = new String[2];
	private String xml_Proceeds;
	private String xml_TotalProceeds;
	private String xml_PrivateUse;
	private String xml_BalancingCharges;
	private String xml_TotalAdditions;
	private String xml_ForeignLettingsLoss;
	private String xml_TotalRentsEtc;
	private String xml_NetProfitLoss_IncmLndAndPropAbrd;
	private String xml_AdjustedProfit;
	private String xml_RentRatesEtc;
	private String xml_RepairsAndRenewals;
	private String xml_TotalExpenditure;
	private String xml_TaxableProfit;
	private String xml_TotalAllowableLoss;
	private String xml_CapitalAllowances;
	private String xml_CostsOfReplacingDomesticItems;
	private String xml_TotalDeductions;
	private String xml_ForeignTaxPaid;
	private String xml_ResidentialFinanceCosts;
	public AddBusinessPages(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
public void addLimitedBusiness(WebDriver driver, String str1,String str2,String str3,String str4) throws Exception
{
	bp1=new BusinessPom(driver);
	bp1.createBusiness(driver,str1,str2, str3, str4);
	Reporter.log("New Limited business added successfully",true);
	
}
public void addSoletraderBusiness(WebDriver driver, String str1,String str2,String str3,String str4) throws Exception
{
	bp1=new BusinessPom(driver);
	bp1.openAddBusinessPage(driver);
	soleTraderCompanyLink.click();
	bp1.fillBusinessDetails(driver,str1,str2, str3, str4);
	Reporter.log("New Sole trader business added successfully",true);
}	
public void addPartnershipBusiness(WebDriver driver, String str1,String str2,String str3,String str4) throws Exception
{
	bp1=new BusinessPom(driver);
	bp1.openAddBusinessPage(driver);
	partnershipCompanyLink.click();
	bp1.fillBusinessDetails(driver,str1,str2, str3, str4);
	Reporter.log("New Partnership business added successfully",true);
}	
public void addLLPBusiness(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6) throws Exception
{
	bp1=new BusinessPom(driver);
	bp1.openAddBusinessPage(driver);
	LLPCompanyLink.click();
	bp1.fillBusinessDetailsLLP(driver,str1,str2, str3, str4, str5, str6);
	Reporter.log("New LLP business added successfully",true);
}	
public void addPLCBusiness(WebDriver driver, String str1,String str2,String str3,String str4) throws Exception
{
	bp1=new BusinessPom(driver);
	bp1.openAddBusinessPage(driver);
	PLCBucinessLink.click();
	bp1.fillBusinessPLCDetails(driver,str1,str2, str3, str4);
	Reporter.log("New Public limited company business added successfully",true);
}	
public void openBusiness(WebDriver driver, String comName,String BusinessType) throws Exception {
	bp1=new BusinessPom(driver);
	sa1 = new SAPOM2019(driver);
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	wLib.explicitWait(driver, 5,bp1.businessLink);
	bp1.businessLink.click();
	wLib.explicitWait(driver, 5,searchBusinessType);
	sa1.listbox1 = new Select(searchBusinessType);
	sa1.listbox1.selectByVisibleText(BusinessType);
	wLib.explicitWait(driver, 5,searchBtnBusiness);
	searchBtnBusiness.click();
	wLib.explicitWait(driver, 5,SearchCompany);
	SearchCompany.sendKeys(comName);
	wLib.explicitWait(driver, 5,searchBtnBusiness);
	searchBtnBusiness.click();
	wLib.explicitWait(driver, 5,bp1.CompanyClick);
	bp1.CompanyClick.click();
	Reporter.log("opening searched business",true);
	cp.switchwindowForward(driver);
	Reporter.log(driver.getTitle(),true);
	driver.navigate().refresh();
	}
public void setUpPartner(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 5,moreBtn);
moreBtn.click();
wLib.explicitWait(driver, 5,setUpPartnershipLnk);
setUpPartnershipLnk.click();
wLib.explicitWait(driver, 5,addEmployeeBtn);
addEmployeeBtn.click();
wLib.explicitWait(driver, 5,partnerEditBtn);
partnerEditBtn.click();
}
public void addOrdinaryPartner(WebDriver driver, String str1,String str2,String str3,String str4, String str5,String str6) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5,addPartnerBtn);
	addPartnerBtn.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 5,partnerFirstName);
	partnerFirstName.clear();
	partnerFirstName.sendKeys(str1);
	partnerLastName.clear();
	partnerLastName.sendKeys(str2);
	employeeTypeChkBox.click();
	ordinaryTypeChkBox.click();
	empAddressLine1.clear();
	empAddressLine1.sendKeys(str3);
	sa1.emailTxtBox.clear();
	sa1.emailTxtBox.sendKeys(str4);
	sa1.empPostCodeTxtBox.clear();
	sa1.empPostCodeTxtBox.sendKeys(str5);
	phoneTxtBox.clear();
	phoneTxtBox.sendKeys(str6);
	SaveButton.click();
}
public void addProfitLossRatio(WebDriver driver, String str1,String str2) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	wLib.explicitWait(driver, 5,netproftLossAdjBtn);
	netproftLossAdjBtn.click();
	wLib.explicitWait(driver, 5,newRatioBtn);
	newRatioBtn.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 5,NewPLRatioForPartner1);
	NewPLRatioForPartner1.clear();
	NewPLRatioForPartner1.sendKeys(str1);
	NewPLRatioForPartner2.clear();
	NewPLRatioForPartner2.sendKeys(str2);
	SaveButton.click();
}
public void funcOpenDashboardPartnershipTaxReturnPage(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
linkPartnershipTaxReturnPage.click();
cp.switchwindowForward(driver);
Reporter.log(driver.getTitle(),true);
Select year= new Select(sa1.TaxYear);
year.selectByValue("6");
Reporter.log("Dashboard of Partnership Tax Return opened successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ1(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
funcSA801_PartnershipUKPro_EEA(driver, str1);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ1SA800);
sa1.listbox1 = new Select(BoxQ1SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"Yes");
Reporter.log("Question 1 of Partnership business and investment with UK property income is Verified successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ1(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ1SA800);
sa1.listbox1 = new Select(BoxQ1SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"No");
Reporter.log("Question 1 of Partnership business and investment without UK property income is Verified successfully",true);
}
public void funcSA801_PartnershipUKPro_EEA(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipLandPropertySA801Page);
linkPartnershipLandPropertySA801Page.click();
wLib.explicitWait(driver, 5, linkPartnershipUKPropertySA801);
linkPartnershipUKPropertySA801.click();
try
{
if(sa1.editBtn.isDisplayed()==false)
{
	linkPartnershipUKPropertySA801.click();
}
}catch (Exception e) {
	Reporter.log("Link Partnership UK Property SA801 clicked in first go",true);
}
wLib.explicitWait(driver, 5, sa1.editBtn);
sa1.editBtn.click();
wLib.explicitWait(driver, 5,SA801IncomeFromFurnishedHolidayLettingsTxtBox);
SA801IncomeFromFurnishedHolidayLettingsTxtBox.clear();
SA801IncomeFromFurnishedHolidayLettingsTxtBox.sendKeys(str1);
saveBtnPTR.click();
Reporter.log("Income from land and property added successfully",true);
}
public void funcSAPTRDel(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	clickEditBtn(driver);
	delBtnSAPTR.click();	
	sa1.robot = new Robot();
	sa1.robot.setAutoDelay(2000);
	sa1.robot.keyPress(KeyEvent.VK_ENTER);
	sa1.robot.setAutoDelay(1000);
	sa1.robot.keyRelease(KeyEvent.VK_ENTER);
}
public void funcSA801Del(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5, linkPartnershipLandPropertySA801Page);
	linkPartnershipLandPropertySA801Page.click();
	wLib.explicitWait(driver, 5, linkPartnershipUKPropertySA801);
	linkPartnershipUKPropertySA801.click();
	funcSAPTRDel(driver);
	Reporter.log("Income from SA 801 page deleted successfully",true);
}
public void funcSA802Del(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5,linkSA802Page);
	linkSA802Page.click();
	wLib.explicitWait(driver, 5, linkSA802PartnershipForeignPage);
	linkSA802PartnershipForeignPage.click();
	funcSAPTRDel(driver);
	Reporter.log("Income from SA 802 page deleted successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ2(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
funcAddSA802_PartnershipForeignPage(driver, str1);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ2SA800);
sa1.listbox1 = new Select(BoxQ2SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"Yes");
Reporter.log("Question 2 of Partnership business and investment with foreign income is Verified successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ2(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ2SA800);
sa1.listbox1 = new Select(BoxQ2SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"No");
Reporter.log("Question 2 of Partnership business and investment income without foreign income is Verified successfully",true);
}
public void funcAddSA802_PartnershipForeignPage(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkSA802Page);
linkSA802Page.click();
wLib.explicitWait(driver, 5, linkSA802PartnershipForeignPage);
linkSA802PartnershipForeignPage.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5,PTRRentsEtcIncomeTxtBox);
PTRRentsEtcIncomeTxtBox.clear();
PTRRentsEtcIncomeTxtBox.sendKeys(str1);
saveBtnPTR.click();
Reporter.log("Foreign Income added successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ3(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
funcSA800_TradingProfessionalIncomePage(driver, str1);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ3SA800);
sa1.listbox1 = new Select(BoxQ3SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"Yes");
Reporter.log("Question 3 of Partnership business and investment income is Verified including a trade turnover successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ3(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
wLib.explicitWait(driver, 5, sa1.editBtn);
sa1.editBtn.click();
wLib.explicitWait(driver, 5, BoxQ3SA800);
sa1.listbox1 = new Select(BoxQ3SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"No");
Reporter.log("Question 3 of Partnership business and investment income is Verified without including a trade turnover successfully",true);
}
public void funcSA800_TradingProfessionalIncomePage(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5,SA800TurnOverTxtBox);
SA800TurnOverTxtBox.clear();
SA800TurnOverTxtBox.sendKeys(str1);
saveBtnPTR.click();
}
public void funcSA800TradingProfessionalIncomeDel(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();
	funcSAPTRDel(driver);
	Reporter.log("Trading Professional Income deleted successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ4(WebDriver driver,String str1,String str2) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
funcSA803_PartnershipDisposalOfChargeableAssetsPage(driver, str1, str2);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ4SA800);
sa1.listbox1 = new Select(BoxQ4SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"Yes");
Reporter.log("Question 4 of Partnership business and investment income is Verified with dispose of chargeable assets successfully",true);
}
public void funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ4(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, BoxQ4SA800);
sa1.listbox1 = new Select(BoxQ4SA800);
Assert.assertEquals(sa1.listbox1.getFirstSelectedOption().getText(),"No");
Reporter.log("Question 4 of Partnership business and investment income is Verified without dispose of chargeable assets successfully",true);
}
public void funcSA803_PartnershipDisposalOfChargeableAssetsPage(WebDriver driver,String str1,String str2) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkSA803Page);
linkSA803Page.click();
wLib.explicitWait(driver, 5, linkSA803PartnershipDisposalOfChargeableAssetsPage);
linkSA803PartnershipDisposalOfChargeableAssetsPage.click();
clickEditBtn(driver);
addBtnDisposalsOfChargeableAssetsMade.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 5,disposalsOfChargeableAssetsDescriptionTxtBox);
disposalsOfChargeableAssetsDescriptionTxtBox.clear();
disposalsOfChargeableAssetsDescriptionTxtBox.sendKeys(str1);
disposalsOfChargeableAssetsDisposalproceedsTxtBox.clear();
disposalsOfChargeableAssetsDisposalproceedsTxtBox.sendKeys(str2);

sa1.SaveBtn2.click();
}
public void funcSA803_PTRFull(WebDriver driver,String str1,String str2,String str3,String str4) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
num1 = Double.parseDouble(str2);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
wLib.explicitWait(driver, 5, linkSA803Page);
linkSA803Page.click();
wLib.explicitWait(driver, 5, linkSA803PartnershipDisposalOfChargeableAssetsPage);
linkSA803PartnershipDisposalOfChargeableAssetsPage.click();
clickEditBtn(driver);
addBtnDisposalsOfChargeableAssetsMade.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 5,disposalsOfChargeableAssetsDescriptionTxtBox);
disposalsOfChargeableAssetsDescriptionTxtBox.clear();
disposalsOfChargeableAssetsDescriptionTxtBox.sendKeys(str1);
disposalsOfChargeableAssetsDisposalproceedsTxtBox.clear();
disposalsOfChargeableAssetsDisposalproceedsTxtBox.sendKeys(str2);
furtherinfoSA803.clear();
furtherinfoSA803.sendKeys(str3);
sa1.SaveBtn2.click();
additionalInfoTxtBox.clear();
additionalInfoTxtBox.sendKeys(str4);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -2000)", "");
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
wLib.explicitWait(driver, 5, netProfitTxtBox);
netProfitValue = netProfitTxtBox.getAttribute("value");
Reporter.log("Net profit for this accounting period: "+netProfitTxtBox,true);
debatorCashAmt = SA800DebtorsTxtBox.getAttribute("value");
assetAmt = SA800TotalAssetsTxtBox.getAttribute("value");
otherLiabilitiesValue = SA800OtherLiabilitiesTxtBox.getAttribute("value");
totalLiabilitiesValue = SA800TotalLiabilitiesTxtBox.getAttribute("value");
netBusinessAssetsValue = SA800NetBusinessAssetsTxtBox.getAttribute("value");
netProfitLossValue = SA800NetProfitLossTxtBox.getAttribute("value");
balanceAtTheEndAmt = SA800BalanceAtTheEndTxtBox.getAttribute("value");

wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
totalIncomeAmt = SA800SalesBusinessIncomeTxtBox.getAttribute("value");
grossProfitValue = SA800GrossProfitLossTxtBox.getAttribute("value");
netProfitValue1 = SA800NetProfitLossTxtBox.getAttribute("value");
profitLossAmt = SA800NetBusinessProfitTxtBox.getAttribute("value");
wLib.explicitWait(driver, 5,linkPartnershipStatementFull);
linkPartnershipStatementFull.click();
profitFromTradeOrProfession = tradeProfessionProfitTxtBox.getAttribute("value");
Assert.assertEquals(tradeProfessionProfitTxtBox.getAttribute("value"),netProfitValue);
Reporter.log("Profit from a trade or profession of PTR Full is Verified successfully: "+tradeProfessionProfitTxtBox.getAttribute("value"),true);

Assert.assertEquals(totalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value").replace(".00", ""),str2);
Reporter.log("Total proceeds from disposals of chargeable assets of PTR Full is Verified successfully: "+totalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value"),true);
Box11 = Double.parseDouble(netProfitValue);
Box30 = num1;
Box11Partner1 = Box11 * 0.4;
Box30Partner1 = Box30 * 0.4;
Box11Partner2 = Box11 * 0.6;
Box30Partner2 = Box30 * 0.6;
Assert.assertEquals(ptr1TradeProfessionProfitTxtBox.getAttribute("value"),String.format("%.2f",Box11Partner1));
Reporter.log("Profit from a trade or profession for first Partner of PTR Full is Verified successfully: "+ptr1TradeProfessionProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value"),String.format("%.2f",Box30Partner1));
Reporter.log("Total proceeds from disposals of chargeable assetsfor first Partner of PTR Full is Verified successfully: "+ptrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr2TradeProfessionProfitTxtBox.getAttribute("value"),String.format("%.2f",Box11Partner2));
Reporter.log("Profit from a trade or profession for second Partner of PTR Full is Verified successfully: "+ptr2TradeProfessionProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(partnerDetails_ctl01_txtPtrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value"),String.format("%.2f",Box30Partner2));
Reporter.log("Total proceeds from disposals of chargeable assetsfor second Partner of PTR Full is Verified successfully: "+partnerDetails_ctl01_txtPtrTotalProceedsFromDisposalsOfChargeableAssetsTxtBox.getAttribute("value"),true);

wLib.explicitWait(driver, 5,sa1.taxReturnLink);
sa1.taxReturnLink.click();
wLib.explicitWait(driver, 5,partnershipSummaryLink);
partnershipSummaryLink.click();
Assert.assertEquals(tradeStatus.getText(),"yes");
Reporter.log("Trade Status of Partnership Summary verified successfully: "+tradeStatus.getText(),true);
Assert.assertEquals(chargeableAssets.getText(),"yes");
Reporter.log("Chargeable Assets of Partnership Summary verified successfully: "+chargeableAssets.getText(),true);
Assert.assertEquals(excludeVATStatus.getText(),"yes");
Reporter.log("Exclude VAT Status of Partnership Summary verified successfully: "+excludeVATStatus.getText(),true);
Assert.assertEquals(salesBusinessIncome.getText().substring(2).replace(",", ""),totalIncomeAmt);
Reporter.log("Sales Business Income of Partnership Summary verified successfully: "+salesBusinessIncome.getText(),true);
Assert.assertEquals(grossProfitLossAmt.getText().substring(2).replace(",", ""),grossProfitValue);
Reporter.log("Gross Profit Loss Amt of Partnership Summary verified successfully: "+grossProfitLossAmt.getText(),true);
Assert.assertEquals(netProfitOrLossAmt.getText().substring(2).replace(",", ""),netProfitValue1);
Reporter.log("Net profit or loss Amt of Partnership Summary verified successfully: "+netProfitOrLossAmt.getText(),true);
Assert.assertEquals(netProfitLossAmtSA800.getText().substring(2).replace(",", ""),profitLossAmt);
Reporter.log("Net profit loss Amt of Partnership Summary verified successfully: "+netProfitLossAmtSA800.getText(),true);
Assert.assertEquals(netProfitAmt.getText().substring(2).replace(",", ""),netProfitValue);
Reporter.log("Net profit Amt of Partnership Summary verified successfully: "+netProfitAmt.getText(),true);
Assert.assertEquals(DebtorsPrepaymentsAmt.getText().substring(2).replace(",", ""),debatorCashAmt);
Reporter.log("Debtors prepayments etc value of Partnership Summary verified successfully: "+DebtorsPrepaymentsAmt.getText(),true);
Assert.assertEquals(otherLiabilitiesAmt.getText().substring(2).replace(",", ""),otherLiabilitiesValue);
Reporter.log("Other liabilities value of Partnership Summary verified successfully: "+otherLiabilitiesAmt.getText(),true);
Assert.assertEquals(totalLiabilitiesAmt.getText().substring(2).replace(",", ""),totalLiabilitiesValue);
Reporter.log("Total liabilities value of Partnership Summary verified successfully: "+totalLiabilitiesAmt.getText(),true);
Assert.assertEquals(netBusinessAssetsAmt.getText().substring(2).replace(",", ""),netBusinessAssetsValue);
Reporter.log("Net business assets value of Partnership Summary verified successfully: "+netBusinessAssetsAmt.getText(),true);
Assert.assertEquals(netProfitLossAmt.getText().substring(2).replace(",", ""),netProfitLossValue);
Reporter.log("Net profit loss value of Partnership Summary verified successfully: "+netProfitLossAmt.getText(),true);
Assert.assertEquals(balanceAtEndOfPeriodAmt.getText().substring(2).replace(",", ""),balanceAtTheEndAmt);
Reporter.log("Balance at end of period value of Partnership Summary verified successfully: "+balanceAtEndOfPeriodAmt.getText(),true);
Assert.assertEquals(tradeProfitAmt.getText().substring(2).replace(",", ""),profitFromTradeOrProfession);
Reporter.log("Trade profit value of Partnership Summary verified successfully: "+tradeProfitAmt.getText(),true);

Assert.assertEquals(totalDisposalChargeableAssetsAmt.getText().substring(2).replace(",", ""),String.format("%.2f",Box30));
Reporter.log("Disposal of chargeable assets of Partnership Summary verified successfully: "+totalDisposalChargeableAssetsAmt.getText(),true);
Assert.assertEquals(tradeProfitAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box11Partner1));
Reporter.log("Trade profit for Partner2 value for Partner2 of Partnership Summary verified successfully: "+tradeProfitAmtPartner1.getText(),true);

Assert.assertEquals(disposalOfChargeableAssetsAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box30Partner1));
Reporter.log("Disposal of chargeable assets for Partner1 of Partnership Summary verified successfully: "+disposalOfChargeableAssetsAmtPartner1.getText(),true);


Assert.assertEquals(tradeProfitAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box11Partner2));
Reporter.log("Trade profit for Partner2 value for Partner2 of Partnership Summary verified successfully: "+tradeProfitAmtPartner2.getText(),true);

Assert.assertEquals(disposalOfChargeableAssetsAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box30Partner2));
Reporter.log("Disposal of chargeable assets for Partner2 of Partnership Summary verified successfully: "+disposalOfChargeableAssetsAmtPartner2.getText(),true);

}
public void funcSA803Del(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkSA803Page);
linkSA803Page.click();
wLib.explicitWait(driver, 5, linkSA803PartnershipDisposalOfChargeableAssetsPage);
linkSA803PartnershipDisposalOfChargeableAssetsPage.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, disposalOfChargeableAssetsDelBtn);
disposalOfChargeableAssetsDelBtn.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 1,sa1.cnfmdel);
sa1.cnfmdel.click();
Reporter.log("Income from SA 803 page deleted successfully",true);
}
public void funcSA800_Boxes_profit(WebDriver driver,String str1,String str2) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, adjChangeBasisTxtBox);
adjChangeBasisTxtBox.clear();
adjChangeBasisTxtBox.sendKeys(str1);
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5,SA800TurnOverTxtBox);
SA800TurnOverTxtBox.clear();
SA800TurnOverTxtBox.sendKeys(str2);
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
wLib.explicitWait(driver, 5, netProfitTxtBox);
Assert.assertEquals(netProfitTxtBox.getAttribute("value").replace(".00", ""),str2);
Reporter.log("Profit from a trade or profession is Verified successfully",true);
wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
linkPartnershipStatementShort.click();
wLib.explicitWait(driver, 5, adjChangeBasisTxtBox);
Assert.assertEquals(adjChangeBasisTxtBox.getAttribute("value").replace(".00", ""),str1);
Reporter.log("Adjustment on change of basis is Verified successfully",true);
Assert.assertEquals(tradeProfessionProfitTxtBox.getAttribute("value").replace(".00", ""),str2);
Reporter.log("Profit from a trade or profession is Verified successfully",true);
}
public void clickEditBtn(WebDriver driver)throws Exception
{
	wLib = new WaitStatementLib();
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5, sa1.editBtn);
	sa1.editBtn.click();
	try
	{
		if(saveBtnPTR.isDisplayed()==true)
		{
		Reporter.log("edit button clicked in first go",true);
		}
		
	}catch (Exception e) {
		wLib.explicitWait(driver, 2,sa1.editBtn);
		sa1.editBtn.click();
		Reporter.log("edit button not clicked in first go",true);
	}
}
public void clickEditBtnPTR(WebDriver driver)throws Exception
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 5, partnerEditBtn);
	partnerEditBtn.click();
	try
	{
		
			wLib.explicitWait(driver, 2, saveBtnPTR);
			String s1=saveBtnPTR.getText();
			Reporter.log("Label of save button: "+s1);
		
	}catch (Exception e) {
		wLib.explicitWait(driver, 5, partnerEditBtn);
		partnerEditBtn.click();
	}
}
public void funcSA800_Boxes_loss(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5,allowableExpensesTxtBox);
allowableExpensesTxtBox.clear();
allowableExpensesTxtBox.sendKeys(str1);
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
wLib.explicitWait(driver, 5, allowableLossTxtBox);
Assert.assertEquals(allowableLossTxtBox.getAttribute("value").replace(".00", ""),str1);
Reporter.log("Allowable loss for this accounting period is Verified successfully",true);
wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
linkPartnershipStatementShort.click();

wLib.explicitWait(driver, 5, tradeProfessionLossTxtBox);
Assert.assertEquals(tradeProfessionLossTxtBox.getAttribute("value").replace(".00", ""),str1);
Reporter.log("Loss from a trade or profession is Verified successfully",true);
}
public void funcCheckBox24(WebDriver driver,String str1) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, contractorsDeductionsTxtBox);
contractorsDeductionsTxtBox.clear();
contractorsDeductionsTxtBox.sendKeys(str1);
contractorsDeductionsTxtBox.sendKeys(Keys.TAB);
String label1=labelPartnershipBusinessAndInvestmentIncome.getText();
Reporter.log("Label of the page: "+label1,true);
adjChangeBasisTxtBox.clear();
adjChangeBasisTxtBox.sendKeys("0");
plantMachineryTxtBox.clear();
plantMachineryTxtBox.sendKeys("0");
Thread.sleep(1000);
wLib.explicitWait(driver, 5,cancelBtnSAPTR);
wLib.explicitWait(driver, 5, saveBtnPTR);
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
linkPartnershipStatementShort.click();
Assert.assertEquals(cISDeductionsTxtBox.getAttribute("value").replace(".00", ""),str1);
Reporter.log("CIS deductions made by contractors on account of tax is Verified successfully",true);
}
public void funcSA800BusinessAndInvestmentIncomeDel(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
	linkBusinessAndInvestmentIncome.click();
	funcSAPTRDel(driver);
	Reporter.log("Business And Investment Income deleted successfully",true);
}
//adding income manually in 3.22, 3.24, 3.24 and 3.29 and checking impact on partnership short and partnership full
public void funcTradingAndProfessionalIncome1(WebDriver driver,String str1,String str2,String str3,String str4,String str5) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();
	clickEditBtn(driver);
	SA800AnnualInvAllowanceTxtBox.clear();
	SA800AnnualInvAllowanceTxtBox.sendKeys(str2);
	SA800LowerCO2EmissionsTxtBox.clear();
	SA800LowerCO2EmissionsTxtBox.sendKeys(str3);
	SA800TurnOverTxtBox.clear();
	SA800TurnOverTxtBox.sendKeys(str1);
	saveBtnPTR.click();
	Assert.assertEquals(SA800BalancingChargesTxtBox.getAttribute("value"),"0.00");
	Reporter.log("Balancing charges of Tax adjustments to net profit or loss for this accounting period is verified successfully with box 3.24 value",true);
	Assert.assertEquals(SA800CapitalAllowancesTxtBox.getAttribute("value"),"0.00");
	Reporter.log("Capital allowances of Tax adjustments to net profit or loss for this accounting period is verified successfully with box 3.24 value",true);
	clickEditBtn(driver);
	SA800TurnOverTxtBox.clear();
	SA800SalesBusinessIncomeTxtBox.clear();
	SA800SalesBusinessIncomeTxtBox.sendKeys(str4);
	saveBtnPTR.click();
	Assert.assertEquals(SA800BalancingChargesTxtBox.getAttribute("value").replace(".00", ""),str3);
	Reporter.log("Balancing charges of Tax adjustments to net profit or loss for this accounting period is verified successfully with box 3.29 value",true);
	Assert.assertEquals(SA800CapitalAllowancesTxtBox.getAttribute("value").replace(".00", ""),str2);
	Reporter.log("Capital allowances of Tax adjustments to net profit or loss for this accounting period is verified successfully with box 3.29 value",true);
	clickEditBtn(driver);
	SA800DeductionsTxtBox.clear();
	SA800DeductionsTxtBox.sendKeys(str5);
	SA800TurnOverTxtBox.clear();
	saveBtnPTR.click();
	num1 = Double.parseDouble(str2);
	num2 = Double.parseDouble(str5);
	total1 = num1 + num2;
	Assert.assertEquals(SA800TotalCADeductionsTxtBox.getAttribute("value"),String.format("%.2f",total1));
	Reporter.log(" Value of box 3.72 of Tax adjustments to net profit or loss for this accounting period is verified successfully",true);
}
//adding income manually in 3.29, 3.46 to 3.48, 3.51 to 3.63 and checking impact on 3.49, 3.50, 3.64, 3.65, 3.73 and 3.83 and 3.84
public void funcTradingAndProfessionalIncome2(WebDriver driver,String str1,String str2,String str3,String str4,String str5) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();
	clickEditBtn(driver);
	SA800SalesBusinessIncomeTxtBox.clear();
	SA800SalesBusinessIncomeTxtBox.sendKeys(str1);
	SA800CostOfSalesTxtBox.clear();
	SA800CostOfSalesTxtBox.sendKeys(str2);
	SA800SubcontractorCostsTxtBox.clear();
	SA800SubcontractorCostsTxtBox.sendKeys(str3);
	num1 = Double.parseDouble(str1);
	num2 = Double.parseDouble(str2);
	num3 = Double.parseDouble(str3);
	total1 = num1 - (num2+num3);
	Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total1));
	Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully",true);
	Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total1));
	Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully",true);
	SA800OtherIncomeProfitsTxtBox.clear();
	SA800OtherIncomeProfitsTxtBox.sendKeys(str4);
	SA800TurnOverTxtBox.clear();
	saveBtnPTR.click();
	num4 = Double.parseDouble(str4);
	total2 = total1 + num4;
	Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
	Reporter.log(" Value of box 3.65 with 3.50 value of Income and expenses for this accounting period is verified successfully",true);
	clickEditBtn(driver);
	SA800EmployeeCostsTxtBox.clear();
	SA800EmployeeCostsTxtBox.sendKeys(str5);
	num5 = Double.parseDouble(str5);
	total3 = total2 - num5;
	Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total3));
	Reporter.log(" Value of box 3.65 after deducting total expenses value of Income and expenses for this accounting period is verified successfully",true);
	SA800TurnOverTxtBox.clear();
	saveBtnPTR.click();
	Assert.assertEquals(SA800NetBusinessProfitTxtBox.getAttribute("value"),String.format("%.2f",total3));
	Reporter.log(" Value of box 3.73 of total expenses value of Income and expenses for this accounting period is verified successfully",true);
	wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
	linkBusinessAndInvestmentIncome.click();
	wLib.explicitWait(driver, 5, netProfitTxtBox);
	Assert.assertEquals(netProfitTxtBox.getAttribute("value"),String.format("%.2f",total3));
	Reporter.log("Profit from a trade or profession is Verified successfully",true);

}
public void openIncomeLink(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	wLib.explicitWait(driver, 2,bp1.linkIncomeBK);
	bp1.linkIncomeBK.click();
	select = new Select(financialYearLstBox);
	select.selectByVisibleText("Jan 2018 - Dec 2018");
	}
public void addTurnoverIncomeForPTRShort(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8,String str9,String str10) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
line1CreditAmtTxtBox.clear();
line1CreditAmtTxtBox.sendKeys(str7);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
line2DebitAmtTxtBox.clear();
line2DebitAmtTxtBox.sendKeys(str8);
SaveButton.click();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "").replace(".00", "");
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkTransactionReport);
linkTransactionReport.click();
flatRateSavingAmt = flatRateSavingValue.getText().replace("£", "").replace(".00", "").replace(",", "");
oldTab = driver.getWindowHandle();
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt);
Reporter.log("Sales amount for turnover is Verified successfully",true);
otherTradingAmt = otherTradingValue.getText().replace(",", "");
Assert.assertEquals(otherTradingAmt ,flatRateSavingAmt);
Reporter.log("Other Trading Income amount for turnover is Verified successfully: +otherTradingAmt",true);
num1 = Double.parseDouble(totalIncomeAmt);
num2 = Double.parseDouble(flatRateSavingAmt);
total1 = num1 + num2;
finalAccountOperatingProfitAmt = finalAccountOperatingProfitAmount.getText().replace(",", "");
Assert.assertEquals(finalAccountOperatingProfitAmt ,String.format("%.0f",total1));
Reporter.log("Operating profit Income amount is Verified successfully: " + finalAccountOperatingProfitAmt,true);
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
wLib.explicitWait(driver, 5, partnershipShortChekBox);
partnershipShortChekBox.click();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800TurnOverTxtBox);
Assert.assertEquals(SA800TurnOverTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log("Auto Turnover is Verified successfully: "+SA800TurnOverTxtBox.getAttribute("value"),true);
Assert.assertEquals(netProfitTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log("Net profit/(loss) for this accounting period is Verified successfully: "+netProfitTxtBox.getAttribute("value"),true);
clickEditBtn(driver);
SA800LowerCO2EmissionsTxtBox.clear();
SA800LowerCO2EmissionsTxtBox.sendKeys(str9);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -5000)", "");
saveBtnPTR.click();
num3 = Double.parseDouble(str9);
total2 = total1 + num3;
Assert.assertEquals(SA800TurnOverTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log("Auto Turnover including balancing charges from box 3.23 is Verified successfully: "+SA800TurnOverTxtBox.getAttribute("value"),true);
Assert.assertEquals(netProfitTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log("Net profit/(loss) for this accounting period is Verified successfully: "+netProfitTxtBox.getAttribute("value"),true);
clickEditBtn(driver);
SA800AnnualInvAllowanceTxtBox.clear();
SA800AnnualInvAllowanceTxtBox.sendKeys(str10);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -5000)", "");
saveBtnPTR.click();
num4 = Double.parseDouble(str10);
wLib.explicitWait(driver, 5,allowableExpensesTxtBox);
Assert.assertEquals(allowableExpensesTxtBox.getAttribute("value"),String.format("%.2f",num4));
Reporter.log("Expenses allowable for tax (including capital allowances from box 3.22) is Verified successfully: "+allowableExpensesTxtBox.getAttribute("value"),true);
total3 = total2 - num4;
wLib.explicitWait(driver, 5, netProfitTxtBox);
Assert.assertEquals(netProfitTxtBox.getAttribute("value"),String.format("%.2f",total3));
Reporter.log("Net profit/(loss) for this accounting period is Verified successfully: "+netProfitTxtBox.getAttribute("value"),true);
}
public void addCode3200() throws Exception
{
	robot = new Robot();
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
public void addTurnoverIncomeForPTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
line1CreditAmtTxtBox.clear();
line1CreditAmtTxtBox.sendKeys(str7);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
line2DebitAmtTxtBox.clear();
line2DebitAmtTxtBox.sendKeys(str8);
SaveButton.click();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "").replace(".00", "");
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkTransactionReport);
linkTransactionReport.click();
flatRateSavingAmt = flatRateSavingValue.getText().replace("£", "").replace(".00", "").replace(",", "");
oldTab = driver.getWindowHandle();
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt);
Reporter.log("Sales amount for turnover is Verified successfully",true);
otherTradingAmt = otherTradingValue.getText().replace(",", "");
Assert.assertEquals(otherTradingAmt ,flatRateSavingAmt);
Reporter.log("Other Trading Income amount for turnover is Verified successfully: +otherTradingAmt",true);
num1 = Double.parseDouble(totalIncomeAmt);
num2 = Double.parseDouble(flatRateSavingAmt);
total1 = num1 + num2;
finalAccountOperatingProfitAmt = finalAccountOperatingProfitAmount.getText().replace(",", "");
Assert.assertEquals(finalAccountOperatingProfitAmt ,String.format("%.0f",total1));
Reporter.log("Operating profit Income amount is Verified successfully: " + finalAccountOperatingProfitAmt,true);
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
}
public void funcDelJournals(WebDriver driver) throws Exception
{
	driver.switchTo().window(oldTab);
	wLib.explicitWait(driver, 5,linkAccountantPage);
	linkAccountantPage.click();
	select = new Select(financialYearLstBox);
	select.selectByVisibleText("Jan 2018 - Dec 2018");
	linkJornals.click();
	try
	{
		if (displayRecordsJournal.isDisplayed()==true)
		{
			do {
		displayRecordsJournal.click();
		delRecordsJournal.click();
		driver.switchTo().frame(frameEditModal);
		wLib.explicitWait(driver, 1,bp1.confirmDelBtn);
		bp1.confirmDelBtn.click();	
		}while(displayRecordsJournal.isDisplayed()==true);
		}
	}
	catch (Exception e) {
		Reporter.log("Records not available in Journal",true);
	}
	
}
public void funcDelAutoPartnership(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	funcSAPTRDel(driver);
	Reporter.log("Trading Professional Income deleted successfully",true);
	funcDelJournals(driver);
	bp1.openIncome(driver);
	settingBtnIncome.click();
	bp1.delRecord.click();
	delBtnIncome.click();
	wLib.explicitWait(driver, 5,bp1.plusButtonBK);
	wLib.explicitWait(driver, 5,bp1.plusButtonBK);
	bp1.plusButtonBK.click();
	wLib.explicitWait(driver, 5,linkCustomer);
	linkCustomer.click();
	wLib.explicitWait(driver, 5,linkCustomeDeleteBtn);
	linkCustomeDeleteBtn.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 1,bp1.confirmDelBtn);
	bp1.confirmDelBtn.click();
}
public void funcDelAutoPartnershipFull(WebDriver driver) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	wLib.explicitWait(driver, 5, linkPartnershipSA801Page);
	linkPartnershipSA801Page.click();
	wLib.explicitWait(driver, 5, linkPartnershipUKPropertyIcome);
	linkPartnershipUKPropertyIcome.click();
	funcSAPTRDel(driver);
	Reporter.log("Partnership UK Property deleted successfully",true);
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();	
	funcSAPTRDel(driver);
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	Reporter.log("Trading Professional Income deleted successfully",true);
	wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
	linkBusinessAndInvestmentIncome.click();
	funcSAPTRDel(driver);
	funcDelJournals(driver);
	bp1.openIncome(driver);
	settingBtnIncome.click();
	bp1.delRecord.click();
	delBtnIncome.click();
	wLib.explicitWait(driver, 5,bp1.plusButtonBK);
	wLib.explicitWait(driver, 5,bp1.plusButtonBK);
	bp1.plusButtonBK.click();
	wLib.explicitWait(driver, 5,linkCustomer);
	linkCustomer.click();
	wLib.explicitWait(driver, 5,linkCustomeDeleteBtn);
	linkCustomeDeleteBtn.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 1,bp1.confirmDelBtn);
	bp1.confirmDelBtn.click();
}
public void funcCheckVatCheckBoxesAutoFeature(WebDriver driver, String str1,String str2) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
wLib.explicitWait(driver, 5,moreBtn);
moreBtn.click();
wLib.explicitWait(driver, 5, linkVATSetUp);
linkVATSetUp.click();
oldTab = driver.getWindowHandle();
wLib.explicitWait(driver, 5, partnerEditBtn);
partnerEditBtn.click();
wLib.explicitWait(driver, 5, enableVATChkBox);
//enableVATChkBox.click();
wLib.explicitWait(driver, 5, vATNTxtBox);
vATNTxtBox.clear();
vATNTxtBox.sendKeys(str1);
select = new Select(frequencyLstBox);
select.selectByVisibleText("Monthly");
wLib.explicitWait(driver, 5, regDateTxtBox);
regDateTxtBox.clear();
regDateTxtBox.sendKeys(str2);
vATSaveBtn.click();
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
wLib.explicitWait(driver, 5,partnerEditBtn);
clickEditBtnPTR(driver);
wLib.explicitWait(driver, 5, autoOptionBtn);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
wLib.explicitWait(driver, 5, saveBtnAlertMsg);
saveBtnAlertMsg.click();
Assert.assertEquals(isVATIncludedChkBox.getAttribute("checked"),"true");
Reporter.log("Box 3.27 is verified successfully: "+isVATIncludedChkBox.getAttribute("checked"),true);
driver.switchTo().window(oldTab);
wLib.explicitWait(driver, 5, partnerEditBtn);
partnerEditBtn.click();
wLib.explicitWait(driver, 5, enableVATChkBox);
enableVATChkBox.click();
wLib.explicitWait(driver, 5, vATNTxtBox);
vATNTxtBox.clear();
wLib.explicitWait(driver, 5, regDateTxtBox);
regDateTxtBox.clear();
vATSaveBtn.click();
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
funcSAPTRDel(driver);
wLib.explicitWait(driver, 5,partnerEditBtn);
clickEditBtnPTR(driver);
wLib.explicitWait(driver, 5, autoOptionBtn);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
wLib.explicitWait(driver, 5, saveBtnAlertMsg);
saveBtnAlertMsg.click();
Assert.assertEquals(isVATExcludedChkBox.getAttribute("checked"),"true");
Reporter.log("Box 3.28 is verified successfully: "+isVATIncludedChkBox.getAttribute("checked"),true);
}
public void addValueInLedgerCodeForTotalExpenses(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8)throws Exception
{
	wLib.explicitWait(driver, 5,linkAccountantPage);
	linkAccountantPage.click();
	select = new Select(financialYearLstBox);
	select.selectByVisibleText("Jan 2018 - Dec 2018");
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_5);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_5);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str3);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str4);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_6);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_6);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_5);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_5);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str5);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str6);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_6);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_6);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str7);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str8);
	SaveButton.click();	
}
public void VerifyTotalExpensesPTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
addValueInLedgerCodeForTotalExpenses(driver, str5, str6, str7, str8, str9, str10, str11, str12);
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt.replace(".00",""));
Reporter.log("Sales amount for turnover is Verified successfully",true);
openingStockValue =finalAccountOpeningStockAmount.getText().replace(",", "");
Assert.assertEquals(openingStockValue ,str7);
Reporter.log("Stock amount of Balance sheet is Verified successfully",true);
discountValue = finalAccountDiscountAmount.getText().replace(",", "");
Assert.assertEquals(discountValue ,str9);
Reporter.log("discount amount of Balance sheet is Verified successfully",true);
grossWagesValue = finalAccountGrossWagesAmount.getText().replace(",", "");
Assert.assertEquals(grossWagesValue ,str11);
Reporter.log("Gross amount of Balance sheet is Verified successfully",true);
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
CoSAmt = SA800CostOfSalesTxtBox.getAttribute("value");
CISAmt = SA800SubcontractorCostsTxtBox.getAttribute("value");
ODCSAmt = SA800OtherDirectCostsTxtBox.getAttribute("value");
num2 = Double.parseDouble(CoSAmt);
num3 = Double.parseDouble(CISAmt);
num4 = Double.parseDouble(ODCSAmt);
total1 = num1 - (num2 + num3 + num4);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully",true);
}		
public void addIncomeForPTR(WebDriver driver,String str1,String str2,String str3,String str4, String str5) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
openIncomeLink(driver);
wLib.explicitWait(driver, 5,bp1.plusButtonBK);
bp1.plusButtonBK.click();
wLib.explicitWait(driver, 5,bp1.linkAddBtn);
bp1.linkAddBtn.click();
wLib.explicitWait(driver, 5,addCustomerBtn);
addCustomerBtn.click();
driver.switchTo().frame(frameAddinvoicemodalplus);
wLib.explicitWait(driver,5,customerName);
customerName.sendKeys(str1);
SaveButton.click();
wLib.explicitWait(driver, 5,bp1.serialNoTxtBox);
bp1.serialNoTxtBox.clear();
bp1.serialNoTxtBox.sendKeys(str2);
bp1.invoiceDateTxtBox.click();
bp1.invoiceDateTxtBox.clear();
bp1.invoiceDateTxtBox.sendKeys(str5);
Thread.sleep(1000);
bp1.invoiceDateTxtBox.sendKeys(Keys.TAB);
wLib.explicitWait(driver, 5,bp1.incomeTypeLstBox);
select = new Select(bp1.incomeTypeLstBox);
select.selectByVisibleText("Sale");
wLib.explicitWait(driver, 2,bp1.descriptionTxtBox);
bp1.descriptionTxtBox.click();
bp1.descriptionTxtBox.clear();
Thread.sleep(1000);
bp1.descriptionTxtBox.sendKeys("Adding turnover");
Thread.sleep(1000);
bp1.descriptionTxtBox.sendKeys(Keys.TAB);
wLib.explicitWait(driver, 2,bp1.unitPriceTxtBox);
bp1.unitPriceTxtBox.click();
bp1.unitPriceTxtBox.clear();
bp1.unitPriceTxtBox.sendKeys(str3);
Thread.sleep(1000);
bp1.unitPriceTxtBox.sendKeys(Keys.TAB);
Thread.sleep(2000);
bp1.quantityTxtBox.click();
bp1.quantityTxtBox.clear();
bp1.quantityTxtBox.sendKeys(str4);
Thread.sleep(1000);
bp1.quantityTxtBox.sendKeys(Keys.TAB);
Thread.sleep(2000);
wLib.explicitWait(driver, 5,bp1.vatRateTypeLstBox);
select= new Select(bp1.vatRateTypeLstBox);
select.selectByVisibleText("STD 20%");
wLib.explicitWait(driver, 2, saveInvoiceBtn);
saveInvoiceBtn.click();
//Thread.sleep(5000);
}
public void Verify3_46PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str7);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str8);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt.replace(".00",""));
Reporter.log("Sales amount for turnover is Verified successfully",true);
openingStockValue =finalAccountOpeningStockAmount.getText().replace(",", "");
Assert.assertEquals(openingStockValue ,str7);
Reporter.log("Opening Stock Value of Balance sheet is Verified successfully",true);
purchasesValue = finalAccountPurchasesAmount.getText().replace(",", "");
Assert.assertEquals(purchasesValue ,str9);
Reporter.log("Purchase amount of Balance sheet is Verified successfully",true);
materialsValue = finalAccountMaterialsAmount.getText().replace(",", "");
Assert.assertEquals(materialsValue ,str11);
Reporter.log("Materials amount of Balance sheet is Verified successfully",true);
closingStockValue =finalAccountClosingstockAmount.getText().replace(",", "");
Assert.assertEquals(closingStockValue,str13);
Reporter.log("Closing Stock amount of Balance sheet is Verified successfully",true); 
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
CoSAmt = SA800CostOfSalesTxtBox.getAttribute("value");

num2 = Double.parseDouble(openingStockValue);
num3 = Double.parseDouble(purchasesValue);
num4 = Double.parseDouble(materialsValue);
num5 = Double.parseDouble(closingStockValue);
total1 =num2 + num3 + num4 +num5;
total2 = num1 - total1;
Assert.assertEquals(SA800CostOfSalesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.46 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully",true);
}
public void Verify3_48PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str7);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str8);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_9);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_9);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt.replace(".00",""));
Reporter.log("Sales amount for turnover is Verified successfully",true);
grossWagesValue =finalAccountGrossWagesAmount.getText().replace(",", "");
Assert.assertEquals(grossWagesValue ,str7);
Reporter.log("Gross wages Value of Balance sheet is Verified successfully",true);
nICEmployerValue = finalAccountNICEmployerAmount.getText().replace(",", "");
Assert.assertEquals(nICEmployerValue ,str9);
Reporter.log("NIC employer of Balance sheet is Verified successfully",true);
otherDirectExpensesValue = finalAccountOtherDirectExpensesAmount.getText().replace(",", "");
Assert.assertEquals(otherDirectExpensesValue ,str11);
Reporter.log("Other direct expenses amount of Balance sheet is Verified successfully",true);
transportationCostValue =finalAccountTransportationCostAmount.getText().replace(",", "");
Assert.assertEquals(transportationCostValue,str13);
Reporter.log("Transportation cost amount of Balance sheet is Verified successfully",true); 
discountAllowedValue = finalAccountDiscountAllowedAmount.getText().replace(",", "");
Assert.assertEquals(discountAllowedValue ,str15);
Reporter.log("Discount allowed amount of Balance sheet is Verified successfully",true);
salesCommissionPayableValue =finalAccountSalesCommissionPayableAmount.getText().replace(",", "");
Assert.assertEquals(salesCommissionPayableValue,str17);
Reporter.log("Sales commission payable amount of Balance sheet is Verified successfully",true); 
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
ODCSAmt = SA800OtherDirectCostsTxtBox.getAttribute("value");

num2 = Double.parseDouble(grossWagesValue);
num3 = Double.parseDouble(nICEmployerValue);
num4 = Double.parseDouble(otherDirectExpensesValue);
num5 = Double.parseDouble(transportationCostValue);
num6 = Double.parseDouble(discountAllowedValue);
num7 = Double.parseDouble(salesCommissionPayableValue);
total1 =num2 + num3 + num4 +num5 + num6 + num7 ;
total2 = num1 - total1;
Assert.assertEquals(SA800OtherDirectCostsTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.48 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully",true);
}	
public void addValue4100(WebDriver driver,String str1,String str2,String str3,String str4) throws Exception
{
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str1);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str2);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str3);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str4);
SaveButton.click();
}
public void Verify3_50PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver,  str5,  str6,  str7,  str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,totalIncomeAmt.replace(".00",""));
Reporter.log("Sales amount for turnover is Verified successfully",true);
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,str7);
Reporter.log("Bank interest receivable Value of Balance sheet is Verified successfully",true);
otherInterestReceivableValue = finalAccountOtherInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(otherInterestReceivableValue ,str9);
Reporter.log("Other interest receivable of Balance sheet is Verified successfully",true);
rentReceivableValue = finalAccountRentReceivableAmount.getText().replace(",", "");
Assert.assertEquals(rentReceivableValue ,str11);
Reporter.log("Rent receivable amount of Balance sheet is Verified successfully",true);
commissionReceivableValue =finalAccountCommissionReceivableAmount.getText().replace(",", "");
Assert.assertEquals(commissionReceivableValue,str13);
Reporter.log("Commission receivable amount of Balance sheet is Verified successfully",true); 
sundryIncomeValue = finalAccountSundryIncomeAmount.getText().replace(",", "");
Assert.assertEquals(sundryIncomeValue ,str15);
Reporter.log("Sundry income amount of Balance sheet is Verified successfully",true);
nonTaxableIncomeValue =finalAccountNonTaxableIncomeAmount.getText().replace(",", "");
Assert.assertEquals(nonTaxableIncomeValue,str17);
Reporter.log("Non taxable income amount of Balance sheet is Verified successfully",true); 

driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
ODCSAmt = SA800OtherDirectCostsTxtBox.getAttribute("value");

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(otherInterestReceivableValue);
num4 = Double.parseDouble(rentReceivableValue);
num5 = Double.parseDouble(commissionReceivableValue);
num6 = Double.parseDouble(sundryIncomeValue);
num7 = Double.parseDouble(nonTaxableIncomeValue);
total1 =num2 + num3 + num4 +num5 + num6 + num7 ;
total2 = num1 + total1;
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully",true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully",true);
}

public void Verify3_51PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver,  str5,  str6,  str7,  str8);
/*addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();*/
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

/*addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();*/

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str25);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str26);
SaveButton.click();

/*addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str27);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str28);
SaveButton.click();*/

oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");
SSPReclaimedAmt = SSPReclaimedAmount.getText().replace(",", "").replace("£", "").replace(".00","");
SMPReclaimedAmt = SMPReclaimedAmount.getText().replace(",", "").replace("£", "").replace(".00","");
WagesCasualAmt = WagesCasualAmount.getText().replace(",", "").replace("£", "").replace(".00","");
EmployeeSalaryExpenseAmt = EmployeeSalaryExpenseAmount.getText().replace(",", "").replace("£", "").replace(".00","");
EmployerNIAmt = EmployerNIAmount.getText().replace(",", "").replace("£", "").replace(".00","");
PensionContributionsAmt = PensionContributionsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet iscompared successfully with profit and loss: "+ bankInterestReceivableValue,true);

/*directorsSalariesValue = finalAccountDirectorsSalariesAmount.getText().replace(",", "");
Assert.assertEquals(directorsSalariesValue ,str9);
Reporter.log("Directors salaries of Balance sheet is Verified successfully",true);
directorsNICValue = finalAccountDirectorsNICAmount.getText().replace(",", "");
Assert.assertEquals(directorsNICValue ,str11);
Reporter.log("Directors NIC amount of Balance sheet is Verified successfully",true);*/
sSPReclaimedValue = finalAccountSSPReclaimedAmount.getText().replace(",", "");
Assert.assertEquals(sSPReclaimedValue,SSPReclaimedAmt);
Reporter.log("SSP reclaimed amount of Balance sheet is compared successfully with profit and loss: "+sSPReclaimedValue,true); 
SMPReclaimedValue = finalAccountSMPReclaimedAmount.getText().replace(",", "");
Assert.assertEquals(SMPReclaimedValue ,SMPReclaimedAmt);
Reporter.log("SMP reclaimed amount of Balance sheet is compared successfully with profit and loss: " + SMPReclaimedValue,true);
WagesCasualValue =finalAccountWagesCasualAmount.getText().replace(",", "");
Assert.assertEquals(WagesCasualValue,WagesCasualAmt);
Reporter.log("Wages - casual income amount of Balance sheet is compared successfully with profit and loss: "+WagesCasualValue,true); 
salariesValue = finalAccountSalariesAmount.getText().replace(",", "");
Assert.assertEquals(salariesValue ,EmployeeSalaryExpenseAmt);
Reporter.log("Salaries of Balance sheet is  compared successfully with profit and loss: "+salariesValue,true);
nICEmployerWagesSalariesValue = finalAccountNICEmployerWagesSalariesAmount.getText().replace(",", "");
Assert.assertEquals(nICEmployerWagesSalariesValue ,EmployerNIAmt);
Reporter.log("NIC employer (wages and salaries) amount of Balance sheet is compared successfully with profit and loss: "+nICEmployerWagesSalariesValue,true);
/*remunerationTrustContributionValue = finalAccountRemunerationTrustContributionAmount.getText().replace(",", "");
Assert.assertEquals(remunerationTrustContributionValue,str23);
Reporter.log("Remuneration Trust Contribution amount of Balance sheet is Verified successfully",true); */
pensionContributionsValue = finalAccountPensionContributionsAmount.getText().replace(",", "");
Assert.assertEquals(pensionContributionsValue ,PensionContributionsAmt);
Reporter.log("Pension Contributions amount of Balance sheet is compared successfully with profit and loss: "+pensionContributionsValue,true);
/*pensionContributionsDirectorValue = finalAccountPensionContributionsDirectorAmount.getText().replace(",", "");
Assert.assertEquals(pensionContributionsDirectorValue, str27);
Reporter.log("Pension Contributions - Director income amount of Balance sheet is Verified successfully",true); */

driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
ODCSAmt = SA800OtherDirectCostsTxtBox.getAttribute("value");

num2 = Double.parseDouble(bankInterestReceivableValue);
//num3 = Double.parseDouble(directorsSalariesValue);
//num4 = Double.parseDouble(directorsNICValue);
num5 = Double.parseDouble(sSPReclaimedValue);
num6 = Double.parseDouble(SMPReclaimedValue);
num7 = Double.parseDouble(WagesCasualValue);
num8 = Double.parseDouble(salariesValue);
num9 = Double.parseDouble(nICEmployerWagesSalariesValue);
num10 = Double.parseDouble(pensionContributionsValue);
//num11 = Double.parseDouble(remunerationTrustContributionValue);
//num12 = Double.parseDouble(pensionContributionsDirectorValue);

total1 = num5 + num6 + num7 + num8 + num9 + num10;//num3 + num4 + num11 + num12
total2 = num1 + num2 - (total1);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800EmployeeCostsTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.51 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total2,true);
}

public void Verify3_52PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_9);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_9);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");

groundRentServiceChargesAmt = GroundRentServiceChargesValue.getText().replace(",", "").replace("£", "").replace(".00","");
ratesAmt = RatesValue.getText().replace(",", "").replace("£", "").replace(".00","");
serviceChargesAmt = ServiceChargesValue.getText().replace(",", "").replace("£", "").replace(".00","");
waterChargesAmt = WaterChargesValue.getText().replace(",", "").replace("£", "").replace(".00","");
heatandLightAmt = HeatandLightValue.getText().replace(",", "").replace("£", "").replace(".00","");
rentAmt = RentValue.getText().replace(",", "").replace("£", "").replace(".00","");
cleaningAmt = CleaningValue.getText().replace(",", "").replace("£", "").replace(".00","");
useOfResidenceAmt = UseOfResidenceValue.getText().replace(",", "").replace("£", "").replace(".00","");
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);

groundRentServiceChargesValue = finalAccountGroundRentAndServiceChargesAmount.getText().replace(",", "");
Assert.assertEquals(groundRentServiceChargesValue ,groundRentServiceChargesAmt);
Reporter.log("Ground Rent Service Charges Amount of Balance sheet is compared successfully with profit and loss: "+groundRentServiceChargesValue,true); 
ratesValue = finalAccountRatesAmount.getText().replace(",", "");
Assert.assertEquals(ratesValue , ratesAmt);
Reporter.log("Rates amount of Balance sheetis compared successfully with profit and loss: "+ ratesValue,true); 
serviceChargesValue = finalAccountServiceChargesAmount.getText().replace(",", "");
Assert.assertEquals(serviceChargesValue, serviceChargesAmt);
Reporter.log("service Charges amount of Balance sheet is compared successfully with profit and loss: "+serviceChargesValue,true); 
waterChargesValue = finalAccountWaterChargesAmount.getText().replace(",", "");
Assert.assertEquals(waterChargesValue ,waterChargesAmt);
Reporter.log("Water Charges amount of Balance sheet is compared successfully with profit and loss: " + waterChargesValue,true);
heatandLightValue = finalAccountHeatAndLightAmount.getText().replace(",", "");
Assert.assertEquals(heatandLightValue, heatandLightAmt);
Reporter.log("Heat and Light amount of Balance sheet is compared successfully with profit and loss: "+heatandLightValue,true); 
rentValue = finalAccountRentAmount.getText().replace(",", "");
Assert.assertEquals(rentValue ,rentAmt);
Reporter.log("Rent Amount of Balance sheet is  compared successfully with profit and loss: "+ rentValue,true);
cleaningValue = finalAccountCleaningAmount.getText().replace(",", "");
Assert.assertEquals(cleaningValue ,cleaningAmt);
Reporter.log("Cleaning amount of Balance sheet is compared successfully with profit and loss: "+cleaningValue,true);

useOfResidenceValue = finalAccountUseOfResidenceAmount.getText().replace(",", "");
Assert.assertEquals(useOfResidenceValue ,useOfResidenceAmt);
Reporter.log("Use of Residence amount of Balance sheet is compared successfully with profit and loss: "+useOfResidenceValue,true);

driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
ODCSAmt = SA800OtherDirectCostsTxtBox.getAttribute("value");

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(groundRentServiceChargesValue);
num4 = Double.parseDouble(ratesValue);
num5 = Double.parseDouble(serviceChargesValue);
num6 = Double.parseDouble(waterChargesValue);
num7 = Double.parseDouble(heatandLightValue);
num8 = Double.parseDouble(rentValue);
num9 = Double.parseDouble(cleaningValue);
num10 = Double.parseDouble(useOfResidenceValue);

total1 = num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
total2 = num1 + num2 - (total1);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800TEPremisesCostsTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.52 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total2,true);
}

public void Verify3_53And3_54PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str25);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str26);
SaveButton.click();
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");

repairsAndRenewalsAmt = RepairsAndRenewalsValue.getText().replace(",", "").replace("£", "").replace(".00","");
healthAndSafetyAmt = HealthAndSafetyValue.getText().replace(",", "").replace("£", "").replace(".00","");
licenseFeesAmt = LicenseFeesValue.getText().replace(",", "").replace("£", "").replace(".00","");
insuranceAmt = InsuranceValue.getText().replace(",", "").replace("£", "").replace(".00","");
postagePrintingStationeryOfficeSuppliesAmt = PostagePrintingStationeryOfficeSuppliesValue.getText().replace(",", "").replace("£", "").replace(".00","");
telephoneInternetBroadbandAmt = TelephoneInternetBroadbandValue.getText().replace(",", "").replace("£", "").replace(".00","");
staffWelfareAmt = StaffWelfareValue.getText().replace(",", "").replace("£", "").replace(".00","");
computerCostAmt = ComputerCostValue.getText().replace(",", "").replace("£", "").replace(".00","");
sundryExpensesAmt = SundryExpensesValue.getText().replace(",", "").replace("£", "").replace(".00","");
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);
repairsAndRenewalsValue = finalAccountRepairsAndRenewalsAmount.getText().replace(",", "");
Assert.assertEquals(repairsAndRenewalsValue ,repairsAndRenewalsAmt);
Reporter.log("Repairs And Renewals Amount of Balance sheet is compared successfully with profit and loss: "+ repairsAndRenewalsValue,true); 
healthAndSafetyValue = finalAccountHealthAndSafetyAmount.getText().replace(",", "");
Assert.assertEquals(healthAndSafetyValue , healthAndSafetyAmt);
Reporter.log("Health And Safety amount of Balance sheetis compared successfully with profit and loss: "+ healthAndSafetyValue,true); 
licenseFeesValue = finalAccountLicenseFeesAmount.getText().replace(",", "");
Assert.assertEquals(licenseFeesValue, licenseFeesAmt);
Reporter.log("License Fees amount of Balance sheet is compared successfully with profit and loss: "+ licenseFeesValue,true); 
insuranceValue = finalAccountInsuranceAmount.getText().replace(",", "");
Assert.assertEquals(insuranceValue ,insuranceAmt);
Reporter.log("Insurance amount of Balance sheet is compared successfully with profit and loss: " + insuranceValue,true);
postagePrintingStationeryOfficeSuppliesValue = finalAccountPostagePrintingStationeryAndOfficeSuppliesAmount.getText().replace(",", "");
Assert.assertEquals(postagePrintingStationeryOfficeSuppliesValue, postagePrintingStationeryOfficeSuppliesAmt);
Reporter.log("Postage, Printing, Stationery and Office supplies amount of Balance sheet is compared successfully with profit and loss: "+postagePrintingStationeryOfficeSuppliesValue,true); 
telephoneInternetBroadbandValue = finalAccountTelephoneInternetAndBroadbandAmount.getText().replace(",", "");
Assert.assertEquals(telephoneInternetBroadbandValue ,telephoneInternetBroadbandAmt);
Reporter.log("Telephone Internet and Broadband Amount of Balance sheet is  compared successfully with profit and loss: "+ telephoneInternetBroadbandAmt,true);
staffWelfareValue = finalAccountStaffWelfareAmount.getText().replace(",", "");
Assert.assertEquals(staffWelfareValue ,staffWelfareAmt);
Reporter.log("Staff Welfare amount of Balance sheet is compared successfully with profit and loss: "+staffWelfareValue,true);
computerCostValue = finalAccountComputerCostAmount.getText().replace(",", "");
Assert.assertEquals(computerCostValue ,computerCostAmt);
Reporter.log("Computer Cost amount of Balance sheet is compared successfully with profit and loss: "+ computerCostValue,true);
sundryExpensesValue = finalAccountSundryExpensesAmount.getText().replace(",", "");
Assert.assertEquals(sundryExpensesValue ,sundryExpensesAmt);
Reporter.log("Sundry Expenses amount of Balance sheet is compared successfully with profit and loss: "+ sundryExpensesValue,true);

driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(repairsAndRenewalsValue);
num4 = Double.parseDouble(healthAndSafetyValue);
num5 = Double.parseDouble(licenseFeesValue);
num6 = Double.parseDouble(insuranceValue);
num7 = Double.parseDouble(postagePrintingStationeryOfficeSuppliesValue);
num8 = Double.parseDouble(telephoneInternetBroadbandValue);
num9 = Double.parseDouble(staffWelfareValue);
num10 = Double.parseDouble(computerCostValue);
num11 = Double.parseDouble(sundryExpensesValue);

total1 = num4 + num5 + num6 + num7 + num8 + num9 + num10 +num11;
total2 = total1 + num3;
total3 = num1 + num2 - (total2);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800TERepairsTxtBox.getAttribute("value"),String.format("%.2f",num3));
Reporter.log(" Value of box 3.53 of Income and expenses for this accounting period is verified successfully: "+num3,true);
Assert.assertEquals(SA800TEGenAdminExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.54 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total2,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total3));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total3,true);
}

public void Verify3_55And3_56PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");
try
{
motorExpensesAmt = MotorExpensesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch (Exception e) 
{
Reporter.log("Ledger code 7300 is not available",true);
}
try
{
scaleChargesAmt = ScaleChargesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7305 is not available",true);
}
try
{
travelAndOverseasTravellingAmt = TravelAndOverseasTravellingValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7010 is not available",true);
}
try
{
speedingAndParkingAmt = SpeedingAndParkingValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7012 is not available",true);
}
try
{
hotelsAndAccomodationCostsAmt = HotelsAndAccomodationCostsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7014 is not available",true);
}
try
{
	overseasAllowanceAmt = OverseasAllowanceValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7015 is not available",true);
}
try
{
subsistenceFoodAmt = SubsistenceFoodValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7016 is not available",true);
}
try
{
overseasEntertainmentAmt = OverseasEntertainmentValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7022 is not available",true);
}
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
try
{
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);
}
catch(Exception e)
{
Reporter.log("Bank interest receivable Value is not available in Final Account",true);
}
try
{
motorExpensesValue = finalAccountMotorExpensesAmount.getText().replace(",", "");
Assert.assertEquals(motorExpensesValue ,motorExpensesAmt);
Reporter.log("Motor and Expenses Amount of Balance sheet is compared successfully with profit and loss: "+ motorExpensesValue,true); 
}
catch(Exception e)
{
Reporter.log("Motor and Expenses Amount is not available in Final Account",true);
}
try
{
scaleChargesValue = finalAccountScaleChargesAmount.getText().replace(",", "");
Assert.assertEquals(scaleChargesValue , scaleChargesAmt);
Reporter.log("Scale Charges amount of Balance sheetis compared successfully with profit and loss: "+ scaleChargesValue,true); 
}
catch(Exception e)
{
Reporter.log("Scale Charges Amount is not available in Final Account",true);
}
try
{
travelAndOverseasTravellingValue = finalAccountTravelAndOverseasTravellingAmount.getText().replace(",", "");
Assert.assertEquals(travelAndOverseasTravellingValue, travelAndOverseasTravellingAmt);
Reporter.log("Travel and OverseasTravellingAmt amount of Balance sheet is compared successfully with profit and loss: "+ travelAndOverseasTravellingValue,true); 
}
catch(Exception e)
{
Reporter.log("Travel and OverseasTravellingAmt Amount is not available in Final Account",true);
}
try
{
speedingAndParkingValue = finalAccountSpeedingAndParkingAmount.getText().replace(",", "");
Assert.assertEquals(speedingAndParkingValue ,speedingAndParkingAmt);
Reporter.log("Speeding And Parking amount of Balance sheet is compared successfully with profit and loss: " + speedingAndParkingValue,true);
}
catch(Exception e)
{
Reporter.log("Speeding And Parking Amount is not available in Final Account",true);
}
try
{
hotelsAndAccomodationCostsValue = finalAccountHotelsAndAccomodationCostsAmount.getText().replace(",", "");
Assert.assertEquals(hotelsAndAccomodationCostsValue, hotelsAndAccomodationCostsAmt);
Reporter.log("Hotels and accomodation Costs amount of Balance sheet is compared successfully with profit and loss: "+hotelsAndAccomodationCostsValue,true); 
}
catch(Exception e)
{
Reporter.log("Hotels and accomodation Costs Amount is not available in Final Account",true);
}
try
{
overseasAllowanceValue = finalAccountOverseasAllowanceAmount.getText().replace(",", "");
Assert.assertEquals(overseasAllowanceValue ,overseasAllowanceAmt);
Reporter.log("Overseas Allowance Amount of Balance sheet is  compared successfully with profit and loss: "+ overseasAllowanceValue,true);
}
catch(Exception e)
{
Reporter.log("Overseas Allowance Amount is not available in Final Account",true);
}
try
{
subsistenceOrFoodValue = finalAccountSubsistenceOrFoodAmount.getText().replace(",", "");
Assert.assertEquals(subsistenceOrFoodValue ,subsistenceFoodAmt);
Reporter.log("Subsistence Food amount of Balance sheet is compared successfully with profit and loss: "+subsistenceOrFoodValue,true);
}
catch(Exception e)
{
Reporter.log("Subsistence Food Amount is not available in Final Account",true);
}
try
{
overseasEntertainmentValue = finalAccountOverseasEntertainmentAmount.getText().replace(",", "");
Assert.assertEquals(overseasEntertainmentValue ,overseasEntertainmentAmt);
Reporter.log("Overseas Entertainment amount of Balance sheet is compared successfully with profit and loss: "+ overseasEntertainmentValue,true);
}
catch(Exception e)
{
Reporter.log("Overseas Entertainment Amount is not available in Final Account",true);
}
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(motorExpensesValue);
num4 = Double.parseDouble(scaleChargesValue);
num5 = Double.parseDouble(travelAndOverseasTravellingValue);
num6 = Double.parseDouble(speedingAndParkingValue);
num7 = Double.parseDouble(hotelsAndAccomodationCostsValue);
num8 = Double.parseDouble(overseasAllowanceValue);
num9 = Double.parseDouble(subsistenceOrFoodValue);
num10 = Double.parseDouble(overseasEntertainmentValue);

total1 = num3 + num4;
total2 = num5 + num6 + num7 + num8 + num9 + num10;
total3 = total1 + total2;
total4 = num1 + num2 - (total3);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800TEMotorExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.55 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TETravelSubsistenceTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.56 of Income and expenses for this accounting period is verified successfully: "+total2,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total3));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total3,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total4));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total4,true);
}
public void Verify3_57And3_58PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");
try
{
businessEntertainingAmt = BusinessEntertainingValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch (Exception e) 
{
Reporter.log("Ledger code 7020 is not available",true);
}
try
{
staffEntertainingAmt = StaffEntertainingValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7021 is not available",true);
}
try
{
advertisingSalesPromotionMarketingAmt = AdvertisingSalesPromotionMarketingValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7004 is not available",true);
}
try
{
tradeFairsExhibitionsAndWebsiteCostsAmt = TradeFairsExhibitionsAndWebsiteCostsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7005 is not available",true);
}
try
{
websiteCostAmt = WebsiteCostValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7008 is not available",true);
}
try
{
accountancyFeesAmt = AccountancyFeesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7400 is not available",true);
}
try
{
professionalConsultancyAndLegalFeesAmt = ProfessionalConsultancyAndLegalFeesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7401 is not available",true);
}
try
{
subcontractorOverheadAmt = SubcontractorOverheadValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7402 is not available",true);
}
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
try
{
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);
}
catch(Exception e)
{
Reporter.log("Bank interest receivable Value is not available in Final Account",true);
}
try
{
businessEntertainingValue = finalAccountBusinessEntertainingAmount.getText().replace(",", "");
Assert.assertEquals(businessEntertainingValue ,businessEntertainingAmt);
Reporter.log("Business and Entertaining Amount of Balance sheet is compared successfully with profit and loss: "+ businessEntertainingValue,true); 
}
catch(Exception e)
{
Reporter.log("Business and Entertaining Amount is not available in Final Account",true);
}
try
{
staffEntertainingValue = finalAccountStaffEntertainingAmount.getText().replace(",", "");
Assert.assertEquals(staffEntertainingValue , staffEntertainingAmt);
Reporter.log("Staff Entertaining amount of Balance sheetis compared successfully with profit and loss: "+ staffEntertainingValue,true); 
}
catch(Exception e)
{
Reporter.log("Staff Entertaining Amount is not available in Final Account",true);
}
try
{
advertisingSalesPromotionMarketingValue = finalAccountAdvertisingSalesPromotionMarketingAmount.getText().replace(",", "");
Assert.assertEquals(advertisingSalesPromotionMarketingValue, advertisingSalesPromotionMarketingAmt);
Reporter.log("Advertising, Sales, Promotion, Marketing amount of Balance sheet is compared successfully with profit and loss: "+ advertisingSalesPromotionMarketingValue,true); 
}
catch(Exception e)
{
Reporter.log("Advertising, Sales, Promotion, Marketing  Amount is not available in Final Account",true);
}
try
{
tradeFairsExhibitionsAndWebsiteCostsValue = finalAccountTradeFairsExhibitionsAndWebsiteCostsAmount.getText().replace(",", "");
Assert.assertEquals(tradeFairsExhibitionsAndWebsiteCostsValue ,tradeFairsExhibitionsAndWebsiteCostsAmt);
Reporter.log("Trade, Fairs, Exhibitions And Website Costs amount of Balance sheet is compared successfully with profit and loss: " + tradeFairsExhibitionsAndWebsiteCostsValue,true);
}
catch(Exception e)
{
Reporter.log("Trade, Fairs, Exhibitions And Website Costs Amount is not available in Final Account",true);
}
try
{
websiteCostValue = finalAccountWebsiteCostAmount.getText().replace(",", "");
Assert.assertEquals(websiteCostValue, websiteCostAmt);
Reporter.log("Website Cost amount of Balance sheet is compared successfully with profit and loss: "+websiteCostValue,true); 
}
catch(Exception e)
{
Reporter.log("Website Cost Amount is not available in Final Account",true);
}
try
{
accountancyFeesValue = finalAccountAccountancyFeesAmount.getText().replace(",", "");
Assert.assertEquals(accountancyFeesValue, accountancyFeesAmt);
Reporter.log("Accountancy Fees Amount of Balance sheet is  compared successfully with profit and loss: "+ accountancyFeesValue,true);
}
catch(Exception e)
{
Reporter.log("Accountancy Fees Amount is not available in Final Account",true);
}
try
{
professionalConsultancyAndLegalFeesValue = finalAccountProfessionalConsultancyAndLegalFeesAmount.getText().replace(",", "");
Assert.assertEquals(professionalConsultancyAndLegalFeesValue, professionalConsultancyAndLegalFeesAmt);
Reporter.log("Professional Consultancy And Legal Fees amount of Balance sheet is compared successfully with profit and loss: "+professionalConsultancyAndLegalFeesValue,true);
}
catch(Exception e)
{
Reporter.log("Professional Consultancy And Legal Fees Amount is not available in Final Account",true);
}
try
{
subcontractorOverheadValue = finalAccountSubcontractorOverheadAmount.getText().replace(",", "");
Assert.assertEquals(subcontractorOverheadValue, subcontractorOverheadAmt);
Reporter.log("Subcontractor Overhead amount of Balance sheet is compared successfully with profit and loss: "+ subcontractorOverheadValue,true);
}
catch(Exception e)
{
Reporter.log("Subcontractor Overhead Amount is not available in Final Account",true);
}
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(businessEntertainingValue);
num4 = Double.parseDouble(staffEntertainingValue);
num5 = Double.parseDouble(advertisingSalesPromotionMarketingValue);
num6 = Double.parseDouble(tradeFairsExhibitionsAndWebsiteCostsValue);
num7 = Double.parseDouble(websiteCostValue);
num8 = Double.parseDouble(accountancyFeesValue);
num9 = Double.parseDouble(professionalConsultancyAndLegalFeesValue);
num10 = Double.parseDouble(subcontractorOverheadValue);
total1 = num3 + num4 + num5 + num6 + num7;
total2 = num8 + num9 + num10;
total3 = total1 + total2;
total4 = num1 + num2 - (total3);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800TEAdvPromotionTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.57 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TELegalProfCostsTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.58 of Income and expenses for this accounting period is verified successfully: "+total2,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total3));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total3,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total4));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total4,true);
}
public void Verify3_59To3_62PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30,String str31, String str32) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_9);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_9);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_4);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_4);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str25);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str26);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str27);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str28);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str29);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str30);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_6);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_6);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str31);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str32);
SaveButton.click();

oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");
try
{
badDebtsAmt = BadDebtsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch (Exception e) 
{
Reporter.log("Ledger code 7030 is not available",true);
}
try
{
badDebtsRecoveredAmt = BadDebtsRecoveredValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7031 is not available",true);
}
try
{
generalProvisionForDoubtfulDebtsAmt = GeneralProvisionForDoubtfulDebtsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7032 is not available",true);
}
try
{
bankHirePurchaseMortgageAndOtherAmt = BankHirePurchaseMortgageAndOtherValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7519 is not available",true);
}
try
{
bankCardAndOverDraftChargesAmt = BankCardAndOverDraftChargesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7518 is not available",true);
}
try
{
amortisationOfPurchasedGoodwillAmt = AmortisationOfPurchasedGoodwillValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7603 is not available",true);
}
try
{
depreciationOfPlantAndMachineryAmt = DepreciationOfPlantAndMachineryValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7624 is not available",true);
}
try
{
depreciationOfCommercialVehiclesAmt = DepreciationOfCommercialVehiclesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7625 is not available",true);
}
try
{
depreciationOfFixturesAndFittingsAmt = DepreciationOfFixturesAndFittingsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7626 is not available",true);
}
try
{
depreciationOfEquipmentAmt = DepreciationOfEquipmentValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7627 is not available",true);
}
try
{
depreciationOfMotorCarsAmt = DepreciationOfMotorCarsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7628 is not available",true);
}
try
{
depreciationOfAssetsUnderHpOrFinancAmt = DepreciationOfAssetsUnderHpOrFinancValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7630 is not available",true);
}

wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
try
{
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);
}
catch(Exception e)
{
Reporter.log("Bank interest receivable Value is not available in Final Account",true);
}
try
{
badDebtsValue = finalAccountBadDebtAmount.getText().replace(",", "");
Assert.assertEquals(badDebtsValue ,badDebtsAmt);
Reporter.log("Bad Debts Amount of Balance sheet is compared successfully with profit and loss: "+ badDebtsValue,true); 
}
catch(Exception e)
{
Reporter.log("Bad Debts Amount is not available in Final Account",true);
}
try
{
badDebtsRecoveredValue = finalAccountBadDebtsRecoveredAmount.getText().replace(",", "");
Assert.assertEquals(badDebtsRecoveredValue , badDebtsRecoveredAmt);
Reporter.log("Bad Debts Recovered amount of Balance sheetis compared successfully with profit and loss: "+ badDebtsRecoveredValue,true); 
}
catch(Exception e)
{
Reporter.log("Bad Debts Recovered Amount is not available in Final Account",true);
}
try
{
generalProvisionForDoubtfulDebtsValue = finalAccountGeneralProvisionForDoubtfulDebtsAmount.getText().replace(",", "");
Assert.assertEquals(generalProvisionForDoubtfulDebtsValue, generalProvisionForDoubtfulDebtsAmt);
Reporter.log("General Provision for Doubtful debts amount of Balance sheet is compared successfully with profit and loss: "+ generalProvisionForDoubtfulDebtsValue,true); 
}
catch(Exception e)
{
Reporter.log("General Provision for Doubtful Amount is not available in Final Account",true);
}
try
{
bankHirePurchaseMortgageAndOtherValue = finalAccountBankHirePurchaseMortgageAndOtherAmount.getText().replace(",", "");
Assert.assertEquals(bankHirePurchaseMortgageAndOtherValue ,bankHirePurchaseMortgageAndOtherAmt);
Reporter.log("Bank Hire Purchase Mortgage and Other amount of Balance sheet is compared successfully with profit and loss: " + bankHirePurchaseMortgageAndOtherValue,true);
}
catch(Exception e)
{
Reporter.log("Bank Hire Purchase Mortgage and Other Amount is not available in Final Account",true);
}
try
{
bankCardAndOverDraftChargesValue = finalAccountBankCardAndOverDraftChargesAmount.getText().replace(",", "");
Assert.assertEquals(bankCardAndOverDraftChargesValue, bankCardAndOverDraftChargesAmt);
Reporter.log("Bank Card and Over Draft Charges amount of Balance sheet is compared successfully with profit and loss: "+bankCardAndOverDraftChargesValue,true); 
}
catch(Exception e)
{
Reporter.log("Bank Card and Over Draft Charges Amount is not available in Final Account",true);
}
try
{
amortisationOfPurchasedGoodwillValue = finalAccountAmortisationOfPurchasedGoodwillAmount.getText().replace(",", "");
Assert.assertEquals(amortisationOfPurchasedGoodwillValue, amortisationOfPurchasedGoodwillAmt);
Reporter.log("Amortisation of Purchased Goodwill Amount of Balance sheet is  compared successfully with profit and loss: "+ amortisationOfPurchasedGoodwillValue,true);
}
catch(Exception e)
{
Reporter.log("Amortisation of Purchased Goodwill Amount is not available in Final Account",true);
}
try
{
depreciationOfPlantAndMachineryValue = finalAccountDepreciationOfPlantAndMachineryAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfPlantAndMachineryValue, depreciationOfPlantAndMachineryAmt);
Reporter.log("Depreciation of Plant and Machinery amount of Balance sheet is compared successfully with profit and loss: "+depreciationOfPlantAndMachineryValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation of Plant and Machinery Amount is not available in Final Account",true);
}
try
{
depreciationOfCommercialVehiclesValue = finalAccountDepreciationOfCommercialVehiclesAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfCommercialVehiclesValue, depreciationOfCommercialVehiclesAmt);
Reporter.log("Depreciation of Commercial Vehicles amount of Balance sheet is compared successfully with profit and loss: "+ depreciationOfCommercialVehiclesValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation of Commercial Vehicles Amount is not available in Final Account",true);
}
try
{
depreciationOfFixturesAndFittingsValue = finalAccountDepreciationOfFixturesAndFittingsAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfFixturesAndFittingsValue, depreciationOfFixturesAndFittingsAmt);
Reporter.log("Depreciation of Fixtures And Fittings amount of Balance sheet is compared successfully with profit and loss: "+ depreciationOfFixturesAndFittingsValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation of Fixtures And Fittings Amount is not available in Final Account",true);
}
try
{
depreciationOfEquipmentValue = finalAccountDepreciationOfEquipmentAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfEquipmentValue, depreciationOfEquipmentAmt);
Reporter.log("Depreciation of Equipment amount of Balance sheet is compared successfully with profit and loss: "+ depreciationOfEquipmentValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation of Equipment amount is not available in Final Account",true);
}
try
{
depreciationOfMotorCarsValue = finalAccountDepreciationOfMotorCarsValueAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfMotorCarsValue, depreciationOfMotorCarsAmt);
Reporter.log("Depreciation Of Motor Cars amount of Balance sheet is compared successfully with profit and loss: "+ subcontractorOverheadValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation Of Motor Cars Amount is not available in Final Account",true);
}
try
{
depreciationOfAssetsUnderHpOrFinancValue = finalAccountDepreciationOfAssetsUnderHpOrFinancAmount.getText().replace(",", "");
Assert.assertEquals(depreciationOfAssetsUnderHpOrFinancValue, depreciationOfAssetsUnderHpOrFinancAmt);
Reporter.log("Depreciation Of Assets Under Hp Or Financ amount of Balance sheet is compared successfully with profit and loss: "+ subcontractorOverheadValue,true);
}
catch(Exception e)
{
Reporter.log("Depreciation Of Assets Under Hp Or Financ Amount is not available in Final Account",true);
}
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(badDebtsValue);
num4 = Double.parseDouble(badDebtsRecoveredValue);
num5 = Double.parseDouble(generalProvisionForDoubtfulDebtsValue);
num6 = Double.parseDouble(bankHirePurchaseMortgageAndOtherValue);
num7 = Double.parseDouble(bankCardAndOverDraftChargesValue);
num8 = Double.parseDouble(amortisationOfPurchasedGoodwillValue);
num9 = Double.parseDouble(depreciationOfPlantAndMachineryValue);
num10 = Double.parseDouble(depreciationOfCommercialVehiclesValue);
num11 = Double.parseDouble(depreciationOfFixturesAndFittingsValue);
num12 = Double.parseDouble(depreciationOfEquipmentValue);
num13 = Double.parseDouble(depreciationOfMotorCarsValue);
num14 = Double.parseDouble(depreciationOfAssetsUnderHpOrFinancValue);

total1 = num3 + num4 + num5;
total2 = num6;
total3 = num7;
total4 = num8 + num9 + num10 + num11 + num12 + num13 + num14;
total5 = total1 + total2 + total3 + total4;
total6 = num1 + num2 - (total5);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800TEBadDebtsTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.59 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TEIntAltFinancePaymentsTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.60 of Income and expenses for this accounting period is verified successfully: "+total2,true);
Assert.assertEquals(SA800TEOtherFinChargesTxtBox.getAttribute("value"),String.format("%.2f",total3));
Reporter.log(" Value of box 3.61 of Income and expenses for this accounting period is verified successfully: "+total3,true);
Assert.assertEquals(SA800TEDepreciationOnSaleTxtBox.getAttribute("value"),String.format("%.2f",total4));
Reporter.log(" Value of box 3.62 of Income and expenses for this accounting period is verified successfully: "+total4,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total5));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total5,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total6));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total6,true);
}
public void Verify3_63PTRFull(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
addIncomeForPTR(driver, str1, str2, str3, str4, str5);
wLib.explicitWait(driver, 5,linkAccountantPage);
linkAccountantPage.click();
select = new Select(financialYearLstBox);
select.selectByVisibleText("Jan 2018 - Dec 2018");
addValue4100(driver, str5, str6, str7, str8);
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str9);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str10);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str11);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str12);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_3);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_3);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str13);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str14);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str15);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str16);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str17);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str18);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str19);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str20);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_8);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_8);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str21);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str22);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_0);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_0);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str23);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str24);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str25);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str26);
SaveButton.click();

addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_1);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_1);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str27);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str28);
SaveButton.click();
addJournalEntryBtn.click();
driver.switchTo().frame(frameJournalEntry);
accountsDateTxtBox.clear();
accountsDateTxtBox.sendKeys(str5);
descriptionTxtBox.clear();
descriptionTxtBox.sendKeys(str6);
line1AccountTxtBox.click();
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_5);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_5);
robot.keyPress(KeyEvent.VK_2);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_2);
robot.keyPress(KeyEvent.VK_7);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_7);
robot.keyPress(KeyEvent.VK_DOWN);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.setAutoDelay(500);
robot.keyRelease(KeyEvent.VK_ENTER);
wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
line1DebitAmtTxtBox.clear();
line1DebitAmtTxtBox.sendKeys(str29);
line2AccountTxtBox.click();
addCode3200();
wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
line2CreditAmtTxtBox.clear();
line2CreditAmtTxtBox.sendKeys(str30);
SaveButton.click();
oldTab = driver.getWindowHandle();
openIncomeLink(driver);
totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
num1 = Double.parseDouble(totalIncomeAmt);
wLib.explicitWait(driver, 5,bp1.linkReport);
bp1.linkReport.click();
wLib.explicitWait(driver, 5,linkProfitandLossReport);
linkProfitandLossReport.click();
showDetailChkBox.click();
saleAmt = saleValue.getText().replace(",", "").replace("£", "").replace(".00","");
BankInterestReceivableAmt = BankInterestReceivableAmount.getText().replace(",", "").replace("£", "").replace(".00","").replace("(","").replace(")","");
try
{
writeOffAmt = WriteOffValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch (Exception e) 
{
Reporter.log("Ledger code 7001 is not available",true);
}
try
{
exchangeDifferenceAmt = ExchangeDifferenceValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7033 is not available",true);
}
try
{
researchAndDevelopmentCostsAmt = ResearchAndDevelopmentCostsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7035 is not available",true);
}
try
{
recruitmentTrainingAndDevelopmentAmt = RecruitmentTrainingAndDevelopmentValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7270 is not available",true);
}
try
{
trainingAndDevelopmentAmt = TrainingAndDevelopmentValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7271 is not available",true);
}
try
{
equipmentMaintenanceRentalAndLeasinAmt = EquipmentMaintenanceRentalAndLeasinValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7280 is not available",true);
}
try
{
equipmentExpensedAmt = EquipmentExpensedValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7281 is not available",true);
}
try
{
membershipAndSubscriptionsAmt = MembershipAndSubscriptionsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7510 is not available",true);
}
try
{
charitableDonationsAmt = CharitableDonationsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7511 is not available",true);
}
try
{
politicalContributionsAmt = PoliticalContributionsValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7512 is not available",true);
}
try
{
hMRCPenaltiesAmt = HMRCPenaltiesValue.getText().replace(",", "").replace("£", "").replace(".00","");
}
catch(Exception e)
{
Reporter.log("Ledger code 7527 is not available",true);
}
	
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with profit and loss: "+salesValue,true);
try
{
bankInterestReceivableValue =finalAccountBankInterestReceivableAmount.getText().replace(",", "");
Assert.assertEquals(bankInterestReceivableValue ,BankInterestReceivableAmt);
Reporter.log("Bank interest receivable Value of Balance sheet is compared successfully with profit and loss: "+ bankInterestReceivableValue,true);
}
catch(Exception e)
{
Reporter.log("Bank interest receivable Value is not available in Final Account",true);
}
try
{
writeOffValue = finalAccountWriteOffAmount.getText().replace(",", "");
Assert.assertEquals(writeOffValue ,writeOffAmt);
Reporter.log("Write Off Amount of Balance sheet is compared successfully with profit and loss: "+ writeOffValue,true); 
}
catch(Exception e)
{
Reporter.log("Write Off Amount is not available in Final Account",true);
}
try
{
exchangeDifferenceValue = finalAccountExchangeDifferenceAmount.getText().replace(",", "");
Assert.assertEquals(exchangeDifferenceValue , exchangeDifferenceAmt);
Reporter.log("Exchange Difference amount of Balance sheetis compared successfully with profit and loss: "+ exchangeDifferenceValue,true); 
}
catch(Exception e)
{
Reporter.log("Exchange Difference Amount is not available in Final Account",true);
}
try
{
researchAndDevelopmentCostsValue = finalAccountResearchAndDevelopmentCostsAmount.getText().replace(",", "");
Assert.assertEquals(researchAndDevelopmentCostsValue, researchAndDevelopmentCostsAmt);
Reporter.log("Research and Development Costs amount of Balance sheet is compared successfully with profit and loss: "+ researchAndDevelopmentCostsValue,true); 
}
catch(Exception e)
{
Reporter.log("Research and Development Costs Amount is not available in Final Account",true);
}
try
{
recruitmentTrainingAndDevelopmentValue = finalAccountRecruitmentTrainingAndDevelopmentAmount.getText().replace(",", "");
Assert.assertEquals(recruitmentTrainingAndDevelopmentValue, recruitmentTrainingAndDevelopmentAmt);
Reporter.log("Recruitment, Training and Development amount of Balance sheet is compared successfully with profit and loss: " + recruitmentTrainingAndDevelopmentValue,true);
}
catch(Exception e)
{
Reporter.log("Recruitment, Training and Development Amount is not available in Final Account",true);
}
try
{
trainingAndDevelopmentValue = finalAccountTrainingAndDevelopmentAmount.getText().replace(",", "");
Assert.assertEquals(trainingAndDevelopmentValue, trainingAndDevelopmentAmt);
Reporter.log("Training and Development amount of Balance sheet is compared successfully with profit and loss: "+trainingAndDevelopmentValue,true); 
}
catch(Exception e)
{
Reporter.log("Training and Development Amount is not available in Final Account",true);
}
try
{
equipmentMaintenanceRentalAndLeasinValue = finalAccountEquipmentMaintenanceRentalAndLeasinAmount.getText().replace(",", "");
Assert.assertEquals(equipmentMaintenanceRentalAndLeasinValue, equipmentMaintenanceRentalAndLeasinAmt);
Reporter.log("Equipment Maintenance Rental and Leasin Amount of Balance sheet is  compared successfully with profit and loss: "+ equipmentMaintenanceRentalAndLeasinValue,true);
}
catch(Exception e)
{
Reporter.log("Equipment Maintenance Rental and Leasin Amount is not available in Final Account",true);
}
try
{
equipmentExpensedValue = finalAccountEquipmentExpensedAmount.getText().replace(",", "");
Assert.assertEquals(equipmentExpensedValue, equipmentExpensedAmt);
Reporter.log("Equipment Expensed amount of Balance sheet is compared successfully with profit and loss: "+equipmentExpensedValue,true);
}
catch(Exception e)
{
Reporter.log("Equipment Expensed Amount is not available in Final Account",true);
}
try
{
membershipAndSubscriptionsValue = finalAccountMembershipAndSubscriptionsAmount.getText().replace(",", "");
Assert.assertEquals(membershipAndSubscriptionsValue, membershipAndSubscriptionsAmt);
Reporter.log("Membership and Subscriptions amount of Balance sheet is compared successfully with profit and loss: "+ membershipAndSubscriptionsValue,true);
}
catch(Exception e)
{
Reporter.log("Membership and Subscriptions Amount is not available in Final Account",true);
}
try
{
charitableDonationsValue = finalAccountCharitableDonationsAmount.getText().replace(",", "");
Assert.assertEquals(charitableDonationsValue, charitableDonationsAmt);
Reporter.log("Charitable Donations amount of Balance sheet is compared successfully with profit and loss: "+ charitableDonationsValue,true);
}
catch(Exception e)
{
Reporter.log("Charitable Donations Amount is not available in Final Account",true);
}
try
{
politicalContributionsValue = finalAccountPoliticalContributionsAmount.getText().replace(",", "");
Assert.assertEquals(politicalContributionsValue, politicalContributionsAmt);
Reporter.log("Political Contributions amount of Balance sheet is compared successfully with profit and loss: "+ politicalContributionsValue,true);
}
catch(Exception e)
{
Reporter.log("Political Contributions amount is not available in Final Account",true);
}
try
{
hMRCPenaltiesValue = finalAccountHMRCPenaltiesAmount.getText().replace(",", "");
Assert.assertEquals(hMRCPenaltiesValue, hMRCPenaltiesAmt);
Reporter.log("HMRC Penalties amount of Balance sheet is compared successfully with profit and loss: "+ hMRCPenaltiesValue,true);
}
catch(Exception e)
{
Reporter.log("HMRC Penalties Amount is not available in Final Account",true);
}

driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);

num2 = Double.parseDouble(bankInterestReceivableValue);
num3 = Double.parseDouble(writeOffValue);
num4 = Double.parseDouble(exchangeDifferenceValue);
num5 = Double.parseDouble(researchAndDevelopmentCostsValue);
num6 = Double.parseDouble(recruitmentTrainingAndDevelopmentValue);
num7 = Double.parseDouble(trainingAndDevelopmentValue);
num8 = Double.parseDouble(equipmentMaintenanceRentalAndLeasinValue);
num9 = Double.parseDouble(equipmentExpensedValue);
num10 = Double.parseDouble(membershipAndSubscriptionsValue);
num11 = Double.parseDouble(charitableDonationsValue);
num12 = Double.parseDouble(politicalContributionsValue);
num13 = Double.parseDouble(hMRCPenaltiesValue);

total1 = num3 + num4 + num5 + num6 + num7 +num8 + num9 + num10 + num11 + num12 + num13;
total2 = num1 + num2 - (total1);
Assert.assertEquals(SA800GrossProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log(" Value of box 3.49 of Income and expenses for this accounting period is verified successfully: "+num1,true);
Assert.assertEquals(SA800OtherIncomeProfitsTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log(" Value of box 3.50 of Income and expenses for this accounting period is verified successfully: "+num2,true);
Assert.assertEquals(SA800TEOtherExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.63 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800TotalExpensesTxtBox.getAttribute("value"),String.format("%.2f",total1));
Reporter.log(" Value of box 3.64 of Income and expenses for this accounting period is verified successfully: "+total1,true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",total2));
Reporter.log(" Value of box 3.65 without expenses of Income and expenses for this accounting period is verified successfully: "+total2,true);
}
public void funcSA800TaxableProfit_Loss(WebDriver driver,String str1,String str2,String str3) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5, adjChangeBasisTxtBox);
adjChangeBasisTxtBox.clear();
adjChangeBasisTxtBox.sendKeys(str1);
wLib.explicitWait(driver, 5, contractorsDeductionsTxtBox);
contractorsDeductionsTxtBox.clear();
contractorsDeductionsTxtBox.sendKeys(str2);
contractorsDeductionsTxtBox.sendKeys(Keys.TAB);
takenOffTradeIncomeTxtBox.clear();
takenOffTradeIncomeTxtBox.sendKeys(str3);
takenOffTradeIncomeTxtBox.sendKeys(Keys.TAB);
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
linkPartnershipStatementShort.click();
wLib.explicitWait(driver, 5, adjChangeBasisTxtBox);
cISdeductionsValue = cISDeductionsTxtBox.getAttribute("value");
otherTaxOnTradingIncomeValue = otherTaxOnTradingIncomeTxtBox.getAttribute("value");
wLib.explicitWait(driver, 5,sa1.taxReturnLink);
sa1.taxReturnLink.click();
wLib.explicitWait(driver, 5,partnershipSummaryLink);
partnershipSummaryLink.click();
num1 = Double.parseDouble(str1);//471407.00
num2 = Double.parseDouble(str2);//450.00
num3 = Double.parseDouble(str3);//4227.00

changeOfBasisInput = num1;
deductionsOnPaymentInput = num2;
TaxTakenOffTradingIncomeInput = num3;

Assert.assertEquals(changeOfBasisAmt.getText().substring(2).replace(",", ""),String.format("%.2f",changeOfBasisInput));
Reporter.log("Change of basis value of Partnership Summary verified successfully: "+changeOfBasisAmt.getText(),true);
Assert.assertEquals(SubcontractorsDeductionsAmt.getText().substring(2).replace(",", ""),String.format("%.2f",deductionsOnPaymentInput));
Reporter.log("Subcontractors deductions on account of tax of Partnership Summary verified successfully: "+SubcontractorsDeductionsAmt.getText(),true);
Assert.assertEquals(TaxDeductedFromTradingIncomeAmt.getText().substring(2).replace(",", ""),String.format("%.2f",TaxTakenOffTradingIncomeInput));
Reporter.log("Tax deducted from trading income of Partnership Summary verified successfully: "+TaxDeductedFromTradingIncomeAmt.getText(),true);
Assert.assertEquals(CIS25DeductionsAmt.getText().substring(2).replace(",", ""),cISdeductionsValue);
Reporter.log("CIS25 deductions of Partnership Summary verified successfully: "+CIS25DeductionsAmt.getText(),true);
Assert.assertEquals(OtherTaxDeductedAmt.getText().substring(2).replace(",", ""), otherTaxOnTradingIncomeValue);
Reporter.log("Other tax deducted of Partnership Summary verified successfully: "+OtherTaxDeductedAmt.getText(),true);
}
public void funcSA800SummaryOfBalanceSheet(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);

plantMachineryTxtBox.clear();
plantMachineryTxtBox.sendKeys(str1);
SA800OtherFixedAssetsTxtBox.clear();
SA800OtherFixedAssetsTxtBox.sendKeys(str2);
SA800StockWorkInProgressTxtBox.clear();
SA800StockWorkInProgressTxtBox.sendKeys(str3);
SA800DebtorsTxtBox.clear();
SA800DebtorsTxtBox.sendKeys(str4);
SA800BankSocietyBalancesTxtBox.clear();
SA800BankSocietyBalancesTxtBox.sendKeys(str5);
SA800CashInHandTxtBox.clear();
SA800CashInHandTxtBox.sendKeys(str6);
//fetched total of above
num1 = Double.parseDouble(str1);
num2 = Double.parseDouble(str2);
num3 = Double.parseDouble(str3);
num4 = Double.parseDouble(str4);
num5 = Double.parseDouble(str5);
num6 = Double.parseDouble(str6);
totalAssets = num1 + num2 + num3 + num4 + num5 + num6;
Assert.assertEquals(SA800TotalAssetsTxtBox.getAttribute("value"),String.format("%.2f",totalAssets));
Reporter.log(" Value of Total assets is verified successfully: "+SA800TotalAssetsTxtBox.getAttribute("value"),true);

SA800TradeCreditorsTxtBox.clear();
SA800TradeCreditorsTxtBox.sendKeys(str7);
SA800LoansTxtBox.clear();
SA800LoansTxtBox.sendKeys(str8);
SA800OtherLiabilitiesTxtBox.clear();
SA800OtherLiabilitiesTxtBox.sendKeys(str9);
//fetched total of above
num7 = Double.parseDouble(str7);
num8 = Double.parseDouble(str8);
num9 = Double.parseDouble(str9);
totalLiabilities = num7 + num8 + num9;
Assert.assertEquals(SA800TotalLiabilitiesTxtBox.getAttribute("value"),String.format("%.2f",totalLiabilities));
Reporter.log(" Value of Total liabilities is verified successfully: "+SA800TotalLiabilitiesTxtBox.getAttribute("value"),true);
//SA800TotalAssetsTxtBox - SA800TotalLiabilitiesTxtBox
netBusinessBalanceSheet = totalAssets - totalLiabilities;
Assert.assertEquals(SA800NetBusinessAssetsTxtBox.getAttribute("value"),String.format("%.2f",netBusinessBalanceSheet));
Reporter.log(" Value of Net Business Assets is verified successfully: "+SA800NetBusinessAssetsTxtBox.getAttribute("value"),true);

SA800BalanceAtStartTxtBox.clear();
SA800BalanceAtStartTxtBox.sendKeys(str10);
SA800NetProfitLossTxtBox.clear();
SA800NetProfitLossTxtBox.sendKeys(str11);
SA800CapitalIntroducedTxtBox.clear();
SA800CapitalIntroducedTxtBox.sendKeys(str12);
SA800DrawingsTxtBox.clear();
SA800DrawingsTxtBox.sendKeys(str13);
//fetched total of above
num10 = Double.parseDouble(str10);
num11 = Double.parseDouble(str11);
num12 = Double.parseDouble(str12);
num13 = Double.parseDouble(str13);
balanceAtEndOfPeriod = (num10 + num11 + num12) - num13;
Assert.assertEquals(SA800BalanceAtTheEndTxtBox.getAttribute("value"),String.format("%.2f",balanceAtEndOfPeriod));
Reporter.log(" Value of Balance at end of period is verified successfully: "+SA800BalanceAtTheEndTxtBox.getAttribute("value"),true);

SA800NetPtrshipChargesTxtBox.clear();
SA800NetPtrshipChargesTxtBox.sendKeys(str14);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -5000)", "");
saveBtnPTR.click();
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
linkPartnershipStatementShort.click();
Assert.assertEquals(partnershipChargesTxtBox.getAttribute("value").replace(",", "").replace(".00", ""),str14);
Reporter.log(" Value of Partnership charges on Partnership short form is verified successfully: "+partnershipChargesTxtBox.getAttribute("value"),true);
wLib.explicitWait(driver, 5,sa1.taxReturnLink);
sa1.taxReturnLink.click();
wLib.explicitWait(driver, 5,partnershipSummaryLink);
partnershipSummaryLink.click();
Assert.assertEquals(plantMachineryAndMotorVehiclesAmt.getText().substring(2).replace(",", "").replace(".00", ""),str1);
Reporter.log("Plant machinery and motor vehicles value of Partnership Summary verified successfully: "+plantMachineryAndMotorVehiclesAmt.getText(),true);
Assert.assertEquals(otherFixedAssetsAmt.getText().substring(2).replace(",", "").replace(".00", ""),str2);
Reporter.log("Other fixed assets value of Partnership Summary verified successfully: "+otherFixedAssetsAmt.getText(),true);
Assert.assertEquals(stockAndWorkInProgressAmt.getText().substring(2).replace(",", "").replace(".00", ""),str3);
Reporter.log("Stock and work in progress value of Partnership Summary verified successfully: "+stockAndWorkInProgressAmt.getText(),true);
Assert.assertEquals(DebtorsPrepaymentsAmt.getText().substring(2).replace(",", "").replace(".00", ""),str4);
Reporter.log("Debtors prepayments etc value of Partnership Summary verified successfully: "+DebtorsPrepaymentsAmt.getText(),true);
Assert.assertEquals(CashInHandAmt.getText().substring(2).replace(",", "").replace(".00", ""),str5);
Reporter.log("Cash in hand value of Partnership Summary verified successfully: "+CashInHandAmt.getText(),true);
Assert.assertEquals(bankEtcBalancesAmt.getText().substring(2).replace(",", "").replace(".00", ""),str6);
Reporter.log("Bank etc balances value of Partnership Summary verified successfully: "+bankEtcBalancesAmt.getText(),true);
Assert.assertEquals(TotalAssetsAmt.getText().substring(2).replace(",", "").replace(".00", ""),String.format("%.2f",totalAssets));
Reporter.log("Total assets value of Partnership Summary verified successfully: "+TotalAssetsAmt.getText(),true);
Assert.assertEquals(tradeCreditorsAndAccrualsAmt.getText().substring(2).replace(",", "").replace(".00", ""),str7);
Reporter.log("Trade creditors and accruals value of Partnership Summary verified successfully: "+tradeCreditorsAndAccrualsAmt.getText(),true);
Assert.assertEquals(loansAndOverdrawnBankAccountsAmt.getText().substring(2).replace(",", "").replace(".00", ""),str8);
Reporter.log("Loans and overdrawn bank accounts value of Partnership Summary verified successfully: "+loansAndOverdrawnBankAccountsAmt.getText(),true);
Assert.assertEquals(otherLiabilitiesAmt.getText().substring(2).replace(",", "").replace(".00", ""),str9);
Reporter.log("Other liabilities value of Partnership Summary verified successfully: "+otherLiabilitiesAmt.getText(),true);
Assert.assertEquals(totalLiabilitiesAmt.getText().substring(2).replace(",", "").replace(".00", ""),String.format("%.2f",totalLiabilities));
Reporter.log("Total liabilities value of Partnership Summary verified successfully: "+totalLiabilitiesAmt.getText(),true);
Assert.assertEquals(netBusinessAssetsAmt.getText().substring(2).replace(",", "").replace(".00", ""),String.format("%.2f",netBusinessBalanceSheet));
Reporter.log("Net business assets value of Partnership Summary verified successfully: "+netBusinessAssetsAmt.getText(),true);
Assert.assertEquals(balanceAtStartOfPeriodAmt.getText().substring(2).replace(",", "").replace(".00", ""),str10);
Reporter.log("Balance at start of period value of Partnership Summary verified successfully: "+balanceAtStartOfPeriodAmt.getText(),true);
Assert.assertEquals(netProfitLossAmt.getText().substring(2).replace(",", "").replace(".00", ""),str11);
Reporter.log("Net profit loss value of Partnership Summary verified successfully: "+netProfitLossAmt.getText(),true);
Assert.assertEquals(capitalIntroducedAmt.getText().substring(2).replace(",", "").replace(".00", ""),str12);
Reporter.log("Capital introduced value of Partnership Summary verified successfully: "+capitalIntroducedAmt.getText(),true);
Assert.assertEquals(DrawingsAmt.getText().substring(2).replace(",", "").replace(".00", ""),str13);
Reporter.log("Drawings value of Partnership Summary verified successfully: "+DrawingsAmt.getText(),true);
Assert.assertEquals(balanceAtEndOfPeriodAmt.getText().substring(2).replace(",", "").replace(".00", ""),String.format("%.2f",balanceAtEndOfPeriod));
Reporter.log("Balance at end of period value of Partnership Summary verified successfully: "+balanceAtEndOfPeriodAmt.getText(),true);
Assert.assertEquals(netPartnershipChargesAmt.getText().substring(2).replace(",", "").replace(".00", ""),str14);
Reporter.log("Net partnership charges value of Partnership Summary verified successfully: "+netPartnershipChargesAmt.getText(),true);
Assert.assertEquals(partnershipChargesAmt.getText().substring(2).replace(",", "").replace(".00", ""),partnershipChargesTxtBox.getAttribute("value"));
Reporter.log("Partnership charges value of Partnership Summary verified successfully: "+partnershipChargesAmt.getText(),true);
}
public void addDataForAutoSummaryOfBalanceSheet(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13) throws Exception
{
	wLib.explicitWait(driver, 5,linkAccountantPage);
	linkAccountantPage.click();
	select = new Select(financialYearLstBox);
	select.selectByVisibleText("Jan 2018 - Dec 2018");
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_7);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_7);
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str3);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str3);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str4);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str4);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str5);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str5);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_4);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_4);
	robot.keyPress(KeyEvent.VK_5);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_5);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str6);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str6);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_4);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_4);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str7);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str7);
	SaveButton.click();

	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_1);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_4);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_4);
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str8);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str8);
	SaveButton.click();

	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_6);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_6);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
	line1CreditAmtTxtBox.clear();
	line1CreditAmtTxtBox.sendKeys(str9);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
	line2DebitAmtTxtBox.clear();
	line2DebitAmtTxtBox.sendKeys(str9);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
	line1CreditAmtTxtBox.clear();
	line1CreditAmtTxtBox.sendKeys(str10);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
	line2DebitAmtTxtBox.clear();
	line2DebitAmtTxtBox.sendKeys(str10);
	SaveButton.click();

	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_6);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_6);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
	line1CreditAmtTxtBox.clear();
	line1CreditAmtTxtBox.sendKeys(str11);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
	line2DebitAmtTxtBox.clear();
	line2DebitAmtTxtBox.sendKeys(str11);
	SaveButton.click();

	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1CreditAmtTxtBox);
	line1CreditAmtTxtBox.clear();
	line1CreditAmtTxtBox.sendKeys(str12);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2DebitAmtTxtBox);
	line2DebitAmtTxtBox.clear();
	line2DebitAmtTxtBox.sendKeys(str12);
	SaveButton.click();
	addJournalEntryBtn.click();
	driver.switchTo().frame(frameJournalEntry);
	accountsDateTxtBox.clear();
	accountsDateTxtBox.sendKeys(str1);
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(str2);
	line1AccountTxtBox.click();
	robot.keyPress(KeyEvent.VK_3);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_2);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.keyPress(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_0);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.setAutoDelay(500);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.setAutoDelay(500);
	robot.keyRelease(KeyEvent.VK_ENTER);
	wLib.explicitWait(driver, 5,line1DebitAmtTxtBox);
	line1DebitAmtTxtBox.clear();
	line1DebitAmtTxtBox.sendKeys(str13);
	line2AccountTxtBox.click();
	addCode3200();
	wLib.explicitWait(driver, 5,line2CreditAmtTxtBox);
	line2CreditAmtTxtBox.clear();
	line2CreditAmtTxtBox.sendKeys(str13);
	SaveButton.click();
}
public void fetchLedgerCodeValueFromReport(WebDriver driver) throws Exception
{
	openIncomeLink(driver);
	totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
	num1 = Double.parseDouble(totalIncomeAmt);
	wLib.explicitWait(driver, 5,bp1.linkReport);
	bp1.linkReport.click();
	wLib.explicitWait(driver, 5,linkTrialBalanceReport);
	linkTrialBalanceReport.click();
	//showDetailChkBox.click();
	try
	{
	saleAmt = SalesAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 4000: "+saleAmt,true);
	}
	catch (Exception e) 
	{
	Reporter.log("Ledger code 4000 is not available",true);
	}
	try
	{
	equipmentAdditionsAmt = EquipmentAdditionsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 271: "+equipmentAdditionsAmt,true);
	}
	catch (Exception e) 
	{
	Reporter.log("Ledger code 271 is not available",true);
	}
	try
	{
	purchasedGoodWillAdditionsAmt = PurchasedGoodWillAdditionsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 31: "+purchasedGoodWillAdditionsAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 31 is not available",true);
	}
	try
	{
	longTermDebtorAmt = LongTermDebtorAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 1450: "+longTermDebtorAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1450 is not available",true);
	}
	try
	{
	totalSalesAmt = TotalSalesAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 1070: "+totalSalesAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1070 is not available",true);
	}
	try
	{
	assetAmt = AssetAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 1000: "+assetAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1000 is not available",true);
	}
	try
	{
	debatorCashAmt = DebatorCashAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 1420: "+debatorCashAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1420 is not available",true);
	}
	try
	{
	taxationOutputVATAmt = TaxationOutputVATAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 1102: "+taxationOutputVATAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1102 is not available",true);
	}
	try
	{
	profitLossAmt = ProfitLossAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 3103: "+profitLossAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 3103 is not available",true);
	}
	try
	{
	balanceBroughtForwardAmt = BalanceBroughtForwardAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Capital Account - Balance Brought Forward: "+balanceBroughtForwardAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code for Capital Account - Balance Brought Forward is not available",true);
	}
	try
	{
	drawingsAmt = DrawingsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Capital Account - Drawings: "+drawingsAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code of Capital Account - Drawings is not available",true);
	}
	try
	{
	genericPurchaseSupplierAmt = GenericPurchaseSupplierAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 2060: "+genericPurchaseSupplierAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 2060 is not available",true);
	}
	try
	{
	liabilityAmt = LiabilityAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 2000: "+liabilityAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 2000 is not available",true);
	}
	try
	{
	accrualsAmt = AccrualsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Ledger code 2336: "+accrualsAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 2336 is not available",true);
	}
	try
	{
	capitalAccountIntroductionsAmt = CapitalAccountIntroductionsAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	Reporter.log("Capital Account - Introductions: "+capitalAccountIntroductionsAmt,true);
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code of Capital Account - Introductions is not available",true);
	}
	wLib.explicitWait(driver, 5,bp1.linkReport);
	bp1.linkReport.click();
	wLib.explicitWait(driver, 5,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib.explicitWait(driver, 5,showDetailChkBox);
	showDetailChkBox.click();
	try
	{
	bankAmt = BankAmount.getText().replace(",", "").replace("£", "").replace(".00","");
	}
	catch(Exception e)
	{
	Reporter.log("Ledger code 1400 is not available",true);
	}
}
public void dataVerifyFinalAccountPage(WebDriver driver) throws Exception
{
try
{
salesValue = finalAccountSalesAmount.getText().replace(",", "");
Assert.assertEquals(salesValue ,saleAmt);
Reporter.log("Sales amount for turnover compared successfully with Trial Balance Report: "+salesValue,true);
}
catch(Exception e)
{
Reporter.log("Sales amount for turnover Value is not available in Final Account",true);
}

try
{
intangibleAssetsValue = finalAccountIntangibleAssetsAmount.getText().replace(",", "");
Assert.assertEquals(intangibleAssetsValue ,purchasedGoodWillAdditionsAmt);
Reporter.log("Intangible assets Amount of Final Account is compared successfully with Trial Balance Report: "+ intangibleAssetsValue,true); 
}
catch(Exception e)
{
Reporter.log("Intangible assets Amount is not available in Final Account",true);
}
try
{
propertyPlantEquipmentValue = finalAccountPropertyPlantEquipmentAmount.getText().replace(",", "");
Assert.assertEquals(propertyPlantEquipmentValue , equipmentAdditionsAmt);
Reporter.log("Property, plant and equipment amount of Final Account is compared successfully with Trial Balance Report: "+ propertyPlantEquipmentValue,true); 
}
catch(Exception e)
{
Reporter.log("Property, plant and equipment Amount is not available in Final Account",true);
}
try
{
stocksValue = finalAccountStocksAmount.getText().replace(",", "");
Assert.assertEquals(stocksValue, assetAmt);
Reporter.log("Stocks amount of Final Account is compared successfully with Trial Balance Report: "+ stocksValue,true); 
}
catch(Exception e)
{
Reporter.log("Stocks Costs Amount is not available in Final Account",true);
}
try
{
debtorsValue = finalAccountDebtorsAmount.getText().replace(",", "");
Assert.assertEquals(debtorsValue, totalSalesAmt);
Reporter.log("Debtors amount of Final Account is compared successfully with Trial Balance Report: " + debtorsValue,true);
}
catch(Exception e)
{
Reporter.log("Debtors Amount is not available in Final Account",true);
}
try
{
tradeDebtorsFallingDueValue = finalAccountTradeDebtorsFallingDueAmount.getText().replace(",", "");
Assert.assertEquals(tradeDebtorsFallingDueValue, longTermDebtorAmt);
Reporter.log("Debtors: Amounts falling due of Final Account is compared successfully with Trial Balance Report: "+tradeDebtorsFallingDueValue,true); 
}
catch(Exception e)
{
Reporter.log("Debtors: Amounts falling due Amount is not available in Final Account",true);
}
try
{
creditorsAmountsValue = finalAccountCreditorsAmountsAmount.getText().replace(",", "").replace("(", "").replace(")", "");
Assert.assertEquals(creditorsAmountsValue, accrualsAmt);
Reporter.log("Creditors: Amounts falling due after more than one year amount of final Account is compared successfully with Trial Balance Report: "+ creditorsAmountsValue,true);
}
catch(Exception e)
{
Reporter.log("Creditors: Amounts falling due after more than one year amount is not available in Final Account",true);
}
try
{
otherReservesValue = finalAccountOtherReservesAmount.getText().replace(",", "");
Assert.assertEquals(otherReservesValue, saleAmt);
Reporter.log("Other reserves amount of final Account is compared successfully with Trial Balance Report: "+ otherReservesValue,true);
}
catch(Exception e)
{
Reporter.log("Other reserves Amount is not available in Final Account",true);
}
}
public void funcSA800SummaryOfBalanceSheetAuto(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
//addIncomeForPTR(driver, str1, str2, str3, str4, str5);
//addDataForAutoSummaryOfBalanceSheet(driver, str5, str6, str7, str8, str9, str10, str11, str12,  str13,  str14,  str15,  str16,  str17); 
oldTab = driver.getWindowHandle();
fetchLedgerCodeValueFromReport(driver);
try {
num1 = Double.parseDouble(saleAmt);
Reporter.log("Sale Amount: "+num1,true);
}
catch (Exception e) {
	Reporter.log("Sale Amount not available",true);
}
try {
num2 = Double.parseDouble(equipmentAdditionsAmt);
Reporter.log("Equipment Additions Amount: "+num2,true);
}
catch (Exception e) {
	Reporter.log("Equipment Additions Amount not available",true);
}
try {
num3 = Double.parseDouble(purchasedGoodWillAdditionsAmt);
Reporter.log("Purchased Good Will Additions Amount: "+num3,true);
}
catch (Exception e) {
	Reporter.log("Purchased Good Will Additions Amount not available",true);
}
try {
num4 = Double.parseDouble(longTermDebtorAmt);
Reporter.log("Long Term Debtor Amount: "+num4,true);
}
catch (Exception e) {
	Reporter.log("Long Term Debtor Amount not available",true);
}
try {
num5 = Double.parseDouble(totalSalesAmt);
Reporter.log("Total Sales Amount: "+num5,true);
}
catch (Exception e) {
	Reporter.log("Total Sales Amount not available",true);
}
try {
num6 = Double.parseDouble(assetAmt);
Reporter.log("Asset Amount: "+num6,true);
}
catch (Exception e) {
	Reporter.log("Asset Amount not available",true);
}
try {
num7 = Double.parseDouble(debatorCashAmt);
Reporter.log("Debator Cash Amount: "+num7,true);
}
catch (Exception e) {
	Reporter.log("Debator Cash Amount not available",true);
}
try {
num8 = Double.parseDouble(taxationOutputVATAmt);
Reporter.log("Taxation Output VAT Amount: "+num8,true);
}
catch (Exception e) {
	Reporter.log("Taxation Output VAT Amount not available",true);
}
try {
num9 = Double.parseDouble(profitLossAmt);
Reporter.log("Profit Loss Amount: "+num9,true);
}
catch (Exception e) {
	Reporter.log("Profit Loss Amount not available",true);
}
try {
num10 = Double.parseDouble(balanceBroughtForwardAmt);
Reporter.log("Balance Brought Forward Amount: "+num10,true);
}
catch (Exception e) {
	Reporter.log("Balance Brought Forward Amount not available",true);
}
try {
num11 = Double.parseDouble(drawingsAmt);
Reporter.log("Drawings Amount: "+num11,true);
}
catch (Exception e) {
	Reporter.log("Drawings Amount not available",true);
}
try {
num12 = Double.parseDouble(genericPurchaseSupplierAmt);
Reporter.log("Generic Purchase Supplier Amount: "+num12,true);
}
catch (Exception e) {
	Reporter.log("Generic Purchase Supplier Amount not available",true);
}
try {
num13 = Double.parseDouble(liabilityAmt);
Reporter.log("Liability Amount: "+num13,true);
}
catch (Exception e) {
	Reporter.log("Liability Amount not available",true);
}
try {
num14 = Double.parseDouble(accrualsAmt);
Reporter.log("Accruals Amount: "+num14,true);
}
catch (Exception e) {
	Reporter.log("Accruals Amount not available",true);
}
try {
num15 = Double.parseDouble(capitalAccountIntroductionsAmt);
Reporter.log("Capital Account Introductions Amount: "+num15,true);
}
catch (Exception e) {
	Reporter.log("Capital Account Introductions Amount",true);
}
try {
num16 = Double.parseDouble(bankAmt);
Reporter.log("Bank Amount: "+num16,true);
}
catch (Exception e) {
	Reporter.log("Bank Amount not available",true);
}
total1= num7 + num16;
Reporter.log("Total1: "+total1,true);
total2 = num8 + num12 + num13;
Reporter.log("Total2: "+total2,true);
total3 = num6 + num5 + num4 + total1;
Reporter.log("Total3: "+total3,true);
total4 = total3 - total2;
Reporter.log("Total4: "+total4,true);
total5 = total4 + num2 + num3;
Reporter.log("Total5: "+total5,true);
total6 = total5 - num14;
Reporter.log("Total6: "+total6,true);
total7 = total6 - num1;
Reporter.log("Total7: "+total7,true);
total8 = num4 + num5;
Reporter.log("Total8: "+total8,true);
total9 = num8 + num14;
Reporter.log("Total9: "+total9,true);
wLib.explicitWait(driver, 5,linkFinalAccounts);
linkFinalAccounts.click();
cp.switchwindowForward(driver);
wLib.explicitWait(driver, 5,finalAccountSalesAmount);
dataVerifyFinalAccountPage(driver);
try
{
cashAndCashEquivalentsValue = finalAccountCashAndCashEquivalentsAmount.getText().replace(",", "");
Assert.assertEquals(cashAndCashEquivalentsValue, String.format("%.0f",total1));
Reporter.log("Cash and cash equivalents Amount of Final Account is compared successfully with Trial Balance Report: "+ cashAndCashEquivalentsValue,true);
}
catch(Exception e)
{
Reporter.log("Cash and cash equivalents Amount is not available in Final Account",true);
}
try
{
fallingValue = finalAccountFallingAmount.getText().replace(",", "").replace("(", "").replace(")", "");
Assert.assertEquals(fallingValue, String.format("%.0f",total2));
Reporter.log("Creditors: Amounts falling due within one year amount of Final Account is compared successfully with Trial Balance Report: "+fallingValue,true);
}
catch(Exception e)
{
Reporter.log("Creditors: Amounts falling due within one year Amount is not available in Final Account",true);
}
try
{
netCurrentAssetsValue = finalAccountNetCurrentAssetsAmount.getText().replace(",", "");
Assert.assertEquals(netCurrentAssetsValue, String.format("%.0f",total4));
Reporter.log("Net current assets amount of final Account is compared successfully with Trial Balance Report: "+ netCurrentAssetsValue,true);
}
catch(Exception e)
{
Reporter.log("Net current assets Amount is not available in Final Account",true);
}
try
{
totalAssetsLessCurrentLiabilitiesValue = finalAccountTotalAssetsLessCurrentLiabilitiesAmount.getText().replace(",", "");
Assert.assertEquals(totalAssetsLessCurrentLiabilitiesValue, String.format("%.0f",total5));
Reporter.log("Total assets less current liabilities amount of final Account is compared successfully with Trial Balance Report: "+ totalAssetsLessCurrentLiabilitiesValue,true);
}
catch(Exception e)
{
Reporter.log("Total assets less current liabilities Amount is not available in Final Account",true);
}

try
{
netAssetsValue = finalAccountNetAssetsAmount.getText().replace(",", "");
Assert.assertEquals(netAssetsValue, String.format("%.0f",total6));
Reporter.log("Net assets/(liabilities) amount of final Account is compared successfully with Trial Balance Report: "+ netAssetsValue,true);
}
catch(Exception e)
{
Reporter.log("Net assets/(liabilities) Amount is not available in Final Account",true);
}
try
{
membersCapitalValue = finalAccountMembersCapitalAmount.getText().replace(",", "");
Assert.assertEquals(membersCapitalValue, String.format("%.0f",total7));
Reporter.log("Members capital amount of final Account is compared successfully with Trial Balance Report: "+ membersCapitalValue,true);
}
catch(Exception e)
{
Reporter.log("Members capital Amount is not available in Final Account",true);
}

try
{
otherReservesValue = finalAccountMemberOtherInterestsAmount.getText().replace(",", "");
Assert.assertEquals(otherReservesValue, String.format("%.0f",total6));
Reporter.log("other interests amount of final Account is compared successfully with Trial Balance Report: "+ otherReservesValue,true);
}
catch(Exception e)
{
Reporter.log("other interests Amount is not available in Final Account",true);
}
driver.switchTo().window(oldTab);
funcOpenDashboardPartnershipTaxReturnPage(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
clickEditBtn(driver);
/*autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
wLib.explicitWait(driver, 5, partnershipShortChekBox);
partnershipShortChekBox.click();
saveBtnAlertMsg.click();*/
driver.switchTo().defaultContent();
Assert.assertEquals(plantMachineryTxtBox.getAttribute("value"),String.format("%.2f",num2));
Reporter.log("Plant, machinery and motor vehicles is verified successfully: "+plantMachineryTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800OtherFixedAssetsTxtBox.getAttribute("value"),String.format("%.2f",num3));
Reporter.log("Other fixed assets (premises, goodwill, investments, etc) is verified successfully: "+SA800OtherFixedAssetsTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800StockWorkInProgressTxtBox.getAttribute("value"),String.format("%.2f",num6));
Reporter.log("Stock and work in progress is verified successfully: "+SA800StockWorkInProgressTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800DebtorsTxtBox.getAttribute("value"),String.format("%.2f",total8));
Reporter.log("Debtors/prepayments/other current assets is verified successfully: "+SA800DebtorsTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800BankSocietyBalancesTxtBox.getAttribute("value"),String.format("%.2f",num16));
Reporter.log("Bank/building society balances is verified successfully: "+SA800BankSocietyBalancesTxtBox.getAttribute("value"),true);Assert.assertEquals(SA800CashInHandTxtBox.getAttribute("value"),String.format("%.2f",num7));
Assert.assertEquals(SA800CashInHandTxtBox.getAttribute("value"),String.format("%.2f",num7));
Reporter.log("Cash in hand is verified successfully: "+SA800CashInHandTxtBox.getAttribute("value"),true);
//fetched total of above
totalAssets = num2 + num3 + num6 + total8 + num16 + num7;
Assert.assertEquals(SA800TotalAssetsTxtBox.getAttribute("value"),String.format("%.2f",totalAssets));
Reporter.log(" Value of Total assets is verified successfully: "+SA800TotalAssetsTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800TradeCreditorsTxtBox.getAttribute("value"),String.format("%.2f",num12));
Reporter.log("Trade creditors/accruals is verified successfully: "+SA800TradeCreditorsTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800LoansTxtBox.getAttribute("value"),String.format("%.2f",num13));
Reporter.log("Loans and overdrawn bank accounts is verified successfully: "+SA800LoansTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800OtherLiabilitiesTxtBox.getAttribute("value"),String.format("%.2f",total9));
Reporter.log("Other liabilities is verified successfully: "+SA800OtherLiabilitiesTxtBox.getAttribute("value"),true);
//fetched total of above
totalLiabilities = total9 + num12 + num13;
Assert.assertEquals(SA800TotalLiabilitiesTxtBox.getAttribute("value"),String.format("%.2f",totalLiabilities));
Reporter.log("Value of Total liabilities is verified successfully: "+SA800TotalLiabilitiesTxtBox.getAttribute("value"),true);
//SA800TotalAssetsTxtBox - SA800TotalLiabilitiesTxtBox
netBusinessBalanceSheet = totalAssets - totalLiabilities;
Assert.assertEquals(SA800NetBusinessAssetsTxtBox.getAttribute("value"),String.format("%.2f",netBusinessBalanceSheet));
Reporter.log("Net business assets is verified successfully: "+SA800NetBusinessAssetsTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800BalanceAtStartTxtBox.getAttribute("value"),String.format("%.2f",num10));
Reporter.log("Balance at start of period is verified successfully: "+SA800BalanceAtStartTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800NetProfitLossTxtBox.getAttribute("value"),String.format("%.2f",num1));
Reporter.log("Net profit/(loss) is verified successfully: "+SA800NetProfitLossTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800CapitalIntroducedTxtBox.getAttribute("value"),String.format("%.2f",num15));
Reporter.log("Capital introduced is verified successfully: "+SA800CapitalIntroducedTxtBox.getAttribute("value"),true);
Assert.assertEquals(SA800DrawingsTxtBox.getAttribute("value"),String.format("%.2f",num11));
Reporter.log("Drawings is verified successfully: "+SA800DrawingsTxtBox.getAttribute("value"),true);
//fetched total of above
Assert.assertEquals(SA800BalanceAtTheEndTxtBox.getAttribute("value"),SA800NetBusinessAssetsTxtBox.getAttribute("value"));
Reporter.log(" Value of Balance at end of period is verified successfully: "+SA800BalanceAtTheEndTxtBox.getAttribute("value"),true);
}
public void checkAutoImpactonPTRShort(WebDriver driver, String str1) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	robot = new Robot();
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();	
	wLib.explicitWait(driver, 5, sa1.editBtn);
	driver.navigate().refresh();
	wLib.explicitWait(driver, 5,SA800TurnOverTxtBox);
	Assert.assertEquals(SA800TurnOverTxtBox.getAttribute("value"),String.format("%.2f",netBusinessBalanceSheet));
	Reporter.log("Auto Turnover is Verified successfully: "+SA800TurnOverTxtBox.getAttribute("value"),true);
	clickEditBtn(driver);
	manualOptionBtn.click();
	sa1.robot = new Robot();
	sa1.robot.setAutoDelay(2000);
	sa1.robot.keyPress(KeyEvent.VK_ENTER);
	sa1.robot.setAutoDelay(1000);
	sa1.robot.keyRelease(KeyEvent.VK_ENTER);
	driver.switchTo().activeElement();
	wLib.explicitWait(driver, 5,allowableExpensesTxtBox);
	allowableExpensesTxtBox.clear();
	allowableExpensesTxtBox.sendKeys(str1);
	num1 = Double.parseDouble(str1);
	netBusinessPTRShort = netBusinessBalanceSheet - num1;
	wLib.explicitWait(driver, 5, netProfitTxtBox);
	Assert.assertEquals(netProfitTxtBox.getAttribute("value"),String.format("%.2f",netBusinessPTRShort));
	Reporter.log("Net profit/(loss) for this accounting period from a trade or profession is Verified successfully",true);
	saveBtnPTR.click();
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkPartnershipStatementShort);
	linkPartnershipStatementShort.click();
	wLib.explicitWait(driver, 5, tradeProfessionProfitTxtBox);
	Assert.assertEquals(tradeProfessionProfitTxtBox.getAttribute("value"),String.format("%.2f",netBusinessPTRShort));
	Reporter.log("Profit from a trade or profession is Verified successfully: "+tradeProfessionProfitTxtBox.getAttribute("value"),true);
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();
}
public void checkAutoImpactonPTRFull(WebDriver driver, String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	robot = new Robot();
	wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
	linkTradingProfessionalIncome.click();	
	wLib.explicitWait(driver, 5, sa1.editBtn);
	driver.navigate().refresh();
	wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
	Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),String.format("%.2f",num1));
	Reporter.log("Sales/business income (turnover) is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
	clickEditBtn(driver);
	manualOptionBtn.click();
	sa1.robot = new Robot();
	sa1.robot.setAutoDelay(2000);
	sa1.robot.keyPress(KeyEvent.VK_ENTER);
	sa1.robot.setAutoDelay(1000);
	sa1.robot.keyRelease(KeyEvent.VK_ENTER);
	driver.switchTo().activeElement();
	wLib.explicitWait(driver, 5,allowableExpensesTxtBox);
	DECostOfSalesTxtBox.clear();
	DECostOfSalesTxtBox.sendKeys(str1);
	DESubcontractorCostsTxtBox.clear();
	DESubcontractorCostsTxtBox.sendKeys(str2);
	DEOtherDirectCostsTxtBox.clear();
	DEOtherDirectCostsTxtBox.sendKeys(str3);
	DEEmployeeCostsTxtBox.clear();
	DEEmployeeCostsTxtBox.sendKeys(str4);
	DEPremisesCostsTxtBox.clear();
	DEPremisesCostsTxtBox.sendKeys(str5);
	DERepairsTxtBox.clear();
	DERepairsTxtBox.sendKeys(str6);
	DEGenAdminExpensesTxtBox.clear();
	DEGenAdminExpensesTxtBox.sendKeys(str7);
	DEMotorExpensesTxtBox.clear();
	DEMotorExpensesTxtBox.sendKeys(str8);
	DETravelSubsistenceTxtBox.clear();
	DETravelSubsistenceTxtBox.sendKeys(str9);
	DEAdvPromotionTxtBox.clear();
	DEAdvPromotionTxtBox.sendKeys(str10);
	DELegalProfCostsTxtBox.clear();
	DELegalProfCostsTxtBox.sendKeys(str11);
	DEBadDebtsTxtBox.clear();
	DEBadDebtsTxtBox.sendKeys(str12);
	DEIntAltFinancePaymentsTxtBox.clear();
	DEIntAltFinancePaymentsTxtBox.sendKeys(str13);
	DEOtherFinChargesTxtBox.clear();
	DEOtherFinChargesTxtBox.sendKeys(str14);
	DEDepreciationOnSaleTxtBox.clear();
	DEDepreciationOnSaleTxtBox.sendKeys(str15);
	DEOtherExpensesTxtBox.clear();
	DEOtherExpensesTxtBox.sendKeys(str16);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -5000)", "");
	saveBtnPTR.click();
	//Fetched
	num1 = Double.parseDouble(str1);
	num2 = Double.parseDouble(str2);
	num3 = Double.parseDouble(str3);
	num4 = Double.parseDouble(str4);
	num5 = Double.parseDouble(str5);
	num6 = Double.parseDouble(str6);
	num7 = Double.parseDouble(str7);
	num8 = Double.parseDouble(str8);
	num9 = Double.parseDouble(str9);
	num10 = Double.parseDouble(str10);
	num11 = Double.parseDouble(str11);
	num12 = Double.parseDouble(str12);
	num13 = Double.parseDouble(str13);
	num14 = Double.parseDouble(str14);
	num15 = Double.parseDouble(str15);
	num16 = Double.parseDouble(str16);
	disallowableExpenses = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10+num11+num12+num13+num14+num15+num16;
	wLib.explicitWait(driver, 5, DisallowableExpTxtBox);
	Assert.assertEquals(DisallowableExpTxtBox.getAttribute("value"),String.format("%.2f",disallowableExpenses));
	Reporter.log("Disallowable Expenses of trade or profession is Verified successfully: "+DisallowableExpTxtBox.getAttribute("value"),true);
	wLib.explicitWait(driver, 5, linkPartnershipSA801Page);
	linkPartnershipSA801Page.click();
	wLib.explicitWait(driver, 5, linkPartnershipUKPropertyIcome);
	linkPartnershipUKPropertyIcome.click();
	clickEditBtn(driver);
	wLib.explicitWait(driver, 5,PTRRentsEtcIncomeTxtBox);
	PTRRentsEtcIncomeTxtBox.clear();
	PTRRentsEtcIncomeTxtBox.sendKeys(str11);
	PTRRentsEtcTaxDeductedTxtBox.clear();
	PTRRentsEtcTaxDeductedTxtBox.sendKeys(str12);
	saveBtnPTR.click();
	Reporter.log("Partnership UK Property Income added successfully",true);
	wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
	linkPartnershipSA800Page.click();
	wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
	linkBusinessAndInvestmentIncome.click();
	wLib.explicitWait(driver, 5, netProfitTxtBox);
	netProfitValue = netProfitTxtBox.getAttribute("value");
	Reporter.log("Net profit for this accounting period: "+netProfitTxtBox,true);
	wLib.explicitWait(driver, 5,linkPartnershipStatementFull);
	linkPartnershipStatementFull.click();
	Assert.assertEquals(tradeProfessionProfitTxtBox.getAttribute("value"),netProfitValue);
	Reporter.log("Profit from a trade or profession of PTR Full is Verified successfully: "+tradeProfessionProfitTxtBox.getAttribute("value"),true);
}
public void fetchedLedger4000(WebDriver driver,String str1,String str2,String str3,String str4,String str5)throws Exception
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	sa1 = new SAPOM2019(driver);
	bp1=new BusinessPom(driver);
	robot = new Robot();
	addIncomeForPTR(driver, str1, str2, str3, str4, str5);
	openIncomeLink(driver);
	totalIncomeAmt = totalIncomeValue.getText().replace("£", "");
	Reporter.log ("total Income Amt: "+totalIncomeAmt,true);
	oldTab = driver.getWindowHandle();
}
public void funcSA802_PartnershipForeignPage(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6,String str7,String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
num1 = Double.parseDouble(str1);
num2 = Double.parseDouble(str2);
num3 = Double.parseDouble(str3);
num4 = Double.parseDouble(str4);
num5 = Double.parseDouble(str5);
num6 = Double.parseDouble(str6);
num7 = Double.parseDouble(str7);
num8 = Double.parseDouble(str8);
num9 = Double.parseDouble(str9);
num10 = Double.parseDouble(str10);
num11 = Double.parseDouble(str11);
num12 = Double.parseDouble(str12);
num13 = Double.parseDouble(str13);
num14 = Double.parseDouble(str14);
num15 = Double.parseDouble(str15);
num16 = Double.parseDouble(str16);
num17 = Double.parseDouble(str17);
wLib.explicitWait(driver, 5,linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
clickEditBtn(driver);
autoOptionBtn.click();
sa1.robot = new Robot();
sa1.robot.setAutoDelay(2000);
sa1.robot.keyPress(KeyEvent.VK_ENTER);
sa1.robot.setAutoDelay(1000);
sa1.robot.keyRelease(KeyEvent.VK_ENTER);
driver.switchTo().activeElement();
saveBtnAlertMsg.click();
driver.switchTo().defaultContent();
wLib.explicitWait(driver, 5,SA800SalesBusinessIncomeTxtBox);
Assert.assertEquals(SA800SalesBusinessIncomeTxtBox.getAttribute("value"),totalIncomeAmt);
Reporter.log("Auto Turnover is Verified successfully: "+SA800SalesBusinessIncomeTxtBox.getAttribute("value"),true);
wLib.explicitWait(driver, 5, linkSA802Page);
linkSA802Page.click();
wLib.explicitWait(driver, 5, linkSA802PartnershipForeignPage);
linkSA802PartnershipForeignPage.click();
clickEditBtn(driver);
wLib.explicitWait(driver, 5,PTRRentsEtcIncomeTxtBox);
PTRRentsEtcIncomeTxtBox.clear();
PTRRentsEtcIncomeTxtBox.sendKeys(str1);
incomeForMorePropertyChkBox.click();
incomeIsUnremittableChkBox.click();
//SA 802 ->Partnership Foreign -> Expenses	
oPRentEtcTxtBox.clear();
oPRentEtcTxtBox.sendKeys(str2);
oPRepairsEtcTxtBox.clear();
oPRepairsEtcTxtBox.sendKeys(str3);
oPFinanceEtcTxtBox.clear();
oPFinanceEtcTxtBox.sendKeys(str4);
oPLegalAndProfessionalCostsTxtBox.clear();
oPLegalAndProfessionalCostsTxtBox.sendKeys(str5);
oPCostOfServicesProvidedTxtBox.clear();
oPCostOfServicesProvidedTxtBox.sendKeys(str6);
oPOtherExpensesTxtBox.clear();
oPOtherExpensesTxtBox.sendKeys(str7);
//SA 802 ->Partnership Foreign -> Tax Adjustments
oPTAPrivateUseTxtBox.clear();
oPTAPrivateUseTxtBox.sendKeys(str8);
oPTABalancingChargesTxtBox.clear();
oPTABalancingChargesTxtBox.sendKeys(str9);
capitalAllowancesTxtBox.clear();
capitalAllowancesTxtBox.sendKeys(str10);
isEnhancedCapitalAllowancesChkBox.click();
oPCostsOfReplacingDomesticItemsTxtBox.clear();
oPCostsOfReplacingDomesticItemsTxtBox.sendKeys(str11);
taxPaidTxtBox.clear();
taxPaidTxtBox.sendKeys(str12);
residentialFinanceCostsTxtBox.clear();
residentialFinanceCostsTxtBox.sendKeys(str13);
disposalsOfHoldingsInOffShoreFundsTxtBox.clear();
disposalsOfHoldingsInOffShoreFundsTxtBox.sendKeys(str14);
lossesOnForeignLetPropertyTxtBox.clear();
lossesOnForeignLetPropertyTxtBox.sendKeys(str15);
disposalResidencialFinanceCostTxtBox.clear();
disposalResidencialFinanceCostTxtBox.sendKeys(str16);
totalTaxableLossTxtBox.clear();
totalTaxableLossTxtBox.sendKeys(str17);
additionalInfoTxtBox.clear();
additionalInfoTxtBox.sendKeys(str18);
((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -5000)", "");
saveBtnPTR.click();
//Fetched ->Total of boxes 2.12 to 2.17
total1 = num2 +num3 + num4 + num5 + num6 + num7;
wLib.explicitWait(driver, 5,oPTotalExpensesTxtBox);
Assert.assertEquals(oPTotalExpensesTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total1));
Reporter.log("Total of boxes 2.12 to 2.17 is Verified successfully: " + oPTotalExpensesTxtBox.getAttribute("value"),true);
total2 = num1 -total1;
//Fetched ->Net Profit/(loss) -> 2.11 - 2.18
Assert.assertEquals(oPNetProfitOrLossTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total2));
Reporter.log("Net Profit/(loss) is Verified successfully: " + oPNetProfitOrLossTxtBox.getAttribute("value"),true);
//Fetched ->Total of box 2.20 + box 2.21
total3 = num8 + num9;
Assert.assertEquals(tATotalAdditionsTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total3));
Reporter.log("Total of box 2.20 + box 2.21 is Verified successfully: " + tATotalAdditionsTxtBox.getAttribute("value"),true);
//Fetched ->Total of boxes 2.23 + 2.24
total4 = num10 + num11;
Assert.assertEquals(totalDeductionsTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total4));
Reporter.log("Total of boxes 2.23 + 2.24 is Verified successfully: " + totalDeductionsTxtBox.getAttribute("value"),true);
total5 = (total2 + total3) - total4; 
Assert.assertEquals(adjustedProfitTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total5));
Reporter.log("Adjusted Profit is Verified successfully: " + adjustedProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(tATaxableProfitTxtBox.getAttribute("value").replace(",", ""),String.format("%.2f",total5));
Reporter.log("Adjusted Profit is Verified successfully: " + tATaxableProfitTxtBox.getAttribute("value"),true);
Reporter.log("Foreign Income added successfully",true);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
wLib.explicitWait(driver, 5, netProfitTxtBox);
netProfitValue = netProfitTxtBox.getAttribute("value");
Reporter.log("Net profit for this accounting period: "+netProfitTxtBox,true);
debatorCashAmt = SA800DebtorsTxtBox.getAttribute("value");
assetAmt = SA800TotalAssetsTxtBox.getAttribute("value");
otherLiabilitiesValue = SA800OtherLiabilitiesTxtBox.getAttribute("value");
totalLiabilitiesValue = SA800TotalLiabilitiesTxtBox.getAttribute("value");
netBusinessAssetsValue = SA800NetBusinessAssetsTxtBox.getAttribute("value");
netProfitLossValue = SA800NetProfitLossTxtBox.getAttribute("value");
balanceAtTheEndAmt = SA800BalanceAtTheEndTxtBox.getAttribute("value");
wLib.explicitWait(driver, 5, linkTradingProfessionalIncome);
linkTradingProfessionalIncome.click();
totalIncomeAmt = SA800SalesBusinessIncomeTxtBox.getAttribute("value");
grossProfitValue = SA800GrossProfitLossTxtBox.getAttribute("value");
netProfitValue1 = SA800NetProfitLossTxtBox.getAttribute("value");
profitLossAmt = SA800NetBusinessProfitTxtBox.getAttribute("value");
wLib.explicitWait(driver, 5,linkPartnershipStatementFull);
linkPartnershipStatementFull.click();
profitFromTradeOrProfession = tradeProfessionProfitTxtBox.getAttribute("value");
incomeFromOffShoreFundsValue = incomeFromOffshoreFundsTxtBox.getAttribute("value");
lossOnForeignLePropertyValue = lossOnForeignLetPropertyTxtBox.getAttribute("value");
residentialFinanceCostsValue = residentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value");
Assert.assertEquals(tradeProfessionProfitTxtBox.getAttribute("value"),netProfitValue);
Reporter.log("Profit from a trade or profession of PTR Full is Verified successfully: "+tradeProfessionProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(incomeFromOffshoreFundsTxtBox.getAttribute("value").replace(".00", ""),str14);
Reporter.log("Income from offshore funds (from box 2.9) of PTR Full is Verified successfully: "+incomeFromOffshoreFundsTxtBox.getAttribute("value"),true);
Assert.assertEquals(lossOnForeignLetPropertyTxtBox.getAttribute("value").replace(".00", ""),str15);
Reporter.log("Loss on foreign let property (from box 2.10) of PTR Full is Verified successfully: "+lossOnForeignLetPropertyTxtBox.getAttribute("value"),true);
Assert.assertEquals(residentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value").replace(".00", ""),str16);
Reporter.log("25% of residential finance costs on foreign property (from boxes 2.10A) of PTR Full is Verified successfully: "+residentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value"),true);
Box11 = Double.parseDouble(netProfitValue);
Box18 = num14;
Box21 = num15;
Box27 = num16;
Box11Partner1 = Box11 * 0.4;
Box18Partner1 = Box18 * 0.4;
Box21Partner1 = Box21 * 0.4;
Box27Partner1 = Box27 * 0.4;
Box11Partner2 = Box11 * 0.6;
Box18Partner2 = Box18 * 0.6;
Box21Partner2 = Box21 * 0.6;
Box27Partner2 = Box27 * 0.6;
Assert.assertEquals(ptr1TradeProfessionProfitTxtBox.getAttribute("value"),String.format("%.2f",Box11Partner1));
Reporter.log("Profit from a trade or profession for first Partner of PTR Full is Verified successfully: "+ptr1TradeProfessionProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr1IncomeFromOffshoreFundsTxtBox.getAttribute("value"),String.format("%.2f",Box18Partner1));
Reporter.log("Income from offshore funds for first Partner of PTR Full is Verified successfully: "+ptr1IncomeFromOffshoreFundsTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr1LossOnForeignLetPropertyTxtBox.getAttribute("value"),String.format("%.2f",Box21Partner1));
Reporter.log("Loss on foreign let property for first Partner of PTR Full is Verified successfully: "+ptr1LossOnForeignLetPropertyTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr1ResidentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value"),String.format("%.2f",Box27Partner1));
Reporter.log("25% of residential finance costs on foreign property for first Partner of PTR Full is Verified successfully: "+ptr1ResidentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr2TradeProfessionProfitTxtBox.getAttribute("value"),String.format("%.2f",Box11Partner2));
Reporter.log("Profit from a trade or profession for second Partner of PTR Full is Verified successfully: "+ptr2TradeProfessionProfitTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr2IncomeFromOffshoreFundsTxtBox.getAttribute("value"),String.format("%.2f",Box18Partner2));
Reporter.log("Income from offshore funds for second Partner of PTR Full is Verified successfully: "+ptr2IncomeFromOffshoreFundsTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr2LossOnForeignLetPropertyTxtBox.getAttribute("value"),String.format("%.2f",Box21Partner2));
Reporter.log("Loss on foreign let property for second Partner of PTR Full is Verified successfully: "+ptr2LossOnForeignLetPropertyTxtBox.getAttribute("value"),true);
Assert.assertEquals(ptr2ResidentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value"),String.format("%.2f",Box27Partner2));
Reporter.log("25% of residential finance costs on foreign property for second Partner of PTR Full is Verified successfully: "+ptr2ResidentialFinanceCostsOnForeignPropertyTxtBox.getAttribute("value"),true);
wLib.explicitWait(driver, 5,sa1.taxReturnLink);
sa1.taxReturnLink.click();
wLib.explicitWait(driver, 5,partnershipSummaryLink);
partnershipSummaryLink.click();
Assert.assertEquals(foreignStatus.getText(),"yes");
Reporter.log("Foreign Status of Partnership Summary verified successfully: "+foreignStatus.getText(),true);
Assert.assertEquals(tradeStatus.getText(),"yes");
Reporter.log("Trade Status of Partnership Summary verified successfully: "+tradeStatus.getText(),true);
Assert.assertEquals(excludeVATStatus.getText(),"yes");
Reporter.log("Exclude VAT Status of Partnership Summary verified successfully: "+excludeVATStatus.getText(),true);
Assert.assertEquals(salesBusinessIncome.getText().substring(2).replace(",", ""),totalIncomeAmt);
Reporter.log("Sales Business Income of Partnership Summary verified successfully: "+salesBusinessIncome.getText(),true);
Assert.assertEquals(grossProfitLossAmt.getText().substring(2).replace(",", ""),grossProfitValue);
Reporter.log("Gross Profit Loss Amt of Partnership Summary verified successfully: "+grossProfitLossAmt.getText(),true);
Assert.assertEquals(netProfitOrLossAmt.getText().substring(2).replace(",", ""),netProfitValue1);
Reporter.log("Net profit or loss Amt of Partnership Summary verified successfully: "+netProfitOrLossAmt.getText(),true);
Assert.assertEquals(netProfitLossAmtSA800.getText().substring(2).replace(",", ""),profitLossAmt);
Reporter.log("Net profit loss Amt of Partnership Summary verified successfully: "+netProfitLossAmtSA800.getText(),true);
Assert.assertEquals(netProfitAmt.getText().substring(2).replace(",", ""),netProfitValue);
Reporter.log("Net profit Amt of Partnership Summary verified successfully: "+netProfitAmt.getText(),true);
Assert.assertEquals(DebtorsPrepaymentsAmt.getText().substring(2).replace(",", ""),debatorCashAmt);
Reporter.log("Total assets value of Partnership Summary verified successfully: "+DebtorsPrepaymentsAmt.getText(),true);
Assert.assertEquals(TotalAssetsAmt.getText().substring(2).replace(",", ""),assetAmt);
Reporter.log("Total assets value of Partnership Summary verified successfully: "+TotalAssetsAmt.getText(),true);

Assert.assertEquals(otherLiabilitiesAmt.getText().substring(2).replace(",", ""),otherLiabilitiesValue);
Reporter.log("Other liabilities value of Partnership Summary verified successfully: "+otherLiabilitiesAmt.getText(),true);
Assert.assertEquals(totalLiabilitiesAmt.getText().substring(2).replace(",", ""),totalLiabilitiesValue);
Reporter.log("Total liabilities value of Partnership Summary verified successfully: "+totalLiabilitiesAmt.getText(),true);
Assert.assertEquals(netBusinessAssetsAmt.getText().substring(2).replace(",", ""),netBusinessAssetsValue);
Reporter.log("Net business assets value of Partnership Summary verified successfully: "+netBusinessAssetsAmt.getText(),true);
Assert.assertEquals(netProfitLossAmt.getText().substring(2).replace(",", ""),netProfitLossValue);
Reporter.log("Net profit loss value of Partnership Summary verified successfully: "+netProfitLossAmt.getText(),true);
Assert.assertEquals(balanceAtEndOfPeriodAmt.getText().substring(2).replace(",", ""),balanceAtTheEndAmt);
Reporter.log("Balance at end of period value of Partnership Summary verified successfully: "+balanceAtEndOfPeriodAmt.getText(),true);
Assert.assertEquals(tradeProfitAmt.getText().substring(2).replace(",", ""),profitFromTradeOrProfession);
Reporter.log("Trade profit value of Partnership Summary verified successfully: "+tradeProfitAmt.getText(),true);
Assert.assertEquals(incomeFromOffshoreFundsAmt.getText().substring(2).replace(",", ""),incomeFromOffShoreFundsValue);
Reporter.log("Income from offshore funds value of Partnership Summary verified successfully: "+incomeFromOffshoreFundsAmt.getText(),true);
Assert.assertEquals(lossOnForeignLetPropertyAmt.getText().substring(2).replace(",", ""),lossOnForeignLePropertyValue);
Reporter.log("Loss on foreign let property value of Partnership Summary verified successfully: "+lossOnForeignLetPropertyAmt.getText(),true);
Assert.assertEquals(residentialFinanceCostsOnForeignPropertyAmt.getText().substring(2).replace(",", ""),residentialFinanceCostsValue);
Reporter.log("Residential finance costs on foreign property value of Partnership Summary verified successfully: "+residentialFinanceCostsOnForeignPropertyAmt.getText(),true);
Assert.assertEquals(tradeProfitAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box11Partner1));
Reporter.log("Trade profit value for Partner1 of Partnership Summary verified successfully: "+tradeProfitAmtPartner1.getText(),true);
Assert.assertEquals(incomeFromOffShoreFundsAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box18Partner1));
Reporter.log("Income from offshore funds value for Partner1 of Partnership Summary verified successfully: "+incomeFromOffShoreFundsAmtPartner1.getText(),true);
Assert.assertEquals(lossOnForeignLetPropertyAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box21Partner1));
Reporter.log("Loss on foreign let property value for Partner1 of Partnership Summary verified successfully: "+lossOnForeignLetPropertyAmtPartner1.getText(),true);
Assert.assertEquals(residentialFinanceCostsOnForeignPropertyAmtPartner1.getText().substring(2).replace(",", ""),String.format("%.2f",Box27Partner1));
Reporter.log("Residential finance costs on foreign property value for Partner1 of Partnership Summary verified successfully: "+residentialFinanceCostsOnForeignPropertyAmtPartner1.getText(),true);
Assert.assertEquals(tradeProfitAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box11Partner2));
Reporter.log("Trade profit for Partner2 value for Partner2 of Partnership Summary verified successfully: "+tradeProfitAmtPartner2.getText(),true);
Assert.assertEquals(incomeFromOffShoreFundsAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box18Partner2));
Reporter.log("Income from offshore funds value for Partner2 of Partnership Summary verified successfully: "+incomeFromOffShoreFundsAmtPartner2.getText(),true);
Assert.assertEquals(lossOnForeignLetPropertyAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box21Partner2));
Reporter.log("Loss on foreign let property value for Partner2 of Partnership Summary verified successfully: "+lossOnForeignLetPropertyAmtPartner2.getText(),true);
Assert.assertEquals(residentialFinanceCostsOnForeignPropertyAmtPartner2.getText().substring(2).replace(",", ""),String.format("%.2f",Box27Partner2));
Reporter.log("Residential finance costs on foreign property value for Partner2 of Partnership Summary verified successfully: "+residentialFinanceCostsOnForeignPropertyAmtPartner2.getText(),true);
Assert.assertEquals(disposalsOfOffshoreFundsAmtSA802.getText().substring(2).replace(".00","") ,str14);
Reporter.log("Disposals Of Offshore Funds of SA802 on Partnership Summary verified successfully: "+disposalsOfOffshoreFundsAmtSA802.getText(),true);
Assert.assertEquals(lossesOnForeignLetPropertyAmtSA802.getText().substring(2).replace(".00",""),str15);
Reporter.log("Losses on foreign let property value of SA802 on Partnership Summary verified successfully: "+lossesOnForeignLetPropertyAmtSA802.getText(),true);
Assert.assertEquals(residentialFinanceCostsAmtSA802.getText().substring(2).replace(".00",""),str16);
Reporter.log("Residential Finance Costs of SA802 on Partnership Summary verified successfully: "+residentialFinanceCostsAmtSA802.getText(),true);
Assert.assertEquals(totalRentsEtctAmtSA802.getText().substring(2).replace(".00",""),str1);
Reporter.log("Total Rents Etc of SA802 on Partnership Summary verified successfully: "+totalRentsEtctAmtSA802.getText(),true);
Assert.assertEquals(multiplePropertiesStatusSA802.getText(),"Yes");
Reporter.log("Multiple Properties of SA802 on  Partnership Summary verified successfully: "+multiplePropertiesStatusSA802.getText(),true);
Assert.assertEquals(incomeUnremittableStatusSA802.getText(),"Yes");
Reporter.log("Income Unremittable of SA802 on  Partnership Summary verified successfully: "+incomeUnremittableStatusSA802.getText(),true);
Assert.assertEquals(RentRatesEtcAmtSA802.getText().substring(2).replace(".00",""),str2);
Reporter.log("Rent Rates Etc of SA802 on Partnership Summary verified successfully: "+RentRatesEtcAmtSA802.getText(),true);
Assert.assertEquals(repairsAndRenewalsAmtSA802.getText().substring(2).replace(".00",""),str3);
Reporter.log("Repairs And Renewals of SA802 on Partnership Summary verified successfully: "+repairsAndRenewalsAmtSA802.getText(),true);
Assert.assertEquals(financeChargesAmtSA802.getText().substring(2).replace(".00",""),str4);
Reporter.log("Finance Charges of SA802 on Partnership Summary verified successfully: "+financeChargesAmtSA802.getText(),true);
Assert.assertEquals(legalAndProfessionalCostsAmtSA802.getText().substring(2).replace(".00",""),str5);
Reporter.log("Legal And Professional Costs of SA802 on Partnership Summary verified successfully: "+legalAndProfessionalCostsAmtSA802.getText(),true);
Assert.assertEquals(costOfServicesAmtSA802.getText().substring(2).replace(".00",""),str6);
Reporter.log("Cost Of Services of SA802 on Partnership Summary verified successfully: "+costOfServicesAmtSA802.getText(),true);

Assert.assertEquals(otherExpensesAmtSA802.getText().substring(2).replace(".00",""),str7);
Reporter.log("Other Expenses of SA802 on Partnership Summary verified successfully: "+otherExpensesAmtSA802.getText(),true);

Assert.assertEquals(privateUseAmtSA802.getText().substring(2).replace(".00",""),str8);
Reporter.log("Private Use of SA802 on Partnership Summary verified successfully: "+privateUseAmtSA802.getText(),true);

Assert.assertEquals(balancingChargesAmtSA802.getText().substring(2).replace(".00",""),str9);
Reporter.log("Balancing Charges of SA802 on Partnership Summary verified successfully: "+balancingChargesAmtSA802.getText(),true);

Assert.assertEquals(capitalAllowancesAmtSA802.getText().substring(2).replace(".00",""),str10);
Reporter.log("Capital Allowances of SA802 on Partnership Summary verified successfully: "+capitalAllowancesAmtSA802.getText(),true);

Assert.assertEquals(costsOfReplacingDomesticItemsAmtSA802.getText().substring(2).replace(".00",""),str11);
Reporter.log("Costs Of Replacing Domestic Items of SA802 on Partnership Summary verified successfully: "+costsOfReplacingDomesticItemsAmtSA802.getText(),true);

Assert.assertEquals(foreignTaxPaidAmtSA802.getText().substring(2).replace(".00",""),str12);
Reporter.log("Foreign Tax Paid of SA802 on Partnership Summary verified successfully: "+foreignTaxPaidAmtSA802.getText(),true);

Assert.assertEquals(residentialFinanceCostsAmt.getText().substring(2).replace(".00",""),str13);
Reporter.log("Residential Finance Costs of SA802 on Partnership Summary verified successfully: "+residentialFinanceCostsAmt.getText(),true);

Assert.assertEquals(totalExpenditureAmtSA802.getText().substring(2),String.format("%.2f",total1));
Reporter.log("Total Expenditure on Partnership Summary verified successfully: "+totalExpenditureAmtSA802.getText(),true);
Assert.assertEquals(netProfitLossAmtSA802.getText().substring(2),String.format("%.2f",total2));
Reporter.log("Net Profit Loss on Partnership Summary verified successfully: "+netProfitLossAmtSA802.getText(),true);
Assert.assertEquals(totalAdditionsAmtSA802.getText().substring(2),String.format("%.2f",total3));
Reporter.log("Total Additions on Partnership Summary verified successfully: "+totalAdditionsAmtSA802.getText(),true);
Assert.assertEquals(totalDeductionsAmtSA802.getText().substring(2),String.format("%.2f",total4));
Reporter.log("Total Deductions on Partnership Summary verified successfully: "+totalDeductionsAmtSA802.getText(),true);
Assert.assertEquals(adjustedProfitAmtSA802.getText().substring(2),String.format("%.2f",total5));
Reporter.log("Adjusted Profit on Partnership Summary verified successfully: "+adjustedProfitAmtSA802.getText(),true);
Assert.assertEquals(taxableProfitAmtSA802.getText().substring(2),String.format("%.2f",total5));
Reporter.log("Taxable Profit on Partnership Summary verified successfully: "+taxableProfitAmtSA802.getText(),true);
Assert.assertEquals(totalTaxableLossAmtSA802.getText().substring(2).substring(2).replace(",", "").replace(".00",""),str17);
Reporter.log("Total Taxable Loss value on Partnership Summary verified successfully: "+totalTaxableLossAmtSA802.getText(),true);

}
public void delScenarioPTRFullwithSA802(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
funcSA800TradingProfessionalIncomeDel(driver);
funcSA802Del(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
funcSAPTRDel(driver);
driver.switchTo().window(oldTab);
bp1.openIncome(driver);
settingBtnIncome.click();
bp1.delRecord.click();
delBtnIncome.click();
wLib.explicitWait(driver, 5,bp1.plusButtonBK);
wLib.explicitWait(driver, 5,bp1.plusButtonBK);
bp1.plusButtonBK.click();
wLib.explicitWait(driver, 5,linkCustomer);
linkCustomer.click();
wLib.explicitWait(driver, 5,linkCustomeDeleteBtn);
linkCustomeDeleteBtn.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 1,bp1.confirmDelBtn);
bp1.confirmDelBtn.click();
}
public void ptrSubmitToHMRC(WebDriver driver) throws Exception
{

	wLib = new WaitStatementLib();
	sa1 = new SAPOM2019(driver);
	sa1.submitToHMRC.click();
wLib.explicitWait(driver, 10, sa1.validateSubmissionBtn);
sa1.validateSubmissionBtn.click();

try
{
Thread.sleep(80000);
driver.navigate().refresh();

wLib.explicitWait(driver, 5, sa1.unlockBtn);
sa1.unlockBtn.click();
driver.navigate().refresh();
wLib.explicitWait(driver,2, sa1.successMessage);
if(sa1.successMessage.isDisplayed()==true)
{
wLib.explicitWait(driver,2, sa1.successMessage);
Assert.assertEquals(sa1.successMessage.getText(), "Success!");
Reporter.log("Submission Validated: "+sa1.successMessage.getText(),true);
}
}
catch (Exception e) {
	Reporter.log("Submission failed",true);
	//throw(e);
}
}

public void checkXMLPTRSa802(WebDriver driver) throws Exception {
	
	wLib = new WaitStatementLib();
	lib1 = new LibSA(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver,5,lib1.mtrXmlLink);
	lib1.mtrXmlLink.click();
	wLib.explicitWait(driver,5,lib1.textArea1);
	lib1.xmlText=lib1.textArea1.getText();
	//Reporter.log(lib1.xmlText,true);
	lib1.dbFactory = DocumentBuilderFactory.newInstance();
	lib1.dBuilder = lib1.dbFactory.newDocumentBuilder();
	lib1.doc = lib1.dBuilder.parse(new InputSource(new StringReader(lib1.xmlText)));
	lib1.doc.getDocumentElement().normalize();
	try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_SalesBusinessIncome=lib1.eElement.getElementsByTagName("SalesBusinessIncome").item(0).getTextContent();
		Reporter.log("Value of SalesBusinessIncome: "+xml_SalesBusinessIncome,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("SalesBusinessIncome Tag is not available in MTR File",true);
	   }
	try {
		lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
		Reporter.log("----------------------------",true);
		for (int i = 0; i < lib1.nList.getLength(); i++) {
		lib1.nNode = lib1.nList.item(i);
		Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
		if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
			lib1.eElement = (Element) lib1.nNode;
			xml_GrossProfitLoss=lib1.eElement.getElementsByTagName("GrossProfitLoss").item(0).getTextContent();
			Reporter.log("Value of GrossProfitLoss: "+xml_GrossProfitLoss,true);
			}

		}
		}
		catch (Exception e) {
			Reporter.log("GrossProfitLoss Tag is not available in MTR File",true);
		   }
	try {
		lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
		Reporter.log("----------------------------",true);
		for (int i = 0; i < lib1.nList.getLength(); i++) {
		lib1.nNode = lib1.nList.item(i);
		Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
		if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
			lib1.eElement = (Element) lib1.nNode;
			xml_NetProfitOrLoss=lib1.eElement.getElementsByTagName("NetProfitOrLoss").item(0).getTextContent();
			Reporter.log("Value of NetProfitOrLoss: "+xml_NetProfitOrLoss,true);
			}

		}
		}
		catch (Exception e) {
			Reporter.log("NetProfitOrLoss Tag is not available in MTR File",true);
		   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("TaxAdjustments");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfitLoss_TaxAdjustments=lib1.eElement.getElementsByTagName("NetProfitLoss").item(0).getTextContent();
		Reporter.log("Value of NetProfitLoss: "+xml_NetProfitLoss_TaxAdjustments,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfitLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("AdjustmentsForTaxableProfitOrLoss");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfit=lib1.eElement.getElementsByTagName("NetProfit").item(0).getTextContent();
		Reporter.log("Value of NetProfit: "+xml_NetProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfit Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Assets");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_DebtorsPrepaymentsEtc=lib1.eElement.getElementsByTagName("DebtorsPrepaymentsEtc").item(0).getTextContent();
		Reporter.log("Value of DebtorsPrepaymentsEtc: "+xml_DebtorsPrepaymentsEtc,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("DebtorsPrepaymentsEtc Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Assets");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalAssets=lib1.eElement.getElementsByTagName("TotalAssets").item(0).getTextContent();
		Reporter.log("Value of TotalAssets: "+xml_TotalAssets,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalAssets Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Liabilities");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_OtherLiabilities = lib1.eElement.getElementsByTagName("OtherLiabilities").item(0).getTextContent();
		Reporter.log("Value of OtherLiabilities: "+xml_OtherLiabilities,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("OtherLiabilities Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Liabilities");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalLiabilities = lib1.eElement.getElementsByTagName("TotalLiabilities").item(0).getTextContent();
		Reporter.log("Value of TotalLiabilities: "+xml_TotalLiabilities,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalLiabilities Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("SummaryOfBalanceSheet");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetBusinessAssets=lib1.eElement.getElementsByTagName("NetBusinessAssets").item(0).getTextContent();
		Reporter.log("Value of NetBusinessAssets: "+xml_NetBusinessAssets,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetBusinessAssets Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnersCurrentAndCapitalAccounts");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfitLoss_PtrCurrnt_CptlAcnt = lib1.eElement.getElementsByTagName("NetProfitLoss").item(0).getTextContent();
		Reporter.log("Value of NetProfitLoss: " + xml_NetProfitLoss_PtrCurrnt_CptlAcnt,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfitLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnersCurrentAndCapitalAccounts");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_BalanceAtEndOfPeriod = lib1.eElement.getElementsByTagName("BalanceAtEndOfPeriod").item(0).getTextContent();
		Reporter.log("Value of BalanceAtEndOfPeriod: " + xml_BalanceAtEndOfPeriod,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("BalanceAtEndOfPeriod Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TradeProfit = lib1.eElement.getElementsByTagName("TradeProfit").item(0).getTextContent();
		Reporter.log("Value of TradeProfit: "+ xml_TradeProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TradeProfit Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_LossOnForeignLetProperty = lib1.eElement.getElementsByTagName("LossOnForeignLetProperty").item(0).getTextContent();
		Reporter.log("Value of LossOnForeignLetProperty: "+ xml_LossOnForeignLetProperty,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("LossOnForeignLetProperty Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_IncomeFromOffshoreFunds = lib1.eElement.getElementsByTagName("IncomeFromOffshoreFunds").item(0).getTextContent();
		Reporter.log("Value of IncomeFromOffshoreFunds: "+ xml_IncomeFromOffshoreFunds,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("IncomeFromOffshoreFunds Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_ResidentialFinanceCostsForeign = lib1.eElement.getElementsByTagName("ResidentialFinanceCostsForeign").item(0).getTextContent();
		Reporter.log("Value of ResidentialFinanceCostsForeign: "+ xml_ResidentialFinanceCostsForeign,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("ResidentialFinanceCostsForeign Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TradeProfit1[i]=lib1.eElement.getElementsByTagName("TradeProfit").item(0).getTextContent();
		Reporter.log("Value of TradeProfit in PartnerDetails Tag: "+xml_TradeProfit1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TradeProfit Tag of PartnerDetails Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_IncomeFromOffshoreFunds1[i]=lib1.eElement.getElementsByTagName("IncomeFromOffshoreFunds").item(0).getTextContent();
		Reporter.log("Value of IncomeFromOffshoreFunds in PartnerDetails Tag: "+xml_IncomeFromOffshoreFunds1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("IncomeFromOffshoreFunds Tag of PartnerDetails Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_ResidentialFinanceCostsForeign1[i]=lib1.eElement.getElementsByTagName("ResidentialFinanceCostsForeign").item(0).getTextContent();
		Reporter.log("Value of ResidentialFinanceCostsForeign in PartnerDetails Tag: "+xml_ResidentialFinanceCostsForeign1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("ResidentialFinanceCostsForeign Tag of PartnerDetails Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_LossOnForeignLetProperty1[i]=lib1.eElement.getElementsByTagName("LossOnForeignLetProperty").item(0).getTextContent();
		Reporter.log("Value of LossOnForeignLetProperty in PartnerDetails Tag: "+xml_LossOnForeignLetProperty1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("LossOnForeignLetProperty Tag of PartnerDetails Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("ForeignIncomeSavingsLandProperty");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_ForeignLettingsLoss=lib1.eElement.getElementsByTagName("ForeignLettingsLoss").item(0).getTextContent();
		Reporter.log("Value of ForeignLettingsLoss Tag: "+xml_ForeignLettingsLoss,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("ForeignLettingsLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandAndPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalRentsEtc=lib1.eElement.getElementsByTagName("TotalRentsEtc").item(0).getTextContent();
		Reporter.log("Value of TotalRentsEtc Tag: "+xml_TotalRentsEtc,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalRentsEtc Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandAndPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfitLoss_IncmLndAndPropAbrd=lib1.eElement.getElementsByTagName("NetProfitLoss").item(0).getTextContent();
		Reporter.log("Value of NetProfitLoss Tag: "+xml_NetProfitLoss_IncmLndAndPropAbrd,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfitLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandAndPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_AdjustedProfit=lib1.eElement.getElementsByTagName("AdjustedProfit").item(0).getTextContent();
		Reporter.log("Value of AdjustedProfit Tag: "+xml_AdjustedProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("AdjustedProfit Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_RentRatesEtc = lib1.eElement.getElementsByTagName("RentRatesEtc").item(0).getTextContent();
		Reporter.log("Value of RentRatesEtc Tag: "+ xml_RentRatesEtc,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("RentRatesEtc Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_RepairsAndRenewals = lib1.eElement.getElementsByTagName("RepairsAndRenewals").item(0).getTextContent();
		Reporter.log("Value of RepairsAndRenewals Tag: "+ xml_RepairsAndRenewals,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("RepairsAndRenewals Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalExpenditure = lib1.eElement.getElementsByTagName("TotalExpenditure").item(0).getTextContent();
		Reporter.log("Value of TotalExpenditure Tag: "+ xml_TotalExpenditure,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalExpenditure Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TaxableProfit = lib1.eElement.getElementsByTagName("TaxableProfit").item(0).getTextContent();
		Reporter.log("Value of TaxableProfit Tag: "+ xml_TaxableProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TaxableProfit Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalAllowableLoss = lib1.eElement.getElementsByTagName("TotalAllowableLoss").item(0).getTextContent();
		Reporter.log("Value of TotalAllowableLoss Tag: "+ xml_TotalAllowableLoss,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalAllowableLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_FinanceCharges=lib1.eElement.getElementsByTagName("FinanceCharges").item(0).getTextContent();
		Reporter.log("Value of FinanceCharges Tag: "+xml_FinanceCharges,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("FinanceCharges Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_LegalAndProfessionalCosts = lib1.eElement.getElementsByTagName("LegalAndProfessionalCosts").item(0).getTextContent();
		Reporter.log("Value of LegalAndProfessionalCosts Tag: "+ xml_LegalAndProfessionalCosts,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("LegalAndProfessionalCosts Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_CostOfServices = lib1.eElement.getElementsByTagName("CostOfServices").item(0).getTextContent();
		Reporter.log("Value of CostOfServices Tag: "+ xml_CostOfServices,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("CostOfServices Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Expenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_OtherExpenses = lib1.eElement.getElementsByTagName("OtherExpenses").item(0).getTextContent();
		Reporter.log("Value of OtherExpenses Tag: "+ xml_OtherExpenses,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("OtherExpenses Tag is not available in MTR File",true);
	   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("AdditionsToNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_PrivateUse = lib1.eElement.getElementsByTagName("PrivateUse").item(0).getTextContent();
		Reporter.log("Value of PrivateUse Tag: "+ xml_PrivateUse,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("PrivateUse Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("AdditionsToNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_BalancingCharges = lib1.eElement.getElementsByTagName("BalancingCharges").item(0).getTextContent();
		Reporter.log("Value of BalancingCharges Tag: "+ xml_BalancingCharges,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("BalancingCharges Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("AdditionsToNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalAdditions = lib1.eElement.getElementsByTagName("TotalAdditions").item(0).getTextContent();
		Reporter.log("Value of TotalAdditions Tag: "+ xml_TotalAdditions,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalAdditions Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("DeductionsFromNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_CapitalAllowances = lib1.eElement.getElementsByTagName("CapitalAllowances").item(0).getTextContent();
		Reporter.log("Value of CapitalAllowances Tag: "+ xml_CapitalAllowances,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("CapitalAllowances Tag is not available in MTR File",true);
	   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("DeductionsFromNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_CostsOfReplacingDomesticItems = lib1.eElement.getElementsByTagName("CostsOfReplacingDomesticItems").item(0).getTextContent();
		Reporter.log("Value of CostsOfReplacingDomesticItems Tag: "+ xml_CostsOfReplacingDomesticItems,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("CostsOfReplacingDomesticItems Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("DeductionsFromNetProfit");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalDeductions = lib1.eElement.getElementsByTagName("TotalDeductions").item(0).getTextContent();
		Reporter.log("Value of TotalDeductions Tag: "+ xml_TotalDeductions,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalDeductions Tag is not available in MTR File",true);
	   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_ForeignTaxPaid = lib1.eElement.getElementsByTagName("ForeignTaxPaid").item(0).getTextContent();
		Reporter.log("Value of ForeignTaxPaid Tag: "+xml_ForeignTaxPaid,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("ForeignTaxPaid Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeLandPropertyAbroad");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_ResidentialFinanceCosts = lib1.eElement.getElementsByTagName("ResidentialFinanceCosts").item(0).getTextContent();
		Reporter.log("Value of ResidentialFinanceCosts Tag: "+ xml_ResidentialFinanceCosts,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("ResidentialFinanceCosts Tag is not available in MTR File",true);
	   }
}
public void checkXMLPTRSa803(WebDriver driver) throws Exception {
	
	wLib = new WaitStatementLib();
	lib1 = new LibSA(driver);
	sa1 = new SAPOM2019(driver);
	wLib.explicitWait(driver,5,lib1.mtrXmlLink);
	lib1.mtrXmlLink.click();
	wLib.explicitWait(driver,5,lib1.textArea1);
	lib1.xmlText=lib1.textArea1.getText();
	lib1.dbFactory = DocumentBuilderFactory.newInstance();
	lib1.dBuilder = lib1.dbFactory.newDocumentBuilder();
	lib1.doc = lib1.dBuilder.parse(new InputSource(new StringReader(lib1.xmlText)));
	lib1.doc.getDocumentElement().normalize();
	try {
	lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_SalesBusinessIncome=lib1.eElement.getElementsByTagName("SalesBusinessIncome").item(0).getTextContent();
		Reporter.log("Value of SalesBusinessIncome: "+xml_SalesBusinessIncome,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("SalesBusinessIncome Tag is not available in MTR File",true);
	   }
	try {
		lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
		Reporter.log("----------------------------",true);
		for (int i = 0; i < lib1.nList.getLength(); i++) {
		lib1.nNode = lib1.nList.item(i);
		Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
		if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
			lib1.eElement = (Element) lib1.nNode;
			xml_GrossProfitLoss=lib1.eElement.getElementsByTagName("GrossProfitLoss").item(0).getTextContent();
			Reporter.log("Value of GrossProfitLoss: "+xml_GrossProfitLoss,true);
			}

		}
		}
		catch (Exception e) {
			Reporter.log("GrossProfitLoss Tag is not available in MTR File",true);
		   }
	try {
		lib1.nList= lib1.doc.getElementsByTagName("IncomeAndExpenses");
		Reporter.log("----------------------------",true);
		for (int i = 0; i < lib1.nList.getLength(); i++) {
		lib1.nNode = lib1.nList.item(i);
		Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
		if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
			lib1.eElement = (Element) lib1.nNode;
			xml_NetProfitOrLoss=lib1.eElement.getElementsByTagName("NetProfitOrLoss").item(0).getTextContent();
			Reporter.log("Value of NetProfitOrLoss: "+xml_NetProfitOrLoss,true);
			}

		}
		}
		catch (Exception e) {
			Reporter.log("NetProfitOrLoss Tag is not available in MTR File",true);
		   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("TaxAdjustments");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfitLoss_TaxAdjustments=lib1.eElement.getElementsByTagName("NetProfitLoss").item(0).getTextContent();
		Reporter.log("Value of NetProfitLoss: "+xml_NetProfitLoss_TaxAdjustments,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfitLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("AdjustmentsForTaxableProfitOrLoss");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfit=lib1.eElement.getElementsByTagName("NetProfit").item(0).getTextContent();
		Reporter.log("Value of NetProfit: "+xml_NetProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfit Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Assets");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_DebtorsPrepaymentsEtc=lib1.eElement.getElementsByTagName("DebtorsPrepaymentsEtc").item(0).getTextContent();
		Reporter.log("Value of DebtorsPrepaymentsEtc: "+xml_DebtorsPrepaymentsEtc,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("DebtorsPrepaymentsEtc Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Assets");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalAssets=lib1.eElement.getElementsByTagName("TotalAssets").item(0).getTextContent();
		Reporter.log("Value of TotalAssets: "+xml_TotalAssets,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalAssets Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Liabilities");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_OtherLiabilities = lib1.eElement.getElementsByTagName("OtherLiabilities").item(0).getTextContent();
		Reporter.log("Value of OtherLiabilities: "+xml_OtherLiabilities,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("OtherLiabilities Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("Liabilities");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalLiabilities = lib1.eElement.getElementsByTagName("TotalLiabilities").item(0).getTextContent();
		Reporter.log("Value of TotalLiabilities: "+xml_TotalLiabilities,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalLiabilities Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("SummaryOfBalanceSheet");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetBusinessAssets=lib1.eElement.getElementsByTagName("NetBusinessAssets").item(0).getTextContent();
		Reporter.log("Value of NetBusinessAssets: "+xml_NetBusinessAssets,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetBusinessAssets Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnersCurrentAndCapitalAccounts");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_NetProfitLoss_PtrCurrnt_CptlAcnt = lib1.eElement.getElementsByTagName("NetProfitLoss").item(0).getTextContent();
		Reporter.log("Value of NetProfitLoss: " + xml_NetProfitLoss_PtrCurrnt_CptlAcnt,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("NetProfitLoss Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnersCurrentAndCapitalAccounts");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_BalanceAtEndOfPeriod = lib1.eElement.getElementsByTagName("BalanceAtEndOfPeriod").item(0).getTextContent();
		Reporter.log("Value of BalanceAtEndOfPeriod: " + xml_BalanceAtEndOfPeriod,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("BalanceAtEndOfPeriod Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TradeProfit = lib1.eElement.getElementsByTagName("TradeProfit").item(0).getTextContent();
		Reporter.log("Value of TradeProfit: "+ xml_TradeProfit,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TradeProfit Tag is not available in MTR File",true);
	   }

try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipInformation");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalDisposalChargeableAsset = lib1.eElement.getElementsByTagName("TotalDisposalChargeableAsset").item(0).getTextContent();
		Reporter.log("Value of TotalDisposalChargeableAsset: "+ xml_TotalDisposalChargeableAsset,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalDisposalChargeableAsset Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TradeProfit1[i]=lib1.eElement.getElementsByTagName("TradeProfit").item(0).getTextContent();
		Reporter.log("Value of TradeProfit in PartnerDetails Tag: "+xml_TradeProfit1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TradeProfit Tag of PartnerDetails Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnerDetails");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_TotalDisposalChargeableAsset1[i]=lib1.eElement.getElementsByTagName("DisposalOfChargeableAssets").item(0).getTextContent();
		Reporter.log("Value of DisposalOfChargeableAssets in PartnerDetails Tag: "+xml_TotalDisposalChargeableAsset1[i],true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("DisposalOfChargeableAssets Tag of PartnerDetails Tag is not available in MTR File",true);
	   }


try {
	lib1.nList= lib1.doc.getElementsByTagName("DisposalRow");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_Proceeds = lib1.eElement.getElementsByTagName("Proceeds").item(0).getTextContent();
		Reporter.log("Value of Proceeds Tag: "+ xml_Proceeds,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("Proceeds Tag is not available in MTR File",true);
	   }
try {
	lib1.nList= lib1.doc.getElementsByTagName("PartnershipChargeableAssets");
	Reporter.log("----------------------------",true);
	for (int i = 0; i < lib1.nList.getLength(); i++) {
	lib1.nNode = lib1.nList.item(i);
	Reporter.log("\nCurrent Element :" + lib1.nNode.getNodeName(),true);
	if (lib1.nNode.getNodeType() == Node.ELEMENT_NODE) {
		lib1.eElement = (Element) lib1.nNode;
		xml_Proceeds = lib1.eElement.getElementsByTagName("TotalProceeds").item(0).getTextContent();
		Reporter.log("Value of TotalProceeds Tag: "+ xml_Proceeds,true);
		}

	}
	}
	catch (Exception e) {
		Reporter.log("TotalProceeds Tag is not available in MTR File",true);
	   }

}
public void delScenarioPTRFullwithSA803(WebDriver driver) throws Exception
{
wLib = new WaitStatementLib();
cp = new CISPage(driver);
sa1 = new SAPOM2019(driver);
bp1=new BusinessPom(driver);
robot = new Robot();
funcSA800TradingProfessionalIncomeDel(driver);
funcSA803Del(driver);
wLib.explicitWait(driver, 5, linkPartnershipSA800Page);
linkPartnershipSA800Page.click();
wLib.explicitWait(driver, 5, linkBusinessAndInvestmentIncome);
linkBusinessAndInvestmentIncome.click();
funcSAPTRDel(driver);
driver.switchTo().window(oldTab);
bp1.openIncome(driver);
settingBtnIncome.click();
bp1.delRecord.click();
delBtnIncome.click();
wLib.explicitWait(driver, 5,bp1.plusButtonBK);
wLib.explicitWait(driver, 5,bp1.plusButtonBK);
bp1.plusButtonBK.click();
wLib.explicitWait(driver, 5,linkCustomer);
linkCustomer.click();
wLib.explicitWait(driver, 5,linkCustomeDeleteBtn);
linkCustomeDeleteBtn.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 1,bp1.confirmDelBtn);
bp1.confirmDelBtn.click();
}

}




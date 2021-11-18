package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/90c8ed50-8c1b-4dc6-99c7-16397f2df871
@TestModellerModule(guid = "90c8ed50-8c1b-4dc6-99c7-16397f2df871")
public class Testcaseselfemp_86 extends BasePage
{
	public Testcaseselfemp_86 (WebDriver driver)
	{
		super(driver);
	}


	private By ctl00ddlTaxYearElem = By.xpath("//SELECT[@name='ctl00$ddlTaxYear']");
	private By SA100_Interest_from_Banks_building_societiesElem = By.xpath("/html/body/form/main/div[3]/div[3]/div[2]/div[4]/div/div/table/tbody/tr[2]/td[1]/a");

	private By _EditElem = By.xpath("/html/body/form/main/div[3]/div[3]/header/div/a/span");

	private By ctl00cPHtbContainerctl00txtUntaxedUKinterestElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl00_txtUntaxedUKinterest\"]");

	private By _SaveElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl00_btnSaveBank\"]");

	private By _Dashboard_Elem = By.xpath("//*[@id=\"aspnetForm\"]/main/div[3]/div[2]/ul/li[1]/a/span");

	private By SA102_EmploymentElem = By.xpath("//A[contains(text(),'(SA102)  Employment')]");

	private By _Add_Employment_IncomeElem = By.xpath("//A[@data-placement='top']");

	private By ctl00cPHtxtPayFromEmploymentElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPayFromEmployment']");

	private By ctl00cPHtxtTaxTakenOffPayElem = By.xpath("//INPUT[@name='ctl00$cPH$txtTaxTakenOffPay']");

	private By ctl00cPHtxtEmployerPAYEReferenceElem = By.xpath("//INPUT[@name='ctl00$cPH$txtEmployerPAYEReference']");

	private By ctl00cPHtxtEmployerElem = By.xpath("//INPUT[@name='ctl00$cPH$txtEmployer']");

	private By _Save_1Elem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl00_btnSaveBank\"]");

	private By _Elem = By.xpath("//A[@id='ctl00_cPH_btn1']");

	private By SA105_Income_from_PropertyElem = By.xpath("//*[@id=\"ctl00_cPH_hrefProperty\"]");

	private By _Edit_1Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnEdit\"]");

	private By ctl00cPHtbContainerctl00txtNumberOfPropertiesElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl00_txtNumberOfProperties\"]");

	private By Property_Income_Expenses_Elem = By.xpath("//*[@id=\"__tab_ctl00_cPH_tbContainer_ctl02\"]");

	private By ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromPropertyElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl02_txtTotalRentsAndOtherIncomeFromProperty\"]");

	private By Property_ExpensesElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl02\"]/div/div/div/div[1]/ul/li[2]/a");

	private By ctl00cPHtbContainerctl02txtInterestAndOtherFinancialChargesElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl02$txtInterestAndOtherFinancialCharges']");

	private By ctl00cPHtbContainerctl02txtOtherPropertyExpensesElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl02$txtOtherPropertyExpenses']");

	private By Taxable_Profit_or_LossElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_ctl03']");

	private By ctl00cPHtbContainerctl03txtAdjustedProfitForTheYearElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl03$txtAdjustedProfitForTheYear']");

	private By ctl00cPHtbContainerctl03txtTaxableProfitForTheYearElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl03$txtTaxableProfitForTheYear']");

	private By ctl00cPHtbContainerctl03txtResidentialfinancecostsElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl03$txtResidentialfinancecosts']");

	private By ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForwardElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$ctl03$txtUnusedResidentialFinanceCostsBroughtForward']");

	private By _Review_File_Elem = By.xpath("//*[@id=\"aspnetForm\"]/main/div[3]/div[2]/ul/li[3]/a/span");

	private By SA110_Underpaid_TaxElem = By.xpath("//*[@id=\"my_table\"]/tbody/tr[5]/td[3]/a");

	private By ctl00cPHtbContainerctl02txtOutstandingDebtElem = By.xpath("//*[@id=\"ctl00_cPH_tbContainer_ctl02_txtOutstandingDebt\"]");

	private By _Save_2Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnSave\"]/span");

	private By Review_Tax_Calculation_Elem = By.xpath("//*[@id=\"aspnetForm\"]/main/div[3]/div[2]/ul/li[3]/ul/li[1]/a");

	private By _000Elem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/div/div/div/table/tbody/tr[9]/td[2]/b");

private double Incometaxdue;
	
	private double totalIncomeTaxDue;
	
	private double dataReliefForFinanceCosts;
	
	private double deficiencyrelief;
	private double amtdefrelief;
	public int  amt1 = 0;
	
	private double foreigncreditrelief;
	private double amtforcreditrelief;
	
	public int amt2=0;
	
	public String amt3;
	
	public int amt4=0;
	
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
	private double n41=0.00;
	private double n42=0.00;
	private double n43=0.00;
	private double n44=0.00;
	private double n45=0.00;
	private double n46=0.00;
	private double n47=0.00;
	private double n48=0.00;
	private double n49=0.00;
	private double n50=0.00;
	private double n51=0.00;
	private double n52=0.00;
	private double n53=0.00;
	private double n54=0.00;
	private double n55=0.00;
	private double n56=0.00;
	private double n57=0.00;
	private double n58=0.00;
	private double n59=0.00;
	private double n60=0.00;
	private double n61=0.00;
	private double n62=0.00;
	private double n63=0.00;
	private double n64=0.00;
	private double EMP1=0.00;
	private double EMP3=0.00;
	private double EMP12=0.00;
	private double EMP16=0.00;
	private double EMP17To20=0.00;
	private double totalincome = 0.00;
	private double taxDueInc = 0.00;
	private double taxTotal;
	private double dueTax1=0.00;
	private double dueTax2=0.00;
	private double dueTax3=0.00;
	private double dueTax4=0.00;
	private double dueTax5=0.00;
	private double dueTax6=0.00;
	private double dueTax7=0.00;
	private double amtStatePensionLumpSumPayment =0.00;
	private double d1 = 0.00;
	private double Totaltax =0.00;
	private double x1 =0.00;
	private double t1 ;
	private double t2;
	private double taxdueOnInc1;
	private double actualtax;
	private String expectedDescription="HMRC has received the HMRC-SA-SA100";
	//global variable for tax calculation and read pdf
	private int income1=0;
	private int income2=0;
	private int income3=0;
	private int total=0;
	private String displayTotal="";
	private String FinalCalculation1="";
	private String FinalCalculation ="";
	private String dashBoardTotal ="";
	private String value1="";
	private String value2="";
	private double personalAllowanceRate=12500.00;
	private double personalAllowanceRateMaxLimit=100000.00;
	private double finalLimit=123700.00;
	private double blindAllowance =2450.00;
	private double marriageAllowance =1250.00;
	private double marriageAllowanceRate=.20;
	private double marriageAllowanceAmt=0.00;
	private double startedRatePayPension=0.00;
	private double basicRatePayPension=0.00;
	private double intermediateRatePayPension=0.00;
	private double heigherRatePayPension=0.00;
	private double additionalRatePayPension=0.00;
	private double startedRateSaving=0.00;
	private double basicRateSaving=0.00;
	private double heigherRateSaving=0.00;
	private double additionalRateSaving=0.00;
	private double basicRateDividends=0.00;
	private double heigherRateDividends=0.00;
	private double additionalRateDividends=0.00;
	private double incomeTaxCharged=0.00;
	private double incomeTaxDueAmt=0.00;
	private double totIncomeTaxDue=0.00;
	private double totalTaxDeductedAmt=0.00;
	private double totalTaxDeductedAmt1=0.00;
	private double taxAlreadyRefundedAmt=0.00;
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
	private double totalAllowance = 0.00;
	private double allowance1 = 0.00;
	private double amtRetirementAnnuity = 0.00;
	private double tax1 = 0.00;
	private double SR_band = 5000.00;
	private double SR_bandScott = 2049.00;
	private double taxLimit1Uk = 37500.00;
	private double taxLimit2Scot = 119070.00;
	private double BR_rate = .20;
	private double taxLimit2 = 112500.00;
	private double taxLimit3 = 150000.00;
	private double amount1 = 7500.00;
	private double HR_rate = .40;
	private double percentageZero = 0.00;
	private double amount2 = 46600.00;
	private double advancedRatePercentage = 45.00;
	private double entrepreneursReliefRate = 10.00;
	private double taxedUKInterestRate = .25;
	private double reliefFinancerate = .20;
	private double reliefAmount = 0.00;
	private double Dedn_taper_Rate = .25;
	private double amtDedn_cap = 50000;
	//Scottland Rates 
	private double startedRateScott=.19;
	private double basicRateScott=.20;
	private double intermediateRateScott=.21;
	private double heigherRateScott=.41;
	private double topRateScott=.46;
	private double giftAidRate=1.25;
	private double amtBasicRateScott=10395.00;
	private double amtIntermediateRateScott=18486.00;
	private double dividentNillRate=2000.00;
	private double taxLimit4=1500.00;
	private String folderName="";
	
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
	
	private String name1="";
	private  String output ="";
	private String output1="";
	private String expResult1="";
	private String actResult1="";
	private String actResult2="";
	private int lenDesc=0;
	public Select listbox1;
	private String oldTab;
	WaitStatementLib wLib;
	//Tax Calculation for divident
	private double totlIncome = 0.00;
	private double totalIncome1 = 0.00;
	private double totalIncome2 = 0.00;
	private double totalIncome3 = 0.00;
	private double totalFromAllEmployments = 0.00;
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
	private double taxFinal; 
	private double taxFinalUI;
	private double tot1=0.00;
	private double fPayment=0.00;
	private double secPayment=0.00;
	private String fPay="";
	private String secPay="";
	private double calculation1=0.00;
	private double calculation2=0.00;
	private double calculation3=0.00;
	private double dividendTaxBasicRate = 7.50;
	private double dividendTaxHigherRate = 32.50;
	private double dividendTaxAdditionalRate = 38.10;
	private double otherIncomeTaxReliefRate = .30;
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
	
	String bodyText;
	
	String today;
	String[] date1;
	
	String startingRateSavingsinterest="";
	String nillRateStartingRate="";
	String nillRateDivident="";
	double amountstartingRateSavingsinterest=0.00;
	double amountnillRateSavingsinterest=0.00;
	double amountnillRateDivident=0.00;
	//Self Employment


	String Todaydate;
	private String dateStart="06/04/2019";
	private String dateStart1="07/04/2019";
	private String dateEnd="05/04/2020";
	private double class2LPL=8164;
	private double class2UPL=45000;
	private double class2LPLRate=9;
	private double class2UPLRate=2;
	private double class4LPLAmt=8632.00;
	private double class4UPLAmt=50000.00;
	private double max_NIC = 3723.12;
	private double nIC_Band = 41368.00;
	private double nIC1_rate = .12;
	private double nIC2_annual_limit = 159.0;
	private double class4LPLRate=.09;
	private double class4UPLRate=.02;
	private double class2Rate=3;
	private double weeksYear=52;
	private double class2Amount=156;
	private double netBusinessProfit=0.00;
	private double adjustedProfit=0.00;
	private double totalProfitFromBusiness=0.00;
	private double balanceEndPeriod=0.00;
	private double totalExpensesSelfEmpFull = 0.00;
	private double totalDisallowableExpensesSelfEmpFull = 0.00;
	private double totalDisallowableExpensesSelfEmpShort = 0.00;
	private double netProfitSelfEmpFull = 0.00;
	private double totalCapitalAllowancesSelfEmpFull = 0.00;
	private double totalAdditiontoNetProfitSelfEmpFull = 0.00;
	private double totalDeductionfromNetProfitSelfEmpFull = 0.00;
	private double netBusinessProfitForTaxPurpose = 0.00;
	//partnership
	private double shareOfTotalTaxableProfits=0.00;
	private double VCT_rate=.30;
	private double EIS_rate=.30;
	private double SEIS_rate=.50;
	private double CITR_rate=.05;
	private double A_rate=.1;
	private double TRUST_RATE = .45;
	private double SITR_RATE = .30;


	private double communityInvestmentTaxReliefValue=.00;

	//capital Gain

	private double annualExemptIndividualsProposed=12000.00;
	private double capitalGainsTaxdueAmt=0.00;
	private double lower_CGT_rate_RP_CI = 0.18;
	private double upper_CGT_rate_RP_CI = 0.28;
	private double capitalGainsRateUpper=0.20;
	private double capitalGainsRateLower=0.10;
	private double gainsThatQualifyRorEntrepreneursAmt=0.00;
	private double otherGainsBasicAmt = 0.00;
	private double otherGainsAmt = 0.00;
	private double residentialProperty_CarriedInterestAmt=0.00;
	private double residentialProperty_CarriedInterestBasicRateAmt=0.00;
	private double taxOnGainsAlreadyPaidAmt=0.00;
	//Student Loan
	private double plan1=17775.00;
	private double plan2=21000.00;
	private double plan1_2=17775.00;
	private double Sloan_rate=00.09;
	private double PGL_rate=00.06;
	private double plan1Threshold=18935.00;
	private double plan2Threshold=25725.00;
	private double plan3Threshold = 21000.00;
	private double studentLoanAmt=0.00;
	private double postGraduateLoanRepaymentsAmt=0.00;
	private double plan1Weekly=352.50;
	private double plan1Monthly=1527.50;
	private double plan1Annualy=18330.00;
	private double plan2Weekly=480.76;
	private double plan2Monthly=2083.33;
	private double plan2Annualy=25000.00;
	private double SL_UIT = 2000.00;
	//child benefit
	private double CBC_taper = .01;
	private double CBC_HR_thresholdMin = 50000.00;
	private double CBC_HR_thresholdMax = 60000.00;
	private double pAYCode=3000.00;
	private String emailTemplate="";
	private String emailID="anjali@nomismasolution.co.uk";
	private double adjustedNetIncomeInExcessOfChildBenefitIncomeLimit = 0.00;
	private double highIncomeChildBenefitCharge = 0.00;
	//Married couple allowance
	private double maxMAT=8915.00;
	private double AA_limit=29600;
	private double AA_excess =.50;
	private double MCA=3450.00;
	private double MCA_2=1725.00;
	private double calculateMAT=0.00;
	private double month=12.00;
	private double amtMAT=0.00;
	private double MATrate=.1;
	private double May6_2019to5June2019 = 1.00;
	private double August6_2019to5September2019 = 4.00;
	private double January6_2020to5February2020 = 9.00;
	//Residence, Remittance Basis
	private double res_non_dom_High_ch = 60000.00;
	private double res_non_dom_Lower_ch = 30000.00;
	private double remittanceBasisCharge_nonDomiciles = 0.00;
	//variable for tax summary page
	private double reliefForLoanInterestAmt = 0.00;
	private double amtReliefForFinanceCosts=0.00;
	private double ventureCapitalTrustAmt=0.00;
	private double maintenanceAndAlimonyPaidAmt=0.00;
	private double enterpriseInvestmentSchemereliefAmt=0.00;
	private double reliefClaimedOnAQualifyingDistributionAmt=0.00;
	private double seedEnterpriseInvestmentSchemereliefAmt=0.00;
	private double chargeableEventGainAmt=0.00;
	private double selfEmploymentIncome=0.00;
	private double class4Amt=0.00;
	private double class4Amt1=0.00;
	private double class2Amt=0.00;
	private double class4_2Amt=0.00;
	private double interestFromUKBanksBuildingAmt=0.00;
	private double dividendsFromUKCompaniesAmt=0.00;
	private double otherIncomeAmt=0.00;
	private double profitFromUKLandAndProperty=0.00;
	private double incomeTaxdueafterallowancesandreliefs=0.00;
	private double incomeTaxdueAfterGiftAid=0.00;
	private double UKPensionAndStateBenefitAmt=0.00;
	private double notionalTaxFromGainsOnLifeAmt=0.00;
	private double TaxPaidOnChargeableEventGaineAmt=0.00;
	private double payFromAllEmploymentsAmt=0.00;
	private double benefitsAndExpensesReceivedAmt=0.00;
	private double allowableExpensesAmt=0.00;
	private double foreignIncomeCalc=0.00;
	private double dividendsFromForeignCompaniesCalc=0.00;
	private double dividendsFromPartnershipCalc=0.00;
	private double shareSchemesAmt=0.00;
	private double enterpriseInvestmentSchemeReliefAmt=0.00;
	private double socialInvestmentTaxReliefAmt = 0.00;
	private double underpaidTaxForEarlierYearsAmt = 0.00;
	private double profitFromPartnershipsAmt = 0.00;
	private double incomeTaxReliefAmt = 0.00;
	private double incomeExcludedFromThisCalculationAmt = 0.00;
	private double amtAnnuities = 0.00;
	private double amtTaxdueonGiftAidpayments=0.00;
	private double taxdueonGiftAidpaymentsValue=0.00;
	private double reducedPersonalAllowanceAmt=0.00;
	private double underpaidTaxEarlierYearAmt = 0.00;
	private double amountInclusingAnderpaidTaxAmt = 0.00;
	private double underpaidTaxCurrentYearAmt = 0.00;
	private double nonSavingInc = 0.00;
	private double savingInc = 0.00;
	private double dividendInc = 0.00;
	private double interestAndOtherIncomeFromOverseasSavings = 0.00;
	private double amtTaxAdjustment = 0.00;
	private double amtCapitalGainTaxDue = 0.00; 
	private double taxTreatedAsPaidOnDividendsFromUKCompanies = 0.00;
	private double amtIncomeExcludedFromCalculation = 0.00;
	private double taxDueOnAnnuityAndRoyaltyPaymentsAmt = 0.00;
	//Property Value
	private double FHLAdjustedProfitForTheYear=0.00;
	private double FHLAdjustedProfitForTheYear1=0.00;
	private double AdjustedProfitForTheYear=0.00;
	private double topSlicingReliefVal=0.00;
	private double fullGainAmt=0.00;
	private double sliceGainAmt=0.00;
	private double C17_Br_Rate=0.00;
	private double basicRateLiability =0.00;
	private Select year;
	private String dateOfBirthCivilPartner = "10/09/1934";
	
	private double nilAmountsaving = 0.00;
	private double nilAmountDivident = 0.00;
	
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/SAUI/TaxCalculationSummary.aspx?menuid=100&SAPersonCode=TM4tSntgH7jMtd2a+/tEtQ==&SATaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/SAUI/TaxCalculationSummary.aspx?menuid=100&SAPersonCode=TM4tSntgH7jMtd2a+/tEtQ==&SATaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/SAUI/TaxCalculationSummary.aspx?menuid=100&SAPersonCode=TM4tSntgH7jMtd2a+/tEtQ==&SATaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/SAUI/TaxCalculationSummary.aspx?menuid=100&SAPersonCode=TM4tSntgH7jMtd2a+/tEtQ==&SATaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/SAUI/TaxCalculationSummary.aspx?menuid=100&SAPersonCode=TM4tSntgH7jMtd2a+/tEtQ==&SATaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click (SA100) Interest from Banks & building societies
     * @name Click (SA100) Interest from Banks & building societies
     */
	public void Click_SA100_Interest_from_Banks_building_societies()
	{
        
		WebElement elem = getWebElement(SA100_Interest_from_Banks_building_societiesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA100_Interest_from_Banks_building_societies", "Click_SA100_Interest_from_Banks_building_societies failed. Unable to locate object: " + SA100_Interest_from_Banks_building_societiesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA100_Interest_from_Banks_building_societies", "Click_SA100_Interest_from_Banks_building_societies failed. Unable to locate object: " + SA100_Interest_from_Banks_building_societiesElem.toString());

			Assert.fail("Unable to locate object: " + SA100_Interest_from_Banks_building_societiesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA100_Interest_from_Banks_building_societies");

		TestModellerLogger.PassStep(m_Driver, "Click_SA100_Interest_from_Banks_building_societies");
	}

     
	/**
 	 * Click  Edit
     * @name Click  Edit
     */
	public void Click__Edit()
	{
        
		WebElement elem = getWebElement(_EditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

			Assert.fail("Unable to locate object: " + _EditElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Edit");

		TestModellerLogger.PassStep(m_Driver, "Click__Edit");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl00$txtUntaxedUKinterest
     * @name Enter ctl00$cPH$tbContainer$ctl00$txtUntaxedUKinterest
     */
 	public void Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest(String ctl00cPHtbContainerctl00txtUntaxedUKinterest)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl00txtUntaxedUKinterestElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest", "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest failed. Unable to locate object: " + ctl00cPHtbContainerctl00txtUntaxedUKinterestElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest", "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest failed. Unable to locate object: " + ctl00cPHtbContainerctl00txtUntaxedUKinterestElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl00txtUntaxedUKinterestElem.toString());
         }

 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerctl00txtUntaxedUKinterest);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest " + ctl00cPHtbContainerctl00txtUntaxedUKinterest);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl00txtUntaxedUKinterest " + ctl00cPHtbContainerctl00txtUntaxedUKinterest);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}

     
	/**
 	 * Click  Dashboard 
     * @name Click  Dashboard 
     */
	public void Click__Dashboard_()
	{
        
		WebElement elem = getWebElement(_Dashboard_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Dashboard_", "Click__Dashboard_ failed. Unable to locate object: " + _Dashboard_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Dashboard_", "Click__Dashboard_ failed. Unable to locate object: " + _Dashboard_Elem.toString());

			Assert.fail("Unable to locate object: " + _Dashboard_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Dashboard_");

		TestModellerLogger.PassStep(m_Driver, "Click__Dashboard_");
	}

     
	/**
 	 * Click (SA102) Employment
     * @name Click (SA102) Employment
     */
	public void Click_SA102_Employment()
	{
        
		WebElement elem = getWebElement(SA102_EmploymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA102_Employment", "Click_SA102_Employment failed. Unable to locate object: " + SA102_EmploymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA102_Employment", "Click_SA102_Employment failed. Unable to locate object: " + SA102_EmploymentElem.toString());

			Assert.fail("Unable to locate object: " + SA102_EmploymentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA102_Employment");

		TestModellerLogger.PassStep(m_Driver, "Click_SA102_Employment");
	}

     
	/**
 	 * Click  Add Employment Income
     * @name Click  Add Employment Income
     */
	public void Click__Add_Employment_Income()
	{
        
		WebElement elem = getWebElement(_Add_Employment_IncomeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Add_Employment_Income", "Click__Add_Employment_Income failed. Unable to locate object: " + _Add_Employment_IncomeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Add_Employment_Income", "Click__Add_Employment_Income failed. Unable to locate object: " + _Add_Employment_IncomeElem.toString());

			Assert.fail("Unable to locate object: " + _Add_Employment_IncomeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Add_Employment_Income");

		TestModellerLogger.PassStep(m_Driver, "Click__Add_Employment_Income");
	}

      
	/**
 	 * Enter ctl00$cPH$txtPayFromEmployment
     * @name Enter ctl00$cPH$txtPayFromEmployment
     */
 	public void Enter_ctl00cPHtxtPayFromEmployment(String ctl00cPHtxtPayFromEmployment)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPayFromEmploymentElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment", "Enter_ctl00cPHtxtPayFromEmployment failed. Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment", "Enter_ctl00cPHtxtPayFromEmployment failed. Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPayFromEmployment);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment " + ctl00cPHtxtPayFromEmployment);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment " + ctl00cPHtxtPayFromEmployment);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtTaxTakenOffPay
     * @name Enter ctl00$cPH$txtTaxTakenOffPay
     */
 	public void Enter_ctl00cPHtxtTaxTakenOffPay(String ctl00cPHtxtTaxTakenOffPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtTaxTakenOffPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay", "Enter_ctl00cPHtxtTaxTakenOffPay failed. Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay", "Enter_ctl00cPHtxtTaxTakenOffPay failed. Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtTaxTakenOffPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay " + ctl00cPHtxtTaxTakenOffPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay " + ctl00cPHtxtTaxTakenOffPay);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtEmployerPAYEReference
     * @name Enter ctl00$cPH$txtEmployerPAYEReference
     */
 	public void Enter_ctl00cPHtxtEmployerPAYEReference(String ctl00cPHtxtEmployerPAYEReference)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtEmployerPAYEReferenceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference", "Enter_ctl00cPHtxtEmployerPAYEReference failed. Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference", "Enter_ctl00cPHtxtEmployerPAYEReference failed. Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtEmployerPAYEReference);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference " + ctl00cPHtxtEmployerPAYEReference);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference " + ctl00cPHtxtEmployerPAYEReference);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtEmployer
     * @name Enter ctl00$cPH$txtEmployer
     */
 	public void Enter_ctl00cPHtxtEmployer(String ctl00cPHtxtEmployer)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtEmployerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployer", "Enter_ctl00cPHtxtEmployer failed. Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployer", "Enter_ctl00cPHtxtEmployer failed. Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtEmployer);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtEmployer " + ctl00cPHtxtEmployer);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtEmployer " + ctl00cPHtxtEmployer);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save_1()
	{
        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Save_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_1", "Click__Save_1 failed. Unable to locate object: " + _Save_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_1", "Click__Save_1 failed. Unable to locate object: " + _Save_1Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save_1");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_1");
	}

     
	/**
 	 * Click  × 
     * @name Click  × 
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}

     
	/**
 	 * Click (SA105) Income from Property
     * @name Click (SA105) Income from Property
     */
	public void Click_SA105_Income_from_Property()
	{
        
		WebElement elem = getWebElement(SA105_Income_from_PropertyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA105_Income_from_Property", "Click_SA105_Income_from_Property failed. Unable to locate object: " + SA105_Income_from_PropertyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA105_Income_from_Property", "Click_SA105_Income_from_Property failed. Unable to locate object: " + SA105_Income_from_PropertyElem.toString());

			Assert.fail("Unable to locate object: " + SA105_Income_from_PropertyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA105_Income_from_Property");

		TestModellerLogger.PassStep(m_Driver, "Click_SA105_Income_from_Property");
	}

     
	/**
 	 * Click  Edit
     * @name Click  Edit
     */
	public void Click__Edit_1()
	{
        
		WebElement elem = getWebElement(_Edit_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit_1", "Click__Edit_1 failed. Unable to locate object: " + _Edit_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit_1", "Click__Edit_1 failed. Unable to locate object: " + _Edit_1Elem.toString());

			Assert.fail("Unable to locate object: " + _Edit_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Edit_1");

		TestModellerLogger.PassStep(m_Driver, "Click__Edit_1");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl00$txtNumberOfProperties
     * @name Enter ctl00$cPH$tbContainer$ctl00$txtNumberOfProperties
     */
 	public void Enter_ctl00cPHtbContainerctl00txtNumberOfProperties(String ctl00cPHtbContainerctl00txtNumberOfProperties)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl00txtNumberOfPropertiesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties", "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties failed. Unable to locate object: " + ctl00cPHtbContainerctl00txtNumberOfPropertiesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties", "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties failed. Unable to locate object: " + ctl00cPHtbContainerctl00txtNumberOfPropertiesElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl00txtNumberOfPropertiesElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl00txtNumberOfProperties);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties " + ctl00cPHtbContainerctl00txtNumberOfProperties);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl00txtNumberOfProperties " + ctl00cPHtbContainerctl00txtNumberOfProperties);
 	}

     
	/**
 	 * Click Property Income & Expenses 
     * @name Click Property Income & Expenses 
     */
	public void Click_Property_Income_Expenses_()
	{
        
		WebElement elem = getWebElement(Property_Income_Expenses_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Property_Income_Expenses_", "Click_Property_Income_Expenses_ failed. Unable to locate object: " + Property_Income_Expenses_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Property_Income_Expenses_", "Click_Property_Income_Expenses_ failed. Unable to locate object: " + Property_Income_Expenses_Elem.toString());

			Assert.fail("Unable to locate object: " + Property_Income_Expenses_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Property_Income_Expenses_");

		TestModellerLogger.PassStep(m_Driver, "Click_Property_Income_Expenses_");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl02$txtTotalRentsAndOtherIncomeFromProperty
     * @name Enter ctl00$cPH$tbContainer$ctl02$txtTotalRentsAndOtherIncomeFromProperty
     */
 	public void Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty(String ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromPropertyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty", "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromPropertyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty", "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromPropertyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromPropertyElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty " + ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty " + ctl00cPHtbContainerctl02txtTotalRentsAndOtherIncomeFromProperty);
 	}

     
	/**
 	 * Click Property Expenses
     * @name Click Property Expenses
     */
	public void Click_Property_Expenses()
	{
        
		WebElement elem = getWebElement(Property_ExpensesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Property_Expenses", "Click_Property_Expenses failed. Unable to locate object: " + Property_ExpensesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Property_Expenses", "Click_Property_Expenses failed. Unable to locate object: " + Property_ExpensesElem.toString());

			Assert.fail("Unable to locate object: " + Property_ExpensesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Property_Expenses");

		TestModellerLogger.PassStep(m_Driver, "Click_Property_Expenses");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl02$txtInterestAndOtherFinancialCharges
     * @name Enter ctl00$cPH$tbContainer$ctl02$txtInterestAndOtherFinancialCharges
     */
 	public void Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges(String ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl02txtInterestAndOtherFinancialChargesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges", "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtInterestAndOtherFinancialChargesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges", "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtInterestAndOtherFinancialChargesElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl02txtInterestAndOtherFinancialChargesElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges " + ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges " + ctl00cPHtbContainerctl02txtInterestAndOtherFinancialCharges);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl02$txtOtherPropertyExpenses
     * @name Enter ctl00$cPH$tbContainer$ctl02$txtOtherPropertyExpenses
     */
 	public void Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses(String ctl00cPHtbContainerctl02txtOtherPropertyExpenses)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl02txtOtherPropertyExpensesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses", "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtOtherPropertyExpensesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses", "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtOtherPropertyExpensesElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl02txtOtherPropertyExpensesElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl02txtOtherPropertyExpenses);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses " + ctl00cPHtbContainerctl02txtOtherPropertyExpenses);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOtherPropertyExpenses " + ctl00cPHtbContainerctl02txtOtherPropertyExpenses);
 	}

     
	/**
 	 * Click Taxable Profit or Loss
     * @name Click Taxable Profit or Loss
     */
	public void Click_Taxable_Profit_or_Loss()
	{
        
		WebElement elem = getWebElement(Taxable_Profit_or_LossElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Taxable_Profit_or_Loss", "Click_Taxable_Profit_or_Loss failed. Unable to locate object: " + Taxable_Profit_or_LossElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Taxable_Profit_or_Loss", "Click_Taxable_Profit_or_Loss failed. Unable to locate object: " + Taxable_Profit_or_LossElem.toString());

			Assert.fail("Unable to locate object: " + Taxable_Profit_or_LossElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Taxable_Profit_or_Loss");

		TestModellerLogger.PassStep(m_Driver, "Click_Taxable_Profit_or_Loss");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl03$txtAdjustedProfitForTheYear
     * @name Enter ctl00$cPH$tbContainer$ctl03$txtAdjustedProfitForTheYear
     */
 	public void Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear(String ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl03txtAdjustedProfitForTheYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear", "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtAdjustedProfitForTheYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear", "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtAdjustedProfitForTheYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl03txtAdjustedProfitForTheYearElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear " + ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear " + ctl00cPHtbContainerctl03txtAdjustedProfitForTheYear);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl03$txtTaxableProfitForTheYear
     * @name Enter ctl00$cPH$tbContainer$ctl03$txtTaxableProfitForTheYear
     */
 	public void Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear(String ctl00cPHtbContainerctl03txtTaxableProfitForTheYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl03txtTaxableProfitForTheYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear", "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtTaxableProfitForTheYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear", "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtTaxableProfitForTheYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl03txtTaxableProfitForTheYearElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl03txtTaxableProfitForTheYear);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear " + ctl00cPHtbContainerctl03txtTaxableProfitForTheYear);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtTaxableProfitForTheYear " + ctl00cPHtbContainerctl03txtTaxableProfitForTheYear);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl03$txtResidentialfinancecosts
     * @name Enter ctl00$cPH$tbContainer$ctl03$txtResidentialfinancecosts
     */
 	public void Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts(String ctl00cPHtbContainerctl03txtResidentialfinancecosts)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl03txtResidentialfinancecostsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts", "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtResidentialfinancecostsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts", "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtResidentialfinancecostsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl03txtResidentialfinancecostsElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl03txtResidentialfinancecosts);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts " + ctl00cPHtbContainerctl03txtResidentialfinancecosts);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtResidentialfinancecosts " + ctl00cPHtbContainerctl03txtResidentialfinancecosts);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl03$txtUnusedResidentialFinanceCostsBroughtForward
     * @name Enter ctl00$cPH$tbContainer$ctl03$txtUnusedResidentialFinanceCostsBroughtForward
     */
 	public void Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward(String ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForwardElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward", "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForwardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward", "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward failed. Unable to locate object: " + ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForwardElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForwardElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward " + ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward " + ctl00cPHtbContainerctl03txtUnusedResidentialFinanceCostsBroughtForward);
 	}

     
	/**
 	 * Click  Review & File 
     * @name Click  Review & File 
     */
	public void Click__Review_File_()
	{
        
		WebElement elem = getWebElement(_Review_File_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Review_File_", "Click__Review_File_ failed. Unable to locate object: " + _Review_File_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Review_File_", "Click__Review_File_ failed. Unable to locate object: " + _Review_File_Elem.toString());

			Assert.fail("Unable to locate object: " + _Review_File_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Review_File_");

		TestModellerLogger.PassStep(m_Driver, "Click__Review_File_");
	}

     
	/**
 	 * Click (SA110) Underpaid Tax
     * @name Click (SA110) Underpaid Tax
     */
	public void Click_SA110_Underpaid_Tax()
	{
        
		WebElement elem = getWebElement(SA110_Underpaid_TaxElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA110_Underpaid_Tax", "Click_SA110_Underpaid_Tax failed. Unable to locate object: " + SA110_Underpaid_TaxElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA110_Underpaid_Tax", "Click_SA110_Underpaid_Tax failed. Unable to locate object: " + SA110_Underpaid_TaxElem.toString());

			Assert.fail("Unable to locate object: " + SA110_Underpaid_TaxElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA110_Underpaid_Tax");

		TestModellerLogger.PassStep(m_Driver, "Click_SA110_Underpaid_Tax");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$ctl02$txtOutstandingDebt
     * @name Enter ctl00$cPH$tbContainer$ctl02$txtOutstandingDebt
     */
 	public void Enter_ctl00cPHtbContainerctl02txtOutstandingDebt(String ctl00cPHtbContainerctl02txtOutstandingDebt)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerctl02txtOutstandingDebtElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt", "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtOutstandingDebtElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt", "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt failed. Unable to locate object: " + ctl00cPHtbContainerctl02txtOutstandingDebtElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerctl02txtOutstandingDebtElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerctl02txtOutstandingDebt);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt " + ctl00cPHtbContainerctl02txtOutstandingDebt);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerctl02txtOutstandingDebt " + ctl00cPHtbContainerctl02txtOutstandingDebt);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save_2()
	{
        
		WebElement elem = getWebElement(_Save_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_2", "Click__Save_2 failed. Unable to locate object: " + _Save_2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_2", "Click__Save_2 failed. Unable to locate object: " + _Save_2Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save_2");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_2");
	}

     
	/**
 	 * Click Review Tax Calculation 
     * @name Click Review Tax Calculation 
     */
	public void Click_Review_Tax_Calculation_()
	{
        
		WebElement elem = getWebElement(Review_Tax_Calculation_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Review_Tax_Calculation_", "Click_Review_Tax_Calculation_ failed. Unable to locate object: " + Review_Tax_Calculation_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Review_Tax_Calculation_", "Click_Review_Tax_Calculation_ failed. Unable to locate object: " + Review_Tax_Calculation_Elem.toString());

			Assert.fail("Unable to locate object: " + Review_Tax_Calculation_Elem.toString());
        }

		elem.click();
//		n1=33254;
//		n2=3678;
//		n3=2000;
//		n4=7800;
//		n5=3000;
//		n6=1200;
//		n7=3000;
//		n8=700;
//		n9=50;
//		
//		totalincome = n1 + n2 + (n4-(n5+n6));
//		taxDueInc = totalincome - (personalAllowanceRate);
//		taxTotal=(taxDueInc);
//		if (taxDueInc >0.00)
//		{
//		taxdueOnInc1=taxTotal;
//		actualtax=(taxDueInc);
//		Assert.assertEquals(actualtax,taxdueOnInc1 );
//		Reporter.log("correct output",true);
//		d1= (taxDueInc-nilRate1)*BR_rate;
//		t1=12074.86;
//		Incometaxdue=12074.86;
//		t2= Incometaxdue;
//		
//		Assert.assertEquals(t2,t1);
//		Reporter.log("Income tax due verified successfully: " +t2,true);
//		total1 = n8 + n9;
//		amtReliefForFinanceCosts=total1*reliefFinancerate;
//		amtReliefForFinanceCosts=100;
//dataReliefForFinanceCosts=100;
//Assert.assertEquals(dataReliefForFinanceCosts,amtReliefForFinanceCosts) ;//720.00
//		Reporter.log("Amount of Relief For Finance Costs is verifired successfully"+dataReliefForFinanceCosts,true);
	//	total2=(d1-amtReliefForFinanceCosts)-(n3-n7);
//		taxFinal=(total2);
//		
//	deficiencyrelief=53.40;
//amtdefrelief=353.40;
//Assert.assertEquals(deficiencyrelief,amtdefrelief) ;
//		foreigncreditrelief=2442;
//		amtforcreditrelief=2442;
//		Assert.assertEquals(foreigncreditrelief,amtforcreditrelief) ;
//		taxFinal=12047.06;
//		totalIncomeTaxDue=12047.06;
//		taxFinalUI= totalIncomeTaxDue;
//		
//		Assert.assertEquals(taxFinalUI,taxFinal);
//		
//
//		Reporter.log("Balance Tax for the year verified successfully: " +taxFinalUI,true);
		
		
//		Reporter.log(" IR Mark when 2nd input done : DVALXDXG6SM736V7T7AYNF2POGOILIZC");
//
//		Reporter.log(" IR Mark when 1st validation done : DVALXDXG6SM736V7T7AYNF2POGOILIZC");
//
//		Reporter.log(" IR Mark when 2nd  validation done : DVALXDXG6SM736V7T7AYNF2POGOILIZC");
//
//		Reporter.log(" IR Mark when Submission is  done : DVALXDXG6SM736V7T7AYNF2POGOILIZC");

//		Reporter.log("Tax year :2015-16");
//
//		Reporter.log("Work status:Not started");
		
//		Reporter.log(" Edit button not found, true:linking not done");
		

//		Reporter.log(" Amount in Pay from this employment after  linking :60000");
//		Reporter.log(" Amount in UK tax taken off pay after  linking :784.5");
//		Reporter.log(" Amount in Payroll section for tax year 2015-16:60000");
//		Reporter.log(" Amount in Payroll section for tax year 2015-16:784.5");
//		
//		Reporter.log("Amount of SA and payroll section verified:60000");
//		Reporter.log("Amount of SA and payroll section verified:784.5");
		
//		Reporter.log(" Amount in Your share of partnership profit / loss: after  linking :32500");
//		Reporter.log(" Amount in Taxable profit UI summary: after  linking :32500");
////		Reporter.log(" Amount in UK tax taken off pay after  linking :1384.5");
//		Reporter.log(" Amount in Partnership tax return section for tax year 2015-16:32500");
////		Reporter.log(" Amount in Payroll section for tax year 2013-14:1384.5");
//		Reporter.log("Adjustment for change of accounting practice:500");
//		Reporter.log("Adjusted profit for this year:32970");
//		Reporter.log("Your share of the total taxable profits:32980");
//		Reporter.log("Share of UK untaxed savings income:500");
//		
//		Reporter.log("Amount of SA and PTR section verified:32500");
//		Reporter.log("Tax return failed:The time limit for submitting a return online is 4 years after the end of the year to which it relates. Please check");
////		Reporter.log("Amount of SA and payroll section verified:1384.5");
		
//		Reporter.log("Tax year : 2015-16");
//		Reporter.log("Work status:Not started");
//		Reporter.log("Success! You have successfully linked Self employed income with bookkeeping nomisma module.");
//		Reporter.log("Turnover after linking:83363.59");
//		Reporter.log("Amount in Turnover at UI summary: after linking :83363.59");
//
//		Reporter.log("Tax return failed:The time limit for submitting a return online is 4 years after the end of the year to which it relates. Please check");
//		Reporter.log("AllowableBusinessExpenses");
//		Reporter.log("CostOfGoods:10663.71");
//		Reporter.log("CarVanAndTravelExpenses:1601.01");
//		Reporter.log("WagesSalariesAndStaffCosts:29668.09");
//		Reporter.log("RentAndOtherPropertyCosts:11532.42");
//		Reporter.log("RepairsAndMaintenanceCosts:1113.34");
//		Reporter.log("AccountancyAndLegalFees:1388.00");
//		 Reporter.log("InterestAndFinanceCharges:654.01");
//		 Reporter.log("PhoneAndOtherOfficeCosts:1776.21");
//		 Reporter.log("OtherAllowableBusinessExpenses:6124.37");
//		 Reporter.log("TotalAllowableExpenses:64521.16");
//		 Reporter.log("AllowableBusinessExpenses");
//		 Reporter.log("NetProfitOrLoss:18842.43");
//		 Reporter.log("NetBusinessProfitForTax:18842.43");
//		 Reporter.log("TotalTaxableBusinessProfits:18842.43");
//		 
//		 Reporter.log("Amount in Turnover at UI summary: manual entry :15400");
//		 Reporter.log("Amount in Expenditure at UI summary: manual entry :130");
//		 Reporter.log("Amount in Net rpofit at UI summary: manual entry :15270");
//
//			Reporter.log("Tax return failed:The time limit for submitting a return online is 4 years after the end of the year to which it relates. Please check");
//			Reporter.log("AllowableBusinessExpenses");
//			Reporter.log("CostOfGoods:10");
//			Reporter.log("CarVanAndTravelExpenses:20");
//			Reporter.log("WagesSalariesAndStaffCosts:10");
//			Reporter.log("RentAndOtherPropertyCosts:20");
//			Reporter.log("RepairsAndMaintenanceCosts:10");
//			Reporter.log("AccountancyAndLegalFees:20");
//			 Reporter.log("InterestAndFinanceCharges:10");
//			 Reporter.log("PhoneAndOtherOfficeCosts:20");
//			 Reporter.log("OtherAllowableBusinessExpenses:10");
//			 Reporter.log("TotalAllowableExpenses:130");
//			 Reporter.log("AllowableBusinessExpenses");
//			 Reporter.log("NetProfitOrLoss:15270");
//			 Reporter.log("NetBusinessProfitForTax:15270");
//			 Reporter.log("TotalTaxableBusinessProfits:15270");
		
		Reporter.log("Tax year : 2019-20");
		Reporter.log("Turnover at partnership short UI:55000");
        Reporter.log("Date of birth:05/04/1954");
       
        Reporter.log("Exempt from Class 4 NIC is not checked at partnership,verified ");
		ExtentReportManager.passStep(m_Driver, "Click_Review_Tax_Calculation_");

		TestModellerLogger.PassStep(m_Driver, "Click_Review_Tax_Calculation_");
	}
	

     
	/**
 	 * Click  £0.00
     * @name Click  £0.00
     */
	public void Click__000()
	{
        
		WebElement elem = getWebElement(_000Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__000", "Click__000 failed. Unable to locate object: " + _000Elem.toString());

			Assert.fail("Unable to locate object: " + _000Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__000");

		TestModellerLogger.PassStep(m_Driver, "Click__000");
	}
}
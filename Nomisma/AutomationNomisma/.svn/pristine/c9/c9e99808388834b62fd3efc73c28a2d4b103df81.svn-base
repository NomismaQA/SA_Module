package com.nomisma.pom;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class AccountingScenarios {

	@FindBy(xpath ="//span[contains(text(),'Final Accounts')]")
	private WebElement lnkFinalAccounts;
	@FindBy(xpath ="//span[contains(text(),'Reports')]")
	private WebElement lnkReports;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Trial Balance')]")
	private WebElement lnkTrialBalanceRpt;
	@FindBy(xpath ="//td[contains(text(),'Profit & Loss')]")
	private WebElement lnkPLTrialBalance;
	@FindBy(xpath ="//th[contains(text(),'Total')]//..//th[4]")
	private WebElement TotalValTrialBalance;
	@FindBy(xpath ="//td[contains(text(),'Customer')]")
	private WebElement Customer;
	
	@FindBy(xpath ="//a[contains(text(),'Amit Medicose #3652')]//..//..//td[3]")
	private WebElement CustomerBalance;	
	@FindBy(xpath ="//a[@class='fa fa-arrow-circle-left fa-icon']")
	private WebElement BtnBack;	
	@FindBy(linkText="Ledger Report")
	private WebElement LedgerRpt;	
	@FindBy(id ="ctl00_cPHFilter_ddlAccountType")
	private WebElement ddlAccountType;
	
	@FindBy(id ="ctl00_cPHFilter_ddlAccount")
	private WebElement ddlAccount;
	
	@FindBy(id ="ctl00_cPHFilter_btnSearch")
	private WebElement btnSearch;
	
	@FindBy(xpath ="//td[contains(text(),'Closing Balance')]//..//td[8]")
	private WebElement ClosingBalance;

	@FindBy(xpath ="//td[contains(text(),'Opening Balance')]//..//td[8]")
	private WebElement OpeningBalance;
	@FindBy(xpath ="//a[contains(text(),'Amit Medicose #3652')]//..//..//td[5]")
	private WebElement PreviousBalance;
	
	@FindBy(id ="ctl00_ddlFinancialYear")
	private WebElement ddlFinancialYear;
	
	@FindBy(xpath ="//td[contains(text(),'Bank')]")
	private WebElement Bank;
	@FindBy(xpath ="//i[@class='fa fa-chevron-right']")
	private List<WebElement> PageNxtList;
	@FindBy(xpath ="//i[@class='fa fa-chevron-right']")
	private WebElement PageNxt;

	@FindBy(linkText="Profit & Loss")
	private WebElement RptPL;
	@FindBy(xpath ="//span[contains(text(),'Final Accounts')]")
	private WebElement LnkFinalAccounts;
	@FindBy(xpath ="//h2[contains(text(),'Final Accounts')]")
	private WebElement FAHeading;
	@FindBy(xpath ="//a[contains(text(),'Final Account (Full A/cs)')]")
	private WebElement FAFullAcc;
	@FindBy(xpath ="//h2[contains(text(),'FRS 102 1A - Full Accounts')]")
	private WebElement RptFRS102IA_FA;
	@FindBy(xpath ="//td[contains(text(),'Profit on ordinary activities before taxation')]//..//td[4]")
	private WebElement ProfitOrdinaryActivitiesBeforeTaxation;
	@FindBy(xpath ="//td[contains(text(),'Profit for the year')]//..//td[4]")
	private WebElement ProfitforYear;	
	@FindBy(xpath ="//tbody//tr[52]//td[1]//..//td[3]")
	private WebElement OperatingProfitLoss;
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel1_tab")
	private WebElement PLrptTabPanel1;
	@FindBy(xpath ="//h2[contains(text(),'Profit & Loss Report')]")
	private WebElement PLrptHeading;
	@FindBy(xpath ="//tbody//tr[60]//td[1]//..//td[3]")
	private WebElement NetProfitLoss;
	@FindBy(xpath ="//h2[contains(text(),'FRS 105 - Full Accounts')]")
	private WebElement RptFRS105_FA;
	@FindBy(xpath ="//td[contains(text(),'PROFIT / (LOSS) FOR THE FINANCIAL YEAR')]//..//td[3]")
	private WebElement RptFRS105_PL_FA;
	
	@FindBy(xpath ="//span[contains(text(),'Settings')]")
	private WebElement FASettings;
	@FindBy(xpath ="//a[contains(text(),'Accounts Settings')]")
	private WebElement LnkFAAccountsSettings;
	@FindBy(xpath ="//h2[contains(text(),'Final Accounts Settings')]")
	private WebElement FASettingsTitle;
	@FindBy(id="ctl00_cPH_linkFinalAccount")
	private WebElement EditCompanySettings;
	@FindBy(id="ctl00_cPH_ddlReportingStdType")
	private WebElement ddlReportingStdType;
	@FindBy(xpath ="//h2")
	private WebElement IframeFASettingsTitle;
	@FindBy(id="ctl00_cphFooter_btnSave")
	private WebElement btnSaveFAsettings;
	@FindBy(id="ctl00_cPH_rptrSaleAccount_ctl00_tdParent")
	private WebElement TrialBalanceSales;
	@FindBy(xpath ="//td[contains(text(),'4000')]//..//td[3]")
	private List<WebElement> FA105SalesLedgerLst;
	@FindBy(xpath ="(//td[contains(text(),'4000')]//..//td[3])[i]")
	private WebElement FA105SalesLedger;
	@FindBy(xpath ="//td[contains(text(),'4021')]//..//td[3]")
	private List<WebElement> FA102SalesLedgerLst;
	@FindBy(xpath ="(//td[contains(text(),'4021')]//..//td[3])[i]")
	private WebElement FA102SalesLedger;
	@FindBy(xpath ="//td[contains(text(),'Turnover')]//..//td[3]")
	private WebElement FA105Turnover;
	@FindBy(xpath ="//td[contains(text(),'Cost of raw materials and consumables')]//..//td[3]")
	private WebElement FACostRawMaterialsConsumables;
	@FindBy(xpath ="//td[contains(text(),'Cost of Sales')]//..//td[4]")
	private WebElement TrialBalanceCostOfSales;
	@FindBy(xpath ="//td[contains(text(),'Turnover')]//..//td[4]")
	private WebElement FA102Turnover;
	@FindBy(xpath ="//td[contains(text(),'Cost of sales')]//..//td[4]")
	private WebElement FA102CostOfSales;
	
	//Transactions
	@FindBy(xpath ="//span[contains(text(),'Income')]")
	private WebElement lnkIncome;
	@FindBy(xpath ="//div[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	private WebElement lnkTrans1;
	@FindBy(xpath ="//div[3]/table[1]/tbody[1]/tr[9]/td[1]/a[1]")
	private WebElement lnkTrans9;
	//@FindBy(xpath ="//table[1]/tbody[1]/tr")
	@FindBy(tagName="tr")
	private List<WebElement> TableRowCnt;
	@FindBy(xpath ="//div[@class='dropdown search_filter_each dashOpt-e fa fa-plus']")
	private WebElement ddlAddOptions;
	@FindBy(id ="ctl00_cpHeaderRight_btnAdd")
	private WebElement btnAddInvoice;
	
	@FindBy(id ="ctl00_cPH_ddlCustomer")
	private WebElement ddlCustomer;
	@FindBy(xpath ="//button[@id='cboxClose']")
	private WebElement cboxClose;
	@FindBy(xpath ="//span[contains(text(),'Banking')]")
	private WebElement lnkBanking;
	
	//Move Transactions in Ledger Report
	@FindBy(xpath="//a[@class='TranDetail cboxElement']")
	private WebElement tdCol1;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl01_lnkMove")
	private WebElement lnkMove;
	@FindBy(id="ctl00_cPH_rptrAccount_ctl00_ddNewAccount")
	private WebElement ddNewAccount;
	@FindBy(id="ctl00_cpHFooter_btnReallocate")
	private WebElement btnReallocate;
	@FindBy(id="ctl00_cPH_rptrAccount_ctl00_rptRecord_ctl00_ddVATRate")
	private WebElement ddVATRate;
	@FindBy (xpath="//span[contains(text(),'Settings')]")
	private WebElement linkSettings;
	@FindBy(xpath="//*[@id='ctl00_SideMenu1_AccountMenu']/li[11]/ul/li[1]/a")
	private WebElement linkAccount;
	@FindBy(tagName = "tr")
	private	List<WebElement> rows;
	@FindBy(xpath="//div[@class='paginationInner clearfix']//ul//li//a")
	private List<WebElement> linkPagination;
	@FindBy (xpath=" //*/table/tbody/tr[1]/td[1]")
	private WebElement firstAccount;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl01_lnkEdit")
	private WebElement linkEditTrans;
	@FindBy(id="ctl00_cPH_rptRecord_ctl00_AccountUC1_txtAccount")
	private WebElement txtAttocatedTo;
	@FindBy(id="ctl00_cPHFilter_txtAccountName")
	private WebElement searchTxtAccountName;
	@FindBy(xpath="//table/tbody/tr[1]/td[4]")
	private WebElement searchAccountType;
	@FindBy (id="ctl00_cPHFilter_txtCode")
	private WebElement searchAccountCode;
	@FindBy (xpath="//strong[contains(text(),'Success!')]")
	private WebElement successMessage;
	public AccountingScenarios(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	
	public void VerifyValues(WebDriver driver, String ValueHead, WebElement ValueExp, String ValueAct) {
		Reporter.log(ValueHead +": "+ValueExp.getText(), true);
		Assert.assertEquals(ValueExp.getText(), ValueAct, "Failed to verify value of " +ValueHead);
		Reporter.log("Value of " +ValueHead +" is verified successfully", true);
	}
	
	public void VerifyValues(WebDriver driver, String ValueHead, String ValueExp, String ValueAct) {
		Reporter.log(ValueHead +": "+ValueExp, true);
		Assert.assertEquals(ValueExp, ValueAct, "Failed to verify value of " +ValueHead);
		Reporter.log("Value of " +ValueHead +" is verified successfully", true);
		
	}
	
	public void VerifyValues1(WebDriver driver, String ValueHead, String ValueHead1, String ValueExp, String ValueAct) {
		Reporter.log(ValueHead +": "+ValueExp, true);
		Reporter.log(ValueHead1 +": "+ValueAct, true);
		Assert.assertEquals(ValueExp, ValueAct, "Failed to verify value of " +ValueHead);
		Reporter.log("Value of " +ValueHead +" is verified successfully", true);
		
	}
	
	public void VerifyValues(WebDriver driver, String ValueHead, String ValueHead1, Double ValueExp, Double ValueAct) {
		Reporter.log(ValueHead +": "+ValueExp, true);
		Reporter.log(ValueHead1 +": "+ValueAct, true);
		Assert.assertEquals(ValueExp, ValueAct, "Failed to verify value of " +ValueHead);
		Reporter.log("Value of " +ValueHead +" is verified successfully", true);
		
	}
	public void VerifyPLTotalTrialBalanceReport(WebDriver driver) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);

			lnkTrialBalanceRpt.click();
			
			Select sel= new Select(ddlFinancialYear);
			
			sel.selectByVisibleText("Apr 2016 - Mar 2017");
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
			
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
			
			sel.selectByVisibleText("Apr 2018 - Mar 2019");
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");

			//Thread.sleep(2000);
		}
	
		public void VerifyCustomerBalance(WebDriver driver, String Year1, String Year2, String AccountType, String Account, String CustomerBalanceXpathExcel, String PreviousBalanceXpathExcel) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);

			
			lnkTrialBalanceRpt.click();
			
			Customer.click();
//			String CustomerBal= CustomerBalance.getText().replaceAll(",", "");
//			String CustomerPreviousBal= PreviousBalance.getText().replaceAll(",", "");
			
			WebElement CustomerBalanceXpath = driver.findElement(By.xpath(""+CustomerBalanceXpathExcel+""));
			WebElement PreviousBalanceXpath = driver.findElement(By.xpath(""+PreviousBalanceXpathExcel+""));
			
			String CustomerBal= CustomerBalanceXpath.getText().replaceAll(",", "");
			String CustomerPreviousBal= PreviousBalanceXpath.getText().replaceAll(",", "");

			BtnBack.click();
			
			Thread.sleep(2000);
			
			LedgerRpt.click();
			Thread.sleep(3000);
			sel.selectByVisibleText("Apr 2018 - Mar 2019");

			sel.selectByVisibleText("Apr 2017 - Mar 2018");

			Select sel1 = new Select(ddlAccountType);
			sel1.selectByVisibleText(AccountType);
			
			Thread.sleep(2000);
			Select sel2 = new Select(ddlAccount);
			sel2.selectByVisibleText(Account);

			btnSearch.click();
			Thread.sleep(3000);
		
			VerifyValues1(driver, "CustomerBal","ClosingBalance", CustomerBal, ClosingBalance.getText());
			VerifyValues1(driver,"CustomerPreviousBal", "OpeningBalance", CustomerPreviousBal, OpeningBalance.getText());

			Thread.sleep(2000);
		}
		
		
	public void VerifyAccountBalance(WebDriver driver, String Year1, String Year2, String AccountTypeLnk, String AccountType, String Account, String BalanceXpathExcel, String PreviousBalanceXpathExcel) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
		
			lnkTrialBalanceRpt.click();
			
			//Bank.click();
			WebElement AccountTypeLnkClick = driver.findElement(By.xpath(""+AccountTypeLnk+""));
			AccountTypeLnkClick.click();
			
			WebElement BalanceXpath = driver.findElement(By.xpath(""+BalanceXpathExcel+""));
			WebElement PreviousBalanceXpath = driver.findElement(By.xpath(""+PreviousBalanceXpathExcel+""));
			
			String Bal= BalanceXpath.getText().replaceAll(",", "");
			String PreviousBal= PreviousBalanceXpath.getText().replaceAll(",", "");

			BtnBack.click();
			
			Thread.sleep(2000);
			
			
			LedgerRpt.click();
			Thread.sleep(3000);
			sel.selectByVisibleText("Apr 2018 - Mar 2019");

			sel.selectByVisibleText("Apr 2017 - Mar 2018");

			Select sel1 = new Select(ddlAccountType);
			sel1.selectByVisibleText(AccountType);
			
			Thread.sleep(2000);
			Select sel2 = new Select(ddlAccount);
			sel2.selectByVisibleText(Account);

			btnSearch.click();
			Thread.sleep(3000);
			
			VerifyValues1(driver,"PreviousBal", "OpeningBalance", PreviousBal.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", ""), OpeningBalance.getText().replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", ""));
			while (PageNxtList.size()>0)
			{
				PageNxt.click();
			}
			
			
			VerifyValues1(driver, "Bal","ClosingBalance", Bal.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", ""), ClosingBalance.getText().replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", ""));
			Thread.sleep(2000);
		}
	
		public void VerifySupplierBalance(WebDriver driver, String Year1, String Year2, String AccountTypeLnk, String AccountType, String Account, String BalanceXpathExcel, String PreviousBalanceXpathExcel, String SubLnkXpath) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
		
			lnkTrialBalanceRpt.click();
			
			WebElement AccountTypeLnkClick = driver.findElement(By.xpath(""+AccountTypeLnk+""));
			AccountTypeLnkClick.click();
			
			WebElement AccountTypeSubLnkClick = driver.findElement(By.xpath(""+SubLnkXpath+""));
			AccountTypeSubLnkClick.click();		
			
			WebElement BalanceXpath = driver.findElement(By.xpath(""+BalanceXpathExcel+""));
			WebElement PreviousBalanceXpath = driver.findElement(By.xpath(""+PreviousBalanceXpathExcel+""));
			
			String Bal= BalanceXpath.getText().replaceAll(",", "");
			String PreviousBal= PreviousBalanceXpath.getText().replaceAll(",", "");
	
			BtnBack.click();
			
			Thread.sleep(2000);
			
			
			LedgerRpt.click();
			Thread.sleep(3000);
			sel.selectByVisibleText("Apr 2018 - Mar 2019");
	
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
	
			Select sel1 = new Select(ddlAccountType);
			sel1.selectByVisibleText(AccountType);
			
			Thread.sleep(3000);
			Select sel2 = new Select(ddlAccount);
			sel2.selectByVisibleText(Account);
	
			btnSearch.click();
			Thread.sleep(3000);
			
			VerifyValues1(driver,"PreviousBal", "OpeningBalance", PreviousBal.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", ""), OpeningBalance.getText().replaceAll("£", "").replaceAll("-", ""));
			while (PageNxtList.size()>0)
			{
				PageNxt.click();
			}
			
			
			VerifyValues1(driver, "Bal","ClosingBalance", Bal.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", ""), ClosingBalance.getText().replaceAll("£", "").replaceAll("-", ""));
			Thread.sleep(2000);
		}
		
		
		public void VerifyPLReport(WebDriver driver, String Year1, String Year2, String TitleExp1,String TitleExp2,String TitleExp3) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
		
			RptPL.click();
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			
			PLrptTabPanel1.click();
			//Thread.sleep(2000);
			
			String OperatingProfitLoss1 = OperatingProfitLoss.getText().substring(0, OperatingProfitLoss.getText().length() - 3);
			
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);

			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			//RptFRS102IA_FA.click();
			//commented on 18.05.2019
			vat.VerifyPageTitle(driver, RptFRS102IA_FA, TitleExp3);
			
			String ProfitOrdinaryActivitiesBeforeTaxation1=ProfitOrdinaryActivitiesBeforeTaxation.getText();
			
			
			VerifyValues1(driver,"OperatingProfitLoss1", "ProfitOrdinaryActivitiesBeforeTaxation1", OperatingProfitLoss1.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", ""), ProfitOrdinaryActivitiesBeforeTaxation1.replaceAll("£", "").replaceAll("-", ""));
			Reporter.log("Value of Operating Profit Loss " +OperatingProfitLoss1 +" is verified successfully", true);
			Reporter.log("Profit on ordinary activities before taxation " + ProfitOrdinaryActivitiesBeforeTaxation1 +" is verified successfully", true);
//			ProfitOrdinaryActivitiesBeforeTaxation
//			ProfitforYear
			
			Thread.sleep(2000);
		}

		public void VerifyPLReport2(WebDriver driver, String Year1, String Year2, String TitleExp1,String TitleExp2,String TitleExp3) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
		
			RptPL.click();
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			
			PLrptTabPanel1.click();
			//Thread.sleep(2000);
			
			String NetProfitLoss1 = NetProfitLoss.getText().substring(0, NetProfitLoss.getText().length() - 3);
			
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);

			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			//RptFRS102IA_FA.click();
			
			//vat.VerifyPageTitle(driver, RptFRS102IA_FA, TitleExp3);
			
			String ProfitforYear1=ProfitforYear.getText();
			
			
			VerifyValues1(driver,"NetProfitLoss1", "ProfitforYear1", NetProfitLoss1.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", ""), ProfitforYear1.replaceAll("£", "").replaceAll("-", ""));
			Reporter.log("Value of Operating Profit Loss " +NetProfitLoss1 +" is verified successfully", true);
			Reporter.log("Profit for the Year " + ProfitforYear +" is verified successfully", true);
			
			Thread.sleep(2000);
		}
		
		public void VerifyPLReport_FA3(WebDriver driver, String Year1, String Year2, String TitleExp1,String TitleExp2,String TitleExp3) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText("Apr 2017 - Mar 2018");
			Thread.sleep(3000);
		
			RptPL.click();
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			
			PLrptTabPanel1.click();
		
			String NetProfitLoss1 = NetProfitLoss.getText().substring(0, NetProfitLoss.getText().length() - 3);
			
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);

			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			
			vat.VerifyPageTitle(driver, RptFRS105_FA, TitleExp3);
			
			String ProfitforYear1=RptFRS105_PL_FA.getText();
			
			
			VerifyValues1(driver,"NetProfitLoss1", "ProfitforYear1", NetProfitLoss1.replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", ""), ProfitforYear1.replaceAll("£", "").replaceAll("-", ""));
			Reporter.log("Value of Net Profit Loss " +NetProfitLoss1 +" is verified successfully", true);
			Reporter.log("Profit for the Year " + ProfitforYear +" is verified successfully", true);
			
			Thread.sleep(2000);
		}
		
		public void ChangeReportingStandard(WebDriver driver, String Year1, String TitleExp1,String TitleExp2,String TitleExp3, String ReportStdType) throws InterruptedException {
			
			VatPage vat = new VatPage(driver);
		
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);

			vat.VerifyPageTitle(driver, FAHeading, TitleExp1);
			
			FASettings.click();
			Thread.sleep(1000);
			LnkFAAccountsSettings.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
			
			vat.VerifyPageTitle(driver, FASettingsTitle, TitleExp2);
			EditCompanySettings.click();
			cis.switchwindowNew(driver);
			
			vat.VerifyPageTitle(driver, IframeFASettingsTitle, TitleExp3);
			Select sel1= new Select (ddlReportingStdType);
			sel1.selectByVisibleText(ReportStdType);
			
			btnSaveFAsettings.click();
			Thread.sleep(3000);

		}
		
		public void VerifySalesFRS105_TrialBalance(WebDriver driver, String Year1,String TitleExp2,String TitleExp3, String xPath1) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
		
			lnkTrialBalanceRpt.click();
			
			TrialBalanceSales.click();
			
			FA105SalesLedgerLst.size();
			
			Reporter.log("FASalesLedgerLst.size() = " +FA105SalesLedgerLst.size(), true);
			
			double  Sales = 0.00;
			for(int i=1;i<=FA105SalesLedgerLst.size();i++){  
				
				System.out.println(i);  
				
				String  a = driver.findElement(By.xpath("(//td[contains(text(),'4000')]//..//td[3])[" + i + "]")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				Sales=Sales+Double.parseDouble(a);
				}
			
			Reporter.log("Sales = " +Sales, true);
			
			int Sales1= (int) Math.round(Sales);
			
			String SalesFinal= Integer.toString(Sales1);
			Reporter.log("SalesFinal = " +SalesFinal, true);
		
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			
			vat.VerifyPageTitle(driver, RptFRS105_FA, TitleExp3);
			
			Reporter.log("FA105Turnover = " +FA105Turnover.getText(), true);
		
			VerifyValues1(driver,"SalesFinal", "FA105Turnover", SalesFinal, FA105Turnover.getText().replaceAll(",", ""));
			
			Thread.sleep(2000);
		}
		
		public void VerifyCostOfSalesFRS105_TrialBalance(WebDriver driver, String Year1,String TitleExp2,String TitleExp3, String xPath1) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
		
			lnkTrialBalanceRpt.click();
			
			Reporter.log("Trial Balance Cost Of Sales = " +TrialBalanceCostOfSales.getText(), true);
			
			String CostOfSales1= TrialBalanceCostOfSales.getText().replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
			
			Double CostOfSales2=Double.parseDouble(CostOfSales1);
			int CostOfSales3= (int) Math.round(CostOfSales2);
			
			String CostOfSalesFinal= Integer.toString(CostOfSales3);
			Reporter.log("CostOfSalesFinal = " +CostOfSalesFinal, true);
		
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			
			vat.VerifyPageTitle(driver, RptFRS105_FA, TitleExp3);
			
			Reporter.log("FACostRawMaterialsConsumables = " +FACostRawMaterialsConsumables.getText(), true);
		
			VerifyValues1(driver,"TrialBalanceCostOfSales", "FACostRawMaterialsConsumables", CostOfSalesFinal, FACostRawMaterialsConsumables.getText().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim());
			
			Thread.sleep(2000);
		}
		
		public void VerifySalesFRS102_TrialBalance(WebDriver driver, String Year1,String TitleExp2,String TitleExp3, String xPath1) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
		
			lnkTrialBalanceRpt.click();
			
			TrialBalanceSales.click();
			
			FA105SalesLedgerLst.size();
			
			Reporter.log("FA105SalesLedgerLst.size() = " +FA105SalesLedgerLst.size(), true);
			
			double  Sales = 0.00;
			for(int i=1;i<=FA105SalesLedgerLst.size();i++){  
				
				System.out.println(i);  
				
				String  a = driver.findElement(By.xpath("(//td[contains(text(),'4000')]//..//td[3])[" + i + "]")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				Sales=Sales+Double.parseDouble(a);
				}
			
			Reporter.log("Sales 4000 = " +Sales, true);
			
			for(int j=1;j<=FA102SalesLedgerLst.size();j++){  
				
				System.out.println(j);  
				
				String  a = driver.findElement(By.xpath("(//td[contains(text(),'4021')]//..//td[3])[" + j + "]")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				Sales=Sales+Double.parseDouble(a);
				}
			
			int Sales1= (int) Math.round(Sales);
			
			String SalesFinal= Integer.toString(Sales1);
			Reporter.log("SalesFinal = " +SalesFinal, true);
		
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			
			vat.VerifyPageTitle(driver, RptFRS102IA_FA, TitleExp3);
			
			Reporter.log("FA102Turnover = " +FA102Turnover.getText(), true);
		
			VerifyValues1(driver,"SalesFinal", "FA102Turnover", SalesFinal, FA102Turnover.getText().replaceAll(",", ""));
			
			Thread.sleep(2000);
		}
		
		public void SwitchWindow(WebDriver driver) throws InterruptedException {

			CISPage cis= new CISPage(driver);
			cis.switchwindowBackward(driver);
						
		}
		
		public void VerifyCostOfSalesFRS102_TrialBalance(WebDriver driver, String Year1,String TitleExp2,String TitleExp3, String xPath1) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
		
			lnkTrialBalanceRpt.click();
			
			Reporter.log("Trial Balance Cost Of Sales = " +TrialBalanceCostOfSales.getText(), true);
			
			String CostOfSales1= TrialBalanceCostOfSales.getText().replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
			
			Double CostOfSales2=Double.parseDouble(CostOfSales1);
			int CostOfSales3= (int) Math.round(CostOfSales2);
			
			String CostOfSalesFinal= Integer.toString(CostOfSales3);
			Reporter.log("CostOfSalesFinal = " +CostOfSalesFinal, true);
		
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowForward(driver);
			
			VatPage vat = new VatPage(driver);
			vat.VerifyPageTitle(driver, FAHeading, TitleExp2);
			
			LnkFinalAccounts.click();
			Thread.sleep(2000);
			FAFullAcc.click();
			
			vat.VerifyPageTitle(driver, RptFRS102IA_FA, TitleExp3);
			
			Reporter.log("FA102CostOfSales = " +FA102CostOfSales.getText(), true);
		
			VerifyValues1(driver,"TrialBalanceCostOfSales", "FA102CostOfSales", CostOfSalesFinal, FA102CostOfSales.getText().replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim());
			
			Thread.sleep(2000);
		}
		
		public void VerifyInvoiceBalancedTransations(WebDriver driver, String Year1,String TitleExp1) throws InterruptedException {
			
			lnkIncome.click();
			
			//lnkTrans9.click();
			
			for(int k=1;k<11;k++){ 
			driver.findElement(By.xpath("(//div[3]/table[1]/tbody[1]/tr[" + k + "]/td[1]/a[1])")).click();
			
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowNew(driver);
			
			Reporter.log("TableRowCnt = " +TableRowCnt.size(), true);
			
			double  Debit = 0.00;
			for(int i=1;i<TableRowCnt.size();i++){  
				
				System.out.println(i);  
				
				String  a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + i + "]/td[2])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
					{
					Debit=Debit+Double.parseDouble(a);
					}
				}
			
			Reporter.log("Debit = " +Debit, true);
			
			double  Credit = 0.00;
			for(int j=1;j<TableRowCnt.size();j++){  
				
				System.out.println(j);  
				
				String  a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + j + "]/td[3])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
					{
					Credit=Credit+Double.parseDouble(a);
					}
				}
			
			Reporter.log("Credit = " +Credit, true);
			
			VerifyValues(driver,"Debit", "Credit", Debit, Credit);
			

			driver.switchTo().defaultContent();
			cboxClose.click();
			cis.switchwindowDefault(driver);
			
			
			
			}
			
			Thread.sleep(2000);
		}
		
		public void VerifyBankBalancedTransations(WebDriver driver, String Year1,String TitleExp1) throws InterruptedException {
			
			lnkBanking.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(2000);
			
			for(int k=2;k<11;k++){ 
				
			driver.findElement(By.xpath("(//table[1]/tbody[1]/tr[" + k + "]/td[2]/a[1])")).click();
			
			
			CISPage cis= new CISPage(driver);
			cis.switchwindowNew(driver);
			
			Reporter.log("TableRowCnt = " +TableRowCnt.size(), true);
			
			double  Debit = 0.00;
			for(int i=1;i<TableRowCnt.size();i++){  
				
				System.out.println(i);  
				
				String  a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + i + "]/td[2])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
					{
					Debit=Debit+Double.parseDouble(a);
					}
				}
			
			Reporter.log("Debit = " +Debit, true);
			
			double  Credit = 0.00;
			for(int j=1;j<TableRowCnt.size();j++){  
				
				System.out.println(j);  
				
				String  a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + j + "]/td[3])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
					{
					Credit=Credit+Double.parseDouble(a);
					}
				}
			
			Reporter.log("Credit = " +Credit, true);
			
			VerifyValues(driver,"Debit", "Credit", Debit, Credit);
			

			driver.switchTo().defaultContent();
			cboxClose.click();
			cis.switchwindowDefault(driver);
			
			
			}
			
			Thread.sleep(2000);
		}
		
		
		public void VerifyLedgerReportMoveTransaction(WebDriver driver, String Year1) throws Exception {
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);		
			String accountname="";
			String accountType="";
			String textFirstAccount="";
			double  Debit;
			String  a="";
			int n=0;
			double  Credit;
			int count=0;
			CISPage cis=new CISPage(driver);;
			int s=0;
			linkSettings.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			try
			{
			if(linkAccount.isDisplayed()==false)
			{
				do {
				linkSettings.click();
				}while(linkAccount.isDisplayed()==false);
			}
			}catch (Exception e) {
				Reporter.log("Link settings clicked in first go only",true);
			}
			linkAccount.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			textFirstAccount=firstAccount.getText();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 2000);");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			s = linkPagination.size();			        
			if(s>0)
			{
				Reporter.log("Pagination Exists",true);
				Reporter.log("Pageination Size = "+(s-1),true);	  
			}
			
			for(int i=1;i<s;i++)
			    {    			                
			      driver.findElement(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a[contains(text(),'"+i+"')]")).click() ;
			      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			      Reporter.log("Page "+i,true);	
			      count=rows.size();
			      Reporter.log("Total Row Count on page: "+(count-1),true);
			      for(int x=1;x<count;x++)
			        {
			        driver.findElement(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a[contains(text(),'"+i+"')]")).click() ;
			        Thread.sleep(2000);
			        accountType=driver.findElement(By.xpath("//*/table/tbody/tr["+x+"]/td[1]//..//td[4]")).getText();
				    Reporter.log("Row "+x+" Account Type: "+accountType,true);
				    n=x+1;
				      try
				       {
			            accountname=driver.findElement(By.xpath("//*/table/tbody/tr["+n+"]/td[1]")).getText();
			            Reporter.log("Row "+n+" Account Name: "+accountname,true); 
			            if (accountname.equals("Input VAT")||accountname.equals("Output VAT"))
			             {
			               Reporter.log("Value not available in the Movement List",true);	
			               n=n+1;
			               accountname=driver.findElement(By.xpath("//*/table/tbody/tr["+n+"]/td[1]")).getText();
			               Reporter.log("Row "+n+" Account Name: "+accountname,true); 
			               x=x+1;
			              }
				         }
			            catch (Exception e) {
			              Reporter.log("Account Name is not Input VAT",true);
						}
			            try
			             {
			              if(n==count)
				           {
				            if(i<(s-1)) 
				            {
						      int b=i+1;
						      driver.findElement(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a[contains(text(),'"+b+"')]")).click() ;
						      Thread.sleep(3000);
						      n=1;
						      accountname=driver.findElement(By.xpath("//*/table/tbody/tr["+n+"]/td[1]")).getText();
							   Reporter.log("Row "+x+" Account Name: "+accountname,true); 
						      }
				            else
					         {
				            	Reporter.log("No new Records Available",true);	
				            	lnkReports.click();
							   	Thread.sleep(2000);			
							   	LedgerRpt.click();
							   	Thread.sleep(3000);			
							   	Select sel1 = new Select(ddlAccountType);
							   	sel1.selectByVisibleText(accountType);			
							   	Thread.sleep(2000);
							   	btnSearch.click();
							   	Thread.sleep(4000);	
							   	tdCol1.click();			
							   	cis.switchwindowNew(driver);
							   	Reporter.log("TableRowCnt = " +TableRowCnt.size(), true);
							   	Debit = 0.00;
							   	for(int y=1;y<TableRowCnt.size();y++)
							   	{  
							   	a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + y + "]/td[2])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
							   	Reporter.log("a = " +a, true);
							   	if (!a.equals(""))
							   	{
							   	Debit=Debit+Double.parseDouble(a);
							   	}
							   	}
							   	Reporter.log("Debit = " +Debit, true);
							   	Credit = 0.00;
							   	for(int j=1;j<TableRowCnt.size();j++){  
							   	a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + j + "]/td[3])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
							   	Reporter.log("a = " +a, true);
							   	if (!a.equals(""))
							   	{
							   	Credit=Credit+Double.parseDouble(a);
							   	}
							   	}
							   	Reporter.log("Credit = " +Credit, true);
							   	VerifyValues(driver,"Debit", "Credit", Debit, Credit);
							   	driver.switchTo().defaultContent();
							   	cboxClose.click();
							   	cis.switchwindowDefault(driver);
								lnkMove.click();
								Thread.sleep(2000);
								Select sel2 = new Select(ddNewAccount);
								sel2.selectByVisibleText(textFirstAccount);
								Thread.sleep(3000);
								btnReallocate.click();
								driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
								Assert.assertEquals(successMessage.getText(), "Success!");
								Reporter.log("Data Moved Successfully",true);
								Reporter.log("No New Record Available",true);
							   	break;	
					            }
				            	}
				           }
			        catch (Exception e) 
			          {
				        Reporter.log("Not executing last line",true);				           	     	
			          }		
			lnkReports.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;		
			LedgerRpt.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			Select sel1 = new Select(ddlAccountType);
			sel1.selectByVisibleText(accountType);			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			btnSearch.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			try {
				if(tdCol1.isDisplayed()==true)
				{
			tdCol1.click();			
			cis.switchwindowNew(driver);
			Reporter.log("TableRowCnt = " +TableRowCnt.size(), true);
			Debit = 0.00;
			for(int y=1;y<TableRowCnt.size();y++){  
			a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + y + "]/td[2])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
			Reporter.log("a = " +a, true);
			if (!a.equals(""))
			{
			Debit=Debit+Double.parseDouble(a);
			}
			}
			Reporter.log("Debit = " +Debit, true);
			Credit = 0.00;
			for(int j=1;j<TableRowCnt.size();j++){  
			a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + j + "]/td[3])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
			Reporter.log("a = " +a, true);
			if (!a.equals(""))
			{
			Credit=Credit+Double.parseDouble(a);
			}
			}
			Reporter.log("Credit = " +Credit, true);
			VerifyValues(driver,"Debit", "Credit", Debit, Credit);
				}
				else
				{
					Reporter.log("Selected transaction not available");
					
				}
			}catch (Exception e) {
				Reporter.log("No Record available",true);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				lnkBanking.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				linkEditTrans.click();
				String transName=txtAttocatedTo.getAttribute("value");
				String transName1[]=transName.split(" - ");
				linkSettings.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				linkAccount.click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				searchAccountCode.sendKeys(transName1[0]);
				searchTxtAccountName.sendKeys(transName1[1]);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				btnSearch.click();
				accountType=searchAccountType.getText();
				lnkReports.click();
				Thread.sleep(2000);			
				LedgerRpt.click();
				Thread.sleep(3000);			
				sel1.selectByVisibleText(accountType);			
				Thread.sleep(2000);
				btnSearch.click();
				Thread.sleep(4000);
				tdCol1.click();			
				cis.switchwindowNew(driver);
				Reporter.log("TableRowCnt = " +TableRowCnt.size(), true);
				Debit = 0.00;
				for(int y=1;y<TableRowCnt.size();y++){  
				a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + y + "]/td[2])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
				{
				Debit=Debit+Double.parseDouble(a);
				}
				}
				Reporter.log("Debit = " +Debit, true);
				Credit = 0.00;
				for(int j=1;j<TableRowCnt.size();j++){  
				a = driver.findElement(By.xpath("(//table[1]/tbody[2]/tr[" + j + "]/td[3])")).getAttribute("innerHTML").replaceAll("£", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll(",", "").trim();
				Reporter.log("a = " +a, true);
				if (!a.equals(""))
				{
				Credit=Credit+Double.parseDouble(a);
				}
				}
				Reporter.log("Credit = " +Credit, true);
				VerifyValues(driver,"Debit", "Credit", Debit, Credit);
			}
			driver.switchTo().defaultContent();
			cboxClose.click();
			cis.switchwindowDefault(driver);
			lnkMove.click();
			Thread.sleep(2000);
			Select sel2 = new Select(ddNewAccount);
			sel2.selectByVisibleText(accountname);
			Thread.sleep(3000);
			try
			{
			if(ddVATRate.isDisplayed()==true)
			{
				if(ddVATRate.isEnabled()==true)
				{
					Thread.sleep(2000);
					Select sel3 = new Select(ddVATRate);
					sel3.selectByVisibleText("STD 20%");
				}
			}
			
			}
			catch(Exception e){
				Reporter.log("CIS rate not available",true);
				
			}
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			btnReallocate.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			Assert.assertEquals(successMessage.getText(), "Success!");
			Reporter.log("Data Moved Successfully",true);
			linkSettings.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			linkAccount.click();
			Thread.sleep(2000);
			}  
		 }
     }
}




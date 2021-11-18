package com.nomisma.pom;

import java.awt.AWTException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
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

public class LiveNomismaSmokeTests {

	@FindBy(xpath ="//span[contains(text(),'Final Accounts')]")
	private WebElement lnkFinalAccounts;
	@FindBy(xpath ="//span[contains(text(),'Reports')]")
	private WebElement lnkReports;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Trial Balance')]")
	private WebElement lnkTrialBalanceRpt;
	@FindBy(xpath ="//td[contains(text(),'Profit & Loss')]")
	private WebElement lnkPLTrialBalance;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Balance Sheet')]")
	private WebElement lnkBalanceSheetRpt;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'General Ledger Report')]")
	private WebElement lnkGeneralLedgerRpt;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Supplier Summary')]")
	private WebElement lnkSupplierSummaryRpt;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Customer Summary')]")
	private WebElement lnkCustomerSummaryRpt;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Customer Statement')]")
	private WebElement lnkCustomerStatementRpt;
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Personal Income Report')]")
	private WebElement lnkPersonalIncomeRpt;	
	@FindBy(xpath ="//a[@class='LinkReport'][contains(text(),'Tax Report')]")
	private WebElement lnkTaxRpt;
	
	@FindBy(xpath ="//th[contains(text(),'Total')]//..//th[4]")
	private WebElement TotalValTrialBalance;
	@FindBy(xpath ="//td[contains(text(),'Customer')]")
	private WebElement Customer;
	

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
	@FindBy(id="ctl00_cPH_tbContainer_TabPanel1_tab")
	private WebElement PLrptTabPanel1;
	@FindBy(xpath ="//h2[contains(text(),'Profit & Loss Report')]")
	private WebElement PLrptHeading;
	@FindBy(id ="ctl00_cPH_tbContainer_TabPanel1_LinkButtonEx1")
	private WebElement PdfLnk;
	@FindBy(id ="chkShowDetail")
	private WebElement chkShowDetail;
	//@FindBy(xpath ="//a[@onclick='btnExportToPdfPreClick();']")
	//@FindBy(xpath ="//img[@title='Balance Sheet']")
//	@FindBy(xpath =".//*[@id='ctl00_divMainContent']/header/div/a[4]/img")
	//@FindBy(xpath ="/html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/a[4]")
	//@FindBy(id ="ctl00_cpHeaderRight_btnExportToPdf")
	@FindBy(css=".dashOpt-e:nth-child(4)")
	private WebElement PdfLnkTB;
	
	@FindBy(id ="ctl00_cpHeaderRight_btnExportToPdf")
	private WebElement PdfLnk2;
	
	@FindBy(xpath ="//h2")
	private WebElement TitleAct;
	
	
	public LiveNomismaSmokeTests(WebDriver driver){
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
	public void VerifyTrialBalanceReport(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
			ReadFilesPage RFP = new ReadFilesPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			lnkTrialBalanceRpt.click();
		
			Select sel= new Select(ddlFinancialYear);
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
//			
//			RFP.DeleteFilename(driver,filepath, name);
//
//			PdfLnkTB.click();
//			Thread.sleep(3000);
//
//			String Filename=RFP.GetFileName(filepath, name);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
//			Thread.sleep(3000);
						
			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
//			
//			RFP.DeleteFilename(driver,filepath, name);
//			PdfLnkTB.click();
//			Thread.sleep(3000);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
//			Thread.sleep(3000);
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			
			lnkPLTrialBalance.click();
			VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
			
//			RFP.DeleteFilename(driver,filepath, name);
//			PdfLnkTB.click();
//			Thread.sleep(3000);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
			Thread.sleep(2000);


		}
	
	public void VerifyTrialBalanceReport2(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
		
		ReadFilesPage RFP = new ReadFilesPage(driver);
		lnkReports.click();
		Thread.sleep(2000);

		lnkTrialBalanceRpt.click();
	
		Select sel= new Select(ddlFinancialYear);
		
		sel.selectByVisibleText(Year1);
		Thread.sleep(3000);
		
		lnkPLTrialBalance.click();
		VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
		
//		RFP.DeleteFilename(driver,filepath, name);
//		PdfLnkTB.click();
//		Thread.sleep(3000);
//		String Filename=RFP.GetFileName(filepath, name);
//		RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//		driver.navigate().back();
//		Thread.sleep(3000);
					
		sel.selectByVisibleText(Year2);
		Thread.sleep(3000);
		
		lnkPLTrialBalance.click();
		VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
		
//		RFP.DeleteFilename(driver,filepath, name);
//		PdfLnkTB.click();
//		Thread.sleep(3000);
//		RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//		driver.navigate().back();
//		Thread.sleep(3000);
		
		sel.selectByVisibleText(Year3);
		Thread.sleep(3000);
		
		lnkPLTrialBalance.click();
		VerifyValues(driver, "Total", TotalValTrialBalance.getText(), "£0.00");
		
//		RFP.DeleteFilename(driver,filepath, name);
//		PdfLnkTB.click();
//		Thread.sleep(3000);
//		RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//		driver.navigate().back();
//		Thread.sleep(3000);

		//Thread.sleep(2000);
	}

	
		
		public void VerifyPLReport(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			RptPL.click();
			VatPage vat = new VatPage(driver);
			ReadFilesPage RFP = new ReadFilesPage(driver);
			
			Select sel= new Select(ddlFinancialYear);
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			
			RFP.DeleteFilename(driver,filepath, name);
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			
			
			PdfLnk.click();
			Thread.sleep(3000);
			String Filename=RFP.GetFileName(filepath, name);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			
			driver.navigate().back();
			Thread.sleep(3000);
		
			chkShowDetail.click();
			PLrptTabPanel1.click();

			RFP.DeleteFilename(driver,filepath, name);
			
			PdfLnk.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			RFP.DeleteFilename(driver,filepath, name);
			
			PdfLnk.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			chkShowDetail.click();
			PLrptTabPanel1.click();

			RFP.DeleteFilename(driver,filepath, name);
			PdfLnk.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			
			vat.VerifyPageTitle(driver, PLrptHeading, TitleExp1);
			
			RFP.DeleteFilename(driver,filepath, name);

			PdfLnk.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			chkShowDetail.click();
			PLrptTabPanel1.click();

			RFP.DeleteFilename(driver,filepath, name);
			PdfLnk.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(3000);
			
		
		}
		
		public void VerifyLedgerReport(WebDriver driver, String Year1, String Year2, String Year3, String AccountType1, String AccountType2, String AccountType3) throws InterruptedException {
			
			lnkReports.click();
			Thread.sleep(2000);
			
			Select sel= new Select(ddlFinancialYear);
		
			LedgerRpt.click();
			Thread.sleep(3000);
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			
		
			Select sel1 = new Select(ddlAccountType);
			sel1.selectByVisibleText(AccountType1);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType2);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType3);
			btnSearch.click();
			Thread.sleep(2000);
			
			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			
			sel1.selectByVisibleText(AccountType1);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType2);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType3);
			btnSearch.click();
			Thread.sleep(2000);
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			
			sel1.selectByVisibleText(AccountType1);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType2);
			btnSearch.click();
			Thread.sleep(2000);

			sel1.selectByVisibleText(AccountType3);
			btnSearch.click();
			Thread.sleep(2000);
			

		}

		public void VerifyBalanceSheet(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
//			ReadFilesPage RFP = new ReadFilesPage(driver);
			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			Select sel= new Select(ddlFinancialYear);
			
			lnkBalanceSheetRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
//			RFP.DeleteFilename(driver,filepath, name);
//			PdfLnk2.click();
//			Thread.sleep(3000);
//			String Filename=RFP.GetFileName(filepath, name);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
//			Thread.sleep(3000);

			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);

//			RFP.DeleteFilename(driver,filepath, name);
//			PdfLnk2.click();
//			Thread.sleep(3000);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
//			Thread.sleep(3000);
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
//			RFP.DeleteFilename(driver,filepath, name);
//			PdfLnk2.click();
//			Thread.sleep(3000);
//			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
			Thread.sleep(1000);

		}
		
	public void VerifyBalanceSheet2(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
			ReadFilesPage RFP = new ReadFilesPage(driver);
			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			Select sel= new Select(ddlFinancialYear);
			
			lnkBalanceSheetRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		/*
			RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			String Filename=RFP.GetFileName(filepath, name);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(3000);*/

			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);

			/*RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(3000);*/
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
			/*RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(3000);*/

		}
		
		public void VerifyGeneralLedgerReport2(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
			ReadFilesPage RFP = new ReadFilesPage(driver);
//			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			Select sel= new Select(ddlFinancialYear);
			
			lnkGeneralLedgerRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
			/*RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			String Filename=RFP.GetFileName(filepath, name);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(2000);*/

			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);

		/*	RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
			driver.navigate().back();
			Thread.sleep(2000);*/
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
		/*	RFP.DeleteFilename(driver,filepath, name);
			PdfLnk2.click();
			Thread.sleep(3000);
			RFP.readPDFInURL(driver,filepath1,Filename,TitleExp2);
//			driver.navigate().back();
//			Thread.sleep(2000);
*/
		}
		
		
	public void VerifyGeneralLedgerReport(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1,String TitleExp2,String TitleExp3,String filepath,String filepath1,String name) throws InterruptedException, EmptyFileException, IOException {
			
//			ReadFilesPage RFP = new ReadFilesPage(driver);
//			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			Select sel= new Select(ddlFinancialYear);
			
			lnkGeneralLedgerRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
	

			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);

		
			
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
//			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
		
			Thread.sleep(2000);

		}
		public void VerifySupplierSummary(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1) throws InterruptedException, EmptyFileException, IOException {
			
			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);

			Select sel= new Select(ddlFinancialYear);
			
			lnkSupplierSummaryRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);

			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
	
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
			
		}
	
		public void VerifyCustomerSummary(WebDriver driver, String Year1, String Year2, String Year3, String TitleExp1) throws InterruptedException, EmptyFileException, IOException {
		
			VatPage vat = new VatPage(driver);
			lnkReports.click();
			Thread.sleep(2000);
	
			Select sel= new Select(ddlFinancialYear);
			
			lnkCustomerSummaryRpt.click();
			
			sel.selectByVisibleText(Year1);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
	
			sel.selectByVisibleText(Year2);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
	
			sel.selectByVisibleText(Year3);
			Thread.sleep(3000);
			vat.VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		}
		
}




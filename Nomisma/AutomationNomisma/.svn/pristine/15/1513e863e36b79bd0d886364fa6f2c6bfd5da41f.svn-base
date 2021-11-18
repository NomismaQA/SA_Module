package com.nomisma.scriptsvat;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;

import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class ReconcileSupplierBillTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void Reconcile() throws InterruptedException {

		test = report.startTest("Test execution started to Reconcile");
		sTestCaseID="ReconcileSupplierBillTest";
		sData=ExcelLib.toReadExcelDataVat(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		vat.AddSupplierBill2(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11],sData[12]);
		vat.AddBankCreditCardTransaction(driver,sData[13],sData[14],sData[15],sData[16],sData[17],sData[18],sData[19],sData[20],sData[21]);
		//Need some modifications
		//vat.ReconcileSupplierBill(driver, "Account Reconcile",  "Success! Transactions reconciled successfully");
	
		Reporter.log("Test execution completed successfully", true);
	}

}

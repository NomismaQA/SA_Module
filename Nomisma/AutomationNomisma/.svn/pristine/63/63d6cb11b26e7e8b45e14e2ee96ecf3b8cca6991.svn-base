package com.nomisma.scriptsvat;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;

import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class DeleteAllRecordsTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void DeleteAllRecords() throws InterruptedException {

		test = report.startTest("Test execution started to Delete All created records");
		sTestCaseID="DeleteAllRecordsTest";
		sData=ExcelLib.toReadExcelDataVat(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		vat.DeleteAllSupplierBills(driver,sData[5]);
		vat.DeleteAllInvoices(driver,sData[6]);
		vat.DeleteAllBankTransactions(driver,sData[7]);
		Thread.sleep(2000);
		
		Reporter.log("Test execution completed successfully", true);
	}

}

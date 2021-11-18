package com.nomisma.scriptsvat;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;

import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class UndoReconcileInvoiceTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void UndoReconcile() throws InterruptedException {

		test = report.startTest("Test execution started to Undo Reconcile");
		sTestCaseID="ReconcileTest";
		sData=ExcelLib.toReadExcelDataVat(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		vat.UndoReconcileInvoice2(driver, "Account Reconcile",  "Success! Transactions reconciled successfully");
	
		Reporter.log("Test execution completed successfully", true);
	}

}

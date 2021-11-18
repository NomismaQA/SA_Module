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

public class AddSupplierBillTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void AddSupplierBill() throws InterruptedException {

		test = report.startTest("Test execution started to Add Supplier Bill");
		sTestCaseID="AddSupplierBillTest";
		sData=ExcelLib.toReadExcelDataVat(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2],driver);
		test.log(LogStatus.PASS, "Login Successfull");
		//Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		vat.AddSupplierBill(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11],sData[12]);
	
		Reporter.log("Test execution completed successfully", true);
	}

}

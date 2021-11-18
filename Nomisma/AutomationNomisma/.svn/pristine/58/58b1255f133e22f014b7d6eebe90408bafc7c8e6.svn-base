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

public class AddCustomerTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void AddCustomer() throws InterruptedException {

		test = report.startTest("Test execution started to Add Customer");
		sTestCaseID="AddCustomerTest";
		sData=ExcelLib.toReadExcelDataVat(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		vat.AddCustomer(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11],sData[12],sData[13],sData[14],sData[15],sData[16],sData[17],sData[18],sData[19],sData[20],sData[21],sData[22],sData[23],sData[24],sData[25]);
	
		Reporter.log("Test execution completed successfully", true);
	}

}

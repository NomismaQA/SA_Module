package com.nomisma.scriptsAccountingScenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountingScenarios;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CT600Page;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPLReport_FATest3 extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void VerifyPLReport_FA3() throws InterruptedException {

		test = report.startTest("Test execution started to Verify PL Report_FA3 Test");
		sTestCaseID="VerifyPLReport_FA3Test";
		sData=ExcelLib.toReadExcelDataAccounting(sTestCaseID);
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		
		AccountingScenarios As = new AccountingScenarios(driver);
		As.VerifyPLReport_FA3(driver, sData[5], sData[6], sData[13], sData[14], sData[15]);
		Reporter.log("Test execution completed successfully", true);
	}

}

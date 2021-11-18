package com.nomisma.scriptsLiveNomisma;

import java.io.IOException;

import org.apache.poi.EmptyFileException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountingScenarios;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CT600Page;
import com.nomisma.pom.LiveNomismaSmokeTests;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyLedgerReportTest4 extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void VerifyLedgerReport() throws InterruptedException, EmptyFileException, IOException {

		test = report.startTest("Test execution started to Verify Ledger Report on Nomisma Live");
		sTestCaseID="VerifyLedgerReportTest4";
		sData=ExcelLib.toReadExcelDataLiveNomisma(sTestCaseID);
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		
		LiveNomismaSmokeTests ST = new LiveNomismaSmokeTests(driver);
		ST.VerifyLedgerReport(driver, sData[5], sData[6], sData[7], sData[9], sData[10], sData[11]);
		Reporter.log("Test execution completed successfully", true);
	}

}

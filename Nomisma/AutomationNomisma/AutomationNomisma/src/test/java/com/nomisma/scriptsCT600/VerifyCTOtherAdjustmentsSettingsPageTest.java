package com.nomisma.scriptsCT600;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CT600Page;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyCTOtherAdjustmentsSettingsPageTest extends BaseLib{

	
	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void VerifyCTAdjustmentsSettings() throws InterruptedException {

		test = report.startTest("Test execution started to Verify CT Other Adjustments Settings Page");
		sTestCaseID="VerifyCTOtherAdjustmentsSettingsPageTest";
		sData=ExcelLib.toReadExcelDataCT600(sTestCaseID);
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		
		CT600Page ct = new CT600Page(driver);
		//ct.VerifyCTAdjustmentsSettings(driver,sData[5]);
		ct.VerifyCTOtherAdjustmentsSettings(driver,sData[5],sData[6]);
		Reporter.log("Test execution completed successfully", true);
	}
}

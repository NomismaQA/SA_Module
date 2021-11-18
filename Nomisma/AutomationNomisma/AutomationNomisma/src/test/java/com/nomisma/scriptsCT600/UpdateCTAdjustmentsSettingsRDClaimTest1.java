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

public class UpdateCTAdjustmentsSettingsRDClaimTest1 extends BaseLib{

	
	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void UpdateCTAdjustmentsSettings() throws InterruptedException {

		test = report.startTest("Test execution started to Update CT Adjustments Settings Page");
		sTestCaseID="UpdateCTAdjustmentsSettingsRDClaimTest1";
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
		ct.ClearCTAdjustmentsSettingsRDClaim(driver,sData[5],sData[6],sData[7],sData[13]);
		ct.UpdateCTAdjustmentsSettingsRDClaim1(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11],sData[12],sData[13],sData[14],sData[15],sData[16]);
		Reporter.log("Test execution completed successfully", true);
	}
}
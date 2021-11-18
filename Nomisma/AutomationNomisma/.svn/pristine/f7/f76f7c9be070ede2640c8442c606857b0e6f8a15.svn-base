package com.nomisma.scriptscis;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CISPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;

public class PayslipsByContractorReport extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (enabled = false)//(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void PayslipsByContractor() throws InterruptedException{
				
		test = report.startTest("Test execution started to verify PaySlips By Contractor Report");
		sTestCaseID="CISPayslipByContractor";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfully");
		Thread.sleep(1000);

		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickCISDashboard();
		CISPage cis = new CISPage(driver);
		cis.SearchContractorfromDashboard(driver,sData[4]);
		cis.PayslipsByContractor(driver, sData[5], sData[6]);
			
		Reporter.log("Test execution completed successfully", true);
		
		 
		report.endTest(test);
		report.flush();
	}
}

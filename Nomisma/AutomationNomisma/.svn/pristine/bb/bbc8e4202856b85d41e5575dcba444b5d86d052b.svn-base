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

public class AddPeriodTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (enabled = false)//(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void AddPeriod() throws InterruptedException{
				
		test = report.startTest("Test execution started to Add Contractor");
		sTestCaseID="AddPeriod";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(1000);

		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickCISDashboard();
		CISPage cis = new CISPage(driver);
		cis.SearchContractorfromDashboard(driver,sData[4]);
		cis.DeleteMultipleSubcontractor(driver, sData[5]);
		cis.AddSubcontractor(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11]);
		cis.AddPeriodData(driver,sData[12],sData[13]);
		cis.VerifyPeriodData(driver,sData[5]);
		cis.AddPeriodData(driver,sData[12],sData[13]);
		
		Reporter.log("Test execution completed successfuly", true);
		
		 
		report.endTest(test);
		report.flush();
	}
}

package com.nomisma.scriptscis;

import java.util.HashMap;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CISPage;
import com.relevantcodes.extentreports.LogStatus;

public class CISSubmissionReportAll extends BaseLib {

	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void CISSubmissionRptAll() throws InterruptedException{
				
		test = report.startTest("Test execution started to Add Contractor");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "CISSubmissionRptAll";
		String testDataFile = "testData\\Json\\TestDataPayroll2.json";
				
		/*
		 * Get Test Data in Map
		 */
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		String sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		String sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		String sData3 = testDataMap.get("sData3").replaceAll("\"", "");

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(sData3,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		CISPage cis = new CISPage(driver);
		cis.CISMenuLnk.click();
		cis.CISSubmissionRptAll(driver);
		//cis.AddInvoice(driver);
			
		Reporter.log("Test execution completed successfully", true);
		 
		report.endTest(test);
		report.flush();
	}
}

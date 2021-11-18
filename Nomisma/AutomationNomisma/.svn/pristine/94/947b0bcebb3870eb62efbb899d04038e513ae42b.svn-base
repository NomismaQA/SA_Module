package com.nomisma.scriptsAutoEnrolment;

import java.util.HashMap;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AutoEnrolmentPage;
import com.relevantcodes.extentreports.LogStatus;

public class PensionConfigurationTest extends BaseLib{
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void PensionConfiguration() throws InterruptedException
	{
		test = report.startTest("Test execution started to verify Pension Configuration Page");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "PensionConfiguration";
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
		String sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		String sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		String sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		String sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AutoEnrolmentPage ae = new AutoEnrolmentPage(driver);
		ae.verifyPensionConfigurationPage(driver,sData4,sData5,sData6,sData7);

		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();
		
	}
}
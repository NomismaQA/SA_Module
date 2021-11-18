package com.nomisma.scriptspayroll;

import java.util.HashMap;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage2;
import com.relevantcodes.extentreports.LogStatus;

public class AutoRTIDueCountCheck extends BaseLib {

	@Test //(retryAnalyzer = RetryAnalyzer.class)
	public void CountTest() throws InterruptedException  
	{
		test = report.startTest("Auto RTI Due Count Test execution starts");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "CountTest";
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
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		
		String curUrl = driver.getCurrentUrl();
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.CountCheckAutoRTIDue(driver,curUrl);
		Reporter.log("Auto RTI Due Count verified successfully", true);
		

		report.endTest(test);
		report.flush();
}


}

package com.nomisma.scriptscis;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EmptyFileException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CISPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;

public class CIS300MonthlyReturnReport extends BaseLib {

	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void CIS300MonthlyReturn() throws InterruptedException, EmptyFileException, IOException{
				
		test = report.startTest("Test execution started to verify CIS 300 Monthly Return Report");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "CIS300MonthlyReturn";
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
		String sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		String sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		String sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		String sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		String sData8 = testDataMap.get("sData8").replaceAll("\"", "");
		String sData9 = testDataMap.get("sData9").replaceAll("\"", "");

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(sData3,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickCISDashboard();
		CISPage cis = new CISPage(driver);
		cis.SearchContractorfromDashboard(driver,sData4);
		cis.DeleteFilename(driver,sData6,sData7);
		
		cis.CIS300MonthlyReturn(driver);
		String Filename=cis.GetFileName(sData6,sData7);
		Reporter.log("File" + Filename, true);
		//Commented on 26052019
	//	cis.readPDFInURL(driver,sData8,Filename,sData4,sData9);
		
		Reporter.log("Test execution completed successfully", true);
		
		 
		report.endTest(test);
		report.flush();
	}
}

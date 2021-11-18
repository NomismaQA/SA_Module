package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;


public class FailedRTITest extends BaseLib {
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void currentstatus() throws InterruptedException, NoSuchElementException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		test = report.startTest("Failed RTI in Current status Test execution starts");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "Failed_RTI";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
				
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
		
		

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(sData3,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		
	//ag.failedRTI(driver, sData[4], sData[5], sData[6], sData[7], sData[8]);
		agp.failedRTI(driver, sData4, sData5, sData6);
		
		report.endTest(test);
		report.flush();
		
	}


}

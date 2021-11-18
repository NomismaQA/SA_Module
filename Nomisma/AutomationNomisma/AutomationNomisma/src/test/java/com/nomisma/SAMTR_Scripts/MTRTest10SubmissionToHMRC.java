package com.nomisma.SAMTR_Scripts;

import org.testng.annotations.Test;

import com.nomisma.SAMTR_POM.SAMTRLibrary;
import com.nomisma.SelfAssessmentpom.SAPOM;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
public class MTRTest10SubmissionToHMRC extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase10";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2018.json";
	String sData1,sData2, sData3;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);

	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void funcSubmitToHmrcCase10() throws Exception
	{
		
		test = report.startTest("Login to self Assessment");
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAMTRLibrary sa= new SAMTRLibrary(driver);
		SAPOM s1=new SAPOM(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest10(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Mtr test case for 2017 -2018 -> 10 -> Tax Submission successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}
}
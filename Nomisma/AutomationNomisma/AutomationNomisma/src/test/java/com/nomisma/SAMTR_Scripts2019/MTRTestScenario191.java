package com.nomisma.SAMTR_Scripts2019;


import org.testng.annotations.Test;

import com.nomisma.SAMTR_POM2019.SAMTRLibrary2019;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019;
import com.nomisma.generic.BaseLib;

import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;

import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.RetryAnalyzer;

import org.testng.Reporter;
public class MTRTestScenario191 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase191";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2019.json";
	String sData1,sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);

	@Test (priority=1)//,retryAnalyzer = RetryAnalyzer.class)
	public void funcTestCase191() throws Exception
	{		
		test = report.startTest("Login to self Assessment");
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		sData8 = testDataMap.get("sData8").replaceAll("\"", "");
		sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		sData10 = testDataMap.get("sData10").replaceAll("\"", "");
		sData11 = testDataMap.get("sData11").replaceAll("\"", "");
		sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
		SAPOM2019 s1=new SAPOM2019(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest191(driver);
		s1.addTestCase191(driver, sData4,sData5,sData6,sData7,sData8,sData9,sData10,sData11,sData12,sData13,sData14,sData15);
		test.log(LogStatus.PASS, "Mtr test case191 -> added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}
	/*@Test (priority=2)
	public void funcSubmitToHmrcCase191() throws Exception
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
		SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
		SAPOM2019 s1=new SAPOM2019(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest191(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Mtr test case191 -> Tax Submission successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
		}*/
	@Test (priority=3)//,retryAnalyzer = RetryAnalyzer.class)
	public void funcDelTestCase191() throws Exception
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
		
		SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
		SAPOM2019 s1=new SAPOM2019(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest191(driver);
		s1.delTestCase191(driver);
		test.log(LogStatus.PASS, "Mtr test case191 -> deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}
}
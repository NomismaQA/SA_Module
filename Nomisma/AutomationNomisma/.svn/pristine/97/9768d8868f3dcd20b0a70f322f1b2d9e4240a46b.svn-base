package com.nomisma.SAMTR_Scripts2020_SandboxPre;


import org.testng.annotations.Test;

import com.nomisma.SAMTR_POM2020.SAMTRLibrary2020;
import com.nomisma.SelfAssessmentpom2020.SAPOM2020;
import com.nomisma.generic.BaseLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
public class MTRTestScenario18 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase18";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2020.json";
	String sData1,sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);

	@Test (priority=2)//,retryAnalyzer = RetryAnalyzer.class)
	public void funcAddTestCase18() throws Exception
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
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest18(driver);
		s1.addTestCase18(driver, sData4,sData5, sData6,sData7, sData8,sData9, sData10);
		test.log(LogStatus.PASS, "Mtr test case18 -> added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}
	/*@Test (priority=2)//,retryAnalyzer = RetryAnalyzer.class)
	public void funcSubmitToHmrcTestCase18() throws Exception
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
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest18(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Mtr test case18 -> Tax Submission successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}*/
	@Test (priority=1)//,retryAnalyzer = RetryAnalyzer.class)
	public void funcDelTestCase18() throws Exception
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
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest18(driver);
		s1.delTestCase18(driver);
		test.log(LogStatus.PASS, "Mtr test case18 -> deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}
}
package com.nomisma.SAMTR_Scripts2020;

import java.util.HashMap;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.SAMTR_POM2020.SAMTRLibrary2020;
import com.nomisma.SelfAssessmentpom2020.SAPOM2020;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;

import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class MTRTestScenario36 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase36";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2020.json";
	String sData1,sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12;
	@Test (priority=2)
	public void funcTestCase36() throws Exception
	{
	test = report.startTest("Login to self Assessment");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
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
	
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
	SAPOM2020 s1=new SAPOM2020(driver);
	s1.clickSALink(driver);
	s1.clickClientLst(driver);
	sa.selectClientTest36(driver);
	s1.addTestCase36(driver, sData4,sData5,sData6,sData7,sData8,sData9,sData10,sData11,sData12);
	test.log(LogStatus.PASS, "Test case 36 data added Successfully");
	Reporter.log("Test execution of tax verification done successfully", true);
	report.endTest(test);
	report.flush();
	}
	/*@Test(priority=2)
	public void funcSubmissionTestCase36() throws Exception
	{
		
		test = report.startTest("Login to self Assessment");
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2);
		test.log(LogStatus.PASS, "Login Successfull");
			
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest36(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Test case 36 Submission to HMRC completed Successfully");
		Reporter.log("Test execution of Submission to HMRC and XML file verification done successfully", true);
		report.endTest(test);
		report.flush();
		}*/
	@Test (priority=1)
	public void funcDelTestCase36() throws Exception
	{
		test = report.startTest("Login to self Assessment");
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest36(driver);
		s1.funcDelMTRTest36(driver);
		test.log(LogStatus.PASS, "Test case 36 Data deletion completed Successfully");
		Reporter.log("Test execution of deletion of test data done successfully", true);
		report.endTest(test);
		report.flush();
		}
}
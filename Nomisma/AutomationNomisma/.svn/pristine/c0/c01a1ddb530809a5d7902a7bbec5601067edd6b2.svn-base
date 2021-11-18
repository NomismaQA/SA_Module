package com.nomisma.SAMTR_Scripts2019;

import java.util.HashMap;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.SAMTR_POM2019.SAMTRLibrary2019;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;

import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class MTRTestScenario62 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase62";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2019.json";
	String sData1,sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11,sData12,sData13, sData14, sData15, sData16, sData17, sData18;
	@Test (priority=1)
	public void funcTestCase62() throws Exception
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
	sData13 = testDataMap.get("sData13").replaceAll("\"", "");
	sData14 = testDataMap.get("sData14").replaceAll("\"", "");
	sData15 = testDataMap.get("sData15").replaceAll("\"", "");
	sData16 = testDataMap.get("sData16").replaceAll("\"", "");
	sData17 = testDataMap.get("sData17").replaceAll("\"", "");
	sData18 = testDataMap.get("sData18").replaceAll("\"", "");
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
	SAPOM2019 s1=new SAPOM2019(driver);
	s1.clickSALink(driver);
	s1.clickClientLst(driver);
	sa.selectClientTest62(driver);
	s1.addTestCase62(driver, sData4,sData5,sData6,sData7,sData8,sData9,sData10,sData11,sData12,sData13, sData14, sData15, sData16, sData17, sData18);
	test.log(LogStatus.PASS, "Test case 62 data added Successfully");
	Reporter.log("Test execution of tax verification done successfully", true);
	report.endTest(test);
	report.flush();
	}
	/*@Test(priority=2)
	public void funcSubmissionTestCase62() throws Exception
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
		
		SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
		SAPOM2019 s1=new SAPOM2019(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest62(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Test case 62 Submission to HMRC completed Successfully");
		Reporter.log("Test execution of Submission to HMRC and XML file verification done successfully", true);
		report.endTest(test);
		report.flush();
		}*/
	@Test (priority=3)
	public void funcDelTestCase62() throws Exception
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
		
		SAMTRLibrary2019 sa= new SAMTRLibrary2019(driver);
		SAPOM2019 s1=new SAPOM2019(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest62(driver);
		s1.delTestCase62(driver);
		test.log(LogStatus.PASS, "Test case 62 Data deletion completed Successfully");
		Reporter.log("Test execution of deletion of test data done successfully", true);
		report.endTest(test);
		report.flush();
		}
}
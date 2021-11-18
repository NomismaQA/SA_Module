package com.nomisma.SAMTR_Scripts2020_Old;

import org.testng.annotations.Test;

import com.nomisma.SAMTR_POM2020.SAMTRLibrary2020_1;
import com.nomisma.SelfAssessmentpom2020.SAPOM2020OldScenario;
import com.nomisma.generic.BaseLib;

import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;

import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
public class MTRTestScenario109 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase109";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2020OldData.json";
	String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	@Test(priority=2)
	public void funcAddTestCase109() throws Exception
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
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAMTRLibrary2020_1 sa= new SAMTRLibrary2020_1(driver);
		SAPOM2020OldScenario s1=new SAPOM2020OldScenario(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest109(driver);
		s1.addTestCase109(driver, sData4,sData5, sData6, sData7, sData8, sData9);
		test.log(LogStatus.PASS, "Mtr test case109 -> added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();			
	}
	/*@Test(priority=2)
	public void funcSubmissionTestCase109() throws Exception
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
		SAMTRLibrary2020_1 sa= new SAMTRLibrary2020_1(driver);
		SAPOM2020OldScenario s1=new SAPOM2020OldScenario(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest109(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Mtr test case 109 -> Tax Submission successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}*/
	@Test(priority=1)
	public void funcDelTestCase109() throws Exception
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
		SAMTRLibrary2020_1 sa= new SAMTRLibrary2020_1(driver);
		SAPOM2020OldScenario s1=new SAPOM2020OldScenario(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest109(driver);
		s1.delTestCase109(driver);
		test.log(LogStatus.PASS, "Mtr test case 109 -> deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();
		}
}
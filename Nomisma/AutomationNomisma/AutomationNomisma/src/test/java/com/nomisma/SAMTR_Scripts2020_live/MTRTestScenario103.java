package com.nomisma.SAMTR_Scripts2020_live;


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
public class MTRTestScenario103 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase103";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2020Live.json";
	String sData1,sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22, sData23, sData24, sData25, sData26, sData27, sData28, sData29,sData30,sData31, sData32, sData33, sData34, sData35, sData36, sData37, sData38, sData39, sData40, sData41, sData42,sData43,sData44, sData45, sData46, sData47, sData48, sData49, sData50, sData51, sData52, sData53,sData54,sData55, sData56, sData57;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);

	@Test (priority=2)
	public void funcAddTestCase103() throws Exception
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
		sData16 = testDataMap.get("sData16").replaceAll("\"", "");
		sData17 = testDataMap.get("sData17").replaceAll("\"", "");
		sData18 = testDataMap.get("sData18").replaceAll("\"", "");
		sData19 = testDataMap.get("sData19").replaceAll("\"", "");
		sData20 = testDataMap.get("sData20").replaceAll("\"", "");
		sData21 = testDataMap.get("sData21").replaceAll("\"", "");
		sData22 = testDataMap.get("sData22").replaceAll("\"", "");
		sData23 = testDataMap.get("sData23").replaceAll("\"", "");
		sData24 = testDataMap.get("sData24").replaceAll("\"", "");
		sData25 = testDataMap.get("sData25").replaceAll("\"", "");
		sData26 = testDataMap.get("sData26").replaceAll("\"", "");
		sData27 = testDataMap.get("sData27").replaceAll("\"", "");
		sData28 = testDataMap.get("sData28").replaceAll("\"", "");
		sData29 = testDataMap.get("sData29").replaceAll("\"", "");
		sData30 = testDataMap.get("sData30").replaceAll("\"", "");
		sData31 = testDataMap.get("sData31").replaceAll("\"", "");
		sData32 = testDataMap.get("sData32").replaceAll("\"", "");
		sData33 = testDataMap.get("sData33").replaceAll("\"", "");
		sData34 = testDataMap.get("sData34").replaceAll("\"", "");
		sData35 = testDataMap.get("sData35").replaceAll("\"", "");
		sData36 = testDataMap.get("sData36").replaceAll("\"", "");
		sData37 = testDataMap.get("sData37").replaceAll("\"", "");
		sData38 = testDataMap.get("sData38").replaceAll("\"", "");
		sData39 = testDataMap.get("sData39").replaceAll("\"", "");
		sData40 = testDataMap.get("sData40").replaceAll("\"", "");
		sData41 = testDataMap.get("sData41").replaceAll("\"", "");
		sData42 = testDataMap.get("sData42").replaceAll("\"", "");
		sData43 = testDataMap.get("sData43").replaceAll("\"", "");
		sData44 = testDataMap.get("sData44").replaceAll("\"", "");
		sData45 = testDataMap.get("sData45").replaceAll("\"", "");
		sData46 = testDataMap.get("sData46").replaceAll("\"", "");
		sData47 = testDataMap.get("sData47").replaceAll("\"", "");
		sData48 = testDataMap.get("sData48").replaceAll("\"", "");
		sData49 = testDataMap.get("sData49").replaceAll("\"", "");
		sData50 = testDataMap.get("sData50").replaceAll("\"", "");
		sData51 = testDataMap.get("sData51").replaceAll("\"", "");
		sData52 = testDataMap.get("sData52").replaceAll("\"", "");
		sData53 = testDataMap.get("sData53").replaceAll("\"", "");
		sData54 = testDataMap.get("sData54").replaceAll("\"", "");
		sData55 = testDataMap.get("sData55").replaceAll("\"", "");
		sData56 = testDataMap.get("sData56").replaceAll("\"", "");
		sData57 = testDataMap.get("sData57").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
		SAPOM2020 s1=new SAPOM2020(driver);
		s1.clickSALink(driver);
		s1.clickClientLst(driver);
		sa.selectClientTest103(driver);
		s1.addTestCase103(driver, sData4,sData5, sData6,sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22, sData23, sData24, sData25, sData26, sData27, sData28, sData29,sData30,sData31, sData32, sData33, sData34, sData35, sData36, sData37, sData38, sData39, sData40, sData41, sData42,sData43,sData44, sData45, sData46, sData47, sData48, sData49, sData50, sData51, sData52, sData53,sData54,sData55, sData56, sData57);
		test.log(LogStatus.PASS, "Mtr test case 103 -> added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}
	/*@Test (priority=2)
	public void funcSubmissionTestCase103() throws Exception
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
		sa.selectClientTest103(driver);
		s1.clickMTRTestCaseSubmitToHMRC(driver);
		test.log(LogStatus.PASS, "Mtr test case 103 -> Tax Submission successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();		
	}
	@Test (priority=1)
	public void funcDelTestCase103() throws Exception
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
		sa.selectClientTest103(driver);
		s1.funcDelMTRTest103(driver);
		test.log(LogStatus.PASS, "Mtr test case 103 -> deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}*/
}
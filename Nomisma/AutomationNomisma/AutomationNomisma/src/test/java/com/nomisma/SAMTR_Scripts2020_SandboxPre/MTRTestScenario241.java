package com.nomisma.SAMTR_Scripts2020_SandboxPre;

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

public class MTRTestScenario241 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="TestCase241";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaSAMTR2020.json";
	String sData1,sData2, sData3, B_name1, B_name2, Account_no, INC_2, Cname, Desc,d_amt, LumSum5, LumSum6,Emp_name,Emp_1,Emp_2,Emp_4;
	@Test (priority=2)
	public void funcTestCase241() throws Exception
	{
	test = report.startTest("Login to self Assessment");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	B_name1 = testDataMap.get("B_name1").replaceAll("\"", "");
	B_name2 = testDataMap.get("B_name2").replaceAll("\"", "");
	Account_no = testDataMap.get("Account_no").replaceAll("\"", "");
	INC_2 = testDataMap.get("INC_2").replaceAll("\"", "");
	Cname = testDataMap.get("Cname").replaceAll("\"", "");
	Desc = testDataMap.get("Desc").replaceAll("\"", "");
	d_amt = testDataMap.get("d_amt").replaceAll("\"", "");
	LumSum5 = testDataMap.get("LumSum5").replaceAll("\"", "");
	LumSum6 = testDataMap.get("LumSum6").replaceAll("\"", "");
	Emp_name = testDataMap.get("Emp_name").replaceAll("\"", "");
	Emp_1 = testDataMap.get("Emp_1").replaceAll("\"", "");
	Emp_2 = testDataMap.get("Emp_2").replaceAll("\"", "");
	Emp_4 = testDataMap.get("Emp_4").replaceAll("\"", "");
	
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAMTRLibrary2020 sa= new SAMTRLibrary2020(driver);
	SAPOM2020 s1=new SAPOM2020(driver);
	s1.clickSALink(driver);
	s1.clickClientLst(driver);
	sa.selectClientTest241(driver);//sData4 taken same bcoz first we selected bank then provided same name.
	s1.addTestCase241(driver, B_name1,B_name2, Account_no, INC_2,Cname,Desc,d_amt,LumSum5,LumSum6,Emp_name,Emp_1,Emp_2,Emp_4);
	test.log(LogStatus.PASS, "Mtr test case1 -> added successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();	
	}
	
	@Test(priority=1)
	public void funcDelTestCase241() throws Exception
	{		
		test = report.startTest("Login to self Assessment");
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
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
		sa.selectClientTest241(driver);
		s1.funcDelTest241(driver);
		test.log(LogStatus.PASS, "Mtr test case 5 -> deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}

}

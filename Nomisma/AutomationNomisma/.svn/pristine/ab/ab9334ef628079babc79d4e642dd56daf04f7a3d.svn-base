package com.nomisma.SelfAssessment2019;

import org.testng.Reporter;

//import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
//Delete Income for Blind Person allowance
public class DelBlindPersonAllowance extends BaseLib{
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="addEmpIncome5";
	String testDataFile = ".\\testData\\Json\\testDataSA2019.json";
	String sData1, sData2, sData3;
	@Test (priority=1)
	public void functionDelBlindAllowance() throws Exception
	{
	test = report.startTest("Login to Self Assessment Module");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAPOM2019Sandbox s1=new SAPOM2019Sandbox(driver);
	s1.clickSALink(driver);
	s1.clickClientLst(driver);
	s1.delBlindPersonAllowance(driver);
	s1.clickIncome(driver);
	s1.clickEmployment(driver);
	s1.delEmpInfo(driver);
	test.log(LogStatus.PASS, "Income for Blind clint Deleted Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
		}
}
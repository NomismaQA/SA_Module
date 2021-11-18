package com.nomisma.SelfAssessment2019;

import org.testng.annotations.Test;

import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;

import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
//To Delete Additional Information
public class DelAdditionalInfoCls extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="addAdditionalInfo";
	String testDataFile = ".\\testData\\Json\\testDataSA2019.json";
	String sData1, sData2, sData3;
	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void funDelAdditinalInfo() throws Exception
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
		s1.selectClientLink(driver);
		s1.delundoManualSubmitBtn(driver);
		s1.clickIncome(driver);
		s1.clickEmployment(driver);
		s1.delEmpInfo(driver);
		s1.funcDelAdditionalInfo(driver);
		test.log(LogStatus.PASS, "Additional Information Income Deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		}
}
package com.nomisma.SelfAssessment;

//import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.SelfAssessmentpom.SAPOM;
import com.nomisma.generic.BaseLib;

import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class DelAdditionalInfoCls extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="addAdditionalInfo";
	String testDataFile = ".\\testData\\Json\\testDataSA2018.json";
	String sData1, sData2, sData3;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void funDelAdditinalInfo() throws Exception
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
		SAPOM s1=new SAPOM(driver);
		s1.clickSALink(driver);
		
		s1.clickClientLst(driver);
		
		s1.selectClientLink(driver);
		
		
		s1.delundoManualSubmitBtn(driver);
		
		s1.clickIncome(driver);
		
		s1.clickEmployment(driver);
		
		s1.delEmpInfo(driver);
		
		s1.funcDelAdditionalInfo();
		test.log(LogStatus.PASS, "Test case of Additinal Information deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
	}
}
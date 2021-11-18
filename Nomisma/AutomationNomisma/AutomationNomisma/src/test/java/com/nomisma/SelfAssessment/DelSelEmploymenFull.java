package com.nomisma.SelfAssessment;

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

public class DelSelEmploymenFull extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="SelEmplymentFull";
	String testDataFile = ".\\testData\\Json\\testDataSA2018.json";
	String sData1, sData2, sData3;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void delSEFull() throws Exception
	{
		
		test = report.startTest("Login to self Assessment");
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
		
		s1.delSelfEmpFull(driver);
		test.log(LogStatus.PASS, "Self EmploymentFull Income deleted successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();	
		
	}
}
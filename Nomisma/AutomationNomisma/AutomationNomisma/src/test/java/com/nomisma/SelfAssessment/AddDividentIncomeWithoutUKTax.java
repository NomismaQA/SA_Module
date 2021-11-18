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

public class AddDividentIncomeWithoutUKTax extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="UntaxedUKInterest";
	String testDataFile = ".\\testData\\Json\\testDataSA2018.json";
	String sData1, sData2, sData3, sData4, sData5, sData6,sData7,sData8,sData9,sData10,sData11,sData12,sData13,sData14,sData15,sData16,sData17,sData18,sData19,sData20,sData21,sData22;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void funcAddIncomeWithoutTax() throws Exception
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
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		
		SAPOM s1=new SAPOM(driver);
		s1.clickSALink(driver);
		
		s1.clickClientLst(driver);
		
		s1.selectClientLink(driver);
		
		s1.clickIncome(driver);
		
		s1.clickAddEmployment(driver);
		
		s1.addEmployment(sData10, sData11, sData12, sData13, driver);
		
		s1.addIncomeBasic(sData14, sData15, sData16,driver);
		
		s1.clickIncome(driver);
		s1.addBank(driver,sData4 , sData5, sData6);
		
		s1.withoutTaxAddIncome(driver, sData7, sData4, sData8, sData9);
		
		s1.dividentUKCompanies(driver, sData14, sData15, sData16);
		
		s1.stateBenefit(driver, sData17, sData18, sData19, sData20,sData21);
		
		s1.verifyUNTaxDivident(driver, sData14, sData15, sData16, sData17, sData19, sData20, sData21, sData9,sData18,sData22);
		test.log(LogStatus.PASS, "Test case for Dividend Income without Tax added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();
	}
}
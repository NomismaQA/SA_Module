package com.nomisma.businesstypeScripts;

import com.nomisma.generic.BaseLib;

import org.testng.annotations.Test;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.nomisma.BusinessPom.BusinessPom;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AddBusinessPages;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
public class VerifyExpensesPTRFull extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID = "DataExpensesAuto";
	String testDataFile = ".\\testData\\Json\\AddBusinessModule.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17;
	@Test (priority=1)
	public void funcVerifyBoxesPTRFull() throws Exception
	{
	test = report.startTest("Login to sandbox");
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
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	AddBusinessPages abp=new AddBusinessPages(driver);
	abp.openBusiness(driver,sData4,sData5);
	abp.VerifyTotalExpensesPTRFull(driver,sData6, sData7,sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17);
	abp.funcDelAutoPartnership(driver);
	test.log(LogStatus.PASS, "Total Expenses of PTR Full verified Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

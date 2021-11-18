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
public class SA800BusinessInvestmentBusinessQues4 extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID = "BusinessQues4SA800";
	String testDataFile = ".\\testData\\Json\\AddBusinessModule.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7;
	@Test (priority=1)
	public void funcVerifyBusinessQues4SA800BusinsInvest() throws Exception
	{
	test = report.startTest("Login to sandbox2");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	sData4 = testDataMap.get("sData4").replaceAll("\"", "");
	sData5 = testDataMap.get("sData5").replaceAll("\"", "");
	sData6 = testDataMap.get("sData6").replaceAll("\"", "");
	sData7 = testDataMap.get("sData7").replaceAll("\"", "");
	
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	AddBusinessPages abp=new AddBusinessPages(driver);
	abp.openBusiness(driver,sData4,sData5);
	abp.funcOpenDashboardPartnershipTaxReturnPage(driver);
	abp.funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ4(driver);
	abp.funcSA800_PartnershipBusinessAndInvestmentIncome_BusinessQuestionsQ4(driver,sData6, sData7); 
	abp.funcSA803Del(driver);
	test.log(LogStatus.PASS, "Quetion 4 of Partnership business and investment income of SA800 verified Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

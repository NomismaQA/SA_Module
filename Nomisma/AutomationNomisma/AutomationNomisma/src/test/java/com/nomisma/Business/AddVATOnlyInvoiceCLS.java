package com.nomisma.Business;

import com.nomisma.generic.BaseLib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
import com.nomisma.BusinessPom.BusinessPom;

import com.nomisma.generic.ExcelLibSATestCases;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
public class AddVATOnlyInvoiceCLS extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="AddVatOnlyInvoice";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaBookKeeping.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7, sData8;
	@Test (priority=1)
	public void funcAddVATOnlyInvoice() throws Exception
	{
	test = report.startTest("Login to Book Keeping");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	sData4 = testDataMap.get("sData4").replaceAll("\"", "");
	sData5 = testDataMap.get("sData5").replaceAll("\"", "");
	sData6 = testDataMap.get("sData6").replaceAll("\"", "");
	sData7 = testDataMap.get("sData7").replaceAll("\"", "");
	sData8 = testDataMap.get("sData8").replaceAll("\"", "");
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	BusinessPom bp1=new BusinessPom(driver);
	bp1.openBusiness(driver,sData4);
	bp1.funcAddVATOnlyInvoice(driver, sData5, sData6, sData7, sData8);
	test.log(LogStatus.PASS, "VAT only Invoice Added Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

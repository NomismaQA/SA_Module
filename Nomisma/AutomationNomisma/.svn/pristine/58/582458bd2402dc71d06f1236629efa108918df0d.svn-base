package com.nomisma.businesstypeScripts;

import com.nomisma.generic.BaseLib;

import org.testng.annotations.Test;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
import com.nomisma.BusinessPom.BusinessPom;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AddBusinessPages;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
public class AddNewRatio extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID = "AddNewPartnerRatio";
	String testDataFile = ".\\testData\\Json\\AddBusinessModule.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7;
	@Test (priority=1)
	public void funcAddNewRaio() throws Exception
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
	abp.setUpPartner(driver);
	abp.addProfitLossRatio(driver, sData6, sData7);
	test.log(LogStatus.PASS, "Ratio for partnership added Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

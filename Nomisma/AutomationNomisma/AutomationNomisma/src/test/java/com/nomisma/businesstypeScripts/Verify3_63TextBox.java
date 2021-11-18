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
public class Verify3_63TextBox extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID = "Data3.63";
	String testDataFile = ".\\testData\\Json\\AddBusinessModule.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22, sData23, sData24, sData25, sData26, sData27, sData28, sData29, sData30, sData31, sData32, sData33, sData34, sData35;
	@Test (priority=1)
	public void funcVerify3_63BoxPTRFull() throws Exception
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
	sData18 = testDataMap.get("sData18").replaceAll("\"", "");
	sData19 = testDataMap.get("sData19").replaceAll("\"", "");
	sData20 = testDataMap.get("sData20").replaceAll("\"", "");
	sData21 = testDataMap.get("sData21").replaceAll("\"", "");
	sData22 = testDataMap.get("sData22").replaceAll("\"", "");
	sData23 = testDataMap.get("sData23").replaceAll("\"", "");
	sData24 = testDataMap.get("sData24").replaceAll("\"", "");
	sData25 = testDataMap.get("sData25").replaceAll("\"", "");
	sData26 = testDataMap.get("sData26").replaceAll("\"", "");
	sData27 = testDataMap.get("sData27").replaceAll("\"", "");
	sData28 = testDataMap.get("sData28").replaceAll("\"", "");
	sData29 = testDataMap.get("sData29").replaceAll("\"", "");
	sData30 = testDataMap.get("sData30").replaceAll("\"", "");
	sData31 = testDataMap.get("sData31").replaceAll("\"", "");
	sData32 = testDataMap.get("sData32").replaceAll("\"", "");
	sData33 = testDataMap.get("sData33").replaceAll("\"", "");
	sData34 = testDataMap.get("sData34").replaceAll("\"", "");
	sData35 = testDataMap.get("sData35").replaceAll("\"", "");
	
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	AddBusinessPages abp=new AddBusinessPages(driver);
	abp.openBusiness(driver,sData4,sData5);
	abp.Verify3_63PTRFull(driver,sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22, sData23, sData24, sData25, sData26, sData27, sData28, sData29, sData30, sData31, sData32, sData33, sData34, sData35);
	abp.funcDelAutoPartnership(driver);
	test.log(LogStatus.PASS, "Box 3.63 of PTR Full verified Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

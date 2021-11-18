package com.nomisma.SelfAssessment2019;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
//To check Blind personal allowance
public class AddBlindPersonAllowance extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="addEmpIncome5";
	String testDataFile = ".\\testData\\Json\\testDataSA2019.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7, sData8, sData9,sData10;
	@Test (priority=1)
	public void functionCheckBlindAllowance() throws Exception
	{
	test = report.startTest("Login to Self Assessment Module");
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
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAPOM2019Sandbox s1=new SAPOM2019Sandbox(driver);
	s1.delScreenShot();
	s1.delReports();
	s1.clickSALink(driver);
	s1.clickClientLst(driver);
	s1.addBlindPersonAllowance(driver);
	s1.clickIncome(driver);
	s1.clickAddEmployment(driver);
	s1.addEmployment(sData4, sData5, sData6, sData7, driver);
	s1.AddEmpIncome(sData8, sData9,sData10,driver);
	s1.taxCalculationBlindPerson(sData8, sData9,sData10,driver);
	test.log(LogStatus.PASS, "Income for Blind clint Added Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}
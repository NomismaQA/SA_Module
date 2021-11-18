package com.nomisma.Business;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import java.util.HashMap;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.BusinessPom.BusinessPom;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
public class DelcustomerCls  extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="AddCustomer";
	String testDataFile = ".\\testData\\Json\\TestDataNomismaBookKeeping.json";
	String sData1,sData2, sData3, sData4;
	@Test (priority=1)
	public void funcDelcustomer() throws Exception
	{

	test = report.startTest("Login to Book Keeping");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	sData4 = testDataMap.get("sData4").replaceAll("\"", "");
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	BusinessPom bp1=new BusinessPom(driver);
	bp1.openBusiness(driver,sData4);
	bp1.delCustomer(driver);
	test.log(LogStatus.PASS, "Customer Deleted successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();
	}
}

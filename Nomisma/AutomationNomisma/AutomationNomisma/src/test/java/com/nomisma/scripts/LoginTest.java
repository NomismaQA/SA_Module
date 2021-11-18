package com.nomisma.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;


public class LoginTest extends BaseLib {
	String sTestCaseID=null;
	String[] sData=null;
	
@Test(priority=1)
public void loginTest() throws InterruptedException {
	test=report.startTest("loginTest execution starts");
	sTestCaseID="Login_Pass";
	sData=ExcelLib.toReadExcelData(sTestCaseID);
	//String username = ExcelLib.readExcelData(1, 2);
	//String password = ExcelLib.readExcelData(1, 3);

	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData[1], sData[2]);
	test.log(LogStatus.PASS, "Login Successfull");
	//ap.login(username, password);
	Thread.sleep(2000);
	AdminPage adp = new AdminPage(driver);
	adp.verifyHomePageTitle();
	Reporter.log("Login Successfully", true);
	wLib.implictWaitForSeconds(driver, 30);
	OpenDashboard od = new OpenDashboard(driver);
	od.clickSignOutLink();
	test.log(LogStatus.PASS, "Logout Successfull");
	wLib.implictWaitForSeconds(driver, 30);
	report.endTest(test);
	report.flush();
}


@Test(priority=2)
public void invalidLoginTest() throws InterruptedException {
	test=report.startTest("invalidLoginTest execution starts");
	sTestCaseID="Login_Fail";
	sData=ExcelLib.toReadExcelData(sTestCaseID);
	//String username = ExcelLib.readExcelData(2, 2);
	//String password = ExcelLib.readExcelData(2, 3);
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData[1], sData[2]);
	test.log(LogStatus.PASS, "Login Invalid");
	//ap.login(username, password);
	Thread.sleep(2000);
	ap.verifyErrorMsg();
	report.endTest(test);
	report.flush();
}

}


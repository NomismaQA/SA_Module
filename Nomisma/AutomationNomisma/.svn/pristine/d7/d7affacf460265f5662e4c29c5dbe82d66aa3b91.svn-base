package com.nomisma.scriptsCRM;

import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsPage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestCRM extends BaseLib{
	
	String sTestCaseID=null;
	String[] sData=null;
	
	@Test 
	public void Login() throws InterruptedException
	{
		test = report.startTest("Test execution started for CRM Login");
		sTestCaseID="LoginCRM";
		sData=ExcelLib.toReadExcelDataCRM(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.loginCRM(driver,sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successful");
		Thread.sleep(2000);

	}
}
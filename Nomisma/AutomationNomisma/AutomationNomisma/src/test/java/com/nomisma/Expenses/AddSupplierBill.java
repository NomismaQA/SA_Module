package com.nomisma.Expenses;


import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;


public class AddSupplierBill extends BaseLib {
	String sTestCaseID=null;
	String[] sData=null;
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void func1() throws Exception
	{
		
		test = report.startTest("Login to expenses");
		sTestCaseID="expenses";
		sData=ExcelLib.toReadExcelDataNew(sTestCaseID);
		//System.out.println(sData);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(700);
		
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData[3], driver);
		Thread.sleep(700);

}
}

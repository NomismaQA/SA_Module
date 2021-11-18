package com.nomisma.scriptspayrollreports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage2;
import com.relevantcodes.extentreports.LogStatus;

public class P32CalcTest extends BaseLib{

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (enabled = false)//(retryAnalyzer = RetryAnalyzer.class)
	public void P32Calculations() throws InterruptedException
	{
		test = report.startTest("P32Calculations Test execution starts");
		sTestCaseID="P32_Calculations";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap= new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData[4], driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);
		Thread.sleep(3000);
		PayrollPage2 pr=new PayrollPage2(driver);
		pr.P32(driver, sData[5], sData[6], sData[7], sData[8], sData[9]);
		
		report.endTest(test);
		report.flush();
	}
	
}

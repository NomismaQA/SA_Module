package com.nomisma.scriptspayroll;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.BookkeepingPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage3;
import com.nomisma.pom.PayrollPage4;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPayrollDashboardTest1 extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test 
	public void VerifyPayrollDashboard() throws InterruptedException {

		test = report.startTest("Test execution started to Verify Payroll Dashboard");
		sTestCaseID="VerifyPayrollDashboardTest1";
		sData=ExcelLib.toReadExcelDataPayroll(sTestCaseID);

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		

		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		
		PayrollPage4 pp4=new PayrollPage4(driver);
		pp4.PayrollDashboard(driver, sData[5]); 

	
		Reporter.log("Test execution completed successfully", true);
	}

}

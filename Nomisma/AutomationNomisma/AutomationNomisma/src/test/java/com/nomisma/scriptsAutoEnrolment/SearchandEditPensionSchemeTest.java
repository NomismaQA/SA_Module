package com.nomisma.scriptsAutoEnrolment;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.AutoEnrolmentPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.relevantcodes.extentreports.LogStatus;

public class SearchandEditPensionSchemeTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void SearchandEditPension() throws InterruptedException{
				
		test = report.startTest("Test execution started to Search and Edit Pension Scheme");
		sTestCaseID = "AddPensionScheme";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfully");
		Thread.sleep(1000);

		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		Thread.sleep(1000);

		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData[4], driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);

		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData[5]);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		AutoEnrolmentPage ae = new AutoEnrolmentPage(driver);
		ae.verifyPensionSchemePage(driver, sData[6]);
		ae.SearchPensionScheme(driver,sData[20],sData[18]);
		ae.EditPensionScheme(driver,sData[21]);

		Reporter.log("Test execution completed successfully", true);
	}
}

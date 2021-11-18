package com.nomisma.scriptspayrollreports;

import java.util.NoSuchElementException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollReports;
import com.relevantcodes.extentreports.LogStatus;

public class RTIFailedReportTest extends BaseLib {

		String sTestCaseID=null;
		String[] sData=null;
		
		
		@Test (retryAnalyzer = RetryAnalyzer.class)
		public void RTIFailedReport() throws InterruptedException, NoSuchElementException
		{
			test = report.startTest("RTI Failed Report Test execution starts");
			sTestCaseID="RTI_Failed";
			sData=ExcelLib.toReadExcelData(sTestCaseID);
			AccountsPage ap = new AccountsPage(driver);
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
			PayrollReports pr=new PayrollReports(driver);
			pr.RTIFailed(driver, sData[5], sData[6], sData[7]);
			
			report.endTest(test);
			report.flush();
	}

}

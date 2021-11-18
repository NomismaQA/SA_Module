package com.nomisma.scriptsAutoEnrolment;

import java.util.NoSuchElementException;
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
import com.relevantcodes.extentreports.LogStatus;

public class ContributionProcessingHistoryReportTest extends BaseLib {

		String sTestCaseID=null;
		String[] sData=null;
		
		@Test (retryAnalyzer = RetryAnalyzer.class)
		public void ContributionProcessingHistory() throws InterruptedException, NoSuchElementException
		{
			test = report.startTest("Execution started for report Contribution Processing History");
			sTestCaseID="ContributionProcessingHistory";
			sData=ExcelLib.toReadExcelData(sTestCaseID);
			AccountsPage ap = new AccountsPage(driver);
			ap.login(sData[1], sData[2]);
			test.log(LogStatus.PASS, "Login Successfull");
			Thread.sleep(2000);
			AdminPage adp = new AdminPage(driver);
			adp.searchAgent(sData[3], driver);
			OpenDashboard od = new OpenDashboard(driver);
			od.clickpayrollDashboard();	
			AgentsPage agp=new AgentsPage(driver);
			agp.searchPayrollBusiness(sData[4], driver);
			test.log(LogStatus.PASS, " Payroll Company page opened successfully");
			Reporter.log("Payroll Company page opened successfully", true);
			
			AutoEnrolmentPage ae = new AutoEnrolmentPage(driver);
			ae.ContributionProcessingHistory(driver,sData[4]);
			
			Reporter.log("Test execution completed successfully", true);

	}

}

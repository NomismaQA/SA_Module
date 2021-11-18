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
//import com.nomisma.pom.PayrollReports;
import com.relevantcodes.extentreports.LogStatus;

public class PayslipByCompanyVerifyPDF extends BaseLib{


	
		String sTestCaseID=null;
		String[] sData=null;
				
		@Test //(retryAnalyzer = RetryAnalyzer.class)
		public void payslipReport() throws Exception
		{
			test = report.startTest("payslipReportTest execution starts");
			sTestCaseID="Payslip_company";
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
			PayrollPage2 pr=new PayrollPage2(driver);
			pr.PayslipsByCompany2(driver, sData[5], sData[6], sData[7]);
			//URL url=driver.getCurrentUrl();
			//pr.readPDFInURL(driver,"нг1,845.95",sData[8],sData[9],sData[10]);
			//pr.testPDFReader(driver);
			Thread.sleep(5000);
			
			report.endTest(test);
			report.flush();
	}
	

	/**
	 * To verify pdf in the URL 
	 */
//	@Test
//	public void testVerifyPDFInURL() {
//		driver.get("http://www.princexml.com/samples/");
//		driver.findElement(By.linkText("PDF flyer")).click();
//		String getURL = driver.getCurrentUrl();
//		Assert.assertTrue(getURL.contains(".pdf"));
//	}

	
	
}

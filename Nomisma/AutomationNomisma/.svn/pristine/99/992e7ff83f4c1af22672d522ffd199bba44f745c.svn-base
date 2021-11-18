package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EmptyFileException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.nomisma.pom.PayrollPage2;
import com.relevantcodes.extentreports.LogStatus;

public class P32_VerifyTotalTaxDuetoHMRC extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void P32VerifyTotalTaxDuetoHMRC() throws InterruptedException, EmptyFileException, IOException
	{
		test = report.startTest("VerifyTotalTaxDuetoHMRC Test execution starts");
		sTestCaseID="VerifyTotalTaxtoHMRC";
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
		Thread.sleep(2000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData[5]);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Undo Payroll
		Reporter.log("Undo Payroll for the Company", true);
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.undoRunPayrollAccept(driver);
		test.log(LogStatus.PASS, "Undo Payroll for the Company Successfull");
		Reporter.log("Undo Payroll for the Company Successfull", true);
		
		//Run Payroll
		Reporter.log("Run Payroll for the Company", true);
		pp2.runPayroll(driver, sData[5]);
		Reporter.log("Run Payroll for the Company Successfull", true);
		//@SuppressWarnings("unchecked")
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		
		pp2.lnkReports.click();
		pp2.p32Lnk.click();
		Thread.sleep(2000);

		pp2.DeleteFile(driver,sData[10]);
		pp2.VerifyTotalTaxDuetoHMRC(sData[6],sData[7],sData[8],sData[9]);
		pp2.pdflnk.click();
		Thread.sleep(2000);
		pp2.readPDFInURL(driver,"нг1,845.95",sData[8],sData[9],sData[10]);
		
	}
}
	
	
	

package com.nomisma.scriptspayroll;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
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

public class TestPDF extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void ReadPDF() throws InterruptedException, NoSuchElementException, UnhandledAlertException,NoAlertPresentException, Throwable
	{
		test = report.startTest("undoPayrollTest execution starts");
		sTestCaseID="P32_VerifyTotalTaxDuetoHMRC";
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
		
		
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.DeleteFile(driver,sData[10]);
		pp2.readPDFInURL(driver,"нг1,845.95",sData[8],sData[9],sData[10]);
		
	}
}
	
	
	

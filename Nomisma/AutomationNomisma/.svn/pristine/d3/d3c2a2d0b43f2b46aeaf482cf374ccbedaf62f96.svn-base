package com.nomisma.scriptsaccounts;

import java.util.NoSuchElementException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsDashboardPage;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.relevantcodes.extentreports.LogStatus;

public class InvoicePaginationTest extends BaseLib {
	
	String sTestCaseID=null;
	String[] sData=null; 
	
	@Test(priority=1)
	public void paginationExistsAndClickTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("paginationExistsAndClickTest execution starts");
		sTestCaseID="Invoice_Pagination";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		AgentsPage agp=new AgentsPage(driver);
		agp.clickBusinessesLnk();
		agp.searchBusiness(sData[4], driver);
		AccountsDashboardPage adbp = new AccountsDashboardPage(driver);
		adbp.clickSalesLnk(driver, sData[5]);
		test.log(LogStatus.PASS, "Invoice page is displayed");
		Reporter.log("Invoice page is opened successfully", true);
		test.log(LogStatus.PASS, "Accounting Year is Selected");
		Reporter.log("Accounting Year is selected successfully", true);
		adbp.invoicePagination(driver);
		report.endTest(test);
		report.flush();
		
	}


}

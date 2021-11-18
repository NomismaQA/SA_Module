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

public class BalanceSheetTest extends BaseLib{
	
	String sTestCaseID=null;
	String[] sData=null; 
	
	@Test(priority=1)
	public void captureElementsOnBalanceSheetTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("captureElementsOnBalanceSheetTest execution starts");
		sTestCaseID="Elements_BalanceSheet";
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
		adbp.clickReportsLnk(driver);
		test.log(LogStatus.PASS, "Reports page is displayed");
		Reporter.log("Reports page is opened successfully", true);
		report.endTest(test);
		report.flush();
		
	}

}

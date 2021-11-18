package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.EmptyFileException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.nomisma.pom.PayrollPage2;
import com.relevantcodes.extentreports.LogStatus;

public class P32ReportCISSuffered extends BaseLib {

	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID;
	String testDataFile;
	String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10;
	
	@SuppressWarnings("rawtypes")
	@Test (priority=1)//,retryAnalyzer = RetryAnalyzer.class)
	public void P32Report() throws InterruptedException, EmptyFileException, IOException
	{
		test = report.startTest("P32ReportCISSuffered Test execution starts");
		sTestCaseID="P32ReportCISSuffered";
		testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		sData8 = testDataMap.get("sData8").replaceAll("\"", "");
		sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		sData10 = testDataMap.get("sData10").replaceAll("\"", "");
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		wLib.implictWaitForSeconds(driver, 30);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData4, driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);
		Thread.sleep(2000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData5);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Undo Payroll
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.undoRunPayrollCISSuffered(driver);
		test.log(LogStatus.PASS, "Undo Payroll for the Company Successfull");
		
		//Run Payroll
		Reporter.log("Run Payroll for the Company", true);
		pp2.runPayrollCISSuffered(driver,sData7);
		
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		Reporter.log("Number of Tabs:" +tabs.size(), true);
		
		pp2.lnkReports.click();
		pp2.p32Lnk.click();
		Thread.sleep(2000);

		pp2.DeleteFile(driver,sData10);
		
		pp2.VerifyCISSuffered(driver, sData6, sData8);
		pp2.pdflnk.click();
		Thread.sleep(2000);
		//pp2.readPDFInURL(driver,sData8;
		
	}
}
	
	
	

package com.nomisma.scriptspayroll;

import java.util.HashMap;
import java.util.NoSuchElementException;

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
import com.relevantcodes.extentreports.LogStatus;

public class SearchBusinessAndEditCompanyTest extends BaseLib {
		
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void searchBusinessInPayrollTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("Test execution started to SearchBusinessAndEditCompanyTest");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "Search_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
				
		/*
		 * Get Test Data in Map
		 */
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		String sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		String sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		String sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		String sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		String sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		String sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		String sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		String sData8 = testDataMap.get("sData8").replaceAll("\"", "");
		String sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		String sData10 = testDataMap.get("sData10").replaceAll("\"", "");
		String sData11 = testDataMap.get("sData11").replaceAll("\"", "");
		String sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		String sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		String sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		String sData16 = testDataMap.get("sData16").replaceAll("\"", "");
		String sData17 = testDataMap.get("sData17").replaceAll("\"", "");

		

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(sData3,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData4, driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);	
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData17);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Verify Payroll Company Status
		//pp.verifyCompanyStatus();
		//test.log(LogStatus.PASS, "Payroll Company Status verified successfully");
		//Reporter.log("Payroll Company Status verified successfully", true);
		
		//Click Edit Company Button to open Popup
		pp.clickEditCompanyBtn(driver);
		test.log(LogStatus.PASS, "Payroll Page Edit Company Popup displayed");
		Reporter.log("Payroll Page Edit Company Popup displayed", true);

		//Fill in Edit Company Details
		Reporter.log("Trying to Fill Details on Payroll Edit Company Popup", true);
		pp.verifyPPEditCompanyText();
		pp.editCompanyPopup(sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData14, sData15, sData16, driver);
		 //sData[13],
		test.log(LogStatus.PASS, "Edit Company details Saved Successfully");
		Reporter.log("Edit Company details Saved Successfully", true);
		
		//Check Run Payroll Button is Visible and Control is Back to Payroll Window
		//pp.checkRunPayrollBtn(driver);
		//test.log(LogStatus.PASS, "Run Payroll Button displayed");
		//Reporter.log("Run Payroll Button displayed", true);
		report.endTest(test);
		report.flush();
		
	}

}

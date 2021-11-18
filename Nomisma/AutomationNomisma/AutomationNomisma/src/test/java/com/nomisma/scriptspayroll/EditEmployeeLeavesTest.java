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

public class EditEmployeeLeavesTest extends BaseLib{

	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void editLeavesTest() throws InterruptedException, NoSuchElementException{
	
		
		test = report.startTest("editSMPLeavesTest execution starts");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "EditLeaves_PayrollCompany";
		String testDataFile = "testData\\Json\\TestDataPayroll1.json";
				
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
		pp.verifyPayrollPageTitle(driver, sData6);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		//Reporter.log("Payroll Page title verified successfully", true);
		
		//Edit SMP Leave
		Reporter.log("Editing SMP Leaves for the Employee", true);
		pp.editSMPPopup(driver, sData5, sData8);
		
		//Edit SPP Leave
		Reporter.log("Editing SPP Leaves for the Employee", true);
		pp.editSPPPopup(driver, sData5, sData7);
		
	    Reporter.log("Leaves edited & Saved correctly", true);
	    
	    pp.verifyPayrollPageTitle(driver, sData6);
	    //pp.checkRunPayrollBtn(driver);
		
		report.endTest(test);
		report.flush();
	}
}

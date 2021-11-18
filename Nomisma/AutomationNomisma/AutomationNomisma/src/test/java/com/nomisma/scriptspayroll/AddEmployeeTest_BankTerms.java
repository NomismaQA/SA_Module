package com.nomisma.scriptspayroll;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
import com.nomisma.pom.PayrollPage3;
import com.relevantcodes.extentreports.LogStatus;

public class AddEmployeeTest_BankTerms extends BaseLib{

	@Test
	public void addEmployeeTest() throws InterruptedException, NoSuchElementException
	{
		
		test = report.startTest("Test execution started to Add Employee");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "AddMaleEmployee_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
				
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
		String sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		String sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		String sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		String sData16 = testDataMap.get("sData16").replaceAll("\"", "");
		String sData17 = testDataMap.get("sData17").replaceAll("\"", "");
		String sData18 = testDataMap.get("sData18").replaceAll("\"", "");
		String sData19 = testDataMap.get("sData19").replaceAll("\"", "");
		String sData20 = testDataMap.get("sData20").replaceAll("\"", "");
		String sData21 = testDataMap.get("sData21").replaceAll("\"", "");
		String sData22 = testDataMap.get("sData22").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData4, driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);

		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData4);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Click Add Employee Button to open Popup
		pp.clickAddEmployeeBtn(driver);
		test.log(LogStatus.PASS, "Payroll Page Add Employee Popup displayed");
		Reporter.log("Payroll Page Add Employee Popup displayed", true);
		
		
		//Fill in Edit Company Details
		Reporter.log("Trying to Fill Details on Payroll Add Employee Popup", true);
	    pp.verifyPPAddEmployeeText();
	    PayrollPage3 pp3 = new PayrollPage3(driver);
	    pp3.addEmployeePopup3(driver, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22);
	    
	    
		report.endTest(test);
		report.flush();
	    

	}
	
	
}

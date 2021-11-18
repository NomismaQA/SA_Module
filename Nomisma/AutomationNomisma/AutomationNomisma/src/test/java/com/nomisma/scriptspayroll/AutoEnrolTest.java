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

public class AutoEnrolTest extends BaseLib{

	
	
	@Test (priority=1)//retryAnalyzer = RetryAnalyzer.class)
	public void enableAutoEnrolTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("enableAutoEnrolTest execution starts");
		String testCaseId = "AutoEnrolment_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
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
		Thread.sleep(3000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData7);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Enable AutoEnrolment
		Reporter.log("Enable Auto Enrolment option", true);
		pp.autoEnrolPayrollCompany(driver, sData5, sData6, sData8, sData9, sData10, sData11,sData12);
		
	    
	    Thread.sleep(2000);
	    Reporter.log("Company is Auto Enroled successfuly", true);
	 
	    pp.checkRunPayrollBtn(driver);
	    test.log(LogStatus.PASS, "Auto Enorolment enabled for the company");
		Reporter.log("Auto Enorolment enabled for the company", true);
	}

	
}

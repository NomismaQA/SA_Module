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

public class AddEmployeeLeavesManagement extends BaseLib{
	
	
	
	@Test (priority=3)
	public void addSMPEmployeeLeavesTest() throws InterruptedException, NoSuchElementException
	{
		CommonUtilities commUtils=new CommonUtilities();
		String sTestCaseID="AddSMPLeaves_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
		String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10,sData11;
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	
		test = report.startTest("addSMPLeavesTest execution starts");
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
		sData11 = testDataMap.get("sData11").replaceAll("\"", "");
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
		Thread.sleep(3000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData4);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		pp.clickAddLeavePopupBtn(driver);
		Thread.sleep(3000);
		pp.verifyLeaveManagementPopupText(driver);
		pp.addLeaves(driver, sData5);
		pp.selectLeaveType(driver, sData11);
		pp.smpPopup(driver, sData6, sData7, sData8, sData9, sData10);
		Thread.sleep(2000);
	    Reporter.log("SMP Leaves added successfully", true);
	    Reporter.log("Searching Employees on SMP Leave", true);
	    pp.verifyEmployeesLeave(driver);
	    test.log(LogStatus.PASS, "Employees on SMP Leaves displayed");
		Reporter.log("Employees on SMP Leaves displayed", true);
	    pp.checkRunPayrollBtn(driver);
	    test.log(LogStatus.PASS, "SMP Leaves added");
		Reporter.log("SMP Leaves added", true);
	}
	
	@Test (priority=2)//,retryAnalyzer = RetryAnalyzer.class)
	public void addSPPLeavesTest() throws InterruptedException, NoSuchElementException
	{
		CommonUtilities commUtils=new CommonUtilities();
		String sTestCaseID="AddSPPLeaves_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
		String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10;
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		
		test = report.startTest("addSPPLeavesTest execution starts");
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
		Thread.sleep(3000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData4);
		Reporter.log("Payroll Page title verified successfully", true);
		pp.clickAddLeavePopupBtn(driver);
		Thread.sleep(3000);
		pp.verifyLeaveManagementPopupText(driver);
		pp.addLeaves(driver, sData5);
		pp.selectLeaveType(driver, sData10);
		pp.sppPopup(driver, sData6, sData7, sData8, sData9);
		Thread.sleep(2000);
	    Reporter.log("SPP Leaves added successfully", true);
	    Reporter.log("Searching Employees on SPP Leave", true);
	    pp.verifyEmployeesLeave(driver);
	    test.log(LogStatus.PASS, "Employees on SPP Leaves displayed");
		Reporter.log("Employees on SPP Leaves displayed", true);
	    pp.checkRunPayrollBtn(driver);
	    test.log(LogStatus.PASS, "SPP Leaves added");
		Reporter.log("SPP Leaves added", true);
	}
	@Test (priority=3)//,retryAnalyzer = RetryAnalyzer.class)
	public void addSSPLeavesTest() throws InterruptedException, NoSuchElementException
	{
		CommonUtilities commUtils=new CommonUtilities();
		String sTestCaseID="AddSSPLeaves_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
		String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9;
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		
		test = report.startTest("addSPPLeavesTest execution starts");
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		sData7 = testDataMap.get("sData7").replaceAll("\"", "");
		sData8 = testDataMap.get("sData8").replaceAll("\"", "");
		sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		
		
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
		Thread.sleep(3000);
		
		//Verify Payroll Page Title
		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData4);
		Reporter.log("Payroll Page title verified successfully", true);
		pp.clickAddLeavePopupBtn(driver);
		Thread.sleep(3000);
		pp.verifyLeaveManagementPopupText(driver);
		pp.addLeaves(driver, sData5);
		pp.selectLeaveType(driver, sData9);
		pp.sspPopup(driver, sData6, sData7, sData8);
		Thread.sleep(2000);
	    Reporter.log("SSP Leaves added successfully", true);
	    Reporter.log("Searching Employees on SSP Leave", true);
	    pp.verifyEmployeesLeave(driver);
	    test.log(LogStatus.PASS, "Employees on SPP Leaves displayed");
		Reporter.log("Employees on SSP Leaves displayed", true);
	    pp.checkRunPayrollBtn(driver);
	    test.log(LogStatus.PASS, "SSP Leaves added");
		Reporter.log("SPP Leaves added", true);
	}
}

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
import com.nomisma.pom.PayrollPageThresholds;
import com.relevantcodes.extentreports.LogStatus;


public class VerifyCalculationDirectorNITest extends BaseLib{

	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID;
	String testDataFile;
	String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10,sData11;
		
	
	@Test (priority=1)//,retryAnalyzer = RetryAnalyzer.class)
	public void verifyTableMethodDirectorNITest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("verifyTableMethodDirectorNITest execution starts");
		sTestCaseID="verifyTableMethodDirectorNITest_PayrollCompany";
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
		pp.verifyPayrollPageTitle(driver, sData7);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Edit Employee on Payroll Dashboard To select Director NI Method
		Reporter.log("Edit Employee will be clicked", true);
		PayrollPageThresholds ppt = new PayrollPageThresholds(driver);
		ppt.editEmployee(driver, sData5, sData6, sData8, sData9, sData11);
		test.log(LogStatus.PASS, "Employee edited with A Ni Category Letter Successfully");
		Reporter.log("Employee edited with A Ni Category Letter Successfully", true);
		
		ppt.selectEmployee(driver, sData10);
		//, sData10
		test.log(LogStatus.PASS, "Employee Dashboard opened");
		Reporter.log("Employee Dashboard opened", true);
		
		ppt.verifyEmployeeNIMonthlyThreshold();
		test.log(LogStatus.PASS, "Director/Employee NI with Table Method Verified Successfully");
		Reporter.log("Director/Employee NI with Table Method  Verified Successfully", true);
		
		ppt.verifyEmployerNIMonthlyThreshold();
		test.log(LogStatus.PASS, "Director/Employer NI with Table Method Verified Successfully");
		Reporter.log("Director/Employer NI with Table Method  Verified Successfully", true);
		
	}

	
	@Test(priority=2)
	public void verifyCummulativeMethodDirectorNITest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("verifyCummulativeMethodDirectorNITest execution starts");
		sTestCaseID="verifyCummulativeMethodDirectorNITest_PayrollCompany";
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
		pp.verifyPayrollPageTitle(driver, sData7);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Edit Employee on Payroll Dashboard To select Director NI Method
		Reporter.log("Edit Employee will be clicked", true);
		PayrollPageThresholds ppt = new PayrollPageThresholds(driver);
		ppt.editEmployee(driver, sData5, sData6, sData8, sData9, sData11);
		test.log(LogStatus.PASS, "Employee edited with A Ni Category Letter Successfully");
		Reporter.log("Employee edited with A Ni Category Letter Successfully", true);
		
		ppt.selectEmployee(driver, sData10);
		//
		test.log(LogStatus.PASS, "Employee Dashboard opened");
		Reporter.log("Employee Dashboard opened", true);
		
		ppt.verifyEmployeeNIMonthlyThreshold();
		test.log(LogStatus.PASS, "Director/Employee NI with Cummulative Method Verified Successfully");
		Reporter.log("Director/Employee NI with Cummulative Method  Verified Successfully", true);
		
		ppt.verifyEmployerNIMonthlyThreshold();
		test.log(LogStatus.PASS, "Director/Employer NI with Cummulative Method Verified Successfully");
		Reporter.log("Director/Employer NI with Cummulative Method  Verified Successfully", true);
		
	}
	
}

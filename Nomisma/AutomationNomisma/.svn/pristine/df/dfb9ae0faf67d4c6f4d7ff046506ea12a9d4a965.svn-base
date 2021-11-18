package com.nomisma.scriptspayroll;

import java.util.HashMap;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.BusinessPom.BusinessPom;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;

import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.relevantcodes.extentreports.LogStatus;

public class AddEmployeeTest extends BaseLib {
	
	@Test
	public void addMaleEmployeeTest() throws Exception
	{

		CommonUtilities commUtils=new CommonUtilities();
		String sTestCaseID="AddMaleEmployee_PayrollCompany";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
		String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10,sData11,sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22;
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
		
		test = report.startTest("addMaleEmployeeTest execution starts");
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
		sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		sData16 = testDataMap.get("sData16").replaceAll("\"", "");
		sData17 = testDataMap.get("sData17").replaceAll("\"", "");
		sData18 = testDataMap.get("sData18").replaceAll("\"", "");
		sData19 = testDataMap.get("sData19").replaceAll("\"", "");
		sData20 = testDataMap.get("sData20").replaceAll("\"", "");
		sData21 = testDataMap.get("sData21").replaceAll("\"", "");
		sData22 = testDataMap.get("sData22").replaceAll("\"", "");
		
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
		Thread.sleep(3000);
		
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
	    pp.addEmployeePopup(driver, sData5, sData6, sData7, sData8, sData9, sData10, sData11,sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22);
	    Reporter.log("Searching Employees in the Company", true);
	    pp.verifyCurrentEmployeeMale(driver, sData5, sData6);
	  //  pp.deleteEmployee(driver, sData19);
	    test.log(LogStatus.PASS, "Employees on Dashboard Page displayed");
		Reporter.log("Employees on Dashboard Page displayed", true);
	}
	
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void addFemaleEmployeeTest() throws Exception
	{
	
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="AddFemaleEmployee_PayrollCompany";
	String testDataFile = ".\\testData\\Json\\TestDataPayroll2.json";
	String sData1, sData2, sData3, sData4, sData5, sData6,sData7, sData8,sData9,sData10,sData11,sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	
		test = report.startTest("addFemaleEmployeeTest execution starts");
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
		sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		sData16 = testDataMap.get("sData16").replaceAll("\"", "");
		sData17 = testDataMap.get("sData17").replaceAll("\"", "");
		sData18 = testDataMap.get("sData18").replaceAll("\"", "");
		sData19 = testDataMap.get("sData19").replaceAll("\"", "");
		sData20 = testDataMap.get("sData20").replaceAll("\"", "");
		sData21 = testDataMap.get("sData21").replaceAll("\"", "");
		sData22 = testDataMap.get("sData22").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		//wLib.implictWaitForSeconds(driver, 30);
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
		
		//Click Add Employee Button to open Popup
		pp.clickAddEmployeeBtn(driver);
		test.log(LogStatus.PASS, "Payroll Page Add Employee Popup displayed");
		Reporter.log("Payroll Page Add Employee Popup displayed", true);
		//wLib.implictWaitForSeconds(driver, 20);
		
		
		//Fill in Edit Company Details
		Reporter.log("Trying to Fill Details on Payroll Add Female Employee Popup", true);
	    pp.verifyPPAddEmployeeText();
	    Thread.sleep(3000);
	    pp.addFemaleEmployeePopup(driver, sData5, sData6, sData7, sData8, sData9, sData10, sData11, sData12, sData13, sData14, sData15, sData16, sData17, sData18, sData19, sData20, sData21, sData22);
	    
	    Thread.sleep(2000);
	    Reporter.log("Searching Employees in the Company", true);
	    pp.verifyCurrentEmployeeFemale(driver, sData5, sData6);
	   // pp.deleteEmployee(driver, sData19);
	    test.log(LogStatus.PASS, "Employees on Dashboard Page displayed");
		Reporter.log("Employees on Dashboard Page displayed", true);
	}

}

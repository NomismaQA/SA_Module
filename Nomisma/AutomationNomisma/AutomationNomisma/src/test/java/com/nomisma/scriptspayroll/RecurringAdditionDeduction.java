package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class RecurringAdditionDeduction extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (priority=1)//(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void RecAddition() throws InterruptedException, EmptyFileException, IOException
	{
		test = report.startTest("Recurring Addition/Deduction Test execution starts");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "RecurringAddition";
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
		String sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		String sData10 = testDataMap.get("sData10").replaceAll("\"", "");
		String sData11 = testDataMap.get("sData11").replaceAll("\"", "");
		String sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		String sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		String sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		String sData15 = testDataMap.get("sData15").replaceAll("\"", "");
		

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


		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData5);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String CurDate=dateFormat.format(date);
		
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.lnkRecAddDed.click();
		pp2.RecurringAddition(driver,sData6,sData7,sData8,sData9,sData10,sData11,sData12,sData13,sData14,sData15,CurDate);
		
			
	}
	
	@Test (priority=2)//(priority=2,retryAnalyzer = RetryAnalyzer.class)
	public void RecDeduction() throws InterruptedException, EmptyFileException, IOException
	{
		test = report.startTest("Recurring Addition/Deduction Test execution starts");

		/*
		 * Local Variables
		 */
		
		String testCaseId = "RecurringDeduction";
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
		String sData9 = testDataMap.get("sData9").replaceAll("\"", "");
		String sData10 = testDataMap.get("sData10").replaceAll("\"", "");
		String sData11 = testDataMap.get("sData11").replaceAll("\"", "");
		String sData12 = testDataMap.get("sData12").replaceAll("\"", "");
		String sData13 = testDataMap.get("sData13").replaceAll("\"", "");
		String sData14 = testDataMap.get("sData14").replaceAll("\"", "");
		String sData15 = testDataMap.get("sData15").replaceAll("\"", "");
				

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


		PayrollPage pp = new PayrollPage(driver);
		pp.verifyPayrollPageTitle(driver, sData5);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String CurDate=dateFormat.format(date);
		
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.lnkRecAddDed.click();
		pp2.RecurringDeduction(driver,sData6,sData7,sData8,sData9,sData10,sData11,sData12,sData13,sData14,sData15,CurDate);
		
			
	}
}
	
	
	

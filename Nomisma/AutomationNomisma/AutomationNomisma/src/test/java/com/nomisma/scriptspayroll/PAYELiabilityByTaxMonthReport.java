package com.nomisma.scriptspayroll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.nomisma.pom.PayrollPage2;
import com.relevantcodes.extentreports.LogStatus;

public class PAYELiabilityByTaxMonthReport extends BaseLib {

	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void PAYELiabilityByTaxMonth() throws InterruptedException, NoSuchElementException, UnhandledAlertException,NoAlertPresentException, Throwable
	{
		test = report.startTest("undoPayrollTest execution starts");
		String testCaseId="Paye_LiabilityReport";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
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
		pp.verifyPayrollPageTitle(driver, sData5);
		test.log(LogStatus.PASS, " Payroll Page title verified successfully");
		Reporter.log("Payroll Page title verified successfully", true);
		
		//Undo Payroll
		Reporter.log("Undo Payroll for the Company", true);
		PayrollPage2 pp2 = new PayrollPage2(driver);
		pp2.undoRunPayrollAccept(driver);
		test.log(LogStatus.PASS, "Undo Payroll for the Company Successfull");
		Reporter.log("Undo Payroll for the Company Successfull", true);
		
		//Run Payroll
		Reporter.log("Run Payroll for the Company", true);
		pp2.runPayroll(driver, sData5);
		Reporter.log("Run Payroll for the Company Successfull", true);
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		Reporter.log("No of tabs: "+tabs.size(),true);
		
		driver.close();
		Thread.sleep(2000);
		Reporter.log("Browser tab closed", true);
		driver.switchTo().window((String) tabs.get(1));
	
		//OpenDashboard od = new OpenDashboard(driver);
		//od.clickpayrollDashboard();	
		pp2.clickReportLink(driver);
		pp2.clickPayeeLiablityReportLink(driver);
		Thread.sleep(5000);
		

		//String payeeBFApril=pp2.payeeBFApril.getText();
		//String payeeBFMay=pp2.payeeBFApril.getText().toString();
		//String payeeBFJune=pp2.payeeBFApril.getText().toString();
	
		pp2.PayeLiabilityByTaxMonth(driver,sData6,sData7,sData8,sData5);
		pp2.PayeLiabilityByTaxMonth(driver,sData6,sData9,sData10,sData5);
		pp2.PayeLiabilityByTaxMonth(driver,sData6,sData11,sData12,sData5);

	}
	}
	
	
	

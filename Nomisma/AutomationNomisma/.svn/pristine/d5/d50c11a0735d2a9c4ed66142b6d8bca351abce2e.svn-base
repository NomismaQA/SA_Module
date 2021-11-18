package com.nomisma.scriptspayroll;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage2;

public class ImportEmployee extends BaseLib{
	
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void ImportEmployee1() throws InterruptedException, AWTException
	{
		test = report.startTest("ImportEmployee execution starts");
		String testCaseId = "ImportEmployee";
		String testDataFile = ".\\testData\\Json\\TestDataPayroll1.json";
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		String sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		String sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		String sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		String sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		String sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		
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
		

		PayrollPage2 pr=new PayrollPage2(driver);

		int rowCount=pr.cntTablerows.size()-1;
		Reporter.log("Total Employees before Import=" +rowCount, true);
		//pr.undoRunPayrollCISSuffered(driver);
		//test.log(LogStatus.PASS, "Undo Payroll for the Company Successfull");
		if((pr.cntTablerows.size()-1)>8)
		{
			Reporter.log("Calling method to delete an employee before Import", true);
			pr.deleteEmp(driver, sData5);
			//driver.navigate().refresh();
		}
			driver.navigate().refresh();
			rowCount=pr.cntTablerows.size()-1;
			Reporter.log("New Count for Total Employees before Import=" +rowCount, true);
		
		
		 ArrayList tabs = new ArrayList (driver.getWindowHandles());
		 Reporter.log("Tab's Size:"+tabs.size(),true);
		
		driver.close();
		Thread.sleep(3000);
		Reporter.log("browser tab closed", true);
		driver.switchTo().window((String) tabs.get(1));
		pr.ImportEmp(driver);
		od.clickpayrollDashboard();	
		agp.searchPayrollBusiness(sData4, driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);
		
		
		if ((pr.cntTablerows.size()-1)==rowCount)
		{
			Reporter.log("Total Employees =" +rowCount, true);
	    	Assert.fail("Unable to Import Employee");
		}
		
		Reporter.log("Total Employees after Import=" +(pr.cntTablerows.size()-1), true);
		
	}
	
	

}

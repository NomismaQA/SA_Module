package com.nomisma.scripts;

import java.util.NoSuchElementException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class AdminSearchAndAddTest extends BaseLib {
	String sTestCaseID=null;
	String[] sData=null; 
	
	@Test(enabled= false)
	public void addAgentTest() throws InterruptedException
	{
		
		test = report.startTest("addAgentTest execution starts");
		sTestCaseID="Add_Agent";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		//String username = ExcelLib.readExcelData(3, 2);
		//String password = ExcelLib.readExcelData(3, 3);
		//String agentName = ExcelLib.readExcelData(3, 4);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		//ap.login(username, password);
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.verifyHomePageTitle();
		Reporter.log("Login Successfully", true);
		wLib.implictWaitForSeconds(driver, 30);
		adp.clickAddAgentBtn();
		adp.addAgent(sData[3]);
		wLib.implictWaitForSeconds(driver, 20);		
		Reporter.log("Agent Created Successful", true);
		test.log(LogStatus.PASS, "Agent Created Successfully");
		report.endTest(test);
		report.flush();
	}
	

	@Test(priority=1)
	public void searchAgentTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("searchAgentTest execution starts");
		sTestCaseID="Search_Agent";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		adp.verifyaddedAgent(sData[4], driver);
		wLib.implictWaitForSeconds(driver, 20);
		test.log(LogStatus.PASS, "Agent text verified successfully");
		Reporter.log("Added Agent verified successfully", true);
		report.endTest(test);
		report.flush();
		
	}
	
}

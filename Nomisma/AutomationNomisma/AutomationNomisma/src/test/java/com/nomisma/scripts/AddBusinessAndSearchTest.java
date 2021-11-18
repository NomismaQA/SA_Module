package com.nomisma.scripts;

import java.util.NoSuchElementException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.relevantcodes.extentreports.LogStatus;

public class AddBusinessAndSearchTest extends BaseLib {
	
	String sTestCaseID=null;
	String[] sData=null; 
	
	@Test(priority=1)
	public void addLtdCompanyTest() throws InterruptedException
	{
		
		test = report.startTest("addLtdCompanyTest execution starts");
		sTestCaseID="Add_LtdCompany";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.verifyHomePageTitle();
		Reporter.log("Login Successfully", true);
		wLib.implictWaitForSeconds(driver, 30);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);		
		Reporter.log("Agent Page opened Successfully", true);
		test.log(LogStatus.PASS, "Agent Page opened Successfully");
		wLib.implictWaitForSeconds(driver, 30);
		AgentsPage agp=new AgentsPage(driver);
		agp.verifyAgentsPageTitle();
		agp.clickBusinessesLnk();
		wLib.implictWaitForSeconds(driver, 20);
		agp.clickAddBusinessBtn();
		wLib.implictWaitForSeconds(driver, 20);
		agp.clickAddLimitedCompanyBtn();
		wLib.implictWaitForSeconds(driver, 20);
		agp.addLimitedCompany(sData[4], sData[5], sData[6], sData[7], sData[8]);
		wLib.implictWaitForSeconds(driver, 30);
		Reporter.log("Limited Company Created Successful", true);
		test.log(LogStatus.PASS, "Limited Company Created Successfully");
		report.endTest(test);
		report.flush();
	}
	

	@Test(priority=2)
	public void searchBusinessTest() throws InterruptedException, NoSuchElementException
	{
		test = report.startTest("searchBusinessTest execution starts");
		sTestCaseID="Search_LtdCompany";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		AgentsPage agp=new AgentsPage(driver);
		agp.clickBusinessesLnk();
		agp.searchBusiness(sData[4], driver);
		test.log(LogStatus.PASS, " Limited Company page opened successfully");
		Reporter.log("Limited Company page opened successfully", true);
		report.endTest(test);
		report.flush();
		
	}


}

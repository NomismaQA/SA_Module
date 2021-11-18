package com.nomisma.scriptsBookkeeping;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.BookkeepingPage;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class AddExpenseTest extends BaseLib {

	@Test//(groups = "Regression")//, dependsOnGroups = "pre-tests")
	public void AddExpense() throws InterruptedException {

		test = report.startTest("Test execution started to Add Expense");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "AddExpenseTest";
		String testDataFile = "testData\\Json\\TestDataNomisma.json";
				
		/*
		 * Get Test Data in Map
		 */
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		String loginUser = testDataMap.get("LoginUserName").replaceAll("\"", "");
		String loginPasswd = testDataMap.get("LoginUserPassword").replaceAll("\"", "");
		String agentToBeSearched = testDataMap.get("AgentToBeSearched").replaceAll("\"", "");
		String company = testDataMap.get("Company").replaceAll("\"", "");
		String timeFrame1 = testDataMap.get("TimeFrame1").replaceAll("\"", "");
		//String timeFrame2 = testDataMap.get("TimeFrame2").replaceAll("\"", "");
		String invoiceTitle = testDataMap.get("InvoiceTitle").replaceAll("\"", "");
		String date = testDataMap.get("Date").replaceAll("\"", "");
		String ExpenseHead = testDataMap.get("ExpenseHead").replaceAll("\"", "");
		String Description = testDataMap.get("Description").replaceAll("\"", "");
		String Amount = testDataMap.get("Amount").replaceAll("\"", "");
		String VATRate = testDataMap.get("VATRate").replaceAll("\"", "");
		String VATAmount0 = testDataMap.get("VATAmount0").replaceAll("\"", "");
		String VATAmount = testDataMap.get("VATAmount").replaceAll("\"", "");
	
		AccountsPage ap = new AccountsPage(driver);
		ap.login(loginUser, loginPasswd,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(agentToBeSearched,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, company);
		test.log(LogStatus.PASS, "Company opened Successfully");

		BookkeepingPage bk = new BookkeepingPage(driver);
		bk.ExpenseReimbursement_AddExpense(driver, timeFrame1, invoiceTitle, date, ExpenseHead, Description, Amount, VATRate, VATAmount0, VATAmount);
	
		Reporter.log("Test execution completed successfully", true);
		test.log(LogStatus.PASS, "Test execution completed successfully");
		
		report.endTest(test);
		report.flush();
	}

}

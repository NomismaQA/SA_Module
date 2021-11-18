package com.nomisma.scriptsBookkeeping;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.BookkeepingPage;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class EmailInvoiceTest extends BaseLib {

	@Test//(groups = "Regression") 
	public void EmailInvoice() throws InterruptedException {

		test = report.startTest("Test execution started to send Invoice Email");
		
		/*
		 * Local Variables
		 */
		CommonUtilities commUtils=new CommonUtilities();
		String testCaseId = "EmailInvoiceTest";
		String testDataFile = ".\\testData\\Json\\TestDataNomisma.json";
				
		/*
		 * Get Test Data in Map
		 */
		
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		String loginUser = testDataMap.get("LoginUserName").replaceAll("\"", "");
		String loginPasswd = testDataMap.get("LoginUserPassword").replaceAll("\"", "");
		String agentToBeSearched = testDataMap.get("AgentToBeSearched").replaceAll("\"", "");
		String company = testDataMap.get("Company").replaceAll("\"", "");
		String timeFrame1 = testDataMap.get("TimeFrame1").replaceAll("\"", "");
		String invoiceTitle = testDataMap.get("InvoiceTitle").replaceAll("\"", "");
		String emailId = testDataMap.get("EmailId").replaceAll("\"", "");
		String successMessage = testDataMap.get("SuccessMessage").replaceAll("\"", "");
		
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
		bk.EmailInvoice(driver, timeFrame1, invoiceTitle, emailId, successMessage);
	
		Reporter.log("Test execution completed successfully", true);
		test.log(LogStatus.PASS, "Test execution completed successfully");
		
		report.endTest(test);
		report.flush();
	}

}

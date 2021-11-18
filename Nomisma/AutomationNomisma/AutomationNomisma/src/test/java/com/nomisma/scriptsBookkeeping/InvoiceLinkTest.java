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

public class InvoiceLinkTest extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test//(groups = "Regression") 
	public void InvoiceLink() throws InterruptedException {

		test = report.startTest("Test execution started to send Invoice Link");
		
		/*
		 * Local Variables
		 */
		CommonUtilities commUtils=new CommonUtilities();
		String testCaseId = "EmailInvoiceLnk";
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
		String dateFrom = testDataMap.get("dateFrom").replaceAll("\"", "");
		String dateTo = testDataMap.get("dateTo").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(loginUser, loginPasswd,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(agentToBeSearched,driver);
		
		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, company);

		BookkeepingPage bk = new BookkeepingPage(driver);
		bk.InvoiceLink(driver, timeFrame1, invoiceTitle, emailId, successMessage, dateFrom, dateTo);
	
		Reporter.log("Test execution completed successfully", true);
	}

}

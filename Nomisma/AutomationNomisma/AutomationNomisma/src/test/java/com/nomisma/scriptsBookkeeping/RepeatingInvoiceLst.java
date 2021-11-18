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

public class RepeatingInvoiceLst extends BaseLib {
	
	@Test //(groups = "pre-tests")
	public void RepeatingInvoice() throws InterruptedException {

		test = report.startTest("Test execution started to view Repeating Invoice List");

		/*
		 * Local Variables
		 */
		CommonUtilities commUtils=new CommonUtilities();
		String testCaseId = "RepeatingInvoiceLst";
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
		String Title1 = testDataMap.get("Title1").replaceAll("\"", "");
		String Title2 = testDataMap.get("Title2").replaceAll("\"", "");
		String Title3 = testDataMap.get("Title3").replaceAll("\"", "");
		String Title4 = testDataMap.get("Title4").replaceAll("\"", "");
	
		AccountsPage ap = new AccountsPage(driver);
		//ap.login(loginUser, loginPasswd);
		ap.login(loginUser, loginPasswd,driver);
		test.log(LogStatus.PASS, "Login Successfull");

		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(agentToBeSearched,driver);
		
		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, company);

		BookkeepingPage bk = new BookkeepingPage(driver);
		bk.RepeatingInvoice(driver, timeFrame1, Title1, Title2, Title3, Title4);
	
		Reporter.log("Test execution completed successfully", true);
	}

}

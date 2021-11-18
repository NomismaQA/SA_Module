package com.nomisma.SelfAssessment2019;

import java.util.HashMap;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class TestJson extends BaseLib {

	@Test//(groups = "Regression") 
	public void AddClient() throws Exception {

		test = report.startTest("Test execution started to Test Json");
		
		/*
		 * Local Variables
		 */
		CommonUtilities commUtils=new CommonUtilities();
		String testCaseId = "addClient";
		String testDataFile = ".\\testData\\Json\\TestDataNomismaSA1.json";
				
		/*
		 * Get Test Data in Map
		 */
		
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		
		String username = testDataMap.get("username").replaceAll("\"", "");
		String password = testDataMap.get("password").replaceAll("\"", "");
		String agentName = testDataMap.get("agentName").replaceAll("\"", "");
		String UTRNo = testDataMap.get("UTRNo").replaceAll("\"", "");
		String FirstName = testDataMap.get("FirstName").replaceAll("\"", "");
		String LastName = testDataMap.get("LastName").replaceAll("\"", "");
		String Address = testDataMap.get("Address").replaceAll("\"", "");
		String PostCode = testDataMap.get("PostCode").replaceAll("\"", "");
		String DateOfBirth = testDataMap.get("DateOfBirth").replaceAll("\"", "");
		String EmailId = testDataMap.get("EmailId").replaceAll("\"", "");
		//String successMessage = testDataMap.get("SuccessMessage").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(username, password,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(agentName,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		SAPOM2019Sandbox s1=new SAPOM2019Sandbox(driver);
		s1.clickSALink(driver);
		
		s1.clickClientLst(driver);
		
		s1.clkAddClientBtn(driver);
		s1.addNewClient(driver,UTRNo,FirstName,	LastName, Address, PostCode,DateOfBirth,EmailId);
				
		test.log(LogStatus.PASS, "Client Added Successfully");
		Reporter.log("Test execution completed successfully", true);
		test.log(LogStatus.PASS, "Test execution completed successfully");
		report.endTest(test);
		report.flush();
	}

}

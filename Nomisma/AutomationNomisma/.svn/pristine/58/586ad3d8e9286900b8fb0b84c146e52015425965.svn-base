package com.nomisma.SelfAssessment;

import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.nomisma.SelfAssessmentpom.SAPOM;
import com.nomisma.generic.BaseLib;

import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class PensionTaxReliefVerifyPdf extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="newDownloadpdf";
	String testDataFile = ".\\testData\\Json\\testDataSA2018.json";
	String sData1, sData2, sData3, sData4, sData5, sData6;
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	String Filename="";
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void funcPdfVerifyPensionTaxRelief() throws Exception
	{
		test = report.startTest("Login to self Assessment");
		sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		sData5 = testDataMap.get("sData5").replaceAll("\"", "");
		sData6 = testDataMap.get("sData6").replaceAll("\"", "");
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData3, driver);
		SAPOM pdf=new SAPOM(driver);
		pdf.delPdf();
		pdf.clickSALink(driver);
		
		pdf.clickClientLst(driver);
		
		pdf.selectClientLink(driver);
		
		pdf.savePdf(driver);
		
		Filename=pdf.GetFileName1(sData4,sData5);
		Reporter.log("File" + Filename, true);
		
		pdf.readPDFPensionTaxRelief(driver,sData6,Filename);
		test.log(LogStatus.PASS, "Test case for Pdf Verification for Pension added successfully");
		Reporter.log("Test execution completed successfully", true);
		report.endTest(test);
		report.flush();
	
	}
	
}
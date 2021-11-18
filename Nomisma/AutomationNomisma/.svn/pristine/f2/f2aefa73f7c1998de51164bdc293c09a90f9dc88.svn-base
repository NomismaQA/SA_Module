package com.nomisma.SelfAssessment2019;

import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;

public class PdfVerifyAdditionalInformation extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="newDownloadpdf";
	String testDataFile = ".\\testData\\Json\\testDataSA2019.json";
	String sData1, sData2, sData3, sData4, sData5, sData6;
	String Filename;
	@Test (priority=1)
	public void funcVerifyPdf() throws Exception
	{
	test = report.startTest("Login to Self Assessment Module");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
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
	SAPOM2019Sandbox pdf=new SAPOM2019Sandbox(driver);
	pdf.clickSALink(driver);
		
	pdf.clickClientLst(driver);
		
	pdf.selectClientLink(driver);
		
	pdf.savePdf(driver);
		
	Filename=pdf.GetFileName1(sData4,sData5);
	Reporter.log("File" + Filename, true);
		
	pdf.readPDFAdditionalInfo(driver,sData6,Filename);
		
	test.log(LogStatus.PASS, "PDF verification for Additional Information Income is done successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();	
	}
	
}
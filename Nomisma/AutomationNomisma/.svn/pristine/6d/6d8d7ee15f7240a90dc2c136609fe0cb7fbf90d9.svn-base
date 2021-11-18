package com.nomisma.SelfAssessment2019;

//import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.SelfAssessmentpom2019.SAPOM2019Sandbox;
import com.nomisma.generic.BaseLib;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.relevantcodes.extentreports.LogStatus;
import java.util.HashMap;
import com.nomisma.generic.CommonUtilities;

public class PdfVerifyForBlind extends BaseLib {
	CommonUtilities commUtils=new CommonUtilities();
	String sTestCaseID="newDownloadpdf";
	String testDataFile = ".\\testData\\Json\\testDataSA2019.json";
	String sData1, sData2, sData3, sData4, sData5, sData6, sData7,sData8,sData9;
	String Filename="";
	@Test (priority=1)
	public void funcVerifyPdfForBlindClient() throws Exception
	{
	test = report.startTest("Login to Self Assessment Module");
	HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, sTestCaseID);
	sData1 = testDataMap.get("sData1").replaceAll("\"", "");
	sData2 = testDataMap.get("sData2").replaceAll("\"", "");
	sData3 = testDataMap.get("sData3").replaceAll("\"", "");
	sData4 = testDataMap.get("sData4").replaceAll("\"", "");
	sData5 = testDataMap.get("sData5").replaceAll("\"", "");
	sData6 = testDataMap.get("sData6").replaceAll("\"", "");
	sData7 = testDataMap.get("sData7").replaceAll("\"", "");
	sData8 = testDataMap.get("sData8").replaceAll("\"", "");
	sData9 = testDataMap.get("sData9").replaceAll("\"", "");
	AccountsPage ap = new AccountsPage(driver);
	ap.login(sData1, sData2,driver);
	test.log(LogStatus.PASS, "Login Successfull");
	AdminPage adp = new AdminPage(driver);
	adp.searchAgent(sData3, driver);
	SAPOM2019Sandbox pdf=new SAPOM2019Sandbox(driver);
	pdf.clickSALink(driver);
	
	pdf.clickClientLst(driver);
	
	pdf.selectClientForBlind(driver);
	
	pdf.savePdf(driver);
	
	Filename=pdf.GetFileName1(sData4, sData5);
	Reporter.log("File" + Filename, true);
	
	pdf.readPDF1InURL(driver,sData6,Filename);
	
	pdf.savePdf2(driver);
	
	Filename=pdf.GetFileName1(sData4,sData7);
	Reporter.log("File " + Filename, true);
	
	pdf.readPDF2InURL(driver,sData6,Filename);
	
	pdf.savePdf3(driver);
	
	Filename=pdf.GetFileName1(sData4,sData8);
	
	Reporter.log("File" + Filename, true);
	
	pdf.readPDF3InURL(driver,sData6,Filename);
	
	pdf.savePdf4(driver);
	
	Filename=pdf.GetFileName1(sData4,sData9);
	
	Reporter.log("File" + Filename, true);
	
	pdf.readPDF4InURL(driver,sData6,Filename);
	test.log(LogStatus.PASS, "Pdf file for Blind Client checked Successfully");
	Reporter.log("Test execution completed successfully", true);
	report.endTest(test);
	report.flush();	
	}
	
}
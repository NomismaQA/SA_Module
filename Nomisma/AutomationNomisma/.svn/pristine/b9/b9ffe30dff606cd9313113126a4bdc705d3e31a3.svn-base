package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage2;
import com.nomisma.pom.PayrollPage3;
import com.relevantcodes.extentreports.LogStatus;

public class FailedRTIXMLTest extends BaseLib {
	
	String sTestCaseID=null;
	String[] sData=null;

	@Test //(retryAnalyzer = RetryAnalyzer.class)
	public void CountTest() throws InterruptedException, MalformedURLException, ParserConfigurationException, SAXException, IOException
	{
		test = report.startTest("Failed RTI Test execution starts");
		sTestCaseID="CountTest";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		
		String curUrl = driver.getCurrentUrl();
		PayrollPage3 pp3 = new PayrollPage3(driver);
		pp3.FailedRTIXML(driver,curUrl);
		Reporter.log("Failed RTI Count verified successfully", true);
}


}

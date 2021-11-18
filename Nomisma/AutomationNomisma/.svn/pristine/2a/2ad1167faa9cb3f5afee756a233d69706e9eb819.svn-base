package com.nomisma.scriptspayroll;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;


public class PayrollDashboardTest extends BaseLib {
	
	String sTestCaseID=null;
	String[] sData=null;

	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void currentStatusTest() throws InterruptedException, NoSuchElementException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		test = report.startTest("Current status Test execution starts");
		sTestCaseID="current_status";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 30);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage ag=new AgentsPage(driver);
		ag.currentStatus(driver, sData[4], sData[5], sData[6], sData[7]);
}


}

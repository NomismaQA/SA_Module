package com.nomisma.scriptscis;

import java.io.IOException;

import org.apache.poi.EmptyFileException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CISPage;
import com.nomisma.pom.OpenDashboard;
import com.relevantcodes.extentreports.LogStatus;

public class AllSubContractorsPayTotalsReport extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test (enabled = false)//(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void SubContractorsPayTotals() throws InterruptedException, EmptyFileException, IOException{
				
		test = report.startTest("Test execution started to verify SubContractors Pay Totals Report");
		sTestCaseID="SubContractorsPayTotals";
		sData=ExcelLib.toReadExcelData(sTestCaseID);
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfully");
		Thread.sleep(1000);

		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);
		wLib.implictWaitForSeconds(driver, 20);
		OpenDashboard od = new OpenDashboard(driver);
		od.clickCISDashboard();
		CISPage cis = new CISPage(driver);
		cis.SearchContractorfromDashboard(driver,sData[4]);
		cis.DeleteFilename(driver,sData[6],sData[7]);
		cis.SubContractorsPayTotals(driver);
		String Filename=cis.GetFileName(sData[6],sData[11]);
		Reporter.log("File" + Filename, true);
		cis.readPDFInURL(driver,sData[8],Filename,sData[4],sData[9]);
			
		Reporter.log("Test execution completed successfully", true);
		
		 
		report.endTest(test);
		report.flush();
	}
}

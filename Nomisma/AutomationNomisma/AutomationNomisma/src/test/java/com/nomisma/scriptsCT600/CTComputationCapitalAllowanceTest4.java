package com.nomisma.scriptsCT600;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.CT600Page;
import com.nomisma.pom.VatPage;
import com.relevantcodes.extentreports.LogStatus;

public class CTComputationCapitalAllowanceTest4 extends BaseLib {

	String sTestCaseID=null;
	String[] sData=null;
	
	@Test //(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void CTComputationCapitalAllowance4() throws InterruptedException {

		test = report.startTest("Test execution started to check CT Computation Capital Allowance 4");
		sTestCaseID="CTComputationCapitalAllowanceTest4";
		sData=ExcelLib.toReadExcelDataCT600(sTestCaseID);
		
		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData[1], sData[2]);
		test.log(LogStatus.PASS, "Login Successfull");
		Thread.sleep(2000);
		
		AdminPage adp = new AdminPage(driver);
		adp.searchAgent(sData[3], driver);

		VatPage vat = new VatPage(driver);
		vat.SearchCompany(driver, sData[4]);
		
		CT600Page ct = new CT600Page(driver);
		ct.CTComputationPart4(driver,sData[5],sData[6],sData[7],sData[8],sData[9],sData[10],sData[11],sData[12],sData[13],sData[14],sData[15],sData[16],sData[17],sData[18],sData[19],sData[20],sData[21],sData[22],sData[23],sData[24],sData[25],sData[26],sData[27],sData[28],sData[29],sData[30],sData[31],sData[32],sData[33],sData[34],sData[35],sData[36],sData[37],sData[38]);
		Reporter.log("Test execution completed successfully", true);
	}

}

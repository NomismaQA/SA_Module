package com.nomisma.scriptspayroll;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.nomisma.generic.BaseLib;
import com.nomisma.generic.CommonUtilities;
import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.RetryAnalyzer;
import com.nomisma.pom.AccountsPage;
import com.nomisma.pom.AdminPage;
import com.nomisma.pom.AgentsPage;
import com.nomisma.pom.OpenDashboard;
import com.nomisma.pom.PayrollPage;
import com.relevantcodes.extentreports.LogStatus;



public class EmailPayslipsTest extends BaseLib
{
	
	@Test (priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void payslipsTest() throws InterruptedException, NoSuchElementException
	{
		
		
		test = report.startTest("EmailPayslipsTest execution starts");
		/*
		 * Local Variables
		 */
		
		String testCaseId = "Payslip_company";
		String testDataFile = "testData\\Json\\TestDataPayroll1.json";
				
		/*
		 * Get Test Data in Map
		 */
		CommonUtilities commUtils=new CommonUtilities();
		HashMap<String, String> testDataMap = commUtils.getKeyValueFromJson(testDataFile, testCaseId);
		
		/*
		 * Extract Test Data Values
		 */
		String sData1 = testDataMap.get("sData1").replaceAll("\"", "");
		String sData2 = testDataMap.get("sData2").replaceAll("\"", "");
		String sData3 = testDataMap.get("sData3").replaceAll("\"", "");
		String sData4 = testDataMap.get("sData4").replaceAll("\"", "");
		

		AccountsPage ap = new AccountsPage(driver);
		ap.login(sData1, sData2,driver);
		test.log(LogStatus.PASS, "Login Successfull");
		
		AdminPage adp = new AdminPage(driver); 
		adp.searchAgent(sData3,driver);
		test.log(LogStatus.PASS, "Agent opened Successfully");
		
		OpenDashboard od = new OpenDashboard(driver);
		od.clickpayrollDashboard();	
		AgentsPage agp=new AgentsPage(driver);
		agp.searchPayrollBusiness(sData4, driver);
		test.log(LogStatus.PASS, " Payroll Company page opened successfully");
		Reporter.log("Payroll Company page opened successfully", true);

		PayrollPage pp=new PayrollPage(driver);
		pp.checkEmailPayslips(driver);
		
		report.endTest(test);
		report.flush();
		
}
}

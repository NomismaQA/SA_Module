package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f61a7dee-5b3b-4a44-b6bc-d6cd96b4b5d3
 @TestModellerModule(guid = "f61a7dee-5b3b-4a44-b6bc-d6cd96b4b5d3")
 public class ledger_report extends BasePage
 {
 	public ledger_report (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By ReportsElem = By.xpath("//LI[@id='ctl00_SideMenu1_reportMenu']/A/SPAN[@class='side_nav_text']");

	private By LedgerElem = By.xpath("/html/body/form/main/div[10]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[4]/td/a");

	JavascriptExecutor js;
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload");

// 		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913");
		
// 		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Reports
     * @name Click Reports
     */
	public void Click_Reports()
	{
        
		WebElement elem = getWebElement(ReportsElem);

	if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reports", "Click_Reports failed. Unable to locate object: " + ReportsElem.toString());

			Assert.fail("Unable to locate object: " + ReportsElem.toString());
        }

		elem.click();
          	

// 		ExtentReportManager.passStep(m_Driver, "Click_Reports");

// 		TestModellerLogger.PassStep(m_Driver, "Click_Reports");
	}

     
	/**
 	 * Click Ledger
     * @name Click Ledger
     */
	public void Click_Ledger()
	{
        
		WebElement elem = getWebElement(LedgerElem);
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ledger", "Click_Ledger failed. Unable to locate object: " + LedgerElem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ledger", "Click_Ledger failed. Unable to locate object: " + LedgerElem.toString());

			Assert.fail("Unable to locate object: " + LedgerElem.toString());
        }

		elem.click();
		
          	

	ExtentReportManager.passStep(m_Driver, "Click_Ledger");

	TestModellerLogger.PassStep(m_Driver, "Click_Ledger");
	}
}
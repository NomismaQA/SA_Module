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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c116f465-4b18-4fed-9cac-cdcf99039108
@TestModellerModule(guid = "c116f465-4b18-4fed-9cac-cdcf99039108")
public class supplier_list extends BasePage
{
	public supplier_list (WebDriver driver)
	{
		super(driver);
	}


	
	private By ExpenditureElem = By.xpath("//LI[@id='ctl00_SideMenu1_ExpensesMenu']/A/SPAN[@class='side_nav_text']");

	private By New_Elem = By.xpath("/html/body/form/main/div[10]/div[3]/header/div/div[2]/a");

	private By _Supplier_List_Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnAddSupplier\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Expenditure
     * @name Click Expenditure
     */
	public void Click_Expenditure()
	{
        
		WebElement elem = getWebElement(ExpenditureElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure");
	}

     
	/**
 	 * Click New 
     * @name Click New 
     */
	public void Click_New_()
	{
        
		WebElement elem = getWebElement(New_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_New_", "Click_New_ failed. Unable to locate object: " + New_Elem.toString());

			Assert.fail("Unable to locate object: " + New_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_New_");

		TestModellerLogger.PassStep(m_Driver, "Click_New_");
	}

     
	/**
 	 * Click  Supplier List 
     * @name Click  Supplier List 
     */
	public void Click__Supplier_List_()
	{
        
		WebElement elem = getWebElement(_Supplier_List_Elem);
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Supplier_List_", "Click__Supplier_List_ failed. Unable to locate object: " + _Supplier_List_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Supplier_List_", "Click__Supplier_List_ failed. Unable to locate object: " + _Supplier_List_Elem.toString());

			Assert.fail("Unable to locate object: " + _Supplier_List_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Supplier_List_");

		TestModellerLogger.PassStep(m_Driver, "Click__Supplier_List_");
	}
}
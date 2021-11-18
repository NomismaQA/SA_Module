package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/382c036c-d4c0-4277-99ac-7f2fdbaca422
@TestModellerModule(guid = "382c036c-d4c0-4277-99ac-7f2fdbaca422")
public class income_dashboardlist extends BasePage
{
	public income_dashboardlist (WebDriver driver)
	{
		super(driver);
	}


	
	private By SalesElem = By.xpath("//LI[@id='ctl00_SideMenu1_incomeMenu']/A/SPAN[@class='side_nav_text']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Sales
     * @name Click Sales
     */
	public void Click_Sales()
	{
        
		WebElement elem = getWebElement(SalesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales", "Click_Sales failed. Unable to locate object: " + SalesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales", "Click_Sales failed. Unable to locate object: " + SalesElem.toString());

			Assert.fail("Unable to locate object: " + SalesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Sales");

		TestModellerLogger.PassStep(m_Driver, "Click_Sales");
	}
}
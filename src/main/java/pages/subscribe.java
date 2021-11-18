package pages;

import pages.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/da4d8d05-176b-40a3-aea6-a11e7cbf1dfc
@TestModellerModule(guid = "da4d8d05-176b-40a3-aea6-a11e7cbf1dfc")
public class subscribe extends BasePage
{
	public subscribe (WebDriver driver)
	{
		super(driver);
	}


	
	private By _SubscribeElem = By.xpath("//*[@id=\"ctl00_SubscribebtnNew\"]");

	private By _5_VATElem = By.xpath("//*[@id=\"ctl00_cPH_lblBkkPromotionAmount\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=38483&CompanyCode=12141&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=38483&CompanyCode=12141&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=38483&CompanyCode=12141&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=38483&CompanyCode=12141&menuid=0&p=true";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=38483&CompanyCode=12141&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Subscribe
     * @name Click  Subscribe
     */
	public void Click__Subscribe()
	{
        
		WebElement elem = getWebElement(_SubscribeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Subscribe", "Click__Subscribe failed. Unable to locate object: " + _SubscribeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Subscribe", "Click__Subscribe failed. Unable to locate object: " + _SubscribeElem.toString());

			Assert.fail("Unable to locate object: " + _SubscribeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Subscribe");

		TestModellerLogger.PassStep(m_Driver, "Click__Subscribe");
	}

     
	/**
 	 * Click £5+ VAT
     * @name Click £5+ VAT
     */
	public void Click__5_VAT()
	{
        
		WebElement elem = getWebElement(_5_VATElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__5_VAT", "Click__5_VAT failed. Unable to locate object: " + _5_VATElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__5_VAT", "Click__5_VAT failed. Unable to locate object: " + _5_VATElem.toString());

			Assert.fail("Unable to locate object: " + _5_VATElem.toString());
        }

		elem.click();
          	
Reporter.log(" Sign in successfully done");
		ExtentReportManager.passStep(m_Driver, "Click__5_VAT");

		TestModellerLogger.PassStep(m_Driver, "Click__5_VAT");
	}
}
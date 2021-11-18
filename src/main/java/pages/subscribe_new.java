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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/46dc3580-8754-4df6-aa70-ec0f1b24c237
@TestModellerModule(guid = "46dc3580-8754-4df6-aa70-ec0f1b24c237")
public class subscribe_new extends BasePage
{
	public subscribe_new (WebDriver driver)
	{
		super(driver);
	}


	
	private By _SubscribeElem = By.xpath("/html/body/form/main/header/div/div[2]/ul/li[4]/a");

	private By _BookkeepElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[2]/div[2]/a[1]/div/div/div/h2/span");

	private By xPath_idfullNameElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[2]/div[2]/a[1]/div/div/div/h2/span");

	private By I_AgreeElem = By.cssSelector("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div/div[2]/div[3]/div/div[2]/aA[onclick='return\\ submitForm\\(\\)']");

	private By Pay_with_CardElem = By.xpath("//BUTTON[@type='submit']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/AccountUI/PaymentOption.aspx?FYCode=9UXtSvFCqQJPt7HFYw+dKg==&CompanyCode=q4l0Ty819YcqYjahp1a9dg==&cln=2Y5ALlWt3AdNgZztRpQxmw==&GoCardlessSubscription=true&InvoiceAmount=%C2%A320+%20VAT&customerName=sally");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/PaymentOption.aspx?FYCode=9UXtSvFCqQJPt7HFYw+dKg==&CompanyCode=q4l0Ty819YcqYjahp1a9dg==&cln=2Y5ALlWt3AdNgZztRpQxmw==&GoCardlessSubscription=true&InvoiceAmount=%C2%A320+%20VAT&customerName=sally");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/PaymentOption.aspx?FYCode=9UXtSvFCqQJPt7HFYw+dKg==&CompanyCode=q4l0Ty819YcqYjahp1a9dg==&cln=2Y5ALlWt3AdNgZztRpQxmw==&GoCardlessSubscription=true&InvoiceAmount=%C2%A320+%20VAT&customerName=sally");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/AccountUI/PaymentOption.aspx?FYCode=9UXtSvFCqQJPt7HFYw+dKg==&CompanyCode=q4l0Ty819YcqYjahp1a9dg==&cln=2Y5ALlWt3AdNgZztRpQxmw==&GoCardlessSubscription=true&InvoiceAmount=%C2%A320+%20VAT&customerName=sally";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/AccountUI/PaymentOption.aspx?FYCode=9UXtSvFCqQJPt7HFYw+dKg==&CompanyCode=q4l0Ty819YcqYjahp1a9dg==&cln=2Y5ALlWt3AdNgZztRpQxmw==&GoCardlessSubscription=true&InvoiceAmount=%C2%A320+%20VAT&customerName=sally")) {
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
 	 * Click  Bookkeep
     * @name Click  Bookkeep
     */
	public void Click__Bookkeep()
	{
        
		WebElement elem = getWebElement(_BookkeepElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Bookkeep", "Click__Bookkeep failed. Unable to locate object: " + _BookkeepElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Bookkeep", "Click__Bookkeep failed. Unable to locate object: " + _BookkeepElem.toString());

			Assert.fail("Unable to locate object: " + _BookkeepElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Bookkeep");

		TestModellerLogger.PassStep(m_Driver, "Click__Bookkeep");
	}

      
	/**
 	 * Enter xPath: '//*[@id="fullName"]'
     * @name Enter xPath: '//*[@id="fullName"]'
     */
 	public void Enter_xPath_idfullName(String xPath_idfullName)
 	{
 	    
 		WebElement elem = getWebElement(xPath_idfullNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_xPath_idfullName", "Enter_xPath_idfullName failed. Unable to locate object: " + xPath_idfullNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_xPath_idfullName", "Enter_xPath_idfullName failed. Unable to locate object: " + xPath_idfullNameElem.toString());

 			Assert.fail("Unable to locate object: " + xPath_idfullNameElem.toString());
         }

 		elem.sendKeys(xPath_idfullName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_xPath_idfullName " + xPath_idfullName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_xPath_idfullName " + xPath_idfullName);
 	}

     
	/**
 	 * Click I Agree
     * @name Click I Agree
     */
	public void Click_I_Agree()
	{
        
		WebElement elem = getWebElement(I_AgreeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_I_Agree", "Click_I_Agree failed. Unable to locate object: " + I_AgreeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_I_Agree", "Click_I_Agree failed. Unable to locate object: " + I_AgreeElem.toString());

			Assert.fail("Unable to locate object: " + I_AgreeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_I_Agree");

		TestModellerLogger.PassStep(m_Driver, "Click_I_Agree");
	}

     
	/**
 	 * Click Pay with Card
     * @name Click Pay with Card
     */
	public void Click_Pay_with_Card()
	{
        
		WebElement elem = getWebElement(Pay_with_CardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Pay_with_Card", "Click_Pay_with_Card failed. Unable to locate object: " + Pay_with_CardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Pay_with_Card", "Click_Pay_with_Card failed. Unable to locate object: " + Pay_with_CardElem.toString());

			Assert.fail("Unable to locate object: " + Pay_with_CardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Pay_with_Card");

		TestModellerLogger.PassStep(m_Driver, "Click_Pay_with_Card");
	}
}
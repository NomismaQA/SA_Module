package pages;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/49235b20-a7b3-435f-8e55-d3f6016643b0
@TestModellerModule(guid = "49235b20-a7b3-435f-8e55-d3f6016643b0")
public class unpaid_amount_verification extends BasePage
{
	public unpaid_amount_verification (WebDriver driver)
	{
		super(driver);
	}


	
	private By _550000000Elem = By.xpath("//A[@id='InvoiceAmt']/B");
	
	private By Unpaidamtbtn = By.xpath ("//*[@id=\"ctl00_cPH_DivLessItem\"]/div[1]/div/div[1]/div/div/div/div/table/tbody/tr[1]/td[1]/a");

	private By _gross_Elem = By.xpath("//div/table/tbody/tr/td[contains(text(),'Total')]//..//td[4]");
	
	String unpaidamount;
	
	JavascriptExecutor js;


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&unp=1");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&unp=1");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&unp=1");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&unp=1";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Invoice.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&unp=1")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  £5,500,000.00
     * @name Click  £5,500,000.00
     */
	public void Click__550000000()
	{
        
		WebElement elem = getWebElement(_550000000Elem);
		unpaidamount=elem.getText();
		System.out.println(unpaidamount);
		WebElement elem2 = getWebElement(Unpaidamtbtn);
		
		

	if (elem == null) {
		
		
	}
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__550000000", "Click__550000000 failed. Unable to locate object: " + _550000000Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__550000000", "Click__550000000 failed. Unable to locate object: " + _550000000Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _550000000Elem.toString());
//      }
		//elem.click();
	elem2.click();
	

		
//		WebElement elem1 = getWebElement(_550000000Elem);
//		elem1.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__550000000");

		TestModellerLogger.PassStep(m_Driver, "Click__550000000");
	}

     
	/**
 	 * Click  £5,500,000.00 
     * @name Click  £5,500,000.00 
     */
	public void Click__550000000_()
	{
		
        WebElement elem = getWebElement(_gross_Elem);
        JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
		

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__550000000_", "Click__550000000_ failed. Unable to locate object: " + _gross_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__550000000_", "Click__550000000_ failed. Unable to locate object: " + _gross_Elem.toString());

			Assert.fail("Unable to locate object: " + _gross_Elem.toString());
        }

		String Grossamount=elem.getText();
		System.out.println(Grossamount);
		Assert.assertEquals(unpaidamount,Grossamount);
		Reporter.log("Unpaid and Gross amount is matching"+ Grossamount+unpaidamount);
          

		ExtentReportManager.passStep(m_Driver, "Click__550000000_");

		TestModellerLogger.PassStep(m_Driver, "Click__550000000_");
	}
}
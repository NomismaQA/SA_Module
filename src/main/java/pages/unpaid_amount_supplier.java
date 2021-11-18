package pages;

import pages.BasePage;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/0432a0a5-e245-4b05-9cb4-6adc9628783c
 @TestModellerModule(guid = "0432a0a5-e245-4b05-9cb4-6adc9628783c")
 public class unpaid_amount_supplier extends BasePage
 {
 	public unpaid_amount_supplier (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By _300000_Elem= By.id("suppAmt1");

	

	private By Unpaidamtbtn = By.xpath("//*[@id=\"ctl00_cPH_DivLessItem\"]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]/a");
	
	private By _gross_Elem = By.xpath("//div/table/tbody/tr/td[contains(text(),'Total')]//..//td[4]");
	
	String unpaidamount;
	
	JavascriptExecutor js;
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");

// 		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&AdvanceSearch&dd=1&unp=1");
		
// 		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBill.aspx?FYCode=9588&CompanyCode=6913&IsFirstRequest=1&opt=od&AdvanceSearch&dd=1&unp=1");
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
 	 * Click Unpaid 
     * @name Click Unpaid 
     */
	public void Click_300000()
	{
        
		WebElement elem = getWebElement(_300000_Elem);
		
		unpaidamount=elem.getText();
		System.out.println("unpaidamount");
		WebElement elem2 = getWebElement(Unpaidamtbtn);

	//elem.click();
	elem2.click();
          	

// 		ExtentReportManager.passStep(m_Driver, "Click_Unpaid_");

// 		TestModellerLogger.PassStep(m_Driver, "Click_Unpaid_");
	}

     
	/**
 	 * Click  £3,000.00 
     * @name Click  £3,000.00 
     */
	public void Click__300000_()
	{
        
		WebElement elem = getWebElement(_gross_Elem);
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	if (elem == null) {
     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__300000_", "Click__300000_ failed. Unable to locate object: " + _300000_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__300000_", "Click__300000_ failed. Unable to locate object: " + _300000_Elem.toString());

			//Assert.fail("Unable to locate object: " + _gross_Elem.toString());
        }

		 elem.click();
		String Grossamount=elem.getText();
		System.out.println(Grossamount);
		Assert.assertEquals(unpaidamount,Grossamount);
		Reporter.log("Unpaid and Gross amount is matching"+ Grossamount+unpaidamount);
          	

	ExtentReportManager.passStep(m_Driver, "Click__300000_");
	TestModellerLogger.PassStep(m_Driver, "Click__300000_");
	}
}
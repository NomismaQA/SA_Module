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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cef800c3-0da4-4ea0-a5d9-1cb1773e550e
@TestModellerModule(guid = "cef800c3-0da4-4ea0-a5d9-1cb1773e550e")
public class new_invoice extends BasePage
{
	public new_invoice (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem = By.xpath("//*[@id=\"ctl00_cPH_AddInvoiceDetailsl\"]/i");

	private By ctl00cPHddlCustomerElem = By.xpath("//*[@id=\"ctl00_cPH_ddlCustomer\"]");

	private By ctl00cPHtxtInvoiceDateElem = By.xpath("//*[@id=\"ctl00_cPH_txtInvoiceDate\"]");

	private By ctl00cPHrptrProductctl00ddProductElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_ddProduct\"]");

	private By ctl00cPHrptrProductctl00txtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_txtDescription\"]");

	private By ctl00cPHrptrProductctl00txtUnitPriceElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_txtUnitPrice\"]");

	private By ctl00cPHrptrProductctl00txtQuantityElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_txtQuantity\"]");

	private By _Save_Elem = By.xpath("//*[@id=\"ctl00_cpHFooter_btnSave\"]");
	
	


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[1]/div/div/div/
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[1]/div/div/div/
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv(WebDriver driver)
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem);

	if (elem == null) {
		m_Driver.navigate().refresh();
		
  		
	}
	
	
		//elem.click();
//		JavascriptExecutor js;
//		js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('ctl00_cPH_AddInvoiceDetailsl').setAttribute('target', 'self');");
//		System.out.println("test" );
//		try {
//			Thread.sleep(11000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	m_Driver.navigate().refresh();
	//WebElement elem1 = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem);
		

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");
	}

    
	/**
 	 * Select ctl00$cPH$ddlCustomer
     * @name Select ctl00$cPH$ddlCustomer
     */
    public void Select_ctl00cPHddlCustomer(String ctl00cPHddlCustomer)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHddlCustomerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlCustomer", "Select_ctl00cPHddlCustomer failed. Unable to locate object: " + ctl00cPHddlCustomerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlCustomer", "Select_ctl00cPHddlCustomer failed. Unable to locate object: " + ctl00cPHddlCustomerElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlCustomerElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlCustomer);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlCustomer " + ctl00cPHddlCustomer);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlCustomer " + ctl00cPHddlCustomer);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtInvoiceDate
     * @name Enter ctl00$cPH$txtInvoiceDate
     */
 	public void Enter_ctl00cPHtxtInvoiceDate(String ctl00cPHtxtInvoiceDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtInvoiceDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtInvoiceDate", "Enter_ctl00cPHtxtInvoiceDate failed. Unable to locate object: " + ctl00cPHtxtInvoiceDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtInvoiceDate", "Enter_ctl00cPHtxtInvoiceDate failed. Unable to locate object: " + ctl00cPHtxtInvoiceDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtInvoiceDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtInvoiceDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtInvoiceDate " + ctl00cPHtxtInvoiceDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtInvoiceDate " + ctl00cPHtxtInvoiceDate);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrProduct$ctl00$ddProduct
     * @name Select ctl00$cPH$rptrProduct$ctl00$ddProduct
     */
    public void Select_ctl00cPHrptrProductctl00ddProduct(String ctl00cPHrptrProductctl00ddProduct)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrProductctl00ddProductElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrProductctl00ddProduct", "Select_ctl00cPHrptrProductctl00ddProduct failed. Unable to locate object: " + ctl00cPHrptrProductctl00ddProductElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrProductctl00ddProduct", "Select_ctl00cPHrptrProductctl00ddProduct failed. Unable to locate object: " + ctl00cPHrptrProductctl00ddProductElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrProductctl00ddProductElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrProductctl00ddProduct);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrProductctl00ddProduct " + ctl00cPHrptrProductctl00ddProduct);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrProductctl00ddProduct " + ctl00cPHrptrProductctl00ddProduct);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrProduct$ctl00$txtDescription
     * @name Enter ctl00$cPH$rptrProduct$ctl00$txtDescription
     */
 	public void Enter_ctl00cPHrptrProductctl00txtDescription(String ctl00cPHrptrProductctl00txtDescription)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrProductctl00txtDescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtDescription", "Enter_ctl00cPHrptrProductctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtDescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtDescription", "Enter_ctl00cPHrptrProductctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrProductctl00txtDescriptionElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrProductctl00txtDescription);
 		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		JavascriptExecutor js = (JavascriptExecutor)m_Driver;
 		js.executeScript("document.getElementById('ctl00_cPH_rptrProduct_ctl00_txtDescription').value='"+ctl00cPHrptrProductctl00txtDescription+"'");
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtDescription " + ctl00cPHrptrProductctl00txtDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtDescription " + ctl00cPHrptrProductctl00txtDescription);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrProduct$ctl00$txtUnitPrice
     * @name Enter ctl00$cPH$rptrProduct$ctl00$txtUnitPrice
     */
 	public void Enter_ctl00cPHrptrProductctl00txtUnitPrice(String ctl00cPHrptrProductctl00txtUnitPrice)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrProductctl00txtUnitPriceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtUnitPrice", "Enter_ctl00cPHrptrProductctl00txtUnitPrice failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtUnitPriceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtUnitPrice", "Enter_ctl00cPHrptrProductctl00txtUnitPrice failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtUnitPriceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrProductctl00txtUnitPriceElem.toString());
         }

 		//elem.sendKeys(ctl00cPHrptrProductctl00txtUnitPrice);
 		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		JavascriptExecutor js = (JavascriptExecutor)m_Driver;
 		js.executeScript("document.getElementById('ctl00_cPH_rptrProduct_ctl00_txtUnitPrice').value='"+ctl00cPHrptrProductctl00txtUnitPrice+"'");
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtUnitPrice " + ctl00cPHrptrProductctl00txtUnitPrice);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtUnitPrice " + ctl00cPHrptrProductctl00txtUnitPrice);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrProduct$ctl00$txtQuantity
     * @name Enter ctl00$cPH$rptrProduct$ctl00$txtQuantity
     */
 	public void Enter_ctl00cPHrptrProductctl00txtQuantity(String ctl00cPHrptrProductctl00txtQuantity)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrProductctl00txtQuantityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtQuantity", "Enter_ctl00cPHrptrProductctl00txtQuantity failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtQuantityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrProductctl00txtQuantity", "Enter_ctl00cPHrptrProductctl00txtQuantity failed. Unable to locate object: " + ctl00cPHrptrProductctl00txtQuantityElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrProductctl00txtQuantityElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrProductctl00txtQuantity);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtQuantity " + ctl00cPHrptrProductctl00txtQuantity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrProductctl00txtQuantity " + ctl00cPHrptrProductctl00txtQuantity);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
}
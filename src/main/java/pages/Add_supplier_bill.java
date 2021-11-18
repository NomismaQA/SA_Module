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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/941a453d-4c3d-4c79-989f-8c015d3e8746
@TestModellerModule(guid = "941a453d-4c3d-4c79-989f-8c015d3e8746")
public class Add_supplier_bill extends BasePage
{
	public Add_supplier_bill (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem = By.xpath("//I[@class='fa fa-plus facolor  hav_tooltip']");

	private By ctl00cPHddlSupplierElem = By.xpath("//*[@id=\"ctl00_cPH_ddlSupplier\"]");

	private By ctl00cPHtxtDateElem = By.xpath("//*[@id=\"ctl00_cPH_txtDate\"]");

	private By ctl00cPHrptrProductctl00ddExpenseHeadElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_ddExpenseHead\"]");

	private By ctl00cPHrptrProductctl00txtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_txtDescription\"]");

	private By ctl00cPHrptrProductctl00txtUnitPriceElem = By.xpath("//*[@id=\"ctl00_cPH_rptrProduct_ctl00_txtUnitPrice\"]");

	private By _Save_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/SupplierBillEditor.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Add&it=I&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div/div/tabl
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div/div/tabl
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem);

		if (elem == null) {
			m_Driver.navigate().refresh();
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
//
//			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
        }

//		elem.click();
//		m_Driver.navigate().refresh();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl");
	}

    
	/**
 	 * Select ctl00$cPH$ddlSupplier
     * @name Select ctl00$cPH$ddlSupplier
     */
    public void Select_ctl00cPHddlSupplier(String ctl00cPHddlSupplier)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHddlSupplierElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlSupplier", "Select_ctl00cPHddlSupplier failed. Unable to locate object: " + ctl00cPHddlSupplierElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlSupplier", "Select_ctl00cPHddlSupplier failed. Unable to locate object: " + ctl00cPHddlSupplierElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlSupplierElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlSupplier);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlSupplier " + ctl00cPHddlSupplier);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlSupplier " + ctl00cPHddlSupplier);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtDate
     * @name Enter ctl00$cPH$txtDate
     */
 	public void Enter_ctl00cPHtxtDate(String ctl00cPHtxtDate)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrProduct$ctl00$ddExpenseHead
     * @name Select ctl00$cPH$rptrProduct$ctl00$ddExpenseHead
     */
    public void Select_ctl00cPHrptrProductctl00ddExpenseHead(String ctl00cPHrptrProductctl00ddExpenseHead)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrProductctl00ddExpenseHeadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrProductctl00ddExpenseHead", "Select_ctl00cPHrptrProductctl00ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrProductctl00ddExpenseHeadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrProductctl00ddExpenseHead", "Select_ctl00cPHrptrProductctl00ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrProductctl00ddExpenseHeadElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrProductctl00ddExpenseHeadElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrProductctl00ddExpenseHead);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrProductctl00ddExpenseHead " + ctl00cPHrptrProductctl00ddExpenseHead);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrProductctl00ddExpenseHead " + ctl00cPHrptrProductctl00ddExpenseHead);
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

 		//elem.sendKeys(ctl00cPHrptrProductctl00txtDescription);
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
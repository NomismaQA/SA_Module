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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/001eb020-a286-47af-912d-66082c4c2cc1
@TestModellerModule(guid = "001eb020-a286-47af-912d-66082c4c2cc1")
public class import_csv extends BasePage
{
	public import_csv (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHrptrDisplayHeaderctl01ddlBankElem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayHeader_ctl01_ddlBank\"]");

	private By ctl00cPHrptrDisplayHeaderctl01ddVatCode11Elem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayHeader_ctl01_ddVatCode11\"]");

	private By _Import_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnImport\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditorBatchUploadMultiple.aspx?FYCode=9588&CompanyCode=6913&menuid=0");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditorBatchUploadMultiple.aspx?FYCode=9588&CompanyCode=6913&menuid=0");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditorBatchUploadMultiple.aspx?FYCode=9588&CompanyCode=6913&menuid=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditorBatchUploadMultiple.aspx?FYCode=9588&CompanyCode=6913&menuid=0";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/InvoiceEditorBatchUploadMultiple.aspx?FYCode=9588&CompanyCode=6913&menuid=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ctl00$cPH$rptrDisplayHeader$ctl01$ddlBank
     * @name Select ctl00$cPH$rptrDisplayHeader$ctl01$ddlBank
     */
    public void Select_ctl00cPHrptrDisplayHeaderctl01ddlBank(String ctl00cPHrptrDisplayHeaderctl01ddlBank)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrDisplayHeaderctl01ddlBankElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank", "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank failed. Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddlBankElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank", "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank failed. Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddlBankElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddlBankElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrDisplayHeaderctl01ddlBank);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank " + ctl00cPHrptrDisplayHeaderctl01ddlBank);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddlBank " + ctl00cPHrptrDisplayHeaderctl01ddlBank);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrDisplayHeader$ctl01$ddVatCode11
     * @name Select ctl00$cPH$rptrDisplayHeader$ctl01$ddVatCode11
     */
    public void Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11(String ctl00cPHrptrDisplayHeaderctl01ddVatCode11)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrDisplayHeaderctl01ddVatCode11Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11", "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11 failed. Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddVatCode11Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11", "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11 failed. Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddVatCode11Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrDisplayHeaderctl01ddVatCode11Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrDisplayHeaderctl01ddVatCode11);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11 " + ctl00cPHrptrDisplayHeaderctl01ddVatCode11);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrDisplayHeaderctl01ddVatCode11 " + ctl00cPHrptrDisplayHeaderctl01ddVatCode11);
 	}

     
	/**
 	 * Click  Import 
     * @name Click  Import 
     */
	public void Click__Import_()
	{
        
		WebElement elem = getWebElement(_Import_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

			Assert.fail("Unable to locate object: " + _Import_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Import_");

		TestModellerLogger.PassStep(m_Driver, "Click__Import_");
	}
}
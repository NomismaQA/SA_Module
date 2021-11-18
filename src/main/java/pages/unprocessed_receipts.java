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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/12c2f581-a100-4d4b-af52-668efe7c6db0
 @TestModellerModule(guid = "12c2f581-a100-4d4b-af52-668efe7c6db0")
 public class unprocessed_receipts extends BasePage
 {
 	public unprocessed_receipts (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By _Upload_Receipt_Elem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnUpload\"]");

	private By ctl00cPHFileUpload1Elem = By.xpath("//*[@id=\"ctl00_cPH_FileUpload1\"]");

	private By ctl00cPHtxtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_txtDescription\"]");

	private By UploadElem = By.xpath("//*[@id=\"ctl00_cphFooter_btnUpload\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=9588&CompanyCode=6913");

// 		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=9588&CompanyCode=6913");
		
// 		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=9588&CompanyCode=6913");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=9588&CompanyCode=6913";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/ReceiptFileList.aspx?FYCode=9588&CompanyCode=6913")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Upload Receipt 
     * @name Click  Upload Receipt 
     */
	public void Click__Upload_Receipt_()
	{
        
		WebElement elem = getWebElement(_Upload_Receipt_Elem);

	if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Upload_Receipt_", "Click__Upload_Receipt_ failed. Unable to locate object: " + _Upload_Receipt_Elem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Upload_Receipt_", "Click__Upload_Receipt_ failed. Unable to locate object: " + _Upload_Receipt_Elem.toString());

			Assert.fail("Unable to locate object: " + _Upload_Receipt_Elem.toString());
        }

		elem.click();
          	

// 		ExtentReportManager.passStep(m_Driver, "Click__Upload_Receipt_");

// 		TestModellerLogger.PassStep(m_Driver, "Click__Upload_Receipt_");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload1
     * @name Enter ctl00$cPH$FileUpload1
     */
 	public void Enter_ctl00cPHFileUpload1(String ctl00cPHFileUpload1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[10]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHFileUpload1Elem);

		if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload1", "Enter_ctl00cPHFileUpload1 failed. Unable to locate object: " + ctl00cPHFileUpload1Elem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFileUpload1", "Enter_ctl00cPHFileUpload1 failed. Unable to locate object: " + ctl00cPHFileUpload1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFileUpload1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHFileUpload1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		// ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);

  		// TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtDescription
     * @name Enter ctl00$cPH$txtDescription
     */
 	public void Enter_ctl00cPHtxtDescription(String ctl00cPHtxtDescription)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[10]/div[3]/header/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtDescriptionElem);

		if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDescription);
 		
		m_Driver.switchTo().defaultContent();

 		
  		// ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);

  		// TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);
 	}

     
	/**
 	 * Click Upload
     * @name Click Upload
     */
	public void Click_Upload()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[10]/div[3]/header/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(UploadElem);

	if (elem == null) {
//     		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload", "Click_Upload failed. Unable to locate object: " + UploadElem.toString());

//     		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload", "Click_Upload failed. Unable to locate object: " + UploadElem.toString());

			Assert.fail("Unable to locate object: " + UploadElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

// 		ExtentReportManager.passStep(m_Driver, "Click_Upload");

// 		TestModellerLogger.PassStep(m_Driver, "Click_Upload");
	}
}
package pages;

import pages.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c5fa8a0a-a9ab-44b6-a29a-8d7311959d09
@TestModellerModule(guid = "c5fa8a0a-a9ab-44b6-a29a-8d7311959d09")
public class sales_upload_feature extends BasePage
{
	public sales_upload_feature (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem = By.xpath("//I[@class='fa fa-upload facolor  hav_tooltip']");

	private By ctl00cPHFileUpload1Elem = By.xpath("//*[@id=\"ctl00_cPH_FileUpload1\"]");

	private By Upload_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnUploadBatch\"]");


	
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
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[1]/div/div/div/
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[1]/div/div/div/
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem);
		m_Driver.navigate().refresh();

//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
//
//			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
//        }
//
//		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload1
     * @name Enter ctl00$cPH$FileUpload1
     */
 	public void Enter_ctl00cPHFileUpload1(String ctl00cPHFileUpload1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFileUpload1Elem);
 		elem.sendKeys("C:\\SalesInvoiceBatchUploadSample.csv");

 		//elem.sendKeys(ctl00cPHFileUpload1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);
 	}

     
	/**
 	 * Click Upload 
     * @name Click Upload 
     */
	public void Click_Upload_()
	{
        
		WebElement elem = getWebElement(Upload_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_", "Click_Upload_ failed. Unable to locate object: " + Upload_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_", "Click_Upload_ failed. Unable to locate object: " + Upload_Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_");
	}
}
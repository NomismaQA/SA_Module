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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aec23570-8b07-468b-9840-03b430e9aa69
 @TestModellerModule(guid = "aec23570-8b07-468b-9840-03b430e9aa69")
 public class upload_expense extends BasePage
 {
 	public upload_expense (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem = By.xpath("//A[@id='ctl00_cPH_uploadExpense']/I[@class='fa fa-upload hav_tooltip facolor']");

	private By ctl00cPHfuExpenseListElem = By.xpath("//*[@id=\"ctl00_cPH_fuExpenseList\"]");

	private By _Upload_Elem = By.xpath("//*[@id=\"ctl00_cPH_lnkBtn_Upload\"]");

	private By _Save_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/reimbursementExpenseUpload.aspx?FYCode=9588&CompanyCode=6913&id=0&action=Upload")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[5]/div/div/tabl
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[5]/div/div/tabl
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem);
		m_Driver.navigate().refresh();
		
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());
//
//			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());
//        }
//
//		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl");
	}

      
	/**
 	 * Enter ctl00$cPH$fuExpenseList
     * @name Enter ctl00$cPH$fuExpenseList
     */
 	public void Enter_ctl00cPHfuExpenseList(String ctl00cPHfuExpenseList)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHfuExpenseListElem);
 		elem.sendKeys("C:\\SampleTemplateReimbursementExpense.csv");

 		

 		//elem.sendKeys(ctl00cPHfuExpenseList);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHfuExpenseList " + ctl00cPHfuExpenseList);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHfuExpenseList " + ctl00cPHfuExpenseList);
 	}

     
	/**
 	 * Click  Upload 
     * @name Click  Upload 
     */
	public void Click__Upload_()
	{
        
		WebElement elem = getWebElement(_Upload_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Upload_", "Click__Upload_ failed. Unable to locate object: " + _Upload_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Upload_", "Click__Upload_ failed. Unable to locate object: " + _Upload_Elem.toString());

			Assert.fail("Unable to locate object: " + _Upload_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Upload_");

		TestModellerLogger.PassStep(m_Driver, "Click__Upload_");
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
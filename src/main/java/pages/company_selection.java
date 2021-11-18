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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/9b9a50ab-866a-4257-bbb3-fa288f7cfb01
@TestModellerModule(guid = "9b9a50ab-866a-4257-bbb3-fa288f7cfb01")
public class company_selection extends BasePage
{
	public company_selection (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHddlCompanyTypeElem = By.xpath("//*[@id=\"ctl00_cPH_ddlCompanyType\"]");

	private By ctl00cPHtxtAddress1Elem = By.xpath("//*[@id=\"ctl00_cPH_txtAddress1\"]");

	private By ctl00cPHtxtAddress2Elem = By.xpath("//*[@id=\"ctl00_cPH_txtAddress2\"]");

	private By ctl00cPHtxtPostCodeElem = By.xpath("//*[@id=\"ctl00_cPH_txtPostCode\"]");

	private By ctl00cPHtxtWebsiteElem = By.xpath("//*[@id=\"ctl00_cPH_txtWebsite\"]");

	private By Save_ChangesElem = By.xpath("//*[@id=\"ctl00_cPH_btnSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=G9pT__%3f-Z%3f8wEVVJ&loginname=deepanshue89%40gmail.com");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=G9pT__%3f-Z%3f8wEVVJ&loginname=deepanshue89%40gmail.com");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=G9pT__%3f-Z%3f8wEVVJ&loginname=deepanshue89%40gmail.com");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=G9pT__%3f-Z%3f8wEVVJ&loginname=deepanshue89%40gmail.com";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=G9pT__%3f-Z%3f8wEVVJ&loginname=deepanshue89%40gmail.com")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ctl00$cPH$ddlCompanyType
     * @name Select ctl00$cPH$ddlCompanyType
     */
    public void Select_ctl00cPHddlCompanyType(String ctl00cPHddlCompanyType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHddlCompanyTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlCompanyType", "Select_ctl00cPHddlCompanyType failed. Unable to locate object: " + ctl00cPHddlCompanyTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlCompanyType", "Select_ctl00cPHddlCompanyType failed. Unable to locate object: " + ctl00cPHddlCompanyTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlCompanyTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlCompanyType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlCompanyType " + ctl00cPHddlCompanyType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlCompanyType " + ctl00cPHddlCompanyType);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress1
     * @name Enter ctl00$cPH$txtAddress1
     */
 	public void Enter_ctl00cPHtxtAddress1(String ctl00cPHtxtAddress1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAddress1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress2
     * @name Enter ctl00$cPH$txtAddress2
     */
 	public void Enter_ctl00cPHtxtAddress2(String ctl00cPHtxtAddress2)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAddress2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPostCode
     * @name Enter ctl00$cPH$txtPostCode
     */
 	public void Enter_ctl00cPHtxtPostCode(String ctl00cPHtxtPostCode)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode", "Enter_ctl00cPHtxtPostCode failed. Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode", "Enter_ctl00cPHtxtPostCode failed. Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPostCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPostCode " + ctl00cPHtxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPostCode " + ctl00cPHtxtPostCode);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtWebsite
     * @name Enter ctl00$cPH$txtWebsite
     */
 	public void Enter_ctl00cPHtxtWebsite(String ctl00cPHtxtWebsite)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtWebsiteElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtWebsite", "Enter_ctl00cPHtxtWebsite failed. Unable to locate object: " + ctl00cPHtxtWebsiteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtWebsite", "Enter_ctl00cPHtxtWebsite failed. Unable to locate object: " + ctl00cPHtxtWebsiteElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtWebsiteElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtWebsite);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtWebsite " + ctl00cPHtxtWebsite);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtWebsite " + ctl00cPHtxtWebsite);
 	}

     
	/**
 	 * Click Save Changes
     * @name Click Save Changes
     */
	public void Click_Save_Changes()
	{
        
		WebElement elem = getWebElement(Save_ChangesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Changes", "Click_Save_Changes failed. Unable to locate object: " + Save_ChangesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Changes", "Click_Save_Changes failed. Unable to locate object: " + Save_ChangesElem.toString());

			Assert.fail("Unable to locate object: " + Save_ChangesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Changes");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Changes");
	}
}
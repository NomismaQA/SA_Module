package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3ac107b0-0b2e-408f-82cd-c8d8c303bcda
@TestModellerModule(guid = "3ac107b0-0b2e-408f-82cd-c8d8c303bcda")
public class passwordsettings extends BasePage
{
	public passwordsettings (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHtxtNewPasswordElem = By.xpath("//*[@id=\"ctl00_cPH_txtNewPassword\"]");

	private By ctl00cPHtxtRetypePasswordElem = By.xpath("//*[@id=\"ctl00_cPH_txtRetypePassword\"]");

	private By SET_PASSWORDElem = By.xpath("//*[@id=\"ctl00_cPH_btnChangePassword\"]");

	private By SkipElem = By.xpath("//*[@id=\"ctl00_cPH_btnSkip\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=Yzhp3a04qJvKS!Cm&loginname=rs9314157+47@gmail.com");
		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=Yzhp3a04qJvKS!Cm&loginname=rs9314157+47@gmail.com");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=Yzhp3a04qJvKS!Cm&loginname=rs9314157+47@gmail.com");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=Yzhp3a04qJvKS!Cm&loginname=rs9314157+47@gmail.com";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/SSOUI/ResetPassword.aspx?apiv1=Yzhp3a04qJvKS!Cm&loginname=rs9314157+47@gmail.com")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPH$txtNewPassword
     * @name Enter ctl00$cPH$txtNewPassword
     */
 	public void Enter_ctl00cPHtxtNewPassword(String ctl00cPHtxtNewPassword)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtNewPasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtNewPassword", "Enter_ctl00cPHtxtNewPassword failed. Unable to locate object: " + ctl00cPHtxtNewPasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtNewPassword", "Enter_ctl00cPHtxtNewPassword failed. Unable to locate object: " + ctl00cPHtxtNewPasswordElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtNewPasswordElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtNewPassword);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	

 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtNewPassword " + ctl00cPHtxtNewPassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtNewPassword " + ctl00cPHtxtNewPassword);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtRetypePassword
     * @name Enter ctl00$cPH$txtRetypePassword
     */
 	public void Enter_ctl00cPHtxtRetypePassword(String ctl00cPHtxtRetypePassword)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtxtRetypePasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRetypePassword", "Enter_ctl00cPHtxtRetypePassword failed. Unable to locate object: " + ctl00cPHtxtRetypePasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRetypePassword", "Enter_ctl00cPHtxtRetypePassword failed. Unable to locate object: " + ctl00cPHtxtRetypePasswordElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtRetypePasswordElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtRetypePassword);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtRetypePassword " + ctl00cPHtxtRetypePassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtRetypePassword " + ctl00cPHtxtRetypePassword);
 	}

     
	/**
 	 * Click SET PASSWORD
     * @name Click SET PASSWORD
     */
	public void Click_SET_PASSWORD()
	{
        
		WebElement elem = getWebElement(SET_PASSWORDElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SET_PASSWORD", "Click_SET_PASSWORD failed. Unable to locate object: " + SET_PASSWORDElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SET_PASSWORD", "Click_SET_PASSWORD failed. Unable to locate object: " + SET_PASSWORDElem.toString());

			Assert.fail("Unable to locate object: " + SET_PASSWORDElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SET_PASSWORD");

		TestModellerLogger.PassStep(m_Driver, "Click_SET_PASSWORD");
	}

     
	/**
 	 * Click Skip
     * @name Click Skip
     */
	public void Click_Skip()
	{
        
		WebElement elem = getWebElement(SkipElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Skip", "Click_Skip failed. Unable to locate object: " + SkipElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Skip", "Click_Skip failed. Unable to locate object: " + SkipElem.toString());

			Assert.fail("Unable to locate object: " + SkipElem.toString());
        }

		elem.click();
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  	

          	

		ExtentReportManager.passStep(m_Driver, "Click_Skip");

		TestModellerLogger.PassStep(m_Driver, "Click_Skip");
	}
}
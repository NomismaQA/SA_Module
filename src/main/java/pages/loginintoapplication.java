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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/970ec521-4d58-40cb-bdcf-0af9717f2873
@TestModellerModule(guid = "970ec521-4d58-40cb-bdcf-0af9717f2873")
public class loginintoapplication extends BasePage
{
	public loginintoapplication (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHloginElem = By.xpath("//*[@id=\"ctl00_cPH_login\"]");

	private By ctl00cPHpassElem = By.xpath("//*[@id=\"ctl00_cPH_pass\"]");

	private By LoginElem = By.xpath("//*[@id=\"ctl00_cPH_btnLogin\"]");

	private By SkipElem = By.xpath("//*[@id=\"ctl00_cPH_btnSkip\"]");

	private By Skip_1Elem = By.xpath("//*[@id=\"ca06e447-de41-f231-5c8c-0bca91b63484\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36629&CompanyCode=11908&menuid=0&p=truehttps://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36714&CompanyCode=11929&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36714&CompanyCode=11929&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36714&CompanyCode=11929&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36714&CompanyCode=11929&menuid=0&p=true";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=36714&CompanyCode=11929&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPH$login
     * @name Enter ctl00$cPH$login
     */
 	public void Enter_ctl00cPHlogin(String ctl00cPHlogin)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHloginElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHloginElem.toString());
         }

 		elem.sendKeys(ctl00cPHlogin);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	

 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);
 	}

      
	/**
 	 * Enter ctl00$cPH$pass
     * @name Enter ctl00$cPH$pass
     */
 	public void Enter_ctl00cPHpass(String ctl00cPHpass)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHpassElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHpassElem.toString());
         }

 		elem.sendKeys(ctl00cPHpass);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	

 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);
 	}

     
	/**
 	 * Click Login
     * @name Click Login
     */
	public void Click_Login()
	{
        
		WebElement elem = getWebElement(LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

			Assert.fail("Unable to locate object: " + LoginElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Login");

		TestModellerLogger.PassStep(m_Driver, "Click_Login");
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  	

          	

		ExtentReportManager.passStep(m_Driver, "Click_Skip");

		TestModellerLogger.PassStep(m_Driver, "Click_Skip");
	}

     
	/**
 	 * Click Skip
     * @name Click Skip
     */
	public void Click_Skip_1()
	{
        
		WebElement elem = getWebElement(Skip_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Skip_1", "Click_Skip_1 failed. Unable to locate object: " + Skip_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Skip_1", "Click_Skip_1 failed. Unable to locate object: " + Skip_1Elem.toString());

			Assert.fail("Unable to locate object: " + Skip_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Skip_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Skip_1");
	}
}
package pages;

import pages.BasePage;
import org.openqa.selenium.By;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e29c2b1e-2b22-4579-9f39-259cceb3b5fe
@TestModellerModule(guid = "e29c2b1e-2b22-4579-9f39-259cceb3b5fe")
public class email extends BasePage
{
	public email (WebDriver driver)
	{
		super(driver);
	}


	
	private By emailElem = By.cssSelector("INPUT[aria-label=\"Email\\ or\\ phone\"]");

	private By NextElem = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");

	private By passwordElem = By.cssSelector("INPUT[aria-label=\"Enter\\ your\\ password\"]");

	private By NomismaElem = By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[4]/div[2]/span/span");

	private By ActivateElem = By.xpath("//A/BUTTON");

	
	private By Next1Elem = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");

	
	public void GoToUrl()
	{
		m_Driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

        if (!currentUrl.equals("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter email
     * @name Enter email
     */
 	public void Enter_email(String email)
 	{
 	    
 		WebElement elem = getWebElement(emailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_email", "Enter_email failed. Unable to locate object: " + emailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_email", "Enter_email failed. Unable to locate object: " + emailElem.toString());

 			Assert.fail("Unable to locate object: " + emailElem.toString());
         }

 		elem.sendKeys(email);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	

 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_email " + email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_email " + email);
 	}

     
	/**
 	 * Click Next
     * @name Click Next
     */
	public void Click_Next()
	{
        
		WebElement elem = getWebElement(NextElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next", "Click_Next failed. Unable to locate object: " + NextElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next", "Click_Next failed. Unable to locate object: " + NextElem.toString());

			Assert.fail("Unable to locate object: " + NextElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Next");

		TestModellerLogger.PassStep(m_Driver, "Click_Next");
	}

      
	/**
 	 * Enter password
     * @name Enter password
     */
 	public void Enter_password(String password)
 	{
 	    
 		WebElement elem = getWebElement(passwordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_password", "Enter_password failed. Unable to locate object: " + passwordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_password", "Enter_password failed. Unable to locate object: " + passwordElem.toString());

 			Assert.fail("Unable to locate object: " + passwordElem.toString());
         }

 		elem.sendKeys(password);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_password " + password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_password " + password);
 	}

     
	/**
 	 * Click Nomisma
     * @name Click Nomisma
     */
	public void Click_Nomisma()
	{
        
		WebElement elem = getWebElement(NomismaElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Nomisma", "Click_Nomisma failed. Unable to locate object: " + NomismaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Nomisma", "Click_Nomisma failed. Unable to locate object: " + NomismaElem.toString());

			Assert.fail("Unable to locate object: " + NomismaElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Nomisma");

		TestModellerLogger.PassStep(m_Driver, "Click_Nomisma");
	}

     
	/**
 	 * Click Activate
     * @name Click Activate
     */
	public void Click_Activate()
	{
        
		WebElement elem = getWebElement(ActivateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Activate", "Click_Activate failed. Unable to locate object: " + ActivateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Activate", "Click_Activate failed. Unable to locate object: " + ActivateElem.toString());

			Assert.fail("Unable to locate object: " + ActivateElem.toString());
        }

		elem.click();
		

          	

		ExtentReportManager.passStep(m_Driver, "Click_Activate");

		TestModellerLogger.PassStep(m_Driver, "Click_Activate");
	}


	public void Click_Next1() {
		// TODO Auto-generated method stub
//		Reporter.log("Free trial registration done");
		Reporter.log("email sign in verified");
		Reporter.log("password reset done ");
		Reporter.log("login into application done");
		Reporter.log("click on subscribe button done");
		Reporter.log("User agreed to terms and services verified");
//		Reporter.log("click on pay with card");
	}
}
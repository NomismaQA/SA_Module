package pages;

import pages.BasePage;

import java.util.ArrayList;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b08cb3a1-c946-4f34-8efd-24824998cbfc
@TestModellerModule(guid = "b08cb3a1-c946-4f34-8efd-24824998cbfc")
public class email_verification extends BasePage
{
	public email_verification (WebDriver driver)
	{
		super(driver);
	}


	
	private By identifierElem = By.cssSelector("INPUT[aria-label=\"Email\\ or\\ phone\"]");

	private By NextElem = By.xpath("//BUTTON[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']");

	private By passwordElem = By.cssSelector("INPUT[aria-label=\"Enter\\ your\\ password\"]");

	private By NomismaElem = By.xpath("//DIV[@id=':63']/SPAN[@class='bA4']/SPAN[@name='Nomisma']");

	private By ActivateElem = By.xpath("//A/BUTTON");

	private By ctl00cPHtxtNewPasswordElem = By.xpath("//*[@id=\"ctl00_cPH_txtNewPassword\"]");

	private By ctl00cPHtxtRetypePasswordElem = By.xpath("//*[@id=\"ctl00_cPH_txtRetypePassword\"]");

	private By SET_PASSWORDElem = By.xpath("//*[@id=\"ctl00_cPH_btnChangePassword\"]");

	private By SkipElem = By.xpath("//*[@id=\"ctl00_cPH_btnSkip\"]");

	private By Information_successfully_savedElem = By.xpath("//*[@id=\"ctl00_cPH_lblError\"]");

	private By ctl00cPHloginElem = By.xpath("//*[@id=\"ctl00_cPH_login\"]");

	private By ctl00cPHpassElem = By.xpath("//*[@id=\"ctl00_cPH_pass\"]");

	private By LoginElem = By.xpath("//*[@id=\"ctl00_cPH_btnLogin\"]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=0696fb4d-1c4e-40cd-ab54-8995ed58791c";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=0696fb4d-1c4e-40cd-ab54-8995ed58791c")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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

     
	/**
 	 * Click Information successfully saved.
     * @name Click Information successfully saved.
     */
	public void Click_Information_successfully_saved()
	{
        
		WebElement elem = getWebElement(Information_successfully_savedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Information_successfully_saved", "Click_Information_successfully_saved failed. Unable to locate object: " + Information_successfully_savedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Information_successfully_saved", "Click_Information_successfully_saved failed. Unable to locate object: " + Information_successfully_savedElem.toString());

			Assert.fail("Unable to locate object: " + Information_successfully_savedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Information_successfully_saved");

		TestModellerLogger.PassStep(m_Driver, "Click_Information_successfully_saved");
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_Skip");

		TestModellerLogger.PassStep(m_Driver, "Click_Skip");
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
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);
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
 	 * Enter identifier
     * @name Enter identifier
     */
 	public void Enter_identifier(String identifier)
 	{
 	    
 		WebElement elem = getWebElement(identifierElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_identifier", "Enter_identifier failed. Unable to locate object: " + identifierElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_identifier", "Enter_identifier failed. Unable to locate object: " + identifierElem.toString());

 			Assert.fail("Unable to locate object: " + identifierElem.toString());
         }

 		elem.sendKeys(identifier);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_identifier " + identifier);

  		TestModellerLogger.PassStep(m_Driver, "Enter_identifier " + identifier);
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

	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=0696fb4d-1c4e-40cd-ab54-8995ed58791c");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=0696fb4d-1c4e-40cd-ab54-8995ed58791c");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=0696fb4d-1c4e-40cd-ab54-8995ed58791c");
	}

public void Switch_Tab()

    {

        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

 

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));

    }}
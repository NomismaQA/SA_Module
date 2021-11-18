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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/82928131-80b9-430d-9424-c062e8f24816
@TestModellerModule(guid = "82928131-80b9-430d-9424-c062e8f24816")
public class Exisitng_user extends BasePage
{
	public Exisitng_user (WebDriver driver)
	{
		super(driver);
	}


	
	private By _A_User_with_same_Login_Name_already_exists_Elem = By.xpath("//DIV[@class='entry-content']/DIV[@class='row']/CENTER");

	private By Log_inElem = By.xpath("/html/body/header/div[3]/div/ul/li[3]/a");

	private By ctl00cPHloginElem = By.xpath("//*[@id=\"ctl00_cPH_login\"]");

	private By ctl00cPHpassElem = By.xpath("//*[@id=\"ctl00_cPH_pass\"]");

	private By LoginElem = By.xpath("//*[@id=\"ctl00_cPH_btnLogin\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=6e85966a-ad31-4cda-be19-ad0b8b5842b6");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=6e85966a-ad31-4cda-be19-ad0b8b5842b6");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=6e85966a-ad31-4cda-be19-ad0b8b5842b6");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=6e85966a-ad31-4cda-be19-ad0b8b5842b6";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/ssoui/Signin.aspx?token=6e85966a-ad31-4cda-be19-ad0b8b5842b6")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  A User with same Login Name already exists 
     * @name Click  A User with same Login Name already exists 
     */
//	public void Click__A_User_with_same_Login_Name_already_exists_()
//	{
//        
//		WebElement elem = getWebElement(_A_User_with_same_Login_Name_already_exists_Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__A_User_with_same_Login_Name_already_exists_", "Click__A_User_with_same_Login_Name_already_exists_ failed. Unable to locate object: " + _A_User_with_same_Login_Name_already_exists_Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__A_User_with_same_Login_Name_already_exists_", "Click__A_User_with_same_Login_Name_already_exists_ failed. Unable to locate object: " + _A_User_with_same_Login_Name_already_exists_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _A_User_with_same_Login_Name_already_exists_Elem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click__A_User_with_same_Login_Name_already_exists_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__A_User_with_same_Login_Name_already_exists_");
//	}

     
	/**
 	 * Click Log in
     * @name Click Log in
     */
	public void Click_Log_in()
	{
        
		WebElement elem = getWebElement(Log_inElem);

		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Log_in", "Click_Log_in failed. Unable to locate object: " + Log_inElem.toString());
//
//			Assert.fail("Unable to locate object: " + Log_inElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Log_in");

		TestModellerLogger.PassStep(m_Driver, "Click_Log_in");
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
}
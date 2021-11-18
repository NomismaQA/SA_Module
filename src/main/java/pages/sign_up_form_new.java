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
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7a02af7e-d5cd-4134-a9b4-a1d7e100dcf3
@TestModellerModule(guid = "7a02af7e-d5cd-4134-a9b4-a1d7e100dcf3")
public class sign_up_form_new extends BasePage
{
	public sign_up_form_new (WebDriver driver)
	{
		super(driver);
	}


	
	private By Free_TrialElem = By.xpath("/html/body/section[1]/div/div/div[1]/div/a");

	private By Name_FirstElem = By.xpath("//*[@id=\"Name_First\"]");

	private By Name_LastElem = By.xpath("//*[@id=\"Name_Last\"]");

	private By PhoneNumber_countrycodeElem = By.xpath("//*[@id=\"international_PhoneNumber_countrycode\"]");

	private By EmailElem = By.xpath("//*[@id=\"Email\"]");

	private By DropdownElem = By.xpath("//*[@id=\"getval\"]");

	private By SingleLine1Elem = By.xpath("//*[@id=\"cname\"]");

	private By I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_Elem = By.xpath("//*[@id=\"DecisionBox\"]");

	private By SubmitElem = By.xpath("//*[@id=\"btnsubmit\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://www.nomisma.co.uk");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.nomisma.co.uk");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.nomisma.co.uk");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://www.nomisma.co.uk";

        if (!currentUrl.equals("https://www.nomisma.co.uk")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Free Trial
     * @name Click Free Trial
     */
	public void Click_Free_Trial()
	{
        
		WebElement elem = getWebElement(Free_TrialElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Free_Trial", "Click_Free_Trial failed. Unable to locate object: " + Free_TrialElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Free_Trial", "Click_Free_Trial failed. Unable to locate object: " + Free_TrialElem.toString());

			Assert.fail("Unable to locate object: " + Free_TrialElem.toString());
        }
	ClosePopup.ValidateAndPopUp2(m_Driver);
//		m_Driver.navigate().refresh();

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Free_Trial");

		TestModellerLogger.PassStep(m_Driver, "Click_Free_Trial");
	}

      
	/**
 	 * Enter Name_First
     * @name Enter Name_First
     */
	public void GoToUrl1()
	{
		m_Driver.get("https://www.nomisma.co.uk/freetrialhttps://www.nomisma.co.uk");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.nomisma.co.uk/freetrialhttps://www.nomisma.co.uk");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL -https://www.nomisma.co.uk/freetrial");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl1()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://www.nomisma.co.uk/freetrial";

        if (!currentUrl.equals("https://www.nomisma.co.uk")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

 	public void Enter_Name_First(String Name_First)
 	{
 	    
 		WebElement elem = getWebElement(Name_FirstElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Name_First", "Enter_Name_First failed. Unable to locate object: " + Name_FirstElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Name_First", "Enter_Name_First failed. Unable to locate object: " + Name_FirstElem.toString());

 			Assert.fail("Unable to locate object: " + Name_FirstElem.toString());
         }

 		jsExec.executeScript("arguments[0].click();", elem);
// 		elem.sendKeys(Name_First);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Name_First " + Name_First);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Name_First " + Name_First);
 	}

      
	/**
 	 * Enter Name_Last
     * @name Enter Name_Last
     */
 	public void Enter_Name_Last(String Name_Last)
 	{
 	    
 		WebElement elem = getWebElement(Name_LastElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Name_Last", "Enter_Name_Last failed. Unable to locate object: " + Name_LastElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Name_Last", "Enter_Name_Last failed. Unable to locate object: " + Name_LastElem.toString());

 			Assert.fail("Unable to locate object: " + Name_LastElem.toString());
         }

 		jsExec.executeScript("arguments[0].click();", elem);
// 		elem.sendKeys(Name_Last);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Name_Last " + Name_Last);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Name_Last " + Name_Last);
 	}

      
	/**
 	 * Enter PhoneNumber_countrycode
     * @name Enter PhoneNumber_countrycode
     */
 	public void Enter_PhoneNumber_countrycode(String PhoneNumber_countrycode)
 	{
 	    
 		WebElement elem = getWebElement(PhoneNumber_countrycodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PhoneNumber_countrycode", "Enter_PhoneNumber_countrycode failed. Unable to locate object: " + PhoneNumber_countrycodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PhoneNumber_countrycode", "Enter_PhoneNumber_countrycode failed. Unable to locate object: " + PhoneNumber_countrycodeElem.toString());

 			Assert.fail("Unable to locate object: " + PhoneNumber_countrycodeElem.toString());
         }
 		jsExec.executeScript("arguments[0].click();", elem);
// 		elem.sendKeys(PhoneNumber_countrycode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PhoneNumber_countrycode " + PhoneNumber_countrycode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PhoneNumber_countrycode " + PhoneNumber_countrycode);
 	}

      
	/**
 	 * Enter Email
     * @name Enter Email
     */
 	public void Enter_Email(String Email)
 	{
 	    
 		WebElement elem = getWebElement(EmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email", "Enter_Email failed. Unable to locate object: " + EmailElem.toString());

 			Assert.fail("Unable to locate object: " + EmailElem.toString());
         }
 		jsExec.executeScript("arguments[0].click();", elem);

// 		elem.sendKeys(Email);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Email " + Email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email " + Email);
 	}

    
	/**
 	 * Select Dropdown
     * @name Select Dropdown
     */
    public void Select_Dropdown(String Dropdown)
 	{
 	    
 		WebElement elem = getWebElement(DropdownElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Dropdown", "Select_Dropdown failed. Unable to locate object: " + DropdownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Dropdown", "Select_Dropdown failed. Unable to locate object: " + DropdownElem.toString());

 			Assert.fail("Unable to locate object: " + DropdownElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Dropdown);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Dropdown " + Dropdown);

 		TestModellerLogger.PassStep(m_Driver, "Select_Dropdown " + Dropdown);
 	}

      
	/**
 	 * Enter SingleLine1
     * @name Enter SingleLine1
     */
 	public void Enter_SingleLine1(String SingleLine1)
 	{
 	    
 		WebElement elem = getWebElement(SingleLine1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SingleLine1", "Enter_SingleLine1 failed. Unable to locate object: " + SingleLine1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SingleLine1", "Enter_SingleLine1 failed. Unable to locate object: " + SingleLine1Elem.toString());

 			Assert.fail("Unable to locate object: " + SingleLine1Elem.toString());
         }
 		
 		jsExec.executeScript("arguments[0].click();", elem);

// 		elem.sendKeys(SingleLine1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SingleLine1 " + SingleLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SingleLine1 " + SingleLine1);
 	}

     
	/**
 	 * Click I have read and agree to Nomisma's terms & conditions and privacy policy 
     * @name Click I have read and agree to Nomisma's terms & conditions and privacy policy 
     */
	public void Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_()
	{
        
		WebElement elem = getWebElement(I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_", "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_ failed. Unable to locate object: " + I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_", "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_ failed. Unable to locate object: " + I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_Elem.toString());

			Assert.fail("Unable to locate object: " + I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_");

		TestModellerLogger.PassStep(m_Driver, "Click_I_have_read_and_agree_to_Nomismas_terms_conditions_and_privacy_policy_");
	}

     
	/**
 	 * Click Submit
     * @name Click Submit
     */
	public void Click_Submit()
	{
        
		WebElement elem = getWebElement(SubmitElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit", "Click_Submit failed. Unable to locate object: " + SubmitElem.toString());

			Assert.fail("Unable to locate object: " + SubmitElem.toString());
        }

		elem.click();
		Reporter.log("Free trial registration done");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit");
	}
}
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/aa8e5ef1-6c4c-4ec8-a04a-9697151a79f0
@TestModellerModule(guid = "aa8e5ef1-6c4c-4ec8-a04a-9697151a79f0")
public class Sign_up_Form extends BasePage
{
	public Sign_up_Form (WebDriver driver)
	{
		super(driver);
	}


	
	private By Free_TrialElem = By.xpath("/html/body/section[1]/div/div/div[1]/div/a/span");

	private By q3nameElem = By.xpath("//*[@id=\"input_3\"]");

	private By q3lnameElem = By.xpath("//*[@id=\"input_4\"]");

	private By q3companyElem = By.xpath("//*[@id=\"input_5\"]");

	private By q4emailElem = By.xpath("//*[@id=\"input_6\"]");

	private By q7phoneElem = By.xpath("//*[@id=\"input_7\"]");

	private By xPath_htmlbodydiv2div3div1divdivspandiv1Elem = By.xpath("//DIV[@class='recaptcha-checkbox-border']");

	private By _Please_dont_send_me_any_marketing_communications_Elem = By.xpath("//DIV[@class='col']/DIV[@class='']");

	private By _I_have_read_and_agree_to_Nomismas_terms_and_privacy_polElem = By.xpath("//DIV[@class='row privacy-check']/DIV[@class='col']/DIV[@class='form-group']");

	private By Get_StartedElem = By.xpath("//STRONG");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://www.nomisma.co.uk/";

        if (!currentUrl.equals("https://www.nomisma.co.uk/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Free Trial
	 * @throws InterruptedException 
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

		elem.click();
//        try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  	

		ExtentReportManager.passStep(m_Driver, "Click_Free_Trial");

		TestModellerLogger.PassStep(m_Driver, "Click_Free_Trial");
	}

     
	/**
 	 * Click Get Started
     * @name Click Get Started
     */
	public void Click_Get_Started() 
	{
		
        
		WebElement elem = getWebElement(Get_StartedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Get_Started", "Click_Get_Started failed. Unable to locate object: " + Get_StartedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Get_Started", "Click_Get_Started failed. Unable to locate object: " + Get_StartedElem.toString());

			Assert.fail("Unable to locate object: " + Get_StartedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Get_Started");

		TestModellerLogger.PassStep(m_Driver, "Click_Get_Started");
	}

     
	/**
 	 * Click  I have read and agree to Nomisma's terms and privacy pol
     * @name Click  I have read and agree to Nomisma's terms and privacy pol
     */
	public void Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol() 
	{
	
        WebElement elem = getWebElement(_I_have_read_and_agree_to_Nomismas_terms_and_privacy_polElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol", "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol failed. Unable to locate object: " + _I_have_read_and_agree_to_Nomismas_terms_and_privacy_polElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol", "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol failed. Unable to locate object: " + _I_have_read_and_agree_to_Nomismas_terms_and_privacy_polElem.toString());

			Assert.fail("Unable to locate object: " + _I_have_read_and_agree_to_Nomismas_terms_and_privacy_polElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol");

		TestModellerLogger.PassStep(m_Driver, "Click__I_have_read_and_agree_to_Nomismas_terms_and_privacy_pol");
	}

     
	/**
 	 * Click  Please don't send me any marketing communications 
     * @name Click  Please don't send me any marketing communications 
     */
	public void Click__Please_dont_send_me_any_marketing_communications_() 
	{
	
        WebElement elem = getWebElement(_Please_dont_send_me_any_marketing_communications_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Please_dont_send_me_any_marketing_communications_", "Click__Please_dont_send_me_any_marketing_communications_ failed. Unable to locate object: " + _Please_dont_send_me_any_marketing_communications_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Please_dont_send_me_any_marketing_communications_", "Click__Please_dont_send_me_any_marketing_communications_ failed. Unable to locate object: " + _Please_dont_send_me_any_marketing_communications_Elem.toString());

			Assert.fail("Unable to locate object: " + _Please_dont_send_me_any_marketing_communications_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Please_dont_send_me_any_marketing_communications_");

		TestModellerLogger.PassStep(m_Driver, "Click__Please_dont_send_me_any_marketing_communications_");
	}

     
	/**
 	 * Click xPath: '/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]'
     * @name Click xPath: '/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]'
     */
	public void Click_xPath_htmlbodydiv2div3div1divdivspandiv1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("Cross-site unknown")));

		WebElement elem = getWebElement(xPath_htmlbodydiv2div3div1divdivspandiv1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodydiv2div3div1divdivspandiv1", "Click_xPath_htmlbodydiv2div3div1divdivspandiv1 failed. Unable to locate object: " + xPath_htmlbodydiv2div3div1divdivspandiv1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodydiv2div3div1divdivspandiv1", "Click_xPath_htmlbodydiv2div3div1divdivspandiv1 failed. Unable to locate object: " + xPath_htmlbodydiv2div3div1divdivspandiv1Elem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodydiv2div3div1divdivspandiv1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodydiv2div3div1divdivspandiv1");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodydiv2div3div1divdivspandiv1");
	}

      
	/**
 	 * Enter q3_company
     * @name Enter q3_company
     */
 	public void Enter_q3company(String q3company)
 	{
 	
 	    WebElement elem = getWebElement(q3companyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_q3company", "Enter_q3company failed. Unable to locate object: " + q3companyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_q3company", "Enter_q3company failed. Unable to locate object: " + q3companyElem.toString());

 			Assert.fail("Unable to locate object: " + q3companyElem.toString());
         }

 		elem.sendKeys(q3company);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_q3company " + q3company);

  		TestModellerLogger.PassStep(m_Driver, "Enter_q3company " + q3company);
 	}

      
	/**
 	 * Enter q3_lname
     * @name Enter q3_lname
     */
 	public void Enter_q3lname(String q3lname)
 	{
 	WebElement elem = getWebElement(q3lnameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_q3lname", "Enter_q3lname failed. Unable to locate object: " + q3lnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_q3lname", "Enter_q3lname failed. Unable to locate object: " + q3lnameElem.toString());

 			Assert.fail("Unable to locate object: " + q3lnameElem.toString());
         }

 		elem.sendKeys(q3lname);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_q3lname " + q3lname);

  		TestModellerLogger.PassStep(m_Driver, "Enter_q3lname " + q3lname);
 	}

      
	/**
 	 * Enter q3_name
     * @name Enter q3_name
     */
 	public void Enter_q3name(String q3name) 
 	{
 	WebElement elem = getWebElement(q3nameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_q3name", "Enter_q3name failed. Unable to locate object: " + q3nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_q3name", "Enter_q3name failed. Unable to locate object: " + q3nameElem.toString());

 			Assert.fail("Unable to locate object: " + q3nameElem.toString());
         }

 		elem.sendKeys(q3name);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_q3name " + q3name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_q3name " + q3name);
 	}

      
	/**
 	 * Enter q4_email
     * @name Enter q4_email
     */
 	public void Enter_q4email(String q4email)
 	{
 	    
 		WebElement elem = getWebElement(q4emailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_q4email", "Enter_q4email failed. Unable to locate object: " + q4emailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_q4email", "Enter_q4email failed. Unable to locate object: " + q4emailElem.toString());

 			Assert.fail("Unable to locate object: " + q4emailElem.toString());
         }

 		elem.sendKeys(q4email);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_q4email " + q4email);

  		TestModellerLogger.PassStep(m_Driver, "Enter_q4email " + q4email);
 	}

      
	/**
 	 * Enter q7_phone
     * @name Enter q7_phone
     */
 	public void Enter_q7phone(String q7phone)
 	{
 	    
 		WebElement elem = getWebElement(q7phoneElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_q7phone", "Enter_q7phone failed. Unable to locate object: " + q7phoneElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_q7phone", "Enter_q7phone failed. Unable to locate object: " + q7phoneElem.toString());

 			Assert.fail("Unable to locate object: " + q7phoneElem.toString());
         }

 		elem.sendKeys(q7phone);
 		 try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}  	
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_q7phone " + q7phone);

  		TestModellerLogger.PassStep(m_Driver, "Enter_q7phone " + q7phone);
 	}

	public void GoToUrl()
	{
		m_Driver.get("https://www.nomisma.co.uk/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.nomisma.co.uk/");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://www.nomisma.co.uk/");
	}

public void Switch_Tab()

    {

        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

 

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));

    }}
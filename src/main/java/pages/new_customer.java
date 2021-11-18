package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/352ba384-4d18-4a6e-bd3e-c2e275e7b2eb
@TestModellerModule(guid = "352ba384-4d18-4a6e-bd3e-c2e275e7b2eb")
public class new_customer extends BasePage
{
	public new_customer (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem = By.xpath("//A[@id='CustaddlModl']/I[@class='fa fa-user facolor hav_tooltip']");

	private By ctl00cPHtxtCustomerNameElem = By.xpath("//*[@id=\"ctl00_cPH_txtCustomerName\"]");

	private By ctl00cPHtxtContactNameElem = By.xpath("//*[@id=\"ctl00_cPH_txtContactName\"]");

	private By ctl00cPHtxtContactLastNameElem = By.xpath("//*[@id=\"ctl00_cPH_txtContactLastName\"]");

	private By ctl00cPHtxtPhoneElem = By.xpath("//*[@id=\"ctl00_cPH_txtPhone\"]");

	private By ctl00cPHtxtEmailElem = By.xpath("//*[@id=\"ctl00_cPH_txtEmail\"]");

	private By ctl00cPHtxtAddress1Elem = By.xpath("//*[@id=\"ctl00_cPH_txtAddress1\"]");

	private By ctl00cPHtxtAddress2Elem = By.xpath("//*[@id=\"ctl00_cPH_txtAddress2\"]");

	private By ctl00cPHtxtPostCodeElem = By.xpath("//*[@id=\"ctl00_cPH_txtPostCode\"]");

	private By SaveElem = By.xpath("//*[@id=\"ctl00_cphFooter_btnSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913&menuid=0&p=true";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913&menuid=0&p=true")) {
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

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
        }

		elem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	m_Driver.navigate().refresh();
	WebElement elem1 = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem);
	elem1.click();
		
		
        

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");
	}

      
	/**
 	 * Enter ctl00$cPH$txtCustomerName
     * @name Enter ctl00$cPH$txtCustomerName
     */
 	public void Enter_ctl00cPHtxtCustomerName(String ctl00cPHtxtCustomerName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtCustomerNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCustomerName", "Enter_ctl00cPHtxtCustomerName failed. Unable to locate object: " + ctl00cPHtxtCustomerNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCustomerName", "Enter_ctl00cPHtxtCustomerName failed. Unable to locate object: " + ctl00cPHtxtCustomerNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCustomerNameElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtCustomerName);
 		
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCustomerName " + ctl00cPHtxtCustomerName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCustomerName " + ctl00cPHtxtCustomerName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtContactName
     * @name Enter ctl00$cPH$txtContactName
     */
 	public void Enter_ctl00cPHtxtContactName(String ctl00cPHtxtContactName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtContactNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtContactName", "Enter_ctl00cPHtxtContactName failed. Unable to locate object: " + ctl00cPHtxtContactNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtContactName", "Enter_ctl00cPHtxtContactName failed. Unable to locate object: " + ctl00cPHtxtContactNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtContactNameElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtContactName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtContactName " + ctl00cPHtxtContactName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtContactName " + ctl00cPHtxtContactName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtContactLastName
     * @name Enter ctl00$cPH$txtContactLastName
     */
 	public void Enter_ctl00cPHtxtContactLastName(String ctl00cPHtxtContactLastName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtContactLastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtContactLastName", "Enter_ctl00cPHtxtContactLastName failed. Unable to locate object: " + ctl00cPHtxtContactLastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtContactLastName", "Enter_ctl00cPHtxtContactLastName failed. Unable to locate object: " + ctl00cPHtxtContactLastNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtContactLastNameElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtContactLastName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtContactLastName " + ctl00cPHtxtContactLastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtContactLastName " + ctl00cPHtxtContactLastName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPhone
     * @name Enter ctl00$cPH$txtPhone
     */
 	public void Enter_ctl00cPHtxtPhone(String ctl00cPHtxtPhone)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtPhoneElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPhone", "Enter_ctl00cPHtxtPhone failed. Unable to locate object: " + ctl00cPHtxtPhoneElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPhone", "Enter_ctl00cPHtxtPhone failed. Unable to locate object: " + ctl00cPHtxtPhoneElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPhoneElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPhone);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPhone " + ctl00cPHtxtPhone);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPhone " + ctl00cPHtxtPhone);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtEmail
     * @name Enter ctl00$cPH$txtEmail
     */
 	public void Enter_ctl00cPHtxtEmail(String ctl00cPHtxtEmail)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtEmailElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmail", "Enter_ctl00cPHtxtEmail failed. Unable to locate object: " + ctl00cPHtxtEmailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmail", "Enter_ctl00cPHtxtEmail failed. Unable to locate object: " + ctl00cPHtxtEmailElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtEmailElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtEmail);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtEmail " + ctl00cPHtxtEmail);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtEmail " + ctl00cPHtxtEmail);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress1
     * @name Enter ctl00$cPH$txtAddress1
     */
 	public void Enter_ctl00cPHtxtAddress1(String ctl00cPHtxtAddress1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAddress1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress2
     * @name Enter ctl00$cPH$txtAddress2
     */
 	public void Enter_ctl00cPHtxtAddress2(String ctl00cPHtxtAddress2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAddress2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPostCode
     * @name Enter ctl00$cPH$txtPostCode
     */
 	public void Enter_ctl00cPHtxtPostCode(String ctl00cPHtxtPostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']]")));

 		WebElement elem = getWebElement(ctl00cPHtxtPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode", "Enter_ctl00cPHtxtPostCode failed. Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode", "Enter_ctl00cPHtxtPostCode failed. Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPostCodeElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPostCode);
// 		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
// 		JavascriptExecutor js = (JavascriptExecutor)m_Driver;
// 		js.executeScript("document.getElementById('ctl00_cPH_txtPostCode').value='"+ctl00cPHtxtPostCode+"'");
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPostCode " + ctl00cPHtxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPostCode " + ctl00cPHtxtPostCode);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_modalCustaddFrame']")));

		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
	}
}
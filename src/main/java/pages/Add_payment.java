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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/23dad027-b701-4523-aacc-15fbb95a282d
 @TestModellerModule(guid = "23dad027-b701-4523-aacc-15fbb95a282d")
 public class Add_payment extends BasePage
 {
 	public Add_payment (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem = By.xpath("//A[@id='AddExpense11lMod']/I[@class='fa fa-plus hav_tooltip facolor']");

	private By ctl00cPHddlentryTypeElem = By.xpath("//*[@id=\"ctl00_cPH_ddlentryType\"]");

	private By ctl00cPHrptrPaymentctl00txtDateElem = By.xpath("//*[@id=\"ctl00_cPH_rptrPayment_ctl00_txtDate\"]");

	private By ctl00cPHrptrPaymentctl00ddAccountElem = By.xpath("//*[@id=\"ctl00_cPH_rptrPayment_ctl00_ddAccount\"]");

	private By ctl00cPHrptrPaymentctl00txtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_rptrPayment_ctl00_txtDescription\"]");

	private By ctl00cPHrptrPaymentctl00txtAmountElem = By.xpath("//*[@id=\"ctl00_cPH_rptrPayment_ctl00_txtAmount\"]");

	private By _Save_Elem = By.xpath("//*[@id=\"ctl00_cphFooter_btnSave\"]");


	
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
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[5]/div/div/tabl
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[5]/div/div/tabl
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem);
		m_Driver.navigate().refresh();
		
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem.toString());
        }
		WebElement elem1 = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem);

		elem1.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtabl");
	}

    
	/**
 	 * Select ctl00$cPH$ddlentryType
     * @name Select ctl00$cPH$ddlentryType
     */
    public void Select_ctl00cPHddlentryType(String ctl00cPHddlentryType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHddlentryTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlentryType", "Select_ctl00cPHddlentryType failed. Unable to locate object: " + ctl00cPHddlentryTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlentryType", "Select_ctl00cPHddlentryType failed. Unable to locate object: " + ctl00cPHddlentryTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlentryTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlentryType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlentryType " + ctl00cPHddlentryType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlentryType " + ctl00cPHddlentryType);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrPayment$ctl00$txtDate
     * @name Enter ctl00$cPH$rptrPayment$ctl00$txtDate
     */
 	public void Enter_ctl00cPHrptrPaymentctl00txtDate(String ctl00cPHrptrPaymentctl00txtDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrPaymentctl00txtDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDate", "Enter_ctl00cPHrptrPaymentctl00txtDate failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDate", "Enter_ctl00cPHrptrPaymentctl00txtDate failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrPaymentctl00txtDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDate " + ctl00cPHrptrPaymentctl00txtDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDate " + ctl00cPHrptrPaymentctl00txtDate);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrPayment$ctl00$ddAccount
     * @name Select ctl00$cPH$rptrPayment$ctl00$ddAccount
     */
    public void Select_ctl00cPHrptrPaymentctl00ddAccount(String ctl00cPHrptrPaymentctl00ddAccount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrPaymentctl00ddAccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrPaymentctl00ddAccount", "Select_ctl00cPHrptrPaymentctl00ddAccount failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00ddAccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrPaymentctl00ddAccount", "Select_ctl00cPHrptrPaymentctl00ddAccount failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00ddAccountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrPaymentctl00ddAccountElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrPaymentctl00ddAccount);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrPaymentctl00ddAccount " + ctl00cPHrptrPaymentctl00ddAccount);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrPaymentctl00ddAccount " + ctl00cPHrptrPaymentctl00ddAccount);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrPayment$ctl00$txtDescription
     * @name Enter ctl00$cPH$rptrPayment$ctl00$txtDescription
     */
 	public void Enter_ctl00cPHrptrPaymentctl00txtDescription(String ctl00cPHrptrPaymentctl00txtDescription)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrPaymentctl00txtDescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDescription", "Enter_ctl00cPHrptrPaymentctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDescription", "Enter_ctl00cPHrptrPaymentctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrPaymentctl00txtDescriptionElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrPaymentctl00txtDescription);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDescription " + ctl00cPHrptrPaymentctl00txtDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtDescription " + ctl00cPHrptrPaymentctl00txtDescription);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrPayment$ctl00$txtAmount
     * @name Enter ctl00$cPH$rptrPayment$ctl00$txtAmount
     */
 	public void Enter_ctl00cPHrptrPaymentctl00txtAmount(String ctl00cPHrptrPaymentctl00txtAmount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrPaymentctl00txtAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtAmount", "Enter_ctl00cPHrptrPaymentctl00txtAmount failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtAmount", "Enter_ctl00cPHrptrPaymentctl00txtAmount failed. Unable to locate object: " + ctl00cPHrptrPaymentctl00txtAmountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrPaymentctl00txtAmountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrPaymentctl00txtAmount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtAmount " + ctl00cPHrptrPaymentctl00txtAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrPaymentctl00txtAmount " + ctl00cPHrptrPaymentctl00txtAmount);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
	}
}
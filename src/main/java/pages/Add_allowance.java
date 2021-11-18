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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f30dbf4c-22ca-433f-91c3-3ac107114118
 @TestModellerModule(guid = "f30dbf4c-22ca-433f-91c3-3ac107114118")
 public class Add_allowance extends BasePage
 {
 	public Add_allowance (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem = By.xpath("//A[@id='AddExpense11lMod']/I[@class='fa fa-plus hav_tooltip facolor']");

	private By ctl00cPHddlentryTypeElem = By.xpath("//*[@id=\"ctl00_cPH_ddlentryType\"]");

	private By ctl00cPHrptrRecordctl00txtDateElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtDate\"]");

	private By ctl00cPHrptrRecordctl00ddExpenseHeadElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_ddExpenseHead\"]");

	private By ctl00cPHrptrRecordctl00txtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtDescription\"]");

	private By ctl00cPHrptrRecordctl00txtAmountElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtAmount\"]");

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
 	 * Enter ctl00$cPH$rptrRecord$ctl00$txtDate
     * @name Enter ctl00$cPH$rptrRecord$ctl00$txtDate
     */
 	public void Enter_ctl00cPHrptrRecordctl00txtDate(String ctl00cPHrptrRecordctl00txtDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00txtDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDate", "Enter_ctl00cPHrptrRecordctl00txtDate failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDate", "Enter_ctl00cPHrptrRecordctl00txtDate failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00txtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrRecordctl00txtDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDate " + ctl00cPHrptrRecordctl00txtDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDate " + ctl00cPHrptrRecordctl00txtDate);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrRecord$ctl00$ddExpenseHead
     * @name Select ctl00$cPH$rptrRecord$ctl00$ddExpenseHead
     */
    public void Select_ctl00cPHrptrRecordctl00ddExpenseHead(String ctl00cPHrptrRecordctl00ddExpenseHead)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00ddExpenseHeadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrRecordctl00ddExpenseHead", "Select_ctl00cPHrptrRecordctl00ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrRecordctl00ddExpenseHeadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrRecordctl00ddExpenseHead", "Select_ctl00cPHrptrRecordctl00ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrRecordctl00ddExpenseHeadElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00ddExpenseHeadElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrRecordctl00ddExpenseHead);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrRecordctl00ddExpenseHead " + ctl00cPHrptrRecordctl00ddExpenseHead);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrRecordctl00ddExpenseHead " + ctl00cPHrptrRecordctl00ddExpenseHead);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrRecord$ctl00$txtDescription
     * @name Enter ctl00$cPH$rptrRecord$ctl00$txtDescription
     */
 	public void Enter_ctl00cPHrptrRecordctl00txtDescription(String ctl00cPHrptrRecordctl00txtDescription)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00txtDescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDescription", "Enter_ctl00cPHrptrRecordctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtDescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDescription", "Enter_ctl00cPHrptrRecordctl00txtDescription failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00txtDescriptionElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrRecordctl00txtDescription);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDescription " + ctl00cPHrptrRecordctl00txtDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtDescription " + ctl00cPHrptrRecordctl00txtDescription);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrRecord$ctl00$txtAmount
     * @name Enter ctl00$cPH$rptrRecord$ctl00$txtAmount
     */
 	public void Enter_ctl00cPHrptrRecordctl00txtAmount(String ctl00cPHrptrRecordctl00txtAmount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00txtAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtAmount", "Enter_ctl00cPHrptrRecordctl00txtAmount failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtAmount", "Enter_ctl00cPHrptrRecordctl00txtAmount failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtAmountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00txtAmountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrRecordctl00txtAmount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtAmount " + ctl00cPHrptrRecordctl00txtAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtAmount " + ctl00cPHrptrRecordctl00txtAmount);
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
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5ad6c3b2-9ec7-4e69-8b3d-3b0e27c3410c
 @TestModellerModule(guid = "5ad6c3b2-9ec7-4e69-8b3d-3b0e27c3410c")
 public class Add_expense extends BasePage
{
	public Add_expense (WebDriver driver)
{
	super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv5divdivtablElem = By.xpath("//A[@id='AddExpense11lMod']/I[@class='fa fa-plus hav_tooltip facolor']");

	private By ctl00cPHddlentryTypeElem = By.xpath("//*[@id=\"ctl00_cPH_ddlentryType\"]");

	private By ctl00cPHrptrRecordctl00txtDateElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtDate\"]");

	private By ctl00cPHrptrRecordctl00ddVehicleTypeElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_ddVehicleType\"]");

	private By ctl00cPHrptrRecordctl00txtDescriptionElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtDescription\"]");

	private By ctl00cPHrptrRecordctl00txtMileageElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtMileage\"]");

	private By ctl00cPHrptrRecordctl00txtVATAmountElem = By.xpath("//*[@id=\"ctl00_cPH_rptrRecord_ctl00_txtVATAmount\"]");

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
 	 * Select ctl00$cPH$rptrRecord$ctl00$ddVehicleType
     * @name Select ctl00$cPH$rptrRecord$ctl00$ddVehicleType
     */
    public void Select_ctl00cPHrptrRecordctl00ddVehicleType(String ctl00cPHrptrRecordctl00ddVehicleType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00ddVehicleTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrRecordctl00ddVehicleType", "Select_ctl00cPHrptrRecordctl00ddVehicleType failed. Unable to locate object: " + ctl00cPHrptrRecordctl00ddVehicleTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrRecordctl00ddVehicleType", "Select_ctl00cPHrptrRecordctl00ddVehicleType failed. Unable to locate object: " + ctl00cPHrptrRecordctl00ddVehicleTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00ddVehicleTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrRecordctl00ddVehicleType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrRecordctl00ddVehicleType " + ctl00cPHrptrRecordctl00ddVehicleType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrRecordctl00ddVehicleType " + ctl00cPHrptrRecordctl00ddVehicleType);
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
 	 * Enter ctl00$cPH$rptrRecord$ctl00$txtMileage
     * @name Enter ctl00$cPH$rptrRecord$ctl00$txtMileage
     */
 	public void Enter_ctl00cPHrptrRecordctl00txtMileage(String ctl00cPHrptrRecordctl00txtMileage)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00txtMileageElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtMileage", "Enter_ctl00cPHrptrRecordctl00txtMileage failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtMileageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtMileage", "Enter_ctl00cPHrptrRecordctl00txtMileage failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtMileageElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00txtMileageElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrRecordctl00txtMileage);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtMileage " + ctl00cPHrptrRecordctl00txtMileage);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtMileage " + ctl00cPHrptrRecordctl00txtMileage);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptrRecord$ctl00$txtVATAmount
     * @name Enter ctl00$cPH$rptrRecord$ctl00$txtVATAmount
     */
 	public void Enter_ctl00cPHrptrRecordctl00txtVATAmount(String ctl00cPHrptrRecordctl00txtVATAmount)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("//*[@id='ctl00_cPH_AddExpense11lModalIframe']")));

 		WebElement elem = getWebElement(ctl00cPHrptrRecordctl00txtVATAmountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtVATAmount", "Enter_ctl00cPHrptrRecordctl00txtVATAmount failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtVATAmountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtVATAmount", "Enter_ctl00cPHrptrRecordctl00txtVATAmount failed. Unable to locate object: " + ctl00cPHrptrRecordctl00txtVATAmountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrRecordctl00txtVATAmountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptrRecordctl00txtVATAmount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtVATAmount " + ctl00cPHrptrRecordctl00txtVATAmount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptrRecordctl00txtVATAmount " + ctl00cPHrptrRecordctl00txtVATAmount);
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
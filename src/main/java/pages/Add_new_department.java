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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/bb2392be-c4e9-440d-8a8f-de7516467160
@TestModellerModule(guid = "bb2392be-c4e9-440d-8a8f-de7516467160")
public class Add_new_department extends BasePage
{
	public Add_new_department (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem = By.xpath("//DIV[@class='tablecolnew']/DIV/DIV/TABLE[@class='tab100']/THEAD[@class='headwdrop']/TR/TD/TABLE[@class='tabright']/TBODY/TR/TD[@class='textright']/A/I[@class='fa fa-building-o facolor hav_tooltip']");

	private By Add_DepartmentElem = By.xpath("//*[@id=\"ctl00_cpHeaderRight_btnAdd\"]");

	private By ctl00cPHtxtNameElem = By.xpath("//*[@id=\"ctl00_cPH_txtName\"]");

	private By SaveElem = By.xpath("//*[@id=\"ctl00_cphFooter_btnSave\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Department.aspx?FYCode=9588&CompanyCode=6913");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Department.aspx?FYCode=9588&CompanyCode=6913");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Department.aspx?FYCode=9588&CompanyCode=6913");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Department.aspx?FYCode=9588&CompanyCode=6913";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Department.aspx?FYCode=9588&CompanyCode=6913")) {
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
			m_Driver.navigate().refresh();
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
//
//			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdivElem.toString());
        }

		//elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv1divdivdiv");
	}

     
	/**
 	 * Click Add Department
     * @name Click Add Department
     */
	public void Click_Add_Department()
	{
        
		WebElement elem = getWebElement(Add_DepartmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Department", "Click_Add_Department failed. Unable to locate object: " + Add_DepartmentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Department", "Click_Add_Department failed. Unable to locate object: " + Add_DepartmentElem.toString());

			Assert.fail("Unable to locate object: " + Add_DepartmentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Department");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Department");
	}

      
	/**
 	 * Enter ctl00$cPH$txtName
     * @name Enter ctl00$cPH$txtName
     */
 	public void Enter_ctl00cPHtxtName(String ctl00cPHtxtName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtName", "Enter_ctl00cPHtxtName failed. Unable to locate object: " + ctl00cPHtxtNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtName", "Enter_ctl00cPHtxtName failed. Unable to locate object: " + ctl00cPHtxtNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtNameElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtName " + ctl00cPHtxtName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtName " + ctl00cPHtxtName);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

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
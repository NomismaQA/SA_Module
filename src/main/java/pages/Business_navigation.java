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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1af955a8-0626-48db-838c-064ac5f8e6b8
@TestModellerModule(guid = "1af955a8-0626-48db-838c-064ac5f8e6b8")
public class Business_navigation extends BasePage
{
	public Business_navigation (WebDriver driver)
	{
		super(driver);
	}


	
	private By BusinessesElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A/SPAN[@class='side_nav_text']");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany\"]");

	private By Search_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_btnSearch\"]");

	private By _Lexagen_properties_private_limitedElem = By.xpath("/html/body/form/main/div[4]/div[3]/div/div[3]/table/tbody/tr[2]/td[1]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Businesses
     * @name Click Businesses
     */
	public void Click_Businesses()
	{
        
		WebElement elem = getWebElement(BusinessesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Businesses", "Click_Businesses failed. Unable to locate object: " + BusinessesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Businesses", "Click_Businesses failed. Unable to locate object: " + BusinessesElem.toString());

			Assert.fail("Unable to locate object: " + BusinessesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Businesses");

		TestModellerLogger.PassStep(m_Driver, "Click_Businesses");
	}

     
	/**
 	 * Click  Lexagen properties private limited
     * @name Click  Lexagen properties private limited
     */
	public void Click__Lexagen_properties_private_limited()
	{
        
		WebElement elem = getWebElement(_Lexagen_properties_private_limitedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Lexagen_properties_private_limited", "Click__Lexagen_properties_private_limited failed. Unable to locate object: " + _Lexagen_properties_private_limitedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Lexagen_properties_private_limited", "Click__Lexagen_properties_private_limited failed. Unable to locate object: " + _Lexagen_properties_private_limitedElem.toString());

			Assert.fail("Unable to locate object: " + _Lexagen_properties_private_limitedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Lexagen_properties_private_limited");

		TestModellerLogger.PassStep(m_Driver, "Click__Lexagen_properties_private_limited");
	}

     
	/**
 	 * Click Search 
     * @name Click Search 
     */
	public void Click_Search_()
	{
        
		WebElement elem = getWebElement(Search_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

			Assert.fail("Unable to locate object: " + Search_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

public void Switch_Tab()
    {
        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));
    }}
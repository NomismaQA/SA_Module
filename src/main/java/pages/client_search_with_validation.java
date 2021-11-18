package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8502e2a2-ae0d-418a-8d0d-ff53f132497a
@TestModellerModule(guid = "8502e2a2-ae0d-418a-8d0d-ff53f132497a")
public class client_search_with_validation extends BasePage
{
	public client_search_with_validation (WebDriver driver)
	{
		super(driver);
	}


	
	private By Self_AssessmentElem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By Client_SearchElem = By.xpath("//*[@id=\"search_input\"]");

	private By _Error_Please_select_individual_client_name_from_the_search_listElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[5]/div/div/div");

	JavascriptExecutor js;
	
	public void GoToUrl()
	{
		m_Driver.get( "https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx";

        if (!currentUrl.equals("https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Self Assessment
     * @name Click Self Assessment
     */
	public void Click_Self_Assessment()
	{
        
		WebElement elem = getWebElement(Self_AssessmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Self_Assessment", "Click_Self_Assessment failed. Unable to locate object: " + Self_AssessmentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Self_Assessment", "Click_Self_Assessment failed. Unable to locate object: " + Self_AssessmentElem.toString());

			Assert.fail("Unable to locate object: " + Self_AssessmentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Self_Assessment");

		TestModellerLogger.PassStep(m_Driver, "Click_Self_Assessment");
	}

     
	/**
 	 * Click Dashboard
     * @name Click Dashboard
     */
	public void Click_Dashboard()
	{
        
		WebElement elem = getWebElement(DashboardElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dashboard", "Click_Dashboard failed. Unable to locate object: " + DashboardElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dashboard", "Click_Dashboard failed. Unable to locate object: " + DashboardElem.toString());

			Assert.fail("Unable to locate object: " + DashboardElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Dashboard");

		TestModellerLogger.PassStep(m_Driver, "Click_Dashboard");
	}

      
	/**
 	 * Enter Client Search...
     * @name Enter Client Search...
     */
 	public void Enter_Client_Search(String Client_Search)
 	{
 		
 	    
 		WebElement elem = getWebElement(Client_SearchElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Client_Search", "Enter_Client_Search failed. Unable to locate object: " + Client_SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Client_Search", "Enter_Client_Search failed. Unable to locate object: " + Client_SearchElem.toString());

 			Assert.fail("Unable to locate object: " + Client_SearchElem.toString());
         }

 		elem.sendKeys(Client_Search);
 		
 		 JavascriptExecutor js = (JavascriptExecutor) m_Driver;
         js.executeScript("document.getElementById('ctl00_ctl00_ParentContent_cPH_btnSearch').click();");
         System.out.println("validation is coming when we donot select client");
 		Reporter.log( " Error! Please select individual client name from the search list populating when client not selected,case pass" );
 		
// 		elem.sendKeys(Keys.ENTER);
 		
 		
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Search " + Client_Search);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Search " + Client_Search);
 	}

     
	/**
 	 * Click  ×Error! Please select individual client name from the search list
     * @name Click  ×Error! Please select individual client name from the search list
     */
	public void Click__Error_Please_select_individual_client_name_from_the_search_list()
	{
        
		WebElement elem = getWebElement(_Error_Please_select_individual_client_name_from_the_search_listElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Error_Please_select_individual_client_name_from_the_search_list", "Click__Error_Please_select_individual_client_name_from_the_search_list failed. Unable to locate object: " + _Error_Please_select_individual_client_name_from_the_search_listElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Error_Please_select_individual_client_name_from_the_search_list", "Click__Error_Please_select_individual_client_name_from_the_search_list failed. Unable to locate object: " + _Error_Please_select_individual_client_name_from_the_search_listElem.toString());

			Assert.fail("Unable to locate object: " + _Error_Please_select_individual_client_name_from_the_search_listElem.toString());
        }

		elem.click();
		
          	

		ExtentReportManager.passStep(m_Driver, "Click__Error_Please_select_individual_client_name_from_the_search_list");

		TestModellerLogger.PassStep(m_Driver, "Click__Error_Please_select_individual_client_name_from_the_search_list");
	}
}
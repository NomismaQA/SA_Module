package pages;

import pages.BasePage;

import java.util.ArrayList;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/45a21653-5326-40cd-b25e-1d3f2eb1ec69
@TestModellerModule(guid = "45a21653-5326-40cd-b25e-1d3f2eb1ec69")
public class client_search_with_quick_jump_verification extends BasePage
{
	public client_search_with_quick_jump_verification (WebDriver driver)
	{
		super(driver);
	}


	
	private By Self_AssessmentElem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By Client_SearchElem = By.xpath("//*[@id=\"search_input\"]");

	private By Deepika_AryaElem = By.xpath("//*[@id=\"searchkeyList\"]/li/a");
	
	


	
	public void GoToUrl()
	{
		m_Driver.get("https://live.nomismasolution.co.uk/AgentUI/SADashboard.aspx");

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
 		
// 		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
// 		js.executeScript("document.getElementById('//*[@id=\"ui-id-48\"').click();");
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Search " + Client_Search);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Search " + Client_Search);
 	}

     
	/**
 	 * Click Deepika Arya
     * @name Click Deepika Arya
     */
	public void Click_Deepika_Arya()
	{
        
		WebElement elem = getWebElement(Deepika_AryaElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Deepika_Arya", "Click_Deepika_Arya failed. Unable to locate object: " + Deepika_AryaElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Deepika_Arya", "Click_Deepika_Arya failed. Unable to locate object: " + Deepika_AryaElem.toString());

			Assert.fail("Unable to locate object: " + Deepika_AryaElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Deepika_Arya");

		TestModellerLogger.PassStep(m_Driver, "Click_Deepika_Arya");
	}
	public void Switch_Tab()
    {
        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));
    }
}
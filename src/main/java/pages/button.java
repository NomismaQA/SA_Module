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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/307442cf-d3e7-4f21-a993-4dd625ef6f9c
@TestModellerModule(guid = "307442cf-d3e7-4f21-a993-4dd625ef6f9c")
public class button extends BasePage
{
	public button (WebDriver driver)
	{
		super(driver);
	}


	
	private By Client_SearchElem = By.xpath("//INPUT[@placeholder='Client Search...']");

	private By _Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnSearch\"]']");


	
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
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Client_Search " + Client_Search);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Client_Search " + Client_Search);
 	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}
}
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4dbcf43c-f35f-44b4-953e-2e36f779778b
@TestModellerModule(guid = "4dbcf43c-f35f-44b4-953e-2e36f779778b")
public class Agent_page extends BasePage
{
	public Agent_page (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By SearchElem = By.xpath("//*[@id=\"ctl00_cPHFilter_btnSearch\"]");

	private By _Deepika_Elem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/div/div/table/tbody/tr[2]/td[1]");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
   
 {
//	   try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	   m_Driver.navigate().refresh();
	   
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Deepika 
     * @name Click  Deepika 
     */
	public void Click__Deepika_()
	{
        
		WebElement elem = getWebElement(_Deepika_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Deepika_", "Click__Deepika_ failed. Unable to locate object: " + _Deepika_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Deepika_", "Click__Deepika_ failed. Unable to locate object: " + _Deepika_Elem.toString());

			Assert.fail("Unable to locate object: " + _Deepika_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Deepika_");

		TestModellerLogger.PassStep(m_Driver, "Click__Deepika_");
	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName)
 	{
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		m_Driver.navigate().refresh();
 		WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);
 		
 		if (elem == null) 
 			
{
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
         }
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		m_Driver.navigate().refresh();
 		elem.sendKeys(ctl00cPHFiltertxtAgentName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
 	}

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
	}

public void Switch_Tab()
    {
        ArrayList<String> tabs = new ArrayList<String>(m_Driver.getWindowHandles());

        m_Driver.switchTo().window(tabs.get(tabs.size() - 1));
    }}
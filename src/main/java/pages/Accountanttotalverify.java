package pages;

import pages.BasePage;

import java.io.*;

import java.util.List;

import org.openqa.selenium.By;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/677ec242-8290-413d-b7ac-eef99e4367fe
@TestModellerModule(guid = "677ec242-8290-413d-b7ac-eef99e4367fe")
public class Accountanttotalverify extends BasePage
{
	public Accountanttotalverify (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");
	
	private By _ClietnListXpth = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[3]/div/div/div/div/table");  
	
	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By ctl00ctl00ParentContentcPHddlTaxYearElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_ddlTaxYear\"]");

	private By ctl00ctl00ParentContentcPHAccountantListElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_AccountantList\"]");

	private By _Update_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnUpdate\"]");

	private By _2Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table/tfoot/tr/td[2]/b");

	private By Deepika_AroraElem = By.xpath("//A[contains(text(),'Deepika Arora')]");

	private By UTR_NoElem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/div/div/table/tbody/tr[1]/th[1]");

	public int  _acount = 0;
	
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
 	 * Click  Self Assessment 
     * @name Click  Self Assessment 
     */
	public void Click__Self_Assessment_()
	{
        
		WebElement elem = getWebElement(_Self_Assessment_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Self_Assessment_", "Click__Self_Assessment_ failed. Unable to locate object: " + _Self_Assessment_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Self_Assessment_", "Click__Self_Assessment_ failed. Unable to locate object: " + _Self_Assessment_Elem.toString());

			Assert.fail("Unable to locate object: " + _Self_Assessment_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Self_Assessment_");

		TestModellerLogger.PassStep(m_Driver, "Click__Self_Assessment_");
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
 	 * Select ctl00$ctl00$ParentContent$cPH$ddlTaxYear
     * @name Select ctl00$ctl00$ParentContent$cPH$ddlTaxYear
     */
    public void Select_ctl00ctl00ParentContentcPHddlTaxYear(String ctl00ctl00ParentContentcPHddlTaxYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHddlTaxYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHddlTaxYear", "Select_ctl00ctl00ParentContentcPHddlTaxYear failed. Unable to locate object: " + ctl00ctl00ParentContentcPHddlTaxYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHddlTaxYear", "Select_ctl00ctl00ParentContentcPHddlTaxYear failed. Unable to locate object: " + ctl00ctl00ParentContentcPHddlTaxYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHddlTaxYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHddlTaxYear);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHddlTaxYear " + ctl00ctl00ParentContentcPHddlTaxYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHddlTaxYear " + ctl00ctl00ParentContentcPHddlTaxYear);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPH$AccountantList
     * @name Select ctl00$ctl00$ParentContent$cPH$AccountantList
     */
    public void Select_ctl00ctl00ParentContentcPHAccountantList(String ctl00ctl00ParentContentcPHAccountantList)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHAccountantListElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHAccountantList", "Select_ctl00ctl00ParentContentcPHAccountantList failed. Unable to locate object: " + ctl00ctl00ParentContentcPHAccountantListElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHAccountantList", "Select_ctl00ctl00ParentContentcPHAccountantList failed. Unable to locate object: " + ctl00ctl00ParentContentcPHAccountantListElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHAccountantListElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHAccountantList);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHAccountantList " + ctl00ctl00ParentContentcPHAccountantList);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHAccountantList " + ctl00ctl00ParentContentcPHAccountantList);
 	}

     
	/**
 	 * Click  Update 
     * @name Click  Update 
     */
	public void Click__Update_()
	{
        
		WebElement elem = getWebElement(_Update_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Update_", "Click__Update_ failed. Unable to locate object: " + _Update_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Update_", "Click__Update_ failed. Unable to locate object: " + _Update_Elem.toString());

			Assert.fail("Unable to locate object: " + _Update_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Update_");

		TestModellerLogger.PassStep(m_Driver, "Click__Update_");
	}

     
	/**
 	 * Click 2
     * @name Click 2
     */
	public void Click__2()
	{
        
		WebElement elem = getWebElement(_2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__2", "Click__2 failed. Unable to locate object: " + _2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__2", "Click__2 failed. Unable to locate object: " + _2Elem.toString());

			Assert.fail("Unable to locate object: " + _2Elem.toString());
        }
		
		String txt= elem.getText();
		_acount=Integer.parseInt(txt);

	elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__2");

		TestModellerLogger.PassStep(m_Driver, "Click__2");
	}

     
	/**
 	 * Click Deepika Arora
     * @name Click Deepika Arora
     */
	public void Click_Deepika_Arora()
	{
        
		WebElement elem = getWebElement(Deepika_AroraElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Deepika_Arora", "Click_Deepika_Arora failed. Unable to locate object: " + Deepika_AroraElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Deepika_Arora", "Click_Deepika_Arora failed. Unable to locate object: " + Deepika_AroraElem.toString());

			Assert.fail("Unable to locate object: " + Deepika_AroraElem.toString());
        }
		
		WebElement elems = getWebElement(_2Elem);

		if (elems == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__2", "Click__2 failed. Unable to locate object: " + _2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__2", "Click__2 failed. Unable to locate object: " + _2Elem.toString());

			Assert.fail("Unable to locate object: " + _2Elem.toString());
        }
		
		String txt= elems.getText();
		_acount=Integer.parseInt(txt);

	elem.click();
	
          	

		ExtentReportManager.passStep(m_Driver, "Click_Deepika_Arora");

		TestModellerLogger.PassStep(m_Driver, "Click_Deepika_Arora");
	}

     
	/**
 	 * Click UTR No
     * @name Click UTR No
     */
	public void Click_UTR_No()
	{
		
//		WebElement elem = getWebElement(UTR_NoElem);
		
WebElement eles= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[3]/div/div/div/div/table"));
		
List<WebElement> TotalRowCount=eles.findElements(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr"));


int totalData = TotalRowCount.size()-1;
		
		
		
		if(totalData==_acount)			
		{
			Reporter.log("count matched");
			System.out.println("count matched" +totalData+" "+_acount);
			
			ExtentReportManager.passStep(m_Driver, "Click_UTR_No");

			TestModellerLogger.PassStep(m_Driver, "Click_UTR_No");
			
		}
        
	

//		if (elem == null) 
	
		else
		{
			Reporter.log("count not  matched");
			System.out.println("count not matched"+totalData+" "+_acount);
    		
    		
		}
        }

//		elem.click();
          	

		
	}

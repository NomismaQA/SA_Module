package pages;

import pages.BasePage;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/6a38d134-4a09-44de-bc6a-4ae4d0d2bf9a
@TestModellerModule(guid = "6a38d134-4a09-44de-bc6a-4ae4d0d2bf9a")
public class agedapprovalsverify extends BasePage
{
	public agedapprovalsverify (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]");

	private By ctl00ctl00ParentContentcPHddlTaxYearElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_ddlTaxYear\"]");

	private By ctl00ctl00ParentContentcPHAccountantListElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_AccountantList\"]");

	private By _Update_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnUpdate\"]");

	private By _0_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[8]/div[2]/div/div/div[1]/div/div/a[1]/div/h3");

	private By more_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[8]/div[2]/div/div/div[1]/div/div/a[2]/p/u");

	private By UTR_NoElem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/div/div/table/tbody/tr/th[1]");
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
 	 * Click  0 
     * @name Click  0 
     */
	public void Click__0_()
	{
        
		WebElement elem = getWebElement(_0_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__0_", "Click__0_ failed. Unable to locate object: " + _0_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__0_", "Click__0_ failed. Unable to locate object: " + _0_Elem.toString());

			Assert.fail("Unable to locate object: " + _0_Elem.toString());
        }

		String txt= elem.getText();
		try {
		_acount=Integer.parseInt(txt);
		}
		
		catch(NumberFormatException e){
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		
		
		
	

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__0_");

		TestModellerLogger.PassStep(m_Driver, "Click__0_");
	}

     
	/**
 	 * Click more > 
     * @name Click more > 
     */
	public void Click_more_()
	{
        
		WebElement elem = getWebElement(more_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_more_", "Click_more_ failed. Unable to locate object: " + more_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_more_", "Click_more_ failed. Unable to locate object: " + more_Elem.toString());

			Assert.fail("Unable to locate object: " + more_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_more_");

		TestModellerLogger.PassStep(m_Driver, "Click_more_");
	}

     
	/**
 	 * Click UTR No
     * @name Click UTR No
     */
	public void Click_UTR_No()
	{
WebElement eles= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[3]/div/div/div/div/table"));
		
		List<WebElement> TotalRowCount=eles.findElements(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr"));


		int totalData = TotalRowCount.size()-1;
		
		if(totalData==_acount)			
		{
			Reporter.log("count matched");
			System.out.println("aged approvals count matched" +totalData+" "+_acount);
			
			ExtentReportManager.passStep(m_Driver, "Click_UTR_No");

			TestModellerLogger.PassStep(m_Driver, "Click_UTR_No");
			
		}
        
	
		else
		{
			Reporter.log("count not  matched");
			System.out.println("count not matched"+totalData+" "+_acount);
    		
    		
		}
        }

				
				

		

//		elem.click();
	
}
	
       
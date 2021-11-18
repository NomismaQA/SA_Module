package pages;

import pages.BasePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1b628c4c-0d1e-4610-bea0-0896d59b3923
@TestModellerModule(guid = "1b628c4c-0d1e-4610-bea0-0896d59b3923")
public class Toperformerverification extends BasePage
{
	public Toperformerverification (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By ctl00ctl00ParentContentcPHddlTaxYearElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_ddlTaxYear\"]");

	private By ctl00ctl00ParentContentcPHAccountantListElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_AccountantList\"]");

	private By _Update_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnUpdate\"]");

	private By _Demo_Demo_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[8]/div[2]/div/div[3]/a[1]/div/h3");

	private By _1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_rptrAccountantSummary_ctl01_LinkButtonEx2']");

	private By xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext\"]/i");

	private By FiledElem = By.xpath("//TH[contains(text(),'Filed')]");

	public int  _acount = 0;
	
//	public int max=0;
	
	public int  _column = 0;

	private WebElement webElement1;
	
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
 	 * Click  Demo Demo 
     * @name Click  Demo Demo 
     */
	public void Click__Demo_Demo_()
	{
        
		WebElement elem = getWebElement(_Demo_Demo_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Demo_Demo_", "Click__Demo_Demo_ failed. Unable to locate object: " + _Demo_Demo_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Demo_Demo_", "Click__Demo_Demo_ failed. Unable to locate object: " + _Demo_Demo_Elem.toString());

			Assert.fail("Unable to locate object: " + _Demo_Demo_Elem.toString());
        }
		
		String txt= elem.getText();
//		try {
//		_acount=Integer.parseInt(txt);
//		}
//		
//		catch(NumberFormatException e){
//		    System.out.println("In the catch block due to Exception = "+e);
//		  }
		
		
		System.out.println("Top performer:" +txt);
 

        elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Demo_Demo_");

		TestModellerLogger.PassStep(m_Driver, "Click__Demo_Demo_");
	}

     
	/**
 	 * Click 1
     * @name Click 1
     */
	public void Click__1()
	{
		String beforexpath="//div[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]//div/table/tbody//tr[";
		String afterxpath="]/td[13]";
		
		for(int i=2;i<=10;i++) {
			String xpath= beforexpath+i+afterxpath;
		
        
WebElement eles= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table"));
		
		
		
List<WebElement> list = eles.findElements(By.xpath(xpath));   
		
//double count=0.00;
for (WebElement webElement : list) 
//	String strno = webElement.getText();
//	count=Double.parseDouble(strno);
//	
//}

System.out.println(webElement.getText()+"");
		}
	}
		
//try {
   
//		catch(NumberFormatException e){
//			System.out.println("In the catch block due to Exception = "+e);
		

//  }




	
//WebElement webElement = null;
//If(Integer.parseInt(webElement.getText())> max); {
//max= Integer.parseInt(webElement.getText());
//System.out.println("maximum:"+max);


		
	

	
	
	

	
		
	
	

   

	/**
 	 * Click xPath: '//*[@id="ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext"]'
     * @name Click xPath: '//*[@id="ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext"]'
     */
	public void Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext()
	{
        
		WebElement elem = getWebElement(xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext", "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext failed. Unable to locate object: " + xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext", "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext failed. Unable to locate object: " + xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem.toString());

			Assert.fail("Unable to locate object: " + xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext");
	}
     
	/**
 	 * Click Filed
	 * @param <T>
     * @name Click Filed
     */
	public void Click_Filed()
	{
		String beforexpath="//div[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]//div/table/tbody//tr[";
		String afterxpath="]/td[13]";
		ArrayList<Integer>array = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			String xpath= beforexpath+i+afterxpath;
		WebElement eles1= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table"));
		List<WebElement> list1 = eles1.findElements(By.xpath(xpath));   
		
		
	
		for (WebElement webElement1 : list1) 		
         System.out.println(webElement1.getText()+"");
		
	Integer webElement1 = null;
	array.add(webElement1);
		
		}
//		Collections.sort(array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size()-1));
		}
	}
		
		
		
		
	
	
	

package pages;

import pages.BasePage;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c0da0d4e-187f-4852-a85e-bd8a91f58568
@TestModellerModule(guid = "c0da0d4e-187f-4852-a85e-bd8a91f58568")
public class totalcountverify extends BasePage
{
	private static final double Sum = 0;

	public totalcountverify (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By ctl00ctl00ParentContentcPHddlTaxYearElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_ddlTaxYear\"]");

	private By ctl00ctl00ParentContentcPHAccountantListElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_AccountantList\"]");

	private By _Update_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnUpdate\"]");

	private By xPath_idctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNextElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_PageUC1_rptrPager_ctl03_lnkNext\"]/i");

	private By _88Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table/tfoot/tr/td[2]/b");

	private By TotalElem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[9]/div[2]/div/div[1]/div/table/thead/tr/th[2]");

	public int  _acount = 0;
	
	public int  _column = 0;
	
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
		
		WebElement eles= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table"));
		
		
		List<WebElement> TotalRowCount = eles.findElements(By.xpath("//div[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]//div/table/tbody//tr/td[2]"));
				
		double Sum=0.00;
		for (WebElement webElement : TotalRowCount) {
			String strno = webElement.getText();
			Sum=Sum+Double.parseDouble(strno);
			
		}
//		System.out.println(Sum);
		System.out.println("count of 1st page page" +Sum);
        
//		WebElement elem = getWebElement(_Update_Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Update_", "Click__Update_ failed. Unable to locate object: " + _Update_Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Update_", "Click__Update_ failed. Unable to locate object: " + _Update_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _Update_Elem.toString());
//        }

//		elem.click();
          	
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

//		ExtentReportManager.passStep(m_Driver, "Click__Update_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Update_");
	}

     
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
 	 * Click  88
     * @name Click  88
     */
	public void Click__88()
	{
        
		WebElement elem = getWebElement(_88Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__88", "Click__88 failed. Unable to locate object: " + _88Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__88", "Click__88 failed. Unable to locate object: " + _88Elem.toString());

			Assert.fail("Unable to locate object: " + _88Elem.toString());
        }
		String txt= elem.getText();
		_acount=Integer.parseInt(txt);
		
		System.out.println("total count matched" +_acount);


//		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__88");

		TestModellerLogger.PassStep(m_Driver, "Click__88");
	}

     
	/**
 	 * Click Total
     * @name Click Total
     */
	public void Click_Total()
	{
        
WebElement eles= m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[9]/div[2]/div/div[1]/div/table"));
		
		
List<WebElement> TotalRowCount = eles.findElements(By.xpath("//div[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]//div/table/tbody//tr/td[2]"));
		
double Sum1=0.00;
for (WebElement webElement : TotalRowCount) {
	String strno = webElement.getText();
	Sum1=Sum1+Double.parseDouble(strno);
	
	
}
//System.out.println(Sum1);
System.out.println("count of 2nd page" +Sum1);

		
	

		


//				  	for(int i = 0; i < TotalRowCount.size(); i++)
//					{
//				  		TotalRowCount.get(i);
//						
//				  		String s ="//*[@id='AccountantSummary']/tr["+i+"]/td[2]";
//				  		
//                      
//				  		
//				  		
//			  		By xpath = By.xpath(s.toString());
//				 
////				  		 System.out.println("jai mata di count  "+s);
//					 WebElement elem = getWebElement(xpath);					
////									 					
////					 
//				 System.out.println("total count.  "+i + 	elem.getText());
//					}
					

//				
//		    System.out.println("Total sum of a column - " + sum);
//		
//		//*[@id="AccountantSummary"]/tr[1]/td[2]
//
//
//		int totalData = TotalRowCount.size()-1;
//		
//		if(totalData==_acount)			
//		{
//			Reporter.log("count matched");
//			System.out.println("count matched" +sum+" "+_acount);
//			
//			ExtentReportManager.passStep(m_Driver, "Click_UTR_No");
//
//			TestModellerLogger.PassStep(m_Driver, "Click_UTR_No");
//			
//		}
//        
//	
//		else
//		{
//			Reporter.log("count not  matched");
//			System.out.println("count not matched"+sum+" "+_acount);
//    		
//    		
//		}
        }

				

     
	

	private void column_sum(Object[][] arr) {
		// TODO Auto-generated method stub
		
	}
}
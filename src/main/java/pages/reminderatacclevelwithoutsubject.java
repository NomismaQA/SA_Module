package pages;

import pages.BasePage;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/033817f5-a965-4fa6-a8ca-9e05e9b68a0b
@TestModellerModule(guid = "033817f5-a965-4fa6-a8ca-9e05e9b68a0b")
public class reminderatacclevelwithoutsubject extends BasePage
{
	public reminderatacclevelwithoutsubject (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14Elem = By.xpath("//*[@id=\"AccountantSummary\"]/tr[4]/td[14]/div/a/i");

	private By Send_Reminder_Elem = By.xpath("//*[@id=\"AccountantSummary\"]/tr[4]/td[14]/div/ul/li[2]/a");

	private By ctl00ctl00ParentContentcPHtxtNameElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtName\"]");

	private By _UpdateElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnFilter\"]");

	private By _Dummy_1_Elem = By.xpath("//*[@id=\"step-1\"]/div/div[2]/div/div/table/tbody[2]/tr/td[2]/button");

	private By Next_Elem = By.xpath("//*[@id=\"NextLink\"]");

	private By ctl00ctl00ParentContentcPHtxtSubjectElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtSubject\"]");

	private By Next__1Elem = By.xpath("//*[@id=\"step-2\"]/div/div/div[4]/div/button[2]/a");

	private By _Error_Please_enter_subject_to_send_emailElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']");

	JavascriptExecutor js;
	
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
 	 * Click xPath: '/html/body/form/main/div[3]/div[3]/div/div[9]/div[2]/div/div[1]/div/table/tbody/tr[4]/td[14
     * @name Click xPath: '/html/body/form/main/div[3]/div[3]/div/div[9]/div[2]/div/div[1]/div/table/tbody/tr[4]/td[14
     */
	public void Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14", "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14 failed. Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14", "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14 failed. Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14Elem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr4td14");
	}

     
	/**
 	 * Click Send Reminder 
     * @name Click Send Reminder 
     */
	public void Click_Send_Reminder_()
	{
        
		WebElement elem = getWebElement(Send_Reminder_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Send_Reminder_", "Click_Send_Reminder_ failed. Unable to locate object: " + Send_Reminder_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Send_Reminder_", "Click_Send_Reminder_ failed. Unable to locate object: " + Send_Reminder_Elem.toString());

			Assert.fail("Unable to locate object: " + Send_Reminder_Elem.toString());
        }

		elem.click();
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Send_Reminder_");

		TestModellerLogger.PassStep(m_Driver, "Click_Send_Reminder_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$txtName
     * @name Enter ctl00$ctl00$ParentContent$cPH$txtName
     */
 	public void Enter_ctl00ctl00ParentContentcPHtxtName(String ctl00ctl00ParentContentcPHtxtName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtxtNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtName", "Enter_ctl00ctl00ParentContentcPHtxtName failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtName", "Enter_ctl00ctl00ParentContentcPHtxtName failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtxtNameElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHtxtName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtName " + ctl00ctl00ParentContentcPHtxtName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtName " + ctl00ctl00ParentContentcPHtxtName);
 	}

     
	/**
 	 * Click  Update
     * @name Click  Update
     */
	public void Click__Update()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_UpdateElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Update", "Click__Update failed. Unable to locate object: " + _UpdateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Update", "Click__Update failed. Unable to locate object: " + _UpdateElem.toString());

			Assert.fail("Unable to locate object: " + _UpdateElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Update");

		TestModellerLogger.PassStep(m_Driver, "Click__Update");
	}

     
	/**
 	 * Click  Dummy 1 
     * @name Click  Dummy 1 
     */
	public void Click__Dummy_1_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Dummy_1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Dummy_1_", "Click__Dummy_1_ failed. Unable to locate object: " + _Dummy_1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Dummy_1_", "Click__Dummy_1_ failed. Unable to locate object: " + _Dummy_1_Elem.toString());

			Assert.fail("Unable to locate object: " + _Dummy_1_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Dummy_1_");

		TestModellerLogger.PassStep(m_Driver, "Click__Dummy_1_");
	}

     
	/**
 	 * Click Next 
     * @name Click Next 
     */
	public void Click_Next_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Next_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next_", "Click_Next_ failed. Unable to locate object: " + Next_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next_", "Click_Next_ failed. Unable to locate object: " + Next_Elem.toString());

			Assert.fail("Unable to locate object: " + Next_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Next_");

		TestModellerLogger.PassStep(m_Driver, "Click_Next_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPH$txtSubject
     * @name Enter ctl00$ctl00$ParentContent$cPH$txtSubject
     */
 	public void Enter_ctl00ctl00ParentContentcPHtxtSubject(String ctl00ctl00ParentContentcPHtxtSubject)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHtxtSubjectElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtSubject", "Enter_ctl00ctl00ParentContentcPHtxtSubject failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtSubjectElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtSubject", "Enter_ctl00ctl00ParentContentcPHtxtSubject failed. Unable to locate object: " + ctl00ctl00ParentContentcPHtxtSubjectElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHtxtSubjectElem.toString());
         }

 		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
		js.executeScript("document.getElementById('ctl00_ctl00_ParentContent_cPH_txtSubject').value = '';");
 		elem.sendKeys(ctl00ctl00ParentContentcPHtxtSubject);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtSubject " + ctl00ctl00ParentContentcPHtxtSubject);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHtxtSubject " + ctl00ctl00ParentContentcPHtxtSubject);
 	}

     
	/**
 	 * Click Next 
     * @name Click Next 
     */
	public void Click_Next__1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Next__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next__1", "Click_Next__1 failed. Unable to locate object: " + Next__1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next__1", "Click_Next__1 failed. Unable to locate object: " + Next__1Elem.toString());

			Assert.fail("Unable to locate object: " + Next__1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Next__1");

		TestModellerLogger.PassStep(m_Driver, "Click_Next__1");
	}

     
	/**
 	 * Click  ??Error! Please enter subject to send email.
     * @name Click  ??Error! Please enter subject to send email.
     */
	public void Click__Error_Please_enter_subject_to_send_email()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Error_Please_enter_subject_to_send_emailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Error_Please_enter_subject_to_send_email", "Click__Error_Please_enter_subject_to_send_email failed. Unable to locate object: " + _Error_Please_enter_subject_to_send_emailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Error_Please_enter_subject_to_send_email", "Click__Error_Please_enter_subject_to_send_email failed. Unable to locate object: " + _Error_Please_enter_subject_to_send_emailElem.toString());

			Assert.fail("Unable to locate object: " + _Error_Please_enter_subject_to_send_emailElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Error_Please_enter_subject_to_send_email");

		TestModellerLogger.PassStep(m_Driver, "Click__Error_Please_enter_subject_to_send_email");
	}
}
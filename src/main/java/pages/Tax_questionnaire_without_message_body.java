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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/df56448c-bf5b-4fb2-8166-319843b5ac13
@TestModellerModule(guid = "df56448c-bf5b-4fb2-8166-319843b5ac13")
public class Tax_questionnaire_without_message_body extends BasePage
{
	public Tax_questionnaire_without_message_body (WebDriver driver)
	{
		super(driver);
	}


	
	private By Self_AssessmentElem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By _Send_Tax_Questionnaire_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[8]/div[1]/div/a[1]");

	private By ctl00ctl00ParentContentcPHtxtNameElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtName\"]");

	private By _UpdateElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnFilter\"]");

	private By _Deepika_Automation_client_Elem = By.xpath("//*[@id=\"step-1\"]/div/div[2]/div/div/table/tbody[2]/tr[1]/td[2]/button");

	private By Next_Elem = By.xpath("//*[@id=\"NextLink\"]");

	private By xPath_htmlbodyElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtSubject\"]");

	private By Next__1Elem = By.xpath("//*[@id=\"step-2\"]/div/div/div[4]/div/button[2]/a");

	private By _Error_Please_enter_message_to_send_emailElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']");
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
 	 * Click  Send Tax Questionnaire 
     * @name Click  Send Tax Questionnaire 
     */
	public void Click__Send_Tax_Questionnaire_()
	{
        
		WebElement elem = getWebElement(_Send_Tax_Questionnaire_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Send_Tax_Questionnaire_", "Click__Send_Tax_Questionnaire_ failed. Unable to locate object: " + _Send_Tax_Questionnaire_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Send_Tax_Questionnaire_", "Click__Send_Tax_Questionnaire_ failed. Unable to locate object: " + _Send_Tax_Questionnaire_Elem.toString());

			Assert.fail("Unable to locate object: " + _Send_Tax_Questionnaire_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Send_Tax_Questionnaire_");

		TestModellerLogger.PassStep(m_Driver, "Click__Send_Tax_Questionnaire_");
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
//		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  	
		ExtentReportManager.passStep(m_Driver, "Click__Update");

		TestModellerLogger.PassStep(m_Driver, "Click__Update");
	}

     
	/**
 	 * Click  Deepika Automation client 
     * @name Click  Deepika Automation client 
     */
	public void Click__Deepika_Automation_client_()
	{
		
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Deepika_Automation_client_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Deepika_Automation_client_", "Click__Deepika_Automation_client_ failed. Unable to locate object: " + _Deepika_Automation_client_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Deepika_Automation_client_", "Click__Deepika_Automation_client_ failed. Unable to locate object: " + _Deepika_Automation_client_Elem.toString());

			Assert.fail("Unable to locate object: " + _Deepika_Automation_client_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Deepika_Automation_client_");

		TestModellerLogger.PassStep(m_Driver, "Click__Deepika_Automation_client_");
        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(_Deepika_Automation_client_Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Deepika_Automation_client_", "Click__Deepika_Automation_client_ failed. Unable to locate object: " + _Deepika_Automation_client_Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Deepika_Automation_client_", "Click__Deepika_Automation_client_ failed. Unable to locate object: " + _Deepika_Automation_client_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _Deepika_Automation_client_Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
//        js.executeScript("window.scrollBy(350,document.body.scrollHeight)");
  	

//		ExtentReportManager.passStep(m_Driver, "Click__Deepika_Automation_client_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Deepika_Automation_client_");
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
 	 * Click xPath: '/html/body'
	 * @param string 
     * @name Click xPath: '/html/body'
     */
	public void Click_xPath_htmlbody1(String string)
	{
        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[3]/div/div/div[2]/iframe")));
//
//		WebElement elem = getWebElement(xPath_htmlbodyElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbody", "Click_xPath_htmlbody failed. Unable to locate object: " + xPath_htmlbodyElem.toString());

//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbody", "Click_xPath_htmlbody failed. Unable to locate object: " + xPath_htmlbodyElem.toString());

//			Assert.fail("Unable to locate object: " + xPath_htmlbodyElem.toString());
//        }

		//elem.click();
        
//		m_Driver.switchTo().defaultContent();
//		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
//		js.executeScript("art('hello,world');document.getElementById('ctl00_ctl00_ParentContent_cPH_txtSubject').value = '';");
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
  	

//		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbody");

//		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbody");
	}

     
	/**
 	 * Click Next 
     * @name Click Next 
     */
	public void Click_Next__1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Next__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next__1", "Click_Next__1 failed. Unable to locate object: " + Next__1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next__1", "Click_Next__1 failed. Unable to locate object: " + Next__1Elem.toString());

			Assert.fail("Unable to locate object: " + Next__1Elem.toString());
        }

		
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
		js.executeScript("document.getElementById('ctl00_ctl00_ParentContent_cPH_txtSubject').value = '';");
     
		
		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Next__1");

		TestModellerLogger.PassStep(m_Driver, "Click_Next__1");
	}

     
	/**
 	 * Click  ??Error! Please enter message to send email.
     * @name Click  ??Error! Please enter message to send email.
     */
	public void Click__Error_Please_enter_message_to_send_email()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Error_Please_enter_message_to_send_emailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Error_Please_enter_message_to_send_email", "Click__Error_Please_enter_message_to_send_email failed. Unable to locate object: " + _Error_Please_enter_message_to_send_emailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Error_Please_enter_message_to_send_email", "Click__Error_Please_enter_message_to_send_email failed. Unable to locate object: " + _Error_Please_enter_message_to_send_emailElem.toString());

			Assert.fail("Unable to locate object: " + _Error_Please_enter_message_to_send_emailElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Error_Please_enter_message_to_send_email");

		TestModellerLogger.PassStep(m_Driver, "Click__Error_Please_enter_message_to_send_email");
	}


	
}
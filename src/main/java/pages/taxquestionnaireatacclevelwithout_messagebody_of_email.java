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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a30d2f59-ea46-48ef-ba5d-f9da25ca4f27
@TestModellerModule(guid = "a30d2f59-ea46-48ef-ba5d-f9da25ca4f27")
public class taxquestionnaireatacclevelwithout_messagebody_of_email extends BasePage
{
	public taxquestionnaireatacclevelwithout_messagebody_of_email (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Self_Assessment_Elem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14Elem = By.xpath("//*[@id=\"AccountantSummary\"]/tr[1]/td[14]/div/a/i");

	private By Send_Questionnaire_Elem = By.xpath("//*[@id=\"AccountantSummary\"]/tr[1]/td[14]/div/ul/li[1]/a");

	private By _Deepika_Automation_client_Elem = By.xpath("//*[@id=\"step-1\"]/div/div[2]/div/div/table/tbody[2]/tr[1]/td[2]/button");

	private By Next_Elem = By.xpath("//*[@id=\"NextLink\"]");

	private By Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_Elem = By.xpath("//P[@style='font-size:16px;']");

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
 	 * Click xPath: '/html/body/form/main/div[3]/div[3]/div/div[9]/div[2]/div/div[1]/div/table/tbody/tr[1]/td[14
     * @name Click xPath: '/html/body/form/main/div[3]/div[3]/div/div[9]/div[2]/div/div[1]/div/table/tbody/tr[1]/td[14
     */
	public void Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14", "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14 failed. Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14", "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14 failed. Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14Elem.toString());

			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv3div3divdiv9div2divdiv1divtabletbodytr1td14");
	}

     
	/**
 	 * Click Send Questionnaire 
     * @name Click Send Questionnaire 
     */
	public void Click_Send_Questionnaire_()
	{
        
		WebElement elem = getWebElement(Send_Questionnaire_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Send_Questionnaire_", "Click_Send_Questionnaire_ failed. Unable to locate object: " + Send_Questionnaire_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Send_Questionnaire_", "Click_Send_Questionnaire_ failed. Unable to locate object: " + Send_Questionnaire_Elem.toString());

			Assert.fail("Unable to locate object: " + Send_Questionnaire_Elem.toString());
        }

		elem.click();
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
          	

		ExtentReportManager.passStep(m_Driver, "Click_Send_Questionnaire_");

		TestModellerLogger.PassStep(m_Driver, "Click_Send_Questionnaire_");
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
 	 * Click Dear [CLIENTNAME], Self-Assessment Tax Return - Year ended [TAXYEAR] 
     * @name Click Dear [CLIENTNAME], Self-Assessment Tax Return - Year ended [TAXYEAR] 
     */
	public void Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_()
	{
        
//		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/div[3]/div[1]/div[3]/div/div/div[3]/div/div/table/tbody/tr[2]/td/div/iframe[1]")));
//
//		WebElement elem = getWebElement(Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_", "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_ failed. Unable to locate object: " + Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_", "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_ failed. Unable to locate object: " + Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_Elem.toString());
//        }
//
//		elem.click();
//        
//		m_Driver.switchTo().defaultContent();
//  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Dear_CLIENTNAME_SelfAssessment_Tax_Return_Year_ended_TAXYEAR_");
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
		
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
		js.executeScript("document.getElementById('ctl00_ctl00_ParentContent_cPH_txtMessage_ctl02_ctl00').contentWindow.document.body.innerHTML=''");

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Next__1");

		TestModellerLogger.PassStep(m_Driver, "Click_Next__1");
	}

     
	/**
 	 * Click  ×Error! Please enter message to send email.
     * @name Click  ×Error! Please enter message to send email.
     */
	public void Click__Error_Please_enter_message_to_send_email()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[5]/div/div/div[2]/iframe")));

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
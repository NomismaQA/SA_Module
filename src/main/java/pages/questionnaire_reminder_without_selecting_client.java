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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/80be6ef7-fff6-4370-ac8b-edc448c846a9
@TestModellerModule(guid = "80be6ef7-fff6-4370-ac8b-edc448c846a9")
public class questionnaire_reminder_without_selecting_client extends BasePage
{
	public questionnaire_reminder_without_selecting_client (WebDriver driver)
	{
		super(driver);
	}


	
	private By Self_AssessmentElem = By.xpath("//*[@id=\"selfAssessmentMenu\"]/a/span");

	private By DashboardElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_SAMenuChildren\"]/li[1]/a");

	private By _Tax_Questionnaire_Reminder_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_divSubContent\"]/div[8]/div[1]/div/a[1]");

	private By ctl00ctl00ParentContentcPHtxtNameElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_txtName\"]");

	private By _UpdateElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_btnFilter\"]");

	private By Next_Elem = By.xpath("//*[@id=\"NextLink\"]");

	private By _Error_Please_select_at_least_one_client_to_send_emailElem = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']");

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
 	 * Click  Tax Questionnaire Reminder 
     * @name Click  Tax Questionnaire Reminder 
     */
	public void Click__Tax_Questionnaire_Reminder_()
	{
        
		WebElement elem = getWebElement(_Tax_Questionnaire_Reminder_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Tax_Questionnaire_Reminder_", "Click__Tax_Questionnaire_Reminder_ failed. Unable to locate object: " + _Tax_Questionnaire_Reminder_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Tax_Questionnaire_Reminder_", "Click__Tax_Questionnaire_Reminder_ failed. Unable to locate object: " + _Tax_Questionnaire_Reminder_Elem.toString());

			Assert.fail("Unable to locate object: " + _Tax_Questionnaire_Reminder_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Tax_Questionnaire_Reminder_");

		TestModellerLogger.PassStep(m_Driver, "Click__Tax_Questionnaire_Reminder_");
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
		JavascriptExecutor js = (JavascriptExecutor) m_Driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

 		
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
 	 * Click  ??Error! Please select at least one client to send email.
     * @name Click  ??Error! Please select at least one client to send email.
     */
	public void Click__Error_Please_select_at_least_one_client_to_send_email()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[5]/div[3]/div/div[3]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_Error_Please_select_at_least_one_client_to_send_emailElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Error_Please_select_at_least_one_client_to_send_email", "Click__Error_Please_select_at_least_one_client_to_send_email failed. Unable to locate object: " + _Error_Please_select_at_least_one_client_to_send_emailElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Error_Please_select_at_least_one_client_to_send_email", "Click__Error_Please_select_at_least_one_client_to_send_email failed. Unable to locate object: " + _Error_Please_select_at_least_one_client_to_send_emailElem.toString());

			Assert.fail("Unable to locate object: " + _Error_Please_select_at_least_one_client_to_send_emailElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Error_Please_select_at_least_one_client_to_send_email");

		TestModellerLogger.PassStep(m_Driver, "Click__Error_Please_select_at_least_one_client_to_send_email");
	}
}
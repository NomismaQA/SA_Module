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

//http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c2def920-b017-416b-9084-49b51fe6dbc6
 @TestModellerModule(guid = "c2def920-b017-416b-9084-49b51fe6dbc6")
 public class Supplierupload_feature extends BasePage {
public Supplierupload_feature(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


// {
// 	public Supplierupload_feature (WebDriver driver)
// 	{
// 		super(driver);
// 	}


	
	private By xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem = By.xpath("//*[@id=\"ctl00_cPH_DivLessItem\"]/div[1]/div/div[2]/div/div/table/thead/tr/td/table[2]/tbody/tr/td[2]/a/i");

	private By ctl00cPHFileUpload1Elem = By.xpath("//*[@id=\"ctl00_cPH_FileUpload1\"]");

	private By Upload_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnUploadBatch\"]");

	private By ctl00cPHrptrDisplayRecordsctl01ddExpenseHeadElem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayRecords_ctl01_ddExpenseHead\"]");

	private By ctl00cPHrptrDisplayRecordsctl01ddVatTypeElem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayRecords_ctl01_ddVatType\"]");

	private By _Import_Elem = By.xpath("//*[@id=\"ctl00_cPH_btnImport\"]");

	private By ExpenditureElem = By.xpath("//LI[@id='ctl00_SideMenu1_ExpensesMenu']/A/SPAN[@class='side_nav_text']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=9588&CompanyCode=6913")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div/div/tabl
     * @name Click xPath: '/html/body/form/main/div[10]/div[3]/div[1]/div[4]/div/div[2]/div[1]/div/div[2]/div/div/tabl
     */
	public void Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl()
	{
        
		WebElement elem = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem);
		m_Driver.navigate().refresh();

//		if (elem == null) {
//    		//ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
//
//    		//TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl", "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl failed. Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
//
//			Assert.fail("Unable to locate object: " + xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem.toString());
//        }
		WebElement elem1 = getWebElement(xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtablElem);

		elem1.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_htmlbodyformmaindiv10div3div1div4divdiv2div1divdiv2divdivtabl");
	}

      
	/**
 	 * Enter ctl00$cPH$FileUpload1
     * @name Enter ctl00$cPH$FileUpload1
     */
 	public void Enter_ctl00cPHFileUpload1(String ctl00cPHFileUpload1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFileUpload1Elem);
 		elem.sendKeys("C:\\SupplierBillBatchUploadSample.csv");
 		
 		//elem.sendKeys(ctl00cPHFileUpload1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFileUpload1 " + ctl00cPHFileUpload1);
 	}

     
	/**
 	 * Click Upload 
     * @name Click Upload 
     */
	public void Click_Upload_()
	{
        
		WebElement elem = getWebElement(Upload_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_", "Click_Upload_ failed. Unable to locate object: " + Upload_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_", "Click_Upload_ failed. Unable to locate object: " + Upload_Elem.toString());

			Assert.fail("Unable to locate object: " + Upload_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_");
	}

    
	/**
 	 * Select ctl00$cPH$rptrDisplayRecords$ctl01$ddExpenseHead
     * @name Select ctl00$cPH$rptrDisplayRecords$ctl01$ddExpenseHead
     */
    public void Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead(String ctl00cPHrptrDisplayRecordsctl01ddExpenseHead)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrDisplayRecordsctl01ddExpenseHeadElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead", "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddExpenseHeadElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead", "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead failed. Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddExpenseHeadElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddExpenseHeadElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrDisplayRecordsctl01ddExpenseHead);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead " + ctl00cPHrptrDisplayRecordsctl01ddExpenseHead);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddExpenseHead " + ctl00cPHrptrDisplayRecordsctl01ddExpenseHead);
 	}

    
	/**
 	 * Select ctl00$cPH$rptrDisplayRecords$ctl01$ddVatType
     * @name Select ctl00$cPH$rptrDisplayRecords$ctl01$ddVatType
     */
    public void Select_ctl00cPHrptrDisplayRecordsctl01ddVatType(String ctl00cPHrptrDisplayRecordsctl01ddVatType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHrptrDisplayRecordsctl01ddVatTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType", "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType failed. Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddVatTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType", "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType failed. Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddVatTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptrDisplayRecordsctl01ddVatTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHrptrDisplayRecordsctl01ddVatType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType " + ctl00cPHrptrDisplayRecordsctl01ddVatType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHrptrDisplayRecordsctl01ddVatType " + ctl00cPHrptrDisplayRecordsctl01ddVatType);
 	}

     
	/**
 	 * Click  Import 
     * @name Click  Import 
     */
	public void Click__Import_()
	{
        
		WebElement elem = getWebElement(_Import_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Import_", "Click__Import_ failed. Unable to locate object: " + _Import_Elem.toString());

			Assert.fail("Unable to locate object: " + _Import_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Import_");

		TestModellerLogger.PassStep(m_Driver, "Click__Import_");
	}

     
	/**
 	 * Click Expenditure
     * @name Click Expenditure
     */
	public void Click_Expenditure()
	{
        
		WebElement elem = getWebElement(ExpenditureElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenditure", "Click_Expenditure failed. Unable to locate object: " + ExpenditureElem.toString());

			Assert.fail("Unable to locate object: " + ExpenditureElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Expenditure");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenditure");
	}
}
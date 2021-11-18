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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cb7489bd-59df-4515-b360-a3f81f7b3dd6
@TestModellerModule(guid = "cb7489bd-59df-4515-b360-a3f81f7b3dd6")
public class employment extends BasePage
{
	public employment (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00ddlTaxYearElem = By.xpath("//*[@id=\"ctl00_ddlTaxYear\"]");

	private By SA102_EmploymentElem = By.xpath("//A[contains(text(),'(SA102)  Employment')]");

	private By _Add_Employment_IncomeElem = By.xpath("/html/body/form/main/div[3]/div[3]/header/div/a[2]/span");

	private By ctl00cPHtxtEmployerElem = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[6]/div/input");

	private By ctl00cPHtxtEmployerPAYEReferenceElem = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[5]/div/input");

	private By ctl00cPHtxtPayFromEmploymentElem = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[2]/div/input");

	private By ctl00cPHtxtTaxTakenOffPayElem = By.xpath("/html/body/form/div[3]/div[2]/div[1]/div/div/div[2]/div/div[1]/div[3]/div/input");

	private By BenefitsElem = By.xpath("//A[contains(text(),'Benefits')]");

	private By _Elem = By.xpath("//DIV[@id='saEmpIncome']");

	private By ctl00cPHtxtCompanyCarsAndVansBenefitElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCompanyCarsAndVansBenefit']");

	private By ctl00cPHtxtFuelForCarsAndVansElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFuelForCarsAndVans']");

	private By ctl00cPHtxtPrivateMedicalDentalInsuranceElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrivateMedicalDentalInsurance']");

	private By ctl00cPHtxtVouchersCreditCardsExcessMileageAllowanceElem = By.xpath("//INPUT[@name='ctl00$cPH$txtVouchersCreditCardsExcessMileageAllowance']");

	private By ctl00cPHtxtGoodsEtcProvidedByEmployerElem = By.xpath("//INPUT[@name='ctl00$cPH$txtGoodsEtcProvidedByEmployer']");

	private By ctl00cPHtxtAccommodationProvidedByEmployerElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAccommodationProvidedByEmployer']");

	private By ctl00cPHtxtOtherBenefitsElem = By.xpath("//INPUT[@name='ctl00$cPH$txtOtherBenefits']");

	private By ctl00cPHtxtExpensesPaymentsReceivedElem = By.xpath("//INPUT[@name='ctl00$cPH$txtExpensesPaymentsReceived']");

	private By ExpensesElem = By.xpath("//A[contains(text(),'Expenses')]");

	private By ctl00cPHtxtBusinessTravelAndSubsistenceElem = By.xpath("//INPUT[@name='ctl00$cPH$txtBusinessTravelAndSubsistence']");

	private By ctl00cPHtxtFixedExpensesDeductionsElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFixedExpensesDeductions']");

	private By ctl00cPHtxtProfessionalFeesAndSubscriptionsElem = By.xpath("//INPUT[@name='ctl00$cPH$txtProfessionalFeesAndSubscriptions']");

	private By ctl00cPHtxtOtherExpensesAndCapitalAllowancesElem = By.xpath("//INPUT[@name='ctl00$cPH$txtOtherExpensesAndCapitalAllowances']");

	private By _SaveElem = By.xpath("//*[@id=\"ctl00_cPH_btnemployment_details\"]");

	private By __1Elem = By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[1]/a/span");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/SAUI/Default.aspx?SAPersonCode=QbMI9q3ork0gauba53TBgw==&SATaxYearCode=8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/SAUI/Default.aspx?SAPersonCode=QbMI9q3ork0gauba53TBgw==&SATaxYearCode=8");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/SAUI/Default.aspx?SAPersonCode=QbMI9q3ork0gauba53TBgw==&SATaxYearCode=8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/SAUI/Default.aspx?SAPersonCode=QbMI9q3ork0gauba53TBgw==&SATaxYearCode=8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/SAUI/Default.aspx?SAPersonCode=QbMI9q3ork0gauba53TBgw==&SATaxYearCode=8")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select ctl00$ddlTaxYear
     * @name Select ctl00$ddlTaxYear
     */
    public void Select_ctl00ddlTaxYear(String ctl00ddlTaxYear)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ddlTaxYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ddlTaxYear", "Select_ctl00ddlTaxYear failed. Unable to locate object: " + ctl00ddlTaxYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ddlTaxYear", "Select_ctl00ddlTaxYear failed. Unable to locate object: " + ctl00ddlTaxYearElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ddlTaxYearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ddlTaxYear);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ddlTaxYear " + ctl00ddlTaxYear);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ddlTaxYear " + ctl00ddlTaxYear);
 	}

     
	/**
 	 * Click (SA102) Employment
     * @name Click (SA102) Employment
     */
	public void Click_SA102_Employment()
	{
        
		WebElement elem = getWebElement(SA102_EmploymentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SA102_Employment", "Click_SA102_Employment failed. Unable to locate object: " + SA102_EmploymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SA102_Employment", "Click_SA102_Employment failed. Unable to locate object: " + SA102_EmploymentElem.toString());

			Assert.fail("Unable to locate object: " + SA102_EmploymentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SA102_Employment");

		TestModellerLogger.PassStep(m_Driver, "Click_SA102_Employment");
	}

     
	/**
 	 * Click  Add Employment Income
     * @name Click  Add Employment Income
     */
	public void Click__Add_Employment_Income()
	{
        
		WebElement elem = getWebElement(_Add_Employment_IncomeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Add_Employment_Income", "Click__Add_Employment_Income failed. Unable to locate object: " + _Add_Employment_IncomeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Add_Employment_Income", "Click__Add_Employment_Income failed. Unable to locate object: " + _Add_Employment_IncomeElem.toString());

			Assert.fail("Unable to locate object: " + _Add_Employment_IncomeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Add_Employment_Income");

		TestModellerLogger.PassStep(m_Driver, "Click__Add_Employment_Income");
	}

      
	/**
 	 * Enter ctl00$cPH$txtEmployer
     * @name Enter ctl00$cPH$txtEmployer
     */
 	public void Enter_ctl00cPHtxtEmployer(String ctl00cPHtxtEmployer)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtEmployerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployer", "Enter_ctl00cPHtxtEmployer failed. Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployer", "Enter_ctl00cPHtxtEmployer failed. Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtEmployerElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtEmployer);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtEmployer " + ctl00cPHtxtEmployer);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtEmployer " + ctl00cPHtxtEmployer);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtEmployerPAYEReference
     * @name Enter ctl00$cPH$txtEmployerPAYEReference
     */
 	public void Enter_ctl00cPHtxtEmployerPAYEReference(String ctl00cPHtxtEmployerPAYEReference)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtEmployerPAYEReferenceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference", "Enter_ctl00cPHtxtEmployerPAYEReference failed. Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference", "Enter_ctl00cPHtxtEmployerPAYEReference failed. Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtEmployerPAYEReferenceElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtEmployerPAYEReference);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference " + ctl00cPHtxtEmployerPAYEReference);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtEmployerPAYEReference " + ctl00cPHtxtEmployerPAYEReference);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPayFromEmployment
     * @name Enter ctl00$cPH$txtPayFromEmployment
     */
 	public void Enter_ctl00cPHtxtPayFromEmployment(String ctl00cPHtxtPayFromEmployment)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPayFromEmploymentElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment", "Enter_ctl00cPHtxtPayFromEmployment failed. Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment", "Enter_ctl00cPHtxtPayFromEmployment failed. Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPayFromEmploymentElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPayFromEmployment);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment " + ctl00cPHtxtPayFromEmployment);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPayFromEmployment " + ctl00cPHtxtPayFromEmployment);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtTaxTakenOffPay
     * @name Enter ctl00$cPH$txtTaxTakenOffPay
     */
 	public void Enter_ctl00cPHtxtTaxTakenOffPay(String ctl00cPHtxtTaxTakenOffPay)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtTaxTakenOffPayElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay", "Enter_ctl00cPHtxtTaxTakenOffPay failed. Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay", "Enter_ctl00cPHtxtTaxTakenOffPay failed. Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtTaxTakenOffPayElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtTaxTakenOffPay);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay " + ctl00cPHtxtTaxTakenOffPay);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtTaxTakenOffPay " + ctl00cPHtxtTaxTakenOffPay);
 	}

     
	/**
 	 * Click Benefits
     * @name Click Benefits
     */
	public void Click_Benefits()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(BenefitsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Benefits", "Click_Benefits failed. Unable to locate object: " + BenefitsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Benefits", "Click_Benefits failed. Unable to locate object: " + BenefitsElem.toString());

			Assert.fail("Unable to locate object: " + BenefitsElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Benefits");

		TestModellerLogger.PassStep(m_Driver, "Click_Benefits");
	}

     
	/**
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
	}

      
	/**
 	 * Enter ctl00$cPH$txtCompanyCarsAndVansBenefit
     * @name Enter ctl00$cPH$txtCompanyCarsAndVansBenefit
     */
 	public void Enter_ctl00cPHtxtCompanyCarsAndVansBenefit(String ctl00cPHtxtCompanyCarsAndVansBenefit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCompanyCarsAndVansBenefitElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit", "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit failed. Unable to locate object: " + ctl00cPHtxtCompanyCarsAndVansBenefitElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit", "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit failed. Unable to locate object: " + ctl00cPHtxtCompanyCarsAndVansBenefitElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCompanyCarsAndVansBenefitElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtCompanyCarsAndVansBenefit);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit " + ctl00cPHtxtCompanyCarsAndVansBenefit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCompanyCarsAndVansBenefit " + ctl00cPHtxtCompanyCarsAndVansBenefit);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtFuelForCarsAndVans
     * @name Enter ctl00$cPH$txtFuelForCarsAndVans
     */
 	public void Enter_ctl00cPHtxtFuelForCarsAndVans(String ctl00cPHtxtFuelForCarsAndVans)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtFuelForCarsAndVansElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFuelForCarsAndVans", "Enter_ctl00cPHtxtFuelForCarsAndVans failed. Unable to locate object: " + ctl00cPHtxtFuelForCarsAndVansElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFuelForCarsAndVans", "Enter_ctl00cPHtxtFuelForCarsAndVans failed. Unable to locate object: " + ctl00cPHtxtFuelForCarsAndVansElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtFuelForCarsAndVansElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtFuelForCarsAndVans);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtFuelForCarsAndVans " + ctl00cPHtxtFuelForCarsAndVans);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtFuelForCarsAndVans " + ctl00cPHtxtFuelForCarsAndVans);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPrivateMedicalDentalInsurance
     * @name Enter ctl00$cPH$txtPrivateMedicalDentalInsurance
     */
 	public void Enter_ctl00cPHtxtPrivateMedicalDentalInsurance(String ctl00cPHtxtPrivateMedicalDentalInsurance)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPrivateMedicalDentalInsuranceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance", "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance failed. Unable to locate object: " + ctl00cPHtxtPrivateMedicalDentalInsuranceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance", "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance failed. Unable to locate object: " + ctl00cPHtxtPrivateMedicalDentalInsuranceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPrivateMedicalDentalInsuranceElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPrivateMedicalDentalInsurance);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance " + ctl00cPHtxtPrivateMedicalDentalInsurance);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPrivateMedicalDentalInsurance " + ctl00cPHtxtPrivateMedicalDentalInsurance);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtVouchersCreditCardsExcessMileageAllowance
     * @name Enter ctl00$cPH$txtVouchersCreditCardsExcessMileageAllowance
     */
 	public void Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance(String ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtVouchersCreditCardsExcessMileageAllowanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance", "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance failed. Unable to locate object: " + ctl00cPHtxtVouchersCreditCardsExcessMileageAllowanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance", "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance failed. Unable to locate object: " + ctl00cPHtxtVouchersCreditCardsExcessMileageAllowanceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtVouchersCreditCardsExcessMileageAllowanceElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance " + ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance " + ctl00cPHtxtVouchersCreditCardsExcessMileageAllowance);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtGoodsEtcProvidedByEmployer
     * @name Enter ctl00$cPH$txtGoodsEtcProvidedByEmployer
     */
 	public void Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer(String ctl00cPHtxtGoodsEtcProvidedByEmployer)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtGoodsEtcProvidedByEmployerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer", "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer failed. Unable to locate object: " + ctl00cPHtxtGoodsEtcProvidedByEmployerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer", "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer failed. Unable to locate object: " + ctl00cPHtxtGoodsEtcProvidedByEmployerElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtGoodsEtcProvidedByEmployerElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtGoodsEtcProvidedByEmployer);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer " + ctl00cPHtxtGoodsEtcProvidedByEmployer);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtGoodsEtcProvidedByEmployer " + ctl00cPHtxtGoodsEtcProvidedByEmployer);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAccommodationProvidedByEmployer
     * @name Enter ctl00$cPH$txtAccommodationProvidedByEmployer
     */
 	public void Enter_ctl00cPHtxtAccommodationProvidedByEmployer(String ctl00cPHtxtAccommodationProvidedByEmployer)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAccommodationProvidedByEmployerElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAccommodationProvidedByEmployer", "Enter_ctl00cPHtxtAccommodationProvidedByEmployer failed. Unable to locate object: " + ctl00cPHtxtAccommodationProvidedByEmployerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAccommodationProvidedByEmployer", "Enter_ctl00cPHtxtAccommodationProvidedByEmployer failed. Unable to locate object: " + ctl00cPHtxtAccommodationProvidedByEmployerElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAccommodationProvidedByEmployerElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAccommodationProvidedByEmployer);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAccommodationProvidedByEmployer " + ctl00cPHtxtAccommodationProvidedByEmployer);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAccommodationProvidedByEmployer " + ctl00cPHtxtAccommodationProvidedByEmployer);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtOtherBenefits
     * @name Enter ctl00$cPH$txtOtherBenefits
     */
 	public void Enter_ctl00cPHtxtOtherBenefits(String ctl00cPHtxtOtherBenefits)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtOtherBenefitsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtOtherBenefits", "Enter_ctl00cPHtxtOtherBenefits failed. Unable to locate object: " + ctl00cPHtxtOtherBenefitsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtOtherBenefits", "Enter_ctl00cPHtxtOtherBenefits failed. Unable to locate object: " + ctl00cPHtxtOtherBenefitsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtOtherBenefitsElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtOtherBenefits);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtOtherBenefits " + ctl00cPHtxtOtherBenefits);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtOtherBenefits " + ctl00cPHtxtOtherBenefits);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtExpensesPaymentsReceived
     * @name Enter ctl00$cPH$txtExpensesPaymentsReceived
     */
 	public void Enter_ctl00cPHtxtExpensesPaymentsReceived(String ctl00cPHtxtExpensesPaymentsReceived)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtExpensesPaymentsReceivedElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtExpensesPaymentsReceived", "Enter_ctl00cPHtxtExpensesPaymentsReceived failed. Unable to locate object: " + ctl00cPHtxtExpensesPaymentsReceivedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtExpensesPaymentsReceived", "Enter_ctl00cPHtxtExpensesPaymentsReceived failed. Unable to locate object: " + ctl00cPHtxtExpensesPaymentsReceivedElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtExpensesPaymentsReceivedElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtExpensesPaymentsReceived);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtExpensesPaymentsReceived " + ctl00cPHtxtExpensesPaymentsReceived);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtExpensesPaymentsReceived " + ctl00cPHtxtExpensesPaymentsReceived);
 	}

     
	/**
 	 * Click Expenses
     * @name Click Expenses
     */
	public void Click_Expenses()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ExpensesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Expenses", "Click_Expenses failed. Unable to locate object: " + ExpensesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Expenses", "Click_Expenses failed. Unable to locate object: " + ExpensesElem.toString());

			Assert.fail("Unable to locate object: " + ExpensesElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Expenses");

		TestModellerLogger.PassStep(m_Driver, "Click_Expenses");
	}

      
	/**
 	 * Enter ctl00$cPH$txtBusinessTravelAndSubsistence
     * @name Enter ctl00$cPH$txtBusinessTravelAndSubsistence
     */
 	public void Enter_ctl00cPHtxtBusinessTravelAndSubsistence(String ctl00cPHtxtBusinessTravelAndSubsistence)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtBusinessTravelAndSubsistenceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtBusinessTravelAndSubsistence", "Enter_ctl00cPHtxtBusinessTravelAndSubsistence failed. Unable to locate object: " + ctl00cPHtxtBusinessTravelAndSubsistenceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtBusinessTravelAndSubsistence", "Enter_ctl00cPHtxtBusinessTravelAndSubsistence failed. Unable to locate object: " + ctl00cPHtxtBusinessTravelAndSubsistenceElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtBusinessTravelAndSubsistenceElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtBusinessTravelAndSubsistence);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtBusinessTravelAndSubsistence " + ctl00cPHtxtBusinessTravelAndSubsistence);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtBusinessTravelAndSubsistence " + ctl00cPHtxtBusinessTravelAndSubsistence);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtFixedExpensesDeductions
     * @name Enter ctl00$cPH$txtFixedExpensesDeductions
     */
 	public void Enter_ctl00cPHtxtFixedExpensesDeductions(String ctl00cPHtxtFixedExpensesDeductions)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtFixedExpensesDeductionsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFixedExpensesDeductions", "Enter_ctl00cPHtxtFixedExpensesDeductions failed. Unable to locate object: " + ctl00cPHtxtFixedExpensesDeductionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFixedExpensesDeductions", "Enter_ctl00cPHtxtFixedExpensesDeductions failed. Unable to locate object: " + ctl00cPHtxtFixedExpensesDeductionsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtFixedExpensesDeductionsElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtFixedExpensesDeductions);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtFixedExpensesDeductions " + ctl00cPHtxtFixedExpensesDeductions);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtFixedExpensesDeductions " + ctl00cPHtxtFixedExpensesDeductions);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtProfessionalFeesAndSubscriptions
     * @name Enter ctl00$cPH$txtProfessionalFeesAndSubscriptions
     */
 	public void Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions(String ctl00cPHtxtProfessionalFeesAndSubscriptions)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtProfessionalFeesAndSubscriptionsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions", "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions failed. Unable to locate object: " + ctl00cPHtxtProfessionalFeesAndSubscriptionsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions", "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions failed. Unable to locate object: " + ctl00cPHtxtProfessionalFeesAndSubscriptionsElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtProfessionalFeesAndSubscriptionsElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtProfessionalFeesAndSubscriptions);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions " + ctl00cPHtxtProfessionalFeesAndSubscriptions);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtProfessionalFeesAndSubscriptions " + ctl00cPHtxtProfessionalFeesAndSubscriptions);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtOtherExpensesAndCapitalAllowances
     * @name Enter ctl00$cPH$txtOtherExpensesAndCapitalAllowances
     */
 	public void Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances(String ctl00cPHtxtOtherExpensesAndCapitalAllowances)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtOtherExpensesAndCapitalAllowancesElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances", "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances failed. Unable to locate object: " + ctl00cPHtxtOtherExpensesAndCapitalAllowancesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances", "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances failed. Unable to locate object: " + ctl00cPHtxtOtherExpensesAndCapitalAllowancesElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtOtherExpensesAndCapitalAllowancesElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtOtherExpensesAndCapitalAllowances);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances " + ctl00cPHtxtOtherExpensesAndCapitalAllowances);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtOtherExpensesAndCapitalAllowances " + ctl00cPHtxtOtherExpensesAndCapitalAllowances);
 	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[3]/div[3]/div/div[2]/div/div[4]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
	}

     
	/**
 	 * Click  × 
     * @name Click  × 
     */
	public void Click___1()
	{
        
		WebElement elem = getWebElement(__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click___1", "Click___1 failed. Unable to locate object: " + __1Elem.toString());

			Assert.fail("Unable to locate object: " + __1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click___1");

		TestModellerLogger.PassStep(m_Driver, "Click___1");
	}
}
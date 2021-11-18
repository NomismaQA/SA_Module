package com.nomisma.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

//import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.WaitStatementLib;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;

import bsh.Variable;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PayrollPage3 {
	
	//Add Employee
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddEmployee")
	private WebElement addEmployeeBtn;
	@FindBy (xpath= "//span[contains(text(),'Add Employee')]")
	private WebElement ppAddEmployeePopup;
	@FindBy (xpath= "//span[contains(text(),'Payroll Employee')]")
	private WebElement addEmployeePopupPayrollTab;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlTitle")
	private WebElement titleSelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtFirstName")
	private WebElement firstNameTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLastName")
	private WebElement lastNameTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDesignation")
	private WebElement designationTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlGender")
	private WebElement genderSelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDOB")
	private WebElement dobTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress1")
	private WebElement addressline1TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress2")
	private WebElement addressline2TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress3")
	private WebElement addressline3TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtAddress4")
	private WebElement addressline4TxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPostCode")
	private WebElement postcode2TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtcomment")
	private WebElement commentsTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPhone")
	private WebElement phoneTxtBx;
	@FindBy (id = "txtEmail")
	private WebElement empEmailTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_cbIsDirector")
	private WebElement directorChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDirectorStartDate")
	private WebElement dirStartDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDirectorEndDate")
	private WebElement dirEndDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTaxCode")
	private WebElement taxCodeTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_cbW1M1")
	private WebElement w1m1TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtNINumber")
	private WebElement niNumberTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode")
	private WebElement niCategorySelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtPayId")
	private WebElement payIdTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPayrollPaymentModeCode")
	private WebElement paymentModeSelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlPayrollFrequencyCode")
	private WebElement payFrequencySelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary")
	private WebElement basicSalaryTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtGrossSalary")
	private WebElement netSalaryTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_btnGross")
	private WebElement calculateGrossBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtDayRate")
	private WebElement dayRateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtHourRate")
	private WebElement hourRateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_cbIsStudentLoan")
	private WebElement studentLoanChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtJoiningDate")
	private WebElement joiningDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlStarterDecl")
	private WebElement starterDeclarationDrpDwn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLeavingDate")
	private WebElement leavingDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_cbP45")
	private WebElement p45DetailsChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTotalSalaryP45")
	private WebElement totalSalP45TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtTotalTaxP45")
	private WebElement totalTaxP45TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtLeavingDateP45")
	private WebElement leavingDate2TxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rdoDirectorTableMethod")
	private WebElement tableMethodRadio;
	@FindBy (id = "l00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rdoDirectorCumulativeMethod")
	private WebElement cummulativeMethodRadio;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement saveAddEmployeeBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelAddEmployeeBtn;
	
	
	//Edit link in Employee Setting
//	@FindBy (xpath = "//div//a//img[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl08_imgEdit']/../..//span[contains(text(),'Edit')]")
//	private WebElement editLnk;
	@FindBy (xpath = "//img[@title='Edit']")
	private WebElement editLnk;
	@FindBy (xpath = "//div//a//figure//img[@title='Delete']/../..//span[contains(text(),'Delete')]")
	private WebElement deleteLnk;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement deleteEmpBtn;
	@FindBy (xpath = "//div[contains(text(),'Employee has some transaction associated. You can not delete this employee.')]")
	private WebElement deleteErrorMsg;
	
	//Calender Popup WebElement
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today")
	private WebElement calenderCurDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_title")
	private WebElement calenderTitle;
	@FindBy (xpath = "//div[contains(text(),'Jan')]") //Change the index of row from 0, 1, 2 and column to 0,1,2,3 as per month selected
	private WebElement JanMonth;
	@FindBy (xpath = "//div[contains(text(),'January, 2017')]") //Change the Month and Year as per selection
	private WebElement monthSelected;
	@FindBy (xpath = "//div[contains(@title,'January 02, 2017')]") //Change the Day, Month and Date of the calender as per Date selected
	private WebElement pickDate;
	@FindBy (xpath = "//label[contains(text(),'Dir Start Date')]")
	private WebElement dirStartDateLbl;
	
    //OVERDUE
	@FindBy(xpath= "//a[contains(text(), 'OVERDUE')]")
	private WebElement overDue;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate")
	private WebElement taxYerdrpDwn;
	@FindBy (xpath= "//header[@class='page_title clearfix']")
	private WebElement title;
	@FindBy(xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position()]//td[2]")
	private WebElement companies;
	@FindBy(id= "ctl00_ctl00_ParentContent_cpHeaderRight_btnSubmitOnline")
	private WebElement runPayrollBtn;
	@FindBy(id= "ctl00_ctl00_ParentContent_cpHeaderRight_btnCancel")
	private WebElement canclBtn;
	@FindBy(xpath= "//div[@id='ctl00_ctl00_ParentContent_divPagination']//li']")
	private WebElement pagination;
	
	//AUTO PAYROLL
	@FindBy(xpath= "//a[contains(text(), 'AUTO PAYROLL')]")
	private WebElement autoPayroll;
	//MANUAL PAYROLL
	@FindBy(xpath= "//a[contains(text(), 'MANUAL PAYROLL')]")
	private WebElement manPayroll;
	
	//FailedRTI
	@FindBy(xpath= "//a[contains(text(), 'FAILED RTI')]")
	private WebElement FailedRTIlnk;
	@FindBy(xpath= "//tr[2]/td[6]/a[1]/img[1]")
	private WebElement RTIXML;
	@FindBy (xpath = "//span[@class='h1A']")
	private WebElement FailedRTITitle;
	//Submit RTI
	@FindBy(xpath="//a[contains(text(),'Submit RTI')]")
	private WebElement submitRTILink;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_chAllRTI")
	private WebElement selectAllButton;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_txtNotes")
	private WebElement submitRTINotes;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_btnSubmitRTI")
	private WebElement submitRTIBtn;
	//Add Employee

	@FindBy (xpath = "//span[contains(text(),'Bank Details')]")
	private WebElement TabBankDetailsp;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompanyBankDetails_ddlBanksMaster")
	private WebElement ddlBanksMaster;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompanyBankDetails_txtBankAccountSortCode")
	private WebElement txtBankAccountSortCode;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompanyBankDetails_txtBankAccount")
	private WebElement txtBankAccount;
	
	@FindBy (xpath = "//span[contains(text(),'Terms')]")
	private WebElement TabTerms;
	@FindBy (xpath = "//span[@id='__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts']")
	private WebElement TabContacts;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtPayrollDate")
	private WebElement txtPayrollDate;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtStartDate")
	private WebElement txtStartDate;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtEndDate")
	private WebElement txtEndDate;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtAnnualLeaveDays")
	private WebElement txtAnnualLeaveDays;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtHourlyRate")
	private WebElement txtHourlyRate;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtCarryForward")
	private WebElement txtCarryForward;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtWorkingHoursWeekly")
	private WebElement txtWorkingHoursWeekly;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtPaySicknessDaysMax")
	private WebElement txtPaySicknessDaysMax;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_btnResetCompanyStd")
	private WebElement btnResetCompanyStd;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtNoticeWeeks")
	private WebElement txtNoticeWeeks;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpLeavesManagement_txtRetirementAgeMale")
	private WebElement txtRetirementAgeMale;
	

	@FindBy (xpath = "//div[@class='alert alert-danger']")
	private WebElement ErrorMsg;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPHFilter_txtEmployeeName")
	private WebElement txtEmployeeName;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement btnSearch;
	public String name1;
	@FindBy (xpath = "//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdEmployeeDetail']//a[@class='toggleSettings']")
	private WebElement toggleSettings;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_imgEdit")
	private WebElement imgEdit;
	
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactsName1")
	private WebElement txtContactsName1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactsName2")
	private WebElement txtContactsName2;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactsName3")
	private WebElement txtContactsName3;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactsName4")
	private WebElement txtContactsName4;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactsName5")
	private WebElement txtContactsName5;               
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtRelationship1")
	private WebElement txtRelationship1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtTelephone1")
	private WebElement txtTelephone1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtMobile1")
	private WebElement txtMobile1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtContactAddress1")
	private WebElement txtContactAddress1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtPostcode1")
	private WebElement txtPostcode1;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_tbContainer_tpContacts_txtNotes1")
	private WebElement txtNotes1;                        

	WaitStatementLib wLib;
	
	public PayrollPage3(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
    
    public void addEmployeePopup(WebDriver driver, String firstName, String lastName, String designation, String dob, String addressLn1, 
    		String addressLn2, String addressLn3, String addressLn4, String postcode, String comments, String phone, String empemail, String dirStartDate, String taxCode, 
    		String niNumber, String payId, String netSal, String joiningDate) throws InterruptedException{
    
    	//Need to comment if chrome driver is updated
//    	CISPage cis=new CISPage(driver);
//    	cis.switchwindowNew(driver);
    	

    	WebElement titleSelectBx= this.titleSelectBx;
		Select sel5 =new Select(titleSelectBx);
		sel5.selectByVisibleText("Mr.");
		
		firstNameTxtBx.sendKeys(firstName);
		lastNameTxtBx.sendKeys(lastName);
		designationTxtBx.sendKeys(designation);
		
		WebElement genderSelectBx= this.genderSelectBx;
		Select sel6 =new Select(genderSelectBx);
		sel6.selectByVisibleText("Male");
		
		dobTxtBx.sendKeys(dob);
		addressline1TxtBx.sendKeys(addressLn1);
		addressline2TxtBx.sendKeys(addressLn2);
		addressline3TxtBx.sendKeys(addressLn3);
		addressline4TxtBx.sendKeys(addressLn4);
		postcode2TxtBx.sendKeys(postcode);
		commentsTxtBx.sendKeys(comments);
		phoneTxtBx.sendKeys(phone);
		empEmailTxtBx.sendKeys(empemail);
		directorChckBx.click();
		
		wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, dirStartDateTxtBx);

		WebElement dirStartDateTxtBx = this.dirStartDateTxtBx;
		
		boolean flag1 = dirStartDateTxtBx.isEnabled();
		
		if (flag1)
		{
			System.out.println("Director Start Date Text Box is enabled");
		}
		
		dirStartDateTxtBx.click();
		
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today"));
		Reporter.log("Calender Popup is open", true);
		
		String curDate = calenderCurDate.getText();
		System.out.println(curDate);
		
		calenderTitle.click();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_1"));
		Reporter.log("All the Months Displayed", true);
		dirStartDateTxtBx.sendKeys(dirStartDate);

		dirStartDateLbl.click();

		Reporter.log("Date Selected", true);
 
		Reporter.log("Selecting NI Calculation method for Director", true);
		
		tableMethodRadio.click();
		taxCodeTxtBx.sendKeys(taxCode);
		niNumberTxtBx.sendKeys(niNumber);
		payIdTxtBx.sendKeys(payId);	
		netSalaryTxtBx.sendKeys(netSal);
		calculateGrossBtn.click();

		Reporter.log("Calculate Gross is clicked", true);
		
		wLib.explicitWait_attributeToBeNotEmpty(driver, 20, basicSalaryTxtBx, "value");
	
		String sal = basicSalaryTxtBx.getAttribute("value");
		@SuppressWarnings("deprecation")
		String basicSal = new Double(sal).toString();

		Reporter.log("Basic Salary is: "+basicSal, true);
		
		joiningDateTxtBx.sendKeys(joiningDate);
		saveAddEmployeeBtn.click();
				
    }
    
    public void PayrollDashboard(WebDriver driver, String taxyear, String overduecmpny, String autopaycmpny, String manupaycmpny) throws InterruptedException
	{
		overDue.click();
		WebElement taxYerdrpDwn= this.taxYerdrpDwn;
		Select sel =new Select(taxYerdrpDwn);
		taxYerdrpDwn.sendKeys(taxyear);
		title.click();
		Reporter.log("Tax Year = "+taxyear+ " selected from Drop Down", true);
		driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+overduecmpny+"')]//..//..//td[1]//input")).click();
		runPayrollBtn.click();
		Thread.sleep(3000);
		//canclBtn.click();
		//driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+overduecmpny+"')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
						
		/*List<WebElement> page=driver.findElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_divPagination']//a"));
		
		if(page.size()>0)
		{
			System.out.println("Pagination is Exists");
			
			for(int i=1;i<page.size();i++)
			{
				page.get(i).click();
				Thread.sleep(3000);
			}
		}
		else
		{
			System.out.println("Pagination is not Exists");
		}*/
		
		//AUTO PAYROLL
		autoPayroll.click();
		WebElement taxYerdrpDwn1= this.taxYerdrpDwn;
		Select sel1 =new Select(taxYerdrpDwn1);
		taxYerdrpDwn1.sendKeys(taxyear);
		title.click();
		Reporter.log("++++++++++ Tax Year is Selected from Drop Down ++++++++++", true);
		driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+autopaycmpny+"')]//..//..//td[1]//input")).click();
		runPayrollBtn.click();
		//canclBtn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		//MANUAL PAYROLL
		manPayroll.click();
		WebElement taxYerdrpDwn2= this.taxYerdrpDwn;
		Select sel2 =new Select(taxYerdrpDwn2);
		taxYerdrpDwn2.sendKeys(taxyear);
		title.click();
		Reporter.log("++++++++++ Tax Year is Selected from Drop Down ++++++++++", true);
		driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+manupaycmpny+"')]//..//..//td[1]//input")).click();
		runPayrollBtn.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
    public void submitRTI(WebDriver driver, String notes)
	{
	OpenDashboard od1=new OpenDashboard(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 30, od1.payrollMenuLnk);
	od1.payrollMenuLnk.click();
	wLib.explicitWait(driver, 30, submitRTILink);
	submitRTILink.click();
	wLib.explicitWait(driver, 30, selectAllButton);
	selectAllButton.click();
	wLib.explicitWait(driver, 30, submitRTINotes);
	submitRTINotes.clear();
	submitRTINotes.sendKeys(notes);
	wLib.explicitWait(driver, 30, submitRTIBtn);
	submitRTIBtn.click();
	Reporter.log("RTI Submitted successfully", true);
	}
    public void FailedRTIXML(WebDriver driver, String curUrl) throws InterruptedException, ParserConfigurationException, MalformedURLException, SAXException, IOException{
		
//		String count = CntFailedRTI.getText();
//		int cnt = Integer.parseInt(count.substring(0, 2).trim());
//		Reporter.log("cnt: " +cnt, true);
		
		FailedRTIlnk.click();
		Reporter.log("Failed RTI clicked", true);
		
		RTIXML.click();
		CISPage cis = new CISPage(driver);
		cis.switchwindowNew(driver);
		Assert.assertEquals("RTI XML file", FailedRTITitle.getText(), "RTI XML's title not verified");
		Reporter.log("RTI XML's title verified successfully", true);
		
		
//		String name = "'ele_child123'";
//		String find = "//element[@name=" + name + "]/@value";
//		String attrVal = xmldoc.SelectSingleNode(find).Value;
		
		String url=driver.getCurrentUrl();
	//	 String url = "http://api.nbp.pl/api/exchangerates/rates/c/gbp/2015-01-01/2015-01-31";   
		//    try
		    {
		        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		        DocumentBuilder db = dbf.newDocumentBuilder();
		        Document doc = db.parse(new URL(url).openStream());

		        doc.getDocumentElement().normalize();
		        System.out.println ("Root element: " + "/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/textarea[1]" +
		                    doc.getElementsByTagName("PeriodEnd"));
		        
//		        String name = "'ele_child123'";
//		        String find = "//element[@name=" + name + "]";
//
//		        Variable childElem;
//				foreach (childElem in xdoc.XPathSelectElements(find))
//		        {
//		            String childName = childElem.Element("value").Value;
//		            Console.WriteLine(childName);
//		        }
		    }
//		    catch (Exception e)
//		    {
//		        e.printStackTrace();
//		    }

		    
//		    DOMParser parser = new DOMParser();
//		    parser.parse("mydocument.xml");
//		    Document doc = parser.getDocument();
//		 
//		    // Get the document's root XML node
//		    NodeList root = doc.getChildNodes();
//		 
//		    // Navigate down the hierarchy to get to the CEO node
//		    Node comp = doc.("Company", root);
//		    Node comp = doc.node("Company", root);
//		    Node exec = getNode("Executive", comp.getChildNodes() );
//		    String execType = getNodeAttr("type", exec);
//		 
//		    // Load the executive's data from the XML
//		    NodeList nodes = exec.getChildNodes();
//		    String lastName = getNodeValue("LastName", nodes);
//		    String firstName = getNodeValue("FirstName", nodes);
//		    String street = getNodeValue("street", nodes);
//		    String city = getNodeValue("city", nodes);
//		    String state = getNodeValue("state", nodes);
//		    String zip = getNodeValue("zip", nodes);
//		 
//		    System.out.println("Executive Information:");
//		    System.out.println("Type: " + execType);
//		    System.out.println(lastName + ", " + firstName);
//		    System.out.println(street);
//		    System.out.println(city + ", " + state + " " + zip);
	
    
		    try {

		    	SAXParserFactory factory = SAXParserFactory.newInstance();
		    	SAXParser saxParser = factory.newSAXParser();

		    	DefaultHandler handler = new DefaultHandler() {

		    	boolean bfname = false;
		    	boolean blname = false;
		    	boolean bnname = false;
		    	boolean bsalary = false;

		    	public void startElement(String uri, String localName,String qName, 
		                    Attributes attributes) throws SAXException {

		    		System.out.println("Start Element :" + qName);

		    		if (qName.equalsIgnoreCase("PeriodEnd")) {
		    			bfname = true;
		    		}

		    		if (qName.equalsIgnoreCase("textarea")) {
		    			blname = true;
		    		}

		    		if (qName.equalsIgnoreCase("NICKNAME")) {
		    			bnname = true;
		    		}

		    		if (qName.equalsIgnoreCase("SALARY")) {
		    			bsalary = true;
		    		}

		    	}

		    	public void endElement(String uri, String localName,
		    		String qName) throws SAXException {

		    		System.out.println("End Element :" + qName);

		    	}

		    	public void characters(char ch[], int start, int length) throws SAXException {

		    		if (bfname) {
		    			System.out.println("First Name : " + new String(ch, start, length));
		    			bfname = false;
		    		}

		    		if (blname) {
		    			System.out.println("Last Name : " + new String(ch, start, length));
		    			blname = false;
		    		}

		    		if (bnname) {
		    			System.out.println("Nick Name : " + new String(ch, start, length));
		    			bnname = false;
		    		}

		    		if (bsalary) {
		    			System.out.println("Salary : " + new String(ch, start, length));
		    			bsalary = false;
		    		}

		    	}

		         };

//		           saxParser.parse("c:\\file.xml", handler);
		         saxParser.parse(new URL(url).openStream(), handler);
		           
		     
		         } catch (Exception e) {
		           e.printStackTrace();
		         }
		      
		       }
		    
    
    public void addEmployeePopup2(WebDriver driver, String firstName, String lastName, String designation, String dob, String addressLn1, 
    		String addressLn2, String addressLn3, String addressLn4, String postcode, String comments, String phone, String empemail, String dirStartDate, String taxCode, 
    		String niNumber, String payId, String netSal, String joiningDate) throws InterruptedException{
    
    	//Need to comment if chrome driver is updated
//    	CISPage cis=new CISPage(driver);
//    	cis.switchwindowNew(driver);
    	

    	ReadFilesPage RFP= new ReadFilesPage(driver);
    	WebElement titleSelectBx= this.titleSelectBx;
		Select sel5 =new Select(titleSelectBx);
		sel5.selectByVisibleText("Mr.");
		
		firstNameTxtBx.sendKeys(firstName+RFP.generateRandom());
		lastNameTxtBx.sendKeys(lastName);
		designationTxtBx.sendKeys(designation);
		
		WebElement genderSelectBx= this.genderSelectBx;
		Select sel6 =new Select(genderSelectBx);
		sel6.selectByVisibleText("Male");
		
		dobTxtBx.sendKeys(dob);
		addressline1TxtBx.sendKeys(addressLn1);
		addressline2TxtBx.sendKeys(addressLn2);
		addressline3TxtBx.sendKeys(addressLn3);
		addressline4TxtBx.sendKeys(addressLn4);
		postcode2TxtBx.sendKeys(postcode);
		commentsTxtBx.sendKeys(comments);
		phoneTxtBx.sendKeys(phone);
		empEmailTxtBx.sendKeys(empemail);
		directorChckBx.click();
		
		wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, dirStartDateTxtBx);

		WebElement dirStartDateTxtBx = this.dirStartDateTxtBx;
		
		boolean flag1 = dirStartDateTxtBx.isEnabled();
		
		if (flag1)
		{
			System.out.println("Director Start Date Text Box is enabled");
		}
		
		dirStartDateTxtBx.click();
		
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today"));
		Reporter.log("Calender Popup is open", true);
		
		String curDate = calenderCurDate.getText();
		System.out.println(curDate);
		
		calenderTitle.click();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_1"));
		Reporter.log("All the Months Displayed", true);
		dirStartDateTxtBx.sendKeys(dirStartDate);

		dirStartDateLbl.click();

		Reporter.log("Date Selected", true);
 
		Reporter.log("Selecting NI Calculation method for Director", true);
		
		tableMethodRadio.click();
		taxCodeTxtBx.sendKeys(taxCode);
		niNumberTxtBx.sendKeys(niNumber);
		payIdTxtBx.sendKeys(payId);	
		netSalaryTxtBx.sendKeys(netSal);
		calculateGrossBtn.click();

		Reporter.log("Calculate Gross is clicked", true);
		
		wLib.explicitWait_attributeToBeNotEmpty(driver, 20, basicSalaryTxtBx, "value");
	
		String sal = basicSalaryTxtBx.getAttribute("value");
		@SuppressWarnings("deprecation")
		String basicSal = new Double(sal).toString();

		Reporter.log("Basic Salary is: "+basicSal, true);
		
		joiningDateTxtBx.sendKeys(joiningDate);
		
		AddEmployeeBankDetails();
		AddEmployeeTerms();
		saveAddEmployeeBtn.click();
		Thread.sleep(4000);
		RFP.VerifyValues(driver, "ErrorMessage", ErrorMsg, "Error! Please first save employee details.");
		
				
    }
 
    public void AddEmployeeBankDetails(){
    	TabBankDetailsp.click();
    	
    	Select sel1=new Select(ddlBanksMaster);
    	sel1.selectByVisibleText("Bank of America");
    	txtBankAccountSortCode.sendKeys("123456");
    	txtBankAccount.sendKeys("12345678");
    	
    }
    
    public void AddEmployeeTerms(){
    	TabTerms.click();
    	txtAnnualLeaveDays.clear();
    	txtAnnualLeaveDays.sendKeys("10");
    	txtHourlyRate.clear();
    	txtHourlyRate.sendKeys("6");
    	txtCarryForward.clear();
    	txtCarryForward.sendKeys("2");
    	txtWorkingHoursWeekly.clear();
    	txtWorkingHoursWeekly.sendKeys("40");
    	txtPaySicknessDaysMax.clear();
    	txtPaySicknessDaysMax.sendKeys("10");
    	txtNoticeWeeks.clear();
    	txtNoticeWeeks.sendKeys("4");
    	txtRetirementAgeMale.clear();
    	txtRetirementAgeMale.sendKeys("60");
    	
    	
    }
    
    public void addEmployeePopup3(WebDriver driver, String firstName, String lastName, String designation, String dob, String addressLn1, 
    		String addressLn2, String addressLn3, String addressLn4, String postcode, String comments, String phone, String empemail, String dirStartDate, String taxCode, 
    		String niNumber, String payId, String netSal, String joiningDate) throws InterruptedException{
    
    	//Need to comment if chrome driver is updated
//    	CISPage cis=new CISPage(driver);
//    	cis.switchwindowNew(driver);
    	

    	ReadFilesPage RFP= new ReadFilesPage(driver);
    	WebElement titleSelectBx= this.titleSelectBx;
		Select sel5 =new Select(titleSelectBx);
		sel5.selectByVisibleText("Mr.");
		
		firstNameTxtBx.sendKeys(firstName);
		lastNameTxtBx.sendKeys(lastName);
		designationTxtBx.sendKeys(designation);
		
		WebElement genderSelectBx= this.genderSelectBx;
		Select sel6 =new Select(genderSelectBx);
		sel6.selectByVisibleText("Male");
		
		dobTxtBx.sendKeys(dob);
		addressline1TxtBx.sendKeys(addressLn1);
		addressline2TxtBx.sendKeys(addressLn2);
		addressline3TxtBx.sendKeys(addressLn3);
		addressline4TxtBx.sendKeys(addressLn4);
		postcode2TxtBx.sendKeys(postcode);
		commentsTxtBx.sendKeys(comments);
		phoneTxtBx.sendKeys(phone);
		empEmailTxtBx.sendKeys(empemail);
		directorChckBx.click();
		
		wLib = new WaitStatementLib();
		wLib.explicitWait_elementToBeClickable(driver, 20, dirStartDateTxtBx);

		WebElement dirStartDateTxtBx = this.dirStartDateTxtBx;
		
		boolean flag1 = dirStartDateTxtBx.isEnabled();
		
		if (flag1)
		{
			System.out.println("Director Start Date Text Box is enabled");
		}
		
		dirStartDateTxtBx.click();
		
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today"));
		Reporter.log("Calender Popup is open", true);
		
		String curDate = calenderCurDate.getText();
		System.out.println(curDate);
		
		calenderTitle.click();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_1"));
		Reporter.log("All the Months Displayed", true);
		dirStartDateTxtBx.sendKeys(dirStartDate);

		dirStartDateLbl.click();

		Reporter.log("Date Selected", true);
 
		Reporter.log("Selecting NI Calculation method for Director", true);
		
		tableMethodRadio.click();
		taxCodeTxtBx.sendKeys(taxCode);
		niNumberTxtBx.sendKeys(niNumber);
		payIdTxtBx.sendKeys(payId);	
		netSalaryTxtBx.sendKeys(netSal);
		calculateGrossBtn.click();

		Reporter.log("Calculate Gross is clicked", true);
		
		wLib.explicitWait_attributeToBeNotEmpty(driver, 20, basicSalaryTxtBx, "value");
	
		String sal = basicSalaryTxtBx.getAttribute("value");
		@SuppressWarnings("deprecation")
		String basicSal = new Double(sal).toString();

		Reporter.log("Basic Salary is: "+basicSal, true);
		
		joiningDateTxtBx.sendKeys(joiningDate);
		saveAddEmployeeBtn.click();
		Thread.sleep(2000);
		
		/*SearchEmployee(driver, firstName);
		
		clickEditEmployeeBtn(driver);
		
		AddEmployeeBankDetails();
		saveAddEmployeeBtn.click();*/
		
		SearchEmployee(driver,firstName);
		
		clickEditEmployeeBtn(driver);
		AddEmployeeTerms();
		saveAddEmployeeBtn.click();
		Thread.sleep(2000);
		
		SearchEmployee(driver, firstName);
		clickEditEmployeeBtn(driver);
		AddEmployeeContacts();
		saveAddEmployeeBtn.click();
		Thread.sleep(2000);
			
				
    }
 
    
    public void SearchEmployee(WebDriver driver, String name1) throws InterruptedException{
    	
    	
    	ReadFilesPage RFP= new ReadFilesPage(driver);
    	RFP.switchwindowDefault(driver);
    	txtEmployeeName.sendKeys(name1);
    	btnSearch.click();
    	
    	   	
    	
    }
    
    public void clickEditEmployeeBtn(WebDriver driver){
    	toggleSettings.click();
    	imgEdit.click();
    	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
    	wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, By.xpath("//div//header//span[contains(text(),'Edit Employee')]"));
    	
		Reporter.log("Edit Employee Popup is open",true);
		//Reporter.log("Edit Company popup is displayed", true);
	}
    
    
    
    public void AddEmployeeContacts(){
    	
    	TabContacts.click();
    	txtContactsName1.clear();
    	txtContactsName1.sendKeys("Test1");
    	txtContactsName2.clear();
    	txtContactsName2.sendKeys("Test2");
    	txtContactsName3.clear();
    	txtContactsName3.sendKeys("Test3");
    	txtContactsName4.clear();
    	txtContactsName4.sendKeys("Test4");
    	txtContactsName5.clear();
    	txtContactsName5.sendKeys("Test5");
    	
    	txtRelationship1.clear();
    	txtRelationship1.sendKeys("S1");
    	txtTelephone1.clear();
    	txtTelephone1.sendKeys("0123456");
    	
    	txtMobile1.clear();
    	txtMobile1.sendKeys("9876543210");
    	
    	txtContactAddress1.clear();
    	txtContactAddress1.sendKeys("62233 555");
    	txtPostcode1.clear();
    	txtPostcode1.sendKeys("121005");
    	txtNotes1.clear();
    	txtNotes1.sendKeys("Test1 Test1 Test1 Test1 Test1");
    	
    	
    }
    
    

	
 
}

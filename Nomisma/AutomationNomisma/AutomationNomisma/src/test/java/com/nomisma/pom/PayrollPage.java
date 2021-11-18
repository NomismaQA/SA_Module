package com.nomisma.pom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

//import com.nomisma.generic.ExcelLib;
import com.nomisma.generic.WaitStatementLib;
import com.relevantcodes.extentreports.LogStatus;

public class PayrollPage {
	
	@FindBy (xpath= "//span[contains(text(),'Select Company is In-Active, Payroll Run Disabled.')]")
	private WebElement companyInactiveTxt;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll")
	private WebElement runPayrollBtn;
	
	//Edit Company Popup Elements
	@FindBy(xpath= "//div[@class='modal-body']")
	private WebElement editCompanyPopup;
	@FindBy(id ="cboxClose")
	private WebElement popupClose;
	@FindBy (xpath = "//span[contains(text(),'Edit Company')]")
	private WebElement ppEditCompanyPopup;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtPayeRegDate")
	private WebElement payeRegDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtPayeRefNo")
	private WebElement payeRefNoTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtOfficeNo")
	private WebElement hmrcOffNoTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAORef")
	private WebElement accOfficeRefTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtECON")
	private WebElement econTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtCOTAXRef")
	private WebElement cotaxRefTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtEmail")
	private WebElement emailTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtContactPerson")
	private WebElement contactPersonTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlPaySlipTemplate")
	private WebElement payslipTempTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkPwdProtectPaySlips")
	private WebElement passwordProtectPayslipChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkQuarterlyPayeScheme")
	private WebElement quarterlyPayeSchemeChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_chkSmallEmployerRelief")
	private WebElement qualifySERChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtSwitchDate")
	private WebElement payrollSwitchDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlMonthlyPayDay")
	private WebElement monthlyPayDaySelectBx;
	//@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlWeeklyPayDay")
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtWeeklyPayrollEndDate")
	private WebElement weeklyPayDaySelectBx;
	//@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_ddlFortnightlyPayDay")
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtFortnightlyPayrollEndDate")
	private WebElement fortnightlyPayDaySelectBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_cbIsAutoRun")
	private WebElement autoRunPayrollChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_cbIsActive")
	private WebElement activeChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress1")
	private WebElement addressTxtBx1;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtAddress2")
	private WebElement addressTxtBx2;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollCompany_txtPostCode")
	private WebElement postcodeTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement saveBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelBtn;
	
	
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
	//Delete employee
	
	@FindBy (xpath = "//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdEmployeeDetail']/td[5]")
	private WebElement nINumber;
	@FindBy (xpath = "//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdEmployeeDetail']/td[9]/a")
	private WebElement displayRecordLink;
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
	
	//Edit Employee (Auto Enrolment)
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditEmployee")
	private WebElement editEmpDetails;
	@FindBy (id = "__tab_ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee")
	private WebElement autoEnrolTab;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddl_workerType")
	private WebElement workerType;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlEmpEligiblestatus")
	private WebElement status;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_ddlWorkersGroup")
	private WebElement workersGroup;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPensionScheme")
	private WebElement scheme;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeStartDate")
	private WebElement pstpnmntStrtDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtPostponeEndDate")
	private WebElement pstpnmntEndDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtEnrolledDate")
	private WebElement enrolmntDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtOptOutDate")
	private WebElement optoutDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtOptInDate")
	private WebElement optinDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_txtLeftDate")
	private WebElement schmeLftDate;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbAlreadyEnrolled")
	private WebElement alrdyEnrol;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbTransitional")
	private WebElement transition;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbScopeForAE")
	private WebElement inscopeIE;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbSalaryExchange")
	private WebElement salExchnge;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpAEPayrollEmployee_cbSendEmail")
	private WebElement sendEmail;
	@FindBy (xpath="//span[contains(text(),'Go Back')]")
	private WebElement goBack;

	
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
	
	
	//Add Leave Popup WebElement
	@FindBy (id="ctl00_ctl00_ParentContent_cpHeaderRight_hrefAddLeave")
	private WebElement addLeaveBtn;
	@FindBy (id="cboxClose")
	private WebElement popupClose1;
	@FindBy (xpath= "//span[contains(text(),'Leave Management')]")
	private WebElement ppAddLeavePopup;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_ddlEmployee")
	private WebElement employeeSelectBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_ddlLeaveType")
	private WebElement leaveTypeLstBox;
	@FindBy (id="ctl00_ctl00_ParentContent_cphFooter_btnSPP")
	private WebElement sppBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cphFooter_btnSSP")
	private WebElement sspBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelBtn1;
	
	//Add Statutory Maternity & Paternity Leave Popup
	@FindBy (xpath = "//span[contains(text(),'Employee:')]")
	private WebElement smpPopupHeading;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbMonday")
	private WebElement workingDayMondayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbTuesday")
	private WebElement workingDayTuesdayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbWednesday")
	private WebElement workingDayWednesdayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbThursday")
	private WebElement workingDayThursdayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbFriday")
	private WebElement workingDayFridayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbSaturday")
	private WebElement workingDaySaturdayChckBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_cbSunday")
	private WebElement workingDaySundayChckBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtExpectedDueDate")
	private WebElement expectedDueDateTxtBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtDOB")	
	private WebElement actualBirthDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAWEMaternity")
	private WebElement averageWeeklyEarningTxtBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtDOBPater")
	private WebElement actualBirthDatePaternityTxtBx;
	
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAWEPaternity")
	private WebElement averageWeeklyEarningPaternityTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtStartDate")
	private WebElement leaveStartDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEndDateSick")
	private WebElement sickLeaveEndDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtStartDatePaternity")
	private WebElement paternityLeaveStartDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNoOfWeekPaternity")
	private WebElement numbOfLeaveWeeksTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNoOfWeek")
	private WebElement NoOfWeekTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNoOfWeeksSick")
	private WebElement NoOfWeekSickTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtStartDateSick")
	private WebElement sickleaveStartDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEndDate")
	private WebElement leaveEndDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtAWESick")
	private WebElement AWESickTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEndDatePaternity")
	private WebElement leaveEndDatePaternityTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtMaternityPayWeeks")
	private WebElement maternityPayWeeksTxtBx;
	@FindBy (xpath = "//label[contains(text(),'Leave End Date')]")
	private WebElement leaveEndDateTxtLbl;
	//label[@class="add_form_label"][contains(text(), "Leave End Date")]
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement saveLeaveBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement cancelSMPLeaveBtn;
	@FindBy (xpath="//div[contains(text(), 'SPP already availed.')]")
	private List<WebElement> errorMsg;
	@FindBy (xpath = "//div[@class='outerT-dash outerT-dash_Print'][2]/table/tbody/tr[2]/td[4]") 
	private WebElement empLeaveEmpName;
		
	//Edit SMP Leave Popup
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_lnkAWESALSMP")
	private WebElement reCalculateAWE;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SMP')]//..//td/a[@class='toggleSettings']")
	private List<WebElement> smpLeaveSettingsList;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SMP')]//..//td/a[@class='toggleSettings']")
	private WebElement smpLeaveSettings;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SMP')]//..//td/div/a/span[contains(text(),'Edit')]")
	private WebElement editSMPLeave;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SMP')]//..//td/div/a/span[contains(text(),'Delete')]")
	private WebElement deleteSMPLeave;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SPP')]//..//td/a[@class='toggleSettings']")
	private WebElement sppLeaveSettings;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SSP')]//..//td/a[@class='toggleSettings']")
	private WebElement sspLeaveSettings;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SPP')]//..//td/a[@class='toggleSettings']")
	private List<WebElement> sppLeaveSettingsList;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SSP')]//..//td/a[@class='toggleSettings']")
	private List<WebElement> sspLeaveSettingsList;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SPP')]//..//td/div/a/span[contains(text(),'Edit')]")
	private WebElement editSPPLeave;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SPP')]//..//td/div/a/span[contains(text(),'Delete')]")
	private WebElement deleteSPPLeave;
	@FindBy (xpath = "//div[@class= 'outerT-dash outerT-dash_Print']/table/tbody/tr/td[contains(text(),'SSP')]//..//td/div/a/span[contains(text(),'Delete')]")
	private WebElement deleteSSPLeave;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_divMessage")
	private WebElement smpMessage;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_divMessagePaternity")
	private WebElement sppMessage;
	
	//Delete SMP Leaves
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnDelete")
	private WebElement deleteLeaveBtn;
	
	//Payroll Interaction
//	@FindBy (xpath = "//div/a/img[@src='../commonv2/images/cross0.png']")
//	private WebElement autoEnrolIMG;
	@FindBy (xpath = "//img[@src='/Commonv2/images/automaticenrolment.jpg']")
	private WebElement autoEnrolIMG;
//	@FindBy (xpath = "//div/a[@class='cbpopup_prc_50_30 cboxElement']")
//	private WebElement autoEnrolmentLnk;
	@FindBy (xpath = "//div/a[@class='cbpopup_prc_70_43 cboxElement']")
	private WebElement autoEnrolmentLnk;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtStagingDate")
	private WebElement stagingDateTxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtComplDate")
	private WebElement complianceDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtNextCyclicalEnrolDate")
	private WebElement nextCyclicalEnrolDateTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement autoEnrolSaveBtn;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtSignatoryName")
	private WebElement signatoryNameTxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtSignatoryTitle")
	private WebElement signatoryTitleTxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement signatoryEmailTxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtContactNumber")
	private WebElement contactNumberTxtBx;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_txtPSEmployerID")
	private WebElement pSEmployerIDTxtBx;	

	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement autoEnrolCancelBtn;
	
	//Employer Allowance
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_hrefEmployerAllowance")
	private WebElement employerAllowanceLnk;
	@FindBy (xpath = "//a/span/img[@src='../commonv2/images/Error.gif']")
	private List<WebElement> empAllowanceDisabledIMG;
	@FindBy (xpath = "//a//span[@id='employerAllowance']//..//span/img[@src='../commonv2/images/checkbox.jpg']")
	private WebElement empAllowanceEnabledIMG;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_txtEmployerNIAllowance")
	private WebElement empNIAllowanceTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement empAllowanceSaveBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement empAllowanceCancelBtn;
	@FindBy (xpath = "//div//header//h2//span[contains(text(),'Enable Employee Allowance')]")
	private WebElement empAllowancePopupTitle;
	
	//Linking with Accounts
	@FindBy (xpath = "//a[@class='LargePopup cboxElement']")
	private WebElement linkWithAccountsLnk;
	@FindBy (xpath = "//a/span/img[@src='../commonv2/images/Error.gif']")
	private WebElement lnkWithAccountsDisabledIMG;
	@FindBy (xpath = "//a[@class='LargePopup cboxElement']//span/img[@src='../commonv2/images/checkbox.jpg']")
	private WebElement lnkWithAccountsEnabledIMG;
	@FindBy (xpath = "//div//header//h2[contains(text(),'Link with Accounts')]")
	private WebElement lnkWithAccountsPopupTitle;
	@FindBy (xpath = "//div//a[@class='employeemaping']")
	private WebElement clickHereForAdvMapping;
	@FindBy (id= "ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_ddlEmployee")
	private WebElement lnkWithAccountsDrpDwnBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement lnkWithAccountSaveBtn;
	
	
	//DeRegistration of Company
	@FindBy (xpath = "//a[@class='cbpopup_prc_90_75 cboxElement']")
	private WebElement deRegisterCompanyLnk;
	@FindBy (xpath = "//a/span/img[@src='/commonv2/images/Error.gif']")
	private WebElement deRegisterationDisabledIMG;
	
	@FindBy (xpath = "//a/span/img[@src='/commonv2/images/Error.gif']")
	private List<WebElement> deRegisterationDisabledIMGlst;
	@FindBy (xpath = "//div//header//h2//span[contains(text(),'Edit De-registration')]")
	private WebElement deregisterationPopupTitle;
//	@FindBy (xpath = "//div//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']")
//	private WebElement deRegisterationCancelBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnCancel")
	private WebElement deRegisterationCancelBtn;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_txtDeRegistrationDate']")
	private WebElement deRegisterationDateTxtBx;
	@FindBy (xpath = "//div//strong[contains(text(),'Error!')]")
	private WebElement P45FormError;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll")
	private WebElement runPayrollBttn;
	
	//Run Payroll
	@FindBy (xpath="//div[@class='green_heading_smallB']")
    private WebElement payDate; 
	@FindBy (id="ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline")
    private WebElement runPayrollScreenBtn; 
	@FindBy (xpath="//div[@class='pay_date_text']//h3[contains(text(),'Pay Date')]")
	private WebElement showPayDate;
	
	//Run Payroll Screen
	@FindBy (id="ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline")
	private WebElement runPayroll;
	@FindBy (xpath="//div[@class='green_heading_smallB']")
	private WebElement PayDate;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHFooter_btnSendEmail")
	private WebElement emailPayslipBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtEmail")
	private WebElement emailTxt;
	@FindBy (id="ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement emailSend;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_chkEmailPayslip")
	private WebElement rdBtn1;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_chkEmailPayslip_Employee")
	private WebElement rdBtn2;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_chkEmailPayslip_NoPay")
	private WebElement rdBtn3;
	private String emailUser="sudhir@nomismasolution.co.uk";

	//Search Employee on Dashboard
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_ddlEmployeeStatus")
	private WebElement empStatus;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtEmployeeName")
	private WebElement nameTxtBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy (xpath="//div[@class='outerT-dash outerT-dash_Print']//tbody//..[contains(text(),'Preetam Kaur')]//..//..//td[9]")
	private WebElement empSettings;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_imgEdit")
	private WebElement editIcon;
	@FindBy (xpath= "//span[contains(text(),'Delete')]")
	private WebElement deleteIcon;
	@FindBy (xpath="//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_tdEmployeeDetail']/td[1]/a")
	private WebElement empNameInList;
	//Edit pay details
//	@FindBy (xpath="//div[@class='outerT-dash outerT-dash_Print']//tbody//..[contains(text(),'Preetam Kaur')]")
//	private WebElement employeeLnk;
	@FindBy (partialLinkText="Preetam Kaur")
	private WebElement employeeLnk;	
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_hrefAddAddition")
	private WebElement editPaydetailsBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ddlAllowance")
	private WebElement addtionSel;
//	S-ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ltAdditionAccount
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtGrossSalary")
	private WebElement netPaytextBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnGross")
	private WebElement calGrossBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtDescription")
	private WebElement descrTxtBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_txtAmount")
	private WebElement amntTxtBx;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_rptrAllowance_ctl00_ddlTaxable")
	private WebElement applyonSel;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtNotes")
	private WebElement cmntsTxtBx;

	//Opening Balances
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_hrefBroughtForward")
	private WebElement openBalBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtTaxCode")
	private WebElement taxCode;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdGross")
	private WebElement grossPay;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdEmployeeNI")
	private WebElement employeeNI;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdNetPay")
	private WebElement netPay;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdELtoPT")
	private WebElement ELtoPT;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdPTtoUEL")
	private WebElement PTtoUEL;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdEmployeePension")
	private WebElement emplePension;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_ddlNICategoryCode")
	private WebElement NIcategory;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdTaxDeducted")
	private WebElement taxDed;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdEmployerNI")
	private WebElement empNI;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdLEL")
	private WebElement LEL;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdPTtoUAP")
	private WebElement PTtoUAP;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdStudentLoan")
	private WebElement stdLoan1;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdStudentLoan2")
	private WebElement stdLoan2;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtYtdStudentLoan2")
	private WebElement emplerPension;
	@FindBy(id= "ctl00_ctl00_ParentContent_cpHeaderRight_hrefEditCompany")
	private WebElement editCompanyBtn;

	@FindBy (xpath = "//span[contains(text(), 'Click here to UNDO last payroll run')]")
	private WebElement undoPayroll;
	
	//Payroll Dashboard on Agent Page
	@FindBy (xpath = "//div[@class='outerT-dash outerT-dash_Print']//tbody//tr//td//img[@src='/CommonV2/images/calendar-timesheet.png']")
	private WebElement payrollDateCalender;
	
	//Payroll HMRC Adjustments
	@FindBy (xpath = "//div//a[@id='ctl00_ctl00_ParentContent_cpHeaderRight_hrefHMRCOverPayment']")
	private WebElement hmrcAdjustmentsBtn;
	@FindBy (xpath = "//div//header//h2[contains(text(),'Set HMRC Over Payment Month Wise')]")
	private WebElement hmrcAdjustmentsPopupHeader;
	@FindBy (xpath = "//div//button[@id='cboxClose']")
	private WebElement hmrcAdjustmentsBtnClose;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_txtHMRCOverPayAmount']")
	private WebElement aprilMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl01_txtHMRCOverPayAmount']")
	private WebElement mayMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl02_txtHMRCOverPayAmount']")
	private WebElement junMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl03_txtHMRCOverPayAmount']")
	private WebElement julMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl04_txtHMRCOverPayAmount']")
	private WebElement augMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl05_txtHMRCOverPayAmount']")
	private WebElement sepMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl06_txtHMRCOverPayAmount']")
	private WebElement octMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl07_txtHMRCOverPayAmount']")
	private WebElement novMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl08_txtHMRCOverPayAmount']")
	private WebElement decMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl09_txtHMRCOverPayAmount']")
	private WebElement janMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl10_txtHMRCOverPayAmount']")
	private WebElement febMonthInput;
	@FindBy (xpath = "//div//input[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl11_txtHMRCOverPayAmount']")
	private WebElement marMonthInput;
	@FindBy (xpath = "//div//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnSave']")
	private WebElement savehmrcAdjusmentBtn;
	@FindBy (xpath = "//div//a[@id='ctl00_ctl00_ParentContent_cphFooter_btnCancel']")
	private WebElement cancelhmrcAdjusmentBtn;
	WaitStatementLib wLib;
	private String payrollPageTitle;
	static int i=1;
	public Select listbox1;
	public PayrollPage(WebDriver driver){
		payrollPageTitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
	
	public void verifyPayrollPageTitle(WebDriver driver, String company){
		//String expTitle = "DNS Associates";   //Give Company name here whenever a new title is needed to be verified
		WebElement expTitle =  driver.findElement(By.xpath("//span[contains(text(),'PAYROLL - "+company+"')]"));
		String expTitle1 = expTitle.getText();
		expTitle1 = expTitle1.replace("PAYROLL - ", "");
		Assert.assertEquals(payrollPageTitle, expTitle1, "Payroll page title is not verified");
		Reporter.log("Payroll page title verified successfully", true);
	}
	
	public void verifyCompanyStatus(){
		String text = companyInactiveTxt.getText();
		String expStatus = "Select Company is In-Active, Payroll Run Disabled.";
		Assert.assertEquals(text, expStatus, "Company Status is Active");
		Reporter.log("Company Status is Inactive", true);
		
	}
	
	public void clickEditCompanyBtn(WebDriver driver) throws InterruptedException{
		editCompanyBtn.click();
		//driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		//Thread.sleep(2000);
		//wLib = new WaitStatementLib();
		//wLib.explicitWait(driver, 30, By.id("cboxClose"));
		//Reporter.log("Edit Company popup is displayed", true);
	}
	
	public void verifyPPEditCompanyText(){
		String text = ppEditCompanyPopup.getText();
		String expTxt = "Edit Company";
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	}
	
    public void editCompanyPopup(String payeRegDate, String payeRefNo, String hmrcOffNo, String accountOffRef, 
    		String econ, String cotaxRef, String emailId, String contactPerson, String addLine1, String addLine2, String postCode, WebDriver driver) throws InterruptedException{
  
    	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
    	wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, payeRegDateTxtBx);
    	payeRegDateTxtBx.clear();
    	payeRegDateTxtBx.sendKeys(payeRegDate);
    	payeRefNoTxtBx.clear();
    	payeRefNoTxtBx.sendKeys(payeRefNo);
    	hmrcOffNoTxtBx.clear();
    	hmrcOffNoTxtBx.sendKeys(hmrcOffNo);
    	accOfficeRefTxtBx.clear();
    	accOfficeRefTxtBx.sendKeys(accountOffRef);
    	econTxtBx.clear();
    	econTxtBx.sendKeys(econ);
    	cotaxRefTxtBx.clear();
    	cotaxRefTxtBx.sendKeys(cotaxRef);
    	payeRegDateTxtBx.clear();
    	emailTxtBx.clear();
    	emailTxtBx.sendKeys(emailId);
    	contactPersonTxtBx.clear();
    	contactPersonTxtBx.sendKeys(contactPerson);
    	
    	WebElement payslipTempTxtBx= this.payslipTempTxtBx;
		Select sel =new Select(payslipTempTxtBx);
		sel.selectByVisibleText("Green-template");
		
		passwordProtectPayslipChckBx.click();
		quarterlyPayeSchemeChckBx.click();
		qualifySERChckBx.click();
		
		//payrollSwitchDateTxtBx.sendKeys(payrollSwitchDate);
		
		WebElement monthlyPayDaySelectBx= this.monthlyPayDaySelectBx;
		Select sel2 =new Select(monthlyPayDaySelectBx);
		sel2.selectByValue("30");
		weeklyPayDaySelectBx.clear();
		weeklyPayDaySelectBx.sendKeys("Wednesday");
		fortnightlyPayDaySelectBx.clear();
		fortnightlyPayDaySelectBx.sendKeys("Friday");
		/*WebElement weeklyPayDaySelectBx= this.weeklyPayDaySelectBx;
		Select sel3 =new Select(weeklyPayDaySelectBx);
		sel3.selectByVisibleText("Wednesday");
		
		WebElement fortnightlyPayDaySelectBx= this.fortnightlyPayDaySelectBx;
		Select sel4 =new Select(fortnightlyPayDaySelectBx);
		sel4.selectByVisibleText("Friday");*/
		
		activeChckBx.click();
		addressTxtBx1.clear();
		addressTxtBx1.sendKeys(addLine1);
		addressTxtBx2.clear();
		addressTxtBx2.sendKeys(addLine2);
		postcodeTxtBx.clear();
		postcodeTxtBx.sendKeys(postCode);
		
		saveBtn.click();
		
	}
	
    public void checkRunPayrollBtn(WebDriver driver){
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll"));
		Reporter.log("Run Payroll Button is displayed, Control back to Main Payroll Window", true);
	}    
    public void clickAddEmployeeBtn(WebDriver driver){
    	addEmployeeBtn.click();
    	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
    	wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, By.xpath("//div//header//span[contains(text(),'Add Employee')]"));
    	
		Reporter.log("Add Employee Popup is open",true);
		Reporter.log("Edit Company popup is displayed", true);
	}    
    public void verifyPPAddEmployeeText(){
		String text = ppAddEmployeePopup.getText();
		String expTxt = "Add Employee";
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	}
    public void addFemaleEmployeePopup(WebDriver driver, String firstName, String lastName, String designation, String dob, String addressLn1, 
    	String addressLn2, String addressLn3, String addressLn4, String postcode, String comments, String phone, String empemail, String dirStartDate, String taxCode, 
    	String niNumber, String payId, String netSal, String joiningDate) throws InterruptedException{
    	
		Select sel5 =new Select(titleSelectBx);
		sel5.selectByVisibleText("Mrs.");
				
		firstNameTxtBx.sendKeys(firstName);
		lastNameTxtBx.sendKeys(lastName);
		designationTxtBx.sendKeys(designation);
		
		WebElement genderSelectBx= this.genderSelectBx;
		Select sel6 =new Select(genderSelectBx);
		sel6.selectByVisibleText("Female");
		
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
		
		//wLib.implictWaitForSeconds(driver, 30);
		Thread.sleep(3000);
		WebElement dirStartDateTxtBx = this.dirStartDateTxtBx;
		boolean flag1 = dirStartDateTxtBx.isEnabled();
		
		if (flag1)
		{
			System.out.println("Director Start Date Text Box is enabled");
		}
		
		dirStartDateTxtBx.click();
		//driver.switchTo().alert();
		
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today"));
		Reporter.log("Calender Popup is open", true);
		
		String curDate = calenderCurDate.getText();
		System.out.println(curDate);
		
		calenderTitle.click();
		wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_1"));
		Reporter.log("All the Months Displayed", true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dirStartDateTxtBx.sendKeys(dirStartDate);
		wLib.implictWaitForSeconds(driver, 30);
		dirStartDateLbl.click();
		/*Actions act = new Actions(driver);
		act.moveToElement(JanMonth).perform();
		wLib.explicitWait(driver, 30, By.id("ctl00_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_0"));
		act.click(JanMonth).perform();
		wLib.explicitWait(driver, 30, By.id("ctl00_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_0"));
		//wLib.implictWaitForSeconds(driver, 60);
		JanMonth.click();
		wLib.explicitWait(driver, 40, By.xpath("//div[contains(text(),'January, 2017')]"));
		Reporter.log("Clicked the Month:", true);
		act.moveToElement(pickDate).perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pickDate.click();
		wLib.explicitWait(driver, 40, By.id("ctl00_cPH_tbContainer_tpPayrollEmployee_txtDirectorStartDate"));*/
		Reporter.log("Date Selected", true);
 		taxCodeTxtBx.sendKeys(taxCode);
		niNumberTxtBx.sendKeys(niNumber);
		payIdTxtBx.sendKeys(payId);
		netSalaryTxtBx.sendKeys(netSal);
		calculateGrossBtn.click();
		//wLib.implictWaitForSeconds(driver, 30);
		Thread.sleep(2000);
		//basicSalaryTxtBx.click();
		
		String sal = basicSalaryTxtBx.getAttribute("value");
		@SuppressWarnings("deprecation")
		String basicSal = new Double(sal).toString();
		//double basicSal = Double.parseDouble(sal);
		
		//String basicSal2 = Double.toString(basicSal);
		Reporter.log("Basic Salary is: "+basicSal, true);
		
		joiningDateTxtBx.sendKeys(joiningDate);
		/*PayrollPage3 pp3 = new PayrollPage3(driver);
		pp3.AddEmployeeTerms();
		pp3.AddEmployeeContacts();*/
		saveAddEmployeeBtn.click();
				
    }
    
    
    public void addEmployeePopup(WebDriver driver, String firstName, String lastName, String designation, String dob, String addressLn1, 
    String addressLn2, String addressLn3, String addressLn4, String postcode, String comments, String phone, String empemail, String dirStartDate, String taxCode, 
    String niNumber, String payId, String netSal, String joiningDate) throws InterruptedException{
    	
    	
    	wLib = new WaitStatementLib();
    	wLib.explicitWait(driver, 10,titleSelectBx);
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
		dirStartDateTxtBx.click();
		//driver.switchTo().alert();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_today"));
		Reporter.log("Calender Popup is open", true);
		
		String curDate = calenderCurDate.getText();
		System.out.println(curDate);
		
		calenderTitle.click();
		wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_CalendarExtender2_month_0_1"));
		Reporter.log("All the Months Displayed", true);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		dirStartDateTxtBx.sendKeys(dirStartDate);
		wLib.implictWaitForSeconds(driver, 30);
		dirStartDateLbl.click();
		Reporter.log("Date Selected", true);
		Reporter.log("Selecting NI Calculation method for Director", true);
		tableMethodRadio.click();
		taxCodeTxtBx.sendKeys(taxCode);
		niNumberTxtBx.sendKeys(niNumber);
		payIdTxtBx.sendKeys(payId);	
		netSalaryTxtBx.sendKeys(netSal);
		Thread.sleep(2000);
		calculateGrossBtn.click();
		wLib.implictWaitForSeconds(driver, 30);
		Thread.sleep(5000);
		Reporter.log("Calculate Gross is clicked", true);
		//basicSalaryTxtBx.click();
		String sal = basicSalaryTxtBx.getAttribute("value");
		String basicSal = new Double(sal).toString();
		//double basicSal = Double.parseDouble(sal);
		
		//String basicSal2 = Double.toString(basicSal);
		Reporter.log("Basic Salary is: "+basicSal, true);
		
		joiningDateTxtBx.sendKeys(joiningDate);
		/*PayrollPage3 pp3 = new PayrollPage3(driver);
		pp3.AddEmployeeTerms();
		pp3.AddEmployeeContacts();*/
		saveAddEmployeeBtn.click();
		}
    
    public void verifyCurrentEmployeeMale(WebDriver driver, String empFirstName, String empLastName){
    	
    	String empname = "Mr. "  + empFirstName + " "+ empLastName;
    	Assert.assertEquals(empNameInList.getText(), empname);
    	Reporter.log("Employee name added successfully",true);
    	}
   
public void verifyCurrentEmployeeFemale(WebDriver driver, String empFirstName, String empLastName){
    	
    	String empname = "Mrs. "  + empFirstName + " "+ empLastName;
    	Assert.assertEquals(empNameInList.getText(), empname);
    	Reporter.log("Employee name added successfully",true);
    	} 
    
    public void editEmployee(WebDriver driver, String niNumber, String updateNetSal) throws Exception{
    	
    try {
 		List<WebElement> NINumber = driver.findElements((By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[5]")));
  			for (WebElement ninumb : NINumber){
  				if(ninumb.getText().equalsIgnoreCase(niNumber)){
    					
  					Reporter.log("Trying to match NINumber :"+niNumber,true);
   					WebElement editEmpSettings = driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[5][contains(text(),'"+niNumber+"')]/..//td//a[@class='toggleSettings']"));
   					editEmpSettings.click();
		
   					WebElement editEmpSettings1=driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[5][contains(text(),'"+niNumber+"')]/..//div//a//figure//img[@title='Edit']"));
    					editEmpSettings1.click();

    					driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
    					//break;
    				}
    			}
    		}
    		catch (NoSuchElementException e){
    			Reporter.getCurrentTestResult();
    		}
    		catch (Exception e){
    			
    			Reporter.getCurrentTestResult();
    		}
    String basicSal = basicSalaryTxtBx.getAttribute("value");
	
	Reporter.log("Basic Salary is: "+basicSal, true);
	
    		netSalaryTxtBx.click();
    		netSalaryTxtBx.sendKeys(updateNetSal);
    		calculateGrossBtn.click();
    		Reporter.log("Updated Net Salary Calculates right Basic/Gross Salary: "+basicSalaryTxtBx.getAttribute("value"), true); 
    		Thread.sleep(5000);
    		wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 30, saveAddEmployeeBtn);
    		
    		saveAddEmployeeBtn.click();
    	
    }
    
    public void deleteEmployee(WebDriver driver, String niNumbEmp) throws InterruptedException{
    	
    	try {
    		if(nINumber.getText().equalsIgnoreCase(niNumbEmp))
    		{
    			do {
					System.out.println("Trying to match NINumber :"+niNumbEmp);
					displayRecordLink.click();
					wLib = new WaitStatementLib();
					wLib.implictWaitForSeconds(driver, 30);
					driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[5][contains(text(),'"+niNumbEmp+"')]/..//td//a[@class='toggleSettings']/..//div//a//figure//img[@title='Delete']")).click();
					driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
					Reporter.log("Delete button will be clicked in the popup", true); 
					wLib = new WaitStatementLib();
					wLib.explicitWait(driver, 5, deleteEmpBtn);
					deleteEmpBtn.click();
					}while (nINumber.getText().equalsIgnoreCase(niNumbEmp));
					}
			}
	
		catch (NoSuchElementException e){
			System.out.println(e.getStackTrace());
		}
		catch (Exception e){
			
			System.out.println(e.getStackTrace());
		}
						
		
}
    	
    
 public void clickAddLeavePopupBtn(WebDriver driver) throws InterruptedException{
	 addLeaveBtn.click();
	 Thread.sleep(3000);
	 wLib = new WaitStatementLib();	
	 wLib.implictWaitForSeconds(driver, 30);
    }
    
    
 
 public void selectLeaveType(WebDriver driver, String leaveType){
	 listbox1 =new Select(leaveTypeLstBox);
	 listbox1.selectByValue(leaveType);
	    }
  
 public void verifySMPPopupHeader(WebDriver driver, String employee){
		String text = smpPopupHeading.getText();
		WebElement expTxt = driver.findElement(By.xpath("//span[contains(text(),'Employee:"+employee+"')]"));
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	}
 
 public void verifySPPPopupHeader(WebDriver driver, String employee){
		String text = smpPopupHeading.getText();
		WebElement expTxt = driver.findElement(By.xpath("//span[contains(text(),'Employee:"+           employee+"')]"));
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	}
    
 public void verifyLeaveManagementPopupText(WebDriver driver){
	 	driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));// added by sudhir
		String text = ppAddLeavePopup.getText();
		String expTxt = "Leave Management";
		wLib = new WaitStatementLib();
		 wLib.implictWaitForSeconds(driver, 30);
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	}

 public void addLeaves(WebDriver driver, String empName){
	 
	 listbox1 = new Select(employeeSelectBx);
	 listbox1.selectByVisibleText(empName);
			
 }
 
 public void smpPopup(WebDriver driver, String expDueDate, String actualBirthDate,String weeklyEarning, String leaveStartDate, String numbOfLeaveWeeks){
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 10,workingDayMondayChckBx);
	 WebElement workingDayMondayChckBx = this.workingDayMondayChckBx;
		boolean flag = workingDayMondayChckBx.isSelected();
		
		if (flag)
		{
			System.out.println("Monday is already checked");
		}
		else {
			
			workingDayMondayChckBx.click();
		}
		
		WebElement workingDayTuesdayChckBx = this.workingDayTuesdayChckBx;
		boolean flag2 = workingDayTuesdayChckBx.isSelected();
		
		if (flag2)
		{
			System.out.println("Tuesday is already checked");
		}
		else {
			
			workingDayTuesdayChckBx.click();
		}
		
		WebElement workingDayWednesdayChckBx = this.workingDayWednesdayChckBx;
		boolean flag3 = workingDayWednesdayChckBx.isSelected();
		
		if (flag3)
		{
			System.out.println("Wednesday is already checked");
		}
		else {
			
			workingDayWednesdayChckBx.click();
		}
		
		WebElement workingDayThursdayChckBx = this.workingDayThursdayChckBx;
		boolean flag4 = workingDayThursdayChckBx.isSelected();
		
		if (flag4)
		{
			System.out.println("Thrusday is already checked");
		}
		else {
			
			workingDayThursdayChckBx.click();
		}
		
		
		WebElement workingDayFridayChckBx = this.workingDayFridayChckBx;
		boolean flag5 = workingDayFridayChckBx.isSelected();
		
		if (flag5)
		{
			System.out.println("Friday is already checked");
		}
		else {
			
			workingDayFridayChckBx.click();
		}
		
		expectedDueDateTxtBx.clear();
		expectedDueDateTxtBx.sendKeys(expDueDate);
		expectedDueDateTxtBx.sendKeys(Keys.TAB);
		actualBirthDateTxtBx.clear();
		actualBirthDateTxtBx.sendKeys(actualBirthDate);
		actualBirthDateTxtBx.sendKeys(Keys.TAB);
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, averageWeeklyEarningTxtBx);
		 
		averageWeeklyEarningTxtBx.clear();
		averageWeeklyEarningTxtBx.sendKeys(weeklyEarning);
		String avgWeeklyEarning = averageWeeklyEarningTxtBx.getAttribute("value");
		Reporter.log("Average Weekly Earning is: "+avgWeeklyEarning, true);
		
		leaveStartDateTxtBx.clear();
		leaveStartDateTxtBx.sendKeys(leaveStartDate);
		NoOfWeekTxtBx.clear();
		NoOfWeekTxtBx.sendKeys(numbOfLeaveWeeks);
		leaveEndDateTxtLbl.click();
		
		wLib.implictWaitForSeconds(driver, 30);
		
		String leaveED  = leaveEndDateTxtBx.getAttribute("value");
		Reporter.log("Leave End Date is: "+leaveED, true);
		wLib.implictWaitForSeconds(driver, 30);
						
		//saveLeaveBtn.click();
		wLib.explicitWait(driver, 30, saveLeaveBtn);
		saveLeaveBtn.click();
 }
 
 public void sppPopup(WebDriver driver, String actualBirthDate,String  weeklyEarning, String leaveStartDate, String numbOfLeaveWeeks) throws InterruptedException{
	 
	 
	 WebElement workingDayMondayChckBx = this.workingDayMondayChckBx;
		boolean flag = workingDayMondayChckBx.isSelected();
		
		if (flag)
		{
			System.out.println("Monday is already checked");
		}
		else {
			
			workingDayMondayChckBx.click();
		}
		
		WebElement workingDayTuesdayChckBx = this.workingDayTuesdayChckBx;
		boolean flag2 = workingDayTuesdayChckBx.isSelected();
		
		if (flag2)
		{
			System.out.println("Tuesday is already checked");
		}
		else {
			
			workingDayTuesdayChckBx.click();
		}
		
		WebElement workingDayWednesdayChckBx = this.workingDayWednesdayChckBx;
		boolean flag3 = workingDayWednesdayChckBx.isSelected();
		
		if (flag3)
		{
			System.out.println("Wednesday is already checked");
		}
		else {
			
			workingDayWednesdayChckBx.click();
		}
		
		WebElement workingDayThursdayChckBx = this.workingDayThursdayChckBx;
		boolean flag4 = workingDayThursdayChckBx.isSelected();
		
		if (flag4)
		{
			System.out.println("Thrusday is already checked");
		}
		else {
			
			workingDayThursdayChckBx.click();
		}
		
		
		WebElement workingDayFridayChckBx = this.workingDayFridayChckBx;
		boolean flag5 = workingDayFridayChckBx.isSelected();
		
		if (flag5)
		{
			System.out.println("Friday is already checked");
		}
		else {
			
			workingDayFridayChckBx.click();
		}
			
		
		actualBirthDatePaternityTxtBx.clear();
		actualBirthDatePaternityTxtBx.sendKeys(actualBirthDate);
		actualBirthDatePaternityTxtBx.sendKeys(Keys.TAB);
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, averageWeeklyEarningPaternityTxtBx);
		averageWeeklyEarningPaternityTxtBx.clear();
		averageWeeklyEarningPaternityTxtBx.sendKeys(weeklyEarning);
		
		paternityLeaveStartDateTxtBx.clear();
		paternityLeaveStartDateTxtBx.sendKeys(leaveStartDate);
		numbOfLeaveWeeksTxtBx.clear();
		numbOfLeaveWeeksTxtBx.sendKeys(numbOfLeaveWeeks);
		Thread.sleep(2000);
		//leaveEndDateTxtLbl.click();
		wLib.explicitWait(driver, 30, leaveEndDatePaternityTxtBx);
		
		String leaveED  = leaveEndDatePaternityTxtBx.getAttribute("value");
		Reporter.log("Leave End Date is: "+leaveED, true);
		wLib.explicitWait(driver, 30, saveLeaveBtn);
		saveLeaveBtn.click();
		try
		{
		if (cancelSMPLeaveBtn.isDisplayed()==true)
		{
		do
		{
			saveLeaveBtn.click();
			}while(cancelSMPLeaveBtn.isDisplayed()==true);
		}
		}catch (Exception e) {
		Reporter.log("Save button clicked in first time only",true);
		}
		
 }
public void sspPopup(WebDriver driver, String leaveStartDate,String leaveEndDate, String weeklyEarning) throws InterruptedException{
	 
	 
	 WebElement workingDayMondayChckBx = this.workingDayMondayChckBx;
		boolean flag = workingDayMondayChckBx.isSelected();
		
		if (flag)
		{
			System.out.println("Monday is already checked");
		}
		else {
			
			workingDayMondayChckBx.click();
		}
		
		WebElement workingDayTuesdayChckBx = this.workingDayTuesdayChckBx;
		boolean flag2 = workingDayTuesdayChckBx.isSelected();
		
		if (flag2)
		{
			System.out.println("Tuesday is already checked");
		}
		else {
			
			workingDayTuesdayChckBx.click();
		}
		
		WebElement workingDayWednesdayChckBx = this.workingDayWednesdayChckBx;
		boolean flag3 = workingDayWednesdayChckBx.isSelected();
		
		if (flag3)
		{
			System.out.println("Wednesday is already checked");
		}
		else {
			
			workingDayWednesdayChckBx.click();
		}
		
		WebElement workingDayThursdayChckBx = this.workingDayThursdayChckBx;
		boolean flag4 = workingDayThursdayChckBx.isSelected();
		
		if (flag4)
		{
			System.out.println("Thrusday is already checked");
		}
		else {
			
			workingDayThursdayChckBx.click();
		}
		
		
		WebElement workingDayFridayChckBx = this.workingDayFridayChckBx;
		boolean flag5 = workingDayFridayChckBx.isSelected();
		
		if (flag5)
		{
			System.out.println("Friday is already checked");
		}
		else {
			
			workingDayFridayChckBx.click();
		}
				
		sickleaveStartDateTxtBx.clear();
		sickleaveStartDateTxtBx.sendKeys(leaveStartDate);
		sickleaveStartDateTxtBx.sendKeys(Keys.TAB);
		sickLeaveEndDateTxtBx.clear();
		sickLeaveEndDateTxtBx.sendKeys(leaveEndDate);
		sickLeaveEndDateTxtBx.sendKeys(Keys.TAB);
		String numbOfLeaveWeeks = NoOfWeekSickTxtBx.getAttribute("value");
		Reporter.log("No of weeks we took leave: "+numbOfLeaveWeeks,true);	
		AWESickTxtBx.clear();
		AWESickTxtBx.sendKeys(weeklyEarning);
		wLib.explicitWait(driver, 30, saveLeaveBtn);
		saveLeaveBtn.click();
		try
		{
		if (cancelSMPLeaveBtn.isDisplayed()==true)
		{
		do
		{
			saveLeaveBtn.click();
			}while(cancelSMPLeaveBtn.isDisplayed()==true);
		}
		}catch (Exception e) {
		Reporter.log("Save button clicked in first time only",true);
		}
		
 }
 
 public void verifyEmployeesLeave(WebDriver driver){
	 driver.navigate().refresh();		
	 String name = empLeaveEmpName.getText();
 			Reporter.log(name,true);
 	 	
 }
  
 public void editSMPPopup(WebDriver driver, String numbOfLeaveWeeks2, String numbOfLeaveWeeks3) throws InterruptedException
 {
	 if (smpLeaveSettingsList.isEmpty())
		
		{
			Reporter.log("No records exists for SMP leaves", true);
			
		}	 
	else	
		{
			smpLeaveSettings.click();
			editSMPLeave.click();
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
			wLib = new WaitStatementLib();	
			wLib.implictWaitForSeconds(driver, 30);
			String message = smpMessage.getText();
			Reporter.log(" Qualify Message: "+message, true);
			
			if(Integer.parseInt(numbOfLeaveWeeks3)>52)
			{				
				NoOfWeekTxtBx.clear();
				NoOfWeekTxtBx.sendKeys(numbOfLeaveWeeks3);
				leaveEndDateTxtLbl.click();
				 			 
				String leaveED  = leaveEndDateTxtBx.getAttribute("value");
				Reporter.log("Leave End Date Changed: "+leaveED, true);
					
				String maternityPW = maternityPayWeeksTxtBx.getAttribute("value2");
				Reporter.log(" Maternity Pay Weeks Changed: "+maternityPW, true);
									
				saveLeaveBtn.click();
				Reporter.log("Maximum Statutory Maternity leave can only be 52 weeks.", true);
			}
			
			NoOfWeekTxtBx.clear();
			NoOfWeekTxtBx.sendKeys(numbOfLeaveWeeks2);
			leaveEndDateTxtLbl.click();
			 			 
			String leaveED  = leaveEndDateTxtBx.getAttribute("value");
			Reporter.log("Leave End Date Changed: "+leaveED, true);
				
			String maternityPW = maternityPayWeeksTxtBx.getAttribute("value2");
			Reporter.log(" Maternity Pay Weeks Changed: "+maternityPW, true);
			saveLeaveBtn.click();
			Reporter.log("SMP Leaves updated successfully", true);
		 }

 }

 public void editSPPPopup(WebDriver driver, String numbOfLeaveWeeks2, String numbOfLeaveWeeks3) throws InterruptedException
 {
	 if (sppLeaveSettingsList.isEmpty())		
		{
			Reporter.log("No records exists for SPP leaves", true);			
		}		 
	else	
		{
			sppLeaveSettings.click();
			editSPPLeave.click();
		//	Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		//	wLib = new WaitStatementLib();	
		//	wLib.implictWaitForSeconds(driver, 30);
			String message = sppMessage.getText();
			Reporter.log(" Qualify Message: "+message, true);
			 			
			if(Integer.parseInt(numbOfLeaveWeeks2)>2)
			{
				numbOfLeaveWeeksTxtBx.clear();
				numbOfLeaveWeeksTxtBx.sendKeys(numbOfLeaveWeeks2);
				leaveEndDateTxtLbl.click();
			 				 
				String leaveED  = leaveEndDatePaternityTxtBx.getAttribute("value");
				Reporter.log("Leave End Date Changed: "+leaveED, true);
										
				saveLeaveBtn.click();	
				Reporter.log("Statutory Parental Pay can only be 1 or 2 weeks.", true);
			}
			numbOfLeaveWeeksTxtBx.clear();
			numbOfLeaveWeeksTxtBx.sendKeys(numbOfLeaveWeeks3);
			leaveEndDateTxtLbl.click();
			 
			String leaveED  = leaveEndDatePaternityTxtBx.getAttribute("value");
			Reporter.log("Leave End Date Changed: "+leaveED, true);
		
			saveLeaveBtn.click();
			Reporter.log("SPP Leaves updated successfully", true);
		 }

 }
  
 public void deleteSMPLeaves(WebDriver driver) throws InterruptedException
 {
	 if (smpLeaveSettingsList.isEmpty())
	
	{
		Reporter.log("No records exists for SMP leaves", true);
		
	}		 
	else	
	{
		 smpLeaveSettings.click();
		 deleteSMPLeave.click();
		// Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		 deleteLeaveBtn.click();
		 Reporter.log("SMP Leaves deleted successfully", true);
	 }
	
 }
 
 public void deleteSPPLeaves(WebDriver driver) throws InterruptedException
 {
	 
	if (sppLeaveSettingsList.isEmpty())
	{
		Reporter.log("No records exists for SPP leaves", true);	
		
	}
		 
	else	
	{
		 sppLeaveSettings.click();
		 deleteSPPLeave.click();
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		 deleteLeaveBtn.click();
		 Reporter.log("SPP Leaves deleted successfully", true);
	 }
}
 public void deleteSSPLeaves(WebDriver driver) throws InterruptedException
 {
	 
	if (sspLeaveSettingsList.isEmpty())
	{
		Reporter.log("No records exists for SPP leaves", true);	
		
	}
		 
	else	
	{
		 sspLeaveSettings.click();
		 deleteSSPLeave.click();
		 Thread.sleep(2000);
		 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		 deleteLeaveBtn.click();
		 Reporter.log("SSP Leaves deleted successfully", true);
	 }
}
 public void autoEnrolPayrollCompany(WebDriver driver, String stagingDate, String complainceDate, String signatoryName, String signatoryTitle,String signatoryEmail, String contactNumber, String employerID) throws InterruptedException{
	 
	 WebElement autoEnrolIMG = this.autoEnrolIMG;
		boolean flag = autoEnrolIMG.isDisplayed();
		
		if (flag)
		{
			Reporter.log("Auto Enrolment is disabled",true);
		}
		else {
			
			Reporter.log("Auto Enrolment is already enabled",true);
		}
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 30, autoEnrolmentLnk);
		autoEnrolmentLnk.click();
	 Reporter.log("Automatic Enrolment is clicked", true);
	 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 wLib.explicitWait(driver, 30, stagingDateTxtBx);
	 stagingDateTxtBx.clear();
	 stagingDateTxtBx.sendKeys(stagingDate);
	 complianceDateTxtBx.clear();
	 complianceDateTxtBx.sendKeys(complainceDate);
	 String cyclicalEnrolDate = nextCyclicalEnrolDateTxtBx.getText();
	 Reporter.log(" Next Cyclical Enrol Date is: "+cyclicalEnrolDate, true);
	 wLib.explicitWait(driver, 30, autoEnrolSaveBtn);
	 signatoryNameTxtBx.clear();
	 signatoryNameTxtBx.sendKeys(signatoryName);
	 signatoryTitleTxtBx.clear();
	 signatoryTitleTxtBx.sendKeys(signatoryTitle);
	 signatoryEmailTxtBx.clear();
	 signatoryEmailTxtBx.sendKeys(signatoryEmail);
	 contactNumberTxtBx.clear();
	 contactNumberTxtBx.sendKeys(contactNumber);
	 pSEmployerIDTxtBx.clear();
	 pSEmployerIDTxtBx.sendKeys(employerID);
	 autoEnrolSaveBtn.click();
	 
 }
 
 public void empAllowance(WebDriver driver, String empNIAllowance) throws InterruptedException{
	 
//WebElement empAllowanceDisabledIMG = this.empAllowanceDisabledIMG;
//WebElement empAllowanceEnabledIMG = this.empAllowanceEnabledIMG;
//WebElement flag1 = empAllowanceDisabledIMG;
//WebElement flag2 = empAllowanceEnabledIMG;
//while (flag1.isDisplayed()){
 if (empAllowanceDisabledIMG.size()>0)
     {
			System.out.println("Employee Allowance is disabled");
			employerAllowanceLnk.click();
			Thread.sleep(2000);
			 wLib = new WaitStatementLib();
			 wLib.implictWaitForSeconds(driver, 30);
			 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
			 
			 Thread.sleep(2000);
		 
			 String text = empAllowancePopupTitle.getText();
				String expTxt = "Enable Employee Allowance";
				Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
				Reporter.log("Popup Text is verified successfully", true);
			 
			 empNIAllowanceTxtBx.clear();
			 empNIAllowanceTxtBx.sendKeys(empNIAllowance);
			 empAllowanceSaveBtn.click();
			 		 
			 empAllowanceEnabledIMG.isDisplayed();
			 Reporter.log("Employee Allowance Enabled", true);
			 
     }
       
			 else
			 {
				System.out.println("Employee Allowance is already enabled");
				empAllowanceEnabledIMG.click();
				Reporter.log("Employee Allowance Disabled again as First Payroll is not Run", true);
		
			 }

		
		 
 }
 
 public void lnkWithAccounts(WebDriver driver, String lnkWithAccount) throws InterruptedException{
	 
	 WebElement lnkWithAccountsEnabledIMG = this.lnkWithAccountsEnabledIMG;
		boolean flag = lnkWithAccountsEnabledIMG.isDisplayed();
		
		if (flag)
		{
			System.out.println("Linked with Accounts is already enabled");
		}
		else {
			
			System.out.println("Linked with Accounts is disabled");
		}
	 
		linkWithAccountsLnk.click();
		
		wLib = new WaitStatementLib();
		wLib.implictWaitForSeconds(driver, 30);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Thread.sleep(2000);
		String text = lnkWithAccountsPopupTitle.getText();
		String expTxt = "Link with Accounts";
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
		 
		clickHereForAdvMapping.click();
			
		WebElement lnkWithAccountsDrpDwnBx= this.lnkWithAccountsDrpDwnBx;
		Select sel7 =new Select(lnkWithAccountsDrpDwnBx);
		//sel6.selectByVisibleText("<name>");
			
		sel7.selectByVisibleText(lnkWithAccount);
		Thread.sleep(2000);	
		lnkWithAccountSaveBtn.click();
		wLib.implictWaitForSeconds(driver, 30);
		Reporter.log("Employee Mapped with Accounts", true);
 }
 
 
 public void deRegisterCompany(WebDriver driver) throws InterruptedException{
	 
	 //WebElement deRegisterationDisabledIMG = this.deRegisterationDisabledIMG;
		//boolean flag = deRegisterationDisabledIMG.isDisplayed();
		
		if (deRegisterationDisabledIMGlst.size()==0)
		{
			System.out.println("DeRegisteration Link disabled");
		}
		else {
			
			System.out.println("DeRegisteration Link is already enabled");
		}
	 
		
		deRegisterCompanyLnk.click();
		
		// wLib = new WaitStatementLib();
		// wLib.implictWaitForSeconds(driver, 30);
		 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		
		// Thread.sleep(2000);
		 String text = deregisterationPopupTitle.getText();
			String expTxt = "Edit De-registration";
			Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
			Reporter.log("Popup Text is verified successfully", true);
			
			 String deRegistrationDate  = deRegisterationDateTxtBx.getAttribute("value");
				Reporter.log("DeRegistration Date by Default is: "+deRegistrationDate, true);
			//	wLib.implictWaitForSeconds(driver, 30);
		
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String curDate = dateFormat.format(date);
			System.out.println("Today's Date is: "+curDate);
			
			
			
//			Assert.assertEquals(curDate, deRegistrationDate, "DeRegistration Date is not Current Date by Default");
//			Reporter.log("DeRegistration Date is Current Date by Default", true);
			
			String text2 = P45FormError.getText();
			String expTxt2 = "Error!";
			Assert.assertEquals(text2, expTxt2, "Error Message  is not verified");
			Reporter.log("P45 form to all company employees have not been issued", true);
			Reporter.log("Oops !!! It seems previous payrolls are pending.Please run all pending payrolls", true);
			
			deRegisterationDateTxtBx.clear();
			
			Calendar now = Calendar.getInstance();
			now.add(Calendar.DATE, +10);
			now.add(Calendar.MONTH,+2);
			String FutureDate =(now.get(Calendar.DATE) + "/" +now.get(Calendar.MONTH) + "/" +  now.get(Calendar.YEAR));
			Reporter.log("Future Date to be Set is : "+FutureDate,true);
			deRegisterationDateTxtBx.sendKeys(FutureDate);
			deRegisterationDateTxtBx.sendKeys(Keys.TAB);
			String deRegistrationDate2  = deRegisterationDateTxtBx.getAttribute("value");
			Reporter.log("DeRegistration Date Changed to: "+deRegistrationDate2, true);
		//	wLib.implictWaitForSeconds(driver, 30);
			
			
			String text3 = P45FormError.getText();
			String expTxt3 = "Error!";
			Assert.assertEquals(text3, expTxt3, "Error Message  is not verified");
			Reporter.log("De-registration date can’t be future date ", true);
			Thread.sleep(5000);
		//	Thread.sleep(2000);
			deRegisterationCancelBtn.click();
			
 }
 
 public void runPayroll(WebDriver driver, String EPDate){
	 
	 String PayDate = payDate.getText();
	 System.out.println("Start Pay Date is: "+PayDate);
	 String endPayDate = "30 Nov 2017";
	 
	 Date startDate = new Date();
	 Date endDate = new Date();
	 
	 Date startDate2 = new Date();
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
     try
     {
    	 startDate = simpleDateFormat.parse(PayDate);
         endDate = simpleDateFormat.parse(endPayDate);
         System.out.println("dateStart : "+simpleDateFormat.format(startDate));
         System.out.println("dateEnd : "+simpleDateFormat.format(endDate));
     }
     catch (ParseException ex)
     {
         System.out.println("Exception "+ex);
     }
     	 	 
		//while (true)
     	//while (!payDate.getText().contains ("NOT SCHEDULED"))
		if (!payDate.getText().contains ("NOT SCHEDULED"))
		{
			runPayrollBttn.click();
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline"));
			Reporter.log("Run Payroll screen is displayed", true);
			Reporter.log(startDate + "  "+ endDate, true);
			runPayrollScreenBtn.click();
			 
			String PayDate2 =  payDate.getText();
			System.out.println("Next Pay Date is: "+PayDate2);
			SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
	
			 try
			 {
				 startDate2 = simpleDateFormat2.parse(PayDate2);
				 System.out.println("dateStart2 : "+simpleDateFormat2.format(startDate2));
				 startDate = startDate2;
			 }
			 catch (ParseException ex)
		     {
		         System.out.println("Exception "+ex);
		     }
			 if (startDate != endDate)
			 {
				 Reporter.log(startDate + "  "+ endDate, true);
				// continue;
			 }
			 //System.out.println("Last Payroll Run Successully");
			 else 
			 {
				 System.out.println(startDate + "  "+ endDate);
				// break;
			 }	
			
		}
		else
		{
			Reporter.log("Unable to run Payroll", true);
		}
	
 }
	 

 public void undoRunPayrollAccept (WebDriver driver){
	 
	 String PayDate = payDate.getText();
	 System.out.println("Undo Payroll Date: "+PayDate);
	 String endUndoPayDate = "30 Sep 2017";
	 
	 Date startDate = new Date();
	 Date endDate = new Date();
	 
	 Date startDate2 = new Date();
     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
     try
     {
    	 startDate = simpleDateFormat.parse(PayDate);
         endDate = simpleDateFormat.parse(endUndoPayDate);
         System.out.println("dateStart : "+simpleDateFormat.format(startDate));
         System.out.println("dateEnd : "+simpleDateFormat.format(endDate));
     }
     catch (ParseException ex)
     {
         System.out.println("Exception "+ex);
     }
	 
     //while (true)
     if (true)
    	 //startDate!=endDate
     {
		
		try{
			undoPayroll.click();
		}
		catch (UnhandledAlertException ae)
		{
			ae.printStackTrace();
			System.out.println("Exception "+ae);
		}
		try
		{
		    wLib = new WaitStatementLib();
		    wLib.implictWaitForSeconds(driver, 30);
		    Alert alt=driver.switchTo().alert();
			String alertText = alt.getText();
			System.out.println(alertText);
			//wLib.implictWaitForSeconds(driver, 30);
			alt.accept();
			//alt.dismiss();
			Thread.sleep(3000);
			//wLib.explicitWait(driver, 30, By.id("ctl00_ctl00_ParentContent_cPHFilter_btnRunPayroll"));
			Reporter.log("Control back on Run Payroll page", true);	
		}
		catch (NoAlertPresentException e) {
	        e.printStackTrace();
	    }
		
		catch (Throwable t)
		{
			t.printStackTrace();
			System.out.println("Exception "+t);
		}
		
		
		String PayDate2 =  payDate.getText();
		 System.out.println("Next Undo Payroll Date: "+PayDate2);
		 SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");

		 try
		 {
		 startDate2 = simpleDateFormat2.parse(PayDate2);
		 System.out.println("dateStart2 : "+simpleDateFormat2.format(startDate2));
		 startDate = startDate2;
		 }
		 catch (ParseException ex)
	     {
	         System.out.println("Exception "+ex);
	     }
		 if (startDate != endDate){
			 Reporter.log(startDate + "  "+ endDate, true);
			 //break;
		 }
		 //System.out.println("Last Payroll Run Successully");
		 else {
			 showPayDate.click();
			 System.out.println(startDate + "  "+ endDate);
			 //break;
		 }
		 
	 }
     
  }
 
 
 public void undoRunPayrollDismiss (WebDriver driver){
	 
	    undoPayroll.click();
		Alert alt=driver.switchTo().alert();
	    alt.dismiss();

}
 
 public void checkEmailPayslips(WebDriver driver) throws InterruptedException
 {
 		//Thread.sleep(2000);
	 	runPayrollBtn.click();
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 20, By.id("ctl00_ctl00_ParentContent_cpHFooter_btnSubmitOnline"));
		Reporter.log("Run Payroll Button is displayed, Control back to Main Payroll Window", true);
		rdBtn1.click();
		rdBtn2.click();
		rdBtn3.click();
		emailPayslipBtn.click();
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	//	Thread.sleep(2000);
		emailTxt.sendKeys(emailUser);
		emailSend.click();
		//cancelBtn.click();
 }
 
 public void editEmployeePayDetails(WebDriver driver) throws InterruptedException
 {
	 employeeLnk.click();
	 editPaydetailsBtn.click();
	 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 //Thread.sleep(2000);
	 //netPaytextBx.clear();
	 netPaytextBx.sendKeys("1500");
	 calGrossBtn.click();
	// Thread.sleep(2000);
	 WebElement addtionSel= this.addtionSel;
	// Select sel =new Select(addtionSel);
	// sel.selectByVisibleText("2 Meal Rate £10");
	 descrTxtBx.clear();
	 amntTxtBx.clear();
	 descrTxtBx.sendKeys("Test");
	 amntTxtBx.sendKeys("1200");
	 WebElement applyonSel= this.applyonSel;
	 Select sel1 =new Select(applyonSel);
	 sel1.selectByVisibleText("Net");
	 cmntsTxtBx.sendKeys("Testing");
	 saveBtn.click();	 
 }
 
 public void employeeOpeningbalances(WebDriver driver)
 {
	 employeeLnk.click();
	 openBalBtn.click();
	 taxCode.sendKeys("");
	 grossPay.sendKeys("");
	 employeeNI.sendKeys("");
	 netPay.sendKeys("");
	 ELtoPT.sendKeys("");
	 PTtoUEL.sendKeys("");
	 emplePension.sendKeys("");
	 WebElement NIcategory= this.NIcategory;
	 Select sel =new Select(NIcategory);
	 sel.selectByVisibleText("A");
	 taxDed.sendKeys("");
	 empNI.sendKeys("");
	 LEL.sendKeys("");
	 PTtoUAP.sendKeys("");
	 stdLoan1.sendKeys("");
	 stdLoan2.sendKeys("");
	 emplerPension.sendKeys("");
 }

 public void EditAutoEnrollDetails(String Scheme, String PostpnementStartDate,String PostponementEndDate, String EnrollmentDate, String Optoutdate,String Optindate, String Schemeleftdate, WebDriver driver)
 {
	 employeeLnk.click();
	 editEmpDetails.click();
	 autoEnrolTab.click();
	 WebElement workerType= this.workerType;
	 Select sel =new Select(workerType);
	 sel.selectByVisibleText("Eligible JobHolder");
	 WebElement status= this.status;
	 Select sel1 =new Select(status);
	 sel1.selectByVisibleText("Auto Enrolled");
	 WebElement workersGroup= this.workersGroup;
	 Select sel2 =new Select(workersGroup);
	 sel2.selectByVisibleText("Select");
	 scheme.sendKeys(Scheme);
	 pstpnmntStrtDate.sendKeys(PostpnementStartDate);
	 pstpnmntEndDate.sendKeys(PostponementEndDate);
	 enrolmntDate.sendKeys(EnrollmentDate);
	 optoutDate.sendKeys(Optoutdate);
	 optinDate.sendKeys(Optindate);
	 schmeLftDate.sendKeys(Schemeleftdate);
	 alrdyEnrol.click();
	 transition.click();
	 inscopeIE.click();
	 salExchnge.click();
	 sendEmail.click();
	 saveBtn.click();
	 goBack.click();
 }

 public void SearchEmployee(WebDriver driver)
 {
	 WebElement empStatus= this.empStatus;
	 Select sel =new Select(empStatus);
	 sel.selectByVisibleText("All Employees");
	 nameTxtBx.sendKeys("Preetam Kaur, Mr.");
	 searchBtn.click(); 
	 empSettings.click();
	// editIcon.click();
	 deleteIcon.click();
	 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 cancelBtn.click();
 }
 
 public void AgentPayrollDashboard(WebDriver driver)
 {
	 
 }

 
 public void hmrcAdjustments(WebDriver driver, String hmrcAdjustmentApr) throws InterruptedException 
 {
	 hmrcAdjustmentsBtn.click();
	// Thread.sleep(2000);
	 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
	 
	 String text = hmrcAdjustmentsPopupHeader.getText();
		String expTxt = "Set HMRC Over Payment Month Wise";
		Assert.assertEquals(text, expTxt, "Popup Text  is not verified");
		Reporter.log("Popup Text is verified successfully", true);
	 if (aprilMonthInput.isEnabled())
	 {	
		aprilMonthInput.clear();
		aprilMonthInput.sendKeys(hmrcAdjustmentApr);
		//savehmrcAdjusmentBtn.click();
	 }
	 else if (mayMonthInput.isEnabled())
	 {
		 mayMonthInput.clear();
		 mayMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (junMonthInput.isEnabled())
	 {
		 junMonthInput.clear();
		 junMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (julMonthInput.isEnabled())
	 {
		 julMonthInput.clear();
		 julMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (augMonthInput.isEnabled())
	 {
		 augMonthInput.clear();
		 augMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (sepMonthInput.isEnabled())
	 {
		 sepMonthInput.clear();
		 sepMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (octMonthInput.isEnabled())
	 {
		 octMonthInput.clear();
		 octMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (novMonthInput.isEnabled())
	 {
		 novMonthInput.clear();
		 novMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (decMonthInput.isEnabled())
	 {
		 decMonthInput.clear();
		 decMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (janMonthInput.isEnabled())
	 {
		 janMonthInput.clear();
		 janMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (febMonthInput.isEnabled())
	 {
		 febMonthInput.clear();
		 febMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
	 else if (marMonthInput.isEnabled())
	 {
		 marMonthInput.clear();
		 marMonthInput.sendKeys(hmrcAdjustmentApr); 
	 }
		//Reporter.log("HMRC Adjustments for Previous Months Saved Successfully", true);
	 
	  savehmrcAdjusmentBtn.click();
	 
 }
 
}

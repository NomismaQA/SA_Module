package com.nomisma.BusinessPom;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.google.gson.annotations.Until;
import com.nomisma.SelfAssessmentpom.LibSA;
import com.nomisma.generic.WaitStatementLib;
import com.nomisma.pom.CISPage;
//import com.sun.tools.javac.util.JCDiagnostic.Error;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import java.util.Random;
public class BusinessPom {
	@FindBy (xpath="//span[contains(text(),'Businesses')]")
    public WebElement businessLink;
	@FindBy (xpath="//li[@class='header_add_btn dropdown']/a/img[@alt='header_ico']")
	private WebElement addButtonIcon;
	@FindBy (xpath="//ul[@class='dropdown-menu add__popup']/li[1]/a/p[contains(.,'Add Business')]")
	private WebElement addBusinessBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnLimitedCompany")
	private WebElement limitedCompanyLink;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_ltBussinessName")
	public WebElement AddBusinessManually;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtCompanyName")
	public WebElement bussinessName;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtRegNo")
	public WebElement registrationNumber;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtUTRNo_LLP")
	public WebElement UTRNo_LLP;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtCRegDate")
	public WebElement registrationOrBusinessDate;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtFirstName1")
	public WebElement firstName;	
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtLastName1")
	public WebElement lastName;	
	@FindBy (xpath="//span[contains(text(),'Designated Member 2')]")
	private WebElement lblDesignatedMember2;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtFirstName2")
	private WebElement firstNameMember2;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_txtLastName2")
	private WebElement lastNameMember2;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_chkIsEmployee")
	private WebElement isEmployeechkBox;
	@FindBy(id="ctl00_ctl00_ParentContent_cPH_btnSave")
	private WebElement SaveButtonBusiness;
	@FindBy(id="ctl00_cPH_lnkContinueStep")
	private WebElement continueBtn;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_btnCancel")
	private WebElement cancelBtn;
	@FindBy(id="ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany")
	private WebElement SearchCompany;
	@FindBy(id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement SearchButton;
	@FindBy(xpath="//tr[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany']/td[1]")
	public WebElement CompanyClick;
	@FindBy(id="cboxClose")
	private WebElement popUpClose;
	//Business-> Income
	@FindBy(xpath="//span[contains(text(),'Income')]")
	public WebElement linkIncomeBK;
	@FindBy(xpath="//div[@id='ctl00_divMainContent']/header/div[1]/div[2]")
	public WebElement plusButtonBK;
	@FindBy(id="ctl00_cpHeaderRight_btnAdd")
	public WebElement linkAddBtn;
	@FindBy(id="ctl00_cPH_ddlCustomer")
	public WebElement SelectCustomer; 
	@FindBy(xpath="//div[@id='ctl00_cPH_Headerpnl']/div/div/div/div/a[@id='modal']/p")
	public WebElement addBtn;
	@FindBy(id="txtNewCustomer")
	public WebElement newCustTxtBox;
	@FindBy(xpath="//a[contains(text(),'Save')]")
	public WebElement addNewBtn; 
	@FindBy(id="ctl00_cPH_txtInvoiceNo")
	public WebElement serialNoTxtBox;
	@FindBy(id="ctl00_cPH_ddDepartment")
	public WebElement departmentLstBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ddProduct")
	public WebElement incomeTypeLstBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_txtDescription")
	public WebElement descriptionTxtBox;
	@FindBy(xpath="//input[@id='ctl00_cPH_rptrProduct_ctl00_txtUnitPrice']")
	public WebElement unitPriceTxtBox;
	@FindBy(xpath="//input[@id='ctl00_cPH_rptrProduct_ctl00_txtQuantity']")
	public WebElement quantityTxtBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ddVATRate")
	public WebElement vatRateTypeLstBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ltVATRate")
	public WebElement vATRateTxtBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ltVATAmount")
	public WebElement vATAmountTxtBox;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl01_ltVATAmount")
	public WebElement vATAmountTxtBox1;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ltAmount")
	public WebElement amountTxtBox;
	@FindBy(id="ctl00_cPH_ddBank")
	public WebElement Bank;
	@FindBy(id="ctl00_cphFooter_btnSave")
	public WebElement saveBtn;
	@FindBy(id="ctl00_cPH_btnSave")
	public WebElement saveBtn1;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/strong")
	public WebElement successMsg;
	@FindBy (xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete']/figure/img")
	public WebElement delBtn;
	@FindBy(id="ctl00_cphFooter_btnDelete")
	public WebElement confirmDelBtn;
	@FindBy(xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol1']/a")
	public WebElement clickRecordInvoice;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[3]")
	public WebElement creditValueInvoice;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[1]/a")
	private WebElement linkExpenseType;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[3]")
	private WebElement creditValueVat;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[1]/a")
	private WebElement linkInputVATVat;
	@FindBy (id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkView")
	private WebElement transNameLinkTransaction;
	@FindBy (id="ctl00_cPH_rptrDisplayRecords_ctl01_lnkView")
	private WebElement outputVatLink;
	@FindBy (id="ctl00_cPH_rptrDisplayRecords_ctl02_lnkView")
	private WebElement incomeTypeLink;
	@FindBy (xpath="//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[1]/td[2]")
	private WebElement debitInvoice;
	@FindBy (id="aspnetForm")
	private WebElement form1;
	@FindBy (xpath="//tr/td[contains(text(),'Closing Balance')]//..//td[6]")
	private WebElement ledgerDebit;
	@FindBy (xpath="//tr/td[contains(text(),'Closing Balance')]//..//td[8]")
	private WebElement ledgerCredit;
	@FindBy (xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl02_trFooter']/td[7]")
	private WebElement ledgerBalance;
	@FindBy (xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl02_trFooter']/td[5]")
	private WebElement ledgerDebit1;
	@FindBy (xpath="//span[contains(text(),'Settings')]")
	private WebElement linkSettings;
	@FindBy (xpath="//ul[@id='ctl00_SideMenu1_AccountMenu']/li/ul/li/a[contains(text(),'Customer Detail')]")
	private WebElement linkCustomerDetails;
	@FindBy (id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete")
	public WebElement delRecord;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/thead/tr/th[1]/input")
	private WebElement selectAllDelChkBox;
	@FindBy(id="ctl00_cpHeaderRight_btnDeleteAllCustomer")
	private WebElement deleteAllCustomerBtn;
	@FindBy (xpath="//span[contains(text(),'Expenses')]")
	private WebElement linkExpenses;
	//@FindBy(id="ctl00_cpHeaderRight_btnAdd")
	//private WebElement addSupplierBill;
	@FindBy(id="txtNewSupplier")
	private WebElement addSupplierTxtBox;
	@FindBy(id="ctl00_cPH_txtBillNo")
	private WebElement BillNo;
	@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ddExpenseHead")
	private WebElement Expensetype;
	@FindBy (xpath="//ul[@id='ctl00_SideMenu1_AccountMenu']/li/ul/li/a[contains(text(),'Supplier')]")
	private WebElement linkSupplier;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl01_lnkDelete")
	private WebElement delSupplierBtn;
	@FindBy(id="ctl00_cpHeaderRight_btnDeleteAllSupp")
	private WebElement delAllSupplierBtn;
	@FindBy(xpath="//div[@id='ctl00_divMainContent']/div/div/table/tbody/tr/td/a")
	private WebElement transactionNoSupplierBill;
	@FindBy(xpath="//tr/td[contains(text(),'Closing Balance')]//..//td[7]")
	private WebElement closingBalanceCredit;
	@FindBy(xpath="//tr/td[contains(text(),'Closing Balance')]//..//td[5]")
	private WebElement closingBalanceDebit;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[2]")
	private WebElement debitValuePurchase;
	@FindBy(xpath="//tr/td/a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[2]")
	private WebElement debitValueVat;
	@FindBy(xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkView']//..//..//td[3]")
	private WebElement creditAmountTransaction;
	@FindBy(xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[2]")
	private WebElement debitAmountVat;
	@FindBy(xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[2]")
	private WebElement debitAmountAccountTransaction;
	@FindBy (id="ctl00_cPH_txtCustomerName")
	private WebElement newCustNameTxtBox;
	@FindBy (id="ctl00_cpHeaderRight_btnAddRepeatInvoice")
	private WebElement linkRepeatInvoice;
	@FindBy (id="imgentry")
	private WebElement entryBtn;
	@FindBy (id="ctl00_cPH_txtStartDt")
	private WebElement startDateRepeatInvoice;
	@FindBy (id="ctl00_cPH_txtEndDt")
	private WebElement endDateRepeatInvoice;
	@FindBy (id="ctl00_cPH_ddlFrequency")
	private WebElement frequencyTxtBox;
	@FindBy (id="ctl00_cPH_txtTotalOccurance")
	private WebElement totOccuranceTxtBox;
	@FindBy (id="ctl00_cPH_UpdatePanel1")
	private WebElement formRepeatInvoice;
	//Business -> income -> confirm entry forms
	@FindBy(xpath="//div[@id='ctl00_divMainContent']/header/div[1]/div[3]")
	private WebElement linkConfirmEntry;
	@FindBy(xpath="//a[contains(text(),'Repeat Invoice')]")
	private WebElement verifyRepeatInvoiceLink;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div[2]/table/tbody/tr/td[9]/a")
	private WebElement settingsRepeatInvoice;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div[2]/table/tbody/tr[1]/td[1]")
	private WebElement custNameRepatInvoice;
	@FindBy(xpath="//div[@id='ctl00_divMainContent']/header/div/div[3]/div[1]/a[contains(text(),'Customer List')]")
	private WebElement linkCustomerList;
	//Business -> income ->Invoice Batch
	@FindBy(id="ctl00_cpHeaderRight_btnAddBatch")
	private WebElement linkInvoiceBatch;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_ddlCustomer")
	private WebElement CustTextBox1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_ddInvoiceType")
	private WebElement invoiceType1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_txtInvoiceNo")
	private WebElement invoiceNo1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_txtAmount")
	private WebElement amount1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_ddBank")
	private WebElement bankTxtBox1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl00_txtVATRate")
	private WebElement vATRateTxtBox1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_ddlCustomer")
	private WebElement CustTextBox2;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_ddInvoiceType")
	private WebElement invoiceType2;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_txtInvoiceNo")
	private WebElement invoiceNo2;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_ddProduct")
	private WebElement productTxtBox1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_txtDescription")
	private WebElement descriptionTxtBox1;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_txtAmount")
	private WebElement amount2;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_ddVATRate")
	private WebElement vATRateTxtBox2;
	@FindBy (id="ctl00_cPH_rptrProduct_ctl01_ddBank")
	private WebElement bankTxtBox2;
	//Business -> income ->Add customer
	@FindBy (id="ctl00_cpHeaderRight_btnCustomer")
	private WebElement customerAddLink;
	@FindBy (id="ctl00_cPH_txtEmail")
	private WebElement emailCustomerTxtBox;
	@FindBy (xpath="//div[@id='ctl00_divMainContent']/div/div[2]/table/tbody/tr/td[2]")
	private WebElement customerNameInSettings;
	@FindBy (id="ctl00_cpHeaderRight_addcustomerinvoiceIframe1")
	private WebElement addCustomerNameFrame;
	//Business -> income -> Add Credit Note
	@FindBy (id="ctl00_cpHeaderRight_btnAddCreditNote")
	private WebElement linkCreditNote;
	@FindBy (xpath="//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[1]/td[3]")
	private WebElement creditNoteCreditValue;
	//	//Business -> income ->Repeat Invoice
	@FindBy (xpath="//h2[contains(text(),'Add Repeat Invoice')]")
	private WebElement titleAddRepeatInvoice;
	//Business ->Reports
	@FindBy(xpath="//span[contains(text(),'Reports')]")
	public WebElement linkReport;
	@FindBy (xpath="//a[.//text()='Ledger Report']")
	private WebElement linkLedgerReport;
	@FindBy(id="ctl00_cPHFilter_ddlAccountType")
	private WebElement lstBoxAccountType;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[5]")
	private WebElement debitAmount;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[6]/span")
	private WebElement creditAmount1;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[7]")
	private WebElement creditAmount;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[7]/span")
	private WebElement balance1;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[8]")
	private WebElement balanceAmount;
	@FindBy (id="ctl00_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy(xpath="//*[@id='ctl00_divSubContent']/div[2]/div/div/div/div/ul/li/a[contains(text(),'General Ledger Report')]")
	private WebElement linkGeneralLedgerReport;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl03_lnkView")
	private WebElement txtSaleInLedgerReport;
	@FindBy(xpath="//*/table/tbody/tr/td[contains(text(),'4000')]")
	private WebElement txtSaleCodeInLedgerReport;
	@FindBy(xpath="ctl00_cPH_rptrDisplayRecords_ctl02_lnkView")
	private WebElement txtProfitLoss;
	@FindBy(xpath="//*/table/tbody/tr/td[contains(text(),'3103')]")
	private WebElement txtProfitLossCode;
	@FindBy (xpath="//a[contains(text(),'Balance Sheet')]")
	private WebElement linkBalanceSheetReport;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1104')]/a")
	private WebElement linkDefOutPutVatInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1070')]/a")
	private WebElement linkCustomerInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'3103')]/a")
	private WebElement verifyProfitLossInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td/div/span[contains(text(),'Taxation')]")
	private WebElement linkTaxationInBalanceSheet;
	@FindBy(xpath="//*/table/tbody/tr/td/div/span[contains(text(),'Profit & Loss')]")
	private WebElement linkProfitLossInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td/div/span[contains(text(),'Customer')]")
	private WebElement linkCustmInBalanceSheet;
	//Business -> Income -> Vat Only Invoice
	@FindBy (id="ctl00_cpHeaderRight_btnAddVATInvoice")
	private WebElement linkAddVATOnlyInvoice;
	@FindBy (id="ctl00_cPH_txtInvoiceDate")
	public WebElement invoiceDateTxtBox;
	@FindBy (id="ctl00_cPH_txtSubTotal")
	private WebElement subTotalTxtBoxVat;
	@FindBy (id="ctl00_cPH_ddVATRate")
	private WebElement vatRateType;
	@FindBy (id="ctl00_cPH_txtVAT")
	private WebElement vatAmountTxtBox;
	@FindBy (id="ctl00_cPH_txtNetTotal")
	private WebElement grossTotalTxtBox;
	@FindBy (id="ctl00_cPH_txtNote")
	private WebElement noteTxtBox;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr/td/a/img")
	private WebElement settingsBtn;
	//Business -> Income -> Add Quote
	@FindBy(id="ctl00_cpHeaderRight_btnAddQuote")
	private WebElement linkAddQuote;
	@FindBy(id="ctl00_cphFooter_btnCancel")
	private WebElement cancelBtn1;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit")
	private WebElement editCustomerBtn;
	@FindBy(id="ctl00_cPH_ddCustomerType")
	private WebElement customerTypeLstBox;
	@FindBy(id="ctl00_cPH_ddSupplyType")
	private WebElement supplyLstBox;
	@FindBy(xpath="//*/a[contains(text(),'View Quotations')]")
	private WebElement verifyViewQuotationsLink;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[2]")
	private WebElement displayQuotationCode;
	@FindBy(id="ctl00_cPH_ltSubTotal")
	private WebElement subTotalTxtBox;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[4]")
	private WebElement custNameQutation;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[6]")
	private WebElement subTotalQutation;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[7]")
	private WebElement VATAmountQutation;
	@FindBy(xpath="//div[@id='ctl00_divSubContent']/div/table/tbody/tr[1]/td[8]")
	private WebElement totalQutation;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1102')]/a")
	private WebElement linkOutPutVatInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1103')]/a")
	private WebElement linkDefInPutVatInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1091')]/a")
	private WebElement linkCSPayableInBalanceSheet;
	@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'1101')]/a")
	private WebElement linkInputVATInBalanceSheet;
	//Business ->expenses -> add SubContractor Bill
	@FindBy(id="ctl00_cpHeaderRight_btnAddSubContractorBill")
	private WebElement linkAddSubContractorBill;
	@FindBy(id="ddCISRate")
	private WebElement ddCISRateLstBox;
	
	@FindBy(id="ctl00_cPH_txtPayable")
	private WebElement payableTxtBox;
	@FindBy(id="ctl00_cPH_txtCISAmount")
	private WebElement cISAmountTxtBox;
	@FindBy(id="ctl00_cPH_txtMaterial")
	private WebElement materialTxtBox;
	@FindBy(id="ctl00_cPH_txtLabour")
	private WebElement labourTxtBox;
	// Expenses -> Add Sub Contractor -> Verify Transaction
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkView']//..//..//td[1]/a")
private WebElement supplierNameInTransaction;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkView']//..//..//td[3]")
 private WebElement subContractorSuppliercredit;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[1]/a")
private WebElement inputVATInTransaction;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl01_lnkView']//..//..//td[3]")
private WebElement subContractorCISPayblevalue;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[1]/a")
private WebElement subContractorSupplier;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[2]")
private WebElement subContractorSupplierDebitValue;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl03_lnkView']//..//..//td[1]/a")
private WebElement subContractorInputvat;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl03_lnkView']//..//..//td[2]")
private WebElement subContractorInputVatValue;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl04_lnkView']//..//..//td[1]/a")
private WebElement subContractorLabour;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl04_lnkView']//..//..//td[2]")
private WebElement subContractorLabourValue;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl05_lnkView']//..//..//td[1]/a")
private WebElement subContractorMaterial;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl05_lnkView']//..//..//td[2]")
private WebElement subContractorMaterialValue;
//Expenses -> Add Sub Contractor -> Reports
@FindBy (xpath="//*/table/tbody/tr/td/div/span[contains(text(),'Supplier')]")
private WebElement balanceSheetSupplierLink;
@FindBy (xpath="//*/table/tbody/tr/td[contains(text(),'2060')]/a")
private WebElement linkSupplierControllerAccountInBalanceSheet;
@FindBy(xpath="//*/table/tbody/tr/td/div/span[contains(text(),'Taxation')]")
private WebElement taxationLinkBalanaceSheet;
//Expenses -> Add Supplier Bill / Debit Note - Batch Entry
@FindBy(id="ctl00_cpHeaderRight_btnAddBatch")
private WebElement linkSuppluerBillBatch;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ddlSupplier")
private WebElement supplierlistbox1;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_ddSupplierBillType")
private WebElement typeLstBox1;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_txtBillNo")
private WebElement BillNoTxtbox1;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_txtDescription")
private WebElement supplierDescriptionTxtBox1;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_txtNetTotal")
private WebElement totalTxtbox1;
@FindBy(id="ctl00_cPH_rptrProduct_ctl00_txtVAT")
private WebElement vat1Txtbox1;

@FindBy(id="ctl00_cPH_rptrProduct_ctl01_ddlSupplier")
private WebElement supplierlistbox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_ddSupplierBillType")
private WebElement typeLstBox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_txtBillNo")
private WebElement BillNoTxtbox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_txtDescription")
private WebElement supplierDescriptionTxtBox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_txtNetTotal")
private WebElement totalTxtbox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_txtVAT")
private WebElement vat1Txtbox2;
@FindBy(id="ctl00_cPH_rptrProduct_ctl01_ddExpenseHead")
private WebElement expenseTypeAssetTxtbox2;
@FindBy(id="ctl00_cPH_txtSupplierName")
private WebElement supplierNameTxtBox;
@FindBy(xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_tdCol10']/a")
private WebElement linkDisplayRecords;
@FindBy(xpath="//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[2]/td[2]")
private WebElement inputVATDebitAmount;
@FindBy(xpath="//*[@id='aspnetForm']/div[3]/div[1]/div/table/tbody[2]/tr[3]/td[2]")
private WebElement businessEntertainingDebitValue;
//Expenses -> Add Supplier
@FindBy(id="ctl00_cpHeaderRight_btnAddSupplier")
private WebElement linkAddSupplier;
@FindBy (tagName="body")
private WebElement body;
//Expenses -> Add Debit Note
@FindBy(id="ctl00_cpHeaderRight_btnAddDebitNote")
private WebElement linkAddDebitNote;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl00_lnkView']//..//..//td[2]")
private WebElement debitAmountTransaction;
@FindBy (xpath="//a[@id='ctl00_cPH_rptrDisplayRecords_ctl02_lnkView']//..//..//td[3]")
private WebElement creditAmountExpense;
@FindBy (xpath="//*[@id='ctl00_cPH_rptrDisplayRecords_ctl02_trFooter']/td[6]")
private WebElement creditValueTaxationCreditNote;
@FindBy(id="ctl00_cPHFilter_ddlAccount")
private WebElement accountLstBox;
@FindBy(id="ctl00_cpHeaderRight_btnAddVATSupplier")
private WebElement linkAddVATSupplier;
@FindBy(id="ctl00_cPH_txtVatRate")
private WebElement vatRateTxtBox;
@FindBy(id="ctl00_cPH_ltNetTotal")
private WebElement totalTxtBox;
@FindBy(xpath="//div[@id=\"ctl00_divMainContent\"]/header/h2/text()")
private WebElement quotationTitle;
@FindBy(xpath="//span[contains(text(),'Dashboard ')]")
private WebElement txtDashBoard;
@FindBy(xpath="//div[@id='ctl00_divMainContent']/header/h2/span/a/u[contains(text(),'Ledger Book')]")
private WebElement linkLedgerBook;
	private String firstPageTitle; 	
	private String  companyName="";
	Random random;
	WaitStatementLib wLib;
	int num1;
	CISPage cp ;
	String bodyText;
	Select select;
	String value1;
	String value2;
	String value3;
	String value4;
	String value5;
	String value6;
	double n1=0.00;
	double n2=0.00;
	double n3=0.00;
	double n4=0.00;
	double n5=0.00;
	double n6=0.00;
	double n7=0.00;
	double vat1=20;
	double total1=0.00;
	double total2=0.00;
	double total3=0.00;
	double total4=0.00;
	double creditvat=0.00;
	double creditValue=0.00;
	double debitValue=0.00;
	String actualValue1="";
	String actualValue2="";
	String actualValue3="";
	String actualValue4="";
	String exp1="";
	String exp2="";
	String exp3="";
	String exp4="";
	String custname;
	String emailId;
	String creditVal="";
	String debitOutputVatVal="";
	String debitIncomeTypeVal="";
String str1[];
String date1;
String date2;
int num2;
Date now;
Date addedDate1;
WebDriverWait wait;
private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
private static final DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-YYYY");
	public BusinessPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void openAddBusinessPage(WebDriver driver) throws InterruptedException
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		wLib.explicitWait(driver, 2,businessLink);
		businessLink.click();
		cp.switchwindowForward(driver);
		wLib.explicitWait(driver, 2,addButtonIcon);
		addButtonIcon.click();
		wLib.explicitWait(driver, 2,addBusinessBtn);
		addBusinessBtn.click();
	}
	public void openLimitedBusinessPage(WebDriver driver) throws InterruptedException
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		wLib.explicitWait(driver, 2,limitedCompanyLink);
		limitedCompanyLink.click();
	}
	public void fillBusinessDetails(WebDriver driver,String str1,String str2,String str3,String str4)throws Exception
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		wLib.explicitWait(driver, 2,AddBusinessManually);
		AddBusinessManually.click();
		wLib.explicitWait(driver, 2,bussinessName);
		bussinessName.clear();
		bussinessName.sendKeys(str1);
		companyName=bussinessName.getAttribute("value");
		registrationNumber.clear();
		registrationNumber.sendKeys("11000123");
		registrationOrBusinessDate.clear();
		registrationOrBusinessDate.sendKeys(str2);
		firstName.clear();
		firstName.sendKeys(str3);
		lastName.clear();
		lastName.sendKeys(str4);
		//isEmployeechkBox.click();
		SaveButtonBusiness.click();
		driver.navigate().refresh();
		}
	public void fillBusinessPLCDetails(WebDriver driver,String str1,String str2,String str3,String str4)throws Exception
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		wLib.explicitWait(driver, 2,AddBusinessManually);
		AddBusinessManually.click();
		wLib.explicitWait(driver, 2,bussinessName);
		bussinessName.clear();
		bussinessName.sendKeys(str1);
		companyName=bussinessName.getAttribute("value");
		registrationNumber.clear();
		registrationNumber.sendKeys("11000123");
		registrationOrBusinessDate.clear();
		registrationOrBusinessDate.sendKeys(str2);
		firstName.clear();
		firstName.sendKeys(str3);
		lastName.clear();
		lastName.sendKeys(str4);
		//isEmployeechkBox.click();
		SaveButtonBusiness.click();
		driver.navigate().refresh();
		}
	public void fillBusinessDetailsLLP(WebDriver driver,String str1,String str2,String str3,String str4,String str5,String str6)throws Exception
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		wLib.explicitWait(driver, 2,AddBusinessManually);
		AddBusinessManually.click();
		wLib.explicitWait(driver, 2,bussinessName);
		bussinessName.clear();
		bussinessName.sendKeys(str1);
		companyName=bussinessName.getAttribute("value");
		registrationNumber.clear();
		registrationNumber.sendKeys("11000123");
		UTRNo_LLP.clear();
		UTRNo_LLP.sendKeys("1000000110");
		registrationOrBusinessDate.clear();
		registrationOrBusinessDate.sendKeys(str2);
		firstName.clear();
		firstName.sendKeys(str3);
		lastName.clear();
		lastName.sendKeys(str4);
		firstNameMember2.clear();
		firstNameMember2.sendKeys(str5);
		lastNameMember2.clear();
		lastNameMember2.sendKeys(str6);
		SaveButtonBusiness.click();
		driver.navigate().refresh();
	}
	public void createBusiness(WebDriver driver,String str1,String str2,String str3,String str4)throws Exception
	{
		wLib = new WaitStatementLib();
		cp = new CISPage(driver);
		openAddBusinessPage(driver);
		openLimitedBusinessPage(driver);
		fillBusinessDetails(driver,str1,str2, str3, str4);
	}
public void openBusiness1(WebDriver driver, String comName) throws Exception {
		
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,businessLink);
	businessLink.click();
	wLib.explicitWait(driver, 2,SearchCompany);
	SearchCompany.sendKeys(comName);
	wLib.explicitWait(driver, 2,SearchButton);
	SearchButton.click();
	wLib.explicitWait(driver, 2,CompanyClick);
	CompanyClick.click();
	Reporter.log("opening searched business",true);
	driver.navigate().refresh();
}
public void openBusiness(WebDriver driver, String comName) throws Exception {
		
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	wLib.explicitWait(driver, 2,businessLink);
	businessLink.click();
	wLib.explicitWait(driver, 2,SearchCompany);
	SearchCompany.sendKeys(comName);
	wLib.explicitWait(driver, 2,SearchButton);
	SearchButton.click();
	wLib.explicitWait(driver, 2,CompanyClick);
	CompanyClick.click();
	Reporter.log("opening searched business",true);
	cp.switchwindowForward(driver);
	System.out.println(driver.getTitle());
	/*cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,continueBtn);
	continueBtn.click();*/
	driver.navigate().refresh();
		}
public void addCustomerFromDailog(WebDriver driver,String cust1) throws Exception
{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,addBtn);
	addBtn.click();
	driver.switchTo().activeElement();
	wLib.explicitWait(driver, 2,newCustTxtBox);
	newCustTxtBox.sendKeys(cust1);
	addNewBtn.click();
	
}
public void createInvoive(WebDriver driver,String cust1,String invNo,String Description1, String unitPrice1, String Quantity1) throws Exception {
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	wLib.explicitWait(driver, 2,plusButtonBK);
plusButtonBK.click();
wLib.explicitWait(driver, 2,linkAddBtn);
linkAddBtn.click();
cp.switchwindowNew(driver);
addCustomerFromDailog(driver,cust1);
wLib.explicitWait(driver, 2,serialNoTxtBox);
serialNoTxtBox.clear();
serialNoTxtBox.sendKeys(invNo);
wLib.explicitWait(driver, 2,departmentLstBox);
select = new Select(departmentLstBox);
select.selectByVisibleText("IT");
wLib.explicitWait(driver, 2,incomeTypeLstBox);
select = new Select(incomeTypeLstBox);
select.selectByVisibleText("Sale");
wLib.explicitWait(driver, 2,vatRateTypeLstBox);
select= new Select(vatRateTypeLstBox);
select.selectByVisibleText("STD 20%");
wLib.explicitWait(driver, 2,descriptionTxtBox);
descriptionTxtBox.sendKeys(Description1);
wLib.explicitWait(driver, 2,unitPriceTxtBox);
unitPriceTxtBox.sendKeys(unitPrice1);
wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.attributeToBeNotEmpty(unitPriceTxtBox, "value"));
value1=unitPriceTxtBox.getAttribute("value");
wLib.explicitWait(driver, 2,quantityTxtBox);
quantityTxtBox.clear();
quantityTxtBox.sendKeys(Quantity1);
wLib.explicitWait(driver, 2,vATAmountTxtBox);
vATAmountTxtBox.click();
wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.attributeToBeNotEmpty(quantityTxtBox, "value"));
value2=quantityTxtBox.getAttribute("value");

wait.until(ExpectedConditions.attributeToBeNotEmpty(vATRateTxtBox, "value"));
value4=vATRateTxtBox.getAttribute("value");
wait.until(ExpectedConditions.attributeToBeNotEmpty(vATAmountTxtBox, "value"));
value5=vATAmountTxtBox.getAttribute("value").substring(1).replace(",", "");
wait.until(ExpectedConditions.attributeToBeNotEmpty(amountTxtBox, "value"));
value6=amountTxtBox.getAttribute("value").substring(1).replace(",", "");
n1=Double.parseDouble(value1);
n2=Double.parseDouble(value2);
total1=n1*n2;
total2=(total1*vat1/100);
total3=total1+total2;
exp1=String.format("%.2f",(total2));
exp2=String.format("%.2f",(total3));
try {

	assertEquals(value5, exp1);
	Reporter.log("VAT Amount is verified: "+value5,true);
	assertEquals(value6, exp2);
	Reporter.log("Total invoice amount is verified: "+value6,true);

}
catch (Exception e) {
	System.out.println("VAT Amount detected: "+ value5);
	System.out.println("Total invoice amount detected: "+ value6);
}
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 2,Bank);
select=new Select(Bank);
select.selectByVisibleText("AIB Bank");
wLib.explicitWait(driver, 2,saveBtn);
saveBtn.click();
wLib.explicitWait(driver, 2,successMsg);
Assert.assertEquals(successMsg.getText(), "Success!");
Reporter.log("Invoice added Successfully",true);
wLib.explicitWait(driver, 2,clickRecordInvoice);
clickRecordInvoice.click();
cp.switchwindowNew(driver);
wLib = new WaitStatementLib();
wLib.explicitWait(driver, 2,creditValueVat);

actualValue1=creditValueVat.getText().substring(1).replace(",", "");
wLib.explicitWait(driver, 2,creditValueInvoice);
actualValue2=creditValueInvoice.getText().substring(1).replace(",", "");
creditvat=Double.parseDouble(actualValue1);
creditValue=Double.parseDouble(actualValue2);
n3=total3-creditvat;
wLib.explicitWait(driver, 2,debitInvoice);
actualValue3=debitInvoice.getText().substring(1).replace(",", "");
debitValue=Double.parseDouble(actualValue3);
Assert.assertEquals(creditvat, total2);
Reporter.log("Credit Value for Vat verified Successfully: "+creditvat,true);
Assert.assertEquals(creditValue, n3);
Reporter.log("Credit Value for Invoice verified Successfully: "+creditValue,true);
Assert.assertEquals(debitValue, total3);
Reporter.log("Debit Value for Invoice verified Successfully: "+debitValue,true);
wLib.explicitWait(driver, 2,transNameLinkTransaction);
transNameLinkTransaction.click();
wLib.explicitWait(driver, 2,ledgerDebit);
Assert.assertEquals(ledgerDebit.getText(),ledgerCredit.getText());
Reporter.log("Ledger's Closing value for Debit and Credit for Customer Verified successfully",true);
wLib.explicitWait(driver, 2,linkIncomeBK);
linkIncomeBK.click();
wLib.explicitWait(driver, 2,clickRecordInvoice);
clickRecordInvoice.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 2,outputVatLink);
outputVatLink.click();
wLib.explicitWait(driver, 2,ledgerDebit);
Assert.assertEquals(ledgerDebit.getText().substring(1),ledgerBalance.getText().substring(2));
Reporter.log("Ledger's Closing value for Debit and Credit for Taxation Verified successfully",true);
wLib.explicitWait(driver, 2,linkIncomeBK);
linkIncomeBK.click();
wLib.explicitWait(driver, 2,clickRecordInvoice);
clickRecordInvoice.click();
cp.switchwindowNew(driver);
wLib.explicitWait(driver, 2,incomeTypeLink);
incomeTypeLink.click();
wLib.explicitWait(driver, 2,ledgerDebit);
Assert.assertEquals(ledgerDebit.getText().substring(1),ledgerBalance.getText().substring(2));
Reporter.log("Ledger's Closing value for Debit and Credit for IncomeType Verified successfully",true);
}
public void openIncome(WebDriver driver) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkIncomeBK);
	linkIncomeBK.click();
	driver.navigate().refresh();
}

public void delTransaction(WebDriver driver)throws Exception 
{
	wLib = new WaitStatementLib();
	cp = new CISPage(driver);
	try {
		wLib.explicitWait(driver, 1,settingsBtn);
		if(settingsBtn.isDisplayed()==true)
		{
	settingsBtn.click();
	wLib.explicitWait(driver, 1,delBtn);
	delBtn.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 1,confirmDelBtn);
	confirmDelBtn.click();
	wLib.explicitWait(driver, 1,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log(successMsg.getText(),true);
	}
	}
	catch (Exception e) {
		Reporter.log("Transaction not available",true);
	}

}
public void delCustomer(WebDriver driver)throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkSettings);
	linkSettings.click();
	wLib.explicitWait(driver, 2,linkCustomerDetails);
	linkCustomerDetails.click();
	
	try {
		wLib.explicitWait(driver, 2,selectAllDelChkBox);
		selectAllDelChkBox.click();
		wLib.explicitWait(driver, 2,deleteAllCustomerBtn);
		deleteAllCustomerBtn.click();
	}
catch (Exception e) {
	System.out.println("Customer not available");
}
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	 Reporter.log("Customer Deleaed Successfully",true);
	
}
public void openExpensesLink(WebDriver driver) throws Exception{
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkExpenses);
	linkExpenses.click();
	driver.navigate().refresh();
}
public void addSupplierThroughDailog(WebDriver driver, String supplier1) throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,addBtn);
	addBtn.click();
	driver.switchTo().activeElement();
	wLib.explicitWait(driver, 2,addSupplierTxtBox);
	addSupplierTxtBox.clear();
	addSupplierTxtBox.sendKeys(supplier1);
	}
public void addAccount(WebDriver driver,String billNo,String Description1,String unitPrice1)throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,BillNo);
	BillNo.sendKeys(billNo);
	wLib.explicitWait(driver, 2,Expensetype);
	select = new Select(Expensetype);
	select.selectByVisibleText("Purchases");
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,vatRateTypeLstBox);
	select= new Select(vatRateTypeLstBox);
	select.selectByVisibleText("STD 20%");
	Thread.sleep(2000);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,unitPriceTxtBox);
	unitPriceTxtBox.click();
	unitPriceTxtBox.sendKeys(Keys.CONTROL+ "a");
	unitPriceTxtBox.sendKeys(Keys.DELETE);
	unitPriceTxtBox.sendKeys(Keys.chord(unitPrice1));
	unitPriceTxtBox.sendKeys(Keys.PAUSE);
	Thread.sleep(2000);
	//unitPriceTxtBox.sendKeys(unitPrice1);
	//driver.findElement(By.xpath("//form[@id='aspnetForm']/div[3]/header/h2")).click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,amountTxtBox);
	amountTxtBox.click();
	n1=Double.parseDouble(unitPrice1);
	
	wLib.explicitWait(driver, 2,descriptionTxtBox);
	descriptionTxtBox.click();
	descriptionTxtBox.clear();
	descriptionTxtBox.sendKeys(Description1);
	//driver.findElement(By.xpath("//form[@id='aspnetForm']/div[3]/header/h2")).click();
	wait = new WebDriverWait(driver,30);
    wait.until(ExpectedConditions.attributeToBeNotEmpty(amountTxtBox, "value"));
	value1=amountTxtBox.getAttribute("value").replace(",", "");
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATAmountTxtBox, "value"));
	value2=vATAmountTxtBox.getAttribute("value").replace(",", "");
	total1=(n1*5)/6;
	total2=n1-total1;
	exp1=String.format("%.2f",(total1));
	exp2=String.format("%.2f",(total2));
	try
	{
		
		Assert.assertEquals(value1, exp1);
		Reporter.log("Net Amount of Expenses verified successfully: "+value1,true);
		Assert.assertEquals(value2, exp2);
		Reporter.log("VAT Amount of Expenses verified successfully: "+value2,true);	
	}
	catch (Exception e) {
		System.out.println(value1+"--"+value2+"--VAT calculation is wrong");
	}
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Sub Contractor added Successfully",true);
}
public void addSupplier(WebDriver driver,String supplier1,String billNo,String Description1, String unitPrice1)throws Exception {
	
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkAddBtn);
	linkAddBtn.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	addSupplierThroughDailog(driver, supplier1);
	wLib.explicitWait(driver, 2,ddCISRateLstBox);
	select = new Select(ddCISRateLstBox);
	select.selectByVisibleText("20% CIS Rate");
	addNewBtn.click();
	addAccount(driver,billNo,Description1,unitPrice1);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,creditAmountTransaction);
	Assert.assertEquals(creditAmountTransaction.getText().substring(1), unitPrice1);
	Reporter.log("Supplier value verified successfully ",true);	
	Assert.assertEquals(debitAmountVat.getText().substring(1),value2);
	Reporter.log("Deferred Input VAT verified successfully ",true);	
	Assert.assertEquals(debitAmountAccountTransaction.getText().substring(1),value1);
	Reporter.log("Expenses type verified successfully ",true);	
	transNameLinkTransaction.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Ledger Value for account verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,linkInputVATVat);
	linkInputVATVat.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText().substring(1),ledgerBalance.getText().substring(1));
	Reporter.log("Ledger Value for Taxation verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,linkExpenseType);
	linkExpenseType.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText().substring(1),ledgerBalance.getText().substring(1));
	Reporter.log("Ledger Value for Cost of Sale verified successfully ",true);	
	delSupplier(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	cp = new CISPage(driver);
	cp.switchwindowDefault(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkLedgerReport);
	linkLedgerReport.click();
	cp = new CISPage(driver);
	cp.switchwindowDefault(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Supplier");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,accountLstBox);
	
	select = new Select(accountLstBox);
	select.selectByVisibleText(supplier1);
	searchBtn.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Ledger Value for account verified successfully ",true);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Taxation");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,accountLstBox);
	select = new Select(accountLstBox);
	select.selectByVisibleText("Input VAT");
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText().substring(1),ledgerBalance.getText().substring(1));
	Reporter.log("Ledger Value for Taxation verified successfully ",true);
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Cost of Sale");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,accountLstBox);
	select = new Select(accountLstBox);
	select.selectByVisibleText("All");
	select = new Select(accountLstBox);
	select.selectByVisibleText("Purchases");
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText().substring(1),ledgerBalance.getText().substring(1));
	Reporter.log("Ledger Value for Cost of Sale verified successfully ",true);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
	linkTaxationInBalanceSheet.click();
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);
	exp1=linkInputVATInBalanceSheet.getText();
	Assert.assertEquals(exp1, "Input VAT");
	wLib.explicitWait(driver, 2,balanceSheetSupplierLink);
	balanceSheetSupplierLink.click();
	wLib.explicitWait(driver, 2,linkSupplierControllerAccountInBalanceSheet);
	exp2=linkSupplierControllerAccountInBalanceSheet.getText();
	Assert.assertEquals(exp2, supplier1);
	Reporter.log("Supplier Controller Account code value verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
	linkProfitLossInBalanceSheet.click();
	wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
	exp3=verifyProfitLossInBalanceSheet.getText();
	Assert.assertEquals(exp3, "Profit/Loss");
	Reporter.log("Profit and Loss code verified in Balance Sheet",true);

}

 public void delSupplier(WebDriver driver)throws Exception 
{
	 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 10,linkSettings);
	 linkSettings.click();
	 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 10,linkSupplier);
	linkSupplier.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,selectAllDelChkBox);
	selectAllDelChkBox.click();
	wLib.explicitWait(driver, 2,delAllSupplierBtn);
	delAllSupplierBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Supplier deleted Successfully",true);
}
 public void delSupplierBill(WebDriver driver)throws Exception {
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,linkSettings);
	 settingsBtn.click();
	 wLib.explicitWait(driver, 2,delBtn);
	 delBtn.click();
	 cp = new CISPage(driver);
	 cp.switchwindowNew(driver);
	 wLib.explicitWait(driver, 2, confirmDelBtn);
	 confirmDelBtn.click();
	 
 }
 public void addCutomer(WebDriver driver,String custname) throws Exception{
	wLib = new WaitStatementLib();
	openIncome(driver);
	wLib.explicitWait(driver, 5,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 5,customerAddLink);
	customerAddLink.click();
	
	cp = new CISPage(driver);
	cp.switchwindowNew1(driver,addCustomerNameFrame);
	wLib.explicitWait(driver, 2,newCustNameTxtBox);
	newCustNameTxtBox.clear();
	this.custname=custname;
	newCustNameTxtBox.sendKeys(custname);
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	 Reporter.log("Customer added Successfully",true);
 }
 public void repeatInvoive(WebDriver driver,String occurance,String Description1, String unitPrice1, String quantity) throws Exception {
	openIncome(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,plusButtonBK);	
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkRepeatInvoice);
	linkRepeatInvoice.click();
	cp = new CISPage(driver);
	//cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,SelectCustomer);
	select = new Select(SelectCustomer);
	Reporter.log("Customer Name: "+custname,true);
	select.selectByVisibleText(custname);
	startDateRepeatInvoice.clear();
	now = new Date();
    LibSA lib1=new LibSA(driver);
    Reporter.log("Date selected: "+dateFormat.format(now),true);
    startDateRepeatInvoice.click();
    startDateRepeatInvoice.sendKeys(dateFormat.format(now));
    titleAddRepeatInvoice.click();
    Reporter.log("Start Date: "+startDateRepeatInvoice.getText(),true);
    wLib.explicitWait(driver, 5,entryBtn);
    entryBtn.click();
    wLib.explicitWait(driver, 5,frequencyTxtBox);
 	select = new Select(frequencyTxtBox);
	select.selectByVisibleText("Weekly");
	wLib.explicitWait(driver, 2,totOccuranceTxtBox);
	totOccuranceTxtBox.click();
	totOccuranceTxtBox.sendKeys(Keys.BACK_SPACE);
	totOccuranceTxtBox.sendKeys(occurance);
	wLib.explicitWait(driver, 5,totOccuranceTxtBox);
	Reporter.log("Total occurance: "+totOccuranceTxtBox.getAttribute("value"),true);
	wLib.explicitWait(driver, 2,formRepeatInvoice);
	formRepeatInvoice.click();
	num2=Integer.parseInt(occurance);
	num2=(num2-1)*7;
	Reporter.log("No of Days for second Invoice: "+ Integer.toString(num2),true);
	addedDate1 = lib1.addDays(now, num2);
	date1=dateFormat.format(addedDate1);
	Reporter.log("Expected next Date of invoice: "+date1,true);
	wLib.explicitWait(driver, 2,endDateRepeatInvoice);
	date2=endDateRepeatInvoice.getAttribute("value");
	Reporter.log("Actual next Date of invoice: "+date2,true);
	Assert.assertEquals(date2,date1);
	Reporter.log("End Date for repeat invoice verified Successfully: "+date2,true);
	wLib.explicitWait(driver, 2,incomeTypeLstBox);
	select = new Select(incomeTypeLstBox);
	select.selectByVisibleText("Sale");
	wLib.explicitWait(driver, 2,descriptionTxtBox);
	descriptionTxtBox.sendKeys(Description1);
	wLib.explicitWait(driver, 2,unitPriceTxtBox);
	unitPriceTxtBox.clear();
	unitPriceTxtBox.sendKeys(unitPrice1);
	value1=unitPriceTxtBox.getAttribute("value");
	Reporter.log("Unit Price: "+value1, true);
	quantityTxtBox.click();
	quantityTxtBox.sendKeys(quantity);
	quantityTxtBox.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	wLib.explicitWait(driver, 2,vatRateTypeLstBox);
	select= new Select(vatRateTypeLstBox);
	select.selectByVisibleText("STD 20%");
	value2=quantityTxtBox.getAttribute("value");
	Reporter.log("Quantity"+value2,true);
	/*wait.until(ExpectedConditions.attributeToBeNotEmpty(vATRateTxtBox, "value"));
	wLib.explicitWait(driver, 2,vATRateTxtBox);
	value4=vATRateTxtBox.getAttribute("value");
	Reporter.log("VAT Rate Value"+value4,true);*/
	wLib.explicitWait(driver, 2,vATAmountTxtBox);
	value5=vATAmountTxtBox.getAttribute("value").substring(1).replace(",", "");
	Reporter.log("Value of VAT amount: "+value5,true);
	wLib.explicitWait(driver, 2,amountTxtBox);
	value6=amountTxtBox.getAttribute("value").substring(1).replace(",", "");
	Reporter.log("Value of amount: "+value6,true);
	n1=Double.parseDouble(value1);
	n2=Double.parseDouble(value2);
	total1=n1*n2;
	total2=(total1*vat1/100);
	total3=total1+total2;
	exp1=String.format("%.2f",(total2));
	exp2=String.format("%.2f",(total3));
	try {

		assertEquals(value5, exp1);
		Reporter.log("VAT Amount is verified: "+value5,true);
		assertEquals(value6, exp2);
		Reporter.log("Total invoice amount is verified: "+value6,true);

	}
	catch (Exception e) {
		Reporter.log("VAT Amount detected: "+ value5,true);
		Reporter.log("Total invoice amount detected: "+ value6,true);
	}

	select=new Select(Bank);
	select.selectByVisibleText("AIB Bank");
	wLib.explicitWait(driver, 5,entryBtn);
	entryBtn.click();
	cp.switchwindowDefault(driver);
	wLib.explicitWait(driver, 2,saveBtn1);
	saveBtn1.click();
	/*wLib.explicitWait(driver, 2,linkConfirmEntry);
	linkConfirmEntry.click();*/
	wLib.explicitWait(driver, 2,plusButtonBK);	
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,verifyRepeatInvoiceLink);
	verifyRepeatInvoiceLink.click();
	wLib.explicitWait(driver, 2,custNameRepatInvoice);
	value1=custNameRepatInvoice.getText();
	Assert.assertEquals(value1, custname);
	Reporter.log("Repeat invoice entered successfully",true);
	
 }
 public void delRepeatInvoice(WebDriver driver) throws Exception {
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,linkConfirmEntry);
linkConfirmEntry.click();
wLib.explicitWait(driver, 2,verifyRepeatInvoiceLink);
verifyRepeatInvoiceLink.click();
delTransaction(driver);
}
 public void addbatchInvoive(WebDriver driver,String custname,String inv1,String inv2,String dse,String amt1) throws Exception 
 {
	 addCutomer(driver,custname);
	  openIncome(driver);
	 wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 2,plusButtonBK);
	  plusButtonBK.click();
	  wLib.explicitWait(driver, 2,linkInvoiceBatch);
	 linkInvoiceBatch.click();
	 
	 cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	 wLib.explicitWait(driver, 2,CustTextBox1);
	select = new Select(CustTextBox1);
	select.selectByVisibleText(custname);
	wLib.explicitWait(driver, 2,invoiceType1);
	 select = new Select(invoiceType1);
	select.selectByVisibleText("Invoice");
	wLib.explicitWait(driver, 2,invoiceNo1);
	invoiceNo1.click();
	wLib.explicitWait(driver, 2,invoiceNo1);
	 invoiceNo1.sendKeys(inv1);
	 descriptionTxtBox.click();
	 descriptionTxtBox.sendKeys(dse);
	 amount1.click();
	 amount1.sendKeys(amt1);
	 select= new Select(vatRateTypeLstBox);
	 select.selectByVisibleText("STD 20%");
	 select=new Select(bankTxtBox1);
	 select.selectByVisibleText("AIB Bank");
	 wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATAmountTxtBox,"value"));
	 value1=vATAmountTxtBox.getAttribute("value").substring(1);
	 n1=Double.parseDouble(amt1);
	 n2=Double.parseDouble(value1);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,CustTextBox2);
	select = new Select(CustTextBox2);
	select.selectByVisibleText(custname);
	 wLib.explicitWait(driver, 2,invoiceType2);
	select = new Select(invoiceType2);
	select.selectByVisibleText("Invoice");
	wLib.explicitWait(driver, 2,invoiceNo2);
	invoiceNo2.click();
	invoiceNo2.sendKeys(inv2);
	wLib.explicitWait(driver, 2,descriptionTxtBox1);
	descriptionTxtBox1.click();
	descriptionTxtBox1.sendKeys(dse);
	wLib.explicitWait(driver, 2,amount2);
	amount2.click();
	amount2.sendKeys(amt1+5);		
	wLib.explicitWait(driver, 2,vATRateTxtBox2);
	select= new Select(vATRateTxtBox2);
	select.selectByVisibleText("STD 20%");
	wLib.explicitWait(driver, 2,bankTxtBox2);
	select=new Select(bankTxtBox2);
	select.selectByVisibleText("AIB Bank");
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,successMsg);
	 Assert.assertEquals(successMsg.getText(), "Success!");
	 Reporter.log("Invoice added Successfully",true);
	wLib.explicitWait(driver, 2, clickRecordInvoice);
	 clickRecordInvoice.click();
	 cp = new CISPage(driver);
	 cp.switchwindowNew(driver);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,creditValueVat);
	 actualValue1=creditValueVat.getText().substring(1).replace(",", "");
	 wLib.explicitWait(driver, 2,creditValueInvoice);
	 actualValue2=creditValueInvoice.getText().substring(1).replace(",", "");
	 creditvat=Double.parseDouble(actualValue1);
	 creditValue=Double.parseDouble(actualValue2);
	 total1=creditvat+creditValue;
	 wLib.explicitWait(driver, 2,debitInvoice);
	 actualValue3=debitInvoice.getText().substring(1).replace(",", "");
	 debitValue=Double.parseDouble(actualValue3);
	 Assert.assertEquals( debitValue, total1);
	 Reporter.log("Debit Value for Invoice verified Successfully: "+debitValue,true);
	 wLib.explicitWait(driver, 2,transNameLinkTransaction);
	 transNameLinkTransaction.click();
	 Assert.assertEquals(ledgerDebit.getText(),ledgerCredit.getText());
	 Reporter.log("Ledger's Closing value for Debit and Credit for Customer Verified successfully",true);
	  }
 public void delBatchInvoice(WebDriver driver) throws Exception {
	 openIncome(driver);
	 delTransaction(driver);
	 delTransaction(driver);
	 delCustomer(driver);
	 }
 public void addCustomerInIncome(WebDriver driver, String custname, String emailId) throws Exception
 {
	 openIncome(driver);
	 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,plusButtonBK);
	 plusButtonBK.click();
	 wLib.explicitWait(driver, 2,customerAddLink);
	customerAddLink.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,newCustNameTxtBox);
	 newCustNameTxtBox.clear();
	 newCustNameTxtBox.sendKeys(custname);
	 this.custname=custname;
	 emailCustomerTxtBox.clear();
	 emailCustomerTxtBox.sendKeys(emailId);
	 this.emailId=emailId;
	 wLib.explicitWait(driver, 2,saveBtn);
	 saveBtn.click();
	driver.navigate().refresh();
	 wLib = new WaitStatementLib();
	  wLib.explicitWait(driver, 2,linkConfirmEntry);
	 linkConfirmEntry.click();
	  wLib.explicitWait(driver, 2, linkCustomerList);
	 linkCustomerList.click();
	  wLib.explicitWait(driver, 2,body);
	 bodyText = body.getText();
		
		if (bodyText.contains(custname)==true){
	    Reporter.log("Customer "+custname+" added successfully",true);
	}
	 }
 public void createCreditNote(WebDriver driver,String cust1,String invNo,String Description1, String unitPrice1, String Quantity1) throws Exception {
 openIncome(driver);
 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,plusButtonBK);
	 plusButtonBK.click();
	 wLib.explicitWait(driver, 2,linkCreditNote);
	 linkCreditNote.click();
	 cp = new CISPage(driver);
	 cp.switchwindowNew(driver);
	 addCustomerFromDailog(driver,cust1);
	 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,serialNoTxtBox);
	 serialNoTxtBox.clear();
	 serialNoTxtBox.sendKeys(invNo);
	 wLib.explicitWait(driver, 2,departmentLstBox);
	 select = new Select(departmentLstBox);
	 select.selectByVisibleText("IT");
	 wLib.explicitWait(driver, 2,incomeTypeLstBox);
	 select = new Select(incomeTypeLstBox);
	 select.selectByVisibleText("Sale");
	 wLib.explicitWait(driver, 2,descriptionTxtBox);
	 descriptionTxtBox.sendKeys(Description1);
	 wLib.explicitWait(driver, 2, unitPriceTxtBox);
	 unitPriceTxtBox.click();
	 unitPriceTxtBox.sendKeys(unitPrice1);
	 wLib.explicitWait(driver, 2,vatRateTypeLstBox);
	 select= new Select(vatRateTypeLstBox);
	 select.selectByVisibleText("STD 20%");
	 wait = new WebDriverWait(driver,10);
	// wait.until(ExpectedConditions.attributeToBeNotEmpty(unitPriceTxtBox, "value"));
	 try
	 {
	 if (unitPriceTxtBox.getAttribute("value")==null)
	 {
		do { 
		 wLib.explicitWait(driver, 2,quantityTxtBox);
		 unitPriceTxtBox.click();
		 unitPriceTxtBox.sendKeys(unitPrice1);
		 wLib.explicitWait(driver, 2,vATAmountTxtBox);
		 vATAmountTxtBox.click();
		}while(unitPriceTxtBox.getAttribute("value")==null);
	 }
	 }
	 catch (Exception e) {
		Reporter.log("In quantity field value entered first time only",true);
	}
	 value1=unitPriceTxtBox.getAttribute("value");
	 
	 wLib.explicitWait(driver, 2,quantityTxtBox);
	 quantityTxtBox.click();
	 quantityTxtBox.sendKeys(Quantity1);
	 wLib.explicitWait(driver, 2,vATAmountTxtBox);
	 vATAmountTxtBox.click();
	 wait = new WebDriverWait(driver,10);
	 /*wait.until(ExpectedConditions.attributeToBeNotEmpty(quantityTxtBox, "value"));
	 value2=quantityTxtBox.getAttribute("value");*/
	 try
	 {
	 if (quantityTxtBox.getAttribute("value")==null)
	 {
		do { 
		 wLib.explicitWait(driver, 2,quantityTxtBox);
		 quantityTxtBox.click();
		 quantityTxtBox.sendKeys(Quantity1);
		 wLib.explicitWait(driver, 2,vATAmountTxtBox);
		 vATAmountTxtBox.click();
		}while(quantityTxtBox.getAttribute("value")==null);
	 }
	 }
	 catch (Exception e) {
		Reporter.log("In quantity field value entered first time only",true);
	}
	 value2=quantityTxtBox.getAttribute("value");
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATRateTxtBox, "value"));
	 value4=vATRateTxtBox.getAttribute("value");
	
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATAmountTxtBox, "value"));
	 value5=vATAmountTxtBox.getAttribute("value").substring(1).replace(",", "");
	 amountTxtBox.click();
	  wait.until(ExpectedConditions.attributeToBeNotEmpty(amountTxtBox, "value"));
	
	 value6=amountTxtBox.getAttribute("value").substring(1).replace(",", "");
	 
	 
	 n1=Double.parseDouble(value1);
	 n2=Double.parseDouble(value2);
	 total1=n1*n2;
	 total2=(total1*vat1/100);
	 total3=total1+total2;
	 exp1=String.format("%.2f",(total2));
	 exp2=String.format("%.2f",(total3));
	 try {

	 	assertEquals(value5, exp1);
	 	Reporter.log("VAT Amount is verified: "+value5,true);
	 	assertEquals(value6, exp2);
	 	Reporter.log("Total invoice amount is verified: "+value6,true);

	 }
	 catch (Exception e) {
	 	Reporter.log("VAT Amount detected: "+ value5,true);
	 	Reporter.log("Total invoice amount detected: "+ value6,true);
	 }
	 wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,Bank);
	 select=new Select(Bank);
	 select.selectByVisibleText("AIB Bank");
	 wLib.explicitWait(driver, 2,saveBtn);
	 saveBtn.click();
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,successMsg);
	 Assert.assertEquals(successMsg.getText(), "Success!");
	 Reporter.log("Invoice added Successfully",true);
	 wLib.explicitWait(driver, 2, clickRecordInvoice);
	 clickRecordInvoice.click();
	 cp.switchwindowNew(driver);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,creditNoteCreditValue);
	 creditVal=creditNoteCreditValue.getText().substring(1).replace(",", "");
	 debitOutputVatVal=debitValuePurchase.getText().substring(1).replace(",", "");
	debitIncomeTypeVal=debitValueVat.getText().substring(1).replace(",", "");
	creditvat=Double.parseDouble(creditVal);
	creditValue=Double.parseDouble(debitOutputVatVal);
	debitValue=Double.parseDouble(debitIncomeTypeVal);
	
	Assert.assertEquals(creditValue+debitValue, creditvat);
	Reporter.log("Credit Note transaction Verified Successfully", true);
	 wLib.explicitWait(driver, 2,transNameLinkTransaction);
	transNameLinkTransaction.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Ledger Book Closing Balance of Customer verified Successfully",true);
	 wLib.explicitWait(driver, 2,linkIncomeBK);
	linkIncomeBK.click();
	wLib.explicitWait(driver, 2,clickRecordInvoice);
	clickRecordInvoice.click();
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,outputVatLink);
	outputVatLink.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText(),ledgerBalance.getText());
	Reporter.log("Ledger Book Closing Balance of Taxation verified Successfully",true);
	 wLib.explicitWait(driver, 2,linkIncomeBK);
	linkIncomeBK.click();
	wLib.explicitWait(driver, 2,clickRecordInvoice);
	clickRecordInvoice.click();
	
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,incomeTypeLink);
	incomeTypeLink.click();
	wLib.explicitWait(driver, 2,ledgerDebit1);
	Assert.assertEquals(ledgerDebit1.getText(),ledgerBalance.getText());
	Reporter.log("Ledger Book Closing Balance of Income Type verified Successfully",true);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	cp = new CISPage(driver);
	cp.switchwindowDefault(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkLedgerReport);
	linkLedgerReport.click();
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Taxation");
	searchBtn.click();
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	Assert.assertEquals(debitAmount.getText(),creditAmount.getText());
	Reporter.log("Ledger report of Taxation Account type verified successfully",true);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Customer");
	searchBtn.click();
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	Assert.assertEquals(creditAmount.getText().substring(1),balanceAmount.getText().substring(2));
	Reporter.log("Ledger report of Customer Account type verified successfully",true);
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Income Type");
	searchBtn.click();
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	Assert.assertEquals(debitAmount.getText(),creditAmount.getText());
	Reporter.log("Ledger report of Income Type Account type verified successfully",true);
	linkReport.click();
	linkGeneralLedgerReport.click();
	try
{
if(txtSaleInLedgerReport.isDisplayed()==true)
{
wLib.explicitWait(driver, 2,txtSaleCodeInLedgerReport);
value1=txtSaleCodeInLedgerReport.getText();
Assert.assertEquals(value1, "4000");
Reporter.log("Sale code is verified",true);
}
}
catch (Exception e) {
Reporter.log("Sale is not available in Account type",true);
}
try
{
if(txtProfitLoss.isDisplayed()==true)
{
wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.attributeToBeNotEmpty(txtProfitLossCode, "value"));
value1=txtProfitLossCode.getText();
Assert.assertEquals(value1, "3103");
Reporter.log("Profit/Loss code Verified ");
}
}
catch (Exception e) {
	System.out.println("Profit/Loss is not available in Account type");
}
wLib.explicitWait(driver, 2,linkReport);
linkReport.click();
wLib.explicitWait(driver, 2,linkBalanceSheetReport);
linkBalanceSheetReport.click();
wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
linkTaxationInBalanceSheet.click();

try
{
	wLib.explicitWait(driver, 1,linkDefOutPutVatInBalanceSheet);	
	if(linkDefOutPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver,1,linkDefOutPutVatInBalanceSheet);
exp1=linkDefOutPutVatInBalanceSheet.getText();
Assert.assertEquals(exp1, "Deferred Output VAT");
Reporter.log("Deffered Output VAT code '1104' verified in Balance Sheet",true);
}}
	catch (Exception e) {
		Reporter.log("As a Taxation value '1104'is not available",true);
	}
try
{
	wLib.explicitWait(driver, 1,linkOutPutVatInBalanceSheet);

if(linkOutPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 1,linkOutPutVatInBalanceSheet);
		exp1=linkOutPutVatInBalanceSheet.getText();
		Assert.assertEquals(exp1, "Output VAT");
		Reporter.log("Output VAT code '1102' verified in Balance Sheet",true);
	}
}
catch (Exception e) {
	Reporter.log("As a Taxation value '1102'is not available",true);
}
try
{
wLib.explicitWait(driver, 1,linkDefInPutVatInBalanceSheet);
	 if(linkDefInPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 1,linkDefInPutVatInBalanceSheet);
exp1=linkDefInPutVatInBalanceSheet.getText();
Assert.assertEquals(exp1, "Deferred Input VAT");
Reporter.log("Deffered Input VAT code '1103' verified in Balance Sheet",true);
}
}
catch (Exception e) {
	Reporter.log("As a Taxation value '1103'is not available",true);
}
wLib.explicitWait(driver, 2,linkCustmInBalanceSheet);
linkCustmInBalanceSheet.click();

exp2=linkCustomerInBalanceSheet.getText();

Assert.assertEquals(exp2, cust1);
Reporter.log("Cutomer code value verified in Balance Sheet",true);
wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
linkProfitLossInBalanceSheet.click();
wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
exp3=verifyProfitLossInBalanceSheet.getText();
Assert.assertEquals(exp3, "Profit/Loss");
Reporter.log("Profit and Loss code verified in Balance Sheet",true);
 }
 
 public void funcAddVATOnlyInvoice(WebDriver driver,String cust1,String invNo, String subTot,String note1) throws Exception 
 {
	 openIncome(driver);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,plusButtonBK);
	 plusButtonBK.click();
	 wLib.explicitWait(driver, 2,linkAddVATOnlyInvoice);
	 linkAddVATOnlyInvoice.click();
	 cp = new CISPage(driver);
	 cp.switchwindowNew(driver);
	 addCustomerFromDailog(driver,cust1);
	 wLib.explicitWait(driver, 2,serialNoTxtBox);
	 serialNoTxtBox.click();
	 serialNoTxtBox.clear();
	 serialNoTxtBox.sendKeys(invNo);
	 now = new Date();
	 wLib.explicitWait(driver, 2,invoiceDateTxtBox);
	 invoiceDateTxtBox.click();
	 invoiceDateTxtBox.clear();
	invoiceDateTxtBox.sendKeys(dateFormat1.format(now));
	value1=invoiceDateTxtBox.getAttribute("value");
	Reporter.log(value1,true);
	wLib.explicitWait(driver, 2,form1);
	form1.click();
	wLib.explicitWait(driver, 2,subTotalTxtBoxVat);
	subTotalTxtBoxVat.click();
	subTotalTxtBoxVat.sendKeys(subTot);
	
	 n1=Double.parseDouble(subTot);
	 total1=n1*vat1/100;
	 exp1=String.format("%.2f",(total1));
	 select= new Select(vatRateType);
	 select.selectByVisibleText("STD 20%");
	 wLib.explicitWait(driver, 2,vatAmountTxtBox);
	 value2=vatAmountTxtBox.getAttribute("value");
	 Assert.assertEquals(value2, exp1);
	 Reporter.log("VAT amount verified Successfully: "+value2,true);
	 total2=n1+total1;
	 exp2=String.format("%.2f",(total2));
	 wLib.explicitWait(driver, 2,grossTotalTxtBox);
	  value3=grossTotalTxtBox.getAttribute("value").replace(",","");
	 Assert.assertEquals(value3, exp2);
	 Reporter.log("Gross Total amount verified Successfully: "+value3,true);
	 wLib.explicitWait(driver, 2,Bank);
	 select=new Select(Bank);
	 select.selectByVisibleText("AIB Bank");
	 wLib.explicitWait(driver, 2,noteTxtBox);
	 noteTxtBox.click();
	 noteTxtBox.clear();
	 noteTxtBox.sendKeys(note1);
	 wLib.explicitWait(driver, 2,saveBtn);
	 saveBtn.click();
	 wLib.explicitWait(driver, 2,clickRecordInvoice);
	 clickRecordInvoice.click();
	 cp.switchwindowNew(driver);
	 wLib.explicitWait(driver, 2,debitInvoice);
	 Assert.assertEquals(debitInvoice.getText(), creditValueVat.getText());
	 Reporter.log("Debit and Credit value verified Successfully",true);
	 value1=debitInvoice.getText();
	 value2=creditValueVat.getText();
	 transNameLinkTransaction.click();
	 Assert.assertEquals(ledgerDebit.getText(),value1);
	 Reporter.log("Ledger Book cutomer's value verified Successfully",true);
	 Assert.assertEquals(ledgerCredit.getText(),ledgerDebit.getText());
	 Reporter.log("Ledger Book cutomer's Closing Balance's Debit and Credit values verified Successfully",true);
	 openIncome(driver);
	 wLib.explicitWait(driver, 2,clickRecordInvoice);
	 clickRecordInvoice.click();
	 cp.switchwindowNew(driver);
	 wLib.explicitWait(driver, 2,outputVatLink);
	 outputVatLink.click();
	 Assert.assertEquals(ledgerDebit.getText(),value2);
	 Reporter.log("Ledger Book Taxation's value verified Successfully",true);
	 Assert.assertEquals(ledgerBalance.getText().substring(2),ledgerDebit.getText().substring(1));
	 Reporter.log("Ledger Book Taxation's Closing Balance's Debit and Credit values verified Successfully",true);
	 wLib.explicitWait(driver, 2,linkReport);	 
	 linkReport.click();
	 wLib.explicitWait(driver, 2,linkLedgerReport);	 
	 linkLedgerReport.click();
	 wLib.explicitWait(driver, 2,lstBoxAccountType);	 
select = new Select(lstBoxAccountType);
select.selectByVisibleText("Taxation");
wLib.explicitWait(driver, 2,searchBtn);	 
searchBtn.click();
wLib.explicitWait(driver, 2,closingBalanceCredit);
Assert.assertEquals(ledgerDebit.getText().substring(1),closingBalanceCredit.getText().substring(2));
Reporter.log("Ledger report of Taxation Account type verified successfully",true);
select = new Select(lstBoxAccountType);
select.selectByVisibleText("Customer");
wLib.explicitWait(driver, 2,searchBtn);	 
searchBtn.click();
wLib.explicitWait(driver, 2,creditAmount1);	 
Assert.assertEquals(creditAmount1.getText(),balanceAmount.getText());
Reporter.log("Ledger report of Customer Account type verified successfully",true);
wLib.explicitWait(driver, 2,linkReport);	 
linkReport.click();
wLib.explicitWait(driver, 2,linkBalanceSheetReport);	 
linkBalanceSheetReport.click();
wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);	 
linkTaxationInBalanceSheet.click();

try
{
	wLib.explicitWait(driver, 2,linkDefOutPutVatInBalanceSheet);	
	if(linkDefOutPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 2,linkDefOutPutVatInBalanceSheet);
exp1=linkDefOutPutVatInBalanceSheet.getText();
Assert.assertEquals(exp1, "Deferred Output VAT");
Reporter.log("Deffered Output VAT code '1104' verified in Balance Sheet",true);
}}
	catch (Exception e) {
		Reporter.log("As a Taxation value '1104'is not available",true);
	}
try
{
	wLib.explicitWait(driver, 2,linkOutPutVatInBalanceSheet);

if(linkOutPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 2,linkOutPutVatInBalanceSheet);
		exp1=linkOutPutVatInBalanceSheet.getText();
		Assert.assertEquals(exp1, "Output VAT");
		Reporter.log("Output VAT code '1102' verified in Balance Sheet",true);
	}
}
catch (Exception e) {
	Reporter.log("As a Taxation value '1102'is not available",true);
}
try
{
wLib.explicitWait(driver, 2,linkDefInPutVatInBalanceSheet);
	 if(linkDefInPutVatInBalanceSheet.isDisplayed()==true)
	{
		wLib.explicitWait(driver, 2,linkDefInPutVatInBalanceSheet);
exp1=linkDefInPutVatInBalanceSheet.getText();
Assert.assertEquals(exp1, "Deferred Input VAT");
Reporter.log("Deffered Input VAT code '1103' verified in Balance Sheet",true);
}
}
catch (Exception e) {
	Reporter.log("As a Taxation value '1103'is not available",true);
}
wLib.explicitWait(driver, 2,linkCustmInBalanceSheet);
linkCustmInBalanceSheet.click();
wLib.explicitWait(driver, 2,linkCustomerInBalanceSheet);
exp2=linkCustomerInBalanceSheet.getText();
Assert.assertEquals(exp2, cust1);
Reporter.log("Cutomer code value verified in Balance Sheet",true);
wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
linkProfitLossInBalanceSheet.click();
wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
exp3=verifyProfitLossInBalanceSheet.getText();
Assert.assertEquals(exp3, "Profit/Loss");
Reporter.log("Profit and Loss code verified in Balance Sheet",true);
}
 public void delInvoice(WebDriver driver) throws Exception
 {
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 2,linkIncomeBK);
	 linkIncomeBK.click();
	 wLib.explicitWait(driver, 2,settingsBtn);
	 settingsBtn.click();
	 wLib.explicitWait(driver, 2,delBtn);
	 delBtn.click();
	 cp = new CISPage(driver);
	 cp.switchwindowNew(driver);
	 wLib.explicitWait(driver, 2,confirmDelBtn);
	 confirmDelBtn.click();
	 wLib.explicitWait(driver, 2,successMsg);
	 Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Invoice deleted successfully",true);
 }
 public void funcAddQuote(WebDriver driver,String cust1,String invNo,String Description1, String unitPrice1, String Quantity1) throws Exception 
 {
	 wLib = new WaitStatementLib();
	 cp = new CISPage(driver);
	
	 delQuotation(driver);
	 delCustomer(driver);
	 openIncome(driver);
	 wLib.explicitWait(driver, 2,plusButtonBK);
	 plusButtonBK.click();
	 wLib.explicitWait(driver, 2,linkAddQuote);
	 linkAddQuote.click();
	 cp.switchwindowNew(driver);
	 addCustomerFromDailog(driver,cust1);
	 Reporter.log("Customer added successfully",true);
	/* wLib.explicitWait(driver, 2, cancelBtn1);
	 cancelBtn1.click();
	 wLib.explicitWait(driver, 2,linkSettings);
	 linkSettings.click();
	 wLib.explicitWait(driver, 2,linkCustomerDetails);
	 linkCustomerDetails.click();
	 wLib.explicitWait(driver, 2,editCustomerBtn);
	 editCustomerBtn.click();
	 cp.switchwindowNew(driver);
	 wLib.explicitWait(driver,5,customerTypeLstBox);
	 select = new Select(customerTypeLstBox);
	 select.selectByVisibleText("EU Customer");
	 wLib.explicitWait(driver, 2,saveBtn);
	 saveBtn.click();
	 openIncome(driver);
	 wLib.explicitWait(driver, 2,plusButtonBK);
	 plusButtonBK.click();
	 wLib.explicitWait(driver, 2,linkAddQuote);
	 linkAddQuote.click();
	 cp.switchwindowNew(driver);*/
	 wLib.explicitWait(driver, 2,serialNoTxtBox);
	 serialNoTxtBox.click();
	 serialNoTxtBox.clear();
	 serialNoTxtBox.sendKeys(invNo);
	 now = new Date();
	 invoiceDateTxtBox.click();
	 invoiceDateTxtBox.clear();
	 invoiceDateTxtBox.sendKeys(dateFormat1.format(now));
	 date1=invoiceDateTxtBox.getAttribute("value");
	 Reporter.log("Quote Date:"+date1,true);
	 wLib.explicitWait(driver, 2,departmentLstBox);
	 select = new Select(departmentLstBox);
	 select.selectByVisibleText("IT");
	 /*wLib.explicitWait(driver, 2,supplyLstBox);
	 select = new Select(supplyLstBox);
	 select.selectByVisibleText("Services");*/
	 wLib.explicitWait(driver, 2,incomeTypeLstBox);
	 select = new Select(incomeTypeLstBox);
	 select.selectByVisibleText("Sale");
	 wLib.explicitWait(driver, 2,vatRateTypeLstBox);
	 select= new Select(vatRateTypeLstBox);
	 select.selectByVisibleText("STD 20%");
	 unitPriceTxtBox.sendKeys(unitPrice1);
	 wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(unitPriceTxtBox, "value"));
	 value1=unitPriceTxtBox.getAttribute("value");
	 wLib.explicitWait(driver, 2,quantityTxtBox);
	 quantityTxtBox.click();
	 quantityTxtBox.sendKeys(Quantity1);
	 wLib.explicitWait(driver, 2,vATRateTxtBox);
	 vATRateTxtBox.click();
	 wLib.explicitWait(driver, 2,descriptionTxtBox);
	 descriptionTxtBox.sendKeys(Description1);
	 wait = new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(quantityTxtBox, "value"));
	 value2=quantityTxtBox.getAttribute("value");
	 
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATRateTxtBox, "value"));
	 value4=vATRateTxtBox.getAttribute("value");
	 
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(vATAmountTxtBox, "value"));
	 value5=vATAmountTxtBox.getAttribute("value").substring(1).replace(",", "");
	
	 wait.until(ExpectedConditions.attributeToBeNotEmpty(amountTxtBox, "value"));
	 value6=amountTxtBox.getAttribute("value").substring(1).replace(",", "");
	 n1=Double.parseDouble(value1);
	 n2=Double.parseDouble(value2);
	 total1=n1*n2;
	 total2=(total1*vat1/100);
	 total3=total1+total2;
	 exp1=String.format("%.2f",(total2));
	 exp2=String.format("%.2f",(total3));
	 try {

	 	assertEquals(value5, exp1);
	 	Reporter.log("VAT Amount is verified: "+value5,true);
	 	assertEquals(value6, exp2);
	 	Reporter.log("Total invoice amount is verified: "+value6,true);

	 }
	 catch (Exception e) {
		 Reporter.log("VAT Amount detected: "+ value5,true);
		 Reporter.log("Total invoice amount detected: "+ value6,true);
	 }
	 exp3=subTotalTxtBox.getAttribute("value").replace(",", "");
	 select=new Select(Bank);
	 select.selectByVisibleText("AIB Bank");
	 wLib.explicitWait(driver, 2,saveBtn);
	 saveBtn.click();
	 try
	 {
		
		 wLib.explicitWait(driver, 2,linkConfirmEntry);
		if(linkConfirmEntry.isDisplayed()==false)
		do {
			wLib.explicitWait(driver, 2,saveBtn);
		 saveBtn.click();
		
		}while (linkConfirmEntry.isDisplayed()==false);
	 }
	 catch (Exception e) {
		 Reporter.log("Save Button already clicked",true);
	}
	 wLib.explicitWait(driver, 2,successMsg);
	 Assert.assertEquals(successMsg.getText(), "Success!");
	 Reporter.log("Quotation added successfully",true);
	
	 wLib.explicitWait(driver, 2,linkConfirmEntry);
	 linkConfirmEntry.click();
	 Reporter.log("Link of Confirm Entry clicked successfully",true);
	 verifyViewQuotationsLink.click();
	 try
	 {
		 if(quotationTitle.isDisplayed()==false)
		do {
			 verifyViewQuotationsLink.click();
		 }while(quotationTitle.isDisplayed()==false);
	 }
	 catch (Exception e) {
		Reporter.log("Verify quotation page opened in first click");
	}
	 Reporter.log("Link of Verify View Quotations clicked successfully",true);
	 wLib.explicitWait(driver, 2,displayQuotationCode);
	 Assert.assertEquals(displayQuotationCode.getText(),invNo);
	 Reporter.log("Quotation Code is verified Successfully: "+displayQuotationCode.getText(),true);
	 wLib.explicitWait(driver, 2,custNameQutation);
	 Assert.assertEquals(custNameQutation.getText(), cust1+" ");
	Reporter.log("Customer name for Qutation is verified Successfully: "+custNameQutation.getText(),true);
	wLib.explicitWait(driver, 2,subTotalQutation);
	Assert.assertEquals(subTotalQutation.getText(),exp3);
	Reporter.log("Subtotal for Qutation is verified Successfully: "+subTotalQutation.getText(),true);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,VATAmountQutation);
	Assert.assertEquals(VATAmountQutation.getText().substring(1).replace(",", ""),value5);
	Reporter.log("Subtotal for Qutation is verified Successfully: "+VATAmountQutation.getText(),true);
	wLib.explicitWait(driver, 2,totalQutation);
	Assert.assertEquals(totalQutation.getText().substring(1).replace(",", ""),value6);
	Reporter.log("Subtotal for Qutation is verified Successfully: "+totalQutation.getText(),true);
	
 }
public void delQuotation(WebDriver driver)throws Exception {
	openIncome(driver);
	 wLib = new WaitStatementLib();
	 wLib.explicitWait(driver, 1,linkConfirmEntry);
	linkConfirmEntry.click();
	try
	{
		if(verifyViewQuotationsLink.isDisplayed()==false)
		do
		{ 
		 wLib.explicitWait(driver, 1,linkConfirmEntry);
			linkConfirmEntry.click();	
		}while(verifyViewQuotationsLink.isDisplayed()==false);
		
	}
	catch (Exception e) {
		Reporter.log("Confirm entry Link open in first click only",true);
	}
	 wLib.explicitWait(driver,1,verifyViewQuotationsLink);
	verifyViewQuotationsLink.click();
	delTransaction(driver);
	Reporter.log("Qutoation deleted successfully",true);
}
public void addSubContractor(WebDriver driver,String supplierName, String billNo, String grossTot, String vatAmt, String material, String note1)throws Exception 
{
	wLib = new WaitStatementLib();
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkAddSubContractorBill);
	linkAddSubContractorBill.click();
	
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	addSupplierThroughDailog(driver, supplierName);
	wLib.explicitWait(driver, 2,ddCISRateLstBox);
	select = new Select(ddCISRateLstBox);
	 select.selectByVisibleText("20% CIS Rate");
	 wLib.explicitWait(driver, 2,addNewBtn);
	addNewBtn.click();
	 wLib.explicitWait(driver, 2,BillNo);
	BillNo.clear();
	BillNo.sendKeys(billNo);
	grossTotalTxtBox.click();
	wLib.explicitWait(driver, 2,grossTotalTxtBox);
	grossTotalTxtBox.clear();
	grossTotalTxtBox.sendKeys(grossTot);
	wLib.explicitWait(driver, 2,vatAmountTxtBox);
	vatAmountTxtBox.click();
	vatAmountTxtBox.clear();
	vatAmountTxtBox.sendKeys(vatAmt);
	n1 = Double.parseDouble(grossTot);
	n2 = Double.parseDouble(vatAmt);
	wLib.explicitWait(driver, 2,subTotalTxtBoxVat);
	subTotalTxtBoxVat.click();
	wLib.explicitWait(driver, 2,subTotalTxtBoxVat);
	value1=subTotalTxtBoxVat.getAttribute("value");
	Reporter.log("Sub Total Value: "+value1,true);
	wLib.explicitWait(driver, 2,materialTxtBox);
	materialTxtBox.click();
	materialTxtBox.clear();
	materialTxtBox.sendKeys(material);
	wLib.explicitWait(driver, 2,labourTxtBox);
	labourTxtBox.click();
	wLib.explicitWait(driver, 2,labourTxtBox);
	value4=labourTxtBox.getAttribute("value");
	
	Reporter.log("Lobour Amount: "+value4,true);
	wLib.explicitWait(driver, 2,cISAmountTxtBox);
	cISAmountTxtBox.click();
	wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.attributeToBeNotEmpty(cISAmountTxtBox, "value"));

	value3=cISAmountTxtBox.getAttribute("value").replace(".00", "");
	
	Reporter.log("CIS Amount: "+value3,true);
	wLib.explicitWait(driver, 2,payableTxtBox);
	payableTxtBox.click();
	wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.attributeToBeNotEmpty(payableTxtBox, "value"));
	value2=payableTxtBox.getAttribute("value");
	Reporter.log("Payable Amount: "+value2,true);
	n3 = Double.parseDouble(value1);//subTotalTxtBoxVat
	n4 = Double.parseDouble(value2);//payableTxtBox
	n5 = Double.parseDouble(value3);//cISAmountTxtBox
	n6 = Double.parseDouble(value4);//labourTxtBox
	n7=Double.parseDouble(material); 
	Assert.assertEquals(n3, (n1-n2));
	Reporter.log("Sub Total verified Successfully: "+n3,true);
	Assert.assertEquals(n5,((n3-n7)*vat1/100));
	Reporter.log("CIS Amount verified Successfully: "+n5,true);
	Assert.assertEquals(n4,(n1-n5));
	Reporter.log("Payable amount verified Successfully: "+n4,true);
	Assert.assertEquals(n6,(n3-n7));
	Reporter.log("Labour Amount verified Successfully: "+n6,true);
	wLib.explicitWait(driver, 2,noteTxtBox);
	noteTxtBox.sendKeys(note1);
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Sub Contractor added Successfully",true);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,subContractorSuppliercredit);
	Assert.assertEquals(subContractorSuppliercredit.getText().substring(1).replace(",", "").replace(".00", ""),grossTot);
	Reporter.log("Sullpier Credit value verified Successfully",true);
	Assert.assertEquals(subContractorCISPayblevalue.getText().substring(1).replace(",", "").replace(".00", ""), value3);
	Reporter.log("Sub contractor CIS value verified Successfully",true);
	Assert.assertEquals(subContractorSupplierDebitValue.getText().substring(1).replace(",", "").replace(".00", ""), value3);
	Reporter.log("Sub Contractor Supplier Debit value verified Successfully",true);
	Assert.assertEquals(subContractorInputVatValue.getText().substring(1).replace(",", "").replace(".00", ""),vatAmt);
	Reporter.log("Sub Contractor Input VAT value verified  Successfully",true);
	Assert.assertEquals(subContractorLabourValue.getText().substring(1).replace(",", "").replace(".00", ""),value4);
	Reporter.log("Sub Contractor Labour value verified  Successfully",true);
	Assert.assertEquals(subContractorMaterialValue.getText().substring(1).replace(",", "").replace(".00", ""),material);
	Reporter.log("Sub Contractor Material verified Successfully",true);
	wLib.explicitWait(driver, 2,supplierNameInTransaction);
	supplierNameInTransaction.click();
	
	try
	{
		
		wLib.explicitWait(driver, 2,closingBalanceCredit);
		if (closingBalanceCredit.isDisplayed()==false)
		{
			do
			{
				wLib.explicitWait(driver, 2,supplierNameInTransaction);
				supplierNameInTransaction.click();
					}while(closingBalanceCredit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Supplier Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1) ,ledgerCredit.getText().substring(2));
	Reporter.log("Ledger Value for Supplier verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,inputVATInTransaction);
	inputVATInTransaction.click();
	
	try
	{
		wLib.explicitWait(driver, 2,ledgerDebit);
		if (ledgerDebit.isDisplayed()==false)
		{
			do
			{
			wLib.explicitWait(driver, 2,inputVATInTransaction);	
			inputVATInTransaction.click();
			}while(ledgerDebit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("CIS Payable Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(ledgerDebit.getText().substring(1), closingBalanceCredit.getText().substring(2));
	Reporter.log("Ledger Value for Taxation verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,subContractorSupplier);
	subContractorSupplier.click();
	
	try
	{
		wLib.explicitWait(driver, 2,closingBalanceCredit);
		if (closingBalanceCredit.isDisplayed()==false)
		{
			do
			{
				wLib.explicitWait(driver, 2,subContractorSupplier);
				subContractorSupplier.click();
			
			}while(closingBalanceCredit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Supplier Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1) ,ledgerCredit.getText().substring(2));
	Reporter.log("Ledger Value of Closing balance for Supplier verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,subContractorInputvat);
	subContractorInputvat.click();
	try
	{
		wLib.explicitWait(driver, 2,closingBalanceDebit);
		if (closingBalanceDebit.isDisplayed()==false)
		{
			do
			{
			wLib.explicitWait(driver, 2,subContractorInputvat);	
			subContractorInputvat.click();
			
			}while(closingBalanceDebit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Input VAT Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText() , closingBalanceCredit.getText());
	Reporter.log("Ledger Value for Taxation for Input VAT verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,subContractorLabour);
	subContractorLabour.click();
	
	try
	{
		wLib.explicitWait(driver, 2,closingBalanceDebit);
		if (closingBalanceDebit.isDisplayed()==false)
		{
			do
			{
			wLib.explicitWait(driver, 2,subContractorLabour);	
			subContractorLabour.click();
			}while(closingBalanceDebit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Labour Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText() , closingBalanceCredit.getText());
	Reporter.log("Ledger Value for Taxation for Labour verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,subContractorMaterial);
	subContractorMaterial.click();
	try
	{
		wLib.explicitWait(driver, 2,closingBalanceDebit);
		if (closingBalanceDebit.isDisplayed()==false)
		{
			do
			{
			wLib.explicitWait(driver, 2,subContractorMaterial);	
			subContractorMaterial.click();
			}while(closingBalanceDebit.isDisplayed()==false);
		}
	}
	catch (Exception e) {
		Reporter.log("Material Link clicked in first time only",true);
	}
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText() , closingBalanceCredit.getText());
	Reporter.log("Ledger Value for Taxation for Material verified successfully ",true);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
	linkTaxationInBalanceSheet.click();
	
	try
	{
	wLib.explicitWait(driver, 2,linkCSPayableInBalanceSheet);	
	if(linkCSPayableInBalanceSheet.isDisplayed()==true)
		{
	wLib.explicitWait(driver, 2,linkCSPayableInBalanceSheet);	
	exp1=linkCSPayableInBalanceSheet.getText();
	Assert.assertEquals(exp1, "CIS payable");
	Reporter.log("CIS Payable code verified in Balance Sheet",true);
	}
	}
	catch (Exception e) {
		Reporter.log("CIS Payable code value is not available",true);
	}
	try
	{
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);	
	if(linkInputVATInBalanceSheet.isDisplayed()==true)
		{
		
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);	
	exp1=linkInputVATInBalanceSheet.getText();
	Assert.assertEquals(exp1, "Input VAT");
	Reporter.log("Input VAT code verified in Balance Sheet",true);
	}
	}
	catch (Exception e) {
		Reporter.log("Taxation value is not available",true);
	}
	wLib.explicitWait(driver, 2,balanceSheetSupplierLink);
	balanceSheetSupplierLink.click();
	wLib.explicitWait(driver, 2,linkSupplierControllerAccountInBalanceSheet);
	exp2=linkSupplierControllerAccountInBalanceSheet.getText();
	Assert.assertEquals(exp2, supplierName);
	Reporter.log("Supplier Controller Account code value verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
	linkProfitLossInBalanceSheet.click();
	wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
	exp3=verifyProfitLossInBalanceSheet.getText();
	Assert.assertEquals(exp3, "Profit/Loss");
	Reporter.log("Profit and Loss code verified in Balance Sheet",true);
}
public void funcAddSupplier(WebDriver driver,String supplierName)throws Exception  {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,linkSettings);
	 linkSettings.click();
	 wLib.explicitWait(driver, 2,linkSupplier);
	linkSupplier.click();
	wLib.explicitWait(driver, 2,linkAddBtn);	
	linkAddBtn.click();
	cp = new CISPage(driver);
	
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,supplierNameTxtBox);	
	supplierNameTxtBox.clear();
	supplierNameTxtBox.sendKeys(supplierName);
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Supplier Added successfully",true);
}
public void funcAddSupplierBillBatchEntry(WebDriver driver,String supplierName, String billNo,String dsc, String grossTot, String vatAmt)throws Exception 
{
	wLib = new WaitStatementLib();
	funcAddSupplier(driver,supplierName );
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkSuppluerBillBatch);
	linkSuppluerBillBatch.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,supplierlistbox1);
	select = new Select(supplierlistbox1);
	select.selectByVisibleText(supplierName);
	select = new Select(typeLstBox1);
	select.selectByVisibleText("Bill VAT");
	BillNoTxtbox1.clear();
	BillNoTxtbox1.sendKeys(billNo);
	supplierDescriptionTxtBox1.clear();
	supplierDescriptionTxtBox1.sendKeys(dsc);
	totalTxtbox1.clear();
	totalTxtbox1.sendKeys(grossTot);
	vat1Txtbox1.clear();
	vat1Txtbox1.sendKeys(vatAmt);
	select = new Select(Expensetype);
	select.selectByVisibleText("Insurance");
	select = new Select(supplierlistbox2);
	select.selectByVisibleText(supplierName);
	select = new Select(typeLstBox2);
	select.selectByVisibleText("Bill VAT");
	BillNoTxtbox2.clear();
	BillNoTxtbox2.sendKeys(billNo);
	supplierDescriptionTxtBox2.clear();
	supplierDescriptionTxtBox2.sendKeys(dsc);
	totalTxtbox2.clear();
	totalTxtbox2.sendKeys(grossTot);
	vat1Txtbox2.clear();
	vat1Txtbox2.sendKeys(vatAmt);
	select = new Select(expenseTypeAssetTxtbox2);
	select.selectByVisibleText("Business entertaining");
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	
	try
	{
		wLib.explicitWait(driver, 2,linkDisplayRecords);
		if (linkDisplayRecords.isDisplayed()==false)
		do{
			wLib.explicitWait(driver, 2,saveBtn);
			saveBtn.click();	
		}while(linkDisplayRecords.isDisplayed()==false);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Supplier Bill / Debit Note - Batch Entry added Successfully",true);
	n1=Double.parseDouble(grossTot);
	n2=Double.parseDouble(vatAmt);
	total1 = n1-n2;
	value1=String.format("%.2f",total1);
	wLib.explicitWait(driver, 2,linkDisplayRecords);
	linkDisplayRecords.click();
	
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,creditNoteCreditValue);
	Assert.assertEquals(creditNoteCreditValue.getText().substring(1).replace(",",""), vatAmt);//creditNoteCreditValue - Credit -500
	Reporter.log("Supplier's Credit Value verified successfully",true);
	Assert.assertEquals(inputVATDebitAmount.getText().substring(1).replace(",",""), vatAmt);//inputVATDebitAmount - 500 -debit
	Reporter.log("Input VAT value verified successfully",true);
	transNameLinkTransaction.click(); //- Supplier1
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Supplier's value in Ledger Book verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,linkDisplayRecords);
	linkDisplayRecords.click();
	
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,linkInputVATVat);
	linkInputVATVat.click(); //- Input VAT - outputVatLink
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText() , closingBalanceCredit.getText());
	Reporter.log("taxation's value in Ledger Book verified successfully ",true);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
	linkTaxationInBalanceSheet.click();
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);
	exp1=linkInputVATInBalanceSheet.getText();
	Assert.assertEquals(exp1, "Input VAT");
	Reporter.log("Input VAT code verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,balanceSheetSupplierLink);
	balanceSheetSupplierLink.click();
	wLib.explicitWait(driver, 2,linkSupplierControllerAccountInBalanceSheet);
	exp2=linkSupplierControllerAccountInBalanceSheet.getText();
	Assert.assertEquals(exp2, supplierName);
	Reporter.log("Supplier Controller Account code value verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
	linkProfitLossInBalanceSheet.click();
	wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
	exp3=verifyProfitLossInBalanceSheet.getText();
	Assert.assertEquals(exp3, "Profit/Loss");
	Reporter.log("Profit and Loss code verified in Balance Sheet",true);
}
public void delSupplierBillBatchEntry(WebDriver driver)throws Exception 
{
	openExpensesLink(driver);
	delTransaction(driver);
	delTransaction(driver);
	delSupplier(driver);
}
public void addSupplierThroughExpense(WebDriver driver,String supplierName)throws Exception 
{
	wLib = new WaitStatementLib();
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkAddSupplier);
	linkAddSupplier.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,supplierNameTxtBox);
	supplierNameTxtBox.sendKeys(supplierName);
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver, 2,successMsg);
	Assert.assertEquals(successMsg.getText(), "Success!");
	Reporter.log("Supplier Information added Successfully",true);
	
	wLib.explicitWait(driver, 2,linkSettings);
	linkSettings.click();
	wLib.explicitWait(driver, 2,linkSupplier);
	linkSupplier.click();
	wLib.explicitWait(driver, 2,body);	
	bodyText = body.getText();
	if (bodyText.contains(supplierName)==true){
		 Reporter.log("Supplier "+supplierName+" added successfully",true);
		}	
}
public void addDebitNote(WebDriver driver,String supplier1, String billNo, String Description1,String unitPrice1)throws Exception
{
	openExpensesLink(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkAddDebitNote);
	linkAddDebitNote.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	addSupplierThroughDailog(driver, supplier1);
	wLib.explicitWait(driver, 2,ddCISRateLstBox);
	select = new Select(ddCISRateLstBox);
	select.selectByVisibleText("20% CIS Rate");
	wLib.explicitWait(driver, 2,addNewBtn);
	addNewBtn.click();
	addAccount(driver,billNo,Description1,unitPrice1);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver, 2,debitAmountTransaction);
	Assert.assertEquals(debitAmountTransaction.getText().substring(1), unitPrice1);
	Reporter.log("Supplier's Debit value verified successfully ",true);	
	wLib.explicitWait(driver, 2,subContractorCISPayblevalue);
	Assert.assertEquals(subContractorCISPayblevalue.getText().substring(1),value2);
	Reporter.log("Credit amount for Input VAT verified successfully ",true);
	wLib.explicitWait(driver, 2,creditAmountExpense);
	Assert.assertEquals(creditAmountExpense.getText().substring(1),value1);
	Reporter.log("Credit amount for Expenses type verified successfully ",true);
	wLib.explicitWait(driver, 2,transNameLinkTransaction);
	transNameLinkTransaction.click();
	wLib.explicitWait(driver, 2,ledgerDebit);
	Assert.assertEquals(ledgerDebit.getText(),ledgerCredit.getText());
	Reporter.log("Ledger Value for account verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,linkInputVATVat);
	linkInputVATVat.click();
	wLib.explicitWait(driver, 2,creditValueTaxationCreditNote);
	Assert.assertEquals(creditValueTaxationCreditNote.getText().substring(1),ledgerBalance.getText().substring(2));
	Reporter.log("Ledger Value for Taxation verified successfully ",true);	
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,linkExpenseType);
	linkExpenseType.click();
	wLib.explicitWait(driver, 2,creditValueTaxationCreditNote);
	Assert.assertEquals(creditValueTaxationCreditNote.getText().substring(1),ledgerBalance.getText().substring(2));
	Reporter.log("Ledger Value for Cost of Sale verified successfully ",true);
	delSupplier(driver);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkLedgerReport);
	linkLedgerReport.click();
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Supplier");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib.explicitWait(driver, 2,accountLstBox);
	select = new Select(accountLstBox);
	select.selectByVisibleText(supplier1);
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2,ledgerDebit);
	Assert.assertEquals(ledgerDebit.getText(),ledgerCredit.getText());
	Reporter.log("Ledger Value for account verified successfully ",true);
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Taxation");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	select = new Select(accountLstBox);
	select.selectByVisibleText("Input VAT");
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2,creditValueTaxationCreditNote);
	Assert.assertEquals(creditValueTaxationCreditNote.getText().substring(1),ledgerBalance.getText().substring(2));
	Reporter.log("Ledger Value for Taxation verified successfully ",true);	
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Cost of Sale");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	select = new Select(accountLstBox);
	select.selectByVisibleText("Purchases");
	wLib.explicitWait(driver, 2,searchBtn);
	searchBtn.click();
	wLib.explicitWait(driver, 2,creditValueTaxationCreditNote);
	Assert.assertEquals(creditValueTaxationCreditNote.getText().substring(1),ledgerBalance.getText().substring(2));
	Reporter.log("Ledger Value for Cost of Sale verified successfully ",true);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
	linkTaxationInBalanceSheet.click();
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);
	exp1=linkInputVATInBalanceSheet.getText();
	Assert.assertEquals(exp1, "Input VAT");
	balanceSheetSupplierLink.click();
	wLib.explicitWait(driver, 2,linkSupplierControllerAccountInBalanceSheet);
	exp2=linkSupplierControllerAccountInBalanceSheet.getText();
	Assert.assertEquals(exp2, supplier1);
	Reporter.log("Supplier Controller Account code value verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
	linkProfitLossInBalanceSheet.click();
	wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
	exp3=verifyProfitLossInBalanceSheet.getText();
	Assert.assertEquals(exp3, "Profit/Loss");
	Reporter.log("Profit and Loss code verified in Balance Sheet",true);
}
public void addVATOnlySupplierBill(WebDriver driver,String supplier1,String invNo,String subTot,String note1)throws Exception
{
	openExpensesLink(driver);
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,2,plusButtonBK);
	plusButtonBK.click();
	wLib.explicitWait(driver, 2,linkAddVATSupplier);
	linkAddVATSupplier.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	addSupplierThroughDailog(driver, supplier1);
	wLib.explicitWait(driver, 2,ddCISRateLstBox);
	select = new Select(ddCISRateLstBox);
	select.selectByVisibleText("20% CIS Rate");
	wLib.explicitWait(driver, 2,addNewBtn);
	addNewBtn.click();
	wLib.explicitWait(driver, 2,serialNoTxtBox);
	serialNoTxtBox.click();
	serialNoTxtBox.clear();
	serialNoTxtBox.sendKeys(invNo);
	subTotalTxtBoxVat.clear();
	subTotalTxtBoxVat.sendKeys(subTot);
	n1=Double.parseDouble(subTot);
	total1=n1*vat1/100;
	exp1=String.format("%.2f",(total1));
	select= new Select(vatRateType);
	select.selectByVisibleText("STD 20%");
	wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.attributeToBeNotEmpty(vatAmountTxtBox, "value"));
	value2=vatAmountTxtBox.getAttribute("value");
	Assert.assertEquals(value2, exp1);
	Reporter.log("VAT amount verified Successfully: "+value2,true);
	total2=n1+total1;
	exp2=String.format("%.2f",(total2));
	wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.attributeToBeNotEmpty(grossTotalTxtBox, "value"));
	value3=grossTotalTxtBox.getAttribute("value").replace(",","");
	Assert.assertEquals(value3, exp2);
	Reporter.log("Gross Total amount verified Successfully: "+value3,true);
	wLib.explicitWait(driver, 2,noteTxtBox);
	noteTxtBox.click();
	noteTxtBox.clear();
	noteTxtBox.sendKeys(note1);
	wLib.explicitWait(driver, 2,saveBtn);
	saveBtn.click();
	wLib.explicitWait(driver,2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,creditAmountTransaction);
	Assert.assertEquals(creditAmountTransaction.getText().substring(1), value2);
	Reporter.log("Supplier's Credit value verified successfully ",true);	
	Assert.assertEquals(debitAmountVat.getText(),creditAmountTransaction.getText());
	Reporter.log("Input Vat value verified successfully ",true);
	supplierNameInTransaction.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Supplier's Closing Blance in Ledger Book verified successfully ",true);
	openExpensesLink(driver);
	wLib.explicitWait(driver, 2,transactionNoSupplierBill);
	transactionNoSupplierBill.click();
	
	cp = new CISPage(driver);
	cp.switchwindowNew(driver);
	wLib.explicitWait(driver, 2,inputVATInTransaction);
	inputVATInTransaction.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText(),closingBalanceCredit.getText());
	Reporter.log("Taxation's Closing Blance in Ledger Book verified successfully ",true);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkLedgerReport);
	linkLedgerReport.click();
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Supplier");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib.explicitWait(driver, 2,accountLstBox);
	select = new Select(accountLstBox);
	select.selectByVisibleText(supplier1);
	searchBtn.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceCredit.getText().substring(1),ledgerCredit.getText().substring(2));
	Reporter.log("Supplier's Closing Blance in Ledger Book verified successfully ",true);
	wLib.explicitWait(driver, 2,lstBoxAccountType);
	select = new Select(lstBoxAccountType);
	select.selectByVisibleText("Taxation");
	wLib.explicitWait(driver, 2,linkLedgerBook);
	linkLedgerBook.click();
	wLib.explicitWait(driver, 2,accountLstBox);
	select = new Select(accountLstBox);
	select.selectByVisibleText("Input VAT");
	searchBtn.click();
	wLib.explicitWait(driver, 2,closingBalanceCredit);
	Assert.assertEquals(closingBalanceDebit.getText(),closingBalanceCredit.getText());
	Reporter.log("Taxation's Closing Blance in Ledger Book verified successfully ",true);
	wLib.explicitWait(driver, 2,linkReport);
	linkReport.click();
	wLib.explicitWait(driver, 2,linkBalanceSheetReport);
	linkBalanceSheetReport.click();
	wLib.explicitWait(driver, 2,linkTaxationInBalanceSheet);
	linkTaxationInBalanceSheet.click();
	wLib.explicitWait(driver, 2,linkInputVATInBalanceSheet);
	exp1=linkInputVATInBalanceSheet.getText();
	Assert.assertEquals(exp1, "Input VAT");
	wLib.explicitWait(driver, 2,balanceSheetSupplierLink);
	balanceSheetSupplierLink.click();
	wLib.explicitWait(driver, 2,linkSupplierControllerAccountInBalanceSheet);
	exp2=linkSupplierControllerAccountInBalanceSheet.getText();
	Assert.assertEquals(exp2, supplier1);
	Reporter.log("Supplier Controller Account code value verified in Balance Sheet",true);
	wLib.explicitWait(driver, 2,linkProfitLossInBalanceSheet);
	linkProfitLossInBalanceSheet.click();
	wLib.explicitWait(driver, 2,verifyProfitLossInBalanceSheet);
	exp3=verifyProfitLossInBalanceSheet.getText();
	Assert.assertEquals(exp3, "Profit/Loss");
	Reporter.log("Profit and Loss code verified in Balance Sheet",true);
}


	    
}

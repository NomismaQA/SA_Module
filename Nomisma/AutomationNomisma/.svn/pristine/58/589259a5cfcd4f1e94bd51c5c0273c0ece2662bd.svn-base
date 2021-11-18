package com.nomisma.pom;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;

public class VatPage {

	@FindBy(xpath ="//span[contains(text(),'Invoice')]")
	private WebElement lnkInvoice;
	
	@FindBy(xpath ="//span[contains(text(),'Income')]")
	private WebElement lnkIncome;
	
	//@FindBy(xpath ="/html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[2]")
	@FindBy(xpath ="//div[@class='dropdown search_filter_each dashOpt-e fa fa-bars']")
	private WebElement ddlInvOptions;
	//@FindBy(xpath ="//a[contains(text(),'Customer List')]")
	//@FindBy(xpath ="/html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[2]/div[1]/a[1]")
	@FindBy(xpath ="//a[contains(text(),'Customer List')]")
	private WebElement LnkCustomerList;
	@FindBy(xpath ="//h2[contains(text(),'Customer')]")
	private WebElement CustomerListTitleAct;
	@FindBy(id ="ctl00_cpHeaderRight_btnAdd")
	private WebElement btnAddCustomer;
	@FindBy(xpath ="//h2")
	private WebElement TitleAct;
	@FindBy(xpath ="//h2[contains(text(),'Supplier Bill')]")
	private WebElement TitleActSuppBill;
	@FindBy(xpath ="//h2[contains(text(),'Bank & CreditCard Transactions')]")
	private WebElement TitleActBankCCTrans;
	@FindBy(xpath ="//h2[contains(text(),'Invoice')]")
	private WebElement TitleActInvoice;
	@FindBy(xpath ="//h2[contains(text(),'Account Reconcile')]")
	private WebElement TitleAccReconcile;
	@FindBy(xpath ="//h2[contains(text(),'VAT Returns')]")
	private WebElement TitleActVAT;
	
	@FindBy(id ="ctl00_cPH_txtCustomerName")
	private WebElement txtCustomerName;
	@FindBy(id ="ctl00_cPH_ddCurrency")
	private WebElement ddCurrency;
	@FindBy(id ="ctl00_cPH_ddLedger")
	private WebElement ddLedger;
	
	@FindBy(id ="ctl00_cPH_ddCustomerType")
	private WebElement ddCustomerType;
	@FindBy(id ="ctl00_cPH_ddCustomerBusinessType")
	private WebElement ddCustomerBusinessType;
	@FindBy(id ="ctl00_cPH_rblVatNoSupplied_0")
	private WebElement rblVatNoSupplied;
	@FindBy(id ="ctl00_cPH_rblVatNoSupplied_1")
	private WebElement rblVatNoSupplied_1;
	@FindBy(id ="ctl00_cPH_txtVat")
	private WebElement txtVat;
	@FindBy(id ="ctl00_cPH_ddDepartment")
	private WebElement ddDepartment;
	@FindBy(id ="ctl00_cPH_ddPayment")
	private WebElement ddPayment;
	@FindBy(id ="ctl00_cPH_txtRef")
	private WebElement txtRef;
	@FindBy(id ="ctl00_cPH_txtEmail")
	private WebElement txtEmail;
	@FindBy(id ="ctl00_cPH_txtAddress1")
	private WebElement txtAddress1;
	@FindBy(id ="ctl00_cPH_txtAddress2")
	private WebElement txtAddress2;
	@FindBy(id ="ctl00_cPH_txtAddress3")
	private WebElement txtAddress3;
	@FindBy(id ="ctl00_cPH_txtAddress4")
	private WebElement txtAddress4;
	@FindBy(id ="ctl00_cPH_txtPostCode")
	private WebElement txtPostCode;
	@FindBy(id ="ctl00_cPH_ddCountry")
	private WebElement ddCountry;
	@FindBy(id ="ctl00_cPH_txtContactName")
	private WebElement txtContactName;
	@FindBy(id ="ctl00_cPH_txtContactLastName")
	private WebElement txtContactLastName;
	@FindBy(id ="ctl00_cPH_txtPhone")
	private WebElement txtPhone;
	@FindBy(id ="ctl00_cPH_txtFax")
	private WebElement txtFax;
	@FindBy(id ="ctl00_cphFooter_btnCancel")
	private WebElement btnCancelCustomer;
	@FindBy(id ="ctl00_cphFooter_btnSave")
	private WebElement btnSaveCustomer;
	
	@FindBy(id ="search_input")
	private WebElement SearchCompany;
	@FindBy(xpath ="//a[@id='ui-id-2']")
	private WebElement SelectCompany;
	
	
	// Add Invoice
	@FindBy(xpath ="//div[@class='dropdown search_filter_each dashOpt-e fa fa-plus']")
	private WebElement ddlAddOptions;
	@FindBy(id ="ctl00_cpHeaderRight_btnAdd")
	private WebElement btnAddInvoice;
	
	@FindBy(id ="ctl00_cPH_ddlCustomer")
	private WebElement ddlCustomer;
	
//	ctl00_cPH_chkNonVATInvoice
//	ctl00_cPH_rptrProduct_ctl00_ddProduct
//	ctl00_cPH_rptrProduct_ctl00_txtDescription
//	ctl00_cPH_rptrProduct_ctl00_txtUnitPrice
//	ctl00_cPH_rptrProduct_ctl00_txtQuantity
//	ctl00_cPH_rptrProduct_ctl00_txtDiscountRate
//	ctl00_cPH_rptrProduct_ctl00_ddVATRate
//	ctl00_cPH_rptrProduct_ctl00_hrefClear //delete
//	
//	ctl00_cPH_rptrProduct_ctl01_ddProduct
//	ctl00_cPH_rptrProduct_ctl01_txtDescription
//	ctl00_cPH_rptrProduct_ctl01_txtUnitPrice
//	ctl00_cPH_rptrProduct_ctl01_txtQuantity
//	ctl00_cPH_rptrProduct_ctl01_txtDiscountRate
//	ctl00_cPH_rptrProduct_ctl01_ddVATRate
//	ctl00_cPH_rptrProduct_ctl01_hrefClear //delete
//	
//	ctl00_cPH_chkAddMore
//	
//	
//	ctl00_cPH_txtRetentionRate
//	ctl00_cPH_txtRetentionAmount
	
	
	@FindBy(id ="ctl00_cPH_chkNonVATInvoice")
	private WebElement chkNonVATInvoice;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_ddProduct")
	private WebElement ddProduct;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_txtDescription")
	private WebElement txtDescription;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_txtUnitPrice")
	private WebElement txtUnitPrice;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_txtQuantity")
	private WebElement txtQuantity;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_txtDiscountRate")
	private WebElement txtDiscountRate;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_txtDiscountAmount")
	private WebElement DiscountAmount;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_ddVATRate")
	private WebElement ddVATRate;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_hrefClear")
	private WebElement hrefClear; //delete
	
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_ddProduct")
	private WebElement ddProduct2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_txtDescription")
	private WebElement txtDescription2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_txtUnitPrice")
	private WebElement txtUnitPrice2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_txtQuantity")
	private WebElement txtQuantity2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_txtDiscountRate")
	private WebElement txtDiscountRate2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_txtDiscountAmount")
	private WebElement DiscountAmount2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_ddVATRate")
	private WebElement ddVATRate2;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_hrefClear")
	private WebElement hrefClear2; //delete
	
	@FindBy(id ="ctl00_cPH_chkAddMore")
	private WebElement chkAddMore;
	
	
	@FindBy(id ="ctl00_cPH_txtRetentionRate")
	private WebElement txtRetentionRate;
	@FindBy(id ="ctl00_cPH_txtRetentionAmount")
	private WebElement txtRetentionAmount;

	@FindBy(id ="ctl00_cPH_ddBank")
	private WebElement ddBank;
	@FindBy(id ="ctl00_cPH_ddInvoiceTemplate")
	private WebElement ddInvoiceTemplate;
	@FindBy(id ="ctl00_cPH_txtPaymentTerm")
	private WebElement txtPaymentTerm;
	@FindBy(id ="ctl00_cPH_txtNote")
	private WebElement txtNote;
	@FindBy(id ="ctl00_cPH_FileUpload1")
	private WebElement FileUpload1;
	@FindBy(id ="ctl00_cphFooter_btnSave")
	private WebElement btnSaveInvoice;
	@FindBy(id ="ctl00_cphFooter_btnCancel")
	private WebElement btnCancelInvoice;
	@FindBy(id ="ctl00_cphFooter_btnRecall")
	private WebElement btnRecallInvoice;
	@FindBy(id ="ctl00_cPH_txtInvoiceDate")
	private WebElement txtInvoiceDate;
	
	// Credit Note
	@FindBy(id ="ctl00_cpHeaderRight_btnAddCreditNote")
	private WebElement btnAddCreditNote;
	
	//Supplier Bill
	@FindBy(xpath ="//span[contains(text(),'Expenses')]")
	private WebElement lnkExpenses;
	@FindBy(id ="ctl00_cPH_ddlSupplier")
	private WebElement ddlSupplier;
	@FindBy(id ="ctl00_cPH_txtBillNo")
	private WebElement txtBillNo;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl00_ddExpenseHead")
	private WebElement ddExpenseHead;
	@FindBy(id ="ctl00_cPH_rptrProduct_ctl01_ddExpenseHead")
	private WebElement ddExpenseHead2;
	@FindBy(id ="ctl00_cpHeaderRight_btnAddDebitNote")
	private WebElement btnAddDebitNote;
	@FindBy(id ="ctl00_cPH_txtDate")
	private WebElement txtSuppBillDate;

	//Bank & CreditCard Transactions
	@FindBy(xpath ="//span[contains(text(),'Banking')]")
	private WebElement lnkBanking;
	@FindBy(xpath ="//a[contains(text(),'Bank & Credit Card Transactions')]")
	private WebElement lnkBankCCTrans;
	@FindBy(xpath ="//span[contains(text(),'Add')]")
	private WebElement btnAddBankCCTrans;
	@FindBy(id ="ctl00_cpHeaderRight_btnAdd")
	private WebElement btnAdd;
	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_txtDate")
	private WebElement txtDate;
	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_txtDescription")
	private WebElement txtBankCCTransDescription;
	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_ddType")
	private WebElement ddType;
	@FindBy(id ="ctl00_cPHFilter_txtDateFrom")
	private WebElement txtDateFrom;
	@FindBy(id ="ctl00_cPHFilter_txtDateTo")
	private WebElement txtDateTo;
	@FindBy(xpath ="//tr[position() > last()-2]/td[2]")
	private WebElement LastBankTrans;
	
	@FindBy(xpath ="//td[contains(text(),'£50.00')]//..//td[2]/a[1]")
	private WebElement LastBankTransSupp;
	@FindBy(xpath ="//td[contains(text(),'£108.00')]//..//td[2]/a[1]")
	private WebElement LastBankTransInvoice;
	
	//Debit(Receipts)

	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_txtAmount")
	private WebElement txtAmount;
	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_ddVATRate")
	private WebElement ddBankCCTransVATRate;
	//STD 20%

	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_ddAmountAre")
	private WebElement ddAmountAre;

	//Exclusive

	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_AccountUC1_txtAccount")
	private WebElement txtAccount;

	//"1400 - YES BANK"
	
//	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_IDText")
//	private WebElement IDText;	
	
	@FindBy(xpath ="//*[@id='ctl00_cPH_rptRecord_ctl00_AccountUC1_AutoCompleteExtender1_completionListElem']/li[1]")
	private WebElement IDText;
	@FindBy(id ="ctl00_cPH_rptRecord_ctl00_txtNote")
	private WebElement txtBankCCTransNote;
//	@FindBy(id ="ctl00_cPH_chkAddMore")
//	private WebElement chkAddMore;
	@FindBy(id ="ctl00_cpHeaderRight_btnSave")
//	@FindBy(partialLinkText="SAVE")
	private WebElement btnSaveBankCCTrans;
//	@FindBy(xpath ="//a[@id='ctl00_cpHeaderRight_btnCancel']")
	@FindBy(id ="ctl00_cpHeaderRight_btnCancel")
	private WebElement btnCancelBankCCTrans;
	
	//Reconcile
	@FindBy(xpath ="//main[1]/div[1]/div[3]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")//tr[1]/td[1]/a[1]")//tr[1]/td[2]/a[1]
	private WebElement LastTrans;
	@FindBy(id ="ctl00_cPHFilter_dd_Search")
	private WebElement dd_Search;
	@FindBy(id ="ctl00_cPHFilter_txtSearch")
	private WebElement txtSearch;
	@FindBy(id ="ctl00_cPHFilter_btnSearch")
	private WebElement btnSearch;
	
	@FindBy(xpath ="//span[contains(text(),'Accountant')]")
	private WebElement lnkAccountant;
	@FindBy(xpath ="//a[contains(text(),'Reconcile')]")
	private WebElement lnkReconcile;
	//@FindBy(xpath ="//a[@href='../AccountUI/Reconcile.aspx?FYCode=7215&CompanyCode=5797&s=1']")
	@FindBy(xpath ="/html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[3]/div[1]/a[5]")
	private WebElement lnkReconcile1;
	@FindBy(xpath ="/html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[3]/div[1]/a[5]")
	private WebElement lnkReconcile2;
	@FindBy(xpath ="//button[@class='btn dashOpt-e fa fa-bars']")
	private WebElement lnkOptions;
	@FindBy(id ="ctl00_cPHFilter_ddlAccountType")
	private WebElement ddlAccountType;
	@FindBy(id ="ctl00_cPHFilter_ddlAccount")
	private WebElement ddlAccount;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElement Trans2;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[2]/td[2]/a[1]")
	private WebElement Trans1;
	@FindBy(id ="ctl00_cPH_rptrReconcile_ctl00_chkReconcileUngroup")
	private WebElement chkReconcileUngroup;
	@FindBy(id ="ctl00_cPH_rptrReconcile_ctl00_lnkReconcile")
	private WebElement lnkBtnReconcile;
	@FindBy(id ="ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl00_tr1")
	private WebElement tr1;
	@FindBy(xpath ="//div[@class='alert alert-success']")
	private WebElement SuccessMsg;
	
	//Undo Reconcile
	@FindBy(xpath ="//button[@class='btn dropdown-toggle dashOpt-e fa fa-bars']")
	private WebElement LstReconciled;
	@FindBy(id ="ctl00_cpHeaderRight_AnchorButton")
	private WebElement BtnViewReconciled;
	//@FindBy(id ="ctl00_cPH_rptrAccount_ctl00_rptrReconcile_ctl00_lnkUngroup")
	@FindBy(xpath ="//a[contains(text(),'Undo Reconcile')]")
	private WebElement LnkUndoReconciled;
	@FindBy(id ="ctl00_cPH_chkAll")
	private WebElement chkAllUndo;
	//@FindBy(id ="//*[contains(text(),'Undo Reconcile')]")
	//@FindBy(xpath ="//a[contains(text(),'Undo Reconcile')]")
	@FindBy(xpath ="//table[1]/tfoot[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	private List<WebElement> LnkUndoReconciledLst;
	@FindBy(id ="ctl00_cPH_rptrAccount_ctl01_rptrReconcile_ctl00_lnkUngroup")
	private WebElement LnkUndoReconciledSupplier;
	@FindBy(id ="ctl00_cPH_rptrAccount_ctl01_rptrReconcile_ctl00_lnkUngroup")
	private List<WebElement> LnkUndoReconciledSupplierLst;
	
	@FindBy(id ="ctl00_cPH_lnkReconcileAll")
	private WebElement lnkReconcileAll;
	@FindBy(id ="ctl00_cpHeaderRight_btnReconciled")
	private WebElement btnReconciledBack;
	
	//Delete Supplier Bills
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement checkboxAll;
	@FindBy(id="ctl00_cpHeaderRight_btnDeleteAllSuppbill")
	private WebElement btnDeleteAllSuppbill;
	@FindBy(id="selAll")
	private WebElement checkboxAllInvoices;
	@FindBy(id="ctl00_cpHeaderRight_btnDeleteAllInvoice")
	private WebElement btnDeleteAllInvoices;
	@FindBy(id="chkMoveTranAll")
	private WebElement checkboxAllBankTrans;
	@FindBy(id="chkMoveTranAll")
	private List<WebElement> checkboxAllBankTransLst;
	@FindBy(id="ctl00_cpHeaderRight_btnDelete")
	private WebElement btnDeleteAllBankTrans;
	@FindBy(id="SwitchFilter")
	private WebElement SwitchFilter;
	
	// VAT Return
	@FindBy(xpath ="//span[contains(text(),'VAT Returns')]")
	private WebElement lnkVATReturns;
	@FindBy(xpath ="//a[@class='toggleSettings']")
	private WebElement toggleSettings;
	@FindBy(xpath ="//a[@class='cbpopup_prc_78_40 setting-e popHCF_p2 cboxElement']//span[contains(text(),'VAT Return')]")
	private WebElement VATReturnPdf;
	@FindBy(xpath ="//span[contains(text(),'VAT Backup')]")
	private WebElement VATBackupPdf;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit")
	private WebElement lnkEdit;
	
	@FindBy(id="ctl00_cPHFilter_ddlVATTypeCategory")
	private WebElement ddlVATTypeCategory;
	@FindBy(id="_selectall_outputitem")
	private WebElement selectall_outputitem;
	@FindBy(id="_selectall_inputitem")
	private WebElement selectall_inputitem;
	@FindBy(id="ctl00_cpHeaderRight_btnCalculates")
	private WebElement btnCalculates;
	@FindBy(id="ctl00_cPHFilter_txtAmount")
	private WebElement txtAmountT;
	@FindBy(id="ctl00_cPHFilter_txtOutputVatAmt")
	private WebElement txtOutputVatAmt;
	@FindBy(id="ctl00_cPHFilter_txtInputVatAmt")
	private WebElement txtInputVatAmt;
	@FindBy(id="ctl00_cpHeaderRight_btnCancel")
	private WebElement btnCancel;
	@FindBy(xpath="//tr[2]/td[2]")
	private WebElement VATPayable;
	
	@FindBy(id="ctl00_cPH_txtOutputVAT")
	private WebElement txtOutputVAT;
	@FindBy(id="ctl00_cPH_txtInputVAT")
	private WebElement txtInputVAT;
	@FindBy(id="ctl00_cPH_txtAmount")
	private WebElement txtVATPayableAmount;
	@FindBy(xpath="//a[@class='fa fa-arrow-circle-left fa-icon']")
	private WebElement btnBack;
	@FindBy(xpath ="//span[contains(text(),'Email')]")
	private WebElement VATEmail;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkView")
	private WebElement lnkView;
	//Page Title  //View VAT Return
	@FindBy(id="ctl00_cPH_txtAmount")
	private WebElement VATReturntxtAmount;
	@FindBy(id="cboxClose")
	private WebElement cboxClose;
	@FindBy(id="ctl00_cPH_txtEmail")
	private WebElement txtEmailId;
	@FindBy(id="ctl00_cPH_btnSave")
	private WebElement btnSave;
	
	//Verify EU Invoices and Supplier Bills
	@FindBy(id="ctl00_cPH_ddSupplyType")
	private List<WebElement> ddSupplyTypeCnt;
	@FindBy(id="ctl00_cPH_ddSupplyType")
	private WebElement ddSupplyType;
	@FindBy(id="ctl00_cPH_euSupplyType")
	private List<WebElement> euSupplyType;
	
	
	//Verify VAT Return data
	@FindBy(xpath ="//table[1]/tbody[1]/tr[3]/td[3]/div[1]")
	private WebElement Box1;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[4]/td[3]/div[1]")
	private WebElement Box2;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]")
	private WebElement Box3;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[6]/td[3]/div[1]")
	private WebElement Box4;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[7]/td[3]/div[1]")
	private WebElement Box5;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[8]/td[3]/div[1]")
	private WebElement Box6;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[9]/td[3]/div[1]")
	private WebElement Box7;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[10]/td[3]/div[1]")
	private WebElement Box8;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[11]/td[3]/div[1]")
	private WebElement Box9;
	
	//VAT Return Backup Report
	@FindBy(xpath ="//table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	private WebElement Company;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")
	private WebElement VATOUTPUT;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[8]/td[1]/table[1]/tbody[1]/tr[6]/td[6]/div[1]")
	private WebElement VATOUTPUTVAT;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[10]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")
	private WebElement VATINPUT;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[10]/td[1]/table[1]/tbody[1]/tr[5]/td[6]/div[1]")
	private WebElement VATINPUTVAT;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[12]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")
	private WebElement EUSALES;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[12]/td[1]/table[1]/tbody[1]/tr[6]/td[5]/div[1]")
	private WebElement EUSALESGROSS;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[14]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")
	private WebElement EUPURCHASE;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[14]/td[1]/table[1]/tbody[1]/tr[8]/td[5]/div[1]")
	private WebElement EUPURCHASEGROSS;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[16]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")
	private WebElement SUMMARY;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[16]/td[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]")
	private WebElement VATOutput;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[16]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]")
	private WebElement VATInput;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[16]/td[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]")
	private WebElement VATPay;
	@FindBy(xpath ="//table[1]/tbody[1]/tr[16]/td[1]/table[1]/tbody[1]/tr[7]/td[2]/div[1]")
	private WebElement FlatRateSavings;

	@FindBy(id ="ctl00_ddlFinancialYear")
	private WebElement ddlFinancialYear;
	
	public VatPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void AddCustomer(WebDriver driver, String CustomerListTitleExp, String AddCustomerTitleExp, String name, String Currency, String Ledger, String CustomerType,String CustomerBusinessType,String Vat,String Payment,String Ref,String Email,String Address1,String Address2,String Address3,String Address4,String PostCode,String Country,String ContactName,String ContactLastName,String Phone,String Fax) throws InterruptedException {
		lnkIncome.click();
		//Thread.sleep(3000);

		driver.manage().window().maximize();		
//		WebDriverWait iwait = new WebDriverWait(driver, 10);
//		iwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='dropdown search_filter_each dashOpt-e fa fa-bars']")));
		//WebElement element = driver.findElement(By(ddlInvOptions));
//		Actions action = new Actions(driver);
//		action.moveToElement(ddlInvOptions).click().perform();
		
				
		ddlInvOptions.click();
		
		Thread.sleep(3000);
		LnkCustomerList.click();
		//html[1]/body[1]/form[1]/main[1]/div[1]/div[3]/header[1]/div[1]/div[2]/div[1]/a[1]
		
		//commented because of change in development code
		//VerifyPageTitle(driver, CustomerListTitleAct, CustomerListTitleExp);
		
		btnAddCustomer.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddCustomerTitleExp);
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("name+num1: "+(name+num1), true);
		
		txtCustomerName.sendKeys(name+num1);
		Select sel=new Select(ddCurrency);
		sel.selectByValue(Currency);
		
		Select sel1=new Select(ddLedger);
		sel1.selectByValue(Ledger);
		
		Select sel2=new Select(ddCustomerType);
		sel2.selectByVisibleText(CustomerType);
		Select sel3=new Select(ddCustomerBusinessType);
		sel3.selectByVisibleText(CustomerBusinessType);
		rblVatNoSupplied.click();
		txtVat.sendKeys(Vat);

		Select sel5=new Select(ddPayment);
		sel5.selectByVisibleText(Payment);

		 txtRef.sendKeys(Ref);
		 txtEmail.sendKeys(Email);
		txtAddress1.sendKeys(Address1);
		txtAddress2.sendKeys(Address2);
		txtAddress3.sendKeys(Address3);
		txtAddress4.sendKeys(Address4);
		txtPostCode.sendKeys(PostCode);
		
		Select sel6=new Select(ddCountry);
		sel6.selectByVisibleText(Country);
		txtContactName.sendKeys(ContactName);
		txtContactLastName.sendKeys(ContactLastName);
		txtPhone.sendKeys(Phone);
		txtFax.sendKeys(Fax);
		//btnCancel;
		btnSaveCustomer.click();
		
		Reporter.log("Customer added successfully", true);
		Thread.sleep(2000);
		
	}
	
	public void VerifyPageTitle(WebDriver driver,WebElement TitleAct, String TitleExp) {
		
		Assert.assertEquals(TitleAct.getText(), TitleExp, "Failed to verify Title");
		Reporter.log("Title verified successfully", true);
				
	}
	
	public void SearchCompany(WebDriver driver, String Company) throws InterruptedException {
		
		driver.navigate().refresh();
		SearchCompany.sendKeys(Company);
		SelectCompany.click();
		Reporter.log("Company opened successfully", true);
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowForward(driver);
				
	}
	
	public void AddInvoice(WebDriver driver, String InvoiceTitleExp, String AddInvoiceTitleExp, String Customer, String Product, String Description, String UnitPrice,String Quantity,String DiscountRate,String VATRate,String RetentionRate,String RetentionAmount,String Bank,String InvoiceTemplate,String PaymentTerm,String Note) throws InterruptedException {
		//lnkInvoice.click();
		lnkIncome.click();
		
		//commented because of change in development code
		//VerifyPageTitle(driver, TitleActInvoice, InvoiceTitleExp);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddInvoiceTitleExp);
		
		Select sel1=new Select(ddlCustomer);
		sel1.selectByVisibleText(Customer);
		
		chkNonVATInvoice.click();
		Thread.sleep(2000);
		Select sel2=new Select(ddProduct);
		sel2.selectByValue(Product);
		//Thread.sleep(2000);
		
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount, "0.00");
		//wait.until(ExpectedConditions.textToBePresentInElementValue(DiscountAmount, "0.00"));
		
		txtDescription.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice.sendKeys(UnitPrice);
		//Thread.sleep(1000);
		txtQuantity.click();
		Thread.sleep(2000);
		txtQuantity.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate.click();
		Thread.sleep(2000);
		txtDiscountRate.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		//Thread.sleep(2000);

		//hrefClear //delete
		Select sel6=new Select(ddProduct2);
		sel6.selectByValue(Product);
		//Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount2, "0.00");
		txtDescription2.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice2.sendKeys(UnitPrice);
		//Thread.sleep(1000);
		txtQuantity2.click();
		Thread.sleep(2000);
		txtQuantity2.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate2.click();
		Thread.sleep(2000);
		txtDiscountRate2.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel7=new Select(ddVATRate2);
		sel7.selectByVisibleText(VATRate);
		//Thread.sleep(2000);
		//hrefClear2 //delete

		chkAddMore.click();
		Thread.sleep(2000);
		txtRetentionRate.sendKeys(RetentionRate);
		//Thread.sleep(2000);
		txtRetentionAmount.clear();
		txtRetentionAmount.sendKeys(RetentionAmount);
		//Thread.sleep(2000);
		
		Select sel4=new Select(ddBank);
		sel4.selectByVisibleText(Bank);
		//Thread.sleep(2000);
		Select sel5=new Select(ddInvoiceTemplate);
		sel5.selectByVisibleText(InvoiceTemplate);
		//Thread.sleep(2000);
		
		txtPaymentTerm.clear();
		txtPaymentTerm.sendKeys(PaymentTerm);
		
		txtNote.sendKeys(Note);
		btnSaveInvoice.click();
			
		Reporter.log("Invoice added successfully", true);
		Thread.sleep(2000);
		
	}
	
	public void AddInvoice2(WebDriver driver, String InvoiceTitleExp, String AddInvoiceTitleExp, String Customer, String Product, String Description, String UnitPrice,String Quantity,String DiscountRate,String VATRate,String RetentionRate,String RetentionAmount,String Bank,String InvoiceTemplate,String PaymentTerm,String Note) throws InterruptedException {

		lnkIncome.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActInvoice, InvoiceTitleExp);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddInvoiceTitleExp);
		
		Select sel1=new Select(ddlCustomer);
		sel1.selectByVisibleText(Customer);
		
		chkNonVATInvoice.click();
		Thread.sleep(2000);
		
		txtInvoiceDate.clear();
		txtInvoiceDate.sendKeys("01-01-2019");

		Select sel2=new Select(ddProduct);
		sel2.selectByVisibleText(Product);
		
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount, "0.00");
		
		txtDescription.sendKeys(Description);

		txtUnitPrice.sendKeys(UnitPrice);

		txtQuantity.click();
		Thread.sleep(2000);
		txtQuantity.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate.click();
		Thread.sleep(2000);
		txtDiscountRate.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);

		Thread.sleep(2000);

		txtRetentionRate.sendKeys(RetentionRate);
		txtRetentionAmount.clear();
		txtRetentionAmount.sendKeys(RetentionAmount);
		
		Select sel4=new Select(ddBank);
		sel4.selectByVisibleText(Bank);

		Select sel5=new Select(ddInvoiceTemplate);
		sel5.selectByVisibleText(InvoiceTemplate);

		
		txtPaymentTerm.clear();
		txtPaymentTerm.sendKeys(PaymentTerm);
		
		//commented on 18.05.2019
		//txtNote.sendKeys(Note);
		btnSaveInvoice.click();
			
		Reporter.log("Invoice added successfully", true);
		Thread.sleep(3000);
		
	}
	
	
	public void AddInvoice3(WebDriver driver, String Name1, String Product, String Description, String UnitPrice,String Quantity,String DiscountRate,String VATRate,String RetentionRate,String RetentionAmount,String Bank,String InvoiceTemplate,String PaymentTerm,String Note,String SupplyType1,String SupplyType2) throws InterruptedException {

//		lnkIncome.click();
//		VerifyPageTitle(driver, TitleAct, InvoiceTitleExp);
//		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
	
//		VerifyPageTitle(driver, TitleAct, AddInvoiceTitleExp);
		
		Select sel1=new Select(ddlCustomer);
		sel1.selectByVisibleText(Name1);
		
		
		
		//chkNonVATInvoice.click();
		//Thread.sleep(2000);
		
		txtInvoiceDate.clear();
		txtInvoiceDate.sendKeys("01-01-2019");
		
		if (!Name1.equals("SA_UK"))
		{
			if (Name1=="SA_EU_NOVAT")
			{
				
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
				
			}
			
			if (Name1=="SA_EU_VAT")
			{
				
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
				
			}
			
			if(Name1=="SA_EU_NoVAT_NB")
			{
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
			}
			//Reporter.log("Script in progress", true);
		}

		Select sel2=new Select(ddProduct);
		sel2.selectByVisibleText(Product);
		
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount, "0.00");
		
		txtDescription.sendKeys(Description);
		Thread.sleep(2000);
		txtUnitPrice.sendKeys(UnitPrice);
		Thread.sleep(2000);
		txtQuantity.click();
		Thread.sleep(2000);
		txtQuantity.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate.click();
		Thread.sleep(2000);
		txtDiscountRate.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);

		Thread.sleep(2000);

		//txtRetentionRate.sendKeys(RetentionRate);
		//txtRetentionAmount.clear();
		//txtRetentionAmount.sendKeys(RetentionAmount);
		
		Select sel4=new Select(ddBank);
		sel4.selectByVisibleText(Bank);

		//Select sel5=new Select(ddInvoiceTemplate);
		//sel5.selectByVisibleText(InvoiceTemplate);

		
		//txtPaymentTerm.clear();
		//txtPaymentTerm.sendKeys(PaymentTerm);
		
		txtNote.sendKeys(Note);
		btnSaveInvoice.click();
			
		Reporter.log("Invoice added successfully", true);
//		CISPage cis=new CISPage(driver);
		cis.switchwindowDefault(driver);
		Thread.sleep(2000);
		
	}
	
	
	public void AddCreditNote(WebDriver driver, String InvoiceTitleExp, String AddInvoiceTitleExp, String Customer, String Product, String Description, String UnitPrice,String Quantity,String DiscountRate,String VATRate,String RetentionRate,String RetentionAmount,String Bank,String InvoiceTemplate,String PaymentTerm,String Note) throws InterruptedException {

		lnkIncome.click();
		
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActInvoice, InvoiceTitleExp);
		
		ddlAddOptions.click();
		btnAddCreditNote.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddInvoiceTitleExp);
		
		Select sel1=new Select(ddlCustomer);
		sel1.selectByVisibleText(Customer);
		
	
		chkNonVATInvoice.click();
		Thread.sleep(2000);
		Select sel2=new Select(ddProduct);
		sel2.selectByValue(Product);
		//Thread.sleep(2000);
		
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount, "0.00");
		//wait.until(ExpectedConditions.textToBePresentInElementValue(DiscountAmount, "0.00"));
		
		txtDescription.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice.sendKeys(UnitPrice);
		//Thread.sleep(1000);
		txtQuantity.click();
		Thread.sleep(2000);
		txtQuantity.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate.click();
		Thread.sleep(2000);
		txtDiscountRate.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		//Thread.sleep(2000);

		//hrefClear //delete
		Select sel6=new Select(ddProduct2);
		sel6.selectByValue(Product);
		//Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		wLib.explicitWait_textToBePresentInElementValue(driver, 5, DiscountAmount2, "0.00");
		txtDescription2.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice2.sendKeys(UnitPrice);
		//Thread.sleep(1000);
		txtQuantity2.click();
		Thread.sleep(2000);
		txtQuantity2.sendKeys(Quantity);
		Thread.sleep(2000);
		txtDiscountRate2.click();
		Thread.sleep(2000);
		txtDiscountRate2.sendKeys(DiscountRate);
		Thread.sleep(2000);
		Select sel7=new Select(ddVATRate2);
		sel7.selectByVisibleText(VATRate);
		//Thread.sleep(2000);
		//hrefClear2 //delete

		chkAddMore.click();
		Thread.sleep(2000);
		txtRetentionRate.sendKeys(RetentionRate);
		//Thread.sleep(2000);
		txtRetentionAmount.clear();
		txtRetentionAmount.sendKeys(RetentionAmount);
		//Thread.sleep(2000);
		
		Select sel4=new Select(ddBank);
		sel4.selectByVisibleText(Bank);
		//Thread.sleep(2000);
		Select sel5=new Select(ddInvoiceTemplate);
		sel5.selectByVisibleText(InvoiceTemplate);
		//Thread.sleep(2000);
		
		txtPaymentTerm.clear();
		txtPaymentTerm.sendKeys(PaymentTerm);
		
		txtNote.sendKeys(Note);
		btnSaveInvoice.click();
			
		Reporter.log("Invoice added successfully", true);
		Thread.sleep(2000);
		
	}
	
	public void AddSupplierBill(WebDriver driver, String SupplierBillTitleExp, String AddSupplierBillTitleExp, String Supplier, String ExpenseHead, String Description, String UnitPrice, String VATRate, String Note) throws InterruptedException {
		lnkExpenses.click();
		WaitStatementLib wLib = new WaitStatementLib();
		//commented because of change in development code
				//	VerifyPageTitle(driver, TitleActSuppBill, SupplierBillTitleExp);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddSupplierBillTitleExp);
		
		Select sel1=new Select(ddlSupplier);
		sel1.selectByVisibleText(Supplier);
		//wLib.explicitWait(driver, 5, txtBillNo);
		Thread.sleep(2000);
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBillNo.sendKeys(num1);
		
		//txtSuppBillDate.sendKeys("01/02/2018");
		
		Select sel2=new Select(ddExpenseHead);
		sel2.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice, "0.00");
		
		txtDescription.sendKeys(Description);
		txtUnitPrice.clear();
		txtUnitPrice.sendKeys(UnitPrice);
		
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		
		Select sel4=new Select(ddExpenseHead2);
		sel4.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice2, "0.00");
		
		txtDescription2.sendKeys(Description);
		txtUnitPrice2.clear();
		txtUnitPrice2.sendKeys(UnitPrice);
		
		Select sel5=new Select(ddVATRate2);
		sel5.selectByVisibleText(VATRate);
		
		chkAddMore.click();
		Thread.sleep(2000);

		txtNote.sendKeys(Note);
		
		//ImportFile();
		btnSaveInvoice.click();
			
		Reporter.log("Supplier Bill added successfully", true);
		Thread.sleep(1000);
		
	}
	
	public void AddSupplierBill2(WebDriver driver, String SupplierBillTitleExp, String AddSupplierBillTitleExp, String Supplier, String ExpenseHead, String Description, String UnitPrice, String VATRate, String Note) throws InterruptedException {
		lnkExpenses.click();
		WaitStatementLib wLib = new WaitStatementLib();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActSuppBill, SupplierBillTitleExp);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddSupplierBillTitleExp);
		
		Select sel1=new Select(ddlSupplier);
		sel1.selectByVisibleText(Supplier);
		//wLib.explicitWait(driver, 5, txtBillNo);
		Thread.sleep(2000);
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBillNo.sendKeys(num1);
		txtSuppBillDate.clear();
		txtSuppBillDate.sendKeys("01/01/2019");
		
		Select sel2=new Select(ddExpenseHead);
		sel2.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice, "0.00");
		Thread.sleep(2000);
		txtDescription.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice.clear();
		txtUnitPrice.sendKeys(UnitPrice);
		
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		
		txtNote.sendKeys(Note);
		
		//ImportFile();
		btnSaveInvoice.click();
			
		Reporter.log("Supplier Bill added successfully", true);
		Thread.sleep(1000);
		
	}
	
	public void ImportFile()
	{
		
		FileUpload1.sendKeys(System.getProperty("user.dir")+"..\\..\\testData\\logob.png");

	}
	
	public void AddDebitNote(WebDriver driver, String SupplierBillTitleExp, String AddDebitNoteTitleExp, String Supplier, String ExpenseHead, String Description, String UnitPrice, String VATRate, String Note) throws InterruptedException {
		lnkExpenses.click();
		WaitStatementLib wLib = new WaitStatementLib();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActSuppBill, SupplierBillTitleExp);
		
		ddlAddOptions.click();
		btnAddDebitNote.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddDebitNoteTitleExp);
		
		Select sel1=new Select(ddlSupplier);
		sel1.selectByVisibleText(Supplier);
		//wLib.explicitWait(driver, 5, txtBillNo);
		Thread.sleep(2000);
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBillNo.sendKeys(num1);
		Select sel2=new Select(ddExpenseHead);
		sel2.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice, "0.00");
		
		txtDescription.sendKeys(Description);
		txtUnitPrice.clear();
		txtUnitPrice.sendKeys(UnitPrice);
		
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		
		Select sel4=new Select(ddExpenseHead2);
		sel4.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice2, "0.00");
		
		txtDescription2.sendKeys(Description);
		txtUnitPrice2.clear();
		txtUnitPrice2.sendKeys(UnitPrice);
		
		Select sel5=new Select(ddVATRate2);
		sel5.selectByVisibleText(VATRate);
		
		chkAddMore.click();
		Thread.sleep(2000);

		txtNote.sendKeys(Note);
		
		//ImportFile();
		btnSaveInvoice.click();
			
		Reporter.log("Supplier Bill added successfully", true);
		Thread.sleep(1000);
		
	}
	
	public void AddBankCreditCardTransaction(WebDriver driver, String TitleExp1, String TitleExp2, String Description, String Type, String Amount, String VATRate, String AmountAre, String Account, String Note) throws InterruptedException {
		
		lnkBanking.click();
		//lnkBankCCTrans.click();
		
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActBankCCTrans, TitleExp1);
		ddlAddOptions.click();
		//btnAddBankCCTrans.click();
		btnAdd.click();
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		btnCancelBankCCTrans.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActBankCCTrans, TitleExp1);
		ddlAddOptions.click();
		btnAdd.click();
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		CISPage cis= new CISPage(driver);
//		txtDate.sendKeys(cis.getcurdate());
		txtDate.sendKeys("11/01/2019");
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBankCCTransDescription.sendKeys(num1);
		
		Select sel1=new Select(ddType);
		sel1.selectByVisibleText(Type);
		
		txtAmount.sendKeys(Amount);
		ddBankCCTransVATRate.sendKeys(VATRate);
		
		Thread.sleep(4000);
		Select sel2=new Select(ddAmountAre);
		sel2.selectByVisibleText(AmountAre);
		Thread.sleep(4000);
		
		txtAccount.sendKeys(Account);
		Thread.sleep(3000);
		IDText.click();
		txtBankCCTransNote.sendKeys(Note);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollTo(0, 0)");
		 btnSaveBankCCTrans.click();
					
		Reporter.log("Bank & Credit Card Transaction added successfully", true);
		Thread.sleep(1000);
		
	}
	
	public String FindLastTransaction(){
		String Trans=LastTrans.getText();
		Reporter.log("LastTransaction: "+LastTrans.getText(), true);
		return Trans;
	}
	
	public String FindLastTransactionBankSupp(){
		String Trans=LastBankTransSupp.getText();
		Reporter.log("LastTransaction: "+LastBankTransSupp.getText(), true);
		return Trans;
	}
	
	public String FindLastTransactionBankInvoice(){
		String Trans=LastBankTransInvoice.getText();
		Reporter.log("LastTransaction: "+LastBankTransInvoice.getText(), true);
		return Trans;
	}
	
//	public void SearchTransaction(WebDriver driver){
//		Trans=LastTrans.getText();
//		Reporter.log("LastTransaction: "+LastTrans.getText(), true);
	
	public void ReconcileInvoice(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
		lnkIncome.click();
		String InvTrans=FindLastTransaction();
		
		lnkBanking.click();
		//lnkBankCCTrans.click();
		txtDateFrom.clear();
		//CISPage cis= new CISPage(driver);
		//txtDate.sendKeys();
//		txtDateFrom.sendKeys(cis.getcurdate());
//		txtDateTo.clear();
//		txtDateTo.sendKeys(cis.getcurdate());
		
		txtDateFrom.sendKeys("01/01/2019");
		txtDateTo.clear();
		txtDateTo.sendKeys("31/03/2019");
		
		//dd_Search.sendKeys(keysToSend);

		btnSearch.click();
		String BankTrans=FindLastTransactionBankInvoice();
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Customer");
		Select sel2=new Select(ddlAccount);
		sel2.selectByVisibleText("SA1");
		
		Assert.assertEquals(Trans1.getText(), InvTrans, "Failed to verify Invoice Transaction");
		Reporter.log("Invoice Transaction verified successfully", true);
		
		Assert.assertEquals(Trans2.getText(), BankTrans, "Failed to verify Bank Transaction");
		Reporter.log("Bank Transaction verified successfully", true);
		
		chkReconcileUngroup.click();
		lnkBtnReconcile.click();
		Thread.sleep(2000);
		
		
		Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Failed to verify Success Message");
		Reporter.log("Success Message verified successfully", true);
	}
	
	public void UndoReconcileInvoice(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
				
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		LstReconciled.click();
		BtnViewReconciled.click();
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Customer");
			
		if (LnkUndoReconciledLst.size()>0)
		{
			Reporter.log("Reconciled Transactions found", true);
			LnkUndoReconciled.click();
			Thread.sleep(1000);
			btnReconciledBack.click();
			//Select sel1=new Select(ddlAccountType);
			sel1.selectByVisibleText("Customer");
			lnkReconcileAll.click();
			
		}
		else
		{
			Reporter.log("Unable to Search Reconciled Transactions");
			btnReconciledBack.click();
			//Select sel1=new Select(ddlAccountType);
			sel1.selectByVisibleText("Customer");
			lnkReconcileAll.click();
		}

		Thread.sleep(2000);
		
//		Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Failed to verify Success Message");
//		Reporter.log("Success Message verified successfully", true);
	}
	
	public void ReconcileSupplierBill(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
		lnkExpenses.click();
		String InvTrans=FindLastTransaction();
		
		lnkBanking.click();

		//ddlAddOptions.click();
		//btnAdd.click();
		txtDateFrom.clear();
		//CISPage cis= new CISPage(driver);
		//txtDate.sendKeys();
		txtDateFrom.sendKeys("01/01/2019");
		txtDateTo.clear();
		txtDateTo.sendKeys("31/03/2019");

		btnSearch.click();
		String BankTrans=FindLastTransactionBankSupp();
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Supplier");
		Select sel2=new Select(ddlAccount);
		sel2.selectByVisibleText("SA2");
		
		Assert.assertEquals(Trans1.getText(), InvTrans, "Failed to verify Supplier Bill Transaction");
		Reporter.log("Invoice Transaction verified successfully", true);
		
		Assert.assertEquals(Trans2.getText(), BankTrans, "Failed to verify Bank Transaction");
		Reporter.log("Bank Transaction verified successfully", true);
		
		chkReconcileUngroup.click();
		lnkBtnReconcile.click();
		Thread.sleep(2000);
		
		
		Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Failed to verify Success Message");
		Reporter.log("Success Message verified successfully", true);
	}
	
	public void UndoReconcileSupplierBill(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
				
		lnkExpenses.click();
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		LstReconciled.click();
		BtnViewReconciled.click();
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Supplier");
			
		while (LnkUndoReconciledSupplierLst.size()>0)
		{
			Reporter.log("Reconciled Transactions found", true);
			LnkUndoReconciledSupplier.click();
			Thread.sleep(1000);
			
			//Select sel1=new Select(ddlAccountType);
//			sel1.selectByVisibleText("Supplier");
//			lnkReconcileAll.click();
			
		}
		
		btnReconciledBack.click();
		Thread.sleep(2000);
		

	}
	
	public void UndoReconcileInvoice2(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		LstReconciled.click();
		BtnViewReconciled.click();
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Customer");
			
		//Reporter.log("LnkUndoReconciledLst.size() " +LnkUndoReconciledLst.size(), true);
		while (LnkUndoReconciledLst.size()>0)
		{
			Reporter.log("Reconciled Transactions found", true);
			chkAllUndo.click();
			LnkUndoReconciled.click();
			Thread.sleep(1000);
			driver.navigate().refresh();
		}
		
		btnReconciledBack.click();
		Thread.sleep(2000);
		

	}
	
	public void UndoReconcileAll(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
		
		lnkIncome.click();
		
		lnkAccountant.click();
		Thread.sleep(2000);
		lnkReconcile.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		LstReconciled.click();
		BtnViewReconciled.click();
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Supplier");
			
		if (LnkUndoReconciledLst.size()>0)
		{
			Reporter.log("Reconciled Transactions found", true);
			LnkUndoReconciled.click();
			Thread.sleep(1000);
			btnReconciledBack.click();
			//Select sel1=new Select(ddlAccountType);
			sel1.selectByVisibleText("Supplier");
			lnkReconcileAll.click();
			
		}
		else
		{
			Reporter.log("Unable to Search Reconciled Transactions");
			btnReconciledBack.click();
			//Select sel1=new Select(ddlAccountType);
			sel1.selectByVisibleText("Supplier");
			lnkReconcileAll.click();
		}

		Thread.sleep(2000);
		
//		Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Failed to verify Success Message");
//		Reporter.log("Success Message verified successfully", true);
	}
	
	public void DeleteAllSupplierBills(WebDriver driver, String TitleExp1) throws InterruptedException {
		
		lnkExpenses.click();
		//VerifyPageTitle(driver, TitleAct, TitleExp1);
		SwitchFilter.click();
		Thread.sleep(2000);
		btnSearch.click();
		Thread.sleep(1000);
		checkboxAll.click();
		btnDeleteAllSuppbill.click();

	}
	
	public void DeleteAllInvoices(WebDriver driver, String TitleExp1) throws InterruptedException {
		
		lnkIncome.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActInvoice, TitleExp1);
		SwitchFilter.click();
		Thread.sleep(1000);
		btnSearch.click();
		Thread.sleep(1000);
		checkboxAllInvoices.click();
		btnDeleteAllInvoices.click();

	}
	
	public void DeleteAllBankTransactions(WebDriver driver, String TitleExp1) throws InterruptedException {
		
		lnkBanking.click();
		//lnkBankCCTrans.click();

		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActBankCCTrans, TitleExp1);
		if (checkboxAllBankTransLst.size()>0)
		{
			checkboxAllBankTrans.click();
			btnDeleteAllBankTrans.click();
			
			CISPage cis= new CISPage(driver);
			cis.AlertAccept(driver);
			Thread.sleep(2000);
		}
		else
		{
			Reporter.log("No transactions available for deletion", true);
		}
			

	}
	
	public void VATReturns(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String SuccessMsgExp) throws InterruptedException {
		
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
//		Select sel= new Select(ddlFinancialYear);
//		
//		sel.selectByVisibleText("Jan 2018 - Dec 2018");
		
		toggleSettings.click();
		VATReturnPdf.click();

		cis.switchwindowNew(driver);
		
		//VerifyPageTitle(driver, TitleAct, TitleExp2);
		cis.switchwindowDefault(driver);
		cboxClose.click();
		cis.switchwindowDefault(driver);
		
		toggleSettings.click();
		VATBackupPdf.click();

		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp3);
		Thread.sleep(2000);

	}
	
	
	public void InvoiceCheck(WebDriver driver, String TitleExp1, String TitleExp2, String Name1, String Name2, String Name3, String Name4) throws InterruptedException {
			
		lnkIncome.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActInvoice, TitleExp1);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		Select sel1=new Select(ddlCustomer);
		sel1.selectByVisibleText(Name1);
		Thread.sleep(2000);
	
		if (ddSupplyTypeCnt.size()>0)
		{
			Assert.fail("Unable to verify UK Customer");
			
		}
		else
		{
			
			Reporter.log("UK Customer verified successfully", true);
	
		}

		Select sel2=new Select(ddlCustomer);
		sel2.selectByVisibleText(Name2);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Customer having VAT amd Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Customer having VAT amd Business type");
		
	
		}

		Select sel3=new Select(ddlCustomer);
		sel3.selectByVisibleText(Name3);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Customer having Non-VAT amd Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Customer having Non-VAT amd Business type");
		
	
		}

		Select sel4=new Select(ddlCustomer);
		sel4.selectByVisibleText(Name4);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Customer having Non-VAT amd Non-Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Customer having Non-VAT amd Non-Business type");
		
	
		}
		
		cis.switchwindowDefault(driver);
		cboxClose.click();
		cis.switchwindowDefault(driver);
	}
	
public void AddBankCreditCardTransaction3(WebDriver driver, String TitleExp1, String TitleExp2, String Description, String Type, String Amount, String VATRate, String AmountAre, String Account, String Note) throws InterruptedException {
		
		lnkBanking.click();
		//lnkBankCCTrans.click();
		
		//WaitStatementLib wLib = new WaitStatementLib();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActBankCCTrans, TitleExp1);
		
//		btnAddBankCCTrans.click();
//		VerifyPageTitle(driver, TitleAct, TitleExp2);
//		
//		btnCancelBankCCTrans.click();
//		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		ddlAddOptions.click();
		btnAdd.click();
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		CISPage cis= new CISPage(driver);
//		txtDate.sendKeys(cis.getcurdate());
		txtDate.sendKeys("11/01/2019");
		Thread.sleep(1000);
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBankCCTransDescription.sendKeys(num1);
		Thread.sleep(1000);
		Select sel1=new Select(ddType);
		sel1.selectByVisibleText(Type);
		Thread.sleep(1000);
		txtAmount.sendKeys(Amount);
		txtBankCCTransDescription.click();
		//txtAccount.click();
//		Thread.sleep(2000);
//		ddBankCCTransVATRate.sendKeys(VATRate);
//		
//		Thread.sleep(2000);
//		Select sel2=new Select(ddAmountAre);
//		sel2.selectByVisibleText(AmountAre);
		Thread.sleep(2000);
		
		txtAccount.sendKeys(Account);
		Thread.sleep(5000);
		IDText.click();
		txtBankCCTransNote.sendKeys(Note);
		txtBankCCTransDescription.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollTo(0, 0)");
		btnSaveBankCCTrans.click();
					
		Reporter.log("Bank & Credit Card Transaction added successfully", true);
		cis.switchwindowDefault(driver);
		Thread.sleep(1000);
		
	}


	public void ReconcileInvoice3(WebDriver driver, String TitleExp1, String SuccessMsgExp, String AccountType) throws InterruptedException {
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile1.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText(AccountType);
		
		lnkReconcileAll.click();
		Thread.sleep(2000);
			
//		Assert.assertEquals(SuccessMsg.getText(), SuccessMsgExp, "Failed to verify Success Message");
//		Reporter.log("Success Message verified successfully", true);
	}
	
	
	public void SupplierBillCheck(WebDriver driver, String TitleExp1, String TitleExp2, String Name1, String Name2, String Name3, String Name4, String Name5) throws InterruptedException {
		
		lnkExpenses.click();
		WaitStatementLib wLib = new WaitStatementLib();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleActSuppBill, TitleExp1);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		

		Select sel1=new Select(ddlSupplier);
		sel1.selectByVisibleText(Name1);
		Thread.sleep(2000);

		if (ddSupplyTypeCnt.size()>0)
		{
			Assert.fail("Unable to verify UK Supplier");
			
		}
		else
		{
			
			Reporter.log("UK Supplier verified successfully", true);
	
		}

		Select sel2=new Select(ddlSupplier);
		sel2.selectByVisibleText(Name2);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Supplier having VAT and Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Supplier having VAT and Business type");
		
	
		}

		Select sel3=new Select(ddlSupplier);
		sel3.selectByVisibleText(Name3);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Supplier having Non-VAT and Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Supplier having Non-VAT and Business type");
		
	
		}

		Select sel4=new Select(ddlSupplier);
		sel4.selectByVisibleText(Name4);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Supplier having Non-VAT and Non-Business type verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Supplier having Non-VAT and Non-Business type");
		
	
		}
		
		Select sel5=new Select(ddlSupplier);
		sel5.selectByVisibleText(Name5);
		Thread.sleep(2000);
		if (ddSupplyTypeCnt.size()>0)
		{
			Reporter.log("EU Supplier having VAT, Business type and supply verified successfully", true);
			
		}
		else
		{
			Assert.fail("Unable to verify EU Supplier having VAT, Business type and supply");
		
	
		}
		cis.switchwindowDefault(driver);
		cboxClose.click();
		cis.switchwindowDefault(driver);
	}
	
	public void AddSupplierBill3(WebDriver driver, String SupplierBillTitleExp, String AddSupplierBillTitleExp, String Name1, String ExpenseHead, String Description, String UnitPrice, String VATRate, String Note,String SupplyType1,String SupplyType2) throws InterruptedException {
//		lnkExpenses.click();
		WaitStatementLib wLib = new WaitStatementLib();
//		VerifyPageTitle(driver, TitleAct, SupplierBillTitleExp);
		
		ddlAddOptions.click();
		btnAddInvoice.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, AddSupplierBillTitleExp);
		
		Select sel1=new Select(ddlSupplier);
		sel1.selectByVisibleText(Name1);
		//wLib.explicitWait(driver, 5, txtBillNo);
		Thread.sleep(2000);
		
		int num=cis.generateRandom();
		String num1=Integer.toString(num);
		Reporter.log("num1: "+num1, true);
		
		txtBillNo.sendKeys(num1);
		txtSuppBillDate.clear();
		txtSuppBillDate.sendKeys("01/02/2018");
		
			
		if (!Name1.equals("SA_UK"))
		{
			if (Name1=="SA_EU_NOVAT")
			{
				
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
				
			}
			
			if (Name1=="SA_EU_VAT")
			{
				
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
				
			}
			
			if(Name1=="SA_EU_NoVAT_NB")
			{
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType1);
			}
			
			if(Name1=="SA_EU_VAT_Goods")
			{
				Select sel4=new Select(ddSupplyType);
				sel4.selectByVisibleText(SupplyType2);
			}

		}
		
	
		Select sel2=new Select(ddExpenseHead);
		sel2.selectByVisibleText(ExpenseHead);

		wLib.explicitWait_textToBePresentInElementValue(driver, 5, txtUnitPrice, "0.00");
		Thread.sleep(2000);
		txtDescription.sendKeys(Description);
		//Thread.sleep(2000);
		txtUnitPrice.clear();
		txtUnitPrice.sendKeys(UnitPrice);
		
		Select sel3=new Select(ddVATRate);
		sel3.selectByVisibleText(VATRate);
		
		txtNote.sendKeys(Note);
		
		//ImportFile();
		btnSaveInvoice.click();
			
		Reporter.log("Supplier Bill for supplier "+Name1+ " added successfully", true);
		Thread.sleep(1000);
		
	}
	

	public void UndoReconcileSupplierBills2(WebDriver driver, String TitleExp1, String SuccessMsgExp) throws InterruptedException {
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		lnkReconcile2.click();
		//commented because of change in development code
				//VerifyPageTitle(driver, TitleAccReconcile, TitleExp1);
		
		LstReconciled.click();
		BtnViewReconciled.click();
		
		Select sel1=new Select(ddlAccountType);
		sel1.selectByVisibleText("Supplier");
			
		//Reporter.log("LnkUndoReconciledLst.size() " +LnkUndoReconciledLst.size(), true);
		while (LnkUndoReconciledLst.size()>0)
		{
			Reporter.log("Reconciled Transactions found", true);
			chkAllUndo.click();
			LnkUndoReconciled.click();
			Thread.sleep(1000);
			driver.navigate().refresh();
			
		}
		
		btnReconciledBack.click();
		Thread.sleep(2000);
		

	}
	
	
public void EditVATReturns(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String SuccessMsgExp) throws InterruptedException {
		
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
		lnkEdit.click();
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		Select sel1=new Select(ddlVATTypeCategory);
		sel1.selectByValue("1");
		Thread.sleep(2000);
		
		selectall_outputitem.click();
		Thread.sleep(1000);
		selectall_outputitem.click();
		Thread.sleep(1000);
		btnCalculates.click();
		Thread.sleep(2000);
		
		selectall_outputitem.click();

		Thread.sleep(1000);
		btnCalculates.click();
		Thread.sleep(2000);
				
		Reporter.log("VAT Payable: " +txtAmountT.getAttribute("value"), true);
		Assert.assertEquals(txtAmountT.getAttribute("value"), "31.67", "VAT Payable is not Matching");
		Reporter.log("VAT Payable is Matching", true);
		
		
		Reporter.log("Output Amount: " +txtOutputVatAmt.getAttribute("value"), true);
		Assert.assertEquals(txtOutputVatAmt.getAttribute("value"), "40.00", "Output Amount is not Matching");
		Reporter.log("Output Amount is Matching", true);
		
		Reporter.log("Input Amount: " +txtInputVatAmt.getAttribute("value"), true);
		Assert.assertEquals(txtInputVatAmt.getAttribute("value"), "8.33", "Input Amount is not Matching");
		Reporter.log("Input Amount is Matching", true);
		
	
		Select sel2=new Select(ddlVATTypeCategory);
		sel2.selectByValue("2");
		Thread.sleep(2000);
		
		selectall_inputitem.click();
		Thread.sleep(1000);
		selectall_inputitem.click();
		Thread.sleep(1000);
		btnCalculates.click();
		Thread.sleep(2000);
		
		selectall_inputitem.click();

		Thread.sleep(1000);
		btnCalculates.click();
		Thread.sleep(2000);
				
		Reporter.log("VAT Payable: " +txtAmountT.getAttribute("value"), true);
		Assert.assertEquals(txtAmountT.getAttribute("value"), "31.67", "VAT Payable is not Matching");
		Reporter.log("VAT Payable is Matching", true);
		
		
		Reporter.log("Output Amount: " +txtOutputVatAmt.getAttribute("value"), true);
		Assert.assertEquals(txtOutputVatAmt.getAttribute("value"), "40.00", "Output Amount is not Matching");
		Reporter.log("Output Amount is Matching", true);
		
		Reporter.log("Input Amount: " +txtInputVatAmt.getAttribute("value"), true);
		Assert.assertEquals(txtInputVatAmt.getAttribute("value"), "8.33", "Input Amount is not Matching");
		Reporter.log("Input Amount is Matching", true);
		
		btnCancel.click();
		
	}

	public void VerifyVATReturn(WebDriver driver, String TitleExp1, String TitleExp2, String TitleExp3, String SuccessMsgExp) throws InterruptedException {
	
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
		Reporter.log("VAT Payable: " +VATPayable.getText(), true);
		Assert.assertEquals(VATPayable.getText(), "£31.67", "VAT Payable is not Matching on VAT home page");
		Reporter.log("VAT Payable is Matching on VAT home page", true);
		
		lnkView.click();
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		Reporter.log("VAT Payable: " +txtVATPayableAmount.getAttribute("value"), true);
		Assert.assertEquals(txtVATPayableAmount.getAttribute("value"), "31.67", "VAT Payable is not Matching");
		Reporter.log("VAT Payable is Matching", true);
		
		
		Reporter.log("Output Amount: " +txtOutputVAT.getAttribute("value"), true);
		Assert.assertEquals(txtOutputVAT.getAttribute("value"), "40.00", "Output Amount is not Matching");
		Reporter.log("Output Amount is Matching", true);
		
		Reporter.log("Input Amount: " +txtInputVAT.getAttribute("value"), true);
		Assert.assertEquals(txtInputVAT.getAttribute("value"), "8.33", "Input Amount is not Matching");
		Reporter.log("Input Amount is Matching", true);
		
		btnBack.click();
		Thread.sleep(2000);
		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
	
	}
	
	
public void VATReturnsVerifyData(WebDriver driver, String TitleExp1, String TitleExp2) throws InterruptedException {
		
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
		toggleSettings.click();
		VATReturnPdf.click();

		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		Reporter.log("Box1 : " +Box1.getText(), true);
		Assert.assertEquals(Box1.getText(), "£50.00", "Box1 is not Matching on VAT Retun page");
		Reporter.log("Box1 is Matching on VAT Retun page", true);
		
		Reporter.log("Box2 : " +Box2.getText(), true);
		Assert.assertEquals(Box2.getText(), "£10.00", "Box2 is not Matching on VAT Retun page");
		Reporter.log("Box2 is Matching on VAT Retun page", true);
		
		Reporter.log("Box3 : " +Box3.getText(), true);
		Assert.assertEquals(Box3.getText(), "£59.99", "Box3 is not Matching on VAT Retun page");
		Reporter.log("Box3 is Matching on VAT Retun page", true);
		
		Reporter.log("Box4: " +Box4.getText(), true);
		Assert.assertEquals(Box4.getText(), "£28.32", "Box4 is not Matching on VAT Retun page");
		Reporter.log("Box4 is Matching on VAT Retun page", true);
		
		Reporter.log("Box5: " +Box5.getText(), true);
		Assert.assertEquals(Box5.getText(), "£31.67", "Box5 is not Matching on VAT Retun page");
		Reporter.log("Box5 is Matching on VAT Retun page", true);
		
		Reporter.log("Box6: " +Box6.getText(), true);
		Assert.assertEquals(Box6.getText(), "£450.00", "Box6 is not Matching on VAT Retun page");
		Reporter.log("Box6 is Matching on VAT Retun page", true);
		
		Reporter.log("Box7: " +Box7.getText(), true);
		Assert.assertEquals(Box7.getText(), "£241.67", "Box7 is not Matching on VAT home page");
		Reporter.log("Box7 is Matching on VAT Retun page", true);
		
		Reporter.log("Box8: " +Box8.getText(), true);
		Assert.assertEquals(Box8.getText(), "£100.00", "Box8 is not Matching on VAT Retun page");
		Reporter.log("Box8 is Matching on VAT Retun page", true);
		
		Reporter.log("Box9: " +Box9.getText(), true);
		Assert.assertEquals(Box9.getText(), "£50.00", "Box9 is not Matching on VAT Retun page");
		Reporter.log("Box9 is Matching on VAT Retun page", true);
		
		
	}

	public void VATReturnBackupVerifyData(WebDriver driver, String TitleExp1, String TitleExp2) throws InterruptedException {
		
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
		toggleSettings.click();
		VATBackupPdf.click();
	
		cis.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp2);
			
		Reporter.log("Company : " +Company.getText(), true);
		Assert.assertEquals(Company.getText(), "TestSA5", "Company is not Matching on VAT Retun Backup Report page");
		Reporter.log("Company is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT OUTPUT : " +VATOUTPUT.getText(), true);
		Assert.assertEquals(VATOUTPUT.getText(), "VAT OUTPUT", "VAT OUTPUT is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT OUTPUT is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT OUTPUT VAT: " +VATOUTPUTVAT.getText(), true);
		Assert.assertEquals(VATOUTPUTVAT.getText(), "£40.00", "VAT OUTPUT VAT is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT OUTPUT VAT is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT INPUT : " +VATINPUT.getText(), true);
		Assert.assertEquals(VATINPUT.getText(), "VAT INPUT", "VAT INPUT is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT INPUT is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT INPUT VAT: " +VATINPUTVAT.getText(), true);
		Assert.assertEquals(VATINPUTVAT.getText(), "£8.33", "VAT INPUT VAT is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT INPUT VAT is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("EU SALES : " +EUSALES.getText(), true);
		Assert.assertEquals(EUSALES.getText(), "EU SALES", "EU SALES is not Matching on VAT Retun Backup Report page");
		Reporter.log("EU SALES is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("EU SALES GROSS: " +EUSALESGROSS.getText(), true);
		Assert.assertEquals(EUSALESGROSS.getText(), "£200.00", "EU SALES GROSS is not Matching on VAT Retun Backup Report page");
		Reporter.log("EU SALES GROSS is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("EU PURCHASE : " +EUPURCHASE.getText(), true);
		Assert.assertEquals(EUPURCHASE.getText(), "EU PURCHASE", "EU PURCHASE is not Matching on VAT Retun Backup Report page");
		Reporter.log("EU PURCHASE is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("EU PURCHASE GROSS: " +EUPURCHASEGROSS.getText(), true);
		Assert.assertEquals(EUPURCHASEGROSS.getText(), "£219.99", "EU PURCHASE GROSS is not Matching on VAT Retun Backup Report page");
		Reporter.log("EU PURCHASE GROSS is Matching on VAT Retun Backup Report page", true);
			
		Reporter.log("VAT Output: " +VATOutput.getText(), true);
		Assert.assertEquals(VATOutput.getText(), "£40.00", "VAT Output is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT Output is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT Input: " +VATInput.getText(), true);
		Assert.assertEquals(VATInput.getText(), "£8.33", "VAT Input is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT Input is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("VAT Payable: " +VATPay.getText(), true);
		Assert.assertEquals(VATPay.getText(), "£31.67", "VAT Payable is not Matching on VAT Retun Backup Report page");
		Reporter.log("VAT Payable is Matching on VAT Retun Backup Report page", true);
		
		Reporter.log("FLAT Rate Savings: " +FlatRateSavings.getText(), true);
		Assert.assertEquals(FlatRateSavings.getText(), "£0.00", "FLAT Rate Savings is not Matching on VAT Retun Backup Report page");
		Reporter.log("FLAT Rate Savings is Matching on VAT Retun Backup Report page", true);
	}
	
	public void VATReturnsEmail(WebDriver driver, String TitleExp1, String TitleExp2, String Email) throws InterruptedException {
		
		lnkVATReturns.click();
		
		Thread.sleep(2000);
		CISPage cis=new CISPage(driver);
		cis.switchwindowForward(driver);
		VerifyPageTitle(driver, TitleActVAT, TitleExp1);
		
		toggleSettings.click();
		VATEmail.click();

		cis.switchwindowNew(driver);
		VerifyPageTitle(driver, TitleAct, TitleExp2);
		
		txtEmailId.sendKeys(Email);
		btnSave.click();
		Thread.sleep(2000);

	}
	
	
		
}

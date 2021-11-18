package com.nomisma.pom;

//import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import com.nomisma.generic.WaitStatementLib;
import com.relevantcodes.extentreports.LogStatus;

public class BookkeepingPage {

	@FindBy(xpath ="//span[contains(text(),'Invoice')]")
	private WebElement lnkInvoice;
	
	@FindBy(xpath ="//span[contains(text(),'Income')]")
	private WebElement lnkIncome;
	@FindBy(xpath ="//span[contains(text(),'Expenses')]")
	private WebElement lnkExpenses;

	@FindBy(xpath ="//div[@class='dropdown search_filter_each dashOpt-e fa fa-bars']")
	private WebElement ddlInvOptions;
	@FindBy(xpath ="//a[contains(text(),'Customer List')]")
	private WebElement LnkCustomerList;
	@FindBy(xpath ="//h2[contains(text(),'Customer')]")
	private WebElement CustomerListTitleAct;
	@FindBy(id ="ctl00_cpHeaderRight_btnAdd")
	private WebElement btnAddCustomer;
	@FindBy(xpath ="//h2")
	private WebElement TitleAct;
	
	@FindBy(linkText="Repeat Invoice")
	private WebElement RepeatInvoiceLst;
			
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
	@FindBy(xpath ="//a[contains(text(),'Undo Reconcile')]")
	private WebElement LnkUndoReconciled;
	@FindBy(id ="ctl00_cPH_chkAll")
	private WebElement chkAllUndo;
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
	
	@FindBy(id ="ctl00_ddlFinancialYear")
	private WebElement ddlFinancialYear;
	
	@FindBy(id ="search_input")
	private WebElement SearchCompany;
	@FindBy(xpath ="//a[@id='ui-id-2']")
	private WebElement SelectCompany;
	@FindBy(id ="ctl00_cPH_FileUpload1")
	private WebElement FileUpload1;
	
	//Bank & CreditCard Transactions
	@FindBy(xpath ="//span[contains(text(),'Banking')]")
	private WebElement lnkBanking;
	@FindBy(xpath ="//a[contains(text(),'Bank & Credit Card Transactions')]")
	private WebElement lnkBankCCTrans;
	@FindBy(id ="ctl00_cPHFilter_txtDateFrom")
	private WebElement txtDateFrom;
	@FindBy(id ="ctl00_cPHFilter_txtDateTo")
	private WebElement txtDateTo;
	
	@FindBy(xpath ="//a[@class='toggleSettings']")
	private WebElement toggleSettings;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkEdit")
	private WebElement lnkEdit;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkCopy")
	private WebElement lnkCopy;
	@FindBy(id="ctl00_cPH_rptrDisplayRecords_ctl00_lnkDelete")
	private WebElement lnkDelete;
	@FindBy(id ="ctl00_cphFooter_btnCancel")
	private WebElement btnCancel;
	@FindBy(id ="ctl00_cphFooter_btnSave")
	private WebElement btnSave;
	@FindBy(id ="ctl00_cphFooter_btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="SwitchFilter")
	private WebElement SwitchFilter;

	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement checkboxAll;
	@FindBy(id="ctl00_cpHeaderRight_lnlBtnEmailInvoice")
	private WebElement BtnEmailInvoice;
	@FindBy(id="ctl00_cpHeaderRight_lnlBtnInvoiceLink")
	private WebElement BtnInvoiceLink;
	@FindBy(id="ctl00_cPH_txtEmail")
	private WebElement txtEmail;
	@FindBy(xpath ="//div[contains(text(),'Email Sent Successfully!')]")
	private WebElement emailSuccessMsg;
	
	//Expenses
	@FindBy(xpath ="//a[contains(text(),'Expense Reimbursement')]")
	private WebElement ExpenseReimbursement;
	@FindBy(id="ctl00_cPH_btnAdd")
	private WebElement btnAddExpense;
	@FindBy(id="ctl00_cPH_btnAddPayment")
	private WebElement btnAddPayment;
	@FindBy(id="ctl00_cPH_btnAddAllowance")
	private WebElement btnAddAllowance;
	@FindBy(id="ctl00_cPH_btnAddMileage")
	private WebElement btnAddMileage;
	
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_txtDate")
	private WebElement txtDateExpense;
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_ddExpenseHead")
	private WebElement ddExpenseHead;
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_txtDescription")
	private WebElement txtDescriptionExpense;
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_txtAmount")
	private WebElement txtAmount;
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_ddVATRate")
	private WebElement ddVATRate;
	@FindBy(id="ctl00_cPH_rptrExpense_ctl00_txtVATAmount")
	private WebElement txtVATAmount;
	
	@FindBy(id="ctl00_cPH_rptrPayment_ctl00_txtDate")
	private WebElement txtDatePayment;
	@FindBy(id="ctl00_cPH_rptrPayment_ctl00_ddAccount")
	private WebElement ddAccount;
	@FindBy(id="ctl00_cPH_rptrPayment_ctl00_txtDescription")
	private WebElement txtDescriptionPayment;
	@FindBy(id="ctl00_cPH_rptrPayment_ctl00_txtAmount")
	private WebElement txtAmountPayment;
//	@FindBy(xpath ="//div[@class='alert alert-success']")
//	private WebElement SuccessMsg;

	
	public BookkeepingPage(EventFiringWebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void VerifyPageTitle(WebDriver driver,WebElement TitleAct, String TitleExp) {
		
		Assert.assertEquals(TitleAct.getText(), TitleExp, "Failed to verify Title");
		Reporter.log("Title verified successfully", true);
				
	}
	
	public void SearchCompany(WebDriver driver, String Company) throws InterruptedException {
		
		SearchCompany.sendKeys(Company);
		SelectCompany.click();
		Reporter.log("Company opened successfully", true);
		CISPage cis= new CISPage(driver);
		cis.switchwindowForward(driver);
				
	}
	
	
	
	public void ImportFile()
	{
		
		FileUpload1.sendKeys(System.getProperty("user.dir")+"\\testData\\logob.png");

	}
	
	public String FindLastTransaction(){
		String Trans=LastTrans.getText();
		Reporter.log("LastTransaction: "+LastTrans.getText(), true);
		return Trans;
	}

	
	/*
	 *  Method to verify Edit, Copy and Delete Repeating Invoice
	 */
	public void RepeatingInvoice(WebDriver driver, String Year1, String TitleExp1, String TitleExp2, String TitleExp3, String TitleExp4) throws InterruptedException {

		Select sel= new Select(ddlFinancialYear);
		sel.selectByVisibleText(Year1);
		
		lnkIncome.click();
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		RepeatInvoiceLst.click();

		ToggleEditOption(driver, TitleExp2);
		ToggleCopyOption(driver, TitleExp3);
		ToggleDeleteOption(driver, TitleExp4);
				
	}
	
	public void ToggleEditOption(WebDriver driver, String TitleExp) throws InterruptedException {
		
		
		toggleSettings.click();
		lnkEdit.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp);
		
		Reporter.log("Title: "+TitleAct.getText(),true);
		btnCancel.click();
		RFP.switchwindowDefault(driver);

	}
	
	public void ToggleCopyOption(WebDriver driver, String TitleExp) throws InterruptedException {
		
		Reporter.log("Title: "+TitleAct.getText(),true);
		WaitStatementLib wait = new WaitStatementLib();
		wait.explicitWait(driver, 10, toggleSettings);
		driver.navigate().refresh();
		ReadFilesPage RFP= new ReadFilesPage(driver);
		toggleSettings.click();
		lnkCopy.click();
		
		
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp);
		
		btnSave.click();
		RFP.switchwindowDefault(driver);

	}
	
	public void ToggleDeleteOption(WebDriver driver, String TitleExp) throws InterruptedException {
		
		toggleSettings.click();
		lnkDelete.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp);
		
		btnDelete.click();
		RFP.switchwindowDefault(driver);

	}
	
	/*
	 *  Method to send Invoice Email
	 */
	public void EmailInvoice(WebDriver driver, String Year1, String TitleExp1, String emailId, String SuccessMsg1) throws InterruptedException {

		WaitStatementLib wait = new WaitStatementLib();
		Select sel= new Select(ddlFinancialYear);
		sel.selectByVisibleText(Year1);
	
		lnkIncome.click();
		
		SwitchFilter.click();
		btnSearch.click();
		checkboxAll.click();
		
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		
		BtnEmailInvoice.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		txtEmail.sendKeys(emailId);
		btnSave.click();
		
		wait.explicitWait(driver, 10, emailSuccessMsg);
		Reporter.log("emailSuccessMsg: "+emailSuccessMsg.getText(),true);

		Reporter.log("Success Message verified successfully", true);
				
		
			
	}
	
	/*
	 *  Method to send Invoice Link in Email
	 */
	public void InvoiceLink(WebDriver driver, String Year1, String TitleExp1, String emailId, String SuccessMsg1, String dateFrom, String dateTo) throws InterruptedException {

		WaitStatementLib wait = new WaitStatementLib();
		Select sel= new Select(ddlFinancialYear);
		sel.selectByVisibleText(Year1);
		
		lnkIncome.click();
		SwitchFilter.click();
		txtDateFrom.clear();
		txtDateFrom.sendKeys(dateFrom);
		txtDateTo.sendKeys(dateTo);
		btnSearch.click();
		checkboxAll.click();
		
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();

		
		BtnInvoiceLink.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		txtEmail.sendKeys(emailId);
		btnSave.click();

		wait.explicitWait(driver, 10, emailSuccessMsg);
		Reporter.log("emailSuccessMsg: "+emailSuccessMsg.getText(),true);

		Reporter.log("Success Message verified successfully", true);
				
	}
	
	/*
	 *  Method to Add Expense
	 */
	public void ExpenseReimbursement_AddExpense(WebDriver driver, String Year1, String TitleExp1, String date, String ExpenseHead, String Description, String Amount, String VATRate, String VATAmount0,String VATAmount) throws InterruptedException {

		Select sel= new Select(ddlFinancialYear);
		sel.selectByVisibleText(Year1);
		
		lnkExpenses.click();
		
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();
		
		ExpenseReimbursement.click();
		
		btnAddExpense.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		txtDateExpense.clear();
		txtDateExpense.sendKeys(date);
		
		Select sel1 = new Select(ddExpenseHead);
		sel1.selectByVisibleText(ExpenseHead);
		
		txtDescriptionExpense.sendKeys(Description);
		   
		Select sel2 = new Select(ddVATRate);
		sel2.selectByVisibleText(VATRate);
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.
		
		WaitStatementLib wait = new WaitStatementLib();
		wait.explicitWait_textToBePresentInElementValue(driver, 10, txtVATAmount, VATAmount0);
		
		txtDescriptionExpense.clear();
		txtDescriptionExpense.sendKeys(Description);
		txtAmount.sendKeys(Amount);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.RETURN).build().perform();
		wait.explicitWait_textToBePresentInElementValue(driver, 10, txtVATAmount, VATAmount);

		btnSave.click();
		
		RFP.switchwindowDefault(driver);
		wait.explicitWait(driver, 10, SuccessMsg);
		Reporter.log("Success Message: "+SuccessMsg.getText(),true);

							
	}
	
	/*
	 *  Method to Add Payment
	 */
	public void ExpenseReimbursement_AddPayment(WebDriver driver, String Year1, String TitleExp1, String date, String Account, String Description, String Amount) throws InterruptedException {

		Select sel= new Select(ddlFinancialYear);
		sel.selectByVisibleText(Year1);
		
		lnkExpenses.click();
		
		driver.manage().window().maximize();		
		Actions action = new Actions(driver);
		action.moveToElement(ddlInvOptions).click().perform();
		
		ExpenseReimbursement.click();
		
		btnAddPayment.click();
		
		ReadFilesPage RFP= new ReadFilesPage(driver);
		RFP.switchwindowNew(driver);
		
		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
		txtDatePayment.clear();
		txtDatePayment.sendKeys(date);
		
		Select sel1 = new Select(ddAccount);
		sel1.selectByVisibleText(Account);
		txtDescriptionPayment.sendKeys(Description);
		txtAmountPayment.sendKeys(Amount);
			
		btnSave.click();
		
		RFP.switchwindowDefault(driver);
		WaitStatementLib wait = new WaitStatementLib();
		wait.explicitWait(driver, 10, SuccessMsg);
		Reporter.log("Success Message: "+SuccessMsg.getText(),true);
		
						
	}
}

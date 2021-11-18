package com.nomisma.SAMTR_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;
import com.nomisma.pom.CISPage;
public class SAMTRLibrary {
	@FindBy(xpath="//a[contains(text(),'MTRTestCase1')]")	
	private WebElement mtrClientCaset1;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase2')]")	
	private WebElement mtrClientCaset2;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase3')]")	
	private WebElement mtrClientCaset3;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase4')]")	
	private WebElement mtrClientCaset4;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase9')]")	
	private WebElement mtrClientCaset9;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase10')]")	
	private WebElement mtrClientCaset10;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase14')]")	
	private WebElement mtrClientCaset14;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase15')]")	
	private WebElement mtrClientCaset15;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase16')]")	
	private WebElement mtrClientCaset16;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase17')]")	
	private WebElement mtrClientCaset17;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase24')]")	
	private WebElement mtrClientCaset24;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase38')]")	
	private WebElement mtrClientCaset38;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase48')]")	
	private WebElement mtrClientCaset48;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase50')]")	
	private WebElement mtrClientCaset50;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase54')]")	
	private WebElement mtrClientCaset54;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase191')]")	
	private WebElement mtrClientCaset191;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtFirstName")
	private WebElement firstNameScheduleMail;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy (id="ctl00_ddlTaxYear")
	private WebElement TaxYear;
	private String firstPageTitle;
	CISPage cis;
	WaitStatementLib wLib;
	public SAMTRLibrary(WebDriver driver){
		firstPageTitle = driver.getTitle();
		Assert.assertEquals(firstPageTitle, "Agents");
		Reporter.log("First page Title fetched: "+firstPageTitle,true);
		PageFactory.initElements(driver, this);
		}
	public void selectClientTest1(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase1");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset1);
		mtrClientCaset1.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 1", true);	
			}
	public void selectClientTest2(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase2");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset2);
		mtrClientCaset2.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 2", true);	
			}
	public void selectClientTest3(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase3");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		
		wLib.explicitWait(driver, 10,mtrClientCaset3);
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 3", true);	
			}
	public void selectClientTest4(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase4");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset4);
		mtrClientCaset4.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 4", true);	
			}
	public void selectClientTest9(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase9");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset9);
		mtrClientCaset9.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 9", true);	
			}
	public void selectClientTest10(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase10");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset10);
		mtrClientCaset10.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 10", true);	
			}
	public void selectClientTest14(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase14");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset14);
		mtrClientCaset14.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 14", true);	
			}
	public void selectClientTest15(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase15");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset15);
		mtrClientCaset15.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 15", true);	
	}
	public void selectClientTest16(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase16");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset16);
		mtrClientCaset16.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 16", true);	
	}
	public void selectClientTest17(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase17");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset17);
		mtrClientCaset17.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 17", true);	
	}
	public void selectClientTest24(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase24");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset24);
		mtrClientCaset24.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 24", true);	
	}
		public void selectClientTest38(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase38");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCaset38);
		mtrClientCaset38.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		wLib.explicitWait(driver, 10,TaxYear);
		Select year= new Select(TaxYear);
		year.selectByValue("5");
		Reporter.log("Client Selected for Test Case 38", true);	
	}
		public void selectClientTest48(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase48");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCaset48);
			mtrClientCaset48.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			wLib.explicitWait(driver, 10,TaxYear);
			Select year= new Select(TaxYear);
			year.selectByValue("5");
			Reporter.log("Client Selected for Test Case 48", true);	
		}
		public void selectClientTest50(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase50");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCaset50);
			mtrClientCaset50.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			wLib.explicitWait(driver, 10,TaxYear);
			Select year= new Select(TaxYear);
			year.selectByValue("5");
			Reporter.log("Client Selected for Test Case 50", true);	
		}
		public void selectClientTest54(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase54");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCaset54);
			mtrClientCaset54.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			wLib.explicitWait(driver, 10,TaxYear);
			Select year= new Select(TaxYear);
			year.selectByValue("5");
			Reporter.log("Client Selected for Test Case 54", true);	
		}
		public void selectClientTest191(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase191");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCaset191);
			mtrClientCaset191.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			wLib.explicitWait(driver, 10,TaxYear);
			Select year= new Select(TaxYear);
			year.selectByValue("5");
			Reporter.log("Client Selected for Test Case 191", true);	
		}
}

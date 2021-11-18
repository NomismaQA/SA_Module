package com.nomisma.SAMTR_POM2019;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;
import com.nomisma.pom.CISPage;
public class SAMTRLibrary2019 {
	@FindBy (id="ctl00_ctl00_ParentContent_cpHeaderRight_ddlTaxYear")
	public WebElement selectYearLstBox;
	@FindBy(xpath="//a[contains(text(),'Test1')]")	
	private WebElement mtrClientTest1;
	@FindBy(xpath="//a[contains(text(),'Test')]")	
	private WebElement Test_96;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase1')]")	
	private WebElement mtrClientCase1;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase2')]")	
	private WebElement mtrClientCase2;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase3')]")	
	private WebElement mtrClientCase3;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase4')]")	
	private WebElement mtrClientCase4;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase5')]")	
	private WebElement mtrClientCase5;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase6')]")	
	private WebElement mtrClientCase6;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase7')]")	
	private WebElement mtrClientCase7;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase8')]")	
	private WebElement mtrClientCase8;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase9')]")	
	private WebElement mtrClientCase9;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase10')]")	
	private WebElement mtrClientCase10;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase11')]")	
	private WebElement mtrClientCase11;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase12')]")	
	private WebElement mtrClientCase12;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase13')]")	
	private WebElement mtrClientCase13;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase14')]")	
	private WebElement mtrClientCase14;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase15')]")	
	private WebElement mtrClientCase15;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase16')]")	
	private WebElement mtrClientCase16;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase17')]")	
	private WebElement mtrClientCase17;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase18')]")	
	private WebElement mtrClientCase18;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase19')]")	
	private WebElement mtrClientCase19;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase20')]")	
	private WebElement mtrClientCase20;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase21')]")	
	private WebElement mtrClientCase21;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase22')]")	
	private WebElement mtrClientCase22;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase23')]")	
	private WebElement mtrClientCase23;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase24')]")	
	private WebElement mtrClientCase24;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase25')]")	
	private WebElement mtrClientCase25;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase28')]")	
	private WebElement mtrClientCase28;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase29')]")	
	private WebElement mtrClientCase29;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase30')]")	
	private WebElement mtrClientCase30;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase31')]")	
	private WebElement mtrClientCase31;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase32')]")	
	private WebElement mtrClientCase32;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase33')]")	
	private WebElement mtrClientCase33;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase35')]")	
	private WebElement mtrClientCase35;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase36')]")	
	private WebElement mtrClientCase36;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase37')]")	
	private WebElement mtrClientCase37;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase38')]")	
	private WebElement mtrClientCase38;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase40')]")	
	private WebElement mtrClientCase40;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase41')]")	
	private WebElement mtrClientCase41;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase42')]")	
	private WebElement mtrClientCase42;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase43')]")	
	private WebElement mtrClientCase43;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase44')]")	
	private WebElement mtrClientCase44;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase45')]")	
	private WebElement mtrClientCase45;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase48')]")	
	private WebElement mtrClientCase48;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase49')]")	
	private WebElement mtrClientCase49;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase50')]")	
	private WebElement mtrClientCase50;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase51')]")	
	private WebElement mtrClientCase51;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase52')]")	
	private WebElement mtrClientCase52;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase53')]")	
	private WebElement mtrClientCase53;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase54')]")	
	private WebElement mtrClientCase54;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase56')]")	
	private WebElement mtrClientCase56;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase57')]")	
	private WebElement mtrClientCase57;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase58')]")	
	private WebElement mtrClientCase58;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase59')]")	
	private WebElement mtrClientCase59;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase60')]")	
	private WebElement mtrClientCase60;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase61')]")	
	private WebElement mtrClientCase61;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase62')]")	
	private WebElement mtrClientCase62;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase63')]")	
	private WebElement mtrClientCase63;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase64')]")	
	private WebElement mtrClientCase64;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase65')]")	
	private WebElement mtrClientCase65;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase66')]")	
	private WebElement mtrClientCase66;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase67')]")	
	private WebElement mtrClientCase67;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase68')]")	
	private WebElement mtrClientCase68;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase69')]")	
	private WebElement mtrClientCase69;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase70')]")	
	private WebElement mtrClientCase70;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase71')]")	
	private WebElement mtrClientCase71;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase73')]")	
	private WebElement mtrClientCase73;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase74')]")	
	private WebElement mtrClientCase74;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase75')]")	
	private WebElement mtrClientCase75;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase76')]")	
	private WebElement mtrClientCase76;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase77')]")	
	private WebElement mtrClientCase77;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase78')]")	
	private WebElement mtrClientCase78;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase79')]")	
	private WebElement mtrClientCase79;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase80')]")	
	private WebElement mtrClientCase80;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase82')]")	
	private WebElement mtrClientCase82;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase84')]")	
	private WebElement mtrClientCase84;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase85')]")	
	private WebElement mtrClientCase85;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase87')]")	
	private WebElement mtrClientCase87;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase88')]")	
	private WebElement mtrClientCase88;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase90')]")	
	private WebElement mtrClientCase90;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase91')]")	
	private WebElement mtrClientCase91;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase92')]")	
	private WebElement mtrClientCase92;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase93')]")	
	private WebElement mtrClientCase93;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase94')]")	
	private WebElement mtrClientCase94;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase95')]")	
	private WebElement mtrClientCase95;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase96')]")	
	private WebElement mtrClientCase96;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase97')]")	
	private WebElement mtrClientCase97;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase98')]")	
	private WebElement mtrClientCase98;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase99')]")	
	private WebElement mtrClientCase99;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase100')]")	
	private WebElement mtrClientCase100;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase101')]")	
	private WebElement mtrClientCase101;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase102')]")	
	private WebElement mtrClientCase102;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase103')]")	
	private WebElement mtrClientCase103;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase104')]")	
	private WebElement mtrClientCase104;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase107')]")	
	private WebElement mtrClientCase107;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase109')]")	
	private WebElement mtrClientCase109;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase110')]")	
	private WebElement mtrClientCase110;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase114')]")	
	private WebElement mtrClientCase114;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase115')]")	
	private WebElement mtrClientCase115;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase116')]")	
	private WebElement mtrClientCase116;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase117')]")	
	private WebElement mtrClientCase117;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase118')]")	
	private WebElement mtrClientCase118;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase119')]")	
	private WebElement mtrClientCase119;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase120')]")	
	private WebElement mtrClientCase120;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase121')]")	
	private WebElement mtrClientCase121;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase125')]")	
	private WebElement mtrClientCase125;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase126')]")	
	private WebElement mtrClientCase126;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase127')]")	
	private WebElement mtrClientCase127;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase128')]")	
	private WebElement mtrClientCase128;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase129')]")	
	private WebElement mtrClientCase129;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase130')]")	
	private WebElement mtrClientCase130;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase131')]")	
	private WebElement mtrClientCase131;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase132')]")	
	private WebElement mtrClientCase132;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase133')]")	
	private WebElement mtrClientCase133;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase136')]")	
	private WebElement mtrClientCase136;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase137')]")	
	private WebElement mtrClientCase137;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase149')]")	
	private WebElement mtrClientCase149;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase150')]")	
	private WebElement mtrClientCase150;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase151')]")	
	private WebElement mtrClientCase151;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase152')]")	
	private WebElement mtrClientCase152;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase153')]")	
	private WebElement mtrClientCase153;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase154')]")	
	private WebElement mtrClientCase154;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase155')]")	
	private WebElement mtrClientCase155;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase156')]")	
	private WebElement mtrClientCase156;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase157')]")	
	private WebElement mtrClientCase157;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase158')]")	
	private WebElement mtrClientCase158;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase159')]")	
	private WebElement mtrClientCase159;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase160')]")					
	private WebElement mtrClientCase160;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase161')]")					
	private WebElement mtrClientCase161;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase162')]")					
	private WebElement mtrClientCase162;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase163')]")					
	private WebElement mtrClientCase163;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase165')]")					
	private WebElement mtrClientCase165;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase166')]")					
	private WebElement mtrClientCase166;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase167')]")					
	private WebElement mtrClientCase167;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase168')]")					
	private WebElement mtrClientCase168;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase169')]")					
	private WebElement mtrClientCase169;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase172')]")					
	private WebElement mtrClientCase172;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase173')]")					
	private WebElement mtrClientCase173;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase174')]")					
	private WebElement mtrClientCase174;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase175')]")					
	private WebElement mtrClientCase175;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase176')]")	
	private WebElement mtrClientCase176;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase177')]")	
	private WebElement mtrClientCase177;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase179')]")	
	private WebElement mtrClientCase179;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase178')]")	
	private WebElement mtrClientCase178;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase182')]")	
	private WebElement mtrClientCase182;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase184')]")	
	private WebElement mtrClientCase184;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase185')]")	
	private WebElement mtrClientCase185;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase186')]")	
	private WebElement mtrClientCase186;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase187')]")	
	private WebElement mtrClientCase187;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase188')]")	
	private WebElement mtrClientCase188;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase189')]")	
	private WebElement mtrClientCase189;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase190')]")	
	private WebElement mtrClientCase190;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase191')]")	
	private WebElement mtrClientCase191;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase192')]")	
	private WebElement mtrClientCase192;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase195')]")	
	private WebElement mtrClientCase195;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase198')]")	
	private WebElement mtrClientCase198;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase201')]")	
	private WebElement mtrClientCase201;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase202')]")	
	private WebElement mtrClientCase202;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase203')]")	
	private WebElement mtrClientCase203;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase204')]")	
	private WebElement mtrClientCase204;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase207')]")	
	private WebElement mtrClientCase207;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase208')]")	
	private WebElement mtrClientCase208;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase209')]")	
	private WebElement mtrClientCase209;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase210')]")	
	private WebElement mtrClientCase210;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase211')]")	
	private WebElement mtrClientCase211;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase212')]")	
	private WebElement mtrClientCase212;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase213')]")	
	private WebElement mtrClientCase213;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase214')]")	
	private WebElement mtrClientCase214;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase215')]")	
	private WebElement mtrClientCase215;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase216')]")	
	private WebElement mtrClientCase216;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase218')]")	
	private WebElement mtrClientCase218;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase219')]")	
	private WebElement mtrClientCase219;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase220')]")	
	private WebElement mtrClientCase220;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase221')]")	
	private WebElement mtrClientCase221;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase222')]")	
	private WebElement mtrClientCase222;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase223')]")	
	private WebElement mtrClientCase223;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase224')]")	
	private WebElement mtrClientCase224;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase225')]")	
	private WebElement mtrClientCase225;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase226')]")	
	private WebElement mtrClientCase226;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase227')]")	
	private WebElement mtrClientCase227;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase228')]")	
	private WebElement mtrClientCase228;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase229')]")	
	private WebElement mtrClientCase229;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase230')]")	
	private WebElement mtrClientCase230;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase231')]")	
	private WebElement mtrClientCase231;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase232')]")	
	private WebElement mtrClientCase232;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase233')]")	
	private WebElement mtrClientCase233;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase234')]")
	private WebElement mtrClientCase234;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase235')]")	
	private WebElement mtrClientCase235;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase236')]")	
	private WebElement mtrClientCase236;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase237')]")	
	private WebElement mtrClientCase237;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase238')]")	
	private WebElement mtrClientCase238;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase239')]")	
	private WebElement mtrClientCase239;
	@FindBy(xpath="//a[contains(text(),'MTRTestCase240')]")	
	private WebElement mtrClientCase240;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtFirstName")
	private WebElement firstNameScheduleMail;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_txtLastName")
	private WebElement lastNameScheduleMail;
	@FindBy (id="ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy (id="ctl00_ddlTaxYear")
	private WebElement TaxYear;
	@FindBy (id="ctl00_ctl00_ParentContent_cpHeaderRight_LinkButtonEx1")
	public WebElement goBtn;
	private Select year1;
	private String firstPageTitle;
	CISPage cis;
	WaitStatementLib wLib;
	public SAMTRLibrary2019(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		}
	public void selectClientDummy(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("Test1");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientTest1);
		mtrClientTest1.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 2", true);	
			}
	public void selectClientTest1(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		
		firstNameScheduleMail.sendKeys("MTRTestCase1");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase1);
		mtrClientCase1.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 1", true);	
			}
	public void selectClientTest2(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase2");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase2);
		mtrClientCase2.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 2", true);	
			}
	public void selectClientTest3(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase3");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase3);
		mtrClientCase3.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 3", true);	
			}
	public void selectClientTest4(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase4");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase4);
		mtrClientCase4.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 4", true);	
			}
	public void selectClientTest5(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase5");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase5);
		mtrClientCase5.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 5", true);	
			}
	public void selectClientTest6(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase6");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase6);
		mtrClientCase6.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 6", true);	
			}
	public void selectClientTest7(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase7");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase7);
		mtrClientCase7.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		
		Reporter.log("Client Selected for Test Case 7", true);	
			}
	public void selectClientTest8(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase8");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase8);
		mtrClientCase8.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 8", true);	
			}
	public void selectClientTest9(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase9");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase9);
		mtrClientCase9.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 9", true);	
			}
	public void selectClientTest10(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase10");
		wLib.explicitWait(driver,10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase10);
		mtrClientCase10.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 10", true);	
			}
	public void selectClientTest11(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 11,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase11");
		wLib.explicitWait(driver,10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase11);
		mtrClientCase11.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 11", true);	
			}
	public void selectClientTest12(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase12");
		wLib.explicitWait(driver,10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase12);
		mtrClientCase12.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 12", true);	
			}
	public void selectClientTest13(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase13");
		wLib.explicitWait(driver,10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase13);
		mtrClientCase13.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 13", true);	
			}
	public void selectClientTest14(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase14");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase14);
		mtrClientCase14.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 14", true);	
			}
	public void selectClientTest15(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase15");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase15);
		mtrClientCase15.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
	Reporter.log("Client Selected for Test Case 15", true);	
	}
	public void selectClientTest16(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase16");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase16);
		mtrClientCase16.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 16", true);	
	}
	public void selectClientTest17(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase17");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase17);
		mtrClientCase17.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 17", true);	
	}
	public void selectClientTest18(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase18");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase18);
		mtrClientCase18.click();
		cis.switchwindowForward(driver);
	Reporter.log("Client Selected for Test Case 18", true);	
	}
	public void selectClientTest19(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase19");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase19);
		mtrClientCase19.click();
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 19", true);	
	}
	public void selectClientTest20(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase20");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase20);
		mtrClientCase20.click();
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 20", true);	
	}
	public void selectClientTest21(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase21");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase21);
		mtrClientCase21.click();
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 21", true);	
	}
	
	public void selectClientTest22(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase22");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase22);
		mtrClientCase22.click();
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 22", true);	
	}
	public void selectClientTest23(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		cis = new CISPage(driver);
		wLib.explicitWait(driver, 5,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 5,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase23");
		wLib.explicitWait(driver, 5,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 5,mtrClientCase23);
		mtrClientCase23.click();
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 23", true);	
	}
	public void selectClientTest24(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase24");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase24);
		mtrClientCase24.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 24", true);	
	}
	public void selectClientTest25(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase25");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase25);
		mtrClientCase25.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 25", true);	
	}
	public void selectClientTest28(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase28");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase28);
		mtrClientCase28.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 28", true);	
	}
	public void selectClientTest29(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase29");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase29);
		mtrClientCase29.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 29", true);	
	}
	public void selectClientTest30(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase30");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase30);
		mtrClientCase30.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 30", true);	
	}
	public void selectClientTest31(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase31");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase31);
		mtrClientCase31.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 31", true);	
	}
	public void selectClientTest32(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase32");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase32);
		mtrClientCase32.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 32", true);	
	}
	public void selectClientTest33(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase33");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase33);
		mtrClientCase33.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 33", true);	
	}
	public void selectClientTest35(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase35");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase35);
		mtrClientCase35.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 35", true);	
	}
	public void selectClientTest36(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase36");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase36);
		mtrClientCase36.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 36", true);	
	}
	public void selectClientTest37(WebDriver driver) throws InterruptedException {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver, 10,selectYearLstBox);
		year1= new Select(selectYearLstBox);
		year1.selectByValue("6");
		goBtn.click();
		wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase37");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase37);
		mtrClientCase37.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 37", true);	
	}
		public void selectClientTest38(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
		firstNameScheduleMail.sendKeys("MTRTestCase38");
		wLib.explicitWait(driver, 10,searchBtn);
		searchBtn.click();
		wLib.explicitWait(driver, 10,mtrClientCase38);
		mtrClientCase38.click();
		cis = new CISPage(driver);
		cis.switchwindowForward(driver);
		Reporter.log("Client Selected for Test Case 38", true);	
	}
		public void selectClientTest40(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase40");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase40);
			mtrClientCase40.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 40", true);	
		}
		public void selectClientTest41(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase41");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase41);
			mtrClientCase41.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 41", true);	
		}
		public void selectClientTest42(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase42");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase42);
			mtrClientCase42.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 42", true);	
		}
		public void selectClientTest43(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase43");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase43);
			mtrClientCase43.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 43", true);	
		}
		public void selectClientTest44(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase44");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase44);
			mtrClientCase44.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 44", true);	
		}
		public void selectClientTest45(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase45");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase45);
			mtrClientCase45.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 44", true);	
		}
		public void selectClientTest48(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase48");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase48);
			mtrClientCase48.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 48", true);	
		}
		public void selectClientTest49(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase49");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase49);
			mtrClientCase49.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 49", true);	
		}
		public void selectClientTest50(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase50");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase50);
			mtrClientCase50.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 50", true);	
		}
		public void selectClientTest51(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase51");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase51);
			mtrClientCase51.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 51", true);	
		}
		public void selectClientTest52(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase52");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase52);
			mtrClientCase52.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 52", true);	
		}
		public void selectClientTest53(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase53");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase53);
			mtrClientCase53.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 53", true);	
		}
		public void selectClientTest54(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase54");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase54);
			mtrClientCase54.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 54", true);	
		}
		public void selectClientTest56(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase56");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase56);
			mtrClientCase56.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 56", true);	
		}
		public void selectClientTest57(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase57");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase57);
			mtrClientCase57.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 57", true);	
		}
		public void selectClientTest58(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase58");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase58);
			mtrClientCase58.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 58", true);	
		}
		public void selectClientTest59(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase59");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase59);
			mtrClientCase59.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 59", true);	
		}
		public void selectClientTest60(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase60");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase60);
			mtrClientCase60.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 60", true);	
		}
		public void selectClientTest61(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase61");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase61);
			mtrClientCase61.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 61", true);	
		}
		public void selectClientTest62(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase62");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase62);
			mtrClientCase62.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 62", true);	
		}
		public void selectClientTest63(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase63");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase63);
			mtrClientCase63.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 63", true);	
		}
		public void selectClientTest64(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase64");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase64);
			mtrClientCase64.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 64", true);	
		}
		public void selectClientTest65(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase65");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase65);
			mtrClientCase65.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 65", true);	
		}
		public void selectClientTest66(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase66");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase66);
			mtrClientCase66.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 66", true);	
		}
		public void selectClientTest67(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase67");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase67);
			mtrClientCase67.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 67", true);	
		}
		public void selectClientTest68(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase68");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase68);
			mtrClientCase68.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 68", true);	
		}
		public void selectClientTest69(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase69");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase69);
			mtrClientCase69.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 69", true);	
		}
		public void selectClientTest70(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase70");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase70);
			mtrClientCase70.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 70", true);	
		}
		public void selectClientTest71(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase71");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase71);
			mtrClientCase71.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 71", true);	
		}
		public void selectClientTest73(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase73");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase73);
			mtrClientCase73.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 73", true);	
		}
		public void selectClientTest74(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase74");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase74);
			mtrClientCase74.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 74", true);	
		}
		public void selectClientTest75(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase75");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase75);
			mtrClientCase75.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 75", true);	
		}
		public void selectClientTest76(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase76");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase76);
			mtrClientCase76.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 76", true);	
		}
		public void selectClientTest77(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase77");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase77);
			mtrClientCase77.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 77", true);	
		}
		public void selectClientTest78(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase78");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase78);
			mtrClientCase78.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 78", true);	
		}
		public void selectClientTest79(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase79");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase79);
			mtrClientCase79.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 79", true);	
		}
		public void selectClientTest80(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase80");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase80);
			mtrClientCase80.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 80", true);	
		}
		public void selectClientTest82(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase82");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase82);
			mtrClientCase82.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 82", true);	
		}
		public void selectClientTest84(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase84");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase84);
			mtrClientCase84.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 84", true);	
		}
		public void selectClientTest85(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase85");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase85);
			mtrClientCase85.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 85", true);	
		}
		public void selectClientTest87(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase87");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase87);
			mtrClientCase87.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 87", true);	
		}
		public void selectClientTest88(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase88");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase88);
			mtrClientCase88.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 88", true);	
		}
		public void selectClientTest90(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase90");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase90);
			mtrClientCase90.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 90", true);	
		}
		public void selectClientTest91(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase91");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase91);
			mtrClientCase91.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 91", true);	
		}
		public void selectClientTest92(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase92");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase92);
			mtrClientCase92.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 92", true);	
		}
		public void selectClientTest93(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase93");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase93);
			mtrClientCase93.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 93", true);	
		}
		public void selectClientTest94(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase94");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase94);
			mtrClientCase94.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 94", true);	
		}
		public void selectClientTest95(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase95");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase95);
			mtrClientCase95.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 95", true);	
		}
		public void selectClientTest96(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase96");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase96);
			mtrClientCase96.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 96", true);	
		}
		public void selectClientTest97(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase97");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase97);
			mtrClientCase97.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 97", true);	
		}
		public void selectClientTest98(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase98");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase98);
			mtrClientCase98.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 98", true);	
		}
		public void selectClientTest99(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase99");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase99);
			mtrClientCase99.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 99", true);	
		}
		public void selectClientTest100(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase100");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase100);
			mtrClientCase100.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 100", true);	
		}
		public void selectClientTest101(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase101");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase101);
			mtrClientCase101.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 101", true);	
		}
		public void selectClientTest102(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase102");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase102);
			mtrClientCase102.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 102", true);	
		}
		public void selectClientTest103(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase103");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase103);
			mtrClientCase103.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 103", true);	
		}
		public void selectClientTest104(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase104");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase104);
			mtrClientCase104.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 104", true);	
		}
		public void selectClientTest107(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase107");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase107);
			mtrClientCase107.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 107", true);	
		}
		public void selectClientTest109(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase109");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase109);
			mtrClientCase109.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 109", true);	
		}
		public void selectClientTest110(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase110");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase110);
			mtrClientCase110.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 110", true);	
		}
		public void selectClientTest114(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase114");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase114);
			mtrClientCase114.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 114", true);	
		}
		public void selectClientTest115(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase115");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase115);
			mtrClientCase115.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 115", true);	
		}
		public void selectClientTest116(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase116");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase116);
			mtrClientCase116.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 116", true);	
		}
		public void selectClientTest117(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase117");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase117);
			mtrClientCase117.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 117", true);	
		}
		public void selectClientTest118(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase118");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase118);
			mtrClientCase118.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 118", true);	
		}
		public void selectClientTest119(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase119");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase119);
			mtrClientCase119.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 119", true);	
		}
		public void selectClientTest120(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase120");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase120);
			mtrClientCase120.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 120", true);	
		}
		public void selectClientTest121(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase121");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase121);
			mtrClientCase121.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 121", true);	
		}
		public void selectClientTest125(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase125");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase125);
			mtrClientCase125.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 125", true);	
		}
		public void selectClientTest126(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase126");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase126);
			mtrClientCase126.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 126", true);	
		}
		public void selectClientTest127(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase127");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase127);
			mtrClientCase127.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 127", true);	
		}
		public void selectClientTest128(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase128");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase128);
			mtrClientCase128.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 128", true);	
		}
		public void selectClientTest129(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase129");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase129);
			mtrClientCase129.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 129", true);	
		}
		public void selectClientTest130(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase130");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase130);
			mtrClientCase130.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 130", true);	
		}
		public void selectClientTest131(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase131");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase131);
			mtrClientCase131.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 131", true);	
		}
		public void selectClientTest132(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase132");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase132);
			mtrClientCase132.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 132", true);	
		}
		public void selectClientTest133(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase133");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase133);
			mtrClientCase133.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 133", true);	
		}
		public void selectClientTest136(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase136");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase136);
			mtrClientCase136.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 136", true);	
		}
		public void selectClientTest137(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase137");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase137);
			mtrClientCase137.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 137", true);	
		}
		public void selectClientTest149(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase149");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase149);
			mtrClientCase149.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 149", true);	
		}
		public void selectClientTest150(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase150");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase150);
			mtrClientCase150.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 150", true);	
		}
		public void selectClientTest151(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase151");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase151);
			mtrClientCase151.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 151", true);	
		}
		public void selectClientTest152(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase152");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase152);
			mtrClientCase152.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 152", true);	
		}
		public void selectClientTest153(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase153");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase153);
			mtrClientCase153.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 153", true);	
		}
		public void selectClientTest154(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase154");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase154);
			mtrClientCase154.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 154", true);	
		}
		public void selectClientTest155(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase155");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase155);
			mtrClientCase155.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 155", true);	
		}
		public void selectClientTest156(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase156");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase156);
			mtrClientCase156.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 156", true);	
		}
		public void selectClientTest157(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase157");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase157);
			mtrClientCase157.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 157", true);	
		}
		public void selectClientTest158(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase158");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase158);
			mtrClientCase158.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 158", true);	
		}
		public void selectClientTest159(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase159");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase159);
			mtrClientCase159.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 159", true);	
		}
		public void selectClientTest160(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase160");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase160);
			mtrClientCase160.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 160", true);	
		}
		public void selectClientTest161(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase161");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase161);
			mtrClientCase161.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 161", true);	
		}
		public void selectClientTest162(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase162");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase162);
			mtrClientCase162.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 162", true);	
		}
		public void selectClientTest163(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase163");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase163);
			mtrClientCase163.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 163", true);	
		}
		public void selectClientTest165(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase165");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase165);
			mtrClientCase165.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 165", true);	
		}
		public void selectClientTest166(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase166");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase166);
			mtrClientCase166.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 166", true);	
		}
		public void selectClientTest167(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase167");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase167);
			mtrClientCase167.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 167", true);	
		}
		public void selectClientTest168(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase168");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase168);
			mtrClientCase168.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 168", true);	
		}
		public void selectClientTest169(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase169");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase169);
			mtrClientCase169.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 169", true);	
		}
		public void selectClientTest172(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase172");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase172);
			mtrClientCase172.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 172", true);	
		}
		public void selectClientTest173(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase173");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase173);
			mtrClientCase173.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 173", true);	
		}
		public void selectClientTest174(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase174");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase174);
			mtrClientCase174.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 174", true);	
		}
		public void selectClientTest175(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase175");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase175);
			mtrClientCase175.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 175", true);	
		}
		public void selectClientTest176(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase176");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase176);
			mtrClientCase176.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 176", true);	
		}
		public void selectClientTest177(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase177");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase177);
			mtrClientCase177.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 177", true);	
		}
		
		public void selectClientTest178(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase178");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase178);
			mtrClientCase178.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 178", true);	
		}
		public void selectClientTest179(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase179");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase179);
			mtrClientCase179.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 179", true);	
		}
		public void selectClientTest182(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase182");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase182);
			mtrClientCase182.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 182", true);	
		}
		public void selectClientTest184(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase184");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase184);
			mtrClientCase184.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 184", true);	
		}
		public void selectClientTest185(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase185");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase185);
			mtrClientCase185.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 185", true);	
		}
		public void selectClientTest186(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase186");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase186);
			mtrClientCase186.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 186", true);	
		}
		public void selectClientTest187(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase187");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase187);
			mtrClientCase187.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 187", true);	
		}
		public void selectClientTest188(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase188");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase188);
			mtrClientCase188.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 188", true);	
		}		
		public void selectClientTest189(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase189");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase189);
			mtrClientCase189.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 189", true);	
		}
		public void selectClientTest190(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase190");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase190);
			mtrClientCase190.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 190", true);	
		}
		public void selectClientTest191(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase191");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase191);
			mtrClientCase191.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 191", true);	
		}
		public void selectClientTest192(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase192");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase192);
			mtrClientCase192.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 192", true);	
		}
		public void selectClientTest195(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase195");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase195);
			mtrClientCase195.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 195", true);	
		}
		public void selectClientTest198(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase198");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase198);
			mtrClientCase198.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 198", true);	
		}
		public void selectClientTest202(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase202");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase202);
			mtrClientCase202.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 202", true);	
		}
		public void selectClientTest203(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase203");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase203);
			mtrClientCase203.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 203", true);	
		}
		public void selectClientTest204(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase204");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase204);
			mtrClientCase204.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 204", true);	
		}
		public void selectClientTest207(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase207");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase207);
			mtrClientCase207.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 207", true);	
		}
		public void selectClientTest208(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase208");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase208);
			mtrClientCase208.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 208", true);	
		}
		public void selectClientTest209(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase209");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase209);
			mtrClientCase209.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 209", true);	
		}
		public void selectClientTest210(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase210");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase210);
			mtrClientCase210.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 210", true);	
		}
		public void selectClientTest211(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase211");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase211);
			mtrClientCase211.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 211", true);	
		}
		public void selectClientTest212(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase212");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase212);
			mtrClientCase212.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 212", true);	
		}
		public void selectClientTest213(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase213");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase213);
			mtrClientCase213.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 213", true);	
		}
		public void selectClientTest214(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase214");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase214);
			mtrClientCase214.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 214", true);	
		}
		public void selectClientTest215(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase215");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase215);
			mtrClientCase215.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 215", true);	
		}
		public void selectClientTest216(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase216");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase216);
			mtrClientCase216.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 216", true);	
		}
		public void selectClientTest218(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase218");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase218);
			mtrClientCase218.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 218", true);	
		}
		public void selectClientTest219(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase219");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase219);
			mtrClientCase219.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 219", true);	
		}
		public void selectClientTest220(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase220");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase220);
			mtrClientCase220.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 220", true);	
		}
		public void selectClientTest221(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase221");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase221);
			mtrClientCase221.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 221", true);	
		}
		public void selectClientTest222(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase222");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase222);
			mtrClientCase222.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 222", true);	
		}
		public void selectClientTest223(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase223");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase223);
			mtrClientCase223.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 223", true);	
		}
		public void selectClientTest224(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase224");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase224);
			mtrClientCase224.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 224", true);	
		}
		public void selectClientTest225(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase225");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase225);
			mtrClientCase225.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 225", true);	
		}
		public void selectClientTest226(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase226");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase226);
			mtrClientCase226.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 226", true);	
		}
		public void selectClientTest227(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase227");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase227);
			mtrClientCase227.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 227", true);	
		}
		public void selectClientTest96_live(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("test");
			wLib.explicitWait(driver, 10,lastNameScheduleMail);
			lastNameScheduleMail.sendKeys("SA");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,Test_96);
			Test_96.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 219", true);	
		}
		public void selectClientTest228(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase228");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase228);
			mtrClientCase228.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 228", true);	
		}
		public void selectClientTest229(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase229");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase229);
			mtrClientCase229.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 229", true);	
		}
		public void selectClientTest201(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase201");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase201);
			mtrClientCase201.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 201", true);	
		}
		
		public void selectClientTest230(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase230");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase230);
			mtrClientCase230.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 230", true);	
		}
		public void selectClientTest231(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase231");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase231);
			mtrClientCase231.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 231", true);	
		}
		public void selectClientTest232(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase232");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase232);
			mtrClientCase232.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 232", true);	
		}
		public void selectClientTest233(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase233");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase233);
			mtrClientCase233.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 233", true);	
		}
		public void selectClientTest234(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase234");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase234);
			mtrClientCase234.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 234", true);	
		}
		public void selectClientTest235(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase235");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase235);
			mtrClientCase235.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 235", true);	
		}
		public void selectClientTest236(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase236");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase236);
			mtrClientCase236.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 236", true);	
		}
		public void selectClientTest237(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase237");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase237);
			mtrClientCase237.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 237", true);	
		}
		public void selectClientTest238(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase238");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase238);
			mtrClientCase238.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 238", true);	
		}
		public void selectClientTest239(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase239");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase239);
			mtrClientCase239.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 239", true);	
		}
		public void selectClientTest240(WebDriver driver) throws InterruptedException {
			wLib = new WaitStatementLib();
			wLib.explicitWait(driver, 10,selectYearLstBox);
			year1= new Select(selectYearLstBox);
			year1.selectByValue("6");
			goBtn.click();
			wLib.explicitWait(driver, 10,firstNameScheduleMail);
			firstNameScheduleMail.sendKeys("MTRTestCase240");
			wLib.explicitWait(driver, 10,searchBtn);
			searchBtn.click();
			wLib.explicitWait(driver, 10,mtrClientCase240);
			mtrClientCase240.click();
			cis = new CISPage(driver);
			cis.switchwindowForward(driver);
			Reporter.log("Client Selected for Test Case 240", true);	
		}
		
}

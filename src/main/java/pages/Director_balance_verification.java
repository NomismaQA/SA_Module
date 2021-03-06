package pages;

import pages.BasePage;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/2aee5de9-3aa3-404d-84c7-a2f82226cce2
 @TestModellerModule(guid = "2aee5de9-3aa3-404d-84c7-a2f82226cce2")
 public class Director_balance_verification extends BasePage
 {
 	//private static final char[] Balanceamount = null;

	//private static String  = null;

	public Director_balance_verification (WebDriver driver)
 	{
 		super(driver);
 	}


	
	private By DirectorElem = By.xpath("//*[@id='ctl00_cPH_RptDirector_ctl00_lnkbalance']");

	private By _2500Elem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayRecords_ctl02_lblBalance\"]");

	private By BalanceElem = By.xpath("//*[@id='ledgertable']/tbody/tr/td[7]");
	
	private By Deepikaarya = By.xpath ("//*[@id=\"ctl00_cPH_RptDirector_ctl00_lnkdirName\"]");
	
	String Expectedbln;
	
	String Actualbln;
	
	String directoramount;
	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913&menuid=0&st=&at=&dd=-1&do=&ts=0&atp=6,0&a=404447&vo=0");

// 		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913&menuid=0&st=&at=&dd=-1&do=&ts=0&atp=6,0&a=404447&vo=0");
		
// 		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913&menuid=0&st=&at=&dd=-1&do=&ts=0&atp=6,0&a=404447&vo=0");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913&menuid=0&st=&at=&dd=-1&do=&ts=0&atp=6,0&a=404447&vo=0";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AccountUI/ReportLedger.aspx?FYCode=9588&CompanyCode=6913&menuid=0&st=&at=&dd=-1&do=&ts=0&atp=6,0&a=404447&vo=0")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Deepika Arya
     * @name Click Deepika Arya
     */
	public void Click_Deepika_Arya()
	{
        
		WebElement elem = getWebElement(DirectorElem);
		directoramount=elem.getText();
		directoramount=directoramount.replaceAll("[-?,]", "");
		double d=Double.valueOf(directoramount);
		DecimalFormat dff1 = new DecimalFormat("#.##");
		dff1.setRoundingMode(RoundingMode.DOWN);
		 Actualbln= dff1.format(d);
		 
		System.out.println(Actualbln);
		WebElement elem1 = getWebElement(Deepikaarya);

	elem1.click();
          	

// 		ExtentReportManager.passStep(m_Driver, "Click_Deepika_Arya");

// 		TestModellerLogger.PassStep(m_Driver, "Click_Deepika_Arya");
	}

     
	/**
 	 * Click (??2,500)
     * @name Click (??2,500)
     */
	public void Click__2500()
	
	{
		String Amount = null;
        
		int j=2;
		String bln1;
		List<WebElement> tableEle = getWebElements(BalanceElem);
		for(int i=1;i<tableEle.size();i++)
		{
		
			WebElement balance=m_Driver.findElement(By.xpath ("//*[@id='ledgertable']/tbody/tr["+j+"]/td[7]"));
			bln1 = balance.getText();
			bln1=bln1.replaceAll("[(?,)]", "");
			if(bln1.length()>0)
			{
		double d=Double.valueOf(bln1);
		DecimalFormat dff1 = new DecimalFormat("#.##");
		dff1.setRoundingMode(RoundingMode.DOWN);
		 Expectedbln= dff1.format(d);
			
			System.out.println(Expectedbln);
			Reporter.log ("balancesheet amount from report"+Expectedbln);
			
		Amount = Expectedbln;
			}
			j++;
			
			
			
		}
		System.out.println(Amount);
		
		
		
		
		Assert.assertEquals(Actualbln, Amount);
		Reporter.log("Director amount and Balance amount is verified" + Amount);
		
		

}}
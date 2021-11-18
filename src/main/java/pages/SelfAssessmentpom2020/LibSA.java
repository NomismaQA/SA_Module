package pages.SelfAssessmentpom2020;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import utilities.WaitStatementLib;
//import com.nomisma.pom.CISPage;

public class LibSA {
	@FindBy (id="ctl00_SideMenu1_hrefXML")
	public WebElement mtrXmlLink;
	@FindBy (id="ctl00_cPH_txtData")
	public WebElement textArea1;
	@FindBy(xpath="//main/div/div[2]/ul/li[5]/a/span")	
	private WebElement IncomeLink;
	@FindBy(xpath="//a[contains(text(),'Employment')]")	
	private WebElement EmploymentLink;
	@FindBy(xpath="//a[contains(text(),'Add Employment')]")	
	private WebElement addEmploymentBtn;
	@FindBy (id="ctl00_cPH_txtEmployerName")
	private WebElement EmployerNameFA;
	@FindBy (id="ctl00_cPH_txtEmployerPAYEReference")
	private WebElement txtEmployerPAYERefFA;
	@FindBy (id = "ctl00_cPH_txtStartDate")
	private WebElement StartDatetxtboxFA;
	@FindBy (id = "ctl00_cPH_txtEndDate")
	private WebElement EndtxtboxFA;
	@FindBy (id="ctl00_cpHFooter_btnSave")
	private WebElement saveBtn;
	@FindBy(tagName = "tr")
	private	List<WebElement> rows;
	DateFormat formatter;
	String[] date1;
	Date date;
	String today;
	int count1, count2;
	String t1;
	public Element eElement;
	public Node nNode;
	public NodeList nList;
	public DocumentBuilderFactory dbFactory;
	public DocumentBuilder dBuilder;
	public Document doc;
	String actualValue1="";
	String actualValue2="";
	String actualValue3="";
	String actualValue4="";
	String actualValue5="";
	String actualValue6="";
	String actualValue7="";
	String actualValue8="";
	WaitStatementLib wLib;
	Robot robot;
//	CISPage cis1;
	Random random;
	public String xmlText="";
	private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
	//constructor
	public LibSA(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//Define Date format
	public void chooseDate(WebDriver driver) throws Exception {
		Date currentDate = new Date();
        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        // manipulate date
        c.add(Calendar.DAY_OF_YEAR, 1);
        // convert calendar to date
        Date currentDatePlusOne = c.getTime();
        today=dateFormat.format(currentDatePlusOne);
        System.out.println(today);
      
	}
	//Read data from XML File
	public void checkXML(WebDriver driver) throws Exception {
		wLib = new WaitStatementLib();
		wLib.explicitWait(driver,5,mtrXmlLink);
		mtrXmlLink.click();
		wLib.explicitWait(driver,5,textArea1);
		xmlText=textArea1.getText();
		System.out.println(xmlText);
		dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(new InputSource(new StringReader(xmlText)));
		doc.getDocumentElement().normalize();
		Reporter.log("Root element :" + doc.getDocumentElement().getNodeName(),true);
		try {
		nList= doc.getElementsByTagName("SelfAssessment");
		System.out.println("----------------------------");
		for (int i = 0; i < nList.getLength(); i++) {
		nNode = nList.item(i);
			Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			eElement = (Element) nNode;
			actualValue1=eElement.getElementsByTagName("TotalTaxEtcDue").item(0).getTextContent();
			Reporter.log("Tax find in XML file: "+actualValue1,true);
	}

}
		}
		catch (Exception e) {
			Reporter.log("TotalTaxEtcDue element not available in MTR File",true);
		   }
			try {
				nList= doc.getElementsByTagName("Employment");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue2=eElement.getElementsByTagName("PayFromEmployment").item(0).getTextContent();
				Reporter.log("Payment from employment find in XML file: "+actualValue2,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Payment from employment element not available in MTR File");
			   }
			try {
				nList= doc.getElementsByTagName("Pensions");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue3=eElement.getElementsByTagName("PaymentsToRegisteredPensionSchemes").item(0).getTextContent();
				Reporter.log("Payment to Register Pension Scheme in XML file: "+actualValue3,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Payment to Register Pension Scheme not available in MTR File");
			   }
			try {
				nList= doc.getElementsByTagName("Pensions");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue5=eElement.getElementsByTagName("RetirementAnnuityContractPayments").item(0).getTextContent();
				Reporter.log("Retirement Annuity Contract Payments in XML file: "+actualValue5,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Retirement Annuity Contract Payments not available in MTR File");;
			   }
			try {
				nList= doc.getElementsByTagName("Employment");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue4=eElement.getElementsByTagName("TaxTakenOffPay").item(0).getTextContent();
				Reporter.log("Tax taken off amount in XML file: "+actualValue4,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Tax taken off amount not available in MTR File");
			   }
			try {
				nList= doc.getElementsByTagName("UKInterestAndDividends");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue6=eElement.getElementsByTagName("UntaxedUKinterestEtc").item(0).getTextContent();
				Reporter.log("Un taxed UK interest Etc. amount in XML file: "+actualValue6,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Un taxed UK interest Etc. amount is not available in MTR File");
			   }
	try {
				nList= doc.getElementsByTagName("UKInterestAndDividends");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue7=eElement.getElementsByTagName("CompanyDividends").item(0).getTextContent();
				Reporter.log("Company Dividends amount in XML file: "+actualValue7,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Company Dividends amount is not available in MTR File");
			   }
try {
				nList= doc.getElementsByTagName("StateBenefits");

				System.out.println("----------------------------");

				for (int i = 0; i < nList.getLength(); i++) {

					nNode = nList.item(i);
					
					Reporter.log("\nCurrent Element :" + nNode.getNodeName(),true);
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				eElement = (Element) nNode;
				actualValue8=eElement.getElementsByTagName("Annual State Pension").item(0).getTextContent();
				Reporter.log("Annual State Pension amount in XML file: "+actualValue8,true);
		}

	}
			}
			catch (Exception e) {
				System.out.println("Annual State Pension amount is not available in MTR File");
			   }		
		
	}
// Click on Income -> Employment
public void clickIncomeEmpLink(WebDriver driver) throws Exception								
{
wLib = new WaitStatementLib();
wLib.explicitWait(driver,5,IncomeLink);
IncomeLink.click();

try {
	wLib.explicitWait(driver,2,EmploymentLink);
if(EmploymentLink.isDisplayed()==false)
{
	do {
	wLib.explicitWait(driver,2,IncomeLink);
	IncomeLink.click();
	
	}while(EmploymentLink.isDisplayed()==false);
}
}
catch (Exception e) {
	// TODO: handle exception
}
wLib.explicitWait(driver,2,EmploymentLink);
EmploymentLink.click();
	}
//Enter Employment Information for Foreign Income
public void addEmpInfoFOR(WebDriver driver)throws Exception {
	wLib = new WaitStatementLib();
	wLib.explicitWait(driver,5,addEmploymentBtn);
	addEmploymentBtn.click();
//	cis1 = new CISPage(driver);
//	cis1.switchwindowNew(driver);
	random = new Random();
	int x = random.nextInt(900) + 100;
	wLib.explicitWait(driver,5,EmployerNameFA);
	EmployerNameFA.sendKeys("Abc Corp.");
	txtEmployerPAYERefFA.sendKeys(x + "/"+"AB56789");
	StartDatetxtboxFA.sendKeys("06/04/2018");
	EndtxtboxFA.sendKeys("05/04/2019");
	saveBtn.click();
			
}

	//Add number of days in a date
	public Date addDays(Date d, int days)
    {
		
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d;
         
    }
	//Function for pagination
	public void funcPagination(WebDriver driver) throws Exception {
		int count=0;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 2000);");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//List pagination =(List) driver.findElements(By.xpath("//a[@name='pagination'][2]")); 
		
		List<WebElement> pagination = driver.findElements(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a"));
		 
		 int s = pagination.size();
		        
		        if(s>0)
		        {
		            System.out.println("Pagination Exists");
		            System.out.println("Pageination Size = "+(pagination.size()-1));
		            
		            for(int i=1;i<s;i++)
		            {
		                
		                
		                try{
		                    driver.findElement(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a[contains(text(),'"+i+"')]")).click() ;
		                    Thread.sleep(3000);
		                    System.out.println("Page "+i);	         
		                    count=rows.size();
		                    System.out.println(count);
		                }
		                   catch(Exception e){
		                    e.printStackTrace();
		                    }
		                    }
		                    driver.quit();
		                    
		            }
		        
		        else
		        {
		            System.out.println("Pagination does not Exists");
		        }
		    
}
}
	

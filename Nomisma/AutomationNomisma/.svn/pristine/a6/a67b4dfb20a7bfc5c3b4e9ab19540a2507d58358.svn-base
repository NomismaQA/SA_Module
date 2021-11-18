package com.nomisma.generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import static com.nomisma.generic.NomismaProjectListeners.*;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseLib {
	public WebDriver wDriver;
	public EventFiringWebDriver driver; 
	NomismaProjectListeners listeners;
	public ExtentReports report;
	public ExtentTest test;
	public WaitStatementLib wLib;
	public SoftAssert sAssert;
	
	
	@BeforeTest
	public void configBeforeTest(){
		report = new ExtentReports(".\\reports\\extentreport.html", true);
//		report.addSystemInfo("Browser", "Chrome").addSystemInfo("Environment", "Sandbox8080").addSystemInfo("URL", "http://sandbox.nomismasolution.co.uk:8080");
	}
	
	
	@BeforeMethod
	@Parameters (value = "browser")
	
	public void preCondition (String browser) throws MalformedURLException, InterruptedException {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\exefiles\\geckodriver.exe");

			wDriver = new FirefoxDriver();
			Reporter.log("Firfox browser is Launched", true);
		}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\exefiles\\IEDriverServer.exe");
				wDriver = new InternetExplorerDriver();
			}
		
			else if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
//				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
//		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
		
			else if (browser.equalsIgnoreCase("liveNomisma")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
//				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
//		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("dnsNomisma")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
//				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
//		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("dnsGroupNomisma")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
//				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
//		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
		
			else if (browser.equalsIgnoreCase("liveNomismaHeadLess")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
		     //   options.addArguments("window-size=1200,1100");
		        options.addArguments("window-size=1920,1080");
		        
		        options.addArguments("--disable-extensions");
		        options.setExperimentalOption("useAutomationExtension", false);
		        options.addArguments("--proxy-server='direct://'");
		        options.addArguments("--proxy-bypass-list=*");
		        options.addArguments("--start-maximized");
		        
				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("dnsNomismaHeadLess"))  {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("dnsGroupNomismaHeadLess"))  {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
		        options.addArguments("window-size=1200,1100");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("HeadlessChrome2")) {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");
				
				options.addArguments("headless","disable-gpu","--test-type","--ignore-certificate-errors");
		        //options.addArguments("window-size=1200,1100");
		        options.addArguments("window-size=1920,1080");
		       // options.addArguments("window-size=maximize");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
		
			else if (browser.equalsIgnoreCase("chromeCRM")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("SandBox")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("sandBox2")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  
			               + System.getProperty("file.separator")
			               + "BrowserDrivers"
			               + System.getProperty("file.separator")
			               + "chromedriver.exe");

				 String filePath = System.getProperty("user.dir");
			        
				String downloadFilepath = (filePath +"\\Downloads");
	
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", downloadFilepath);
				//Save Chrome Opions
				ChromeOptions options = new ChromeOptions();
				HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--test-type");

				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\exefiles\\chromedriver.exe");
				wDriver = new ChromeDriver(options);
				Reporter.log("Chrome browser is Launched", true);
			}
			else if (browser.equalsIgnoreCase("phantom")) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setJavascriptEnabled(true);                
				caps.setCapability("takesScreenshot", true);  
				//caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,".\\exefiles\\phantomjs.exe");
				//wDriver driver = new  PhantomJSDriver(caps);
				Reporter.log("Phantomjs browser is Launched", true);
			}
		
		listeners=new NomismaProjectListeners();
		driver=new EventFiringWebDriver(wDriver);
		driver.register(listeners);

		driver.manage().window().maximize();
		if (browser.equalsIgnoreCase("chromeCRM")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL2"));
			Reporter.log("Navigating to the CRM URL", true);
		}
		else if (browser.equalsIgnoreCase("liveNomisma")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL3"));
			Reporter.log("Navigating to the Nomisma Live", true);
		}
		else if (browser.equalsIgnoreCase("dnsNomisma")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL4"));
			Reporter.log("Navigating to the Nomisma Dns", true);
		}
		else if (browser.equalsIgnoreCase("dnsGroupNomisma")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL5"));
			Reporter.log("Navigating to the Nomisma Dns", true);
		}
		else if (browser.equalsIgnoreCase("liveNomismaHeadLess")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL3"));
			Reporter.log("Navigating to the Nomisma Live", true);
		}
		else if (browser.equalsIgnoreCase("dnsNomismaHeadLess")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL4"));
			Reporter.log("Navigating to the Nomisma Dns", true);
		}
		else if (browser.equalsIgnoreCase("dnsGroupNomismaHeadLess")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL5"));
			Reporter.log("Navigating to the Nomisma Dns", true);
		}
		else if (browser.equalsIgnoreCase("HeadlessChrome2")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL"));
			Reporter.log("Navigating to the Nomisma URL", true);
		}
		else if (browser.equalsIgnoreCase("SandBox")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL8"));
			Reporter.log("Navigating to the Sandbox URL", true);
		}
		else if (browser.equalsIgnoreCase("sandBox2")) {
			driver.get(GetPropertyValues.getPropertyValue("testURL9"));
			Reporter.log("Navigating to the Sandbox2 URL", true);
		}
		else {
			driver.get(GetPropertyValues.getPropertyValue("testURL"));
			Reporter.log("Navigating to the nomisma URL", true);
		}	
		wLib = new WaitStatementLib();
		wLib.implictWaitForSeconds(driver, 20);
	}
	
	@AfterMethod
	public void postCondition(ITestResult r) throws IOException{
		
		if (r.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, r.getThrowable());
			
		
/*			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
			FileUtils.copyFile(scrFile, new File(".\\screenshots\\" +r.getName()+timestamp+".jpg"));*/
		}
		
	driver.quit();
	Reporter.log("Browser Closed", true);
	test.log(LogStatus.PASS, "Browser Closed Successfully");
	
	}
	
	@AfterSuite
	public void configAfterSuite()
	{
		Reporter.log("Running after suite:", true);
		DateFormat dateFormat = new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		
		Date date = new Date();
		String TimeStamp = dateFormat.format(date);
		String XlPath = "./reports/excelreport/Report"+TimeStamp+".xlsx";
		FileOutputStream Fos;
		try
		{
			Fos =new FileOutputStream(XlPath);
			Workbook wb=new HSSFWorkbook();
			Sheet s = wb.createSheet();
			
			
			ExcelLib.writeData(s, 0, "Total:", iPassCount+iFailCount);
			ExcelLib.writeData(s, 1, "Passed:", iPassCount);
			ExcelLib.writeData(s, 2, "Failed:", iFailCount);
			ExcelLib.writeData(s, 3, "Skipped", iSkipCount);
			
			try
			{
				wb.write(Fos);
				Fos.close();
				wb.close();
			}
			catch(IOException e)
			{
				Reporter.log("Unable to write message to Excel", true);
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e)
		{
			Reporter.log("Excel file is not getting created", true);
		}
	}
}

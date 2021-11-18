package com.nomisma.generic;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import com.nomisma.generic.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.Reporter;

public class NomismaProjectListeners implements ITestListener, WebDriverEventListener {
	public static int iPassCount=0;
	public static int iFailCount=0;
	public static int iSkipCount=0;
	Logger nomismaLog;
	long startTime, stopTime;
	
	public NomismaProjectListeners() {
		DateFormat dateFormat= new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		Date date = new Date();
		System.setProperty("LongTimeDate", dateFormat.format(date));
		nomismaLog= Logger.getLogger(this.getClass());
		

	}
	
	//ITestListener
	
		@Override
		public void onFinish(ITestContext arg0) {
		stopTime=System.currentTimeMillis();
		Reporter.log("Completed executing test " + arg0.getName(), true);
		nomismaLog.info("Test Suite execution finished: "+new Timestamp(new Date().getTime()));
		nomismaLog.info("Total time for test suite execution: "+(double)(stopTime-startTime)/1000+"seconds");
		Reporter.log("Test Suite execution finished: "+new Timestamp(new Date().getTime()), true);
		Reporter.log("Total time for test suite execution: "+(double)(stopTime-startTime)/1000+"seconds", true);
		}
		
		//ITestListener
		@Override
		public void onStart(ITestContext arg0) {
			startTime=System.currentTimeMillis();
			PropertyConfigurator.configure("log4j.properties");
			nomismaLog.info("Test Suite Execution started: "+new Timestamp(new Date().getTime()));
			Reporter.log("Test Suite Execution started: "+new Timestamp(new Date().getTime()), true);
		
		}
		
		//ITestListener
		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			nomismaLog.info("Test failed within success percentage");
		}
		
		//ITestListener
		@Override
		public void onTestFailure(ITestResult result) {

			Reporter.log("Test execution is in onTestFailure method",true);
	
			iFailCount++;
			System.out.println("Test Failure:"+ iFailCount);
			nomismaLog.info("Test has been failed");
			
			//Object object = result.getInstance();
			//BaseLib obj= (BaseLib) object;
			//DateFormat dateFormat= new SimpleDateFormat ("yyyy_MM_dd_hh_mm_ss");
			//Date date= new Date();
			//try{
			
			//String fileName = result.getMethod().getMethodName().replace("Test", "");
			//TakesScreenshot screenShots= (TakesScreenshot) obj.wDriver;
			//File srcFile = screenShots.getScreenshotAs(OutputType.FILE);
			//String date1=fileName+dateFormat.format(date);
			//File destFile= new File(".\\screenshots\\"+date1+".jpg");
			//FileUtils.copyFile(srcFile, destFile);
			
			//If screenShotOnFail = yes, call captureScreenShot.
			if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
			{
				captureScreenShot(result,"fail");
			}
		//}
			
			//}
			//catch(IOException e) {
			//	e.printStackTrace();
		}
			
			
			
			
			
			
//			Object object = result.getInstance();
//			BaseLib obj= (BaseLib) object;
//			DateFormat dateFormat= new SimpleDateFormat ("yyyy_MM_dd_hh_mm_ss");
//			Date date= new Date();
//			try{
//				String fileName = result.getMethod().getMethodName().replace("Test", "");
//				TakesScreenshot screenShots= (TakesScreenshot) obj.wDriver;
//				File srcFile = screenShots.getScreenshotAs(OutputType.FILE);
//				String date1=fileName+dateFormat.format(date);
//				File destFile= new File(".\\screenshots\\"+date1+".jpg");
//				FileUtils.copyFile(srcFile, destFile);
//
//				//String path ="<img src=\".\\..\\..\\screenshots\\"+date1+".jpg\" style=width:400px>";
//				//Reporter.log(path,true);
//				//String path1 ="<img src=\".\\..\\screenshots\\"+date1+".jpg\" style=width:400px>"; 
//				//Reporter.log(path1,true);
//
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//ITestListener
		@Override
		public void onTestSkipped(ITestResult result) {
			iSkipCount++;
			System.out.println("Test Skipped: "+iSkipCount);
			nomismaLog.info("Test has been skipped: "+result.getName());
			Reporter.log("Test has been skipped: "+result.getName(), true);
			
		}
		
		//ITestListener
		@Override
		public void onTestStart(ITestResult arg0) {
			nomismaLog.info("Test execution has been started: "+new Timestamp(new Date().getTime()));
			Reporter.log("Test execution has been started: "+new Timestamp(new Date().getTime()), true);
		}
		
		//ITestListener
		@Override
		public void onTestSuccess(ITestResult result) {
			iPassCount++;
			System.out.println("Test Pass: "+iPassCount);
			nomismaLog.info("TestScript Name: '"+result.getName()+"'  /Status--->Pass :)");
			Reporter.log("TestScript Name: '"+result.getName()+"'  /Status--->Pass :)", true);

			if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
			{
				captureScreenShot(result,"pass");
			}
		}
	
		@Override
		public void afterClickOn(WebElement ele, WebDriver driver) {
			
			//System.out.println("Trying to click: " + ele);
			//System.out.println("After click "+ele.toString());
			Reporter.log("After click "+ele.toString(), true);
			Reporter.log("WebElement "+ele.toString()+ " clicked", true);
			if(GetPropertyValues.getProperty("screenShotAfterClickOn").equalsIgnoreCase("yes"))
			{
				captureScreenShot(driver);
			}
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.visibilityOf(ele));

//			}
		}
		@Override
		public void afterFindBy(By arg0, WebElement ele, WebDriver driver) {
			//System.out.println("Trying to click: " + ele);
			//If screenShotOnPass = yes, call captureScreenShot.
			//ScreenshotUtility SU=new ScreenshotUtility();
//			ITestResult tr;
//			
//			if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
//			{
//				captureScreenShot("pass");
//			}
//				
//			//If screenShotOnFail = yes, call captureScreenShot.
//			if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
//			{
//				captureScreenShot("fail");
//			}
		}
		
//		@Override
//		public void afterFindBy(By arg0, WebElement ele, WebDriver driver, ITestResult tr) {
//			System.out.println("Trying to click: " + ele);
//			//If screenShotOnPass = yes, call captureScreenShot.
//			//ScreenshotUtility SU=new ScreenshotUtility();
//			if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
//			{
//				captureScreenShot(tr,"pass");
//			}
//				
//			//If screenShotOnFail = yes, call captureScreenShot.
//			if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
//			{
//				//captureScreenShot(tr,"fail");
//			}
//		}
		@Override
		public void afterNavigateBack(WebDriver driver) {
			Reporter.log("Navigated back... ", true);
			
			if(GetPropertyValues.getProperty("screenShotafterNavigateBack").equalsIgnoreCase("yes"))
//				captureScreenShot(driver,"pass");
				captureScreenShot(driver);

		}
		@Override
		public void afterNavigateForward(WebDriver driver) {
			Reporter.log("Navigated forward... ", true);
			//If screenShotOnPass = yes, call captureScreenShot.
			if(GetPropertyValues.getProperty("screenShotafterNavigateForward").equalsIgnoreCase("yes"))
			{
//				captureScreenShot(driver,"pass");
				captureScreenShot(driver);
			}

		}
		//@Override
		public void afterNavigateRefresh(WebDriver driver, ITestResult tr) {
			Reporter.log("Page Refreshed... ", true);
			//If screenShotOnPass = yes, call captureScreenShot.
			if(GetPropertyValues.getProperty("screenShotafterNavigateRefresh").equalsIgnoreCase("yes"))
			{
				captureScreenShot(driver);
			}
		}
		//@Override
		public void afterNavigateTo(String arg0, WebDriver arg1, ITestResult tr) {
			
		}
		//@Override
		public void afterScript(String arg0, WebDriver arg1, ITestResult tr) {
		
		}
		
		//WebDriverEventListener
		@Override
		public void beforeClickOn(WebElement ele, WebDriver driver) {
			// TODO Auto-generated method stub
			//System.out.println("Trying to click: " + ele);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("WebElement to be clicked " +ele.toString(), true);
			//Highlight Elements before clicking
			for (int i = 0; i<1; i++) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", ele, "color: black; border: 3px solid black");
			}
		}
		
		//WebDriverEventListener
		@Override
		public void beforeFindBy(By by, WebElement ele, WebDriver driver) {
			System.out.println("Trying to find: "+by);
			//System.out.println("Trying to find element: "+ele);
//			WebDriverWait wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		}
		@Override
		public void beforeNavigateBack(WebDriver arg0) {
			
		}
		@Override
		public void beforeNavigateForward(WebDriver arg0) {
			
		}
		@Override
		public void beforeNavigateRefresh(WebDriver arg0) {
			
		}
		//WebDriverEventListener
		@Override
		public void beforeNavigateTo(String url, WebDriver driver) {
			System.out.println("Before Navigating To: "+url+ ", my url was: "+ driver.getCurrentUrl());
			Reporter.log("Before Navigating To: "+url+ ", my url was: "+ driver.getCurrentUrl(), true);
		}
		@Override
		public void beforeScript(String arg0, WebDriver arg1) {
			
		}
		
		//WebDriverEventListener
		@Override
		public void onException(Throwable t, WebDriver arg1) {

			nomismaLog.fatal("Execution interrupted...");
			nomismaLog.fatal(t.getMessage());
		}

		
		public void captureScreenShot(ITestResult result, String status){	
			Object object = result.getInstance();
			BaseLib obj= (BaseLib) object;
			String destDir = "";
			String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
			//To capture screenshot.
			File scrFile = ((TakesScreenshot) obj.wDriver).getScreenshotAs(OutputType.FILE);
	    	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	    	//If status = fail then set folder name "screenshots/Failures"
	    	if(status.equalsIgnoreCase("fail")){
	    		destDir = ".\\screenshots\\Failures";
	    	}
	    	//If status = pass then set folder name "screenshots/Success"
	    	else if (status.equalsIgnoreCase("pass")){
	    		destDir = ".\\screenshots\\Success";
	    	}
	    	
	    	//To create folder to store screenshots
	    	new File(destDir).mkdirs();
	    	//Set file name with combination of test class name + date time.
	    	String destFile = passfailMethod+" - "+dateFormat.format(new Date()) + ".png";
	    	
	        try {
	        	//Store file at destination folder location
	     	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	     	  if(status.equalsIgnoreCase("pass")){
	     	  String path1 ="<img src=\".\\..\\screenshots\\Success\\"+destFile+"\" style=width:400px>"; 
	     	  Reporter.log(path1,true);
	     	  }
	     	 if(status.equalsIgnoreCase("fail")){
		     	  String path1 ="<img src=\".\\..\\screenshots\\Failure\\"+destFile+"\" style=width:400px>"; 
		     	  Reporter.log(path1,true); 
	     		 
	     		 //Added By sd
//	     		 Date date= new Date();
//	     		 String date1=result.getName()+dateFormat.format(date);
//	                relativePathImage = "./screenshot/" + result.getName() + "_" + date1 + ".png";
	                
	                
	               // String path ="<img src=\".\\..\\..\\screenshots\\"+date1+".jpg\" style=width:400px>";
	             //   Reporter.log(relativePathImage,true);
	        	//String path1 ="<img src=\".\\..\\..\\screenshots\\Failures"+destFile+"\" style=width:400px>"; 
	   			//Reporter.log(path1,true);
	   			
//	   		 String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot) obj.wDriver).
//	                 getScreenshotAs(OutputType.BASE64);
//
//	         //Extentreports log and screenshot operations for failed tests.
//	         ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
//	                 ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	        	  }
	        }
	        catch (IOException e) {
	             e.printStackTrace();
	        }
		}
		
		
//		public void captureScreenShot(String status){	
//			//ITestResult result = null;
//			Object object = result.getInstance();
//			BaseLib obj= (BaseLib) object;
//			BaseLib obj=  new BaseLib();
//			String destDir = "";
//			String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
//			//To capture screenshot.
//			File scrFile = ((TakesScreenshot) obj.wDriver).getScreenshotAs(OutputType.FILE);
//	    	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
//	    	//If status = fail then set folder name "screenshots/Failures"
//	    	if(status.equalsIgnoreCase("fail")){
//	    		destDir = ".\\screenshots\\Failures";
//	    	}
//	    	//If status = pass then set folder name "screenshots/Success"
//	    	else if (status.equalsIgnoreCase("pass")){
//	    		destDir = ".\\screenshots\\Success";
//	    	}
//	    	
//	    	//To create folder to store screenshots
//	    	new File(destDir).mkdirs();
//	    	//Set file name with combination of test class name + date time.
//	    	String destFile = "Screenshot"+dateFormat.format(new Date()) + ".png";
//	       
//	    	
//	        try {
//	        	//Store file at destination folder location
//	     	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
//	     	  if(status.equalsIgnoreCase("pass")){
//	     	  String path1 ="<img src=\".\\..\\screenshots\\Success\\"+destFile+"\" style=width:400px>"; 
//	     	  Reporter.log(path1,true);
//	     	  }
//	     	 if(status.equalsIgnoreCase("fail")){
//		     	  String path1 ="<img src=\".\\..\\screenshots\\Failure\\"+destFile+"\" style=width:400px>"; 
//		     	  Reporter.log(path1,true); 
//
//	        	  }
//	        }
//	        catch (IOException e) {
//	             e.printStackTrace();
//	        }
//		}
		
		
		public void captureScreenShot(WebDriver driver, String status) {
			
		String destDir = "";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");

		if(status.equalsIgnoreCase("fail")){
    		destDir = ".\\screenshots\\Failures";
    	}
    	//If status = pass then set folder name "screenshots/Success"
    	else if (status.equalsIgnoreCase("pass")){
    		destDir = ".\\screenshots\\Success";
    	}
    	
    	//To create folder to store screenshots
    	new File(destDir).mkdirs();
    	//Set file name with combination of test class name + date time.
    	String destFile = "Screenshot"+dateFormat.format(new Date()) + ".png";
       
    	
        try {
        	//Store file at destination folder location
     	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
     	  if(status.equalsIgnoreCase("pass")){
     	  String path1 ="<img src=\".\\..\\screenshots\\Success\\"+destFile+"\" style=width:400px>"; 
     	  Reporter.log(path1,true);
     	  }
     	 if(status.equalsIgnoreCase("fail")){
	     	  String path1 ="<img src=\".\\..\\screenshots\\Failure\\"+destFile+"\" style=width:400px>"; 
	     	  Reporter.log(path1,true); 

        	  }
        }
     	catch (IOException e) {
            e.printStackTrace();
       }
        
		}
		
		
		public void captureScreenShot(WebDriver driver) {
	
	        try {
				String destDir = "";
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");

		    		destDir = ".\\screenshots\\Others";
			    	
		    	//To create folder to store screenshots
		    	new File(destDir).mkdirs();
		    	//Set file name with combination of test class name + date time.
		    	String destFile = "Screenshot"+dateFormat.format(new Date()) + ".png";
	        	//Store file at destination folder location
	     	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	     	  String path1 ="<img src=\".\\..\\screenshots\\Others\\"+destFile+"\" style=width:400px>"; 
	     	  Reporter.log(path1,true);

	        }
	     	catch (IOException e) {
	            e.printStackTrace();
	       }
	        
			}
		
		@Override
		public void beforeAlertAccept(WebDriver driver) {

			
		}

		@Override
		public void afterAlertAccept(WebDriver driver) {
		Reporter.log("Alert Accepted", true);
			
		}

		@Override
		public void afterAlertDismiss(WebDriver driver) {
			Reporter.log("Alert Cancelled", true);
			
		}

		@Override
		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateTo(String url, WebDriver driver) {
			Reporter.log("Navigated To : "+url, true);
		
		}



		@Override
		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub
			Reporter.log("Page Refreshed", true);
			
		}

		@Override
		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterScript(String script, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeSwitchToWindow(String windowName, WebDriver driver) {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.
			
		}

		@Override
		public void afterSwitchToWindow(String windowName, WebDriver driver) {
			// TODO Auto-generated method stub
			
		}



		

	}


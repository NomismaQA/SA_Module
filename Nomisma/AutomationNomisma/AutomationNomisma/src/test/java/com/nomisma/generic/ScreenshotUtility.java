//Find More Tutorials On WebDriver at -> http://software-testing-tutorials-automation.blogspot.com
package com.nomisma.generic;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.nomisma.generic.GetPropertyValues;


public class ScreenshotUtility implements ITestListener{	
	//This method will execute before starting of Test suite.
	public void onStart(ITestContext tr) {	
		
	}

	//This method will execute, Once the Test suite is finished.
	public void onFinish(ITestContext tr) {
		
	}

	//This method will execute only when the test is pass.
	public void onTestSuccess(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	}

	//This method will execute only on the event of fail test.
	public void onTestFailure(ITestResult tr) {		
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
	}

	// This method will execute before the main test start (@Test)
	public void onTestStart(ITestResult tr) {
		
	}

	// This method will execute only if any of the main test(@Test) get skipped
	public void onTestSkipped(ITestResult tr) {		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
	}
	
	//Function to capture screenshot.
	public void captureScreenShotOld(ITestResult result, String status){	
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
        }
        catch (IOException e) {
             e.printStackTrace();
        }
   } 
	
	public void afterClickOn(WebElement ele, ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnAfterClick").equalsIgnoreCase("Yes"))
		{
			captureScreenShot(tr,"pass");
		}

	}

	public void afterFindBy(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
		
	}
	//@Override
	public void afterNavigateBack(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
		
	}
	//@Override
	public void afterNavigateForward(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
		
	}
	//@Override
	public void afterNavigateRefresh(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
		
	}

	public void afterNavigateTo(ITestResult tr) {
		//If screenShotOnPass = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnPass").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"pass");
		}
	
		//If screenShotOnFail = yes, call captureScreenShot.
		if(GetPropertyValues.getProperty("screenShotOnFail").equalsIgnoreCase("yes"))
		{
			captureScreenShot(tr,"fail");
		}
		
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
     	  String path1 ="<img src=\".\\..\\..\\screenshots\\Success\\"+destFile+"\" style=width:400px>"; 
			Reporter.log(path1,true);
     	  }
     	 if(status.equalsIgnoreCase("fail")){
        	  String path1 ="<img src=\".\\..\\..\\screenshots\\Failures"+destFile+"\" style=width:400px>"; 
   			Reporter.log(path1,true);
        	  }
        }
        catch (IOException e) {
             e.printStackTrace();
        }
	}
}
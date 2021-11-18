package com.nomisma.pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


public class ReadFilesPage {
	
	
	
	public ReadFilesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public String GetFileName(String Folder, String PartialName)  {
	        
 		String folderName = System.getProperty("user.dir")+Folder;
		File[] listFiles = new File(folderName).listFiles();
		String fileName="";
		for (int i = 0; i < listFiles.length; i++) 
		{
			Reporter.log("File Name "+fileName, true);
			if (listFiles[i].isFile()) 
				Reporter.log("listFiles[i].isFile() : " +listFiles[i].getName(), true);
			{
				if ((listFiles[i].getName()).startsWith(PartialName)) 
				{
					Reporter.log("listFiles[i].isFile() : ", true);
					fileName=listFiles[i].getName();
					Reporter.log("File Found "+ " " + fileName, true);
					break;
				}
		 		       
			}
	   
		 }	
		 	return fileName;

	}
	
	 public void readPDFInURL(WebDriver driver, String Folder, String filename, String String1, String String2, String String3) throws EmptyFileException, IOException {
	        
	        String filePath = System.getProperty("user.dir");
	        Reporter.log("filePath" +filePath, true);
	        driver.get(filePath + Folder + filename);
	        
	        URL url = new URL(driver.getCurrentUrl());
	        InputStream is = url.openStream();
	        BufferedInputStream fileToParse = new BufferedInputStream(is);
	        PDDocument document = null;
	        try {
	            document = PDDocument.load(fileToParse);
	            String output = new PDFTextStripper().getText(document);
	            Reporter.log("PDF data: " +output, true);
	            Assert.assertTrue(output.contains(String1));
	            Reporter.log("Text verified for " +String1, true);
	            Assert.assertTrue(output.contains(String2));
	            Reporter.log("Text verified for " +String2, true);
	            Assert.assertTrue(output.contains(String3));
	            Reporter.log("Text verified for " +String3, true);
	            Reporter.log("PDF Verified successfully", true);
	        } finally {
	            if (document != null) {
	                document.close();
	            }
	            fileToParse.close();
	            is.close();
	        }

	    }
	 
	 public void readPDFInURL(WebDriver driver, String Folder, String filename, String String1, String String2) throws EmptyFileException, IOException {
	        
			String Value1="";
			String Value2="";
			
		 	Reporter.log("Value1 = "+Value1, true);	 
		 	Reporter.log("Value2 = "+Value2, true);	
		 	String filePath = System.getProperty("user.dir");
	        Reporter.log("filePath" +filePath, true);
	        driver.get(filePath + Folder + filename);
	        
	        URL url = new URL(driver.getCurrentUrl());
	        InputStream is = url.openStream();
	        BufferedInputStream fileToParse = new BufferedInputStream(is);
	        PDDocument document = null;
	        try {
	            document = PDDocument.load(fileToParse);
	            String output = new PDFTextStripper().getText(document);
	            Reporter.log("PDF data: " +output, true);
	            Assert.assertTrue(output.contains(String1));
	            Reporter.log("Text verified for " +String1, true);
	            Assert.assertTrue(output.contains(String2));
	            Reporter.log("Text verified for " +String2, true);
	            Assert.assertTrue(output.contains(Value1));
	            Reporter.log("Text verified for " +Value1, true);
	            Assert.assertTrue(output.contains(Value2));
	            Reporter.log("Text verified for " +Value2, true);
	            Reporter.log("PDF Verified successfully", true);
	        } finally {
	            if (document != null) {
	                document.close();
	            }
	            fileToParse.close();
	            is.close();
	        }

	    }
	 
	 public void DeleteFilename(WebDriver driver,String filepath,String name) {
		 String filePath1 = System.getProperty("user.dir");

		 File directory = new File(filePath1 + filepath);
		 File[] files = directory.listFiles();
		 Reporter.log("files1: " +files, true);
		 for (File f : files)
		 {
			 Reporter.log("files2: " +files, true);
		     if (f.getName().startsWith(name))
		     {
		    	 Reporter.log("files3: " +files, true);
		       f.delete();
		     }
		 }
	 }
	 
	
	 
	 public void ClickSaveAs(WebDriver driver) throws InterruptedException{
		 Thread.sleep(3000);
		 Actions myAction = new Actions(driver);
		 myAction.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL);
		 Thread.sleep(3000);
		 myAction.perform();
		 Thread.sleep(3000);
		 
//		Thread.sleep(3000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_S);
//		robot.setAutoDelay(2000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.setAutoDelay(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.setAutoDelay(2000);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.setAutoDelay(2000);
//		Thread.sleep(3000);
	 }

	 
	 public void readPDFInURL(WebDriver driver, String Folder, String filename, String String1) throws EmptyFileException, IOException {
	        
	        String filePath = System.getProperty("user.dir");
	        Reporter.log("filePath" +filePath, true);
	        driver.get(filePath + Folder + filename);
	        
	        URL url = new URL(driver.getCurrentUrl());
	        InputStream is = url.openStream();
	        BufferedInputStream fileToParse = new BufferedInputStream(is);
	        PDDocument document = null;
	        try {
	            document = PDDocument.load(fileToParse);
	            String output = new PDFTextStripper().getText(document);
	            Reporter.log("PDF data: " +output, true);
	            Reporter.log("String1 : " +String1, true);
	            Assert.assertTrue(output.contains(String1));
	            Reporter.log("Text verified for " +String1, true);
	            Reporter.log("PDF Verified successfully", true);
	        } finally {
	            if (document != null) {
	                document.close();
	            }
	            fileToParse.close();
	            is.close();
	        }

	    }
	 

		public void switchwindowForward(WebDriver driver) throws InterruptedException {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			ArrayList tabs = new ArrayList (driver.getWindowHandles());
			System.out.println(tabs.size());
			driver.switchTo().window((String) tabs.get(tabs.size()-1));

		}
		public void switchwindowBackward(WebDriver driver) throws InterruptedException {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			ArrayList tabs = new ArrayList (driver.getWindowHandles());
			System.out.println(tabs.size());
			driver.switchTo().window((String) tabs.get(tabs.size()-2));
		}
		
		public void switchwindowNew(WebDriver driver) throws InterruptedException {
			
			driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		}
			
		public void switchwindowDefault(WebDriver driver) throws InterruptedException {
			
			driver.switchTo().defaultContent();
		}
		
		public void AlertAccept(WebDriver driver) {	
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
		}
		
		public int generateRandom(){
			Random randomInt = new Random();
			int num = randomInt.nextInt(100000000);
			Reporter.log("Random Integer: "+num, true);
			return num;
		}
		
		public void VerifyValues(WebDriver driver, String ValueHead, WebElement ValueExp, String ValueAct) {
			Reporter.log(ValueHead +": "+ValueExp.getText(), true);
			Assert.assertEquals(ValueExp.getText(), ValueAct, "Failed to verify value of " +ValueHead);
			Reporter.log("Value of " +ValueHead +" is verified successfully", true);
			// str.replaceAll(", $", "")
		}
		
		public void VerifyValues(WebDriver driver, String ValueHead, String ValueExp, String ValueAct) {
			Reporter.log(ValueHead +": "+ValueExp, true);
			Assert.assertEquals(ValueExp, ValueAct, "Failed to verify value of " +ValueHead);
			Reporter.log("Value of " +ValueHead +" is verified successfully", true);
			
		}
}

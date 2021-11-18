package com.nomisma.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLib {
      public static void switchwindowNew1(WebElement element,WebDriver driver) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.switchTo().frame(element);
		
		}
	  public static void switchwindowDefault(WebDriver driver) throws InterruptedException {
				
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	}

}

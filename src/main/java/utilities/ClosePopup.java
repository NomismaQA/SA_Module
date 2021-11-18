package utilities;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.BasePage;

public class ClosePopup extends BasePage
{
	public ClosePopup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static boolean ValidateAndPopUp(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	           // WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	            WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
	        
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
	
	public static boolean ValidateAndPopUp1(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(5000);
	           // WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	            WebElement ele = driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
	        
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
	
	public static boolean ValidateAndPopUp2(WebDriver driver)
	{
		 boolean data=false;
	        try
	        {
	            Thread.sleep(3000);
	           // WebElement ele = driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
	            WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[1]"));
	        
	            WebDriverWait wait = new WebDriverWait(driver, 180);
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            ele.click();
	            System.out.println(true);
	            return true;
	        } catch (Exception e)
	        {
	            System.out.println(false);
	            return data;
	        }
		
	}
}

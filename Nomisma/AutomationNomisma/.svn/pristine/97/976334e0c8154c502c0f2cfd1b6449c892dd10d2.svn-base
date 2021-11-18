package com.nomisma.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class AccountsPage {
	
	@FindBy (id = "ctl00_cPH_login")
	private WebElement loginTxtBx;
	@FindBy (id = "ctl00_cPH_pass")
	private WebElement pwdTxtBx;
	@FindBy (id = "ctl00_cPH_btnLogin")
	private WebElement loginBtn;
	@FindBy (id = "ctl00_cPH_lblError")
	private WebElement errorMsg;
	@FindBy (id = "ctl00_cPH_lblError")
	private WebElement errorMsg2;
	
	@FindBy (id = "username")
	private WebElement loginCrmTxtBx;
	@FindBy (id = "password")
	private WebElement pwdCrmTxtBx;
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement loginCrmBtn;
	//private WebDriver driver;
	
	public AccountsPage(WebDriver driver){
		//PageFactory.initElements(driver, this);
		//this.driver = driver;
		//wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}
	
//	public void login(String username, String password, WebDriver driver) throws InterruptedException{
//		
//		loginTxtBx.sendKeys(username);
//		pwdTxtBx.sendKeys(password);
//		loginBtn.click();
//		
//	}
	public void login(String username, String password) throws InterruptedException{
		Thread.sleep(1000);
		loginTxtBx.sendKeys(username);
		Thread.sleep(1000);
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
		
	}
	
	
	public void login(String username, String password, WebDriver driver) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(loginTxtBx));
		loginTxtBx.sendKeys(username);
		
		wait.until(ExpectedConditions.visibilityOf(pwdTxtBx));
		pwdTxtBx.sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
		driver.navigate().refresh();

	}

	
	public void loginCRM( WebDriver driver, String username, String password) throws InterruptedException{
		
		Thread.sleep(1000);
		loginCrmTxtBx.sendKeys(username);
		Thread.sleep(1000);
		pwdCrmTxtBx.sendKeys(password);
		Thread.sleep(1000);
		loginCrmBtn.click();
		
	}
	public void verifyErrorMsg() {
		String expResult = "Either your Username or Password has been entered incorrectly.";
		Assert.assertEquals(errorMsg.getText(), expResult, "Error msg not verified");
		Reporter.log("Error msg is verified successfully", true);
	}
	
	public void verifyErrorMsg2() {
		String expResult = "Please enter Username and Password.";
		Assert.assertEquals(errorMsg2.getText(), expResult, "Error msg not verified");
		Reporter.log("Error msg is verified successfully", true);
	}

}

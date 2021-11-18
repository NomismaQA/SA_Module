package com.nomisma.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class PayrollPage4 {
	
	@FindBy(id ="search_input")
	private WebElement SearchCompany;
	@FindBy(xpath ="//a[@id='ui-id-2']")
	private WebElement SelectCompany;
	@FindBy(xpath ="//span[contains(text(),'Payroll')]")
	private WebElement lnkPayroll;
	@FindBy(xpath ="//h2")
	private WebElement TitleAct;
	
	
	
	
	
	public PayrollPage4(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyPageTitle(WebDriver driver,WebElement TitleAct, String TitleExp) {
		
		Assert.assertEquals(TitleAct.getText(), TitleExp, "Failed to verify Title");
		Reporter.log("Title verified successfully", true);
				
	}
	
	public void SearchCompany(WebDriver driver, String Company) throws InterruptedException {
		
		SearchCompany.sendKeys(Company);
		SelectCompany.click();
		Reporter.log("Company opened successfully", true);
		CISPage cis= new CISPage(driver);
		cis.switchwindowForward(driver);
				
	}
	
	
	public void PayrollDashboard(WebDriver driver, String TitleExp1) throws InterruptedException {

		
		lnkPayroll.click();
		
		CISPage cis= new CISPage(driver);
		cis.switchwindowForward(driver);
		

		VerifyPageTitle(driver, TitleAct, TitleExp1);
		
				
						
	}
	
	

}
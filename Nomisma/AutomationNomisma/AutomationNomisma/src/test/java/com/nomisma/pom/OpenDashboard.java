package com.nomisma.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenDashboard extends BasePage {

	@FindBy (id="dashboardMenu")
	private WebElement agentDashboard;
	@FindBy (xpath="//span[contains(text(),'Dashboard')]")
	private WebElement companyDashboard;
	@FindBy (xpath="//span[contains(text(),'Payroll')]")
	public WebElement payrollMenuLnk;
	@FindBy (xpath="//ul[@id='ctl00_ctl00_ParentContent_SideMenu1_PRMenuChildren']//..//a[contains(text(),'Dashboard')]")
	private WebElement payrollDashboard;
	@FindBy (xpath="//span[contains(text(),'CIS')]")
	private WebElement CISMenuLnk;
	@FindBy (xpath="//a[@href='CISDashboard.aspx']")
	private WebElement CISDashboard;
	
	
	public OpenDashboard(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);	
	}

	public void clickagentDashboard(){
		agentDashboard.click();
	}
	
	public void clickcompanyDashboard(){
		companyDashboard.click();
	}
	
	public void clickpayrollDashboard(){
		payrollMenuLnk.click();
		payrollDashboard.click();
	}
	
	public void clickCISDashboard() throws InterruptedException{
		CISMenuLnk.click();
		CISDashboard.click();
		//Thread.sleep(2000);
	}
	
}

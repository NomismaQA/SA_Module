package com.nomisma.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class AccountsDashboardPage {
	
	@FindBy (xpath= "//span[contains(text(),'Reports')]")
	private WebElement reportsLnk;
	@FindBy (xpath = "//ul[@id='ctl00_SideMenu1_AccountMenu']//li[@class='have_sub']//a//span[contains(text(),'Sales')]")
	private WebElement salesLnk;
	@FindBy (xpath = "//ul[@id='ctl00_SideMenu1_AccountMenu']//li[@class='have_sub have_sub_active']//ul//li[1]//a[contains(text(),'Invoice')]")
	private WebElement invoiceLnk;
	@FindBy (xpath = "//div[@class='header_right_nav pull-right']//ul//li[@class='finanDropPar']//select[@id='ctl00_ddlFinancialYear']")
	private WebElement taxYearDrpDwn;
	@FindBy (xpath = "//div[@id='ctl00_divMainContent']//header[@class='page_title clearfix']//h2[contains(text(),'Invoice')]")
	private WebElement invoiceTitle;
	
private String accountsDashboardPageTitle;
	

	public AccountsDashboardPage(WebDriver driver){
		accountsDashboardPageTitle = driver.getTitle();
		PageFactory.initElements(driver, this);
		System.out.println(accountsDashboardPageTitle);
	}
	
	public void clickReportsLnk(WebDriver driver){
		reportsLnk.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void clickSalesLnk(WebDriver driver, String accountYear){
		
		salesLnk.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		invoiceLnk.click();
		
		WebElement taxYearDrpDwn= this.taxYearDrpDwn;
		Select sel =new Select(taxYearDrpDwn);
		taxYearDrpDwn.sendKeys(accountYear);
		invoiceTitle.click();
		Reporter.log("++++++++++ Accounting Year is Selected from Drop Down ++++++++++", true);

		
	}

	
	public void invoicePagination(WebDriver driver) throws InterruptedException{
		
 List<WebElement> pagination = driver.findElements(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a"));
 
 int s = pagination.size();
		
		if(s>0)
		{
			System.out.println("Pagination Exists");
			System.out.println(pagination.size());
			
			for(int i=1;i<s;i++)
			{
				//pagination.get(i).click();
				//Thread.sleep(3000);
				
				try{
					driver.findElement(By.xpath("//div[@class='paginationInner clearfix']//ul//li//a[contains(text(),'"+i+"')]")).click() ;
					Thread.sleep(3000);
					System.out.println("Loop "+i);
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


package com.nomisma.pom;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class AgentsPage {
	
	@FindBy(xpath="//span[contains(text(),'Businesses')]")
	private WebElement businessLnk;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany")
	private WebElement businessSrchTxtBx;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_txtSearchDirector")
	private WebElement dirNameSrchTxtBx;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_ddStatus")
	private WebElement statusDrpDwn;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_chkPortfolio")
	private WebElement portfolioChckBx;
	@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
	private WebElement searchBtn;
	@FindBy(xpath= "//span[contains(text(),'Add Business')]")
	private WebElement addBusinessBtn;
	@FindBy(id= "ctl00_cPH_btnLimitedCompany")
	private WebElement limitedCompanyBtn;
	@FindBy(id= "txtSearchCompany")
	private WebElement companyRegSrchTxtBx;
	
	@FindBy(id= "ctl00_cPH_txtCompanyName")
	private WebElement businessNameTxtBx;
	@FindBy(id= "ctl00_cPH_txtRegNo")
	private WebElement regNumTxtBx;
	@FindBy(id= "ctl00_cPH_txtCRegDate")
	private WebElement regDateTxtBx;
	@FindBy(id= "ctl00_cPH_txtFirstName1")
	private WebElement firstNameTxtBx;
	@FindBy(id= "ctl00_cPH_txtLastName1")
	private WebElement lastNameTxtBx;
	@FindBy(id= "ctl00_cPH_chkIsEmployee")
	private WebElement dirIsEmpChckBx;
	@FindBy(id= "ctl00_cPH_btnSave")
	private WebElement saveBtn;
	@FindBy(id= "ctl00_cPH_btnCancel")
	private WebElement cancelBtn;
	
	
	//Give the name of the new company whenever a new company is added
	@FindBy(xpath= "//tbody//td[contains(text(),'AN Enterprises')]")
	private WebElement addedLtdCompName;
	

	//WebElements on Payroll Dashboard
	@FindBy(id= "search_input")
	private WebElement searchBusiness;
	//@FindBy(id="ui-id-1")
	//private WebElement autoOptions;

	
	    //OVERDUE
		@FindBy(xpath= "//a[contains(text(), 'OVERDUE')]")
		private WebElement overDue;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_ddlPayrollDate")
		private WebElement taxYerdrpDwn;
		@FindBy (xpath= "//header[@class='page_title clearfix']")
		private WebElement title;
		@FindBy(xpath= "//div[@class='outerT-dash outerT-dash_Print']//tr[position()]//td[2]")
		private WebElement companies;
		@FindBy(id= "ctl00_ctl00_ParentContent_cpHeaderRight_btnSubmitOnline")
		private WebElement runPayrollBtn;
		@FindBy(id= "ctl00_ctl00_ParentContent_cpHeaderRight_btnCancel")
		private WebElement canclBtn;
		@FindBy(xpath= "//div[@id='ctl00_ctl00_ParentContent_divPagination']//li']")
		private WebElement pagination;
		
		//AUTO PAYROLL
		@FindBy(xpath= "//a[contains(text(), 'AUTO PAYROLL')]")
		private WebElement autoPayroll;
		//MANUAL PAYROLL
		@FindBy(xpath= "//a[contains(text(), 'MANUAL PAYROLL')]")
		private WebElement manPayroll;
		
		//FAILED RTI 
		@FindBy(xpath= "//table/tbody/tr[2]/td[5]")
		private WebElement failedRTI;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_txtCompanyName")
		private WebElement cmpnyTxtbx;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_ddlAutoRun")
		private WebElement selectDrpdwn;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPHFilter_btnSearch")
		private WebElement failedSearchBtn;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPH_txtNotes")
		private WebElement notesTxtbx;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPH_ddlSubmitReason")
		private WebElement selectReasonDrpdwn;
		@FindBy(id= "chAllRTI")
		private WebElement selectAllchckbx;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPH_btnSubmitRTI")
		private WebElement submitToBtn;
		@FindBy(id= "ctl00_ctl00_ParentContent_cPH_btnDoNotSubmit")
		private WebElement notToSubimtBtn;
		//@FindBy(linkText= "Artech Info")
		//private WebElement cmpnylnkTxt;
		@FindBy(className= "_rowitem")
		private WebElement rwChkBox;
		
		
		//MANUAL RTI DUE
		@FindBy(xpath= "//a[contains(text(), 'MANUAL RTI DUE')]")
		private WebElement manualRTI;


	
	
	private String agentsPageTitle;
	

	public AgentsPage(WebDriver driver){
		agentsPageTitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAgentsPageTitle(){
		String expTitle = "Agents";
		Assert.assertEquals(agentsPageTitle, expTitle, "Agents page title is not verified");
		Reporter.log("Agents page title is verified successfully", true);
	}
	
	public void clickBusinessesLnk(){
		businessLnk.click();
	}
	
	public void clickAddBusinessBtn(){
		addBusinessBtn.click();
	}
	
	public void clickAddLimitedCompanyBtn(){
		limitedCompanyBtn.click();
	}
	
	public void addLimitedCompany(String busName, String regNum, String regDate, String dirFirstName, String dirLastName ){
		
		businessNameTxtBx.sendKeys(busName);
		regNumTxtBx.sendKeys(regNum);
		regDateTxtBx.sendKeys(regDate);
		firstNameTxtBx.sendKeys(dirFirstName);
		lastNameTxtBx.sendKeys(dirLastName);
		dirIsEmpChckBx.click();
		saveBtn.click();
		
	}
	
	//Search Company on the Businesses Page
	public void searchBusiness(String busName, WebDriver driver){
		businessSrchTxtBx.sendKeys(busName);
		WebElement statusDrpDwn= this.statusDrpDwn;	
		Select sel =new Select(statusDrpDwn);
		sel.selectByVisibleText("Active");
		searchBtn.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String agentWindow = driver.getWindowHandle();
		System.out.println(agentWindow);
		driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[contains(text(),'"+busName+"')]")).click();
		//addedLtdCompName.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> allWindows = driver.getWindowHandles();
		String companyWindow = null;
		System.out.println(allWindows);
		for(String windowHandle : allWindows){
			if (!windowHandle.equals(agentWindow))
				companyWindow=windowHandle;
		}
			driver.switchTo().window(companyWindow);
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String title = driver.getTitle();
			if(title.matches(busName)){
				Reporter.log("Limited Company window is displayed", true);
		}
		
		
	}
	

	//search Business method on Payroll Dashboard
	public void searchPayrollBusiness(String busName, WebDriver driver){
		
		searchBusiness.sendKeys(busName);
		
		try{
				
			WebElement autoOptions = driver.findElement((By.id("ui-id-1")));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option: optionsToSelect){
				if(option.getText().equalsIgnoreCase(busName)){
					
					System.out.println("Trying to Select: "+busName);
					option.click();
					break;
				}
			}
			
		}catch (NoSuchElementException e){
			System.out.println(e.getStackTrace());
		}
		catch (Exception e){
			
			System.out.println(e.getStackTrace());
		}
		String agentWindow = driver.getWindowHandle();
		Reporter.log(agentWindow,true);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<String> allWindows = driver.getWindowHandles();
		String companyWindow = null;
		System.out.println(allWindows);
		for(String windowHandle : allWindows){
			if (!windowHandle.equals(agentWindow))
				companyWindow=windowHandle;
		}
			driver.switchTo().window(companyWindow);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String title = driver.getTitle();
			if(title.matches(busName)){
				Reporter.log("Payroll Company window is displayed", true);
		}
	}
	
//public void searchPayrollBusinessnew(String busName, WebDriver driver){
//		
//		searchBusiness.sendKeys(busName);
//		
//		
//				
//			WebElement autoOptions = driver.findElement((By.id("ui-id-1")));
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			
//			List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
//			for(WebElement option: optionsToSelect){
//				if(option.getText().equalsIgnoreCase(busName)){
//					
//					System.out.println("Trying to Select: "+busName);
//					option.click();
//					break;
//				}
//			
//			}
//		
//	}
	
	//OVERDUE	
		public void currentStatus(WebDriver driver, String taxyear, String overduecmpny, String autopaycmpny, String manupaycmpny) throws InterruptedException
		{
			overDue.click();
			WebElement taxYerdrpDwn= this.taxYerdrpDwn;
			Select sel =new Select(taxYerdrpDwn);
			taxYerdrpDwn.sendKeys(taxyear);
			title.click();
			Reporter.log("++++++++++ Tax Year is Selected from Drop Down ++++++++++", true);
			driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+overduecmpny+"')]//..//..//td[1]//input")).click();
			runPayrollBtn.click();
			Thread.sleep(3000);
			//canclBtn.click();
			//driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+overduecmpny+"')]")).click();
			driver.navigate().back();
			Thread.sleep(3000);
							
			/*List<WebElement> page=driver.findElements(By.xpath("//div[@id='ctl00_ctl00_ParentContent_divPagination']//a"));
			
			if(page.size()>0)
			{
				System.out.println("Pagination is Exists");
				
				for(int i=1;i<page.size();i++)
				{
					page.get(i).click();
					Thread.sleep(3000);
				}
			}
			else
			{
				System.out.println("Pagination is not Exists");
			}*/
			
			//AUTO PAYROLL
			autoPayroll.click();
			WebElement taxYerdrpDwn1= this.taxYerdrpDwn;
			Select sel1 =new Select(taxYerdrpDwn1);
			taxYerdrpDwn1.sendKeys(taxyear);
			title.click();
			Reporter.log("++++++++++ Tax Year is Selected from Drop Down ++++++++++", true);
			driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+autopaycmpny+"')]//..//..//td[1]//input")).click();
			runPayrollBtn.click();
			//canclBtn.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			
			//MANUAL PAYROLL
			manPayroll.click();
			WebElement taxYerdrpDwn2= this.taxYerdrpDwn;
			Select sel2 =new Select(taxYerdrpDwn2);
			taxYerdrpDwn2.sendKeys(taxyear);
			title.click();
			Reporter.log("++++++++++ Tax Year is Selected from Drop Down ++++++++++", true);
			driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+manupaycmpny+"')]//..//..//td[1]//input")).click();
			runPayrollBtn.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
		}
			
/*			public void failedRTI(WebDriver driver, String cmpnyname, String select, String notes, String reason, String paydate)
			{
				failedRTI.click();
				cmpnyTxtbx.sendKeys(cmpnyname);
				WebElement selectDrpdwn= this.selectDrpdwn;
				Select sel =new Select(selectDrpdwn);
				selectDrpdwn.sendKeys(select);
				title.click();
				Reporter.log("++++++++++ Value is Selected from Drop Down ++++++++++", true);
				failedSearchBtn.click();
				//driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+cmpnyname+"')]")).click();
				driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//a[contains(text(),'"+cmpnyname+"')]//..//..//..//td[contains(text(),'"+paydate+"')]//..//td[1]//input")).click();
				//To select all Transactions to Submit or Not Submit
				//selectAllchckbx.click();
				notesTxtbx.sendKeys(notes);
				WebElement selectReasonDrpdwn= this.selectReasonDrpdwn;
				Select sel1 =new Select(selectReasonDrpdwn);
				selectDrpdwn.sendKeys(reason);
				title.click();
				Reporter.log("++++++++++ Reason is Selected from Drop Down ++++++++++", true);
				//submitToBtn.click();
				notToSubimtBtn.click();
				//EPS pdf popup
				//Failed popup
				
			}*/
			  
			public void failedRTI(WebDriver driver, String select, String notes, String reason)
			{
				failedRTI.click();
				WebElement selectDrpdwn= this.selectDrpdwn;
				Select sel =new Select(selectDrpdwn);
				selectDrpdwn.sendKeys(select);
				title.click();
				Reporter.log("++++++++++ Value is Selected from Drop Down ++++++++++", true);
				failedSearchBtn.click();
				rwChkBox.click();
				notesTxtbx.sendKeys(notes);
				WebElement selectReasonDrpdwn= this.selectReasonDrpdwn;
				Select sel1 =new Select(selectReasonDrpdwn);
				selectDrpdwn.sendKeys(reason);
				title.click();
				Reporter.log("++++++++++ Reason is Selected from Drop Down ++++++++++", true);
				//submitToBtn.click();
				notToSubimtBtn.click();
				//EPS pdf popup
				//Failed popup
				
			}
			  
			
		}
		

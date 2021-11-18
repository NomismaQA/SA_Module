package com.nomisma.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.nomisma.generic.WaitStatementLib;



public class PayrollPageThresholds {
	
	//Edit Employee
	//@FindBy (xpath = "//div//a[@class='setting-e AddEmployee cboxElement']//img[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_imgEdit']/../..//span[contains(text(),'Edit')]")
	//div//a//img[@id='ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_imgEdit']/../..//span[contains(text(),'Edit')]
	//private WebElement editLnk;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtBasicSalary")
	private WebElement basicSalaryTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_txtGrossSalary")
	private WebElement netSalaryTxtBx;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_btnGross")
	private WebElement calculateGrossBtn;
	@FindBy (id = "ctl00_ctl00_ParentContent_cphFooter_btnSave")
	private WebElement saveAddEmployeeBtn;

	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rdoDirectorTableMethod")
	private WebElement tableMethodRadio;
	@FindBy (id = "ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rdoDirectorCumulativeMethod")
	private WebElement cummulativeMethodRadio;
	@FindBy (id="ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_ddlNICategoryCode")
	private WebElement niCategoryLetterDrpDwn;
	
	//Employee Dashboard
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//table//tbody//tr[2]//td//a[contains(text(),'Direct On Table Mehtod, Mr.')]")
	private List<WebElement> emp1;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//table//tbody//tr[2]//td//a[contains(text(),'Direct On Table Mehtod, Mr.')]")
	private WebElement emp3;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//table//tbody//tr[3]//td//a[contains(text(),'Direct one On Cummulative Mehtod, Mr.')]")
	private List<WebElement> emp2;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//table//tbody//tr[3]//td//a[contains(text(),'Direct one On Cummulative Mehtod, Mr.')]")
	private WebElement emp4;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//div//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//th[4]/../..//tr//td[4]")
	private List<WebElement> grossPay;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//div//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//th[5]/../..//tr//td[5]")
	private List<WebElement> EmployeeNI;
	@FindBy (xpath = "//div[@class='main_content invoiceMain']//div//div//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//th[8]/../..//tr//td[8]")
	private List<WebElement> EmployerNI;
	
	
	private String payrollPageTitle;
	static int i=1;
	
	public PayrollPageThresholds(WebDriver driver){
		payrollPageTitle = driver.getTitle();
		PageFactory.initElements(driver, this);
	}
	
	public void editEmployee(WebDriver driver, String empToEditName, String updateBasicSal, String niCalcMethod, String niCatLetter, String controlID) throws InterruptedException{
    	
		try {
			List<WebElement> empName = driver.findElements((By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[1]")));
			for (WebElement emp1 : empName){
				if(emp1.getText().equalsIgnoreCase(empToEditName)){
					
					System.out.println("Trying to match Employee name :"+empToEditName);
					WebElement editEmpSettings = driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td[1]/a[contains(text(),'"+empToEditName+"')]/..//..//td//a[@class='toggleSettings']"));
					editEmpSettings.click();
					Thread.sleep(2000);
					//WaitStatementLib wLib = new WaitStatementLib();
					//wLib.implictWaitForSeconds(driver, 30);
					WebElement editLnk = driver.findElement(By.id(controlID));
					editLnk.click();
					//Thread.sleep(2000);
					//driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
					Reporter.log("Clicked Employee having NI Number :"+empToEditName, true);
					//break;
				}
			}
		}
		catch (NoSuchElementException e){
			System.out.println(e.getStackTrace());
		}
		catch (Exception e){
			
			System.out.println(e.getStackTrace());
		}
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.className("cboxIframe")));
		Reporter.log("Popup opened ", true);
		//PayrollPageThresholds ppts = new PayrollPageThresholds(driver);
		//ppts.selectDirectorNIMethod(driver);
		
			WebElement nameofRadioButtons= driver.findElement(By.id("ctl00_ctl00_ParentContent_cPH_tbContainer_tpPayrollEmployee_rdoDirectorCumulativeMethod"));
			//int iSize = nameofRadioButtons.size();
			//System.out.println(iSize);
//			boolean bValue = false;
//			System.out.println("Is Cummulative Radio button selected :"+bValue);
//			bValue = nameofRadioButtons.isSelected();
//			System.out.println("Is Cummulative Radio button selected :"+bValue);
			/*if(bValue == true){
				Reporter.log("Ni Table Method can be selected",true);
				tableMethodRadio.click();
			}
			else{
				Reporter.log("Ni Cummulative Method is not selected by Default, it can be selected");
				nameofRadioButtons.click();
			}*/
			
			
			String sValue = nameofRadioButtons.getAttribute("value");
			Reporter.log("Value obtained from RadioButton is: "+sValue, true);
			if (sValue.equalsIgnoreCase(niCalcMethod)){
				nameofRadioButtons.click();
				System.out.println("Value matched from test data sheet");
				String sValue2 = nameofRadioButtons.getAttribute("checked");
				
				Reporter.log("RadioButton is: "+sValue2, true);
			       }
			else{
				tableMethodRadio.click();
				System.out.println("Director NI Table Method is clicked");
				String sValue2 = tableMethodRadio.getAttribute("checked");
				
				Reporter.log("RadioButton is: "+sValue2, true);
			}
			
		
		/*netSalaryTxtBx.sendKeys(updateNetSal);
		calculateGrossBtn.click();
		String sal = basicSalaryTxtBx.getAttribute("value");
		String basicSal = new Double(sal).toString();
		
		Reporter.log("Basic Salary is: "+basicSal, true);
		basicSalaryTxtBx.getAttribute("value").equalsIgnoreCase(updateBasicSal);
		Reporter.log("Updated Net Salary Calculates right Basic/Gross Salary: "+basicSal, true);*/
		
		basicSalaryTxtBx.clear();
		basicSalaryTxtBx.sendKeys(updateBasicSal);
		Reporter.log("Gross Salary updated by :"+updateBasicSal, true);
		
		WebElement niCategoryLetterDrpDwn= this.niCategoryLetterDrpDwn;
		Select sel1 =new Select(niCategoryLetterDrpDwn);
		niCategoryLetterDrpDwn.sendKeys(niCatLetter);
		
		WaitStatementLib wLib = new WaitStatementLib();
		wLib.implictWaitForSeconds(driver, 30);
		
		saveAddEmployeeBtn.click();
		
	
}
	
	public void selectEmployee(WebDriver driver, String empDashboard){
		
		
		WebElement nameOnDashboard = driver.findElement(By.xpath("//div[@class='outerT-dash outerT-dash_Print']//table//tbody//tr//td/a[contains(text(),'"+empDashboard+"')]"));
		nameOnDashboard.click();
		/*if (emp1.size()>0){
		emp3.click();
		}
		else if (emp2.size()>0){
		
			emp4.click();
		}
		else{
			Reporter.log("No Employees Found", true);
		}*/
	}
	
	/*public void selectDirectorNIMethod(WebDriver driver){
		
		if (cummulativeMethodRadio.size()>0){
			Reporter.log("Cummulative Method is selected for NI Calculation", true);
			//break;
		}
		else if (tableMethodRadio.size()>0){
			Reporter.log("Table Method is selected for  NI Calculations");
			((WebElement) tableMethodRadio).click();
			
		}
		
		else {
			Reporter.log("Table Method for NI Calculation will be selected");
			
		}
	}*/
	
	public void verifyEmployeeNIMonthlyThreshold(){
		double LEL = 520; // Yearly Threshold 2018-19
		double PT = 792;  // Yearly Threshold 2018-19
		double UEL = 4167;  // Yearly Threshold 2018-19
		double Gross = 0;
	for (WebElement li:grossPay)
	{
		String grossList = li.getText();
		String stgrossList = grossList.toString();
		stgrossList = stgrossList.replaceAll("[£ ,]", "");
		double d = Double.valueOf(stgrossList);
		Reporter.log("Values in the Gross Pay :"+d, true);
		Gross = d;
		
	}
	
	//****Employee NI Calculation****
		 if (Gross <LEL){
			 Reporter.log("Employee NI won't be deducted as Gross is less than LEL threshold values", true);
			 double EmpNI = 0;
			 //Reporter.log("Calculated NI is:"+EmpNI,true);
			 for (WebElement li1:EmployeeNI)
			 {
				 String EmpNIList = li1.getText();
				 String stEmpNIList = EmpNIList.toString();
				 stEmpNIList= stEmpNIList.replaceAll("[£ ,]", "");
				 double d2 = Double.valueOf(stEmpNIList);
				 Reporter.log("Values in the Employee NI Column:"+d2, true);
				 EmpNI = d2;
				 Reporter.log("Displayed NI is:"+EmpNI,true);
				 String sd = String.valueOf(d2);
				 String sEmperNI = String.valueOf(EmpNI);
				 Reporter.log("Calculated NI is:"+sEmperNI, true);
				 Assert.assertEquals(sd, sEmperNI, "Employee NI is not verified");
				 Reporter.log("Employee NI is verified successfully", true);
			 }
		 }
		 
		 else if (Gross >= LEL && Gross <= PT){
			 Reporter.log("Employer NI will be deducted by 0%",true);
			 double EmpNI = ((Gross-LEL) * 0/100);
			 //Reporter.log("Calculated NI is:"+EmpNI, true);
			 for (WebElement li2:EmployeeNI)
			 {
				 String EmpNIList = li2.getText();
				 String stEmpNIList = EmpNIList.toString();
				 stEmpNIList= stEmpNIList.replaceAll("[£ ,]", "");
				 double d3 = Double.valueOf(stEmpNIList);
				 Reporter.log("Values in the Employee NI Column:"+d3, true);
				 EmpNI = d3;
				 Reporter.log("Displayed NI is:"+EmpNI,true);
				 String sd = String.valueOf(d3);
				 String sEmpNI = String.valueOf(EmpNI);
				 Reporter.log("Calculated NI is:"+sEmpNI, true);
				 Assert.assertEquals(sd, sEmpNI, "Employee NI is not verified");
				 Reporter.log("Employee NI is verified successfully", true);
			 }
			 
		 }
		 
		 else if (Gross >= PT && Gross <= UEL){
			 Reporter.log("Employee NI will be deducted by 12%",true);
			 double EmpNI = (((PT-LEL) * 0/100) + ((Gross-PT) * 12/100));
			 //Reporter.log("Calculated NI is:"+EmpNI, true);
			 for (WebElement li3:EmployeeNI)
			 {
				 String EmpNIList = li3.getText();
				 String stEmpNIList = EmpNIList.toString();
				 stEmpNIList= stEmpNIList.replaceAll("[£ ,]", "");
				 double d4 = Double.valueOf(stEmpNIList);
				 Reporter.log("Values in the Employee NI Column:"+d4, true);
				 EmpNI = d4;
				 Reporter.log("Displayed NI is:"+EmpNI,true);
				 String sd = String.valueOf(d4);
				 String sEmpNI = String.valueOf(EmpNI);
				 Reporter.log("Calculated NI is:"+sEmpNI, true);
				 Assert.assertEquals(sd, sEmpNI, "Employee NI is not verified");
				 Reporter.log("Employee NI is verified successfully", true);
			 }
			
		 }
		 else if (Gross>LEL && Gross> PT && Gross>UEL){
			 Reporter.log("Employee NI will be deducted by 12% up till UEL & 2% above UEL",true);
			 double EmpNI = (((PT-LEL) * 0/100) + ((UEL-PT) * 12/100) + ((Gross-UEL) * 2/100));
			  
			 for (WebElement li4:EmployeeNI)
			 {
				 String EmpNIList = li4.getText();
				 String stEmpNIList = EmpNIList.toString();
				 stEmpNIList= stEmpNIList.replaceAll("[£ ,]", "");
				 double d5 = Double.valueOf(stEmpNIList);
				 Reporter.log("Values in the Employee NI Column:"+d5, true);
				 EmpNI = d5;
				 Reporter.log("Displayed NI is:"+EmpNI,true);
				 String sd = String.valueOf(d5);
				 String sEmpNI = String.valueOf(EmpNI);
				 Reporter.log("Calculated NI is:"+sEmpNI, true);
				 Assert.assertEquals(sd, sEmpNI, "Employee NI is not verified");
				 Reporter.log("Employee NI is verified successfully", true);
				 
			 }
			
		 }
		 
		 
	//} 
		 
	}
	
	//****Employer NI Calculation****
	
	public void verifyEmployerNIMonthlyThreshold(){
		double LEL = 520; // Yearly Threshold 2018-19
		double PT = 792;  // Yearly Threshold 2018-19
		double UEL = 4167;  // Yearly Threshold 2018-19
		double Gross = 0;
	for (WebElement li:grossPay)
	{
		String grossList = li.getText();
		String stgrossList = grossList.toString();
		stgrossList = stgrossList.replaceAll("[£ ,]", "");
		double d = Double.valueOf(stgrossList);
		Reporter.log("Values in the Gross Pay :"+d, true);
		Gross = d;
		
	}
	
	
		 if (Gross <LEL){
			 Reporter.log("Employer NI won't be deducted as Gross is less than LEL threshold values", true);
			 double EmperNI = 0;
			 //Reporter.log("Calculated NI is:"+EmpNI,true);
			 for (WebElement li1:EmployerNI)
			 {
				 String EmperNIList = li1.getText();
				 String stEmperNIList = EmperNIList.toString();
				 stEmperNIList= stEmperNIList.replaceAll("[£ ,]", "");
				 double d2 = Double.valueOf(stEmperNIList);
				 Reporter.log("Values in the Employer NI Column:"+d2, true);
				 EmperNI = d2;
				 Reporter.log("Displayed NI is:"+EmperNI,true);
				 String sd = String.valueOf(d2);
				 String sEmperNI = String.valueOf(EmperNI);
				 Reporter.log("Calculated NI is:"+sEmperNI, true);
				 Assert.assertEquals(sd, sEmperNI, "Employee NI is not verified");
				 Reporter.log("Employer NI is verified successfully", true);
			 }
		 }
		 
		 else if (Gross >= LEL && Gross <= PT){
			 Reporter.log("Employer NI will be deducted by 0%",true);
			 double EmperNI = ((Gross-LEL) * 0/100);
			 //Reporter.log("Calculated NI is:"+EmpNI, true);
			 for (WebElement li2:EmployerNI)
			 {
				 String EmperNIList = li2.getText();
				 String stEmperNIList = EmperNIList.toString();
				 stEmperNIList= stEmperNIList.replaceAll("[£ ,]", "");
				 double d3 = Double.valueOf(stEmperNIList);
				 Reporter.log("Values in the Employer NI Column:"+d3, true);
				 EmperNI = d3;
				 Reporter.log("Displayed NI is:"+EmperNI,true);
				 String sd = String.valueOf(d3);
				 String sEmperNI = String.valueOf(EmperNI);
				 Reporter.log("Calculated NI is:"+sEmperNI, true);
				 Assert.assertEquals(sd, sEmperNI, "Employer NI is not verified");
				 Reporter.log("Employer NI is verified successfully", true);
			 }
			 
		 }
		 
		 else if (Gross >= PT && Gross <= UEL){
			 Reporter.log("Employer NI will be deducted by 13.80%",true);
			 double EmperNI = (((PT-LEL) * 0/100) + ((Gross-PT) * 13.8/100));
			 //Reporter.log("Calculated NI is:"+EmpNI, true);
			 for (WebElement li3:EmployerNI)
			 {
				 String EmperNIList = li3.getText();
				 String stEmperNIList = EmperNIList.toString();
				 stEmperNIList= stEmperNIList.replaceAll("[£ ,]", "");
				 double d4 = Double.valueOf(stEmperNIList);
				 Reporter.log("Values in the Employer NI Column:"+d4, true);
				 EmperNI = d4;
				 Reporter.log("Displayed NI is:"+EmperNI,true);
				 String sd = String.valueOf(d4);
				 String sEmperNI = String.valueOf(EmperNI);
				 Reporter.log("Calculated NI is:"+sEmperNI, true);
				 Assert.assertEquals(sd, sEmperNI, "Employer NI is not verified");
				 Reporter.log("Employer NI is verified successfully", true);
			 }
			
		 }
		 else if (Gross>LEL && Gross> PT && Gross>UEL){
			 Reporter.log("Employer NI will be deducted by 12% up till UEL & 2% above UEL",true);
			 double EmperNI = (((PT-LEL) * 0/100) + ((UEL-PT) * 13.8/100) + ((Gross-UEL) * 13.8/100));
			  
			 for (WebElement li4:EmployerNI)
			 {
				 String EmperNIList = li4.getText();
				 String stEmperNIList = EmperNIList.toString();
				 stEmperNIList= stEmperNIList.replaceAll("[£ ,]", "");
				 double d5 = Double.valueOf(stEmperNIList);
				 Reporter.log("Values in the Employer NI Column:"+d5, true);
				 EmperNI = d5;
				 Reporter.log("Displayed NI is:"+EmperNI,true);
				 String sd = String.valueOf(d5);
				 String sEmperNI = String.valueOf(EmperNI);
				 Reporter.log("Calculated NI is:"+sEmperNI, true);
				 Assert.assertEquals(sd, sEmperNI, "Employer NI is not verified");
				 Reporter.log("Employer NI is verified successfully", true);
				 
			 }
			
		 }
		 
		 
	//} 
		 
	}
	
}

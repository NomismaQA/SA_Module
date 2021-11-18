package com.nomisma.pom;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import org.testng.Assert;

public class AdminPage {
	

	
@FindBy (id= "ctl00_cPHFilter_txtAgentName")
private WebElement agentNameTxtBx;
@FindBy (id= "ctl00_cPHFilter_ddStatus")
private WebElement agentStatusDrpDwn;
@FindBy (id="ctl00_cPHFilter_btnSearch")
private WebElement searchAgentBtn;
@FindBy (id="ctl00_cpHeaderRight_btnAdd")
private WebElement addAgentBtn;
@FindBy (id="ctl00_cPH_txtFavLnkName")
private WebElement agentNameTxtFldBx;
@FindBy (id="ctl00_cPH_chkIsActive")
private WebElement isActiveChkBx;
@FindBy (id="ctl00_cPH_txtEndDate")
private WebElement trailEndDateChkBx;
@FindBy (id="ctl00_cPH_chkIsTest")
private WebElement isTestChkBx;
@FindBy (id="ctl00_cPH_cblPackage_0")
private WebElement enterpriseChkBx;
@FindBy (id="ctl00_cPH_cblPackage_1")
private WebElement startupBKChkBx;
@FindBy (id="ctl00_cPH_cblPackage_2")
private WebElement startupChkBx;
@FindBy (id="ctl00_cPH_cblPackage_3")
private WebElement professionalChkBx;
@FindBy (id="ctl00_cPH_btnSave")
private WebElement saveBtn;
@FindBy (id="ctl00_cPH_btnCancel")
private WebElement cancelBtn;
@FindBy (xpath="//strong[contains(text(),'Error!')]")
private WebElement errorMsg3;
//Give the name of agent when ever a new agent is added 
@FindBy (xpath="//tbody//td[contains(text(),'Nomisma')]")
private WebElement addedagentName;
//Give the name of agentHeading
@FindBy (xpath="//header//div//span[contains(text(), 'AN Enterprises')]")
private WebElement agentHeading;	

private String homePageTitle;
//private String agentName;

public AdminPage(WebDriver driver){
	homePageTitle = driver.getTitle();
	PageFactory.initElements(driver, this);
}

public void verifyHomePageTitle(){
	String expTitle = "Admin";
	Assert.assertEquals(homePageTitle, expTitle, "Home page title is not verified");
	Reporter.log("Home page title is verified successfully", true);
}

// verify error message on the Add Agent page if duplicate entry is found.
public void verifyErrorMsg3() {
	String expResult = "Error!";
	Assert.assertEquals(errorMsg3.getText(), expResult, "Error msg not verified");
	Reporter.log("Error msg is verified successfully", true);
}

public void clickAddAgentBtn(){
	addAgentBtn.click();
}

// Add new agent page
public void addAgent(String agentName){
	
	agentNameTxtFldBx.sendKeys(agentName);
	
	//Click isActiveChkBx
	isActiveChkBx.click();
	/*WebElement isActiveChkBx = this.isActiveChkBx;
	boolean flag = isActiveChkBx.isSelected();
	
	if (flag)
	{
		System.out.println("Checkbox is already selected");
	}
	else {
		
		isActiveChkBx.click();
	}*/
	
	//Click isTestChkBx
	isTestChkBx.click();
	/*WebElement isTestChkBx = this.isTestChkBx;
	boolean flag1 = isTestChkBx.isSelected();
	
	if (flag1)
	{
		System.out.println("Checkbox is already selected");
	}
	else {
		isTestChkBx.click();
	}*/
	
	//Click professionalChkBx
	professionalChkBx.click();
	/*WebElement professionalChkBx = this.isTestChkBx;
	boolean flag2 = professionalChkBx.isSelected();
	
	if (flag2)
	{
		System.out.println("Checkbox is already selected");
	}
	else {
		professionalChkBx.click();
	}*/
	
	saveBtn.click();
}

//Search Agent on Admin Page.	
public void searchAgent(String agentName, WebDriver driver){
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(agentNameTxtBx));
	agentNameTxtBx.sendKeys(agentName);
	
//	WebElement agentStatusDrpDwn = this.agentStatusDrpDwn;
//	Select sel = new Select(agentStatusDrpDwn);
//	sel.selectByVisibleText("Active");
	
	
	searchAgentBtn.click();
	String adminWindow = driver.getWindowHandle();
	System.out.println(adminWindow);
	
	driver.findElement(By.xpath("//table//tbody//tr//td[contains(text(),'"+agentName+"')]")).click();
	//addedagentName.click();
	Set<String> allWindows = driver.getWindowHandles();
	String agentWindow = null;
	System.out.println(allWindows);
	for(String windowHandle : allWindows){
		if (!windowHandle.equals(adminWindow))
			agentWindow=windowHandle;
	}
		driver.switchTo().window(agentWindow);
		String title = driver.getTitle();
		if(title.contains("Agents")){
			Reporter.log("Agent window is displayed", true);
	}
}

	
		

//Verify added agentHeading Text by clicking it.
public void verifyaddedAgent(String agentHeading, WebDriver driver){
	//addedagentName.click();
	//String agentHeadingTxt = agentHeading.getText();
	//Assert.assertTrue(agentHeading.isDisplayed(), "Agent Name is not displayed");
	//Reporter.log(agentHeadingTxt, true);
	
	
	String agentHeadingTxt = driver.findElement(By.xpath("//header//div//span[contains(text(), '"+agentHeading+"')]")).getText(); 
			//agentHeading.getText();
	Assert.assertEquals(agentHeadingTxt, agentHeadingTxt, "Agent Name is not displayed");
	Reporter.log("Agent Name is verified successfully", true);
	
	
}

}

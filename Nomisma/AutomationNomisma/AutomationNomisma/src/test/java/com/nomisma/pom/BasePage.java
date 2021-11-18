package com.nomisma.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public abstract class BasePage {

	@FindBy (xpath= "//div[@class='header_drop_down_text']")
	private WebElement profileLink;
	@FindBy (xpath="//a[@id='ctl00_hrefLogout']")
	private WebElement signOut;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignOutLink(){
		profileLink.click();
		signOut.click();
		Reporter.log("Signout Successfully", true);
	}
}
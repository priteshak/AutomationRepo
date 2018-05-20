package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.crm.base.TestBase;



public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[contains(@name,'username')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	WebElement submitButton;
	
	@FindBy(xpath="//img[@class='img-responsive'] [@src='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
	WebElement loginPageLogo;
	
	@FindBy(xpath="//div[@class='intercom-author-summary-name-from']")
	WebElement popUp;
	
	@FindBy(xpath="//div[@class='intercom-borderless-dismiss-button']")
	WebElement popUpDismiss;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Actions action=new Actions(driver);
		action.moveToElement(popUp).build().perform();
		Thread.sleep(2000);
		popUpDismiss.click();
		Thread.sleep(2000);
		submitButton.click();
		Thread.sleep(3000);
		
		//return new HomePage();
	}

	
}

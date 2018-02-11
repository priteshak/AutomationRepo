package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;



public class LoginPage extends TestBase {

	
	@FindBy(xpath="//input[contains(@name,'username')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@type,'submit')]")
	WebElement submitButton;
	
	@FindBy(xpath="//img[@class='img-responsive'] [@src='https://d19rqa8v8yb76c.cloudfront.net/img/freecrm.jpg']")
	WebElement loginPageLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitButton.click();
		
		//return new HomePage();
	}

	
}

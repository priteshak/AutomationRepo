package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;
import com.qa.crm.util.Frame;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: Pritesh Khambekar')]")
	WebElement loginUser;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginUser() {
		Frame.switchToMainPanelFrame();
		return loginUser.getText();
	}

}

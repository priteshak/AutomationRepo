package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;
import com.qa.crm.util.Frame;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: Pritesh Khambekar')]")
	WebElement loginUser;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginUser() {
		Frame.switchToMainPanelFrame();
		return loginUser.getText();
	}
	
	public void newContact() {
		Frame.switchToMainPanelFrame();
		Actions a = new Actions(driver);
		a.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		}

}

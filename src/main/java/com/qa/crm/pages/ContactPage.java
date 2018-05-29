package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.crm.base.TestBase;

public class ContactPage extends TestBase {
	
	@FindBy(xpath="//select[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='middle_initial']")
	WebElement middleName;
	
	@FindBy(xpath="//input[@name='surname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='company_position']")
	WebElement position;
	
	@FindBy(xpath="//input[@name='department']")
	WebElement department;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void newContactForm(String titlen,String first, String middle, String last,
			String positionName, String dept) {
		Select select = new Select(title);
		select.selectByVisibleText(titlen);
		firstName.sendKeys(first);
		middleName.sendKeys(middle);
		lastName.sendKeys(last);
		position.sendKeys(positionName);
		department.sendKeys(dept);
	
	}
	
}

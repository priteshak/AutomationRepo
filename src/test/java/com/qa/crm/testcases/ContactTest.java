package com.qa.crm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.listners.Screenshot;
import com.qa.crm.pages.ContactPage;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;


@Listeners(Screenshot.class)
public class ContactTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	ContactPage contactPage;
	
	public ContactTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
	    homePage = new HomePage();
	    contactPage = new ContactPage();
	    loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    homePage.newContact(); 
	}
	
	/*@Test(priority=1)
	public void openContactLinkTest() {
		homePage.newContact();
		}*/
	
	@Test
	public void newContactFormFillTest() {
		//homePage.newContact();
		contactPage.newContactForm("Mr.", "Pritesh", "Ashok", "Khambekar", "Associate Test Engg", "QA");
		}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
 
	
}

package com.qa.crm.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.LoginPage;



public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
//Go to Window → Preferences → Java → Installed JREs. Select the JRE you're using, click Edit, and there will be a line for Default VM Arguments which will apply to every execution. For instance, I use this on OS X to hide the icon from the dock, increase max memory and turn on assertions:
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage= new LoginPage();
	}
	
	
	@Test
	public void titleTest() {
		String expected = loginPage.loginTitle();
		Assert.assertEquals(expected, "Free CRM software in the cloud powers sales and customer service","Title doesnt matched with actual");
	}
	
	@Test
	public void crmImageTest() {
		loginPage.crmImage();
	}
	
	@Test
	public void loginPageTest() throws InterruptedException {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

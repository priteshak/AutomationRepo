package com.qa.crm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.listners.Screenshot;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;


@Listeners(Screenshot.class)
public class HomepageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public HomepageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyLoginUserNameTest() {
		String actualUserName = homePage.verifyLoginUser();
		Assert.assertEquals(actualUserName, "Pritesh Khambekar", "wrong Username");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

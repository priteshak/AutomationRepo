package com.qa.zurmo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.excelUtility.Xls_Reader1;

public class TestZurmo extends PropertiesDefination {

	
	public static ActionMethods action;
	public static String title ;
	public static Xls_Reader1 reader = new Xls_Reader1("E:\\FreeCRMTest\\src\\test\\java\\com\\qa\\zurmo\\Test1.xlsx");
	public static String userName = reader.getCellData("Sheet1", 2, 2);
	public static String password = reader.getCellData("Sheet1", 2, 3);
	public static String loginButton = reader.getCellData("Sheet1", 2, 4);
	
	public TestZurmo() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
	//public static void main(String[] args) throws InterruptedException {
       action = new ActionMethods();
       
      
       
	}
	
	@Test
	public void testCase() throws InterruptedException {
        action.setUp();
		action.pauseMethod(7000);
		
		action.sendKeysMethod(userName, "super");
		action.sendKeysMethod(password,"super");
		action.clickMethod(loginButton);
		
	/*	action.sendKeysMethod(prop.getProperty("login_username_xpath"), "super");
		action.sendKeysMethod(prop.getProperty("login_password_xpath"),"super");
		action.clickMethod(prop.getProperty("login_click_xpath"));*/
		action.pauseMethod(3000);
		title = action.getTitle();
		if(title.equals("ZurmoCRM - Home")) {
			System.out.println("Drop down window is not there");
		}
		else {
			System.out.println("Drop down window is there, plz select the value as per user instructions");
		action.selectDropdownValue(prop.getProperty("homepage_dropdown_xpath"),"Africa/Accra"); 
		
		}
	}
    @AfterMethod
    public void tearDownAction() {
    	action.tearDown();
    }
}

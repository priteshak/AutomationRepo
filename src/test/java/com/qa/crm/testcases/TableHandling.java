package com.qa.crm.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td[1]"));
		System.out.println(list1.size());
		int rows = list1.size();
		
		for(int i=2; i<=rows; i++) {
			
			String companyNames = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
			
			
			String contactNames = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();
			
			
			String countryNames = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
			
			System.out.println(companyNames+"  "   +contactNames+"  "   +countryNames);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String beforeXpath="//*[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		String beforeXpathContact = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpathContact = "]/td[2]";		
		for(int i=2; i<=7; i++){
			String xpathCompany = beforeXpath+i+afterXpath;
			String CompanyName = driver.findElement(By.xpath(xpathCompany)).getText();
			System.out.println(CompanyName);
			
			String xpathContact = beforeXpathContact+i+afterXpathContact;
			String ContactName = driver.findElement(By.xpath(xpathContact)).getText();
			System.out.println(CompanyName +ContactName);
			
		}    */
	}

}

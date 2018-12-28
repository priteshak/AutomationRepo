package com.qa.zurmo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ActionMethods {
	
	public static  WebDriver driver;

	
		public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver_win32(1)\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.zurmo.com/demos/stable/app/index.php/zurmo/default/login");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		
		public void sendKeysMethod(String xpath, String value) {
			driver.findElement(By.xpath(xpath)).sendKeys(value);
		}
		
		public void clickMethod(String xpath) {
			driver.findElement(By.xpath(xpath)).click();
		}
			
		public void selectDropdownValue(String xpath, String value) {
			Select select = new Select(driver.findElement(By.xpath(xpath)));
			select.selectByVisibleText(value);
			
		}
		
		public  void pauseMethod(int value) throws InterruptedException {
			Thread.sleep(value);
		}
		
		public String getTitle() {
		    return driver.getTitle();
		}
		
		public void  tearDown() {
			driver.quit();
		}
			
		
		
	

}

package com.qa.crm.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a"));
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i).getText());
			if(list1.get(i).isSelected()) {
				break;
			}
			else {
				list1.get(i).click();
			}
			
		}
		
	}

}

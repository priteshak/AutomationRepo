package com.qa.crm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("E:\\FreeCRMTest\\src\\main\\java\\com\\qa\\crm\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void initialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32(1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	public void takeScreenshot(String failedTestCase) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\FreeCRMTest\\src\\main\\"
					+ "java\\screenshots"+failedTestCase+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

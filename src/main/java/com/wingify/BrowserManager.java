package com.wingify;

import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class BrowserManager 
{
	public static WebDriver driver;
	public static WebDriver getDriver(String url) {
		String driverPath = System.getProperty("user.dir") + File.separator + "src" +File.separator+ "test" +File.separator + "java" +File.separator+ "resources" +File.separator+"chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}		
	
}

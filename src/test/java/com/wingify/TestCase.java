package com.wingify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.HeatMapPage;


/**
 * Unit test for simple App.
 */
public class TestCase 
{
	WebDriver driver;
	
	@Test
	public void TC_01_VerifyNewWindow() throws InterruptedException{
		WebDriver driver = new BrowserManager().getDriver("https://app.vwo.com/#/analyze/heatmap/129/reports?token=eyJhY2NvdW50X2lkIjo2LCJleHBlc%20mltZW50X2lkIjoxMjksImNyZWF0ZWRfb24iOjE1MDc3ODk0ODcsInR5cGUiOiJjYW1wYWlnbiIsI%20nZlcnNpb24iOjEsImhhc2giOiJiMzlmMTQ4MWE0ZDMyN2Q4MDllNTM1YzVlNWFjOGVlMCJ9");
		HeatMapPage obj_dev = new HeatMapPage(driver);
		obj_dev.ClickHeatMap();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Home Page View Detailed Report", "Window is not opened correctly");
		obj_dev.ClickOnElementList();
		obj_dev.ClickOnEmailColumn();
	}
	
}

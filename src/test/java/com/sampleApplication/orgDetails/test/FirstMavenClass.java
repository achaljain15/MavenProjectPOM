package com.sampleApplication.orgDetails.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import SeleniumBasicFeatures.LibraryFunctionBrowsers; 

public class FirstMavenClass {

	@Test
	public void test1() {
		WebDriver driver;
		LibraryFunctionBrowsers lib=new LibraryFunctionBrowsers();
		/*
		 * System.out.println("Achal Jain"); System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\ssand\\eclipse-workspace\\Automation Framework\\BrowserDrivers\\chromedriver.exe"
		 * ); ChromeDriver driver=new ChromeDriver();
		 */
		driver=lib.launchBrowser("Chrome");
		driver.get("https://www.google.com/");
	}
	
}

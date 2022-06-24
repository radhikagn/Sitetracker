package com.sitetracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utlis.Configs;

public class BaseClass {

	public static WebDriver driver = new ChromeDriver();;

	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("Before test executing ");
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get(Configs.url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeMethod
	// @Parameters(value = { "browserName" })
	public void beforeMethodtMethod(String browserName) {
		System.out.println("Before Method test executing ");
	}

	@AfterMethod
	public void afterMethodtMethod() {
		System.out.println("After Method test executing ");
	}

	@AfterTest
	public void afterTestMethod() {
		// driver.quit();

	}

	public static void setupDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SiteTrackerProject\\ComponentInlineEditor\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SiteTrackerProject\\ComponentInlineEditor\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
					"D:\\SiteTrackerProject\\ComponentInlineEditor\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

}

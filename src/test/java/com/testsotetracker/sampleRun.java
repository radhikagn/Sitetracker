package com.testsotetracker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utlis.Configs;

public class sampleRun {
	
	public static void main(String[] args) throws InterruptedException {
		// variables

		String Label = "Larry Page:";
		String Website = "https://google.com";
		String Phonenumber = "(555)-755-6575";
		String Balance = "770.54";

		//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Configs.url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		

		driver.navigate().to("https://developer.salesforce.com/docs/component-library/documentation/en/lwc");
		driver.manage().window().maximize();

		Boolean tabvisible = driver.findElement(By.xpath("//span[contains(text(),'Developer Guide')]")).isDisplayed();
		System.out.println(tabvisible);
		Thread.sleep(5000);

		// ***************************second page :
		
		WebElement element = driver.findElement(By.xpath("//span[@title='Component Reference']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		driver.findElement(By.xpath("//input[@name='Quick Find']")).sendKeys("datatable");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/docs/component-library/bundle/lightning-datatable']//span[@title='datatable'][normalize-space()='datatable']")).click();
		Thread.sleep(5000);
		
		// Verify that example tab is selected
		Boolean tabvisible3 = driver.findElement(By.xpath("//a[@id ='example__item']")).isDisplayed();
		System.out.println(tabvisible3);
		Thread.sleep(5000);

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//button[@name='example']")).sendKeys(Keys.ARROW_DOWN);
			if (i == 3) {
				driver.findElement(By.xpath("//button[@name='example']")).sendKeys(Keys.ENTER);
			}
		}

		driver.findElement(By.xpath("//button[normalize-space()='Run']")).click();
		Thread.sleep(5000);

		
		//------------------------------------Data table scripts--------------------//
		
		String iframeurl = driver.switchTo().frame("preview").getCurrentUrl();
		System.out.println("iframeurl : "+iframeurl);
		
		//Switch of inner Iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"main\"]/playground-app/main/playground-split-pane/div[2]/slot/playground-preview/div[1]/iframe")));
		Thread.sleep(5000);

  
		//Label 
		driver.findElement(By.xpath("/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/th")).click();
		//click on pencil icon
		driver.findElement(By.xpath("/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/th/lightning-primitive-cell-factory/span/button")).click();
		driver.findElement(By.xpath("//input[@id='input-1934']")).clear();
		driver.findElement(By.xpath("//input[@id='input-1934']")).sendKeys(Label);
		
		
		//Website :
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/lightning-primitive-cell-factory[1]/span[1]")).click();	
		//click on pencil icon
		driver.findElement(By.xpath("/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[3]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//input[@id='input-1936']")).clear();
		driver.findElement(By.xpath("//input[@id='input-1936']")).sendKeys(Website);
		
		//phone :
		
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/lightning-primitive-cell-factory[1]/span[1]")).click();
		//click on pencil icon
		driver.findElement(By.xpath("/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[4]/lightning-primitive-cell-factory/span/button")).click();
		driver.findElement(By.xpath("//input[@id='input-1940']")).clear();
		driver.findElement(By.xpath("//input[@id='input-1940']")).sendKeys(Phonenumber);
		
		
		//Balance :
		
		driver.findElement(By.xpath("//tbody/tr[3]/td[6]/lightning-primitive-cell-factory[1]/span[1]")).click();
		//click on pencil icon
		driver.findElement(By.xpath("/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[6]/lightning-primitive-cell-factory/span/button")).click();
		driver.findElement(By.xpath("//input[@id='input-1946']")).clear();
		driver.findElement(By.xpath("//input[@id='input-1946']")).sendKeys(Balance);
		
		driver.close();
	}	
		

}

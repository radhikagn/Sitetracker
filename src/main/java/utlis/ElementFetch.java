package utlis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sitetracker.BaseClass;

public class ElementFetch {	
	
	//to fetch element using switch case
	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "ID" :
			return BaseClass.driver.findElement(By.id(identifierValue));
		case "NAME" :
			return BaseClass.driver.findElement(By.name(identifierValue));
		case "XPATH" :
			return BaseClass.driver.findElement(By.xpath(identifierValue));
		case "TAGNAME" :
			return BaseClass.driver.findElement(By.tagName(identifierValue));
		default:
			return null;
		}
	}


	public static WebElement findElementById(String idValue) {

		return BaseClass.driver.findElement( By.id( idValue ) );
	}

	public static WebElement findElementByName(String nameValue) {

		return BaseClass.driver.findElement( By.name( nameValue ) );
	}

	public static WebElement findElementByXpath(String xpath) {

		return BaseClass.driver.findElement( By.xpath( xpath ) );
	}

	public static WebElement findElementByClassName(String className) {
		return BaseClass.driver.findElement( By.className( className ) );
	}

	public static List<WebElement> findElements(By value) {

		return BaseClass.driver.findElements(  value  );

	}


}

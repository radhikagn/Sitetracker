package pageEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.ComponentReferenceElements;
import utlis.ElementFetch;

public class ComponentReferencePage {

	public WebDriver driver;
	ElementFetch elementFetch = new ElementFetch();

	public void navigateToComponentReferenceTab() {
		WebElement element = elementFetch.getWebElement("XPATH", ComponentReferenceElements.componentReference_xpath);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void quickFindDataTable() {
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.quickFind_xpath).sendKeys("datatable");
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.lightningDatatable_xpath).click();	
	}

	public void verifyExampleTabIsDisplayed() {		
		Boolean tabvisible3 = elementFetch.getWebElement("XPATH", ComponentReferenceElements.exampleTab_xpath).isDisplayed();
		Assert.assertTrue(tabvisible3, "Example tab is dispayed");
	}

	public void selectExampleFromDropDown() {
		for (int i = 0; i < 5; i++) {
			elementFetch.getWebElement("XPATH", ComponentReferenceElements.exampleDropdown_xpath).sendKeys(Keys.ARROW_DOWN);
			if (i == 3) {
				elementFetch.getWebElement("XPATH", ComponentReferenceElements.exampleDropdown_xpath).sendKeys(Keys.ENTER);
			}
		}
	}

	public void clickOnRunButton() {
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.runButton_xpath).click();
	}

	public void switchToIframe() {
		String iframeurl = driver.switchTo().frame("preview").getCurrentUrl();
		System.out.println("iframeurl : "+iframeurl);
	}

	public void navigateToInnerFrame() {
		driver.switchTo().frame(elementFetch.getWebElement("XPATH", ComponentReferenceElements.innerIframe_xpath));
	}

	public void updateLabelValue() {
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.labelof3rdRow_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.pencilIconofLabel_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.labelEditField_xpath).clear();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.labelEditField_xpath).sendKeys(ComponentReferenceElements.Label);
	}

	public void updateWebsiteFieldValue() {
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.websiteof3rdRow_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.pencilIconofWebsite_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.websiteEditField_xpath).clear();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.websiteEditField_xpath).sendKeys(ComponentReferenceElements.Website);
	}

	public void updatePhoneFieldValue() {	
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.phoneof3rdRow_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.pencilIconOfPhone_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.phoneEditField_xpath).clear();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.phoneEditField_xpath).sendKeys(ComponentReferenceElements.Phonenumber);
	}

	public void updateBalanceFieldValue() {
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.balanceof3rdRow_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.pencilIconOfBalance_xpath).click();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.balanceEditField_xpath).clear();
		elementFetch.getWebElement("XPATH", ComponentReferenceElements.balanceEditField_xpath).sendKeys(ComponentReferenceElements.Balance);
	}

}





























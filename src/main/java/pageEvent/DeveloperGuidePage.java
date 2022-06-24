package pageEvent;

import org.testng.Assert;

import pageObjects.DeveloperGuideElements;
import utlis.ElementFetch;

public class DeveloperGuidePage {

	public void verifyDeveloperGuidePage(){
		ElementFetch elementFetch = new ElementFetch();
		Boolean elementdispy = elementFetch.getWebElement("XPATH", DeveloperGuideElements.developerGuide_xpath).isDisplayed();
		Assert.assertTrue(elementdispy, "Developer Guide is displayed");

	}

}

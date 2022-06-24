package com.testsotetracker;

import org.testng.annotations.Test;
import pageEvent.ComponentReferencePage;
import pageEvent.DeveloperGuidePage;


public class TestScript01 {	

	@Test
	public void test001_EditLightningInlineDataTable() {

		
		 DeveloperGuidePage developerGuidePage = new DeveloperGuidePage();
		 developerGuidePage.verifyDeveloperGuidePage();
		 
		 ComponentReferencePage componentReferencePage = new ComponentReferencePage();
		 componentReferencePage.navigateToComponentReferenceTab();
		 componentReferencePage.quickFindDataTable();
		 componentReferencePage.verifyExampleTabIsDisplayed();
		 componentReferencePage.selectExampleFromDropDown();
		 componentReferencePage.clickOnRunButton();
		 componentReferencePage.switchToIframe();
		 componentReferencePage.navigateToInnerFrame();
		 componentReferencePage.updateLabelValue();
		 componentReferencePage.updateWebsiteFieldValue();
		 componentReferencePage.updatePhoneFieldValue();
		 componentReferencePage.updateBalanceFieldValue();
		
	}

}

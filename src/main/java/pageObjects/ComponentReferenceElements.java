package pageObjects;

public interface ComponentReferenceElements {
	
	
	
	String componentReference_xpath = "//span[@title='Component Reference']";
	String quickFind_xpath = "//input[@name='Quick Find']";
	String lightningDatatable_xpath = "//a[@href='/docs/component-library/bundle/lightning-datatable']//span[@title='datatable'][normalize-space()='datatable']";
	String exampleTab_xpath = "//a[@id ='example__item']";
	String exampleDropdown_xpath = "//button[@name='example']";
	String runButton_xpath = "//button[normalize-space()='Run']";
	
	//iFrame Elements
	
	String innerIframe_xpath = "//*[@id=\"main\"]/playground-app/main/playground-split-pane/div[2]/slot/playground-preview/div[1]/iframe";
	String labelof3rdRow_xpath = "/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/th";
	String pencilIconofLabel_xpath = "/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/th/lightning-primitive-cell-factory/span/button";
	String labelEditField_xpath = "//input[@id='input-1934']";
	
	String websiteof3rdRow_xpath = "//tbody/tr[3]/td[3]/lightning-primitive-cell-factory[1]/span[1]";
	String pencilIconofWebsite_xpath = "/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[3]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon";
	String websiteEditField_xpath = "//input[@id='input-1937']";
	
	String phoneof3rdRow_xpath = "//tbody/tr[3]/td[4]/lightning-primitive-cell-factory[1]/span[1]";
	String pencilIconOfPhone_xpath = "/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[4]/lightning-primitive-cell-factory/span/button";
	String phoneEditField_xpath = "//input[@id='input-1940']";
	
	String balanceof3rdRow_xpath = "//tbody/tr[3]/td[6]/lightning-primitive-cell-factory[1]/span[1]";
	String pencilIconOfBalance_xpath = "/html/body/main/c-withinlineedit/div/lightning-datatable/div[2]/div/div/div/table/tbody/tr[3]/td[6]/lightning-primitive-cell-factory/span/button";
	String balanceEditField_xpath = "//input[@id='input-1949']";
	
	
	String Label = "Larry Page:";
	String Website = "https://google.com";
	String Phonenumber = "(555)-755-6575";
	String CloseAt = "Today";
	String Balance = "770.54";
	
	
	

}

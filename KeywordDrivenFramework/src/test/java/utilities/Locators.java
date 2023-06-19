package utilities;

import org.openqa.selenium.By;

public class Locators {
	
	public static By getId(String locatorValue) {
		return By.id(locatorValue);
	}
	
	public static By getName(String locatorValue) {
		return By.name(locatorValue);
	}
	
	public static By getxpath(String locatorValue) {
		
		return By.xpath(locatorValue);
		
	}

	public static By getLinkText(String locatorValue) {
		return By.linkText(locatorValue);
		
	}
}

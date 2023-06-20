package keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Tests.Action;
import utilities.ExcelUtility;

public class AdminPageKeywords {
	
	 WebDriver driver;
	 WebElement element;
	
	public void clickOnAdminFacet() {
    	element = driver .findElement(Action.locator);
    	element.click();
    }
    public void enterSystemUserName() {
    	element = driver.findElement(Action.locator);
    	element.sendKeys(ExcelUtility.DataValue);
    }
    public void searchUserName() {
    	element = driver.findElement(Action.locator);
    	element.click();
    }

}

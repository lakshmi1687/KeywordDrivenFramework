package keywords;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Tests.Action;
import utilities.ExcelUtility;

public class LoginPageKeyword  {
	
	static WebDriver driver;
	static WebElement element;
	
	
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "/D:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	public void launchurl() {
		driver.navigate().to(ExcelUtility.DataValue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	public void verifyLoginPage() {
		element = driver.findElement(Action.locator);
		element.isDisplayed();
	}
	
	public void setText() {
	 element = driver.findElement(Action.locator);
	 element.sendKeys(ExcelUtility.DataValue);
		
	}
	
	public static void click() {
		element = driver.findElement(Action.locator);
		element.click();
	}
	
    public void verifyhomepage() {
    	element = driver.findElement(Action.locator);
    	String actual = element.getText();
    	assertEquals(actual, "Dashboard");
    	System.out.println("Logged into the home page of orange hrm");
    }
    
    
}

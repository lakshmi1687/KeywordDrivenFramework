package keywords;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Tests.LoginTest;
import utilities.ExcelUtility;

public class ActionKeyword {
	
	static WebDriver driver;
	static WebElement element;
	
	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "/D:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	public static void launchurl() {
		driver.navigate().to(ExcelUtility.DataValue);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public static void enterusername() {
	 element = driver.findElement(LoginTest.locator);
	 element.sendKeys(ExcelUtility.DataValue);
		
	}
	
	public static void enterpassword() {
		element = driver.findElement(LoginTest.locator);
		element.sendKeys(ExcelUtility.DataValue);
	}
	
	public static void clicklogin() {
		element = driver.findElement(LoginTest.locator);
		element.click();
	}

}

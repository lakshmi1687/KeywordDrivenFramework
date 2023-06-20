package Tests;

import utilities.ExcelUtility;
import utilities.Locators;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import constants.Constant;
import keywords.AdminPageKeywords;
import keywords.LoginPageKeyword;

public class Action {
	
	LoginPageKeyword logkey;
	Method[] methods;
	public static By locator;
	
	public void getkeywords() {
		
		logkey = new LoginPageKeyword();
		methods= logkey.getClass().getDeclaredMethods();
		
			 
	}
	
	public void readKeywords(Object object) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		for(int i=0;i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(ExcelUtility.KeywordValue)) {
				methods[i].invoke(object);
				break;
			}
			
		}
	}
  public void findWebElements() {
	  
	  switch (ExcelUtility.LocatorName) {
	case Constant.ID:
		locator=Locators.getId(ExcelUtility.LocatorValue);
		break;
	case Constant.NAME:
		locator=Locators.getName(ExcelUtility.LocatorValue);
		break;
	case Constant.XPATH:
		locator=Locators.getxpath(ExcelUtility.LocatorValue);
		break;
	case Constant.CLASSNAME:
		locator= Locators.getClassName(ExcelUtility.LocatorValue);
		break;

	default:
		break;
	}
  }
	
	public  void execute_Test(String sheet, Object object) {
		ExcelUtility excelutility = new ExcelUtility();
		
		try {
			excelutility.readExcel(Constant.EXCEL_PATH,sheet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Action action = new Action();
		
		action.getkeywords();
		
		for(int row=1;row<=excelutility.totalRows;row++) {
			 
			excelutility.getCell(row, Constant.LOCATOR_NAME, Constant.LOCATOR_VALUE, Constant.KEYWORD_COLUMN, Constant.DATA_COLUMN);
			action.findWebElements();	 
			try {
				action.readKeywords(object);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
			
		}	
	}

}

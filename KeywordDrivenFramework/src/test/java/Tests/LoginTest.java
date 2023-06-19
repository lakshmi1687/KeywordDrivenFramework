package Tests;

import utilities.ExcelUtility;
import utilities.Locators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;

import constants.Constant;
import keywords.ActionKeyword;

public class LoginTest {
	
	ActionKeyword actkey;
	Method[] methods;
	public static By locator;
	
	public void getkeywords() {
		
		actkey = new ActionKeyword();
		 methods= actkey.getClass().getDeclaredMethods();
			 
	}
	
	public void readKeywords() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		for(int i=0;i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(ExcelUtility.KeywordValue)) {
				methods[i].invoke(actkey);
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

	default:
		break;
	}
  }
	
	public static void main(String[]args) throws Exception {
		ExcelUtility excelutility = new ExcelUtility();
		
		excelutility.readExcel(Constant.EXCEL_PATH);
		
		LoginTest login = new LoginTest();
		
		login.getkeywords();
		
		for(int row=1;row<=excelutility.totalRows;row++) {
			 
			excelutility.getCell(row, Constant.LOCATOR_NAME, Constant.LOCATOR_VALUE, Constant.KEYWORD_COLUMN, Constant.DATA_COLUMN);
			login.findWebElements();
			 
			 login.readKeywords();
			
		}	
	}

}

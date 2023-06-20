package utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	public static String LocatorName;
	public static String LocatorValue;
	public static String KeywordValue;
	public static String DataValue;
	public  int totalRows;
	public void readExcel(String dataSheet,String sheetName) throws Exception {
		
			 file = new FileInputStream(dataSheet);
			 workbook = new XSSFWorkbook(file);
			 sheet = workbook.getSheet(sheetName);
			 totalRows= sheet.getLastRowNum();
	}
	
	public void getCell(int row,int locatorName,int locatorValue,int keywordColumn,int dataColumn) {
		if(!(LocatorName == "NA")) {
		LocatorName= sheet.getRow(row).getCell(locatorName).toString().trim();
		}
		if(!(LocatorValue == "NA")) {
		LocatorValue = sheet.getRow(row).getCell(locatorValue).toString().trim();
		}
		KeywordValue = sheet.getRow(row).getCell(keywordColumn).toString().trim();
		if(!(DataValue == "NA")) {
			DataValue = sheet.getRow(row).getCell(dataColumn).toString().trim();
		}
		
	}
	
	

}

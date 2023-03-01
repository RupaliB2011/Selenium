package com.maven_testing.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.maven_testing.base.Base;



public class Utility extends Base {
	
	
	// *****************************READ_DATA_FROM_EXCEL************************************
	@DataProvider(name="getTestDataFromExcel")
	public static Object[][] readExcel(String filePath, String sheetName) throws IOException {
		new File(filePath);
		FileInputStream inputStream = new FileInputStream(filePath);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("Total row = " + sheet.getLastRowNum());
		System.out.println("Total cell = " + sheet.getRow(0).getLastCellNum());

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		return data;
	}

	/*
	 * static ExcelOperation excel = new ExcelOperation(); static String
	 * excelFilePath ="D:\\Selenium Workspace\\Credentials.xlsx";
	 * excel.setExcelFile(excelFilePath, "Credentials");
	 * 
	 * for(int i=1;i<=excel.getRowCountInSheet();i++) { WebElement workEmail =
	 * driver.findElement(By.id("login_email")); workEmail.clear();
	 * workEmail.sendKeys(excel.getCellData(i, 0));
	 * 
	 * WebElement passWord = driver.findElement(By.id("login_password"));
	 * passWord.clear(); passWord.sendKeys(excel.getCellData(i, 1)); }
	 */
}

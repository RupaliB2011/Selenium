package com.maven_testing.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	
	/**
	 * Function for waiting driver till the element visible
	 * @param element
	 * @param time
	 */
	public void waitForElement(WebDriver driver, WebElement ele, Duration time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/**
	 * Method to get current Date in DD-M-MYY_ HH-mm-ss format
	 **/
	public String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
		Date date = new Date();
		String filePathdate = dateFormat.format(date).toString();
		return filePathdate;
	}
	
	public void clickActionOnAxis(WebDriver driver, int xAxis, int yAxis) {
		Actions action = new Actions(driver);
		action.moveByOffset(xAxis, yAxis).click().build().perform();
	}
	
	/**
	 * Method to get current Date and increment to user input days in dd-MM-yyyy format
	 **/
	public String getCurrentDateAndIncrement(int days) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, days); // Adding  user entered days
		String newDate = sdf.format(c.getTime());
		
		return newDate;
	}
	
	/**
	 * This function is to get property value
	 * @param key
	 */
	
	public String getPropValue(String key) {
//		File configFile = new File(System.getProperty("user.dir") + "\\Maven_Testng_Project\\src\\main\\java\\com\\maven_testing\\config\\config.properties");
		File configFile = new File("D:\\Selenium Workspace\\Maven_Testng_Project\\src\\main\\java\\com\\maven_testing\\config\\config.properties");
		String host = null;
		try {
			FileReader reader = new FileReader(configFile);
			Properties props = new Properties();
			props.load(reader);
			host = props.getProperty(key);
			reader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		} catch (IOException ex) {
			System.out.println("File Not Found");
		}

		return host;
	}
}

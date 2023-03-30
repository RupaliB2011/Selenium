package com.maven_testing.masterPage;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.maven_testing.base.Base;

public class DataDrivenPoc extends Base {
	    

	    @DataProvider(name = "testData")
	    public Object[][] getData() throws IOException {
	        // Define the Excel file path and sheet name
	        FileInputStream file = new FileInputStream("D:\\Selenium Workspace\\Maven_Testng_Project\\src\\test\\resources\\excel\\Login.xlsx");
	        Workbook workbook = WorkbookFactory.create(file);
	        Sheet sheet = workbook.getSheet("Login");
	        
	        // Create an object array to store the test data
	        Object[][] data = new Object[sheet.getLastRowNum()][2];
	        
	        // Loop through the rows and columns in the Excel sheet to extract the test data
	        for (int i = 0; i < sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i + 1);
	            Cell usernameCell = row.getCell(0);
	            Cell passwordCell = row.getCell(1);
	            data[i][0] = usernameCell.getStringCellValue();
	            data[i][1] = passwordCell.getStringCellValue();
	        }
	        workbook.close();
	        return data;
	    }

	    
	    
	    @BeforeTest
		public void setUp() {
			initialization();
			
		}	
	    @Test(dataProvider = "testData")
	    public void testLogin(String username, String password) {
	       
	        WebElement usernameField = driver.findElement(By.id("login_email"));
	        WebElement passwordField = driver.findElement(By.id("login_password"));
	        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();

	        // Add your assertion here to verify the login was successful or not

	        driver.quit();
	    }
	}




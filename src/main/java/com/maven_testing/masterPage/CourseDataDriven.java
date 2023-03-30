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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.maven_testing.base.Base;

public class CourseDataDriven  extends Base {
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	    @FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Programs']")
		WebElement programbtn;
		
		@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[2]/button[2]/span")
		WebElement addProgramBtn;
		
		
		@FindBy(xpath="//div[@id='page-Programs']//div[contains(@class,'row form-section card-section visible-section')]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
		WebElement addProgramGradeDd;
		
		@FindBy(xpath="//div[@data-fieldname='department']//div[@class='form-group']//input[@role='combobox']")
		WebElement addDeptText;
		
		@FindBy(xpath="//div[@data-fieldname='programs_name']//input[@type='text']")
		WebElement addProgramNameText;
		
		@FindBy(xpath="//div[contains(@data-fieldname,'programs_abbreviation')]//input[contains(@type,'text')]")
		WebElement addProgramAbbText;
		
		@FindBy(xpath="//select[@class='input-with-feedback form-control ellipsis bold']")
		WebElement addProgramDurationText;
		
		@FindBy(xpath="//input[@data-fieldtype='Int']")
		WebElement addProgramSemesterText;		
		
		@FindBy(xpath="//div[@id='page-Programs']//button[contains(@data-label,'Save')]")
		WebElement saveBtn;
		

	    @DataProvider(name = "testData")
	    public Object[][] getData() throws IOException {
	        // Define the Excel file path and sheet name
	        FileInputStream file = new FileInputStream("D:\\Selenium Workspace\\Maven_Testng_Project\\src\\test\\resources\\excel\\Programs.xlsx");
	        Workbook workbook = WorkbookFactory.create(file);
	        Sheet sheet = workbook.getSheet("Programs");
	        
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
	        System.out.println("excel data-->" + data);
	        return data;
	    }

	    
	    
	    @BeforeTest
		public void setUp() {
			initialization();
			
		}
	    
	  //Initializing the Page Objects:
		public CourseDataDriven() {
			PageFactory.initElements(driver, this);
		}

		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}
		
		
		@Test(priority=1)
		public void loginMethod() throws InterruptedException {
			login(prop.getProperty("userName"), prop.getProperty("password"));
			
		}
		@Test(priority=2)
		public void clickCourse() throws InterruptedException {
			programbtn.click();
			Thread.sleep(500); 
		}
		@Test(priority = 2,dataProvider = "testData")
		public void addCourse(String programGrade, String programName,String programAbb, String programDuration, String semester) throws InterruptedException {
			addProgramBtn.click();
			Thread.sleep(500);
			addProgramGradeDd.sendKeys(programGrade);
			addProgramNameText.clear();
			addProgramNameText.sendKeys(programName);	
			Thread.sleep(500);
			addProgramAbbText.clear();
			addProgramAbbText.sendKeys(programAbb);
			Thread.sleep(500);
			addProgramDurationText.sendKeys(programDuration);
			Thread.sleep(500);
			addProgramSemesterText.clear();
			addProgramSemesterText.sendKeys(semester);
			Thread.sleep(1500);
			saveBtn.click();
		}
		
		
//		
//	    @Test(dataProvider = "testData")
//	    public void testLogin(String username, String password) {
//	       
//	        WebElement usernameField = driver.findElement(By.id("login_email"));
//	        WebElement passwordField = driver.findElement(By.id("login_password"));
//	        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//
//	        usernameField.sendKeys(username);
//	        passwordField.sendKeys(password);
//	        loginButton.click();
//
//	        // Add your assertion here to verify the login was successful or not
//
//	        driver.quit();
//	    }
	}




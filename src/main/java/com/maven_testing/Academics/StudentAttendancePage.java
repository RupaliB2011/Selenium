package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;


public class StudentAttendancePage extends Base {
	
	// Defining the WebElements and xpath
	
			@FindBy(id = "login_email")
			WebElement userName;

			@FindBy(id = "login_password")
			WebElement password;
			
			@FindBy(xpath= "//button[normalize-space()='Login']")
			WebElement loginBtn;
			
			@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
			WebElement menuBtn;
			
			@FindBy(xpath = "//span[normalize-space()='Student Attendance']")
			WebElement studentAttendanceBtn;

			@FindBy(xpath = "//span[@data-label='Add%20Student%20Attendance']")
			WebElement addStudentAttendanceBtn;

			@FindBy(xpath = "//div[@data-fieldname='attendance_for']//div[@class='form-group']//select[@type='text']")
			WebElement attendanceForTxt;

			@FindBy(xpath = "//div[@data-fieldname='student']//div[@class='form-group']//input[@role='combobox']")
			WebElement studentTxt;

			@FindBy(xpath = "//div[@data-fieldname='course']//input[@role='combobox']")
			WebElement courseTxt;

			@FindBy(xpath = "//div[@data-fieldname='course_schedule']//input[@role='combobox']")
			WebElement courseScheduleTxt;

			@FindBy(xpath = "//div[@data-fieldname='student_group']//div[@class='form-group']//input[@role='combobox']")
			WebElement studentGroupTxt;

			@FindBy(xpath = "//input[@data-fieldtype='Date']")
			WebElement dateTxt;

			@FindBy(xpath = "//div[@data-fieldname='status']//div[@class='form-group']//select[@type='text']")
			WebElement statusTxt;

			@FindBy(xpath = "//div[@data-fieldname='schedule_type']//input[@role='combobox']")
			WebElement scheduleTypeTxt;

			@FindBy(xpath = "//div[@data-fieldname='exam__declaration']//input[@role='combobox']")
			WebElement examDeclarationTxt;

			@FindBy(xpath = "//div[@data-fieldname='paper_code']//input[@type='text']")
			WebElement paperCodeTxt;
			
			@FindBy(xpath = "//button[@data-label='Save']//span[@class='alt-underline'][normalize-space()='a']")
			WebElement saveBtn;
			
			@FindBy(xpath = "//button[@data-label='Submit']")
			WebElement submitBtn;
			
			@FindBy(xpath = "//button[normalize-space()='Yes']")
			WebElement yesBtn;
			
		//Initializing the Page Objects:
			public StudentAttendancePage() {
				PageFactory.initElements(driver, this);
			}
	
		//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
	
			public void getStudentAttendance() throws InterruptedException {
				menuBtn.click();
				studentAttendanceBtn.click();
				addStudentAttendanceBtn.click();
			}
		
			public void addStudentAttendance() throws InterruptedException {
				attendanceForTxt.sendKeys("Day Scholar");
				attendanceForTxt.sendKeys(Keys.ENTER);

				studentTxt.sendKeys("EDU-STU-2021-00003");
				studentTxt.sendKeys(Keys.ENTER);

				courseTxt.sendKeys("CRS-01397");
				courseTxt.sendKeys(Keys.ENTER);

				courseScheduleTxt.sendKeys("None");
				courseScheduleTxt.sendKeys(Keys.ENTER);

				studentGroupTxt.sendKeys("");
				studentGroupTxt.sendKeys(Keys.ENTER);

				dateTxt.sendKeys("01/03/2021");
				dateTxt.sendKeys(Keys.ENTER);

				statusTxt.sendKeys("None");
				statusTxt.sendKeys(Keys.ENTER);

				scheduleTypeTxt.sendKeys("None");
				scheduleTypeTxt.sendKeys(Keys.ENTER);

				examDeclarationTxt.sendKeys("EX-DEC-00095");
				examDeclarationTxt.sendKeys(Keys.ENTER);

				paperCodeTxt.sendKeys("None");
				examDeclarationTxt.sendKeys(Keys.ENTER);

				saveBtn.click();
				
				submitBtn.click();
				Thread.sleep(500);
				
				yesBtn.click();
				
			}
			}
			
			
			
			
			
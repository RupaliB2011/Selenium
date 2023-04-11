package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;


public class CourseSchedulingToolPage extends Base {
	
	// Defining the WebElements and xpath
	
		@FindBy(id = "login_email")
		WebElement userName;

		@FindBy(id = "login_password")
		WebElement password;

		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
		WebElement menuBtn;
		
		@FindBy(xpath = "//span[normalize-space()='Course Scheduling Tool']")
		WebElement courseSchedulingToolBtn;

		@FindBy(xpath = "//div[@data-fieldname='student_group']//input[@role='combobox']")
		WebElement studentGroupTxt;

		@FindBy(xpath = "//div[@data-fieldname='course']//div[@class='form-group']//input[@role='combobox']")
		WebElement courseTxt;

		@FindBy(xpath = "//div[@data-fieldname='instructor']//input[@role='combobox']")
		WebElement instructorTxt;

		@FindBy(xpath = "//div[@class='modal fade show']//button[@type='button'][normalize-space()='No']")
		WebElement noBtn;
		
		@FindBy(xpath = "//div[@data-fieldname='room']//input[@role='combobox']")
		WebElement roomTxt;

		@FindBy(xpath = "//input[@data-fieldname='from_time']")
		WebElement fromTimeTxt;

		@FindBy(xpath = "//input[@data-fieldname='to_time']")
		WebElement toTimeTxt;

		@FindBy(xpath = "//input[@data-fieldname='course_start_date']")
		WebElement courseStartDateTxt;

		@FindBy(xpath = "//input[@data-fieldname='course_end_date']")
		WebElement courseEndDateTxt;

		@FindBy(xpath = "//select[@type='text']")
		WebElement dayTxt;

		@FindBy(xpath = "//button[@data-label='Schedule%20Course']")
		WebElement scheduleCourseBtn;
		
	//Initializing the Page Objects:
		public CourseSchedulingToolPage() {
			PageFactory.initElements(driver, this);
		}

	//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}

		public void getCourseSchedulingTool() throws InterruptedException {
			menuBtn.click();
			courseSchedulingToolBtn.click();
			Thread.sleep(500);	

		}
	
		public void scheduleCourse() throws InterruptedException {
			studentGroupTxt.sendKeys("Anthropology Semester I");
			studentGroupTxt.sendKeys(Keys.ENTER);

			courseTxt.sendKeys("CRS-01397");
			courseTxt.sendKeys(Keys.ENTER);
			Thread.sleep(500);

//			instructorTxt.sendKeys("Manoranjan Mohapatra");
//			instructorTxt.sendKeys(Keys.ENTER);
//			
//			noBtn.click();

			roomTxt.sendKeys("HTL-ROOM-2021-00034");
			roomTxt.sendKeys(Keys.ENTER);

			fromTimeTxt.sendKeys("11:00:00");
			fromTimeTxt.sendKeys(Keys.ENTER);

			toTimeTxt.sendKeys("12:00:00");
			toTimeTxt.sendKeys(Keys.ENTER);

			courseStartDateTxt.sendKeys("01/04/2023");
			courseStartDateTxt.sendKeys(Keys.ENTER);

			courseEndDateTxt.sendKeys("31/08/2023");
			courseEndDateTxt.sendKeys(Keys.ENTER);

			dayTxt.sendKeys("Monday");
			Thread.sleep(500); 	

			scheduleCourseBtn.click();

		}
		}

				

package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;


public class CourseSchedulePage extends Base {
	
	// Defining the WebElements and xpath
	
			@FindBy(id = "login_email")
			WebElement userName;

			@FindBy(id = "login_password")
			WebElement password;

			@FindBy(xpath= "//button[normalize-space()='Login']")
			WebElement loginBtn;
			
			@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
			WebElement menuBtn;
			
			@FindBy(xpath = "//span[normalize-space()='Course Schedule']")
			WebElement courseScheduleBtn;

			@FindBy(xpath = "//span[@data-label='Add%20Course%20Schedule']")
			WebElement addCourseScheduleBtn;

			@FindBy(xpath = "//div[@id='page-Course Schedule']//div[@class='form-layout']//div[1]//div[1]//div[1]//form[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
			WebElement studentGroupTxt;

			@FindBy(xpath = "//input[@data-fieldname='is_exam_schedule']")
			WebElement isExamScheduleBtn;

			@FindBy(xpath = "//div[@id='page-Course Schedule']//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
			WebElement instructorTxt;
			
			@FindBy(xpath = "//div[contains(@data-fieldname,'additional_instructor')]//button[contains(@class,'btn btn-xs btn-secondary grid-add-row')][normalize-space()='Add Row']")
			WebElement addRowInstructorChildBtn;
			
			@FindBy(xpath = "//div[@class='btn-open-row']")
			WebElement editRowInstructorBtn;

			@FindBy(xpath = "//div[@class='row form-section visible-section']//input[@role='combobox']")
			WebElement childInstructorTxt;

			@FindBy(xpath = "//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
			WebElement collapseRowInstructorBtn;

			@FindBy(xpath = "//div[@data-fieldname='course']//input[@role='combobox']")
			WebElement courseTxt;

			@FindBy(xpath = "//input[contains(@data-fieldname,'schedule_date')]")
			WebElement scheduleDateTxt;

			@FindBy(xpath = "//div[@data-fieldname='room']//input[@role='combobox']")
			WebElement roomTxt;

			@FindBy(xpath = "//input[@data-fieldname='from_time']")
			WebElement fromTimeTxt;

			@FindBy(xpath = "//input[@data-fieldname='to_time']")
			WebElement toTimeTxt;

			@FindBy(xpath = "//div[@data-fieldname='exam_declaration']//input[@role='combobox']")
			WebElement examDeclarationTxt;

			@FindBy(xpath = "//div[@data-fieldname='student_paper_code']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
			WebElement addRowPaperCodeBtn;

			@FindBy(xpath = "//div[@data-fieldname='student']//div[@class='form-group']//input[@role='combobox']")
			WebElement studentTxt;

			@FindBy(xpath = "//div[@data-fieldname='answer_sheet_codes']//div[@class='form-group']//input[@type='text']")
			WebElement answerSheetCodesTxt;

			@FindBy(xpath = "//div[@data-fieldname='disciplinary_action']//div[@class='form-group']//input[@type='text']")
			WebElement disciplinaryActionTxt;
			
			@FindBy(xpath = "//button[@data-label='Save']")
			WebElement saveBtn;

		//Initializing the Page Objects:
			public CourseSchedulePage() {
				PageFactory.initElements(driver, this);
			}
	
		//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
	
			public void getCourseSchedule() throws InterruptedException {
				menuBtn.click();
				Thread.sleep(500);
				courseScheduleBtn.click();
				Thread.sleep(500);
				addCourseScheduleBtn.click();
				Thread.sleep(500);
			}
		
			public void addCourseSchedule() throws InterruptedException {
				
				studentGroupTxt.sendKeys("Data Structures");
				Thread.sleep(500);
				studentGroupTxt.sendKeys(Keys.TAB);

				isExamScheduleBtn.click();
				isExamScheduleBtn.sendKeys(Keys.TAB);

//				instructorTxt.sendKeys("None");
//				instructorTxt.sendKeys(Keys.ENTER);
				instructorTxt.sendKeys(Keys.TAB);
				
				
//				addRowInstructorChildBtn.click();
//				Thread.sleep(500);

//				editRowInstructorBtn.click();
//				Thread.sleep(500);

				childInstructorTxt.sendKeys("Atul Nag");
				childInstructorTxt.sendKeys(Keys.ENTER);

				collapseRowInstructorBtn.click();

//				courseTxt.sendKeys("CRS-01566");
//				courseTxt.sendKeys(Keys.ENTER);
//				Thread.sleep(500);

				scheduleDateTxt.sendKeys("26/03/2023");
				Thread.sleep(500);
				scheduleDateTxt.sendKeys(Keys.TAB);
				
				roomTxt.sendKeys("");
				roomTxt.sendKeys(Keys.ENTER);

				fromTimeTxt.sendKeys("09:00:00");
				fromTimeTxt.sendKeys(Keys.ENTER);
				Thread.sleep(500);

				toTimeTxt.sendKeys("12:00:00");
				toTimeTxt.sendKeys(Keys.ENTER);
				Thread.sleep(500);

				examDeclarationTxt.sendKeys("EX-DEC-00026");
				Thread.sleep(500);
				examDeclarationTxt.sendKeys(Keys.TAB);

				studentTxt.sendKeys("EDU-STU-2021-00200");
				Thread.sleep(500);
				studentTxt.sendKeys(Keys.TAB);

				answerSheetCodesTxt.sendKeys("12345");
				answerSheetCodesTxt.sendKeys(Keys.TAB);

				disciplinaryActionTxt.sendKeys("NA");
				disciplinaryActionTxt.sendKeys(Keys.ENTER);
				disciplinaryActionTxt.sendKeys(Keys.ESCAPE);
				Thread.sleep(500);
				
				saveBtn.click();
				
			}
			}
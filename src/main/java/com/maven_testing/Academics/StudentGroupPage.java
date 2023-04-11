package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class StudentGroupPage extends Base{

// Defining the WebElements and xpath
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
	WebElement menuBtn;
	
	@FindBy(xpath = "//span[normalize-space()='Student Group']")
	WebElement studentGroupBtn;
	
	@FindBy(xpath = "//div[@id='page-List/Student Group/List']//button[@class='btn btn-primary btn-sm primary-action']")
	WebElement addStudentGroupBtn;
	
	@FindBy(xpath = "//div[@data-fieldname='academic_year']//div[@class='form-group']//input[@role='combobox']")
	WebElement academicYearTxt;

	@FindBy(xpath = "//select[contains(@class,'input-with-feedback form-control ellipsis bold')]")
	WebElement groupBasedOnTxt;

	@FindBy(xpath = "//div[@data-fieldname='student_group_name']//input[@type='text']")
	WebElement studentGroupNameTxt;

	@FindBy(xpath = "//div[@data-fieldname='class_room']//input[@role='combobox']")
	WebElement classRoomTxt;

	@FindBy(xpath = "//input[@data-fieldname='max_strength']")
	WebElement maxStrengthTxt;

	@FindBy(xpath = "//div[@data-fieldname='academic_term']//div[@class='form-group']//input[@role='combobox']")
	WebElement academicTermTxt;

	@FindBy(xpath = "//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeTxt;

	@FindBy(xpath = "//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programsTxt;

	@FindBy(xpath = "//div[@data-fieldname='program']//input[@role='combobox']")
	WebElement semesterTxt;

	@FindBy(xpath = "//div[@data-fieldname='course']//div[@class='form-group']//input[@role='combobox']")
	WebElement courseTxt;
	
	@FindBy(xpath = "//div[@data-fieldname='instructors']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
	WebElement addRowBtn;

	@FindBy(xpath = "//div[@data-fieldname='course']//select[@type='text']")
	WebElement instructorCourseTxt;

	@FindBy(xpath = "//div[@data-fieldname='instructor']//select[@type='text']")
	WebElement instructorTxt;

	@FindBy(xpath = "//button[normalize-space()='Add Values']")
	WebElement addValueBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Get Student']")
	WebElement getStudentBtn;

	@FindBy(xpath = "//button[@data-label='Save']//span[@class='alt-underline'][normalize-space()='a']")
	WebElement saveBtn;
	
	
	//Initializing the Page Objects:
			public StudentGroupPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}

			public void getStudentGroup() throws InterruptedException {
				menuBtn.click();
				studentGroupBtn.click();
				addStudentGroupBtn.click();
				Thread.sleep(500);
			}
		
			public void addStudentGroup() throws InterruptedException {
				academicYearTxt.sendKeys("2021-22");
				academicYearTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				groupBasedOnTxt.sendKeys("Course");
				groupBasedOnTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				studentGroupNameTxt.sendKeys("Data Structures 1");
				studentGroupNameTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				classRoomTxt.sendKeys("HTL-ROOM-2021-00036");
				classRoomTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				maxStrengthTxt.sendKeys("0");
				maxStrengthTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				academicTermTxt.sendKeys("2021-22 (SEMESTER 1)");
				academicTermTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				programGradeTxt.sendKeys("Postgraduate (PG)");
				programGradeTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				programsTxt.sendKeys("Computer Science (PG)");
				programsTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				semesterTxt.sendKeys("Master of Science in Computer Science With Specialization in Indigenious Knowledge, Science and Technology Semester I");
				semesterTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				courseTxt.sendKeys("CRS-01497");
				courseTxt.sendKeys(Keys.TAB);
				courseTxt.sendKeys(Keys.TAB);
				Thread.sleep(1500);
				
				addRowBtn.click();
				Thread.sleep(500);

				instructorCourseTxt.sendKeys("CRS-01497");
				instructorCourseTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				instructorTxt.sendKeys("Srinibas Panda");
				instructorTxt.sendKeys(Keys.TAB);
				Thread.sleep(500);

				addValueBtn.click();
				Thread.sleep(500);
				
				saveBtn.click();
				Thread.sleep(500);
				
				getStudentBtn.click();
				Thread.sleep(500);
				
				saveBtn.click();
				Thread.sleep(1500);

			}

}

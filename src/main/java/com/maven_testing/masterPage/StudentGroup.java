package com.maven_testing.masterPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class StudentGroup extends Base{

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
	
	@FindBy(xpath = "//span[@data-label='Add%20Student%20Group']")
	WebElement addStudentGroupBtn;
	
	@FindBy(xpath = "//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement 	academicYearText;
	
	@FindBy(xpath = "//select[@class='input-with-feedback form-control ellipsis bold']")
	WebElement groupBasedonText;
	
	@FindBy(xpath = "//div[@data-fieldname='student_group_name']//input[@type='text']")
	WebElement studentGroupNameTxt;

	@FindBy(xpath = "//div[@data-fieldname='class_room']//input[@role='combobox']")
	WebElement classRoomTxt;

	@FindBy(xpath = "//input[@data-fieldname='max_strength']")
	WebElement maxStrengthTxt;

	@FindBy(xpath = "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermTxt;

	@FindBy(xpath = "//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeTxt;

	@FindBy(xpath = "//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programsTxt;

	@FindBy(xpath = "//div[@data-fieldname='program']//input[@role='combobox']")
	WebElement semesterTxt;

	@FindBy(xpath = "//div[@data-fieldname='batch']//input[@role='combobox']")
	WebElement batchTxt;

	@FindBy(xpath = "//span[normalize-space()='a']")
	WebElement saveBtn;
	
	String barcode="Batch A 2023-24";
	
	
	//Initializing the Page Objects:
			public StudentGroup() {
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
				
				Thread.sleep(500);
			}
		
			public void addStudentGroup() throws InterruptedException {
				addStudentGroupBtn.click();
//				academicYearText.clear();
				academicYearText.sendKeys("2023-24");
				academicYearText.sendKeys(Keys.ENTER);
				
				
////				groupBasedonText.clear();
//				Actions action = new Actions(driver);
//				Select dropdown = new Select(groupBasedonText);
//				dropdown.selectByValue("Batch");
//				action.moveToElement(groupBasedonText).click();
////				groupBasedonText.sendKeys(Keys.ESCAPE);
				
				
				groupBasedonText.sendKeys("Batch");
				groupBasedonText.sendKeys(Keys.TAB);
				
//				
				
				studentGroupNameTxt.sendKeys("Batch A 2023-24");
				studentGroupNameTxt.sendKeys(Keys.ENTER);
				

//				classRoomTxt.sendKeys("HTL-ROOM-2021-00030");
//				classRoomTxt.sendKeys(Keys.ENTER);
//				Thread.sleep(2000);
//
//				maxStrengthTxt.sendKeys("0");
//				maxStrengthTxt.sendKeys(Keys.ENTER);

				academicTermTxt.sendKeys("2023-24 (SEMESER 1)");
				academicTermTxt.sendKeys(Keys.ENTER);

				programGradeTxt.sendKeys("Ph.D");
				programGradeTxt.sendKeys(Keys.ENTER);

				programsTxt.sendKeys("Ph.D Chemistry");
				programsTxt.sendKeys(Keys.ENTER);

				semesterTxt.sendKeys("Phd.Chemistry Semester I");
				semesterTxt.sendKeys(Keys.ENTER);

				batchTxt.sendKeys("Anthropology Semester-I (2022-23)");
				batchTxt.sendKeys(Keys.ENTER);
				saveBtn.click();
//				courseEnrolmentDateText.sendKeys("02-03-2023");
//				courseEnrolmentDateText.sendKeys(Keys.ENTER);
//				Thread.sleep(2000); 
//				saveBtn.click();
//				Thread.sleep(500); 
			}

}

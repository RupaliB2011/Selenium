package com.maven_testing.page.Admission;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class StudentAdmissionPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student Admission']")	
	WebElement studentAdmissionBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Student%20Admission']")
	WebElement addStudentAdmissionBtn;
	
	@FindBy(xpath="//div[@data-fieldname='title']//div[@class='form-group']//input[@type='text']")
	WebElement titleText;	
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;
	
	@FindBy(xpath="//div[@data-fieldname='admission_program']//input[@role='combobox']")
	WebElement admissionPrgmText;
	
	@FindBy(xpath="//div[@data-fieldname='program_abbreviation']//input[@type='text']")
	WebElement programAbbreviationText;
	
	@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//div[@class='form-group']//input[@role='combobox']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
//	@FindBy(xpath="//div[@data-fieldname='academic_term']//div[@class='form-group']//input[@role='combobox']")
	WebElement academicTermText;
	
	@FindBy(xpath="//input[@data-fieldname='total_seats']")
	WebElement seatText;
	
	@FindBy(xpath="//input[@data-fieldname='enrollment_start_date']")
	WebElement enrollmentStartDateText;	
	
	@FindBy(xpath="//input[@data-fieldname='enrollment_end_date']")
	WebElement enrollmentEndDateText;	

	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	//Initializing the Page Objects:
	public StudentAdmissionPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public void login(String un, String pass) throws InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(500); 		
	}
	
	public void clickMenu() throws InterruptedException {
		menuBtn.click();
		Thread.sleep(500); 
	}
	public void clickStudentAdmission() throws InterruptedException {
		studentAdmissionBtn.click();
		Thread.sleep(500);
	}
	
	public void createStudentAdmission() throws InterruptedException {
		addStudentAdmissionBtn.click();
		Thread.sleep(500);
		
		titleText.sendKeys("Master In Anthropology");				
//		titleText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		programGradeText.sendKeys("Postgraduate (PG)");				
		programGradeText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
				
		admissionPrgmText.sendKeys("Anthropology (PG)");				
		admissionPrgmText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		semesterText.sendKeys("Master of Arts in Anthropology With Specialisation in Tribal Legal Studies and Tribal Rights Semester IV");				
		semesterText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		academicYearText.sendKeys("2023-24");				
		academicYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
//		academicTermText.click();
		academicTermText.sendKeys("2023-24 (SEMESER 1)");				
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		seatText.sendKeys("30");				
		Thread.sleep(1000);
		
		enrollmentStartDateText.click();
		enrollmentStartDateText.sendKeys("22-04-2023");
		enrollmentStartDateText.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		
		enrollmentEndDateText.click();
		enrollmentEndDateText.sendKeys("22-06-2023");
		enrollmentEndDateText.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		saveBtn.click();
		Thread.sleep(1000);
		
		
	}

}

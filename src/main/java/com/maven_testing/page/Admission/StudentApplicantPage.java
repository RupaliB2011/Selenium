package com.maven_testing.page.Admission;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class StudentApplicantPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student Application']")	
	WebElement studentApplicationBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Student%20Applicant']")
	WebElement addStudentApplicantBtn;
	
	
	@FindBy(xpath="//div[@data-fieldname='last_institute_attended']//select[@type='text']")
	WebElement instituteText;	
	
	@FindBy(xpath="//div[@data-fieldname='first_name']//input[@type='text']")
	WebElement firstNameText;
	
	@FindBy(xpath="//div[@data-fieldname='last_name']//input[@type='text']")
	WebElement lastNameText;
	
	@FindBy(xpath="//div[@data-fieldname='sub_tribes']//select[@type='text']")
	WebElement subTribeText;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;
	
	@FindBy(xpath="//div[@data-fieldname='department']//input[@role='combobox']")
	WebElement departmentText;
	
	@FindBy(xpath="//div[@class='frappe-control form-group']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
	WebElement addRowBtn;
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programText;
	
	@FindBy(xpath="//div[@class='grid-row grid-row-open']//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement collapseBtn;	
	
	@FindBy(xpath="//input[@data-fieldtype='Date']")
	WebElement dateOfBirthText;	
	
	
	@FindBy(xpath="//div[contains(@data-fieldname,'gender')]//select[contains(@type,'text')]")
	WebElement genderText;	
	
	@FindBy(xpath="//div[contains(@data-fieldname,'language')]//select[contains(@type,'text')]")
	WebElement motherTongueText;	
	
	@FindBy(xpath="//div[contains(@data-fieldname,'student_email_id')]//input[contains(@type,'text')]")
	WebElement emailText;	
	
	@FindBy(xpath="//div[contains(@data-fieldname,'student_mobile_number')]//input[contains(@type,'text')]")
	WebElement mobileNoText;	
	
	@FindBy(xpath="//div[@data-fieldname='adhaar_number']//input[@type='text']")
	WebElement adhaarNoText;	
	
	@FindBy(xpath="//div[@data-fieldname='districts']//input[@role='combobox']")
	WebElement districtText;	
	
	@FindBy(xpath="//div[@data-fieldname='blocks']//input[@role='combobox']")
	WebElement blockText;	
	
	@FindBy(xpath="//div[@data-fieldname='taluka']//input[@type='text']")
	WebElement panchayatText;	
	
	@FindBy(xpath="//div[@title='post_office']//input[@type='text']")
	WebElement postOfficeText;		
	
	@FindBy(xpath="//div[@title='police_station']//input[@type='text']")
	WebElement policeStationText;	
	
	
	@FindBy(xpath="//div[@title='city']//input[@type='text']")
	WebElement villageText;	
	
	@FindBy(xpath="//div[@title='pin_code']//input[@type='text']")
	WebElement pincodeText;	
	
	@FindBy(xpath="//div[@title='fathers_name']//input[@type='text']")
	WebElement fatherNameText;	
	
	
	@FindBy(xpath="//div[@title='mothers_name']//input[@type='text']")
	WebElement motherNameText;	

	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	//Initializing the Page Objects:
	public StudentApplicantPage() {
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
		//studentAdmissionBtn.click();
		Thread.sleep(500);
	}
	
//	public void createStudentAdmission() throws InterruptedException {
//		addStudentAdmissionBtn.click();
//		Thread.sleep(500);
//		
//		titleText.sendKeys("Master In Anthropology");				
////		titleText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
//		programGradeText.sendKeys("Postgraduate (PG)");				
//		programGradeText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
//				
//		admissionPrgmText.sendKeys("Anthropology (PG)");				
//		admissionPrgmText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
//		semesterText.sendKeys("Master of Arts in Anthropology With Specialisation in Tribal Legal Studies and Tribal Rights Semester IV");				
//		semesterText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
//		academicYearText.sendKeys("2023-24");				
//		academicYearText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		
////		academicTermText.click();
//		academicTermText.sendKeys("2023-24 (SEMESER 1)");				
//		academicTermText.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//				
//		seatText.sendKeys("30");				
//		Thread.sleep(1000);
//		
//		enrollmentStartDateText.click();
//		enrollmentStartDateText.sendKeys("22-04-2023");
//		enrollmentStartDateText.sendKeys(Keys.ENTER);
//		Thread.sleep(500);
//		
//		
//		enrollmentEndDateText.click();
//		enrollmentEndDateText.sendKeys("22-06-2023");
//		enrollmentEndDateText.sendKeys(Keys.ENTER);
//		Thread.sleep(500);
//		
//		saveBtn.click();
//		Thread.sleep(1000);
//		
		
	}

}

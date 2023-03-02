package com.maven_testing.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven_testing.base.Base;

public class ExaminationDeclarationPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	// Exam declaration
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Exam And Assessment']")
	WebElement menuExamBtn;
	
	@FindBy(xpath="//span[normalize-space()='Exam Declaration']")
	WebElement examDeclareBtn;
	
	@FindBy(xpath= "//span[contains(@data-label,'Add%20Exam%20Declaration')]")
	WebElement addExamDeclarebtn;
	
	@FindBy(xpath= "//div[@data-fieldname='exam_name']//input[@type='text']")
	WebElement examNameText;	
	
	@FindBy(xpath= "//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;	
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;	
	
	@FindBy(xpath= "//input[@data-fieldname='exam_start_date']")
	WebElement examStartDateText;	
	
	@FindBy(xpath= "//input[@data-fieldname='exam_end_date']")
	WebElement examEndDateText;	
	
	@FindBy(xpath= "//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;	
	
	@FindBy(xpath= "//div[@data-fieldname='exam_program']//input[@role='combobox']")
	WebElement examProgramText;
	
	//Semester child table
	@FindBy(xpath= "//div[@data-fieldname='semesters']//div[@class='btn-open-row']")
	WebElement addSemesterEditBtn;
	
	@FindBy(xpath="//div[@data-fieldname='semester']//div[@class='form-group']//input[@role='combobox']")
	WebElement addSemesterChildText;	
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement childSemesterCollapseBtn;
	
	@FindBy(xpath= "//input[@data-fieldname='examination_date']")
	WebElement addExamDateText;	
	
	@FindBy(xpath= "//input[@data-fieldname='from_time']")
	WebElement addExamFromTimeText;	
	
	@FindBy(xpath="//input[@data-fieldname='To Time']")
	WebElement addExamToTimeText;
	
	// Course child table
	@FindBy(xpath="//button[normalize-space()='Get Courses']")
	WebElement getCourseBtn;
	
//	@FindBy(xpath= "//input[@placeholder='Courses']")
//	WebElement addExamCourseText;	
	
	@FindBy(xpath= "//input[contains(@data-fieldname,'minimum_attendance_criteria')]")
	WebElement addAttendanceCriteriaText;
	
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;	
	
	@FindBy(xpath="//select[@class='input-with-feedback form-control ellipsis bold']")
	WebElement feesStatusText;	

	@FindBy(xpath="//button[@data-label='Save']")
	WebElement btnSave;
	
	
	
	// finalResultDeclaration - FRD
	
	
//	@FindBy(xpath="//span[normalize-space()='Final Result Declaration Tool']")
//	WebElement frdBtn;
//	
//	@FindBy(xpath="//span[contains(@data-label,'Add%20Final%20Result%20Declaration')]")
//	WebElement addfrdBtn;
//	
//	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
//	WebElement programGrade_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
//	WebElement program_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
//	WebElement semester_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='grading_scale']//input[@role='combobox']")
//	WebElement gradingScale_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
//	WebElement academicYear_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
//	WebElement academicTerm_FRDText;
//	
//	
//	@FindBy(xpath="//button[normalize-space()='Get Students']")
//	WebElement getStudent_FRDBtn;
//	
//	
//	@FindBy(xpath="//div[@class='grid-row sortable-chosen']//input[@type='checkbox']")
//	WebElement checkBox_FRD;
//	
//	
//	@FindBy(xpath="//button[@data-label='Save']")
//	WebElement save_FRDBtn;
//	
//	
//	@FindBy(xpath="//div[contains(@class,'form-column col-sm-12')]//form")
//	WebElement doClick;
	
	
	//Initializing the Page Objects:
			public ExaminationDeclarationPage() {
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
				menuExamBtn.click();
				Thread.sleep(500); 
			}
			
			public void clickExam() throws InterruptedException {
				examDeclareBtn.click();
				Thread.sleep(500); 
			}
			public void decalreExam() throws InterruptedException {
				addExamDeclarebtn.click();
				Thread.sleep(500);
				examNameText.sendKeys("Testing");
				academicYearText.sendKeys("2021-22");
				academicTermText.sendKeys("2021-22 (SEMESTER 3)");
				examStartDateText.click();
				Thread.sleep(1000);
				examStartDateText.sendKeys("15-01-2023");
				Thread.sleep(1000);
				examEndDateText.click();
				Thread.sleep(1000);
				examEndDateText.sendKeys("25-01-2023");
				Thread.sleep(1000);				
				programGradeText.sendKeys("Postgraduate (PG)");
				examProgramText.click();
				examProgramText.sendKeys("Chemistry (PG)");
				Thread.sleep(1000);	
				//addExamChildBtn.click();
//				js.executeScript("arguments[0].scrollIntoView();", addExamSemesterText);
				js.executeScript("window.scrollTo(0,612)");
				addSemesterEditBtn.click();
				Thread.sleep(2500);
				addSemesterChildText.sendKeys("Master of Arts in Education With Specialisation in Tribal Heritage and Tribal Indology Semester I");
				Thread.sleep(2500);
				childSemesterCollapseBtn.click();
				Thread.sleep(500);
				getCourseBtn.click();
				Thread.sleep(500);			
				
//				addExamCourseText.sendKeys("CRS-00141");
				addExamDateText.sendKeys("25-01-2023");
				addExamFromTimeText.sendKeys("10:00:00");
				addExamToTimeText.sendKeys("11:00:00");
				addAttendanceCriteriaText.sendKeys("80");
				Thread.sleep(500);
				getStudentBtn.click();
				Thread.sleep(500);
				feesStatusText.sendKeys("Full Paid");
				Thread.sleep(500);
				btnSave.click();
			}
			
			

//			public void finalResultDeclaration() throws InterruptedException {
//				
//				frdBtn.click();
//				Thread.sleep(500);
//				addfrdBtn.click();
//				
//				programGrade_FRDText.click();
//				Thread.sleep(500);
//				programGrade_FRDText.sendKeys("Postgraduate (PG)");
//			
//				program_FRDText.click();
//				Thread.sleep(500);
//				program_FRDText.sendKeys("Physical Education");
//				
//				semester_FRDText.click();
//				Thread.sleep(500);
//				semester_FRDText.sendKeys("Physical Education Semester I");
//				
//				gradingScale_FRDText.click();
//				Thread.sleep(500);
//				gradingScale_FRDText.sendKeys("Examination Grade");
//				
//				academicYear_FRDText.click();
//				Thread.sleep(500);
//				academicYear_FRDText.sendKeys("2023-24");
//				
//				academicTerm_FRDText.sendKeys("2023-24 (SEMESTER-1)");
//				doClick.click();
//				Thread.sleep(1500);
//				
//				getStudent_FRDBtn.click();
//				Thread.sleep(500);
//				
//				checkBox_FRD.click();
//				Thread.sleep(500);
//				save_FRDBtn.click();
//				
//				
//				
//				
//			}
			


}

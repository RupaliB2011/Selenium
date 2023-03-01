package com.maven_testing.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.maven_testing.base.Base;

public class ExaminationPage extends Base{
	
	
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
	
	
	@FindBy(xpath= "//div[@data-fieldname='semesters']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
	WebElement addExamChildBtn;
	
	
	@FindBy(xpath="//div[@class='rows']//div[contains(@class,'col grid-static-col col-xs-10')]")
	WebElement addExamSemesterText;
	
	
	@FindBy(xpath= "//input[@placeholder='Courses']")
	WebElement addExamCourseText;
	
	
	@FindBy(xpath= "//input[@placeholder='Examination Date']")
	WebElement addExamDateText;
	
	
	@FindBy(xpath= "//input[@placeholder='From Time']")
	WebElement addExamFromTimeText;
	
	
	@FindBy(xpath= "//input[@placeholder='To Time']")
	WebElement addExamToTimeText;
	
	
	@FindBy(xpath= "//input[@data-fieldtype='Float']")
	WebElement addAttendanceText;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div/div[3]/div[4]/div[2]/div/form/div[6]/div/div[2]/div[1]/select")
	WebElement feesStatusText;
	
	
	@FindBy(xpath="//button[@data-label='Save']//span[@class='alt-underline'][normalize-space()='a']")
	WebElement btnSave;
	
	// Criteria wise Evaluation tool
	
	@FindBy(xpath="//span[normalize-space()='Criteria Wise Evaluation Tool']")
	WebElement criteriaWiseEvaluationToolBtn;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[contains(@class,'section-body')]//div[1]//form[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addAcademicYearText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[contains(@class,'section-body')]//div[1]//form[1]//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addAcademicTermText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[contains(@class,'form-column col-sm-6')]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addProgramGradeText;
	
	@FindBy(xpath="//div[contains(@class,'col-md-12 layout-main-section-wrapper')]//div[contains(@class,'layout-main-section')]//div//div[2]//form[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addProgramText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[@class='layout-main-section']//div//div[2]//form[1]//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addSemesterText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[@class='layout-main-section']//div//div[2]//form[1]//div[4]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addCourseText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//div[7]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
	WebElement addAssessmentCriteriaText;
	
	@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//button[contains(@data-label,'Save')]")
	WebElement loginBtnx;
	
	@FindBy(xpath="//span[contains(@data-label,'Add%20Criteria%20Wise%20Evaluation')]")
	WebElement addCriteriaWiseEvaluationBtn;
	
	// finalResultDeclaration - FRD
	
	
	@FindBy(xpath="//span[normalize-space()='Final Result Declaration Tool']")
	WebElement frdBtn;
	
	@FindBy(xpath="//span[contains(@data-label,'Add%20Final%20Result%20Declaration')]")
	WebElement addfrdBtn;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGrade_FRDText;
	
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement program_FRDText;
	
	
	@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
	WebElement semester_FRDText;
	
	
	@FindBy(xpath="//div[@data-fieldname='grading_scale']//input[@role='combobox']")
	WebElement gradingScale_FRDText;
	
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYear_FRDText;
	
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTerm_FRDText;
	
	
	@FindBy(xpath="//button[normalize-space()='Get Students']")
	WebElement getStudent_FRDBtn;
	
	
	@FindBy(xpath="//div[@class='grid-row sortable-chosen']//input[@type='checkbox']")
	WebElement checkBox_FRD;
	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement save_FRDBtn;
	
	
	@FindBy(xpath="//div[contains(@class,'form-column col-sm-12')]//form")
	WebElement doClick;
	
	
	//Initializing the Page Objects:
			public ExaminationPage() {
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
				addExamSemesterText.click();
				Thread.sleep(2500);
				addExamSemesterText.sendKeys("Master of Arts in Education With Specialisation in Tribal Heritage and Tribal Indology Semester I");
				Thread.sleep(2500);
				addExamCourseText.sendKeys("CRS-00141");
				addExamDateText.sendKeys("25-01-2023");
				addExamFromTimeText.sendKeys("10:00:00");
				addExamToTimeText.sendKeys("11:00:00");
				addAttendanceText.sendKeys("80");
				feesStatusText.sendKeys("Full Paid");
				btnSave.click();
			}
			
			public void criteriaWiseEvaluationTool() throws InterruptedException {
				criteriaWiseEvaluationToolBtn.click();
				Thread.sleep(500);
				addAcademicYearText.click();
				Thread.sleep(500);
				addAcademicYearText.sendKeys("2023-24");
			
				addAcademicTermText.click();
				Thread.sleep(500);
				addAcademicTermText.sendKeys("2023-24 (SEMESTER-1)");
			
				addProgramGradeText.click();
				Thread.sleep(500);
				addProgramGradeText.sendKeys("Postgraduate (PG)");
			
				addProgramText.click();
				Thread.sleep(500);
				addProgramText.sendKeys("Chemistry (PG)");
				
				addSemesterText.click();
				Thread.sleep(500);
				addSemesterText.sendKeys("Master of Science in Chemistry With Specialization in Indigenious Knowledge, Science and Technology Semester I");
			
				addCourseText.click();				
				Thread.sleep(500);
				addCourseText.sendKeys("CRS-01497");
				Thread.sleep(500);
				
				addAssessmentCriteriaText.click();
				Thread.sleep(500);
				addAssessmentCriteriaText.sendKeys("End Term Exam");
				Thread.sleep(500);
				loginBtn.click();
			}

			public void finalResultDeclaration() throws InterruptedException {
				
				frdBtn.click();
				Thread.sleep(500);
				addfrdBtn.click();
				
				programGrade_FRDText.click();
				Thread.sleep(500);
				programGrade_FRDText.sendKeys("Postgraduate (PG)");
			
				program_FRDText.click();
				Thread.sleep(500);
				program_FRDText.sendKeys("Physical Education");
				
				semester_FRDText.click();
				Thread.sleep(500);
				semester_FRDText.sendKeys("Physical Education Semester I");
				
				gradingScale_FRDText.click();
				Thread.sleep(500);
				gradingScale_FRDText.sendKeys("Examination Grade");
				
				academicYear_FRDText.click();
				Thread.sleep(500);
				academicYear_FRDText.sendKeys("2023-24");
				
				academicTerm_FRDText.sendKeys("2023-24 (SEMESTER-1)");
				doClick.click();
				Thread.sleep(1500);
				
				getStudent_FRDBtn.click();
				Thread.sleep(500);
				
				checkBox_FRD.click();
				Thread.sleep(500);
				save_FRDBtn.click();
				
				
				
				
			}
			


}

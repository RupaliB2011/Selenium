package com.maven_testing.page.Examination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class CriteriaWiseEvaluationToolPage extends Base{
	
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement addAcademicTermText;

	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement addAcademicYearText;

	@FindBy(xpath="//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement addAssessmentCriteriaText;
	
		@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
		WebElement addCourseText;
	
		@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
		WebElement addProgramGradeText;
		
		@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
		WebElement addProgramText;
		
		//		@FindBy(xpath="//input[@data-target='Program']")
		@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
		WebElement addSemesterText;
		
		@FindBy(xpath="//input[contains(@class,'result-earned_marks')]")
		WebElement criteriaWiseEvaluationEarnedmarkText;
		
		@FindBy(xpath="//span[normalize-space()='Criteria Wise Evaluation Tool']")
		WebElement criteriaWiseEvaluationToolBtn;
		
        @FindBy(xpath="//button[@data-label='Submit']")
		WebElement criteriaWiseEvaluationToolSubmitBtn;
		
		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement loginBtn;
		// Criteria wise Evaluation tool	 
		
		@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Exam And Assessment']")
		WebElement menuBtn;
		
//		@FindBy(xpath="//div[@id='page-Course Assessment Result Tool']//button[@data-label='Save']")
//		WebElement criteriaWiseEvaluationToolSaveBtn;
		
//		@FindBy(xpath="//span[contains(@data-label,'Add%20Criteria%20Wise%20Evaluation')]")
//		WebElement addCriteriaWiseEvaluationBtn;		
		
		@FindBy(id = "login_password")
		WebElement password;	
		
		@FindBy(id = "login_email")
		WebElement userName;
		
		
		//Initializing the Page Objects:
		public CriteriaWiseEvaluationToolPage() {
			PageFactory.initElements(driver, this);
		}

		public void clickMenu() throws InterruptedException {
			menuBtn.click();
			Thread.sleep(500); 
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
			criteriaWiseEvaluationEarnedmarkText.sendKeys("23");
			Thread.sleep(500);		
			
			criteriaWiseEvaluationToolSubmitBtn.click();
		}
				
		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}
}

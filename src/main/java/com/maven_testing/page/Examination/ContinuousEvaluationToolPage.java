package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ContinuousEvaluationToolPage extends Base{
	
	
	String actualCEPageText;
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Continuous Evaluation Tool']")
	WebElement continuousEvaluationToolBtn;

	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement addAcademicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement addAcademicTermText;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement addProgramGradeText;
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement addProgramText;
	
	@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
	WebElement addSemesterText;
	
	@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement addCourseText;
	
	@FindBy(xpath="//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement addAssessmentCriteriaText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
		
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement confirmationBtn;			
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement continuousEvaluationConfirmationText;	
	
	String ceText ="Cancel";
	
	//Initializing the Page Objects:
	public ContinuousEvaluationToolPage() {
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
	public void clickContinuousEvaluationTool() throws InterruptedException {
		continuousEvaluationToolBtn.click();
		Thread.sleep(1000); 
	}
	
	public void addContinuousEvaluation() throws InterruptedException {
		
		addAcademicYearText.sendKeys("2023-24");
//		addAcademicYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		addAcademicTermText.sendKeys("2023-24 (SEMESER 1)");
//		addAcademicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
		
		addProgramGradeText.sendKeys("Postgraduate (PG)");
//		addProgramGradeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		addProgramText.sendKeys("Botany (PG)");
		Thread.sleep(500); 
		
		addSemesterText.sendKeys("Master of Science in Botany With Specialization in Comparative Indic Studies and Tribal Science Semester I");
		Thread.sleep(500); 
		
		addCourseText.sendKeys("CRS-01640");
		Thread.sleep(500); 		
		
		addAssessmentCriteriaText.sendKeys("Mid Term Exam");
		Thread.sleep(500); 
		
		submitBtn.click();
		Thread.sleep(500); 
		confirmationBtn.click();				
	}
	
	public void confirmation() throws InterruptedException {
		actualCEPageText = continuousEvaluationConfirmationText.getText();
		System.out.println(actualCEPageText);				
		Assert.assertEquals(actualCEPageText, ceText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}
	


}

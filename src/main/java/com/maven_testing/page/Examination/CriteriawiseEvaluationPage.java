package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class CriteriawiseEvaluationPage extends Base{
	
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;

	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;

	String actualCEPageText;
	
	@FindBy(xpath= "//span[@data-label='Add%20Criteria%20Wise%20Evaluation']")
	WebElement addCriteriawiseEvaluationBtn;
		
	@FindBy(xpath="//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement assessmentCriteriaText;	
	
	String ceText ="Cancel";		
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement confirmationBtn;	
	
	
	@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement courseText;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Criteria Wise Evaluation']")
	WebElement criteriawiseEvaluationBtn;
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement criteriawiseEvaluationConfirmationText;
	
	@FindBy(xpath="//input[@data-fieldname='earned_marks']")
	WebElement earnedMarkText;	
	
	
	@FindBy(xpath="//div[@data-fieldname='exam_declaration']//input[@role='combobox']")
	WebElement examDeclarationText;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	
	@FindBy(id = "login_password")
	WebElement password;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;
	
//	@FindBy(xpath="//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
//	WebElement confirmationBtn;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	@FindBy(id = "login_email")
	WebElement userName;
	
	//Initializing the Page Objects:
	public CriteriawiseEvaluationPage() {
		PageFactory.initElements(driver, this);
	}

	public void addCriteriawiseEvaluation() throws InterruptedException {
		addCriteriawiseEvaluationBtn.click();
		studentText.sendKeys("EDU-STU-2021-00205");
		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		
		academicYearText.sendKeys("2022-23");
		academicYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		academicTermText.sendKeys("2022-23 (SEMESTER 3)");
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		courseText.sendKeys("CRS-01583");
		courseText.sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
		
		assessmentCriteriaText.sendKeys("Mid Term Exam");
		assessmentCriteriaText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		examDeclarationText.sendKeys("EX-DEC-00107");
		examDeclarationText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		programGradeText.sendKeys("Postgraduate (PG)");
		programGradeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		earnedMarkText.sendKeys("46");
		Thread.sleep(500); 
				
		
		saveBtn.click();
		Thread.sleep(500); 
		
		confirmationBtn.click();
				
		
	}
	public void clickCriteriawiseEvaluation() throws InterruptedException {
		criteriawiseEvaluationBtn.click();
		Thread.sleep(1000); 
	}
	public void clickMenu() throws InterruptedException {
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	
	public void confirmation() throws InterruptedException {
		actualCEPageText = criteriawiseEvaluationConfirmationText.getText();
		System.out.println(actualCEPageText);				
		Assert.assertEquals(actualCEPageText, ceText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}
	//Actions:
	public void login(String un, String pass) throws InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(500); 		
	}


}

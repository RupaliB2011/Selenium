package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.maven_testing.base.Base;

public class ContinuousEvaluationPage extends Base{
	
	
	String actualCEPageText;

	@FindBy(xpath= "//span[@data-label='Add%20Continuous%20Evaluation']")
	WebElement addContinuousEvaluationBtn;

	@FindBy(xpath="//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement assessmentCriteriaText;
	
	String ceText ="Cancel";
		
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement confirmationBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Continuous Evaluation']")
	WebElement continuousEvaluationBtn;		
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement continuousEvaluationConfirmationText;	
	
	@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement courseText;
	
	@FindBy(xpath="//div[@data-fieldname='earned_credits']//input[@type='text']")
	WebElement earnedCreditsText;		
	
	@FindBy(xpath="(//button[normalize-space()='Get Assessments'])")
	WebElement getAssessmentBtn;	
	
	@FindBy(xpath="//div[@data-fieldname='grace_marks']//input[@type='text']")
	WebElement graceMarkText;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Exam And Assessment']")
	WebElement menuExamBtn;
	
	@FindBy(id = "login_password")
	WebElement password;
		
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//div[@data-fieldname='total_credits']//input[@type='text']")
	WebElement totalCreditsText;
	
	
	@FindBy(id = "login_email")
	WebElement userName;
	@FindBy(xpath="//div[@data-fieldname='weightage_marks']//input[@type='text']")
	WebElement weightageMarkText;
	
	//Initializing the Page Objects:
	public ContinuousEvaluationPage() {
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
	public void clickContinuousEvaluation() throws InterruptedException {
		continuousEvaluationBtn.click();
		Thread.sleep(1000); 
	}
	
	public void addContinuousEvaluation() throws InterruptedException {
		addContinuousEvaluationBtn.click();
		studentText.sendKeys("EDU-STU-2023-00099");
//		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		courseText.sendKeys("CRS-01646");
//		courseText.sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
		
		assessmentCriteriaText.sendKeys("Mid Term Exam");
//		assessmentCriteriaText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		getAssessmentBtn.click();
		
		graceMarkText.sendKeys("12");
		Thread.sleep(500); 
		
		earnedCreditsText.sendKeys("2");
		Thread.sleep(500); 
		
		totalCreditsText.sendKeys("5");
		Thread.sleep(500); 		
		
		weightageMarkText.sendKeys("46");
		Thread.sleep(500); 
				
		
		saveBtn.click();
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

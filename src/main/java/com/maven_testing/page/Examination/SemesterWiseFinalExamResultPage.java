package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class SemesterWiseFinalExamResultPage extends Base{
	
	
	String actualSWFRPageText;

	@FindBy(xpath= "//span[@data-label='Add%20Final%20Exam%20Result']")
	WebElement addFinalExamResultBtn;

	@FindBy(xpath="//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
	WebElement confirmationBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Final Exam Result']")
	WebElement finalExamResultBtn;
		
	@FindBy(xpath= "//button[normalize-space()='Get Result']")
	WebElement getResultBtn;	
	
	@FindBy(xpath= "//div[@data-fieldname='grading_scale']//input[@role='combobox']")
	WebElement gradingScaleText;
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermTxt;
		
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	
	@FindBy(id = "login_password")
	WebElement password;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath= "//div[@data-fieldname='program']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath= "//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement SWFRConfirmationText;
	
	String swfrText ="Cancel";
	@FindBy(id = "login_email")
	WebElement userName;
	
	//Initializing the Page Objects:
	public SemesterWiseFinalExamResultPage() {
		PageFactory.initElements(driver, this);
	}

	public void addFinalExamResult() throws InterruptedException {
		addFinalExamResultBtn.click();
		
		studentText.sendKeys("EDU-STU-2021-00178");
		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		semesterText.sendKeys("Master of Science in Botany With Specialization in Comparative Indic Studies and Tribal Science Semester I");
//		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		academicTermTxt.sendKeys("2022-23 (SEMESTER 1)");
//		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		gradingScaleText.sendKeys("Examination Grade");
		Thread.sleep(500); 
		
		getResultBtn.click();	
			
		saveBtn.click();
		Thread.sleep(500); 
		submitBtn.click();
		Thread.sleep(500); 
		confirmationBtn.click();
				
		
	}
	public void clickFinalExamResult() throws InterruptedException {
		finalExamResultBtn.click();
		Thread.sleep(1000); 
	}
	public void clickMenu() throws InterruptedException {
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	
	public void confirmation() throws InterruptedException {
		actualSWFRPageText = SWFRConfirmationText.getText();
		System.out.println(actualSWFRPageText);				
		Assert.assertEquals(actualSWFRPageText, swfrText,"Expected and Actual are same");
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

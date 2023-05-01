package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class SemesterWiseResultDeclarationToolPage extends Base{
	
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;

	@FindBy(xpath= "//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;

	String actualSWRDTPageText;
	
	@FindBy(xpath= "//span[@data-label='Add%20Final%20Result%20Declaration']")
	WebElement addFinalResultDeclarationBtn;
		
	@FindBy(xpath= "//button[normalize-space()='Create Exam Assessment Result']")
	WebElement createExamAssessmentResultBtn;	
	
	@FindBy(xpath="//span[normalize-space()='Final Result Declaration Tool']")
	WebElement finalResultDecalarationToolBtn;
	
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;
	
	@FindBy(xpath= "//div[@data-fieldname='grading_scale']//input[@role='combobox']")
	WebElement gradingScaleText;	
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	@FindBy(id = "login_password")
	WebElement password;	
	
	@FindBy(xpath= "//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;	
	
	@FindBy(xpath= "//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programsText;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
		
	@FindBy(xpath= "//div[@data-fieldname='semester']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath="//div[contains(text(),'Successful')]")
	WebElement sWRDTConfirmationText;
	
	
	String sWRDTText ="Successful";
	@FindBy(id = "login_email")
	WebElement userName;
	
	//Initializing the Page Objects:
	public SemesterWiseResultDeclarationToolPage() {
		PageFactory.initElements(driver, this);
	}

	public void addFinalResultDecalaration() throws InterruptedException {
		addFinalResultDeclarationBtn.click();
		
		programGradeText.sendKeys("Postgraduate (PG)");
		programGradeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		programsText.sendKeys("Botany (PG)");
		programsText.sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
		
		semesterText.sendKeys("Master of Science in Botany With Specialization in Comparative Indic Studies and Tribal Science Semester I");
		semesterText.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		
		gradingScaleText.sendKeys("Examination Grade");
		Thread.sleep(500); 
		
		academicYearText.sendKeys("2023-24");
		Thread.sleep(500); 
		
		academicTermText.sendKeys("2023-24 (SEMESER 1)");
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1000); 		
		
		getStudentBtn.click();
		Thread.sleep(500);				
		
		saveBtn.click();
		Thread.sleep(500); 
		createExamAssessmentResultBtn.click();
				
		
	}
	public void clickFinalResultDecalarationTool() throws InterruptedException {
		finalResultDecalarationToolBtn.click();
		Thread.sleep(1000); 
	}
	public void clickMenu() throws InterruptedException {
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	
	public void confirmation() throws InterruptedException {
		actualSWRDTPageText = sWRDTConfirmationText.getText();
		System.out.println(actualSWRDTPageText);				
		Assert.assertEquals(actualSWRDTPageText, sWRDTText,"Expected and Actual are same");
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

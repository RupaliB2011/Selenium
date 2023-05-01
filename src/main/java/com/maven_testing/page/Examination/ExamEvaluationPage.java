package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ExamEvaluationPage extends Base{
	
	
	String actualEEPageText;

	@FindBy(xpath= "//span[contains(@data-label,'Add%20Exam%20Evaluation%20Plan')]")
	WebElement addExamEvaluationBtn;

	//Add Row for Moderator child table
	@FindBy(xpath= "//div[@data-fieldname='moderator_list']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
	WebElement addRowModeratorBtn;
	
	//Add Row for Paper Setter List child table
	@FindBy(xpath= "//div[@data-fieldname='examiners_list']//button[@class='btn btn-xs btn-secondary grid-add-row'][normalize-space()='Add Row']")
	WebElement addRowPaperSetterBtn;
	
	@FindBy(xpath="//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement assessmentCriteriaTxt;	
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement confirmationBtn;	
	
	
	@FindBy(xpath="//div[@class='grid-row grid-row-open']//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement courseTxt;
	
	String eeText ="Cancel";
	
	@FindBy(xpath="//div[@data-fieldname='exam_declaration']//input[@role='combobox']")
	WebElement examDeclarationTxt;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement examEvaluationCollapseBtn;
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement examEvaluationConfirmationText;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Exam Evaluation Plan']")
	WebElement examEvaluationMenuBtn;
	
	
	
	@FindBy(xpath="//div[@data-fieldname='grading_scale']//input[@role='combobox']")
	WebElement gradingScaleTxt;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	//Moderator child table
	@FindBy(xpath= "//div[@data-fieldname='moderator_list']//div[@class='btn-open-row']")
	WebElement moderatorEditBtn;
	
	@FindBy(xpath="//div[@data-fieldname='moderator']//input[@role='combobox']")
	WebElement moderatorNameTxt;
	
	@FindBy(xpath="//input[@data-fieldname='no_of_sets']")
	WebElement paperSetNoTxt;
	
	
	//Paper Setter List child table
	@FindBy(xpath= "//div[@data-fieldname='examiners_list']//div[@class='btn-open-row']")
	WebElement paperSetterEditBtn;
	
	@FindBy(xpath="//div[@data-fieldname='paper_setter']//input[@role='combobox']")
	WebElement paperSetterTxt;
			
	@FindBy(xpath="//div[@data-fieldname='paper_setting_end_date']//input[@role='combobox']")
	WebElement paperSettingEndDateTxt;
	
	@FindBy(xpath="//div[@data-fieldname='paper_setting_start_date']//input[@role='combobox']")
	WebElement paperSettingStartDateTxt;
	
	@FindBy(id = "login_password")
	WebElement password;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@data-fieldname='program']//input[@role='combobox']")
	WebElement semesterTxt;
	
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	@FindBy(id = "login_email")
	WebElement userName;
	

	//Initializing the Page Objects:
	public ExamEvaluationPage() {
		PageFactory.initElements(driver, this);
	}

	public void addExamEvaluation() throws InterruptedException {
		addExamEvaluationBtn.click();
		Thread.sleep(500); 
		
		Actions builder = new Actions(driver);
		examDeclarationTxt.sendKeys("EX-DEC-00081");
		builder.keyDown(Keys.TAB).perform();
//		examDeclarationTxt.sendKeys(Keys.ESCAPE);
//		examDeclarationTxt.sendKeys(Keys.ENTER);
		//Thread.sleep(500); 
		
		
		gradingScaleTxt.sendKeys("Examination Grade");
//		builder.keyDown(Keys.TAB).perform();
//		builder.keyDown(Keys.TAB).perform();
		
		
		//assessmentCriteriaTxt.click();
		assessmentCriteriaTxt.sendKeys("Mid Term Exam");
		//assessmentCriteriaTxt.sendKeys(Keys.TAB);
		//Thread.sleep(500);
		
		semesterTxt.sendKeys("Master of Arts in Geography With Specialisation in Tribal Resource Management Semester II");
//		semesterTxt.sendKeys(Keys.ENTER);
		//Thread.sleep(500);
		

		paperSettingStartDateTxt.sendKeys("27-03-2023");
//		paperSettingStartDateTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);		
		

		paperSettingEndDateTxt.sendKeys("29-03-2023");
//		paperSettingEndDateTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		//Paper setter List action
		addRowPaperSetterBtn.click();
		paperSetterEditBtn.click();
		
		courseTxt.sendKeys("CRS-01721");
//		courseTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		paperSetterTxt.sendKeys("Trupti Mishra");
//		paperSetterTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		paperSetNoTxt.sendKeys("2");
//		paperSetNoTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		examEvaluationCollapseBtn.click();
		
		//Moderator List action
		addRowModeratorBtn.click();		
		moderatorEditBtn.click();
		
		courseTxt.sendKeys("CRS-01721");
//		courseTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		moderatorNameTxt.sendKeys("Trupti Mishra");
//		moderatorNameTxt.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		examEvaluationCollapseBtn.click();
		
		saveBtn.click();
		Thread.sleep(500); 
		submitBtn.click();
		Thread.sleep(500); 
		confirmationBtn.click();
				
	}
	
	public void clickExamEvaluation() throws InterruptedException {
		examEvaluationMenuBtn.click();
		Thread.sleep(500); 
	}
	
	public void clickMenu() throws InterruptedException {
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	
	public void confirmation() throws InterruptedException {
		actualEEPageText = examEvaluationConfirmationText.getText();
		System.out.println(actualEEPageText);				
		Assert.assertEquals(actualEEPageText, eeText,"Expected and Actual are same");
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

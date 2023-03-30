package com.maven_testing.page.Fees;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.maven_testing.base.Base;

public class FeeSchedulePage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fee Schedule']")	
	WebElement feeScheduleBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Fee%20Schedule']")
	WebElement addFeeScheduleBtn;
	
	
	@FindBy(xpath="//div[@data-fieldname='fee_structure']//input[@role='combobox']")
	WebElement feeStructureText;	
	
	@FindBy(xpath="//input[@data-fieldname='due_date']")
	WebElement dueDateText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;
	
	@FindBy(xpath="//div[@class='btn-open-row']")
	WebElement editBtn;	
	
	@FindBy(xpath="//div[@data-fieldname='student_group']//input[@role='combobox']")
	WebElement stdGroupText;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement collapseBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
	WebElement confirmationPopup;
	
	String actualProgramEnrollmentText;
	String peText ="Cancel";
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement fcPageText;
	
	//Initializing the Page Objects:
	public FeeSchedulePage() {
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
	public void clickFeeSchedule() throws InterruptedException {
		feeScheduleBtn.click();
		Thread.sleep(500);
	}
	
	public void createFeeSchedule() throws InterruptedException {
		addFeeScheduleBtn.click();
		Thread.sleep(500);

		feeStructureText.sendKeys("Postgraduate (PG)");				
		feeStructureText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		dueDateText.sendKeys("17-04-2023");				
		dueDateText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
			
		academicYearText.sendKeys("2023-24");				
		academicYearText.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		academicTermText.sendKeys("2023-24 (SEMESER 1)");				
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		editBtn.click();
		Thread.sleep(500);
		
		stdGroupText.sendKeys("Anthropology Semester I");				
		stdGroupText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		collapseBtn.click();
		
		saveBtn.click();
		Thread.sleep(1000);
		submitBtn.click();
		Thread.sleep(1000);
		
		confirmationPopup.click();		
	}

	public void confirmation() throws InterruptedException {
		actualProgramEnrollmentText = fcPageText.getText();
		System.out.println(actualProgramEnrollmentText);				
		Assert.assertEquals(actualProgramEnrollmentText, peText,"Expected and Actual are same");
		System.out.println("Program enrollment completed");
	}

}

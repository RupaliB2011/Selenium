package com.maven_testing.page.Fees;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class FeeStructurePage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fee Structure']")	
	WebElement feeStructureBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Fee%20Structure']")
	WebElement addFeeStructureBtn;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;	
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programText;
	
	@FindBy(xpath="//div[@data-fieldname='program']//div[@class='form-group']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath="//div[contains(@data-fieldname,'fee_type')]//input[contains(@role,'combobox')]")
	WebElement feeTypeText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
//	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	@FindBy(xpath="//div[@data-fieldname='academic_term']//div[@class='form-group']//input[@role='combobox']")
	WebElement academicTermText;
	
	@FindBy(xpath="//div[@class='btn-open-row']")
	WebElement editBtn;	
	
	@FindBy(xpath="//div[@data-fieldname='fees_category']//input[@role='combobox']")
	WebElement feeCategoryText;
	
	@FindBy(xpath="//textarea[@type='text']")
	WebElement feeDescriptionText;
	
	@FindBy(xpath="//input[@data-fieldname='amount']")
	WebElement amountTxt;	
	
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
	public FeeStructurePage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public void login(String un, String pass) throws InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		LoginBtn.click();
		Thread.sleep(500); 		
	}
	
	public void clickMenu() throws InterruptedException {
		menuBtn.click();
		Thread.sleep(500); 
	}
	public void clickFeeStructure() throws InterruptedException {
		feeStructureBtn.click();
		Thread.sleep(500);
	}
	
	public void createFeeStructure() throws InterruptedException {
		addFeeStructureBtn.click();
		Thread.sleep(500);

		programGradeText.sendKeys("Postgraduate (PG)");				
		programGradeText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		programText.sendKeys("Anthropology (PG)");				
		programText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		semesterText.sendKeys("Master of Arts in Anthropology With Specialisation in Tribal Legal Studies and Tribal Rights Semester I");				
		semesterText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		feeTypeText.sendKeys("Admission Fees");				
		feeTypeText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		academicYearText.sendKeys("2023-24");				
		academicYearText.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
//		academicTermText.click();
		academicTermText.sendKeys("2023-24 (SEMESER 1)");				
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		editBtn.click();
		Thread.sleep(500);
		
		feeCategoryText.sendKeys("Fees");				
		feeCategoryText.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		feeDescriptionText.sendKeys("Test Fees");
		feeCategoryText.sendKeys(Keys.TAB);
		Thread.sleep(500);
		
		
		amountTxt.sendKeys("1678");
		amountTxt.sendKeys(Keys.ENTER);
		amountTxt.sendKeys(Keys.ESCAPE);
		Thread.sleep(2500);
		
		
//		collapseBtn.click();
		
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

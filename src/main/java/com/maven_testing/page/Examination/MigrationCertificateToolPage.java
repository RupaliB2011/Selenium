package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class MigrationCertificateToolPage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Migration Certificate Tool']")
	WebElement migrationCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Migration%20Certificate%20Tool']")
	WebElement addMigrationCertificateToolBtn;
	
		
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement addProgramText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement addAcademicTermText;
	
	@FindBy(xpath="//input[@class='input-with-feedback form-control']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_session']//input[@type='text']")
	WebElement academicSessionText;
	
	@FindBy(xpath="//button[@data-fieldname='resistrar_signature']")
	WebElement attachBtn;	
		
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;		
	
	@FindBy(xpath="//button[normalize-space()='Create Migration Certificate']")
	WebElement createMigrationCertificateBtn;	
		
	@FindBy(xpath="//div[contains(text(),'Successful')]")
	WebElement lcConfirmationText;
	
	String mcText ="Successful";
	String actualMCPageText;
	
	
	
	//Initializing the Page Objects:
	public MigrationCertificateToolPage() {
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
	public void clickMigrationCertificateTool() throws InterruptedException {
		migrationCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addMigrationCertificateTool() throws InterruptedException {
		
		addMigrationCertificateToolBtn.click();
		
		addProgramText.sendKeys("Education (PG)");
//		addProgramText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		
		addAcademicTermText.sendKeys("2021-22 (SEMESTER 4)");
//		addAcademicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		
		
		academicYearText.sendKeys("2020-21");
		Thread.sleep(1500);		
		
		academicSessionText.sendKeys("2020-22");
//		academicSessionText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		
//		attachBtn.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
//		attachBtn.sendKeys(Keys.ENTER);
//		Thread.sleep(1500);		
//		
		getStudentBtn.click();
		Thread.sleep(500); 
		
		saveBtn.click();
		Thread.sleep(500); 
		
		createMigrationCertificateBtn.click();
		Thread.sleep(500); 
				
	}	
	public void confirmation() throws InterruptedException {
		actualMCPageText = lcConfirmationText.getText();
		System.out.println(actualMCPageText);				
		Assert.assertEquals(actualMCPageText, mcText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}


}

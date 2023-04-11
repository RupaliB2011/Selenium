package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class MigrationCertificatePage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Migration Certificate']")
	WebElement leavingCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Migration%20Certificate']")
	WebElement addMigrationCertificateBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='acadmic_session']//input[@type='text']")
	WebElement academicSessionText;
	
		
	@FindBy(css=".btn-attach")
	WebElement attachBtn;
	
	@FindBy(css=".mt-2 > .hidden")
	WebElement uploadPic;
	
	@FindBy(css=".btn-modal-primary")
	WebElement uploadBtn;
	
	@FindBy(xpath ="//button[@class='btn btn-modal-close btn-link']")
	WebElement closeBtn;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	
//	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
//	WebElement lcConfirmationText;
//	
//	String lcText ="Cancel";
//	String actualLCPageText;
	
	
	
	//Initializing the Page Objects:
	public MigrationCertificatePage() {
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
	public void clickMigrationCertificate() throws InterruptedException {
		leavingCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addMigrationCertificate() throws InterruptedException {
		
		addMigrationCertificateBtn.click();
		
		studentText.sendKeys("EDU-STU-2022-00250");
		Thread.sleep(1500);
		
		academicYearText.sendKeys("2021-22");
		Thread.sleep(1500);		
		
		academicSessionText.sendKeys("2020-22");
		Thread.sleep(1500);		
		
		attachBtn.click();
	    uploadPic.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
	    uploadBtn.click();
	    
		Thread.sleep(500);		
		closeBtn.click();
				
		saveBtn.click();
		Thread.sleep(500); 
				
	}	
//	public void confirmation() throws InterruptedException {
//		actualLCPageText = lcConfirmationText.getText();
//		System.out.println(actualLCPageText);				
//		Assert.assertEquals(actualLCPageText, lcText,"Expected and Actual are same");
//		System.out.println("Exam Evaluation submitted");
//	}


}

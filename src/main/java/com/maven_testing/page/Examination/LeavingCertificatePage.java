package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class LeavingCertificatePage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Leaving Certificate']")
	WebElement leavingCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Leaving%20Certificate']")
	WebElement addLeavingCertificateBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath= "//div[@data-fieldname='date_of_admission_as_in_the_admission_register']//input[@type='text']")
	WebElement dateOfAdmissionText;	
	
	@FindBy(xpath= "//div[@data-fieldname='date_of_leaving_the_college']//input[@type='text']")
	WebElement dateOfLeavingSchoolText;	
	
	@FindBy(xpath= "//div[@data-fieldname='date']//input[@type='text']")
	WebElement dateText;	
	
	@FindBy(xpath= "//button[@data-fieldname='registrar_signature']")
	WebElement attachBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement lcConfirmationText;
	
	String lcText ="Cancel";
	String actualLCPageText;
	
	
	
	//Initializing the Page Objects:
	public LeavingCertificatePage() {
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
	public void clickLeavingCertificate() throws InterruptedException {
		leavingCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addLeavingCertificate() throws InterruptedException {
		
		addLeavingCertificateBtn.click();
		
		studentText.sendKeys("EDU-STU-2022-00250");
		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		dateOfAdmissionText.sendKeys("26-11-2020");
		dateOfAdmissionText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		dateOfLeavingSchoolText.sendKeys("08-07-2022");
		dateOfLeavingSchoolText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		dateText.sendKeys("08-07-2023");
		dateText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		attachBtn.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
		attachBtn.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		saveBtn.click();
		Thread.sleep(500); 
				
	}	
	public void confirmation() throws InterruptedException {
		actualLCPageText = lcConfirmationText.getText();
		System.out.println(actualLCPageText);				
		Assert.assertEquals(actualLCPageText, lcText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}

}

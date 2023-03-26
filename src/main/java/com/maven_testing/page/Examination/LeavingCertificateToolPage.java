package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class LeavingCertificateToolPage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Leaving Certificate Tool']")
	WebElement leavingCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Leaving%20Certificate%20Tool']")
	WebElement addLeavingCertificateBtn;
	
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programsText;
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@type='text']")
	WebElement academicTermText;	
	
	@FindBy(xpath= "//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;	
	
	@FindBy(xpath= "//div[@data-fieldname='date_of_admission']//input[@type='text']")
	WebElement dateOfAdmissionText;	
	
	@FindBy(xpath= "//div[@data-fieldname='date_of_leaving_the_school']//input[@type='text']")
	WebElement dateOfLeavingSchoolText;	
	
	@FindBy(xpath="//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;
	
	@FindBy(xpath= "//button[@data-fieldname='registrar_signature']")
	WebElement attachBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	@FindBy(xpath="//button[normalize-space()='Create Leaving Certificate']")
	WebElement createLeavingCertificateBtn;	
	
	
	@FindBy(xpath="//div[contains(text(),'Successful')]")
	WebElement lcConfirmationText;
	
	String lcText ="Successful";
	String actualLCPageText;
	
	
	
	//Initializing the Page Objects:
	public LeavingCertificateToolPage() {
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
	public void addLeavingCertificateTool() throws InterruptedException {
		
		addLeavingCertificateBtn.click();
		
		programsText.sendKeys("Anthropology (PG)");
		programsText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		academicTermText.sendKeys("2021-22 (SEMESTER 4)");
		academicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		dateOfAdmissionText.sendKeys("26-11-2020");
		dateOfAdmissionText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		academicYearText.sendKeys("2020-21");
		academicYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);	
		
		
		dateOfLeavingSchoolText.sendKeys("08-07-2023");
		dateOfLeavingSchoolText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);	
		
		attachBtn.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
		attachBtn.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		saveBtn.click();
		Thread.sleep(500); 
		
		
		createLeavingCertificateBtn.click();
		Thread.sleep(500); 
				
	}	
	public void confirmation() throws InterruptedException {
		actualLCPageText = lcConfirmationText.getText();
		System.out.println(actualLCPageText);				
		Assert.assertEquals(actualLCPageText, lcText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}


}

package com.maven_testing.page.Examination;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ConductCertificatePage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
//	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Conduct Certificate']")
	WebElement conductCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Conduct%20Certificate']")
	WebElement addConductCertificateBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='admission_year']//input[@type='text']")
	WebElement admissionYearText;
	
	@FindBy(xpath= "//div[@data-fieldname='leaving_year']//input[@type='text']")
	WebElement leavingYearText;	
	
//	@FindBy(xpath= "//button[@data-fieldname='registrar_signature']")
//	WebElement attachBtn;

//	@FindBy(xpath= "//button[normalize-space()='Upload']")
//	WebElement uploadBtn;

	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;		
	
	@FindBy(xpath="//input[@data-fieldname='date']")
	WebElement lcConfirmationText;

	
	@FindBy(css=".btn-attach")
	WebElement attachBtn;
	
	@FindBy(css=".mt-2 > .hidden")
	WebElement uploadPic;
	
	@FindBy(css=".btn-modal-primary")
	WebElement uploadBtn;
	
	@FindBy(xpath ="//button[@class='btn btn-modal-close btn-link']")
	WebElement closeBtn;
	
	String lcText = getCurrentDateAndIncrement();	
	String actualLCPageText;
	
	public String getCurrentDateAndIncrement() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		String newDate = sdf.format(c.getTime());
		System.out.println("newDate--->"+newDate);
		return newDate;
	}
	
	
	//Initializing the Page Objects:
	public ConductCertificatePage() {
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
	public void clickConductCertificate() throws InterruptedException {
		conductCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addConductCertificate() throws InterruptedException {
		
		addConductCertificateBtn.click();
		
		studentText.sendKeys("EDU-STU-2022-00140");
//		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		academicYearText.sendKeys("2020-21");
//		academicYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		admissionYearText.sendKeys("2020");
//		admissionYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		leavingYearText.sendKeys("2022");
//		leavingYearText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
	    attachBtn.click();
	    uploadPic.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
	    uploadBtn.click();
	    
		Thread.sleep(500);		
		closeBtn.click();
		
		saveBtn.click();
		Thread.sleep(1500); 
				
	}	
	public void confirmation() throws InterruptedException {
		
		actualLCPageText = lcConfirmationText.getText();
		System.out.println(actualLCPageText);				
		Assert.assertEquals(actualLCPageText, lcText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}

}

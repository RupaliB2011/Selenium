package com.maven_testing.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.maven_testing.base.Base;

public class LoginPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	// page 
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Programs']")
	WebElement Programbtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student']")
	WebElement Studentbtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Courses']")
	WebElement Coursebtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Instructor']")
	WebElement Instructorbtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fees']")
	WebElement Feesbtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Program Enrollment']")
	WebElement ProgramEnrollmentbtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Course Enrollment']")
	WebElement CourseEnrollmentbtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Semester']")				
	WebElement Semesterbtn;	

	@FindBy(xpath="//a[@class='navbar-brand navbar-home']")
	WebElement Menubtn;	
	
	@FindBy(xpath="//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement Admissionbtn;
	
	
	
	//Initializing the Page Objects:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}
		public void clickProgram() {
			Programbtn.click();
		}
		
		public void clickStudent() throws InterruptedException {
			Studentbtn.click();
			Thread.sleep(500); 
		}
		
		public void clickCourse() throws InterruptedException {
			Coursebtn.click();
			Thread.sleep(500); 
		}
		public void clickInstructor() throws InterruptedException {
			Instructorbtn.click();
			Thread.sleep(500); 
		}
		public void clickFees() throws InterruptedException {
			Feesbtn.click();
			Thread.sleep(500); 
		}
		public void clickProgramEnrollment() throws InterruptedException {
			ProgramEnrollmentbtn.click();
			Thread.sleep(500); 
		}
		public void clickCourseEnrollment() throws InterruptedException {
			CourseEnrollmentbtn.click();
			Thread.sleep(500); 
		}
		public void clickSemester() throws InterruptedException {
			Semesterbtn.click();
			Thread.sleep(500); 
		}
				
		public void clickMenu() throws InterruptedException {
			Menubtn.click();
			Thread.sleep(500); 
			Admissionbtn.click();
			Thread.sleep(500); 
		}
				
		
}

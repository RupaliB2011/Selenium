package com.maven_testing.page.Admission;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class CourseEnrollmentPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Course Enrollment']")
	WebElement CourseEnrollmentbtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Course%20Enrollment']")
	WebElement addCourseEnrollmentbtn;		
	
	@FindBy(xpath="//div[@data-fieldname='program_enrollment']//input[@role='combobox']")
	WebElement programEnrolementText;	
	
	@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement courseText;
	
	@FindBy(xpath="//input[@data-fieldname='enrollment_date']")
	WebElement courseEnrolmentDateText;
	
	@FindBy(xpath="//div[@id='page-Course Enrollment']//button[@data-label='Save']")
	WebElement saveBtn;
	
	
	
	
	//Initializing the Page Objects:
			public CourseEnrollmentPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			
			public void clickCourseEnrollment() throws InterruptedException {
				CourseEnrollmentbtn.click();
				Thread.sleep(1000); 
			}
			
			public void addCourseEnrollment() throws InterruptedException {
				addCourseEnrollmentbtn.click();
//				programEnrolementText.clear();
				programEnrolementText.sendKeys("EDU-ENR-2023-00283");
				programEnrolementText.sendKeys(Keys.ENTER);
				Thread.sleep(1500); 
//				courseText.clear();
				courseText.sendKeys("CRS-02954");
				courseText.sendKeys(Keys.ENTER);
				Thread.sleep(2000); 
//				courseText.clear();
				courseEnrolmentDateText.sendKeys("02-03-2023");
				courseEnrolmentDateText.sendKeys(Keys.ENTER);
				Thread.sleep(2000); 
				saveBtn.click();
				Thread.sleep(500); 
				
			}

}

package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class StudentAdmitCardPage extends Base{
	
	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student Admit Card']")
	WebElement studentAdmitCardBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Student%20Admit%20Card']")
	WebElement addStudentAdmitCardBtn;
	
	@FindBy(xpath="//div[@data-fieldname='registration_no']//input[@role='combobox']")
	WebElement enrollmentNoText;
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	
	
	//Initializing the Page Objects:
	public StudentAdmitCardPage() {
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
	public void clickStudentAdmitCard() throws InterruptedException {
		studentAdmitCardBtn.click();
		Thread.sleep(1000); 
	}
	public void addStudentAdmitCard() throws InterruptedException {
		
		addStudentAdmitCardBtn.click();
		
		enrollmentNoText.sendKeys("EDU-ENR-2023-00263");
//		enrollmentNoText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		saveBtn.click();
		Thread.sleep(500); 
				
		
	}	
	
	

}

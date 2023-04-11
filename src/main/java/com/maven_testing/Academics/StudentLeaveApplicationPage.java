package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;


public class StudentLeaveApplicationPage extends Base {
	
	// Defining the WebElements and xpath
	
			@FindBy(id = "login_email")
			WebElement userName;

			@FindBy(id = "login_password")
			WebElement password;
			
			@FindBy(xpath= "//button[normalize-space()='Login']")
			WebElement loginBtn;
			
			@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
			WebElement menuBtn;
			
			@FindBy(xpath = "//span[normalize-space()='Student Leave Application']")
			WebElement studentLeaveApplicationBtn;

			@FindBy(xpath = "//span[@data-label='Add%20Student%20Leave%20Application']")
			WebElement addStudentLeaveApplicationBtn;

			@FindBy(xpath = "//div[@data-fieldname='student']//div[@class='form-group']//input[@role='combobox']")
			WebElement studentTxt;

			@FindBy(xpath = "//div[@data-fieldname='from_date']//div[@class='form-group']//input[@type='text']")
			WebElement fromDateTxt;

			@FindBy(xpath = "//input[contains(@data-fieldname,'to_date')]")
			WebElement toDateTxt;

			@FindBy(xpath = "//select[contains(@class,'input-with-feedback form-control ellipsis')]")
			WebElement attendanceBasedOnTxt;

			@FindBy(xpath = "//div[contains(@data-fieldname,'student_group')]//div[contains(@class,'form-group')]//input[contains(@role,'combobox')]")
			WebElement studentGroupTxt;

			@FindBy(xpath = "//textarea[@type='text']")
			WebElement reasonTxt;

			@FindBy(xpath = "//button[@data-label='Save']//span[@class='alt-underline'][normalize-space()='a']")
			WebElement saveBtn;

			@FindBy(xpath = "//button[@data-label='Submit']")
			WebElement submitBtn;

			@FindBy(xpath = "//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
			WebElement yesBtn;
			
		//Initializing the Page Objects:
			public StudentLeaveApplicationPage() {
				PageFactory.initElements(driver, this);
			}
	
		//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
	
			public void getStudentLeaveApplication() throws InterruptedException {
				menuBtn.click();
				studentLeaveApplicationBtn.click();
				Thread.sleep(500);
				addStudentLeaveApplicationBtn.click();
			}
		
			public void addStudentLeaveApplication() throws InterruptedException {
				studentTxt.sendKeys("EDU-STU-2021-00197");
				studentTxt.sendKeys(Keys.ENTER);

				fromDateTxt.sendKeys("23-03-2021");
				fromDateTxt.sendKeys(Keys.ENTER);

				toDateTxt.sendKeys("24-03-2021");
				toDateTxt.sendKeys(Keys.ENTER);

				attendanceBasedOnTxt.sendKeys("Student Group");
				attendanceBasedOnTxt.sendKeys(Keys.ENTER);

				studentGroupTxt.sendKeys("Data Structures");
				studentGroupTxt.sendKeys(Keys.ENTER);

				reasonTxt.sendKeys("xyz");
				Thread.sleep(500);

				saveBtn.click();

				submitBtn.click();
				Thread.sleep(500);

				yesBtn.click();
				
			}
			}
			
			
			
			
			
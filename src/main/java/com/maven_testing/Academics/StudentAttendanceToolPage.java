package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;


public class StudentAttendanceToolPage extends Base {
	
	// Defining the WebElements and xpath
	
			@FindBy(id = "login_email")
			WebElement userName;

			@FindBy(id = "login_password")
			WebElement password;
			
			@FindBy(xpath= "//button[normalize-space()='Login']")
			WebElement loginBtn;
			
			@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
			WebElement menuBtn;
			
			@FindBy(xpath = "//span[normalize-space()='Student Attendance Tool']")
			WebElement studentAttendanceToolBtn;

			@FindBy(xpath = "//div[contains(@class,'col-md-12 layout-main-section-wrapper')]//div[contains(@class,'layout-main-section')]//div//div[2]//div[1]//div[2]//div[1]//select[1]")
			WebElement basedOnTxt;

			@FindBy(xpath = "//div[contains(@data-fieldname,'group_based_on')]//select[contains(@type,'text')]")
			WebElement groupBasedOnTxt;

			@FindBy(xpath = "//div[@id='page-Student Attendance Tool']//div[contains(@class,'section-body')]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
			WebElement studentGroupTxt;

			@FindBy(xpath = "//input[@data-fieldname='date']")
			WebElement dateTxt;

			@FindBy(xpath = "//button[@class='btn btn-default btn-add btn-xs']")
			WebElement checkAllBtn;

			@FindBy(xpath = "//button[@class='btn btn-default btn-primary btn-mark-att btn-xs']")
			WebElement markAttendanceBtn;
			
			@FindBy(xpath = "//button[normalize-space()='Yes']")
			WebElement yesBtn;
			
		//Initializing the Page Objects:
			public StudentAttendanceToolPage() {
				PageFactory.initElements(driver, this);
			}
	
		//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
	
			public void getStudentAttendanceTool() throws InterruptedException {
				menuBtn.click();
				studentAttendanceToolBtn.click();
			}
		
			public void useStudentAttendanceTool() throws InterruptedException {
				basedOnTxt.sendKeys("Student Group");
				basedOnTxt.sendKeys(Keys.ENTER);

				groupBasedOnTxt.sendKeys("Course");
				groupBasedOnTxt.sendKeys(Keys.ENTER);

				studentGroupTxt.sendKeys("Data Structures");
				studentGroupTxt.sendKeys(Keys.ENTER);

				dateTxt.sendKeys("20-03-2022");
				studentGroupTxt.sendKeys(Keys.ENTER);
				Thread.sleep(1500);
				

				checkAllBtn.click();

				markAttendanceBtn.click();

				yesBtn.click();
				
			}
			}
			
			
			
			
			
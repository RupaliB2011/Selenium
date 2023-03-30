package com.maven_testing.page.Admission;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class ProgramEnrollmentPage  extends Base{

	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	// page 
			@FindBy(xpath= "/html/body/div[1]/div/div/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]")
			WebElement Studentbtn;				
					
			@FindBy(xpath="//input[@placeholder='Title']")
			WebElement StudentSearchTitleText;
			
			@FindBy(xpath="//*[@id=\"page-List/Student/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[1]/span[2]/a")
			WebElement StudentTitleText;
			
			@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div/div[2]/div[5]/div[2]/div/div/div[1]/div[1]/div[2]/div/a")
			WebElement ProgramEnrollmentBtn;
			
			
			@FindBy(xpath="//div[contains(@data-fieldname,'programs_abbreviation')]//input[contains(@type,'text')]")
			WebElement AddProgramAbbText;
			
			@FindBy(xpath="//select[@class='input-with-feedback form-control ellipsis bold']")
			WebElement AddProgramDurationText;
			
			@FindBy(xpath="//input[@data-fieldtype='Int']")
			WebElement AddProgramSemesterText;		
			
			@FindBy(xpath="//div[@id='page-Programs']//button[contains(@data-label,'Save')]")
			WebElement saveBtn;
			
			//Initializing the Page Objects:
			public ProgramEnrollmentPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			public void clickStudent() throws InterruptedException {
				Studentbtn.click();
				Thread.sleep(500); 	
			}
			
			public void searchStudent() throws InterruptedException {
			
				StudentSearchTitleText.clear();
				StudentSearchTitleText.sendKeys("TestName");
				StudentSearchTitleText.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				StudentTitleText.click();
			}
			
			public void addingProgram() throws InterruptedException {
				ProgramEnrollmentBtn.click();

			}
			

}

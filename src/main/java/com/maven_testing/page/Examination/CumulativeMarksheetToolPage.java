package com.maven_testing.page.Examination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class CumulativeMarksheetToolPage extends Base{
		
		@FindBy(id = "login_email")
		WebElement userName;
	
		@FindBy(id = "login_password")
		WebElement password;
		
		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
		WebElement menuBtn;		
		
		@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Cumulative Marksheet Tool']")
		WebElement cumulativeMarksheetToolBtn;
		
		@FindBy(xpath= "//span[contains(@data-label,'Add%20Cumulative%20Marksheet%20Tool')]")
		WebElement addCumulativeMarksheetToolBtn;
		
		@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
		WebElement addProgramText;
		
		@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
		WebElement addCurrentAcademicTermText;
		
		@FindBy(xpath="//div[@data-fieldname='branch']//input[@type='text']")
		WebElement addBranchText;
		
		@FindBy(xpath="//div[@data-fieldname='school_of']//input[@type='text']")
		WebElement addSchoolOfText;		
	
		@FindBy(xpath="//div[@data-fieldname='specialization']//input[@type='text']")
		WebElement addSpecializationText;		
	
		@FindBy(xpath="//div[@data-fieldname='year_of_admission']//input[@role='combobox']")
		WebElement addYearOfAdmissionText;		
		
		@FindBy(xpath="//div[@data-fieldname='completed_on']//input[@type='text']")
		WebElement addCompletedOnText;
		
		@FindBy(xpath="//div[@data-fieldname='year_of_completion']//input[@role='combobox']")
		WebElement addYearOfCompletion;
		
		@FindBy(xpath="//button[normalize-space()='Get Students']")
		WebElement getStudentBtn;		
		
        @FindBy(xpath="//button[normalize-space()='Attach']")
		WebElement attachBtn;	
	
        @FindBy(xpath="//button[@data-label='Save']")
    	WebElement saveBtn;
		
		//Initializing the Page Objects:
		public CumulativeMarksheetToolPage() {
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
			menuBtn.click();
			Thread.sleep(500); 
		}
		public void clickCumulativeMarksheetTool() throws InterruptedException {
			cumulativeMarksheetToolBtn.click();
			Thread.sleep(500); 
		}
		public void addCumulativeMarksheetTool() throws InterruptedException {
			addCumulativeMarksheetToolBtn.click();
			Thread.sleep(500);
			
			addProgramText.click();
			Thread.sleep(500);
			
			addCurrentAcademicTermText.sendKeys("2023-24");
		
			addBranchText.sendKeys("2023-24 (SEMESTER-1)");
			Thread.sleep(500);
			
			addSchoolOfText.sendKeys("2023-24 (SEMESTER-1)");
		
			addSpecializationText.sendKeys("Postgraduate (PG)");		
			
			addYearOfAdmissionText.sendKeys("Chemistry (PG)");			
			
			addCompletedOnText.sendKeys("Master of Science in Chemistry With Specialization in Indigenious Knowledge, Science and Technology Semester I");
		
			addYearOfCompletion.sendKeys("CRS-01497");
			Thread.sleep(500);
			
			getStudentBtn.click();
			Thread.sleep(500);
			
			attachBtn.sendKeys("C:");
			Thread.sleep(500);
			
			saveBtn.click();
			Thread.sleep(500);
			
		}
				
		

}

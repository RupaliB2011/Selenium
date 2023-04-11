package com.maven_testing.page.Examination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
        
        @FindBy(xpath="//button[normalize-space()='Create Cumulative Marksheet']")
    	WebElement createCumulativeBtn;
        
        @FindBy(xpath="//div[@class='msgprint']")
    	WebElement cmConfirmationText;        
     
//        String ccToolText ="Successful";
        String cmConfirmMsg="Record Created";
    	String actuaccPageText;
		
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
		
			addBranchText.sendKeys("Botany");
			Thread.sleep(500);
			
			addSchoolOfText.sendKeys("Botany");
			Thread.sleep(500);
		
			addSpecializationText.sendKeys("Postgraduate (PG)");		
			Thread.sleep(500);
			
			addProgramText.sendKeys("Botany (PG)");
			Thread.sleep(1500);
			
			addCurrentAcademicTermText.sendKeys("2023-24 (SEMESER 1)");
			Thread.sleep(1000);
			
			addYearOfAdmissionText.sendKeys("2023-24");			
			Thread.sleep(500);
			
			addCompletedOnText.sendKeys("2024");
			Thread.sleep(500);
		
			addYearOfCompletion.sendKeys("2023-24");
			Thread.sleep(500);
			
			getStudentBtn.click();
			Thread.sleep(500);
			
			saveBtn.click();
			Thread.sleep(500);
			
			createCumulativeBtn.click();
			Thread.sleep(500);
			
			
		}
				
		public void confirmation() throws InterruptedException {
			actuaccPageText = cmConfirmationText.getText();
			System.out.println(actuaccPageText);				
			Assert.assertEquals(actuaccPageText, cmConfirmMsg,"Expected and Actual are same");
			System.out.println("Exam Evaluation submitted");
		}

}

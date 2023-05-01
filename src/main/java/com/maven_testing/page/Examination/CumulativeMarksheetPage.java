package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class CumulativeMarksheetPage extends Base{
	
	
	String actualCMSPageText;
	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[normalize-space()='Cumulative Marksheet']")
	WebElement cumulativeMarksheetBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Cumulative%20Marksheet']")
	WebElement addCumulativeMarksheetBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath="//div[@data-fieldname='branch']//input[@type='text']")
	WebElement branchText;
	
	@FindBy(xpath="//div[@data-fieldname='completed_on']//input[@type='text']")
	WebElement completedOnText;		
	
	@FindBy(xpath="(//div[@data-fieldname='school_of']//input[@type='text']")
	WebElement schoolOfText;
	
	@FindBy(xpath="//div[@data-fieldname='specialization']//input[@type='text']")
	WebElement specializationText;
	
	@FindBy(xpath="//div[@data-fieldname='year_of_admision']//input[@type='text']")
	WebElement yearOfAdmissionText;

	@FindBy(css=".btn-attach")
	WebElement attachBtn;
	
	@FindBy(css=".mt-2 > .hidden")
	WebElement uploadPic;
	
	@FindBy(css=".btn-modal-primary")
	WebElement uploadBtn;
	
	@FindBy(xpath ="//button[@class='btn btn-modal-close btn-link']")
	WebElement closeBtn;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	@FindBy(xpath="//div[@data-fieldname='result_p_f']//input[@type='text']")
	WebElement cumulativeMarksheetConfirmationText;
		
	String cmsText ="PASS";		
	
	//Initializing the Page Objects:
	public CumulativeMarksheetPage() {
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
	public void clickCumulativeMarksheet() throws InterruptedException {
		cumulativeMarksheetBtn.click();
		Thread.sleep(1000); 
	}
	public void addCumulativeMarksheet() throws InterruptedException {
		
		addCumulativeMarksheetBtn.click();
		
		studentText.sendKeys("EDU-STU-2022-00250");
		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		branchText.sendKeys("Arts");
		Thread.sleep(500); 
		
		completedOnText.sendKeys("July-2022");
		Thread.sleep(500); 
		
		schoolOfText.sendKeys("Tribal Legal Studies & Tribal Rights");
		schoolOfText.sendKeys(Keys.ENTER);
		Thread.sleep(500); 
		
		specializationText.sendKeys("Tribal Legal Studies & Tribal Rights");
		Thread.sleep(500); 
		
		yearOfAdmissionText.sendKeys("2020");
		Thread.sleep(500); 		
		
		attachBtn.click();
	    uploadPic.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
	    uploadBtn.click();
	    
		Thread.sleep(500);		
		closeBtn.click();
					
		saveBtn.click();
		Thread.sleep(500); 
				
		
	}	
	
	public void confirmation() throws InterruptedException {
		actualCMSPageText = cumulativeMarksheetConfirmationText.getText();
		System.out.println(actualCMSPageText);				
		Assert.assertEquals(actualCMSPageText, cmsText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}
	


}

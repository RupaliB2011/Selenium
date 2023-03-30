package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ConductCertificateToolPage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Conduct Certificate Tool']")
	WebElement conductCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Conduct%20Certificate%20Tool']")
	WebElement addConductCertificateToolBtn;
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programsText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
	
	@FindBy(xpath="//div[@data-fieldname='admission_year']//input[@type='text']")
	WebElement admissionYearText;	
	
	
	@FindBy(xpath= "//div[@data-fieldname='leaving_year']//input[@type='text']")
	WebElement leavingYearText;	
	
	
	@FindBy(xpath="//input[@data-fieldname='date']")
	WebElement dateText;
	
	@FindBy(xpath= "//button[normalize-space()='Attach']")
	WebElement attachBtn;	
	
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;
	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[normalize-space()='Create Conduct Certificate']")
	WebElement createConductCertificateBtn;
	
	
	@FindBy(xpath="//div[contains(text(),'Successful')]")
	WebElement ccConfirmationText;
	
	String ccToolText ="Successful";
	String actuaccPageText;
	
	
	
	//Initializing the Page Objects:
	public ConductCertificateToolPage() {
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
	public void clickConductCertificateTool() throws InterruptedException {
		conductCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addConductCertificateTool() throws InterruptedException {
		
		addConductCertificateToolBtn.click();
		
		programsText.sendKeys("Psychology (PG)");
//		programsText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		academicTermText.sendKeys("2021-22 (SEMESTER 4)");
//		academicTermText.sendKeys(Keys.ENTER);
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
		
		dateText.sendKeys("25-03-2023");
		dateText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);	
		
		getStudentBtn.click();
		Thread.sleep(500); 
		
//		attachBtn.sendKeys("C:\\Users\\SOUL\\Pictures\\Documenting-Progress.jpg");
//		attachBtn.sendKeys(Keys.ENTER);
//		Thread.sleep(1500);		
		
		saveBtn.click();
		Thread.sleep(500);	
		
		createConductCertificateBtn.click();
		Thread.sleep(500); 
				
	}	
	public void confirmation() throws InterruptedException {
		actuaccPageText = ccConfirmationText.getText();
		System.out.println(actuaccPageText);				
		Assert.assertEquals(actuaccPageText, ccToolText,"Expected and Actual are same");
		System.out.println("Exam Evaluation submitted");
	}

}

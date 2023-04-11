package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ExamApplicationPage extends Base{
	
	
	String actualEAPageText;

	@FindBy(xpath= "//span[contains(@data-label,'Add%20Exam%20Application')]")
	WebElement addExamApplicationBtn;

	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement confirmationBtn;
	
	String eaText ="Cancel";
	
	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
	WebElement examApplicationConfirmationText;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Exam Application']")
	WebElement examApplicationMentBtn;	
	
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement examApplicationStudentTxt;
	
	@FindBy(xpath="//div[@data-fieldname='exam_declaration']//input[@role='combobox']")
	WebElement examDeclarationTxt;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;
	
	
	@FindBy(id = "login_password")
	WebElement password;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	@FindBy(id = "login_email")
	WebElement userName;
	

	//Initializing the Page Objects:
	public ExamApplicationPage() {
		PageFactory.initElements(driver, this);
	}

	public void addExamApplication() throws InterruptedException {
		addExamApplicationBtn.click();
		examApplicationStudentTxt.sendKeys("EDU-STU-2023-00099");
		examApplicationStudentTxt.sendKeys(Keys.ENTER);
		Thread.sleep(1500); 
		examDeclarationTxt.sendKeys("EX-DEC-00117-1");
		examDeclarationTxt.sendKeys(Keys.ENTER);
		Thread.sleep(2000); 		
		saveBtn.click();
		Thread.sleep(500); 
		submitBtn.click();
		Thread.sleep(500); 
		confirmationBtn.click();
				
	}
	
	public void clickExamApplication() throws InterruptedException {
		examApplicationMentBtn.click();
		Thread.sleep(500); 
	}
	
	public void clickMenu() throws InterruptedException {
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	
	public void confirmation() throws InterruptedException {
		actualEAPageText = examApplicationConfirmationText.getText();
		System.out.println(actualEAPageText);				
		Assert.assertEquals(actualEAPageText, eaText,"Expected and Actual are same");
		System.out.println("Exam application submitted");
	}
	//Actions:
	public void login(String un, String pass) throws InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(500); 		
	}
}

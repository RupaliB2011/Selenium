package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.maven_testing.base.Base;

public class ExamPaperSettingPage extends Base{
	
	
	@FindBy(xpath= "//span[contains(@data-label,'Add%20Exam%20Paper%20Setting')]")
	WebElement addExamPaperSettingBtn;

	@FindBy(xpath="//button[@class='btn btn-default btn-sm btn-attach bold']")
	WebElement attachBtn;

	@FindBy(xpath="//div[@data-fieldname='course']//input[@role='combobox']")
	WebElement courseTxt;
	
	@FindBy(xpath="//div[@data-fieldname='assessment_plan']//input[@role='combobox']")
	WebElement examEvaluationPlanTxt;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Exam Paper Setting']")
	WebElement examPaperSettingBtn;	
	
	@FindBy(xpath="//input[@data-fieldname='from_time']")
	WebElement fromTimeTxt;	
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Exam And Assessment']")
	WebElement menuExamBtn;	
	
	@FindBy(id = "login_password")
	WebElement password;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//input[@data-fieldname='schedule_date']")
	WebElement scheduleDateTxt;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//input[@data-fieldname='to_time']")
	WebElement toTimeTxt;
	
	
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	WebElement uploadBtn;
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	
	//Initializing the Page Objects:
		public ExamPaperSettingPage() {
			PageFactory.initElements(driver, this);
		}

		public void addExamPaperSetting() throws InterruptedException {
			addExamPaperSettingBtn.click();
			
			examEvaluationPlanTxt.sendKeys("Botany (PG)");
			examEvaluationPlanTxt.sendKeys(Keys.ENTER);
			Thread.sleep(1500); 
			courseTxt.sendKeys("CRS-01642");
			courseTxt.sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
			scheduleDateTxt.sendKeys("23-03-2023");
			scheduleDateTxt.sendKeys(Keys.ENTER);
			Thread.sleep(1500);
			fromTimeTxt.sendKeys("10:00:00");
			fromTimeTxt.sendKeys(Keys.ENTER);
			Thread.sleep(1500);
			toTimeTxt.sendKeys("12:00:00");
			toTimeTxt.sendKeys(Keys.ENTER);
			Thread.sleep(1500);
			attachBtn.sendKeys("C:\\Users\\SOUL\\Pictures\\images.jpg"); 
			Thread.sleep(1500);
			uploadBtn.click();
			System.out.println("File is Uploaded Successfully");
			saveBtn.click();
			Thread.sleep(500); 
			submitBtn.click();
			Thread.sleep(500); 
//			confirmationBtn.click();
					
		}
		
		public void clickExamApplication() throws InterruptedException {
			examPaperSettingBtn.click();
			Thread.sleep(500); 
		}
		
		public void clickMenu() throws InterruptedException {
			menuExamBtn.click();
			Thread.sleep(500); 
		}
		public void confirmation() throws InterruptedException {
//			actualEAPageText = examApplicationConfirmationText.getText();
//			System.out.println(actualEAPageText);				
//			Assert.assertEquals(actualEAPageText, eaText,"Expected and Actual are same");
//			System.out.println("Exam application submitted");
		}
		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}

}

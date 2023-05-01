package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class CoursePage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Courses']")
	WebElement Coursebtn;	
	
	@FindBy(xpath = "//span[@data-label='Add%20Course']")
	WebElement addCourseBtn;

	@FindBy(xpath = "//div[@data-fieldname='course_name']//div[@class='form-group']//input[@type='text']")
	WebElement courseNameTxt;

	@FindBy(xpath = "//div[@data-fieldname='course_code']//input[@type='text']")
	WebElement courseCodeTxt;

	@FindBy(xpath = "//div[@data-fieldname='mode']//select[@type='text']")
	WebElement modeTxt;
	
	@FindBy(xpath = "//input[@data-fieldname='disable']")
	WebElement disableBtn;

	@FindBy(xpath = "//input[@data-fieldname='lectures']")
	WebElement childLecturesTxt;

	@FindBy(xpath = "//input[@data-fieldname='tutorials']")
	WebElement childTutorialsTxt;

	@FindBy(xpath = "//input[@data-fieldname='practicals']")
	WebElement childPracticalsTxt;

	@FindBy(xpath = "//div[@data-fieldname='total']//div[@class='form-group']//input[@type='text']")
	WebElement childTotalTxt;

	@FindBy(xpath = "//input[@data-fieldname='total_credit']")
	WebElement totalCreditTxt;

	@FindBy(xpath = "//input[@data-fieldname='passing_marks']")
	WebElement passingMarksTxt;

	@FindBy(xpath = "//input[@data-fieldname='total_marks']")
	WebElement totalMarksTxt;

	@FindBy(xpath = "//input[@data-fieldname='passing_credit']")
	WebElement passingCreditTxt;

	@FindBy(xpath = "//div[@data-fieldname='assessment_criteria']//input[@role='combobox']")
	WebElement childAssessmentCriteriaTxt;

	@FindBy(xpath = "//input[@data-fieldtype='Percent']")
	WebElement childWeightageTxt;

	@FindBy(xpath = "//input[@data-fieldname='credits']")
	WebElement childCreditsTxt;

	@FindBy(xpath = "//input[@data-fieldname='passing_credits']")
	WebElement childPassingCreditsTxt;

	@FindBy(xpath = "//div[@id='page-Course']//div[@class='row form-section card-section visible-section']//div[5]//div[1]//div[2]//div[1]//input[1]")
	WebElement childTotalMarksTxt;

	@FindBy(xpath = "//div[@id='page-Course']//div[6]//div[1]//div[2]//div[1]//input[1]")
	WebElement childPassingMarksTxt;

	@FindBy(xpath = "//input[@data-fieldname='year_end_date']")
	WebElement courseExpireDateTxt;

	@FindBy(xpath = "//button[@data-label='Save']")
	WebElement saveBtn;
	
	
	//Initializing the Page Objects:
			public CoursePage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			public void clickCourse() throws InterruptedException {
				Coursebtn.click();
				Thread.sleep(500); 
			}
			
			public void addCourse() throws InterruptedException {
				addCourseBtn.click();

				courseNameTxt.sendKeys("Test Course");
				courseNameTxt.sendKeys(Keys.TAB);

				courseCodeTxt.sendKeys("1234");
				courseCodeTxt.sendKeys(Keys.TAB);

				modeTxt.sendKeys("Theory");
				modeTxt.sendKeys(Keys.TAB);
				
				disableBtn.sendKeys(Keys.TAB);

				childLecturesTxt.sendKeys("12");
				childLecturesTxt.sendKeys(Keys.TAB);

				childTutorialsTxt.sendKeys("4");
				childTutorialsTxt.sendKeys(Keys.TAB);

				childPracticalsTxt.sendKeys("2");
				childPracticalsTxt.sendKeys(Keys.TAB);

				childTotalTxt.sendKeys(Keys.TAB);
				childTotalTxt.sendKeys(Keys.ESCAPE);
				
				totalCreditTxt.sendKeys("18");
				totalCreditTxt.sendKeys(Keys.TAB);
				
				passingMarksTxt.sendKeys("32");
				passingMarksTxt.sendKeys(Keys.TAB);
				
				totalMarksTxt.sendKeys("100");
				totalMarksTxt.sendKeys(Keys.TAB);
				
				passingCreditTxt.sendKeys("9");
				passingCreditTxt.sendKeys(Keys.TAB);
				
				childAssessmentCriteriaTxt.sendKeys("End Term Exam");
				childAssessmentCriteriaTxt.sendKeys(Keys.TAB);
				
				childWeightageTxt.sendKeys("100");
				Thread.sleep(1500);
				childWeightageTxt.sendKeys(Keys.TAB);
				
				childCreditsTxt.sendKeys("18");
				childCreditsTxt.sendKeys(Keys.TAB);
				
				childPassingCreditsTxt.sendKeys("9");
				childPassingCreditsTxt.sendKeys(Keys.TAB);
				
				childTotalMarksTxt.sendKeys(Keys.TAB);
				
				childPassingMarksTxt.sendKeys("32");
				childPassingMarksTxt.sendKeys(Keys.ESCAPE);
				
				courseExpireDateTxt.sendKeys("28-04-2023");
				courseExpireDateTxt.sendKeys(Keys.ENTER);
				Thread.sleep(1500);
				
				
				saveBtn.click();
				
					
				
			}
}

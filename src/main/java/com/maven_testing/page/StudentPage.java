package com.maven_testing.page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.maven_testing.base.Base;

public class StudentPage extends Base{
	
	String actualElementText;
	String InputStudentName ="Accounting Ledger";
	
	String actualProgramEnrollmentText;
	String peText ="Cancel";
	//button[@data-label='Cancel']
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student']")
	WebElement Studentbtn;	
	
	@FindBy(xpath="//span[@data-label='Add%20Student']")
	WebElement AddStudentBtn;
	
	@FindBy(xpath="//div[@data-fieldname='first_name']//input[@type='text']")
	WebElement EnterNameText;
	
	@FindBy(xpath="//div[@data-fieldname='student_email_id']//input[@type='text']")
	WebElement EnterEmailText;
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement StudentSavebtn;	
	
	@FindBy(xpath="//input[@placeholder='Title']")
	WebElement TitleSearchText;
	
	@FindBy(xpath="//*[@id=\"page-List/Student/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[1]/span[2]/a")
	WebElement StudentTitleText;
	
	@FindBy(xpath = "//button[normalize-space()='Accounting Ledger']")
	WebElement studentPageText;
	
	//Program enrollment
	@FindBy(xpath="//button[@data-doctype='Program Enrollment']")
	WebElement programEnrollmentBtn;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;	
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programText;
	
	@FindBy(xpath="//div[@data-fieldname='program']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;
	
	@FindBy(xpath="//div[@id='page-Program Enrollment']//button[@data-label='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement pePageText;
	
	
	@FindBy(xpath = "//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
	WebElement confirmationPopup;
	
	
	
	//Initializing the Page Objects:
			public StudentPage() {
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
			
			public void clickStudent() throws InterruptedException {
				Studentbtn.click();
				Thread.sleep(500); 
			}
			
			public void addStudent() throws InterruptedException {		     
			  	AddStudentBtn.click();
				Thread.sleep(500); 
				EnterNameText.sendKeys("Sangeeta Das");
				Thread.sleep(1000); 
				EnterEmailText.sendKeys("das23@gmail.com");
				Thread.sleep(500);
				StudentSavebtn.click();
				Thread.sleep(500);
				actualElementText = studentPageText.getText();
				System.out.println(actualElementText);				
				Assert.assertEquals(actualElementText, InputStudentName,"Expected and Actual are same");
				System.out.println("Student Created");

			}
	 
			
			public void programEnrollment() throws InterruptedException {				
				programEnrollmentBtn.click();
				Thread.sleep(500);			
				
//				programGradeText.clear();
				programGradeText.sendKeys("Postgraduate (PG)");				
				programGradeText.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				
				programText.sendKeys("Botany (PG)");				
				programText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				semesterText.sendKeys("Master of Science in Botany With Specialization in Comparative Indic Studies and Tribal Science Semester I");				
				semesterText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				academicYearText.sendKeys("2023-24");				
				academicYearText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				academicTermText.sendKeys("2023-24 (SEMESER 1)");				
				academicTermText.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				
				saveBtn.click();
				Thread.sleep(500);
				submitBtn.click();
				Thread.sleep(1000);
				
				confirmationPopup.click();
				
				actualProgramEnrollmentText = pePageText.getText();
				System.out.println(actualProgramEnrollmentText);				
				Assert.assertEquals(actualProgramEnrollmentText, peText,"Expected and Actual are same");
				System.out.println("Program enrollment completed");

			  	
			}
			
			public void searchStudentTitle() throws InterruptedException {
				TitleSearchText.clear();
				TitleSearchText.sendKeys("TestName");
				TitleSearchText.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				StudentTitleText.click();
				
				
			}
}

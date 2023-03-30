package com.maven_testing.page.Admission;


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
	
	
	
	@FindBy(xpath="//div[@data-fieldname='permanant_registration_number']//input[@type='text']")
	WebElement regText;
	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement StudentSavebtn;	
	
	@FindBy(xpath="//input[@placeholder='Title']")
	WebElement TitleSearchText;
	
	@FindBy(xpath="//*[@id=\"page-List/Student/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[1]/span[2]/a")
	WebElement StudentTitleText;
	
	@FindBy(xpath = "//button[normalize-space()='Accounting Ledger']")
	WebElement studentPageText;
	
	//Program enrollment
	@FindBy(xpath="//a[contains(text(),'Program Enrollment')]")
	WebElement programEnrollmentBtn;
	
	@FindBy(xpath="//button[normalize-space()='Create a new Program Enrollment']")
	WebElement addProgramEnrollmentBtn;
	
	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;	
	
	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
	WebElement programText;
	
	@FindBy(xpath="//div[@data-fieldname='program']//div[@class='form-group']//input[@role='combobox']")
	WebElement semesterText;
	
	@FindBy(xpath="//div[@data-fieldname='academic_year']//div[@class='form-group']//input[@role='combobox']")
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
	
	
	@FindBy(xpath = "//div[contains(@class,'modal fade show')]")
	WebElement closeBtn;
	

	
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
				EnterNameText.sendKeys("Neeraj Das");
				Thread.sleep(1000); 
				EnterEmailText.sendKeys("nd@gmail.com");
				Thread.sleep(500);
				regText.sendKeys("1234565");
				Thread.sleep(1000); 
				StudentSavebtn.click();
				Thread.sleep(3000);
//				closeBtn.click();
//				actualElementText = studentPageText.getText();
//				System.out.println(actualElementText);				
//				Assert.assertEquals(actualElementText, InputStudentName,"Expected and Actual are same");
//				System.out.println("Student Created");
//				Thread.sleep(1500);
			}
	 
			
			public void programEnrollment() throws InterruptedException {
				Thread.sleep(1000);
				programEnrollmentBtn.click();
				Thread.sleep(1000);	
				
				addProgramEnrollmentBtn.click();
				Thread.sleep(1000);	
				
				programGradeText.sendKeys("Postgraduate (PG)");				
				programGradeText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				programText.sendKeys("Commerce (PG)");				
				programText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				semesterText.sendKeys("Master of Commerce With Specialisation in Tribal Resource Management Semester I");				
				semesterText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				academicYearText.sendKeys("2023-24");				
				academicYearText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				academicTermText.sendKeys("2023-24 (SEMESER 1)");				
				academicTermText.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				
				saveBtn.click();
				Thread.sleep(1000);
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
				TitleSearchText.sendKeys("Binay Kumar");
				TitleSearchText.sendKeys(Keys.ENTER);
				Thread.sleep(500);
				StudentTitleText.click();
				
				
			}
}

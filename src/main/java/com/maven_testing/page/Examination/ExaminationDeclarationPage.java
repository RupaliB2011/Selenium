package com.maven_testing.page.Examination;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.maven_testing.base.Base;
import com.maven_testing.utility.Utility;

public class ExaminationDeclarationPage extends Base {
	
	@FindBy(xpath= "//div[@data-fieldname='academic_term']//input[@role='combobox']")
	WebElement academicTermText;	
	
	@FindBy(xpath= "//div[@data-fieldname='academic_year']//input[@role='combobox']")
	WebElement academicYearText;

	@FindBy(xpath= "//input[contains(@data-fieldname,'minimum_attendance_criteria')]")
	WebElement addAttendanceCriteriaText;

	@FindBy(xpath= "//input[@data-fieldname='examination_date']")
	WebElement addExamDateText;
	
	@FindBy(xpath= "//span[contains(@data-label,'Add%20Exam%20Declaration')]")
	WebElement addExamDeclarebtn;
	
	@FindBy(xpath= "//input[@data-fieldname='from_time']")
	WebElement addExamFromTimeText;
	
	@FindBy(xpath="//input[@data-fieldname='To Time']")
	WebElement addExamToTimeText;
	
	@FindBy(xpath="//div[@data-fieldname='semester']//div[@class='form-group']//input[@role='combobox']")
	WebElement addSemesterChildText;	
	
	//Semester child table
	@FindBy(xpath= "//div[@data-fieldname='semesters']//div[@class='btn-open-row']")
	WebElement addSemesterEditBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement btnSave;	
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement childSemesterCollapseBtn;	
	
	@FindBy(xpath="//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']")
	WebElement confirmationBtn;	
	
	@FindBy(xpath="//label[normalize-space()='Courses Offered']/following-sibling::div[2]/div[2]/div[1]/div")
	List<WebElement> coursesList;	
	
	@FindBy(xpath="//span[normalize-space()='Exam Declaration']")
	WebElement examDeclareBtn;
	
	@FindBy(xpath= "//input[@data-fieldname='exam_end_date']")
	WebElement examEndDateText;
	
	@FindBy(xpath= "//input[contains(@data-fieldname,'exam_fees_applicable')]")
	WebElement examFeesapplicableText;	
	
	@FindBy(xpath= "//div[@data-fieldname='exam_name']//input[@type='text']")
	WebElement examNameText;
	
	@FindBy(xpath= "//div[@data-fieldname='exam_program']//input[@role='combobox']")
	WebElement examProgramText;	
	
	@FindBy(xpath= "//input[@data-fieldname='exam_start_date']")
	WebElement examStartDateText;	
	
	@FindBy(xpath="//select[@class='input-with-feedback form-control ellipsis bold']")
	WebElement feesStatusText;
	
	// Course child table
	@FindBy(xpath="//button[normalize-space()='Get Courses']")
	WebElement getCourseBtn;
	
//	@FindBy(xpath= "//input[@placeholder='Courses']")
//	WebElement addExamCourseText;	
	
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;
	
	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	// Exam declaration
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Exam And Assessment']")
	WebElement menuExamBtn;	

	@FindBy(id = "login_password")
	WebElement password;
	
	
	@FindBy(xpath= "//div[@data-fieldname='program_grade']//input[@role='combobox']")
	WebElement programGradeText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	//div[@class='modal fade show']//button[@type='button'][normalize-space()='Yes']
	
	Utility utils = new Utility();
	
	
	
	
	// finalResultDeclaration - FRD
	
	
//	@FindBy(xpath="//span[normalize-space()='Final Result Declaration Tool']")
//	WebElement frdBtn;
//	
//	@FindBy(xpath="//span[contains(@data-label,'Add%20Final%20Result%20Declaration')]")
//	WebElement addfrdBtn;
//	
//	@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
//	WebElement programGrade_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='programs']//input[@role='combobox']")
//	WebElement program_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='semester']//input[@role='combobox']")
//	WebElement semester_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='grading_scale']//input[@role='combobox']")
//	WebElement gradingScale_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='academic_year']//input[@role='combobox']")
//	WebElement academicYear_FRDText;
//	
//	
//	@FindBy(xpath="//div[@data-fieldname='academic_term']//input[@role='combobox']")
//	WebElement academicTerm_FRDText;
//	
//	
//	@FindBy(xpath="//button[normalize-space()='Get Students']")
//	WebElement getStudent_FRDBtn;
//	
//	
//	@FindBy(xpath="//div[@class='grid-row sortable-chosen']//input[@type='checkbox']")
//	WebElement checkBox_FRD;
//	
//	
//	@FindBy(xpath="//button[@data-label='Save']")
//	WebElement save_FRDBtn;
//	
//	
//	@FindBy(xpath="//div[contains(@class,'form-column col-sm-12')]//form")
//	WebElement doClick;
	
	
	//Initializing the Page Objects:
			public ExaminationDeclarationPage() {
				PageFactory.initElements(driver, this);
			}

			public void addExamDateAndTime() throws InterruptedException {
				int courseCount = coursesList.size();
				System.out.println("courseCount = " + courseCount);
				//String date = utils.getCurrentDate();
				String date = utils.getCurrentDateAndIncrement(5);
				
				for (int i=1; i<=courseCount; i++) {
					//WebElement ele = driver.findElement(By.xpath("//label[normalize-space()='Courses Offered']/following-sibling::div[" + i + "]/div[2]/div[1]/div"));
					//WebElement courseCode = driver.findElement(By.xpath("(//label[normalize-space()='Courses Offered']/following-sibling::div[" + i + "]/div[2]/div[1]/div/div/div[2]/div[2]/a)[" + i + "]"));
					
					String courses = driver.findElement(By.xpath("(//div[@title='Courses']/../../../following-sibling::div/div/div/div/div[2]/div[2]/a)[" + i + "]")).getText();
					
					//WebElement courseEditButton = driver.findElement(By.xpath("//a[normalize-space()='" + courses + "']/../../following-sibling::div[8]/div/a"));
					
					WebElement examDate = driver.findElement(By.xpath("//a[normalize-space()='" + courses + "']/../../following-sibling::div[@data-fieldname='examination_date']"));
					examDate.click();
					Thread.sleep(1000);
					
					WebElement examDateInput = driver.findElement(By.xpath("//a[normalize-space()='" + courses + "']/../../following-sibling::div[@data-fieldname='examination_date']/div/div/input"));
					WebElement fromTimeInput = driver.findElement(By.xpath("//a[normalize-space()='" + courses + "']/../../following-sibling::div[@data-fieldname='from_time']/div/div/input"));
					WebElement toTimeInput = driver.findElement(By.xpath("//a[normalize-space()='" + courses + "']/../../following-sibling::div[@data-fieldname='to_time']/div/div/input"));
					
					examDateInput.sendKeys(date);
					examDateInput.sendKeys(Keys.TAB);
					
					fromTimeInput.click();
					fromTimeInput.sendKeys(utils.getPropValue("fromTime"));
					Thread.sleep(1000);
					fromTimeInput.sendKeys(Keys.TAB);
					
					toTimeInput.click();
					toTimeInput.sendKeys(utils.getPropValue("toTime"));
					Thread.sleep(1000);
					if(i==courseCount) {
						examDateInput.sendKeys(Keys.TAB);
					}
					
				}
				
			}
			
			public void clickExam() throws InterruptedException {
				examDeclareBtn.click();
				Thread.sleep(500); 
			}
			
			public void clickMenu() throws InterruptedException {
				menuExamBtn.click();
				Thread.sleep(500); 
			}
			public void decalreExam() throws InterruptedException {
				addExamDeclarebtn.click();
				Thread.sleep(500);
				examNameText.sendKeys("Testing");
				academicYearText.sendKeys("2021-22");
				academicTermText.sendKeys("2021-22 (SEMESTER 3)");
				examStartDateText.click();
				Thread.sleep(1000);
				examStartDateText.sendKeys("27-03-2023");
				Thread.sleep(1000);
				examEndDateText.click();
				Thread.sleep(1000);
				examEndDateText.sendKeys("31-03-2023");
				Thread.sleep(1000);				
				programGradeText.sendKeys("Postgraduate (PG)");
				examProgramText.click();
				examProgramText.sendKeys("Chemistry (PG)");
				Thread.sleep(1000);	
				//addExamChildBtn.click();
//				js.executeScript("arguments[0].scrollIntoView();", addExamSemesterText);
				js.executeScript("window.scrollTo(0,612)");
				addSemesterEditBtn.click();
				Thread.sleep(2500);
				addSemesterChildText.sendKeys("Master of Science in Chemistry With Specialization in Indigenious Knowledge, Science and Technology Semester I");
				Thread.sleep(2500);
				childSemesterCollapseBtn.click();
				Thread.sleep(500);
				getCourseBtn.click();
				Thread.sleep(500);				
				addExamDateAndTime();
				Thread.sleep(1000);
				addAttendanceCriteriaText.sendKeys("80");
				Thread.sleep(1000);				
				feesStatusText.sendKeys("Full Paid");
				Thread.sleep(1000);
//				examFeesapplicableText.sendKeys("NO");
//				Thread.sleep(1000);
				getStudentBtn.click();
				Thread.sleep(1500);
				btnSave.click();
				Thread.sleep(500);
				submitBtn.click();
				confirmationBtn.click();
			}
			
			
			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			
			

//			public void finalResultDeclaration() throws InterruptedException {
//				
//				frdBtn.click();
//				Thread.sleep(500);
//				addfrdBtn.click();
//				
//				programGrade_FRDText.click();
//				Thread.sleep(500);
//				programGrade_FRDText.sendKeys("Postgraduate (PG)");
//			
//				program_FRDText.click();
//				Thread.sleep(500);
//				program_FRDText.sendKeys("Physical Education");
//				
//				semester_FRDText.click();
//				Thread.sleep(500);
//				semester_FRDText.sendKeys("Physical Education Semester I");
//				
//				gradingScale_FRDText.click();
//				Thread.sleep(500);
//				gradingScale_FRDText.sendKeys("Examination Grade");
//				
//				academicYear_FRDText.click();
//				Thread.sleep(500);
//				academicYear_FRDText.sendKeys("2023-24");
//				
//				academicTerm_FRDText.sendKeys("2023-24 (SEMESTER-1)");
//				doClick.click();
//				Thread.sleep(1500);
//				
//				getStudent_FRDBtn.click();
//				Thread.sleep(500);
//				
//				checkBox_FRD.click();
//				Thread.sleep(500);
//				save_FRDBtn.click();
//				
//				
//				
//				
//			}
			


}

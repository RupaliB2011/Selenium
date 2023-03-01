package com.maven_testing.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class CoursePage  extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Courses']")
	WebElement Coursebtn;	
	
	@FindBy(xpath="//span[@data-label='Add%20Course']")
	WebElement addCourseBtn;
	
	@FindBy(xpath="//div[contains(@data-fieldname,'course_name')]//div[contains(@class,'form-group')]//input[contains(@type,'text')]")
	WebElement courseNameText;
	
	@FindBy(xpath="//div[contains(@data-fieldname,'course_code')]//input[contains(@type,'text')]")
	WebElement courseCodeText;
	
	
	@FindBy(xpath="//*[@id=\"page-Course\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div/div/div[3]/div[4]/div/div/form/div/div/div[2]/div[1]/input")
	WebElement courseExpiryDateText;
	
	@FindBy(xpath="//button[contains(@data-label,'Save')]")
	WebElement saveCourseBtn;
	
	@FindBy(xpath="//div[@data-fieldname='credit_distribution']//div[@class='flex justify-between']")
	WebElement randomClick ;
	
	
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
				Thread.sleep(500);
				courseNameText.sendKeys("Testings_13_01_23");
				courseCodeText.sendKeys("Testing_1323");
				Thread.sleep(500);
				courseExpiryDateText.click();
				courseExpiryDateText.sendKeys("28-12-2024");
				randomClick .click();
				Thread.sleep(500);
				saveCourseBtn.click();
			}
}

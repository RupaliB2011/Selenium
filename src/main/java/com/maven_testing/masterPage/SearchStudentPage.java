package com.maven_testing.masterPage;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class SearchStudentPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[normalize-space()='Student']")
	WebElement Studentbtn;
	
			
	@FindBy(xpath= "//input[@placeholder='Title']")
	WebElement searchStudentText;
	
	@FindBy(xpath = "//a[normalize-space()='NAMITA SABAR']")
	WebElement searchedName;
	

	
	
	//Initializing the Page Objects:
			public SearchStudentPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			public void clickStudent() {
				Studentbtn.click();
			}
			public void searchStudentTitle() throws InterruptedException {
				searchStudentText.clear();
				searchStudentText.sendKeys("Namita Sabar");
				searchStudentText.sendKeys(Keys.ENTER);
				// Click on the searched name
			    searchedName.click();
				Thread.sleep(500);
				
				
				
				
				
			}

}

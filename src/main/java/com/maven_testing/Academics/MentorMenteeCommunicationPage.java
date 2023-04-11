package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class MentorMenteeCommunicationPage extends Base {
	
	// Defining the WebElements and xpath
	
		@FindBy(id = "login_email")
		WebElement userName;

		@FindBy(id = "login_password")
		WebElement password;

		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
		WebElement menuBtn;
		
		@FindBy(xpath = "//span[normalize-space()='Communication']")
		WebElement communicationBtn;

		@FindBy(xpath = "//span[contains(@data-label,'Add%20Mentor%20Mentee%20Communication')]")
		WebElement addMentorMenteeCommunicationBtn;

		@FindBy(xpath = "//div[contains(@class,'frappe-control input-max-width has-error')]//input[contains(@role,'combobox')]")
		WebElement studentTxt;

		@FindBy(xpath = "//div[@class='ql-container ql-snow']//p")
		WebElement descriptionTxt;

		@FindBy(xpath = "//div[@id='page-Mentor Mentee Communication']//button[contains(@data-label,'Save')]")
		WebElement saveBtn;

		
	//Initializing the Page Objects:
		public MentorMenteeCommunicationPage() {
			PageFactory.initElements(driver, this);
		}

	//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}

		public void getMentorMenteeCommunication() throws InterruptedException {
			menuBtn.click();
			communicationBtn.click();
			addMentorMenteeCommunicationBtn.click();
			Thread.sleep(500);
		}
	
		public void addMentorMenteeCommunication() throws InterruptedException {
			studentTxt.sendKeys("EDU-STU-2021-00003");
			studentTxt.sendKeys(Keys.ENTER);
			Thread.sleep(500); 

			descriptionTxt.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
			Thread.sleep(500);
			saveBtn.click();
			Thread.sleep(1500);
			
		}
		}

				

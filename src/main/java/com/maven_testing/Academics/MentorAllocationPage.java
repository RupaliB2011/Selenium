package com.maven_testing.Academics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class MentorAllocationPage extends Base {
	
	// Defining the WebElements and xpath
	
		@FindBy(id = "login_email")
		WebElement userName;

		@FindBy(id = "login_password")
		WebElement password;

		@FindBy(xpath= "//button[normalize-space()='Login']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//a[contains(@href,'/app/academics')]")
		WebElement menuBtn;
		
		@FindBy(xpath = "//div[contains(@data-page-name,'Academics')]//span[contains(@class,'link-content ellipsis')][normalize-space()='Mentor Allocation']")
		WebElement mentorAllocationBtn;
		
		@FindBy(xpath = "//span[contains(@data-label,'Add%20Mentor%20Allocation')]")
		WebElement addMentorAllocationBtn;

		@FindBy(xpath = "//div[contains(@data-fieldname,'mentor')]//input[contains(@role,'combobox')]")
		WebElement mentorTxt;

		@FindBy(xpath = "//div[@data-fieldname='allocation_from']//input[@role='combobox']")
		WebElement allocationFromTxt;

		@FindBy(xpath = "//div[@data-fieldname='allocation_to']//input[@role='combobox']")
		WebElement allocationToTxt;

		@FindBy(xpath = "//div[@class='form-column col-sm-6']//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
		WebElement academicYearTxt;

		@FindBy(xpath = "//div[contains(@class,'row form-section card-section visible-section')]//div[2]//form[1]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//input[1]")
		WebElement programsTxt;

		@FindBy(xpath = "//div[contains(@data-fieldname,'semester')]//input[contains(@role,'combobox')]")
		WebElement semesterTxt;

		@FindBy(xpath = "//div[contains(@data-fieldname,'mentee_list')]//button[contains(@class,'btn btn-xs btn-secondary grid-add-row')][normalize-space()='Add Row']")
		WebElement addRowBtn;
		
		@FindBy(xpath = "//div[@data-fieldname='student']//div[@class='form-group']//input[@role='combobox']")
		WebElement studentTxt;

		@FindBy(xpath = "//div[@id='page-Mentor Allocation']//span[@class='alt-underline'][normalize-space()='a']")
		WebElement saveBtn;
		
		@FindBy(xpath = "//button[contains(@data-label,'Submit')]")
		WebElement submitBtn;
		
		@FindBy(xpath = "//button[normalize-space()='Yes']")
		WebElement yesSubmitBtn;
		
		
		//Initializing the Page Objects:
		public MentorAllocationPage() {
			PageFactory.initElements(driver, this);
		}

		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}

		public void getMentorAllocation() throws InterruptedException {
			menuBtn.click();
			mentorAllocationBtn.click();
			addMentorAllocationBtn.click();
			Thread.sleep(500);
		}
	
		public void addMentorAllocation() throws InterruptedException {
			
			mentorTxt.sendKeys("HR-EMP-00241");
			mentorTxt.sendKeys(Keys.TAB);

			allocationFromTxt.sendKeys("2021-22");
			allocationFromTxt.sendKeys(Keys.TAB);

			allocationToTxt.sendKeys("2023-24");
			allocationToTxt.sendKeys(Keys.TAB);

			academicYearTxt.sendKeys("2021-22");
			academicYearTxt.sendKeys(Keys.TAB);

			programsTxt.sendKeys("Anthropology (PG)");
			programsTxt.sendKeys(Keys.TAB);

			semesterTxt.sendKeys("Master of Arts in Anthropology With Specialisation in Tribal Legal Studies and Tribal Rights Semester I");
//			semesterTxt.sendKeys(Keys.TAB);
			Thread.sleep(500);

//			studentTxt.sendKeys("EDU-STU-2022-00060");
//			studentTxt.sendKeys(Keys.ESCAPE);
//			Thread.sleep(500);

			saveBtn.click();
			Thread.sleep(500);
			submitBtn.click();
			Thread.sleep(500);
			yesSubmitBtn.click();
			Thread.sleep(500);
			
		}

}

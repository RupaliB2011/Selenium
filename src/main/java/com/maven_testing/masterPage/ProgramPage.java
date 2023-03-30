package com.maven_testing.masterPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class ProgramPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	    @FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Programs']")
		WebElement programbtn;
		
		@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[2]/button[2]/span")
		WebElement addProgramBtn;		
		
		@FindBy(xpath="//div[@data-fieldname='program_grade']//input[@role='combobox']")
		WebElement addProgramGradeDd;
		
		@FindBy(xpath="//div[@data-fieldname='department']//div[@class='form-group']//input[@role='combobox']")
		WebElement addDeptText;
		
		@FindBy(xpath="//div[@data-fieldname='programs_name']//input[@type='text']")
		WebElement addProgramNameText;
		
		@FindBy(xpath="//div[contains(@data-fieldname,'programs_abbreviation')]//input[contains(@type,'text')]")
		WebElement addProgramAbbText;
		
		@FindBy(xpath="//select[@class='input-with-feedback form-control ellipsis bold']")
		WebElement addProgramDurationText;
		
		@FindBy(xpath="//input[@data-fieldtype='Int']")
		WebElement addProgramSemesterText;		
		
		@FindBy(xpath="//div[@id='page-Programs']//button[contains(@data-label,'Save')]")
		WebElement saveBtn;
		
		
		
		
		
	//Initializing the Page Objects:
				public ProgramPage() {
					PageFactory.initElements(driver, this);
				}

				//Actions:
				public void login(String un, String pass) throws InterruptedException {
					userName.sendKeys(un);
					password.sendKeys(pass);
					loginBtn.click();
					Thread.sleep(500); 		
				}
				public void clickProgram() {
					programbtn.click();
				}
				
				public void addingProgram() throws InterruptedException {
					addProgramBtn.click();
					Thread.sleep(500);
					addProgramGradeDd.sendKeys("Postgraduate (PG)");
					addProgramNameText.clear();
					addProgramNameText.sendKeys("Data Analytics_13");	
					Thread.sleep(500);
					addProgramAbbText.clear();
					addProgramAbbText.sendKeys("PG(DA13)");
					Thread.sleep(500);
					addProgramDurationText.sendKeys("2 Years");
					Thread.sleep(500);
					addProgramSemesterText.clear();
					addProgramSemesterText.sendKeys("4");
					Thread.sleep(1500);
					saveBtn.click();
				}

}

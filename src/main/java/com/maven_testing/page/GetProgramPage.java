package com.maven_testing.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class GetProgramPage  extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Programs']")
	WebElement programBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Courses']")
	WebElement courseBtn;
	
	
		
	
	//Initializing the Page Objects:
			public GetProgramPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(5000); 		
			}
			
			public void clickMenu() throws InterruptedException {
				menuBtn.click();
				Thread.sleep(500); 
			}
			
			public void clickProgram() throws InterruptedException {
				courseBtn.click();
				Thread.sleep(500); 
			}
			
}

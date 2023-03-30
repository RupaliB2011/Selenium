package com.maven_testing.masterPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.maven_testing.base.Base;

public class LoginPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	
	
	
	//Initializing the Page Objects:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

		//Actions:
		public void login(String un, String pass) throws InterruptedException {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginBtn.click();
			Thread.sleep(500); 		
		}
		
				
			
}

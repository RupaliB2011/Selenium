package com.maven_testing.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class DemoFile extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	// page 
	@FindBy(xpath="//a[@class='navbar-brand navbar-home']")
	WebElement Menubtn;	
	
	@FindBy(xpath="//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement Admissionbtn;
	
			
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student']")
	WebElement Studentbtn;	
	
	
	//Initializing the Page Objects:
			public DemoFile() {
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
				Menubtn.click();
				Thread.sleep(500); 
				Admissionbtn.click();
				Thread.sleep(500); 
			}
			public void clickStudent() throws InterruptedException {
				Studentbtn.click();
				Thread.sleep(500); 
			}
}

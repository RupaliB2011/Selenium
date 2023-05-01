package com.maven_testing.page.Fees;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class FeeCategoryPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
//	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fee Category']")	
	WebElement feeCategoryBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Fee%20Category']")
	WebElement addFeeCategoryBtn;
	
	@FindBy(xpath="//button[normalize-space()='Edit Full Form']")
	WebElement editBtn;		

	@FindBy(xpath="//input[@class='input-with-feedback form-control bold']")
	WebElement nameText;	

	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;
	
	//Initializing the Page Objects:
	public FeeCategoryPage() {
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
	public void clickFeeCategory() throws InterruptedException {
		feeCategoryBtn.click();
		Thread.sleep(500);
	}
	
	public void createFeeCategory() throws InterruptedException {
		addFeeCategoryBtn.click();
		Thread.sleep(500);
		editBtn.click();
		Thread.sleep(500);
		nameText.sendKeys("Tution");
		Thread.sleep(500);
		saveBtn.click();
		Thread.sleep(500);
		
		
	}

}

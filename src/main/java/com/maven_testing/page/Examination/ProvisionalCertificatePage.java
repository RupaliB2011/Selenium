package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ProvisionalCertificatePage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Provisional Certificate']")
	WebElement provisionalCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Provisional%20Certificate']")
	WebElement addProvisionalCertificateBtn;
	
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentText;
	
	@FindBy(xpath= "//div[@data-fieldname='place']//input[@type='text']")
	WebElement placeText;	
	
	@FindBy(xpath= "//div[@data-fieldname='name_of_degree']//input[@type='text']")
	WebElement nameOfDegreeText;	
	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	
//	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
//	WebElement lcConfirmationText;
//	
//	String lcText ="Cancel";
//	String actualLCPageText;
	
	
	
	//Initializing the Page Objects:
	public ProvisionalCertificatePage() {
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
		menuExamBtn.click();
		Thread.sleep(500); 
	}
	public void clickProvisionalCertificate() throws InterruptedException {
		provisionalCertificateBtn.click();
		Thread.sleep(1000); 
	}
	public void addProvisionalCertificate() throws InterruptedException {
		
		addProvisionalCertificateBtn.click();
		
		studentText.sendKeys("EDU-STU-2021-00200");
		studentText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		placeText.sendKeys("Odisha");
		placeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		nameOfDegreeText.sendKeys("Master of Arts");
		nameOfDegreeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		saveBtn.click();
		Thread.sleep(500); 
				
	}	
//	public void confirmation() throws InterruptedException {
//		actualLCPageText = lcConfirmationText.getText();
//		System.out.println(actualLCPageText);				
//		Assert.assertEquals(actualLCPageText, lcText,"Expected and Actual are same");
//		System.out.println("Exam Evaluation submitted");
//	}

}

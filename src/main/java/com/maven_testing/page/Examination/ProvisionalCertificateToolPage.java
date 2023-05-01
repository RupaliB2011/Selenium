package com.maven_testing.page.Examination;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.maven_testing.base.Base;

public class ProvisionalCertificateToolPage extends Base{	
	
	@FindBy(id = "login_email")
	WebElement userName;
	
	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//span[@class='sidebar-item-label'][normalize-space()='Examination']")
	WebElement menuExamBtn;	
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Provisional Certificate Tool']")
	WebElement provisionalCertificateBtn;	
	
	@FindBy(xpath= "//span[@data-label='Add%20Provisional%20Certificate%20Tool']")
	WebElement addProvisionalCertificateToolBtn;
	
	
	@FindBy(xpath="//div[@class='frappe-control input-max-width']//input[@role='combobox']")
	WebElement addProgramText;
	
	@FindBy(xpath="//div[@class='frappe-control input-max-width has-error']//input[@role='combobox']")
	WebElement addAcademicTermText;
	
	@FindBy(xpath= "//div[@data-fieldname='place']//input[@type='text']")
	WebElement placeText;	
	
	@FindBy(xpath= "//div[@data-fieldname='name_of_degree']//input[@type='text']")
	WebElement nameOfDegreeText;	
	
	@FindBy(xpath= "//button[normalize-space()='Get Students']")
	WebElement getStudentBtn;	
	
	@FindBy(xpath="//button[@data-label='Save']")
	WebElement saveBtn;	
	
	@FindBy(xpath="//button[normalize-space()='Create Provisional Certificate']")
	WebElement createProvisionalCertificateBtn;
	
	
	
	
	
//	@FindBy(xpath="//button[contains(@data-label,'Cancel')]")
//	WebElement lcConfirmationText;
//	
//	String lcText ="Cancel";
//	String actualLCPageText;
	
	
	
	//Initializing the Page Objects:
	public ProvisionalCertificateToolPage() {
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
		
		addProvisionalCertificateToolBtn.click();
		
		addProgramText.sendKeys("Anthropology (PG)");
		addProgramText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		
		addAcademicTermText.sendKeys("2022-23 (SEMESTER 4)");
		addAcademicTermText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);		
		
		placeText.sendKeys("Master of Arts");
		placeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);	
		
		nameOfDegreeText.sendKeys("Master of Arts");
		nameOfDegreeText.sendKeys(Keys.ENTER);
		Thread.sleep(1500);	
		
		getStudentBtn.click();
		Thread.sleep(500); 
		
		saveBtn.click();
		Thread.sleep(500);
		
		
		createProvisionalCertificateBtn.click();
		Thread.sleep(500);
				
	}	
	
}

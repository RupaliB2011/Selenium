package com.maven_testing.page.Fees;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class FeesPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "//button[normalize-space()='Login']")
	WebElement loginBtn;	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fees']")	
	WebElement feesBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Fees']")
	WebElement addFeesBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement studentNameText;		
	
	@FindBy(xpath="//input[@data-fieldname='due_date']")
	WebElement dueDateText;
		
	@FindBy(xpath="//div[@data-fieldname='receivable_account']//input[@role='combobox']")
	WebElement receivableAccountText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement submitBtn;
		
	@FindBy(xpath="//div[@id='page-Fees']//button[@data-label='Save']")	
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@data-fieldname='components']//button[normalize-space()='Add Row']")
	WebElement addRowBtn;
	
	@FindBy(xpath="//div[@class='btn-open-row']")
	WebElement editBtn;	
	
	@FindBy(xpath="//div[@data-fieldname='fees_category']//input[@role='combobox']")
	WebElement feesCategoryDd;
	
	@FindBy(xpath="//textarea[@type='text']")
	WebElement feesDescriptionText;	
	
	@FindBy(xpath="//div[@class='row form-section visible-section']//div[@class='frappe-control input-max-width has-error']//input[@type='text']")
	WebElement amountText;
	
	@FindBy(xpath="//button[@class='btn btn-secondary btn-sm pull-right grid-collapse-row']")
	WebElement collapseBtn;
	
	
	//Initializing the Page Objects:
			public FeesPage() {
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
			
			public void clickFees() throws InterruptedException {
				feesBtn.click();
				Thread.sleep(500);
			}
			
			public void createFees() throws InterruptedException {
				addFeesBtn.click();
				Thread.sleep(500);
				studentNameText.sendKeys("EDU-STU-2021-00002");
				Thread.sleep(1500);
				dueDateText.sendKeys("11-04-2023");
				dueDateText.sendKeys(Keys.ENTER);
				Thread.sleep(1500);
				editBtn.click();
				Thread.sleep(1500);
				feesCategoryDd.sendKeys("");
				feesCategoryDd.sendKeys(Keys.TAB);
				Thread.sleep(1500);
				feesDescriptionText.sendKeys("Test Fees");
				feesDescriptionText.sendKeys(Keys.TAB);
				Thread.sleep(1500);
				amountText.sendKeys("4355");
				Thread.sleep(1500);
				collapseBtn.click();
				Thread.sleep(500);
				receivableAccountText.sendKeys("Debtors - KISS");
				Thread.sleep(1500);
				saveBtn.click();
				Thread.sleep(500);
				
				
			}

}

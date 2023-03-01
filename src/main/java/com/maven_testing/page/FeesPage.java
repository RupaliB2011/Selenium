package com.maven_testing.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.maven_testing.base.Base;

public class FeesPage extends Base{
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Fees']")	
	WebElement FeesBtn;
	
	@FindBy(xpath="//span[@data-label='Add%20Fees']")
	WebElement AddFeesBtn;
	
	@FindBy(xpath="//div[@data-fieldname='student']//input[@role='combobox']")
	WebElement StudentNameDd;		
	
	@FindBy(xpath="//input[@data-fieldname='due_date']")
	WebElement DuedateText;
		
	@FindBy(xpath="//div[@data-fieldname='receivable_account']//input[@role='combobox']")
	WebElement ReceivableAccountText;
	
	@FindBy(xpath="//button[@data-label='Submit']")
	WebElement loginBtn;
		
	@FindBy(xpath="//div[@id='page-Fees']//button[@data-label='Save']")	
	WebElement SaveBtn;
	
	@FindBy(xpath="//div[@data-fieldname='components']//button[normalize-space()='Add Row']")
	WebElement AddRowBtn;
	
	@FindBy(xpath="//input[@placeholder='Fees Category']")
	WebElement FeesCategoryDd;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	WebElement AmountText;
	
	
	//Initializing the Page Objects:
			public FeesPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				LoginBtn.click();
				Thread.sleep(500); 		
			}
			public void clickFees() throws InterruptedException {
				FeesBtn.click();
				Thread.sleep(500);
			}
			
			public void createFees() throws InterruptedException {
				AddFeesBtn.click();
				Thread.sleep(500);
				StudentNameDd.sendKeys("EDU-STU-2021-00002");
				Thread.sleep(500);
				DuedateText.sendKeys("11-01-2023");
				AddRowBtn.click();
				Thread.sleep(500);
				FeesCategoryDd.sendKeys("");
				AmountText.sendKeys("4355");
				ReceivableAccountText.sendKeys("Debtors - KISS");
				
				
			}

}

package com.maven_testing.page;

//import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven_testing.base.Base;

public class SearchStudentPage extends Base{
	
	
	@FindBy(id = "login_email")
	WebElement userName;

	@FindBy(id = "login_password")
	WebElement password;

	@FindBy(xpath= "/html/body/div/div/main/div[2]/div/section[1]/div/form/div[2]/button")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//div[normalize-space()='Modules']/following-sibling::a/span[normalize-space()='Admission']")
	WebElement menuBtn;
	
	@FindBy(xpath="//span[@class='link-content ellipsis'][normalize-space()='Student']")
	WebElement Studentbtn;
	
	@FindBy(xpath= "*[@id=\"page-List/Student/List\"]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[1]/div[1]/span[2]/a")
	WebElement studentbtn;

		
	@FindBy(xpath= "//input[@placeholder='Title']")
	WebElement searchStudentText;
	
	@FindBy(linkText = "Connections")
	WebElement assertText;
	

	
	
	//Initializing the Page Objects:
			public SearchStudentPage() {
				PageFactory.initElements(driver, this);
			}

			//Actions:
			public void login(String un, String pass) throws InterruptedException {
				userName.sendKeys(un);
				password.sendKeys(pass);
				loginBtn.click();
				Thread.sleep(500); 		
			}
			public void clickStudent() {
				Studentbtn.click();
			}
			public void searchStudentTitle() throws InterruptedException {
				searchStudentText.clear();
				searchStudentText.sendKeys("NAMITA");
				searchStudentText.sendKeys(Keys.ENTER);
//				studentbtn.click();
				Thread.sleep(500);
//				assertNotNull(assertText);
				
				
				
				
				
			}

}

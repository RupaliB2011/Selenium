package com.maven_testing.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//com.maven_testing.test.LoginTest

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

public class LoginTest  extends Base {
	
	LoginPage login;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public LoginTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new LoginPage();
		
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
//	@Test(priority=2)
	@Test(enabled = false)
	public void getProgramPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getprogramPage");
		login.clickProgram();	
		test.pass("get Program Page successfully");
	}
//	@Test(priority=3)
	@Test(enabled = false)
	public void clickMenu() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenu");
		login.clickMenu();	
		test.pass("get Menu successfully");
	}
		
//	@Test(priority=4)
	@Test(enabled = false)
	public void getStudentPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getstudentPage");
		login.clickStudent();	
		test.pass("get Student Page successfully");
	}

	
//	@Test(priority=5)
	@Test(enabled = false)
	public void getCoursePage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getCoursePage");
		login.clickMenu();
		login.clickCourse();	
		test.pass("get Course Page successfully");
	}
	
	
//	@Test(priority=6)
	@Test(enabled = false)
	public void getInstructorPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getInstructorPage");
		login.clickMenu();
		login.clickInstructor();	
		test.pass("get Instructor Page successfully");
	}
	
	
	
//	@Test(priority=7)
	@Test(enabled = false)
	public void getFeesPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getFeesPage");
		login.clickMenu();
		login.clickFees();	
		test.pass("get Fees Page successfully");
	}
	
	
//	@Test(priority=8)
	@Test(enabled = false)
	public void getProgramEnrollmentPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getProgramEnrollmentPage");
		login.clickMenu();
		login.clickProgramEnrollment();	
		test.pass("get Course Page successfully");
	}
	
	
//	@Test(priority=9)
	@Test(enabled = false)
	public void getCourseEnrollmentPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getCourseEnrollmentPage");
		login.clickMenu();
		login.clickCourseEnrollment();	
		test.pass("get CourseEnrollment Page successfully");
	}
	
	
//	@Test(priority=10)
	@Test(enabled = false)
	public void getSemesterPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getSemesterPage");
		login.clickMenu();
		login.clickSemester();	
		test.pass("get Semester Page successfully");
	}
	
	
	
	@Test(priority=2)
//	@Test(enabled = false)
	public void getStudent() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudent");	
		login.clickStudent();	
		//login.searchStudentTitle();	
		Thread.sleep(500);
		test.pass("get Student Page successfully");
	}
	
	
	
	// Registration with  valid data
//	@Test(priority=2)
	@Test(enabled = false)
    public void validRegistrationTest() throws InterruptedException{ 
		ExtentTest test=extent.createTest("studentCreated");
		login.clickStudent();
		Thread.sleep(500);
		//login.addStudent();	
		test.pass("Student created successfully");             
     
        
    }
//	@AfterTest
//	public void tearDown() {
//		extent.flush();
//		driver.close();
//	}
}
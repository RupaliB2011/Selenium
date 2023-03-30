package com.maven_testing.test.Admission;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.masterPage.LoginPage;
import com.maven_testing.page.Admission.StudentPage;
import com.maven_testing.utility.Utility;

public class StudentTest extends Base {
	
	StudentPage studentPage;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	

	public StudentTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		studentPage = new StudentPage();
		
	}	
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check studentPage");
		studentPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("studentPage success");
	}
	@Test(priority=2)
	public void getMenu() throws InterruptedException, IOException {
	ExtentTest test=extent.createTest("getMenu");
	studentPage.clickMenu();	
	test.pass("menu selected successfully");
	}
	
	@Test(priority=3)
	public void getStudentPage() throws InterruptedException, IOException {
	ExtentTest test=extent.createTest("getstudentPage");
	studentPage.clickStudent();	
	test.pass("get Student Page successfully");
	}
	
//	@Test(priority=3)
	@Test(enabled = false)
	public void getStudent() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudent");	
		studentPage.clickStudent();	
		studentPage.searchStudentTitle();	
		Thread.sleep(500);
		test.pass("get Student Page successfully");
	}
	
	@Test(priority=4)
    public void validRegistrationTest() throws InterruptedException{ 
		ExtentTest test=extent.createTest("studentCreated");
		studentPage.addStudent();	
		Thread.sleep(1500);		
		test.pass("Student created successfully");             
     
        
    }
	
	@Test(priority=5)
    public void programEnrollment() throws InterruptedException{ 
		ExtentTest test=extent.createTest("program enrollment");
		studentPage.programEnrollment();	
		Thread.sleep(500);		
		test.pass("program enrollment successfully done");             
     
        
    }
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}


}

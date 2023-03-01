package com.maven_testing.test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.CourseEnrollmentPage;
import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

public class CourseEnrollmentTest extends Base {
	
	CourseEnrollmentPage login;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public CourseEnrollmentTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new CourseEnrollmentPage();
		
	}	
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getCourseEnrollmentPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getprogramPage");
		login.clickCourseEnrollment();	
		test.pass("get CourseEnrollment Page successfully");
	}
	
	@Test(priority=3)
	public void addCourseEnrollment() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getprogramPage");
		login.addCourseEnrollment();	
		test.pass("add Course Enrollment successfully");
	}
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}

}

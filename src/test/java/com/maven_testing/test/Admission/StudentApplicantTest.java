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
import com.maven_testing.page.Admission.CourseEnrollmentPage;
import com.maven_testing.page.Admission.StudentAdmissionPage;
import com.maven_testing.utility.Utility;

public class StudentApplicantTest extends Base {
	
	StudentAdmissionPage saPage;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public StudentApplicantTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		saPage = new StudentAdmissionPage();
		
	}	
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		saPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getMenuPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getprogramPage");
		saPage.clickMenu();	
		saPage.clickStudentAdmission();
		test.pass("Menu clicked successfully");
	}
	
	@Test(priority=3)
	public void addStudentAdmission() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getCourseEnrollmentPage");
		saPage.createStudentAdmission();	
		test.pass("Student Admission done successfully");
	}
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}


}

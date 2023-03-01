package com.maven_testing.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.ProgramEnrollmentPage;
import com.maven_testing.utility.Utility;

public class ProgramEnrollmentTest extends Base {
	
	ProgramEnrollmentPage login;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public ProgramEnrollmentTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new ProgramEnrollmentPage();
		
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	@Test(priority=2)
	public void searchStudent() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.clickStudent();
		login.searchStudent();
		test.pass("Searching student success");
	}
	@Test(priority=3)
	public void programEnrollment() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.clickStudent();
		login.searchStudent();
		test.pass("Searching student success");
	}
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}
}

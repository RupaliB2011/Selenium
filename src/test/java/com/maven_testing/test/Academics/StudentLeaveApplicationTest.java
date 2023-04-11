package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.StudentLeaveApplicationPage;
import com.maven_testing.base.Base;
//import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

	
	public class StudentLeaveApplicationTest extends Base {
		
		StudentLeaveApplicationPage studentLeaveApplication;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public StudentLeaveApplicationTest(){
			super();
		}
	
	

		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			studentLeaveApplication = new StudentLeaveApplicationPage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			studentLeaveApplication.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getStudentAttendanceTool() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getStudentAttendance");
			studentLeaveApplication.getStudentLeaveApplication();
			test.pass("Student Leave Application opened successfully");
		}
		
		
		@Test(priority=3)
		public void useStudentAttendanceTool() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addStudentAttendance");
			studentLeaveApplication.addStudentLeaveApplication();
			test.pass("Student Leave Application submitted successfully");
		}
		

		@AfterTest
		public void tearDown() {
			extent.flush();
			driver.close();
		}
	
	}

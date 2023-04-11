package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.StudentAttendancePage;
import com.maven_testing.base.Base;
import com.maven_testing.utility.Utility;

	
	public class StudentAttendanceTest extends Base {
		
		StudentAttendancePage studentAttendance;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public StudentAttendanceTest(){
			super();
		}
	
	

		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			studentAttendance = new StudentAttendancePage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			studentAttendance.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getStudentAttendanceTool() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getStudentAttendance");
			studentAttendance.getStudentAttendance();
			test.pass("Student Attendance opened successfully");
		}
		
		
		@Test(priority=3)
		public void useStudentAttendanceTool() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addStudentAttendance");
			studentAttendance.addStudentAttendance();
			test.pass("Student Attendance marked successfully");
		}
		

		@AfterTest
		public void tearDown() {
			extent.flush();
			driver.close();
		}
	
	}

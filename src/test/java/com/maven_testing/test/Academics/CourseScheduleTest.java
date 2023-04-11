package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.CourseSchedulePage;
import com.maven_testing.base.Base;
import com.maven_testing.utility.Utility;

	
	public class CourseScheduleTest extends Base {
		
		CourseSchedulePage courseSchedule;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public CourseScheduleTest(){
			super();
		}
	
		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			courseSchedule = new CourseSchedulePage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			courseSchedule.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getCourseSchedulePage() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getCourseSchedule");
			courseSchedule.getCourseSchedule();			
			test.pass("Course Schedule Page opened successfully");
		}
		
		
		@Test(priority=3)
		public void addCourseSchedule() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addCourseSchedule");
			courseSchedule.addCourseSchedule();
			test.pass("Course Schedule added successfully");
		}
		
//		@AfterTest
//		public void tearDown() {
//			extent.flush();
//			driver.close();
//		}
	
	}
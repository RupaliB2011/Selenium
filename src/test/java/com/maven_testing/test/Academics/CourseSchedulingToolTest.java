package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.CourseSchedulingToolPage;
import com.maven_testing.base.Base;
import com.maven_testing.utility.Utility;

	
	public class CourseSchedulingToolTest extends Base {
		
		CourseSchedulingToolPage courseSchedulingTool;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public CourseSchedulingToolTest(){
			super();
		}
	

		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			courseSchedulingTool = new CourseSchedulingToolPage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			courseSchedulingTool.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getCourseSchedulingToolPage() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getCourseSchedulingTool");
			courseSchedulingTool.getCourseSchedulingTool();
			test.pass("Course Scheduling Tool Page opened successfully");
		}
		
		
		@Test(priority=3)
		public void scheduleCourse() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("scheduleCourse");
			courseSchedulingTool.scheduleCourse();
			test.pass("Course Scheduled using Tool successfully");
		}
		
	

		@AfterTest
		public void tearDown() {
			extent.flush();
			driver.close();
		}
	
	}

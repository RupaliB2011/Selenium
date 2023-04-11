package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.MentorAllocationPage;
import com.maven_testing.base.Base;
//import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

	
	public class MentorAllocationTest extends Base {
		
		MentorAllocationPage mentorAllocation;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public MentorAllocationTest(){
			super();
		}
	
	
		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			mentorAllocation = new MentorAllocationPage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			mentorAllocation.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getMentorAllocationPage() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getMentorAllocationPage");
			mentorAllocation.getMentorAllocation();
			test.pass("Mentor Allocation Page opened successfully");
		}
		
		
		@Test(priority=3)
		public void addMentorAllocation() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addMentorAllocation");
			mentorAllocation.addMentorAllocation();
			test.pass("Mentor Allocation done successfully");
		}
		
		
		@AfterTest
		public void tearDown() {
			extent.flush();
			driver.close();
		}
	
	}

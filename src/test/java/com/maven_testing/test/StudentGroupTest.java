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
import com.maven_testing.masterPage.StudentGroup;
import com.maven_testing.utility.Utility;

	public class StudentGroupTest extends Base {
		
		StudentGroup studentGroup;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

		public StudentGroupTest(){
			super();
		}


		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			studentGroup = new StudentGroup();
			
		}	
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			studentGroup.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getStudentGroupPage() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getAcademicsPage");
			studentGroup.getStudentGroup();
			test.pass("Student Group Page opened successfully");
		}
		
		
		@Test(priority=3)
		public void addStudentGroup() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addStudentGroup");
			studentGroup.addStudentGroup();
			test.pass("Student Group created successfully");
		}
		
//		@AfterTest
//		public void tearDown() {
//			extent.flush();
//			driver.close();
//		}

	}

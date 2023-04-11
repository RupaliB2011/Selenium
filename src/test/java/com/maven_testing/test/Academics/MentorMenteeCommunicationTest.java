package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.Academics.MentorMenteeCommunicationPage;
import com.maven_testing.base.Base;
//import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

	
	public class MentorMenteeCommunicationTest extends Base {
		
		MentorMenteeCommunicationPage mentorMenteeCommunication;
		Utility util;
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
		public MentorMenteeCommunicationTest(){
			super();
		}
	
	
		@BeforeTest
		public void setUp() {
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("MyReport");
			extent.attachReporter(spark);
			initialization();
			mentorMenteeCommunication = new MentorMenteeCommunicationPage();
		}	
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			ExtentTest test=extent.createTest("Check Login");
			mentorMenteeCommunication.login(prop.getProperty("userName"), prop.getProperty("password"));
			test.pass("Login successful");
		}
		
		@Test(priority=2)
		public void getMentorMenteeCommunicationPage() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("getMentorMenteeCommunicationPage");
			mentorMenteeCommunication.getMentorMenteeCommunication();
			test.pass("Mentor Allocation Page opened successfully");
		}
		
		
		@Test(priority=3)
		public void addMentorMenteeCommunication() throws InterruptedException, IOException {
			ExtentTest test=extent.createTest("addMentorMenteeCommunication");
			mentorMenteeCommunication.addMentorMenteeCommunication();
			test.pass("Mentor Mentee Communication created successfully");
		}
		

		@AfterTest
		public void tearDown() {
			extent.flush();
			driver.close();
		}
	
	}

package com.maven_testing.test.Academics;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.Academics.CoursePage;
//import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

public class CourseTest  extends Base {
	
	CoursePage coursePage;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public CourseTest(){
		super();
	}



	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		coursePage = new CoursePage();
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		coursePage.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getCoursePage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getcoursePage");
		coursePage.clickCourse();	
		test.pass("get course Page successfully");
	}
	
	@Test(priority=3)
	public void addCourse() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("addcourse");
		coursePage.addCourse();	
		test.pass("Added course successfully");
	}
	
//	@AfterTest
//	public void tearDown() {
//		extent.flush();
//		driver.close();
//	}

}

package com.maven_testing.test.Examination;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.ExamEvaluationPage;
import com.maven_testing.utility.Utility;

public class ExamEvaluationTest extends Base {
	
		
	ExamEvaluationPage eep;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public ExamEvaluationTest(){
		super();
	}


	@Test(priority=3)
	public void examApplication() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudentPage");
		eep.addExamEvaluation();
		eep.confirmation();
		test.pass("Menu Student Clicked successfully");
	}
//	@AfterTest
//	public void tearDown() {
//		extent.flush();
//		driver.close();
//	}	
	@Test(priority=2)
	public void getMenuPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenuPage");
		eep.clickMenu();
		eep.clickExamEvaluation();
		test.pass("Menu clicked successfully");
	}
	
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		eep.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		eep = new ExamEvaluationPage();
		
	}
	
	

}

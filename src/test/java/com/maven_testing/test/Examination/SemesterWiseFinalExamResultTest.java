package com.maven_testing.test.Examination;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.ContinuousEvaluationToolPage;
import com.maven_testing.page.Examination.ExamApplicationPage;
import com.maven_testing.page.Examination.SemesterWiseFinalExamResultPage;
import com.maven_testing.utility.Utility;

public class SemesterWiseFinalExamResultTest extends Base {
	
		
	SemesterWiseFinalExamResultPage cep;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public SemesterWiseFinalExamResultTest(){
		super();
	}
	
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		cep = new SemesterWiseFinalExamResultPage();
		
	}
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cep.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getMenuPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenuPage");
		cep.clickMenu();
		cep.clickFinalExamResult();
		test.pass("Menu clicked successfully");
	}
	@Test(priority=3)
	public void examApplication() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudentPage");
		cep.addFinalExamResult();
		cep.confirmation();
		test.pass("Menu Student Clicked successfully");
	}
	
	
	
	
//	@AfterTest
//	public void tearDown() {
//		extent.flush();
//		driver.close();
//	}	

	

}

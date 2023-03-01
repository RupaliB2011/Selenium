package com.maven_testing.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.ExaminationPage;
import com.maven_testing.page.LoginPage;
import com.maven_testing.utility.Utility;

public class ExaminationTest extends Base {
	
	ExaminationPage login;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public ExaminationTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new ExaminationPage();
		
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void menuClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.clickMenu();
		//login.clickExam();
		test.pass("menu clicked success");
	}
//	@Test(priority=3)
	@Test(enabled = false)
	public void declareExamination() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.decalreExam();
		test.pass("Exam declaration success");
	}
//	@Test(priority=4)
	@Test(enabled = false)
	public void criteriaWiseEvaluationToolExam() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.criteriaWiseEvaluationTool();
		test.pass("criteria Wise Evaluation Tool Exam success");
	}
	
	@Test(priority=5)
	public void finalResultDeclarationTool() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.finalResultDeclaration();
		test.pass("final Result Declaration Tool Exam success");
	}
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}
	
}
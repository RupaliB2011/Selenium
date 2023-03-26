package com.maven_testing.test.Examination;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.CriteriaWiseEvaluationToolPage;
import com.maven_testing.utility.Utility;

public class CriteriaWiseEvaluationToolTest extends Base {
	
	ExtentReports extent = new ExtentReports();
	CriteriaWiseEvaluationToolPage login;
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public CriteriaWiseEvaluationToolTest(){
		super();
	}


	@Test(priority=3)
	public void criteriaWiseEvaluationToolClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.criteriaWiseEvaluationTool();
		test.pass("tool clicked success");
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
		test.pass("menu clicked success");
	}
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new CriteriaWiseEvaluationToolPage();
	}
	
}

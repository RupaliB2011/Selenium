package com.maven_testing.test.Examination;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.CumulativeMarksheetToolPage;
import com.maven_testing.utility.Utility;

public class CumulativeMarksheetToolTest extends Base {
	
	CumulativeMarksheetToolPage cmt;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public CumulativeMarksheetToolTest(){
		super();
	}
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		cmt = new CumulativeMarksheetToolPage();
	}

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmt.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void menuClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmt.clickMenu();
		test.pass("menu clicked success");
	}
	
	@Test(priority=3)
	public void cumulativeMarksheetToolClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmt.addCumulativeMarksheetTool();
		Thread.sleep(500);
//		cmt.confirmation();
		test.pass("tool clicked success");
	}	

}

package com.maven_testing.test.Examination;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.CumulativeMarksheetPage;
import com.maven_testing.utility.Utility;

public class CumulativeMarksheetTest extends Base {
	
	CumulativeMarksheetPage cmp;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public CumulativeMarksheetTest(){
		super();
	}
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		cmp = new CumulativeMarksheetPage();
	}

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmp.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void menuClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmp.clickMenu();
		cmp.clickCumulativeMarksheet();
		test.pass("menu clicked success");
	}
	
	@Test(priority=3)
	public void cumulativeMarksheetClick() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		cmp.addCumulativeMarksheet();
		Thread.sleep(500);
		cmp.confirmation();
		test.pass("tool clicked success");
	}	

}

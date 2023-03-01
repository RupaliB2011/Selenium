package com.maven_testing.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.FeesPage;
import com.maven_testing.utility.Utility;

public class FeesTest extends Base{
	
	FeesPage feesPage;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public FeesTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		feesPage = new FeesPage();
		
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		feesPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void createFeesMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		feesPage.clickFees();
		Thread.sleep(500);
		feesPage.createFees();
		test.pass("Fees created successfully");
	}
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}
}

package com.maven_testing.test.Fees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.ConductCertificatePage;
import com.maven_testing.page.Fees.FeeCategoryPage;
import com.maven_testing.page.Fees.FeesPage;
import com.maven_testing.utility.Utility;

public class FeeCategoryTest extends Base {
	
		
	FeeCategoryPage fcPage;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public FeeCategoryTest(){
		super();
	}
	
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		fcPage = new FeeCategoryPage();
		
	}
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		fcPage.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getMenuPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenuPage");
		fcPage.clickMenu();
		fcPage.clickFeeCategory();
		test.pass("Menu clicked successfully");
	}
	@Test(priority=3)
	public void addFeeCategory() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudentPage");
		fcPage.createFeeCategory();
		test.pass("Fee Category created successfully");
	}
	
	
	@AfterTest
	public void tearDown() {
		extent.flush();
		driver.close();
	}	

}

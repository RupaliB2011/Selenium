package com.maven_testing.test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.GetProgramPage;
import com.maven_testing.page.ProgramPage;
import com.maven_testing.utility.Utility;

public class GetProgramTest extends Base {
	
	GetProgramPage login;
	Utility util;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");

	public GetProgramTest(){
		super();
	}


	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		login = new GetProgramPage();
		
	}	

	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		login.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	@Test(priority=2)
	public void getMenu() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenu");
		login.clickMenu();	
		test.pass("get Program Page successfully");
	}
	@Test(priority=3)
	public void getProgram() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getprogramPage");
		login.clickProgram();	
		test.pass("get Program Page successfully");
	}
	
	
}

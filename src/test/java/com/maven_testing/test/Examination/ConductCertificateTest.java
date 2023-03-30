package com.maven_testing.test.Examination;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.maven_testing.base.Base;
import com.maven_testing.page.Examination.ConductCertificatePage;
import com.maven_testing.utility.Utility;

public class ConductCertificateTest extends Base {
	
		
	ConductCertificatePage ccp;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	Utility util;

	public ConductCertificateTest(){
		super();
	}
	
	@BeforeTest
	public void setUp() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		initialization();
		ccp = new ConductCertificatePage();
		
	}
	@Test(priority=1)
	public void loginMethod() throws InterruptedException {
		ExtentTest test=extent.createTest("Check Login");
		ccp.login(prop.getProperty("userName"), prop.getProperty("password"));
		test.pass("Login success");
	}
	
	@Test(priority=2)
	public void getMenuPage() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getMenuPage");
		ccp.clickMenu();
		ccp.clickConductCertificate();
		test.pass("Menu clicked successfully");
	}
	@Test(priority=3)
	public void addConductCertificate() throws InterruptedException, IOException {
		ExtentTest test=extent.createTest("getStudentPage");
		ccp.addConductCertificate();
//		Thread.sleep(1500); 
//		ccp.confirmation();
		test.pass("Menu Student Clicked successfully");
	}
	
	
	
	
//	@AfterTest
//	public void tearDown() {
//		extent.flush();
//		driver.close();
//	}	


}

package com.maven_testing.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static JavascriptExecutor js;

	public Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Selenium Workspace\\Maven_Testng_Project\\src\\main\\java\\com\\maven_testing\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void initialization() {
		
		WebDriverManager.chromedriver().setup();
//		  System.setProperty("webdriver.chrome.driver","D:\\SeleniumInstallation\\chromedriver_win32\\chromedriver.exe");		
//		  ChromeOptions option = new ChromeOptions();
//        option.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(option);
//        
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");        
		driver=new ChromeDriver(option);
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS) ;
//		driver.get(prop.getProperty("testUrl"));
//		driver.get(prop.getProperty("prodUrl"));
		driver.get(prop.getProperty("wscUrl"));

	}
	
   
}

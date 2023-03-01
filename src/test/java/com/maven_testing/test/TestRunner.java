package com.maven_testing.test;

import org.testng.TestNG;

public class TestRunner {
   static TestNG testNg;
	public static void main(String[] args) {
		
		testNg=new TestNG();
		testNg.setTestClasses(new Class[] {StudentTest.class});
		testNg.run();

	}

}

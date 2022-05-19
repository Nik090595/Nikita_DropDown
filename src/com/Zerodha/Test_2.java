package com.Zerodha;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_2 {

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	@Test
	public void testng() {
		System.out.println("Test Anotation");
	}
	
	@DataProvider(name ="TestData")
	public Object[][] data(){
		return new Object[][] {{5,10},{23,30},{4,5}};
	}
	
	@Test(dataProvider = "TestData")
	public void Test12(int a, int b) {
		System.out.println(a+b);
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
}

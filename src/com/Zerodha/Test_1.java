package com.Zerodha;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

import com.POM.POM;
import com.Utility.Browser;
import com.Utility.Excelsheet;

public class Test_1 {
WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
	@Test
	public void TestCase() throws EncryptedDocumentException, IOException {
		POM pom = new POM(driver);
		String UserName = Excelsheet.GetData(0, 1, "ABCD");
		pom.EnterUserName(UserName);
		String Password = Excelsheet.GetData(1, 1, "ABCD");
		pom.EnterPassword(Password);
		pom.ClickonLogin();
		String Pincode = Excelsheet.GetData(2, 1, "ABCD");
		pom.EnterPin(Pincode);
		pom.ClickonContinue();
	}
	
	@Test
	@Parameters({"a","b","c"})
	public void Test1(int a, int b, String c) {
		System.out.println(a+b);
		System.out.println(c);
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@DataProvider(name = "TestData" )
	public Object[][] data(){
		return new Object[][] {{"Velocity","Hello"},{"Kataraj","Pune"},{"Pune","Maharashtra"}};
	}
	@Test (dataProvider ="TestData")
	public void Test3(String name, String Place) {
		System.out.println(name);
		System.out.println(Place);
	}
	
}

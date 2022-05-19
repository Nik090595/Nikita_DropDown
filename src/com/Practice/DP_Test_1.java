package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utility.Browser;

public class DP_Test_1 {

	WebDriver driver;
	
	@BeforeMethod
	public void beforemethodCode() {
		driver = Browser.OpenBrowser("file://C:/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html"); 
	}
	
	@AfterMethod
	public void aftermethodCode() {
		driver.close();
	}
	
	 @Test(dataProvider = "login", dataProviderClass = com.Practice.DP_Test.class)
	public void LoginData(String UserID, String Password, String Title) {
		driver.findElement(By.id("email")).sendKeys(UserID);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Assert.assertEquals(driver.getTitle(), Title);
	}
}

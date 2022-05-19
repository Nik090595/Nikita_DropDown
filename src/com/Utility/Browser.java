package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver OpenBrowser(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\Selnium_Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(URL);
		return driver;	
		}
}

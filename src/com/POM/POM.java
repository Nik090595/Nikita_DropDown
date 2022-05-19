package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	@FindBy (xpath = "//input[@id='userid']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy (xpath = "//input[@type='password']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']")private WebElement cont;
	@FindBy (xpath = "//h2[text()='Login to Kite']") private WebElement title;
	@FindBy (xpath ="//img[@alt='Kite']") private WebElement kite;
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']") private WebElement forget;
	@FindBy (xpath ="(//a[@target='_blank'])[3]") private WebElement newAcc; 
	@FindBy (xpath = "//input[@id='user_mobile']") private WebElement newsign;
	
	public POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName (String UserName) {
		username.sendKeys(UserName);
	}
	
	public void EnterPassword(String Password) {
		pass.sendKeys(Password);
	}
	
	public void ClickonLogin() {
		login.click();
	}
	
	public void EnterPin (String Pincode) {
		pin.sendKeys(Pincode);
	}
	
	public void ClickonContinue() {
		cont.click();
	}
	
	public String getTitle() {
		return title.getText();
	}
	
	public boolean Logo() {
		return kite.isDisplayed();
	}
	
	public void ClickOnForget() {
		forget.click();
	}
	
	public void ClickOnNewAccount() {
		newAcc.click();
	}
	
	public void NewAccount(String Phone) {
		newsign.sendKeys(Phone);
	}
}

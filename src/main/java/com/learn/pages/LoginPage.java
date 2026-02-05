package com.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public @FindBy(xpath="//input[@name='username']")
	WebElement input_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement input_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button_login;
	
	public void enterUsername(String username) {
		input_username.sendKeys(username);
	}
	
	public void enterPassword(String pswd) {
		input_password.sendKeys(pswd);
	}
	
	public void clickLogin() {
		button_login.click();
	}
	
}

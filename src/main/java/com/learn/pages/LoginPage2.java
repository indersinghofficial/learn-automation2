package com.learn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver=driver;
	}
	
	private By input_username = By.xpath("//input[@name='username']");
	private By input_password = By.xpath("//input[@name='password']");
	private By button_login = By.xpath("//button[@type='submit']");
	
	public void enterUsername(String username) {
		driver.findElement(input_username).sendKeys(username);

	}
	
	public void enterPassword(String pswd) {
		driver.findElement(input_password).sendKeys(pswd);
	}
	
	public void clickLogin() {
		driver.findElement(button_login).click();
	}
	
}

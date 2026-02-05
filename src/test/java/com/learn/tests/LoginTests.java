package com.learn.tests;

import org.testng.annotations.Test;
import com.learn.pages.LoginPage;

import src.test.utils.ConfigReader;
import src.test.utils.Logger;

public class LoginTests extends BaseTest {

	@Test(groups = { "Sanity", "Regression" })
	void loginValidCredentialsTest() {
		System.out.println("Starting login test..");
		
		String userName=ConfigReader.getProperty("userName");
		loginPage2.enterUsername(userName);
		Logger.info("Entered the username..");
		
		String password=ConfigReader.getProperty("password");
		Logger.info("Entered the username..");
		loginPage2.enterPassword(password);
		loginPage2.clickLogin();

	}

	@Test(groups = { "Regression" })
	void loginInValidCredentialsTestTC01() {
		System.out.println("Starting Invalid login test..");
		loginPage2.enterUsername("wrong");
		loginPage2.enterPassword("admin123");
		loginPage2.clickLogin();

	}

}

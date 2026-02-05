package com.learn.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseTest {

	@Test
	void verifyHomeHeaderTest() throws InterruptedException {
		System.out.println("Starting home header test..");
		loginPage2.enterUsername("res");
		loginPage2.enterPassword("admin123");
		loginPage2.clickLogin();
		// Code for homepage header verification
		Thread.sleep(3000);
		String headerText = homePage.getDashboardHeader();
		System.out.println("Dashboard Header: " + headerText);
		Assert.assertEquals("Dashboard", headerText, "Header did not match with expected value!!");

	}

}

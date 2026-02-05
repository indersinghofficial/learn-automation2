package com.learn.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.learn.pages.HomePage;
import com.learn.pages.LoginPage;
import com.learn.pages.LoginPage2;
import com.learn.utils.DriverFactory;

import src.test.utils.ConfigReader;
import src.test.utils.TestListener;

public class BaseTest {

	// private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	// LoginPage loginPage;
	LoginPage2 loginPage2;
	HomePage homePage;

//	public WebDriver getDriver() {  
//		return driver.get();
//		}

	@BeforeMethod(alwaysRun = true)
	void driverSetUp() throws InterruptedException {
		System.out.println("Inside Before method");
		DriverFactory.setDriver();
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url=ConfigReader.getProperty("baseUrl");		
		DriverFactory.getDriver().get(url);
		TestListener.setDriver(DriverFactory.getDriver());
		loginPage2 = new LoginPage2(DriverFactory.getDriver());
		homePage = new HomePage(DriverFactory.getDriver());
		// Thread.sleep(5000);
	}

	@AfterMethod(alwaysRun = true)
	void closeBrowser() {
		System.out.println("Inside After method");
		DriverFactory.quitDriver();
	}
}

package com.learn.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SessionFourTests {
	WebDriver driver;

    @BeforeTest
    void startLog(){
        System.out.println("Inside BeforeTest method");
        System.out.println("Going to start test cases of classSession FourTests...");
    }

    @BeforeMethod
    void driverSetUp(){
        System.out.println("Inside Before method");
        driver = new ChromeDriver();
    }

    @Test
    void testCase1(){
        System.out.println("Inside test case 1");
        driver.get("https://www.google.com/");
    }

    @Test
    void testCase2(){
        System.out.println("Inside test case 2");
        driver.get("https://www.bloomberg.com/canada");
    }
    
    @AfterMethod
    void closeBrowser(){
        System.out.println("Inside After method");
        driver.close();
    }
}

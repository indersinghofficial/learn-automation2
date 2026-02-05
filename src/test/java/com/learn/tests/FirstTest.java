package com.learn.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	void test1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actualTitle=driver.getTitle();
		String expectedTitle="Orange HRM";
		System.out.println("Before assertion...");
		Assert.assertEquals(actualTitle,expectedTitle,"Title did not match with the requirement!!");
		System.out.println("Crossed first assert");
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle), "Title is incorrect");
	}
	
	@Test
	void test2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	void test3() {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Select dropdown_sort= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		WebElement input_username=driver.findElement(By.xpath("//input[@name='username']"));
		
	}
	
}

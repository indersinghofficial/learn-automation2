package com.learn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;

    private By label_dashboardHeader = By.xpath("//h6");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashboardHeader() {
        return driver.findElement(label_dashboardHeader).getText();
    }
    
    public boolean isDashboardHeaderDisplayed() {
    	return driver.findElement(label_dashboardHeader).isDisplayed();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

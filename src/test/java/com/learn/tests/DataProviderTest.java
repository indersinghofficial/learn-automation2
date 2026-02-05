package com.learn.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name="sampledp")
	public Object[][] dpMethod(){
		return new Object[][] {{"Apple",2,"red"},{"Oranges",5,"orange"},{"mango",10,"yellow"}};
	}
	
	@Test(dataProvider="sampledp")
	public void dataPTest(String itemName, int qty, String color) {
		System.out.println(("Item passed is "+itemName+". Qunatity is:"+qty+"Color:"+color));
	}
	
}

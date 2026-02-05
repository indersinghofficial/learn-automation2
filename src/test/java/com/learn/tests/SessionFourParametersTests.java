package com.learn.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SessionFourParametersTests {
	
	
	@Test
	@Parameters({"val1","val2"})
	public void addNumbersTest(int v1, int v2) {
		int sum= v1+v2;
		System.out.println("Sum is: "+sum);
	}

}

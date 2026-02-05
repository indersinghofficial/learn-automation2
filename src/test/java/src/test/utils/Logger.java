package src.test.utils;

import com.aventstack.extentreports.Status;

public class Logger {
	public static void info(String message) {
        TestListener.getTest().log(Status.INFO, message);
    }

    public static void pass(String message) {
        TestListener.getTest().log(Status.PASS, message);
    }

    public static void fail(String message) {
        TestListener.getTest().log(Status.FAIL, message);
    }

}

package com.Resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listener_class extends extendManager implements ITestListener {

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getName());

	}

	public void onTestSuccess(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test case passed is " + result.getName());
			// Test case passed is Fail
		}
	}

	public void onTestSkip(ITestResult result) {

		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test case skipped is " + result.getName());
		}
	}

	public void onTestFailure(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test case Failed is " + result.getName());
			test.log(Status.FAIL, "Test case failed is " + result.getThrowable()); // To throw Exception

			// String screenshotPath =
			// baseClass2.screenshot(baseClass2.driver,result.getName());

			// test.addScreenCaptureFromPath(screenshotPath); // Adding screen shot
		}
	}

}

package com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass  implements ITestListener{
	ExtentReports er;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String name = result.getName();
		test = er.createTest(name);

	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		test.log(Status.PASS,name+"----------->pass");


	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		test.log(Status.FAIL,name+"--------->fail");

	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		test.log(Status.SKIP,name+"--------->skip");


	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtendReport"+1+".html");

		esr.config().setDocumentTitle("Final Vtiger Report");

		esr.config().setTheme(Theme.DARK);
		esr.config().setReportName("Mani");

		er= new ExtentReports();

		er.attachReporter(esr);

		er.setSystemInfo("Operating System", "Windows");

		er.setSystemInfo("Language", "Java");



	}

	public void onFinish(ITestContext context) {
		er.flush();
	}
	

}

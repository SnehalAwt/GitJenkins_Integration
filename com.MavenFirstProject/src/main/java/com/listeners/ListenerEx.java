package com.listeners;

import org.apache.log4j.Logger;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenerEx implements ITestListener {
	private Logger log = Logger.getLogger(ListenerEx.class);
	public void onFinish(ITestContext context) {
		log.info("Test suite is fnished with  the execution");
		
	}

	public void onStart(ITestContext context) {
		log.info("Test suite is ready to start the execution");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("Testcase failed with name: "+result.getName());
		log.info("Testcase failed due to the reason:" +result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Testcase skipped with name: "+result.getName());
	}

	public void onTestStart(ITestResult result) {
		
		log.info("Testcase started with name: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		log.info("Testcase passed with name: "+result.getName());
	}
}
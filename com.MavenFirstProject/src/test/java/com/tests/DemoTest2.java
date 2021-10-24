package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoTest2 {
	WebDriver driver;
	private Logger log = Logger.getLogger(DemoTest.class);
	@Test
	public void test01(){
		log.info("opening a new chrome browser" );//console as well as n file
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	@Test
	public void test02(){
		log.info("inside test 2" );
		Assert.assertTrue(false);
	}
	@Test
	public void test03(){
		log.info("inside test 3" );
		throw new SkipException("skipping a test");
	}
}

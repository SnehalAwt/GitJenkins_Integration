package com.tests;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.Loginpage;
import com.pages.UserPage;

public class LoginPageTest {
	static WebDriver driver;
	Loginpage lp;
	static DashboardPage dp;
	
	private Logger log = Logger.getLogger(DemoTest.class);

	@BeforeSuite
	public void Setup() {
		log.warn("user should use valid driver file");
		log.info("opening a new chrome browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		lp = new Loginpage(driver);
	}

	@Test
	public void test01() {
		dp = lp.validlogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	
}

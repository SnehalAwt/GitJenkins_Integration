package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.Loginpage;
import com.pages.UserPage;

public class UserPageTest {
	WebDriver driver;
	Loginpage lp;
	
	static UserPage up;
	private Logger log = Logger.getLogger(DemoTest.class);
	@Test
	public void test01() {
		//DashboardPageTest.up
}
}
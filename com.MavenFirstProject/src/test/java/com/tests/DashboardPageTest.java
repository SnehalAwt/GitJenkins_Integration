package com.tests;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.Loginpage;
import com.pages.UserPage;

public class DashboardPageTest {
	WebDriver driver;
	Loginpage lp;
	static DashboardPage dp;
	static UserPage up;
	private Logger log = Logger.getLogger(DemoTest.class);
	
	@Test
	public void test02() {
		ArrayList<String> expectedcourses = new ArrayList<String>();
		 expectedcourses.add("Selenium");
		 expectedcourses.add("Java / J2EE");
		 expectedcourses.add("Python");
		 expectedcourses.add("Php");
		Assert.assertEquals(LoginPageTest.dp.verifyCourses(),expectedcourses );
	}
	@Test
	public void test03() {
		up=LoginPageTest.dp.clickUsersLink();
		Assert.assertEquals(LoginPageTest.driver.getTitle(),"JavaByKiran | User");
	}
}

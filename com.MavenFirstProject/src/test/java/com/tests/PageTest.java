package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;

public class PageTest {
	WebDriver driver;
	Loginpage lp=null;
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}
	@Test
	
	public void test01(){
		Loginpage lp=new Loginpage(driver);
		lp.validlogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}

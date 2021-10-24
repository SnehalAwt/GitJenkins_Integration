package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(id = "email")
	private WebElement uname;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//button")
	private WebElement loginbutton;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DashboardPage validlogin() {
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginbutton.click();
		return new DashboardPage(driver);
	}

}

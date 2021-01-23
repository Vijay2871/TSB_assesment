package com.practicetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletestng {
	
	WebDriver driver;
	@Test
	public  void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}

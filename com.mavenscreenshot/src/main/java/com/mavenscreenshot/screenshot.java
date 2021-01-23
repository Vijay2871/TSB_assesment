package com.mavenscreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.screenshts;

public class screenshot {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.1-day.co.nz/orderlist.do");
		screenshts.capturescreenshot(driver,"launch");
		driver.findElement(By.xpath("//button[@type='button' and @id='cboxClose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div[1]/input")).sendKeys("jmeter");
		
		screenshts.capturescreenshot(driver,"home");
		driver.quit();
	}
}

package com.goosamp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class goosamp {
	WebDriver driver;
	@Test
	public  void method() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		
     driver.get("https://www.tmsandbox.co.nz/motors/used-cars/bmw/auction-2149241194.htm");
     Thread.sleep(2000);
     driver.manage().window().maximize();
     
     WebElement nplate=driver.findElement(By.xpath("//label[normalize-space()='Number plate']"));
    String n=nplate.getText();
    Assert.assertEquals(n,"Number plate");
    System.out.println("Passed");
     //List<WebElement> list = driver.findElements(By.xpath("//label[normalize-space()='Number plate']"));
    // System.out.println("Number of elements:" +list);//
	}

	}



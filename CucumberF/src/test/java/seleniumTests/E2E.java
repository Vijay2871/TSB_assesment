package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {
	private static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
					
	     driver.get("https://www.tmsandbox.co.nz/ ");
	    driver.findElement(By.xpath("//a[@id=\"SearchTabs1_MotorsLink\"]")).click();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    driver.findElement(By.xpath("//input[@id=\"searchString\"]")).sendKeys("BMW");
	     driver.findElement(By.xpath("//button[@type=\"submit\" and @value=\"Search\"]")).click();
	     try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     driver.findElement(By.xpath("//div[@class=\"tmm-search-card-list-view__title tmm-search-card-list-view__title--bold\"]")).click();
	     
	     WebElement nplate=driver.findElement(By.xpath("//label[normalize-space()='Number plate']"));
	    String n=nplate.getText();
	   
	    System.out.println(n);

	}

}

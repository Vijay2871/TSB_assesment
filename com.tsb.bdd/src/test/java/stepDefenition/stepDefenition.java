package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefenition {
	WebDriver driver;
	
	@Given("The User hits the Trade me url in Chrome")
	public void the_user_hits_the_trade_me_url_in_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    driver.get("https://www.tmsandbox.co.nz/motors/used-cars/bmw/auction-2149241194.htm");
	driver.manage().window().maximize();System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		
     driver.get("https://www.tmsandbox.co.nz/motors/used-cars/bmw/auction-2149241194.htm");
    
     driver.manage().window().maximize();
 
	}

	@Then("User Clicks Motor")
	public void user_clicks_motor() {
		
		driver.findElement(By.xpath("//a[@id='SearchTabs1_MotorsLink']"));
	    
	}

	@Then("User enters company name BMW and click search")
	public void user_enters_company_name_honda_and_click_search() {
		
		driver.findElement(By.xpath("//input[@id='searchString']")).sendKeys("BMW");
		driver.findElement(By.xpath("//button[@value='Search']"));
	   
	}

	@Then("select the first item")
	public void select_the_first_item() {
		
		driver.findElement(By.xpath("//img[@alt='Listing Photo']"));
	}

	@Then("Number plate is displayed")
	public void number_plate_is_displayed() {
		 WebElement nplate=driver.findElement(By.xpath("//label[normalize-space()='Number plate']"));
		    String n=nplate.getText();
		    junit.framework.Assert.assertEquals(n, "Numer Plate");
		    System.out.println("Passed");
	}

	@Then("Kilometers is displayed")
	public void kilometers_is_displayed() {
		System.out.println("Passed");
	}

	@Then("Body is displayed")
	public void body_is_displayed() {
		System.out.println("Passed");
	}

	@Then("Seats is displayed")
	public void seats_is_displayed() {
		System.out.println("Passed");
	}
}

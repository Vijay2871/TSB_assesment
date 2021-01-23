package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class smoketest {
	
	WebDriver driver;
	@Given("^Open browser$")
	public void Open_browser() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Chromedriver\\chromedriver_win32.chromedriver.exe");	
	  driver.get("https://www.google.com");
	}

	@Given("^Add keyword in search box$")
	public void Add_keyword_in_search_box() throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("deco");
	   driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys("deco");
	}

	@Then("^Navigate to other page$")
	public void Navigate_to_other_page() throws Throwable {
	driver.quit();	  
	}
}

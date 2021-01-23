package stepdefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class steps {
	WebDriver driver;
	@Given("The User hits the Trade me url in Chrome")
	public void the_user_hits_the_trade_me_url_in_chrome() {
		driver=new ChromeDriver();
		driver.get("https://www.tmsandbox.co.nz/motors/used-cars/bmw/auction-2149241194.htm");
	    System.out.println("abc");
	}

	@Then("User Clicks Motor")
	public void user_clicks_motor() {
		   System.out.println("abc");
	}

	@Then("User enters company name BMW and click search")
	public void user_enters_company_name_bmw_and_click_search() {
		   System.out.println("abc");
	}

	@Then("select the first item")
	public void select_the_first_item() {
		   System.out.println("abc");
	}

	@Then("Number plate is displayed")
	public void number_plate_is_displayed() {
		   System.out.println("abc");
	}

	@Then("Kilometers is displayed")
	public void kilometers_is_displayed() {
	   
	}

	@Then("Body is displayed")
	public void body_is_displayed() {
	
	}

	@Then("Seats is displayed")
	public void seats_is_displayed() {
	    
	}

}

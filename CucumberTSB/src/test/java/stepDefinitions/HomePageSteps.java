package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.Homepage;

public class HomePageSteps {
	
	
	 Homepage homepage;
	 TestContext testContext;
	 
	 public HomePageSteps(TestContext context) {
		 testContext = context;
		 homepage = testContext.getPageObjectManager().getHomepage();
		 }
	 
	@Given("^User clicks the Trademe Sandbox url$")
	public void user_clicks_the_Trademe_Sandbox_url() throws Throwable {
		
		 homepage.navigateTo_HomePage();
}
}

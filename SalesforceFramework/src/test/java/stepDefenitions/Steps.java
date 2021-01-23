package stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	@Given("^Launched the chrome browser entering the salesforce url$")
	public void launched_the_chrome_browser_entering_the_salesforce_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\Chromedriver\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");	
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}

	@When("^I entered my valid  <username> and <password>$")
	public void i_entered_my_valid_username_and_password(DataTable arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@class='input r4 wide mb16 mt8 username']")).sendKeys("18030625@student.agi.ac.nz");
		driver.findElement(By.xpath("//*[@class='input r4 wide mb16 mt8 password']")).sendKeys("Salesforce1");
		Thread.sleep(3000);
	}

	@Then("^I click the login button to see my homepage$")
	public void i_click_the_login_button_to_see_my_homepage() throws Throwable {
		driver.findElement(By.xpath("//*[@class='button r4 wide primary']")).click();
		driver.findElement(By.xpath("//a[text()='Remind Me Later']")).click();
	}

	@When("^I clicked the App launcher features$")
	public void i_clicked_the_App_launcher_features() throws Throwable {
		driver.findElement(By.xpath("//*[@class='slds-icon-waffle']")).click();
	}

	@Then("^I selected services option to navigate to service page$")
	public void i_selected_services_option_to_navigate_to_service_page() throws Throwable {
		driver.findElement(By.xpath("//p[text()='Service']")).click();
	}

	@Then("^I click the Accounts and created a new account$")
	public void i_click_the_Accounts_and_created_a_new_account() throws Throwable {
		driver.findElement(By.xpath("//*[text()='Accounts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='New Account']")).click();
	}

	@Then("^I fill the mandatory details$")
	public void i_fill_the_mandatory_details() throws Throwable {
		driver.findElement(By.xpath("//*[@type='text' and @class='slds-input slds-combobox__input']")).sendKeys("Kaka");
	}
}

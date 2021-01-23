package stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.Confirmorder;
import pageObjects.Createorderpage;
import pageObjects.Finalsave;
import pageObjects.Loginpage;


public class purchaseordertest {
	
	WebDriver driver;
	  Loginpage loginpage;
	  Createorderpage createorderpage;
	  Confirmorder confirmorder;
	  Finalsave finalsave;
	  PageObjectManager pageObjectManager;
	  ConfigFileReader configFileReader;
	  WebDriverManager webDriverManager;
	  
	 @Given("^Open chrome and start the dynamics web page$")
	public void open_chrome_and_start_the_dynamics_web_page() throws Throwable {
		 configFileReader= new ConfigFileReader();
		 webDriverManager = new WebDriverManager();
		 driver = webDriverManager.getDriver();
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationurl());
	  
	}

	@When("^I enter valid \"(.*?)\" and click the ok button$")
	public void i_enter_valid_and_click_the_ok_button(String arg1) throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		loginpage= pageObjectManager.getLoginPage();
		loginpage.setusername();
	  
	}

	@Then("^I can enter the valid \"(.*?)\" and click the ok button$")
	public void i_can_enter_the_valid_and_click_the_ok_button(String arg1, DataTable arg2) throws Throwable {

		pageObjectManager = new PageObjectManager(driver);
		loginpage= pageObjectManager.getLoginPage();
		loginpage.setpassword();

	}

	@Then("^I clicked the clicked the signin button to enter the dashboard$")
	public void i_clicked_the_clicked_the_signin_button_to_enter_the_dashboard() throws Throwable {

		pageObjectManager = new PageObjectManager(driver);
		loginpage= pageObjectManager.getLoginPage();
		loginpage.reminderclick();
		
	}

	@Then("^Click the navigation panel and accounts payable and all purchase order$")
	public void click_the_navigation_panel_and_accounts_payable_and_all_purchase_order() throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		 createorderpage=pageObjectManager.getCreateorderPage();
		createorderpage.creatingorders();
		
	}

	@Then("^click the new purchase order$")
	public void click_the_new_purchase_order() throws Throwable {
		createorderpage=pageObjectManager.getCreateorderPage();
		createorderpage.neworder();
	}

	@Then("^enter \"(.*?)\"  and \"(.*?)\"$")
	public void enter_and(String arg1, String arg2, DataTable arg3) throws Throwable {
		 confirmorder=pageObjectManager.getconfirmorder();
		confirmorder.confirmingorders();
		
	}

	@Then("^click the ok button$")
	public void click_the_ok_button() throws Throwable {
		confirmorder=pageObjectManager.getconfirmorder();
		confirmorder.confirmok1();
	}

	@Then("^enter the item number$")
	public void enter_the_item_number() throws Throwable {
		 finalsave=pageObjectManager.getfinalsave();
		finalsave.setitemnumber();
		
		
	}

	@Then("^save and confirm the purchase order$")
	public void save_and_confirm_the_purchase_order() throws Throwable {
		
		 finalsave=pageObjectManager.getfinalsave();
		finalsave.clickconfirmfinal();
		
	}
}

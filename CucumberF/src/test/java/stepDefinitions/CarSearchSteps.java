package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.Dashboardpage;

public class CarSearchSteps {

	TestContext testContext;
	Dashboardpage dashboardpage;
	
	public CarSearchSteps(TestContext context) {
		testContext = context;
		dashboardpage = testContext.getPageObjectManager().getDashboardpage();
	}
	
	
	@When("^he clicks the Motors icon on the home page$")
	public void he_clicks_the_Motors_icon_on_the_home_page() throws Throwable {
		
		dashboardpage.clickmotor();
	}

	@When("^searches BMW and click search button$")
	public void searches_BMW_and_click_search_button() throws Throwable {
		
		dashboardpage.searchcar();
		dashboardpage.clicksearch();
	}

	@When("^select the first element$")
	public void select_the_first_element() throws Throwable {
		
		dashboardpage.selectitem();
	}

}

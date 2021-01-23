package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.Finalpage;

public class VerifySteps {

	TestContext testContext;
	Finalpage finalpage;
	
	 public VerifySteps(TestContext context) {
		 testContext = context;
		 finalpage = testContext.getPageObjectManager().getFinalpage();
		 }
	 
	@When("^Verify the term Number Plate in the page$")
	public void verify_the_term_Number_Plate_in_the_page() throws Throwable {
		finalpage.numberplatecheck();
		
		
	}

	@When("^Verify the term Kilometres in the page$")
	public void verify_the_term_Kilometres_in_the_page() throws Throwable {
		
		finalpage.kilometercheck();
		
	}

	@When("^Verify the term Body in the page$")
	public void verify_the_term_Body_in_the_page() throws Throwable {
		finalpage.bodycheck();
		
	}

	@When("^Verify the term Seats in the page$")
	public void verify_the_term_Seats_in_the_page() throws Throwable {
		
		finalpage.seatcheck();
		 
	}
}

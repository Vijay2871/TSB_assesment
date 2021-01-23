package Steps;

import cucumber.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.InfoIcon;

public class Infosteps {
    WebDriver driver;
    InfoIcon infoicon;
    ConfigFileReader configFileReader;
    TestContext testContext;


    public Infosteps(TestContext context) {
        testContext = context;
        infoicon = testContext.getPageObjectManager().getInfoIcon();
    }



    @Given("User navigate to the home page")
    public void userNavigateToTheHomePage() {
        infoicon.seturl();
    }

    @Given("Click the kiwisaver calculator")
    public void click_the_kiwisaver_calculator() {
        try {
            infoicon.kiwicalculator();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            infoicon.kiwicalculatoroption();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            infoicon.kiwicalculatoroptionclick();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Click the information icon messgae")
    public void click_the_information_icon_messgae() {
        System.out.println("3rd");

    }

    @Then("User sees the following message")
    public void user_sees_the_following_message() {
        System.out.println("4th");
    }
}

package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.Dashboardpage;
import pageObjects.Finalpage;
import pageObjects.Homepage;

public class PageObjectManager {
	 private WebDriver driver;
	 private Dashboardpage dashboardpage;
	 private Homepage homepage;
	 private Finalpage finalpage;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	 
	 public Homepage getHomepage() {
			return (homepage == null) ? homepage = new Homepage(driver) : homepage;
		}
	
	 
	 
	 public Dashboardpage getDashboardpage(){
		 
		 return (dashboardpage == null) ? dashboardpage = new Dashboardpage(driver) : dashboardpage;
		 
		 }
	 
	 public Finalpage getFinalpage() {
			return (finalpage == null) ? finalpage = new Finalpage(driver) : finalpage;
		}

	
}


package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Dashboardpage {
	WebDriver driver;
	 public Dashboardpage(WebDriver driver) {
		 this.driver = driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//a[@id='SearchTabs1_MotorsLink']")
	 private WebElement motorsclick;
	 
	 @FindBy(xpath = "//input[@id='searchString' and @name='searchString']")
	 private WebElement carsearch; 
	 
	 @FindBy(xpath = "//span[@class='icon-search-large']")
	 private WebElement hitsearch;
	 
	 @FindBy(xpath = "//img[@alt='Listing Photo']")
	 private WebElement selectcar;
	 
	 
	 public void clickmotor() {
		 motorsclick.click();
		
	 }
	 
	 public void searchcar() {
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		 carsearch.sendKeys(FileReaderManager.getInstance().getConfigReader().getKeywordsearch());
	 }
	 
	 public void clicksearch() {
		 hitsearch.click();
	 }
	 
	 public void selectitem() {
		 
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 selectcar.click();
	 }
	 
	 
	 
	 
	 
	 
	 }
	 
	 
	 


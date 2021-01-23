package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createorderpage {
WebDriver driver;
	
	public Createorderpage(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	@FindBy(xpath="//*[@aria-label=\"Show navigation pane\"]") 
	WebElement navigclick;
	@FindBy(xpath="//*[@data-dyn-title=\"Accounts payable\"]") 
	WebElement accpayclick;
	@FindBy(xpath="//*[@data-dyn-title=\"All purchase orders\"]")
	WebElement allpurchclick;
	@FindBy(xpath="//*[@class=\"button-commandRing New-symbol\"]")
	WebElement neworderclick;
	
	
	public void navigationclk()  
	{
	
		navigclick.click();
		
		
	}
	
	public void accountspay()  
	{
	
		accpayclick.click();
	}
	
	public void allpurchaseord()  
	{
		
		allpurchclick.click();
		
	}
	
	public void neworder()  
	{
		
		neworderclick.click();
		
	}
	
}

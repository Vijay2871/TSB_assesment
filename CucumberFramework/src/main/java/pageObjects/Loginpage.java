package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	WebDriver driver;
	
	public void LoginPage(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	@FindBy(name="loginfmt") WebElement txtuname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void setusername(String uname)  
	{
		txtuname.sendKeys(uname);
		uclick.click();
		
		
	}
	
	public void setpassword(String pwd)  
	{
		txtpass.sendKeys(pwd);
		
		loginbtn.click();
	}
	
	public void reminderclick()  
	{
		
		remclick.click();
		
	}
	
}
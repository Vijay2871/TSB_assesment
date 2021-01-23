package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Loginpage {

	WebDriver driver;
	
	public  Loginpage(WebDriver ldriver) 
	{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
	@FindBy(name="loginfmt") WebElement txtuname;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement uclick;
	@FindBy(name="passwd") WebElement txtpass;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"idSIButton9\"]") WebElement remclick;
	
	
	public void seturl() {
		
		 driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationurl());
	}
	
	public void setusername()  
	{
		txtuname.sendKeys("18030625@student.agi.ac.nz");
		uclick.click();
		
		
	}
	
	public void setpassword()  
	{
		txtpass.sendKeys("5t4rnc");
		
		loginbtn.click();
	}
	
	public void reminderclick()  
	{
		
		remclick.click();
		
	}
	public void loginAsValidUser() {
		seturl();
        setusername();
        setpassword();
        reminderclick();
    }
	
}
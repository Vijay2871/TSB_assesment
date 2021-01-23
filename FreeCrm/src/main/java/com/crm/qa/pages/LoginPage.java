package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
@FindBy(name="username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
WebElement loginbtn;


public LoginPage(){

	PageFactory.initElements(driver, this);
}

public String validateLoginPagetitle() {
	return driver.getTitle();
}

public HomePage login(String un, String pas) {

	username.sendKeys(un);
	password.sendKeys(pas);
	loginbtn.click();
	return new HomePage();
}



}



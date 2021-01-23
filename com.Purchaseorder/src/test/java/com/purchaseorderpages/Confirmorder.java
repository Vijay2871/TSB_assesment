package com.purchaseorderpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmorder {
WebDriver driver;
	
	public Confirmorder(WebDriver ldriver) 
	{
	this.driver=ldriver;
}
	
	@FindBy(xpath="//*[@name=\"PurchTable_OrderAccount\"]") WebElement vendor;
	@FindBy(xpath="//*[@name=\"PurchTable_InventSiteId\"]") WebElement site;
	@FindBy(xpath="//*[@id=\"PurchCreateOrder_3_OK_label\"]") WebElement confirm;
	@FindBy(xpath="//*[@name=\"PurchLine_ItemId\"]") WebElement item;		
	
	
	public void confirmdetails(String vendorname,String sitename,String itemname)  {
		vendor.sendKeys(vendorname);
		site.sendKeys(sitename);
		confirm.click();
		item.sendKeys(itemname);
		
			
}
}
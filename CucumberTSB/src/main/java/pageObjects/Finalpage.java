package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Finalpage {
	 WebDriver driver;
	 
	 public Finalpage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 public void numberplatecheck() {
		 
		 driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		
		 WebElement n= driver.findElement(By.xpath("//label[normalize-space()='Number plate']"));
		 String np= n.getText();

		 driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		
		 
	Assert.assertEquals(np,FileReaderManager.getInstance().getConfigReader().getNumberPlate());
	 System.out.println("Number Plate is displayed");
		 }
	 
	 public void kilometercheck() {
		 
		 driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		 
		
		 WebElement k= driver.findElement(By.xpath("//label[normalize-space()='Kilometres']"));
		 String km= k.getText();
		 
					
			Assert.assertEquals(km,FileReaderManager.getInstance().getConfigReader().getKilometer());
			System.out.println("Kilometres is displayed");
		
				 }
	 
	 public void bodycheck() {
		 WebElement bo= driver.findElement(By.xpath("//label[normalize-space()='Body']"));
		 String b= bo.getText();
			
			Assert.assertEquals(b,FileReaderManager.getInstance().getConfigReader().getBody());
			System.out.println("Body is displayed");
				 }
	 
	 public void seatcheck() {
		 WebElement sc= driver.findElement(By.xpath("//label[normalize-space()='Seats']"));
		 String s= sc.getText();
			
			Assert.assertEquals(s,FileReaderManager.getInstance().getConfigReader().getSeats());
			System.out.println("Seats is displayed");
				 }

}

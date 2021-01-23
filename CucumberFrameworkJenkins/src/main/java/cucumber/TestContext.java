package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	 private PageObjectManager pageObjectManager;
	 
	 public TestContext(){
		
		 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	 }


	public PageObjectManager getPageObjectManager() {
		 return pageObjectManager;
		 }
	 
}

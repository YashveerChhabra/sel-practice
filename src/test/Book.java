package test;




import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.HomePage;
import page.SearchPage;
import utilities.CommonUtility;

public class Book {
		
	
		WebDriver driver;
		HomePage hp= new HomePage();
		SearchPage sp= new SearchPage();
		
		@BeforeTest
		public void startBrowser()  {
		driver= CommonUtility.getDriver();
		
		}

		@Test
		public void Booking() {
		hp.enterFrom(driver);
		hp.enterTo(driver);
		hp.clicksearch(driver);
		sp.clickBtn(driver);
		
		}
	

}

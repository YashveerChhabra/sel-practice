package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class CommonUtility {
				
		static WebDriver driver;
		
		@BeforeSuite
		@Parameters({"browser"})
		public void launchBrowser(String b1)  {
		switch(b1) {
		
		case "chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ychhabra\\Downloads\\Tools\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-incognito");
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//driver= new ChromeDriver(capabilities);
		Properties prop= new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\ychhabra\\eclipse-workspace\\PracticeSel\\src\\resources\\data.properties");
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		driver= new ChromeDriver(options);
		driver.get(prop.getProperty("baseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		break;
		
		case "firefox":
			
			//for firefox
		}
	}
		
		public static WebDriver getDriver() {
			return driver;
		}
	
	//////////////////////
		
		
		
		
		
		
		
		
		
}

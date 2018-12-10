package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;




public class HomePage {

		
	By frombox=  By.id("hp-widget__sfrom");
	By Searchbox= By.id("searchBtn");
	
	 @FindBy(xpath="//input[@id=\"hp-widget__sTo\"]")
	 private WebElement tobox;
//	 "//*[@class='top_first_part clearfix']/div[7]/p/a"
	 
	 
	 
	public void enterFrom(WebDriver driver) {
		WebElement fromb= driver.findElement(frombox);
		
		Actions builder = new Actions(driver);
		Action clk= builder.moveToElement(fromb).click().sendKeys(fromb,"Bbbangalore").build();
		clk.perform();
	}
	
	public void enterTo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	//	Actions builder = new Actions(driver);
	//	Action clk= builder.moveToElement(tobox).click().sendKeys(tobox,"dddelhi").build();
	//	clk.perform();
		tobox.click();
		tobox.sendKeys("delhi");
		
	}
	
	public void clicksearch(WebDriver driver) {
		driver.findElement(Searchbox).click();
		System.out.println(driver.getTitle());
	}
	
	
}
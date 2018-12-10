package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage {

	By bookBtn = By.xpath("//*[@class='top_first_part clearfix']/div[7]/p/a");
	
	public void clickBtn(WebDriver driver) {
		driver.findElement(bookBtn).click();
	}
}

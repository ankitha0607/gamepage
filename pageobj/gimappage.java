package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gimappage {

	WebDriver driver;
	
	By characteroption = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/a[3]");
	
public gimappage(WebDriver driver) {
		
		this.driver = driver;
	}
	
public void clickoncharacterbutton() {
	driver.findElement(characteroption).click();
}
}

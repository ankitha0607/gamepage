package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class gicharacterpage {
 WebDriver driver;
 
 By newsoption = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/a[2]");
 
 public gicharacterpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
public void clickonnewsoption() {
	driver.findElement(newsoption).click();;
	
}
 
}

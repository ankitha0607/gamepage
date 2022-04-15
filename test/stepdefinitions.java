package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobj.gimappage;
import pageobj.gicharacterpage;

public class stepdefinitions {

  WebDriver driver;
  
  

  @Given("I am on the genshin map page")
  public void i_am_on_the_genshin_map_page() {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://genshin.hoyoverse.com/en/map");
     
  }
  @When("I click on the character menu")
  public void i_click_on_the_character_menu() throws InterruptedException {
	  gimappage page1 = new gimappage(driver);
	  Thread.sleep(100);
	  page1.clickoncharacterbutton();
     
  }
  
      


  @Then("I click on the news menu")
  public void i_click_on_the_news_menu() throws InterruptedException {
      gicharacterpage page2 = new gicharacterpage(driver);
      Thread.sleep(100);
      page2.clickonnewsoption();
  }
  


  @Then("I close the driver")
  public void i_close_the_driver() {
    driver.close();
  }









}

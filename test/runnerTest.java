package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\gi\\src\\test\\java\\resources\\", 
        glue = "/test"
        
        
		)

public class runnerTest {

}

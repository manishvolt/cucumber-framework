package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:Feature", //path of feature file
		glue="StepDefinitions",   //path of stepdefinition file
		tags="",
		plugin={"pretty","html:target/html/","json:target/json/file.json",}, 
	    monochrome = true,   //display the console output in proper readable format
		dryRun=false
		
		)
public class Run {

}

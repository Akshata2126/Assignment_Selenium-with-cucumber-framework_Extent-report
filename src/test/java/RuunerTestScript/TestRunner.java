package RuunerTestScript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features ="feature", 
		glue = {"StepDescription"})
		
public class TestRunner {

}

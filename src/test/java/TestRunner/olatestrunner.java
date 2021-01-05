package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/Feature/ola.feature"
,glue= {"Stepdefinition","Utilities"}, 
dryRun=false, 
monochrome = true,  
plugin = { "pretty", "html:target/cucumber-pretty"})

public class olatestrunner {

}

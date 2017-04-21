package com.fannie.cucumber_stepdefinitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/com/fannie/cucumber_features",
		glue = "com.fannie.cucumber_stepdefinitions",
		plugin = { 
					"pretty",
					"html:target/sdettrainingcucumber",
				} 
		
		)
public class RunCucumberTests {

}

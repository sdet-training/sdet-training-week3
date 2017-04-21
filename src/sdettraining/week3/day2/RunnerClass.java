package sdettraining.week3.day2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 *      features = "src/test/java/com/Features",
	    glue = "com.StepDefinitions",
	    tags = { "~@smoke","~@notImplemented","@sanity", "@important" },
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(  
	       
	       dryRun = false,
	       strict = false,
	       monochrome = true,
	       plugin = { "pretty",
	    		      "html:target/Cucumber",
	    	          "json:target_json/Cucumber.json",
	    	          "junit:target_junit/Cucumber_junit.xml"
	        }
	    )
public class RunnerClass {

}

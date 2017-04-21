package sdettraining.week3.day2;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class D2_001a_ {
	
	@Given("^user is on \"(.*)\" page$")
	public void user_is_on_Application_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code for Given: user is on Application landing page....will come here");
	}

	@When("^user clicks \"(.*)\" button$")
	public void user_clicks_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code for When: user clicks Sign in button....will come here");
	}

	@Then("^user is on \"(.*)\" screen$")
	public void user_is_on_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Code for Then: user is on login screen....will come here");
	}
	
	

}

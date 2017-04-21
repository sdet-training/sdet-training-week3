package sdettraining.week3.day2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class D2_002_ {
	
	@Then("^I( do not see| see) following dollars in my account$")
	public void I_see_or_do_not_see_following_dollars_in_my_account(String seeOrDoNotSee) {
	    //print the value of capture group
	System.out.println(seeOrDoNotSee);
	}
	  
	@Given("^(?:I have|He has|User has) following dollars in my account$")
	public void have_following_dollars_in_my_account() {
	    
	    // Non Capture groups are not captured in Step
	}

}

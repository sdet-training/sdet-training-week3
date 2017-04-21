package sdettraining.week3.day2;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class D2_004_ {
	
	@Given("^user is on Application home page$")
	public void user_is_on_Application_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^Sign in button is present on screen$")
	public void sign_in_button_is_present_on_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user clicks on \"(.*)\" button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user is displayed \"(.*)\" screen$")
	public void user_is_displayed_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" in username field$")
	public void user_enters_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^user enters \"([^\"]*)\" in password field$")
	public void user_enters_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^title of home page is \"([^\"]*)\"$")
	public void title_of_home_page_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
	/*
	@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(DataTable users) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	
		List<List<String>> details = users.raw();

		  for (int i = 1; i < details.size(); i++) {
		    for (int j = 0; j < details.get(i).size(); j++) {
		    System.out.println(details.get(i).get(j)+ "\r\n");
		    }
		  }
	}
	*/
	
	@Then("^we verify following user exists$")
	public void we_verify_following_user_exists(List<User> userList) {
	    for (User usr : userList) {
	    	String name = usr.name;
	    	String email=usr.email;
	    	String joinDate = usr.joinDate;
	      
	    	System.out.println(name);
	        System.out.println(email);
	        System.out.println(joinDate);
	    }
	  }
	
	
	
	
}

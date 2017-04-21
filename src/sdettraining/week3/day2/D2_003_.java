package sdettraining.week3.day2;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.activation.*;

public class D2_003_ {
	
	String role;

	@Given("^I have a user account with (.*?) rights$")
	public void i_have_a_user_account_with_Manager_rights(String role) {
	    
		this.role=role;
	   //prints the role
	  System.out.println(role);

	}

	@Then("^I should receive an email with the body:$")
	public void i_should_receive_an_email_with_the_body(String docString) {
	    
	  /* prints the content of Doc String with Scenario 
	  outlineSubstitution */
	  System.out.println(docString);
	  
	  sendEmail(role, docString);
	}
	
   public void sendEmail(String role, String docString) {
     
	   final String username = "trainingrite@gmail.com";
		final String password = "49965006HRM";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("sdettraining@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("hafeez_itm@yahoo.com"));
			message.setSubject("Testing Subject " + role);
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please! " + docString);

			Transport.send(message);

			System.out.println("Done sending email to: " + role);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	   
	   
	   
}

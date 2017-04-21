package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D4_002_POM_C5_OrderConfirmation {
	
	public void GetConfirmation(WebDriver driver){
        String OrderConfirmationMessage = driver.findElement(By.cssSelector("h2")).getText();
	    System.out.println("Order Confirmation Details:" + OrderConfirmationMessage);
	}


}

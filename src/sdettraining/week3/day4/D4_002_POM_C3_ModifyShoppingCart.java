package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D4_002_POM_C3_ModifyShoppingCart {
	
	public void ModifyCart(WebDriver driver){
		driver.findElement(By.name("txtItemQty1")).clear();
	    driver.findElement(By.name("txtItemQty1")).sendKeys("3");
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[2]")).click();
        // next line is clicking on proceed to checkout
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	    System.out.println("Executed ModifyShoppingCart Functionality Successfully!");
	}


}

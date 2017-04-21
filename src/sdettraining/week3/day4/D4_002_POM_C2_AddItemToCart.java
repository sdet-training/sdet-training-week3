package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D4_002_POM_C2_AddItemToCart {
	public void AddItem(WebDriver driver){
		driver.findElement(By.xpath("//td[3]/a/img")).click();
	}

}

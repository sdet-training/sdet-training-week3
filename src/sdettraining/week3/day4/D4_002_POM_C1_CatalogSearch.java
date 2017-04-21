package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D4_002_POM_C1_CatalogSearch {
	
	public void SearchItem(WebDriver driver, String ItemToSearch){
	    
	    driver.findElement(By.name("txtSearch")).clear();
	    driver.findElement(By.name("txtSearch")).sendKeys(ItemToSearch);
	    driver.findElement(By.cssSelector("input[type=\"image\"]")).click();
	    System.out.println("Executed SearchCatalog Functionality Successfully!");
}


}

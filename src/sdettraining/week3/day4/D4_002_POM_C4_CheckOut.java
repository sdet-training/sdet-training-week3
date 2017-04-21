package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class D4_002_POM_C4_CheckOut {
	
	public void CustomerInformation(WebDriver driver){
	    driver.findElement(By.name("txtCustomerName")).clear();
	    driver.findElement(By.name("txtCustomerName")).sendKeys("Irfan");
	    driver.findElement(By.name("txtAddress")).clear();
	    driver.findElement(By.name("txtAddress")).sendKeys("123 Main St");
	    driver.findElement(By.name("txtCity")).clear();
	    driver.findElement(By.name("txtCity")).sendKeys("Manhattan");
	    driver.findElement(By.name("txtState")).clear();
	    driver.findElement(By.name("txtState")).sendKeys("NY");
	    driver.findElement(By.name("txtZIP")).clear();
	    driver.findElement(By.name("txtZIP")).sendKeys("10018");
	    driver.findElement(By.name("txtPhone")).clear();
	    driver.findElement(By.name("txtPhone")).sendKeys("212551212");
	    System.out.println("Executed CheckOut-Customer Information Functionality Successfully!");
}

public void PaymentInformation(WebDriver driver){
	driver.findElement(By.name("optPaymentType")).click();
    driver.findElement(By.name("txtAcctNo")).clear();
    driver.findElement(By.name("txtAcctNo")).sendKeys("5465464654544");
    driver.findElement(By.name("txtCVV2No")).clear();
    driver.findElement(By.name("txtCVV2No")).sendKeys("123");
    driver.findElement(By.name("txtExpDate")).clear();
    driver.findElement(By.name("txtExpDate")).sendKeys("12/2015");
    System.out.println("Executed CheckOut-Payment Information Functionality Successfully!");
}

public void ShippingInformation(WebDriver driver){
	    driver.findElement(By.name("txtshipCustomerName")).clear();
	    driver.findElement(By.name("txtshipCustomerName")).sendKeys("Irfan");
	    driver.findElement(By.name("txtshipAddress")).clear();
	    driver.findElement(By.name("txtshipAddress")).sendKeys("144 Fairway Terr");
	    driver.findElement(By.name("txtshipCity")).clear();
	    driver.findElement(By.name("txtshipCity")).sendKeys("Paramus");
	    driver.findElement(By.name("txtshipState")).clear();
	    driver.findElement(By.name("txtshipState")).sendKeys("NJ");
	    driver.findElement(By.name("txtshipZIP")).clear();
	    driver.findElement(By.name("txtshipZIP")).sendKeys("07652");
	    driver.findElement(By.name("txtshipPhone")).clear();
	    driver.findElement(By.name("txtshipPhone")).sendKeys("7329986650");
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	    System.out.println("Executed CheckOut-Shipping Information Functionality Successfully!");
}


}

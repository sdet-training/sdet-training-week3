package sdettraining.week3.day4;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.Log;

public class D4_001a_testNG_DataProvider_ShoppingCart {

	@DataProvider
	public Object[][] testdata_shoppingCart(){
		return new Object[][]{
				new Object[]{"IPhone", "2", "Adam", "MIAMI BEACH", "FL"},
				new Object[]{"TV", "3", "Brett", "MANHATTAN", "NY"},
				new Object[]{"Canon", "4", "Christene", "ALPHARETTA", "GA"},
				new Object[]{"Camera", "5", "David","BOSTON", "MA"}
		};
	}
	
	
	@Test(dataProvider="testdata_shoppingCart")
	public void tc_shoppingCartTesting(String item2Search, String qty, String customerName, String customerCity, String customerState) throws InterruptedException, IOException{
		String TestCaseName = "tc_shoppingCartTesting";
		String AUT_URL = "http://sdettraining.com/online";
		String runTestInBrowser="FF";
		WebDriver driver;
		
		//DOMConfigurator.configure("log4j.xml");
		System.out.println("TestCase Name is: + TestCaseName");
		//Log.startTestCase(TestCaseName);
		
		driver = ReUsableFunctions.OpenBrowser(runTestInBrowser, AUT_URL);
		System.out.println("Opening Browser: " + runTestInBrowser);
		//Log.info("Opening Browser: " + runTestInBrowser);
		/*
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://sdettraining.com/online");
		Thread.sleep(3000);
		*/
		
		
		driver.findElement(By.name("txtSearch")).clear();
	    driver.findElement(By.name("txtSearch")).sendKeys(item2Search);
	    //Log.info("Searching for Item: " + item2Search);
	    System.out.println("Searching for Item: " + item2Search);
	    
	    driver.findElement(By.id("Go")).click();
	    driver.findElement(By.xpath("html/body/font/table[1]/tbody/tr[2]/td[3]/a/img")).click();
	    driver.findElement(By.name("txtItemQty1")).clear();
	    driver.findElement(By.name("txtItemQty1")).sendKeys(qty);
	    //Log.info("Qty added to cart: " + qty);
	    System.out.println("Qty added to cart: " + qty);
	    
	    driver.findElement(By.id("Recalc")).click();
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	    
	    driver.findElement(By.name("txtCustomerName")).clear();
	    driver.findElement(By.name("txtCustomerName")).sendKeys(customerName);
	    //Log.info("customerName: " + customerName);
	    System.out.println("customerName: " + customerName);
	    
	    driver.findElement(By.name("txtAddress")).clear();
	    driver.findElement(By.name("txtAddress")).sendKeys("123 Main Street");
	    driver.findElement(By.name("txtCity")).clear();
	    driver.findElement(By.name("txtCity")).sendKeys(customerCity);
	    //Log.info("customerCity: " + customerCity);
	    System.out.println("customerCity: " + customerCity);
	    
	    driver.findElement(By.name("txtState")).clear();
	    driver.findElement(By.name("txtState")).sendKeys(customerState);
	    Log.info("customerState: " + customerState);
	    
	    driver.findElement(By.name("txtZIP")).clear();
	    driver.findElement(By.name("txtZIP")).sendKeys("20121");
	    driver.findElement(By.name("txtPhone")).clear();
	    driver.findElement(By.name("txtPhone")).sendKeys("7035551414");
	    driver.findElement(By.name("optPaymentType")).click();
	    driver.findElement(By.name("txtAcctNo")).clear();
	    driver.findElement(By.name("txtAcctNo")).sendKeys("412365896541");
	    driver.findElement(By.name("txtCVV2No")).clear();
	    driver.findElement(By.name("txtCVV2No")).sendKeys("123");
	    driver.findElement(By.name("txtExpDate")).clear();
	    driver.findElement(By.name("txtExpDate")).sendKeys("02/2019");
	    driver.findElement(By.name("txtshipCustomerName")).clear();
	    driver.findElement(By.name("txtshipCustomerName")).sendKeys("Trump");
	    driver.findElement(By.name("txtshipAddress")).clear();
	    driver.findElement(By.name("txtshipAddress")).sendKeys("6 Pennsylvania Ave");
	    driver.findElement(By.name("txtshipCity")).clear();
	    driver.findElement(By.name("txtshipCity")).sendKeys("Washington");
	    driver.findElement(By.name("txtshipState")).clear();
	    driver.findElement(By.name("txtshipState")).sendKeys("DC");
	    driver.findElement(By.name("txtshipZIP")).clear();
	    driver.findElement(By.name("txtshipZIP")).sendKeys("20888");
	    driver.findElement(By.name("txtshipPhone")).clear();
	    driver.findElement(By.name("txtshipPhone")).sendKeys("2021114455");
	    
	      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("C:\\Users\\Dell\\Documents\\screenshot\\" + customerName + "screenshot.jpg"));
	      
	    
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	    String orderConfirmation =  driver.findElement(By.cssSelector("h2")).getText();
	    //System.out.println("orderConfirmation: " + orderConfirmation);
	    //Log.info("orderConfirmation: " + orderConfirmation);
	 
		 System.out.println("Order Confirmation Message: " + orderConfirmation);
		 
		 driver.quit();
		 System.out.println("End executing TestCaseName: " + TestCaseName);
		 //Log.endTestCase(TestCaseName);
	}
	
	
	
}

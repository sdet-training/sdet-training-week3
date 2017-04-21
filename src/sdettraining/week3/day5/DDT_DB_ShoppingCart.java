package sdettraining.week3.day5;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.csvreader.CsvReader;

import sdettraining.week3.day4.ReUsableFunctions;
import utility.Log;

public class DDT_DB_ShoppingCart {
	
	 int numOfRows;
	 String DBDataInLocalArray[][]=null;
	 
	 
	 
	
	@Test
	public void tc_End2EndShoppingCart_Test() throws Exception{
		
		String item2Search;
		String qty;
		String customerName;
		String customerCity;
		String customerState;
		
		FetchDBData();
		
		
	for(int i=0; i<numOfRows;i++)	{
		
		String TestCaseName = "tc_shoppingCartTesting";
		String AUT_URL = "http://sdettraining.com/online";
		String runTestInBrowser="FF";
		WebDriver driver;
		
		item2Search= DBDataInLocalArray[i][0]; //"TV";
		qty=DBDataInLocalArray[i][1]; //"10";
		customerName=DBDataInLocalArray[i][2]; //"Irfan";
		customerCity=DBDataInLocalArray[i][3]; //"New York";
		customerState=DBDataInLocalArray[i][5]; //"NY";
		
		//DOMConfigurator.configure("log4j.xml");
		System.out.println("TestCase Name is: "+ TestCaseName);
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
	      FileUtils.copyFile(screenshot, new File("C:\\Users\\Dell\\Documents\\screenshot\\" + customerName + "DB_screenshot.jpg"));
	      
	    
	    driver.findElement(By.xpath("(//input[@name='cmdSubmit'])[3]")).click();
	    String orderConfirmation =  driver.findElement(By.cssSelector("h2")).getText();
	    //System.out.println("orderConfirmation: " + orderConfirmation);
	    //Log.info("orderConfirmation: " + orderConfirmation);
	 
		 System.out.println("Order Confirmation Message: " + orderConfirmation);
		
		driver.quit();
		
	   }
	
	}
	
	
 public void FetchDBData() throws Exception{
		 
		 String connectionString=null;
		 String DBSqlServerDriver=null;
		 String sqlQuery=null;
		 
		
		
		 connectionString = "jdbc:sqlserver://sql2k801.discountasp.net:1433;databasename=SQL2008_841902_tr;user=SQL2008_841902_tr_user;password=52645264hrm";
		 DBSqlServerDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 
		 sqlQuery="select * from ShoppingCartTestData order by ID";
		 
	 try{
			 
			 Class.forName(DBSqlServerDriver);
			 Connection oConn = DriverManager.getConnection(connectionString);
			 Statement oStmt = oConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			 
			 ResultSet oRslt =   oStmt.executeQuery(sqlQuery);
			 
			 oRslt.last();
			 numOfRows =  oRslt.getRow();
			 
			 System.out.println("Total Records from DB: " + numOfRows);
			 oRslt.beforeFirst();
			 
			 
			 
			 DBDataInLocalArray = new String[numOfRows][6];
			 
			 int i=0;
			 while(oRslt.next()){
				 
				 System.out.println("Reading from DB: " + oRslt.getString("Search"));
				 DBDataInLocalArray[i][0] =   oRslt.getString("Search");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("ItemQty1"));
				 DBDataInLocalArray[i][1] =   oRslt.getString("ItemQty1");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustomerName"));
				 DBDataInLocalArray[i][2] =   oRslt.getString("CustomerName");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CustomerCity"));
				 DBDataInLocalArray[i][3] =   oRslt.getString("CustomerCity");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("CreditCardNum"));
				 DBDataInLocalArray[i][4] =   oRslt.getString("CreditCardNum");
				 
				 System.out.println("Reading from DB: " + oRslt.getString("ShippingPhone"));
				 DBDataInLocalArray[i][5] =   oRslt.getString("ShippingPhone");
				 i=i+1;
			 }
			 
			// oRslt.close();
			// oConn.close();
			 
		 }
		 catch(Exception e){
			 System.err.println("Error occured while connecting to the DB: " + e.getMessage());
		 }
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

}

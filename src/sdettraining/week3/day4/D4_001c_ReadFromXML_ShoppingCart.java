package sdettraining.week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class D4_001c_ReadFromXML_ShoppingCart {
	
	
	 @Test
	    public void tc_ReadLocatorsFromObjectRepository(){
	    	String strSC_OR = "C:\\SDET4\\HexTraWk3\\Week3\\src\\sdettraining\\week3\\day4\\ShoppingCartLocatorRepository2.xml";
	    	ReadDataFromXML_OR readXml = new ReadDataFromXML_OR(strSC_OR);
	        String locator_searchTextBox = readXml.getData("searchPage.search_textbox");
	        System.out.println("searchTextBox : " + locator_searchTextBox);
	        String locator_goBtn = readXml.getData("searchPage.go_btn");
	        System.out.println("goBtn  : " + locator_goBtn);
	    //    String locator3 = readXml.getData("menu.usersetting.logout");
	   //     System.out.println("LogOut  : " + locator3);
	        
	        
	        
	        
	        String TestCaseName = "tc_shoppingCartTesting";
			String AUT_URL = "http://sdettraining.com/online";
			String runTestInBrowser="FF";
			String item2Search = "TV";
			
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
			
			
			driver.findElement(By.name(locator_searchTextBox)).clear();
		    driver.findElement(By.name(locator_searchTextBox)).sendKeys(item2Search);
		    //Log.info("Searching for Item: " + item2Search);
		    System.out.println("Searching for Item: " + item2Search);
		    
		    driver.findElement(By.id(locator_goBtn)).click();
	    	
	    }

}

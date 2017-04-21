package sdettraining.week3.day4;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D4_002_POM_DriverScript {
	WebDriver driver;
	
	@Test
	  public void testTCTRShoppingCartCompleteTestCase() throws Exception {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://sdettraining.com/online");
		  
		D4_002_POM_C1_CatalogSearch ocatalogSearch = new D4_002_POM_C1_CatalogSearch();
		ocatalogSearch.SearchItem(driver, "IPhone6");
	
		
		D4_002_POM_C2_AddItemToCart oaddItemToCart = new D4_002_POM_C2_AddItemToCart();
		oaddItemToCart.AddItem(driver);

		
		D4_002_POM_C3_ModifyShoppingCart omodifyShoppingCart = new D4_002_POM_C3_ModifyShoppingCart();
		omodifyShoppingCart.ModifyCart(driver);
		
		
		D4_002_POM_C4_CheckOut ocheckOut = new D4_002_POM_C4_CheckOut();
		ocheckOut.CustomerInformation(driver);
	       ocheckOut.PaymentInformation(driver);
	       ocheckOut.ShippingInformation(driver);
	       
	    D4_002_POM_C5_OrderConfirmation oOrder = new D4_002_POM_C5_OrderConfirmation();
	    oOrder.GetConfirmation(driver);
	      
	 }


}

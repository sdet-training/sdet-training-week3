package sdettraining.week3.day3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D3_001_Selenium_RecordAndPlay {
	
	 private WebDriver driver;
	  private String baseUrl;
	  
	  @Before
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
			
	    driver = new FirefoxDriver();
	    baseUrl = "https://www.expedia.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	 @Test
	  public void testTcNewAccount() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("account-register")).click();
	    driver.findElement(By.id("create-account-firstname")).clear();
	    driver.findElement(By.id("create-account-firstname")).sendKeys("Tim");
	    driver.findElement(By.id("create-account-lastname")).clear();
	    driver.findElement(By.id("create-account-lastname")).sendKeys("Shorts");
	    driver.findElement(By.id("create-account-emailId")).clear();
	    driver.findElement(By.id("create-account-emailId")).sendKeys("tim.a@gmail.com");
	    driver.findElement(By.id("create-account-password")).clear();
	    driver.findElement(By.id("create-account-password")).sendKeys("Passw0rd");
	    driver.findElement(By.id("create-account-confirm-password")).clear();
	    driver.findElement(By.id("create-account-confirm-password")).sendKeys("Passw0rd");
	    driver.findElement(By.name("create-account-expedia-rewards")).click();
	    driver.findElement(By.id("create-account-expedia-policy")).click();
	    driver.findElement(By.id("create-account-submit-button")).click();
	  }
	
	
	@Test
	  public void testTcSignIn() throws Exception {
	    driver.get(baseUrl + "/user/create-account");
	    driver.findElement(By.id("header-account-signin")).click();
	    driver.findElement(By.id("signin-loginid")).clear();
	    driver.findElement(By.id("signin-loginid")).sendKeys("tim.s@gmail.com");
	    driver.findElement(By.id("signin-password")).clear();
	    driver.findElement(By.id("signin-password")).sendKeys("Passw0rd");
	    driver.findElement(By.id("submitButton")).click();
	  }
	
	 @Test
	  public void testTcSignOut() throws Exception {
	    driver.get(baseUrl + "/?mtype=2&ckoflag=1");
	    driver.findElement(By.id("account-signout")).click();
	  }
	 
	 @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    
	  }

}

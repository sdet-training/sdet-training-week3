package sdettraining.week3.day3;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D3_002_SeleniumLinks {
	WebDriver driver;
	
	@Test
	public void getalllinksOnHomePage() {  
		
         //System.out.println("Code to getAllLinksOnHomePage will come here");
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("http://www.tigerdirect.com");
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Number of Links on the HomePage is " + links.size()); 
		for (int i = 1; i<=links.size(); i=i+1) { 
		System.out.println("Name of Link# " + i + links.get(i).getAttribute("title"));
		} 
	} 

	
	
	@Ignore
	@Test
	public void getallBrokenlinksAfterLoginPage() {  
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Number of Links in the Page is " + links.size()); 
		for (int i = 1; i<=links.size(); i=i+1) { 
		System.out.println("Name of Link# " + i + links.get(i).getText()); 
		} 
	}

}

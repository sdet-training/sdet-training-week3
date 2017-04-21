package sdettraining.week3.day5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDActionMenu {

	private WebDriver driver = null;
	
	@Test
	public void tc_Login() throws InterruptedException{
	String baseUrl="http://tigerdirect.com";
	System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    WebElement feature = driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[5]/a"));
    feature.click();
    
    WebElement lenova = driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[5]/div/div/ul/li[9]/a"));
    lenova.click();
    
    
	
	
	}
	
}

package sdettraining.week3.day3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class D3_004_PhantomJSDriver {
	
	public static void main(String[] args) {
        File file = new File("C:/SeleniumJAVATraining/ALLJARS/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");				
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
        WebDriver driver = new PhantomJSDriver();	
        driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("Fannie Mae");					
        element.submit();         			
        System.out.println("Page title is: " + driver.getTitle());		
        driver.quit();			
}		

}

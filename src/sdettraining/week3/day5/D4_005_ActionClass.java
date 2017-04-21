package sdettraining.week3.day5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class D4_005_ActionClass {
	
	
	private WebDriver driver = null;
	
	@Test
	public void tc_Login() throws InterruptedException{
		
		String baseUrl="http://sdettraining.com";
		System.setProperty("webdriver.firefox.marionette", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/trguitransactions/default.aspx?id=new");
	  
	    
	    //driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
	    
	    //get the reference for Web Element Email
	      WebElement loginButton = driver.findElement(By.id("HeadLoginView_HeadLoginStatus"));
	      loginButton.click();
	    
	      Thread.sleep(2000);
	    driver.findElement(By.linkText("CREATE ACCOUNT")).click();
	    
	//    driver.findElement(By.id("MainContent_txtFirstName")).clear();
	//    driver.findElement(By.id("MainContent_txtFirstName")).sendKeys("Irfan");
	    
	    WebElement firstName = driver.findElement(By.id("MainContent_txtFirstName"));
	    //sendKeysAndcontextMenu(firstName, "Irfan");
	    Actions act = new Actions(driver);
	      Thread.sleep(3000);
	      Action seriesOfActions = act.moveToElement(firstName).click().keyDown(firstName, Keys.SHIFT)
	            .sendKeys(firstName, "IRFAN").keyUp(firstName, Keys.SHIFT).doubleClick(firstName).contextClick().build();
	      Thread.sleep(3000);
	      seriesOfActions.perform();
	      Thread.sleep(3000);
	    driver.findElement(By.id("MainContent_txtLastName")).clear();
	    driver.findElement(By.id("MainContent_txtLastName")).sendKeys("Khan");
	    driver.findElement(By.id("MainContent_txtEmail")).clear();
	    driver.findElement(By.id("MainContent_txtEmail")).sendKeys("iktrusa@outlook.com");
	    driver.findElement(By.id("MainContent_txtPassword")).clear();
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).clear();
	    driver.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys("Password");
	    driver.findElement(By.id("MainContent_txtHomePhone")).clear();
	    driver.findElement(By.id("MainContent_txtHomePhone")).sendKeys("7329986650");
	    driver.findElement(By.id("MainContent_txtCellPhone")).clear();
	    driver.findElement(By.id("MainContent_txtCellPhone")).sendKeys("7329986650");
	    driver.findElement(By.id("MainContent_txtInstructions")).clear();
	    driver.findElement(By.id("MainContent_txtInstructions")).sendKeys("Test from SDETTraining.com");
	    driver.findElement(By.id("MainContent_btnSubmit")).click();
	    //Assert.assertEquals("Customer information added successfully", driver.findElement(By.id("MainContent_lblTransactionResult")).getText());
	    driver.quit();
		
		
	}
	
	
	private void sendKeysAndcontextMenu(WebElement element, String txt2Type) throws InterruptedException{
		// Handling Multiple Actions
	      Actions act = new Actions(driver);
	      Thread.sleep(3000);
	      Action seriesOfActions = act.moveToElement(element).click().keyDown(element, Keys.SHIFT)
	            .sendKeys(element, txt2Type).keyUp(element, Keys.SHIFT).doubleClick(element).contextClick().build();
	      seriesOfActions.perform();
	}
	

}

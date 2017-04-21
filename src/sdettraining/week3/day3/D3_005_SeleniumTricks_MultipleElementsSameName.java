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

public class D3_005_SeleniumTricks_MultipleElementsSameName {
	WebDriver driver;
	
	@Test
	public void tc_login_MultipleElementsSameName() throws InterruptedException{
		
		
		System.out.println("Code to login will come here");
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("http://www.tigerdirect.com");
		//driver.findElement(By.xpath("//*[@id='userSignin']/a[1]")).click();
		driver.findElement(By.linkText("Sign in")).click();
		
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//*[@id='mainC']/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td/form/font/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/input")).sendKeys("SDET411@sdettraining.com");
		
//		WebDriverWait wait = new WebDriverWait(driver, 30);
		//	WebElement txtemail = wait.until(ExpectedConditions
	   //             .visibilityOfElementLocated(By.xpath("//*[@name='email']")));
		//	txtemail.sendKeys("halwa.poori1@mithai.com");
			
		//	int email_size=driver.findElements(By.xpath("//*[@name='email']")).size();
	        int emailboxes = driver.findElements(By.name("email")).size();
			System.out.println("number of email boxes:" + emailboxes);
		
			
			for(int i=0; i<emailboxes;i++){
				System.out.println(" Email text boxes: " + driver.findElements(By.xpath("//*[@name='email']")).get(i).getAttribute("name"));
			}
			
			driver.findElements(By.xpath("//*[@name='email']")).get(2).sendKeys("raju_gentleman@trainee.com");
			//driver.findElements(By.xpath("//*[@name='email']")).get(emailboxes-2).click();
		
			
	}
	
	
	@Ignore
	@Test
	public void tc_login() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("http://www.tigerdirect.com");
		//driver.findElement(By.xpath("//*[@id='userSignin']/a[1]")).click();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		
		
	
		
		//driver.findElement(By.name("email")).sendKeys("halwa.poori1@mithai.com");
		//driver.findElement(By.xpath("//*[@name='email']")).click();
	}

}

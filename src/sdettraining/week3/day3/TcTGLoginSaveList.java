package sdettraining.week3.day3;


	
	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TcTGLoginSaveList {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJAVATraining\\Softwares\\GeckoDriver\\64bit\\geckodriver.exe");
		driver = new FirefoxDriver();
	    baseUrl = "http://www.tigerdirect.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testTcTGLoginSaveList() throws Exception {
	    driver.get(baseUrl + "/cgi-bin/ShoppingCart.asp?message=&navigate=cart");
	    driver.findElement(By.linkText("My Account")).click();
	    Thread.sleep(3000);
	    
	    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
	    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
	    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
	    driver.findElement(By.cssSelector("td > div > input[name=\"imageField\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("tigerv2_searchform")).clear();
	    driver.findElement(By.id("tigerv2_searchform")).sendKeys("IPhone");
	    driver.findElement(By.cssSelector("button.btn.searchGo")).click();
	    
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.linkText("2")).click();
	    driver.findElement(By.xpath("//div[@id='mainC']/div/div[3]/div/div[2]/div[3]/div[2]/a[2]/span")).click();
	    driver.findElement(By.name("txtQty_9809935")).clear();
	    driver.findElement(By.name("txtQty_9809935")).sendKeys("2");
	    driver.findElement(By.xpath("(//input[@type='image'])[5]")).click();
	    driver.findElement(By.name("txtWishName")).clear();
	    driver.findElement(By.name("txtWishName")).sendKeys("Charger3");
	    driver.findElement(By.name("Submit")).click();
	    driver.findElement(By.linkText("Sign out")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}




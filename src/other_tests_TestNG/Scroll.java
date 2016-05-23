package other_tests_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://jqueryui.com");
	  Thread.sleep(5000);
	  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
  }
}

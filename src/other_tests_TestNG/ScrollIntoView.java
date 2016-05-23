package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollIntoView {
  @Test
  public void f() {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	  JavascriptExecutor je = (JavascriptExecutor) driver;
	  WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/p[10]"));
	  je.executeScript("arguments[0].scrollIntoView(true);",element);
	  System.out.println(element.getText());
  }
}

package other_tests_TestNG;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HandleAlert {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.ksrtc.in/site/");
	  driver.findElement(By.xpath(".//*[@id='navLog']/li[8]/a")).click();
	  driver.findElement(By.id("loginBtn")).click();
	  
	  Thread.sleep(5000);
	 // Alert alt=driver.switchTo().alert();
	//  alt.accept();
	  
	  String actual_message=driver.switchTo().alert().getText();
	  System.out.println("The message of the alert is"+actual_message);
	  driver.switchTo().alert().accept();
	  
	  String expected_mesg= "Username is required.";
	  
	  org.testng.Assert.assertEquals(actual_message, expected_mesg);
	  
	  
	  
	   
  }
}

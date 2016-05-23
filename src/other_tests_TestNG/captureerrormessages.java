package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class captureerrormessages {
  @Test
  public void f() {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://www.naukrigulf.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("lnkGNBLogin")).click();
	  driver.findElement(By.id("gnbLogInSubmit")).click();
	  String actual_msg=driver.findElement(By.id("loginusername_err")).getText();
	  String expect="plz enter valid email";
	  Assert.assertEquals(actual_msg, expect);
  }
}

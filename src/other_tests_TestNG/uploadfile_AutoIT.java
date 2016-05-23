package other_tests_TestNG;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile_AutoIT {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	 // driver.get("file:///C:/Users/rmomin/Desktop/fileupload.html");
	 // driver.findElement(By.xpath(".//*[@id='1']")).click();
	  
	  //Runtime.getRuntime().exec("D:\\AutoIT-Scripts\\Fileupload.exe");
	  
	  
  }
}

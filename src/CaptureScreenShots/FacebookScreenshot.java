package CaptureScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class FacebookScreenshot {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	  Utility.CaptureScreenShots(driver, "Browser started");
	 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Learn automation");
	 
	 Utility.CaptureScreenShots(driver, "Type usertname");
	 //TakesScreenshot ts= (TakesScreenshot)driver;
	 //File source= ts.getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(source, new File("./Screenshots/facebook.png"));
	// System.out.println("Screenshot taken");
	 
  }
}

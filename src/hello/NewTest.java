package hello;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.*;
import com.relevantcodes.extentreports.LogStatus;


public class NewTest {

	
  @Test
  public void f() {
	  
	  
	  ExtentReports extent = ExtentReports.get(NewTest.class);
	  
	  extent.init("D:\\Selenium\\Reports\\Reports-results\\first-report.html", true);
	  extent.startTest("Facebook-registration");
	  
	  
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  extent.log(LogStatus.INFO, "Browser started");
	  
	  driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Rozmeen is testing");

	  driver.findElement(By.xpath(".//*[@id='u_0_d']")).click();
	  
	  driver.findElement(By.xpath(".//*[@id='persist_box']")).click();
	  
	  Select sel1= new Select(driver.findElement(By.xpath(".//*[@id='month']")));
	  sel1.selectByVisibleText("Sep");     
	 
	  Select sel2= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
	  sel2.selectByValue("6");
	  
	  Select sel3= new Select(driver.findElement(By.xpath(".//*[@id='year']")));
	  sel3.selectByIndex(3);
	  
	 
	 driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();
	  extent.endTest();
  }
}

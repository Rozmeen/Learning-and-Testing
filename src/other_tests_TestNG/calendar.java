package other_tests_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class calendar {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redbus.in/");
	  driver.findElement(By.id("txtOnwardCalendar")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath(".//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[4]/td[7]")).click();
	  List<WebElement> dates= driver.findElements(By.xpath("//div[@id='rbcal_txtReturnCalendar']/table[1]//td"));
       int total_node=dates.size();
       
       for(int i=0;i<total_node;i++)
       {
    	   String date=dates.get(i).getText();
    	   if(date.equalsIgnoreCase("31"))
    	   {
    		   dates.get(i).click();
    		   break;
    	   }
    	   }
  }
}

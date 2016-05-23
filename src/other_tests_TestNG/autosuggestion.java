package other_tests_TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class autosuggestion {
  @Test
  public void f() throws InterruptedException {
	  
      WebDriver driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
	   driver.manage().window().maximize();
	   
	   WebElement link_Home = driver.findElement(By.linkText("Home"));
	   WebElement td_Home = driver.findElement(By.xpath("//html/body/div"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr"));  
	   Actions builder = new Actions(driver);
       Action mouseOverHome = builder.moveToElement(link_Home).build();
       String bgColor = td_Home.getCssValue("background-color");
       System.out.println("Before hover: " + bgColor);        
       mouseOverHome.perform();        
       bgColor = td_Home.getCssValue("background-color");
       System.out.println("After hover: " + bgColor);
       
       WebElement link_Hotels=driver.findElement(By.linkText("Hotels"));
       WebElement td_Hotels=driver.findElement(By.xpath("html/body/div"
       		+ "/table/tbody/tr/td"
       		+ "/table/tbody/tr/td"
       		+ "/table/tbody/tr/td"
       		+ "/table/tbody/tr/td"));
       Actions builder1 = new Actions(driver);
       Action mouseOverHotels = builder1.moveToElement(link_Hotels).build();
       String bgColor1 = td_Hotels.getCssValue("background-color");
       System.out.println("Before hover: " + bgColor1);        
       mouseOverHotels.perform();    
       bgColor1 = td_Hotels.getCssValue("background-color");
       System.out.println("After hover: " + bgColor1);
  }
}

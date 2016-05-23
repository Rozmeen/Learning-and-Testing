package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightclick {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com.pk/");
	  driver.manage().window().maximize();
	  //Actions act=new Actions(driver);
	  
	 //WebElement link=driver.findElement(By.id("email"));
	 // Actions builder =new Actions(driver);
	  //Action seriesofaction= builder.moveToElement(link).click().keyDown(link, Keys.SHIFT).sendKeys(link, "hello").keyUp(link, Keys.SHIFT).doubleClick(link).contextClick().build();
	  //seriesofaction.perform();
	 // WebElement link=driver.findElement(By.linkText("اردو"));
	 // Actions builder =new Actions(driver);
	 // builder.keyDown(link, Keys.SHIFT).contextClick().build();
	 // builder.perform();
	  
	  
	  //apni understanding k liye last time ye email wala code run krrhi hu 
	  
	

	  	 
	  	  Actions act=new Actions(driver);

	  	  act.contextClick(driver.findElement(By.linkText("اردو"))).build().perform();
	  	  //ye above two lines code bhi work krrha hy 
	  	
	  
  }
}

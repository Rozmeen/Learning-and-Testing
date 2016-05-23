package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureTooltip {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
	  driver.findElement(By.id("GmailAddress")).click();
	  
	  Actions Builder= new Actions(driver);
	  WebElement tooltip= driver.findElement(By.xpath("html/body/div[3]"));
	  Builder.moveToElement(tooltip).perform();
	  String tooltip_msg=tooltip.getText();
	  System.out.println("Tooltip/ Help message is "+tooltip_msg);
	  String expected_tooltip= "You can use letters, numbers, and periods.";
	  Assert.assertEquals(tooltip_msg, expected_tooltip);
	  System.out.println("Message verifed");
	  
  }
}

package other_tests_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class handleMultipleWindows {
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail&hl=en");
	  String parent=driver.getWindowHandle();
	  System.out.println(" Before switching title is" +driver.getTitle());
	  driver.findElement(By.xpath(".//*[@id='TosLink']")).click();
	  
      Set<String> s1=driver.getWindowHandles();  
      Iterator<String> i1=s1.iterator();
      
      while(i1.hasNext()){
    	  String child=i1.next();
    	  if (!parent.equalsIgnoreCase(child))
    	  {
    		driver.switchTo().window(child);
    		Thread.sleep(10000);
    		System.out.println("After switching title is "+driver.getTitle());
      }  
  }
            driver.switchTo().window(parent);
            System.out.println(" Back to parent window "+driver.getTitle());
  }
}

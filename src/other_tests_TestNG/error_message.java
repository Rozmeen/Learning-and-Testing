package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class error_message {
	WebElement txt1, txt2;
	@BeforeClass
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html#sthash.YqJQL3vC.dpuf");
	   driver.manage().window().maximize();
	 txt1=driver.findElement(By.id("text1"));
      txt2=driver.findElement(By.id("text2"));
	  
  }
	//Example Of Assertion Method - will Pass
	@Test
	public void null1() {
		System.out.print("\n"+ txt1.getAttribute("disabled"));
		Assert.assertNull(txt1.getAttribute("disabled"));
			
	}
	//Example Of Assertion Method - will Fail
	@Test
	public void null2() {
		System.out.print("\n"+ txt2.getAttribute("disabled"));
		Assert.assertNull(txt2.getAttribute("disabled"));
			
  }
}

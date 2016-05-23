package other_tests_TestNG;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerfyTitle {
	String title= "";
  @Test
  public void f() {
	  
	  WebDriver driver= new FirefoxDriver();
	  driver.get("http://ecare.folio3.com:9191/#/ecare-vault/login");
	  driver.manage().window().maximize();
	  
	 // title= driver.getTitle();
	  //System.out.println(" The title is : " + title);
	  //Assert.assertTrue(title.contains("Facebook - Log In or Sign Up"));
	  
  }
}

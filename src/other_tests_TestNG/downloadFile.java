package other_tests_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class downloadFile {
  @Test
  public void f() {
	  
	  FirefoxProfile profile= new FirefoxProfile();
	  profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
	  WebDriver driver=new FirefoxDriver(profile);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://ghanghor.folio3.com:9191/#/incidents");
	  driver.findElement(By.xpath(".//*[@id='rGrid']/div[1]/div/button[2]")).click();
  }
}

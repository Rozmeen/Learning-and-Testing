package other_tests_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UntrustedCertificates {
  @Test
  public void f() {
	  
	  //FirefoxProfile profile=new FirefoxProfile();
	  //profile.setAcceptUntrustedCertificates(false);
	  // WebDriver driver=new FirefoxDriver();
	   //driver.get("http://www.google.com");
	   

	   // Create object of DesiredCapabilities class
	  DesiredCapabilities cap=DesiredCapabilities.chrome();

	  // Set ACCEPT_SSL_CERTS  variable to true
	  cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	  // Set the driver path
	  System.setProperty("webdriver.chrome.driver","Chrome driver path");

	  // Open browser with capability
	  WebDriver driver=new ChromeDriver(cap);
	
	   // Create object of DesiredCapabilities class
	  DesiredCapabilities cap=DesiredCapabilities.chrome();
	   
	  // Set ACCEPT_SSL_CERTS  variable to true
	  cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	   
	  // Set the driver path
	  System.setProperty("webdriver.chrome.driver","Chrome driver path");
	   
	  // Open browser with capability
	  WebDriver driver=new ChromeDriver(cap);
	   
	  
  }
}

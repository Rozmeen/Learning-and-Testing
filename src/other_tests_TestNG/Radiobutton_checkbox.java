package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.*;


import hello.NewTest;

public class Radiobutton_checkbox {
	ExtentReports extent = ExtentReports.get(NewTest.class);
	  WebDriver driver= new FirefoxDriver();
  @Test
  public void radio() {
	  
	  extent.init("D:\\Selenium\\Reports\\Reports-results\\Radio-checkbox-update-report.html", true);
	  extent.startTest("Facebook-registration");
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  extent.log(LogStatus.INFO, "Browser started");
	 
	  WebElement male_radio_button=driver.findElement(By.id("u_0_d"));
	  boolean status= male_radio_button.isDisplayed();
	  System.out.println(status);
	  boolean enabled_status= male_radio_button.isEnabled();
	  System.out.println(enabled_status);
	  boolean selected_status=male_radio_button.isSelected();
	  System.out.println(selected_status);
	  male_radio_button.click();
	  boolean selected_status_new=male_radio_button.isSelected();
	  System.out.println(selected_status_new);
  }
  @AfterMethod
	public void check(){  
	  WebElement keep_me_logged_in=driver.findElement(By.id("persist_box"));
	  boolean checkbox_status= keep_me_logged_in.isDisplayed();
	  System.out.println(checkbox_status);
	  boolean checkbox_staus_enabled=keep_me_logged_in.isEnabled();
	  System.out.println(checkbox_staus_enabled);
	  boolean checkbox_status_selected=keep_me_logged_in.isSelected();
	  System.out.println(checkbox_status_selected);
	  
	  keep_me_logged_in.click();
	  boolean checkbox_status_selected_new=keep_me_logged_in.isSelected();
	  System.out.println(checkbox_status_selected_new);
	  
	
  }
}

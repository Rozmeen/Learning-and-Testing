package other_tests_TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.*;

import hello.NewTest;

public class dropdown {
		ExtentReports extent = ExtentReports.get(NewTest.class);
		  WebDriver driver= new FirefoxDriver();
  @Test
  public void f() {
	  extent.init("D:\\Selenium\\Reports\\Reports-results\\dropdown-report.html", true);
	  extent.startTest("Facebook-registration");
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  extent.log(LogStatus.INFO, "Browser started");
	  
	  //WebElement month_dropdown= driver.findElement(By.id("month"));
	  //Select month= new Select(month_dropdown);
	  //month.selectByValue("5");
	  
	 // WebElement month_dropdown= driver.findElement(By.id("month"));
	// Select month= new Select(month_dropdown);
	// month.selectByVisibleText("Nov");
	  
	//  WebElement day_dropdown=driver.findElement(By.id("day"));
	//Select day= new Select(day_dropdown);
	// day.selectByIndex(23);
	  
	// WebElement year_dropdown= driver.findElement(By.id("year"));
	 // Select year=new Select(year_dropdown);
	  //year.selectByVisibleText("1992");
	  WebElement month_dropdown= driver.findElement(By.id("month"));
	  Select month=new Select(month_dropdown);
	  
	  List<WebElement> dropdown=month.getOptions();
	   
	   for(int i=0;i<dropdown.size();i++){
	   
	   String drop_down_values=dropdown.get(i).getText();
	   
	   System.out.println("dropdown values are "+drop_down_values);
	   
	   }
	 
		  }
  }


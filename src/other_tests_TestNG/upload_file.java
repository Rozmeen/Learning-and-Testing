package other_tests_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class upload_file {
	@Test
	public void f() {
	WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.megafileupload.com/");
	   driver.manage().window().maximize();
	   WebElement uploadElement = driver.findElement(By.id("initialUploadSection"));
	   
	// enter the file path onto the file-selection input field
	uploadElement.sendKeys("D:\\newhtml.html");
	 
	driver.findElement(By.className("btn btn-green btn-lg")).click();
	

	}
}

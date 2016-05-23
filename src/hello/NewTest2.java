package hello;

import org.testng.annotations.Test;



import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.*;
import com.relevantcodes.extentreports.LogStatus;


public class NewTest2 {


@Test
public void f() {

// changed
ExtentReports extent = new
ExtentReports("C:\\TestResults\\first-report.html", true,DisplayOrder.OLDEST_FIRST);

// changed
ExtentTest test = extent.startTest("Facebook");    


WebDriver driver= new FirefoxDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();

// changed
test.log(LogStatus.INFO, "Browser started");

driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Rozmeen is testing");

driver.findElement(By.xpath(".//*[@id='u_0_d']")).click();

driver.findElement(By.xpath(".//*[@id='persist_box']")).click();

Select sel1= new
Select(driver.findElement(By.xpath(".//*[@id='month']")));
sel1.selectByVisibleText("sep");

Select sel2= new Select(driver.findElement(By.xpath(".//*[@id='day']")));
sel2.selectByValue("6");

Select sel3= new Select(driver.findElement(By.xpath(".//*[@id='year']")));
sel3.selectByIndex(3);


driver.findElement(By.xpath(".//*[@id='u_0_i']")).click();

// changed
extent.endTest(test);

// added
extent.flush();
}
}

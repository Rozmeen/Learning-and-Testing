
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.*;
import com.relevantcodes.extentreports.LogStatus;


public class radiocheckbox {

	public static void main(String[] args) {
		
		 WebDriver driver= new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  WebElement male_radio_button=driver.findElement(By.id("u_0_e"));
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

}

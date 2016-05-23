package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
	}

}

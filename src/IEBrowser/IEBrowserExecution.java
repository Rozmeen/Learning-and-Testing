package IEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserExecution {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\driver\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		 driver.get("https://www.facebook.com");
	        System.out.println(driver.getTitle());
		
	}

}

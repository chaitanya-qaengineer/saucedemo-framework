package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ConfigReader;

public class DriverFactory {
	
	public static WebDriver driver;
	public static WebDriver initializeDriver() {
		
		String browser = ConfigReader.getBrowser();
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
		    driver = new FirefoxDriver();
		}
		
		return driver;
		
	}

}

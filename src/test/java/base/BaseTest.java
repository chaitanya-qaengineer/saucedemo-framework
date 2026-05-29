package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;
import utils.ConfigReader;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		ConfigReader.initProperties();
		driver = DriverFactory.initializeDriver();
		driver.get(ConfigReader.getUrl());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

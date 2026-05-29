package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {
	
	@Test
	public void verifyLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(
				ConfigReader.getUsername(),
				ConfigReader.getPassword());
	}

}

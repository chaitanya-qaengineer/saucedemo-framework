package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	WebElement usernameTxt;

	@FindBy(id = "password")
	WebElement passwordTxt;

	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	public void enterUsername(String username) {
		usernameTxt.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		passwordTxt.sendKeys(password);
		
	}
	
	public void clickLogin() {
		loginBtn.click();
		
	}
	
	public void login(String username, String password) {
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}

}

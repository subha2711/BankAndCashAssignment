package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "username")
	WebElement USERNAME_FIELD;
	@FindBy(id = "password")
	WebElement PASSWORD_FIELD;
	@FindBy(name = "login")
	WebElement SIGNIN_FIELD;

	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void enterTheLoginCredentials(String userName, String Password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(Password);
	}

	public void clickSignInButton() {
		SIGNIN_FIELD.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}

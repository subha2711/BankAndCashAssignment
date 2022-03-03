package page;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DashboardPage extends BasePage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	String dashboardTitle = "Dashboard- iBilling";
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Transactions')]")
	WebElement transactionElement;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View Transactions')]")
	WebElement viewTransactionElement;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement bankAndCashElement;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement newAccountElement;
	

	public void dashboardPageVerificationAfterLogin() throws IOException {
		Assert.assertEquals("Not on Dashboard PAge", dashboardTitle, driver.getTitle());
		takeScreenShotAtEndOfTest(driver);
	}

	public void clickOnTransaction() {
		transactionElement.click();
	
	}
	public void clickOnViewTransaction() {
		waitForElement(driver, 5, viewTransactionElement);
		viewTransactionElement.click();
	}
	
	public void clickOnBankAndCash() {
		bankAndCashElement.click();
	}
	
	public void clickOnNewAccount() {
		waitForElement(driver, 5, newAccountElement);
		newAccountElement.click();
	}
}

package page;

import java.io.IOException;

import org.junit.Assert;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BankAndCashPage extends BasePage {

	WebDriver driver;
	
	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}
	//validation of account page
		String newAccountHeaderTitle = "Add New Account";
		@FindBy(how = How.XPATH, using="//h5[text()='Add New Account']") WebElement addNewAccHeaderText;
		
		@FindBy(how = How.XPATH,using ="//input[@id='account']") WebElement accountTitle;
		@FindBy(how = How.XPATH,using ="//input[@id='description']") WebElement description;
		@FindBy(how = How.XPATH,using ="//input[@id='balance']") WebElement initialBalance;
		@FindBy(how = How.XPATH,using ="//input[@id='account_number']") WebElement accountNumber;
		@FindBy(how = How.XPATH,using ="//input[@id='contact_person']") WebElement contactPerson;
		@FindBy(how = How.XPATH,using ="//input[@id='contact_phone']") WebElement phone;
		@FindBy(how = How.XPATH,using ="//input[@id='ib_url']") WebElement bankURL;
		@FindBy(how = How.XPATH,using ="//button[@class='btn btn-primary']") WebElement submitButton;
		String messageAfterSuccessfullySaving = "Account Created Successfully";
		@FindBy(how = How.XPATH , using = "//div[3]/div[1]") WebElement successMessageAfterAccountCreation;
		
		int num = generateNumber(900);
		
		public void verifyAfterClickingNewAccount() throws IOException {
			Assert.assertEquals(addNewAccHeaderText.getText(),newAccountHeaderTitle,"Not on Add new Account page");
			takeScreenShotAtEndOfTest(driver);
		}
		
		public void enterAccountTitle(String title) {
			accountTitle.sendKeys(title+ num);
		
		}
		public void enterDescription(String descp) {
			description.sendKeys(descp);
		}
		public void enterInitialBalance(String balance) {
		initialBalance.sendKeys(balance);
		}
		public void enterAccountNumber(String accNum) {
			accountNumber.sendKeys(accNum+num);
		}
		public void enterContactPerson(String contactPer) {
			contactPerson.sendKeys(contactPer);
		}
		public void enterPhone(String phoneNum) {
			phone.sendKeys(phoneNum+ num);
		}
		public void enterInternetBankingURL(String url) {
			bankURL.sendKeys(url);
		}
		public void clickSubmitButton() throws IOException {
			submitButton.click();
			takeScreenShotAtEndOfTest(driver);
		}
		public void afterSubmitVerification() throws IOException {
			String msg =successMessageAfterAccountCreation.getText().substring(0, 25);
			System.out.println(msg);
			if(msg.contains(messageAfterSuccessfullySaving)) {
				Assert.assertTrue(messageAfterSuccessfullySaving, true);
			}else {
				Assert.assertTrue("Account not created successfully", false);
			}
			takeScreenShotAtEndOfTest(driver);
		}
}

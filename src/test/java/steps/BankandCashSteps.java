package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BankAndCashPage;
import page.DashboardPage;
import page.LoginPage;
import page.TransactionsPage;
import util.BrowserFactory;

public class BankandCashSteps {
WebDriver driver;
LoginPage login;
DashboardPage dashboard;
BankAndCashPage bac;

@Before
public void beforeMethod() {
	driver = BrowserFactory.init();
	login = PageFactory.initElements(driver, LoginPage.class);
	dashboard = PageFactory.initElements(driver, DashboardPage.class);
	bac = PageFactory.initElements(driver, BankAndCashPage.class);
}

@Given("^user is on the techfios login page$")
public void user_is_on_the_techfios_login_page() throws Throwable {
	driver.get("https://techfios.com/billing/?ng=admin/");
}

@When("^user enters the username as \"([^\"]*)\"$")
public void user_enters_the_username_as(String uname) throws Throwable {
  login.enterUserName(uname);
}

@When("^user enters the password as \"([^\"]*)\"$")
public void user_enters_the_password_as(String pwd) throws Throwable {
   login.enterPassword(pwd);
}

@When("^user clicks on login$")
public void user_clicks_on_login() throws Throwable {
    login.clickSignInButton();
}

@Then("^user should land on Dashboard page$")
public void user_should_land_on_Dashboard_page() throws Throwable {
   dashboard.dashboardPageVerificationAfterLogin();
}

@Then("^user clicks on bankCash$")
public void user_clicks_on_bankCash() throws Throwable {
  dashboard.clickOnBankAndCash();
}

@Then("^user clicks on newAccount$")
public void user_clicks_on_newAccount() throws Throwable {
    dashboard.clickOnNewAccount();
}

@Then("^user fills  the new Account Details in the New Account page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
public void user_fills_the_new_Account_Details_in_the_New_Account_page(String AccountTitle, String des, String InitialBalance, String accNum, String contactPerson, String ph, String bankURL) throws Throwable {
   bac.enterAccountTitle(AccountTitle);
   bac.enterDescription(des);
   bac.enterInitialBalance(InitialBalance);
   bac.enterAccountNumber(accNum);
   bac.enterContactPerson(contactPerson);
   bac.enterPhone(ph);
   bac.enterInternetBankingURL(bankURL);
}

@Then("^user clicks on submit$")
public void user_clicks_on_submit() throws Throwable {
   bac.clickSubmitButton();
}

@Then("^User should be able to validate account created successfully$")
public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {
  bac.afterSubmitVerification();
}


}

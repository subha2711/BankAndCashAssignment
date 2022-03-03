package page;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TransactionsPage extends BasePage {

	WebDriver driver;
	
	public TransactionsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	String titleOftransactionPage = "Transactions- iBilling";
	String afterclickingManage ="Transactions";
	@FindBy(how =  How.XPATH, using ="//h2[contains(text(),'Transactions')]") WebElement afterManageButtonClick;
	
	public void verificationAfterLandingOnViewTransaction() throws IOException {
		Assert.assertEquals(driver.getTitle(),titleOftransactionPage,"Not on View Transactions page");
		takeScreenShotAtEndOfTest(driver);
	}
	
	//tbody/tr[3]/td[9]
			String xpath_before = "//tbody/tr[";
			String xpath_after = "]/td[9]";
			String userAcc = "//tbody/tr[3]/td[2]";
	public void verifyAddedNewAccount(String accTitle ) {
		
			for(int i =2; i<=10; i++) {
				String title = driver.findElement(By.xpath(userAcc)).getText();
				System.out.println("**************"+title);
				if(title.contains(accTitle+title.substring(9))) {
					driver.findElement(By.xpath(xpath_before+i+xpath_after)).click();
					break;
				}
			}
	}
	
	public void verifyAfterClickingUserFromTable() throws IOException {
		Assert.assertEquals(afterManageButtonClick.getText(),afterclickingManage,"not on right page");
		takeScreenShotAtEndOfTest(driver);
	}
}

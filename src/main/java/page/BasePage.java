package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	
	
	public void selectDropDown(WebElement element, String VisibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(VisibleText);
	}

	public int generateNumber(int boundary) {

		Random rnd = new Random();
		int generatedNumber = rnd.nextInt(boundary) + 100;
		return generatedNumber;

	}

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}

	public void takeScreenShotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = format.format(date);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(scr, new File(currentDirectory + "/screenshots/" + label + ".png"));
		
		//String currentDirectory = System.getProperty("user.dir") + screenshotName+label+".png";
		//File finalDestination =new (currentDirectory);
		//FileUtils.copyFiles(src,finalDestination)
		//pass a parameter in method as String screenshotName
		
	}
}

package automationSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\New Folder\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = ("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("Partial")).click();
		
		String expectedTitle = "Demo Form for practicing Selenium Automation";
		String actualTitle= "";
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test is Sucessful");
			}
		else {
			System.out.println("Test is Failed");
		}

	}
}

package automationSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = ("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.linkText("Link Test")).click();
		
		String expectedTitle = "Taipei";
		Thread.sleep(5000);
		String actualTitle= "";
		actualTitle = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[3]/td[2]")).getText();
		System.out.println(actualTitle);
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test is Sucessful");
			}
		else {
			System.out.println("Test is Failed");
		}
	}
}
		

package automationSample;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubmitForm {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		// Launch the browser
		driver = new FirefoxDriver();
		String baseUrl = ("http://toolsqa.com/automation-practice-form/");
		// Enter URL
		driver.get(baseUrl);
		// wait 5 seconds
		Thread.sleep(5000);
		// Enter the data Utshah on First name text field
		driver.findElement(By.name("firstname")).sendKeys("Utshah");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		//Click
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		driver.findElement(By.cssSelector("input[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("27/05/2017");
		driver.findElement(By.cssSelector("input[value='Manual Tester']")).click();
		WebElement uploadElement = driver.findElement(By.id("photo"));
		File file = new File("rose.jpg");//full file path URL
		String absolutePath = file.getAbsolutePath();
		uploadElement.sendKeys(absolutePath);
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		Select drpContinent = new Select(driver.findElement(By.id("continents")));
		drpContinent.selectByVisibleText("Asia");
		Select drpCommands = new Select(driver.findElement(By.id("selenium_commands")));
		drpCommands.selectByVisibleText("Wait Commands");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		
		}
	    
	}

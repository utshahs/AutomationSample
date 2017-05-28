package automationSample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadSeleniumFramework {

		public static void main(String[] args) throws InterruptedException, AWTException{
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			// Launch the browser
			driver = new FirefoxDriver();
			String baseUrl = ("http://toolsqa.com/automation-practice-form/");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			// Enter URL
			driver.get(baseUrl);
			// Click on Selenium Automation Hybrid Framework
			driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
			// Wait for 5 seconds
			Thread.sleep(5000);
			// Handling window based controls
			Robot robotObj =new Robot();
			// click on tabs
			robotObj.keyPress(KeyEvent.VK_TAB);
			//click on enter
			robotObj.keyPress(KeyEvent.VK_ENTER);		
			
					
		}


	}



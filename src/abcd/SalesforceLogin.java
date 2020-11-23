package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceLogin {
	public static void main(String[] args) throws InterruptedException{
		//Instatiate chrome browser driver
		System.setProperty("webdriver.gecko.driver", "c:/GeckoDriver.exe");
		//Create Chrome Browser Driver
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://login.salesforce.com/");
		
	
		driver.findElement(By.id("username")).sendKeys("shanmugasrinivassunnapu");
		driver.findElement(By.id("password")).sendKeys("1234567890");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}

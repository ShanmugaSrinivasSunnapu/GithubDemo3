package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Status {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.google.com/");
		boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
		//boolean linkPresent = driver.findElement(By.linkText("Gmail")).isEnabled();
		
		
		System.out.println(linkPresent);
		driver.close();
		
		

	}

}

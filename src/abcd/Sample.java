package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		//Instatiate Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//create chrome browser driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.className("gb_g")).click();
		driver.close();
		
	}

}

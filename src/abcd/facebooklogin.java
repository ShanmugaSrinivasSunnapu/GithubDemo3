package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException{
		//Instatiate MSEdge Browser Driver
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver.exe");
		//Create MS edge browser driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		driver.close();
	}

}
package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedStatus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Launch gcrshop admin home page
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		//driver.close();
		
	}

}

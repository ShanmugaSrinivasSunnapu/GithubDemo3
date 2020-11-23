package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		//switch to 3rd frame from top window using index
		driver.switchTo().frame(2);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		//switch from 3rd window to top window
		driver.switchTo().defaultContent();
		//switch from top window to 2nd window
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.className("interfaceName")).click();
		driver.close();
	}

}

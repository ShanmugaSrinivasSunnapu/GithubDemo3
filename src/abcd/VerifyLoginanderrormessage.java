package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginanderrormessage {
	static String ErrorMessage;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("9160074727");
		driver.findElement(By.id("pass")).sendKeys("Honeyseenu@");
		driver.findElement(By.tagName("button")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(!url.contains("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100")) {
			ErrorMessage = driver.findElement(By.className("_9ay7")).getText();
			System.out.println(ErrorMessage);
		}
		if(url.contains("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100")) {
			System.out.println("Admin Login Successful- Passed");
		}else if(ErrorMessage.contains("The password that you've entered is incorrect.")) {
			System.out.println("Admin Login Unsuccessful, but showing correct error message- Passed");
		}else {
			System.out.println("Admin Login Unsuccessful. Not showing correct error message- Failed");
		}
		driver.close();
	
	}
	
}

package abcd;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
		//BufferedReader br = new BufferedReader();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}

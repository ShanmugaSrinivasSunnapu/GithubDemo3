package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
		driver.findElement(By.linkText("Create account")).click();
		String url1 = driver.getCurrentUrl();
		//System.out.println(url1);
		if(url1.contains("wikipedia.org")) {
			System.out.println("1st Verification:"+ "It is an Internal Link- Passed");
		}else {
			System.out.println("1st Verification:"+ "It is Not an Internal Link- Failed");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("selenium.dev")).click();
		String url2 = driver.getCurrentUrl();
		//System.out.println(url2);
		if(url2.equals("http://www.seleniumhq.org/")) {
			System.out.println("2nd Verification:"+ "It is an External Link- Passed");
		}else {
			System.out.println("2nd Verification:" +"It is Not an External Link- Failed");
		}
		driver.close();
	}

}

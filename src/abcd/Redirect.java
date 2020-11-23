package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redirect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gcreddy.com/project/index.php");
		driver.findElement(By.xpath("//*[@id=\'bodyContent\']/div/div[1]/a[2]/u")).click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://gcreddy.com/project/create_account.php")) {
			System.out.println("Verification1: (Before Login): Redirecting to User Interface from Admin Interface- Passed");
		}else {
			System.out.println("Verification1: (Before Login): Not Redirecting to User Interface from Admin Interface- Failed");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\'bodyContent\']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.name("email_address")).sendKeys("shanmugas888@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Honeyseenu@1");
		driver.findElement(By.xpath("//*[@id=\'tdb1\']/span[2]")).click();
		Thread.sleep(3000);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		if(url2.contains("https://gcreddy.com/project/index.php")) {
			System.out.println("Admin Login Successful");
			driver.findElement(By.xpath("//*[@id=\'bodyContent\']/div/div[1]/a/u")).click();
		}
		Thread.sleep(3000);
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		if(url3.contains("https://gcreddy.com/project/products_new.php")) {
			System.out.println("Verification2:(After Login) : Redirecting to User Interface from Admin Interface- Passed");
		}else {
			System.out.println("Verification2:(After Login) : Not Redirecting to User Interface from Admin Interface- Failed");
		}
		driver.close();
	}

}

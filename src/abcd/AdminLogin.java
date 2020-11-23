package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
static String Username;
static String Password;
static int Iteration=0;

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=2;i++) {
			Iteration = Iteration+1;
			if(i==1) {
				Username="shanmugas888@gmail.com";
				Password="Honeyseenu@1";
				
			}else if(i==2) {
				Username="abcedf";
				Password="abc@123";
			}
			System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://gcreddy.com/project/login.php");
			driver.findElement(By.name("email_address")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.xpath("//*[@id=\'tdb1\']/span[2]")).click();
			
			String url = driver.getCurrentUrl();
			if(url.contains("https://gcreddy.com/project/index.php")) {
				System.out.println(Iteration+ "Admin Login Successful- Passed");
			}else {
				System.out.println(Iteration+ "Admin Login Unsuccessful- Failed");
			}
			
			Thread.sleep(3000);
			driver.quit();
		}

	}

}

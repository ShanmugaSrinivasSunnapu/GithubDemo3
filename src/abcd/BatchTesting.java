package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchTesting {
public static WebDriver driver;
//Launch Browser
public void launch() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
//Admin Login
public void login(String Username, String Password) {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(Username);
	driver.findElement(By.id("pass")).sendKeys(Password);
	driver.findElement(By.tagName("button")).click();
}
//Close Browser
public void close() {
	driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		BatchTesting obj = new BatchTesting();
		//TestCase1: Verify Admin Login(Positive TestCase)
		obj.launch();
		obj.login("9160074727", "Honeyseenu@1");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://www.facebook.com/")) {
			System.out.println("TestCase1:" + "Admin Login is Successful- Passed");
		}else {
			System.out.println("TestCase1:" + "Admin Login is Unsuccessful- Failed");
		}
		obj.close();
		//TestCase2: Verify ErrorMessage in Admin Login functionality(Negative TestCase)
		obj.launch();
		obj.login("admin", "admin@1");
		String ErrorMessage = driver.findElement(By.xpath("//*[@id=\'email_container\']/div[2]")).getText();
		System.out.println(ErrorMessage);
		if(ErrorMessage.contains("The email address or phone number that you've entered doesn't match any account.")) {
			System.out.println("TestCase2:" + "Admin Login is Unsuccessful and Showing Correcr Error Message- Passed");
		}else {
			System.out.println("TestCase2:" + "Admin Login is Unsuccessful and Not Showing Correcr Error Message- Failed");
		}
		obj.close();
		//TestCase3: Verify Redirect Functionality from Admin interface to user interface
		//obj.launch();
	//	obj.login("9160074727", "Honeyseenu@1");
		//driver.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7")).click();
		//String url2 = driver.getCurrentUrl();
		//if(url2.equals("https://www.facebook.com/")) {
	//		System.out.println("TestCase3:" + "Redirected from Admin Interface to User Interface- Passed");
	//	}else {
	//		System.out.println("TestCase3:" + "Not Redirected from Admin Interface to User Interface- Passed");
	//	}
	//	obj.close();
	}

}

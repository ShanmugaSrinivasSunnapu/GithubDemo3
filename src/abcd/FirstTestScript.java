package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestScript {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://gcreddy.com/project/");
		driver.findElement(By.linkText("create an account")).click();
		
		driver.findElement(By.xpath("//*[@id=\'bodyContent\']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ammu");
		
		driver.findElement(By.name("lastname")).sendKeys("Amulya");
		
		driver.findElement(By.id("dob")).sendKeys("05/29/1989");
		
		driver.findElement(By.name("email_address")).sendKeys("ammu@gmail.com");
		
		driver.findElement(By.name("company")).sendKeys("HCL");
		
		driver.findElement(By.name("street_address")).sendKeys("1st Street");
		
		driver.findElement(By.name("postcode")).sendKeys("555000");
		
		driver.findElement(By.name("city")).sendKeys("ctr");
		
		driver.findElement(By.name("state")).sendKeys("ap");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("8528528520");
		
		driver.findElement(By.name("password")).sendKeys("seenu12");
		 
		driver.findElement(By.name("confirmation")).sendKeys("seenu12");
		
		driver.findElement(By.id("tdb4")).click();
		
		String message = driver.findElement(By.tagName("h1")).getText();
		
		//System.out.println(message);
		
		if(message.equals("Your Account Has Been Created!")) {
			System.out.println("Customer Registration is Successful- Passed");
		}
		else {
			System.out.println("Customer Registration is Unsuccessful- Failed");
		}
		driver.close();
	}

}

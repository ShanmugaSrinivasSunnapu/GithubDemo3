package abcd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
public static WebDriver driver;
static String ErrorMessage;
	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		FileReader file = new FileReader("E:\\input.txt");
		BufferedReader br  = new BufferedReader(file);
		int Iteration=0;
		String line;
		while((line=br.readLine())!=null) {
			Iteration=Iteration+1;
			if(Iteration>1) {
				String[] inputData = line.split(", ", 2);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://gcreddy.com/project/login.php");
				driver.findElement(By.name("email_address")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.xpath("//*[@id=\'tdb1\']/span[2]")).click();
				Thread.sleep(3000);
				ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
				System.out.println(ErrorMessage);
				if((Iteration==3) && ErrorMessage.contains("Error: No match for E-Mail Address and/or Password.")) {
					System.out.println(Iteration+ " Maximum invalid Login attempts are over- Passed");
				}else {
					System.out.println(Iteration+ " Maximum invalid Login attempts are not over- Done");
				}
				driver.close();
			}
			
		}
		br.close();
		file.close();
	}

}

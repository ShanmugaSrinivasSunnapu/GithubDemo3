package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Positive Testing
		/*
		 * boolean linkExistance =
		 * driver.findElement(By.linkText("Gmail")).isDisplayed(); if(linkExistance ==
		 * true) { System.out.println("Gmail Link is Exists- Passed"); }else {
		 * System.out.println("Gmail Link is Not Exists- Failed"); } driver.close();
		 */
		//Negative Testing
		try {
			boolean linkExists = driver.findElement(By.linkText("fjdkl")).isDisplayed();
			if(linkExists ==  true) {
				System.out.println("Gmail Link Exists- Passed");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("Gmail Link is Not Exists- Failed");
		}
	}
	
}

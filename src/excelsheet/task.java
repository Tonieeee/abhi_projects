package excelsheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Abhi Lecture\\software\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en-GB/gmail/about");
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign in']"));
		signin.click();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
		user.click();
	
	
	
	
	
	
	
	
	
	
	
}
}

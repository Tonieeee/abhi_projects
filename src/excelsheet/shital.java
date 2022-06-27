package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shital {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		

	System.setProperty("webdriver.chrome.driver", "G:\\Abhi Lecture\\software\\chromedriver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://mail.google.com/mail");
     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
     driver.findElement(By.xpath("//input[@type='checkbox']")).click();
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
     String path= "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
 	 FileInputStream file = new FileInputStream(path);
     Sheet xyz= WorkbookFactory.create(file).getSheet("Sheet1");
     String data =xyz.getRow(0).getCell(0).getStringCellValue();
     driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
     driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
     Thread.sleep(2000);
    
     WebElement shital=driver.findElement(By.xpath("//div[@command='Files']"));
        shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");
     
    
     
   ///  driver.findElement(By.xpath("//div[@class='dC']")).click();
     
     
    
    
   
    
   
}


}


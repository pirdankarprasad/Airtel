package hiby;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file=new FileInputStream("E:\\Testing\\Facebook.xlsx");
	Sheet test = WorkbookFactory.create(file).getSheet("Sheet1");
			String test1 = test.getRow(1).getCell(0).getStringCellValue();
	
			
			System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(test1);
	
}
}

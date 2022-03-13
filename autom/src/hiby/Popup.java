package hiby;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		//Switching to alert popup
		Alert popup = driver.switchTo().alert();
		Thread.sleep(2000);
		popup.accept();	
		Thread.sleep(2000);
		//Switch to next popup
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(2000);
		Alert popup1 = driver.switchTo().alert();
		Thread.sleep(2000);
		popup1.sendKeys("Hello");
		Thread.sleep(2000);
		popup.accept();
		
	}

}

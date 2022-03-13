package hiby;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", Configuration.ChromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Alert popup = driver.switchTo().alert();
	Thread.sleep(2000);
	popup.accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Thread.sleep(3000);
	Alert popup1 = driver.switchTo().alert();
	popup1.sendKeys("Hello");
	Thread.sleep(3000);
	popup1.accept();
	
}
}
